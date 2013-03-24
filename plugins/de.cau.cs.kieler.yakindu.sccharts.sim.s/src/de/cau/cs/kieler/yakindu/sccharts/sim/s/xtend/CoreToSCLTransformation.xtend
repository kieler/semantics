package de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend

import org.eclipse.xtend.util.stdlib.CloningExtensions
import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableCollection;
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import java.util.Collections
import java.util.List
import java.util.Collection
import java.util.ArrayList
import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.yakindu.sgraph.syncgraph.TransitionType
import org.yakindu.sct.model.sgraph.Statechart
//import org.yakindu.sct.model.sgraph.State
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncState

import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncgraphFactory

import org.yakindu.sct.model.sgraph.SGraphFactory
import org.yakindu.sct.model.sgraph.State
import org.yakindu.sct.model.sgraph.Trigger
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.stext.stext.StextFactory
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.ReactionTrigger
import org.yakindu.sct.model.stext.stext.ReactionEffect

import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.*
import org.yakindu.sct.model.sgraph.Choice

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclFactory;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet

class CoreToSCLTransformation {
 
    //-------------------------------------------------------------------------
    //--          C O R E   TO   S C L -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transforming SCC Aborts.
    def Program transformCoreToSCL(Statechart rootStatechart) {
        var targetProgram = SclFactory::eINSTANCE.createProgram();
       
        targetProgram.setName(rootStatechart.getName());
        
        val Region mainRegion = (rootStatechart.regions.get(0).vertices.get(0) as SyncState).regions.get(0);
        targetProgram.program = transformCoreRegion(mainRegion);

//        for (instruction : instructions.instructions) {
//            targetProgram.program.instructions.add(instruction);
//        }
     
        targetProgram;
    }

    def InstructionSet transformCoreRegion(Region region) {
        var InstructionSet iSet = SclFactory::eINSTANCE.createInstructionSet();
        val states = ImmutableList::copyOf(region.getVertices.filter(typeof(SyncState)));
//        val initialState = states.filter(e | e.isInitial == true).head() as SyncState;

//        var stateInstructions = transformCoreState(initialState);
        for (state : states) {
            val stateInstructions = transformCoreState(state);
            iSet.instructions.addAll(stateInstructions.instructions);
        }
        
        iSet;
    }
    
    def InstructionSet transformCoreState(SyncState state) {
        var InstructionSet iSet = SclFactory::eINSTANCE.createInstructionSet();
        
        val originalOutgoingTransitionsRaw = ImmutableList::copyOf(state.outgoingTransitions);
        var List<SyncTransition> originalOutgoingTransitions = new ArrayList();
        for (raw : originalOutgoingTransitionsRaw) {
            originalOutgoingTransitions.add(0, raw as SyncTransition);
        }
        val outgoingWeakTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.type == TransitionType::WEAKABORT));
        val normalTerminationTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION));

        var label = SclFactory::eINSTANCE.createLabel();
        label.setName('S' + state.hashCode.toString() + state.getName());
        iSet.instructions.add(label)
        
         if (state.isComposite()) {
            
            if (state.getRegions().size<2) {
                var regionInstructions =  transformCoreRegion(state.getRegions().get(0));
                iSet.instructions.addAll(regionInstructions.instructions);
            } else {
                var parallel = SclFactory::eINSTANCE.createParallel();
                for(stateRegion : state.getRegions()) {
                    var regionInstructions = transformCoreRegion(stateRegion);
                    parallel.getThreads().add(regionInstructions);
                }
                iSet.instructions.add(parallel);
            }
            
            for(transition : normalTerminationTransitions) {
              var goto = SclFactory::eINSTANCE.createGoto();
              val targetState = transition.target as SyncState; 
              goto.setName('N_S' + targetState.hashCode.toString() + targetState.getName());
              iSet.instructions.add(goto);
            }
             
        } else {
        
          var pause = SclFactory::eINSTANCE.createPause();
          pause.setPause("pause");
          iSet.instructions.add(pause);

          for(transition : outgoingWeakTransitions) {
              var goto = SclFactory::eINSTANCE.createGoto();
              val targetState = transition.target as SyncState; 
              goto.setName('W_S' + targetState.hashCode.toString() + targetState.getName());
              iSet.instructions.add(goto);
          }
        
        }
       
        
       
        iSet;        
    }
 
 
}