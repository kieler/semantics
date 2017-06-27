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
import java.util.HashMap
import de.cau.cs.kieler.esterel.esterel.ISignal
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.Declaration
import java.util.LinkedList
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.scl.scl.Label
import java.util.Map
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference

/**
 * @author mrb
 *
 */
class TrapTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::TRAP_ID
    }

    override getName() {
        return SCEstTransformation::TRAP_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::TRAP_ID
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
        for (var i=0; i<statements?.length; i++) {
            var statement = statements.get(i).transformStatement
            if (statement instanceof Statement) {
                statements.set(i, statement)
            }
        }
        return statements
    }
    
    def Statement transformStatement(Statement statement) {
        if (statement instanceof Trap) {
            var trap = statement as Trap
            var statements = statement.getContainingList
            var pos = statements.indexOf(statement)
            var scope = createScopeStatement
            var depth = trap.getDepth
            var HashMap<ISignal, Pair<ValuedObject, ValuedObject>> exitVariables = new HashMap<ISignal, Pair<ValuedObject, ValuedObject>>()
            var signalDecl = createDeclaration(ValueType.BOOL, null)
            var signals = new LinkedList<ValuedObject>()
            var Conditional conditional
            var label = createLabel
            scope.declarations.add(signalDecl)
            // create a representation for each trap signal
            for ( t : trap.trapSignals) {
                var signal = createTrapVariable(createBoolValue(false), t.name)
                signalDecl.valuedObjects.add(signal)
                signals.add(signal)
                // if a trap signal is a valued signal, create a second variable for the value
                if ( (t.type != ValueType.PURE) && (t.type != null || t.typeID != null) ) {
                    var signalValue = createTrapVariable(t) 
                    var Declaration decl
                    if (t.type == ValueType.INT) {
                        decl = createDeclaration(ValueType.INT, signalValue)
                    }
                    else if (t.type == ValueType.BOOL) {
                        decl = createDeclaration(ValueType.BOOL, signalValue)
                    }
                    else if (t.type == ValueType.FLOAT || t.type == ValueType.DOUBLE) {
                        decl = createDeclaration(ValueType.FLOAT, signalValue)
                    }
                    else if (t.type == ValueType.STRING) {
                        decl = createDeclaration(ValueType.STRING, signalValue)
                    }
                    else if (t.type == ValueType.HOST) {
                        decl = createDeclaration(ValueType.HOST, signalValue)
                    }
                    else if (t.type == ValueType.UNSIGNED) {
                        decl = createDeclaration(ValueType.UNSIGNED, signalValue)
                    }
                    else if (t.type == ValueType.PURE) {
                        decl = createDeclaration(ValueType.PURE, signalValue)
                    }
                    scope.declarations.add(decl)
                    exitVariables.put(t, new Pair(signal, signalValue))
                }
                else {
                    exitVariables.put(t, new Pair(signal, null))
                }
            }
            // create a conditional statement which will be placed before the pauses and after the joins
            if (!signals.empty) {
                if (signals.length>1) {
                    var expr = createOr(createValuedObjectReference(signals.head), createValuedObjectReference(signals.get(1)))
                    for ( var i=2; i<signals.length; i++ ) {
                        expr.subExpressions.add(createValuedObjectReference(signals.get(i)))
                    }
                    conditional = createConditional(expr)
                }
                else {
                    conditional = createConditional(createValuedObjectReference(signals.head))
                }
            }
            else {
                // shouldn't be possible
                conditional = createConditional(createBoolValue(false))
            }
            conditional.annotations.add(createAnnotation(depth))
            trap.statements.transformStatements
            scope.statements.add(trap.statements)
            scope.statements.add(label)
            statements.set(pos, scope)
            scope.statements.transformPausesJoins(conditional, label, exitVariables)
            scope.statements.checkGotos
            
            // trap handler
            if (!trap.trapHandler.empty) {
                var parallel = createParallel
                scope.statements.add(parallel)
                // add a thread for each trap handler
                for( h : trap.trapHandler ) {
                    var variable = exitVariables.get((h.trapExpr as ValuedObjectReference)?.valuedObject)?.key
                    var conditional2 = createConditional(createValuedObjectReference(variable))
                    conditional2.statements.add(h.statements)
                    var thread = createThread(conditional2)
                    parallel.threads.add(thread)
                }
            }
            
            return scope
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements)
            
            if (statement instanceof Abort) {
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
    
    def EList<Statement> transformPausesJoins(EList<Statement> statements, Conditional conditional, Label label, Map<ISignal, Pair<ValuedObject, ValuedObject>> exitVariables) {
        for (var i=0; i<statements?.length; i++) {
            var offsetI = statements.get(i).transformPauseJoin(conditional, label, exitVariables)
            i += offsetI
            // the offset is used to prevent the indefinite transformation of one specific pause 
        }
        return statements
    }
    
    def int transformPauseJoin(Statement statement, Conditional conditional, Label label, Map<ISignal, Pair<ValuedObject, ValuedObject>> exitVariables) {
        if (statement instanceof Pause) {
            transformPause(statement, conditional, label)
            return 1
        }
        else if (statement instanceof Exit) {
            statement.transformExit(label, exitVariables)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads?.forEach [ t |
                transformPausesJoins(t.statements, conditional, label, exitVariables)
            ]
            transformJoin(statement, conditional, label)
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads?.forEach [ t |
                transformPausesJoins(t.statements, conditional, label, exitVariables)
            ]
            transformJoin(statement, conditional, label)
        }
        else if (statement instanceof StatementContainer) {
            
            transformPausesJoins((statement as StatementContainer).statements, conditional, label, exitVariables)
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler?.forEach[h | transformPausesJoins(h.statements, conditional, label, exitVariables)]
            }
            else if (statement instanceof Abort) {
                transformPausesJoins((statement as Abort).doStatements, conditional, label, exitVariables)
                (statement as Abort).cases?.forEach[ c | transformPausesJoins(c.statements, conditional, label, exitVariables)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList?.forEach[ c | transformPausesJoins(c.statements, conditional, label, exitVariables)]
            }
            else if (statement instanceof Do) {
                transformPausesJoins((statement as Do).watchingStatements, conditional, label, exitVariables)
            }
            else if (statement instanceof Conditional) {
                // Don't transform the pauses in generated Conditionals.
                var annotations = (statement as Conditional).annotations
                if (!isGenerated(annotations)) {
                    transformPausesJoins((statement as StatementContainer).statements, conditional, label, exitVariables)
                    transformPausesJoins((statement as Conditional).getElse()?.statements, conditional, label, exitVariables)
                }
            }
        }
        else if (statement instanceof Present) {
            transformPausesJoins((statement as Present).thenStatements, conditional, label, exitVariables)
            (statement as Present).cases?.forEach[ c | transformPausesJoins(c.statements, conditional, label, exitVariables)]
            transformPausesJoins((statement as Present).elseStatements, conditional, label, exitVariables)
        }
        else if (statement instanceof IfTest) {
            transformPausesJoins((statement as IfTest).thenStatements, conditional, label, exitVariables)
            (statement as IfTest).elseif?.forEach [ elsif | transformPausesJoins(elsif.thenStatements, conditional, label, exitVariables)]
            transformPausesJoins((statement as IfTest).elseStatements, conditional, label, exitVariables)
        }
        return 0
    }
    
    def transformPause(Statement statement, Conditional conditional, Label label) {
        var statements =  statement.getContainingList
        var pos = statements.indexOf(statement)
        var goto = createGotoStatement(findClosestLabel(label, statement))
        var conditional2 = EcoreUtil.copy(conditional)
        conditional2.statements.add(goto)
        insertConditionalAbove(statements, conditional2, pos, conditional.depth)
    }
    
    def transformJoin(Statement statement, Conditional conditional, Label label) {
        var statements =  statement.getContainingList
        var pos = statements.indexOf(statement)
        var goto = createGotoStatement(findClosestLabel(label, statement))
        var conditional2 = EcoreUtil.copy(conditional)
        conditional2.statements.add(goto)
        insertConditional(statements, conditional2, pos, conditional.depth)
    }
    
    def transformExit(Statement statement, Label label, Map<ISignal, Pair<ValuedObject, ValuedObject>> exitVariables) {
        var exit = statement as Exit
        var statements =  statement.getContainingList
        var pos = statements.indexOf(statement)
        var pair = exitVariables.get(exit.trap)
        var assignment = createAssignment(pair.key, createBoolValue(true))
        statements.set(pos, createGotoStatement(findClosestLabel(label, statement)))
        statements.add(pos, assignment)
        // if it's a valued exit
        if ( exit.expression != null && pair.value != null) {
            var operator = pair.value.combineOperator
            var OperatorType newOperator
            if (operator == CombineOperator.ADD) {
                newOperator = OperatorType.ADD
            }
            else if (operator == CombineOperator.MULT) {
                newOperator = OperatorType.MULT
            }
            else if (operator == CombineOperator.OR) {
                newOperator = OperatorType.LOGICAL_OR
            }
            else if (operator == CombineOperator.AND) {
                newOperator = OperatorType.LOGICAL_AND
            }
            else {
                throw new UnsupportedOperationException("The following combine operator is not supported! " + operator.toString)
            }
            var expr = createOperatorExpression(createValuedObjectReference(pair.value), exit.expression, newOperator)
            statements.add(pos+1, createAssignment(pair.value, expr))
        }
    }
    
}