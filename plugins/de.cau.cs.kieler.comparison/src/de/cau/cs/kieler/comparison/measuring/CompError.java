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
 * A specific implementation of the {@link IMeasuring} interface. The CompError class is used to
 * measure errors thrown by compilers during a compilation.
 * 
 * @author nfl
 */
public class CompError implements IMeasuring {

    /**
     * The identifier of the compiler used in the measuring.
     */
    private String compiler;

    /**
     * The identifier of the test case used in the measuring.
     */
    private String testcase;

    /**
     * The error message thrown during the compilation.
     */
    private String message;

    /**
     * The constructor to create a {@link CompError} object.
     * 
     * @param compiler
     *            the identifier of the compiler used in the measuring
     * @param testcase
     *            the identifier of the test case used in the measuring
     * @param message
     *            the error message thrown during the compilation
     */
    public CompError(final String compiler, final String testcase, final String message) {
        this.compiler = compiler;
        this.testcase = testcase;
        this.message = message;
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
        return "Error Message";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMeasuringData() {
        return message;
    }

    /**
     * Getter for the error message thrown during the compilation.
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter for the error message thrown during the compilation.
     * 
     * @param message
     *            the message to set
     */
    public void setMessage(final String message) {
        this.message = message;
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
}
