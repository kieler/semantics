/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.schedulers

import java.util.List
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Guard

/**
 * Data holder for scheduling constraints.
 * 
 * @author ssm
 * @kieler.design 2014-01-18 proposed 
 * @kieler.rating 2014-01-18 proposed yellow
 */
class SchedulingConstraints {
	
	/** Field for all present scheduling blocks. */
	@Property
	List<SchedulingBlock> schedulingBlocks
	
	/** Field for scheduling clusters. */
	@Property
	List<List<SchedulingBlock>> schedulingBlockClusters
	
//	@Property
//	List<Guard> guards
}