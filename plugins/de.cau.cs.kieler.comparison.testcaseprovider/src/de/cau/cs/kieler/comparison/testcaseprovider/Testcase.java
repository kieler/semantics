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
     * @param testcase the testcase to set
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

}
