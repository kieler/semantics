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
package de.cau.cs.kieler.comparison.measuring;

/**
 * A specific implementation of the {@link IMeasuring} interface. The CompLoCMeasuring class is used
 * to measure the size of a compilation by lines of code.
 * 
 * @author nfl
 */
public class CompLoCMeasuring implements IMeasuring {

    /**
     * The identifier of the compiler used in the measuring.
     */
    private String compiler;

    /**
     * The identifier of the test case used in the measuring.
     */
    private String testcase;

    /**
     * The amount of lines of code.
     */
    private int size;

    /**
     * The constructor for a {@link CompLoCMeasuring} object.
     * 
     * @param compiler
     *            the identifier of the compiler used in the measuring
     * @param testcase
     *            the identifier of the test case used in the measuring
     * @param size
     *            the amount of lines of code
     */
    public CompLoCMeasuring(final String compiler, final String testcase, final int size) {
        this.compiler = compiler;
        this.testcase = testcase;
        this.setSize(size);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCompiler() {
        return compiler;
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
    public String getCriterion() {
        return "Compilation Size (LoC)";
    }

    /**
     * Setter for the identifier of the compiler used in the measuring.
     * 
     * @param compiler
     *            the compiler to set
     */
    public void setCompiler(final String compiler) {
        this.compiler = compiler;
    }

    /**
     * Setter for the identifier of the test case used in the measuring.
     * 
     * @param testcase
     *            the test case to set
     */
    public void setTestcase(final String testcase) {
        this.testcase = testcase;
    }

    /**
     * Getter for the amount of lines of code.
     * 
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Setter for the amount of lines of code.
     * 
     * @param size
     *            the size to set
     */
    public void setSize(final int size) {
        this.size = size;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMeasuringData() {
        return "" + size;
    }
}
