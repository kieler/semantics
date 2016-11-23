/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.extensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Conditional
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.kexpressions.ValuedObject
import java.util.LinkedList
import de.cau.cs.kieler.scl.scl.StatementScope
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Parallel

/**
 * @author ssm, krat
 * @kieler.design 2013-10-31 proposed 
 * @kieler.rating 2013-10-31 proposed yellow
 * 
 * This class provides several optimization methods for SCL.
 */
class SCLExtensions {

    /**
     * Removes all goto instructions, that target a label, that follows that goto.
     * 
     * @param sSeq The StatementSequence to optimize
     * @return     The optimized StatementSequence
     */
    def StatementSequence removeSuperfluousGotos(StatementSequence sSeq) {
        val toDelete = <Goto>newLinkedList
        for (goto : sSeq.eAllContents.toList.filter(typeof(Goto))) {
            var statement = goto.eContainer
            var EList<Statement> stmList

            // Check if in Conditional as if so we have to distinguish if we are in the else branch as this is not a sSeq
            if ((statement.eContainer instanceof Conditional) &&
                ((statement.eContainer as Conditional).elseStatements).contains(statement)) {
                stmList = (statement.eContainer as Conditional).elseStatements
            } else {
                stmList = (statement.eContainer as StatementSequence).statements
            }
            var parent = statement.eContainer as StatementSequence
            var index = stmList.indexOf(statement)
            var justLabel = true
            var oldSseq = parent
            while ((stmList.size > index + 1 || parent instanceof Conditional) && justLabel) {
                // Check conditional following if in if-then-else branch
                if (stmList.size == index + 1 && justLabel && parent instanceof Conditional) {
                    oldSseq = parent
                    if ((parent.eContainer instanceof Conditional) &&
                        ((parent.eContainer as Conditional).elseStatements).contains(oldSseq.eContainer)) {
                        stmList = (parent.eContainer as Conditional).elseStatements
                    } else {
                        stmList = (parent.eContainer.eContainer as StatementSequence).statements
                    }

                    parent = parent.eContainer.eContainer as StatementSequence
                    index = stmList.indexOf(oldSseq.eContainer)
                }
                if (stmList.size > index + 1) {
                    val nextStatement = stmList.get(index + 1) as Statement
                    if (nextStatement instanceof EmptyStatement &&
                        (nextStatement as EmptyStatement).label == goto.targetLabel) {
                        toDelete.add(goto)
                    }
                    if (!(nextStatement instanceof EmptyStatement)) {
                        justLabel = false
                    }
                    index = index + 1
                }
            }
        }
        toDelete.forEach[ it.eContainer.remove ]

        sSeq
    }
    
    /**
     * Removes superfluous gotos and redundant labels.
     * @param sSeq The StatementSequence to optimize
     * @return     The optimized StatementSequence
     */
     def removeSuperfluousGotosAndLabels(StatementSequence sSeq) {
         var StatementSequence oldSseq
        do {
            oldSseq = EcoreUtil.copy(sSeq)
            sSeq.optimizeLabels
            sSeq.removeSuperfluousGotos
        } while (!EcoreUtil.equals(oldSseq, sSeq))

        sSeq
     }

    /**
     * Removes all labels which are not used, i.e. not targeted by a goto.
     * 
     * @param sSeq The StatementSequence to optimize
     * @return     The optimized StatementSequence
     */
    def StatementSequence optimizeLabels(StatementSequence sSeq) {
        val toDelete = <EmptyStatement>newLinkedList
        sSeq.eAllContents.filter(typeof(EmptyStatement)).forEach [
            var parent = it.eContainer
            while (!(parent instanceof Thread) && !(parent instanceof SCLProgram))
                parent = parent.eContainer
            if (!((parent.eAllContents.toList.filter(typeof(Goto))).exists(goto|goto.targetLabel == it.label)))
                toDelete += it
        ]
        toDelete.forEach[it.remove]

        sSeq
    }

    /**
     * Removes all statements that follow a goto before any label, i.e. removes unreachable code.
     * 
     * @param sSeq The StatementSequence to optimize
     * @return     The optimized StatementSequence
     */
    def StatementSequence removeUnreachableCode(StatementSequence sSeq) {
        val toDelete = <Statement>newLinkedList
        for (goto : sSeq.eAllContents.toList.filter(typeof(Goto))) {
            var statement = goto.eContainer
            var parent = statement.eContainer as StatementSequence
            var index = parent.statements.indexOf(statement)
            var noLabel = true
            while (parent.statements.size > index + 1 && noLabel) {
                val nextStatement = parent.statements.get(index + 1) as Statement

                if (nextStatement instanceof EmptyStatement) {
                    noLabel = false
                } else {
                    toDelete.add(nextStatement)
                }
                index = index + 1

            }

        }
        toDelete.forEach[it.remove]

        sSeq
    }

    /**
     * Removes subsequent (sequences of) labels and changes corresponding gotos.
     * 
     * @param sSeq The StatementSequence to optimize
     * @return     The optimized StatementSequence
     */
    def StatementSequence removeSubseqeuentLabels(StatementSequence sSeq) {
        val toDelete = <Statement>newLinkedList
        val replaceBy = <Pair<String, String>>newLinkedList

        for (emptyStm : sSeq.eAllContents.toList.filter(typeof(EmptyStatement))) {
            var parent = emptyStm.eContainer as StatementSequence
            var index = parent.statements.indexOf(emptyStm)
            var isLabel = true
            while (parent.statements.size > index + 1 && isLabel) {
                val nextStatement = parent.statements.get(index + 1) as Statement

                if (nextStatement instanceof EmptyStatement) {
                    toDelete.add(nextStatement)
                    replaceBy.add((nextStatement as EmptyStatement).label -> emptyStm.label)
                    index = index + 1
                } else {
                    isLabel = false;
                }
            }

            // Replace goto targets
            for (goto : parent.eAllContents.toList.filter(typeof(Goto))) {
                var newLabel = replaceBy.findFirst[key == (goto as Goto).targetLabel]

                if (newLabel != null) {
                    (goto as Goto).targetLabel = newLabel.value
                }
            }
            replaceBy.clear
        }
        toDelete.forEach[it.remove]

        sSeq
    }

    /**
      * Removes double jumps, i.e. gotos targeting a label followed by another goto.
      * 
      * @param sSeq The StatementSequence to optimize
      * @return     The optimized StatementSequence
      */
    def StatementSequence removeDoubleJumps(StatementSequence sSeq) {
        val replaceBy = <Pair<String, String>>newLinkedList
        for (emptyStm : sSeq.eAllContents.toList.filter(typeof(EmptyStatement))) {
            var EList<Statement> stmList
            var parent = emptyStm.eContainer as StatementSequence

            // Continue if in conditional
            var continue = true

            // Check whether label is in conditional and in which branch
            if ((parent instanceof Conditional) && (parent as Conditional).elseStatements.contains(emptyStm)) {
                stmList = (parent as Conditional).elseStatements
            } else {
                stmList = parent.statements
            }
            var index = stmList.indexOf(emptyStm) + 1
            var Statement curStm = emptyStm
            while (continue) {
                if (stmList.size > index) {
                    val nextStatement = stmList.get(index) as Statement
                    if (nextStatement instanceof InstructionStatement &&
                        (nextStatement as InstructionStatement).instruction instanceof Goto) {
                        val goto = ((nextStatement as InstructionStatement).instruction as Goto)
                        replaceBy += emptyStm.label -> goto.targetLabel
                    }
                    continue = false;

                // Check whether at end of conditonal branch or StatementScope and "look outside"
                } else if (parent instanceof StatementScope) {
                    curStm = parent.eContainer as Statement
                    parent = parent.eContainer.eContainer as StatementSequence
                    stmList = parent.statements
                    index = stmList.indexOf(curStm) + 1
                } else if (parent instanceof Conditional) {
                    curStm = parent.eContainer as Statement
                    parent = parent.eContainer.eContainer as StatementSequence
                    if ((parent instanceof Conditional) && (parent as Conditional).elseStatements.contains(curStm)) {
                        stmList = (parent as Conditional).elseStatements
                    } else {
                        stmList = parent.statements
                    }
                    index = stmList.indexOf(curStm) + 1
                } else {
                    continue = false
                }
            }

            // Replace goto targets
            for (goto : parent.eAllContents.toList.filter(typeof(Goto))) {
                var newLabel = replaceBy.findFirst[key == (goto as Goto).targetLabel]
                if (newLabel != null) {
                    (goto as Goto).targetLabel = newLabel.value
                }
            }
            replaceBy.clear
        }

        sSeq
    }

    /**
	 * Removes unreachable code and labels which are not targeted by a goto.
	 * 
	 * @param sSeq The StatementSequence to optimize
	 * @return     The optimized StatementSequence
	 */
    def StatementSequence removeUnreachableCodeAndLabels(StatementSequence sSeq) {
        var StatementSequence oldSseq
        do {
            oldSseq = EcoreUtil.copy(sSeq)
            sSeq.optimizeLabels
            sSeq.removeUnreachableCode
        } while (!EcoreUtil.equals(oldSseq, sSeq))

        sSeq
    }

    /**
     * Applies all optimizations until fixed-point is reached
     * 
     * @param sSeq The StatementSequence to optimize
     * @return     The optimized StatementSequence
     */
    def StatementSequence optimizeAll(StatementSequence sSeq) {
        var StatementSequence oldSseq
        do {
            oldSseq = EcoreUtil.copy(sSeq)
            sSeq.removeSuperfluousGotos
            sSeq.optimizeLabels
            sSeq.removeUnreachableCode
            sSeq.removeSubseqeuentLabels
            sSeq.removeDoubleJumps
            sSeq.removeRedundantForks
        } while (!EcoreUtil.equals(oldSseq, sSeq))
        sSeq
    }

    /**
     * Remove local variable declarations (i.e. StatementScopes) and creates corresponding global varaibles.
     * 
     * @param sSeq The StatementSequence to optimize
     * @return     The optimized StatementSequence
     */
    def removeLocalDeclarations(SCLProgram sclProgram) {

        // Collect all ValuedObject names
        val names = new LinkedList<String>
        sclProgram.declarations.forEach[valuedObjects.forEach[names += name]]

        val sScopes = sclProgram.eAllContents.toList.filter(typeof(StatementScope))
        val newDecls = new LinkedList<Declaration>
        for (sScope : sScopes) {
            sScope.declarations.forEach [
                for (valObj : valuedObjects) {

                    // Check whether variable name is already defined
                    if (names.contains(valObj.name)) {
                        val oldName = valObj.name
                        valObj.name = valObj.name.makeUnique(names)
                        sScope.rename(oldName, valObj.name)
                    }
                    names += valObj.name

                    // Add explicit assignment if initial value is given
                    if (valObj.initialValue != null) {
                        sScope.statements.add(0,
                            SclFactory::eINSTANCE.createInstructionStatement => [
                                instruction = SclFactory::eINSTANCE.createAssignment => [
                                    valuedObject = valObj
                                    expression = valObj.initialValue
                                ]
                            ])
                    }

                }
                newDecls += it
            ]

            // Replace sScope by its statements
            val parent = sScope.eContainer.eContainer as StatementSequence
            var index = 0
            if ((parent instanceof Conditional) && (parent as Conditional).elseStatements.contains(sScope.eContainer)) {
                index = (parent as Conditional).elseStatements.indexOf(sScope.eContainer)
                (parent as Conditional).elseStatements.remove(index)
                (parent as Conditional).elseStatements.addAll(index, sScope.statements)
            } else {
                index = parent.statements.indexOf(sScope.eContainer)
                parent.statements.remove(index)
                parent.statements.addAll(index, sScope.statements)
            }
        }
        sclProgram.declarations += newDecls

        sclProgram
    }

    /**
     * Renames ValuedObject in a StatementScope.
     * 
     * @param sScope  The StatementScope in which renaming should happen
     * @param oldName The variable name to rename
     * @param newName The new name
     */
    def rename(StatementScope sScope, String oldName, String newName) {
        for (valObj : sScope.eAllContents.toList.filter(typeof(ValuedObject))) {
            if (valObj.name.equals(oldName)) {
                valObj.name = newName
            }
        }
    }

    /**
     * Makes a given variable name unique corresponding to a given list of names by adding "_"
     * 
     * @param name  The desired name
     * @param names List of already defined names
     */
    def makeUnique(String name, LinkedList<String> names) {
        var nameVar = name
        while (names.contains(nameVar)) {
            nameVar = nameVar + "_"
        }
        names.add(nameVar)

        nameVar
    }
    
    /**
     * Removes redundant forks (i.e. forks with only one thread)
     * @param statementSequence The StatementSequence to process
     * @return StatementSequence wiithout redundant forks
     */
     def removeRedundantForks(StatementSequence statementSequence) {
         for (parallel : statementSequence.eAllContents.toList.filter(Parallel)) {
             if (parallel.threads.length <= 1) {
                 val parent = parallel.eContainer.eContainer as StatementSequence
                 val indexOfParallel = parent.statements.indexOf(parallel.eContainer)
                 parent.statements.remove(indexOfParallel)
                 if (parallel.threads.length == 1) {
                     parent.statements.addAll(indexOfParallel, parallel.threads.head.statements)
                 }
             }
         }
     }

}
