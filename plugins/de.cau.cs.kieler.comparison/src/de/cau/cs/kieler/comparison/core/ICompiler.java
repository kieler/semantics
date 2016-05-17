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

import de.cau.cs.kieler.comparison.simulation.ExecutionSimulator;

/**
 * The interface each compiler has to realize to be compared. The implementation of this interface
 * is required to use the compiler extension point.
 * 
 * @author nfl
 */
public interface ICompiler {

    /**
     * Returns an unique identifier for the identification of the compiler within the comparison.
     * 
     * @return an unique identifier
     */
    public String getID();

    /**
     * Each compiler translates a program from one language into another. This method is used to
     * specify the source language of the compiler.
     * 
     * @return the source language of the compiler
     */
    public Language getSrcLanguage();

    /**
     * Each compiler translates a program from one language into another. This method is used to
     * specify the target language of the compiler.
     * 
     * @return the target language of the compiler
     */
    public Language getTrgLanguage();

    /**
     * This method is used by the compiler to translate a given program. If the compilation can not
     * be completed successfully a {@link CompilationException} should be thrown.
     * 
     * @param srcFile
     *            the path referring the test case
     * @param outputPath
     *            the path to store the compiled test case
     * @return the path to the compiled test case
     * @throws CompilationException
     *             an exception thrown, if the compilation had problems
     */
    public Path compile(Path srcFile, Path outputPath) throws CompilationException;

    /**
     * Each compiler may specify which test case properties he is able to compile. This way test
     * cases can be filtered and compilers can be compared regarding another criterion.
     * 
     * @return a collection of feasible properties
     */
    public Collection<String> getFeasibleProperties();

    /**
     * For the time measuring of the compilation an offset can be set. This offset should by default
     * be 0, but might be increased, if the measuring result needs to be modified. The measuring is
     * taken in ms and the long returned by this method will be subtracted from the measuring.
     * 
     * @return the time in ms subtracted from the measuring result
     */
    public long getCompilationOffset();

    /**
     * The time measuring of test case executions can be used as a criterion for the comparison. To
     * execute a test case and to be able being measured by the execution, the compiler needs to
     * implement an {@link ExecutionSimulator}.
     * 
     * @return the ExecutionSimulator used to execute a test case compiled by the compiler
     */
    public ExecutionSimulator getSimulator();
}
