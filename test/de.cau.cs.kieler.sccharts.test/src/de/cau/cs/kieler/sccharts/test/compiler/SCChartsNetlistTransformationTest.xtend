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

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGValidationExtensions
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import java.io.PrintWriter
import java.io.StringWriter
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

/**
 * Tests if all intermediate results of an SCCharts normalization compilation fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsNetlistTransformationTest extends AbstractXTextModelRepositoryTest<SCCharts> {
    
    @Inject extension SCGValidationExtensions
        
    /** Compiler configuration */
    val compilationSystemID = "de.cau.cs.kieler.sccharts.netlist"
    
    //-----------------------------------------------------------------------------------------------------------------
    
    /** Sct Parser Injector */
    static val resourceSetInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    
    /**
     * Constructor
     */
    new() {
        super(resourceSetInjector)
        Guice.createInjector().injectMembers(this)
    }
    
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("sccharts")
        && !modelData.modelProperties.contains("large")
        && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
        && !modelData.modelProperties.contains("must-fail")
        && !modelData.modelProperties.contains("not-sasc")
        && !modelData.modelProperties.contains("not-asc")
        && !modelData.modelProperties.contains("netlist-fails")
        && !modelData.modelProperties.contains("issues") // since most models focus on grammar/modeling issues rather than compiling
    }
    
    @Test(timeout=60000)
    def void testNetlistTransformation(SCCharts scc, TestModelData modelData) {
        // Check all intermediate results
        val context = scc.compile
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
    }
    
    @Test(timeout=60000)
    def void testGuardDefUse(SCCharts scc, TestModelData modelData) {
        val context = scc.compile
        val seqSCGProcessor = context.processorInstancesSequence.get(context.processorInstancesSequence.size - 2)
        assertTrue("The compilation result of the netlist-based compilation should be a sequentialized SCG.", 
            seqSCGProcessor.targetModel instanceof SCGraphs
        );
        val seqSCG = seqSCGProcessor.targetModel as SCGraphs
        val variableStore = VariableStore.getVariableStore(seqSCGProcessor.environment)
        
        val invalidGuards = (seqSCG as SCGraphs).scgs.head.invalidDefUseGuards(variableStore)
        if (!invalidGuards.empty) {
            fail("The following guards are used before assigned: " + invalidGuards.map[name].join(" "))
        }
    }
    
    //-----------------------------------------------------------------------------------------------------------------
    
    private def compile(SCCharts scc) {        
        val context = Compile.createCompilationContext(compilationSystemID, scc)
        context.startEnvironment.setProperty(Environment.INPLACE, false)
        context.processorInstances.findFirst[id.equals("de.cau.cs.kieler.scg.processors.codegen.c")]?.environment.setProperty(Environment.CANCEL_COMPILATION, true)

        context.compile
        
        return context
    }
    
}
