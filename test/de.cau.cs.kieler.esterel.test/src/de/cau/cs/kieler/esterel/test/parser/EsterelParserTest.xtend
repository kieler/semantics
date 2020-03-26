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
package de.cau.cs.kieler.esterel.test.parser

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelStandaloneSetup
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner.StopOnFailure
import java.io.ByteArrayOutputStream
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
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

import static extension java.lang.Boolean.parseBoolean

/**
 * Tests if all can be parsed and serialized.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class EsterelParserTest extends AbstractXTextModelRepositoryTest<EsterelProgram> {

    /** Compiler configuration */
    private val compilationSystemID = "de.cau.cs.kieler.kicool.identity"
        
    /** Sct Parser Injector */
    static val esterelInjector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration
    
    //-----------------------------------------------------------------------------------------------------------------
    
    /**
     * Constructor
     */
    new() {
        super(esterelInjector)
    }
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("esterel")
        && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
        && (!modelData.additionalProperties.containsKey("testSerializability") || modelData.additionalProperties.get("testSerializability").trim.parseBoolean)
        && (!modelData.modelProperties.contains("must-fail") || modelData.modelProperties.contains("must-fail-validation"))
    }
    
    @Test
    @StopOnFailure
    def void testValidation(EsterelProgram est, TestModelData modelData) {
        
        // Validate input model
        val validator = esterelInjector.getInstance(IResourceValidator)
        var validatorResults = validator.validate(est.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
        if (modelData.modelProperties.contains("must-fail-validation")) {
            assertTrue("Input model does not contain the expected validation error markers", !validatorResults.empty)
            return
        } else {
            assertTrue("Input model contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)
        }    
    }
    
    @Test(timeout=60000)
    def void testSerializability(EsterelProgram est, TestModelData modelData) {
        val result = est.compile
        
        // Check all intermediate results
        var List<Resource> movedResources = null
        val iResult = result.processorInstancesSequence.head
        
        assertNotNull("The model is null", iResult.model)
        assertTrue("The model is not an Esterel program", iResult.model instanceof EsterelProgram)

        try {
            // Serialize
            val outputStream = new ByteArrayOutputStream(25000);
            val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString)
            val resourceSet = esterelInjector.getInstance(XtextResourceSet)
            
            // create model resource
            val resource = resourceSet.createResource(uri) as XtextResource
            resource.getContents().add(iResult.model as EObject)
            
            if (!modelData.resourceSetID.nullOrEmpty) {
                // copy possibly referenced models
                movedResources = est.eResource.resourceSet.resources.filter[it !== est.eResource].toList
                resourceSet.resources.addAll(movedResources)
            }

            // save
            resource.save(outputStream, saveOptions)
            
            assertTrue("Serialized result is empty", outputStream.size > 0)
        } catch (AssertionError ae) {
            throw ae
        } catch (Exception e) {
            throw new Exception("Error while serializing model, caused by: " + e.message, e)
        } finally {
            if (movedResources !== null) {
                est.eResource.resourceSet.resources.addAll(movedResources)
            }
        }
    }
    
    //-----------------------------------------------------------------------------------------------------------------
    
    private def compile(EsterelProgram est) {
        val context = Compile.createCompilationContext(compilationSystemID, est)
        context.startEnvironment.setProperty(Environment.INPLACE, false) // Copy!!!

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
														