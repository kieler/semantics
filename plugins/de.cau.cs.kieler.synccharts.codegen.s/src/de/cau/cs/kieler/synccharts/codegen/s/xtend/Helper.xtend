package de.cau.cs.kieler.synccharts.codegen.s.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject
import org.eclipse.xtend.util.stdlib.TraceComponent
import org.eclipse.xtend.util.stdlib.CloningExtensions


class Helper {

def Boolean isRootState(State state) {
	state.parentRegion.parentState == null;
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
 	var ssignal = TraceComponent::getSingleTraceTarget(expression.valuedObject, "Signal") as de.cau.cs.kieler.core.kexpressions.Signal
	expression.setValuedObject(ssignal);
 	expression; 
}

def Expression getTrueBooleanValue() {
	var booleanValue = KExpressionsFactory::eINSTANCE.createBooleanValue();
	 booleanValue.setValue(true);
	 booleanValue	
}


	// ======================================================================================================
	
	// HANDLE / CONVERT SYNCCHART SIGNALS INTO S SIGNALS

	def List<Signal> getStateSignals (State state){
		var List<Signal> signalList = new ArrayList()
		for (signal : state.signals) {
			var ssignal = signal.transform;
			signalList.add(ssignal)
			// 	create traces for all created signals
			TraceComponent::createTrace(signal, ssignal, "Ssignal" );
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



}