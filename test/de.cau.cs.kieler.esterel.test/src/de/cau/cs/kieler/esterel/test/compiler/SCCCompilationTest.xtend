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
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.esterel.processors.ssa.SCEstToSSCSCLTransformation
import de.cau.cs.kieler.esterel.processors.ssa.SSCEsterelReconstruction
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.scl.SCLProgram
import de.cau.cs.kieler.scl.SCLStandaloneSetup
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
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
 * Tests if all sensible intermediate results of the SCC compilation for Esterel fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCCCompilationTest extends AbstractXTextModelRepositoryTest<EsterelProgram> {
    
    /** Compiler configuration */
    private val compilationSystemID = "de.cau.cs.kieler.esterel.scc"
    
    /** Parser Injector */
    static val sclInjector = new SCLStandaloneSetup().createInjectorAndDoEMFRegistration
    static val esterelInjector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration
    
    extension EsterelExtensions = new EsterelExtensions
    
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
        && (!modelData.additionalProperties.containsKey("testSerializability") || modelData.additionalProperties.get("testSerializability")?.parseBoolean)
        && (!modelData.modelProperties.contains("must-fail") || modelData.modelProperties.contains("must-fail-validation"))
    }
    
    @Test(timeout=20000)
    def void testCompilation(EsterelProgram est, TestModelData modelData) {
        assumeTrue("Program is not in kernel esterel form", est.isKernel)
        val context = est.compile
        
        // Check all intermediate results for errors
        for (iResult : context.processorInstancesSequence) {
            assertNotNull("Intermediate result of transformation " + iResult.id + " is null", iResult.model)

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
        }
         
        // -- Check SCL
        val sclResult = context.processorInstancesSequence.findFirst[SCEstToSSCSCLTransformation.ID.equals(id)]
      
        // Validate
        // Create resource
        var uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString + ".scl")
        var resourceSet = sclInjector.getInstance(XtextResourceSet)
        var resource = resourceSet.createResource(uri) as XtextResource
        resource.getContents().add(sclResult.targetModel as SCLProgram)
        
        // Check if validator marks no errors
        var validator = sclInjector.getInstance(IResourceValidator)
        var validatorResults = validator.validate(est.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
        assertTrue("Intermediate result of transformation " + sclResult.id + " contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)            
        
        // Serialize
        try {
            // Serialize
            val outputStream = new ByteArrayOutputStream(25000);
            resource.save(outputStream, saveOptions)
            
            assertTrue("Serialized %s is empty".format(sclResult.id), outputStream.size > 0)
        } catch (AssertionError ae) {
            throw ae
        } catch (Exception e) {
            throw new Exception("Error while serializing %s caused by: %s".format(sclResult.id, e.message), e)
        }
        
        // Check resulting Esterel
        val estResult = context.processorInstancesSequence.findFirst[SSCEsterelReconstruction.ID.equals(id)]
      
        // Validate
        // Create resource
        uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString)
        resourceSet = uri.xtextResourceSet as XtextResourceSet
        resource = resourceSet.createResource(uri) as XtextResource
        resource.getContents().add(estResult.targetModel as EsterelProgram)
        
        // Check if validator marks no errors
        validator = sclInjector.getInstance(IResourceValidator)
        validatorResults = validator.validate(est.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
        assertTrue("Intermediate result of transformation " + estResult.id + " contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)            
        
        // Serialize
        try {
            // Serialize
            val outputStream = new ByteArrayOutputStream(25000);
            resource.save(outputStream, saveOptions)
            
            assertTrue("Serialized %s is empty".format(estResult.id), outputStream.size > 0)
        } catch (AssertionError ae) {
            throw ae
        } catch (Exception e) {
            throw new Exception("Error while serializing %s caused by: %s".format(estResult.id, e.message), e)
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
														