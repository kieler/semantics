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
import java.util.LinkedList
import com.google.common.collect.Table
import com.google.common.collect.HashMultimap

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
    
    val Map<ValuedObject, ISignal> voSigMap = newHashMap
    val Map<ValuedObject, ISignal> voPSigMap = newHashMap
    val Map<String, TrapDecl> labelsMap = newHashMap
    var ISignal error
    var Pair<ValuedObject, ISignal> termSig
    
    def Program transform(SCLProgram scl, KielerCompilerContext context) {
        voSigMap.clear
        voPSigMap.clear
        labelsMap.clear
        val prog = createProgram

        val module = createModule
        prog.modules += module

        module.name = scl.name
        module.end = "end module"

        val body = createModuleBody
        module.body = body
        
        // Translate IO
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
        
        // Local variables in nested signal declarations
        var StatementContainer signalNestingHead = null
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
            // Parallel error thread
            signalNestingHead.statement = createBlock => [
                statement = createParallel => [
                    if (scl.statements.size > 1) {
                        list += createSequence => [
                            scl.statements.translateStatements(list)
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
        throw new IllegalArgumentException("Failed to translate label: " + empty.label)
    }

    private dispatch def List<Statement> translate(InstructionStatement stm) {
        return stm.instruction.translate
    }

    private dispatch def List<Statement> translate(Assignment asm) {
        val s = newArrayList
        val vo = asm.valuedObject
        if (termSig != null && asm.valuedObject == termSig.key) {
            s.add(createEmit => [
                signal = termSig.value
            ])
        } else if (asm.expression instanceof BoolValue) {
            val asmExp = asm.expression as BoolValue
            if (asmExp.value) {
                if (voPSigMap.containsKey(vo)) {
                    s.add(
                        createEmit => [
                            signal = voPSigMap.get(vo)
                        ]
                    )
                }
                s.add(
                    createEmit => [
                        signal = voSigMap.get(vo)
                    ]
                )
            } else if (voPSigMap.containsKey(vo)) {
                s.add(
                    createEmit => [
                        signal = voPSigMap.get(vo)
                    ]
                )
            }
        } else {
            val errorExp = asm.expression.errorExpression
            val valueExp = asm.expression.valueExpression
            
            val emission = createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = valueExp
                    ]
                    thenPart = createThenPart => [
                        statement = createEmit => [
                            signal = voSigMap.get(vo)
                        ]
                    ]
                ]
            ]
            
            if (errorExp != null) {
                s.add(
                    createPresent => [
                        body = createPresentEventBody => [
                            event = createPresentEvent => [
                                expression = errorExp
                            ]
                            thenPart = createThenPart => [
                                statement = createEmit => [
                                    signal = error
                                ]
                            ]
                        ]
                        elsePart = createElsePart => [
                            statement = createSequence => [
                                if (voPSigMap.containsKey(vo)) {
                                    list.add(
                                        createEmit => [
                                            signal = voPSigMap.get(vo)
                                        ]
                                    )
                                }
                                list.add(emission)
                            ]
                            // Remove sequence if one-elemeted
                            if (!voPSigMap.containsKey(vo)) {
                                statement = (statement as Sequence).list.get(0)
                            }
                        ]
                    ]
                )
            } else {
                if (voPSigMap.containsKey(vo)) {
                    s.add(
                        createEmit => [
                            signal = voPSigMap.get(vo)
                        ]
                    )
                }
                s.add(emission)
            }
        }
        
        return s
    }

    private dispatch def List<Statement> translate(Conditional cond) {
        val s = newArrayList
        val errorExp = cond.expression.errorExpression
        val conditionExp = cond.expression.valueExpression
        
        val branches = createPresent => [
            body = createPresentEventBody => [
                event = createPresentEvent => [
                    expression = conditionExp
                ]
                if (!cond.statements.nullOrEmpty) {
                    thenPart = createThenPart => [
                        statement = cond.statements.translateStatements
                    ]
                }
            ]
            if (!cond.elseStatements.nullOrEmpty) {
                elsePart = createElsePart => [
                    statement = cond.elseStatements.translateStatements
                ]
            }
        ]
        
        if (errorExp != null) {
            s.add(
                createPresent => [
                    body = createPresentEventBody => [
                        event = createPresentEvent => [
                            expression = errorExp
                        ]
                        thenPart = createThenPart => [
                            if (cond.eAllContents.exists[it instanceof Pause]) {
                                statement = createSequence => [
                                    list.add(
                                        createEmit => [
                                            signal = error
                                        ]
                                    )                              
                                    list.add(createPause)
                                ]
                            } else {
                                statement = createEmit => [
                                    signal = error
                                ]
                            }
                        ]
                    ]
                    elsePart = createElsePart => [
                        statement = branches
                    ]
                ]
            )
        } else {
            s.add(branches)
        }

        return s
    }
    
    private dispatch def List<Statement> translate(Parallel fork) {
        val b = createBlock => [
            statement = createParallel => [
                for (th : fork.threads) {
                    if (termSig != null && th.statements.filter(InstructionStatement).map[instruction].filter(Conditional).map[expression].filter(ValuedObjectReference).exists[valuedObject == termSig.key]) {
                        list.add(translatePreseverThread(th.statements))
                    } else {
                        list += th.statements.translateStatements
                    }
                }
            ]
        ]
        return newArrayList(b)
    }
    
    private dispatch def List<Statement> translate(Goto goto) {
        val exit = createExit => [
            trap = goto.targetLabel.trapSignal
        ]
        return newArrayList(exit)
    }

    private dispatch def List<Statement> translate(Pause pause) {
        return newArrayList(createPause)
    }
        
    private def translatePreseverThread(EList<de.cau.cs.kieler.scl.scl.Statement> stms) {
        val preserver = stms
        val trap = createTrapDecl => [
            name = "PauseLoop";
        ]
        return createPresent => [
            body = createPresentEventBody => [
                event = createPresentEvent => [
                    expression = createValuedObjectReference => [
                        valuedObject = termSig.value
                    ]
                ]
                thenPart = createThenPart => [
                    statement = createSequence => [
                        list.add(errorPattern)
                        preserver.translateStatements(list)
                    ]
                ]
            ]
            elsePart = createElsePart => [
                statement = createTrap => [
                    trapDeclList = createTrapDeclList => [
                        trapDecls += trap
                    ]
                    optEnd = "trap"
                    statement = createLoop => [
                        body = createLoopBody => [
                            statement = createSequence => [
                                list.add(errorPattern)
                                preserver.translateStatements(list)
                                list.add(createPresent => [
                                    body = createPresentEventBody => [
                                        event = createPresentEvent => [
                                            expression = createValuedObjectReference => [
                                                valuedObject = termSig.value
                                            ]
                                        ]
                                        thenPart = createThenPart => [
                                            statement = createExit => [
                                                it.trap = trap
                                            ]
                                        ]
                                    ]
                                ])
                                list.add(createPause)
                            ]
                        ]
                        end1 = createEndLoop => [
                            endOpt = "loop"
                        ]
                    ]
                ]
            ]
        ]
    }
   
    private def void translateStatements(List<de.cau.cs.kieler.scl.scl.Statement> stms, EList<Statement> list) {
        val result = stms.translateStatements
        if (result instanceof Sequence) {
            list.addAll(result.list)
        } else {
            list.add(result)
        }
    }
    
    private def Statement translateStatements(List<de.cau.cs.kieler.scl.scl.Statement> stms) {
        val translated = <Statement>newArrayListWithCapacity(stms.size)
        val labels = <String, Integer>newHashMap()
        val gotos = HashMultimap.<String, Integer>create
        // Find labels and references
        for (stmIdx : stms.indexed) {
            val stm = stmIdx.value
            if (stm instanceof EmptyStatement) {
                if (!stm.label.nullOrEmpty) {
                    labels.put(stm.label, stmIdx.key)
                }
            } else {
                stm.eAllContents.filter(Goto).forEach[gotos.put(it.targetLabel, stmIdx.key)]
            }
        }
        val nestingHead = newLinkedList
        for (stmIdx : stms.indexed) {
            val stm = stmIdx.value
            val idx = stmIdx.key
            if (labels.containsValue(idx)) {
                val label = (stm as EmptyStatement).label
                val forward = gotos.get(label).forall[it < idx]
                val backward = gotos.get(label).forall[it > idx]
                
                if (forward && backward) {
                    throw new UnsupportedOperationException("Cannot handle forward and backward jump to the same label: " + label)
                } else if (!(forward || backward)) {
                    throw new IllegalArgumentException("Illegal jump structure for label: " + label)
                } else if (forward) {
                    if (nestingHead.empty) {
                        throw new UnsupportedOperationException("Cannot handle jump into loop structure with target label: " + label)
                    }
                    val trap = createTrap => [
                        trapDeclList = createTrapDeclList => [
                            trapDecls += label.trapSignal
                        ]
                        optEnd = "trap"
                        if (translated.size == 1) {
                            statement = translated.head
                        } else {
                            statement = createSequence => [
                                list.addAll(translated)
                            ]
                        }
                    ]
                    translated.clear
                    translated.add(trap)
                } else {
                    val loopTrapLabel = createTrapDecl => [
                        name = label + "Loop";
                    ]
                    val trap = createTrap
                    if (nestingHead.empty) {
                        translated.add(trap)
                    } else {
                        val seq = (nestingHead.peek as Pair<Sequence, Integer>).key
                        seq.list.add(seq.list.size -1, trap)
                    }
                    trap => [
                        trapDeclList = createTrapDeclList => [
                            trapDecls += label.trapSignal
                            trapDecls.head.name = trapDecls.head.name +"Exit"
                        ]
                        optEnd = "trap"
                        statement = createLoop => [
                            body = createLoopBody => [
                                statement = createTrap => [
                                    trapDeclList = createTrapDeclList => [
                                        trapDecls += loopTrapLabel
                                    ]
                                    optEnd = "trap"
                                    statement = createSequence => [
                                        nestingHead.push(new Pair(it, gotos.get(label).max))
                                        list.add(
                                            createExit => [
                                                trap = loopTrapLabel
                                            ]
                                        )
                                    ]
                                ]
                            ]
                            end1 = createEndLoop => [
                                endOpt = "loop"
                            ]
                        ]
                    ]
                }
            } else {
                val translatedStm = stm.translate
                if (nestingHead.empty) {
                    translated.addAll(translatedStm)
                } else {
                    val seq = nestingHead.peek.key
                    seq.list.addAll(seq.list.size -1 ,translatedStm)
                    if (idx >= nestingHead.peek.value) {
                        nestingHead.pop
                    }
                }
            }
        }
        if (translated.size > 1) {
            return createSequence => [
                list.addAll(translated)
            ]
        } else {
            return translated.head
        }
    }
    
    private def Expression getErrorExpression(de.cau.cs.kieler.core.kexpressions.Expression expression) {
        val presenceExp = expression.presenceExpression
        val conflictExp = expression.conflictExpression
        if (presenceExp != null && conflictExp != null) {
            return createOperatorExpression => [
                operator = OperatorType.OR
                subExpressions.add(conflictExp)
                subExpressions.add(
                    createOperatorExpression => [
                        operator = OperatorType.NOT
                        subExpressions.add(presenceExp)
                    ]
                )
            ]
        } else if (presenceExp != null) {
            return createOperatorExpression => [
                operator = OperatorType.NOT
                subExpressions.add(presenceExp)
            ]
        } else if (conflictExp != null) {
            return conflictExp
        } else {
            return null
        }
    }
    
    private def dispatch Expression getConflictExpression(ValuedObjectReference expression) {
        return null
    }
    
    private def dispatch Expression getConflictExpression(OperatorExpression expression) {
        val subconflict = createOperatorExpression => [
            operator = OperatorType.OR
            for (subexp : expression.subExpressions) {
                val csubexp = subexp.conflictExpression
                if (csubexp != null) {
                    subExpressions.add(csubexp)
                }
            }
        ]
        if (subconflict.subExpressions.empty) {
            return null
        } else {
            return subconflict
        }
    }
    
    private def dispatch Expression getConflictExpression(FunctionCall expression) {
        if (expression.functionName == CONC.symbol) {
            return createOperatorExpression => [
                operator = OperatorType.AND
                val p0 = expression.parameters.get(0).expression
                val p1 = expression.parameters.get(1).expression
                val p0presence = p0.presenceExpression
                if (p0presence != null) {subExpressions.add(p0presence)}
                val p1presence = p1.presenceExpression
                if (p0presence != null) {subExpressions.add(p1presence)}
                subExpressions.add(
                    createOperatorExpression => [
                        operator = OperatorType.OR
                        subExpressions.add(
                            createOperatorExpression => [
                                operator = OperatorType.AND
                                subExpressions.add(p0.valueExpression)
                                subExpressions.add(
                                    createOperatorExpression => [
                                        operator = OperatorType.NOT
                                        subExpressions.add(p1.valueExpression)
                                    ]
                                )
                            ]
                        )
                        subExpressions.add(
                            createOperatorExpression => [
                                operator = OperatorType.AND
                                subExpressions.add(
                                    createOperatorExpression => [
                                        operator = OperatorType.NOT
                                        subExpressions.add(p0.valueExpression)
                                    ]
                                )
                                subExpressions.add(p1.valueExpression)
                            ]
                        )
                    ]
                )
            ]
        } else {
            val subconflict = createOperatorExpression => [
                operator = OperatorType.OR
                for (subexp : expression.parameters.map[expression]) {
                    val csubexp = subexp.conflictExpression
                    if (csubexp != null) {
                        subExpressions.add(csubexp)
                    }
                }
            ]
            if (subconflict.subExpressions.empty) {
                return null
            } else {
                return subconflict
            }
        }
    }
    
    private def dispatch Expression getConflictExpression(de.cau.cs.kieler.core.kexpressions.Expression expression) {
         return null
    }
    
    private def dispatch Expression getValueExpression(ValuedObjectReference expression) {
        return expression.signalReference(false)
    }
    
    private def dispatch Expression getValueExpression(OperatorExpression expression) {
        return createOperatorExpression => [
            operator = expression.operator.translateOP
            for (subexp : expression.subExpressions) {
                subExpressions.add(subexp.valueExpression)
            }
        ]
    }
        
    private def dispatch Expression getValueExpression(FunctionCall expression) {
        val p0 = expression.parameters.get(0).expression
        val p1 = expression.parameters.get(1).expression
        return switch (expression.functionName) {
            case SEQ.symbol:
                createOperatorExpression => [
                    operator = OperatorType.OR
                    subExpressions.add(
                        createOperatorExpression => [
                            operator = OperatorType.AND
                            subExpressions.add(
                                createOperatorExpression => [
                                    operator = OperatorType.NOT
                                    subExpressions.add(p1.presenceExpression)
                                ]
                            )
                            subExpressions.add(p0.valueExpression)
                        ]
                    )
                    subExpressions.add(
                        createOperatorExpression => [
                            operator = OperatorType.AND
                            subExpressions.add(p1.presenceExpression)
                            subExpressions.add(p1.valueExpression)
                        ]
                    )
                ]
            case CONC.symbol:
                createOperatorExpression => [
                    operator = OperatorType.OR
                    subExpressions.add(p0.valueExpression)
                    subExpressions.add(p1.valueExpression)
                ]
            case COMBINE.symbol: {
                val p2 = expression.parameters.get(2).expression;
                createOperatorExpression => [
                    operator = OperatorType.OR
                    val op = p0.translateOP
                    switch (op) {
                        case OR: {
                            subExpressions.add(p1.valueExpression)
                            subExpressions.add(
                                createOperatorExpression => [
                                    operator = OperatorType.AND
                                    subExpressions.add(p2.presenceExpression)
                                    subExpressions.add(p2.valueExpression)
                                ]
                            )
                        }
                        case AND: {
                            subExpressions.add(
                                createOperatorExpression => [
                                    operator = OperatorType.AND
                                    subExpressions.add(
                                        createOperatorExpression => [
                                            operator = OperatorType.NOT
                                            subExpressions.add(p2.presenceExpression)
                                        ]
                                    )
                                    subExpressions.add(p1.valueExpression)
                                ]
                            )
                            subExpressions.add(
                                createOperatorExpression => [
                                    operator = OperatorType.AND
                                    subExpressions.add(p2.presenceExpression)
                                    subExpressions.add(p2.valueExpression)
                                    subExpressions.add(p1.valueExpression)
                                ]
                            )
                        }
                    }
                ]
            }
            default:
                null
        }
    }
    
    private def dispatch Expression getValueExpression(de.cau.cs.kieler.core.kexpressions.Expression expression) {
         return null
    }
    
    private def dispatch Expression getPresenceExpression(ValuedObjectReference expression) {
        if (voPSigMap.containsKey(expression.valuedObject)) {
            return expression.signalReference(true)
        } else {
            return null
        }
    }
    
    private def dispatch Expression getPresenceExpression(OperatorExpression expression) {
        if (expression.subExpressions.size > 1) {
            val exp = createOperatorExpression => [
                operator = OperatorType.AND
                for (subexp : expression.subExpressions) {
                    val csubexp = subexp.presenceExpression
                    if (csubexp != null) {
                        subExpressions.add(csubexp)
                    }
                }
            ]
            if (exp.subExpressions.empty) {
                return null
            } else {
                return exp
            }
        } else {
            if (expression.operator == de.cau.cs.kieler.core.kexpressions.OperatorType.PRE) {
                return createOperatorExpression => [
                    operator = OperatorType.PRE
                    subExpressions.add(expression.subExpressions.head.presenceExpression)
                ]
            } else {
                return expression.subExpressions.head.presenceExpression
            }
        }
    }
    
    private def dispatch Expression getPresenceExpression(FunctionCall expression) {
        val p0 = expression.parameters.get(0).expression
        val p1 = expression.parameters.get(1).expression
        return switch (expression.functionName) {
            case SEQ.symbol:
                if (p0.alwaysPresent || p1.alwaysPresent) {
                    null
                } else {
                    createOperatorExpression => [
                        operator = OperatorType.OR
                        subExpressions.add(p0.presenceExpression)
                        subExpressions.add(p1.presenceExpression)
                    ]
                }
            case CONC.symbol:
                if (p0.alwaysPresent || p1.alwaysPresent) {
                    null
                } else {
                    createOperatorExpression => [
                        operator = OperatorType.OR
                        subExpressions.add(p0.presenceExpression)
                        subExpressions.add(p1.presenceExpression)
                    ]
                }
            case COMBINE.symbol:
                if (p1.alwaysPresent) {
                    null
                } else {
                    p1.presenceExpression
                }
            default:
                null
        }
    }
        
    private def dispatch Expression getPresenceExpression(de.cau.cs.kieler.core.kexpressions.Expression expression) {
         return null
    }
    
    private def boolean isAlwaysPresent(de.cau.cs.kieler.core.kexpressions.Expression expression) {
        if (expression instanceof ValuedObjectReference) {
            return !voPSigMap.containsKey(expression.valuedObject)
        } else {
            return expression.eAllContents.filter(ValuedObjectReference).exists[!voPSigMap.containsKey(it)]
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
    
    private def dispatch OperatorType translateOP(StringValue s) {
        return s.value.translateOP
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
                if (!voPSigMap.containsKey(ref.valuedObject)) {
                    throw new NullPointerException
                }
                valuedObject = voPSigMap.get(ref.valuedObject)
            }else {
                if (!voSigMap.containsKey(ref.valuedObject)) {
                    throw new NullPointerException
                }
                valuedObject = voSigMap.get(ref.valuedObject)
            }
        ]
    }

    private def TrapDecl getTrapSignal(String label) {
        if (!labelsMap.containsKey(label)) {
            labelsMap.put(label, createTrapDecl => [name = label])
        }
        return labelsMap.get(label)
    }
}
