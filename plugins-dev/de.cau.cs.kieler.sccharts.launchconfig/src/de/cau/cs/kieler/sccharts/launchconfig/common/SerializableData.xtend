/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.launchconfig.common

import java.util.HashMap
import java.util.Map

/**
 * @author aas
 *
 */
class SerializableData {
    
    /**
     * Try to loads the values of this objects fields by reading the map values.
     * 
     * @param map A map where the key is this object's field names
     * and the value is the value this object's field should have.  
     */
    def loadAttributesFromMap(Map<String, String> map) {
        val classObject = this.class
        for(f : classObject.declaredFields){
            f.set(this, map.get(f.name))
        }
    }
    
    /**
     * Stores all fields of this class in a map
     * where the key is a field's name and the value is the field's value.
     */
    def Map<String, String> getAttributeMap(){
        val map = new HashMap<String, String>()
        val classObject = this.class
        for(f : classObject.declaredFields){
            map.put(f.name, f.get(this).toString())
        }
        return map
    }
    
}