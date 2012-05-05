package de.cau.cs.kieler.synccharts.codegen.s.xtend

import de.cau.cs.kieler.synccharts.*
//import de.cau.cs.kieler.s.s.*
import de.cau.cs.kieler.s.*
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject
import org.eclipse.xtend.util.stdlib.TraceComponent


class Synccharts2S {

	@Inject extension Helper helper

	def create target : SFactory::eINSTANCE.createProgram() transform (Region root) {
		var rootState = root.states.head();

		// clear traces
		TraceComponent::clearTrace();
		
		// set s program name (as the root state's name)
		target.setName(rootState.id)

		// add interface signals to s program (as the root state's signals)
		target.signals.addAll(rootState.getStateSignals);
		
		// create all states and their mapping
		for (state : root.getAllStates) {
			var sStateSurface = state.state2SStateSurface(state.isRootState, false);
			var sStateDepth   = state.state2SStateDepth(state.isRootState, false);
			// possibly parallel regions
			if (state.regions.size > 1) {
				var sStateMainSurface = state.state2SStateSurface(state.isRootState, true);
				var sStateMainDepth   = state.state2SStateDepth(state.isRootState, true);
				// create traces for all created surface and depth s states
				TraceComponent::createTrace(state, sStateSurface, "MainSurface" );
				TraceComponent::createTrace(sStateSurface, state, "MainSurfaceBack" );
				TraceComponent::createTrace(state, sStateDepth, "MainDepth" );
				TraceComponent::createTrace(sStateDepth, state, "MainDepthBack" );
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
		for (state : root.getAllStates) {
			var sStateSurface = TraceComponent::getSingleTraceTarget(state, "Surface") as de.cau.cs.kieler.s.s.State
			var sStateDepth = TraceComponent::getSingleTraceTarget(state, "Depth") as de.cau.cs.kieler.s.s.State
			state.fillSStateSurface(sStateSurface);
			state.fillSStateDepth(sStateDepth); 
		}
		 
		
	}		

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
	
	// HANDLE S STATE FILLING
	
	def fillSStateSurface (State state, de.cau.cs.kieler.s.s.State sState) {
		var regardedTransitionList = state.outgoingTransitions.filter(e|e.isImmediate).sort(e1, e2 | if (e1.priority < e2.priority) {-1} else {1});
		var noTransitions = regardedTransitionList.isEmpty;
		var finalState = state.isFinal;

		// outgoing immediate transitions
		for (transition : regardedTransitionList) {
			var sif = SFactory::eINSTANCE.createIf();
			var scontinuation = TraceComponent::getSingleTraceTarget(transition.targetState, "Surface") as de.cau.cs.kieler.s.s.State
			sif.setExpression(transition.trigger);
			sif.setContinuation(scontinuation);
			sState.instructions.add(sif);
		}
		
		// parallel regions
		if (state.regions.size > 1) {
			//fork
			
			
		}
	}	
	
	def fillSStateDepth (State state, de.cau.cs.kieler.s.s.State sState) {
		var regardedTransitionList = state.outgoingTransitions.filter(e|!e.isImmediate).sort(e1, e2 | if (e1.priority < e2.priority) {-1} else {1});
		var noTransitions = regardedTransitionList.isEmpty;
		var isFinal = state.isFinal;
		
		for (transition : regardedTransitionList) {
			var sif = SFactory::eINSTANCE.createIf();
			var strans = SFactory::eINSTANCE.createTrans();
			var scontinuation = TraceComponent::getSingleTraceTarget(transition.targetState, "Surface") as de.cau.cs.kieler.s.s.State
			
			if (transition.trigger != null) {
				sif.setExpression(transition.trigger.convertToSExpression());
			}
			else {
				sif.setExpression(getTrueBooleanValue());
			}
			
			strans.setContinuation(scontinuation);
			sif.instructions.add(strans);
			
			//sif.setContinuation(scontinuation);
			sState.instructions.add(sif);
		}
		
		if (!(noTransitions || isFinal)) {
			var strans = SFactory::eINSTANCE.createTrans();
			strans.setContinuation(sState);
			sState.instructions.add(strans);
		}
		
	}	

	// ======================================================================================================
	
	// HANDLE S STATE CREATION
	
	def create target : SFactory::eINSTANCE.createState() state2SStateSurface (State state, Boolean root, Boolean main) {
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
	}	
	
	def create target : SFactory::eINSTANCE.createState() state2SStateDepth (State state, Boolean root, Boolean main) {
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
		var regardedTransitionList = state.outgoingTransitions.filter(e|!e.isImmediate).sort(e1, e2 | if (e1.priority < e2.priority) {-1} else {1});
		var noTransitions = regardedTransitionList.isEmpty;
		var isFinal = state.isFinal;
		
		if (noTransitions && state.isFinal) 
			target.instructions.addAll(state.getTermInstruction)
		if (noTransitions && !state.isFinal)
			target.instructions.addAll(state.getHaltInstruction)
		if (!(noTransitions || isFinal))
			target.instructions.addAll(state.getPauseInstruction)
	}
	
	// ======================================================================================================
	
	// HANDLE BASIC STATES
			
	def create target : SFactory::eINSTANCE.createTerm getTermInstruction (State state) {
		target
	}			
			
	def create target : SFactory::eINSTANCE.createHalt getHaltInstruction (State state) {
		target.setContinuation(target.eContainer as de.cau.cs.kieler.s.s.State);
		target
	}			

	def create target : SFactory::eINSTANCE.createPause getPauseInstruction (State state) {
		target
	}			 
			
	// ======================================================================================================
	
}













