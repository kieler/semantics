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
package de.cau.cs.kieler.sccharts.text.sctgenerator.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.text.sctgenerator.ISCTGeneratorExtension
import de.cau.cs.kieler.sccharts.text.sctgenerator.MinMax
import de.cau.cs.kieler.sccharts.text.sctgenerator.SCTGenerator
import de.cau.cs.kieler.sccharts.text.sctgenerator.Value
import java.io.IOException
import java.io.PrintWriter
import org.eclipse.core.resources.IProject
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.common.util.URI

/**
 * @author lpe
 *
 */
class EsoExtension implements ISCTGeneratorExtension {
    
    @Inject extension SCTGenerator      // You can simply inject the SCT Generator.
    
    
    // If GENERATE_TRACE == 1, then traces are produced, otherwise not!
    public static val IProperty<Value<Integer>> GENERATE_TRACE = 
        new Property<Value<Integer>>(
            SCTGenerator.SCTGENERATOR_ID + ".generateTrace",
            new Value<Integer>("Generate Trace", 0)
        )
    
    public static val IProperty<MinMax<Integer>> NUMBER_OF_TRACES = 
        new Property<MinMax<Integer>>(
            SCTGenerator.SCTGENERATOR_ID + ".NumberOfTraces",
            new MinMax<Integer>("Number of Traces", 1, 4)
        )
         
    public static val IProperty<MinMax<Integer>> NUMBER_OF_TICKS = 
        new Property<MinMax<Integer>>(
            SCTGenerator.SCTGENERATOR_ID + ".NumberOfTicks",
            new MinMax<Integer>("Number of Ticks", 1, 5)
        )
    
        
    public static val IProperty<Value<Double>> CHANCE_FOR_BOOL_VALUE = 
        new Property<Value<Double>>(
            SCTGenerator.SCTGENERATOR_ID + ".chanceForBoolValue",
            new Value<Double>("Chance of Value True", 0.5d)
        )  
    
    var StringBuilder builder = new StringBuilder
    
    override onDeclarationCreate(Declaration declaration) {
        // Do nothing.
    }
    
    override onStateCreate(State state) {
        // Do nothing
    }
    
    override onRegionCreate(Region region) {
        // Do nothing
    }
    
    override onTransitionCreate(Transition transition) {
        // Do nothing
    }
    
    override onExpressionCreate(Expression expression) {
        // Do nothing
    }
    
    override onModelCreate(SCCharts sccharts) {
        // Do nothing
        builder = new StringBuilder
    }
    
    override onRootStateCreate(State rootState) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }    
    
    override void onSaveModel(SCCharts sccharts, IProject project) {
        val rootState = sccharts.rootStates.head
        if(GENERATE_TRACE.property.value == 1) {            
            var output = URI.createURI(project.locationURI.toString() + "/" + rootState.name);
            output = output.appendFileExtension("eso");
            rootState.declarations.filter(VariableDeclaration).filter[it.input].generateTraces
            // Try to save the model.
            try {
                val PrintWriter writer = new PrintWriter(output.toFileString, "UTF-8")
                writer.print(builder)
                writer.close
    
            } catch (IOException e) {
                throw new Exception("Cannot write output model file: " + e.getMessage());
            }
        }
    }
    
    override getCategory() {
        SCTGenerator.SCTGENERATOR_EXTENSIONS_TAB
    }

    override getProperties() {
        <IProperty<?>> newArrayList(
            GENERATE_TRACE,
            CHANCE_FOR_BOOL_VALUE,
            NUMBER_OF_TRACES,
            NUMBER_OF_TICKS
        )
    }
    
    def generateInputsForTick(Iterable<VariableDeclaration> inputs) {
        
        for(in : inputs.head.valuedObjects) {
            val inputname = in.name
            if(inputname !== null) {
                if(CHANCE_FOR_BOOL_VALUE.random == 1) {
                    builder.append(inputname + "(true) ")
                } else {
                    builder.append(inputname + "(false) ")
                }
            }
        }
        builder.append("\n% Output: \n;\n")
    }
    
    def generateInputsForTrace(Iterable<VariableDeclaration> inputs) {
        val ticks = NUMBER_OF_TICKS.random
        for(var i = 0; i < ticks; i++) {
            generateInputsForTick(inputs)
        }
    }
    
    def generateTraces(Iterable<VariableDeclaration> inputs) {
        val traces = NUMBER_OF_TRACES.random
        for(var i = 0; i < traces; i++) {
            builder.append("!reset;\n")
            generateInputsForTrace(inputs)
        }
    }
    
}