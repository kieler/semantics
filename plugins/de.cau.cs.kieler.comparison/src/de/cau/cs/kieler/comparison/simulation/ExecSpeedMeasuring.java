/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.simulation;

import de.cau.cs.kieler.comparison.measuring.IMeasuring;


/**
 * @author nfl
 *
 */
public class ExecSpeedMeasuring implements IMeasuring {

    private String compiler;
    private String testcase;
    private double speed;
    
    /**
     * 
     */
    public ExecSpeedMeasuring(String compiler, String testcase, double speed) {
        this.compiler = compiler;
        this.testcase = testcase;
        this.speed = speed;
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
     * 
     * @return
     */
    public double getSpeed(){
        return speed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCriteria() {
        return "Execution Speed (s)";
    }

    /**
     * @param compiler the compiler to set
     */
    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    /**
     * @param testcase the test case to set
     */
    public void setTestcase(String testcase) {
        this.testcase = testcase;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMeasuringData() {
        return ""+speed;
    }
}
