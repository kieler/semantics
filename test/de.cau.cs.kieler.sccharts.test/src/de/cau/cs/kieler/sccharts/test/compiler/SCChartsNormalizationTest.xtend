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
package de.cau.cs.kieler.sccharts.test.compiler

import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner.StopOnFailure
import java.io.ByteArrayOutputStream
import java.io.PrintWriter
import java.io.StringWriter
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
import static org.junit.Assume.*

import static extension java.lang.String.format
import static extension java.lang.Boolean.parseBoolean

/**
 * Tests if all intermediate results of an SCCharts normalization compilation fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsNormalizationTest extends AbstractXTextModelRepositoryTest<SCCharts> {
    
    /** Compiler configuration */
    private val compilationSystemID = "de.cau.cs.kieler.sccharts.extended.core"
    
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
        && !modelData.modelProperties.contains("large")
        && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
        && (!modelData.additionalProperties.containsKey("testSerializability") || modelData.additionalProperties.get("testSerializability").trim.parseBoolean)
        && (!modelData.modelProperties.contains("must-fail") || modelData.modelProperties.contains("must-fail-validation"))
    }
    
    @Test
    @StopOnFailure
    def void testValidation(SCCharts scc, TestModelData modelData) {
        
        // Validate input model
        val validator = resourceSetInjector.getInstance(IResourceValidator)
        var validatorResults = validator.validate(scc.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
        if (modelData.modelProperties.contains("must-fail-validation")) {
            assertTrue("Input model does not contain the expected validation error markers", !validatorResults.empty)
            return
        } else {
            assertTrue("Input model contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)
        }

       
        // Check all intermediate results
        val context = scc.compile
        for (iResult : context.processorInstancesSequence) {
            assertNotNull("Intermediate result of transformation " + iResult.id + " is null", iResult.model)
            assertTrue("Intermediate result of transformation " + iResult.id + " is not an SCChart", iResult.model instanceof SCCharts)

            // Check compiler errors
            if (!iResult.environment.errors.empty) {
                fail("Intermediate result of transformation " + iResult.id + " has compilation error(s): \n- " + iResult.environment.errors.get(Environment.REPORT_ROOT).map[ err |
                     if (err.exception !== null) {
                         ((new StringWriter) => [err.exception.printStackTrace(new PrintWriter(it))]).toString()
                     } else {
                        err.message
                     }
                ].join("\n- "))
            }     
            
            // Create resource
            val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString)
            val resourceSet = uri.xtextResourceSet as XtextResourceSet
            val resource = resourceSet.createResource(uri) as XtextResource
            resource.getContents().add(iResult.model as SCCharts)
            
            // Check if validator marks no errors
            validatorResults = validator.validate(scc.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
            assertTrue("Intermediate result of transformation " + iResult.id + " contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)            
        }        
    }
    
    @Test(timeout=60000)
    def void testSerializability(SCCharts scc, TestModelData modelData) {
        assumeFalse(modelData.modelProperties.contains("must-fail"))
        
        val result = scc.compile
        
        // Check all intermediate results
        for (iResult : result.processorInstancesSequence) {
            val name = "intermediate result of transformation " + iResult.id
            
            assertNotNull("The %s is null".format(name), iResult.targetModel)
            assertTrue("The %s is not an SCChart".format(name), iResult.model instanceof SCCharts)

            try {
                // Serialize
                val outputStream = new ByteArrayOutputStream(25000);
                val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString)
                val resourceSet = uri.xtextResourceSet as XtextResourceSet
                
                // create model resource
                val resource = resourceSet.createResource(uri) as XtextResource
                resource.getContents().add(iResult.model as SCCharts)

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
    
    private def compile(SCCharts scc) {
        val context = Compile.createCompilationContext(compilationSystemID, scc)
        context.startEnvironment.setProperty(Environment.INPLACE, false)

        context.compile
        
        return context
    }
    
    private def getSaveOptions() {
        val saveOptions = <String, String>newHashMap
        saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8")
        saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER)
        return saveOptions
    }
      
}
														