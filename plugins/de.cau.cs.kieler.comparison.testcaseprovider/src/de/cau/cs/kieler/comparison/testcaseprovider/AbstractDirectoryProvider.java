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

import java.util.ArrayList;
import java.util.Collection;

import de.cau.cs.kieler.comparison.core.ITestcase;
import de.cau.cs.kieler.comparison.core.ITestcaseProvider;
import de.cau.cs.kieler.comparison.core.LanguageProperties;

/**
 * @author nfl
 *
 */
public abstract class AbstractDirectoryProvider implements ITestcaseProvider {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return "Directory Testcase Provider";
    }
    
    /**
     * 
     * {@inheritDoc}
     */
    public Collection<ITestcase> createTestcase(String filePath) {
        Collection<ITestcase> ret = new ArrayList<ITestcase>();
        Testcase testcase = new Testcase();
        testcase.setTestcase(filePath);

        Collection<String> allProps = LanguageProperties.getAllProperties();
        // TODO platform compatibility
        String[] splits = filePath.split("/");
        Collection<String> properties = new ArrayList<String>();
        for (String folder : splits)
        {
            for (String prop : allProps) {
                if (prop.toLowerCase().equals(folder.toLowerCase())) {
                    properties.add(prop.toLowerCase());
                    break;
                }
            }
            int index = folder.length() - getExtension().length();
            if (0 <= index && index < folder.length() && folder.substring(index).equals(getExtension()))
                testcase.setID(folder);
        }
        testcase.setProperties(properties);
        ret.add(testcase);
        return ret;
    }

}
