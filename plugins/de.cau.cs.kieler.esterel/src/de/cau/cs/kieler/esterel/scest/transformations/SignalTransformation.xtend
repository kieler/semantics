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
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.scest.scest.UnEmit
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import java.util.HashMap
import de.cau.cs.kieler.esterel.esterel.ISignal
import de.cau.cs.kieler.kexpressions.ValuedObject
import java.util.Map
import de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl
import de.cau.cs.kieler.esterel.scest.scest.Set
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.esterel.esterel.Input
import de.cau.cs.kieler.esterel.esterel.Output
import de.cau.cs.kieler.esterel.esterel.InputOutput
import de.cau.cs.kieler.esterel.esterel.Return
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.esterel.scest.scest.SCEstModule
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.OperatorType

/**
 * @author mrb
 *
 */
class  SignalTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::SIGNAL_ID
    }

    override getName() {
        return SCEstTransformation::SIGNAL_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::SIGNAL_ID
    }
    
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID)
    }

    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(SCEstProgram prog) {
        // for valued singals: signal S will be transformed to s, s_set, s_cur, s_val
        var HashMap<ISignal, Pair<Pair<ValuedObject, ValuedObject>, Pair<ValuedObject, ValuedObject>>> newSignals = 
                new HashMap<ISignal, Pair<Pair<ValuedObject, ValuedObject>, Pair<ValuedObject, ValuedObject>>>()
        for (m : prog.modules) {
            m.intSignalDecls.transformSignals(newSignals, m)
            transformStatements(m.statements, newSignals)
            m.intSignalDecls.clear
        }
        return prog
    }
    
    def EList<Statement> transformStatements(EList<Statement> statements, 
            Map<ISignal, Pair<Pair<ValuedObject, ValuedObject>, Pair<ValuedObject, ValuedObject>>> newSignals ) {
        for (var i=0; i<statements?.length; i++) {
            statements.get(i).transformStatement(newSignals)
        }
        return statements
    }
    
    def transformStatement(Statement statement, 
            Map<ISignal, Pair<Pair<ValuedObject, ValuedObject>, Pair<ValuedObject, ValuedObject>>> newSignals) {
        if (statement instanceof Emit) {
            transformEmit(statement, newSignals)
        }
        else if (statement instanceof UnEmit) {
            transformUnEmit(statement, newSignals)
        }
        else if (statement instanceof Set) {
            transformSet(statement, newSignals)
        }
        else if (statement instanceof LocalSignalDecl) {
            transformLocalSignal(statement, newSignals)
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements, newSignals)
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler?.forEach[h | transformStatements(h.statements, newSignals)]
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements, newSignals)
                (statement as Abort).cases?.forEach[ c | transformStatements(c.statements, newSignals)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList?.forEach[ c | transformStatements(c.statements, newSignals)]
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements, newSignals)
            }
            else if (statement instanceof Conditional) {
                transformStatements((statement as Conditional).getElse()?.statements, newSignals)
            }
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).thenStatements, newSignals)
            (statement as Present).cases?.forEach[ c | transformStatements(c.statements, newSignals)]
            transformStatements((statement as Present).elseStatements, newSignals)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).thenStatements, newSignals)
            (statement as IfTest).elseif?.forEach [ elsif | transformStatements(elsif.thenStatements, newSignals)]
            transformStatements((statement as IfTest).elseStatements, newSignals)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads.forEach [ t |
                transformStatements(t.statements, newSignals)
            ]
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                transformStatements(t.statements, newSignals)
            ]
        }
    }
    
    def transformSignals(EList<InterfaceSignalDecl> signalDecl, 
        Map<ISignal, Pair<Pair<ValuedObject, ValuedObject>, Pair<ValuedObject, ValuedObject>>> newSignals, SCEstModule module
    ) {
        var scope = createScopeStatement
        scope.statements.add(module.statements)
        module.statements.add(scope)
        for (interfaceSD : signalDecl) {
            for (signal : interfaceSD.signals) {
                var s = createSignalVariable(createBoolValue(false), null, signal.name)
                var decl = createDeclaration(ValueType.BOOL, s)
                var Declaration decl2 = createDeclaration(null, null)
                if (signal.type != null) {
                    scope.declarations.add(decl)
                    if (signal.type == ValueType.PURE) {
                        newSignals.put(signal, 
                            new Pair(new Pair(s, null), new Pair(null, null))
                        )
                    }
                    else {
                        var s_set = createSignalVariable(createBoolValue(false), null, signal.name + "_set")
                        decl.valuedObjects.add(s_set)
                        var s_val = createSignalVariable(signal.expression, signal.combineOperator, signal.name + "_val")
                        var tempType = if (signal.type == ValueType.DOUBLE) ValueType.FLOAT else signal.type
                        decl2 = createDeclaration(tempType, null)
                        decl2.valuedObjects.add(s_val)
                        var ValuedObject s_cur
                        if (signal.combineOperator != null) {
                            s_cur = createSignalVariable(null, signal.combineOperator, signal.name + "_cur")
                        }
                        else {
                            s_cur = createSignalVariable(null, signal.combineOperator, signal.name + "_cur")
                        }
                        decl2.valuedObjects.add(s_cur)
                        newSignals.put(signal, 
                            new Pair(new Pair(s, s_set), new Pair(s_cur, s_val))
                        )
                        scope.declarations.add(decl2)
                    }
                }
                else { // shouldn't be possible
                    throw new UnsupportedOperationException(
                        "The following signal doesn't have a type! " + signal.name)
                }
                if (interfaceSD instanceof Input) {
                    decl.input = true
                    decl2.input = true
                }
                else if (interfaceSD instanceof Output) {
                    decl.output = true
                    decl2.output = true
                }
                else if (interfaceSD instanceof InputOutput) {
                    decl.input = true
                    decl.output = true
                    decl2.input = true
                    decl2.output = true
                }
                else { 
                    // Return can't be displayed in SCL
                }
            }
        }
    }
    
    def transformEmit(Statement statement, 
        Map<ISignal, Pair<Pair<ValuedObject, ValuedObject>, Pair<ValuedObject, ValuedObject>>> newSignals
    ) {
        var emit = statement as Emit
        var signal = emit.signal
        if (newSignals.containsKey(signal)) {
            var statements = statement.getContainingList
            var pos = statements.indexOf(statement)
            var s = newSignals.get(signal).key.key
            var expr = createOperatorExpression(createValuedObjectReference(s), createBoolValue(true), OperatorType.LOGICAL_OR)
            if (emit.expr == null) {
                statements.set(pos, createAssignment(s, expr))
            }
            else {
                // TODO
            }
        }
    }
    
    def transformUnEmit(Statement statement, 
        Map<ISignal, Pair<Pair<ValuedObject, ValuedObject>, Pair<ValuedObject, ValuedObject>>> newSignals
    ) {
        var unEmit = statement as UnEmit
        var signal = unEmit.signal
        if (newSignals.containsKey(signal)) {
            var statements = statement.getContainingList
            var pos = statements.indexOf(statement)
            var s = newSignals.get(signal).key.key
            statements.set(pos, createAssignment(s, createBoolValue(false)))
        }
    }
    
    def transformSet(Statement statement, 
        Map<ISignal, Pair<Pair<ValuedObject, ValuedObject>, Pair<ValuedObject, ValuedObject>>> newSignals
    ) {
        
    }
    
    def transformLocalSignal(Statement statement, 
        Map<ISignal, Pair<Pair<ValuedObject, ValuedObject>, Pair<ValuedObject, ValuedObject>>> newSignals
    ) {
        
    }
    
    def Expression getNeutral(CombineOperator op) {
        switch op {
            case CombineOperator.ADD:
                return createIntValue(0)
            case CombineOperator.MULT:
                return createIntValue(1)
            case CombineOperator.OR :
                return createBoolValue(false)
            case CombineOperator.AND :
                return createBoolValue(true)
// TODO 
//            case CombineOperator.NONE
            default : {
                throw new UnsupportedOperationException(
                        "No neutral Element for: " + op.toString)
            }
        }
    }


    
}