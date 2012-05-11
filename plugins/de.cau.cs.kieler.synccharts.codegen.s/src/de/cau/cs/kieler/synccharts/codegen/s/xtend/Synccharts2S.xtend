package de.cau.cs.kieler.synccharts.codegen.s.xtend

import de.cau.cs.kieler.synccharts.*
//import de.cau.cs.kieler.s.s.*
import de.cau.cs.kieler.s.*
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject
import org.eclipse.xtend.util.stdlib.TraceComponent
import com.google.inject.Guice
import de.cau.cs.kieler.synccharts.codegen.dependencies.xtend.Synccharts2Dependenies
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyFactory
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyType
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node

class Synccharts2S {

	extension de.cau.cs.kieler.synccharts.codegen.dependencies.xtend.Synccharts2Dependenies Synccharts2Dependenies = Guice::createInjector().getInstance(typeof(Synccharts2Dependenies));
	extension de.cau.cs.kieler.synccharts.codegen.s.xtend.Helper Helper = Guice::createInjector().getInstance(typeof(Helper));

	// ======================================================================================================
	// ==                                        M A I N   T R A N S F O R M A T I O N                     ==
	// ======================================================================================================

	def create target : SFactory::eINSTANCE.createProgram() transform (Region rootRegion) {
		val rootState = rootRegion.states.head();

		// clear traces
		TraceComponent::clearTrace();
		
		// dependency analysis
		val dependencies = DependencyFactory::eINSTANCE.createDependencies();
		Synccharts2Dependenies.transform(dependencies, rootRegion);
		
		// set highest priority
		target.setPriority(dependencies.nodes.size);
		
		// create mapping from SyncChart states to dependency nodes
		for (node : dependencies.nodes) {
			if (node.type == DependencyType::WEAK) {
				TraceComponent::createTrace(node.state, node, "DependencyWeak");
			}
			else {
				TraceComponent::createTrace(node.state, node, "DependencyStrong");
			}
		}
		
		// set s program name (as the root state's name)
		target.setName(rootState.id)

		// add interface signals to s program (as the root state's signals)
		target.signals.addAll(rootState.getStateSignals);
		
		// order SyncChart states according to their dependency priority (strong nodes)
		val dependencyPrioritySortedStates = rootRegion.getAllStates.sort(e1, e2 | compareTraceDependencyPriority(e1, e2));
		
		// create all states and their mapping
		for (state : dependencyPrioritySortedStates) {
			val sStateSurface = state.createSStateSurface(state.isRootState, false);
			val sStateDepth   = state.createSStateDepth(state.isRootState, false);
			// possibly parallel regions
			if (state.regions.size > 1) {
				val sStateMainSurface = state.createSStateSurface(state.isRootState, true);
				val sStateMainDepth   = state.createSStateDepth(state.isRootState, true);
				// create traces for all created surface and depth s states
				TraceComponent::createTrace(state, sStateMainSurface, "MainSurface" );
				TraceComponent::createTrace(sStateMainSurface, state, "MainSurfaceBack" );
				TraceComponent::createTrace(state, sStateMainDepth, "MainDepth" );
				TraceComponent::createTrace(sStateMainDepth, state, "MainDepthBack" );
				// add new s states to program
				target.states.add(sStateMainSurface);
				target.states.add(sStateMainDepth);
			}
			// create traces for all created surface and depth s states
			TraceComponent::createTrace(state, sStateSurface, "Surface" );
			TraceComponent::createTrace(sStateSurface, state, "SurfaceBack" );
			TraceComponent::createTrace(state, sStateDepth, "Depth" );
			TraceComponent::createTrace(sStateDepth, state, "DepthBack" );
			// add new s states to program
			target.states.add(sStateSurface);
			target.states.add(sStateDepth);
		}
		
		// handle transitions (as states are created now and gotos can be mapped)
		for (state : rootRegion.getAllStates) {
			val sStateSurface = state.surfaceSState
			val sStateDepth = state.depthSState
			state.fillSStateSurface(sStateSurface);
			state.fillSStateDepth(sStateDepth); 
		}
		 
		
	}		


	// ======================================================================================================
	// ==                   T R A V E R S E   A L L   S T A T E S   A N D   R E G I O N S                  ==
	// ======================================================================================================

	def List<State> getAllStates(Region region) {
		var List<State> stateList = new ArrayList()
		for (state : region.states) {
			stateList.add(state)
			for (regionsOfState : state.regions) {
				stateList.addAll(regionsOfState.getAllStates)
			}  
		}
		stateList
	}

	def List<State> getAllStatesOfRegion (Region region) {
		region.states
	}

	def List<Region> getAllRegionsOfState (State state) {
		state.regions
	}
	

	// ======================================================================================================
	// ==                             H A N D L E   S   S T A T E   S U R F A C E                          ==
	// ======================================================================================================
	
	def fillSStateSurface (State state, de.cau.cs.kieler.s.s.State sState) {
		val regardedTransitionListStrong = state.strongTransitionsOrdered.filter(e|e.isImmediate);
		val regardedTransitionListWeak = state.weakTransitionsOrdered.filter(e|e.isImmediate);

		// first handle all strong preemptions
		for (transition : regardedTransitionListStrong) {
			transition.handleTransition(sState);
		}
		
		// lower priority (to allow a possible body to be executed)
		sState.addWeakPrio(state);
		
		// then handle all weak preemptions
		for (transition : regardedTransitionListWeak) {
			transition.handleTransition(sState);
		}
		
		// parallel regions
		if (state.regions.size > 1) {
			// fork inner regions
			for (region : state.regions) {
				val initialState = region.initialState;
				val sfork = SFactory::eINSTANCE.createFork();
				sfork.setThread(initialState.surfaceSState)
				sfork.setPriority(initialState.dependencyStrongNode.priority);
				sState.instructions.add(sfork);
			}
			// fork main thread
			val sfork = SFactory::eINSTANCE.createFork();
			sfork.setThread(state.mainSurfaceSState)
			sfork.setPriority(state.dependencyStrongNode.priority);
			sState.instructions.add(sfork);
		}
		
		// continue with depth
		val scontinuation = state.depthSState
		val strans = SFactory::eINSTANCE.createTrans();
		strans.setContinuation(scontinuation);
		sState.instructions.add(strans);
	}	

	
	// ======================================================================================================
	// ==                              H A N D L E   S   S T A T E   D E P T H                             ==
	// ======================================================================================================
	
	def fillSStateDepth (State state, de.cau.cs.kieler.s.s.State sState) {
		val regardedTransitionListStrong = state.strongTransitionsOrdered
		val regardedTransitionListWeak = state.weakTransitionsOrdered
		
		// optimization: of halt or term before then exit
		if (    !sState.instructions.filter(typeof(de.cau.cs.kieler.s.s.Halt)).empty 
		     || !sState.instructions.filter(typeof(de.cau.cs.kieler.s.s.Term)).empty) {
			return null;
		}

	    // before the pause statement possibly raise priority
	    if (state.getDependencyWeakNode != null) {
		    // optimization: do this only if the priority might be lowered (weak prio exist)
		    sState.addStrongPrio(state);
	    } 
	    
	    // create a pause instruction only iff no HALT or TERM instruction
	    // halt == no outgoing transition
	    // term == final state
		if (!state.finalState) {
			sState.instructions.add(SFactory::eINSTANCE.createPause());
		}


		// first handle all strong preemptions
		for (transition : regardedTransitionListStrong) {
			transition.handleTransition(sState);
		}
		
		// lower priority (to allow a possible body to be executed)
		sState.addWeakPrio(state);
		
		// then handle all weak preemptions
		for (transition : regardedTransitionListWeak) {
			transition.handleTransition(sState);
		}
		
		// if this a final state wait for join otherwise continue in the next tick to possibly handle strong and weak transitions
		if (!state.finalState) {
			var strans = SFactory::eINSTANCE.createTrans();
			strans.setContinuation(sState);
			sState.instructions.add(strans);
		}
		
	}	
	
	// ======================================================================================================
	// ==                                   H A N D L E   T R A N S I T I O N                              ==
	// ======================================================================================================
	
	def void handleTransition(Transition transition, de.cau.cs.kieler.s.s.State sState) {
			val sif = SFactory::eINSTANCE.createIf();
			val strans = SFactory::eINSTANCE.createTrans();
			
			// handle transition trigger - convert to s-expression
			if (transition.trigger != null) {
				sif.setExpression(transition.trigger.convertToSExpression);
			}
			else {
				sif.setExpression(getTrueBooleanValue());
			}
			
			// handle transition effect - convert to s-effect
			if (!transition.effects.nullOrEmpty) {
				for (effect : transition.effects) {
					effect.convertToSEffect(sif.instructions);
				}
			}
			
			strans.setContinuation(transition.targetState.surfaceSState);
			sif.instructions.add(strans);
			
			sState.instructions.add(sif);
	}	

	// ======================================================================================================
	// ==                          H A N D L E   S   S  T A T E   C R E A T I O N                          ==
	// ======================================================================================================
	
	def de.cau.cs.kieler.s.s.State createSStateSurface (State state, Boolean root, Boolean main) {
		val target = SFactory::eINSTANCE.createState(); 
		target.name = state.getStatePathAsName;
		if (root) {
			target.name = "L_root";
		}
		if (main) {
			target.name = target.name + "_main";
		}
		target.name = target.name + "_surface";

		if (!root) {
			// add root state signals to program only (not to the state itself)
			target.signals.addAll(state.getStateSignals)
		}
		target;
	}	
	
	def de.cau.cs.kieler.s.s.State createSStateDepth (State state, Boolean root, Boolean main) {
		val target = SFactory::eINSTANCE.createState(); 
		target.name = state.getStatePathAsName;
		if (root) {
			target.name = "L_root";
		}
		if (main) {
			target.name = target.name + "_main";
		}
		target.name = target.name + "_depth";
		
		if (!root) {
			// add root state signals to program only (not to the state itself)
			target.signals.addAll(state.getStateSignals)
		}

		val noTransitions = state.outgoingTransitions.filter(e|!e.isImmediate).isEmpty;
		if (noTransitions && state.isFinal) 
			target.instructions.addAll(SFactory::eINSTANCE.createTerm)
		if (noTransitions && !state.isFinal)
			target.instructions.addAll(SFactory::eINSTANCE.createHalt)
			
		target;
	}

	
	// ======================================================================================================
	// ==                                XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX                             ==
	// ======================================================================================================
	
	// ======================================================================================================
	
}













