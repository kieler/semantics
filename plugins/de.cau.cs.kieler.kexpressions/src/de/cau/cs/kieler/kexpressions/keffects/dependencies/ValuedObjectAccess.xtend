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

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.ValuedObject
import com.google.inject.Guice
import com.google.inject.Injector
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.keffects.Linkable

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
    public static val EObject GLOBAL_SCHEDULE = null
    public static val GLOBAL_WRITE = 0
    public static val GLOBAL_RELATIVE_WRITE = 1
    public static val GLOBAL_READ = 2
    
    @Accessors Linkable node
    @Accessors Linkable associatedNode
    @Accessors EObject schedule
    @Accessors ValuedObject scheduleObject
    @Accessors int priority 
    @Accessors ForkStack forkStack
    @Accessors boolean isSpecific
    @Accessors boolean isWriteAccess = false
    
    new(Linkable node, EObject schedule, ValuedObject scheduleObject, int priority, ForkStack forkStack, boolean isSpecific) {
        this.node = node
        this.associatedNode = node
        this.schedule = schedule
        this.scheduleObject = scheduleObject
        this.priority = priority
        this.forkStack = new ForkStack(forkStack)
        this.isSpecific = isSpecific
    }
    
    new(Linkable node, Linkable associatedNode, EObject schedule, ValuedObject scheduleObject, int priority, ForkStack forkStack, boolean isSpecific) {
        this.node = node
        this.associatedNode = associatedNode
        this.schedule = schedule
        this.scheduleObject = scheduleObject
        this.priority = priority
        this.forkStack = new ForkStack(forkStack)
        this.isSpecific = isSpecific
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