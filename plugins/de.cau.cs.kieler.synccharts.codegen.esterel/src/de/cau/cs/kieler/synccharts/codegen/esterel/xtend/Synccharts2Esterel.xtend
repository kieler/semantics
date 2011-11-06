package de.cau.cs.kieler.synccharts.codegen.esterel.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject


class Synccharts2Esterel {

	@Inject extension Helper helper

	def create target : SFactory::eINSTANCE.createProgram() transform (Region root) {
		target.setName(root.states.head().id + "BLABLA")
		for (state : root.getAllStates) {
			target.states.add(state.synccharts2sState)
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

	def create target : SFactory::eINSTANCE.createState() synccharts2sState (State state) {
		target.name = state.getStatePathAsName;
		target.signals.addAll(state.getStateSignals)
		if (state.outgoingTransitions.isEmpty && state.isFinal) 
			target.instructions.addAll(state.getTermInstruction)
		if (state.outgoingTransitions.isEmpty && !state.isFinal)
			target.instructions.addAll(state.getHaltInstruction)
		if (!(state.isFinal || state.outgoingTransitions.isEmpty))
			target.instructions.addAll(state.getPauseInstruction)
	}
			
	def create target : SFactory::eINSTANCE.createTerm getTermInstruction (State state) {
		target
	}			
			
	def create target : SFactory::eINSTANCE.createHalt getHaltInstruction (State state) {
		target
	}			

	def create target : SFactory::eINSTANCE.createPause getPauseInstruction (State state) {
		target
	}			
			
	def List<Signal> getStateSignals (State state){
		var List<Signal> signalList = new ArrayList()
		for (signalOfState : state.signals) {
			signalList.add(signalOfState.transform)
		}
		signalList 
	}		

	def create target : KExpressionsFactory::eINSTANCE.createSignal() transform(Signal signal) {
		target.setCombineOperator(signal.combineOperator) 
		target.setName(signal.name) 
		target.setHostType(signal.hostType) 
		target.setInitialValue(signal.initialValue) 
		target.setIsInput(signal.isInput) 
		target.setIsOutput(signal.isOutput) 
		target.setType(signal.type)
	}

}













