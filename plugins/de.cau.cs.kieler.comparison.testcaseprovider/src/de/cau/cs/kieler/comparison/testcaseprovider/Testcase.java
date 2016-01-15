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
import de.cau.cs.kieler.comparison.core.Language;

/**
 * @author nfl
 *
 */
public class Testcase implements ITestcase {

    private String id;
    private Language language;
    private String testcase;
    private Collection<String> properties = new ArrayList<String>();
    
    /**
     * @param id the id to set
     */
    public void setID(String id) {
        this.id = id;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * @param testcase the test case to set
     */
    public void setTestcase(String testcase) {
        this.testcase = testcase;
    }

    /**
     * @param properties the properties to set
     */
    public void setProperties(Collection<String> properties) {
        this.properties = properties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language getLanguage() {
        return language;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTestcase() {
        return testcase;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<String> getProperties() {
        return properties;
    }

    /**
     * Creates a new Testcase without a Language from a csv String.
     * 
     * @param testcaseLine the test case encoded as comma separated values
     * @param testcaseLine 
     * @return null, if the csv string could not be parsed; the created test case otherwise
     */
    public static Testcase fromCsvString(String filePath, String testcaseLine) {

        if (testcaseLine == null || testcaseLine.isEmpty())
            return null;
        
        Testcase testcase = new Testcase();
        String[] values = testcaseLine.split(",");
        
        try {
            // TODO relative path
            testcase.setTestcase(filePath + File.separator + values[0]);
            testcase.setID(values[1]);
            Collection<String> props = new ArrayList<String>();
            for (int i = 2; i < values.length; i++) {
                props.add(values[i]);
            }
            testcase.setProperties(props);            
        } catch (IndexOutOfBoundsException e) {
            // parsing the csv failed: return null
            return null;
        }
        
        return testcase;
    }

}
