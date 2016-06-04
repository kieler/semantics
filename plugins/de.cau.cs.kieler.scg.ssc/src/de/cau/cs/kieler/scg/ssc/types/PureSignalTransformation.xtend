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
package de.cau.cs.kieler.scg.ssc.types

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ssc.features.PureSignalsFeature
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.ssa.SSATransformation
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class PureSignalTransformation extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg.signals"
    }

    override getName() {
        return "Pure Signals"
    }

    override getProducedFeatureId() {
        return PureSignalsFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSAFeature.ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------

    @Inject
    extension AnnotationsExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension KExpressionsCreateExtensions


    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------

    public static val SIGNAL = "signal"
    public static val EMIT = "emit"
    public static val UNEMIT = "unemit"
    
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {

        if (scg.hasNonPureVariables) {
            if (context != null) {
                context.getCompilationResult().addPostponedWarning(
                    new KielerCompilerException(getId(), getId(), "The SCG contains non pure variables!"));
                return scg
            }
        } else {
            scg.createStringAnnotation(PureSignalsFeature.ID, PureSignalsFeature.ID)
            for (decl : scg.declarations) {
                decl.type = ValueType.PURE
                // TODO only because scl2est does not support locasl variables
//                decl.input = true
//                decl.output = true
            }
        }
        return scg
    }

    private def hasNonPureVariables(SCGraph scg) {
        for (decl : scg.declarations) {
            if (decl.type != ValueType.BOOL && decl.type != ValueType.INT) {
                return true
            }
        }
        for (node : scg.nodes) {
            if (node instanceof Assignment) {
                if (!node.hasAnnotation(SSATransformation.SSA)) {
                    val asmExp = node.assignment
                    if (asmExp instanceof IntValue) {
                        switch (asmExp.value) {
                            case 0: node.createStringAnnotation(SIGNAL, UNEMIT)
                            case 1: node.createStringAnnotation(SIGNAL, EMIT)
                            default: return true
                        }
                    } else if (!(asmExp instanceof BoolValue || asmExp instanceof ValuedObjectReference)) {
                        return true
                    }
                }
            } else if (node instanceof Conditional) {
                val cond = node.condition
                // TODO make less conservative
                if (cond.eAllContents.filter(OperatorExpression).exists[
                    operator == OperatorType.ADD ||
                    operator == OperatorType.DIV ||
                    operator == OperatorType.GEQ ||
                    operator == OperatorType.GT ||
                    operator == OperatorType.LEQ ||
                    operator == OperatorType.LT ||
                    operator == OperatorType.MOD ||
                    operator == OperatorType.MULT ||
                    operator == OperatorType.SUB
                ]) {
                    return true
                }
                if (cond instanceof OperatorExpression) {
                    if (cond.operator == OperatorType.EQ) {
                        // TODO make less conservative
                        val const = cond.subExpressions.get(1)
                        if (const instanceof IntValue) {
                            if (const.value == 1) {
                                node.condition = cond.subExpressions.get(0)
                            } else if (const.value == 0) {
                                node.condition = createOperatorExpression(OperatorType.NOT) => [
                                    it.subExpressions += cond.subExpressions.get(0)
                                ]
                            } else {
                                return true
                            }
                        } else if (const instanceof BoolValue) {
                            if (const.value) {
                                node.condition = cond.subExpressions.get(0)
                            } else {
                                node.condition = createOperatorExpression(OperatorType.NOT) => [
                                    it.subExpressions += cond.subExpressions.get(0)
                                ]
                            }
                        } else {
                            return true
                        }
                    }
                    if (cond.operator == OperatorType.NE) {
                        // TODO make less conservative
                        val const = cond.subExpressions.get(1)
                        if (const instanceof IntValue) {
                            if (const.value == 0) {
                                node.condition = cond.subExpressions.get(0)
                            } else if (const.value == 1) {
                                node.condition = createOperatorExpression(OperatorType.NOT) => [
                                    it.subExpressions += cond.subExpressions.get(0)
                                ]
                            } else {
                                return true
                            }
                        } else if (const instanceof BoolValue) {
                            if (!const.value) {
                                node.condition = cond.subExpressions.get(0)
                            } else {
                                node.condition = createOperatorExpression(OperatorType.NOT) => [
                                    it.subExpressions += cond.subExpressions.get(0)
                                ]
                            }
                        } else {
                            return true
                        }
                    }
                } else {
                    // TODO make less conservative
                    if (cond.eAllContents.filter(OperatorExpression).exists[
                        operator == OperatorType.EQ ||
                        operator == OperatorType.NE
                    ]) {
                        return true
                    }
                }
            }
        }
        return false
    }
}
