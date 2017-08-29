package de.cau.cs.kieler.scl.transformations

import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scl.Label
import java.util.List
import org.eclipse.xtend.lib.Property

class SCLContinuation {
	
	@Property
	Node node
	
	@Property
	List<ControlFlow> controlFlows = <ControlFlow> newArrayList
	
	@Property
	Label Label
}