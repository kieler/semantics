/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.scest.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import de.cau.cs.kieler.esterel.scest.features.SCEstFeature
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementContainer
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.Exec
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.esterel.esterel.EsterelParallel
import de.cau.cs.kieler.scl.scl.Parallel
import com.google.common.collect.Sets
import de.cau.cs.kieler.esterel.esterel.Suspend
import de.cau.cs.kieler.esterel.esterel.DelayExpr
import de.cau.cs.kieler.scl.scl.Pause
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.Annotation

/**
 * @author mrb
 *
 */
class SuspendTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::SUSPEND_ID
    }

    override getName() {
        return SCEstTransformation::SUSPEND_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::SUSPEND_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::ENTRY_ID,
//            SCEstTransformation::CONNECTOR_ID)
//    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID)
    }

    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(SCEstProgram prog) {
        prog.modules.forEach [ m | transformStatements(m.statements, 0)]
        return prog
    }
    
    def EList<Statement> transformStatements(EList<Statement> statements, int counter) {
        for (var i=0; i<statements.length; i++) {
            var statement = statements.get(i).transformStatement(counter)
            if (statement instanceof Statement) {
                statements.set(i, statement)
            }
        }
        return statements
    }
    
    def Statement transformStatement(Statement statement, int counter) {
        if (statement instanceof Suspend) {
            var suspend = statement as Suspend
            var statements = getContainingList(statement)
            var pos = statements.indexOf(statement)
            transformPauses(suspend.statements, counter, EcoreUtil.copy(suspend.delay))
            if (suspend.statements.length > 0) {
                suspend.statements.get(0).transformStatement(counter+1)
            }
            if (suspend.delay.isImmediate) {
                var label = createLabel(createNewUniqueLabel)
                statements.set(pos, label)
                statements.add(pos+1, newIfThenPauseGoto(EcoreUtil.copy(suspend.delay), label, true))
                statements.add(pos+2, suspend.statements)
            }
            else {
                statements.add(pos+1, suspend.statements)
                statements.remove(statement)
            }
            return null
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements, counter+1)
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler.forEach[h | transformStatements(h.statements, counter+1)]
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements, counter+1)
                (statement as Abort).cases.forEach[ c | transformStatements(c.statements, counter+1)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList.forEach[ c | transformStatements(c.statements, counter+1)]
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements, counter+1)
            }
            else if (statement instanceof Conditional) {
                transformStatements((statement as Conditional).getElse().statements, counter+1)
            }
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).thenStatements, counter+1)
            (statement as Present).cases.forEach[ c | transformStatements(c.statements, counter+1)]
            transformStatements((statement as Present).elseStatements, counter+1)
        }
        else if (statement instanceof IfTest) {
            // Don't transform the pauses in generated IfTests.
            var annotations = (statement as IfTest).annotations
            if (!isGenerated(annotations)) {
                transformStatements((statement as IfTest).thenStatements, counter+1)
                (statement as IfTest).elseif.forEach [ elsif | transformStatements(elsif.thenStatements, counter+1)]
                transformStatements((statement as IfTest).elseStatements, counter+1)
            }
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads.forEach [ t |
                transformStatements(t.statements, counter+1)
            ]
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                transformStatements(t.statements, counter+1)
            ]
        }
        return statement
    }
    
    def EList<Statement> transformPauses(EList<Statement> statements, int counter, DelayExpr delay) {
        for (var i=0; i<statements.length; i++) {
            var statement = statements.get(i).transformPause(counter, delay)
            if (statement instanceof Statement) {
                statements.set(i, statement)
            }
            else if (statement == null) {
                i = i+2 // a label/ifTest was added before/after the pause statement;without 'i=i+2' pause would be transformed indefinitely often
            }
        }
        return statements
    }
    
    def Statement transformPause(Statement statement, int counter, DelayExpr delay) {
        if (statement instanceof Pause) {
            var statements = getContainingList(statement)
            var pos = statements.indexOf(statement)
            var label = createLabel(createNewUniqueLabel)
            var ifTest = newIfThenPauseGoto(EcoreUtil.copy(delay), label, false)
            var annotation = createAnnotation(counter)
            ifTest.annotations.add(annotation)
            // Look for already existing IfTests after Pause.
            // Check whether they have a higher priority than the transformed Suspend statement.
            // Place the IfTest at the correct position.
            if (pos+1>=statements.length) {
                statements.add(ifTest)
                statements.add(pos, label)
                return null
            }
            // Because there is no 'break' in Xtend "i = statements.length" is used to end the for loop.
            for (var i=1; pos+i<statements.length; i++) {
                if (statements.get(pos+i) instanceof IfTest) {
                    var ifTest2 = statements.get(pos+i) as IfTest
                    if (!ifTest2.annotations.empty) {
                        var isGenerated = false
                        for (Annotation a : ifTest.annotations) {
                            if (a.name == "generated_ifTest") {
                                isGenerated = true
                                var layer = (a as IntAnnotation).value
                                if (counter<layer) {
                                    statements.add(pos+i, ifTest)
                                    i = statements.length
                                }
                            }
                        }
                        if (!isGenerated) {
                            statements.add(pos+i, ifTest)
                            i = statements.length
                        }
                    }
                    else {
                        statements.add(pos+i, ifTest)
                        i = statements.length
                    }
                }
                else {
                    statements.add(pos+i, ifTest)
                    i = statements.length
                }
            }
            statements.add(pos, label)
            return null
        }
        else if (statement instanceof StatementContainer) {
            
            transformPauses((statement as StatementContainer).statements, counter, delay)
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler.forEach[h | transformPauses(h.statements, counter, delay)]
            }
            else if (statement instanceof Abort) {
                transformPauses((statement as Abort).doStatements, counter, delay)
                (statement as Abort).cases.forEach[ c | transformPauses(c.statements, counter, delay)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList.forEach[ c | transformPauses(c.statements, counter, delay)]
            }
            else if (statement instanceof Do) {
                transformPauses((statement as Do).watchingStatements, counter, delay)
            }
            else if (statement instanceof Conditional) {
                transformPauses((statement as Conditional).getElse().statements, counter, delay)
            }
        }
        else if (statement instanceof Present) {
            transformPauses((statement as Present).thenStatements, counter, delay)
            (statement as Present).cases.forEach[ c | transformPauses(c.statements, counter, delay)]
            transformPauses((statement as Present).elseStatements, counter, delay)
        }
        else if (statement instanceof IfTest) {
            transformPauses((statement as IfTest).thenStatements, counter, delay)
            (statement as IfTest).elseif.forEach [ elsif | transformPauses(elsif.thenStatements, counter, delay)]
            transformPauses((statement as IfTest).elseStatements, counter, delay)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads.forEach [ t |
                transformPauses(t.statements, counter, delay)
            ]
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                transformPauses(t.statements, counter, delay)
            ]
        }
        return statement
    }
    
}