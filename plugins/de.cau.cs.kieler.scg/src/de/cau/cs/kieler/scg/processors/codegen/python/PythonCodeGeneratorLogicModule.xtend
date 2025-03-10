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
package de.cau.cs.kieler.scg.processors.codegen.python

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.PrintCall
import de.cau.cs.kieler.kexpressions.RandomizeCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtReferenceExtensions
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.scg.processors.SCGAnnotations
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorLogicModule
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorStructModule
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions
import java.util.Deque
import java.util.List

/**
 * Python Code Generator Logic Module
 * 
 * Handles the creation of the tick logic function.
 * 
 * @author als
 * 
 */
class PythonCodeGeneratorLogicModule extends CCodeGeneratorLogicModule {
    
    @Inject PythonCodeSerializeHRExtensions pythonSerializer
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtReferenceExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGMethodExtensions
    
    override configure() {
        struct = (parent as PythonCodeGeneratorModule).struct as PythonCodeGeneratorStructModule
        reset = (parent as PythonCodeGeneratorModule).reset as PythonCodeGeneratorResetModule
        tick = (parent as PythonCodeGeneratorModule).tick as PythonCodeGeneratorTickModule
        
        indentationModifier = 1
        serializer = pythonSerializer
    }

    override generateInit() {
        preVariables.clear
                
        indent(0)
        code.append("def ").append(getName).append("(self):\n")
    }
    
    override generateDone() {
        indent
        code.append("\n")
    }
     
    override void addPreVariable(OperatorExpression operatorExpression, extension CCodeSerializeHRExtensions serializer) {
        valuedObjectPrefix = ""
        prePrefix = PythonCodeGeneratorStructModule.STRUCT_PRE_PREFIX
        val name = operatorExpression.serializeHR 
        if (preVariables.contains(name)) return;
        val struct = this.struct as PythonCodeGeneratorStructModule
    
        // Add the pre variable to the variables hashes to mark it handled.    
        preVariables += name.toString
        VariableStore.get(processorInstance.environment).add(name, "guard", "preGuard").type = ValueType.BOOL
        
        // Add the variable to the data struct.
        struct.code.append(indentation).append(name)
        struct.code.append(": bool\n")
        
        // Add the initialization in the reset function.
        reset.code.append(indentation + indentation).append(struct.getVariableName).append(struct.separator).append(name).append(" = False\n")
        
        // Add the "register save" in the tick function.
        prePrefix = "_"
        tick.code.append(indentation + indentation)
        tick.code.append(struct.getVariableName).append(struct.separator).append(name).append(" = ")
        tick.code.append(struct.getVariableName).append(struct.separator).append(operatorExpression.serializeHR).append("\n")
    }
    
    override generateMethods(extension CCodeSerializeHRExtensions serializer) {
        // In Python this is handled by the StructModule since methodes are in classes due to proper OO
    } 
    
    override void serializeToCode(Assignment assignment, int indent, 
        extension CCodeGeneratorStructModule struct, extension CCodeSerializeHRExtensions serializer
    ) {
        if (assignment.valuedObject === null) {
            indent(indent)
            if (assignment.expression instanceof TextExpression) {
                code.append((assignment.expression as TextExpression).text).append("\n")
            } else if (assignment.expression instanceof PrintCall) {
                code.append((assignment.expression as PrintCall).serialize).append("\n")
            } else if (assignment.expression instanceof RandomizeCall) {
                code.append((assignment.expression as RandomizeCall).serialize).append("\n")                    
            } else if (assignment.expression instanceof FunctionCall) {
                code.append((assignment.expression as FunctionCall).serialize).append("\n")
            } else if (assignment.expression instanceof ReferenceCall) {
                val referenceCall = assignment.expression as ReferenceCall
                val declaration = referenceCall.valuedObject.declaration
                if (declaration instanceof ReferenceDeclaration && declaration.asReferenceDeclaration.reference instanceof SCGraph) {
                    code.append(callToSCG(referenceCall, declaration as ReferenceDeclaration, conditionalStack.size + 1, serializer))
                } else {
                    if (declaration instanceof ClassDeclaration || declaration instanceof MethodDeclaration) {
                        valuedObjectPrefix = struct.getVariableName + struct.separator
                        prePrefix = CCodeGeneratorStructModule.STRUCT_PRE_PREFIX
                    }
                    code.append((assignment.expression as ReferenceCall).serializeHR).append("\n")
                }
            } else {
                throw new NullPointerException("Assigned valued object is null or not supported")
            }

        } else if (assignment.isReturn) {
                indent(conditionalStack.size + 1)
                code.append("return ").append(assignment.expression.serializeHR).append("\n")    
        } else {
            // Add the assignment.
            valuedObjectPrefix = struct.getVariableName + struct.separator
            prePrefix = CCodeGeneratorStructModule.STRUCT_PRE_PREFIX
            if (assignment.valuedObject.isArray && assignment.expression instanceof VectorValue) {
                for (asgn : assignment.splitAssignment) {
                    indent(indent)
                    code.append(asgn.serializeHR).append("\n")    
                }
            } else {
                indent(indent)
                code.append(assignment.serializeHR).append("\n")
            }
        }        
    }

    override dispatch void generate(Conditional conditional, Deque<Node> nodes, extension CCodeSerializeHRExtensions serializer) {
        if (!conditionalStack.empty) {
            // Apparently, we are in a nested conditional. Handle it if necessary. 
            conditional.handleConditionalNesting(false)
        }

        valuedObjectPrefix = struct.getVariableName + struct.separator
        prePrefix = CCodeGeneratorStructModule.STRUCT_PRE_PREFIX

        indent(conditionalStack.size + 1)
        if (conditional.isExplicitLoop) {
            if (conditional.isPartOfForLoopHeader) {
                val prev = conditional.allPrevious.map[eContainer as Assignment]
                val init = prev.findFirst[isLoopHeaderPart("init")]
                val decl = if (init !== null && init.isLoopHeaderPart("decl")) {
                    init.valuedObject.variableDeclaration
                }
                if (decl !== null) {
                    code.append(decl.type.serializeHR)
                    code.append(" ")
                    code.append(init.valuedObject.name)
                    code.append(" = ")
                    code.append(init.expression.serializeHR)
                } else if (init !== null) {
                    code.append(init.valuedObject.name)
                    code.append(init.operator.serializeAssignOperator)
                    code.append(init.expression.serializeHR)
                }
                code.append("while ")
                code.append(conditional.condition.serializeHR)
                code.append(":\n")
            } else {
                code.append("while ")
                code.append(conditional.condition.serializeHR)
                code.append(":\n")
            }
        } else {
            code.append("if ")
            code.append(conditional.condition.serializeHR)
            code.append(":\n")
        }
        
                
        // Close loop body if necessary
        if (conditional.^then !== null && conditional.^then === conditional.^else && conditional.^then.isExplicitLoop) {
            conditional.^then.targetNode.handleConditionalNesting(true)
        }
        
        conditionalStack.push(conditional)
        
        if (conditional.^else !== null) nodes.pushNodeIfNextToProcess(conditional.^else)        
        if (conditional.^then !== null) nodes.pushNodeIfNextToProcess(conditional.^then)
    }
    
    override void handleConditionalNesting(Node node, boolean endLoop) {
        // There are two cases. The else branch is distinct from the actual control flow or 
        // the actual branch joins with the else branch of the conditional directly. 
        // (In the latter case we can omit the "else" in C.)
        // Plus some more corner cases when mixed with conditionals that represent loops ;)
        var conditional = conditionalStack.peek
        if (endLoop && !conditional.isExplicitLoop) {
            // close other (inner) conditionals normally
            while(!conditional.isExplicitLoop) {
                // process
                conditionalStack.pop
                // check next
                conditional = conditionalStack.peek
            }
        }
        val incomingControlFlows = if (endLoop) {
            node.incomingLinks.filter(ControlFlow).toList
        } else {
            node.incomingLinks.filter(ControlFlow).filter[!isExplicitLoop].toList
        }
        if (!endLoop && conditional.^else !== null && conditional.^else.target == node) {
            if (incomingControlFlows.size == 1 && 
                // If this node is part of a loop header, then only add else if next node is not yet processed (hence, this node is not the node leading to a loop back)
                (!node.isExplicitLoop || (node instanceof Assignment && !processedNodes.contains((node as Assignment).next.targetNode)))) {
                // Apparently, it is the first assignment of a dedicated else branch. Handle it. 
                indent(conditionalStack.size)
                code.append("else:\n")
            }
        }
        // If multiple control-flows are joining here, reduce the nesting depth accordingly.
        if (incomingControlFlows.size > 1) {
            for (i : 2 .. incomingControlFlows.size) {
                conditionalStack.pop
            }
        }            
    }
    
    override dispatch void generate(Exit exit, List<Node> nodes, extension CCodeSerializeHRExtensions serializer) {
        if (!conditionalStack.empty) {
            while(conditionalStack.size > 0) {
                indent(conditionalStack.size)
                var conditional = conditionalStack.pop
                
                if (conditional.isExplicitLoop) {
                    if (conditional.isPartOfForLoopHeader) {
                        val prev = conditional.allPrevious.map[eContainer as Assignment]
                        val after = prev.findFirst[annotations.filter(StringAnnotation).exists[SCGAnnotations.ANNOTATION_LOOP.equals(name) && values.contains("after")]]
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
                    }
                }
                
                code.append("\n")
            }
        }
    }
  
}