package de.cau.cs.kieler.scg.schedulers

import java.util.List
import de.cau.cs.kieler.scgbb.SchedulingBlock

class SchedulingConstraints {
	
	@Property
	List<SchedulingBlock> schedulingBlocks
	
	@Property
	List<List<SchedulingBlock>> schedulingBlockClusters
}