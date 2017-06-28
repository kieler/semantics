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
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParseException
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import de.cau.cs.kieler.simulation.core.Model
import java.lang.reflect.Type
import de.cau.cs.kieler.simulation.core.Variable

/**
 * @author aas
 *
 */
class ModelSerializer implements JsonSerializer<Model>, JsonDeserializer<Model> {
    
    override serialize(Model src, Type typeOfSrc, JsonSerializationContext context) {
        val object = new JsonObject()
        // Add variables
        val variablesArray = new JsonArray()
        for(v : src.variables) {
            val jsonVariable = context.serialize(v)
            variablesArray.add(jsonVariable)
        }
        object.add("variables", variablesArray)
        return object
    }
    
    override deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        val object = json.asJsonObject
        
        val jsonVariables = object.get("variables").asJsonArray
        
        val model = new Model()
        for(jsonVariable : jsonVariables) {
            val v = context.deserialize(jsonVariable, typeof(Variable))
            model.addVariable(v)
        } 
        return model
    }
}