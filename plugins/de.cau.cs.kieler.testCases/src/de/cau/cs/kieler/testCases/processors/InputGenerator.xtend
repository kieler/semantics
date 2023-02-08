/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.testCases.processors

import com.google.gson.JsonElement
import com.google.gson.JsonPrimitive
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.Simulatable
import de.cau.cs.kieler.simulation.internal.processor.SimulationProcessor
import java.util.Map.Entry
import java.util.Random

/**
 * @author jep
 * 
 */
class InputGenerator extends SimulationProcessor {

    // a random generator is needed to determine input variables and end states
    protected Random random = new Random()

    public static val ID = "de.cau.cs.kieler.testCases.processors.inputGenerator"

    override getId() {
        ID
    }

    override getName() {
        "InputGenerator"
    }

    override process() {
        setModel(model.transform)
    }

    def DataPool transform(DataPool data) {
        val model = simulationContext.models.get(0)
        val inputs = data.getInput(model)
        for (input : inputs.entrySet) {
            randomValueAssignment(input, model, data)
        }
        return data
    }

    def void randomValueAssignment(Entry<String, JsonElement> input, Simulatable model, DataPool data) {
        val variableInfos = model.variableInformation.variables.get(input.key).get(0)
        // assign random values to input variables based on their assumed range annotation
        val rangeAnnotation = (variableInfos.valuedObject.eContainer as VariableDeclaration).annotations.findFirst [ anno |
            anno instanceof StringAnnotation && anno.name.equals("AssumeRange")
        ]
        var first = "0"
        var second = "100"
        if (rangeAnnotation !== null) {
            first = (rangeAnnotation as StringAnnotation).values.get(0)
            second = (rangeAnnotation as StringAnnotation).values.get(1)
        }

        switch (variableInfos.type) {
            case ValueType.INT: {
                val firstInt = Integer.parseInt(first)
                val secondInt = Integer.parseInt(second)
                if (firstInt === secondInt) {
                    data.setValue(input.key, new JsonPrimitive(firstInt))
                } else {
                    val value = random.nextInt(secondInt - firstInt) + firstInt
                    data.setValue(input.key, new JsonPrimitive(value))
                }
            }
            case ValueType.FLOAT: {
                val firstFloat = Float.parseFloat(first)
                val secondFloat = Float.parseFloat(second)
                if (firstFloat === secondFloat) {
                    data.setValue(input.key, new JsonPrimitive(firstFloat))
                } else {
                    val value = random.nextFloat() * secondFloat + firstFloat
                    data.setValue(input.key, new JsonPrimitive(value))
                }
            }
            case ValueType.BOOL: {
                data.setValue(input.key, new JsonPrimitive(random.nextBoolean()))
            }
            default:
                println("ValueType of an input variable not supported")
        }
    }

}
