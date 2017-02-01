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
package de.cau.cs.kieler.sccharts.test

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.BundleId
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelFilter
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelPath
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test
import org.junit.runner.RunWith
import java.io.File

/**
 * Transforms the input models step by step using every sccharts transformation.
 * After each step the generated model is saved to test if the model is serializable
 * and thus meets the specification in its EMF meta model 
 * 
 * @author aas
 *
 */
@RunWith(typeof(ModelCollectionTestRunner))
@BundleId("de.cau.cs.kieler.sccharts.sim.c.test")
//@ModelPath("testdata-basics/**", "testdata-simple/**",
//           "testdata-cmot-diss/simple/**", "testdata-cmot-diss/complex/**", "testdata-cmot-diss/composite/**",
//           "testdata-advanced/**")
@ModelPath("testdata-basics/**")
@ModelFilter("*.sct")
class TransformedModelSavableTest extends SCChartsTestBase{
    
    // List of all transformations
    // in an order that respects dependencies.
    private val transformations = #["HISTORY",          // SCADE / QUARTZ / Esterel
                                    "WEAKSUSPEND",
                                    "STATIC",
                                    "DEFERRED",
                                    
                                    "SIGNAL",           // SyncCharts
                                    "SUSPEND",
                                    "PRE",
                                    "COUNTDELAY",
                                    
                                    "DURING",           // Statecharts
                                    "COMPLEXFINALSTATE",
                                    "ABORT",
                                    "INITIALIZATION",
                                    "EXIT",
                                    "ENTRY",
                                    "CONNECTOR",
                                    
                                    "TRIGGEREFFECT",    // CORE
                                    "SURFACEDEPTH"]
    
    /**
     * Constructor
     */
    new(EObject model) {
        super(model)
    }
    
    /**
     * Compile model using every trafo and each time try to save result.
     */
    @Test
    def public void transformedModelIsSavable() {
        var nextModel = model;
        for(t : transformations) {                
            if (nextModel instanceof State) {
                var compileChain = "!T_SIMULATIONVISUALIZATION, !T_ABORTWTO"
                compileChain += (", T_"+t)
                
                // Compile with KiCo
                val context = new KielerCompilerContext(compileChain, nextModel)
                // We compile every transformation sequentially (respecting dependencies)
                // thus we don't need the advanced selection.
                context.setAdvancedSelect(false)
                
                val result = KielerCompiler.compile(context)
                val resultModel = result.getEObject()
                if (resultModel == null) {
                    throw new IllegalArgumentException("KIELER Compiler was not able to compile input model " + modelName)
                }
                
                // This model will be further compiled in the next iteration with the next transformation
                nextModel = resultModel
                
                // Output folder is 'output/TRANSFORMATION/MODEL_NAME'
//                val outputFolder = "output"+ File.separator + t + File.separator + modelName
                // Output is 'output/MODEL_NAME'
                val outputFolder = "output"+ File.separator + modelName
                
                // Serialize model to human readable text
                val resourceSet = new ResourceSetImpl()
                val targetURI = URI.createURI(outputFolder)
                var resource = resourceSet.createResource(targetURI)
                resource.getContents().add(resultModel)
                try {
                    resource.save(Collections.emptyMap())
                } catch (Exception e) {
                    e.printStackTrace()
                    throw new Exception("Error saving model " + modelName + " after " + t + " transformation.", e)
                }
            } else {
                throw new IllegalArgumentException("Model could not be cast to an SCChart.")
            }
        }
    }

}
