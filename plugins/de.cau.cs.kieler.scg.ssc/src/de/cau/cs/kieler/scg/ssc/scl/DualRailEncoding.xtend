/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.scl

import com.google.common.collect.Iterators
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.ssc.features.DualRailFeature
import de.cau.cs.kieler.scg.ssc.features.SSASCLFeature
import de.cau.cs.kieler.scg.ssc.ssa.SSAFunction
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclFactory
import java.util.Iterator

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.Instruction

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DualRailEncoding extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scl.dualrailencoding"
    }

    override getName() {
        return "SCL Dual-Rail Encoding"
    }

    override getProducedFeatureId() {
        return DualRailFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSASCLFeature.ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    extension SclFactory = SclFactory::eINSTANCE
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions

    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    val duals = <ValuedObject, ValuedObject>newHashMap()
    def transform(SCLProgram scl, KielerCompilerContext context) {
        duals.clear
        
        // Create dual  booleans
        for (decl : scl.declarations.filter[type == ValueType.BOOL]) {
            for (vo : decl.valuedObjects) {
                duals.put(vo, createValuedObject("not_" + vo.name))
            }
        }
        for (pair : duals.entrySet) {
            pair.key.declaration.valuedObjects.add(pair.key.declaration.valuedObjects.indexOf(pair.key) + 1, pair.value)
        }

        // Create Error
        val error = createValuedObject("error")
        if (scl.declarations.exists[type == ValueType.PURE]) {
            scl.declarations.findFirst[type == ValueType.PURE].valuedObjects.add(error)
        } else {
            scl.declarations.add(createDeclaration(ValueType.PURE) => [it.valuedObjects.add(error)])
        }

        val assignmentInstructions = newHashSet
        val conditionalInstructions = newHashSet
        for (instr : scl.eAllContents.filter(InstructionStatement).toIterable) {
            if (instr.instruction instanceof Assignment) {
                val asm = instr.instruction as Assignment
                if (asm.valuedObject.declaration.type == ValueType.BOOL && asm.expression.allReferences.forall[valuedObject.declaration.type == ValueType.BOOL]) {
                    assignmentInstructions.add(instr)
                }
            }
            if (instr.instruction instanceof Conditional) {
                val cond = instr.instruction as Conditional
                if (cond.expression.allReferences.forall[valuedObject.declaration.type == ValueType.BOOL]) {
                    conditionalInstructions.add(instr)
                }
            }
        }

        // Convert Assignments     
        for (instr : assignmentInstructions) {
            val asm = instr.instruction as Assignment
            // Constants
            if (asm.expression instanceof BoolValue) {
                if (!(asm.expression as BoolValue).value) {
                    (asm.expression as BoolValue).value = true
                    asm.valuedObject = duals.get(asm.valuedObject)
                }
            } else {
                val setter = createParallel => [
                    threads += createThread => [
                        statements += createInstructionStatement => [
                            instruction = createConditional => [
                                expression = asm.expression.valExpression
                                // then
                                it.statements += createInstructionStatement => [
                                    instruction = createAssignment => [
                                        valuedObject = asm.valuedObject
                                        expression = createBoolValue(true)
                                    ]
                                ]
                            ]

                        ]
                    ]
                    threads += createThread => [
                        statements += createInstructionStatement => [
                            instruction = createConditional => [
                                expression = asm.expression.notvalExpression
                                // then
                                it.statements += createInstructionStatement => [
                                    instruction = createAssignment => [
                                        valuedObject = duals.get(asm.valuedObject)
                                        expression = createBoolValue(true)
                                    ]
                                ]
                            ]
                        ]

                    ]
                ]
                if (!asm.expression.concFunctions.empty) {
                    instr.instruction = createConditional => [
                        expression = asm.expression.errorExpression
                        // then
                        it.statements += createInstructionStatement => [
                            instruction = createAssignment => [
                                valuedObject = error
                                expression = createBoolValue(true)
                            ]
                        ]
                        // else
                        it.elseStatements += createInstructionStatement => [
                            instruction = setter
                        ]
                    ]
                } else {
                    instr.instruction = setter
                }
            }
        }

        // Convert Conditionals     
        for (instr : conditionalInstructions) {
            val cond = instr.instruction as Conditional
            val Instruction thenBranch = if (!cond.statements.nullOrEmpty) {
                createConditional => [
                    expression = cond.expression.valExpression
                    it.statements.addAll(cond.statements)
                ]
            }
            val Instruction elseBranch = if (!cond.elseStatements.nullOrEmpty) {
                createConditional => [
                    expression = cond.expression.notvalExpression
                    it.statements.addAll(cond.elseStatements)
                ]
            }            
            val Instruction test = if (thenBranch != null && elseBranch != null) {
                createParallel => [
                    threads += createThread => [
                        statements += createInstructionStatement => [
                            instruction = thenBranch
                        ]
                    ]
                    threads += createThread => [
                        statements += createInstructionStatement => [
                            instruction = elseBranch
                        ]
                    ]
                ]
            } else if (thenBranch != null) {
                thenBranch
            } else if (elseBranch != null) {
                elseBranch
            }
            
            if (!cond.expression.concFunctions.empty) {
                instr.instruction = createConditional => [
                    expression = cond.expression.errorExpression
                    // then
                    it.statements += createInstructionStatement => [
                        instruction = createAssignment => [
                            valuedObject = error
                            expression = createBoolValue(true)
                        ]
                    ]
                    // else
                    it.elseStatements += createInstructionStatement => [
                        instruction = test
                    ]
                ]
            } else {
                instr.instruction = test
            }
        }

        return scl
    }

    private def Iterator<FunctionCall> concFunctions(Expression expression) {
        if (expression instanceof FunctionCall &&
            (expression as FunctionCall).functionName == SSAFunction.CONC.symbol) {
            return Iterators.concat(newLinkedList(expression as FunctionCall).iterator,
                expression.eAllContents.filter(FunctionCall).filter[functionName == SSAFunction.CONC.symbol])
        } else {
            return expression.eAllContents.filter(FunctionCall).filter[functionName == SSAFunction.CONC.symbol]
        }
    }

    private def Expression errorExpression(Expression expression) {
        val concs = expression.concFunctions.toList
        if (concs.size == 0) {
            return null
        } else if (concs.size == 1) {
            return concs.head.concErrorExpression
        } else {
            return createOperatorExpression(OperatorType.LOGICAL_OR) => [
                subExpressions.addAll(concs.map[concErrorExpression].filterNull)
            ]
        }
    }
    
    private def Expression concErrorExpression(FunctionCall conc) {
        if (conc.parameters.size != 2) {
            throw new IllegalArgumentException("Conc function with illegal parameter count")
        }
        
        val e0 = conc.parameters.get(0).expression
        val e1 = conc.parameters.get(1).expression
        
        return createOperatorExpression(OperatorType.LOGICAL_OR) => [
            subExpressions += createOperatorExpression(OperatorType.LOGICAL_AND) => [
                subExpressions += e0.valExpression
                subExpressions += e1.notvalExpression
            ]
            subExpressions += createOperatorExpression(OperatorType.LOGICAL_AND) => [
                subExpressions += e0.notvalExpression
                subExpressions += e1.valExpression
            ]
        ]
    }
    
    private def dispatch Expression valExpression(FunctionCall fc) {
        if (fc.parameters.size < 2) {
            throw new IllegalArgumentException("SSA function with illegal parameter count")
        }
        
        val e0 = fc.parameters.get(0).expression
        val e1 = fc.parameters.get(1).expression
        
        switch (fc.functionName) {
            case SSAFunction.SEQ.symbol: 
                return createOperatorExpression(OperatorType.LOGICAL_OR) => [
                    subExpressions += e1.valExpression
                    subExpressions += createOperatorExpression(OperatorType.LOGICAL_AND) => [
                        subExpressions += createOperatorExpression(OperatorType.NOT) => [
                            subExpressions += e1.notvalExpression
                        ]
                        subExpressions += e0.valExpression
                    ]
                ]
            case SSAFunction.CONC.symbol:{
                return createOperatorExpression(OperatorType.LOGICAL_OR) => [
                    subExpressions += e0.valExpression
                    subExpressions += e1.valExpression
                ]
            }
            case SSAFunction.COMBINE.symbol:{
                if (fc.parameters.size != 3) {
                    throw new IllegalArgumentException("Combine function with illegal parameter count")
                }  
                
                val up = fc.parameters.get(2).expression
                
                switch ((e0 as StringValue).value) {
                    case "OR": 
                        return createOperatorExpression(OperatorType.LOGICAL_OR) => [
                            subExpressions += up.valExpression
                            subExpressions += e1.valExpression
                        ]
                    case "AND":
                        return createOperatorExpression(OperatorType.LOGICAL_AND) => [
                            subExpressions += up.valExpression
                            subExpressions += e1.valExpression
                        ]
                    default: throw new IllegalArgumentException("Illegal combine function operator: " + (e0 as StringValue).value)
                }
            }
        }
    }
    
    private def dispatch Expression valExpression(OperatorExpression op) {
        switch (op.operator) {
            case LOGICAL_AND: {
                return createOperatorExpression(OperatorType.LOGICAL_AND) => [
                    subExpressions += op.subExpressions.get(0).valExpression
                    subExpressions += op.subExpressions.get(1).valExpression
                ]
            }
            case LOGICAL_OR: {
                return createOperatorExpression(OperatorType.LOGICAL_OR) => [
                    subExpressions += op.subExpressions.get(0).valExpression
                    subExpressions += op.subExpressions.get(1).valExpression
                ]
            }
            case NOT: {
                return op.subExpressions.head.notvalExpression
            }
            case PRE: {
                return op.copy
            }
            default: throw new UnsupportedOperationException("Unsupported operator type")
        }    
    }
    
    private def dispatch Expression valExpression(BoolValue b) {
        return b.copy
    }
    
    private def dispatch Expression valExpression(ValuedObjectReference ref) {
        return ref.copy       
    }
    
    private def dispatch Expression notvalExpression(FunctionCall fc) {
        if (fc.parameters.size < 2) {
            throw new IllegalArgumentException("SSA function with illegal parameter count")
        }
        
        val e0 = fc.parameters.get(0).expression
        val e1 = fc.parameters.get(1).expression
        
        switch (fc.functionName) {
            case SSAFunction.SEQ.symbol: 
                return createOperatorExpression(OperatorType.LOGICAL_OR) => [
                    subExpressions += e1.notvalExpression
                    subExpressions += createOperatorExpression(OperatorType.LOGICAL_AND) => [
                        subExpressions += createOperatorExpression(OperatorType.NOT) => [
                            subExpressions += e1.valExpression
                        ]
                        subExpressions += e0.notvalExpression
                    ]
                ]
            case SSAFunction.CONC.symbol:{
                return createOperatorExpression(OperatorType.LOGICAL_OR) => [
                    subExpressions += e0.notvalExpression
                    subExpressions += e1.notvalExpression
                ]
            }
            case SSAFunction.COMBINE.symbol:{
                if (fc.parameters.size != 3) {
                    throw new IllegalArgumentException("Combine function with illegal parameter count")
                }  
                
                val up = fc.parameters.get(2).expression
                
                switch ((e0 as StringValue).value) {
                    case "OR": 
                        return createOperatorExpression(OperatorType.LOGICAL_AND) => [
                            subExpressions += up.notvalExpression
                            subExpressions += e1.notvalExpression
                        ]
                    case "AND":
                        return createOperatorExpression(OperatorType.LOGICAL_OR) => [
                            subExpressions += up.notvalExpression
                            subExpressions += e1.notvalExpression
                        ]
                    default: throw new IllegalArgumentException("Illegal combine function operator: " + (e0 as StringValue).value)
                }
            }
        }
    }
    
    private def dispatch Expression notvalExpression(OperatorExpression op) {
        switch (op.operator) {
            case LOGICAL_AND: {
                return createOperatorExpression(OperatorType.LOGICAL_OR) => [
                    subExpressions += op.subExpressions.get(0).notvalExpression
                    subExpressions += op.subExpressions.get(1).notvalExpression
                ]
            }
            case LOGICAL_OR: {
                return createOperatorExpression(OperatorType.LOGICAL_AND) => [
                    subExpressions += op.subExpressions.get(0).notvalExpression
                    subExpressions += op.subExpressions.get(1).notvalExpression
                ]
            }
            case NOT: {
                return op.subExpressions.head.valExpression
            }
            case PRE: {
                return op.copy
            }
            default: throw new UnsupportedOperationException("Unsupported operator type")
        }    
    }
    
    private def dispatch Expression notvalExpression(BoolValue b) {
        return b.copy => [
            value = !value
        ]
    }
    
    private def dispatch Expression notvalExpression(ValuedObjectReference ref) {
        return duals.get(ref.valuedObject).reference  
    }          

}
