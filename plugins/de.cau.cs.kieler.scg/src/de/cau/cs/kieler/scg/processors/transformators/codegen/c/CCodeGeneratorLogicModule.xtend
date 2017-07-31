/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.c

import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraph
import java.util.Map
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import java.util.List
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.scg.ControlFlow
import java.util.Deque

/**
 * C Code Generator Logic Module
 * 
 * Handles the creation of the tick logic function.
 * 
 * @author ssm
 * @kieler.design 2017-07-24 proposed 
 * @kieler.rating 2017-07-24 proposed yellow 
 * 
 */
class CCodeGeneratorLogicModule extends SCGCodeGeneratorModule {
    
    @Inject extension CCodeSerializeHRExtensions
    
    static val LOGIC_NAME = "logic"
    
    var CCodeGeneratorStructModule struct 
    var CCodeGeneratorResetModule reset
    var CCodeGeneratorTickModule tick 

    /** Hash for already handles pre variables */    
    protected val preVariables = <String> newHashSet
    /** Conditional Stack that keeps track of the nesting depth of conditionals */
    protected val conditionalStack = <Conditional> newLinkedList
    
    override configure(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap, SCGCodeGeneratorModule parent
    ) {
        super.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, parent)
        
        struct = (parent as CCodeGeneratorModule).struct
        reset = (parent as CCodeGeneratorModule).reset
        tick = (parent as CCodeGeneratorModule).tick
        
        return this
    }

    
    def getName() {
        LOGIC_NAME + baseName + suffix
    }
    
    override generateInit() {
        preVariables.clear
        
        code.append("void ").append(getName)
        code.append("(")
        code.append(struct.getName).append("* ").append(struct.getVariableName)
        code.append(") {\n")
    }
    
    override generate() {
        var nodes = newLinkedList => [ it += scg.nodes.head ]
        conditionalStack.clear
        val processedNodes = <Node> newHashSet
        
        // Iterate through all nodes. 
        // However, if the last node was already the actual node, then skip it, because
        // this are two joining control-flows from a conditional. 
        // Consequence: Self-Loops in sequentialized assignments are forbidden.
        while(!nodes.empty) {
            val node = nodes.pop
            if (!processedNodes.contains(node)) {
                node.generate(nodes)
                processedNodes += node
            }
        }
    }
    
    override generateDone() {
        code.append("}\n")
    }
    
    protected def dispatch void generate(Assignment assignment, Deque<Node> nodes) {
        if (!conditionalStack.empty) {
            // Apparently, we are in a nested conditional. Handle it if necessary. 
            assignment.handleConditionalNesting
        }
        
        // Add the assignment.
        indent(conditionalStack.size + 1)
        valuedObjectPrefix = struct.getVariableName + "->"
        prePrefix = CCodeGeneratorStructModule.STRUCT_PRE_PREFIX
//        println("Serializing " + assignment.serializeHR)
        code.append(assignment.serializeHR).append(";\n")
        
        // Handle pre variable if necessary.
        if (assignment.expression != null && assignment.expression instanceof OperatorExpression &&
            (assignment.expression as OperatorExpression).operator == OperatorType.PRE) {
            (assignment.expression as OperatorExpression).addPreVariable                    
        }
        
        // If a new statement follows, add it to the node list.
        if (assignment.next != null) nodes.push(assignment.next.target)
    }
    
    protected def dispatch void generate(Conditional conditional, Deque<Node> nodes) {
        valuedObjectPrefix = struct.getVariableName + "->"
        prePrefix = CCodeGeneratorStructModule.STRUCT_PRE_PREFIX

        indent(conditionalStack.size + 1)
        code.append("if (")
        code.append(conditional.condition.serializeHR)
        code.append(") {\n")
        
        conditionalStack.push(conditional)
        
        if (conditional.^else != null) nodes.push(conditional.^else.target)        
        if (conditional.^then != null) nodes.push(conditional.^then.target)
    }
    
    protected def void handleConditionalNesting(Assignment assignment) {
        // There are two cases. The else branch is distinct from the actual control flow or 
        // the actual branch joins with the else branch of the conditional directly. 
        // (In the latter case we can omit the "else" in C.)
        val conditional = conditionalStack.peek
        val incomingControlFlows = assignment.incoming.filter(ControlFlow).toList
        if (conditional.^else != null && conditional.^else.target == assignment) {
            if (incomingControlFlows.size == 1) {
                // Apparently, it is the first assignment of a dedicated else branch. Handle it. 
                indent(conditionalStack.size)
                code.append("} else {\n")
            }        
        }
        // If multiple control-flows are joining here, reduce the nesting depth accordingly.
        if (incomingControlFlows.size > 1) for (i : 2..incomingControlFlows.size) {
            indent(conditionalStack.size)
            code.append("}\n")
            conditionalStack.pop
        }            
    }
    
    protected def dispatch void generate(Entry entry, List<Node> nodes) {
        nodes += entry.next?.target
    }
    
    protected def dispatch void generate(Exit exit, List<Node> nodes) {
    }
    
    protected def void addPreVariable(OperatorExpression operatorExpression) {
        valuedObjectPrefix = ""
        prePrefix = CCodeGeneratorStructModule.STRUCT_PRE_PREFIX
        val name = operatorExpression.serializeHR 
        if (preVariables.contains(name)) return;
    
        // Add the pre variable to the variables hashes to mark it handled.    
        preVariables += name.toString
        
        // Add the variable to the data struct.
        struct.code.append(indentation +  "char ")
        struct.code.append(name)
        struct.code.append(";\n")
        
        // Add the initialization in the reset function.
        reset.code.append(indentation).append(struct.getVariableName).append("->").append(name).append(" = 0;\n")
        
        // Add the "register save" in the tick function.
        prePrefix = "_"
        tick.code.append(indentation)
        tick.code.append(struct.getVariableName).append("->").append(name).append(" = ")
        tick.code.append(struct.getVariableName).append("->").append(operatorExpression.serializeHR).append(";\n")
    }
    
}