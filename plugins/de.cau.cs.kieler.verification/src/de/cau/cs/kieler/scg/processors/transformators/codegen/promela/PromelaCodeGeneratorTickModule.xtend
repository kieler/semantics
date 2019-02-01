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
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.verification.RangeAssumption
import de.cau.cs.kieler.verification.VerificationAssumption
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyType
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import java.util.List

/**
 * Adds the code for the tick loop logic.
 * 
 * @author aas
 * 
 */
class PromelaCodeGeneratorTickModule extends PromelaCodeGeneratorModuleBase {

    @Inject extension KEffectsExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SSACoreExtensions
    @Inject extension PromelaCodeSerializeHRExtensions serializer

    /** Stack of nodes to be serialized to code */
    protected val nodeStack = <Node> newLinkedList
    /** Conditional Stack that keeps track of the nesting depth of conditionals */
    protected val conditionalStack = <Conditional> newLinkedList
    
    var List<VerificationAssumption> assumptions
    
    override getName() {
        return class.simpleName;
    }

    override generateInit() {
        serializer.valuedObjectPrefix = ""
        serializer.prePrefix = PRE_GUARD_PREFIX
    }

    override generate() {
        assumptions = processorInstance.compilationContext.startEnvironment
            .getProperty(Environment.VERIFICATION_ASSUMPTIONS) as List<VerificationAssumption>  
            
        code.append("init {\n")
        incIndentationLevel
        
        generateTickLoop()
        
        decIndentationLevel
        appendIndentedLine("}")
    }

    override generateDone() {
        
    }
    
    private def void generateTickLoop() {
        // Mark the beginning of the orginal model's tick. 
        // This is also the end of the Promela model statements for initialization.
        appendIndentedLine('''«SETUP_DONE_FLAG_NAME» = 1;''')

        appendIndentedComment("From here on, a step in the promela model corresponds to a step in the original model.")
        appendIndentedComment("This is because the following statements are wrapped in an atomic (or d_step) statement.")
        appendIndentedComment("Thus, from here on LTL formulas hold in the Promela model if they hold in the original model.")

        // Start of tick loop
        appendIndentedLine("do")
        appendIndentedLine("::")
                
        appendIndentedLine("atomic { ")
        incIndentationLevel
        appendIndentedLine('''«TICK_END_FLAG_NAME» = 0;''')
        generateSettingRandomInputs()
        code.append("\n")
        generateSequentialScgLogic()
        code.append("\n")
        generateAfterTickLogic()
        code.append("\n")
        appendIndentedLine('''«TICK_END_FLAG_NAME» = 1;''')
        generateAssertions()
        decIndentationLevel
        appendIndentedLine("}")
        
        appendIndentedLine("od")
        // End of tick loop
    }
    
    private def void generateAssertions() {
        val invariant = getInvariantVerificationProperty
        if(invariant === null) {
            return
        }
        code.append("\n")
        appendSeparatorComment("assertion")        
        appendIndentedLine('''assert(«invariant.formula»);''')
    }
    
    private def void generateAfterTickLogic() {
        appendSeparatorComment("after tick logic")
        appendIndentedLine('''«GO_GUARD» = 0;''')
        // Set pre guards
        val store = VariableStore.get(processorInstance.environment)
        for(entry : store.variables.entries) {
            val variableInformation = entry.value
            if(variableInformation.properties.contains(PromelaCodeGeneratorModule.PROPERTY_PREGUARD)) {
                val preGuardName = entry.key
                // The variable of which the previous value should be used comes after the prefix of pre guards
                val predVariableName = "_" + preGuardName.substring(PRE_GUARD_PREFIX.length)
                appendIndentation()
                code.append(preGuardName).append(" = ").append(predVariableName).append(";\n")
            }
        }
    }
    
    private def void generateSettingRandomInputs() {
        appendSeparatorComment("set random inputs")
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if (declaration instanceof VariableDeclaration) {
                    if (declaration.isInput) {
                        switch(declaration.type) {
                            case BOOL : generateSettingRandomBool(declaration, valuedObject)
                            case INT : generateSettingRandomInt(declaration, valuedObject)
                            default : throw new Exception("Unsupported value type in promela code generation: " + declaration.type) 
                        }
                    }
                }
            }
        }
    }
    
    private def void generateSettingRandomBool(VariableDeclaration decl, ValuedObject valuedObject) {
        appendIndentedLine('''// «valuedObject.name»''')
        appendIndentedLine('''if''')
        appendIndentedLine(''':: (1) -> «valuedObject.name» = true;''')
        appendIndentedLine(''':: (1) -> «valuedObject.name» = false;''')
        appendIndentedLine('''fi''')
    }
    
    private def void generateSettingRandomInt(VariableDeclaration decl, ValuedObject valuedObject) {
        appendIndentedLine('''// «valuedObject.name»''')
        // Use select feature of promela if there is a range assumption. Otherwise use non-deterministic increase / decrease otherwise
        val origValuedObject = if(decl.isSSA) decl.ssaOrigVO else valuedObject
        val rangeAssumption = getRangeAssumption(origValuedObject)
        if(rangeAssumption !== null) {
            appendIndentedLine('''select(«valuedObject.name» : «rangeAssumption.minValue»..«rangeAssumption.maxValue»);''')
        } else {
            appendIndentedLine('''// Warning: The following non-deterministic selection could cause an infinite loop. Better use @AssumeRange annotation.''')
            appendIndentedLine('''do''')
            appendIndentedLine(''':: «valuedObject.name»++;''')
            appendIndentedLine(''':: «valuedObject.name»--;''')
            appendIndentedLine(''':: break;''')
            appendIndentedLine('''od''')    
        }
    }
    
    private def RangeAssumption getRangeAssumption(ValuedObject valuedObject) {
        if(!assumptions.isNullOrEmpty) {
            return assumptions.filter(RangeAssumption).findFirst [
                it.valuedObject.name == valuedObject.name
            ]
        }
    }
    
    private def void generateSequentialScgLogic() {
        appendSeparatorComment("tick logic")
        val processedNodes = <Node> newHashSet
        nodeStack.clear
        nodeStack.add(scg.nodes.head)
        conditionalStack.clear
        
        while(!nodeStack.empty) {
            val node = nodeStack.pop
            if (!processedNodes.contains(node)) {
                if (!conditionalStack.empty) { 
                    node.handleConditionalNesting
                }
                node.generate
                processedNodes.add(node)
            }
        }
    }
    
    protected def dispatch void generate(Assignment assignment) {
        if (assignment.valuedObject !== null) {
            appendIndentation
            code.append(assignment.serializeHR).append(";\n")
        }
    
        if (assignment.next !== null) nodeStack.push(assignment.next.targetNode)
    }
    
    protected def dispatch void generate(Conditional conditional) {
        appendIndentation
        code.append("if :: (").append(conditional.condition.serializeHR).append(") -> \n")
        incIndentationLevel
        
        conditionalStack.push(conditional)
        
        if (conditional.^else !== null) nodeStack.push(conditional.^else.targetNode)        
        if (conditional.^then !== null) nodeStack.push(conditional.^then.targetNode)
    }
    
    protected def void handleConditionalNesting(Node node) {
        val conditional = conditionalStack.peek
        val incomingControlFlows = node.incomingLinks.filter(ControlFlow).toList
        if (conditional.^else !== null && conditional.^else.target == node) {
            if (incomingControlFlows.size == 1) { 
                decIndentationLevel
                appendIndentedLine(":: else -> ")
                incIndentationLevel
            }
        }
        if (incomingControlFlows.size > 1) {
            for (i : 2..incomingControlFlows.size) {
                decIndentationLevel
                appendIndentedLine(":: else -> skip;")
                appendIndentedLine("fi")
                conditionalStack.pop    
            }
        }            
    }
    
    protected def dispatch void generate(Entry entry) {
        nodeStack.add(entry.next?.targetNode)
    }
    
    protected def dispatch void generate(Exit exit) {
    }
    
    protected def VerificationProperty getInvariantVerificationProperty() {
        val verificationProperties = processorInstance.compilationContext.startEnvironment.getProperty(Environment.VERIFICATION_PROPERTIES) as List<VerificationProperty>
        if(verificationProperties.isNullOrEmpty) {
            return null
        } else {
            val property = verificationProperties.head
            if(property.type == VerificationPropertyType.INVARIANT) {
                return property
            }
        }
    }
    
    private def void appendSeparatorComment(String comment) {
        appendIndentation
        for(i : 1..10) { code.append(lineCommentToken) }
        code.append("\n")
        
        appendIndentedComment(comment)
    }
}
