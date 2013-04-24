package de.cau.cs.kieler.yakindu.sccharts.scl.xtend

import com.google.common.collect.ImmutableList
import com.google.inject.Guice
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.scl.scl.Annotation
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.SclFactory
import java.util.ArrayList
import java.util.HashMap
import org.yakindu.sct.model.sgraph.Event
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.sgraph.Statechart

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.SCLHelper
import org.eclipse.emf.ecore.EObject
import java.util.List

class CoreToSCLTransformation {
    
     extension de.cau.cs.kieler.scl.SCLHelper SCLHelper = 
         Guice::createInjector().getInstance(typeof(SCLHelper))
     extension de.cau.cs.kieler.yakindu.sccharts.scl.xtend.SCCHelper SCCHelper = 
         Guice::createInjector().getInstance(typeof(SCCHelper))
         
         
    public static int OPTIMIZE_NONE             = 0
    public static int OPTIMIZE_GOTO             = 1
    public static int OPTIMIZE_LABEL            = 2
    public static int OPTIMIZE_SELFLOOP         = 4
    public static int OPTIMIZE_STATEPOSITION    = 8
    public static int OPTIMIZE_ALL              = 
                                                  OPTIMIZE_GOTO + 
                                                  OPTIMIZE_LABEL + 
                                                  OPTIMIZE_SELFLOOP + 
                                                  OPTIMIZE_STATEPOSITION;         
 
 
    def boolean optimize(int oFlags, int optimization) {
        oFlags.bitwiseAnd(optimization) > 0
    }
    //-------------------------------------------------------------------------
    //--          C O R E   TO   S C L -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transforming SCC Aborts.
    def Program transformCoreToSCL(Statechart rootStatechart, int optimizationFlags) {
        var targetProgram = SclFactory::eINSTANCE.createProgram();
       
        rootStatechart.statechartDistributePriorities
       
        val mainState = rootStatechart.regions.get(0).vertices.get(0) as SyncState
       
        targetProgram.setName(mainState.name)

        for(declaration : mainState.scopes.get(0).declarations) {
           targetProgram.interface.add(createVariableDeclaration(declaration as Event));
        }        
        targetProgram.instructions.addAll(transformCoreState(mainState, optimizationFlags));
       
        targetProgram
    }

    def ArrayList<EObject> transformCoreRegion(Region region, int optimizationFlags) {
        var iS = createNewInstructionList()
        val states = ImmutableList::copyOf(region.getVertices.filter(typeof(SyncState))).
          sort(e1, e2 | compareSCLRegionStateOrder(e1, e2))

        if (region.getName() != null) {
           iS.addInstruction(createSCLComment(region.getName()))
        }

        var stateInstructions = new ArrayList<ArrayList<EObject>>
        for (state : states) {
            Debug(state.getHierarchicalName(""))
            stateInstructions.add(transformCoreState(state, optimizationFlags))
        }
        
        if (optimizationFlags.optimize(OPTIMIZE_STATEPOSITION)) {
            stateInstructions = stateInstructions.optimizeStateSetPosition
        }
        for(stateSet : stateInstructions) {
            iS.addAll(stateSet)
        }
        
        if (optimizationFlags.optimize(OPTIMIZE_GOTO)) { iS = iS.optimizeGoto }
        if (optimizationFlags.optimize(OPTIMIZE_LABEL)) { iS = iS.optimizeLabel }
        iS
    }
    
    def ArrayList<EObject> transformCoreState(SyncState state, int optimizationFlags) {
        var iS = createNewInstructionList()
        val stateID = state.getHierarchicalName("")
        
        iS.addInstruction(createSCLComment("-- Begin of state "+state.getName()+" --"))
        iS.addInstruction(createSCLLabel(stateID));
        
        if (state.isComposite()) {
            // COMPOSITE STATE         
            
            if (state.getRegions().size<2) {
                var regionInstructions =  transformCoreRegion(state.getRegions().head, optimizationFlags)
                iS.addAll(regionInstructions)
            } else {
                var parallel = SclFactory::eINSTANCE.createParallel();
                for(stateRegion : state.getRegions()) {
                    val regionInstructions = transformCoreRegion(stateRegion, optimizationFlags)
                    parallel.getThreads().add(createSCLThread(regionInstructions))
                }
                iS.addInstruction(parallel)
            }
            
            for(transition : state.getNormalterminations) {
              val targetState = transition.target as SyncState 
              
              val effect = transition.getEffect()
              if (effect != null) {
                  iS.addAll(createSCLAssignment(effect))
              }
              
              var goto = createSCLGoto(targetState.getHierarchicalName(""))
              iS.addInstruction(goto)
            }
             
        } else {
            // NON COMPOSITE STATE
        
            if (state.isFinal) {
                // FINALE STATE
                
            } else {
                // STATE IS NOT A FINAL STATE
                iS.addInstructions(state.transformStateTransitions(optimizationFlags))
            } // isFinal
        
        } // isComposite
       
        iS;        
    }
    
    
    def ArrayList<EObject> transformStateTransitions(SyncState state, int optimizationFlags) {
        var iS = createNewInstructionList()
        
        val transitions = state.getTransitions;
        val immediateTransitions = ImmutableList::copyOf(transitions.filter(e | e.isImmediate));
        var selfTransitions = transitions.filter(e | 
            (e.target instanceof SyncState) && ((e.target as SyncState) == state))
            
        var boolean defaultTransition = false;
        
        for(transition : immediateTransitions) {
                val targetInstructions = transformStateTransition(transition)
                if (targetInstructions.last instanceof Goto) { defaultTransition = true; }
                iS.addAll(targetInstructions)
        }
                
        if (transitions.size <= immediateTransitions.size) {
            if (!defaultTransition) {
                iS.addPause;
                iS.addInstruction(createSCLGoto(state.getHierarchicalName("")));
            }
            return iS;
        }
        
        iS.addPause;
        
        if (optimizationFlags.optimize(OPTIMIZE_SELFLOOP) &&
           ((transitions.size==2 && selfTransitions.size==1 && selfTransitions.head.trigger == null) ||
            (transitions.size==1 && selfTransitions.size!=1))) {
            var targetInstructions = transformStateTransition(
                transitions.filter(e | ((e.target) instanceof SyncState) &&
                    ((e.target as SyncState) != state
                )
                ).head
            )
            if (targetInstructions.last instanceof Goto) {
                iS.addAll(targetInstructions);
            } else {
                var ArrayList<EObject> selfInstructions = null;
                
                if (selfTransitions.size==1) {
                    selfInstructions = transformStateTransition(selfTransitions.head)
                } else {
                    selfInstructions = createNewInstructionList();
                    selfInstructions.addInstruction(createSCLGoto(state.getHierarchicalName("")));
                }
                
                iS.addInstructions(optimizeSelfLoop(targetInstructions, selfInstructions));
            } 
        } else {
            for (transition : transitions) {
                val targetInstructions = transformStateTransition(transition)
                if (targetInstructions.last instanceof Goto) { defaultTransition = true; }
                iS.addAll(targetInstructions)
            }
            if (!defaultTransition) {
                iS.addInstruction(createSCLGoto(state.getHierarchicalName("")));
            }
        }
        
        iS
    }
    
    def ArrayList<EObject> transformStateTransition(SyncTransition transition) {
        var iS = createNewInstructionList()
        val targetState = transition.target as SyncState;
        val transitionEffect = transition.getEffect();
        val transitionTrigger = transition.getTrigger();
        var targetGoto = createSCLGoto(targetState.getHierarchicalName(""));
        if (transitionTrigger.exists) {
            var conditional = createSCLConditional(transitionTrigger);
            if (transitionEffect.exists) {
                val transitionAssignments = createSCLAssignment(transitionEffect);
                conditional.instructions.addAll(transitionAssignments);
            }
            conditional.addInstruction(targetGoto);
            iS.addInstruction(conditional);
        } else {
            if (transitionEffect.exists) {
                val transitionAssignments = createSCLAssignment(transitionEffect);
                iS.addAll(transitionAssignments);
            }
            iS.addInstruction(targetGoto);
        }
        iS;
    }
    
    
    
    def ArrayList<EObject> optimizeSelfLoop(List<EObject> tList, List<EObject> sList) {
        var iS = createNewInstructionList();
        
        var conditional = tList.head as Conditional
        var condIS = conditional.instructions
        conditional.instructions.clear
        conditional.instructions.addAll(sList)
        conditional.expression = conditional.expression.negate;
        
        iS.addInstruction(conditional.copy)
        iS.addAll(condIS)
        iS;
    }
 
    def ArrayList<EObject> optimizeGoto(List<EObject> iList) {
        var iS = createNewInstructionList()
        
        for(Integer i: 0..(iList.size - 1)) {
            var boolean skip = false
            val instruction = iList.get(i)
            
            if (instruction instanceof Goto && i < iList.size - 1) {
                var Integer j = new Integer(i + 1)
                var nextInstruction = iList.get(j)
                while ((j < iList.size - 1) && (nextInstruction instanceof Annotation)) { 
                    j = j + 1;
                    nextInstruction = iList.get(j) 
                }
                if (nextInstruction!=null && nextInstruction instanceof Label) {
                    if ((instruction as Goto).getName().equals((nextInstruction as Label).getName())) { skip = true }  
                }
            }
            
            if (!skip) { iS.add(instruction.copy) }
        }
      
      iS
    }
    
    def ArrayList<EObject> optimizeLabel(List<EObject> iList) {
        var iS = createNewInstructionList();
        
        val oldSet = iList
        val gotos = iList.getAllContents.filter(typeof(Goto))
        
        iS.addAll(oldSet.filter(e | 
          (!(e instanceof Label)) || 
          (gotos.exists(f | f.getName()==(e as Label).getName()))  
        ));
        
        iS
    }
    
    def ArrayList<ArrayList<EObject>> optimizeStateSetPosition(ArrayList<ArrayList<EObject>> stateILists) {
        var statesIS = new ArrayList<ArrayList<EObject>>
        var finished = new HashMap<List<EObject>, Boolean>
        
        val labelList = ImmutableList::copyOf(stateILists.getAllContents.toIterable.
            filter(typeof(Label)))
        val gotoList = ImmutableList::copyOf(stateILists.getAllContents.toIterable.
            filter(typeof(Goto)))
            
        for(stateIList : stateILists) {
            if (!finished.containsKey(stateIList)) {
                if (stateIList.last instanceof Goto) {
                    val targetGoto = stateIList.last as Goto
                    val targetGotos = ImmutableList::copyOf(gotoList.filter(e | (e.getName() == targetGoto.getName())))
                    val targetLabels = ImmutableList::copyOf(labelList.filter(e | (e.getName() == targetGoto.getName())))
                    
                    val stateIArray = new ArrayList<EObject>
                    stateIArray.addAll(stateIList)
                    statesIS.add(stateIArray)
                    finished.put(stateIArray, true);

                    if ((targetGotos.size == 1) && (targetLabels.size == 1)) {
                        for(insertIList : stateILists) {
                            if ((!finished.containsKey(insertIList)) && 
                                (insertIList.getAllContents.toIterable.filter(typeof(Label)).
                                    filter(e | e.getName()==targetGoto.getName()).size>0)) {
                                val insertIArray = new ArrayList<EObject>
                                insertIArray.addAll(insertIList)
                                statesIS.add(insertIArray)
                                finished.put(insertIList, true)        
                            }
                        }
                    }
                } else {
                    val stateIArray = new ArrayList<EObject>
                    stateIArray.addAll(stateIList)
                    statesIS.add(stateIArray)
                    finished.put(stateIList, true);
                }    
            }
        }    
        
        statesIS
    }
 
}