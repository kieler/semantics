/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.scl.transformations

import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.esterel.esterel.Module
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.esterel.kexpressions.ValueType
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.scl.scl.Assignment
import java.util.LinkedList
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.core.kexpressions.Value
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression
import de.cau.cs.kieler.esterel.kexpressions.OperatorType
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.EmptyStatement
import org.eclipse.emf.ecore.util.EcoreUtil
import com.google.inject.Inject
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.esterel.esterel.TrapDecl
import org.eclipse.emf.ecore.util.EObjectEList
import de.cau.cs.kieler.scl.extensions.SCLExtensions

/**
 * @author krat
 *
 */
class SclToEsterelTransformation {

    @Inject
    extension SCLExtensions

    @Inject
    extension EsterelToSclExtensions

    var LinkedList<ISignal> allSignals
    var LinkedList<TrapDecl> allTraps
    var TRAP_SUFFIX = ""
    var LABEL_SUFFIX = "_"

    def Program transform(SCLProgram sclProgram) {

        allSignals = new LinkedList<ISignal>
        allTraps = new LinkedList<TrapDecl>

        val esterelProgram = EsterelFactory::eINSTANCE.createProgram
        val module = EsterelFactory::eINSTANCE.createModule
        module.name = sclProgram.name
        module.end = "end module"
        module.body = EsterelFactory::eINSTANCE.createModuleBody

        //Initialize SCL Program
        //        sclProgram.optimizeAll
        sclProgram.optimizeAll
        sclProgram.removeForwardJumps

        // Transform declarations
        transformInterface(sclProgram.declarations, module)
        
        val trap = EsterelFactory::eINSTANCE.createTrap => [
                                trapDeclList = EsterelFactory::eINSTANCE.createTrapDeclList => [
                                    val trapDecl = EsterelFactory::eINSTANCE.createTrapDecl => [
                                        name = "seq_exit"
                                    ]
                                    trapDecls += trapDecl
                                    allTraps += trapDecl
                                    
                                    ]
                                    ]

        // Transform body
        //        module.body.statements += EsterelFactory::eINSTANCE.createNothing
        val stmSeq = EsterelFactory::eINSTANCE.createSequence
        transformStm(sclProgram.statements, stmSeq)
        trap.statement = stmSeq

        module.body.statements += trap

        esterelProgram.modules += module
        esterelProgram

    //        sclProgram.normalize
//                    sclProgram
    }

    /*
     * "normalizes" the SCL program.
     */
    def normalize(StatementSequence sSeq) {
        sSeq.optimizeAll

        //        sSeq.eliminateElseBranches
        //        sSeq.eliminateNestedConditionals
        sSeq
    }

    /*
      * Eliminates else branches
      * TODO may be needed to use only sseq.statements
      */
    def eliminateElseBranches(StatementSequence sSeq) {
        for (cond : sSeq.eAllContents.toList.filter(typeof(Conditional))) {
            if (!cond.elseStatements.nullOrEmpty) {
                val parent = cond.eContainer.eContainer as StatementSequence
                val index = parent.statements.indexOf(cond.eContainer)
                val elseStms = cond.elseStatements

                val elseCond = createConditional
                elseCond.expression = createNot(EcoreUtil.copy(cond.expression))
                elseCond.statements += elseStms
                parent.statements.add(index + 1, elseCond.createStmFromInstr)
            }
        }

        sSeq
    }

    /*
     * Removes forward jumps by producing redundancy...
     */
    def removeForwardJumps(StatementSequence sSeq) {
        for (th : sSeq.eAllContents.toList.filter(typeof(de.cau.cs.kieler.scl.scl.Thread))) {
            val l_exit = ("l_exit" + TRAP_SUFFIX)
            TRAP_SUFFIX = TRAP_SUFFIX +"_"
            allTraps += EsterelFactory::eINSTANCE.createTrapDecl => [
                                        name = l_exit
                                    ]
            (th as de.cau.cs.kieler.scl.scl.Thread).statements.add(SclFactory::eINSTANCE.createEmptyStatement => [label = l_exit])
        }
        sSeq.addLabel("seq_exit")
        
        var StatementSequence oldSseq
        do {
            oldSseq = EcoreUtil.copy(sSeq)
        for (goto : sSeq.eAllContents.toList.filter(typeof(Goto))) {
            var parent = goto.eContainer.eContainer as StatementSequence
            var index = parent.statements.indexOf(goto.eContainer) + 1
            var gotoIndex = index - 1
            var foundTarget = false
            var notFound = false

            // Seek target label
            while (!foundTarget && !notFound) {
                if (index == parent.statements.length && parent instanceof Conditional) {
                    val oldParent = parent
                    parent = parent.eContainer.eContainer as StatementSequence
                    index = parent.statements.indexOf(oldParent.eContainer)
                } else if (index == parent.statements.length) {
                    notFound = true
                } else if (parent.statements.get(index) instanceof EmptyStatement &&
                    (parent.statements.get(index) as EmptyStatement).label == goto.targetLabel) {
                    foundTarget = true
                } else {
                    index = index + 1
                }
            }

            // Remove goto and replace by label contents
            if (foundTarget) {
                System.out.println("foundit")
                val gotoParent = goto.eContainer.eContainer as StatementSequence
                val copyStms = createSclStatementSequence
                var gotoStm = false
                while (index < parent.statements.length && !gotoStm) {
                    copyStms.statements.add(EcoreUtil.copy(parent.statements.get(index)))
                    if (parent.statements.get(index) instanceof InstructionStatement &&
                        (parent.statements.get(index) as InstructionStatement ).instruction instanceof Conditional) {
                        val cond = (parent.statements.get(index) as InstructionStatement ).instruction as Conditional
                        parent = cond.eContainer.eContainer as StatementSequence
                        index = parent.statements.indexOf(cond.eContainer)
                    }
                    index = index + 1
                }
                
                // Remove copied StatementSequence endlabel
                copyStms.statements.remove(copyStms.statements.length-1)

                // End of Thread/Program reached
                var seq = goto.eContainer.eContainer
                while (!(seq instanceof de.cau.cs.kieler.scl.scl.Thread) && !(seq instanceof SCLProgram))
                    seq = seq.eContainer
                    
                // Loop was copied
                if (gotoStm && goto.targetLabel == ((copyStms.statements.last as InstructionStatement).instruction as Goto).targetLabel) {
                    copyStms.statements.add(0, SclFactory::eINSTANCE.createEmptyStatement => [ label = "l" + LABEL_SUFFIX ])
                    copyStms.statements.remove(copyStms.statements.length - 1)
                    copyStms.addGoto("l" + LABEL_SUFFIX)
                    LABEL_SUFFIX = LABEL_SUFFIX + "_"
                }
                // Rename labels to avoid infinite loop
                val copiedLabels = new LinkedList<String>
                for (emptyStm : copyStms.eAllContents.toList.filter(typeof(EmptyStatement))) {
                    copiedLabels.add((emptyStm as EmptyStatement).label)
                    (emptyStm as EmptyStatement).label = (emptyStm as EmptyStatement).label + LABEL_SUFFIX
                }
                for (changeGotoTarget : copyStms.eAllContents.toList.filter(typeof(Goto))) {
                    if (copiedLabels.contains((changeGotoTarget as Goto).targetLabel))
                        (changeGotoTarget as Goto).targetLabel = (changeGotoTarget as Goto).targetLabel + LABEL_SUFFIX
                }
                LABEL_SUFFIX = LABEL_SUFFIX + "_"
                
                // Add a goto to end of Thread/Program
                copyStms.addGoto(((seq as StatementSequence).statements.last as EmptyStatement).label)
                
                gotoParent.statements.remove(gotoIndex)
                gotoParent.statements.addAll(gotoIndex, copyStms.statements)

            }
        }
        
        } while (!EcoreUtil.equals(oldSseq, sSeq))
        
        

        sSeq
    }

    /*
     * Transforms SCL declarations to Esterel module interface
     */
    def Module transformInterface(EList<Declaration> decls, Module module) {
        val interf = EsterelFactory::eINSTANCE.createModuleInterface
        for (decl : decls) {
            for (valObj : decl.valuedObjects) {

                //Create the signal
                val signal = KExpressionsFactory::eINSTANCE.createISignal => [
                    name = valObj.name
                    channelDescr = EsterelFactory::eINSTANCE.createChannelDescription => [
                        type = KExpressionsFactory::eINSTANCE.createTypeIdentifier => [
                            type = ValueType::getByName(decl.type.getName)
                        ]
                    ]
                ]

                if (decl.isOutput && decl.isInput) {
                    interf.intSignalDecls += KExpressionsFactory::eINSTANCE.createInputOutput => [
                        signals += signal
                    ]
                } else if (decl.isInput) {
                    interf.intSignalDecls += KExpressionsFactory::eINSTANCE.createInput => [
                        signals += signal
                    ]
                } else if (decl.isOutput) {
                    interf.intSignalDecls += KExpressionsFactory::eINSTANCE.createOutput => [
                        signals += signal
                    ]
                } else if (decl.isOutput && decl.isInput) {
                    interf.intSignalDecls += KExpressionsFactory::eINSTANCE.createInputOutput => [
                        signals += signal
                    ]
                }
                allSignals += signal
            }
        }

        module.interface = interf

        module
    }

    def Sequence transformStm(Iterable<Statement> stms, Sequence stmSeq) {
        var idx = 1
        for (stm : stms) {
            if (stm instanceof InstructionStatement) {
                val instrStm = stm as InstructionStatement

                // Pause
                if (instrStm.instruction instanceof Pause) {
                    stmSeq.list += EsterelFactory::eINSTANCE.createPause
                }
                // Parallel
                else if (instrStm.instruction instanceof Parallel) {
                    val par = instrStm.instruction as Parallel
                    stmSeq.list += EsterelFactory::eINSTANCE.createBlock => [
                        statement = EsterelFactory::eINSTANCE.createParallel => [
                            for (th : par.threads) {
                                val trap = EsterelFactory::eINSTANCE.createTrap => [
                                trapDeclList = EsterelFactory::eINSTANCE.createTrapDeclList => [

                                    trapDecls += allTraps.findFirst[ name == (th.statements.last as EmptyStatement).label ]
                                    
                                    ]
                                    statement = transformStm(th.statements, EsterelFactory::eINSTANCE.createSequence)
                                    
                                    ]
                                list += trap
                            }
                        ]
                    ]
                }
                // Assignment
                // TODO Should it be an emit?
                // TODO Handle non input/output as variables?
                else if (instrStm.instruction instanceof Assignment) {
                    val assign = instrStm.instruction as Assignment
                    stmSeq.list += EsterelFactory::eINSTANCE.createEmit => [
                        signal = allSignals.findFirst[name == assign.valuedObject.name]
                        expr = transformExp(assign.expression)
                    ]
                }
                // Conditional
                else if (instrStm.instruction instanceof Conditional) {
                    val cond = instrStm.instruction as Conditional
                    stmSeq.list += EsterelFactory::eINSTANCE.createIfTest => [
                        expr = transformExp(cond.expression)
                        if (!cond.statements.nullOrEmpty) {
                            thenPart = EsterelFactory::eINSTANCE.createThenPart => [
                                statement = transformStm(cond.statements, EsterelFactory::eINSTANCE.createSequence)
                            ]
                        }
                        if (!cond.elseStatements.nullOrEmpty) {
                            elsePart = EsterelFactory::eINSTANCE.createElsePart => [
                                statement = transformStm(cond.elseStatements, EsterelFactory::eINSTANCE.createSequence)
                            ]
                        }
                    ]
                }
                // Goto
                else if (instrStm.instruction instanceof Goto) {
                    val goto = instrStm.instruction as Goto

                    stmSeq.list += EsterelFactory::eINSTANCE.createExit => [
                        trap = allTraps.findFirst[name == goto.targetLabel]
                    ]
                }
            }
            // Label
            else if (stm instanceof EmptyStatement) {
                val label = stm as EmptyStatement
                val idxVal = idx
                val exit_trap = EsterelFactory::eINSTANCE.createTrapDecl => [
                    name = "l_exit" + TRAP_SUFFIX
                    TRAP_SUFFIX = TRAP_SUFFIX + "_"
                ]
                stmSeq.list += EsterelFactory::eINSTANCE.createTrap => [
                    trapDeclList = EsterelFactory::eINSTANCE.createTrapDeclList => [
                        trapDecls += exit_trap
                    ]
                    statement = EsterelFactory::eINSTANCE.createLoop => [
                        body = EsterelFactory::eINSTANCE.createLoopBody => [
                            statement = EsterelFactory::eINSTANCE.createTrap => [
                                trapDeclList = EsterelFactory::eINSTANCE.createTrapDeclList => [
                                    val trapDecl = EsterelFactory::eINSTANCE.createTrapDecl => [
                                        name = label.label
                                    ]
                                    trapDecls += trapDecl
                                    allTraps += trapDecl
                                ]
                                val seq = transformStm(stms.drop(idxVal), EsterelFactory::eINSTANCE.createSequence)
                                seq.list.add(EsterelFactory::eINSTANCE.createExit => [trap = exit_trap])
                                statement = seq
                            ]
                        ]
                        end1 = EsterelFactory::eINSTANCE.createEndLoop
                    ]
                ]

                // A Seqeuence is not allowed to have only one element...
                if (stmSeq.list.length < 2)
                    stmSeq.list += EsterelFactory::eINSTANCE.createNothing

                return stmSeq
            }
            idx = idx + 1
        }

        // A Seqeuence is not allowed to have only one element...
        if (stmSeq.list.length < 2)
            stmSeq.list += EsterelFactory::eINSTANCE.createNothing
        stmSeq.list += EsterelFactory::eINSTANCE.createNothing

        stmSeq
    }

    /*
     * Expression transformation
     * cond signalizes if a conditional is transformed and no val operator should be used
     */
    def dispatch ConstantExpression transformExp(de.cau.cs.kieler.core.kexpressions.BoolValue exp) {
        EsterelFactory::eINSTANCE.createConstantExpression => [
            value = Boolean.toString(exp.value)
        ]
    }

    def dispatch ConstantExpression transformExp(de.cau.cs.kieler.core.kexpressions.IntValue exp) {
        EsterelFactory::eINSTANCE.createConstantExpression => [
            value = Integer.toString(exp.value)
        ]
    }

    def dispatch ConstantExpression transformExp(de.cau.cs.kieler.core.kexpressions.FloatValue exp) {
        EsterelFactory::eINSTANCE.createConstantExpression => [
            value = Float.toString(exp.value)
        ]
    }

    def dispatch Expression transformExp(de.cau.cs.kieler.core.kexpressions.ValuedObjectReference exp) {
        return KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::VAL
            subExpressions += KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                valuedObject = allSignals.findFirst[name == exp.valuedObject.name]
            ]
        ]
    }

    def dispatch OperatorExpression transformExp(de.cau.cs.kieler.core.kexpressions.OperatorExpression exp) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::getByName(exp.operator.getName)
            for (subExp : exp.subExpressions) {
                subExpressions += transformExp(subExp)
            }
        ]
    }
}
