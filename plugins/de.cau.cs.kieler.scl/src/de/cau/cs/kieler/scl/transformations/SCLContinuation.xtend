package de.cau.cs.kieler.scl.transformations

import de.cau.cs.kieler.scg.Node
import java.util.List
import de.cau.cs.kieler.scg.ControlFlow

class SCLContinuation {
	
	@Property
	Node node
	
	@Property
	List<ControlFlow> controlFlows = <ControlFlow> newArrayList
}