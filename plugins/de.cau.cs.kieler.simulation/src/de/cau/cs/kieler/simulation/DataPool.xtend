/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonNull
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.google.gson.JsonPrimitive
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.compilation.VariableStore
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.simulation.util.JsonUtil.*
import org.eclipse.xtend.lib.annotations.ToString
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DataPool implements IKiCoolCloneable {
    
    @Accessors
    val outputs = <Simulatable, DataPool>newHashMap
    
    package var JsonObject pool = new JsonObject
    package val Map<String, DataPoolEntry> entryCache = newHashMap
        
    // -----------------------------------------
    
    /** Default Contructor */
    new(){}
    
    /** Internal Constructor */
    private new(Simulatable sim, JsonObject content) {
        this.pool = content
        this.outputs.put(sim, this)
    }
    
    // -----------------------------------------
    
    def static boolean isJSON(String string) {
        return !string.nullOrEmpty && string.startsWith("{") && string.endsWith("}")
    }
    
    def static JsonObject parseJSON(String string) {
        if (string.isJSON) {
            (new JsonParser).parse(string) as JsonObject
        }
    }
    
    def static String serializeJSON(JsonObject json) {
        (new Gson).toJson(json)
    }
    
    // -------------------------------------------------
    
    def clear() {
        pool = new JsonObject
        outputs.clear
        entryCache.clear
    }
    
    def getRawData() {
        pool
    }
    
    def void setOutput(Simulatable sim, JsonObject json) {
        val output = new DataPool(sim, json)
        outputs.put(sim, output)
        entryCache.clear
        
        // Apply outputs
        merge(output)
    }
    
    def JsonObject getInput(Simulatable sim) {
        val input = new JsonObject
        val infos = entries
        for (entry : pool.entrySet) {
            val properties = infos.get(entry.key)?.combinedProperties
            if (properties !== null && properties.contains(VariableStore.INPUT)) {
                input.add(entry.key, entry.value)
            }
        }
        return input
    }
    
    def merge(DataPool otherPool) {
        if (pool === null || pool.size == 0) {
            pool = otherPool.pool
        } else {
            pool.mergeObjects(otherPool.pool, null)
        }
    }

    private def void mergeObjects(JsonObject left, JsonObject rigth, String prefix) {
        for (entry : rigth.entrySet) {
            if (left.has(entry.key) && left.get(entry.key).jsonObject && entry.value.jsonObject) {
                left.get(entry.key).asJsonObject.mergeObjects(entry.value.asJsonObject, (if (prefix.nullOrEmpty) "" else prefix) + entry.key + ".")
            } else {
                val key = (if (prefix.nullOrEmpty) "" else prefix) + entry.key
                left.add(key, entry.value)
            }
        }
    }
    
    def getEntries() {
        if (entryCache.empty) {
            pool.createEntries(null)
        }
        entryCache.unmodifiableView
    }
    
    def setValues(Map<String, JsonElement> values) {
        for (entry : values.entrySet) {
            setValue(entry.key, entry.value)
        }
    }
     
    def setValue(String name, JsonElement value) {
        if (entryCache.empty) {
            pool.createEntries(null)
        }
        val entry = entryCache.get(name)
        if (entry !== null) {
            entry.rawValue = value
            if (entry.jsonParent == pool) {
                pool.add(name, value)
            } else {
                entry.jsonParent.add(name.substring(name.lastIndexOf(".")), value)
            }
        } else if (name.contains(".")) {
            throw new UnsupportedOperationException("Setting new Object values not yet supported")
        } else {
            pool.add(name, value)
            entryCache.put(name, new DataPoolEntry(this, name, value, pool))
        }
    }
         
    protected def void createEntries(JsonObject obj, String prefix) {
        for (entry : pool.entrySet) {
            if (entry.value.isJsonObject) {
                entry.value.asJsonObject.createEntries((if (prefix.nullOrEmpty) "" else prefix) + entry.key + ".")
            } else {
                val key = (if (prefix.nullOrEmpty) "" else prefix) + entry.key
                entryCache.put(key, new DataPoolEntry(this, key, entry.value, obj))
            }
        }
    }
    
    /**
     * Creates a map that contains all entries in the given pool object that differ from this pool.
     * <br>elements in the given object will not be cloned.
     */
    def createPatch(JsonObject content) {
        val diff = <String, JsonElement>newHashMap
        for (entry : content.entrySet) {
            if (pool.has(entry.key)) {
                if (!pool.get(entry.key).equals(entry.value)) {
                    diff.put(entry.key, entry.value)
                }
            } else {
                diff.put(entry.key, entry.value)
            }
        }
        return diff
    }
    
    // -- Cloneable --
    
    override isMutable() {
        true
    }
    
    override cloneObject() {
        val newPool = new DataPool
        newPool.outputs.putAll(outputs)
        if (pool !== null) {
            val clone = pool.cloneJson
            if (clone === null) {
                newPool.pool = parseJSON(serializeJSON(pool))
            } else {
                newPool.pool = clone as JsonObject
            }
        }
        return newPool
    }

    override toString() {
        pool.toString
    }
    
}

class DataPoolEntry {
    
    @Accessors
    val DataPool pool
    @Accessors
    val String name
    @Accessors(PUBLIC_GETTER, PACKAGE_SETTER)
    var JsonElement rawValue
    @Accessors(PACKAGE_GETTER)
    val JsonObject jsonParent
    @Accessors
    val Set<Simulatable> relatedSimulatables
    @Accessors
    val Set<VariableInformation> variableInformation
    
    extension KExpressionsFactory = KExpressionsFactory.eINSTANCE
        
    new(DataPool pool, String name, JsonElement element, JsonObject parent) {
        this.pool = pool
        this.name = name
        this.rawValue = element
        this.jsonParent = parent
        this.relatedSimulatables = pool.outputs.keySet.filter[it.variableInformation.variables.containsKey(name)].toSet.unmodifiableView
        this.variableInformation = relatedSimulatables.map[it.variableInformation.variables.get(name)].flatten.toSet.unmodifiableView
    }
    
    /**
     * Convenance getter that will choose the data form the first associates VariableInformation assuming that there are only non ambigous data.
     */
    def Value getTypedKValue() {
        return getTypedKValue(null)
    }
    
    def Value getTypedKValue(Simulatable sim) {
        return getTypedValue(sim, rawValue, OUTPUT_TYPE.KEX) as Value
    }
    
    /**
     * Convenance getter that will choose the data form the first associates VariableInformation assuming that there are only non ambigous data.
     */
    def Object getTypedValue() {
        return getTypedValue(null)
    }
    
    def Object getTypedValue(Simulatable sim) {
        return getTypedValue(sim, rawValue, OUTPUT_TYPE.JAVA)
    }

    def JsonElement getTypedJsonValue(Simulatable sim) {
        return getTypedValue(sim, rawValue, OUTPUT_TYPE.JSON) as JsonElement
    }
    
    private enum OUTPUT_TYPE {KEX, JSON, JAVA}
    private def Object getTypedValue(Simulatable sim, JsonElement valueElem, OUTPUT_TYPE output) {
        val info = if (sim === null) {
            variableInformation.head
        } else {
            val infos = this.getVariableInformation(sim)
            if (infos.size > 1) {
                throw new IllegalArgumentException("Related VariableStore contains ambigous variable information.")
            }
            infos.head
        }
        if (info !== null) {
            switch(valueElem) {
                JsonNull: switch (output) {
                    case KEX: return createNullValue
                    case JSON: return valueElem
                    case JAVA: return null
                }
                JsonArray: switch (output) {
                    case KEX: return createVectorValue => [
                        for (elem : valueElem.asJsonArray.iterator.toIterable) {
                            values.add(sim.getTypedValue(elem, output) as Value)
                        }
                    ]
                    case JSON: return new JsonArray => [
                        for (elem : valueElem.asJsonArray.iterator.toIterable) {
                            it.add(sim.getTypedValue(elem, output) as JsonElement)
                        }
                    ]
                    case JAVA: {
                        val arr = newArrayList
                        for (elem : valueElem.asJsonArray.iterator.toIterable) {
                            arr.add(sim.getTypedValue(elem, output))
                        }
                        return arr
                    }
                }
                JsonObject: throw new UnsupportedOperationException("Unexpected DataPoolEntry type")
                JsonPrimitive: {
                    switch (info.inferType) {
                        case BOOL: {
                            val boo = if (valueElem.isNumber) {
                                valueElem.asNumber.floatValue != 0
                            } else if (valueElem.isBoolean) {
                                valueElem.asBoolean
                            } else {
                                !valueElem.asString.empty
                            }
                            switch (output) {
                                case KEX: return createBoolValue => [value = boo]
                                case JSON: return new JsonPrimitive(boo)
                                case JAVA: return boo
                            }
                        }
                        case FLOAT: {
                            val number = if (valueElem.isNumber) {
                                valueElem.asNumber.floatValue
                            } else if (valueElem.isBoolean) {
                                if (valueElem.asBoolean) 1 else 0
                            } else {
                                throw new IllegalArgumentException("Cannot convert from type string")
                            }
                            switch (output) {
                                case KEX: return createFloatValue => [value = number]
                                case JSON: return new JsonPrimitive(number)
                                case JAVA: return number
                            }
                        }
                        case INT: {
                            val number = if (valueElem.isNumber) {
                                valueElem.asNumber.intValue
                            } else if (valueElem.isBoolean) {
                                if (valueElem.asBoolean) 1 else 0
                            } else {
                                throw new IllegalArgumentException("Cannot convert from type string")
                            }
                            switch (output) {
                                case KEX: return createIntValue => [value = number]
                                case JSON: return new JsonPrimitive(number)
                                case JAVA: return number
                            }
                        }
                        case STRING: {
                            switch (output) {
                                case KEX: return createStringValue => [value = valueElem.asString]
                                case JSON: return new JsonPrimitive(valueElem.asString)
                                case JAVA: return valueElem.asString
                            }
                        }
                        default: throw new IllegalArgumentException("Cannot convert to type " + info.inferType)
                    }
                }
            }
        }
    } 

    def getCombinedProperties() {
        return variableInformation.map[properties].flatten.toSet
    }
    
    def getCombinedProperties(Simulatable sim) {
        return this.getVariableInformation(sim)?.map[properties].flatten.toSet
    }
    
    def getVariableInformation(Simulatable sim) {
        if (relatedSimulatables.contains(sim)) {
            return sim.variableInformation.variables.get(name)
        }
        return null
    }
    
    def isInput() {
        return this.combinedProperties.contains(VariableStore.INPUT)
    }    
    
    def isOutput() {
        return this.combinedProperties.contains(VariableStore.OUTPUT)
    }  
    
    override toString() {
        val ToStringBuilder b = new ToStringBuilder(this)
        b.add("name", this.name)
        b.add("value", this.rawValue)
        b.add("relatedSimulatables", this.relatedSimulatables)
        b.add("variableInformation", this.variableInformation)
        return b.toString()
    }
    
}
