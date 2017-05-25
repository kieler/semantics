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

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.junit.Test
import de.cau.cs.kieler.sccharts.text.sct.SctRuntimeModule
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup

/**
 * Tests if all models can be parsed without errors.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SctParserTest extends AbstractXTextModelRepositoryTest<State> {
    
    /** Sct Parser Injector */
    static val resourceSetInjector = new SctStandaloneSetup().createInjectorAndDoEMFRegistration

    /**
     * Constructor
     */
    new() {
        super(resourceSetInjector)
    }
    
    //-----------------------------------------------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("sccharts")
    }
    
    @Test
    def void testParsing(State scc, TestModelData modelData) {
        assertTrue("The parsed model contains error markers: \n- " + scc.eResource.errors.map[message].join("\n- "), scc.eResource.errors.empty)
    }
      
}