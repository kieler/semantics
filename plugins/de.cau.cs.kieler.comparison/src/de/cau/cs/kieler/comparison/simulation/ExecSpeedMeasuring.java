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
package de.cau.cs.kieler.comparison.simulation;

import de.cau.cs.kieler.comparison.measuring.IMeasuring;

/**
 * A specific implementation of the {@link IMeasuring} interface. The ExecSpeedMeasuring class is
 * used to measure the time of a simulation of a compiled test case.
 * 
 * @author nfl
 */
public class ExecSpeedMeasuring implements IMeasuring {

    /**
     * The identifier of the compiler used in the measuring.
     */
    private String compiler;

    /**
     * The identifier of the test case used in the measuring.
     */
    private String testcase;

    /**
     * The execution time of the simulation.
     */
    private double speed;

    /**
     * The constructor for an {@link ExecSpeedMeasuring} object.
     * 
     * @param compiler
     *            the compiler used in the measuring
     * @param testcase
     *            the test case used in the measuring
     * @param time
     *            the time measured during the execution
     */
    public ExecSpeedMeasuring(final String compiler, final String testcase, final double time) {
        this.compiler = compiler;
        this.testcase = testcase;
        this.speed = time;
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
     * Getter for the execution time of the simulation.
     * 
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCriterion() {
        return "Execution Speed (s)";
    }

    /**
     * Setter for the identifier of the compiler used in the simulation.
     * 
     * @param compiler
     *            the compiler to set
     */
    public void setCompiler(final String compiler) {
        this.compiler = compiler;
    }

    /**
     * Setter for the identifier of the test case used in the simulation.
     * 
     * @param testcase
     *            the test case to set
     */
    public void setTestcase(final String testcase) {
        this.testcase = testcase;
    }

    /**
     * Setter for the execution time of the simulation.
     * 
     * @param speed
     *            the speed to set
     */
    public void setSpeed(final double speed) {
        this.speed = speed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMeasuringData() {
        return "" + speed;
    }
}
