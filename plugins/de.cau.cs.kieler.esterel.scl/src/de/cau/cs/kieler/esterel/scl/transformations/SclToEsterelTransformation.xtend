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

/**
 * @author krat
 *
 */
class SclToEsterelTransformation {

    var LinkedList<ISignal> allSignals

    def Program transform(SCLProgram sclProgram) {
        allSignals = new LinkedList<ISignal>

        val esterelProgram = EsterelFactory::eINSTANCE.createProgram
        val module = EsterelFactory::eINSTANCE.createModule
        module.name = sclProgram.name
        module.end = "end module"
        module.body = EsterelFactory::eINSTANCE.createModuleBody

        // Transform declarations
        transformInterface(sclProgram.declarations, module)

        // Transform body
        //        module.body.statements += EsterelFactory::eINSTANCE.createNothing
        val stmSeq = EsterelFactory::eINSTANCE.createSequence
        transformStm(sclProgram.statements, stmSeq)
        module.body.statements += stmSeq

        esterelProgram.modules += module
        esterelProgram
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

    def Sequence transformStm(EList<Statement> stms, Sequence stmSeq) {
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
                                list += transformStm(th.statements, EsterelFactory::eINSTANCE.createSequence)
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
                    // Find the innermost StatementSequence
                    val gotoStm = goto.eContainer as InstructionStatement
                    val parent = gotoStm.eContainer as StatementSequence
                    // Find the corresponding label
                    // TODO Will throw exception if not there
                    val emptyStm = parent.eAllContents.filter(EmptyStatement).findFirst[ label == goto.targetLabel ]
                    var indexLabel = parent.statements.indexOf(emptyStm)
                    var indexGoto = parent.statements.indexOf(gotoStm)
                    System.out.println("indexLabel: " + indexLabel + " indexGoto " + indexGoto + " statements " + parent.statements)
                    
                    // If the jump goes backwards this is a loop
                    if (indexLabel < indexGoto) {
                        val sSeq = EcoreUtil.copy((parent as StatementSequence))
                        // TODO beautify
                        // TODO array index out of bounds when more than one goto loop taken
                        while (indexLabel >= 0) {
                            sSeq.statements.remove(0)
                            indexLabel = indexLabel -1
                        }
                        while (indexGoto <= sSeq.statements.length) {
                            sSeq.statements.remove(indexGoto-1)
                            indexGoto = indexGoto + 1
                        }
                        stmSeq.list += EsterelFactory::eINSTANCE.createNothing
                            stmSeq.list += EsterelFactory::eINSTANCE.createLoop => [
                                body = EsterelFactory::eINSTANCE.createLoopBody => [
                                    statement = transformStm(sSeq.statements, EsterelFactory::eINSTANCE.createSequence)
                                ]
                                end1 = EsterelFactory::eINSTANCE.createEndLoop
                            ]
                        return stmSeq
                    }
                    
                    // Do what happens after the label
                    // TRAP?
                    val sSeq = EcoreUtil.copy((parent as StatementSequence))
                    while (indexLabel >= 0) {
                        sSeq.statements.remove(0)
                        indexLabel = indexLabel -1
                    }
                    return transformStm(sSeq.statements, stmSeq)
                }
            }
            
            }
        

        // A Seqeuence is not allowed to have only one element...
        if (stmSeq.list.length < 2)
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
