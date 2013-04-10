package de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend

import com.google.common.collect.ImmutableList
import com.google.inject.Guice
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionList
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclFactory
import java.util.ArrayList
import java.util.List
import org.yakindu.sct.model.sgraph.Event
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect


import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction

//import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSequence

class CoreToSCLTransformation {
    
     extension de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.SCLHelper SCLHelper = 
         Guice::createInjector().getInstance(typeof(SCLHelper))
     extension de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.SCCHelper SCCHelper = 
         Guice::createInjector().getInstance(typeof(SCCHelper))
 
    //-------------------------------------------------------------------------
    //--          C O R E   TO   S C L -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transforming SCC Aborts.
    def Program transformCoreToSCL(Statechart rootStatechart) {
        var targetProgram = SclFactory::eINSTANCE.createProgram();
       
       //rootStatechart.distributeStateIDs();
       
        targetProgram.setName((rootStatechart.regions.get(0).vertices.get(0) as SyncState).getName());
        
        val Region mainRegion = (rootStatechart.regions.get(0).vertices.get(0) as SyncState).regions.get(0);
        var program = SCL.createInstructionList();
        program.instructions.addAll(transformCoreRegion(mainRegion).instructions);
        
        val mainState = (rootStatechart.regions.get(0).vertices.get(0) as SyncState);
        for(declaration : mainState.scopes.get(0).declarations) {
           targetProgram.interface.add(createVariableDeclaration(declaration as Event));
        }
       
        targetProgram.program = program//.optimizeGoto;//.optimizeLabel;

        targetProgram
    }

    def InstructionList transformCoreRegion(Region region) {
        var iSet = createSCLInstructionList();
        val states = ImmutableList::copyOf(region.getVertices.filter(typeof(SyncState))).
          sort(e1, e2 | compareSCLRegionStateOrder(e1, e2));

        if (region.getName() != null) {
           iSet.addInstruction(createSCLComment(region.getName()));
        }

        for (state : states) {
            Debug(state.getHierarchicalName(""));
            val stateInstructions = transformCoreState(state);
//            val stateLabel = stateInstructions.getLabel();
//            if (stateLabel!=null) { iSet.addInstruction(stateLabel.copy); }
            iSet.instructions.addAll(stateInstructions.instructions);
        }
        
//        iSet = iSet.optimizeGoto.optimizeLabel;
        iSet;
    }
    
    def InstructionList transformCoreState(SyncState state) {
        var iSet = createSCLInstructionList();
        val stateID = state.getHierarchicalName("");
        
        iSet.addInstruction(createSCLLabel(stateID));
        iSet.addInstruction(createSCLComment("-- Begin of state "+state.getName()+" --"));
        
        if (state.isComposite()) {
            // COMPOSITE STATE         
            
            if (state.getRegions().size<2) {
                var regionInstructions =  transformCoreRegion(state.getRegions().get(0));
                iSet.instructions.addAll(regionInstructions.instructions);
            } else {
                var parallel = SclFactory::eINSTANCE.createParallel();
                for(stateRegion : state.getRegions()) {
                    var regionInstructions = transformCoreRegion(stateRegion);
                    parallel.getThreads().addAll(regionInstructions);
                }
                iSet.addInstruction(parallel);
            }
            
            for(transition : state.getNormalterminations) {
              val targetState = transition.target as SyncState; 
              
              val effect = transition.getEffect();
              if (effect != null) {
                  iSet.addInstruction(createSCLAssignment(effect));
              }
              
              var goto = createSCLGoto(targetState.getHierarchicalName(""));
              iSet.addInstruction(goto);
            }
             
        } else {
            // NON COMPOSITE STATE
        
            if (state.isFinal) {
                // FINALE STATE
                
            } else {
                // STATE IS NOT A FINAL STATE
                
                iSet.addPause();
                
                iSet.addInstruction(state.transformStateTransitions);
                
               
            } // isFinal
        
        } // isComposite
       
//        iSet.addInstruction(createSCLComment("-- End of state "+state.getName()+" --"));
       
        iSet;        
    }
    
    
    def InstructionList transformStateTransitions(SyncState state) {
        var iSet = createSCLInstructionList();
        
        val transitions = state.getTransitions;
        var selfTransitions = transitions.filter(e | 
            (e.target instanceof SyncState) && ((e.target as SyncState) == state))
        
        if (((transitions.size==2) && (selfTransitions.size==1) && 
                (selfTransitions.head.trigger == null)) ||
            (transitions.size==1) && (selfTransitions.size!=1)) {
            var targetInstructions = transformStateTransition(
                transitions.filter(e | ((e.target) instanceof SyncState) &&
                    ((e.target as SyncState) != state
                )
                ).head
            )
            if (targetInstructions.instructions.last instanceof Goto) {
                iSet.addInstruction(targetInstructions);
            } else {
                var InstructionList selfInstructions = null;
                
                if (selfTransitions.size==1) {
                    selfInstructions = transformStateTransition(selfTransitions.head)
                } else {
                    selfInstructions = createSCLInstructionList();
                    selfInstructions.addInstruction(createSCLGoto(state.getHierarchicalName("")));
                }
                
                iSet.addInstruction(optimizeSelfLoop(targetInstructions, selfInstructions));
            } 
        } else {
            var boolean defaultTransition = false;
            for (transition : transitions) {
                val targetInstructions = transformStateTransition(transition)
                if (targetInstructions.instructions.last instanceof Goto) { defaultTransition = true; }
                iSet.addInstruction(targetInstructions)
            }
            if (!defaultTransition) {
                iSet.addInstruction(createSCLGoto(state.getHierarchicalName("")));
            }
        }
        
        iSet;
    }
    
    def InstructionList transformStateTransition(SyncTransition transition) {
        var iSet = createSCLInstructionList()
        val targetState = transition.target as SyncState;
        val transitionEffect = transition.getEffect();
        val transitionTrigger = transition.getTrigger();
        var targetGoto = createSCLGoto(targetState.getHierarchicalName(""));
        if (transitionTrigger.exists) {
            var conditional = createSCLConditional(transitionTrigger);
            if (transitionEffect.exists) {
                val transitionAssignment = createSCLAssignment(transitionEffect);
                conditional.addInstruction(transitionAssignment);
            }
            conditional.addInstruction(targetGoto);
            iSet.instructions.add(conditional);
        } else {
            if (transitionEffect.exists) {
                val transitionAssignment = createSCLAssignment(transitionEffect);
                iSet.instructions.add(transitionAssignment);
            }
            iSet.instructions.add(targetGoto);
        }
        iSet;
    }
    
    
    
    def InstructionList optimizeSelfLoop(InstructionList tSet, InstructionList sSet) {
        var iSet = createSCLInstructionList();
        
        var conditional = tSet.instructions.head as Conditional;
        var condSet = conditional.conditional;
        conditional.setConditional(sSet);
        conditional.expression = conditional.expression.negate;
        
        iSet.addInstruction(conditional.copy)
        iSet.addInstruction(condSet.copy)
        iSet;
    }
 
 
    def InstructionList optimizeGoto(InstructionList iSet) {
        var newISet = createSCLInstructionList();
        
        for(Integer i: 0..(iSet.instructions.size - 1)) {
            var boolean skip = false
            val instruction = iSet.instructions.get(i);
            
            if (instruction instanceof Goto && i < iSet.instructions.size - 1) {
                val nextInstruction = iSet.instructions.get(i+1);
                if (nextInstruction!=null && nextInstruction instanceof Label) {
                    if ((instruction as Goto).getName().equals((nextInstruction as Label).getName())) { skip = true }  
                }
            }
            
            if (!skip) { newISet.addInstruction(instruction.copy); }
        }
      
      newISet;
    }
    
    def InstructionList optimizeLabel(InstructionList iSet) {
        var newISet = createSCLInstructionList();
        
        val oldSet = ImmutableList::copyOf(iSet.instructions);
        val gotos = ImmutableList::copyOf(iSet.eAllContents().toIterable().filter(typeof(Goto)));
        
        newISet.instructions.addAll(oldSet.filter(e | 
          (!(e instanceof Label)) || 
          (gotos.exists(f | f.getName()==(e as Label).getName()))  
        ));
        

/*      OLD VERSION - DEPRECIATED        
         for(Integer i: 0..(iSet.instructions.size - 1)) {
            var boolean skip = false
            val instruction = iSet.instructions.get(i);
            
            if (instruction instanceof Label && i < iSet.instructions.size - 1) {
                if (!gotos.exists(e | e.getName()==(instruction as Label).getName())) { skip = true }    
            }
            
            if (!skip) { newISet.addInstruction(instruction.copy); }
            
        }*/
        
        newISet;
    }
 
}