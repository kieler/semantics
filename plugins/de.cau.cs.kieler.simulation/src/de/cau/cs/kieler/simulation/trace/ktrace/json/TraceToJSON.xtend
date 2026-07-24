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
package de.cau.cs.kieler.simulation.trace.ktrace.json;

import com.google.gson.GsonBuilder
import com.google.gson.JsonNull
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.JsonArrayValue
import de.cau.cs.kieler.kexpressions.JsonObjectValue
import de.cau.cs.kieler.kexpressions.NullValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeExtensions
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import java.io.File

import static extension java.lang.String.format
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.StringValue
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonParseException
import com.google.gson.JsonSerializer
import com.google.gson.JsonSerializationContext
import de.cau.cs.kieler.kexpressions.keffects.Emission
import java.util.Map
import com.google.gson.JsonObject
import com.google.gson.Gson
import com.google.gson.JsonPrimitive

/**
 * 
 */
class TraceToJSON extends Processor<TraceFile, CodeContainer> {

    @Inject
    extension KEffectsSerializeExtensions;

    /**
     * {@inheritDoc}
     */
    override String getId() {
        return "de.cau.cs.kieler.ktrace.TraceToJSON";
    }

    /**
     * {@inheritDoc}
     */
    override String getName() {
        return "Trace file to JSON";
    }

    /**
     * {@inheritDoc}
     */
    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR;
    }

    /**
     * {@inheritDoc}
     */
    override process() {
        val cc = new CodeContainer();

        // TODO: figure out how to make Explicit Null work.
        val gson = new GsonBuilder().registerTypeAdapter(Tick, new TickSerializer()).setPrettyPrinting().
            disableHtmlEscaping().serializeNulls().create();
        val transformedRoots = this.sourceModel.traces.map[transformTrace];
        val fileName = "trace"

        println("Processing Resource " + this.sourceModel.eResource)

        cc.add(fileName + ".json", gson.toJson(transformedRoots));
        this.setModel(cc);
    }

    def de.cau.cs.kieler.simulation.trace.ktrace.json.Trace transformTrace(
        de.cau.cs.kieler.simulation.trace.ktrace.Trace trace) {
        val transformed = new de.cau.cs.kieler.simulation.trace.ktrace.json.Trace();

        transformed.ticks = trace.ticks.map[transformTick]

        transformed
    }

    def de.cau.cs.kieler.simulation.trace.ktrace.json.Tick transformTick(
        de.cau.cs.kieler.simulation.trace.ktrace.Tick tick) {
        val transformed = new de.cau.cs.kieler.simulation.trace.ktrace.json.Tick();

        transformed.inputs = tick.inputs.map[transformEffect]
        transformed.outputs = tick.outputs.map[transformEffect]

        transformed.id = tick.name
        transformed.gotoID = tick.goto?.name

        transformed
    }

    def de.cau.cs.kieler.simulation.trace.ktrace.json.Assignment transformEffect(Effect effect) {
        switch (effect) {
            de.cau.cs.kieler.kexpressions.keffects.Assignment: {
                val transformed = new de.cau.cs.kieler.simulation.trace.ktrace.json.Assignment()

                transformed.variableID = effect.reference?.valuedObject?.name
                if (transformed.variableID === null) {
                    environment.errors.add(
                        "Assignment %s has no target variable.".format(effect.serialize, effect.class.name))
                }

                transformed.value = effect.expression.tryExpressionToValue

                transformed
            }
            Emission: {
                val transformed = new de.cau.cs.kieler.simulation.trace.ktrace.json.Assignment()
                transformed.variableID = effect.reference?.valuedObject?.name
                if (transformed.variableID === null) {
                    environment.errors.add(
                        "Assignment %s has no target variable.".format(effect.serialize, effect.class.name))
                }
                transformed.value = switch (effect.newValue) {
                    case null:
                        Map.of("present", true)
                    default:
                        Map.of(
                            "present",
                            true,
                            "value",
                            effect.newValue.serialize.toString
                        )
                }

                transformed
            }
            default: {
                environment.errors.add(
                    "Cannot handle effect %s of type %s.".format(effect.serialize, effect.class.name))
                null
            }
        }
    }

    protected def Object tryExpressionToValue(Expression assignee) {
        switch (assignee) {
            BoolValue:
                assignee.value
            IntValue:
                assignee.value
            FloatValue:
                assignee.value
            StringValue:
                assignee.value
            JsonArrayValue:
                assignee.elements
            JsonObjectValue:
                assignee.membersMap
            VectorValue:
                assignee.values.map[tryExpressionToValue]
            NullValue:
                ExplicitNull.INSTANCE
            default: {
                println("unexpected expression in trace of type " + assignee)
                assignee.serialize.toString
            }
        }
    }

}

class ExplicitNull {
    public static final ExplicitNull INSTANCE = new ExplicitNull();
    
    private new() {}
}

class TickSerializer implements JsonSerializer<Tick> {

    override serialize(Tick src, Type typeOfSrc, JsonSerializationContext context) {
        val obj = new JsonObject()
        
        obj.add("inputs", context.serialize(src.inputs))
        obj.add("outputs", context.serialize(src.outputs))
        
        if (src.id !== null) {
            obj.addProperty("id", src.id)
        }
        if (src.gotoID !== null) {
            obj.addProperty("gotoID", src.gotoID)
        }

        return obj
    }

}
