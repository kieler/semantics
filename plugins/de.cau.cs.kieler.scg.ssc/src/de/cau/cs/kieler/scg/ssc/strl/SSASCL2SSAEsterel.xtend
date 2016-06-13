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
package de.cau.cs.kieler.scg.ssc.strl

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsSerializeHRExtensions
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Statement
import de.cau.cs.kieler.esterel.esterel.StatementContainer
import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.esterel.kexpressions.OperatorType
import de.cau.cs.kieler.esterel.kexpressions.ValueType
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.ssc.features.SSAEstFeature
import de.cau.cs.kieler.scg.ssc.features.SSASCLFeature
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.SCLProgram
import java.util.BitSet
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.EList

import static com.google.common.collect.Lists.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*

import static extension java.lang.Math.*
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSASCL2SSAEsterel extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "ssascl2ssastrl"
    }

    override getName() {
        return "SSA Esterel"
    }

    override getProducedFeatureId() {
        return SSAEstFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSASCLFeature.ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    @Inject
    extension KExpressionsSerializeHRExtensions
    @Inject
    extension KExpressionsValuedObjectExtensions
    @Inject
    extension AnnotationsExtensions

    extension EsterelFactory = EsterelFactory::eINSTANCE
    extension KExpressionsFactory = KExpressionsFactory::eINSTANCE

    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    // TODO Currently only instantaneous, acyclic
    val Map<ValuedObject, ISignal> voSigMap = newHashMap
    val List<ValuedObject> unemit = newLinkedList

    def Program transform(SCLProgram scl, KielerCompilerContext context) {
        scl.eAllContents.filter(Assignment).forEach[
            if (it.expression instanceof BoolValue && (it.expression as BoolValue).value == false) {
                unemit.add(it.valuedObject)
            }
            if (it.expression instanceof IntValue && (it.expression as IntValue).value == 0) {
                unemit.add(it.valuedObject)
            }
        ]
        
        val prog = createProgram

        val module = createModule
        prog.modules += module

        module.name = scl.name
        module.end = "end module"

        // TODO IO Signals
        val body = createModuleBody
        module.body = body
        voSigMap.clear
        
        if (scl.declarations.exists[input || output]) {
            module.interface = createModuleInterface => [
                for (decl : scl.declarations.filter[input || output]) {
                    for (valObj : decl.valuedObjects) {
                        // Create the signal
                        val signal = createISignal => [
                            name = valObj.name
                            if (decl.type != de.cau.cs.kieler.core.kexpressions.ValueType.PURE) {
                                channelDescr = EsterelFactory::eINSTANCE.createChannelDescription => [
                                    type = KExpressionsFactory::eINSTANCE.createTypeIdentifier => [
                                        type = ValueType::getByName(decl.type.getName)
                                    ]
                                ]
                            }
                        ]
    
                        if (decl.isOutput && decl.isInput) {
                            intSignalDecls += KExpressionsFactory::eINSTANCE.createInputOutput => [
                                signals += signal
                            ]
                        } else if (decl.isInput) {
                            intSignalDecls += KExpressionsFactory::eINSTANCE.createInput => [
                                signals += signal
                            ]
                        } else if (decl.isOutput) {
                            intSignalDecls += KExpressionsFactory::eINSTANCE.createOutput => [
                                signals += signal
                            ]
                        }
                        voSigMap.put(valObj, signal)
                    }
                }
            ]
        }
        
        var StatementContainer signalNestingHead = null
        for (decl : scl.declarations.filter[!(input || output)]) {
            val sigDecl = createLocalSignalDecl
            sigDecl.optEnd = "signal"
            val sigs = createLocalSignal
            sigDecl.signalList = sigs
            for (vo : decl.valuedObjects) {
                sigs.signal += createISignal => [
                    voSigMap.put(vo, it)
                    name = vo.name
                    if (decl.type != de.cau.cs.kieler.core.kexpressions.ValueType.PURE) {
                        channelDescr = EsterelFactory::eINSTANCE.createChannelDescription => [
                            type = KExpressionsFactory::eINSTANCE.createTypeIdentifier => [
                                type = ValueType::getByName(decl.type.getName)
                            ]
                        ]
                    }

                ]
            }
            if (signalNestingHead == null) {
                body.statements += sigDecl
            } else {
                signalNestingHead.statement = sigDecl
            }
            signalNestingHead = sigDecl
        }
        
        if (signalNestingHead == null) {
            body.statements.addAll(scl.statements.map[translate])
        } else {
            signalNestingHead.statement = createSequence => [
                list.addAll(scl.statements.map[translate])
            ]
        }

        return prog
    }

    private dispatch def Statement translate(EmptyStatement empty) {
        return createNothing
    }

    private dispatch def Statement translate(InstructionStatement stm) {
        return stm.instruction.translate
    }

    private dispatch def Statement translate(Assignment asm) {
        if (asm.expression instanceof FunctionCall) {
            val fc = asm.expression as FunctionCall
            val isPure = (asm.valuedObject.eContainer as Declaration).type == de.cau.cs.kieler.core.kexpressions.ValueType.PURE
            val assignSignal = voSigMap.get(asm.valuedObject)
            if (fc.functionName == SEQ.symbol) {
                if (isPure) {
                    return fc.translatePureSeq(assignSignal)
                } else {
                    return fc.translateValuedSeq(assignSignal)
                }
            } else if (fc.functionName == CONC.symbol) {
                if (isPure) {
                    return fc.translatePureConc(assignSignal)
                } else {
                    return fc.translateValuedConc(assignSignal)
                }
            } else {
                return createIfTest => [
                    expr = createTextExpression => [
                        code = asm.expression.serializeHR.toString
                    ]
                    thenPart = createThenPart => [
                        statement = createEmit => [
                            signal = voSigMap.get(asm.valuedObject)
                        ]
                    ]
                ]
            }
        } else if ((asm.valuedObject.eContainer as Declaration).type ==
            de.cau.cs.kieler.core.kexpressions.ValueType.PURE) {
            val asmExp = asm.expression
            if (asmExp instanceof IntValue) {
                switch (asmExp.value) {
                    case 0:
                        // TODO UNEMIT
//                        return createUnEmit => [
//                            signal = voSigMap.get(asm.valuedObject)
//                        ]
                        return createEmit => [
                            signal = voSigMap.get(asm.valuedObject)
                            signal.name = "not_" + signal.name
                        ]                       
                    case 1:
                        return createEmit => [
                            signal = voSigMap.get(asm.valuedObject)
                        ]
                }
            } else if (asmExp instanceof BoolValue) {
                if (asmExp.value) {
                        // TODO UNEMIT
//                        return createUnEmit => [
//                            signal = voSigMap.get(asm.valuedObject)
//                        ]
                        return createEmit => [
                            signal = voSigMap.get(asm.valuedObject)
                            signal.name = "not_" + signal.name
                        ] 
                } else {
                    return createEmit => [
                        signal = voSigMap.get(asm.valuedObject)
                    ]
                }
            } else if (asmExp instanceof ValuedObjectReference) {
                val present = createPresent
                present.body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = asm.expression.translateExpression
                    ]
                    thenPart = createThenPart => [
                        statement = createEmit => [
                            signal = voSigMap.get(asm.valuedObject)
                        ]
                    ]
                ]
                // TODO Else body with not_X ?
                return present
            } else {
                throw new UnsupportedOperationException("Cannot determine correct emit for variable assignment")
            }
        } else {
            return createEmit => [
                signal = voSigMap.get(asm.valuedObject)
                expr = asm.expression.translateExpression
            ]
        }
    }

    private dispatch def Statement translate(Conditional cond) {
        if (cond.expression.allReferences.forall[(it.valuedObject.eContainer as Declaration).type == de.cau.cs.kieler.core.kexpressions.ValueType.PURE]) {
            // TODO only for presentation
            return createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        if (cond.expression.eAllContents.exists[
                            return (it instanceof BoolValue && (it as BoolValue).value == false) ||
                                (it instanceof IntValue && (it as IntValue).value == 0)
                        ]) {
                            expression = createOperatorExpression => [
                                operator = OperatorType::NOT
                                subExpressions += (cond.expression.allReferences.head as ValuedObjectReference).signalReference
                            ]
                        } else {
                            expression = (cond.expression.allReferences.head as ValuedObjectReference).signalReference
                        }
                    ]
                    if (!cond.statements.nullOrEmpty) {
                        thenPart = createThenPart => [
                            if (cond.statements.size == 1) {
                                statement = cond.statements.head.translate
                            } else {
                                statement = createSequence => [
                                    list.addAll(cond.statements.map[translate])
                                ]
                            }
                        ]
                    }
                ]
                if (!cond.elseStatements.nullOrEmpty) {
                    elsePart = createElsePart => [
                        if (cond.elseStatements.size == 1) {
                            statement = cond.elseStatements.head.translate
                        } else {
                            statement = createSequence => [
                                list.addAll(cond.elseStatements.map[translate])
                            ]
                        }
                    ]
                }
            ]
        } else {
            return createIfTest => [
                if (cond.expression instanceof ValuedObjectReference) {
                    expr = createOperatorExpression => [
                        operator = OperatorType::NE
                        subExpressions += cond.expression.translateExpression
                        subExpressions += createConstantExpression => [
                            value = "0"
                        ]
                    ]
                } else {
                    expr = cond.expression.translateExpression
                }
                if (!cond.statements.nullOrEmpty) {
                    thenPart = createThenPart => [
                        if (cond.statements.size == 1) {
                            statement = cond.statements.head.translate
                        } else {
                            statement = createSequence => [
                                list.addAll(cond.statements.map[translate])
                            ]
                        }
                    ]
                }
                if (!cond.elseStatements.nullOrEmpty) {
                    elsePart = createElsePart => [
                        if (cond.elseStatements.size == 1) {
                            statement = cond.elseStatements.head.translate
                        } else {
                            statement = createSequence => [
                                list.addAll(cond.elseStatements.map[translate])
                            ]
                        }
                    ]
                }
            ]
            
        }
    }

    private dispatch def Statement translate(Parallel fork) {
        return createBlock => [
            statement = createParallel => [
                for (th : fork.threads) {
                    if (th.statements.size == 1) {
                        list += th.statements.head.translate
                    } else {
                        list += createSequence => [
                            list.addAll(th.statements.map[translate])
                        ]
                    }
                }
            ]
        ]
    }

    private dispatch def Statement translate(Goto goto) {
        throw new UnsupportedOperationException("Cannot transform goto")
    }

    private dispatch def Statement translate(Pause pause) {
        return createPause
    }

    private dispatch def Expression translateExpression(ValuedObjectReference ref) {
        if ((ref.valuedObject.eContainer as Declaration).type == de.cau.cs.kieler.core.kexpressions.ValueType.PURE) {
            return createValuedObjectReference => [
                valuedObject = voSigMap.get(ref.valuedObject)
            ]            
        } else {
            return createOperatorExpression => [
                operator = OperatorType::VAL
                subExpressions += createValuedObjectReference => [
                    valuedObject = voSigMap.get(ref.valuedObject)
                ]
            ]
        }
    }

    private dispatch def Expression translateExpression(OperatorExpression exp) {
        return createOperatorExpression => [
            operator = OperatorType::getByName(exp.operator.getName)
            for (subExp : exp.subExpressions) {
                subExpressions += subExp.translateExpression
            }
        ]
    }

    private def dispatch Expression translateExpression(BoolValue exp) {
        createConstantExpression => [
            value = Boolean.toString(exp.value)
        ]
    }

    private def dispatch Expression translateExpression(IntValue exp) {
        createConstantExpression => [
            value = Integer.toString(exp.value)
        ]
    }

    private def dispatch Expression translateExpression(FloatValue exp) {
        createConstantExpression => [
            value = Float.toString(exp.value)
        ]
    }
    
    private def Expression signalReference(ValuedObjectReference ref) {
        return createValuedObjectReference => [
            valuedObject = voSigMap.get(ref.valuedObject)
        ]
    }
    
    private def allPresenceCases(int numberOfSignals) {
        val count = (2.pow(numberOfSignals)) as int
        val perms = newArrayListWithExpectedSize(count)
        for (i : 0..count) {
            perms += BitSet::valueOf(#[i])
        }
        return perms
    }
    
    private def translateValuedSeq(FunctionCall fc, ISignal assignSignal) {
         if (fc.parameters.size == 2) {
            return createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = (fc.parameters.last.expression as ValuedObjectReference).signalReference
                    ]
                    thenPart = createThenPart => [
                        statement = createEmit => [
                            signal = assignSignal
                            expr = fc.parameters.last.expression.translateExpression
                        ]
                    ]
                ]
                elsePart = createElsePart => [
                    statement = createEmit => [
                        signal = assignSignal
                        expr = fc.parameters.head.expression.translateExpression
                    ]
                ]
            ]
        } else {
            return createPresent => [
                body = createPresentCaseList => [
                    cases += fc.parameters.reverseView.take(fc.parameters.size - 1).map[ param |
                        createPresentCase => [
                            event = createPresentEvent => [
                                expression = (param.expression as ValuedObjectReference).signalReference
                            ]
                            statement = createEmit => [
                                signal = assignSignal
                                expr = param.expression.translateExpression
                            ]
                        ]
                    ]

                ]
                elsePart = createElsePart => [
                    statement = createEmit => [
                        signal = assignSignal
                        expr = fc.parameters.head.expression.translateExpression
                    ]
                ]
            ]
        }
    }

    private def translatePureSeq(FunctionCall fc, ISignal assignSignal) {
         if (fc.parameters.size == 2) {
            return createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = fc.parameters.seqFunction
                    ]
                    thenPart = createThenPart => [
                        statement = createEmit => [
                            signal = assignSignal
                        ]
                    ]
                ]
            ]
        }
    }
    
    def Expression seqFunction(EList<Parameter> param){
        // TODO very restricted
        if (param.size == 2) {
            if (unemit.contains((param.last.expression as ValuedObjectReference).valuedObject)) {
                return createOperatorExpression => [
                    operator = OperatorType::AND
                    subExpressions += param.head.expression.translateExpression
                    subExpressions += createOperatorExpression => [
                        operator = OperatorType::NOT
                        subExpressions += param.last.expression.translateExpression
                    ]
                ]
            } else {
                return createOperatorExpression => [
                    operator = OperatorType::OR
                    subExpressions += param.head.expression.translateExpression
                    subExpressions += param.last.expression.translateExpression
                ]
            }

        }
    }
    
    private def translateValuedConc(FunctionCall fc, ISignal assignSignal) {
        if (fc.parameters.size == 2) {
            return createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = (fc.parameters.head.expression as ValuedObjectReference).signalReference
                    ]
                    thenPart = createThenPart => [
                        statement = createPresent => [
                            body = createPresentEventBody => [
                                event = createPresentEvent => [
                                    expression = (fc.parameters.last.expression as ValuedObjectReference).signalReference
                                ]
                                thenPart = createThenPart => [
                                    statement = createIfTest => [
                                        expr = createOperatorExpression => [
                                            operator = OperatorType::EQ
                                            subExpressions += fc.parameters.head.expression.translateExpression
                                            subExpressions += fc.parameters.last.expression.translateExpression
                                        ]
                                        thenPart = createThenPart => [
                                            statement = createEmit => [
                                                signal = assignSignal
                                                expr = fc.parameters.head.expression.translateExpression
                                            ]
                                        ]
                                        elsePart = createElsePart => [
                                            // Error case
                                            statement = createEmit => [
                                                signal = assignSignal
                                                expr = createValuedObjectReference => [
                                                    valuedObject = assignSignal
                                                ]
                                            ]
                                        ]
                                    ]
                                ]
                            ]
                            elsePart = createElsePart => [
                                statement = createEmit => [
                                    signal = assignSignal
                                    expr = fc.parameters.head.expression.translateExpression
                                ]
                            ]
                        ]
                    ]
                ]
                elsePart = createElsePart => [
                    statement = createPresent => [
                        body = createPresentEventBody => [
                            event = createPresentEvent => [
                                expression = (fc.parameters.last.expression as ValuedObjectReference).signalReference
                            ]
                            thenPart = createThenPart => [
                                statement = createEmit => [
                                    signal = assignSignal
                                    expr = fc.parameters.last.expression.translateExpression
                                ]
                            ]
                        ]
                    ]
                ]
            ]
        } else {
            return createPresent => [
                body = createPresentCaseList => [
                    for (perm : allPresenceCases(fc.parameters.size).drop(0)) {
                        cases += createPresentCase => [
                            event = createPresentEvent => [
                                expression = createOperatorExpression => [
                                    operator = OperatorType::AND
                                    for (param : fc.parameters.indexed) {
                                        val exp = if (perm.get(param.key)) {
                                            (param.value.expression as ValuedObjectReference).signalReference
                                        } else {
                                            createOperatorExpression => [
                                                 operator = OperatorType::NOT
                                                 subExpressions += (param.value.expression as ValuedObjectReference).signalReference
                                            ]
                                        }
                                        subExpressions += exp
                                    }
                                ]
                            ]
                            statement = if (perm.cardinality == 1) {
                                createEmit => [
                                    signal = assignSignal
                                    expr = fc.parameters.get(perm.nextSetBit(0)).expression.translateExpression
                                ]                                        
                            } else {
                                createIfTest => [
                                    expr = createOperatorExpression => [
                                        operator = OperatorType::AND
                                        var next = 0
                                        for (i : 0..(perm.cardinality - 1)) {
                                            val idx = perm.nextSetBit(next)
                                            subExpressions += createOperatorExpression => [
                                                operator = OperatorType::EQ
                                                subExpressions += fc.parameters.get(idx).expression.translateExpression
                                                subExpressions += fc.parameters.get(perm.nextSetBit(idx)).expression.translateExpression
                                            ]
                                            next = idx
                                        }
                                    ]
                                    thenPart = createThenPart => [
                                        statement = createEmit => [
                                            signal = assignSignal
                                            expr = fc.parameters.get(perm.nextSetBit(0)).expression.translateExpression
                                        ]
                                    ]
                                    elsePart = createElsePart => [
                                        // Error case
                                        statement = createEmit => [
                                            signal = assignSignal
                                            expr = createValuedObjectReference => [
                                                valuedObject = assignSignal
                                            ]
                                        ]
                                    ]
                                ]
                            }
                        ]
                    }
                ]
            ]
        } 
    }
    
    private def translatePureConc(FunctionCall fc, ISignal assignSignal) {
         if (fc.parameters.size == 2) {
            return createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = fc.parameters.concFunction
                    ]
                    thenPart = createThenPart => [
                        statement = createEmit => [
                            signal = assignSignal
                        ]
                    ]
                ]
            ]
        }
    }
    
    def Expression concFunction(EList<Parameter> param){
        // TODO very restricted
        if (param.size == 2) {
            if (unemit.contains((param.last.expression as ValuedObjectReference).valuedObject)) {
                return createOperatorExpression => [
                    operator = OperatorType::AND
                    subExpressions += param.head.expression.translateExpression
                    subExpressions += createOperatorExpression => [
                        operator = OperatorType::NOT
                        subExpressions += param.last.expression.translateExpression
                    ]
                ]
            } else {
                return createOperatorExpression => [
                    operator = OperatorType::OR
                    subExpressions += param.head.expression.translateExpression
                    subExpressions += param.last.expression.translateExpression
                ]
            }

        }
    }  
}
