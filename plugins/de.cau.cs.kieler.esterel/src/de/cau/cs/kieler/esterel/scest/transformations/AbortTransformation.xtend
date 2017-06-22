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
        prog.modules.forEach [ m | transformStatements(m.statements)]
        return prog
    }
    
    def EList<Statement> transformStatements(EList<Statement> statements) {
        if (statements != null) {
            for (var i=0; i<statements.length; i++) {
                var statement = statements.get(i).transformStatement
                if (statement instanceof Statement) {
                    statements.set(i, statement)
                }
            }
        }
        return statements
    }
    
    
    def Statement transformStatement(Statement statement) {
        if (statement instanceof Abort) {
            var abort = statement as Abort
            var statements =  statement.getContainingList
            var pos = statements.indexOf(statement)
            var scope = createScopeStatement
            var depth = abort.getDepth
            // check if its just a single abort delay or if this abort includes cases
            if (abort.delay != null) {
                if (abort.weak) {
                    
                }
                else {
                    if (abort.delay.isImmediate) {
                        var label = createLabel
                        var conditional = newIfThenGoto(EcoreUtil.copy(abort.delay.signalExpr), label, false)
                        // the order of the next three lines is crucial! (first trasformStatements, add(Label), then transformPauses)
                        abort.statements.transformStatements
                        abort.statements.add(label)
                        abort.statements.transformPauses(depth, EcoreUtil.copy(abort.delay), abort.weak, label, null)
                        scope.statements.add(conditional)
                        scope.statements.add(abort.statements)
//                        statements.set(pos, scope)
                    }
                    else {
                        var flag = createNewUniqueFlag(createBoolValue(false))
                        var decl = createDeclaration(ValueType.BOOL, flag)
                        var label = createLabel
                        // the order of the next two lines is crucial! (first trasformStatements, add(Label), then transformPauses)
                        abort.statements.transformStatements
                        abort.statements.add(label)
                        abort.statements.transformPauses(depth, EcoreUtil.copy(abort.delay), abort.weak, label, flag)
                        scope.declarations.add(decl)
                        scope.statements.add(abort.statements)
//                        statements.set(pos,scope)
                    }
                }
            }
            // abort cases
            else {
                // TODO cases
            }
            return scope
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements)
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler?.forEach[h | transformStatements(h.statements)]
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements)
                (statement as Abort).cases?.forEach[ c | transformStatements(c.statements)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList?.forEach[ c | transformStatements(c.statements)]
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements)
            }
            else if (statement instanceof Conditional) {
                transformStatements((statement as Conditional).getElse()?.statements)
            }
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).thenStatements)
            (statement as Present).cases?.forEach[ c | transformStatements(c.statements)]
            transformStatements((statement as Present).elseStatements)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).thenStatements)
            (statement as IfTest).elseif?.forEach [ elsif | transformStatements(elsif.thenStatements)]
            transformStatements((statement as IfTest).elseStatements)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads?.forEach [ t |
                transformStatements(t.statements)
            ]
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads?.forEach [ t |
                transformStatements(t.statements)
            ]
        }
        return statement
    }
    
    def EList<Statement> transformPauses(EList<Statement> statements, int depth, DelayExpr delay, boolean weak, Label label, ValuedObject flag) {
        for (var i=0; i<statements?.length; i++) {
            var statement = statements.get(i).transformPause(depth, delay, weak, label, flag)
            if (statement instanceof Statement) {
                statements.set(i, statement)
            }
        }
        return statements
    }
    
    def Statement transformPause(Statement statement, int depth, DelayExpr delay, boolean weak, Label label, ValuedObject flag) {
        if (statement instanceof Pause) {
            var statements =  statement.getContainingList
            var pos = statements.indexOf(statement)
            // weak abort
            if (weak) {
                if (delay.isImmediate) {
                    
                }
                else {
                    
                }
            }
            // strong abort
            else {
                var label2 = findClosestLabel(label, statement)
                // e.g. abort immediate A
                if (delay.isImmediate) {
                    if (label2 != null) {
                        var conditional = newIfThenGoto(delay.signalExpr, label2, false)
                        conditional.annotations.add(createAnnotation(depth))
                        insertConditional(statements, conditional, pos, depth)
                    }
                }
                else {
                    // abort when A
                    if (delay.expr == null) {
                        var conditional = newIfThenGoto(delay.signalExpr, label2, false)
                        conditional.annotations.add(createAnnotation(depth))
                        conditional.statements.add(0, createAssignment(flag, createBoolValue(true)))
                        insertConditional(statements, conditional, pos, depth)
                    }
                    // e.g. abort when 3 A
                    else {
                        if (label2 != null) {
                            scopeWithDecl(statements, pos, delay.expr, delay.signalExpr, label2, depth, flag)
                        }
                    }
                }
            }
            
            return null
        }
        
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads?.forEach [ t |
                transformPauses(t.statements, depth, delay, weak, label, flag)
            ]
            transformJoin(statement, depth, delay, weak, label, flag)
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads?.forEach [ t |
                transformPauses(t.statements, depth, delay, weak, label, flag)
            ]
            transformJoin(statement, depth, delay, weak, label, flag)
            
        }
        else if (statement instanceof StatementContainer) {
            if (!(statement instanceof Conditional)) {
                transformPauses((statement as StatementContainer).statements, depth, delay, weak, label, flag)
            }
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler?.forEach[h | transformPauses(h.statements, depth, delay, weak, label, flag)]
            }
            else if (statement instanceof Abort) {
                transformPauses((statement as Abort).doStatements, depth, delay, weak, label, flag)
                (statement as Abort).cases?.forEach[ c | transformPauses(c.statements, depth, delay, weak, label, flag)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList?.forEach[ c | transformPauses(c.statements, depth, delay, weak, label, flag)]
            }
            else if (statement instanceof Do) {
                transformPauses((statement as Do).watchingStatements, depth, delay, weak, label, flag)
            }
            else if (statement instanceof Conditional) {
                // Don't transform the pauses in generated Conditionals.
                var annotations = (statement as Conditional).annotations
                if (!isGenerated(annotations)) {
                    transformPauses((statement as StatementContainer).statements, depth, delay, weak, label, flag)
                    transformPauses((statement as Conditional).getElse()?.statements, depth, delay, weak, label, flag)
                }
            }
        }
        else if (statement instanceof Present) {
            transformPauses((statement as Present).thenStatements, depth, delay, weak, label, flag)
            (statement as Present).cases?.forEach[ c | transformPauses(c.statements, depth, delay, weak, label, flag)]
            transformPauses((statement as Present).elseStatements, depth, delay, weak, label, flag)
        }
        else if (statement instanceof IfTest) {
            transformPauses((statement as IfTest).thenStatements, depth, delay, weak, label, flag)
            (statement as IfTest).elseif?.forEach [ elsif | transformPauses(elsif.thenStatements, depth, delay, weak, label, flag)]
            transformPauses((statement as IfTest).elseStatements, depth, delay, weak, label, flag)
        }
        return statement
    }
    
    def void transformJoin(Statement statement, int depth, DelayExpr delay, boolean weak, Label label, ValuedObject flag) {
        var statements =  statement.getContainingList
        var pos = statements.indexOf(statement)
        var conditional = newIfThenGoto(delay.signalExpr, findClosestLabel(label, statement), false)
        conditional.annotations.add(createAnnotation(depth))
        if (delay.isImmediate && !weak) {
            // just for an immediate strong abort
            conditional = newIfThenGoto(delay.signalExpr, findClosestLabel(label, statement), false)
        } 
        else {
            conditional = newIfThenGoto(createValuedObjectReference(flag), findClosestLabel(label, statement), false)
        }
        insertConditional(statements, conditional, pos, depth)
    }
    
}