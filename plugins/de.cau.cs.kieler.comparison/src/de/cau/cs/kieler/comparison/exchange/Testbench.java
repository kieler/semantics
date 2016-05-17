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
 * The Testbench class is used to communicate measurings regarding the same compiler, test case and
 * criterion.
 * 
 * @author nfl
 */
public class Testbench {

    /**
     * The identifier of the compiler used in the measurings.
     */
    private String compiler;

    /**
     * The identifier of the test case used in the measurings.
     */
    private String testcase;

    /**
     * The criterion used in the measurings.
     */
    private String criterion;

    /**
     * The collection of measurings.
     */
    private Collection<String> data;

    /**
     * The constructor for an empty {@link Testbench} object.
     */
    public Testbench() {
        data = new ArrayList<String>();
    }

    /**
     * Getter of the identifier of the compiler used in the measurings.
     * 
     * @return the compiler
     */
    public String getCompiler() {
        return compiler;
    }

    /**
     * Setter of the identifier of the compiler used in the measurings.
     * 
     * @param compiler
     *            the compiler to set
     */
    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    /**
     * Getter of the identifier of the test case used in the measurings.
     * 
     * @return the test case
     */
    public String getTestcase() {
        return testcase;
    }

    /**
     * Setter of the identifier of the test case used in the measurings.
     * 
     * @param testcase
     *            the test case to set
     */
    public void setTestcase(String testcase) {
        this.testcase = testcase;
    }

    /**
     * Getter of the criterion used in the measurings.
     * 
     * @return the criterion
     */
    public String getCriterion() {
        return criterion;
    }

    /**
     * Setter of the criterion used in the measurings.
     * 
     * @param criterion
     *            the criteria to set
     */
    public void setCriterion(String criterion) {
        this.criterion = criterion;
    }

    /**
     * Getter for the collection of measurings.
     * 
     * @return the measurings
     */
    public Collection<String> getData() {
        return data;
    }

    /**
     * Setter for the collection of measurings.
     * 
     * @param data
     *            the measurings to set
     */
    public void setData(Collection<String> data) {
        this.data = data;
    }
}
