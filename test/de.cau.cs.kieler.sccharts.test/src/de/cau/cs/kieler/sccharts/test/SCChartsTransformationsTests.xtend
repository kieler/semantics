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
package de.cau.cs.kieler.sccharts.test

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.semantics.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.semantics.test.common.repository.TestModelData
import org.junit.Test
import org.junit.runner.RunWith
import de.cau.cs.kieler.semantics.test.common.repository.ModelsRepositoryTestRunner
import static org.junit.Assert.*
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.semantics.test.common.repository.ModelsRepositoryTestRunner.StopOnFailure
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.sccharts.text.sct.SctResource
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup
import org.eclipse.xtext.serializer.impl.Serializer
import de.cau.cs.kieler.kico.KielerCompilerProgressMonitor
import de.cau.cs.kieler.kico.KiCoPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.XMLResource
import java.io.ByteArrayOutputStream
import static extension java.lang.String.format

/**
 * Tests if all intermediate results of an SCCharts compilation fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsTransformationsTests extends AbstractXTextModelRepositoryTest<State> {
    
        // List of all transformations
    // in an order that respects dependencies.
    private val transformations = newArrayList(
                                    "REFERENCE",         // Expansion
                                    "CONST",
                                    "MAP",
                                    "FOR",
        
                                    "HISTORY",          // SCADE / QUARTZ / Esterel
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
                                    "SURFACEDEPTH")
    
    //-----------------------------------------------------------------------------------------------------------------
    
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("sccharts")
    }
    
    @Test(timeout=60000)
    def void testSerializablility(State scc, TestModelData modelData) {
        val result = scc.compile
        
        // Check all intermediate results
        for (iResult : result.transformationIntermediateResults) {
            val name = if (iResult.id.nullOrEmpty) {
                "input model"
            } else {
                "intermediate result of transformation " + iResult.id
            }
            
            assertNotNull("The %s is null".format(name), iResult.result)
            assertTrue("The %s is not an SCChart".format(name), iResult.result instanceof State)
            
            try {
                // Serialize
                val outputStream = new ByteArrayOutputStream(25000);
                val uri = URI.createURI("dummy:/inmemory/" + modelData.modelPath.fileName.toString)
                val resource = uri.xtextResourceSet.createResource(uri)
                resource.getContents().add(iResult.result as State)
                resource.save(outputStream, saveOptions)
                
                assertTrue("Serialized %s is empty".format(name), outputStream.size > 0)
            } catch (AssertionError ae) {
                throw ae
            } catch (Exception e) {
                new Exception("Error when %s".format(name), e)
            }
        }
    }
    
    @Test
    def void testFeatureElimination(State scc) {
        val result = scc.compile
        
        // Check all intermediate results
        for (iResult : result.transformationIntermediateResults.filter[!id.nullOrEmpty]) {
            assertNotNull("Intermediate result of transformation " + iResult.id + " is null", iResult.result)
            assertTrue("Intermediate result of transformation " + iResult.id + " is not an SCChart", iResult.result instanceof State)
            
            // Check if feature was removed
            val feature = KiCoPlugin.getFeature(iResult.id)
            if (feature != null) {
                assertFalse("Transformed intermediate result of transformation " + iResult.id + " still contains the expanded feature", feature.isContained(iResult.result as State))
            }
        }
    }
    
    //-----------------------------------------------------------------------------------------------------------------
    
    private def compile(State scc) {
        val compileChain = transformations.join("!T_SIMULATIONVISUALIZATION, !T_ABORTWTO, T_", ", T_", "")[it]
        
        // Compile with KiCo
        val context = new KielerCompilerContext(compileChain, scc)
        context.advancedSelect = false // Compilation has fixed chain (respecting dependencies)
        context.inplace = false // Save intermediate results
        
        val result = KielerCompiler.compile(context)
        if (!result.postponedErrors.empty) {
            throw new Exception("Could not compile SCCharts model into Core SCCharts form. Compilation error occurred!", result.postponedErrors.head)
        }
        val resultModel = result.getEObject()
        assertNotNull("Compilation result is null", resultModel)
        assertTrue("Compilation result is not an SCChart", resultModel instanceof State)
        
        return result
    }
    
    private def getSaveOptions() {
        val saveOptions = <String, String>newHashMap
        saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8")
        saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER)
        return saveOptions
    }
      
}