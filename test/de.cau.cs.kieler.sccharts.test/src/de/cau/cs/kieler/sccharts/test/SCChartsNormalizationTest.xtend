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

import de.cau.cs.kieler.kico.KiCoPlugin
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner.StopOnFailure
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

import static extension java.lang.String.format

/**
 * Tests if all intermediate results of an SCCharts normalization compilation fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsNormalizationTest extends AbstractXTextModelRepositoryTest<State> {
    
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
    
    /** Sct Parser Injector */
    static val resourceSetInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    
    //-----------------------------------------------------------------------------------------------------------------
    
    /**
     * Constructor
     */
    new() {
        super(resourceSetInjector)
    }
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("sccharts")
        && !modelData.additionalProperties.containsKey("testSerializability")
        && !modelData.modelProperties.contains("must-fail")
    }
    
    @Test
    @StopOnFailure
    def void testValidation(State scc, TestModelData modelData) {
        
        // Validate input model
        val validator = resourceSetInjector.getInstance(IResourceValidator)
        var validatorResults = validator.validate(scc.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
        assertTrue("Input model contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)

        val result = scc.compile        
        // Check all intermediate results
        for (iResult : result.transformationIntermediateResults.filter[!id.nullOrEmpty]) {
            assertNotNull("Intermediate result of transformation " + iResult.id + " is null", iResult.result)
            assertTrue("Intermediate result of transformation " + iResult.id + " is not an SCChart", iResult.result instanceof State)
            
            // Create resource
            val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString)
            val resourceSet = uri.xtextResourceSet as XtextResourceSet
            val resource = resourceSet.createResource(uri) as XtextResource
            resource.getContents().add(iResult.result as State)
            
            // Check if validator marks no errors
            validatorResults = validator.validate(scc.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
            assertTrue("Intermediate result of transformation " + iResult.id + " contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)            
        }        
    }
    
    @Test
    @StopOnFailure
    def void testFeatureElimination(State scc) {
        val result = scc.compile
        
        // Check all intermediate results
        for (iResult : result.transformationIntermediateResults.filter[!id.nullOrEmpty]) {
            assertNotNull("Intermediate result of transformation " + iResult.id + " is null", iResult.result)
            assertTrue("Intermediate result of transformation " + iResult.id + " is not an SCChart", iResult.result instanceof State)
            
            // Check if feature was removed
            val feature = KiCoPlugin.getFeature(iResult.id)
            if (feature !== null) {
                assertFalse("Transformed intermediate result of transformation " + iResult.id + " still contains the expanded feature", feature.isContained(iResult.result as State))
            }
        }
    }
    
    @Test(timeout=60000)
    def void testSerializability(State scc, TestModelData modelData) {
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
                val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString)
                val resourceSet = uri.xtextResourceSet as XtextResourceSet
                
                // create model resource
                val resource = resourceSet.createResource(uri) as XtextResource
                resource.getContents().add(iResult.result as State)

                // save
                resource.save(outputStream, saveOptions)
                
                assertTrue("Serialized %s is empty".format(name), outputStream.size > 0)
            } catch (AssertionError ae) {
                throw ae
            } catch (Exception e) {
                throw new Exception("Error while serializing %s caused by: %s".format(name, e.message), e)
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