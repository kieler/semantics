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
 * A specific implementation of the {@link IMeasuring} interface. The CompSpeedMeasuring class is
 * used to measure the time of a compilation in ms.
 * 
 * @author nfl
 */
public class CompSpeedMeasuring implements IMeasuring {

    /**
     * The identifier of the compiler used in the measuring.
     */
    private String compiler;

    /**
     * The identifier of the test case used in the measuring.
     */
    private String testcase;

    /**
     * The time of the compilation in ms.
     */
    private long time;

    /**
     * The constructor for a {@link CompSizeMeasuring} object.
     * 
     * @param compiler
     *            the identifier of the compiler used in the measuring
     * @param testcase
     *            the identifier of the test case used in the measuring
     * @param speed
     *            the time of the compilation in ms
     */
    public CompSpeedMeasuring(String compiler, String testcase, long speed) {
        this.compiler = compiler;
        this.testcase = testcase;
        this.time = speed;
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
     * Getter for the time of the compilation in ms.
     * 
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCriterion() {
        return "Compilation Speed (ms)";
    }

    /**
     * Setter for the identifier of the compiler used in the measuring.
     * 
     * @param compiler
     *            the compiler to set
     */
    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    /**
     * Setter for the identifier of the test case used in the measuring.
     * 
     * @param testcase
     *            the testcase to set
     */
    public void setTestcase(String testcase) {
        this.testcase = testcase;
    }

    /**
     * Setter for the time of the compilation in ms.
     * 
     * @param time
     *            the time to set
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMeasuringData() {
        return "" + time;
    }
}
