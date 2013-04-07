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

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
import org.yakindu.sct.model.sgraph.Statechart
//import org.yakindu.sct.model.sgraph.State
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory

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

class SCCToCoreTransformation {
 
    //-------------------------------------------------------------------------
    //--          S C C -  A B O R T S -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transforming SCC Aborts.
    def Statechart transformSCCAborts(Statechart rootStatechart) {
        // Clone the complete SyncCharts region 
        val targetRootStatechart = CloningExtensions::clone(rootStatechart) as Statechart;
        var targetStates = targetRootStatechart.eAllContents().toIterable().filter(typeof(SyncState)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformSCCAborts(targetRootStatechart);
        }
        
        targetRootStatechart;
    }
    
    // For all transitions of a state compute the maximal priority
    def int maxPriority(SyncState state) {
        var priority = 0;
        for (transition : state.outgoingTransitions) {
            val newPriority = transition.priority;
            if (newPriority > priority) {
                priority = newPriority;
            }
        }
        priority;
    }
    
    def void transitionAddSignal(SyncTransition transition, String signalName) {
//    	val event = SCChartsExpFactory::eINSTANCE.createSignalDefinition();
//    	event.setName(signalName);
		//transition.setSpecification('WAHBI');
    }

    // Traverse all states 
    def void transformSCCAborts(SyncState state, Statechart targetRootStatechart) {
        
        if (state.isComposite && state.outgoingTransitions.size() > 0) {
            // Remember all outgoing transitions
//            val originalOutgoingTransitions = ImmutableList::copyOf(state.outgoingTransitions as EList<SyncTransition>);
//			val EList<SyncTransition>syncList = state.outgoingTransitions as EList<SyncTransition>;
            val originalOutgoingTransitionsRaw = ImmutableList::copyOf(state.outgoingTransitions);
            var List<SyncTransition> originalOutgoingTransitions = new ArrayList();
            for (raw : originalOutgoingTransitionsRaw) {
            	originalOutgoingTransitions.add(0, raw as SyncTransition);
            }
            val outgoingStrongTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.getType == TransitionType::STRONGABORT));
            val outgoingWeakTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.type == TransitionType::WEAKABORT));
            val normalTerminationExists = originalOutgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION).size > 0;
            // Remember all regions
            val originalRegions = ImmutableList::copyOf(state.regions);
            
            
            // For a hierarchical state:
            // 1. for each existing region, create a new Aborted-auxiliary state
            // 2. create a watcher region
            
            // 2. Watcher region
            // Add a Pre and NotPre state
	            val runState = SyncgraphFactory::eINSTANCE.createSyncState();
    	        runState.setName("Run");
        	    runState.setIsInitial(true);
	            val abortState = SyncgraphFactory::eINSTANCE.createSyncState();
    	        abortState.setName("Abort");             
        	    abortState.setIsFinal(true);
            	val watcherRegion = SGraphFactory::eINSTANCE.createRegion();
            	watcherRegion.getVertices.add(runState as State);
            	watcherRegion.getVertices.add(abortState as State);
//            	val watcherTransition = SyncgraphFactory::eINSTANCE.createSyncTransition();
//            	watcherTransition.setTarget(abortState);
//            	watcherTransition.setPriority(1);
//            	watcherTransition.setType(TransitionType::WEAKABORT);
//            	runState.outgoingTransitions.add(watcherTransition);
            	
            val needWatcherRegion = (originalOutgoingTransitions.filter(e | e.type != TransitionType::NORMALTERMINATION).size > 0);
            if (needWatcherRegion) {
                state.regions.add(watcherRegion);
            }
            
            // Add a conditional node outside of the state and connect it with
            // a normal termination transition

             val conditionalState = SGraphFactory::eINSTANCE.createChoice();
			state.getParentRegion.getVertices.add(conditionalState);
            val normalTerminationTransition = SyncgraphFactory::eINSTANCE.createSyncTransition();
                normalTerminationTransition.setTarget(conditionalState);
                normalTerminationTransition.setPriority(1);
                normalTerminationTransition.setType(TransitionType::NORMALTERMINATION);
                state.outgoingTransitions.add(normalTerminationTransition);            
   
   
   
   
                        
            // Create complex triggers to be filled with auxiliary signals (sorted strong or weak)                        
            
//            transitionAddSignal(normalTerminationTransition, 'S');
            
            // For every transition 
            for (transition : originalOutgoingTransitions) {
                // Add transition to watcher region
                // ONLY iff this is not a normal termination
                if (transition.type != TransitionType::NORMALTERMINATION) {
                    // Create a signal 
//                    val transitionSignal = StextFactory::eINSTANCE.createEventDefinition();
//                    val transitionSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                    val transitionSignalReference = StextFactory::eINSTANCE.createValuedObjectReference()
//                        transitionSignalReference.setValuedObject(transitionSignal);
//                    val transitionSignalRef = StextFactory::eINSTANCE.createTransitionReaction();
//                  	val eventLiteral = StextFactory::eINSTANCE.createStringLiteral;
                    if (transition.type == TransitionType::STRONGABORT) {
//                    	eventLiteral.setValue("_" + state.getName + "_S" + transition.priority); 
//                        transitionSignal.setEvent("_" + state.id + "_S" + transition.priority);
//                        strongTriggerOperatorExpression.subExpressions.add(transitionSignalReference.copy);
                    } else {
//                    	eventLiteral.setValue("_" + state.getName + "_S" + transition.priority); 
//                        transitionSignal.setName("_" + state.id + "_W" + transition.priority);
//                        weakTriggerOperatorExpression.subExpressions.add(transitionSignalReference.copy);
                    }                    
//                    transitionSignal.setIsInput(false);
//                    transitionSignal.setIsOutput(false);
//                    state.parentRegion.parentState.signals.add(transitionSignal);
//					if (state.getParentRegion.getComposite as SyncState).getScopes.size == 0) {
//					(state.getParentRegion.getComposite as SyncState).getScopes.add(StextFactory::eINSTANCE.createInternalScope());					
//					}
//					(state.getParentRegion.getComposite as SyncState).getScopes.get(0).getEvents.add(transitionSignal);
                                    
                    val watcherTransition =  SyncgraphFactory::eINSTANCE.createSyncTransition();
                    watcherTransition.setTarget(abortState);
                    runState.outgoingTransitions.add(watcherTransition);
                    // Move trigger from original transition to watcher transition
//                    watcherTransition.setTrigger(transition.trigger.copy);
                    // Watcher transition gets the same priority / immediate / delay
                    watcherTransition.setPriority(transition.priority);
//                    watcherTransition.setIsImmediate(transition.isImmediate);
//                    watcherTransition.setDelay(transition.delay);
                    // Watcher transition emits the auxiliary signal
//                    val transitionSignalEmission = SyncchartsFactory::eINSTANCE.createEmission();
//                        transitionSignalEmission.setSignal(transitionSignal);
//                    watcherTransition.effects.add(transitionSignalEmission);
                    // Change trigger of original transition to transitionSignalReference
//                    transition.setTrigger(transitionSignalReference.copy);
//                    val transitionSignalEmission = StextFactory::eINSTANCE.createReactionEffect();
//                        transitionSignalEmission.getActions.add(eventLiteral as Expression);
//                    watcherTransition.setEffect(transitionSignalEmission);
//                    transition.setTrigger(transitionSignalReference.copy);
                }
                
                // Move original transition from state to conditionalState
                // and remove strong, normal termination attributes
                // put immediate attribute
                conditionalState.outgoingTransitions.add(transition);
                transition.setType(TransitionType::WEAKABORT);
//                transition.setIsImmediate(true); 
            }
            
            // Simplify triggers (if they only consist of one signal reference)
/*            if (strongTriggerOperatorExpression.subExpressions.size == 1) {
                strongTrigger = strongTriggerOperatorExpression.subExpressions.get(0);
            }
            if (weakTriggerOperatorExpression.subExpressions.size == 1) {
                weakTrigger = weakTriggerOperatorExpression.subExpressions.get(0);
            }
            // Hotfix for SyncCharts
            if (strongTrigger instanceof OperatorExpression) {
                strongTrigger = (strongTrigger as OperatorExpression).fixForOperatorExpressionLists;
            }
            if (weakTrigger instanceof OperatorExpression) {
                weakTrigger = (weakTrigger as OperatorExpression).fixForOperatorExpressionLists;
            }
*/

            
            // Create an Aborted state for every region
             
            for (region : originalRegions) {
                // Remember all outgoing transitions
                val regionStatesRaw = ImmutableList::copyOf(region.getVertices);
                var List<SyncState> regionStates = new ArrayList<SyncState>();
                for (raw : regionStatesRaw) {
                	regionStates.add(0, raw as SyncState);
                }
                
                val abortedState = SyncgraphFactory::eINSTANCE.createSyncState();
//                abortedState.setId("_Aborted" + state.hashCode);
                abortedState.setName("_Aborted");             
                abortedState.setIsFinal(true);
                val needAbortedState = ((outgoingStrongTransitions.size > 0 || 
                                         outgoingWeakTransitions.size > 0
                                        ) && (regionStates.filter(e | !e.isIsFinal).size > 0));
                if (needAbortedState) {
                       region.getVertices.add(abortedState);
                }
                // Do not add the state here, only add the state iff there are any transitions
                // ending up in this _Aborted state (within the if-for-constructs below)
                
                // For every inner state, connect with a weak and a strong transition
                if (outgoingStrongTransitions.size > 0) {
                    for (regionState : regionStates) {
                        // If the state is a final state do NOT connect it with the _Aborted state
                        if (!regionState.isIsFinal) {
                            // Create a transition ending up in _Aborted
                            val strongAbortTransition =  SyncgraphFactory::eINSTANCE.createSyncTransition();
                            strongAbortTransition.setTarget(abortedState);
//                            strongAbortTransition.setIsImmediate(true);
                            // Now add all strong abort watcher signals as a trigger
//                            strongAbortTransition.setTrigger(strongTrigger.copy);
                            // Set the highest priority
                            strongAbortTransition.setPriority(1);
                            for (regionStateOutgoingTransition : regionState.outgoingTransitions) {
                                regionStateOutgoingTransition.setPriority(regionStateOutgoingTransition.priority + 1);
                            }
                            // Add transition
                            regionState.outgoingTransitions.add(0, strongAbortTransition);
                        }
                    }
                }
                
                if (outgoingWeakTransitions.size > 0) {
                    for (regionState : regionStates) {
                        // If the state is a final state do NOT connect it with the _Aborted state
                        if (!regionState.isIsFinal) {
                            // Create a transition ending up in _Aborted
                            val weakAbortTransition =  SyncgraphFactory::eINSTANCE.createSyncTransition();
                            weakAbortTransition.setTarget(abortedState);
//                            weakAbortTransition.setIsImmediate(true);
                            // Now add all weak abort watcher signals as a trigger
//                            weakAbortTransition.setTrigger(weakTrigger.copy);
                            // Set the lowest priority
                            weakAbortTransition.setPriority(regionState.maxPriority + 1);
                            // Add transition
                            regionState.outgoingTransitions.add(weakAbortTransition);
                        }
                    }
                }
                                 
            }
            
            // Optimization: If a normal termination is outgoing then the following 
            // transformation is necessary to be able to abort the watcher in case
            // of triggering the normal termination.
             if (normalTerminationExists) {
                // If there is at least one such transition then whe need an "_Exit" signal
//                val exitSignal = KExpressionsFactory::eINSTANCE.createSignal();
//                val exitSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                    exitSignalReference.setValuedObject(exitSignal);
//                exitSignal.setName("_Term_" + state.id);
//                state.signals.add(exitSignal);
                // Add a watcher transition from Run to Abort triggered by _Exit
                val watcherTransition =  SyncgraphFactory::eINSTANCE.createSyncTransition();
                watcherTransition.setTarget(abortState);
                runState.outgoingTransitions.add(watcherTransition);
//                watcherTransition.setTrigger(exitSignalReference);
                watcherTransition.setPriority(runState.maxPriority + 1);
//                watcherTransition.setIsImmediate(true);
//                watcherTransition.setDelay(0);
                              
                val mainRegion = SGraphFactory::eINSTANCE.createRegion();
//                mainRegion.setId("Body" + state.hashCode);
                val mainState = SyncgraphFactory::eINSTANCE.createSyncState();
//                mainState.setId("Main" + state.hashCode);
                mainState.setName("Main");
                mainState.setIsInitial(true);
                val termState = SyncgraphFactory::eINSTANCE.createSyncState();
//                termState.setId("Term" + state.hashCode);
                termState.setName("Term");
                termState.setIsFinal(true);
                // Move all inner regions of the state to the mainState
                val regions = ImmutableList::copyOf(state.regions);
                for (region : regions) {
                    mainState.regions.add(region);
//                    if (region.id.nullOrEmpty) {
//                        region.setId("R" + region.hashCode);
//                    }
                }
                mainRegion.getVertices.add(mainState);
                mainRegion.getVertices.add(termState);
                state.regions.add(mainRegion);
                // Create a transition from Main to Term
                val transition = SyncgraphFactory::eINSTANCE.createSyncTransition();
                transition.setTarget(termState);
                transition.setPriority(1);
                transition.setType(TransitionType::NORMALTERMINATION);
                mainState.outgoingTransitions.add(transition);            
//                val exitSignalEmission = SyncchartsFactory::eINSTANCE.createEmission();
//                exitSignalEmission.setSignal(exitSignal);
//                transition.effects.add(exitSignalEmission);
                
                // Move the watcher region outside the mainState
                state.regions.add(watcherRegion);
            }

            
             
        }
        
    }
 
 
 
    //-------------------------------------------------------------------------------
    //--      S C C -  C O N D I T I O N A L -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------------
    
    def Statechart transformSCCConditional(Statechart rootStatechart) {
        // Clone the complete SyncCharts region 
        val targetRootStatechart = CloningExtensions::clone(rootStatechart) as Statechart;
        var targetStates = targetRootStatechart.eAllContents().toIterable().filter(typeof(Choice)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformSCCConditional(targetRootStatechart);
        }
        
        targetRootStatechart;
    }
    
    // Traverse all states 
    def void transformSCCConditional(Choice choice, Statechart targetRootStatechart) {
              
                var region = choice.eContainer() as Region; 
                
                val choiceReplacement = SyncgraphFactory::eINSTANCE.createSyncState();
                val incomingRedirect  = ImmutableList::copyOf(choice.incomingTransitions)
                val outgoingRedirect  = ImmutableList::copyOf(choice.outgoingTransitions)
                choiceReplacement.setName("");
                region.getVertices().add(choiceReplacement);
                for (transition : incomingRedirect) {
                    transition.setTarget(choiceReplacement);
                }
                for (transition : outgoingRedirect) {
                    transition.setSource(choiceReplacement);
                }
                    
                region.getVertices.remove(choice);
            
    }
  
    
}