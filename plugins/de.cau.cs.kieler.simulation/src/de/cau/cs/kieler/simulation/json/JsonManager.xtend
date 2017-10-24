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

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonElement
import com.google.gson.JsonPrimitive
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import de.cau.cs.kieler.simulation.core.Variable

/**
 * Handles the Gson serializer and deserializer for JSON objects in the simulation.
 * 
 * @author aas
 *
 */
class JsonManager {
    
    /**
     * The GSON object for in the simulation.
     */
    public static Gson GSON = createGson();
    
    /**
     * Creates a gson object for serialization / deserialization of the data pool.
     */
    private static def Gson createGson() {
        val builder = new GsonBuilder()
        builder.excludeFieldsWithoutExposeAnnotation();
        builder.registerTypeAdapter(typeof(DataPool), new DataPoolSerializer())
        builder.registerTypeAdapter(typeof(Model), new ModelSerializer())
        builder.registerTypeAdapter(typeof(Variable), new VariableSerializer())
        builder.registerTypeAdapter(typeof(NDimensionalArray), new NDimensionalArraySerializer())
        return builder.create();
    }
    
    /**
     * Converts a primitive in JSON to its Java representation.
     * 
     * @param json The element to be converted to Java
     * @return the Java representation for the json element
     */
    public static def Object jsonAsObject(JsonElement json) {
        if (json instanceof JsonPrimitive) {
            if (json.isBoolean) {
                return json.asBoolean
            } else if (json.isString) {
                return json.asString
            } else if (json.isNumber) {
                val num = json.asNumber
                return num.doubleValue
            }
        }
        return null
    }
}