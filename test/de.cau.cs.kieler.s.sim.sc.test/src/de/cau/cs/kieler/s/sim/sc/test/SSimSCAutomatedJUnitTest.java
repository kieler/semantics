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
package de.cau.cs.kieler.s.sim.sc.test;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;

/**
 * The test plugin for regression testing the s-sc-simulator.
 * 
 * @author cmot
 */
public class SSimSCAutomatedJUnitTest extends KiemAutomatedJUnitTest {

    /**
     * {@inheritDoc}
     */
    protected String getPluginId() {
        return SSimSCTestPlugin.PLUGIN_ID;
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
        return "automated.execution";
    }
}
