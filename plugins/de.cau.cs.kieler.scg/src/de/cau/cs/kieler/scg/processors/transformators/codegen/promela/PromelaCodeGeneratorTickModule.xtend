/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.promela

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import java.util.Deque
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.compilation.VariableInformation

/**
 * Adds the code for the tick loop logic.
 * 
 * @author aas
 * 
 */
class PromelaCodeGeneratorTickModule extends PromelaCodeGeneratorModuleBase {

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension PromelaCodeSerializeHRExtensions serializer

    /** Conditional Stack that keeps track of the nesting depth of conditionals */
    protected val conditionalStack = <Conditional> newLinkedList
    
    override getName() {
        return class.simpleName;
    }

    override generateInit() {
        serializer.valuedObjectPrefix = ""
        serializer.prePrefix = PRE_GUARD_PREFIX
    }

    override generate() {
        appendIndentedLine('''proctype «TICK_LOOP_FUNCTION_NAME»() {''')
        incIndentationLevel
        appendIndentedLine("do")
        appendIndentedLine("::")
        
        appendIndentedLine("atomic { ")
        incIndentationLevel
        generateSettingRandomInputs()
        code.append("\n")
        generateGuardInitialization()
        code.append("\n")
        generateSequentialScgLogic()
        code.append("\n")
        generateAfterTickLogic()
        decIndentationLevel
        appendIndentedLine("}")
        
        appendIndentedLine("od")
        decIndentationLevel
        appendIndentedLine("}")
    }

    override generateDone() {
        
    }
    
    private def void generateGuardInitialization() {
        generateSeparatorComment("guard initialization")
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if (declaration instanceof VariableDeclaration) {
                    if (isGuard(valuedObject) || isConditionGuard(valuedObject)) {
                        val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                            declaration.type.serializeHR
                            else declaration.hostType
                        appendIndentation
                        code.append(declarationType)
                        code.append(" ")
                        code.append(valuedObject.name)
                        code.append(" = 0");
                        code.append(";\n")
                    }
                }
            }
        }
    }
    
    private def void generateAfterTickLogic() {
        generateSeparatorComment("after tick logic")
        appendIndentedLine("_GO = 0;")
        val store = VariableStore.get(processorInstance.environment)
        for(entry : store.variables.entries) {
            val variableInformation = entry.value
            if(variableInformation.properties.contains("preGuard")) {
                val preGuardName = entry.key
                // The variable of which the previous value should be used comes after the prefix of pre guards
                val predVariableName = "_" + preGuardName.substring(PRE_GUARD_PREFIX.length)
                appendIndentation()
                code.append(preGuardName).append(" = ").append(predVariableName).append(";\n")
            }
        }
    }
    
    private def void generateSettingRandomInputs() {
        generateSeparatorComment("set random inputs")
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if (declaration instanceof VariableDeclaration) {
                    if (declaration.isInput) {
                        switch(declaration.type) {
                            case BOOL : generateSettingRandomBool(valuedObject)
                            case INT : generateSettingRandomInt(valuedObject)
                            default : throw new Exception("Unsupported value type in promela code generation: " + declaration.type) 
                        }
                    }
                }
            }
        }
    }
    
    private def void generateSettingRandomBool(ValuedObject valuedObject) {
        appendIndentedLine('''if''')
        appendIndentedLine(''':: «valuedObject.name» = true;''')
        appendIndentedLine(''':: «valuedObject.name» = false;''')
        appendIndentedLine('''fi''')
    }
    
    private def void generateSettingRandomInt(ValuedObject valuedObject) {
        appendIndentedLine('''do''')
        appendIndentedLine(''':: «valuedObject.name»++;''')
        appendIndentedLine(''':: «valuedObject.name»--;''')
        appendIndentedLine(''':: break;''')
        appendIndentedLine('''od''')
    }
    
    private def void generateSequentialScgLogic() {
        generateSeparatorComment("tick logic")
        var nodes = newLinkedList(scg.nodes.head)
        val processedNodes = <Node> newHashSet
        conditionalStack.clear
        
        while(!nodes.empty) {
            val node = nodes.pop
            if (!processedNodes.contains(node)) {
                node.generate(nodes)
                processedNodes += node
            }
        }
    }
    
    protected def dispatch void generate(Assignment assignment, Deque<Node> nodes) {
        if (!conditionalStack.empty) { 
            assignment.handleConditionalNesting
        }
        
        if (assignment.valuedObject !== null) {
            appendIndentation
            code.append(assignment.serializeHR).append(";\n")
        }
    
        if (assignment.next !== null) nodes.push(assignment.next.targetNode)
    }
    
    protected def dispatch void generate(Conditional conditional, Deque<Node> nodes) {
        if (!conditionalStack.empty) { 
            conditional.handleConditionalNesting
        }
        
        appendIndentation
        code.append("if :: (")
        code.append(conditional.condition.serializeHR)
        code.append(") -> \n")
        incIndentationLevel
        
        conditionalStack.push(conditional)
        
        if (conditional.^else !== null) nodes.push(conditional.^else.targetNode)        
        if (conditional.^then !== null) nodes.push(conditional.^then.targetNode)
    }
    
    protected def void handleConditionalNesting(Node node) {
        val conditional = conditionalStack.peek
        val incomingControlFlows = node.incomingLinks.filter(ControlFlow).toList
        if (conditional.^else !== null && conditional.^else.target == node) {
            if (incomingControlFlows.size == 1) { 
                decIndentationLevel
                appendIndentation
                code.append(":: else -> ")
                incIndentationLevel
            }
        }
        if (incomingControlFlows.size > 1) for (i : 2..incomingControlFlows.size) {
            decIndentationLevel
            appendIndentation
            code.append(":: else -> skip;\n")
            appendIndentation
            code.append("fi\n")
            conditionalStack.pop
        }            
    }
    
    protected def dispatch void generate(Entry entry, Deque<Node> nodes) {
        nodes += entry.next?.targetNode
    }
    
    protected def dispatch void generate(Exit exit, Deque<Node> nodes) {
        if (!conditionalStack.empty) { 
            exit.handleConditionalNesting
        }
    }
}
