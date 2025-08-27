/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.sc.test;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;

/**
 * The test plugin for regression testing the s-sc-simulator.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
public class SSimSCAutomatedJUnitTest extends KiemAutomatedJUnitTest {

    /**
     * Instantiates a new S-SC simulation test.
     * 
     * @param esoFile
     *            the ESO file
     */
    public SSimSCAutomatedJUnitTest(final IPath esoFile) {
        super(esoFile);
    }

    /**
     * {@inheritDoc}
     */
    protected String getPluginId() {
        return "de.cau.cs.kieler.s.sim.sc.test";
    }

    /**
     * {@inheritDoc}
     */
    protected IPath getBundleTestPath() {
        return new Path("testdata");
    }

    /**
     * {@inheritDoc}
     */
    protected IPath getExternalRelativeTestPath() {
        return new Path("../../../models/s/validation");
    }

    /**
     * {@inheritDoc}
     */
    protected String getModelFileExtension() {
        return "s";
    }

    /**
     * {@inheritDoc}
     */
    protected String getTemporaryWorkspaceFolderName() {
        return "test-s";
    }

    /**
     * {@inheritDoc}
     */
    protected String getExecutionFileName() {
        return "s_sc_validation_headless.execution";
    }
}
