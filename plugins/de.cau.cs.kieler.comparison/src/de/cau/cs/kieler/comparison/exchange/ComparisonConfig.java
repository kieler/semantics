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

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.ITestcase;

/**
 * The ComparisonConfig is used to specify options for the comparison. An object of this class is
 * required to start a comparison.
 * 
 * @author nfl
 */
public class ComparisonConfig {

    /**
     * The {@link ICompiler} used in the comparison.
     */
    private Collection<ICompiler> compilers;

    /**
     * The {@link ITestcase} used in the comparison.
     */
    private Collection<ITestcase> testcases;

    /**
     * Signals the use of the compilation speed as comparison criterion.
     */
    private boolean compareCompSpeed = false;

    /**
     * Specifies how the compilation speed should be measured.
     */
    private IMeasuringParameters compareCompParameters;

    /**
     * Signals the use of the execution speed of compiled test cases as comparison criterion.
     */
    private boolean compareExecSpeed = false;

    /**
     * Specifies how often the execution speed should be measured.
     */
    private int compareExecSpeedAmount = 1;

    /**
     * Signals the use of the compilation size as comparison criterion.
     */
    private boolean compareCompSize = false;

    /**
     * The path to store the comparison measurings.
     */
    private String outputPath;

    /**
     * Getter for the {@link ICompiler} used in the comparison.
     * 
     * @return the compilers
     */
    public Collection<ICompiler> getCompilers() {
        if (compilers == null) {
            compilers = new ArrayList<ICompiler>();
        }
        return compilers;
    }

    /**
     * Setter for the {@link ICompiler} used in the comparison.
     * 
     * @param compilers
     *            the compilers to set
     */
    public void setCompilers(final Collection<ICompiler> compilers) {
        this.compilers = compilers;
    }

    /**
     * Getter for the {@link ITestcase} used in the comparison.
     * 
     * @return the test cases
     */
    public Collection<ITestcase> getTestcases() {
        if (testcases == null) {
            testcases = new ArrayList<ITestcase>();
        }
        return testcases;
    }

    /**
     * Setter for the {@link ITestcase} used in the comparison.
     * 
     * @param testcases
     *            the test cases to set
     */
    public void setTestcases(final Collection<ITestcase> testcases) {
        this.testcases = testcases;
    }

    /**
     * Getter for the boolean flag used to signal the use of the compilation speed as comparison
     * criterion.
     * 
     * @return the boolean flag
     */
    public boolean compareCompSpeed() {
        return compareCompSpeed;
    }

    /**
     * Setter for the boolean flag used to signal the use of the compilation speed as comparison
     * criterion.
     * 
     * @param compareCompSpeed
     *            the boolean flag to set
     */
    public void setCompareCompSpeed(final boolean compareCompSpeed) {
        this.compareCompSpeed = compareCompSpeed;
    }

    /**
     * Getter to specify how the compilation speed should be measured. The
     * {@link IMeasuringParameters} class is used for this purpose.
     * 
     * @return the measuring parameters
     */
    public IMeasuringParameters getCompareCompParameters() {
        return compareCompParameters;
    }

    /**
     * Setter to specify how the compilation speed should be measured. The
     * {@link IMeasuringParameters} class is used for this purpose.
     * 
     * @param compareCompParameters
     *            the measuring parameters to set
     */
    public void setCompareCompParameters(final IMeasuringParameters compareCompParameters) {
        this.compareCompParameters = compareCompParameters;
    }

    /**
     * Getter for the boolean flag used to signal the use of the execution speed of compiled test
     * cases as comparison criterion.
     * 
     * @return the boolean flag
     */
    public boolean compareExecSpeed() {
        return compareExecSpeed;
    }

    /**
     * Setter for the boolean flag used to signal the use of the execution speed of compiled test
     * cases as comparison criterion.
     * 
     * @param compareExecSpeed
     *            the boolean flag to set
     */
    public void setCompareExecSpeed(final boolean compareExecSpeed) {
        this.compareExecSpeed = compareExecSpeed;
    }

    /**
     * Getter for the amount of time measurings used in the executions of compiled test cases.
     * 
     * @return the amount of executions
     */
    public int getCompareExecSpeedAmount() {
        return compareExecSpeedAmount;
    }

    /**
     * Setter for the amount of time measurings used in the executions of compiled test cases.
     * 
     * @param compareExecSpeedAmount
     *            the amount of executions to set
     */
    public void setCompareExecSpeedAmount(final int compareExecSpeedAmount) {
        this.compareExecSpeedAmount = compareExecSpeedAmount;
    }

    /**
     * Getter for the boolean flag used to signal the use of the size measuring of compiled test
     * cases as comparison criterion.
     * 
     * @return the boolean flag
     */
    public boolean compareCompSize() {
        return compareCompSize;
    }

    /**
     * Setter for the boolean flag used to signal the use of the size measuring of compiled test
     * cases as comparison criterion.
     * 
     * @param compareCompSize
     *            the boolean flag to set
     */
    public void setCompareCompSize(final boolean compareCompSize) {
        this.compareCompSize = compareCompSize;
    }

    /**
     * Getter for the path to store the comparison measurings.
     * 
     * @return the output path
     */
    public String getOutputPath() {
        return outputPath;
    }

    /**
     * Setter for the path to store the comparison measurings.
     * 
     * @param outputPath
     *            the output path to set
     */
    public void setOutputPath(final String outputPath) {
        this.outputPath = outputPath;
        if (!this.outputPath.endsWith(File.separator)) {
            this.outputPath += File.separator;
        }
    }
}
