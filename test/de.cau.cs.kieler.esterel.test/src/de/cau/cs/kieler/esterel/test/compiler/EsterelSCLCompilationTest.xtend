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
import de.cau.cs.kieler.esterel.processors.transformators.incremental.SCEstTransformation
import de.cau.cs.kieler.esterel.scest.SCEstStandaloneSetup
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.scl.SCLProgram
import de.cau.cs.kieler.scl.SCLStandaloneSetup
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner.StopOnFailure
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.io.ByteArrayOutputStream
import java.io.PrintWriter
import java.io.StringWriter
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
import static org.junit.Assume.*

import static extension java.lang.Boolean.parseBoolean
import static extension java.lang.String.format
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.TypeIdentifier
import java.util.ArrayList

/**
 * Tests if all sensible intermediate results of the Esterel to SCL compilation fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class EsterelSCLCompilationTest extends AbstractXTextModelRepositoryTest<EsterelProgram> {
    
    /** Compiler configuration */
    private val compilationSystemID = "de.cau.cs.kieler.esterel.scest.scl"
    
    /** Sct Parser Injector */
    static val sclInjector = new SCLStandaloneSetup().createInjectorAndDoEMFRegistration
    static val esterelInjector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration
    static val scestInjector = new SCEstStandaloneSetup().createInjectorAndDoEMFRegistration
    
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
//        && (!fails.contains(modelData.modelPath))
    }
    
    @Test(timeout=6000)
    @StopOnFailure
    def void testValidation(EsterelProgram est, TestModelData modelData) {
        assumeFalse(true); // Do nothing !!

        assumeTrue(est.hasNoEsterelType) // skip if program includes esterel type
        
        // Check all intermediate results
        val context = est.compile
        for (iResult : context.processorInstancesSequence) {
            assertNotNull("Intermediate result of transformation " + iResult.id + " is null", iResult.model)
            if (SCEstTransformation.SCL_ID.equals(iResult.id)) {
                assertTrue("Intermediate result of transformation " + iResult.id + " is not an SCL Program", iResult.model instanceof SCLProgram)
            } else {
                assertTrue("Intermediate result of transformation " + iResult.id + " is not a SCEst Program", iResult.model instanceof EsterelProgram)
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
            val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString + if (SCEstTransformation.SCL_ID.equals(iResult.id)) ".scl" else ".scest")
            val resourceSet = (if (SCEstTransformation.SCL_ID.equals(iResult.id)) sclInjector else scestInjector).getInstance(XtextResourceSet)
            val resource = resourceSet.createResource(uri) as XtextResource
            resource.getContents().add(iResult.model as EObject)
            
            // Check if validator marks no errors
            val validator = esterelInjector.getInstance(IResourceValidator)
            val validatorResults = validator.validate(est.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
            assertTrue("Intermediate result of transformation " + iResult.id + " contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)            
        }        
    }
    
    @Test(timeout=10000)
    def void testSerializability(EsterelProgram est, TestModelData modelData) {
        assumeFalse(true); // Do nothing !!
        
        assumeTrue(est.hasNoEsterelType) // skip if program includes esterel type
        
        // Check all intermediate results
        val result = est.compile
        for (iResult : result.processorInstancesSequence) {
            val name = "intermediate result of transformation " + iResult.id
            
            assertNotNull("The %s is null".format(name), iResult.model)
            if (SCEstTransformation.SCL_ID.equals(iResult.id)) {
                assertTrue("Intermediate result of transformation " + iResult.id + " is not an SCL Program", iResult.model instanceof SCLProgram)
            } else {
                assertTrue("Intermediate result of transformation " + iResult.id + " is not a SCEst Program", iResult.model instanceof EsterelProgram)
            }

            try {
                // Serialize
                val outputStream = new ByteArrayOutputStream(25000);
                val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString + if (SCEstTransformation.SCL_ID.equals(iResult.id)) ".scl" else ".scest")
                val resourceSet = (if (SCEstTransformation.SCL_ID.equals(iResult.id)) sclInjector else scestInjector).getInstance(XtextResourceSet)
                
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
    
    /**
     * An EsterelProgram with a signal/sensor/variable with an Esterel type can not be transformed
     */
    private def boolean hasNoEsterelType(EsterelProgram est) {
        val signals = est.eAllContents.filter(Signal).toList
        for (s : signals) {
//            if ( s.idType !== null || (s.type != ValueType.PURE && (s.combineOperator === null || s.combineOperator == CombineOperator.NONE))) {
            if ( s.idType !== null ) {    
                return false
            }
        }
        val types = est.eAllContents.filter(TypeIdentifier).toList
        for (t : types) {
            if ( t.idType !== null || t.esterelType !== null) {
                return false
            }
        }
        return true
    }
    
    private var ArrayList<String> fails = new ArrayList => [
        it.add("esterel/legacy/various/test-multi4b.strl")
        it.add("esterel/legacy/various/test-ww.strl")
        it.add("esterel/legacy/various/test-p138.strl")
        it.add("esterel/legacy/various/test-run13.strl")
    ]
      
}
														