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

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParseException
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import java.lang.reflect.Type

/**
 * (De-)Serializer for data pools.
 * 
 * @author aas
 *
 */
class DataPoolSerializer implements JsonSerializer<DataPool>, JsonDeserializer<DataPool>  {
    
    override serialize(DataPool src, Type typeOfSrc, JsonSerializationContext context) {
        val object = new JsonObject()
        // Add models
        for(model : src.models) {
            object.add(model.name, context.serialize(model))    
        }
        // Add action index if defined
        if(src.actionIndex >= 0) {
            object.add("actionIndex", context.serialize(src.actionIndex))
        }
        return object
    }
    
    override deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            val pool = new DataPool
            val object = json.asJsonObject            
            for(entry : object.entrySet) {
                switch(entry.key) {
                    // Fetch action index
                    case "actionIndex" : {
                        pool.actionIndex = entry.value.asInt
                    }
                    default : {
                        // Create model
                        val model = context.deserialize(entry.value, typeof(Model)) as Model
                        model.name = entry.key
                        pool.addModel(model)
                    }
                }
            }
            return pool
        } catch (Exception e) {
            throw new Exception("Cannot deserialize Data Pool", e)
        }
    }
}