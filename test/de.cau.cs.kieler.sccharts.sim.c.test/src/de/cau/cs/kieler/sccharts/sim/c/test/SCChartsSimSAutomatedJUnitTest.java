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
package de.cau.cs.kieler.sccharts.sim.c.test;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;

/**
 * The test plugin for regression testing the SyncCharts-s-simulator.
 *
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
public class SCChartsSimSAutomatedJUnitTest extends KiemAutomatedJUnitTest {

    /**
     * Instantiates a new simulation test.
     *
     * @param esoFile the ESO file
     */
    public SCChartsSimSAutomatedJUnitTest(final IPath esoFile) {
        super(esoFile);
    }

    /**
     * {@inheritDoc}
     */
    protected String getPluginId() {
        return "de.cau.cs.kieler.sccharts.sim.c.test";
    }

    /**
     * {@inheritDoc}
     */
    protected IPath getBundleTestPath() {
//        return new Path("knowntofail");
        return new Path("testdata");
//        return new Path("inprogress");
    }

    /**
     * {@inheritDoc}
     */
    protected String getModelFileExtension() {
        return "sct";
    }

    /**
     * {@inheritDoc}
     */
    protected String getTemporaryWorkspaceFolderName() {
        return "test-sccharts-c";
    }

    /**
     * {@inheritDoc}
     */
    protected String getExecutionFileName() {
        return "sccharts_c_validation_headless.execution";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected IPath getExternalRelativeTestPath() {
        return null;
        //return new Path("../../../models/sccharts/validation");
    }
}
