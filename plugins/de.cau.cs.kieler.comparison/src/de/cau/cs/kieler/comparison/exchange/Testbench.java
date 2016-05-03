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
package de.cau.cs.kieler.comparison.exchange;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author nfl
 *
 */
public class Testbench {

    private String compiler;
    private String testcase;
    private String criteria; 
    private Collection<String> data;   
    
    /**
     * 
     */
    public Testbench() {
        data = new ArrayList<String>();
    }

    /**
     * @return the compiler
     */
    public String getCompiler() {
        return compiler;
    }

    /**
     * @param compiler the compiler to set
     */
    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    /**
     * @return the testcase
     */
    public String getTestcase() {
        return testcase;
    }

    /**
     * @param testcase the testcase to set
     */
    public void setTestcase(String testcase) {
        this.testcase = testcase;
    }

    /**
     * @return the criteria
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * @param criteria the criteria to set
     */
    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    /**
     * @return the data
     */
    public Collection<String> getData() {
        return data;
    }
    
    /**
     * 
     * @param data the data to set
     */
    public void setData(Collection<String> data) {
        this.data = data;
    }
}
