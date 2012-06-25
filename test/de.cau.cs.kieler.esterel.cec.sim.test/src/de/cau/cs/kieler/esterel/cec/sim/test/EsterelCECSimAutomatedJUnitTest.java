/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.cec.sim.test;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;

/**
 * The test plugin for regression testing the Esterel-CEC-simulator.
 * 
 * @author cmot
 */
public class EsterelCECSimAutomatedJUnitTest extends KiemAutomatedJUnitTest {

    /**
     * Instantiates a new Esterel-CEC simulation test.
     *
     * @param esoFile the ESO file
     */
    public EsterelCECSimAutomatedJUnitTest(final IPath esoFile) {
        super(esoFile);
    }

    /**
     * {@inheritDoc}
     */
    protected String getPluginId() {
        return "de.cau.cs.kieler.esterel.cec.sim.test";
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
    protected String getModelFileExtension() {
        return "strl";
    }

    /**
     * {@inheritDoc}
     */
    protected String getTemporaryWorkspaceFolderName() {
        return "test-esterel";
    }

    /**
     * {@inheritDoc}
     */
    protected String getExecutionFileName() {
        return "esterel_validation_headless.execution";
    }
}
