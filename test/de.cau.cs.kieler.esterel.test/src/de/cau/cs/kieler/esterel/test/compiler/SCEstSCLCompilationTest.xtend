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
package de.cau.cs.kieler.esterel.test.compiler

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelStandaloneSetup
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.scl.SCLStandaloneSetup
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner.StopOnFailure
import de.cau.cs.kieler.test.common.repository.TestModelData
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

import static extension java.lang.String.format
import de.cau.cs.kieler.esterel.processors.transformators.incremental.SCEstTransformation
import de.cau.cs.kieler.scl.SCLProgram
import org.eclipse.emf.ecore.EObject

/**
 * Tests if all sensible intermediate results of the Esterel to SCL compilation fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCEstSCLCompilationTest extends AbstractXTextModelRepositoryTest<EsterelProgram> {
    
    /** Compiler configuration */
    private val compilationSystemID = "de.cau.cs.kieler.esterel.scest.scl"
    
    /** Sct Parser Injector */
    static val sclInjector = new SCLStandaloneSetup().createInjectorAndDoEMFRegistration
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
        && !modelData.additionalProperties.containsKey("testSerializability")
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

       
        // Check all intermediate results
        val context = est.compile
        for (iResult : context.processorInstancesSequence) {
            assertNotNull("Intermediate result of transformation " + iResult.id + " is null", iResult.model)
            if (SCEstTransformation.SCL_ID.equals(iResult.id)) {
                assertTrue("Intermediate result of transformation " + iResult.id + " is not an SCL Program", iResult.model instanceof SCLProgram)
            } else {
                assertTrue("Intermediate result of transformation " + iResult.id + " is not an Esterel Program", iResult.model instanceof EsterelProgram)
            }

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
            val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString + if (SCEstTransformation.SCL_ID.equals(iResult.id)) ".scl" else "")
            val resourceSet = (if (SCEstTransformation.SCL_ID.equals(iResult.id)) sclInjector else esterelInjector).getInstance(XtextResourceSet)
            val resource = resourceSet.createResource(uri) as XtextResource
            resource.getContents().add(iResult.model as EsterelProgram)
            
            // Check if validator marks no errors
            validatorResults = validator.validate(est.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
            assertTrue("Intermediate result of transformation " + iResult.id + " contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)            
        }        
    }
    
    @Test(timeout=60000)
    def void testSerializability(EsterelProgram est, TestModelData modelData) {
        val result = est.compile
        
        // Check all intermediate results
        for (iResult : result.processorInstancesSequence) {
            val name = "intermediate result of transformation " + iResult.id
            
            assertNotNull("The %s is null".format(name), iResult.model)
            if (SCEstTransformation.SCL_ID.equals(iResult.id)) {
                assertTrue("Intermediate result of transformation " + iResult.id + " is not an SCL Program", iResult.model instanceof SCLProgram)
            } else {
                assertTrue("Intermediate result of transformation " + iResult.id + " is not an Esterel Program", iResult.model instanceof EsterelProgram)
            }

            try {
                // Serialize
                val outputStream = new ByteArrayOutputStream(25000);
                val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString + if (SCEstTransformation.SCL_ID.equals(iResult.id)) ".scl" else "")
                val resourceSet = (if (SCEstTransformation.SCL_ID.equals(iResult.id)) sclInjector else esterelInjector).getInstance(XtextResourceSet)
                
                // create model resource
                val resource = resourceSet.createResource(uri) as XtextResource
                resource.getContents().add(iResult.model as EObject)

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
    
    private def compile(EsterelProgram est) {
        val context = Compile.createCompilationContext(compilationSystemID, est)
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
														