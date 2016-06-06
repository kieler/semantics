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
package de.cau.cs.kieler.sccharts.text.sct.sctgenerator

import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Singleton
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.MapPropertyHolder
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.sccharts.State
import java.io.IOException
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

/**
 * @author ssm
 * 
 */
@Singleton
class SCTGenerator extends MapPropertyHolder implements ISCTGeneratorPropertyHolder {
    
    @Inject extension ModelGenerator
    
    public static val SCT_MODEL_EXTENSION = "sct"
    
    
    ////////////////////////////////////////////////////////////////////
    /// DEFAULT PROPERTIES
    ///
    
    public static val SCTGENERATOR_ID = "de.cau.cs.kieler.sccharts.text.sct.generator"
    public static val SCTGENERATOR_EXTENSION_POINT = SCTGENERATOR_ID + ".extension" 
    public static val SCTGENERATOR_CORE_TAB = SCTGENERATOR_ID + "tabs.Core"
    public static val SCTGENERATOR_EXTENSIONS_TAB = SCTGENERATOR_ID + "tabs.Extensions"

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
        
        
    ////////////////////////////////////////////////////////////////////
    /// INTERFACES
    ///        
        
    override getProperties() {
        <IProperty<?>>newArrayList(
            NUMBER_OF_MODELS, NUMBER_OF_STATES, CHANCE_FOR_TRANSITION,
            CHANCE_FOR_IMMEDIATE, CHANCE_FOR_SUPERSTATE, CHANCE_FOR_CONCURRENCY,
            NUMBER_OF_INPUTS, NUMBER_OF_OUTPUTS, CHANCE_FOR_EXPRESSION
        )
    }

    override getTab() {
        SCTGENERATOR_CORE_TAB
    }
    
    ////////////////////////////////////////////////////////////////////
    /// PUBLIC
    ///
    
    def getTabbedProperties() {
        val properties = <String, List<IProperty<?>>>newLinkedHashMap 
        properties.put(getTab, getProperties)
        for(ext : getRegisteredExtensions) {
            properties.put(ext.tab, ext.properties)
        }
        properties
    }
    
    private static val ID_PREFIX = "model"    
    
    def createModels(IProject project) {
        val job = new Job("Creating Models") {

            override protected run(IProgressMonitor monitor) {
                val int numberOfModels = getProperty(NUMBER_OF_MODELS).value
                monitor.beginTask("Creating Models", numberOfModels)
                for (var int i = 0; i < numberOfModels; i++) {
                    var String is = "" + i
                    while (is.length < numberOfModels.toString.length) {
                        is = "0" + is
                    }
                    val model = createModel(ID_PREFIX + is)
                    saveModel(model, project)
                    if (i % 2 == 0) {
                        monitor.worked(2)
                    }
                    if (monitor.canceled) {
                        return Status.CANCEL_STATUS
                    }
                }
                project.refreshLocal(1, monitor)
                return Status.OK_STATUS
            }

        }

        job.setUser(true)
        job.schedule
    }  
    
    private def saveModel(State rootState, IProject project) {
        var output = URI.createURI(project.locationURI.toString() + "/" + rootState.id);
        output = output.appendFileExtension(SCT_MODEL_EXTENSION);

        try {
            val resSet = new ResourceSetImpl();
            val saveRes = resSet.createResource(output);

            saveRes.getContents().add(rootState);
            saveRes.save(null)
        } catch (IOException e) {
            throw new Exception("Cannot write output model file: " + e.getMessage());
        }
    }    
      

    def int random(IProperty<?> property) {
        val propertyValue = getProperty(property)
        if (propertyValue instanceof MinMax<?>) {
            val min = propertyValue.min
            val max = propertyValue.max
            if (min instanceof Integer && max instanceof Integer) {
                return random(propertyValue.min as Integer, propertyValue.max as Integer)
            }   
        } else if (propertyValue instanceof ChanceMax<?, ?>) {
           val chance = propertyValue.chance
           val max = propertyValue.max
           if (chance instanceof Double && max instanceof Integer) {
               return (chance as Double).chance(max as Integer)
           }
        } else if (propertyValue instanceof Double) {
            return if (propertyValue.chance) 1 else 0 
        }
        0
    }
    
    def boolean random(IProperty<?> property, int value) {
        if (value < 1) {
            return false
        } else {
            val propertyValue = getProperty(property)
            if (propertyValue instanceof ChanceMax<?, ?>) {
                val chance = propertyValue.chance
                val max = propertyValue.max
                if (chance instanceof Double && max instanceof Integer) {
                     val b = (chance as Double).chance
                     if (b && value < max as Integer) {
                         return true
                     } else {
                         return false
                     }
                 }
            } else if (propertyValue instanceof Double) {
                 if (propertyValue.chance) {
                     return true
                 } 
            } 
        }
        false
    }
    
    public def int random(int min, int max) {
        (min + (max + 1 - min) * Math.random) as int
    }

    public def int random(int count) {
        (count * Math.random) as int
    }

    public def boolean chance(double rnd) {
        Math.random < rnd
    }

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
    
    ////////////////////////////////////////////////////////////////////
    /// STATIC
    ///
        
    static def List<ISCTGeneratorExtension> getRegisteredExtensions() {
        val regExt = <ISCTGeneratorExtension>newArrayList
        val extensions = Platform.getExtensionRegistry().getConfigurationElementsFor(
                        SCTGENERATOR_EXTENSION_POINT);
        for (ext : extensions) {
            try {
                val exeExt = ext.createExecutableExtension("class") 
                val instance = getGuiceInstance(exeExt) as ISCTGeneratorExtension
                regExt += instance
            } catch (CoreException e) {
                System.err.print("Could not load SCT Generator extension: " + ext.getName )
            }
        }
        regExt
    }        
       
    private static def Object getGuiceInstance(Object object) {
        Guice.createInjector().getInstance(object.getClass());
    }
    
        
}
            