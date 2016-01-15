/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.testcaseprovider;

import java.util.Collection;

import de.cau.cs.kieler.comparison.core.ITestcase;
import de.cau.cs.kieler.comparison.core.Language;

/**
 * @author nfl
 *
 */
public class SctDirectoryProvider extends AbstractDirectoryProvider {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getExtension() {
        return ".sct";
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return super.getID() + " - SCCharts";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<ITestcase> createTestcases(String path, String name) {
        Collection<ITestcase> testcases = super.createTestcase(path, name);
        for (ITestcase testcase : testcases) {
            if (testcase instanceof Testcase)
            ((Testcase)testcase).setLanguage(Language.SCCharts);
        }
        return testcases;
    }
}
