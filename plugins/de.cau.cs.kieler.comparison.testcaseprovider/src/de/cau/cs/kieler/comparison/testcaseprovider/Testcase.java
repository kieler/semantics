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
 * The Testcase is used as realization of the {@link ITestcase} interface implementing the getter
 * required by the interface as well as setter methods.
 * 
 * @author nfl
 */
public class Testcase implements ITestcase {

    private String id;
    private Language language;
    private Path path;
    private Collection<String> properties = new ArrayList<String>();
    private Collection<Path> dependencies = new ArrayList<Path>();
    private Path testTrace;

    /**
     * The setter for the identification String of this test case.
     * 
     * @param id
     *            the id to set
     */
    public void setID(final String id) {
        this.id = id;
    }

    /**
     * The setter for the language of this test case.
     * 
     * @param language
     *            the language to set
     */
    public void setLanguage(final Language language) {
        this.language = language;
    }

    /**
     * The setter for the file path of this test case.
     * 
     * @param path
     *            the path case to set
     */
    public void setPath(final Path path) {
        this.path = path;
    }

    /**
     * The setter for the collection of properties of this test case.
     * 
     * @param properties
     *            the properties to set
     */
    public void setProperties(final Collection<String> properties) {
        this.properties = properties;
    }

    /**
     * The setter for the collection of dependencies of this test case.
     * 
     * @param dependencies
     *            the dependencies to set
     */
    public void setDependencies(final Collection<Path> dependencies) {
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
     * @param file
     *            the file path of the test case encoded as comma separated values
     * @param testcaseLine
     *            a single line of comma separated values
     * @return null, if the csv string could not be parsed; the created test case otherwise
     */
    public static Testcase fromCsvString(final File file, final String testcaseLine) {

        if (testcaseLine == null || testcaseLine.isEmpty()) {
            return null;
        }

        Testcase testcase = new Testcase();
        String[] values = testcaseLine.split(",");

        // testcase encoded as: filePath, ID, properties[..]
        // TODO add dependencies and testTrace support, maybe per header line with field names
        try {
            testcase.setPath(new File(file.getParent() + File.separator + values[0]).toPath());
            testcase.setID(testcase.getPath().toString());
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

    /**
     * {@inheritDoc}
     */
    @Override
    public Path getTestTrace() {
        return testTrace;
    }

    /**
     * {@inheritDoc}
     */
    public void setTestTrace(final Path testTrace) {
        this.testTrace = testTrace;
    }
}
