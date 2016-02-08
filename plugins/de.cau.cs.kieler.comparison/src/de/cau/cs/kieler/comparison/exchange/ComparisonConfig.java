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
package de.cau.cs.kieler.comparison.exchange;

import java.util.ArrayList;
import java.util.Collection;

import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.ITestcase;

/**
 * @author nfl
 *
 */
public class ComparisonConfig {

    private Collection<ICompiler> compilers;
    private Collection<ITestcase> testcases;

    private boolean compareCompSpeed = false;
    private IMeasuringParameters compareCompParameters;
    private boolean compareExecSpeed = false;
    private int compareExecSpeedAmount = 1;
    private boolean compareCompSize = false;

    private String outputPath;

    /**
     * @return the compilers
     */
    public Collection<ICompiler> getCompilers() {
        if (compilers == null)
            compilers = new ArrayList<ICompiler>();
        return compilers;
    }

    /**
     * @param compilers
     *            the compilers to set
     */
    public void setCompilers(Collection<ICompiler> compilers) {
        this.compilers = compilers;
    }

    /**
     * @return the test cases
     */
    public Collection<ITestcase> getTestcases() {
        if (testcases == null)
            testcases = new ArrayList<ITestcase>();
        return testcases;
    }

    /**
     * @param testcases
     *            the test cases to set
     */
    public void setTestcases(Collection<ITestcase> testcases) {
        this.testcases = testcases;
    }

    /**
     * @return the compareCompSpeed
     */
    public boolean compareCompSpeed() {
        return compareCompSpeed;
    }

    /**
     * @param compareCompSpeed
     *            the compareCompSpeed to set
     */
    public void setCompareCompSpeed(boolean compareCompSpeed) {
        this.compareCompSpeed = compareCompSpeed;
    }

    /**
     * @return the compareCompSpeedAmount
     */
    public IMeasuringParameters getCompareCompParameters() {
        return compareCompParameters;
    }

    /**
     * @param compareCompSpeedAmount
     *            the compareCompSpeedAmount to set
     */
    public void setCompareCompParameters(IMeasuringParameters compareCompParameters) {
        this.compareCompParameters = compareCompParameters;
    }

    /**
     * @return the compareExecSpeed
     */
    public boolean compareExecSpeed() {
        return compareExecSpeed;
    }

    /**
     * @param compareExecSpeed
     *            the compareExecSpeed to set
     */
    public void setCompareExecSpeed(boolean compareExecSpeed) {
        this.compareExecSpeed = compareExecSpeed;
    }

    /**
     * @return the compareExecSpeedAmount
     */
    public int getCompareExecSpeedAmount() {
        return compareExecSpeedAmount;
    }

    /**
     * @param compareExecSpeedAmount
     *            the compareExecSpeedAmount to set
     */
    public void setCompareExecSpeedAmount(int compareExecSpeedAmount) {
        this.compareExecSpeedAmount = compareExecSpeedAmount;
    }

    /**
     * @return the compareCompSize
     */
    public boolean compareCompSize() {
        return compareCompSize;
    }

    /**
     * @param compareCompSize
     *            the compareCompSize to set
     */
    public void setCompareCompSize(boolean compareCompSize) {
        this.compareCompSize = compareCompSize;
    }

    /**
     * @return the outputPath
     */
    public String getOutputPath() {
        return outputPath;
    }

    /**
     * @param outputPath
     *            the outputPath to set
     */
    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }
}
