package de.cau.cs.kieler.yakindu.sccharts.coresccharts.xtend

import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
//import de.cau.cs.kieler.yakindu.sccharts.model.stext.SignalDeclaration
import de.cau.cs.kieler.yakindu.model.stext.synctext.SignalDefinition
import de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition
import de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition
import org.yakindu.base.types.Type;
import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.util.stdlib.CloningExtensions
import org.yakindu.sct.model.sgraph.Choice
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.sgraph.SGraphFactory
import org.yakindu.sct.model.sgraph.State
import org.yakindu.sct.model.sgraph.Statechart
import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextFactory
import org.yakindu.sct.model.stext.stext.StextFactory
import org.yakindu.base.types.PrimitiveType
import org.yakindu.base.types.TypeSystemUtils
import org.yakindu.base.types.TypesFactory

//import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.serializer.ISerializer
import de.cau.cs.kieler.yakindu.model.stext.SynctextStandaloneSetup
import de.cau.cs.kieler.yakindu.sccharts.model.stext.SCChartsExpStandaloneSetup
import org.yakindu.sct.model.stext.STextStandaloneSetup

import static de.cau.cs.kieler.yakindu.sccharts.coresccharts.xtend.SCCTransformations.*
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.ResourceSet
import javax.inject.Named
import org.eclipse.xtext.Constants
import org.eclipse.emf.common.util.URI
import javax.inject.Inject
import org.yakindu.sct.model.stext.types.STextDefaulTypeSystem
import org.yakindu.sct.model.sgraph.Effect
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression


class SCCTransformations {
 
    private static val Injector i = SynctextStandaloneSetup::doSetup();
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
    private static val ResourceSet rSet = i.getInstance(typeof(ResourceSet));
    private static val STextDefaulTypeSystem ts = i.getInstance(typeof(STextDefaulTypeSystem));
    @Named(Constants::FILE_EXTENSIONS)
    @Inject private String fileExt;
 
    //-------------------------------------------------------------------------
    //--        S C C  -  S I G N A L S  -  T R A N S F O R M A T I O N       --
    //-------------------------------------------------------------------------
           
    // Transforming Signals.
    def Statechart transformSignals(Statechart rootStatechart) {
        // Clone the complete SyncCharts region 
        val targetRootStatechart = CloningExtensions::clone(rootStatechart) as Statechart;
        var targetStates = targetRootStatechart.eAllContents().toIterable().filter(typeof(SyncState)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            targetState.transformSignals(targetRootStatechart);
        } 
        targetRootStatechart;
    }

     // For all states do the following:
     // If the state has a specification, then convert all signals
     // (a) simple signal S to boolean variable S
     // (b) valued signal S to two boolean variables S and S_val
     def void transformSignals(SyncState state, Statechart targetRootStatechart) {
//         if (!state.specification.nullOrEmpty) {
             // There is a specification, convert it
             var specification = state.specification;
             var scope = state.scopes.get(0);
             //input signal S; --> input boolean S;
             //input signal S:bool; --> input boolean S; input boolean S_val;
             //input signal S:integer; --> input boolean S; input integer S_val;
             if (scope != null) {
               specification = "";  
               for (declaration : ImmutableList::copyOf(scope.declarations)) {
                 if (declaration instanceof SignalDefinition) {
                     var specificationLine = "";
                     val signal = declaration as EventDefinition;
                     val isInput = signal.input;
                     val isOutput = signal.output;
                     val type = signal.type;
                        
                     
                     //val typeBool = signalDefinition.type.name.toString.equals("boolean");
                     //val typeInt = signalDefinition.type.name.toString.equals("integer");
                     val signalName = declaration.name;
                     val signalInit = signal.varInitialValue;
                     val signalCombine = signal.varCombineOperator;
                     //if (signalDefinition.
                     
                     val variable =  SynctextFactory::eINSTANCE.createVariableDefinition;
                     variable.setName(signalName);
                     variable.setIsInput(isInput);
                     variable.setIsOutput(isOutput);
                     variable.setType(getBooleanType);
                     
                     // Check if this is a valued signal
                     if (signal.hasType) {
                        val variableVal =  SynctextFactory::eINSTANCE.createVariableDefinition;
                        variableVal.setName(signalName + "_val");
                        variableVal.setIsInput(isInput);
                        variableVal.setIsOutput(isOutput);
                        variableVal.setType(signal.type);
                         
                        if (signalInit != null) {
                            variableVal.setInitialValue(signalInit);
                        }
                        if (signalCombine != null) {
                            variableVal.setInitialValue(signalInit); 
                        }
                        
                        // Add variable to the scope
                        scope.declarations.add(variableVal);
                        
                        // Change all references
                        val transitions = state.eAllContents().toIterable().filter(typeof(SyncTransition));
                        for (transition : transitions) {
                            val transitionSpecification = transition.specification;
                            
                            val effect = transition.effect as ReactionEffect;
                            if (effect != null) {
                              for (action : ImmutableList::copyOf(effect.actions)) {
                                if (action instanceof ElementReferenceExpression) {
                                    val refExpression = action as ElementReferenceExpression;
                                    if (refExpression.reference == signal) {
                                        // Now we know that the signals values is changed here
                                        val value = refExpression.args;
                                        val assignmentExpression = StextFactory::eINSTANCE.createAssignmentExpression;
                                        // Get the first expression only
                                        assignmentExpression.setExpression(value.get(0));
                                        val elementReferenceExpression = StextFactory::eINSTANCE.createElementReferenceExpression;
                                        elementReferenceExpression.setReference(variableVal)
                                        assignmentExpression.setVarRef(elementReferenceExpression);
                                        // Add O = 7 and remove O(7) 
                                        //effect.actions.add(assignmentExpression);
                                        //effect.actions.remove(action);
                                    }
                                }
                              }
                            }
                            
//                            // Reserialize transition
//                            state.setSpecification(serializer.serialize(transition));
//                            i.injectMembers(this);
//                            val res = rSet.createResource(URI::createFileURI("dummy."+ System::currentTimeMillis() + state.hashCode + "." +fileExt))
//                            res.contents+= EcoreUtil::copy(transition);
//                            state.setSpecification(serializer.serialize(res.contents.head));
//                            res.unload;
                        }
                        
                     }
                     
                     // Add variable to the scope
                     scope.declarations.add(variable);
                     // Remove signal from the scope
                     scope.declarations.remove(signal);
                     
                     
                     System::out.println(signal.name + " (Signal)");
                     System::out.println(variable.name + " (Variable)");
                 }
               }
               

                    /* =================================================
                     * = WORKAROUND -  Mittwoch, 3. Juli 2013 16:05:09 =
                     * =================================================
                     * Hallo Christian,
                     * im wesentlichen läuft es so wie Du gesagt hast. Wenn Du den SText-Modellteil auf
                     * den semantischen Objekten ändern willst, kannst Du auf der EMF Resource, wenn Du
                     * diese auf STextResource castest, setSerializerEnabled(true) setzen. Das sorgt 
                     * dafür, dass ein EAdapter innerhalb der AbstractSCTResource auf semantischen
                     *  Änderungen in sText lauscht und den String selbst per serializer updated. 
                     * Diesen Mechanismus benutzen wir für die Refactorings - allerdings bin ich mir
                     *  gerade gar nicht sicher ob es die in eurem Branch schon gab. Falls nicht, 
                     * müssten wir versuchen die Resource in euren Branch einzubauen. 
                     * Viele Grüße, Andreas Andreas Mülder 
                     */
//                     i.injectMembers(this);
//                     val res = rSet.createResource(URI::createFileURI("dummy."+ System::currentTimeMillis() + state.hashCode + "." +fileExt))
//                     res.contents+= EcoreUtil::copy(scope)
//                     state.setSpecification(serializer.serialize(res.contents.head));
//                     res.unload;
             }
             
             
  //       }
         
        
     }
        
        
    def Type getBooleanType() {
            return ts.booleanType;
    }    
    def Type getIntegerType() {
            return ts.integerType;
    }    
        
    def boolean isBoolean(Type type) {
        return (type != null && type.name != null && type.name.equals("boolean"));
    }     
    def boolean isInteger(Type type) {
        return (type != null && type.name != null && type.name.equals("integer"));
    }
    def boolean hasType(EventDefinition signal) {
        signal.type.isBoolean || signal.type.isInteger;
    }     
    def boolean hasType(VariableDefinition variable) {
        variable.type.isBoolean || variable.type.isInteger;
    }     
 
    //-------------------------------------------------------------------------
    //--        S C C  -  A B O R T S  -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transforming Aborts.
    def Statechart transformAborts(Statechart rootStatechart) {
        // Clone the complete SyncCharts region 
        val targetRootStatechart = CloningExtensions::clone(rootStatechart) as Statechart;
        var targetStates = targetRootStatechart.eAllContents().toIterable().filter(typeof(SyncState)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformAborts(targetRootStatechart);
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
    def void transformAborts(SyncState state, Statechart targetRootStatechart) {
        
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
                val regionStatesRaw = ImmutableList::copyOf(region.getVertices)
                var List<SyncState> regionStates = new ArrayList<SyncState>()
                for (raw : regionStatesRaw) {
                	regionStates.add(0, raw as SyncState)
                }
                
                val abortedState = SyncgraphFactory::eINSTANCE.createSyncState();
//                abortedState.setId("_Aborted" + state.hashCode);
                abortedState.setName("_Aborted")             
                abortedState.setIsFinal(true)
                val needAbortedState = ((outgoingStrongTransitions.size > 0 || 
                                         outgoingWeakTransitions.size > 0
                                        ) && (regionStates.filter(e | !e.isIsFinal).size > 0));
                if (needAbortedState) {
                       region.getVertices.add(abortedState)
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
    
    def Statechart transformConditional(Statechart rootStatechart) {
        // Clone the complete SyncCharts region 
        val targetRootStatechart = CloningExtensions::clone(rootStatechart) as Statechart;
        var targetStates = targetRootStatechart.eAllContents().toIterable().filter(typeof(Choice)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformConditional(targetRootStatechart);
        }
        
        targetRootStatechart;
    }
    
    // Traverse all states 
    def void transformConditional(Choice choice, Statechart targetRootStatechart) {
              
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