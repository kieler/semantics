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
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.Variable
import java.lang.reflect.Type

/**
 * (De-)Serializer for models in the data pool.
 * 
 * @author aas
 *
 */
class ModelSerializer implements JsonSerializer<Model>, JsonDeserializer<Model> {
    
    /**
     * {@inheritDoc}
     */
    override serialize(Model src, Type typeOfSrc, JsonSerializationContext context) {
        val object = new JsonObject()
        // Add variables
        for(variable : src.variables) {
            val jsonVariable = context.serialize(variable)
            object.add(variable.name, jsonVariable)
        }
        return object
    }
    
    /**
     * {@inheritDoc}
     */
    override deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            val object = json.asJsonObject
            val model = new Model()
            for(entry : object.entrySet) {
                switch(entry.key) {
                   // Additional fields can be deserialized here in using cases.
                   default : {
                       val variable = context.deserialize(entry.value, typeof(Variable)) as Variable
                       variable.name = entry.key
                       model.addVariable(variable)
                   } 
                }
            } 
            return model    
        } catch (Exception e) {
            throw new Exception("Cannot deserialize Model", e)
        }
    }
}