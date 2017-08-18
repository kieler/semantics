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
import org.junit.Test
import org.junit.runner.RunWith
import de.cau.cs.kieler.kicool.compilation.CompilationSystem
import de.cau.cs.kieler.core.model.Pair
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.scg.SCGraphs

import static org.junit.Assert.*
import de.cau.cs.kieler.scg.DataDependency

/**
 * Tests if the new dependency analysis is as good as the old one.
 * 
 * @author ssm
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCGDependencyTest extends AbstractXTextModelRepositoryTest<SCCharts> {
    
    /** Compiler configuration */
    private val compilationSystemID = "de.cau.cs.kieler.sccharts.extended.core.simple"
    private val scgTransformation = "de.cau.cs.kieler.sccharts.scg.processors.transformators.SCG"
    private val dependencyAnalysisV1 = "de.cau.cs.kieler.scg.processors.transformators.dependency.v1"
    private val dependencyAnalysisV2 = "de.cau.cs.kieler.scg.processors.transformators.dependency"
    
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
        return modelData.modelProperties.contains("scchartsX")
        && !modelData.additionalProperties.containsKey("testSerializability")
        && !modelData.modelProperties.contains("must-fail")
    }
    
    @Test //(timeout=60000)
    def void testDependendcy(SCCharts scc, TestModelData modelData) {
        val result = scc.compile
        
        val v1Model = result.first.result.model
        val v2Model = result.second.result.model
        
        if (v1Model instanceof SCGraphs && v2Model instanceof SCGraphs) {
            val v1SCG = (v1Model as SCGraphs).scgs.head
            val v2SCG = (v2Model as SCGraphs).scgs.head
            
            val v1Dependencies = v1SCG.nodes.fold(0)[ a, b | a + b.dependencies.filter(DataDependency).filter[ concurrent && !confluent ].size ]
            val v2Dependencies = v2SCG.nodes.fold(0)[ a, b | a + b.dependencies.filter(DataDependency).filter[ concurrent && !confluent ].size ]
            
            if (v2Dependencies < v1Dependencies) {
                fail("The V2 dependency analysis found fewer concurrent, non-confluent dependencies than the V1 dependencies." + 
                    " [ " + v2Dependencies + " < " + v1Dependencies + " ]")                
            }
        }
    }
    
    private def compile(SCCharts scc) {
        val context = Compile.createCompilationContext(compilationSystemID, scc, newArrayList(scgTransformation))
        context.startEnvironment.setProperty(Environment.INPLACE, false)
        context.compile
        
        val v1Context = Compile.createCompilationContext(
            CompilationSystem.createCompilationSystem("dep1", newArrayList(dependencyAnalysisV1)),
            context.result.model
        )
        v1Context.compile
        
        val v2Context = Compile.createCompilationContext(
            CompilationSystem.createCompilationSystem("dep2", newArrayList(dependencyAnalysisV2)),
            context.result.model
        )
        v2Context.compile
        
        return new Pair<CompilationContext, CompilationContext>(v1Context, v2Context)
    }
    
}