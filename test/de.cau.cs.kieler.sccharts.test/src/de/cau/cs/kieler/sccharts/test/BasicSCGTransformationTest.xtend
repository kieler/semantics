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

import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.eclipse.emf.ecore.EObject
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Tests if all intermediate results of an SCCharts normalization compilation fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class BasicSCGTransformationTest extends AbstractXTextModelRepositoryTest<SCCharts> {
    
    /** Compiler configuration */
    private val compilationSystemID = "de.cau.cs.kieler.sccharts.extended.simple"
    
    //-----------------------------------------------------------------------------------------------------------------
    
    /** Sct Parser Injector */
    static val resourceSetInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    
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
    def void testBasicSCGTransformation(SCCharts scc, TestModelData modelData) {
//        // To SCG
//        var result = scc.compile(transformations.join("!T_SIMULATIONVISUALIZATION, !T_ABORTWTO, T_", ", T_", "")[it])
//        if (!result.postponedErrors.empty) {
//            throw new Exception("Could not compile SCCharts model into SCGraph. Compilation error occurred!", result.postponedErrors.head)
//        }
//        
//        var resultModel = result.getEObject()
//        assertNotNull("Compilation result of SCG transformation is null", resultModel)
//        assertTrue("Compilation result of SCG transformation is not an SCGraph", resultModel instanceof SCGraph)
//        
//        // Dependencies
//        result = resultModel.compile("T_scg.dependency")
//        if (!result.postponedErrors.empty) {
//            throw new Exception("Could not perform dependency analysis on SCGraph. Compilation error occurred!", result.postponedErrors.head)
//        }
//        
//        resultModel = result.getEObject()
//        assertNotNull("Compilation result of dependency analysis is null", resultModel)
//        assertTrue("Compilation result of dependency analysis is not an SCGraph", resultModel instanceof SCGraph)
//        
//        // BasicBlocks
//        result = resultModel.compile("T_scg.basicblock.sc")
//        if (!result.postponedErrors.empty) {
//            throw new Exception("Could not perform basic block analysis on SCGraph. Compilation error occurred!", result.postponedErrors.head)
//        }
//        
//        resultModel = result.getEObject()
//        assertNotNull("Compilation result of basic block analysis is null", resultModel)
//        assertTrue("Compilation result of basic block analysis is not an SCGraph", resultModel instanceof SCGraph)               
    }
    
    //-----------------------------------------------------------------------------------------------------------------
    
    private def compile(SCCharts scc) {        
        val context = Compile.createCompilationContext(compilationSystemID, scc)
        context.startEnvironment.setProperty(Environment.INPLACE, false)

        context.compile
        
        return context
    }
      
}