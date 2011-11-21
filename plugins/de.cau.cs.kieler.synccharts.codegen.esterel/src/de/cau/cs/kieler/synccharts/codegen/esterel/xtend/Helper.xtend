package de.cau.cs.kieler.synccharts.codegen.esterel.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject

class Helper {

// Returns wether a state is the single root state
def Boolean isRootState(State state) {
	state.parentRegion.parentState == null;
}


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