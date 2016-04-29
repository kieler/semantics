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

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import de.cau.cs.kieler.comparison.core.ITestcase;
import de.cau.cs.kieler.comparison.core.ITestcaseProvider;
import de.cau.cs.kieler.comparison.core.Language;

/**
 * @author nfl
 *
 */
public class ESOTestcaseProvider implements ITestcaseProvider {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return "ESO Testcase Provider";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getExtension() {
        return ".eso";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<ITestcase> createTestcases(File file) {
        String filePath = file.getPath();
        String fileWithoutExtension = filePath.substring(0, filePath.lastIndexOf(getExtension()));
        ArrayList<ITestcase> ret = new ArrayList<ITestcase>();
        // ESO files are used for SCCharts as well as Esterel

        File testFile = new File(fileWithoutExtension + ".sct");
        if (testFile.exists()) {
            Testcase newTest = new Testcase();
            newTest.setLanguage(Language.SCCharts);
            newTest.setPath(testFile.toPath());
            newTest.setTestTrace(file.toPath());
            newTest.setID(testFile.getName());
            ret.add(newTest);
        }

        testFile = new File(fileWithoutExtension + ".strl");
        if (testFile.exists()) {
            Testcase newTest = new Testcase();
            newTest.setLanguage(Language.Esterel);
            newTest.setPath(testFile.toPath());
            newTest.setTestTrace(file.toPath());
            newTest.setID(testFile.getName());
            ret.add(newTest);
        }

        return ret;
    }

}
