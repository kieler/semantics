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
package de.cau.cs.kieler.comparison.measuring;


/**
 * @author nfl
 *
 */
public class CompSizeMeasuring implements IMeasuring {

    private String compiler;
    private String testcase;
    private long size;
    
    /**
     * @param size 
     * @param testcase 
     * @param compiler 
     * 
     */
    public CompSizeMeasuring(String compiler, String testcase, long size) {
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
    public String getCriteria() {
        return "Compilation Size (byte)";
    }

    /**
     * @param compiler the compiler to set
     */
    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    /**
     * @param testcase the testcase to set
     */
    public void setTestcase(String testcase) {
        this.testcase = testcase;
    }

    /**
     * @return the size
     */
    public long getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(long size) {
        this.size = size;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMeasuringData() {
        return ""+size;
    }
}
