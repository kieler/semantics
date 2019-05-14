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
package de.cau.cs.kieler.scg.processors.codegen.promela

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.processors.ssa.SSACoreExtensions
import de.cau.cs.kieler.verification.VerificationAssumption
import de.cau.cs.kieler.verification.extensions.VerificationExtensions
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyType
import java.util.List

import static extension de.cau.cs.kieler.verification.extensions.VerificationContextExtensions.*
import de.cau.cs.kieler.verification.InvariantAssumption
import de.cau.cs.kieler.scg.processors.codegen.smv.ScgConditionalAssignmentAnalyzer

/**
 * Adds the code for the tick loop logic.
 * 
 * @author aas
 * 
 */
class PromelaCodeGeneratorTickModule extends PromelaCodeGeneratorModuleBase {

    @Inject extension VerificationExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SSACoreExtensions
    @Inject extension PromelaCodeSerializeHRExtensions serializer

    private var ScgConditionalAssignmentAnalyzer scgConditionalAssignmentAnalyzer

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
        
        scgConditionalAssignmentAnalyzer = injector.getInstance(ScgConditionalAssignmentAnalyzer)
        scgConditionalAssignmentAnalyzer.init(scg)
    }

    override generate() {
        assumptions = verificationContext?.verificationAssumptions  
        
        code.append("init {\n")
        incIndentationLevel
        
        generateTickLoop()
        
        decIndentationLevel
        appendIndentedLine("}")
    }

    override generateDone() {
        
    }
    
    private def void generateTickLoop() {
        appendIndentedLine("do")
        appendIndentedLine("::")
         
        appendIndentedLine("atomic { ")
        incIndentationLevel
        
        appendLocalDeclarations();
        appendIndentedLine('''bool «TICK_END_FLAG_NAME»;''')
        code.append("\n")
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
    }
    
    private def void appendLocalDeclarations() {
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if(valuedObject.isAssignedEveryTick(scgConditionalAssignmentAnalyzer)) {
                    if (declaration instanceof VariableDeclaration) {
                        val declarationType = declaration.type.serializeHR
                        appendIndentedLine('''«declarationType» «valuedObject.name»;''')
                    }    
                }
            }
        }
    }
    
    private def void generateAssertions() {
        val invariant = getInvariantVerificationProperty
        if(invariant === null) {
            return
        }
        code.append("\n")
        appendSeparatorComment("assertion")
        // Add assertion inside of if-statement to respect assumptions, or outside if there are none.
        val invariantAssumptions = assumptions?.filter[it instanceof InvariantAssumption]
        if(!invariantAssumptions.isNullOrEmpty ) {
            val invariantAssumptionConjunction = invariantAssumptions.map[(it as InvariantAssumption).formula].map['''(«it»)'''].join(" && ")
            appendIndentedLine('''if''')
            appendIndentedLine(''':: («invariantAssumptionConjunction») -> assert(«invariant.formula»);''')
            appendIndentedLine(''':: else -> skip;''')
            appendIndentedLine('''fi''')
        } else {
            appendIndentedLine('''assert(«invariant.formula»);''')   
        }
    }
    
    private def void generateAfterTickLogic() {
        appendSeparatorComment("after tick logic")
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
        // There could be a pre(_GO) guard that depends on _GO. So this must be reset last.
        appendIndentedLine('''«GO_GUARD» = 0;''')
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
        val rangeAssumption = assumptions.findRangeAssumption(origValuedObject)
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
        val verificationProperties = verificationContext?.verificationProperties
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
