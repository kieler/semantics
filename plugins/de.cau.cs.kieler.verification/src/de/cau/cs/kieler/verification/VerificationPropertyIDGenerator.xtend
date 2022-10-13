/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification

import java.util.HashMap
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Class for generating unique IDs for any {@link VerificationProperty}. Use a single instance of this and call getId() for all
 * the elements you need IDs for. IDs will be unique, assuming that hashCode() on VerificationProperty returns unique hashes
 * per instance.
 * 
 * @author jep
 */
class VerificationPropertyIDGenerator {
    
    /**
     * Internal map to remember the ID for all {@link VerificationProperty}s for that IDs already have been generated.
     */
    Map<VerificationProperty, String> elementToIdMap
    
    /**
     * Map to remember the {@link VerificationProperty} for all IDs for that IDs already have been generated.
     */
    @Accessors(PUBLIC_GETTER)
    Map<String, VerificationProperty> idToElementMap
    
    /**
     * Properties are prefixed with this in their ID.
     */
    static final String PREFIX = "Prop"
    
    static int counter = 0
    
    new() {
        elementToIdMap = new HashMap
        idToElementMap = new HashMap
    }
    
    /**
     * Generates a unique ID for any {@link VerificationProperty}. Returns the same ID for the element if called a second time.
     * 
     * @param property The verification property to generate the id for.
     * @return The id string or empty string if the element is null
     */
    def String getId(VerificationProperty property) {
        if (property === null) {
            return ""
        }
        
        // if the ID was already calculated, use that
        if (elementToIdMap.get(property) !== null) {
            return elementToIdMap.get(property)
        }
        
        var String id = PREFIX  + property.hashCode + counter++

        elementToIdMap.put(property, id)
        idToElementMap.put(id, property)
        return id
    }
    
}