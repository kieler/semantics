package de.cau.cs.kieler.scl.transformations

import de.cau.cs.kieler.scg.Node
import java.util.List
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scl.scl.Label

class SCLContinuation {
	
	@Property
	Node node
	
	@Property
	List<ControlFlow> controlFlows = <ControlFlow> newArrayList
	
	@Property
	Label Label
}