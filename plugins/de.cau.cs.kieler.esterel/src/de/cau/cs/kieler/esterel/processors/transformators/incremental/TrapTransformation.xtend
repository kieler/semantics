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
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import java.util.Map
import java.util.List
import java.util.HashMap
import java.util.LinkedList
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.Exit
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.esterel.TrapSignal
import de.cau.cs.kieler.esterel.TrapExpression
import de.cau.cs.kieler.esterel.TrapReference
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.Pause
import de.cau.cs.kieler.scl.Statement
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData

/**
 * @author mrb
 *
 */
class TrapTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.trap"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Trap"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    var EObject lastStatement
    
    override process() {
        val nextStatement = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM).getObject
        val isDynamicCompilation = environment.getProperty(SCEstIntermediateProcessor.DYNAMIC_COMPILATION)
        
        if (isDynamicCompilation) {
            if (nextStatement instanceof Trap) {
                transform(nextStatement)
            }
            else {
                throw new UnsupportedOperationException(
                    "The next statement to transform and this processor do not match.\n" +
                    "This processor ID: " + ID + "\n" +
                    "The statement to transform: " + nextStatement
                )
            }
            environment.setProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM, new EObjectReferencePropertyData(lastStatement))
        }
        else {
            model.eAllContents.filter(Trap).toList.forEach[transform]
        }
    }
    
    def transform(Trap trap) {
        val signalDecl = createDeclaration(ValueType.BOOL, null)
        val scope = createScopeStatement(signalDecl)
        val HashMap<Signal, Pair<ValuedObject, ValuedObject>> exitVariables = new HashMap<Signal, Pair<ValuedObject, ValuedObject>>()
        val signals = new LinkedList<ValuedObject>()
        var Conditional conditional
        val label = createLabel
        // create a representation for each trap signal
        for ( t : trap.trapSignals) {
            var signal = createTrapVariable(createFalse, t.name)
            signalDecl.valuedObjects.add(signal)
            signals.add(signal)
            // if a trap signal is a valued signal, create a second variable for the value
            if ( t.type != ValueType.PURE ) {
                val tempType = if (t.type == ValueType.DOUBLE) ValueType.FLOAT else t.type
                val signalValue = createTrapVariable(t) 
                val decl = createDeclaration(tempType, signalValue)
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
                val expr = createOr(createValuedObjectReference(signals.head), createValuedObjectReference(signals.get(1)))
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
            conditional = createConditional(createFalse)
        }
        scope.statements.addAll(trap.statements)
        scope.statements.add(label)
        scope.transformPausesAndJoinsAndExits(conditional, label, exitVariables)
        // trap handler
        if (!trap.trapHandler.empty) {
            val parallel = createParallel
            scope.statements.add(parallel)
            // add a thread for each trap handler
            for( h : trap.trapHandler ) {
                var Conditional conditional2
                if (h.expression instanceof TrapReference) {
                    val variable = exitVariables.get((h.expression as TrapReference).valuedObject)?.key
                    conditional2 = createConditional(createValuedObjectReference(variable))
                }
                else {
                    h.expression.transformReferences(exitVariables)
                    conditional2 = createConditional(h.expression)
                }
                conditional2.statements.addAll(h.statements)
                val thread = createThread(conditional2)
                parallel.threads.add(thread)
            }
            transformReferences(parallel, exitVariables)
        }
        transformTrapExpressions(scope, exitVariables)
        trap.replace(scope)      
        lastStatement = scope  
    }
    
    def transformPausesAndJoinsAndExits(Statement statement, Conditional conditional, Label label, Map<Signal, Pair<ValuedObject, ValuedObject>> exitVariables) {
        val exits = statement.eAllContents.filter(Exit).toList
        val pauses = statement.eAllContents.filter(Pause).toList
        val List<Statement> parallels = statement.eAllContents.filter(Parallel).toList
        parallels.addAll(statement.eAllContents.filter(EsterelParallel).toList)
        pauses.forEach[ p | p.transformPauseOrJoin(conditional, label) ]
        parallels.forEach[ p | p.transformPauseOrJoin(conditional, label)]
        exits.forEach[ e | e.transformExit(label, exitVariables)]
    }
    
    def transformPauseOrJoin(Statement statement, Conditional conditional, Label label) {
        val statements =  statement.getContainingList
        val pos = statements.indexOf(statement)
        val goto = createGotoStatement(findClosestLabel(label, statement))
        val conditional2 = copy(conditional)
        conditional2.statements.add(goto)
        if (statement instanceof Pause) {
            insertConditionalAbove(statement, conditional2)
        }
        else {
            statements.add(pos+1, conditional2)
        }
    }
    
    def transformExit(Exit exit, Label label, Map<Signal, Pair<ValuedObject, ValuedObject>> exitVariables) {
        val statements =  exit.getContainingList
        val pos = statements.indexOf(exit)
        if (!exitVariables.containsKey(exit.trap)) {
            return
        }
        val pair = exitVariables.get(exit.trap)
        val assignment = createAssignment(pair.key, createTrue)
        statements.set(pos, createGotoStatement(findClosestLabel(label, exit)))
        statements.add(pos, assignment)
        // if it's a valued exit
        if ( exit.expression !== null && pair.value !== null) {
            val operator = pair.value.combineOperator
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
    
    def transformReferences(EObject statement, Map<Signal, Pair<ValuedObject, ValuedObject>> exitVariables) {
        // iterate over all valued object references contained in the scope
        // if a reference references a transformed signal then set the reference to the new signal
        val references = statement.eAllContents.filter(TrapReference).toList
        for (ref : references) {
            val signal = ref.valuedObject as TrapSignal
            // if the valued object reference references a transformed trap signal
            if (exitVariables.containsKey(signal)) {
                ref.replace(createValuedObjectReference(exitVariables.get(signal).key))
            }
        }
    }
    
    def transformTrapExpressions(Statement statement, Map<Signal, Pair<ValuedObject, ValuedObject>> exitVariables) {
        val trapExpressions = statement.eAllContents.filter(TrapExpression).toList
        for (expr : trapExpressions) {
            if (expr.trap instanceof TrapSignal) {
                val signal = expr.trap as TrapSignal
                // if the trap references a transformed trap signal
                if (exitVariables.containsKey(signal)) {
                    if (exitVariables.get(signal).value !== null) {
                        expr.replace(createValuedObjectReference(exitVariables.get(signal).value))
                    }
                    else {
                        throw new UnsupportedOperationException("The following trap is not a valued trap! " + signal.name)
                    }
                }
            }
        }
    }
    
    
    
//        the following lines began in line 127
//        val potInst = scope.statements.checkPotentiallyInstantaneous
//        if (potInst.key) {
//            scope.statements.transformPausesJoins(conditional, label, exitVariables, potInst.value)
//        } 
//        else {
//            scope.statements.transformPausesJoins(conditional, label, exitVariables, false)
//        }
//        scope.statements.checkGotos
    
    
    
//    /**
//     * Checks whether the trap statement is potentially instantaneous or if no exit can be reached before a pause.
//     */
//    def Pair<Boolean, Boolean> checkPotentiallyInstantaneous(EList<Statement> statements) {
//        var criedWolf = new Pair(false, true)
//        for (var i=0; i<statements?.length; i++) {
//            criedWolf = checkStatement(statements.get(i))
//            if (criedWolf.key) {
//                i = statements.length
//            }
//        }
//        return criedWolf
//    }
//    
//    def Pair<Boolean, Boolean> checkStatement(Statement statement) {
//        
//        // 'criedWolf' stands for "transforming first pauses even if it is not necessary"
//        // the key stands for 'found a trap or pause' and the value stands for ' !(is potentially instantaneous) '
//        var criedWolf = new Pair(false, true)
//        
//        if (statement instanceof Pause) {
//           return new Pair(true, true)
//        }
//        if (statement instanceof Exit) {
//            return new Pair(true, false)
//        }
//        else if (statement instanceof Present) {
//            var temp = checkPotentiallyInstantaneous((statement as Present).statements)
//            if (temp.key) {
//                criedWolf = new Pair(true, criedWolf.value && temp.value)
//            }
//            for (c : (statement as Present).cases) {
//                temp = checkPotentiallyInstantaneous((statement as Present).elseStatements)
//                if (temp.key == true) {
//                    criedWolf = new Pair(true, criedWolf.value && temp.value)
//                }
//            }
//            temp = checkPotentiallyInstantaneous((statement as Present).elseStatements)
//            if (temp.key) {
//                criedWolf = new Pair(true, criedWolf.value && temp.value)
//            }
//        }
//        else if (statement instanceof IfTest) {
//            var temp = checkPotentiallyInstantaneous((statement as IfTest).statements)
//            if (temp.key) {
//                criedWolf = new Pair(true, criedWolf.value && temp.value)
//            }
//            for (e : (statement as IfTest).elseif) {
//                temp = checkPotentiallyInstantaneous(e.statements)
//                if (temp.key == true) {
//                    criedWolf = new Pair(true, criedWolf.value && temp.value)
//                }
//            }
//            temp = checkPotentiallyInstantaneous((statement as IfTest).elseStatements)
//            if (temp.key) {
//                criedWolf = new Pair(true, criedWolf.value && temp.value)
//            }
//        }
//        else if (statement instanceof EsterelParallel) {
//            for (t : (statement as EsterelParallel).threads) {
//                var temp = checkPotentiallyInstantaneous(t.statements)
//                if (temp.key == true) {
//                    criedWolf = new Pair(true, criedWolf.value && temp.value)
//                }
//            }
//        }
//        else if (statement instanceof StatementContainer) {
//            
//            criedWolf = checkPotentiallyInstantaneous((statement as StatementContainer).statements)
//            
//            if (statement instanceof Trap) {
//                for (h : (statement as Trap).trapHandler) {
//                    var temp = checkPotentiallyInstantaneous(h.statements)
//                    if (temp.key == true) {
//                        criedWolf = new Pair(true, criedWolf.value && temp.value)
//                    }
//                }
//            }
//            else if (statement instanceof Abort) {
//                var temp = checkPotentiallyInstantaneous((statement as Abort).doStatements)
//                if (temp.key) {
//                    criedWolf = new Pair(true, criedWolf.value && temp.value)
//                }
//                for (c : (statement as Abort).cases) {
//                    temp = checkPotentiallyInstantaneous(c.statements)
//                    if (temp.key == true) {
//                        criedWolf = new Pair(true, criedWolf.value && temp.value)
//                    }
//                }
//            }
//            else if (statement instanceof Await) {
//                for (c : (statement as Await).cases) {
//                    var temp = checkPotentiallyInstantaneous(c.statements)
//                    if (temp.key == true) {
//                        criedWolf = new Pair(true, criedWolf.value && temp.value)
//                    }
//                }
//            }
//            else if (statement instanceof Exec) {
//                for (c : (statement as Exec).execCaseList) {
//                    var temp = checkPotentiallyInstantaneous(c.statements)
//                    if (temp.key == true) {
//                        criedWolf = new Pair(true, criedWolf.value && temp.value)
//                    }
//                }
//            }
//            else if (statement instanceof Do) {
//                var temp = checkPotentiallyInstantaneous((statement as Do).watchingStatements)
//                if (temp.key) {
//                    criedWolf = new Pair(true, criedWolf.value && temp.value)
//                }
//            }
//            else if (statement instanceof Conditional) {
//                var temp = checkPotentiallyInstantaneous((statement as Conditional).getElse()?.statements)
//                if (temp.key) {
//                    criedWolf = new Pair(true, criedWolf.value && temp.value)
//                }
//            }
//        }
//        else if (statement instanceof Parallel) {
//            for (t : (statement as Parallel).threads) {
//                var temp = checkPotentiallyInstantaneous(t.statements)
//                if (temp.key == true) {
//                    criedWolf = new Pair(true, criedWolf.value && temp.value)
//                }
//            }
//        }
//        else if (statement instanceof Run) {
//            criedWolf = checkPotentiallyInstantaneous(statement.module?.module?.statements)    
//        }
//        return criedWolf
//    }
//    
//    def boolean transformPausesJoins(EList<Statement> statements, Conditional conditional, Label label, Map<Signal, Pair<ValuedObject, ValuedObject>> exitVariables, boolean criedWolf) {
//        var cryingWolf = criedWolf
//        for (var i=0; i<statements?.length; i++) {
//            var pair = statements.get(i).transformPauseJoin(conditional, label, exitVariables, cryingWolf)
//            cryingWolf = cryingWolf && pair.value
//            i += pair.key
//            // the offset is used to prevent the indefinite transformation of one specific pause 
//        }
//        return cryingWolf
//    }
//    
//    def Pair<Integer, Boolean> transformPauseJoin(Statement statement, Conditional conditional, Label label, Map<Signal, Pair<ValuedObject, ValuedObject>> exitVariables, boolean criedWolf) {
//        
//        // 'cryingWolf' stands for "transforming first pauses even if it is not necessary"
//        var cryingWolf = criedWolf
//        
//        if (statement instanceof Pause) {
//            if (!criedWolf) {
//                transformPause(statement, conditional, label)
//                return new Pair(1, false)
//            }
//            return new Pair(0, false)
//        }
//        else if (statement instanceof Exit) {
//            statement.transformExit(label, exitVariables)
//        }
//        else if (statement instanceof EsterelParallel) {
//            for (t : statement.threads) {
//                cryingWolf = transformPausesJoins(t.statements, conditional, label, exitVariables, criedWolf) && criedWolf
//            }
//            transformJoin(statement, conditional, label)
//        }
//        else if (statement instanceof Parallel) {
//            for (t : statement.threads) {
//                cryingWolf = transformPausesJoins(t.statements, conditional, label, exitVariables, criedWolf) && criedWolf
//            }
//            transformJoin(statement, conditional, label)
//        }
//        else if (statement instanceof Conditional) {
//            // Don't transform the pauses in generated Conditionals.
//            var annotations = (statement as Conditional).annotations
//            if (!isGenerated(annotations)) {
//                cryingWolf = transformPausesJoins((statement as StatementContainer).statements, conditional, label, exitVariables, criedWolf) && cryingWolf
//                cryingWolf = transformPausesJoins((statement as Conditional).getElse()?.statements, conditional, label, exitVariables, criedWolf) && cryingWolf
//            }
//        }
//        else if (statement instanceof Present) {
//            cryingWolf = transformPausesJoins((statement as Present).statements, conditional, label, exitVariables, criedWolf) && cryingWolf
//            for (c : statement.cases) {
//                cryingWolf = transformPausesJoins(c.statements, conditional, label, exitVariables, criedWolf) && cryingWolf
//            }
//            cryingWolf = transformPausesJoins((statement as Present).elseStatements, conditional, label, exitVariables, criedWolf) && cryingWolf
//        }
//        else if (statement instanceof IfTest) {
//            cryingWolf = transformPausesJoins((statement as IfTest).statements, conditional, label, exitVariables, criedWolf) && cryingWolf
//            for (elsif : statement.elseif) {
//                cryingWolf = transformPausesJoins(elsif.statements, conditional, label, exitVariables, criedWolf) && cryingWolf
//            }
//            cryingWolf = transformPausesJoins((statement as IfTest).elseStatements, conditional, label, exitVariables, criedWolf) && cryingWolf
//        }
//        else if (statement instanceof StatementContainer) {
//            
//            cryingWolf = transformPausesJoins((statement as StatementContainer).statements, conditional, label, exitVariables, criedWolf) && cryingWolf
//            var temp = cryingWolf
//            
//            if (statement instanceof Trap) {
//                for (h : statement.trapHandler) {
//                    cryingWolf = transformPausesJoins(h.statements, conditional, label, exitVariables, temp) && cryingWolf
//                }
//            }
//            else if (statement instanceof Abort) {
//                cryingWolf = transformPausesJoins((statement as Abort).doStatements, conditional, label, exitVariables, cryingWolf) && cryingWolf
//                temp = cryingWolf
//                for (c : statement.cases) {
//                    cryingWolf = transformPausesJoins(c.statements, conditional, label, exitVariables, temp) && cryingWolf
//                }
//            }
//            else if (statement instanceof Await) {
//                temp = cryingWolf
//                for (c : statement.cases) {
//                    cryingWolf = transformPausesJoins(c.statements, conditional, label, exitVariables, temp) && cryingWolf
//                }
//            }
//            else if (statement instanceof Exec) {
//                for (c : statement.execCaseList) {
//                    cryingWolf = transformPausesJoins(c.statements, conditional, label, exitVariables, temp) && cryingWolf
//                }
//            }
//            else if (statement instanceof Do) {
//                cryingWolf = transformPausesJoins((statement as Do).watchingStatements, conditional, label, exitVariables, cryingWolf) && cryingWolf
//            }
//        }
//        else if (statement instanceof Run) {
//            cryingWolf = statement.module?.module?.statements.transformPausesJoins(conditional, label, exitVariables, criedWolf)    
//        }
//        
//        return new Pair(0, cryingWolf)
//    }
    
}