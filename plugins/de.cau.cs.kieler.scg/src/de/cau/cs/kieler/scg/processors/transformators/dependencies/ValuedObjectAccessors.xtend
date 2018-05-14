/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.dependencies

import com.google.common.collect.HashMultimap
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * ValuedObjectAccessors stores all accesses to a corresponding valued object identifier in a multi map.
 * 
 * @author ssm
 * @kieler.design 2017-08-21 proposed 
 * @kieler.rating 2017-08-21 proposed yellow
 */
class ValuedObjectAccessors {

    protected val HashMultimap<ValuedObjectIdentifier, ValuedObjectAccess> accesses = HashMultimap.create
    
    def addAccess(ValuedObjectIdentifier VOI, Node node, EObject schedule, ValuedObject scheduleObject, int priority, 
        ForkStack forkStack, boolean isSpecific
    ) {
        accesses.put(VOI, new ValuedObjectAccess(node, schedule, scheduleObject, priority, forkStack, isSpecific))
    }
    
    def addAccess(ValuedObjectIdentifier VOI, ValuedObjectAccess VOA) {
        accesses.put(VOI, VOA)
    }
          
    def getMap() {
        accesses
    }          
          
}