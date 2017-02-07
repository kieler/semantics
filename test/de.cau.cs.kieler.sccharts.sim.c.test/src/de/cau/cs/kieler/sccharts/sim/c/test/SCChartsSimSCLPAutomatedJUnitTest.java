/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.sim.c.test;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

/**
 * @author lpe
 *
 */
public class SCChartsSimSCLPAutomatedJUnitTest extends SCChartsSimCAutomatedJUnitTest {

    /**
     * @param esoFile
     */
    public SCChartsSimSCLPAutomatedJUnitTest(IPath esoFile) {
        super(esoFile);
    }

    
    /**
     * {@inheritDoc}
     */
    protected String getTemporaryWorkspaceFolderName() {
        return "test-sccharts-sclp";
    }

    /**
     * {@inheritDoc}
     */
    protected String getExecutionFileName() {
        return "sccharts_sclp_validation_headless.execution";
    }
    
    /**
     * {@inheritDoc}
     */
    protected List<IPath> getBundleTestPaths() {
        List<IPath> paths = new ArrayList<IPath>();
        // First add tests that have to fail. These are used to test the tests themself.
//        paths.add(new Path("/testdata-must-fail/"));
        // Add basic tests. These test core features like states, transitions and hierarchy as well as variable types and operators.
        paths.add(new Path("/testdata-basics/"));
        // Add simple tests
        paths.add(new Path("/testdata-simple/"));
        // Add tests that are based on cmot's diss (cmot-diss > images > sccharts > features)
//        paths.add(new Path("/testdata-cmot-diss/simple/"));
//        paths.add(new Path("/testdata-cmot-diss/complex/"));
//        paths.add(new Path("/testdata-cmot-diss/composite/"));
        // Add more complex tests
//        paths.add(new Path("/knowntofail/"));
        //paths.add(new Path("/testdata-priority/"));
        return paths;
    }
    
}
