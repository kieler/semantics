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
package de.cau.cs.kieler.esterel.processors.transformators.ssa

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.SCLFactory
import de.cau.cs.kieler.scl.SCLProgram
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.StatementContainer
import java.util.List
import java.util.Map

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSASCL2SSAEsterel extends Processor<SCLProgram, EsterelProgram> {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.esterel.processors.transformators.ssa.scl2esterel"
    }

    override getName() {
        return "SSA-SCL to Dual-Rail Esterel"
    }

    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val esterel = createEsterelProgram
        esterel.pragmas.addAll(model.pragmas.map[copy])
        esterel.modules.addAll(model.modules.map[transform])
        model = esterel
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
    @Inject
    extension KExpressionsDeclarationExtensions
    @Inject
    extension EsterelExtensions

    extension EsterelFactory = EsterelFactory::eINSTANCE
    extension SCLFactory = SCLFactory::eINSTANCE
    extension KExpressionsFactory = KExpressionsFactory::eINSTANCE

    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    
    val Map<ValuedObject, Signal> voSigMap = newHashMap
    val Map<Label, Trap> labelsMap = newHashMap
    var Pair<ValuedObject, Signal> error
    var Pair<ValuedObject, Signal> term
    
    def Module transform(Module scl) {
        voSigMap.clear
        labelsMap.clear
        
        val module = createModule

        module.name = scl.name

        // Translate IO
        if (scl.variableDeclarations.exists[input || output]) {
            for (decl : scl.variableDeclarations.filter[input || output]) {
                for (valObj : decl.valuedObjects) {
                    // Create the signal
                    val signal = createSignal => [
                        name = valObj.name
                    ]

                    if (decl.isOutput && decl.isInput) {
                        module.declarations += createInputOutputDeclaration => [
                            valuedObjects += signal
                        ]
                    } else if (decl.isInput) {
                        module.declarations += createInputDeclaration => [
                            valuedObjects += signal
                        ]
                    } else if (decl.isOutput) {
                        module.declarations += createOutputDeclaration => [
                            valuedObjects += signal
                        ]
                    }
                    voSigMap.put(valObj, signal)
                }
            }
        }
        
        // Local variables in nested signal declarations
        var StatementContainer signalNestingHead = null
        for (decl : scl.variableDeclarations.filter[!(input || output) && type == ValueType.BOOL]) {
            val sigDecl = createLocalSignalDeclaration
            for (vo : decl.valuedObjects) {
                sigDecl.valuedObjects += createSignal => [
                    voSigMap.put(vo, it)
                    name = vo.name
                ]
            }
            if (signalNestingHead == null) {
                module.statements += sigDecl
            } else {
                signalNestingHead.statements += sigDecl
            }
            signalNestingHead = sigDecl
        }
        
        // error and term
        val ssaVOs = scl.declarations.findFirst[type == ValueType.PURE]
        val ssaSigDecl = createLocalSignalDeclaration
        term = null
        error = null
        for (vo : ssaVOs.valuedObjects) {
            ssaSigDecl.valuedObjects += createSignal => [
                if (vo.name.contains("term")) {
                    term = new Pair(vo, it)
                } else if (vo.name.contains("error")) {
                    error = new Pair(vo, it)
                }
                voSigMap.put(vo, it)
                name = vo.name
            ]
        }
        if (signalNestingHead == null) {
            module.statements += ssaSigDecl
        } else {
            signalNestingHead.statements += ssaSigDecl
        }
        signalNestingHead = ssaSigDecl
        
        if (term != null) {
            scl.statements.translateStatements(signalNestingHead)
        } else {
            // Parallel error thread
            signalNestingHead.statements += createEsterelParallel => [
                statements += createEsterelThread => [
                    scl.statements.translateStatements(it)
                ]
                statements += errorPattern
            ]
            
        }

        return module
    }

//    private dispatch def Statement translate(Label label) {
//        throw new IllegalArgumentException("Failed to translate label: " + label.name)
//    }
//
//    private dispatch def Statement translate(Assignment asm) {
//        val vo = asm.valuedObject
//        if (voSigMap.containsKey(vo)) {
//            return createEmit => [
//                signal = voSigMap.get(vo)
//            ]
//        } else {
//            throw new IllegalArgumentException("No signal with name " + vo.name)
//        }
//    }
//
//    private dispatch def Statement translate(Conditional cond) {
//        if (!cond.statements.nullOrEmpty || !cond.^else.statements.nullOrEmpty) {
//            return createPresent => [
//                body = createPresentEventBody => [
//                    event = createPresentEvent => [
//                        expression = cond.expression.translateExpression
//                    ]
//                    if (!cond.statements.nullOrEmpty) {
//                        thenPart = createThenPart => [
//                            statement = cond.statements.translateStatements
//                        ]
//                    }
//                ]
//                if (!cond.^else.statements.nullOrEmpty) {
//                    elsePart = createElsePart => [
//                        statement = cond.^else.statements.translateStatements
//                    ]
//                }
//            ]
//        } else {
//            return createNothing
//        }
//    }
//    
//    private dispatch def Statement translate(Parallel fork) {
//        return createBlock => [
//            statement = createParallel => [
//                for (th : fork.threads) {
//                    if (term != null && th.statements.filter(Conditional).map[expression].filter(ValuedObjectReference).exists[valuedObject == term.key]) {
//                        list.add(translatePreseverThread(th.statements))
//                    } else {
//                        list += th.statements.translateStatements
//                    }
//                }
//            ]
//        ]
//    }
//    
//    private dispatch def Statement translate(Goto goto) {
//        return createExit => [
//            trap = goto.target.trapSignal
//        ]
//    }
//
//    private dispatch def Statement translate(Pause pause) {
//        return createPause
//    }
//        
//    private def translatePreseverThread(EList<de.cau.cs.kieler.scl.scl.Statement> stms) {
//        val preserver = stms
//        val trap = createTrapDecl => [
//            name = "PauseLoop";
//        ]
////        return createPresent => [
////            body = createPresentEventBody => [
////                event = createPresentEvent => [
////                    expression = createValuedObjectReference => [
////                        valuedObject = termSig.value
////                    ]
////                ]
////                thenPart = createThenPart => [
////                    statement = createSequence => [
////                        list.add(errorPattern)
////                        preserver.translateStatements(list)
////                    ]
////                ]
////            ]
////            elsePart = createElsePart => [
////                statement = createTrap => [
//                  return createTrap => [
//                    trapDeclList = createTrapDeclList => [
//                        trapDecls += trap
//                    ]
//                    optEnd = "trap"
//                    statement = createLoop => [
//                        body = createLoopBody => [
//                            statement = createSequence => [
//                                list.add(errorPattern)
//                                preserver.translateStatements(list)
//                                list.add(createPresent => [
//                                    body = createPresentEventBody => [
//                                        event = createPresentEvent => [
//                                            expression = createValuedObjectReference => [
//                                                valuedObject = term.value
//                                            ]
//                                        ]
//                                        thenPart = createThenPart => [
//                                            statement = createExit => [
//                                                it.trap = trap
//                                            ]
//                                        ]
//                                    ]
//                                ])
//                                list.add(createPause)
//                            ]
//                        ]
//                        end1 = createEndLoop => [
//                            endOpt = "loop"
//                        ]
//                    ]
//                ]
////            ]
////        ]
//    }
//   
//    private def void translateStatements(List<de.cau.cs.kieler.scl.scl.Statement> stms, EList<Statement> list) {
//        val result = stms.translateStatements
//        if (result instanceof Sequence) {
//            list.addAll(result.list)
//        } else {
//            list.add(result)
//        }
//    }
//    
//    private def Statement translateStatements(List<de.cau.cs.kieler.scl.scl.Statement> stms) {
//        val translated = <Statement>newArrayListWithCapacity(stms.size)
//        val labels = <Label, Integer>newHashMap()
//        val gotos = HashMultimap.<Label, Integer>create
//        // Find labels and references
//        for (stmIdx : stms.indexed) {
//            val stm = stmIdx.value
//            if (stm instanceof Label) {
//                labels.put(stm, stmIdx.key)
//            } else {
//                stm.eAllContents.filter(Goto).forEach[gotos.put(it.target, stmIdx.key)]
//            }
//        }
//        val nestingHead = newLinkedList
//        for (stmIdx : stms.indexed) {
//            val stm = stmIdx.value
//            val idx = stmIdx.key
//            if (labels.containsValue(idx)) {
//                val label = stm as Label
//                val forward = gotos.get(label).forall[it < idx]
//                val backward = gotos.get(label).forall[it > idx]
//                
//                if (forward && backward) {
//                    throw new UnsupportedOperationException("Cannot handle forward and backward jump to the same label: " + label)
//                } else if (!(forward || backward)) {
//                    throw new IllegalArgumentException("Illegal jump structure for label: " + label)
//                } else if (forward) {
//                    if (nestingHead.empty) {
//                        throw new UnsupportedOperationException("Cannot handle jump into loop structure with target label: " + label)
//                    }
//                    val trap = createTrap => [
//                        trapDeclList = createTrapDeclList => [
//                            trapDecls += label.trapSignal
//                        ]
//                        optEnd = "trap"
//                        if (translated.size == 1) {
//                            statement = translated.head
//                        } else {
//                            statement = createSequence => [
//                                list.addAll(translated)
//                            ]
//                        }
//                    ]
//                    translated.clear
//                    translated.add(trap)
//                } else {
//                    val loopTrapLabel = createTrapDecl => [
//                        name = label + "Loop";
//                    ]
//                    val trap = createTrap
//                    if (nestingHead.empty) {
//                        translated.add(trap)
//                    } else {
//                        val seq = (nestingHead.peek as Pair<Sequence, Integer>).key
//                        seq.list.add(seq.list.size -1, trap)
//                    }
//                    trap => [
//                        trapDeclList = createTrapDeclList => [
//                            trapDecls += label.trapSignal
//                            trapDecls.head.name = trapDecls.head.name +"Exit"
//                        ]
//                        optEnd = "trap"
//                        statement = createLoop => [
//                            body = createLoopBody => [
//                                statement = createTrap => [
//                                    trapDeclList = createTrapDeclList => [
//                                        trapDecls += loopTrapLabel
//                                    ]
//                                    optEnd = "trap"
//                                    statement = createSequence => [
//                                        nestingHead.push(new Pair(it, gotos.get(label).max))
//                                        list.add(
//                                            createExit => [
//                                                trap = loopTrapLabel
//                                            ]
//                                        )
//                                    ]
//                                ]
//                            ]
//                            end1 = createEndLoop => [
//                                endOpt = "loop"
//                            ]
//                        ]
//                    ]
//                }
//            } else {
//                val translatedStm = stm.translate
//                if (nestingHead.empty) {
//                    translated.add(translatedStm)
//                } else {
//                    val seq = nestingHead.peek.key
//                    seq.list.add(seq.list.size -1 ,translatedStm)
//                    if (idx >= nestingHead.peek.value) {
//                        nestingHead.pop
//                    }
//                }
//            }
//        }
//        if (translated.size > 1) {
//            return createSequence => [
//                list.addAll(translated)
//            ]
//        } else {
//            return translated.head
//        }
//    }
//   
//    private def Statement errorPattern() {
//        return createLocalSignalDecl => [
//            optEnd = "signal"
//            val help = createISignal => [
//                name = "errorhelper"
//            ]
//            val sigs = createLocalSignal => [
//                signal += help
//            ]
//            signalList = sigs
//            statement = createPresent => [
//                body = createPresentEventBody => [
//                    event = createPresentEvent => [
//                        expression = createValuedObjectReference => [
//                            valuedObject = error.value
//                        ]
//                    ]
//                    thenPart = createThenPart => [
//                        statement = createPresent => [
//                            body = createPresentEventBody => [
//                                event = createPresentEvent => [
//                                    expression = createValuedObjectReference => [
//                                        valuedObject = help
//                                    ]
//                                ]
//                            ]
//                            elsePart = createElsePart => [
//                                statement = createEmit => [
//                                    signal = help
//                                ]
//                            ]
//                        ]
//                    ]
//                ]
//            ]
//        ]
//    }
//    
//    private def dispatch Expression translateExpression(ValuedObjectReference expression) {
//        if (voSigMap.containsKey(expression.valuedObject)) {
//            return createValuedObjectReference => [
//                valuedObject = voSigMap.get(expression.valuedObject)
//            ]
//        } else {
//            throw new IllegalArgumentException("No signal for valued object "+expression.valuedObject.name)
//        }
//    }
//    
//    private def dispatch Expression translateExpression(OperatorExpression expression) {
//        return createOperatorExpression => [
//            operator = expression.operator.translateOP
//            for (subexp : expression.subExpressions) {
//                subExpressions.add(subexp.translateExpression)
//            }
//        ]
//    }
//    
//    private def dispatch Expression translateExpression(Expression expression) {
//        throw new UnsupportedOperationException("Unsupported expression: "+expression)
//    }
//    
//    private def dispatch OperatorType translateOP(StringValue s) {
//        return s.value.translateOP
//    }
//    
//    private def dispatch OperatorType translateOP(String t) {
//        var match = OperatorType.getByName(t)
//        if (match == null) {
//           match = OperatorType.getByName(t).translateOP
//        }
//        if (match == null) {
//           throw new IllegalArgumentException("Illegal Operator: "+t)
//        }
//        return match
//    }   
//    
//    private def dispatch OperatorType translateOP(OperatorType t) {
//        return switch (t) {
////            case EQ: OperatorType.EQ
////            case LT: 
////            case LEQ: 
////            case GT:
////            case GEQ:
//            case NOT: OperatorType.NOT
////            case VAL:
//            case PRE: OperatorType.PRE
////            case NE:  OperatorType.NE
//            case LOGICAL_AND: OperatorType.AND
//            case LOGICAL_OR: OperatorType.OR
////            case ADD: OperatorType.ADD
////            case SUB:
////            case MULT:
////            case DIV:
////            case MOD:
//            case BITWISE_OR: OperatorType.AND
//            case BITWISE_AND: OperatorType.OR
////            case POSTFIX_ADD:
////            case POSTFIX_SUB:
//            default: throw new IllegalArgumentException("Illegal Operator: "+t.getName)
//        }
//    } 
//    
//    private def TrapDecl getTrapSignal(Label label) {
//        if (!labelsMap.containsKey(label)) {
//            labelsMap.put(label, createTrapDecl => [name = label.name])
//        }
//        return labelsMap.get(label)
//    }

    def translateStatements(List<Statement> stms, StatementContainer target) {
    }
    
    def errorPattern() {
        return createEsterelThread
    }
}
