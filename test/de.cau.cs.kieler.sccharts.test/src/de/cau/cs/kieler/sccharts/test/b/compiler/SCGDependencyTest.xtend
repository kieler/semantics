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
import de.cau.cs.kieler.scg.SCGraphs

import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.annotations.registry.AnnotationsRegistry
import de.cau.cs.kieler.annotations.registry.AnnotationsType
import de.cau.cs.kieler.annotations.StringAnnotation

import static de.cau.cs.kieler.kexpressions.keffects.DataDependencyType.*
import static org.junit.Assert.*
import static org.junit.Assume.*
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions

/**
 * Tests if the new dependency analysis is as good as the old one.
 * 
 * @author ssm
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCGDependencyTest extends AbstractXTextModelRepositoryTest<SCCharts> {
    
    extension AnnotationsExtensions annotationExt = new AnnotationsExtensions
    
    public static val DEPENDENCY_TEST_ANNOTATION = AnnotationsRegistry.register("dependencies", AnnotationsType.SYSTEM, 
        StringAnnotation, SCCharts, "Annotates dependencies inside the model for testing purposes.")
        
    /** Compiler configuration */
    static val compilationSystemID = "de.cau.cs.kieler.sccharts.extended.core"
    static val scgTransformation = "de.cau.cs.kieler.sccharts.scg.processors.SCG"
    static val dependencyAnalysisV2 = "de.cau.cs.kieler.scg.processors.dependency"
    
    
    
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
        && !modelData.modelProperties.contains("known-to-fail") 
        && !modelData.modelProperties.contains("must-fail")
    }
    
    @Test(timeout=16000)
    def void testDependendcy(SCCharts scc, TestModelData modelData) {
        
        val annotationMap = <String, StringAnnotation> newHashMap
        val rootState = scc.rootStates.head
        for (annotation : rootState.getAnnotations(DEPENDENCY_TEST_ANNOTATION).filter(StringAnnotation)) {
            annotationMap.put(annotation.values.head, annotation)
        }
        
        for (t : #[WRITE_WRITE, WRITE_RELATIVEWRITE, WRITE_READ]) {
            assumeNotNull(annotationMap.get(t.toString))
        }
                    
        val context = scc.compile
        val dataDependencies = 
                (context.result.getModel as SCGraphs).scgs.head.nodes.map[ outgoingLinks ].flatten.
                filter(DataDependency).toList
        
        for (t : #[WRITE_WRITE, WRITE_RELATIVEWRITE, WRITE_READ]) {
            val ds = dataDependencies.filter[ type.equals(t) ].toList
            
            
            val annotation = annotationMap.get(t.toString) 
            try {
                val dCount = new Integer(annotation.values.get(1))
                val dConcurrent = new Integer(annotation.values.get(2))
                val dConfluent = new Integer(annotation.values.get(3))
                
                assertEquals("The overall count of class " + t.toString + " dependencies is wrong.", 
                    dCount, ds.size)
                assertEquals("The count of concurrent class " + t.toString + " dependencies is wrong.", 
                    dConcurrent, ds.filter[ concurrent ].size)
                assertEquals("The count of confluent class " + t.toString + " dependencies is wrong.", 
                    dConfluent, ds.filter[ confluent ].size)
            } catch (NumberFormatException e) {
                fail("The dependency annotation contains corrupt data. The dependency counts cannot be converted into a number.")
            }
        }
    }
    
    private def compile(SCCharts scc) {
        val context = Compile.createCompilationContext(compilationSystemID, scc, newArrayList(scgTransformation))
        context.startEnvironment.setProperty(Environment.INPLACE, false)
        context.compile
        
        val v2Context = Compile.createCompilationContext(
            CompilationSystem.createCompilationSystem("dep2", newArrayList(dependencyAnalysisV2)),
            context.result.model
        )
        v2Context.compile
        
        return v2Context
    }
    
}
								