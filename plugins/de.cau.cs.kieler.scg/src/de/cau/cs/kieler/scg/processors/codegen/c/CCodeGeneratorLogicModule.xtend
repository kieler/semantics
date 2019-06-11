/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.c

import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import java.util.List
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.scg.ControlFlow
import java.util.Deque
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.IgnoreValue
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.PrintCall
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.RandomizeCall
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtReferenceExtensions
import de.cau.cs.kieler.scg.processors.SCGAnnotations
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions

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
    
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtReferenceExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGMethodExtensions
    @Accessors @Inject CCodeSerializeHRExtensions serializer
    
    @Accessors var CCodeGeneratorStructModule struct 
    @Accessors var CCodeGeneratorResetModule reset
    @Accessors var CCodeGeneratorTickModule tick 

    /** Hash for already handles pre variables */    
    protected val preVariables = <String> newHashSet
    /** Conditional Stack that keeps track of the nesting depth of conditionals */
    protected val conditionalStack = <Conditional> newLinkedList
    
    override configure() {
        struct = (parent as CCodeGeneratorModule).struct as CCodeGeneratorStructModule
        reset = (parent as CCodeGeneratorModule).reset as CCodeGeneratorResetModule
        tick = (parent as CCodeGeneratorModule).tick as CCodeGeneratorTickModule
    }
    
    override generateInit() {
        preVariables.clear
          
        // Generate functions
        serializer.generateMethods
                
        val signature = new StringBuilder
        signature.append("void ").append(getName)
        signature.append("(")
        signature.append(struct.getName).append("* ").append(struct.getVariableName)
        signature.append(")")
        
        struct.forwardDeclarations.append(signature).append(";\n")

        code.append(signature)
        code.append(" {\n")
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
                node.generate(nodes, serializer)
                processedNodes += node
            }
        }
    }
    
    override generateDone() {
        indent(0)
        code.append("}\n")
    }
    
    protected def void serializeToCode(Assignment assignment, int indent, 
        extension CCodeGeneratorStructModule struct, extension CCodeSerializeHRExtensions serializer
    ) {
        if (assignment.valuedObject === null) {
            indent(indent)
            if (assignment.expression instanceof TextExpression) {
                code.append((assignment.expression as TextExpression).text).append(";\n")
            } else if (assignment.expression instanceof PrintCall) {
                code.append((assignment.expression as PrintCall).serialize).append(";\n")
            } else if (assignment.expression instanceof RandomizeCall) {
                code.append((assignment.expression as RandomizeCall).serialize).append(";\n")                    
            } else if (assignment.expression instanceof FunctionCall) {
                code.append((assignment.expression as FunctionCall).serialize).append(";\n")
            } else if (assignment.expression instanceof ReferenceCall) {
                val referenceCall = assignment.expression as ReferenceCall
                val declaration = referenceCall.valuedObject.declaration
                if (declaration instanceof ReferenceDeclaration && declaration.asReferenceDeclaration.reference instanceof SCGraph) {
                    code.append(callToSCG(referenceCall, declaration as ReferenceDeclaration, conditionalStack.size + 1, serializer))
                } else {
                    code.append((assignment.expression as ReferenceCall).serialize).append(";\n")
                }
            } else {
                throw new NullPointerException("Assigned valued object is null or not supported")
            }

        } else if (assignment.isReturn) {
                indent(conditionalStack.size + 1)
                code.append("return ").append(assignment.expression.serializeHR).append(";\n")    
        } else {
            // Add the assignment.
            valuedObjectPrefix = struct.getVariableName + struct.separator
            prePrefix = CCodeGeneratorStructModule.STRUCT_PRE_PREFIX
            if (assignment.valuedObject.isArray && assignment.expression instanceof VectorValue) {
                for (asgn : assignment.splitAssignment) {
                    indent(indent)
                    code.append(asgn.serializeHR).append(";\n")    
                }
            } else {
                indent(indent)
                code.append(assignment.serializeHR).append(";\n")
            }
        }        
    }
    
    protected def dispatch void generate(Assignment assignment, Deque<Node> nodes, extension CCodeSerializeHRExtensions serializer) {
        if (!conditionalStack.empty) {
            // Apparently, we are in a nested conditional. Handle it if necessary. 
            assignment.handleConditionalNesting
        }

        assignment.serializeToCode(conditionalStack.size + 1, struct, serializer)
        
        if (assignment.valuedObject !== null) {
            // Handle pre variable if necessary.
            if (assignment.expression !== null && assignment.expression instanceof OperatorExpression) {
                for (preOE : assignment.expression.asOperatorExpression.getPreOperatorExpressions) {
                    preOE.addPreVariable(serializer)            
                }        
            }
        }
        
        // If a new statement follows, add it to the node list.
        if (assignment.next !== null) nodes.push(assignment.next.targetNode)
    }
        
    protected def dispatch void generate(Conditional conditional, Deque<Node> nodes, extension CCodeSerializeHRExtensions serializer) {
        if (!conditionalStack.empty) {
            // Apparently, we are in a nested conditional. Handle it if necessary. 
            conditional.handleConditionalNesting
        }

        valuedObjectPrefix = struct.getVariableName + struct.separator
        prePrefix = CCodeGeneratorStructModule.STRUCT_PRE_PREFIX

        indent(conditionalStack.size + 1)
        if (conditional.isExplicitLoop) {
            if (conditional.isPartOfForLoopHeader) {
                val prev = conditional.allPrevious.map[eContainer as Assignment]
                val init = prev.findFirst[annotations.filter(StringAnnotation).exists[SCGAnnotations.ANNOTATION_LOOP.equals(name) && values.contains("init")]]
                val decl = if (init !== null && init.annotations.filter(StringAnnotation).exists[SCGAnnotations.ANNOTATION_LOOP.equals(name) && values.contains("init")]) {
                    init.valuedObject.variableDeclaration
                }
                val after = prev.findFirst[annotations.filter(StringAnnotation).exists[SCGAnnotations.ANNOTATION_LOOP.equals(name) && values.contains("after")]]
                code.append("for (")
                if (decl !== null) {
                    code.append(decl.type.serializeHR)
                    code.append(" ")
                    code.append(init.valuedObject.name)
                    code.append(" = ")
                    code.append(init.expression.serializeHR)
                } else if (init !== null){
                    code.append(init.valuedObject.name)
                    code.append(" ").append(init.operator.serializeAssignOperator).append(" ")
                    code.append(init.expression.serializeHR)
                }
                code.append("; ")
                code.append(conditional.condition.serializeHR)
                code.append("; ")
                if (after !== null) {
                    if (after.operator.isPostfixOperator) {
                        code.append(after.valuedObject.name)
                        code.append(after.operator.serializeAssignOperator)
                    } else {
                        if (after.valuedObject !== null) {
                            code.append(after.valuedObject.name)
                            code.append(" ")
                            code.append(after.operator.serializeAssignOperator)
                            code.append(" ")
                        }
                        code.append(after.expression.serializeHR)
                    }
                }
                code.append(") {\n")
            } else {
                code.append("while (")
                code.append(conditional.condition.serializeHR)
                code.append(") {\n")
            }
        } else {
            code.append("if (")
            code.append(conditional.condition.serializeHR)
            code.append(") {\n")
        }
        
        conditionalStack.push(conditional)
        
        if (conditional.^else !== null) nodes.push(conditional.^else.targetNode)        
        if (conditional.^then !== null) nodes.push(conditional.^then.targetNode)
    }
    
    protected def void handleConditionalNesting(Node node) {
        // There are two cases. The else branch is distinct from the actual control flow or 
        // the actual branch joins with the else branch of the conditional directly. 
        // (In the latter case we can omit the "else" in C.)
        val conditional = conditionalStack.peek
        val incomingControlFlows = node.incomingLinks.filter(ControlFlow).toList
        if (conditional.^else !== null && conditional.^else.target == node) {
            if (conditional.isExplicitLoop) {
                indent(conditionalStack.size)
                code.append("}\n")
                conditionalStack.pop
            } else if (incomingControlFlows.size == 1) {
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
    
    protected def dispatch void generate(Entry entry, List<Node> nodes, extension CCodeSerializeHRExtensions serializer) {
        nodes += entry.next?.targetNode
    }
    
    protected def dispatch void generate(Exit exit, List<Node> nodes, extension CCodeSerializeHRExtensions serializer) {
        if (!conditionalStack.empty) {
            while(conditionalStack.size > 0) {
                indent(conditionalStack.size)
                code.append("}\n")
                conditionalStack.pop
            }
        }
    }
    

    protected def generateMethods(extension CCodeSerializeHRExtensions serializer) {
        for (scg : SCGraphs.scgs.filter[method]) {
            val method = scg.methodDeclaration
            if (method.hasSelfInParameter) {
                val selfVO = scg.declarations.map[valuedObjects].flatten.filter[parameter].findFirst[parameterIndex == -1]
                if (selfVO !== null && !selfVO.name.startsWith("(")) {
                    selfVO.name = "(*" + selfVO.name + ")" // simulate pointer access
                }
            }
            
            indent(0)
            code.append(method.returnType.serialize)
            code.append(" ").append(method.valuedObjects.head.name)
            code.append("(")
            val params = scg.declarations.filter[parameter].map[it as VariableDeclaration].toList
            if (method.hasTickDataInParameter && !struct.getVariableName.nullOrEmpty) {
                code.append(struct.getName).append("* ").append(struct.getVariableName)
                if (!params.empty) code.append(", ")
            }
            for (param : params) {
                if (param.type === ValueType.HOST) {
                    code.append(param.hostType).append("*")
                } else {
                    code.append(param.type.serializeHR)
                }
                code.append(" ")
                code.append(param.valuedObjects.head.name)
                if (params.last !== param) code.append(", ")
            }
            code.append(") {\n")
            
            // Temporarily redirect struct module output to this module
            val structCode = struct.code
            struct.newCodeStringBuilder = code
            struct.generateDeclarations(scg.declarations.filter[!parameter && !explicitLoopDeclaration && !isReturn].toList, 0, serializer)
            struct.newCodeStringBuilder = structCode
            
            // Generate body
            conditionalStack.clear
            var nodes = newLinkedList => [ it += scg.nodes.head ]
            val processedNodes = <Node> newHashSet
            while(!nodes.empty) {
                val node = nodes.pop
                if (!processedNodes.contains(node)) {
                    node.generate(nodes, serializer)
                    processedNodes += node
                }
            }
            indent(0)
            code.append("}\n\n")
        }
    }
    
    protected def void addPreVariable(OperatorExpression operatorExpression, extension CCodeSerializeHRExtensions serializer) {
        valuedObjectPrefix = ""
        prePrefix = CCodeGeneratorStructModule.STRUCT_PRE_PREFIX
        val name = operatorExpression.serializeHR
        if (preVariables.contains(name)) return;
    
        // Add the pre variable to the variables hashes to mark it handled.    
        preVariables += name.toString
        VariableStore.get(processorInstance.environment).add(name, "guard", "preGuard").type = ValueType.BOOL
        
        // Add the variable to the data struct.
        struct.code.append(indentation +  "char ")
        struct.code.append(name)
        struct.code.append(";\n")
        
        // Add the initialization in the reset function.
        reset.code.append(indentation).append(struct.getVariableName).append(struct.separator).append(name).append(" = 0;\n")
        
        // Add the "register save" in the tick function.
        prePrefix = "_"
        tick.code.append(indentation)
        tick.code.append(struct.getVariableName).append(struct.separator).append(name).append(" = ")
        tick.code.append(struct.getVariableName).append(struct.separator).append(operatorExpression.serializeHR).append(";\n")
    }
    
    protected def List<Assignment> splitAssignment(Assignment assignment) {
        var vector = assignment.expression as VectorValue
        vector.splitAssignmentHelper(assignment.valuedObject, <Integer> newLinkedList, <Assignment> newLinkedList)
    }
    
    protected def List<Assignment> splitAssignmentHelper(VectorValue vector, ValuedObject vo, Deque<Integer> indexStack, List<Assignment> assignments) {
        var index = 0
        for (v : vector.values) {
            if (!(v instanceof IgnoreValue)) {
                if (v instanceof VectorValue) {
                    indexStack.push(index)     
                    v.splitAssignmentHelper(vo, indexStack, assignments)
                    indexStack.pop           
                } else {
                    val newAssignment = ScgFactory.eINSTANCE.createAssignment
                    newAssignment.valuedObject = vo
                    for (is : indexStack) {
                        newAssignment.indices.add(0, createIntValue(is))
                    }
                    newAssignment.indices.add(createIntValue(index))
                    newAssignment.expression = v.copy
                    
                    assignments += newAssignment
                }
            }
            index++
        }         
        assignments        
    }
 
    protected def String callToSCG(ReferenceCall referenceCall, ReferenceDeclaration referenceDeclaration, 
        int indentationDepth, extension CCodeSerializeHRExtensions serializer
    ) {
        val sb = new StringBuilder
        val refSCG = referenceDeclaration.reference as SCGraph 
        val module = codeGeneratorModuleMap.get(refSCG) as CCodeGeneratorModule
        
        val bindings = referenceCall.createBindings
        
        for (input : refSCG.declarations.filter(VariableDeclaration).filter[ input ].map[ valuedObjects ].flatten) {
            for (n : 1..indentationDepth) sb.append(indentation)
            sb.append(struct.getVariableName).append(struct.separator)
            sb.append(referenceCall.valuedObject.name)
            sb.append(".")
            sb.append(input.name)
            sb.append(" = ")
            sb.append(bindings.filter[ it.targetValuedObject == input ].head.sourceExpression.serialize)
            sb.append(";\n")    
        }
        
        for (n : 1..indentationDepth) sb.append(indentation)
        sb.append(module.tick.name)
        sb.append("(&")
        sb.append(struct.getVariableName).append(struct.separator)
        sb.append(referenceCall.valuedObject.name)
        sb.append(");\n")        

        for (output : refSCG.declarations.filter(VariableDeclaration).filter[ output ].map[ valuedObjects ].flatten) {
            for (n : 1..indentationDepth) sb.append(indentation)
            sb.append(bindings.filter[ it.targetValuedObject == output ].head.sourceExpression.serialize)
            sb.append(" = ")
            sb.append(struct.getVariableName).append(struct.separator)
            sb.append(referenceCall.valuedObject.name)
            sb.append(".")
            sb.append(output.name)
            sb.append(";\n")               
        }

        
        sb.toString
    }
     
    
}
