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

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.Statement
import de.cau.cs.kieler.esterel.esterel.StatementContainer
import de.cau.cs.kieler.esterel.esterel.TrapDecl
import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.esterel.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.ssc.features.DualRailFeature
import de.cau.cs.kieler.scg.ssc.features.SSAEstFeature
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.SCLProgram
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.EList

import static com.google.common.collect.Lists.*

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
        return newHashSet(DualRailFeature.ID)
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
    val Map<Label, TrapDecl> labelsMap = newHashMap
    var Pair<ValuedObject, ISignal> error
    var Pair<ValuedObject, ISignal> term
    
    def Program transform(SCLProgram scl, KielerCompilerContext context) {
        voSigMap.clear
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
        for (decl : scl.declarations.filter[!(input || output) && type == ValueType.BOOL]) {
            val sigDecl = createLocalSignalDecl
            sigDecl.optEnd = "signal"
            val sigs = createLocalSignal
            sigDecl.signalList = sigs
            for (vo : decl.valuedObjects) {
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
        val ssaVOs = scl.declarations.findFirst[type == ValueType.PURE]
        val ssaSigDecl = createLocalSignalDecl
        ssaSigDecl.optEnd = "signal"
        val sigs = createLocalSignal
        term = null
        error = null
        for (vo : ssaVOs.valuedObjects) {
            sigs.signal += createISignal => [
                if (vo.name.contains("term")) {
                    term = new Pair(vo, it)
                } else if (vo.name.contains("error")) {
                    error = new Pair(vo, it)
                }
                voSigMap.put(vo, it)
                name = vo.name
            ]
        }
        ssaSigDecl.signalList = sigs
        if (signalNestingHead == null) {
            body.statements += ssaSigDecl
        } else {
            signalNestingHead.statement = ssaSigDecl
        }
        signalNestingHead = ssaSigDecl
        
        if (term != null) {
            signalNestingHead.statement = scl.statements.head.translate
        } else {
            // Parallel error thread
            signalNestingHead.statement = createBlock => [
                statement = createParallel => [
                    if (scl.statements.size > 1) {
                        list += createSequence => [
                            scl.statements.translateStatements(list)
                        ]
                    } else {
                        list += scl.statements.head.translate
                    }
                    list += errorPattern
                ]
            ]
            
        }

        return prog
    }

    private dispatch def Statement translate(Label label) {
        throw new IllegalArgumentException("Failed to translate label: " + label.name)
    }

    private dispatch def Statement translate(Assignment asm) {
        val vo = asm.valuedObject
        if (voSigMap.containsKey(vo)) {
            return createEmit => [
                signal = voSigMap.get(vo)
            ]
        } else {
            throw new IllegalArgumentException("No signal with name " + vo.name)
        }
    }

    private dispatch def Statement translate(Conditional cond) {
        if (!cond.statements.nullOrEmpty || !cond.^else.statements.nullOrEmpty) {
            return createPresent => [
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = cond.expression.translateExpression
                    ]
                    if (!cond.statements.nullOrEmpty) {
                        thenPart = createThenPart => [
                            statement = cond.statements.translateStatements
                        ]
                    }
                ]
                if (!cond.^else.statements.nullOrEmpty) {
                    elsePart = createElsePart => [
                        statement = cond.^else.statements.translateStatements
                    ]
                }
            ]
        } else {
            return createNothing
        }
    }
    
    private dispatch def Statement translate(Parallel fork) {
        return createBlock => [
            statement = createParallel => [
                for (th : fork.threads) {
                    if (term != null && th.statements.filter(Conditional).map[expression].filter(ValuedObjectReference).exists[valuedObject == term.key]) {
                        list.add(translatePreseverThread(th.statements))
                    } else {
                        list += th.statements.translateStatements
                    }
                }
            ]
        ]
    }
    
    private dispatch def Statement translate(Goto goto) {
        return createExit => [
            trap = goto.target.trapSignal
        ]
    }

    private dispatch def Statement translate(Pause pause) {
        return createPause
    }
        
    private def translatePreseverThread(EList<de.cau.cs.kieler.scl.scl.Statement> stms) {
        val preserver = stms
        val trap = createTrapDecl => [
            name = "PauseLoop";
        ]
//        return createPresent => [
//            body = createPresentEventBody => [
//                event = createPresentEvent => [
//                    expression = createValuedObjectReference => [
//                        valuedObject = termSig.value
//                    ]
//                ]
//                thenPart = createThenPart => [
//                    statement = createSequence => [
//                        list.add(errorPattern)
//                        preserver.translateStatements(list)
//                    ]
//                ]
//            ]
//            elsePart = createElsePart => [
//                statement = createTrap => [
                  return createTrap => [
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
                                                valuedObject = term.value
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
//            ]
//        ]
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
        val labels = <Label, Integer>newHashMap()
        val gotos = HashMultimap.<Label, Integer>create
        // Find labels and references
        for (stmIdx : stms.indexed) {
            val stm = stmIdx.value
            if (stm instanceof Label) {
                labels.put(stm, stmIdx.key)
            } else {
                stm.eAllContents.filter(Goto).forEach[gotos.put(it.target, stmIdx.key)]
            }
        }
        val nestingHead = newLinkedList
        for (stmIdx : stms.indexed) {
            val stm = stmIdx.value
            val idx = stmIdx.key
            if (labels.containsValue(idx)) {
                val label = stm as Label
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
                    translated.add(translatedStm)
                } else {
                    val seq = nestingHead.peek.key
                    seq.list.add(seq.list.size -1 ,translatedStm)
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
                            valuedObject = error.value
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
    
    private def dispatch Expression translateExpression(ValuedObjectReference expression) {
        if (voSigMap.containsKey(expression.valuedObject)) {
            return createValuedObjectReference => [
                valuedObject = voSigMap.get(expression.valuedObject)
            ]
        } else {
            throw new IllegalArgumentException("No signal for valued object "+expression.valuedObject.name)
        }
    }
    
    private def dispatch Expression translateExpression(OperatorExpression expression) {
        return createOperatorExpression => [
            operator = expression.operator.translateOP
            for (subexp : expression.subExpressions) {
                subExpressions.add(subexp.translateExpression)
            }
        ]
    }
    
    private def dispatch Expression translateExpression(Expression expression) {
        throw new UnsupportedOperationException("Unsupported expression: "+expression)
    }
    
    private def dispatch OperatorType translateOP(StringValue s) {
        return s.value.translateOP
    }
    
    private def dispatch OperatorType translateOP(String t) {
        var match = OperatorType.getByName(t)
        if (match == null) {
           match = de.cau.cs.kieler.kexpressions.OperatorType.getByName(t).translateOP
        }
        if (match == null) {
           throw new IllegalArgumentException("Illegal Operator: "+t)
        }
        return match
    }   
    
    private def dispatch OperatorType translateOP(de.cau.cs.kieler.kexpressions.OperatorType t) {
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
    
    private def TrapDecl getTrapSignal(Label label) {
        if (!labelsMap.containsKey(label)) {
            labelsMap.put(label, createTrapDecl => [name = label.name])
        }
        return labelsMap.get(label)
    }
}
