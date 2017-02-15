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
package de.cau.cs.kieler.esterel.sim.c.test;

import java.util.ArrayList;
import java.util.List;

import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

/**
 * @author aas
 *
 */
public class EsterelSimCTest extends KiemAutomatedJUnitTest {
    
    public EsterelSimCTest(IPath esoFile) {
        super(esoFile);
    }
    
    @Override
    protected IPath getBundleTestPath() {
        return null;
    }
    
    @Override
    protected List<IPath> getBundleTestPaths() {
        List<IPath> paths = new ArrayList<IPath>();
        // Load configuration (execution file) from this folder
        paths.add(new Path("/testdata-config/"));
        // First add tests that have to fail. These are used to test the tests themself.
        paths.add(new Path("/testdata-must-fail/"));
        // Add tests for kernel statements
        paths.add(new Path("/testdata-kernel/"));
        // Add tests for simple language constructs such as sustain and await.
        paths.add(new Path("/testdata-simple/"));
        // Add tests for more complex language constructs.
        paths.add(new Path("/testdata-complex/"));
        return paths;
    }
    
    @Override
    protected String getExecutionFileName() {
        return "esterel_c_validation_headless.execution";
    }
    
    @Override
    protected IPath getExternalRelativeTestPath() {
        return null;
    }
    
    @Override
    protected String getModelFileExtension() {
        return "strl";
    }
    
    @Override
    protected String getPluginId() {
        return "de.cau.cs.kieler.esterel.sim.c.test";
    }
    
    @Override
    protected String getTemporaryWorkspaceFolderName() {
        return "test-esterel-c";
    }
}