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
package de.cau.cs.kieler.kexpressions.kext.dependencies

import com.google.common.collect.HashMultimap
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.annotations.NamedObject

/**
 * ValuedObjectAccessors stores all accesses to a corresponding valued object identifier in a multi map.
 * 
 * @author ssm
 * @kieler.design 2017-08-21 proposed 
 * @kieler.rating 2017-08-21 proposed yellow
 */
class ValuedObjectAccessors<T extends NamedObject> {

    protected val HashMultimap<ValuedObjectIdentifier, ValuedObjectAccess<T>> accesses = HashMultimap.create
    
    def addAccess(ValuedObjectIdentifier VOI, T node, EObject schedule, ValuedObject scheduleObject, int priority, 
        ForkStack<T> forkStack, boolean isSpecific
    ) {
        accesses.put(VOI, new ValuedObjectAccess(node, schedule, scheduleObject, priority, forkStack, isSpecific))
    }
    
    def addAccess(ValuedObjectIdentifier VOI, ValuedObjectAccess<T> VOA) {
        accesses.put(VOI, VOA)
    }
          
    def getMap() {
        accesses
    }          
          
}