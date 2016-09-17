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
import de.cau.cs.kieler.core.kexpressions.Value
import de.cau.cs.kieler.esterel.esterel.TrapDecl
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.core.kexpressions.StringValue

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
    val Map<ValuedObject, ISignal> voPSigMap = newHashMap
    val Map<String, TrapDecl> trapSigMap = newHashMap
    var ISignal error
    var Pair<ValuedObject, ISignal> termSig
//    val List<ValuedObject> unemit = newLinkedList

    def Program transform(SCLProgram scl, KielerCompilerContext context) {
//        scl.eAllContents.filter(Assignment).forEach[
//            if (it.expression instanceof BoolValue && (it.expression as BoolValue).value == false) {
//                unemit.add(it.valuedObject)
//            }
//            if (it.expression instanceof IntValue && (it.expression as IntValue).value == 0) {
//                unemit.add(it.valuedObject)
//            }
//        ]
        
        val prog = createProgram

        val module = createModule
        prog.modules += module

        module.name = scl.name
        module.end = "end module"

        // TODO IO Signals
        val body = createModuleBody
        module.body = body
        voSigMap.clear
        voPSigMap.clear
        trapSigMap.clear
        
        if (scl.declarations.exists[input || output]) {
            module.interface = createModuleInterface => [
                for (decl : scl.declarations.filter[input || output]) {
                    for (valObj : decl.valuedObjects) {
                        // Create the signal
                        val signal = createISignal => [
                            name = valObj.name
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
        // Presence sigs for io
//        if (!voSigMap.empty) {
//            val sigDecl = createLocalSignalDecl
//            sigDecl.optEnd = "signal"
//            val sigs = createLocalSignal
//            sigDecl.signalList = sigs
//            for (vo : voSigMap.keySet) {
//                sigs.signal += createISignal => [
//                    voPSigMap.put(vo, it)
//                    name = vo.name+"p"
//                ]
//            }
//            if (signalNestingHead == null) {
//                body.statements += sigDecl
//            } else {
//                signalNestingHead.statement = sigDecl
//            }
//            signalNestingHead = sigDecl
//        }
        for (decl : scl.declarations.filter[!(input || output) && type == de.cau.cs.kieler.core.kexpressions.ValueType.BOOL]) {
            val sigDecl = createLocalSignalDecl
            sigDecl.optEnd = "signal"
            val sigs = createLocalSignal
            sigDecl.signalList = sigs
            for (vo : decl.valuedObjects) {
                sigs.signal += createISignal => [
                    voPSigMap.put(vo, it)
                    name = vo.name+"p"
                ]
                sigs.signal += createISignal => [
                    voSigMap.put(vo, it)
                    name = vo.name
                ]
            }
            if (signalNestingHead == null) {
                body.statements += sigDecl
            } else {
                signalNestingHead.statement = sigDecl
            }
            signalNestingHead = sigDecl
        }
        
        // error and term
        val isDelayed = scl.declarations.exists[type == de.cau.cs.kieler.core.kexpressions.ValueType.PURE]
        val sigDecl = createLocalSignalDecl
        sigDecl.optEnd = "signal"
        val sigs = createLocalSignal
        sigDecl.signalList = sigs
        sigs.signal += createISignal => [
            error = it
            name = "error"
        ]
        if (isDelayed) {
            val term = scl.declarations.findFirst[type == de.cau.cs.kieler.core.kexpressions.ValueType.PURE].valuedObjects.head
            sigs.signal += createISignal => [
                name = term.name
                termSig = new Pair(term, it)
            ]            
        } else {
            termSig = null
        }
        if (signalNestingHead == null) {
            body.statements += sigDecl
        } else {
            signalNestingHead.statement = sigDecl
        }
        signalNestingHead = sigDecl
        
        
        if (isDelayed) {
            signalNestingHead.statement = scl.statements.head.translate.head
        } else {
            signalNestingHead.statement = createBlock => [
                statement = createParallel => [
                    if (scl.statements.size > 1) {
                        list += createSequence => [
                            scl.statements.translateAddTo(list)
                        ]
                    } else {
                        val s = scl.statements.head.translate
                        if (s.size > 1) {
                            list += createSequence => [
                                list += s
                            ]
                        } else {
                            list += s
                        }
                    }
                    list += errorPattern
                ]
            ]
            
        }


        return prog
    }

    private dispatch def List<Statement> translate(EmptyStatement empty) {
        if (empty.label?.startsWith("loop") && false) {
            val b = createBlock => [
                    statement = createTrap => [
                        trapDeclList = createTrapDeclList => [
                            trapDecls += createTrapDecl => [
                                name = empty.label;
                                trapSigMap.put(empty.label, it)
                            ]
                        ]
                        optEnd = "trap"
                        statement = createLoop => [
                            body = createLoopBody => [
                                statement = createNothing
//                                createSequence => [
//                                    for (i : .statements.map[translate]) {
//                                        list.addAll(i)
//                                    }
//                                ]
                            ]
                            end1 = createEndLoop
                        ]
                    ]
                ]
            return newArrayList(b)
        } else {
            return newArrayList(createNothing)
        }
    }

    private dispatch def List<Statement> translate(InstructionStatement stm) {
        return stm.instruction.translate
    }

    private dispatch def List<Statement> translate(Assignment asm) {
        val s = newArrayList
        if (termSig != null && asm.valuedObject == termSig.key) {
            s.add(createEmit => [
                signal = termSig.value
            ])
        } else if (asm.expression instanceof FunctionCall) {
            s.add(asm.translateSSA)
        } else if (asm.expression instanceof OperatorExpression) {
            val oe = asm.expression as OperatorExpression
            val e0 = oe.subExpressions.get(0)
            val e1 = if (oe.subExpressions.size > 1) {oe.subExpressions.get(1)}
            val voA = asm.valuedObject
            if (oe.operator == de.cau.cs.kieler.core.kexpressions.OperatorType.NOT) {
                val p = createPresent => [
                    body = createPresentEventBody => [
                        if (voPSigMap.containsKey((e0 as ValuedObjectReference).valuedObject)) {
                            event = createPresentEvent => [
                                expression = (e0 as ValuedObjectReference).signalReference(true)
                            ]
                            thenPart = createThenPart => [
                                statement = createSequence => [
                                    if (voPSigMap.containsKey(voA)) {
                                        list.add(
                                            createEmit => [
                                                signal = voPSigMap.get(voA)
                                            ]
                                        )
                                    }
                                    list.add(
                                        createPresent => [
                                            body = createPresentEventBody => [
                                                event = createPresentEvent => [
                                                    expression = createOperatorExpression => [
                                                        operator = OperatorType.NOT
                                                        subExpressions.add(oe.subExpressions.filter(ValuedObjectReference).head.signalReference(false))
                                                    ]
                                                ]
                                                thenPart = createThenPart => [
                                                    statement = createEmit => [
                                                        signal = voSigMap.get(voA)
                                                    ]
                                                ]
                                            ]
                                        ]
                                    )
                                ]
                                if (!voPSigMap.containsKey(voA)) {
                                    statement = (statement as Sequence).list.get(0)
                                }
                            ]
                        } else {
                            if (voPSigMap.containsKey(voA)) {
                                s.add(
                                    createEmit => [
                                        signal = voPSigMap.get(voA)
                                    ]
                                )
                            }
                            event = createPresentEvent => [
                                expression = createOperatorExpression => [
                                    operator = OperatorType.NOT
                                    subExpressions.add((e0 as ValuedObjectReference).signalReference(false))
                                ]
                            ]
                            thenPart = createThenPart => [
                                statement = createEmit => [
                                    signal = voSigMap.get(asm.valuedObject)
                                ]
                            ]
                        }
                    ]
                ]
                s.add(p)
            } else if (oe.operator == de.cau.cs.kieler.core.kexpressions.OperatorType.EQ) {
                if ((e0 instanceof ValuedObjectReference && !voPSigMap.containsKey((e0 as ValuedObjectReference).valuedObject)) || e1 instanceof ValuedObjectReference && !voPSigMap.containsKey((e1 as ValuedObjectReference).valuedObject)) {
                    throw new UnsupportedOperationException("Equals test on inputs not yet supported")
                }
                switch (oe.subExpressions.filter(ValuedObjectReference).size) {
                    case 2: s.add(createPresent => [
                        body = createPresentEventBody => [
                            event = createPresentEvent => [
                                expression = createOperatorExpression => [
                                    operator = OperatorType.AND
                                    subExpressions.add((e0 as ValuedObjectReference).signalReference(true))
                                    subExpressions.add((e1 as ValuedObjectReference).signalReference(true))
                                ]
                            ]
                            thenPart = createThenPart => [
                                statement = createSequence => [
                                    if (voPSigMap.containsKey(voA)) {
                                        list.add(
                                            createEmit => [
                                                signal = voPSigMap.get(voA)
                                            ]
                                        )
                                    }
                                    list.add(
                                        createPresent => [
                                            body = createPresentEventBody => [
                                                event = createPresentEvent => [
                                                    expression = createOperatorExpression => [
                                                        operator = OperatorType.OR
                                                        subExpressions.add(
                                                            createOperatorExpression => [
                                                                operator = OperatorType.AND
                                                                subExpressions.add((e0 as ValuedObjectReference).signalReference(false))
                                                                subExpressions.add((e1 as ValuedObjectReference).signalReference(false))
                                                            ]
                                                        )
                                                        subExpressions.add(
                                                            createOperatorExpression => [
                                                                operator = OperatorType.AND
                                                                subExpressions.add(
                                                                    createOperatorExpression => [
                                                                        operator = OperatorType.NOT
                                                                        subExpressions.add((e0 as ValuedObjectReference).signalReference(false))
                                                                    ]
                                                                )
                                                                subExpressions.add(
                                                                    createOperatorExpression => [
                                                                        operator = OperatorType.NOT
                                                                        subExpressions.add((e1 as ValuedObjectReference).signalReference(false))
                                                                    ]
                                                                )
                                                            ]
                                                        )
                                                    ]
                                                ]
                                                thenPart = createThenPart => [
                                                    statement = createEmit => [
                                                        signal = voSigMap.get(asm.valuedObject)
                                                    ]
                                                ]
                                            ]
                                        ]
                                    )
                                ]
                                if (!voPSigMap.containsKey(voA)) {
                                    statement = (statement as Sequence).list.get(0)
                                }
                            ]
                        ]
                    ])
                case 1: {
                        val p = createPresent => [
                            body = createPresentEventBody => [
                                event = createPresentEvent => [
                                    expression = oe.subExpressions.filter(ValuedObjectReference).head.signalReference(true)
                                ]
                                thenPart = createThenPart => [
                                    statement = createSequence => [
                                        if (voPSigMap.containsKey(voA)) {
                                            list.add(
                                                createEmit => [
                                                    signal = voPSigMap.get(voA)
                                                ]
                                            )
                                        }
                                        list.add(
                                            createPresent => [
                                                body = createPresentEventBody => [
                                                    event = createPresentEvent => [
                                                        if (oe.subExpressions.filter(BoolValue).map[
                                                            value
                                                        ].head) {
                                                            expression = oe.subExpressions.filter(ValuedObjectReference).head.signalReference(false)
                                                        } else {
                                                            expression = createOperatorExpression => [
                                                                operator = OperatorType.NOT
                                                                subExpressions.add(oe.subExpressions.filter(ValuedObjectReference).head.signalReference(false))
                                                            ]
                                                        }
                                                    ]
                                                    thenPart = createThenPart => [
                                                        statement = createEmit => [
                                                            signal = voSigMap.get(asm.valuedObject)
                                                        ]
                                                    ]
                                                ]
                                            ]
                                        )
                                    ]
                                    if (!voPSigMap.containsKey(voA)) {
                                        statement = (statement as Sequence).list.get(0)
                                    }
                                ]
                            ]
                        ];
                        s.add(p)
                    }
                case 0: 
                    throw new UnsupportedOperationException("Constant evaluation not yet supported") 
               }             
            } else if (oe.operator == de.cau.cs.kieler.core.kexpressions.OperatorType.NE) {
                throw new UnsupportedOperationException("NotEqual not yet supported")
            } else {
                if ((e0 instanceof ValuedObjectReference && !voPSigMap.containsKey((e0 as ValuedObjectReference).valuedObject)) || e1 instanceof ValuedObjectReference && !voPSigMap.containsKey((e1 as ValuedObjectReference).valuedObject)) {
                    throw new UnsupportedOperationException("Operations on inputs not yet supported")
                }
                s.add(createPresent => [
                    body = createPresentEventBody => [
                        event = createPresentEvent => [
                            expression = createOperatorExpression => [
                                operator = OperatorType.AND
                                subExpressions.add((oe.subExpressions.get(0) as ValuedObjectReference).signalReference(true))
                                subExpressions.add((oe.subExpressions.get(1) as ValuedObjectReference).signalReference(true))
                            ]
                        ]
                        thenPart = createThenPart => [
                            statement = createSequence => [
                                if (voPSigMap.containsKey(voA)) {
                                    list.add(
                                        createEmit => [
                                            signal = voPSigMap.get(voA)
                                        ]
                                    )
                                }
                                list.add(
                                    createPresent => [
                                        body = createPresentEventBody => [
                                            event = createPresentEvent => [
                                                expression = createOperatorExpression => [
                                                    operator = oe.operator.translateOP
                                                    subExpressions.add((oe.subExpressions.get(0) as ValuedObjectReference).signalReference(false))
                                                    subExpressions.add((oe.subExpressions.get(1) as ValuedObjectReference).signalReference(false))
                                                ]
                                            ]
                                            thenPart = createThenPart => [
                                                statement = createEmit => [
                                                    signal = voSigMap.get(asm.valuedObject)
                                                ]
                                            ]
                                        ]
                                    ]
                                )
                            ]
                            if (!voPSigMap.containsKey(voA)) {
                                statement = (statement as Sequence).list.get(0)
                            }
                        ]
                    ]
                ])
            }
        } else if (asm.expression instanceof ValuedObjectReference) {
            val vor = asm.expression as ValuedObjectReference
            val voA = asm.valuedObject
            if (voPSigMap.containsKey(vor.valuedObject)) {
                s.add(createPresent => [
                    body = createPresentEventBody => [
                        event = createPresentEvent => [
                            expression = vor.signalReference(true)
                        ]
                        thenPart = createThenPart => [
                            statement = createSequence => [
                                if (voPSigMap.containsKey(voA)) {
                                    list.add(
                                        createEmit => [
                                            signal = voPSigMap.get(voA)
                                        ]
                                    )
                                }
                                list.add(
                                    createPresent => [
                                        body = createPresentEventBody => [
                                            event = createPresentEvent => [
                                                expression = vor.signalReference(false)
                                            ]
                                            thenPart = createThenPart => [
                                                statement = createEmit => [
                                                    signal = voSigMap.get(asm.valuedObject)
                                                ]
                                            ]
                                        ]
                                    ]
                                )
                            ]
                            if (!voPSigMap.containsKey(voA)) {
                                statement = (statement as Sequence).list.get(0)
                            }
                        ]
                    ]
                    elsePart = createElsePart => [
                        statement = createEmit => [
                            signal = error
                        ]
                    ]
                ])
             } else {
                if (voPSigMap.containsKey(voA)) {
                    s.add(
                        createEmit => [
                            signal = voPSigMap.get(voA)
                        ]
                    )
                }
                s.add(createPresent => [
                    body = createPresentEventBody => [
                        event = createPresentEvent => [
                            expression = vor.signalReference(false)
                        ]
                        thenPart = createThenPart => [
                            statement = createEmit => [
                                signal = voSigMap.get(asm.valuedObject)
                            ]
                        ]
                    ]
               ])
             }
        } else if (asm.expression instanceof BoolValue) {
            val asmExp = asm.expression as BoolValue
            val voA = asm.valuedObject
            if (asmExp.value) {
                if (voPSigMap.containsKey(voA)) {
                    s.add(
                        createEmit => [
                            signal = voPSigMap.get(voA)
                        ]
                    )
                }
                s.add(
                    createEmit => [
                        signal = voSigMap.get(voA)
                    ])
            } else if (voPSigMap.containsKey(voA)) {
                s.add(createEmit => [
                    signal = voPSigMap.get(voA)
                ])
            }
        }
        return s
    }

    private dispatch def List<Statement> translate(Conditional cond) {
        val s = newArrayList
        if (cond.expression instanceof OperatorExpression && cond.expression.eAllContents.filter(ValuedObjectReference).exists[valuedObject == termSig.key]) {
            s.add(errorPattern)
            s.add(createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = createOperatorExpression => [
                            operator = OperatorType.NOT
                            subExpressions += createValuedObjectReference => [
                                valuedObject = termSig.value
                            ]
                        ]
                    ]
                    thenPart = createThenPart => [
                        statement = createNothing // TODO Exit loop
                    ]
                ]
            ])
        } else if (cond.expression instanceof ValuedObjectReference) {
            val vor = cond.expression as ValuedObjectReference
            if (voPSigMap.containsKey(vor.valuedObject)) {
                s.add(createPresent => [
                    body = createPresentEventBody => [
                        event = createPresentEvent => [
                            expression = vor.signalReference(true)
                        ]
                        thenPart = createThenPart => [
                            statement = createPresent => [
                                body = createPresentEventBody => [
                                    event = createPresentEvent => [
                                        expression = vor.signalReference(false)
                                    ]
                                    if (!cond.statements.nullOrEmpty) {
                                        thenPart = createThenPart => [
                                            if (cond.statements.size == 1) {
                                                val t = cond.statements.head.translate
                                                if (t.size > 1) {
                                                    statement = createSequence => [
                                                        list.addAll(t)
                                                    ]
                                                } else {
                                                    statement = t.head
                                                }
                                            } else {
                                                statement = createSequence => [
                                                    cond.statements.translateAddTo(list)
    //                                                for (i : cond.statements.map[translate]){
    //                                                    list.addAll(i)
    //                                                }
                                                ]
                                            }
                                        ]
                                    }
                                ]
                                if (!cond.elseStatements.nullOrEmpty) {
                                    elsePart = createElsePart => [
                                        if (cond.elseStatements.size == 1) {
                                            val t = cond.elseStatements.head.translate
                                            if (t.size > 1) {
                                                statement = createSequence => [
                                                    list.addAll(t)
                                                ]
                                            } else {
                                                statement = t.head
                                            }
                                        } else {
                                            statement = createSequence => [
                                                cond.elseStatements.translateAddTo(list)
    //                                            for (i : cond.elseStatements.map[translate]) {
    //                                                list.addAll(i)
    //                                            }
                                            ]
                                        }
                                    ]
                                }
                            ]
                        ]
                    ]
                    elsePart = createElsePart => [
                        statement = createEmit => [
                            signal = error
                        ]
                    ]
                ])
            } else {
                s.add(createPresent => [
                    body = createPresentEventBody => [
                        event = createPresentEvent => [
                            expression = vor.signalReference(false)
                        ]
                        if (!cond.statements.nullOrEmpty) {
                            thenPart = createThenPart => [
                                if (cond.statements.size == 1) {
                                    val t = cond.statements.head.translate
                                    if (t.size > 1) {
                                        statement = createSequence => [
                                            list.addAll(t)
                                        ]
                                    } else {
                                        statement = t.head
                                    }
                                } else {
                                    statement = createSequence => [
                                        cond.statements.translateAddTo(list)
                                    ]
                                }
                            ]
                        }
                    ]
                    if (!cond.elseStatements.nullOrEmpty) {
                        elsePart = createElsePart => [
                            if (cond.elseStatements.size == 1) {
                                val t = cond.elseStatements.head.translate
                                if (t.size > 1) {
                                    statement = createSequence => [
                                        list.addAll(t)
                                    ]
                                } else {
                                    statement = t.head
                                }
                            } else {
                                statement = createSequence => [
                                    cond.elseStatements.translateAddTo(list)
                                ]
                            }
                        ]
                    }
                ])
            }
        } else {
            throw new UnsupportedOperationException("Unhandled Conditional Expression")
        }
        return s
    }
    
    private dispatch def List<Statement> translate(Parallel fork) {
        val b = createBlock => [
            statement = createParallel => [
                for (th : fork.threads) {
                    if (th.statements.size == 1) {
                        val t = th.statements.head.translate
                        if (t.size > 1) {
                            list += createSequence => [
                                list.addAll(t)
                            ]
                        } else {
                            list += t.head
                        }
                    } else {
                        list += createSequence => [
                             th.statements.translateAddTo(list)
                        ]
                    }
                }
            ]
        ]
        return newArrayList(b)
    }

    private dispatch def List<Statement> translate(Goto goto) {
//        val exit = createExit => [
//            trap = trapSigMap.get(goto.targetLabel)
//        ]
//        return newArrayList(exit)
            return newArrayList(createNothing)
    }

    private dispatch def List<Statement> translate(Pause pause) {
        return newArrayList(createPause)
    }
    
    
    private def Statement translateSSA(Assignment asm) {
        val fc = asm.expression as FunctionCall
        if (fc.functionName == SEQ.symbol) {
            val voA = asm.valuedObject
            val e = fc.parameters.get(0).expression
            val isRegisterRead = e instanceof OperatorExpression && (e as OperatorExpression).operator == de.cau.cs.kieler.core.kexpressions.OperatorType.PRE
            val v1 = fc.parameters.get(1).expression as ValuedObjectReference
            return createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = v1.signalReference(true)
                    ]
                    thenPart = createThenPart => [
                        statement = createSequence => [
                            if (voPSigMap.containsKey(voA)) {
                                list.add(
                                    createEmit => [
                                        signal = voPSigMap.get(voA)
                                    ]
                                )
                            }
                            list.add(
                                createPresent => [
                                    body = createPresentEventBody => [
                                        event = createPresentEvent => [
                                            expression = v1.signalReference(false)
                                        ]
                                        thenPart = createThenPart => [
                                            statement = createEmit => [
                                                signal = voSigMap.get(asm.valuedObject)
                                            ]
                                        ]
                                    ]
                                ]
                            )
                        ]
                        if (!voPSigMap.containsKey(voA)) {
                            statement = (statement as Sequence).list.get(0)
                        }
                    ]
                ]
                if (isRegisterRead) {
                    val v0 = (e as OperatorExpression).subExpressions.head as ValuedObjectReference
                    elsePart = createElsePart => [
                        statement = createPresent => [
                            body = createPresentEventBody => [
                                event = createPresentEvent => [
                                    expression = createOperatorExpression => [
                                        operator = OperatorType.PRE
                                        subExpressions += v0.signalReference(true)
                                    ]
                                ]
                                thenPart = createThenPart => [
                                    statement = createSequence => [
                                        if (voPSigMap.containsKey(voA)) {
                                            list.add(
                                                createEmit => [
                                                    signal = voPSigMap.get(voA)
                                                ]
                                            )
                                        }
                                        list.add(
                                            createPresent => [
                                                body = createPresentEventBody => [
                                                    event = createPresentEvent => [
                                                        expression = createOperatorExpression => [
                                                            operator = OperatorType.PRE
                                                            subExpressions += v0.signalReference(false)
                                                        ]
                                                    ]
                                                    thenPart = createThenPart => [
                                                        statement = createEmit => [
                                                            signal = voSigMap.get(asm.valuedObject)
                                                        ]
                                                    ]
                                                ]
                                            ]
                                        )
                                    ]
                                    if (!voPSigMap.containsKey(voA)) {
                                        statement = (statement as Sequence).list.get(0)
                                    }
                                ]
                            ]
                        ]
                    ]
                } else if (voPSigMap.containsKey((e as ValuedObjectReference).valuedObject)) {
                    val v0 = e as ValuedObjectReference
                    elsePart = createElsePart => [
                        statement = createPresent => [
                            body = createPresentEventBody => [
                                event = createPresentEvent => [
                                    expression = v0.signalReference(true)
                                ]
                                thenPart = createThenPart => [
                                    statement = createSequence => [
                                        if (voPSigMap.containsKey(voA)) {
                                            list.add(
                                                createEmit => [
                                                    signal = voPSigMap.get(voA)
                                                ]
                                            )
                                        }
                                        list.add(
                                            createPresent => [
                                                body = createPresentEventBody => [
                                                    event = createPresentEvent => [
                                                        expression = v0.signalReference(false)
                                                    ]
                                                    thenPart = createThenPart => [
                                                        statement = createEmit => [
                                                            signal = voSigMap.get(asm.valuedObject)
                                                        ]
                                                    ]
                                                ]
                                            ]
                                        )
                                    ]
                                    if (!voPSigMap.containsKey(voA)) {
                                        statement = (statement as Sequence).list.get(0)
                                    }
                                ]
                            ]
                        ]
                    ]
                } else { // Read input
                    val v0 = e as ValuedObjectReference
                    elsePart = createElsePart => [
                        statement = createSequence => [
                            if (voPSigMap.containsKey(voA)) {
                                list.add(
                                    createEmit => [
                                        signal = voPSigMap.get(voA)
                                    ]
                                )
                            }
                            list.add(
                                createPresent => [
                                    body = createPresentEventBody => [
                                        event = createPresentEvent => [
                                            expression = v0.signalReference(false)
                                        ]
                                        thenPart = createThenPart => [
                                            statement = createEmit => [
                                                signal = voSigMap.get(asm.valuedObject)
                                            ]
                                        ]
                                    ]
                                ]
                            )
                        ]
                        if (!voPSigMap.containsKey(voA)) {
                            statement = (statement as Sequence).list.get(0)
                        }
                    ]
                }
            ]
        } else if (fc.functionName == CONC.symbol) {
            val v0 = fc.parameters.get(0).expression as ValuedObjectReference
            val v1 = fc.parameters.get(1).expression as ValuedObjectReference
            return createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = createOperatorExpression => [
                            operator = OperatorType.AND
                            subExpressions.add(v0.signalReference(true))
                            subExpressions.add(v1.signalReference(true))
                        ]
                    ]
                    thenPart = createThenPart => [
                        statement = createPresent => [
                            body = createPresentEventBody => [
                                event = createPresentEvent => [
                                    expression = createOperatorExpression => [
                                        operator = OperatorType.OR
                                        subExpressions.add(
                                            createOperatorExpression => [
                                                operator = OperatorType.AND
                                                subExpressions.add(
                                                    createOperatorExpression => [
                                                        operator = OperatorType.NOT
                                                        subExpressions.add(v0.signalReference(false))
                                                    ]
                                                )
                                                subExpressions.add(v1.signalReference(false))
                                            ]
                                        )
                                        subExpressions.add(
                                            createOperatorExpression => [
                                                operator = OperatorType.AND
                                                subExpressions.add(v0.signalReference(false))
                                                subExpressions.add(
                                                    createOperatorExpression => [
                                                        operator = OperatorType.NOT
                                                        subExpressions.add(v1.signalReference(false))
                                                    ]
                                                )
                                            ]
                                        )
                                    ]
                                ]
                                thenPart = createThenPart => [
                                    statement = createEmit => [
                                        signal = error
                                    ]
                                ]
                            ]
                            elsePart = createElsePart => [
                                statement = createSequence => [
                                    list.add(
                                        createEmit => [
                                            signal = voPSigMap.get(asm.valuedObject)
                                        ]
                                    )
                                    list.add(
                                        createPresent => [
                                            body = createPresentEventBody => [
                                                event = createPresentEvent => [
                                                    expression = v0.signalReference(true)
                                                ]
                                                thenPart = createThenPart => [
                                                    statement = createEmit => [
                                                        signal = voSigMap.get(asm.valuedObject)
                                                    ]
                                                ]
                                            ]
                                        ]
                                    )
                                ]
                            ]
                        ]
                    ]
                ]
                elsePart = createElsePart => [
                    statement = createPresent => [
                        body = createPresentEventBody => [
                            event = createPresentEvent => [
                                expression = createOperatorExpression => [
                                    operator = OperatorType.OR
                                    subExpressions.add(v0.signalReference(true))
                                    subExpressions.add(v1.signalReference(true))
                                ]
                            ]
                            thenPart = createThenPart => [
                                statement = createSequence => [
                                    list.add(
                                        createEmit => [
                                            signal = voPSigMap.get(asm.valuedObject)
                                        ]
                                    )
                                    list.add(
                                        createPresent => [
                                            body = createPresentEventBody => [
                                                event = createPresentEvent => [
                                                    expression = createOperatorExpression => [
                                                        operator = OperatorType.OR
                                                        subExpressions.add(v0.signalReference(false))
                                                        subExpressions.add(v1.signalReference(false))
                                                    ]
                                                ]
                                                thenPart = createThenPart => [
                                                    statement = createEmit => [
                                                        signal = voSigMap.get(asm.valuedObject)
                                                    ]
                                                ]
                                            ]
                                        ]
                                    )
                                ]
                            ]
                        ]
                    ]
                ]
            ]
        } else if (fc.functionName == COMBINE.symbol) {
            val voA = asm.valuedObject
            val op = (fc.parameters.get(0).expression as StringValue).value
            val e = fc.parameters.get(1).expression
            val isRegisterRead = e instanceof OperatorExpression && (e as OperatorExpression).operator == de.cau.cs.kieler.core.kexpressions.OperatorType.PRE
            val up = fc.parameters.get(2).expression as ValuedObjectReference
            if (isRegisterRead) {
                val read = (e as OperatorExpression).subExpressions.head as ValuedObjectReference
                return createPresent => [
                    body = createPresentEventBody => [
                        event = createPresentEvent => [
                            expression =  createOperatorExpression => [
                                operator = OperatorType.PRE
                                subExpressions += read.signalReference(true)
                            ]
                        ]
                        thenPart = createThenPart => [
                            statement = createSequence => [
                                if (voPSigMap.containsKey(voA)) {
                                    list.add(
                                        createEmit => [
                                            signal = voPSigMap.get(voA)
                                        ]
                                    )
                                }
                                list.add(
                                    createPresent => [
                                        body = createPresentEventBody => [
                                            event = createPresentEvent => [
                                                expression = up.signalReference(true)
                                            ]
                                            thenPart = createThenPart => [
                                                statement = createPresent => [
                                                    body = createPresentEventBody => [
                                                        event = createPresentEvent => [
                                                            expression = createOperatorExpression => [
                                                                operator = op.translateOP
                                                                subExpressions.add( createOperatorExpression => [
                                                                    operator = OperatorType.PRE
                                                                    subExpressions += read.signalReference(false)
                                                                ])
                                                                subExpressions.add(up.signalReference(false))
                                                            ]
                                                        ]
                                                        thenPart = createThenPart => [
                                                            statement = createEmit => [
                                                                signal = voSigMap.get(asm.valuedObject)
                                                            ]
                                                        ]
                                                    ]
                                                    elsePart = createElsePart => [
                                                        statement = createPresent => [
                                                            body = createPresentEventBody => [
                                                                event = createPresentEvent => [
                                                                    expression = read.signalReference(false)
                                                                ]
                                                                thenPart = createThenPart => [
                                                                    statement = createEmit => [
                                                                        signal = voSigMap.get(asm.valuedObject)
                                                                    ]
                                                                ]
                                                            ]
                                                        ]
                                                    ]
                                                ]
                                            ]
                                        ]
                                    ]
                                )
                            ]
                            if (!voPSigMap.containsKey(voA)) {
                                statement = (statement as Sequence).list.get(0)
                            }
                        ]
                    ]
                    elsePart = createElsePart => [
                        statement = createPresent => [
                            body = createPresentEventBody => [
                                event = createPresentEvent => [
                                    expression = up.signalReference(true)
                                ]
                                thenPart = createThenPart => [
                                    statement = createEmit => [
                                        signal = error
                                    ]
                                ]
                            ]
                        ]
                    ]
                ]
            } else {
                val read = e as ValuedObjectReference
                if (!voPSigMap.containsKey(read.valuedObject)) {
                    val s = createSequence => [
                        if (voPSigMap.containsKey(voA)) {
                            list.add(
                                createEmit => [
                                    signal = voPSigMap.get(voA)
                                ]
                            )
                        }
                        list.add(
                            createPresent => [
                                body = createPresentEventBody => [
                                    event = createPresentEvent => [
                                        expression = up.signalReference(true)
                                    ]
                                    thenPart = createThenPart => [
                                        statement = createPresent => [
                                            body = createPresentEventBody => [
                                                event = createPresentEvent => [
                                                    expression = createOperatorExpression => [
                                                        operator = op.translateOP
                                                        subExpressions.add(read.signalReference(false))
                                                        subExpressions.add(up.signalReference(false))
                                                    ]
                                                ]
                                                thenPart = createThenPart => [
                                                    statement = createEmit => [
                                                        signal = voSigMap.get(asm.valuedObject)
                                                    ]
                                                ]
                                            ]
                                            elsePart = createElsePart => [
                                                statement = createPresent => [
                                                    body = createPresentEventBody => [
                                                        event = createPresentEvent => [
                                                            expression = read.signalReference(false)
                                                        ]
                                                        thenPart = createThenPart => [
                                                            statement = createEmit => [
                                                                signal = voSigMap.get(asm.valuedObject)
                                                            ]
                                                        ]
                                                    ]
                                                ]
                                            ]
                                        ]
                                    ]
                                ]
                            ]
                        )
                    ]
                    if (!voPSigMap.containsKey(voA)) {
                        return (s as Sequence).list.get(0)
                    }else {
                        return s
                    }
                } else {
                    return createPresent => [
                        body = createPresentEventBody => [
                            event = createPresentEvent => [
                                expression = read.signalReference(true)
                            ]
                            thenPart = createThenPart => [
                                statement = createSequence => [
                                    if (voPSigMap.containsKey(voA)) {
                                        list.add(
                                            createEmit => [
                                                signal = voPSigMap.get(voA)
                                            ]
                                        )
                                    }
                                    list.add(
                                        createPresent => [
                                            body = createPresentEventBody => [
                                                event = createPresentEvent => [
                                                    expression = up.signalReference(true)
                                                ]
                                                thenPart = createThenPart => [
                                                    statement = createPresent => [
                                                        body = createPresentEventBody => [
                                                            event = createPresentEvent => [
                                                                expression = createOperatorExpression => [
                                                                    operator = op.translateOP
                                                                    subExpressions.add(read.signalReference(false))
                                                                    subExpressions.add(up.signalReference(false))
                                                                ]
                                                            ]
                                                            thenPart = createThenPart => [
                                                                statement = createEmit => [
                                                                    signal = voSigMap.get(asm.valuedObject)
                                                                ]
                                                            ]
                                                        ]
                                                        elsePart = createElsePart => [
                                                            statement = createPresent => [
                                                                body = createPresentEventBody => [
                                                                    event = createPresentEvent => [
                                                                        expression = read.signalReference(false)
                                                                    ]
                                                                    thenPart = createThenPart => [
                                                                        statement = createEmit => [
                                                                            signal = voSigMap.get(asm.valuedObject)
                                                                        ]
                                                                    ]
                                                                ]
                                                            ]
                                                        ]
                                                    ]
                                                ]
                                            ]
                                        ]
                                    )
                                ]
                                if (!voPSigMap.containsKey(voA)) {
                                    statement = (statement as Sequence).list.get(0)
                                }
                            ]
                        ]
                        elsePart = createElsePart => [
                            statement = createPresent => [
                                body = createPresentEventBody => [
                                    event = createPresentEvent => [
                                        expression = up.signalReference(true)
                                    ]
                                    thenPart = createThenPart => [
                                        statement = createEmit => [
                                            signal = error
                                        ]
                                    ]
                                ]
                            ]
                        ]
                    ]
                }
            }
        }
    }
    
    private def Statement errorPattern() {
        return createLocalSignalDecl => [
            optEnd = "signal"
            val help = createISignal => [
                name = "errorhelper"
            ]
            val sigs = createLocalSignal => [
                signal += help
            ]
            signalList = sigs
            statement = createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = createValuedObjectReference => [
                            valuedObject = error
                        ]
                    ]
                    thenPart = createThenPart => [
                        statement = createPresent => [
                            body = createPresentEventBody => [
                                event = createPresentEvent => [
                                    expression = createValuedObjectReference => [
                                        valuedObject = help
                                    ]
                                ]
                            ]
                            elsePart = createElsePart => [
                                statement = createEmit => [
                                    signal = help
                                ]
                            ]
                        ]
                    ]
                ]
            ]
        ]
    }
    

    private def dispatch OperatorType translateOP(String t) {
        var match = OperatorType.getByName(t)
        if (match == null) {
           match = de.cau.cs.kieler.core.kexpressions.OperatorType.getByName(t).translateOP
        }
        if (match == null) {
           throw new IllegalArgumentException("Illegal Operator: "+t)
        }
        return match
    }   
    
    private def dispatch OperatorType translateOP(de.cau.cs.kieler.core.kexpressions.OperatorType t) {
        return switch (t) {
//            case EQ: OperatorType.EQ
//            case LT: 
//            case LEQ: 
//            case GT:
//            case GEQ:
            case NOT: OperatorType.NOT
//            case VAL:
            case PRE: OperatorType.PRE
//            case NE:  OperatorType.NE
            case LOGICAL_AND: OperatorType.AND
            case LOGICAL_OR: OperatorType.OR
//            case ADD: OperatorType.ADD
//            case SUB:
//            case MULT:
//            case DIV:
//            case MOD:
            case BITWISE_OR: OperatorType.AND
            case BITWISE_AND: OperatorType.OR
//            case POSTFIX_ADD:
//            case POSTFIX_SUB:
            default: throw new IllegalArgumentException("Illegal Operator: "+t.getName)
        }
    } 
    
    private def Expression signalReference(ValuedObjectReference ref, boolean presentSignal) {
        return createValuedObjectReference => [
            if (presentSignal) {
                valuedObject = voPSigMap.get(ref.valuedObject)
            }else {
                valuedObject = voSigMap.get(ref.valuedObject)
            }
        ]
    }
    
    def void translateAddTo(EList<de.cau.cs.kieler.scl.scl.Statement> stms, EList<Statement> list) {
        for (s : stms) {
            val l = s.translate
            for (i : l) {
                if (i instanceof Sequence) {
                    list.addAll(i.list)
                } else {
                    list.add(i)
                }
            }
        }
    }
    
}
