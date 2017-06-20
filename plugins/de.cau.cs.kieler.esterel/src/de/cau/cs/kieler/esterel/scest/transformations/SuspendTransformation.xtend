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
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject

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
        
    override getProducesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::IFTEST_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::AWAIT_ID)
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
    
    // TODO A Transformation for "weak suspend", which was introduced with Esterel v7, is not implemented.
    
    def Statement transformStatement(Statement statement) {
        if (statement instanceof Suspend) {
            var suspend = statement as Suspend
            var statements = getContainingList(statement)
            var pos = statements.indexOf(statement)
            var depth = suspend.getDepth
            // without this if statement the first statement of suspend.statements could be not checked in next cycle of transformStatements
            if (!suspend.statements.empty) {
                suspend.statements.get(0).transformStatement
            }
            if (suspend.delay.expr != null) {
                var scope = createScopeStatement
                var variable = createNewUniqueVariable(createIntValue(0))
                scope.declarations.add(createDeclaration(ValueType.INT, variable))
                transformStatements(suspend.statements)
                transformPauses(suspend.statements, depth, EcoreUtil.copy(suspend.delay), variable)
                scope.statements.add(suspend.statements)
                statements.set(pos, scope)
                return null
            }
            else {
                transformPauses(suspend.statements, depth, EcoreUtil.copy(suspend.delay), null)
            }
            if (suspend.delay.isImmediate) {
                var label = createLabel
                statements.set(pos, label)
                statements.add(pos+1, newIfThenGoto(EcoreUtil.copy(suspend.delay.signalExpr), label, true))
                statements.add(pos+2, suspend.statements)
            }
            else {
                statements.add(pos, suspend.statements)
                statements.remove(statement)
            }
            return null
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements)
            
            if (statement instanceof Trap) {
                if ((statement as Trap).trapHandler != null) {
                    (statement as Trap).trapHandler.forEach[h | transformStatements(h.statements)]
                }
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements)
                if ((statement as Abort).cases != null) {
                    (statement as Abort).cases.forEach[ c | transformStatements(c.statements)]
                }
            }
            else if (statement instanceof Exec) {
                if ((statement as Exec).execCaseList != null) {
                    (statement as Exec).execCaseList.forEach[ c | transformStatements(c.statements)]
                }
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements)
            }
            else if (statement instanceof Conditional) {
                if ((statement as Conditional).getElse() != null) {
                    transformStatements((statement as Conditional).getElse().statements)
                }
            }
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).thenStatements)
            if ((statement as Present).cases != null) {
                (statement as Present).cases.forEach[ c | transformStatements(c.statements)]
            }
            transformStatements((statement as Present).elseStatements)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).thenStatements)
            if ((statement as IfTest).elseif != null) {
                (statement as IfTest).elseif.forEach [ elsif | transformStatements(elsif.thenStatements)]
            }
            transformStatements((statement as IfTest).elseStatements)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads.forEach [ t |
                transformStatements(t.statements)
            ]
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                transformStatements(t.statements)
            ]
        }
        return statement
    }
    
    def EList<Statement> transformPauses(EList<Statement> statements, int depth, DelayExpr expr, ValuedObject variable) {
        for (var i=0; i<statements?.length; i++) {
            var statement = statements.get(i).transformPause(depth, expr, variable)
            if (statement instanceof Statement) {
                statements.set(i, statement)
            }
            else if (statement == null) {
                i = i+1 
                // a label was added before the pause statement, so
                // without 'i=i+1' pause would be transformed indefinitely often
            }
        }
        return statements
    }
    
    def Statement transformPause(Statement statement, int depth, DelayExpr expr, ValuedObject variable) {
        if (statement instanceof Pause) {
            // it is not possible to transform "suspend p when 3 A" because in this transformation delay.expr is not checked. 
            var statements = getContainingList(statement)
            var pos = statements.indexOf(statement)
            var label = createLabel
            var Conditional conditional
            if (expr.expr != null && variable != null) {
                var Conditional conditional2
                conditional2  = createConditional(expr.signalExpr)
                conditional2.statements.add(incrementInt(variable))
                conditional2.annotations.add(createAnnotation(0))
                statements.add(pos+1, conditional2)
                conditional =  newIfThenGoto(createLT(createValuedObjectReference(variable), expr.expr), label, false)
            }
            else {
                conditional = newIfThenGoto(EcoreUtil.copy(expr.signalExpr), label, false)
            }
            conditional.annotations.add(createAnnotation(depth))
            insertConditional(statements, conditional, pos, depth)
            statements.add(pos, label)
            return null
        }
        else if (statement instanceof StatementContainer) {
            if (!(statement instanceof Conditional)) {
                transformPauses((statement as StatementContainer).statements, depth, expr, variable)
            }
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler?.forEach[h | transformPauses(h.statements, depth, expr, variable)]
            }
            else if (statement instanceof Abort) {
                transformPauses((statement as Abort).doStatements, depth, expr, variable)
                (statement as Abort).cases?.forEach[ c | transformPauses(c.statements, depth, expr, variable)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList?.forEach[ c | transformPauses(c.statements, depth, expr, variable)]
            }
            else if (statement instanceof Do) {
                transformPauses((statement as Do).watchingStatements, depth, expr, variable)
            }
            else if (statement instanceof Conditional) {
                // Don't transform the pauses in generated Conditionals.
                var annotations = (statement as Conditional).annotations
                if (!isGenerated(annotations)) {
                    transformPauses((statement as StatementContainer).statements, depth, expr, variable)
                    transformPauses((statement as Conditional).getElse()?.statements, depth, expr, variable)
                }
            }
        }
        else if (statement instanceof Present) {
            transformPauses((statement as Present).thenStatements, depth, expr, variable)
            (statement as Present).cases?.forEach[ c | transformPauses(c.statements, depth, expr, variable)]
            transformPauses((statement as Present).elseStatements, depth, expr, variable)
        }
        else if (statement instanceof IfTest) {
            transformPauses((statement as IfTest).thenStatements, depth, expr, variable)
            (statement as IfTest).elseif?.forEach [ elsif | transformPauses(elsif.thenStatements, depth, expr, variable)]
            transformPauses((statement as IfTest).elseStatements, depth, expr, variable)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads?.forEach [ t |
                transformPauses(t.statements, depth, expr, variable)
            ]
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads?.forEach [ t |
                transformPauses(t.statements, depth, expr, variable)
            ]
        }
        return statement
    }
    
}