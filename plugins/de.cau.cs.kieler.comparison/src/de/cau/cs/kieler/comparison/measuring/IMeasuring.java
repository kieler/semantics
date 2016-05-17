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
 * The {@link IMeasuring} interface is used for the abstraction of a specific measuring itself. A
 * measuring contains the compiler, the test case, the measuring criterion and a single measuring
 * result.
 * 
 * @author nfl
 */
public interface IMeasuring {

    /**
     * This method is used to get the identifier of the compiler used in the measuring.
     * 
     * @return the identification String
     */
    public String getCompiler();

    /**
     * This method is used to get the identifier of the test case used in the measuring.
     * 
     * @return the identification String
     */
    public String getTestcase();

    /**
     * This method is used to get the criterion used in the measuring.
     * 
     * @return the identification String
     */
    public String getCriterion();

    /**
     * This method is used to get the measuring result itself.
     * 
     * @return the measuring
     */
    public String getMeasuringData();
}
