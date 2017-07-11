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
import de.cau.cs.kieler.esterel.esterel.ISignal
import de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl
import de.cau.cs.kieler.esterel.scest.scest.Set
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.esterel.esterel.Input
import de.cau.cs.kieler.esterel.esterel.Output
import de.cau.cs.kieler.esterel.esterel.InputOutput
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.esterel.scest.extensions.NewSignals
import de.cau.cs.kieler.scl.scl.ScopeStatement
import java.util.HashMap
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.Module

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
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID
        )
    }

    @Inject
    extension SCEstExtension
    
    /*
     *  TODO only the signals with type != null will be transformed
     *  signals with typeID != null are not handled
     *  SCL doesn't allow anything else then the predefined types
     *  see KExt.xtext => Declaration
    */
    
    /*
     * This transformation has to be done before the local signal transformation because the local signal transformation
     * writes also in the end its signals to "newSignals" in SCEstExtension.
     * Therefore this transformation would also iterate over the local signals when "createParallelForSignals" is called.
     */
    
    def SCEstProgram transform(SCEstProgram prog) {
        for (m : prog.modules) { 
            m.intSignalDecls.transformSignals(m)
//            transformStatements(m.statements)
//            m.intSignalDecls.clear
        }
        return prog
    }
    
    def transformSignals(EList<InterfaceSignalDecl> signalDecl, Module module) {
        var ScopeStatement scope = module.getIScope
        for (interfaceSD : signalDecl) {
            for (signal : interfaceSD.signals) {
                var s = createSignalVariable(createFalse, null, signal.name)
                var decl = createDeclaration(ValueType.BOOL, s)
                var Declaration decl2 = createDeclaration(null, null)
                if (signal.type != null) {
                    scope.declarations.add(decl)
                    if (signal.type == ValueType.PURE) {
                        newSignals.put(signal, new NewSignals(s))
                    }
                    else {
                        var s_set = createSignalVariable(createFalse, null, signal.name + "_set")
                        decl.valuedObjects.add(s_set)
                        var s_cur = createSignalVariable(null, signal.combineOperator, signal.name + "_cur")
                        var s_val = createSignalVariable(signal.expression, signal.combineOperator, signal.name + "_val")
                        var tempType = if (signal.type == ValueType.DOUBLE) ValueType.FLOAT else signal.type
                        decl2 = createDeclaration(tempType, null)
                        decl2.valuedObjects.add(s_cur)
                        decl2.valuedObjects.add(s_val)
                        newSignals.put(signal, new NewSignals(s, s_set, s_cur, s_val))
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
        createParallelForSignals(scope, newSignals)
        scope.transformReferences
    }
    
    def createParallelForSignals(ScopeStatement scope, HashMap<ISignal, NewSignals> signalsMap) {
        var necessary = false
        var it = signalsMap.keySet.iterator
        while (!necessary && it.hasNext) {
            var ISignal signal = it.next
            necessary = necessary || (signal.type != ValueType.PURE) || 
                            (signal.eContainer instanceof Output) || (signal.eContainer instanceof LocalSignalDecl)
        }
        if (necessary) {
            var term = createNewUniqueTermFlag(createFalse)
            var decl = createDeclaration(ValueType.BOOL, term)
            var parallel = createParallel
            var thread1 = createThread
            var thread2 = createThread
            parallel.threads.add(thread1)
            parallel.threads.add(thread2)
            thread2.statements.add(scope.statements)
            thread2.statements.add(createAssignment(term, createTrue))
            scope.statements.add(parallel)
            scope.declarations.add(decl)
            
            // thread1 statements: the initializations of the output signals
            var label = createLabel
            thread1.statements.add(label)
            it = signalsMap.keySet.iterator
            while (it.hasNext) {
                var signal = it.next
                var keyValue = signalsMap.get(signal)
                var s = keyValue.s
                if (signal.type != ValueType.PURE) {
                    var s_set = keyValue.s_set
                    var s_cur = keyValue.s_cur
                    var s_val = keyValue.s_val
                    if (signal.eContainer instanceof Output) {
                        var assign1 = createAssignment(s, createFalse)
                        thread1.statements.add(assign1)
                    }
                    else if (signal.eContainer instanceof LocalSignalDecl) {
                        var assign1 = createAssignment(s, createFalse)
                        thread1.statements.add(assign1)
                    }
                    var assign2 = createAssignment(s_set, createFalse)
                    thread1.statements.add(assign2)
                    var conditional1 = createConditional(createNot(createValuedObjectReference(s_set)))
                    var assign3 = createAssignment(s_cur, getNeutral(s_cur.combineOperator))
                    conditional1.statements.add(assign3)
                    thread1.statements.add(conditional1)
                    var conditional2 = createConditional(createValuedObjectReference(s))
                    var assign4 = createAssignment(s_val, createValuedObjectReference(s_cur))
                    conditional2.statements.add(assign4)
                    thread1.statements.add(conditional2)
                    
                }
                else if (signal.eContainer instanceof Output) {
                    var assign1 = createAssignment(s, createFalse)
                    thread1.statements.add(assign1)
                }
                else if (signal.eContainer instanceof LocalSignalDecl) {
                    var assign1 = createAssignment(s, createFalse)
                    thread1.statements.add(assign1)
                }
            }
            var conditional = newIfThenGoto(createNot(createValuedObjectReference(term)), label, true)
            thread1.statements.add(conditional)
        }
    }
    
}