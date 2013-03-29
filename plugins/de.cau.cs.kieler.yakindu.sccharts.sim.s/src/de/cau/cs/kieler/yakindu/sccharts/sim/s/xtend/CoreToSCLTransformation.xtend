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
import com.google.inject.Guice


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
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope

class CoreToSCLTransformation {
    
     extension de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.SCLHelper SCLHelper = 
         Guice::createInjector().getInstance(typeof(SCLHelper))
 
    //-------------------------------------------------------------------------
    //--          C O R E   TO   S C L -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transforming SCC Aborts.
    def Program transformCoreToSCL(Statechart rootStatechart) {
        var targetProgram = SclFactory::eINSTANCE.createProgram();
       
       //rootStatechart.distributeStateIDs();
       
        targetProgram.setName(rootStatechart.getName());
        
        val Region mainRegion = (rootStatechart.regions.get(0).vertices.get(0) as SyncState).regions.get(0);
        var program = SCL.createInstructionSet();
        program.instructions.addAll(transformCoreRegion(mainRegion).scope.instructions);
        
        
        targetProgram.program = program//.optimizeGoto;//.optimizeLabel;

        targetProgram
    }

    def Scope transformCoreRegion(Region region) {
        var iSet = createSCLScope("");
        val states = ImmutableList::copyOf(region.getVertices.filter(typeof(SyncState))).
          sort(e1, e2 | compareSCLRegionStateOrder(e1, e2));
//        val initialState = states.filter(e | e.isInitial == true).head() as SyncState;

        if (region.getName() != null) {
           iSet.addInstruction(createSCLComment(region.getName()));
        }

        for (state : states) {
            Debug(state.getHierarchicalName(""));
            val stateInstructions = transformCoreState(state);
//            val stateLabel = stateInstructions.getLabel();
//            if (stateLabel!=null) { iSet.addInstruction(stateLabel.copy); }
            iSet.scope.instructions.addAll(stateInstructions.scope.instructions);
        }
        
        iSet.scope = iSet.scope.optimizeGoto.optimizeLabel;
        iSet;
    }
    
    def Scope transformCoreState(SyncState state) {
        var iSet = SclFactory::eINSTANCE.createScope();
        val stateID = state.getHierarchicalName("");
        
        val originalOutgoingTransitionsRaw = ImmutableList::copyOf(state.outgoingTransitions);
        var List<SyncTransition> originalOutgoingTransitions = new ArrayList();
        for (raw : originalOutgoingTransitionsRaw) {
            originalOutgoingTransitions.add(0, raw as SyncTransition);
        }
        val outgoingWeakTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.type == TransitionType::WEAKABORT));
        val normalTerminationTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION));

       iSet.addInstruction(createSCLLabel(stateID));
//        iSet.setLabel(createSCLLabel(stateID));
        iSet.addInstruction(createSCLComment("-- Begin of state "+state.getName()+" --"));
        
 //       var local = SCL.createLocalVariable();
//        local.setType('Integer');
//        local.setName('test');
//        iSet.variables.add(local);
        
        
        if (state.isComposite()) {
            // COMPOSITE STATE         
            
            if (state.getRegions().size<2) {
                var regionInstructions =  transformCoreRegion(state.getRegions().get(0));
                iSet.scope.instructions.addAll(regionInstructions.scope.instructions);
            } else {
                var parallel = SclFactory::eINSTANCE.createParallel();
                for(stateRegion : state.getRegions()) {
                    var regionInstructions = transformCoreRegion(stateRegion);
                    parallel.getThreads().addAll(regionInstructions.scopeToInstructionSet);
                }
                iSet.addInstruction(parallel);
            }
            
            for(transition : normalTerminationTransitions) {
              val targetState = transition.target as SyncState; 
              var goto = createSCLGoto(targetState.getHierarchicalName(""));
              iSet.addInstruction(goto);
            }
             
        } else {
            // NON COMPOSITE STATE
        
            if (state.isFinal) {
                // FINALE STATE
                
            } else {
                // STATE IS NOT A FINAL STATE
                
                val transitionCount = outgoingWeakTransitions.size;
                
                iSet.addPause();
                
                if (transitionCount==1) {
                    // OPTIMIZE GOTO
                    val transition = outgoingWeakTransitions.get(0);
                    val targetState = transition.target as SyncState; 
                    var cSet = createSCLInstructionSet(createSCLGoto(stateID));
                    var conditional = createSCLConditional("'!(" + transition.getSpecification() + ")'", cSet);
                    var goto = createSCLGoto(targetState.getHierarchicalName(""));
                    iSet.addInstruction(conditional);
                    iSet.addInstruction(goto);
                    
                } else { 
                    // MORE TRANSITIONS (no optimize)
                
                    var boolean bDefaultTransition = false;
                    var Goto defaultTransition;
                    for(transition : outgoingWeakTransitions) {
                        val targetState = transition.target as SyncState; 
                        var goto = createSCLGoto(targetState.getHierarchicalName(""));
              
                        if (transition.getSpecification().nullOrEmpty) {
                            defaultTransition = goto.copy;
                            bDefaultTransition = true;                  
                        } else {
                            var conditional = SclFactory::eINSTANCE.createConditional();
                            conditional.setExpression("'" + transition.getSpecification() + "'");
                            conditional.addInstruction(goto);   
                
                            iSet.addInstruction(conditional);
                        }
                            
                    }
                
                    if (bDefaultTransition) {
                        iSet.addInstruction(defaultTransition);
                    } else {
                        iSet.addInstruction(createSCLGoto(stateID));
                    }
                    
                } // optimize single transition
                
            } // isFinal
        
        } // isComposite
       
//        iSet.addInstruction(createSCLComment("-- End of state "+state.getName()+" --"));
       
        iSet;        
    }
 
 
    def InstructionSet optimizeGoto(InstructionSet iSet) {
        var newISet = createSCLInstructionSet();
        
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
    
    def InstructionSet optimizeLabel(InstructionSet iSet) {
        var newISet = createSCLInstructionSet();
        
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