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
package de.cau.cs.kieler.kexpressions.keffects.dependencies

import com.google.common.collect.HashMultimap
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference

/**
 * ValuedObjectAccessors stores all accesses to a corresponding valued object identifier in a multi map.
 * 
 * @author ssm
 * @kieler.design 2017-08-21 proposed 
 * @kieler.rating 2017-08-21 proposed yellow
 */
class ValuedObjectAccessors {

    protected val HashMultimap<ValuedObjectIdentifier, ValuedObjectAccess> accesses = HashMultimap.create
    protected val accessLUT = <ValuedObjectAccess, ValuedObjectIdentifier>newHashMap

    def addAccess(
        ValuedObjectIdentifier VOI,
        Linkable node,
        ScheduleObjectReference sor,
        int fallbackPriority,
        ForkStack forkStack,
        boolean isSpecific
    ) {
        val VOA = new ValuedObjectAccess(node, sor, fallbackPriority, forkStack, isSpecific)
        accesses.put(VOI, VOA)
        accessLUT.put(VOA, VOI)
    }

    def addAccess(ValuedObjectIdentifier VOI, ValuedObjectAccess VOA) {
        accesses.put(VOI, VOA)
        accessLUT.put(VOA, VOI)
    }

    def removeAccess(ValuedObjectIdentifier VOI, ValuedObjectAccess VOA) {
        accesses.remove(VOI, VOA)
        accessLUT.remove(VOA)
    }

    def removeAllAccesses(ValuedObjectIdentifier VOI) {
        accesses.removeAll(VOI)
        accessLUT.entrySet.removeIf[value == VOI]
    }

    def removeAllAccesses(ValuedObject vo) {
        accesses.entries.removeIf[key.valuedObject == vo]
        accessLUT.entrySet.removeIf[value.valuedObject == vo]
    }

    def getAccesses(ValuedObjectIdentifier VOI) {
        accesses.get(VOI)
    }

    def getMap() {
        accesses
    }

    def getLinkableAccessMap() {
        val accesses = accesses.values.toList
        val HashMultimap<Linkable, ValuedObjectIdentifier> linkables = HashMultimap.create => [ map |
            accesses.forEach [
                val key = accessLUT.get(it)
                map.put(it.associatedNode, key)
            ]
        ]
        return linkables
    }

}
