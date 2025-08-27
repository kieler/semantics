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
package de.cau.cs.kieler.sccharts.test.structure

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.sccharts.text.services.SCTXGrammarAccess
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.resource.XtextResource
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

/**
 * Tests if all reference in SCCharts are correctly linked.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsReferencesTest extends AbstractXTextModelRepositoryTest<SCCharts> {
    
    /** Sct Parser Injector */
    static val resourceSetInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    /** The SCCharts grammar */
    static val grammar = resourceSetInjector.getInstance(SCTXGrammarAccess)
    
    //-----------------------------------------------------------------------------------------------------------------
    
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
            && !modelData.modelProperties.contains("large")
            && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
            && !modelData.modelProperties.contains("must-fail")
    }
    
    @Test
    def void testReferences(SCCharts scc, TestModelData modelData) {
        val keyword = grammar.stateAccess.isKeyword_8_0_0
        for (res : scc.eResource.resourceSet.resources.filter(XtextResource)) {
            val parserNodes = res.parseResult.rootNode
            parserNodes.asTreeIterable.filter[
                grammarElement.eClass.equals(keyword.eClass)
                && (grammarElement as Keyword).value == keyword.value
                && semanticElement instanceof Scope
            ].forEach[
                assertTrue("Referenced state " + (semanticElement as Scope).name + " in " + res.getURI.segment(res.getURI.segmentCount - 1) + " cannot be resolved",
                    (semanticElement as Scope).reference.target !== null)
            ]
        }
    }
      
}
				