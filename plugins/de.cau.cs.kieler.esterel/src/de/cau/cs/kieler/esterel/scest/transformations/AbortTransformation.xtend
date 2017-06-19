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
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.esterel.esterel.DelayExpr
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.esterel.esterel.EsterelThread

/**
 * @author mrb
 *
 */
class AbortTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::ABORT_ID
    }

    override getName() {
        return SCEstTransformation::ABORT_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::ABORT_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::ENTRY_ID,
//            SCEstTransformation::CONNECTOR_ID)
//    }
//
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
        if (statements != null) {
            for (var i=0; i<statements.length; i++) {
                var statement = statements.get(i).transformStatement(counter)
                if (statement instanceof Statement) {
                    statements.set(i, statement)
                }
            }
        }
        return statements
    }
    
    
    def Statement transformStatement(Statement statement, int counter) {
        if (statement instanceof Abort) {
            var abort = statement as Abort
            var statements =  statement.getContainingList
            var pos = statements.indexOf(statement)
            if (abort.delay != null) {
                if (abort.weak) {
                    
                }
                else {
                    if (abort.delay.isImmediate) {
                        var label = createLabel
                        abort.statements.add(label)
                        var conditional = newIfThenGoto(EcoreUtil.copy(abort.delay.signalExpr), label, false)
                        statements.set(pos, conditional)
                        abort.statements.transformPauses(counter, EcoreUtil.copy(abort.delay), abort.delay.isIsImmediate, abort.weak, label, null)
                        statements.add(pos+1, abort.statements)
                    }
                    else {
                        var flag = createNewUniqueFlag(createBoolValue(false))
                        var decl = createDeclaration(ValueType.BOOL, flag)
                        var scope = createScopeStatement(decl)
                        var label = createLabel
                        abort.statements.add(label)
                        abort.statements.transformPauses(counter, EcoreUtil.copy(abort.delay), abort.delay.isIsImmediate, abort.weak, label, flag)
                        scope.statements.add(abort.statements)
                        statements.set(pos,scope)
                    }
                }
            }
            else {
                // TODO cases
            }
            return null
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements, counter+1)
            
            if (statement instanceof Trap) {
                if ((statement as Trap).trapHandler != null) {
                    (statement as Trap).trapHandler.forEach[h | transformStatements(h.statements, counter+1)]
                }
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements, counter+1)
                if ((statement as Abort).cases != null) {
                    (statement as Abort).cases.forEach[ c | transformStatements(c.statements, counter+1)]
                }
            }
            else if (statement instanceof Exec) {
                if ((statement as Exec).execCaseList != null) {
                    (statement as Exec).execCaseList.forEach[ c | transformStatements(c.statements, counter+1)]
                }
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements, counter+1)
            }
            else if (statement instanceof Conditional) {
                if ((statement as Conditional).getElse() != null) {
                    transformStatements((statement as Conditional).getElse().statements, counter+1)
                }
            }
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).thenStatements, counter+1)
            if ((statement as Present).cases != null) {
                (statement as Present).cases.forEach[ c | transformStatements(c.statements, counter+1)]
            }
            transformStatements((statement as Present).elseStatements, counter+1)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).thenStatements, counter+1)
            if ((statement as IfTest).elseif != null) {
                (statement as IfTest).elseif.forEach [ elsif | transformStatements(elsif.thenStatements, counter+1)]
            }
            transformStatements((statement as IfTest).elseStatements, counter+1)
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
    
    def EList<Statement> transformPauses(EList<Statement> statements, int counter, DelayExpr delay, boolean immediate, boolean weak, Label label, ValuedObject flag) {
        for (var i=0; i<statements.length; i++) {
            var statement = statements.get(i).transformPause(counter, delay, immediate, weak, label, flag)
            if (statement instanceof Statement) {
                statements.set(i, statement)
            }
            else if (statement == null) {
                i = i +1// a label/ifTest was added before/after the pause statement;without 'i=i+2' pause would be transformed indefinitely often
            }
        }
        return statements
    }
    
    def Statement transformPause(Statement statement, int counter, DelayExpr delay, boolean immediate, boolean weak, Label label, ValuedObject flag) {
        if (statement instanceof Pause) {
            var statements =  statement.getContainingList
            var pos = statements.indexOf(statement)
            if (weak) {
                if (immediate) {
                    
                }
                else {
                    
                }
            }
            else {
                if (immediate) {
                    var label2 = findClosestLabel(label, statement)
                    if (delay.expr == null) {
                        if (label2 != null) {
                            insertConditional(statements, newIfThenGoto(delay.signalExpr, label2, false), pos, counter)
                        }
                    }   
                     // TODO indefinite loop when pause in scopestatement
                     // TODO indefinite loop when pause in scopestatement
                     // TODO indefinite loop when pause in scopestatement
                    else {
                        scopeWithDecl(statements, pos, delay.expr, delay.signalExpr, label2, counter)
                    }
                }
                else {
                    
                }
            }
            
            
            
            return null
        }
        
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads.forEach [ t |
                transformPauses(t.statements, counter, delay, immediate, weak, label, flag)
            ]
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                transformPauses(t.statements, counter, delay, immediate, weak, label, flag)
            ]
        }
        else if (statement instanceof StatementContainer) {
            if (!(statement instanceof Conditional)) {
                transformPauses((statement as StatementContainer).statements, counter, delay, immediate, weak, label, flag)
            }
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler.forEach[h | transformPauses(h.statements, counter, delay, immediate, weak, label, flag)]
            }
            else if (statement instanceof Abort) {
                transformPauses((statement as Abort).doStatements, counter, delay, immediate, weak, label, flag)
                (statement as Abort).cases.forEach[ c | transformPauses(c.statements, counter, delay, immediate, weak, label, flag)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList.forEach[ c | transformPauses(c.statements, counter, delay, immediate, weak, label, flag)]
            }
            else if (statement instanceof Do) {
                transformPauses((statement as Do).watchingStatements, counter, delay, immediate, weak, label, flag)
            }
            else if (statement instanceof Conditional) {
                // Don't transform the pauses in generated Conditionals.
                var annotations = (statement as Conditional).annotations
                if (!isGenerated(annotations)) {
                    transformPauses((statement as StatementContainer).statements, counter, delay, immediate, weak, label, flag)
                    transformPauses((statement as Conditional).getElse().statements, counter, delay, immediate, weak, label, flag)
                }
            }
        }
        else if (statement instanceof Present) {
            transformPauses((statement as Present).thenStatements, counter, delay, immediate, weak, label, flag)
            (statement as Present).cases.forEach[ c | transformPauses(c.statements, counter, delay, immediate, weak, label, flag)]
            transformPauses((statement as Present).elseStatements, counter, delay, immediate, weak, label, flag)
        }
        else if (statement instanceof IfTest) {
            transformPauses((statement as IfTest).thenStatements, counter, delay, immediate, weak, label, flag)
            (statement as IfTest).elseif.forEach [ elsif | transformPauses(elsif.thenStatements, counter, delay, immediate, weak, label, flag)]
            transformPauses((statement as IfTest).elseStatements, counter, delay, immediate, weak, label, flag)
        }
        return statement
    }
    
}