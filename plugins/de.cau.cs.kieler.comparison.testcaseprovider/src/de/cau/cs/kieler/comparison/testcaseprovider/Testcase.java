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
import java.nio.file.Path;
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
    private Path path;
    private Collection<String> properties = new ArrayList<String>();
    private Collection<Path> dependencies = new ArrayList<Path>();
    
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
    public void setPath(Path path) {
        this.path = path;
    }

    /**
     * @param properties the properties to set
     */
    public void setProperties(Collection<String> properties) {
        this.properties = properties;
    }

    /**
     * @param dependencies the dependencies to set
     */
    public void setDependencies(Collection<Path> dependencies) {
        this.dependencies = dependencies;
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
    public Path getPath() {
        return path;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<String> getProperties() {
        return properties;
    }

    /**
     * {@inheritDoc}
     */
    public Collection<Path> getDependencies() {
        return dependencies;
    }

    /**
     * Creates a new Testcase without a Language from a csv String.
     * 
     * @param testcaseLine the test case encoded as comma separated values
     * @param testcaseLine 
     * @return null, if the csv string could not be parsed; the created test case otherwise
     */
    public static Testcase fromCsvString(File file, String testcaseLine) {

        if (testcaseLine == null || testcaseLine.isEmpty())
            return null;
        
        Testcase testcase = new Testcase();
        String[] values = testcaseLine.split(",");
        
        try {
            testcase.setPath(new File(file.getParent() + File.separator + values[0]).toPath());
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
