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

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.ElseScope
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.SCLFactory
import de.cau.cs.kieler.scl.SCLProgram
import de.cau.cs.kieler.scl.Scope
import de.cau.cs.kieler.scl.ScopeStatement
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.StatementContainer
import java.util.LinkedList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.EcoreUtil

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.Module
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm, krat
 * @kieler.design 2013-10-31 proposed 
 * @kieler.rating 2013-10-31 proposed yellow
 * 
 * This class provides several optimization methods for SCL.
 */
class SCLExtensions {
    
    extension SCLFactory = SCLFactory.eINSTANCE
    @Inject extension KEffectsExtensions
    static val sCLFactory = SCLFactory.eINSTANCE
    
    /**
     * Removes all goto instructions, that target a label, that follows that goto.
     * 
     * @param scope The Scope to optimize
     * @return     The optimized Scope
     */
    def Scope removeSuperfluousGotos(Scope scope) {
        val toDelete = <Goto>newLinkedList
        for (goto : scope.eAllContents.filter(typeof(Goto)).toList) {
            var parent = goto.eContainer as Scope
            var EList<Statement> stmList = parent.statements
            
            var index = stmList.indexOf(goto)
            var justLabel = true
            var oldSseq = parent
            while ((stmList.size > index + 1 || parent instanceof Conditional) && justLabel) {
                // Check conditional following if in if-then-else branch
                if (stmList.size == index + 1 && justLabel && parent instanceof Conditional) {
                    oldSseq = parent
                    if ((parent.eContainer instanceof Conditional) && ((parent.eContainer as Conditional).^else?.statements)?.contains(oldSseq.eContainer)) {
                        stmList = (parent.eContainer as Conditional).^else.statements
                    } else if (parent.eContainer instanceof Scope) {
                        stmList = (parent.eContainer as Scope).statements
                    } else if (parent.eContainer.eContainer instanceof Scope) {
                        stmList = (parent.eContainer.eContainer as Scope).statements
                    }

                    parent = parent.eContainer.eContainer as Scope
                    index = stmList.indexOf(oldSseq.eContainer)
                }
                if (stmList.size > index + 1) {
                    val nextStatement = stmList.get(index + 1) as Statement
                    if (nextStatement instanceof Label &&
                        (nextStatement as Label) == goto.target) {
                        toDelete.add(goto)
                    }
                    if (!(nextStatement instanceof Label)) {
                        justLabel = false
                    }
                    index = index + 1
                }
            }
        }
        toDelete.forEach[ it.eContainer.remove ]

        return scope
    }
    
    /**
     * Removes superfluous gotos and redundant labels.
     * @param scope The Scope to optimize
     * @return     The optimized Scope
     */
     def removeSuperfluousGotosAndLabels(Scope scope) {
         var Scope oldSseq
        do {
            oldSseq = EcoreUtil.copy(scope)
            scope.optimizeLabels
            scope.removeSuperfluousGotos
        } while (!EcoreUtil.equals(oldSseq, scope))

        scope
     }

    /**
     * Removes all labels which are not used, i.e. not targeted by a goto.
     * 
     * @param scope The Scope to optimize
     * @return     The optimized Scope
     */
    def Scope optimizeLabels(Scope scope) {
        val targets = scope.eAllContents.filter(Goto).map[target].toSet
        val toDelete = scope.eAllContents.filter(Label).filter[!targets.contains(it)].toList
        toDelete.forEach[it.remove]
        return scope
    }

    /**
     * Removes all statements that follow a goto before any label, i.e. removes unreachable code.
     * 
     * @param scope The Scope to optimize
     * @return     The optimized Scope
     */
    def Scope removeUnreachableCode(Scope scope) {
        val toDelete = <Statement>newLinkedList
        var gotos = scope.eAllContents.toList.filter(typeof(Goto))
        for (goto : gotos) {
            var statement = goto
            var parent = statement.eContainer as Scope
            var index = parent.statements.indexOf(statement)
            var noLabel = true
            while (parent.statements.size > index + 1 && noLabel) {
                val nextStatement = parent.statements.get(index + 1) as Statement

                if (nextStatement instanceof Label) {
                    noLabel = false
                } else {
                    toDelete.add(nextStatement)
                }
                index = index + 1
            }
        }
        toDelete.forEach[it.remove]

        return scope
    }

    /**
     * Removes subsequent (sequences of) labels and changes corresponding gotos.
     * 
     * @param scope The Scope to optimize
     * @return     The optimized Scope
     */
    def Scope removeSubseqeuentLabels(Scope scope) {
        val toDelete = <Statement>newLinkedList
        val replaceBy = <Pair<Label, Label>>newLinkedList

        for (label : scope.eAllContents.filter(Label).toList) {
            var parent = label.eContainer as Scope
            var index = parent.statements.indexOf(label)
            var isLabel = true
            while (parent.statements.size > index + 1 && isLabel) {
                val nextStatement = parent.statements.get(index + 1) as Statement

                if (nextStatement instanceof Label) {
                    toDelete.add(nextStatement)
                    replaceBy.add((nextStatement as Label) -> label)
                    index = index + 1
                } else {
                    isLabel = false;
                }
            }

            // Replace goto targets
            for (goto : parent.eAllContents.toList.filter(Goto)) {
                var newLabel = replaceBy.findFirst[key == (goto as Goto).target]

                if (newLabel != null) {
                    (goto as Goto).target = newLabel.value
                }
            }
            replaceBy.clear
        }
        toDelete.forEach[it.remove]

        scope
    }

    /**
      * Removes double jumps, i.e. gotos targeting a label followed by another goto.
      * 
      * @param scope The Scope to optimize
      * @return     The optimized Scope
      */
    def Scope removeDoubleJumps(Scope scope) {
        val replaceBy = <Pair<Label, Label>>newLinkedList
        for (label : scope.eAllContents.toList.filter(Label)) {
            var EList<Statement> stmList
            var parent = label.eContainer as StatementContainer

            // Continue until Thread or SCLProgram
            var continue = true

            stmList = parent.statements
            var index = stmList.indexOf(label) + 1
            var EObject curStm = label
            while (continue) {
                if (stmList.size > index) {
                    val nextStatement = stmList.get(index) as Statement
                    if (nextStatement instanceof Goto) {
                        val goto = (nextStatement as Goto)
                        replaceBy += label -> goto.target
                    }
                    continue = false;
                } else if (parent instanceof de.cau.cs.kieler.scl.Thread) {
                    continue = false
                } else if (parent instanceof Module) {
                    continue = false
                } else if (parent instanceof ElseScope) {
                    curStm = parent.eContainer as Conditional
                    parent = curStm.eContainer as StatementContainer
                    stmList = parent.statements
                    index = stmList.indexOf(curStm) + 1
                } else if (parent instanceof Scope) {
                    if (parent.eContainer instanceof StatementContainer) {
                        curStm = parent
                        parent = parent.eContainer as StatementContainer
                        stmList = parent.statements
                        index = stmList.indexOf(curStm) + 1
                    } else {
                        continue = false
                    }
                } else {
                    continue = false
                }
            }

            // Replace goto targets
            for (goto : parent.eAllContents.toList.filter(typeof(Goto))) {
                var newLabel = replaceBy.findFirst[key == (goto as Goto).target]
                if (newLabel != null) {
                    (goto as Goto).target = newLabel.value
                }
            }
            replaceBy.clear
        }

        scope
    }

    /**
	 * Removes unreachable code and labels which are not targeted by a goto.
	 * 
	 * @param scope The Scope to optimize
	 * @return     The optimized Scope
	 */
    def Scope removeUnreachableCodeAndLabels(Scope scope) {
        var Scope oldSseq
        do {
            oldSseq = EcoreUtil.copy(scope)
            scope.optimizeLabels
            scope.removeUnreachableCode
        } while (!EcoreUtil.equals(oldSseq, scope))

        scope
    }

    /**
     * Applies all optimizations until fixed-point is reached
     * 
     * @param scope The Scope to optimize
     * @return     The optimized Scope
     */
    def Scope optimizeAll(Scope scope) {
        var Scope oldScope
        do {
            oldScope = EcoreUtil.copy(scope)
            scope.removeSuperfluousGotos
            scope.optimizeLabels
            scope.removeUnreachableCode
            scope.removeSubseqeuentLabels
            scope.removeDoubleJumps
            scope.removeRedundantForks
        } while (!EcoreUtil.equals(oldScope, scope))
        return scope
    }

    /**
     * Remove local variable declarations (i.e. Scopes) and creates corresponding global varaibles.
     * 
     * @param scope The Scope to optimize
     * @return     The optimized Scope
     */
    def removeLocalDeclarations(Scope scope) {

        // Collect all ValuedObject names
        val names = new LinkedList<String>
        scope.declarations.forEach[valuedObjects.forEach[names += name]]

        val scopes = scope.eAllContents.filter(Scope).toList
        val newDecls = new LinkedList<Declaration>
        for (subScope : scopes) {
            subScope.declarations.forEach [
                for (valObj : valuedObjects) {

                    // Check whether variable name is already defined
                    if (names.contains(valObj.name)) {
                        val oldName = valObj.name
                        valObj.name = valObj.name.makeUnique(names)
                        subScope.rename(oldName, valObj.name)
                    }
                    names += valObj.name

                    // Add explicit assignment if initial value is given
                    if (valObj.initialValue != null) {
                        subScope.statements.add(0, sCLFactory.createAssignment => [
                            it.trace(valObj)
                            valuedObject = valObj
                            expression = valObj.initialValue
                        ])
                    }

                }
                newDecls += it
            ]

            // Replace scope by its statements
            if (subScope instanceof ScopeStatement) {
                val parent = subScope.eContainer as Scope
                parent.statements.addAll(parent.statements.indexOf(subScope), subScope.statements)
                subScope.remove
            }
        }
        scope.declarations += newDecls

        return scope
    }

    /**
     * Renames ValuedObject in a StatementScope.
     * 
     * @param sScope  The StatementScope in which renaming should happen
     * @param oldName The variable name to rename
     * @param newName The new name
     */
    def rename(Scope scope, String oldName, String newName) {
        for (valObj : scope.eAllContents.toList.filter(ValuedObject)) {
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
     * @param scope The Scope to process
     * @return Scope without redundant forks
     */
     def removeRedundantForks(Scope scope) {
         for (parallel : scope.eAllContents.toList.filter(Parallel)) {
             if (parallel.threads.length <= 1) {
                 val parent = parallel.eContainer as Scope
                 val indexOfParallel = parent.statements.indexOf(parallel)
                 parent.statements.remove(indexOfParallel)
                 if (parallel.threads.length == 1) {
                     parent.statements.addAll(indexOfParallel, parallel.threads.head.statements)
                 }
             }
         }
     }

}
