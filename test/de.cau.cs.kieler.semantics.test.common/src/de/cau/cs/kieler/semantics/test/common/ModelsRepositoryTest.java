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
package de.cau.cs.kieler.semantics.test.common;

import static org.junit.Assert.*;

import org.junit.Test;

import de.cau.cs.kieler.semantics.test.common.runners.ModelsRepositoryTestRunner;

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
public class ModelsRepositoryTest {

    /**
     * Test method for {@link de.cau.cs.kieler.semantics.test.common.runners.ModelsRepositoryTestRunner#initModelsRepositoryIndex()}.
     */
    @Test
    public void testInitModelsRepositoryIndex() {
        ModelsRepositoryTestRunner.initModelsRepositoryIndex();
    }

}
