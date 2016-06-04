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

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.ssc.features.SSASCLFeature
import de.cau.cs.kieler.scg.ssc.features.SSASignalSCLFeature
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclFactory
import java.util.List
import org.eclipse.emf.ecore.EObject

import static de.cau.cs.kieler.scg.ssc.ssa.processors.SeqConcTransformer.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSASCL2SSASignalSCL extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "ssascl2ssasigscl"
    }

    override getName() {
        return "SSA-SCL"
    }

    override getProducedFeatureId() {
        return SSASignalSCLFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSASCLFeature.ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension AnnotationsExtensions

    extension SclFactory = SclFactory::eINSTANCE
    extension AnnotationsFactory = AnnotationsFactory::eINSTANCE

    public static val PRESENT_TEST = "present"

    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    def transform(SCLProgram scl, KielerCompilerContext context) {
        // TODO custom iterator
        for (asm : scl.eAllContents.filter(Assignment).toIterable) {
            if (asm.expression instanceof FunctionCall) {
                var newStatements = newLinkedList
                val fc = asm.expression as FunctionCall
                // TODO present case is better but not supported in scl
                if (fc.functionName == SEQ) {
                    val paramIter = fc.parameters.map[expression].reverseView.listIterator
                    val cond = createConditional => [
                        val first = paramIter.next
                        expression = first.copy
                        statements += createInstructionStatement => [
                            instruction = createAssignment => [
                                valuedObject = asm.valuedObject
                                expression = first
                            ]
                        ]
                    ]
                    var nextElse = cond.elseStatements
                    while (paramIter.hasNext) {
                        val next = paramIter.next
                        if (paramIter.hasNext) {
                            val nextCond = createConditional => [
                                expression = next.copy
                                statements += createInstructionStatement => [
                                    instruction = createAssignment => [
                                        valuedObject = asm.valuedObject
                                        expression = next
                                    ]
                                ]
                            ]
                            nextElse += createInstructionStatement => [
                                annotations += createAnnotation => [
                                    name = PRESENT_TEST
                                ]
                                instruction = nextCond
                            ]
                            nextElse = nextCond.elseStatements
                        } else { // Last
                            nextElse += createInstructionStatement => [
                                instruction = createAssignment => [
                                    valuedObject = asm.valuedObject
                                    expression = next
                                ]
                            ]
                        }
                    }
                    newStatements += createInstructionStatement => [
                        annotations += createAnnotation => [
                            name = PRESENT_TEST
                        ]
                        instruction = cond
                    ]
                } else if (fc.functionName == CONC) {
                    // TODO handle ineffective write
                    val paramIter = fc.parameters.map[expression].listIterator
                    val first = paramIter.next
                    val second = paramIter.next
                    newStatements += createInstructionStatement => [
                        annotations += createAnnotation => [
                            name = PRESENT_TEST
                        ]
                        instruction = createConditional => [
                            expression = first.copy
                            statements += createInstructionStatement => [
                                annotations += createAnnotation => [
                                    name = PRESENT_TEST
                                ]
                                instruction = createConditional => [
                                    expression = second.copy
                                    statements += createInstructionStatement => [
                                        instruction = createConditional => [
                                            expression = createOperatorExpression(OperatorType.NE) => [
                                                subExpressions += first.copy
                                                subExpressions += second.copy
                                            ]
                                            statements += createInstructionStatement => [
                                                instruction = createAssignment => [
                                                    valuedObject = asm.valuedObject
                                                    expression = asm.valuedObject.reference
                                                ]
                                            ]
                                            elseStatements += createInstructionStatement => [
                                                instruction = createAssignment => [
                                                    valuedObject = asm.valuedObject
                                                    expression = first
                                                ]
                                            ]
                                        ]
                                    ]
                                    elseStatements += createInstructionStatement => [
                                        annotations += createAnnotation => [
                                            name = PRESENT_TEST
                                        ]
                                        instruction = createConditional => [
                                            expression = second.copy
                                            statements += createInstructionStatement => [
                                                instruction = createAssignment => [
                                                    valuedObject = asm.valuedObject
                                                    expression = second
                                                ]
                                            ]
                                        ]
                                    ]
                                ]
                            ]
                        ]
                    ]
                    // FIXME This is nerver Constructive !!!
                    while (paramIter.hasNext) {
                        throw new UnsupportedOperationException("Conc with more than two parameters is currently not supported")
//                        paramIter.previous
//                        val prev = paramIter.next
//                        val next = paramIter.next
//                        newStatements += createInstructionStatement => [
//                            annotations += createAnnotation => [
//                                name = PRESENT_TEST
//                            ]
//                            instruction = createConditional => [
//                                expression = next.copy
//                                statements += createInstructionStatement => [
//                                    annotations += createAnnotation => [
//                                        name = PRESENT_TEST
//                                    ]
//                                    instruction = createConditional => [
//                                        expression = prev.copy
//                                        statements += createInstructionStatement => [
//                                            instruction = createConditional => [
//                                                expression = createOperatorExpression(OperatorType.NE) => [
//                                                    subExpressions += prev.copy
//                                                    subExpressions += next.copy
//                                                ]
//                                                statements += createInstructionStatement => [
//                                                    instruction = createAssignment => [
//                                                        valuedObject = asm.valuedObject
//                                                        expression = asm.valuedObject.reference
//                                                    ]
//                                                ]
//                                            ]
//                                        ]
//                                        elseStatements += createInstructionStatement => [
//                                            instruction = createAssignment => [
//                                                valuedObject = asm.valuedObject
//                                                expression = next
//                                            ]
//                                        ]
//                                    ]
//                                ]
//                            ]
//                        ]
                    }
                }
                if (!newStatements.empty) {
                    val instruction = asm.eContainer
                    val container = instruction.eContainer
                    val containerFeature = instruction.eContainingFeature
                    if (!containerFeature.isMany) {
                        throw new IllegalArgumentException("SSA function call is not in a statement list ")
                    }
                    val list = container.eGet(containerFeature) as List<EObject>;
                    val index = list.indexOf(instruction)
                    list.remove(index)
                    list.addAll(index, newStatements)
                }
            }
        }
        return scl
    }
}
