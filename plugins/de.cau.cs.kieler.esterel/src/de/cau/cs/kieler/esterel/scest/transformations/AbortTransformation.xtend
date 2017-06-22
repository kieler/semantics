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
import de.cau.cs.kieler.esterel.esterel.Case
import java.util.LinkedList
import java.util.List

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
                // WEAK ABORT
                if (abort.weak) {
                    // e.g. "weak abort when immediate A"
                    if (abort.delay.isImmediate) {
                        var flag = createNewUniqueFlag(createBoolValue(false))
                        var decl = createDeclaration(ValueType.BOOL, flag)
                        var label = createLabel
                        // the order of the next three lines is crucial! (first trasformStatements, add(Label), then transformPauses)
                        abort.statements.transformStatements
                        abort.statements.add(label)
                        abort.statements.transformPauses(abort, label, flag, null, null)
                        scope.declarations.add(decl)
                        scope.statements.add(abort.statements)
                        statements.set(pos,scope)
                    }
                    // e.g. "weak abort when A" or "weak abort when 3 A"
                    else {
                        var abortFlag = createNewUniqueFlag(createBoolValue(false))
                        var depthFlag = createNewUniqueFlag(createBoolValue(false))
                        var decl = createDeclaration(ValueType.BOOL, abortFlag)
                        var label = createLabel
                        // the order of the next three lines is crucial! (first trasformStatements, add(Label), then transformPauses)
                        abort.statements.transformStatements
                        abort.statements.add(label)
                        decl.valuedObjects.add(depthFlag)
                        scope.declarations.add(decl)
                        abort.statements.transformPauses(abort, label, abortFlag, depthFlag, null)
                        scope.statements.add(abort.statements)
                        statements.set(pos,scope)
                    }
                }
                // STRONG ABORT
                else {
                    // e.g. "abort when immediate A"
                    if (abort.delay.isImmediate) {
                        var label = createLabel
                        var conditional = newIfThenGoto(EcoreUtil.copy(abort.delay.signalExpr), label, false)
                        // the order of the next three lines is crucial! (first trasformStatements, add(Label), then transformPauses)
                        abort.statements.transformStatements
                        abort.statements.add(label)
                        abort.statements.transformPauses(abort, label, null, null, null)
                        scope.statements.add(conditional)
                        scope.statements.add(abort.statements)
                        statements.set(pos, scope)
                    }
                    // e.g. "abort when A" or "abort when 3 A"
                    else {
                        var flag = createNewUniqueFlag(createBoolValue(false))
                        var decl = createDeclaration(ValueType.BOOL, flag)
                        var label = createLabel
                        // the order of the next three lines is crucial! (first trasformStatements, add(Label), then transformPauses)
                        abort.statements.transformStatements
                        abort.statements.add(label)
                        abort.statements.transformPauses(abort, label, flag, null, null)
                        scope.declarations.add(decl)
                        scope.statements.add(abort.statements)
                        statements.set(pos,scope)
                    }
                }
            }
            // ABORT CASES
            else {
                
                // TODO cases
                
                // WEAK ABORT
                if (abort.weak) {
                    
                }
                // STRONG ABORT
                else {
                    var countingVariables = new LinkedList<ValuedObject>()
                    var abortFlag = createNewUniqueFlag(createBoolValue(false))
                    var depthFlag = createNewUniqueFlag(createBoolValue(false))
                    var decl = createDeclaration(ValueType.BOOL, abortFlag)
                    decl.valuedObjects.add(depthFlag)
                    var label = createLabel
                    var label2 = createLabel
                    abort.statements.transformStatements
                    abort.statements.add(label)
                    for ( c : abort.cases ) {
                        // creating counting variables for cases with an expression before the signal expression
                        if (c.delay.expr != null) {
                            var variable = createNewUniqueVariable(createIntValue(0))
                            var decl2 = createDeclaration(ValueType.INT, variable)
                            countingVariables.add(variable)
                            scope.declarations.add(decl2)    
                        }
                        // adding if of immediate case before the statements which should be aborted
                        else if (c.delay.isIsImmediate) {
                            var conditional = newIfThenGoto(EcoreUtil.copy(c.delay.signalExpr), label, false)
                            conditional.annotations.add(createAnnotation(getDepth(abort)))
                            scope.statements.add(conditional)
                        }
                    }
                    abort.statements.transformPauses(abort, label, abortFlag, depthFlag, countingVariables)
                    scope.declarations.add(decl)
                    scope.statements.add(abort.statements)
                    var i = 0
                    // adding the do blocks of the cases after label
                    for ( c : abort.cases ) {
                        var Conditional conditional
                        if (c.delay.isIsImmediate) {
                            conditional = newIfThenGoto(EcoreUtil.copy(c.delay.signalExpr), label2, false)
                        }
                        else if (c.delay.expr == null) {
                            conditional = newIfThenGoto(createAnd(EcoreUtil.copy(c.delay.signalExpr), createValuedObjectReference(depthFlag)), label2, false)
                        }
                        else {
                            countingVariables.get(i)
                            conditional = newIfThenGoto(createGEQ(createValuedObjectReference(countingVariables.get(i)), EcoreUtil.copy(c.delay.expr)), label2, false)
                            i++
                        }
                        conditional.statements.add(0, c.statements)
                        scope.statements.add(conditional)
                    }
                    scope.statements.add(label2)
                    statements.set(pos,scope)
                }
                
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
    
    def EList<Statement> transformPauses(EList<Statement> statements, Abort abort, Label label, ValuedObject abortFlag, ValuedObject depthFlag, List<ValuedObject> countingVariables) {
        for (var i=0; i<statements?.length; i++) {
            var offsetI = statements.get(i).transformPause(abort, label, abortFlag, depthFlag, countingVariables)
            i += offsetI
        }
        return statements
    }
    
    def int transformPause(Statement statement, Abort abort, Label label, ValuedObject abortFlag, ValuedObject depthFlag, List<ValuedObject> countingVariables) {
        if (statement instanceof Pause) {
            var statements =  statement.getContainingList
            var pos = statements.indexOf(statement)
            var label2 = findClosestLabel(label, statement)
            
            // ABORT CASES
            if (abort.delay == null) {
                return transformCases(statements, statement, abort, label2, abortFlag, depthFlag, countingVariables)
            }
            // WEAK ABORT
            if (abort.weak) {
                // e.g. "weak abort immediate A"
                if (abort.delay.isImmediate) {
                    if (label2 != null) {
                        var conditional = newIfThenGoto(abort.delay.signalExpr, label2, false)
                        conditional.annotations.add(createAnnotation(getDepth(abort)))
                        conditional.statements.add(0, createAssignment(abortFlag, createBoolValue(true)))
                        insertConditionalAbove(statements, conditional, pos, getDepth(abort))
                        return 1
                    }
                }
                else {
                    // e.g. "weak abort when A"
                    if (abort.delay.expr == null && label2 != null) {
                        var expr = createAnd(EcoreUtil.copy(abort.delay.signalExpr), createValuedObjectReference(depthFlag))
                        var conditional = newIfThenGoto(expr, label2, false)
                        conditional.annotations.add(createAnnotation(getDepth(abort)))
                        conditional.statements.add(0, createAssignment(abortFlag, createBoolValue(true)))
                        statements.add(pos+1, createAssignment(depthFlag, createBoolValue(true)))
                        insertConditionalAbove(statements, conditional, pos, getDepth(abort))
                        return 2
                    }
                    // e.g. "weak abort when 3 A"
                    else {
                        if (label2 != null) {
                            scopeWithDecl(statements, pos, abort.delay.expr, abort.delay.signalExpr, label2, getDepth(abort), abortFlag, depthFlag)
                            return 3
                        }
                    }
                }
            }
            // STRONG ABORT
            else {
                // e.g. "abort immediate A"
                if (abort.delay.isImmediate) {
                    if (label2 != null) {
                        var conditional = newIfThenGoto(abort.delay.signalExpr, label2, false)
                        conditional.annotations.add(createAnnotation(getDepth(abort)))
                        insertConditional(statements, conditional, pos, getDepth(abort))
                    }
                }
                else {
                    // e.g. "abort when A"
                    if (abort.delay.expr == null && label2 != null) {
                        var conditional = newIfThenGoto(abort.delay.signalExpr, label2, false)
                        conditional.annotations.add(createAnnotation(getDepth(abort)))
                        conditional.statements.add(0, createAssignment(abortFlag, createBoolValue(true)))
                        insertConditional(statements, conditional, pos, getDepth(abort))
                    }
                    // e.g. "abort when 3 A"
                    else {
                        if (label2 != null) {
                            scopeWithDecl(statements, pos, abort.delay.expr, abort.delay.signalExpr, label2, getDepth(abort), abortFlag)
                        }
                    }
                }
                return 0
            }
            
            return 0
        }
        
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads?.forEach [ t |
                transformPauses(t.statements, abort, label, abortFlag, depthFlag, countingVariables)
            ]
            transformJoin(statement, abort, label, abortFlag)
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads?.forEach [ t |
                transformPauses(t.statements, abort, label, abortFlag, depthFlag, countingVariables)
            ]
            transformJoin(statement, abort, label, abortFlag)
            
        }
        else if (statement instanceof StatementContainer) {
            if (!(statement instanceof Conditional)) {
                transformPauses((statement as StatementContainer).statements, abort, label, abortFlag, depthFlag, countingVariables)
            }
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler?.forEach[h | transformPauses(h.statements, abort, label, abortFlag, depthFlag, countingVariables)]
            }
            else if (statement instanceof Abort) {
                transformPauses((statement as Abort).doStatements, abort, label, abortFlag, depthFlag, countingVariables)
                (statement as Abort).cases?.forEach[ c | transformPauses(c.statements, abort, label, abortFlag, depthFlag, countingVariables)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList?.forEach[ c | transformPauses(c.statements, abort, label, abortFlag, depthFlag, countingVariables)]
            }
            else if (statement instanceof Do) {
                transformPauses((statement as Do).watchingStatements, abort, label, abortFlag, depthFlag, countingVariables)
            }
            else if (statement instanceof Conditional) {
                // Don't transform the pauses in generated Conditionals.
                var annotations = (statement as Conditional).annotations
                if (!isGenerated(annotations)) {
                    transformPauses((statement as StatementContainer).statements, abort, label, abortFlag, depthFlag, countingVariables)
                    transformPauses((statement as Conditional).getElse()?.statements, abort, label, abortFlag, depthFlag, countingVariables)
                }
            }
        }
        else if (statement instanceof Present) {
            transformPauses((statement as Present).thenStatements, abort, label, abortFlag, depthFlag, countingVariables)
            (statement as Present).cases?.forEach[ c | transformPauses(c.statements, abort, label, abortFlag, depthFlag, countingVariables)]
            transformPauses((statement as Present).elseStatements, abort, label, abortFlag, depthFlag, countingVariables)
        }
        else if (statement instanceof IfTest) {
            transformPauses((statement as IfTest).thenStatements, abort, label, abortFlag, depthFlag, countingVariables)
            (statement as IfTest).elseif?.forEach [ elsif | transformPauses(elsif.thenStatements, abort, label, abortFlag, depthFlag, countingVariables)]
            transformPauses((statement as IfTest).elseStatements, abort, label, abortFlag, depthFlag, countingVariables)
        }
        return 0
    }
    
    def void transformJoin(Statement statement, Abort abort, Label label, ValuedObject flag) {
        var statements =  statement.getContainingList
        var pos = statements.indexOf(statement)
        var conditional = newIfThenGoto(abort.delay?.signalExpr, findClosestLabel(label, statement), false)
        conditional.annotations.add(createAnnotation(getDepth(abort)))
        if (abort.delay?.isImmediate && !abort.weak) {
            // just for an immediate strong abort
            conditional = newIfThenGoto(abort.delay?.signalExpr, findClosestLabel(label, statement), false)
        } 
        else {
            conditional = newIfThenGoto(createValuedObjectReference(flag), findClosestLabel(label, statement), false)
        }
        insertConditional(statements, conditional, pos, getDepth(abort))
    }
    
    def int transformCases(EList<Statement> statements, Statement statement, Abort abort, Label label, ValuedObject abortFlag, ValuedObject depthFlag, List<ValuedObject> countingVariables) {
        var pos = statements.indexOf(statement)
        var countConditionals = 0
        if (abort.weak) {
            return 0
        }
        else {
            var i = 0
            for (c : abort.cases) {
                if (c.delay.expr != null) {
                    var conditional = createConditional(EcoreUtil.copy(c.delay.signalExpr))
                    conditional.statements.add(incrementInt(countingVariables.get(i)))
                    conditional.annotations.add(createAnnotation(0))
                    statements.add(pos+1, conditional)
                    var conditional2 = newIfThenGoto(createGEQ(createValuedObjectReference(countingVariables.get(i)), EcoreUtil.copy(c.delay.expr)), label, false)
                    conditional2.statements.add(0, createAssignment(abortFlag, createBoolValue(true)))
                    conditional2.annotations.add(createAnnotation(getDepth(abort)))
                    insertConditional(statements, conditional2, pos, getDepth(abort))
                    i++
                    countConditionals += 2
                }
                else {
                    var conditional = newIfThenGoto(EcoreUtil.copy(c.delay.signalExpr), label, false)
                    conditional.statements.add(0, createAssignment(abortFlag, createBoolValue(true)))
                    conditional.annotations.add(createAnnotation(getDepth(abort)))
                    insertConditional(statements, conditional, pos, getDepth(abort))
                    countConditionals++
                }
            }
            statements.add(pos+1, createAssignment(depthFlag, createBoolValue(true)))
            return countConditionals+1
        }
        
        
        
    }
    
}