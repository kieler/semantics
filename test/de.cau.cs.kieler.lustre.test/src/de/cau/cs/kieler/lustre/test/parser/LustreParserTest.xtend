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
package de.cau.cs.kieler.lustre.test.parser

import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.lustre.LustreStandaloneSetup
import de.cau.cs.kieler.lustre.lustre.LustreProgram
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

/**
 * Tests if all Lustre models in repository can be parsed and serialized.
 * 
 * @author lgr
 */
@RunWith(ModelsRepositoryTestRunner)
class LustreParserTest extends AbstractXTextModelRepositoryTest<LustreProgram> {

    /** Compiler configuration */
    val compilationSystemID = "de.cau.cs.kieler.kicool.identity"
        
    /** Lustre Parser Injector */
    static val lustreInjector = LustreStandaloneSetup.doSetup
    
    //-----------------------------------------------------------------------------------------------------------------
    
    /**
     * Constructor
     */
    new() {
        super(lustreInjector)
    }
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("lustre")
    }
    
    @Test
    @StopOnFailure
    def void testValidation(LustreProgram lus, TestModelData modelData) {
        
        // Validate input model
        val validator = lustreInjector.getInstance(IResourceValidator)
        var validatorResults = validator.validate(lus.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR || severity === Severity.WARNING].toList
        if (modelData.modelProperties.contains("must-fail-validation")) {
            if (modelData.modelProperties.contains("error")) {
                // Validation should fail because of error
                val validationErrors = validatorResults.filter[severity.equals(Severity.ERROR)]
                assertTrue("Input model does not contain the expected validation error markers", !validationErrors.empty)
            } else if (modelData.modelProperties.contains("warning")) {
                // Validation should fail because of warning
                val validationWarnings = validatorResults.filter[severity.equals(Severity.WARNING)]
                assertTrue("Input model does not contain the expected validation warning markers", !validationWarnings.empty)
            } else {
                // Not specified, so check as usual
                assertTrue("Input model does not contain the expected validation error markers", !validatorResults.empty)
            }
            return
        } else {
            assertTrue("Input model contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)
        }    
    }
    
    @Test(timeout=60000)
    def void testSerializability(LustreProgram lus, TestModelData modelData) {
        val result = lus.compile
        
        // Check all intermediate results
        var List<Resource> movedResources = null
        val iResult = result.processorInstancesSequence.head
        
        assertNotNull("The model is null", iResult.model)
        assertTrue("The model is not a Lustre program", iResult.model instanceof LustreProgram)

        try {
            // Serialize
            val outputStream = new ByteArrayOutputStream(25000);
            val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString)
            val resourceSet = lustreInjector.getInstance(XtextResourceSet)
            
            // create model resource
            val resource = resourceSet.createResource(uri) as XtextResource
            resource.getContents().add(iResult.model as EObject)
            
            if (!modelData.resourceSetID.nullOrEmpty) {
                // copy possibly referenced models
                movedResources = lus.eResource.resourceSet.resources.filter[it !== lus.eResource].toList
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
                lus.eResource.resourceSet.resources.addAll(movedResources)
            }
        }
    }
    
    //-----------------------------------------------------------------------------------------------------------------
    
    private def compile(LustreProgram lus) {
        val context = Compile.createCompilationContext(compilationSystemID, lus)
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
														