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
package de.cau.cs.kieler.simulation.json

import com.google.gson.JsonArray
import com.google.gson.JsonDeserializer
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import java.lang.reflect.Type
import com.google.gson.JsonElement
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonParseException
import java.util.List

/**
 * @author aas
 *
 */
class NDimensionalArraySerializer implements JsonSerializer<NDimensionalArray>,
                                             JsonDeserializer<NDimensionalArray> {
    
    override serialize(NDimensionalArray src, Type typeOfSrc, JsonSerializationContext context) {
        val object = new JsonObject()
        // Add indices
        val indicesArray = new JsonArray()
        for(i : src.indices) {
            indicesArray.add(i)    
        }
        object.add("indices", indicesArray)
        // Add values
        val valuesArray = new JsonArray()
        for(e : src.elements) {
            val v = e.value
            if(v instanceof Number) {
                valuesArray.add(v)            
            } else if(v instanceof Boolean) {
                valuesArray.add(v)            
            } if(v instanceof String) {
                valuesArray.add(v)            
            }
        }
        object.add("values", valuesArray)
        return object
    }
    
    override deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        val object = json.asJsonObject
        
        val jsonIndices = object.get("indices").asJsonArray
        val jsonValues = object.get("values").asJsonArray

        val indices = newArrayList()
        for(jsonIndex : jsonIndices) {
            val i = context.deserialize(jsonIndex, typeof(Integer))
            indices.add(i)
        }
        
        val List<Object> values = newArrayList()        
        for(jsonValue : jsonValues) {
            val value = JsonManager.jsonAsObject(jsonValue)
            if(value instanceof Double) {
                val intValue = value.intValue 
                if(value == intValue) {
                    values.add(intValue)
                } else {
                    values.add(value)
                }
            } else {
                values.add(value)    
            }
        }
        
        val array = new NDimensionalArray(values, indices)
        return array
    }
}
