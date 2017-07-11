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
import java.util.LinkedList
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.scl.scl.Label
import java.util.Map
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.esterel.esterel.TrapExpression
import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.TrapReferenceExpr
import de.cau.cs.kieler.esterel.esterel.Run

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
//        return Sets.newHashSet()
//    }
//
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::HALT_ID,
            SCEstTransformation::LOCALSIGNALDECL_ID, SCEstTransformation::LOCALVARIABLE_ID,
            SCEstTransformation::AWAIT_ID, SCEstTransformation::SUSTAIN_ID,
            SCEstTransformation::DO_ID)
    }

    @Inject
    extension SCEstExtension
        
    def SCEstProgram transform(SCEstProgram prog) {
        prog.modules.forEach [ m | transformStatements(m.statements)]
        return prog
    }
    
    def EList<Statement> transformStatements(EList<Statement> statements) {
        for (var i=0; i<statements?.length; i++) {
            statements.get(i).transformStatement
        }
        return statements
    }
    
    def void transformStatement(Statement statement) {
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
                if ( t.type != ValueType.PURE ) {
                    var tempType = if (t.type == ValueType.DOUBLE) ValueType.FLOAT else t.type
                    var signalValue = createTrapVariable(t) 
                    var decl = createDeclaration(tempType, signalValue)
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
            var potInst = scope.statements.checkPotentiallyInstantaneous
            if (potInst.key) {
                scope.statements.transformPausesJoins(conditional, label, exitVariables, potInst.value)
            } 
            else {
                scope.statements.transformPausesJoins(conditional, label, exitVariables, false)
            }
            scope.statements.checkGotos
            
            // trap handler
            if (!trap.trapHandler.empty) {
                var parallel = createParallel
                scope.statements.add(parallel)
                // add a thread for each trap handler
                for( h : trap.trapHandler ) {
                    var Conditional conditional2
                    if (h.trapExpr instanceof ValuedObjectReference) {
                        var variable = exitVariables.get((h.trapExpr as ValuedObjectReference).valuedObject)?.key
                        conditional2 = createConditional(createValuedObjectReference(variable))
                    }
                    else {
                        h.trapExpr.transformReferences(exitVariables)
                        conditional2 = createConditional(h.trapExpr)
                    }
                    conditional2.statements.add(h.statements)
                    var thread = createThread(conditional2)
                    parallel.threads.add(thread)
                }
                transformReferences(parallel, exitVariables)
            }
            transformTrapExpressions(scope, exitVariables)
            statements.set(pos, scope)
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements)
            
            if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements)
                (statement as Abort).cases?.forEach[ c | transformStatements(c.statements)]
            }
            else if (statement instanceof Await) {
                (statement as Await).cases?.forEach[ c | transformStatements(c.statements)]
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
        else if (statement instanceof Run) {
            statement.module?.module?.statements.transformStatements    
        }
    }
    
    def boolean transformPausesJoins(EList<Statement> statements, Conditional conditional, Label label, Map<ISignal, Pair<ValuedObject, ValuedObject>> exitVariables, boolean criedWolf) {
        var cryingWolf = criedWolf
        for (var i=0; i<statements?.length; i++) {
            var pair = statements.get(i).transformPauseJoin(conditional, label, exitVariables, cryingWolf)
            cryingWolf = cryingWolf && pair.value
            i += pair.key
            // the offset is used to prevent the indefinite transformation of one specific pause 
        }
        return cryingWolf
    }
    
    def Pair<Integer, Boolean> transformPauseJoin(Statement statement, Conditional conditional, Label label, Map<ISignal, Pair<ValuedObject, ValuedObject>> exitVariables, boolean criedWolf) {
        
        // 'cryingWolf' stands for "transforming first pauses even if it is not necessary"
        var cryingWolf = criedWolf
        
        if (statement instanceof Pause) {
            if (!criedWolf) {
                transformPause(statement, conditional, label)
                return new Pair(1, false)
            }
            return new Pair(0, false)
        }
        else if (statement instanceof Exit) {
            statement.transformExit(label, exitVariables)
        }
        else if (statement instanceof EsterelParallel) {
            for (t : statement.threads) {
                cryingWolf = transformPausesJoins(t.statements, conditional, label, exitVariables, criedWolf) && criedWolf
            }
            transformJoin(statement, conditional, label)
        }
        else if (statement instanceof Parallel) {
            for (t : statement.threads) {
                cryingWolf = transformPausesJoins(t.statements, conditional, label, exitVariables, criedWolf) && criedWolf
            }
            transformJoin(statement, conditional, label)
        }
        else if (statement instanceof Conditional) {
            // Don't transform the pauses in generated Conditionals.
            var annotations = (statement as Conditional).annotations
            if (!isGenerated(annotations)) {
                cryingWolf = transformPausesJoins((statement as StatementContainer).statements, conditional, label, exitVariables, criedWolf) && cryingWolf
                cryingWolf = transformPausesJoins((statement as Conditional).getElse()?.statements, conditional, label, exitVariables, criedWolf) && cryingWolf
            }
        }
        else if (statement instanceof StatementContainer) {
            
            cryingWolf = transformPausesJoins((statement as StatementContainer).statements, conditional, label, exitVariables, criedWolf) && cryingWolf
            var temp = cryingWolf
            
            if (statement instanceof Trap) {
                for (h : statement.trapHandler) {
                    cryingWolf = transformPausesJoins(h.statements, conditional, label, exitVariables, temp) && cryingWolf
                }
            }
            else if (statement instanceof Abort) {
                cryingWolf = transformPausesJoins((statement as Abort).doStatements, conditional, label, exitVariables, cryingWolf) && cryingWolf
                temp = cryingWolf
                for (c : statement.cases) {
                    cryingWolf = transformPausesJoins(c.statements, conditional, label, exitVariables, temp) && cryingWolf
                }
            }
            else if (statement instanceof Await) {
                temp = cryingWolf
                for (c : statement.cases) {
                    cryingWolf = transformPausesJoins(c.statements, conditional, label, exitVariables, temp) && cryingWolf
                }
            }
            else if (statement instanceof Exec) {
                for (c : statement.execCaseList) {
                    cryingWolf = transformPausesJoins(c.statements, conditional, label, exitVariables, temp) && cryingWolf
                }
            }
            else if (statement instanceof Do) {
                cryingWolf = transformPausesJoins((statement as Do).watchingStatements, conditional, label, exitVariables, cryingWolf) && cryingWolf
            }
        }
        else if (statement instanceof Present) {
            cryingWolf = transformPausesJoins((statement as Present).thenStatements, conditional, label, exitVariables, criedWolf) && cryingWolf
            for (c : statement.cases) {
                cryingWolf = transformPausesJoins(c.statements, conditional, label, exitVariables, criedWolf) && cryingWolf
            }
            cryingWolf = transformPausesJoins((statement as Present).elseStatements, conditional, label, exitVariables, criedWolf) && cryingWolf
        }
        else if (statement instanceof IfTest) {
            cryingWolf = transformPausesJoins((statement as IfTest).thenStatements, conditional, label, exitVariables, criedWolf) && cryingWolf
            for (elsif : statement.elseif) {
                cryingWolf = transformPausesJoins(elsif.thenStatements, conditional, label, exitVariables, criedWolf) && cryingWolf
            }
            cryingWolf = transformPausesJoins((statement as IfTest).elseStatements, conditional, label, exitVariables, criedWolf) && cryingWolf
        }
        else if (statement instanceof Run) {
            cryingWolf = statement.module?.module?.statements.transformPausesJoins(conditional, label, exitVariables, criedWolf)    
        }
        
        return new Pair(0, cryingWolf)
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
    
    def transformReferences(EObject statement, Map<ISignal, Pair<ValuedObject, ValuedObject>> exitVariables) {
        // iterate over all valued object references contained in the scope
        // if a reference references a transformed signal then set the reference to the new signal
        var references = statement.eAllContents.filter(ValuedObjectReference)
        while (references.hasNext) {
            var ref = references.next
            if (ref.valuedObject instanceof ISignal) {
                var signal = ref.valuedObject as ISignal
                // if the valued object reference references a transformed trap signal
                if (exitVariables.containsKey(signal)) {
                    ref.valuedObject = exitVariables.get(signal).key
                    if(ref.eContainer.eGet(ref.eContainingFeature) instanceof EList) {
                        var list = ref.eContainer.eGet(ref.eContainingFeature) as EList<Expression>
                        var pos = list.indexOf(ref)
                        list.set(pos, createValuedObjectReference(ref.valuedObject))
                    }
                    else {
                        setExpression(createValuedObjectReference(ref.valuedObject), ref.eContainer, false)
                    }
                }
            }
        }
    }
    
    def transformTrapExpressions(Statement statement, Map<ISignal, Pair<ValuedObject, ValuedObject>> exitVariables) {
        var trapExpressions = statement.eAllContents.filter(TrapExpression)
        while (trapExpressions.hasNext) {
            var expr = trapExpressions.next
            if (expr.trap instanceof ISignal) {
                var signal = expr.trap as ISignal
                // if the trap references a transformed trap signal
                if (exitVariables.containsKey(signal)) {
                    if (exitVariables.get(signal).value != null) {
                        if(expr.eContainer.eGet(expr.eContainingFeature) instanceof EList) {
                            var list = expr.eContainer.eGet(expr.eContainingFeature) as EList<Expression>
                            var pos = list.indexOf(expr)
                            list.set(pos, createValuedObjectReference(exitVariables.get(signal).value))
                        }
                        else {
                            setExpression(createValuedObjectReference(exitVariables.get(signal).value), expr.eContainer, false)
                        }
                    }
                    else {
                        throw new UnsupportedOperationException("The following trap is not a valued trap! " + signal.name)
                    }
                }
            }
        }
    }
    
    /**
     * Checks whether the trap statement is potentially instantaneous or if no exit can be reached before a pause.
     */
    def Pair<Boolean, Boolean> checkPotentiallyInstantaneous(EList<Statement> statements) {
        var criedWolf = new Pair(false, true)
        for (var i=0; i<statements?.length; i++) {
            criedWolf = checkStatement(statements.get(i))
            if (criedWolf.key) {
                i = statements.length
            }
        }
        return criedWolf
    }
    
    def Pair<Boolean, Boolean> checkStatement(Statement statement) {
        
        // 'criedWolf' stands for "transforming first pauses even if it is not necessary"
        // the key stands for 'found a trap or pause' and the value stands for ' !(is potentially instantaneous) '
        var criedWolf = new Pair(false, true)
        
        if (statement instanceof Pause) {
           return new Pair(true, true)
        }
        if (statement instanceof Exit) {
            return new Pair(true, false)
        }
        else if (statement instanceof StatementContainer) {
            
            criedWolf = checkPotentiallyInstantaneous((statement as StatementContainer).statements)
            
            if (statement instanceof Trap) {
                for (h : (statement as Trap).trapHandler) {
                    var temp = checkPotentiallyInstantaneous(h.statements)
                    if (temp.key == true) {
                        criedWolf = new Pair(true, criedWolf.value && temp.value)
                    }
                }
            }
            else if (statement instanceof Abort) {
                var temp = checkPotentiallyInstantaneous((statement as Abort).doStatements)
                if (temp.key) {
                    criedWolf = new Pair(true, criedWolf.value && temp.value)
                }
                for (c : (statement as Abort).cases) {
                    temp = checkPotentiallyInstantaneous(c.statements)
                    if (temp.key == true) {
                        criedWolf = new Pair(true, criedWolf.value && temp.value)
                    }
                }
            }
            else if (statement instanceof Await) {
                for (c : (statement as Await).cases) {
                    var temp = checkPotentiallyInstantaneous(c.statements)
                    if (temp.key == true) {
                        criedWolf = new Pair(true, criedWolf.value && temp.value)
                    }
                }
            }
            else if (statement instanceof Exec) {
                for (c : (statement as Exec).execCaseList) {
                    var temp = checkPotentiallyInstantaneous(c.statements)
                    if (temp.key == true) {
                        criedWolf = new Pair(true, criedWolf.value && temp.value)
                    }
                }
            }
            else if (statement instanceof Do) {
                var temp = checkPotentiallyInstantaneous((statement as Do).watchingStatements)
                if (temp.key) {
                    criedWolf = new Pair(true, criedWolf.value && temp.value)
                }
            }
            else if (statement instanceof Conditional) {
                var temp = checkPotentiallyInstantaneous((statement as Conditional).getElse()?.statements)
                if (temp.key) {
                    criedWolf = new Pair(true, criedWolf.value && temp.value)
                }
            }
        }
        else if (statement instanceof Present) {
            var temp = checkPotentiallyInstantaneous((statement as Present).thenStatements)
            if (temp.key) {
                criedWolf = new Pair(true, criedWolf.value && temp.value)
            }
            for (c : (statement as Present).cases) {
                temp = checkPotentiallyInstantaneous((statement as Present).elseStatements)
                if (temp.key == true) {
                    criedWolf = new Pair(true, criedWolf.value && temp.value)
                }
            }
            temp = checkPotentiallyInstantaneous((statement as Present).elseStatements)
            if (temp.key) {
                criedWolf = new Pair(true, criedWolf.value && temp.value)
            }
        }
        else if (statement instanceof IfTest) {
            var temp = checkPotentiallyInstantaneous((statement as IfTest).thenStatements)
            if (temp.key) {
                criedWolf = new Pair(true, criedWolf.value && temp.value)
            }
            for (e : (statement as IfTest).elseif) {
                temp = checkPotentiallyInstantaneous(e.thenStatements)
                if (temp.key == true) {
                    criedWolf = new Pair(true, criedWolf.value && temp.value)
                }
            }
            temp = checkPotentiallyInstantaneous((statement as IfTest).elseStatements)
            if (temp.key) {
                criedWolf = new Pair(true, criedWolf.value && temp.value)
            }
        }
        else if (statement instanceof EsterelParallel) {
            for (t : (statement as EsterelParallel).threads) {
                var temp = checkPotentiallyInstantaneous(t.statements)
                if (temp.key == true) {
                    criedWolf = new Pair(true, criedWolf.value && temp.value)
                }
            }
        }
        else if (statement instanceof Parallel) {
            for (t : (statement as Parallel).threads) {
                var temp = checkPotentiallyInstantaneous(t.statements)
                if (temp.key == true) {
                    criedWolf = new Pair(true, criedWolf.value && temp.value)
                }
            }
        }
        else if (statement instanceof Run) {
            criedWolf = checkPotentiallyInstantaneous(statement.module?.module?.statements)    
        }
        return criedWolf
    }
    
}