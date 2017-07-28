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
package de.cau.cs.kieler.scg.transformations.synchronizer

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SchedulingBlock
import java.util.HashMap
import java.util.List
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.transformations.sequentializer.GuardExpression

/**
 * The {@code SynchronizerData} class comprises members for the data mandatory to 
 * create a guard expression entry in the scheduling information of the scheduler.<br>
 * It is filled by a synchronizer and used by a scheduler.
 * 
 * @author ssm
 * @kieler.design 2013-11-28 proposed 
 * @kieler.rating 2013-11-28 proposed yellow 
 */

class SynchronizerData {
    
    @Property
    String synchronizerId
    
	/** List of predecessors of the join node */
	@Property
    List<SchedulingBlock> predecessors = <SchedulingBlock> newArrayList
    
    /** 
     * List of additional ValuedObjects
     * The synchronizer may need an arbitrary number of additional assignments, so called empty expressions.
     * Therefore, additional needed ValuedObjects must be added to the SCG valuedObjects list. 
     * Any new created ValuedObject is stored in the valuedObjects list.
     */
    @Property
    List<ValuedObject> valuedObjects = <ValuedObject> newArrayList
    
    /**
     * guardExpression holds the actual expression of the synchronizer. It can be modified or used directly 
     * by the scheduler.
     */
    public var GuardExpression guardExpression = new GuardExpression
    
    @Property
    HashMap<Node, ValuedObject> threadMapping = new HashMap<Node, ValuedObject>
    
    @Property
    Join join

    @Property
    Guard guard
    
    /**
     * Map of additional assignments with respect to their scheduling blocks.
     * The synchronizer might want to add additional assignments to synchronize threads. 
     * Therefore this field allows storage after their creation so that the scheduler and the
     * sequentializer might use them.
     */
    private val additionalAssignments = new HashMap<SchedulingBlock, List<Pair<ValuedObject, Expression>>>
    
    
	public def SynchronizerData addAdditionalAssignment(SchedulingBlock schedulingBlock, 
		ValuedObject valuedObject, Expression assignment
	) {
		var list = additionalAssignments.get(schedulingBlock)
		if (list == null) {
			list = <Pair<ValuedObject, Expression>> newArrayList
			additionalAssignments.put(schedulingBlock, list)
		}
		list.add(new Pair<ValuedObject, Expression>(valuedObject, assignment))
		this
	} 
	
	public def List<Pair<ValuedObject, Expression>> getAdditionalAssignments(SchedulingBlock schedulingBlock) {
		additionalAssignments.get(schedulingBlock)
	}
	
	public def List<SchedulingBlock> getAdditionalAssignmentBlocks() {
		additionalAssignments.keySet.toList
	}
    
}