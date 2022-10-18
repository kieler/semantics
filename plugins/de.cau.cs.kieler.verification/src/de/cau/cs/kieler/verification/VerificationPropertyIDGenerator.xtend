/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification

import org.eclipse.xtend.lib.annotations.Accessors
import com.google.common.collect.HashBiMap
import com.google.common.collect.BiMap

/**
 * Class for generating unique IDs for any {@link VerificationProperty}. Use a single instance of this and call getId() for all
 * the elements you need IDs for. IDs will be unique, assuming that hashCode() on VerificationProperty returns unique hashes
 * per instance.
 * 
 * @author jep
 */
class VerificationPropertyIDGenerator {
    
    /**
     * Map to remember the {@link VerificationProperty} for all IDs for that IDs already have been generated.
     */
    @Accessors(PUBLIC_GETTER)
    final BiMap<String, VerificationProperty> idToElementMap = HashBiMap.create()
    
    /**
     * Properties are prefixed with this in their ID.
     */
    static final String PREFIX = "Prop"
    
    static int counter = 0
    
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
        if (idToElementMap.containsValue(property)) {
            return idToElementMap.inverse().get(property)
        }
        
        var String id = PREFIX  + property.hashCode + counter++

        idToElementMap.put(id, property)
        return id
    }
    
}