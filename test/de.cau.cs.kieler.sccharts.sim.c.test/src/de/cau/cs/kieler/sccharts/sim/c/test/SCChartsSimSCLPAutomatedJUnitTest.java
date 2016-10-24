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

import org.eclipse.core.runtime.IPath;

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
    
}
