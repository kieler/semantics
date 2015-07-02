/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.yakindu.sccharts.scl.xtend

import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.extensions.SCLNamingExtensions
import de.cau.cs.kieler.scl.extensions.SCLOrderingExtensions
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import java.util.ArrayList
import javax.inject.Inject
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.sgraph.Statechart

import de.cau.cs.kieler.yakindu.sccharts.coresccharts.xtend.SCCExtensions
import java.util.List
import java.util.EnumSet
import de.cau.cs.kieler.yakindu.sccharts.scl.xtend.SCLOptimizations

/**
 * @author ssm
 *
 */
 
 /* This is the main transformation class of the SCL transformation. It makes use of the SCL extensions 
  * and the optimization class in this package. As stated in the optimization class all necessary code for
  * the (naive) transformation should be placed here and optional optimization code in the optimization class.
  */
class CoreToSCLTransformation {
    
    @Inject
    extension SCLCreateExtensions
    @Inject
    extension SCLOrderingExtensions
    @Inject
    extension SCLNamingExtensions
    @Inject
    extension SCLStatementExtensions
    @Inject
    extension SCCExtensions        
    @Inject
    extension CoreToSCLOptimization
 
    //-------------------------------------------------------------------------
    //--          C O R E   TO   S C L -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           

    /* Main method to transform a core scchart to a scl program.
     * 
     * The given statechart will be transformed to a scl program. You can select specific optimizations 
     * in the second parameter. Possible optimizations are listed in the optimization class.
     * 
     * This method will create the declarations of the scl program and calls the function to transform 
     * the main state. Including regions and states will be transformed recursively.
     */ 
    def Program transformCoreToSCL(Statechart rootStatechart, EnumSet<SCLOptimizations> optimizations) {
        var targetProgram = SclFactory::eINSTANCE.createProgram();

        // Since yakindu statecharts begin with a region our main state is the first state in the first
        // region.        
        val mainState = rootStatechart.regions.get(0).vertices.get(0) as SyncState

        // The name of the program is the name of the main state.       
        targetProgram.setName(mainState.name)

        // Add all declarations of the main state to the declaration of the program.
        for(declaration : mainState.scopes.get(0).declarations) {
           targetProgram.definitions.add(createVariableDefinition(declaration));
        }
        
        // Create a list of statements for the main state (and all including regions and states) and
        // add them to the program.
        var statements = transformCoreState(mainState, optimizations)        
        targetProgram.statements.addAll(statements)
       
        targetProgram
    }


    /* Transforms a region of a scchart to a list of scl statements.
     * 
     * The method calls the state transformation method for every state in this region and selected 
     * optimization are invoked. 
     */
    def List<Statement> transformCoreRegion(Region region, EnumSet<SCLOptimizations> optimizations) {
        var newStatements = createNewStatementList()
        
        // List of all states in this region. 
        val states = ImmutableList::copyOf(region.getVertices.filter(typeof(SyncState))).
          sort(e1, e2 | compareSCLRegionStateOrder(e1, e2))

        // TODO: Add scl comment for this region.

        // In order to execute the state position optimization all statement lists are stored in an array.
        var stateInstructions = new ArrayList<ArrayList<Statement>>
        for (state : states) {
            stateInstructions.add(transformCoreState(state, optimizations) as ArrayList<Statement>)
        }
        
        // If selected execute the state position optimization.
        if (optimizations.contains(SCLOptimizations::STATEPOSITION)) {
            stateInstructions = stateInstructions.optimizeStateSetPosition
        }
        
        // Add all statements to the new list. 
        for(stateSet : stateInstructions) {
            newStatements.addAll(stateSet)
        }
        
        // Run optimizations if selected.
        if (optimizations.contains(SCLOptimizations::GOTO)) 
            newStatements = newStatements.optimizeGoto 
        if (optimizations.contains(SCLOptimizations::LABEL)) 
            newStatements = newStatements.optimizeLabel 
        
        newStatements
    }
    

    /* Transforms a state of a scchart to a list of scl statements.
     * 
     * This method checks, whether or not the state is a composite state. If it is a composite state, 
     * the transformation for included regions is invoked and outgoing transitions are processed. 
     * If it is not and if the state is not a final state, all transitions are transformed. 
     * If the state is a final state, nothing besides adding a label is done.
     */
    def List<Statement> transformCoreState(SyncState state, EnumSet<SCLOptimizations> optimizations) {
        var newStatements = createNewStatementList()
        
        // The ID of the state is its hierarchical name.
        val stateID = state.getHierarchicalName("")
       
        // TODO: Add scl comment for this state. 
        
        if (state.isComposite()) {
            // The state is a composite state.         
            
            // If there is only one region, the code of that region can be added without further processing.
            // If there are more regions, a parallel statement has to be created.
            if (state.getRegions().size<2) {
                var regionInstructions =  transformCoreRegion(state.getRegions().head, optimizations)
                newStatements.addAll(regionInstructions)
            } else {
                var parallel = SclFactory::eINSTANCE.createParallel();
                for(stateRegion : state.getRegions()) {
                    val regionInstructions = transformCoreRegion(stateRegion, optimizations)
                    parallel.getThreads().add(createSCLThread(regionInstructions))
                }
                newStatements.add(parallel.createStatement)
            }
            
            // Process normal terminations and add assignment statements for every transition trigger.
            for(transition : state.getNormalterminations) {
                val targetState = transition.target as SyncState 
              
                // TODO: Create conditionals for every guard.
             
                val effect = transition.getEffect()
                if (effect != null) newStatements.addAll(createSCLAssignment(effect).createStatements)
              
                var goto = createSCLGoto(targetState.getHierarchicalName(""))
                newStatements.add(goto.createStatement)
            }
             
        } else {
            // The state is not a composite state.
        
            if (!state.isFinal) {
                // And the state is not a final state.
                // Add statements of the transitions transformation.
                newStatements.addAll(state.transformStateTransitions(optimizations))
            } 
        } 

        // If no statement is in the list, add an empty statement to enable the addition of a label.       
//        if (newStatements.size==0) newStatements.add(createSCLEmptyStatement)
//        newStatements.head.label = stateID;
        if (stateID != "_") {  
            val emptyStatement = createSCLEmptyStatement
            emptyStatement.label = stateID
            newStatements.add(0, emptyStatement)
        }
        
        newStatements        
    }
    
    
    /* This transformation creates all statements of all transitions of a state.
     * 
     * The function uses a naive approach and creates a conditional for every transition. The guards of a
     * transition are transformed to the expression of the conditional, whereas the actions create 
     * scl assignments.
     * 
     * Immediate transitions are tested first. Then, a pause statement is added and all non immediate
     * transitions are processed.
     * 
     * If the SELFLOOP OPTIMIZATION is selected and it is possible to swap the statement lists, the 
     * method for this optimization is called.
     */
    def List<Statement> transformStateTransitions(SyncState state, EnumSet<SCLOptimizations> optimizations) {
        var iS = createNewStatementList()
        
        // Create lists for all transitions, immediate transitions and transitions to self.
        val transitions = state.outgoingTransitions.filter(typeof(SyncTransition))
        val immediateTransitions = ImmutableList::copyOf(transitions.filter(e | e.isImmediate))
        var selfTransitions = transitions.filter(e | 
            (e.target instanceof SyncState) && ((e.target as SyncState) == state))
            
        // Signals whether or not a default transition (a transition without guard) is present.
        var boolean defaultTransition = false
        
        // Create a list of Statements for all immediate transitions.
        var immediateStatements = createNewStatementList()    
     
        // Invoke the transformation method for transitions for every immediate transition.
        // If a default transition is present, set the flag.
        for(transition : immediateTransitions) {
                val targetStatements = transformStateTransition(transition)
                if (targetStatements.last?.getInstruction instanceof Goto) defaultTransition = true
                immediateStatements.addAll(targetStatements)
        }
                
        // If no non-immediate transition are present, the state is a transient state. 
        // Check for a default transition. If a default transition is present, a pause statement is not
        // required.
        if (transitions.size <= immediateTransitions.size) {
            var selfStatements = createNewStatementList()
            // If no default transition is present, we need a pause statement and a loop to self.
            if (!defaultTransition) {
                selfStatements.add(createSCLPause.createStatement)
                selfStatements.add(createSCLGoto(state.getHierarchicalName("")).createStatement)
            }
            // Trigger SELFLOOP OPTIMIZATION, if possible.
            // The optimization is possible, if there is already a default transition (already present or
            // added by the transformation) and there are only two transitions.
            if (optimizations.contains(SCLOptimizations::SELFLOOP) &&
               ((transitions.size==2 && selfTransitions.size==1 && selfTransitions.head.trigger == null) 
//                   ||
//                (transitions.size==1 && selfTransitions.size!=1)
                )) {
                iS.addAll(optimizeSelfLoop(immediateStatements, selfStatements));
            } else {
                iS.addAll(immediateStatements)
                iS.addAll(selfStatements)            
            }
            
            // Since there are no non-immediate transitions, we must return here.
            return iS;
        }
        
        // Add all statements for immediate transitions and a pause statement.
        iS.addAll(immediateStatements)
        iS.add(createSCLPause.createStatement);
        
        // Same as above. If there are only two transitions and one of them is going to self, invoke
        // SELFLOOP OPTIMIZATION if selected.
        if (optimizations.contains(SCLOptimizations::SELFLOOP) &&
           ((transitions.size==2 && selfTransitions.size==1 && selfTransitions.head.trigger == null) ||
            (transitions.size==1 && selfTransitions.size!=1))) {
                
            // Retrieve the statements of the outgoing (not self) transition
            var transitionStatements = transformStateTransition(
                transitions.filter(e | ((e.target) instanceof SyncState) &&
                    ((e.target as SyncState) != state
                )
                ).head
            )
            
            // If the transition statements end with a goto, it is not a conditional (triggered) transition,
            // nothing to do here: add the statements.
            if (transitionStatements.last?.getInstruction instanceof Goto) {
                iS.addAll(transitionStatements);
            } else {
                // Otherwise, create self-loop if necessary and invoke the optimization.
                var ArrayList<Statement> selfStatements = null;
                
                if (selfTransitions.size==1) {
                    selfStatements = transformStateTransition(selfTransitions.head) as ArrayList<Statement>
                } else {
                    selfStatements = createNewStatementList()
                    selfStatements.add(createSCLGoto(state.getHierarchicalName("")).createStatement)
                }
                
                iS.addAll(optimizeSelfLoop(transitionStatements, selfStatements));
            } 
        } else {
            // If the optimization is not possible or not selected, transform all transitions naively
            // and add a self loop, if no default transition is present.
            for (transition : transitions) {
                val targetStatements = transformStateTransition(transition)
                if (targetStatements.last?.getInstruction instanceof Goto) defaultTransition = true;
                iS.addAll(targetStatements)
            }
            if (!defaultTransition) iS.add(createSCLGoto(state.getHierarchicalName("")).createStatement);
        }
        
        iS
    }

    /* Transforms a sinle transition.
     * 
     * If a trigger/guard exists, the transition code will begin with a conditional. 
     * Otherwise it is only a goto statement.
     * An effect adds a scl assignment. 
     */    
    def List<Statement> transformStateTransition(SyncTransition transition) {
        var newStatements = createNewStatementList()
        
        // The state and the corresponding goto statement the transition points to
        val targetState = transition.target as SyncState
        var targetGoto = createSCLGoto(targetState.getHierarchicalName(""))
        
        // Transition effect 
        val transitionEffect = transition.getEffect()
        
        // Transition trigger
        val transitionTrigger = transition.getTrigger();

        // If a trigger is present, add a conditional statement.        
        if (transitionTrigger.exists) {
            var conditional = createSCLConditional(transitionTrigger)
            // If an effect is present, add the corresponding scl assignment statements to the conditionals
            // statement sequence.
            if (transitionEffect.exists) {
                val transitionAssignments = createSCLAssignment(transitionEffect)
                conditional.statements.addAll(transitionAssignments.createStatements)
            }
            conditional.statements.add(targetGoto.createStatement)
            newStatements.add(conditional.createStatement)
        } else {
            // If there is no trigger, simply add the assignments and a goto statement.
            if (transitionEffect.exists) {
                val transitionAssignments = createSCLAssignment(transitionEffect)
                newStatements.addAll(transitionAssignments.createStatements)
            }
            newStatements.add(targetGoto.createStatement)
        }
        
        newStatements
    }
     
}