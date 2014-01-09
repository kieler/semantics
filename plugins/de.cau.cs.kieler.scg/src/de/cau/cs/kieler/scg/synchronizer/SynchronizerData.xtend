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
package de.cau.cs.kieler.scg.synchronizer

import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgsched.GuardExpression
import de.cau.cs.kieler.scgsched.ScgschedFactory
import de.cau.cs.kieler.core.kexpressions.ValuedObject

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
	/** List of predecessors of the join node */
    public var predecessors = <SchedulingBlock> newArrayList
    
    /** 
     * List of additional ValuedObjects
     * The synchronizer may need an arbitrary number of additional assignments, so called empty expressions.
     * Therefore, additional needed ValuedObjects must be added to the SCG valuedObjects list. 
     * Any new created ValuedObject is stored in the valuedObjects list.
     */
    public var valuedObjects = <ValuedObject> newArrayList
    
    /**
     * guardExpression holds the actual expression of the synchronizer. It can be modified or used directly 
     * by the scheduler.
     */
    public var GuardExpression guardExpression = ScgschedFactory::eINSTANCE.createGuardExpression
}