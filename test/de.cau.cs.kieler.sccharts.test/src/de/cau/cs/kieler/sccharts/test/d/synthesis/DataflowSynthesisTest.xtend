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
package de.cau.cs.kieler.sccharts.test.d.synthesis

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.junit.Test
import org.junit.runner.RunWith
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.kgraph.KNode

import static org.junit.Assert.*
import static org.junit.Assume.*

/**
 * Tests if the new dependency analysis is as good as the old one.
 * 
 * @author ssm
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class DataflowSynthesisTest extends AbstractXTextModelRepositoryTest<SCCharts> {
    
    /** Sct Parser Injector */
    static val resourceSetInjector = SCTXStandaloneSetup.doSetup()
    
    extension AnnotationsExtensions annotationsExtensions= new AnnotationsExtensions
    
    val ANNOTATION_KNODES = "knodes"
    val ANNOTATION_KEDGES = "kedges"
    val KNODE_BASE_COUNT = 2
    val KEDGE_BASE_COUNT = 0
    
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
        return modelData.modelProperties.contains("dataflow")
    }
    
    @Test(timeout=10000)
    def void testDataflowSynthesis(SCCharts scc, TestModelData modelData) {
//        assumeFalse(true)
        
        for (rootState : scc.rootStates) {
            val kNodesStr = rootState.getStringAnnotationValue(ANNOTATION_KNODES)
            val kEdgesStr = rootState.getStringAnnotationValue(ANNOTATION_KEDGES)
            var int knodes
            var int kedges
            try {
                knodes = if (kNodesStr.nullOrEmpty) -1 else Integer.parseInt(kNodesStr)
                kedges = if (kEdgesStr.nullOrEmpty) -1 else Integer.parseInt(kEdgesStr)
            } catch (NumberFormatException e) {
                fail("The model contains information about the synthesis, but the format it unknown. Nodes: " + kNodesStr + ", Edges: " + kEdgesStr)                
            }
            
            if (knodes == -1 && kedges == -1) return;
            if (knodes > -1) knodes += KNODE_BASE_COUNT
            if (kedges > -1) kedges += KEDGE_BASE_COUNT
            
            val viewContext = scc.invokeSynthesis
            var nodes = 0
            var edges = 0
            for (node : viewContext.viewModel.eAllContents.filter(KNode).toIterable) {
                nodes++
                edges += node.outgoingEdges.size
            }
            
            if (knodes > -1 && nodes != knodes) {
                fail("The synthesized number of knodes is not equal to the expected count of knodes. Synthesized: " 
                    + nodes + ", Expected: " + knodes + " (base count: " + KNODE_BASE_COUNT + ")")
            }
            if (kedges > -1 && edges != kedges) {
                fail("The synthesized number of kedges is not equal to the expected count of knodes. Synthesized: " 
                    + edges + ", Expected: " + kedges + " (base count: " + KEDGE_BASE_COUNT + ")")
            }
        }
    }
    
    protected def ViewContext invokeSynthesis(SCCharts scc) {
        LightDiagramServices.translateModel2(scc, null)
    }
}
								