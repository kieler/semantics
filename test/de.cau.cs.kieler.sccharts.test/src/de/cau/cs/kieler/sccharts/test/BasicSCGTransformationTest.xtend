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
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.XMLResource
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

import static extension java.lang.String.format
import java.nio.channels.ShutdownChannelGroupException
import de.cau.cs.kieler.scg.SCGraph

/**
 * Tests if all intermediate results of an SCCharts normalization compilation fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class BasicSCGTransformationTest extends AbstractXTextModelRepositoryTest<State> {
    
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
                                    "SURFACEDEPTH",
                                    
                                    "scg.basic"         // SCG
                                    )
    
    //-----------------------------------------------------------------------------------------------------------------
    
    /** Sct Parser Injector */
    static val resourceSetInjector = new SctStandaloneSetup().createInjectorAndDoEMFRegistration
    
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
    }
    
    @Test(timeout=60000)
    def void testBasicSCGTransformation(State scc, TestModelData modelData) {
        // To SCG
        var result = scc.compile(transformations.join("!T_SIMULATIONVISUALIZATION, !T_ABORTWTO, T_", ", T_", "")[it])
        if (!result.postponedErrors.empty) {
            throw new Exception("Could not compile SCCharts model into SCGraph. Compilation error occurred!", result.postponedErrors.head)
        }
        
        var resultModel = result.getEObject()
        assertNotNull("Compilation result of SCG transformation is null", resultModel)
        assertTrue("Compilation result of SCG transformation is not an SCGraph", resultModel instanceof SCGraph)
        
        // Dependencies
        result = scc.compile("T_scg.dependencies")
        if (!result.postponedErrors.empty) {
            throw new Exception("Could not perform dependency analysis on SCGraph. Compilation error occurred!", result.postponedErrors.head)
        }
        
        resultModel = result.getEObject()
        assertNotNull("Compilation result of dependency analysis is null", resultModel)
        assertTrue("Compilation result of dependency analysis is not an SCGraph", resultModel instanceof SCGraph)
        
        // BasicBlocks
        result = scc.compile("T_scg.basicblock.sc")
        if (!result.postponedErrors.empty) {
            throw new Exception("Could not perform basic block analysis on SCGraph. Compilation error occurred!", result.postponedErrors.head)
        }
        
        resultModel = result.getEObject()
        assertNotNull("Compilation result of basic block analysis is null", resultModel)
        assertTrue("Compilation result of basic block analysis is not an SCGraph", resultModel instanceof SCGraph)               
    }
    
    //-----------------------------------------------------------------------------------------------------------------
    
    private def compile(State scc, String compileChain) {        
        // Compile with KiCo
        val context = new KielerCompilerContext(compileChain, scc)
        context.advancedSelect = false // Compilation has fixed chain (respecting dependencies)
        context.inplace = false // Save intermediate results
        return KielerCompiler.compile(context)
    }
      
}