/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.transformations.schedulers

import de.cau.cs.kieler.scg.SchedulingBlock
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Data holder for scheduling constraints.
 * 
 * @author ssm
 * @kieler.design 2014-01-18 proposed 
 * @kieler.rating 2014-01-18 proposed yellow
 */
class SchedulingConstraints {
	
	/** Field for all present scheduling blocks. */
	@Accessors
	List<SchedulingBlock> schedulingBlocks
	
	/** Field for scheduling clusters. */
	@Accessors
	List<List<SchedulingBlock>> schedulingBlockClusters
	
}