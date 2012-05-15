package de.cau.cs.kieler.synccharts.codegen.s.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject
import org.eclipse.xtend.util.stdlib.TraceComponent
import org.eclipse.xtend.util.stdlib.CloningExtensions
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node
import de.cau.cs.kieler.s.s.Prio
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory


class Helper {

def Boolean isRootState(State state) {
	state.parentRegion.parentState == null;
}

def Boolean isHierarchical(State state) {
	state.regions.size > 0;
}

// ======================================================================================================
// ==                                    convert expressions                                           ==
// ======================================================================================================

//def replaceWithCorrespondingSExpression(Expression expression) {
//	var parent = expression.eContainer as ComplexExpression;
//	var convertedExpression = expression.convertToSExpression();
//	parent.subExpressions.add(convertedExpression);
//	parent.subExpressions.remove(expression);
//	convertedExpression;
//}

// apply conversion on children
def dispatch Expression convertToSExpression(Expression expression) {
	if (expression instanceof ComplexExpression) {
		for (subExpression : (expression as ComplexExpression).subExpressions) {
			subExpression.convertToSExpression();
		} 
	}
	expression;
}

//ValuedObjectReference - added by cmot for handleIfSingle() function (present tests of simple triggers)
def dispatch Expression convertToSExpression(ValuedObjectReference expression) {
 	var sSignal = TraceComponent::getSingleTraceTarget(expression.valuedObject, "Signal") as de.cau.cs.kieler.core.kexpressions.Signal
	expression.setValuedObject(sSignal);
 	expression; 
}

def Expression getTrueBooleanValue() {
	var booleanValue = KExpressionsFactory::eINSTANCE.createBooleanValue();
	 booleanValue.setValue(true);
	 booleanValue	
}


	// convert transition effects
	def dispatch void convertToSEffect(Emission effect, List<de.cau.cs.kieler.s.s.Instruction> instructions) {
		val sEmit = SFactory::eINSTANCE.createEmit;
		val sSignal = TraceComponent::getSingleTraceTarget(effect.signal, "Signal") as de.cau.cs.kieler.core.kexpressions.Signal
		sEmit.setSignal(sSignal);
		instructions.add(sEmit);
	}
	def dispatch void convertToSEffect(Assignment effect, de.cau.cs.kieler.s.s.State sState) {
		// todo
	}
	def dispatch void convertToSEffect(TextEffect effect, de.cau.cs.kieler.s.s.State sState) {
		// todo
	}
	def dispatch void convertToSEffect(Effect effect, de.cau.cs.kieler.s.s.State sState) {
		// todo
	}

	// ======================================================================================================
	
	// HANDLE / CONVERT SYNCCHART SIGNALS INTO S SIGNALS

	def List<Signal> getStateSignals (State state){
		var List<Signal> signalList = new ArrayList()
		for (signal : state.signals) {
//			val isignal = KExpressionsFactory::eINSTANCE.createISignal();
			var ssignal = signal.transform;
//				isignal.setName(ssignal.name);
//				isignal.setIsInput(signal.isInput);
//				isignal.setIsOutput(signal.isOutput);
//				isignal.setType(ValueType::PURE);
				signalList.add(ssignal)
				// 	create traces for all created signals
				TraceComponent::createTrace(signal, ssignal, "Signal" );
				TraceComponent::createTrace(ssignal, signal, "SignalBack" );
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


// ======================================================================================================

// Returns a String for a region if a state has more than one inner regions
def String getParentRegionString(State state) {
	var Region region = state.parentRegion;
	if (region.parentState.regions.size == 1) {
		""
	}
	else { 
		"_" + region.id
	}
}

// Returns the name of a state, e.g. "L_Initial_Initial_"
// TODO: shortest hierarchy, unique incremental name DataComponent options 
def String getStatePathAsName(State state) {
//	"_" + state.hashCode.toString;
	if (state.isRootState())  {
		if (state.regions.size > 1) {
		   "_" + state.id	
		}
		else {
			"L"
		}	
	} else {
		var String regionString = getParentRegionString(state);
		getStatePathAsName(state.parentRegion.parentState) + regionString + "_" + state.id
	}
}


   def State getInitialState(Region region) {
   	  region.states.filter(e | e.isInitial).toList.get(0);   	
   }


   def de.cau.cs.kieler.s.s.State getSurfaceSState(State state) {
   	 TraceComponent::getSingleTraceTarget(state, "Surface") as de.cau.cs.kieler.s.s.State
   }
   def de.cau.cs.kieler.s.s.State getDepthSState(State state) {
   	 TraceComponent::getSingleTraceTarget(state, "Depth") as de.cau.cs.kieler.s.s.State
   }
   def de.cau.cs.kieler.s.s.State getJoinSState(State state) {
   	 TraceComponent::getSingleTraceTarget(state, "Join") as de.cau.cs.kieler.s.s.State
   }

// ======================================================================================================
	
	def List<Transition> getWeakTransitionsOrdered(State state) {
		state.outgoingTransitions.filter(e|e.type == TransitionType::WEAKABORT).sort(e1, e2 | compareTransitionPriority(e1,e2));
	}
	def List<Transition> getStrongTransitionsOrdered(State state) {
		state.outgoingTransitions.filter(e|e.type == TransitionType::STRONGABORT).sort(e1, e2 | compareTransitionPriority(e1,e2));
	}
	def Transition getNormalTerminationTransition(State state) {
		val normalTerminations = state.outgoingTransitions.filter(e|e.type == TransitionType::NORMALTERMINATION);
		if (normalTerminations.nullOrEmpty) {
			return null;
		}
		return normalTerminations.toList.get(0);
	}
	
	def boolean finalState(State state) {
		return (state.outgoingTransitions.filter(e|!e.isImmediate).nullOrEmpty || state.isFinal);
	}


// ======================================================================================================

 // Only add the prio statement if the last one was not the same
 def void addOptimized(List<Instruction> instructions, Prio prioStatement) {
 	val lastPrioStatementList = instructions.filter(typeof(Prio)).toList()
 	// check if PRIO has not changed
 	if (!lastPrioStatementList.nullOrEmpty) {
 		val lastPrioStatement = lastPrioStatementList.last;
	 	if (lastPrioStatement.priority == prioStatement.priority) {
 			return
 		}
 	}
 	// check if a PRIO instruction just before is higher or equal
 	if ((instructions.tail instanceof Prio) && ((instructions.tail as Prio).priority > prioStatement.priority)) {
 		// lower last prio statement
 		(instructions.tail as Prio).setPriority(prioStatement.priority);
 		return;
 	}
	instructions.add(prioStatement);
 }

// ======================================================================================================

	def void addHighestWeakPrio(de.cau.cs.kieler.s.s.State sState, State state) {
		addWeakPrio(sState, state, null);
	}
	
	def void addHighestStrongPrio(de.cau.cs.kieler.s.s.State sState, State state) {
		addStrongPrio(sState, state, null);
	}	
	
	def void addWeakPrio(de.cau.cs.kieler.s.s.State sState, State state, Transition transition) {
		var prioStatement = SFactory::eINSTANCE.createPrio();
		var dependencyNode = state.getDependencyWeakNode(transition)
		if (dependencyNode != null) {
			val priority = dependencyNode.priority;
			prioStatement.setPriority(priority);
			sState.instructions.addOptimized(prioStatement)
		}
	}
	
	def void addStrongPrio(de.cau.cs.kieler.s.s.State sState, State state, Transition transition) {
		var prioStatement = SFactory::eINSTANCE.createPrio();
		var dependencyNode = state.getDependencyStrongNode(transition)
		if (dependencyNode != null) {
			val priority = dependencyNode.priority;
			prioStatement.setPriority(priority);
			sState.instructions.addOptimized(prioStatement)
		}
	}	
	
	
	def Node getHighestDependencyStrongNode(State state) {
		return  getDependencyStrongNode(state, null);	
	}
	
	def Node getHighestDependencyWeakNode(State state) {
		if (!state.hierarchical) {
			// for simple states, weak priorities are the same as strong priorities
			return getDependencyStrongNode(state, null);
		}
		return  getDependencyWeakNode(state, null);	
	}


	// Get the highest priority for all strong nodes of this state in case transition is null
	// or the strong dependency node linked to this transition.
	def Node getDependencyStrongNode(State state, Transition transition) {
		val nodes = (TraceComponent::getTraceTargets(state, "DependencyStrong") as List<Node>);
		if (nodes.empty) {
			return null;
		}
		if (transition == null) {
			return	nodes.sort(e1, e2 | compareDependencyPriority(e2,e1)).get(0);
		}
		return nodes.filter(e|e.transition == transition).toList().get(0);
	}
	
	// Get the highest priority for all weak nodes of this state in case transition is null
	// or the weak dependency node linked to this transition.
	def Node getDependencyWeakNode(State state, Transition transition) {
		if (!state.hierarchical) {
			// for simple states, weak priorities are the same as strong priorities
			return getDependencyStrongNode(state, transition)
		}
		val nodes = (TraceComponent::getTraceTargets(state, "DependencyWeak") as List<Node>);
		if (nodes.empty) {
			return null;
		}
		if (transition == null) {
			return nodes.sort(e1, e2 | compareDependencyPriority(e2,e1)).get(0);
		}
		return nodes.filter(e|e.transition == transition).toList().get(0);
	}

	def int compareTraceDependencyPriority(State e1, State e2) {
		if (e1.getDependencyStrongNode(null).priority > 
		    e2.getDependencyStrongNode(null).priority) {-1} else {1}
	}

	def int compareTransitionPriority(Transition e1, Transition e2) {
		if (e1.priority < e2.priority) {-1} else {1}	
	}

	def int compareDependencyPriority(Node e1, Node e2) {
		if (e1.priority < e2.priority) {-1} else {1}	
	}


}