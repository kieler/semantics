/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.sct.sctgenerator

import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Singleton
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.MapPropertyHolder
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.sccharts.State
import java.io.IOException
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

/**
 * Main SCT Generator class  
 * used for static SCT Generator constants, 
 * default core properties, 
 * and model project handling.
 * 
 * @author ssm
 * @kieler.design 2016-06-07 proposed 
 * @kieler.rating 2016-06-07 proposed yellow
 */
@Singleton
class SCTGenerator extends MapPropertyHolder implements ISCTGeneratorPropertyHolder {

    /* Also Use the injector that injected this class for further injections. */
    @Inject public var Injector injector                
    
    /* SCT file extension */
    public static val SCT_MODEL_EXTENSION = "sct"

    /* Public IDs */        
    public static val SCTGENERATOR_ID = "de.cau.cs.kieler.sccharts.text.sct.generator"
    public static val SCTGENERATOR_EXTENSION_POINT = SCTGENERATOR_ID + ".extension" 
    public static val SCTGENERATOR_CORE_TAB = SCTGENERATOR_ID + "tabs.Core"
    public static val SCTGENERATOR_EXTENSIONS_TAB = SCTGENERATOR_ID + "tabs.Extensions"
    
    /* Private constants */
    private static val MODEL_ID_PREFIX = "model"    // Name prefix of the generated model files    
    private static val EXTENTION_NAME = "class"     // Name of the extension point child


    /* Core properties */
    public static val IProperty<Value<Integer>> NUMBER_OF_MODELS = 
        new Property<Value<Integer>>(
            SCTGENERATOR_ID + ".numberOfModels", 
            new Value<Integer>("Number of Models", 10)
        )

    public static val IProperty<MinMax<Integer>> NUMBER_OF_STATES = 
        new Property<MinMax<Integer>>(
            SCTGENERATOR_ID + ".numberOfStates", 
            new MinMax<Integer>("Number of States", 3, 15)
        )

    public static val IProperty<ChanceMax<Double, Integer>> CHANCE_FOR_TRANSITION = 
        new Property<ChanceMax<Double, Integer>>(
            SCTGENERATOR_ID + ".chanceForTransition",
            new ChanceMax<Double, Integer>("Chance for Transition", 0.1d, 3)
        )
        
    public static val IProperty<Value<Double>> CHANCE_FOR_IMMEDIATE = 
        new Property<Value<Double>>(
            SCTGENERATOR_ID + ".chanceForImmediate",
            new Value<Double>("Chance for Immediate", 0.1d)
        )

    public static val IProperty<ChanceMax<Double, Integer>> CHANCE_FOR_SUPERSTATE = 
        new Property<ChanceMax<Double, Integer>>(
            SCTGENERATOR_ID + ".chanceForSuperstate",
            new ChanceMax<Double, Integer>("Chance for Superstate", 0.1d, 3)
        )

    public static val IProperty<ChanceMax<Double, Integer>> CHANCE_FOR_CONCURRENCY = 
        new Property<ChanceMax<Double, Integer>>(
            SCTGENERATOR_ID + ".chanceForConcurrency",
            new ChanceMax<Double, Integer>("Chance for Concurrency", 0.1d, 3)
        )
        
    public static val IProperty<MinMax<Integer>> NUMBER_OF_INPUTS = 
        new Property<MinMax<Integer>>(
            SCTGENERATOR_ID + ".numberOfInputs",
            new MinMax<Integer>("Number of Inputs", 1, 3)
        )        

    public static val IProperty<MinMax<Integer>> NUMBER_OF_OUTPUTS = 
        new Property<MinMax<Integer>>(
            SCTGENERATOR_ID + ".numberOfOutputs",
            new MinMax<Integer>("Number of Outputs", 1, 3)
        ) 
        
    public static val IProperty<ChanceMax<Double, Integer>> CHANCE_FOR_EXPRESSION = 
        new Property<ChanceMax<Double, Integer>>(
            SCTGENERATOR_ID + ".chanceForExpression",
            new ChanceMax<Double, Integer>("Chance for Expression", 0.25d, 3)
        )
    
    
    /* Satisfy property holder interface */
    
    /**
     * {@inheritDoc}
     */
    override getProperties() {
        <IProperty<?>>newArrayList(
            NUMBER_OF_MODELS, NUMBER_OF_STATES, CHANCE_FOR_TRANSITION,
            CHANCE_FOR_IMMEDIATE, CHANCE_FOR_SUPERSTATE, CHANCE_FOR_CONCURRENCY,
            NUMBER_OF_INPUTS, NUMBER_OF_OUTPUTS, CHANCE_FOR_EXPRESSION
        )
    }

    /**
     * {@inheritDoc}
     */
    override getCategory() {
        SCTGENERATOR_CORE_TAB
    }
    
    
    /* SCT Generator methods */
    
    /**
     * Retrieve all categories including all properties.
     * 
     * @returns a {@code Map<String, List<IProperty<?>>>} of properties with their category as key. 
     */
    def Map<String, List<IProperty<?>>> getCategorizedProperties() {
        <String, List<IProperty<?>>>newLinkedHashMap => [ 
            put(getCategory, getProperties)
            for(ext : getRegisteredExtensions) {
                put(ext.category, ext.properties)
            }
        ]
    }
    
    /**
     * Retrieves the classes that are using the extension point.
     * 
     * @returns a {@code List<ISCTGeneratorExtension>} containing the classes that use the extension point.
     */
    def List<ISCTGeneratorExtension> getRegisteredExtensions() {
        val regExt = <ISCTGeneratorExtension>newArrayList
        val extensions = Platform.getExtensionRegistry().getConfigurationElementsFor(
            SCTGENERATOR_EXTENSION_POINT);
        for (ext : extensions) {
            try {
                val exeExt = ext.createExecutableExtension(EXTENTION_NAME) 
                val instance = injector.getInstance(exeExt.class) as ISCTGeneratorExtension
                regExt += instance
            } catch (CoreException e) {
                System.err.print("Could not load SCT Generator extension: " + ext.getName )
            }
        }
        regExt
    }         
    
    /**
     * Creates the models according to the specified properties.
     * 
     * @param project defines the project in which the models are created.
     * 
     * @returns void
     */
    def void createModels(IProject project) {
        // Create a new eclipse job to handle the model creation.
        val job = new Job("Creating Models") {
            override protected run(IProgressMonitor monitor) {
                val int numberOfModels = getProperty(NUMBER_OF_MODELS).value
                val modelGenerator = injector.getInstance(ModelGenerator)
                monitor.beginTask("Creating Models", numberOfModels)
                for (var int i = 0; i < numberOfModels; i++) {
                    var String is = "" + i
                    // Add prefix zeros
                    while (is.length < numberOfModels.toString.length) {
                        is = "0" + is
                    }
                    // Create a new model and save it.
                    val model = modelGenerator.createModel(MODEL_ID_PREFIX + is)
                    saveModel(model, project)
                    monitor.worked(1)
                    // If the user canceled the process, abort.
                    if (monitor.canceled) {
                        return Status.CANCEL_STATUS
                    }
                }
                // Refresh the project.
                project.refreshLocal(1, monitor)
                return Status.OK_STATUS
            }
        }
        // Schedule the job.
        job.setUser(true)
        job.schedule
    }  
    
    /**
     * Save the model.
     * 
     * @param rootState expects the root state of the newly created model.
     * @param project defines the project in which the model should be saved.
     * 
     * @returns void
     */
    protected def saveModel(State rootState, IProject project) {
        // Create output URI.
        var output = URI.createURI(project.locationURI.toString() + "/" + rootState.id);
        output = output.appendFileExtension(SCT_MODEL_EXTENSION);

        // Try to save the model.
        try {
            val saveRes = new ResourceSetImpl().createResource(output);
            saveRes.getContents().add(rootState);
            saveRes.save(null)
        } catch (IOException e) {
            throw new Exception("Cannot write output model file: " + e.getMessage());
        }
    }    
      
    /* SCT Generator extensions
     * You can use these by including the SCT Generator as extension.
     */
    
    /**
     * Returns a random integer number depending on the kind of property used.
     * <pre>
     *   {@code MinMax} properties return a number between min and max.
     *   {@code ChanceMax} properties basically roll dice until the chance fails or the maximum is reached.
     *   {@code Value} properties return 0 or 1 depending of a single die roll.
     * </pre>
     * 
     * @param property expects an SCT Generator property.
     * 
     * @returns a random integer number
     */
    def int random(IProperty<?> property) {
        val propertyValue = getProperty(property)
        if (propertyValue instanceof MinMax<?>) {
            /* If the propertyValue is a MinMax property,
             * return a random value between min and max. */  
            val min = propertyValue.min
            val max = propertyValue.max
            if (min instanceof Integer && max instanceof Integer) {
                return random(min as Integer, max as Integer)
            }   
        } else if (propertyValue instanceof ChanceMax<?, ?>) {
            /* If the propertyValue is a ChanceMax property,
             * basically roll dice until a roll fails or the maximum is reached. */           
            val chance = propertyValue.chance
            val max = propertyValue.max
            if (chance instanceof Double && max instanceof Integer) {
                return (chance as Double).chance(max as Integer)
            }
        } else if (propertyValue instanceof Value<?>) {
            /* If the property is a Value,
             * return 1 if the die roll is successful.
             * Otherwise, return 0. */
            if (propertyValue.value instanceof Double) {
                if ((propertyValue.value as Double).chance) {
                    return 1 
                 } else {
                    return 0
                 }
            } 
        }
        throw new Exception("SCT Generator random: The property value is not supported.")
    }
    
    /**
     * Retrieves a boolean value depending on the SCT Generator property and  
     * depending of the actual value. If the value exceeds the maximum value of the property, 
     * the value will be false regardless of the outcome of the chance function. 
     * 
     * @param property expects an SCT Generator property.
     * @param value defines the actual value.
     * @returns a boolean value.
     */
    def boolean random(IProperty<?> property, int value) {
        if (value < 1) {
            // If the value is smaller than 1, always return false.
            return false
        } else {
            val propertyValue = getProperty(property)
            if (propertyValue instanceof ChanceMax<?, ?>) {
                /* If the property value is a ChanceMax class, 
                 * retrieve the values and roll a die if the 
                 * value does not exceed the max value. */  
                val chance = propertyValue.chance
                val max = propertyValue.max
                if (chance instanceof Double && max instanceof Integer) {
                     if (value < max as Integer && (chance as Double).chance) {
                         return true
                     } else {
                         return false
                     }
                 }
            } 
        }
        false
    }
    
    /** 
     * Returns a random integer number between {@code min} and {@code max}.
     * 
     * @param min defines the lower bound.
     * @param max defines the upper bound.
     * @returns a random integer number between {@code min} and {@code max}.
     */
    def int random(int min, int max) {
        (min + (max + 1 - min) * Math.random) as int
    }

    /**
     * Returns a number between 0 and {@code max}.
     * 
     * @param max defines the upper limit.
     * @returns a random number between 0 and {@code max}. 
     */
    def int random(int max) {
        (max * Math.random) as int
    }

    /**
     * Retrieves true, if a random value is lower than a given value.
     * Used to calculate chances.
     * 
     * @param chance defines a limit.
     * @returns true if random does not exceed the limit.
     */
    def boolean chance(double chance) {
        Math.random < chance
    }

    /**
     * Helper function to accumulate the chance property.
     * 
     * @param rnd defines the chance value.
     * @param max defines the max value.
     * @returns a random integer value w.r.t. the input parameters.
     */
    private def int chance(double rnd, int max) {
        var count = 0
        var boolean repeat
        do {
            repeat = false
            if (rnd.chance && count < max) {
                count++
                repeat = true
            }
        } while (repeat)
        count
    }
       
}
            