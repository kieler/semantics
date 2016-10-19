/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.sim.c.test;

import java.util.ArrayList;
import java.util.List;

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
public class SCChartsSimCAutomatedJUnitTest extends KiemAutomatedJUnitTest {

    /**
     * Instantiates a new simulation test.
     *
     * @param esoFile the ESO file
     */
    public SCChartsSimCAutomatedJUnitTest(final IPath esoFile) {
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
        return null;
//        return new Path("knowntofail");
//        return new Path("testdata");
//        return new Path("inprogress");
    }
    
    /**
     * {@inheritDoc}
     */
    protected List<IPath> getBundleTestPaths() {
        List<IPath> paths = new ArrayList<IPath>();
        // First add tests that have to fail. These are used to test the tests themself.
        paths.add(new Path("/testdata-must-fail/"));
        // Add basic tests. These test core features like states, transitions and hierarchy as well as variable types and operators.
//        paths.add(new Path("/testdata-basics/"));
        // Add simple tests
        paths.add(new Path("/testdata-simple/"));
        // Add tests that are based on the cmot's diss (cmot-diss > images > sccharts > features)
//        paths.add(new Path("/testdata-cmot-diss/simple/"));
//        paths.add(new Path("/testdata-cmot-diss/complex/"));
//        paths.add(new Path("/testdata-cmot-diss/composite/"));
        // Add more complex tests
        paths.add(new Path("/testdata-advanced/"));
        return paths;
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

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean stopOnError() {
        return true;
    }
}
