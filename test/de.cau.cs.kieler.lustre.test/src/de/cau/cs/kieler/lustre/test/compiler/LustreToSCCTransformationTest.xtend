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
package de.cau.cs.kieler.lustre.test.compiler

import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.processors.lustreToScc.LustreToSCCharts
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
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
import de.cau.cs.kieler.lustre.LustreStandaloneSetup

/**
 * Tests if the Lustre to SCC dataflow transformation produces reasonable results.
 * 
 * @author lgr
 */
@RunWith(ModelsRepositoryTestRunner)
class LustreToSCCTransformationTest extends AbstractXTextModelRepositoryTest<LustreProgram> {
    
    /** Compiler configuration */
    val compilationSystemID = "de.cau.cs.kieler.lustre.scc.dataflow"
    
    /** Parser Injector */
    static val sctxInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
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
        && !modelData.modelProperties.contains("must-fail-validation")
    }
    
    @Test(timeout=20000)
    @StopOnFailure
    def void testCompilation(LustreProgram lus, TestModelData modelData) {

        // Check all intermediate results
        val context = lus.compile
        for (iResult : context.processorInstancesSequence) {
            assertNotNull("Intermediate result of transformation " + iResult.id + " is null", iResult.model)
            assertTrue("Intermediate result of transformation " + iResult.id + " is not a Lustre Program", iResult.model instanceof LustreProgram)

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
            
            // -- Check SCTX
            val sctxResult = context.processorInstancesSequence.findFirst[LustreToSCCharts.ID.equals(id)]
            
            // Create resource
            val uri = URI.createURI("dummy:/test/" + modelData.modelPath.fileName.toString + ".sctx")
            val resourceSet = sctxInjector.getInstance(XtextResourceSet)
            val resource = resourceSet.createResource(uri) as XtextResource
            resource.getContents().add(sctxResult.targetModel as SCCharts)
            
            // Check if validator marks no errors
            val validator = sctxInjector.getInstance(IResourceValidator)
            val validatorResults = validator.validate(lus.eResource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
            assertTrue("Intermediate result of transformation " + sctxResult.id + " contains validation error markers: \n- " + validatorResults.map[message].join("\n- "), validatorResults.empty)            
            
            // Serialize
            try {
                // Serialize
                val outputStream = new ByteArrayOutputStream(25000);
                resource.save(outputStream, saveOptions)
                
                assertTrue("Serialized %s is empty".format(sctxResult.id), outputStream.size > 0)
            } catch (AssertionError ae) {
                throw ae
            } catch (Exception e) {
                throw new Exception("Error while serializing %s caused by: %s".format(sctxResult.id, e.message), e)
            }
            
        }
    }
    
    //-----------------------------------------------------------------------------------------------------------------
    
    private def compile(LustreProgram est) {
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
                                                        