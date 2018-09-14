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
package de.cau.cs.kieler.sccharts.test.b.compiler

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
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration
import de.cau.cs.kieler.kexpressions.keffects.DataDependency

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
    private val compilationSystemID = "de.cau.cs.kieler.sccharts.extended.core"
    private val scgTransformation = "de.cau.cs.kieler.sccharts.scg.processors.SCG"
    private val dependencyAnalysisV1 = "de.cau.cs.kieler.scg.processors.dependency.v1"
    private val dependencyAnalysisV2 = "de.cau.cs.kieler.scg.processors.dependency"
    
    /** Sct Parser Injector */
    static val resourceSetInjector = SCTXStandaloneSetup.doSetup
    
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
        && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
        && !modelData.modelProperties.contains("must-fail")
        && !modelData.modelProperties.contains("less-v2-dependencies")
    }
    
    @Test(timeout=10000)
    def void testDependendcy(SCCharts scc, TestModelData modelData) {
        val result = scc.compile
        
        val v1Model = result.first.result.model
        val v2Model = result.second.result.model
        
        if (v1Model instanceof SCGraphs && v2Model instanceof SCGraphs) {
            val v1SCG = (v1Model as SCGraphs).scgs.head
            val v2SCG = (v2Model as SCGraphs).scgs.head
            
            val v1Dependencies = v1SCG.nodes.fold(0)[ a, b | a + b.outgoingLinks.filter(DataDependency).filter[ concurrent && !confluent ].size ]
            val v2Dependencies = v2SCG.nodes.fold(0)[ a, b | a + b.outgoingLinks.filter(DataDependency).filter[ concurrent && !confluent ].size ]
            
            if (v2Dependencies < v1Dependencies) {
                val userDefinedSchedules = (v2Model as SCGraphs).scgs.map[ declarations ].flatten.filter(ScheduleDeclaration).toList.size
                if (userDefinedSchedules == 0) { 
                    fail("The V2 dependency analysis found fewer concurrent, non-confluent dependencies than the V1 dependency analysis." + 
                        " [ " + v2Dependencies + " < " + v1Dependencies + " ]")
                }                
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
								