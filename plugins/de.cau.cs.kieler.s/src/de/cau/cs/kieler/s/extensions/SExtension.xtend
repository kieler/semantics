/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.s.extensions

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.common.collect.ImmutableList
import java.util.List
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.BoolValue
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.s.s.State
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.s.s.Join
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.If
import de.cau.cs.kieler.s.s.Trans
import de.cau.cs.kieler.s.s.Abort
import de.cau.cs.kieler.s.s.Emit
import de.cau.cs.kieler.s.s.Pause
import de.cau.cs.kieler.s.s.Fork
import de.cau.cs.kieler.s.s.Term
import de.cau.cs.kieler.s.s.Halt
import de.cau.cs.kieler.s.s.Prio
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import com.google.inject.Inject
import de.cau.cs.kieler.s.s.HostCodeInstruction
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.s.s.Assignment

/**
 * S Extensions. 
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class SExtension { 
    
    @Inject
    extension KExpressionsExtension
    

    // This prefix is used for namings of all generated signals, states and regions
    static final String GENERATED_PREFIX = "_"
    
//    public val Injector i = ActionsStandaloneSetup::doSetup();
//    public val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
//    public val ISerializer serializer = i.getInstance(typeof(ISerializer));
    

    //-------------------------------------------------------------------------
    //--             B A S I C   C R E A T I O N   M E T H O D S             --
    //-------------------------------------------------------------------------
    
    // Create an immutable list copy
    def ImmutableList<Object> immutableCopy(Iterable<Object> object) {
        ImmutableList::copyOf(object)    
    }
    
    def State createSState() {
        return SFactory::eINSTANCE.createState
    }
    
    def State setName2(State state, String name) {
        state.setName(name)
        state
    }
    
    def State createSState(String name) {
        return createSState.setName2(name)
    }
   
    def State createSState(Program program, String name) {
        val state = createSState.setName2(name)
        program.states.add(state)
        state
    }
    
    def Join createJoin() {
        SFactory::eINSTANCE.createJoin()
    }
    
    def Join joinElseContinueAt(State continuation) {
        val join = createJoin
        join.setContinuation(continuation)
        join
    }
    
    def State addInstruction(State state, Instruction instruction) {
        state.instructions.add(instruction)
        state
    }
    
   
    // Create IF instruction. 
    def If createIf(Expression expression) {
        val instruction = SFactory::eINSTANCE.createIf()
        instruction.setExpression(expression)
        instruction
    }

    // Create a fork to a continuation label.
    def Fork forkTo(State state, State continuation, int priority) {
         val fork = SFactory::eINSTANCE.createFork()
         fork.setContinuation(continuation)
         fork.setPriority(priority)
         state.instructions.add(fork)
         fork
    }

    
    // Create a transition to a continuation label.
    def Trans transitionTo(State state, State continuation) {
         val transition = SFactory::eINSTANCE.createTrans()
         transition.setContinuation(continuation)
         state.instructions.add(transition)
         transition
    }

    // Create a transition to a continuation label.
    def Trans transitionTo(If ifInstruction, State continuation) {
         val transition = SFactory::eINSTANCE.createTrans()
         transition.setContinuation(continuation)
         ifInstruction.instructions.add(transition)
         transition
    }
    
    // Create an abort instruction.
    def Abort createAbort() {
         SFactory::eINSTANCE.createAbort
    }

    // Create an term instruction.
    def Term createTerm() {
         SFactory::eINSTANCE.createTerm
    }

    // Create an term instruction.
    def Halt createHalt() {
         SFactory::eINSTANCE.createHalt
    }
    
    // Create an assignment.
    def Assignment assign(ValuedObject valuedObject, Expression expression) {
        val assignmentInstruction = SFactory::eINSTANCE.createAssignment
        assignmentInstruction.expression = expression;
        assignmentInstruction.variable = valuedObject;
        assignmentInstruction
    }
    
    
    // Create a pure emission.
    def Emit createEmit(ValuedObject valuedObject) {
        val emitInstruction = SFactory::eINSTANCE.createEmit
        emitInstruction.setSignal(valuedObject)
        emitInstruction
    }

    // Create host code instruction.
    def HostCodeInstruction createHostCode(String hostCodeString) {
        val hostCodeInstruction = SFactory::eINSTANCE.createHostCodeInstruction
//        hostCodeInstruction.setHostCode(createTextExpression => [ text = hostCodeString ])
        hostCodeInstruction.setHostCode("'" + hostCodeString + "'")
        hostCodeInstruction
    }

    // Create host code instruction.
//    def HostCodeInstruction createHostCode(TextExpression hostCode) {
//        val hostCodeInstruction = SFactory::eINSTANCE.createHostCodeInstruction
////        hostCodeInstruction.setHostCode(hostCode)
////        hostCodeInstruction.setHostCode("'" + hostCodeString + "'")
//        hostCodeInstruction
//    }
    
    // Create a valued emission.
    def Emit createEmit(ValuedObject valuedObject, Expression expression) {
        val emitInstruction = valuedObject.createEmit
        emitInstruction.setValue(expression)
        emitInstruction
    }
    
    // Create a pause instruction.
    def Pause createPause() {
        val pauseInstruction = SFactory::eINSTANCE.createPause
        pauseInstruction
    }

    // Create an Prio instruction.
    def Prio createPrio(int priority) {
         val priorityInstruction = SFactory::eINSTANCE.createPrio
         priorityInstruction.setPriority(priority)
         priorityInstruction
    }

    // -------------------------------------------------------------------------   
      
}
