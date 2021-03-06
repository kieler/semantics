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
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.compilation.VariableStore
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder

import static extension de.cau.cs.kieler.simulation.util.JsonUtil.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DataPool implements IKiCoolCloneable {
    
    @Accessors
    val outputs = <Simulatable, DataPool>newHashMap
    
    @Accessors(PUBLIC_GETTER)
    var JsonObject pool = new JsonObject
    val Map<String, DataPoolEntry> entryCache = newHashMap
        
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
            JsonParser.parseString(string) as JsonObject
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
    
    def JsonObject getInput() {
        val input = new JsonObject
        val infos = entries
        for (entry : pool.entrySet) {
            val dataPoolEntry = infos.get(entry.key)
            if (dataPoolEntry !== null && dataPoolEntry.input) {
                input.add(entry.key, entry.value)
            }
        }
        return input
    }
    
    def JsonObject getInput(Simulatable sim) {
        val input = new JsonObject
        val infos = entries
        for (entry : pool.entrySet) {
            val properties = infos.get(entry.key)?.getCombinedProperties(sim)
            if (properties !== null && properties.contains(VariableStore.INPUT)) {
                input.add(entry.key, entry.value)
            }
        }
        return input
    }
    
    def JsonObject getOutput() {
        val output = new JsonObject
        val infos = entries
        for (entry : pool.entrySet) {
            val dataPoolEntry = infos.get(entry.key)
            if (dataPoolEntry !== null && dataPoolEntry.output) {
                output.add(entry.key, entry.value)
            }
        }
        return output
    }
    
    def merge(DataPool otherPool) {
        if (pool === null || pool.size == 0) {
            pool = otherPool.pool
        } else {
            pool.mergeObjects(otherPool.pool)
        }
    }

    private def void mergeObjects(JsonObject left, JsonObject rigth) {
        for (entry : rigth.entrySet) {
            if (left.has(entry.key) && left.get(entry.key).jsonObject && entry.value.jsonObject) {
                left.get(entry.key).asJsonObject.mergeObjects(entry.value.asJsonObject)
            } else {
                left.add(entry.key, entry.value)
            }
        }
    }
    
    def getEntries() {
        if (entryCache.empty) {
            pool.createEntries(null)
        }
        entryCache.unmodifiableView
    }
    
    def void setValues(Map<String, JsonElement> values) {
        for (entry : values.entrySet) {
            setValue(entry.key, entry.value)
        }
    }
     
    def void setValue(String name, JsonElement value) {
        if (entryCache.empty) {
            pool.createEntries(null)
        }
        var modified = false
        val entry = entryCache.get(name)
        if (entry !== null) {
            entry.rawValue = value
            pool.add(name, value)
            modified = true
        } else if (name.contains(".")) { // Set in object or array
            val parts = name.split("\\.")
            var JsonElement elem = pool
            var failed = false
            for (var idx = 0; idx < parts.length && !failed; idx++) {
                val part = parts.get(idx)
                val last = idx == parts.length - 1
                if (elem !== null && elem.isJsonObject) {
                    val obj = elem.asJsonObject
                    if (last) {
                        obj.add(part, value)
                        modified = true
                    } else if (obj.has(part)) {
                        elem = obj.get(part)
                    } else {
                        elem = new JsonObject
                        obj.add(part, elem)
                    }
                } else if (elem !== null && elem.jsonArray && part.matches("\\d+")) {
                    val arr = elem.asJsonArray
                    try {
                        val partNum = Integer.parseInt(part)
                        if (partNum < arr.size) {
                            if (last) {
                                arr.set(partNum, value)
                                modified = true
                            } else {
                                elem = arr.get(partNum)
                            }
                        } else {
                            failed = true
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace
                        failed = true
                    }
                } else {
                    failed = true
                }
            }
        }
        if (!modified) {
            pool.add(name, value)
            entryCache.put(name, new DataPoolEntry(this, name, value))
        }
    }
    
    protected def void createEntries(JsonObject obj, String prefix) {
        for (entry : pool.entrySet) {
            entryCache.put(entry.key, new DataPoolEntry(this, entry.key, entry.value))
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
    @Accessors
    val Set<Simulatable> relatedSimulatables
    @Accessors
    val Set<VariableInformation> variableInformation
    
    extension KExpressionsFactory = KExpressionsFactory.eINSTANCE
        
    new(DataPool pool, String name, JsonElement element) {
        this.pool = pool
        this.name = name
        this.rawValue = element
        this.relatedSimulatables = pool.outputs.keySet.filter[it.variableInformation.variables.containsKey(name)].toSet.unmodifiableView
        this.variableInformation = relatedSimulatables.map[it.variableInformation.variables.get(name)].flatten.toSet.unmodifiableView
    }
    
    /**
     * Convenance getter that will choose the data form the first associates VariableInformation assuming that there are only non ambigous data.
     */
    def Expression getTypedKValue() {
        return getTypedKValue(null)
    }
    
    def Expression getTypedKValue(Simulatable sim) {
        return getTypedValue(sim, rawValue, OUTPUT_TYPE.KEX) as Expression
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
                            values.add(sim.getTypedValue(elem, output) as Expression)
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
                        case PURE,
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
                                valueElem.asNumber.doubleValue
                            } else if (valueElem.isBoolean) {
                                if (valueElem.asBoolean) 1 else 0
                            } else {
                                throw new IllegalArgumentException("Cannot convert from type string")
                            }
                            switch (output) {
                                case KEX: return if (number < 0) {
                                    createOperatorExpression => [
                                        operator = OperatorType.SUB
                                        subExpressions += createFloatValue => [value = Math.abs(number)]
                                    ]
                                } else {
                                    createFloatValue => [value = number]
                                }
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
                                case KEX: return if (number < 0) {
                                    createOperatorExpression => [
                                        operator = OperatorType.SUB
                                        subExpressions += createIntValue => [value = Math.abs(number)]
                                    ]
                                } else {
                                    createIntValue => [value = number]
                                }
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
        return this.getVariableInformation(sim).map[properties].flatten.toSet
    }
    
    def getVariableInformation(Simulatable sim) {
        if (relatedSimulatables.contains(sim)) {
            return sim.variableInformation.variables.get(name)
        }
        return emptySet
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
