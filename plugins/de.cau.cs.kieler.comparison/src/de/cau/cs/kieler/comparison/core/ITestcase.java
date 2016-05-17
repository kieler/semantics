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
package de.cau.cs.kieler.comparison.core;

import java.nio.file.Path;
import java.util.Collection;

/**
 * The interface to wrap a test case used in the comparison. ITestcase are created by
 * {@link ITestcaseProvider}.
 * 
 * @author nfl
 */
public interface ITestcase {

    /**
     * Returns an unique identifier for the identification of the test case within the comparison.
     * 
     * @return an unique identifier
     */
    public String getID();

    /**
     * Each program is written in a programming language. This method returns that language to
     * manage the test cases in the comparison.
     * 
     * @return the language the test case is written in
     */
    public Language getLanguage();

    /**
     * The method is used to return the path to the test case program this wrapper interface is
     * build around.
     * 
     * @return the path to the program
     */
    public Path getPath();

    /**
     * Each test case may specify a collection of properties. A compiler can specify which
     * properties that compiler can handle. This way test cases can be filtered for specific
     * compilers.
     * 
     * @return a collection of test case properties
     */
    public Collection<String> getProperties();

    /**
     * A test case may depend on other test cases. For example this can be the case for referring
     * nested test cases within the test case. A compiler might need this information to
     * successfully compile the test case.
     * 
     * @return a collection of paths to test cases this test case depends on
     */
    public Collection<Path> getDependencies();

    /**
     * For the execution of the test case an input trace is required and an output trace might be
     * useful. This method is used to get the path to that trace.
     * 
     * @return the path to the input/output trace
     */
    public Path getTestTrace();

    /**
     * For the execution of the test case an input trace is required and an output trace might be
     * useful. With this method a path to that trace can be set.
     * 
     * @param testTrace the path to the input/output trace
     */
    public void setTestTrace(Path testTrace);
}
