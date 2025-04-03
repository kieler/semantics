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

import com.google.inject.Guice
import com.google.inject.Injector
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeHRExtensions
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * A ValuedObjectAccess is a storage class for a particular access to an valued object.
 * It is used to store accesses to valued objects in a multi map together with its corresponding identifier as key.
 * 
 * @author ssm
 * @kieler.design 2017-08-21 proposed 
 * @kieler.rating 2017-08-21 proposed yellow
 */

class ValuedObjectAccess {
    
    // Hard-coded IUR protocol
    public static val ScheduleObjectReference GLOBAL_SCHEDULE = null
    public static val GLOBAL_WRITE = 0
    public static val GLOBAL_RELATIVE_WRITE = 1
    public static val GLOBAL_READ = 2
    
    @Accessors Linkable node
    @Accessors Linkable associatedNode
    @Accessors(PUBLIC_GETTER) EObject schedule
    @Accessors(PUBLIC_GETTER) ValuedObject scheduleObject
    @Accessors(PUBLIC_GETTER) int priority 
    @Accessors ForkStack forkStack
    @Accessors boolean isSpecific
    @Accessors boolean isWriteAccess = false
    
    new(Linkable node, ScheduleObjectReference sor, int fallbackPriority, ForkStack forkStack, boolean isSpecific) {
        this(node, node, sor, fallbackPriority, forkStack, isSpecific)
    }
    
    new(Linkable node, Linkable associatedNode, ScheduleObjectReference sor, int fallbackPriority, ForkStack forkStack, boolean isSpecific) {
        this.node = node
        this.associatedNode = associatedNode
        this.schedule = GLOBAL_SCHEDULE
        this.scheduleObject = null
        this.priority = GLOBAL_WRITE
        this.forkStack = new ForkStack(forkStack)
        this.isSpecific = isSpecific
        
        if (sor !== null) {
            var ValuedObjectReference ref = sor
            while (ref.subReference !== null) {
                ref = ref.subReference
            }
            schedule = ref.valuedObject.eContainer as ScheduleDeclaration
            scheduleObject = ref.valuedObject 
            priority = sor.priority
        } else {
            priority = fallbackPriority
        }
    }
    
    new(ValuedObjectAccess VOA) {
        this.node = VOA.node
        this.associatedNode = VOA.associatedNode
        this.schedule = VOA.schedule
        this.scheduleObject = VOA.scheduleObject
        this.priority = VOA.priority
        this.forkStack = new ForkStack(VOA.forkStack)
        this.isSpecific = VOA.isSpecific
        this.isWriteAccess = VOA.isWriteAccess
    }
    
    def copy() {
        return new ValuedObjectAccess(this)
    }
    
    override String toString() {
        val result = new StringBuffer("VOA");
        result.append("(");
        result.append(String.format("%08x", this.hashCode()));
        result.append(")");
        result.append(" ");
        result.append(serializer.serialize(node).toString);
        
        return result.toString();
    }
    
    private static Injector injector = Guice.createInjector();
    private static KEffectsSerializeHRExtensions serializer =  injector.getInstance(KEffectsSerializeHRExtensions);
    
}