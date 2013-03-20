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

class CoreToSCLTransformation {
 
    //-------------------------------------------------------------------------
    //--          C O R E   TO   S C L -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transforming SCC Aborts.
    def Program transformCoreToSCL(Statechart rootStatechart) {
        var targetProgram = SclFactory::eINSTANCE.createProgram();
       
        targetProgram.setName(rootStatechart.getName());
        
        val Region mainRegion = rootStatechart.regions.get(0);
        var instruction = transformCoreRegion(mainRegion);
        
        targetProgram.setInstruction(instruction);
     
        targetProgram;
    }

    def Instruction addInstruction(Instruction instruction, Instruction next) {
        var Instruction target;
        if (instruction == null) {
            target = next;
        } else {
            instruction.nextInstruction = next;
            target = instruction.nextInstruction;
        }
        target;
    }
        
    def Instruction transformCoreRegion(Region region) {
//        val states = ImmutableList::copyOf(region.getVertices.filter(typeof(SyncState)));
//        val initialState = states.filter(e | e.isInitial == true);

//        var regionStates = region.eAllContents().toIterable().filter(typeof(SyncState)).toList();
        var regionStates = region.getVertices().filter(typeof(SyncState));

        var Instruction instruction = null;
        var Instruction rootInstruction = null;
        for(state : regionStates) {
            instruction = addInstruction(instruction, transformCoreState(state));
            if (rootInstruction == null) { rootInstruction = instruction; }
        }
        
        rootInstruction;
    }
    
    def Instruction transformCoreState(SyncState state) {
        var Instruction instruction = null;
        var Instruction rootInstruction = null;  
        
        val originalOutgoingTransitionsRaw = ImmutableList::copyOf(state.outgoingTransitions);
        var List<SyncTransition> originalOutgoingTransitions = new ArrayList();
        for (raw : originalOutgoingTransitionsRaw) {
            originalOutgoingTransitions.add(0, raw as SyncTransition);
        }
        val outgoingWeakTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.type == TransitionType::WEAKABORT));
        val normalTerminationTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION));

        var label = SclFactory::eINSTANCE.createLabel();
        label.setName('S' + state.hashCode.toString() + state.getName());
        instruction = addInstruction(instruction, label);     
        if (rootInstruction == null) { rootInstruction = instruction; }
        
        if (state.isComposite()) {
            
            if (state.getRegions().size<2) {
                var regionInstruction =  transformCoreRegion(state.getRegions().get(0));
                instruction = addInstruction(instruction, regionInstruction);     
                if (rootInstruction == null) { rootInstruction = instruction; }
            } else {
                var parallel = SclFactory::eINSTANCE.createParallel();
                for(stateRegion : state.getRegions()) {
                    parallel.getThreads().add(transformCoreRegion(stateRegion));
                }
                instruction = addInstruction(instruction, parallel);     
                if (rootInstruction == null) { rootInstruction = instruction; }
            }
            
            for(transition : normalTerminationTransitions) {
                var goto = SclFactory::eINSTANCE.createGoto();
                goto.setName("a" + transition.getTarget().hashCode.toString());
//                (instruction as Goto).setName(transition.getTarget().getName());                
                instruction = addInstruction(instruction, goto);     
                if (rootInstruction == null) { rootInstruction = instruction; }
            }
             
        } else {
        
            for(transition : outgoingWeakTransitions) {
                var goto = SclFactory::eINSTANCE.createGoto();
                goto.setName("b" + transition.getTarget().hashCode.toString());
//                (instruction as Goto).setName(transition.getTarget().getName());
                instruction = addInstruction(instruction, goto);     
                if (rootInstruction == null) { rootInstruction = instruction; }
            }
        
        }
       
        rootInstruction;        
    }
 
 
}