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
package de.cau.cs.kieler.comparison.core;

import java.nio.file.Path;
import java.util.Collection;

import de.cau.cs.kieler.comparison.simulation.ExecutionSimulator;

/**
 * @author nfl
 *
 */
public interface ICompiler {

    /**
     * 
     * @return
     */
    public String getID();

    /**
     * 
     * @return
     */
    public Language getSrcLanguage();

    /**
     * 
     * @return
     */
    public Language getTrgLanguage();

    /**
     * 
     * @return
     */
    public Path compile(Path srcFile, Path outputPath) throws CompilationException;

    /**
     * 
     * @return
     */
    public int getCompilationOffset();

    /**
     * 
     * @return
     */
    public Collection<String> getFeasibleProperties();

    /**
     * 
     * @return
     */
    public ExecutionSimulator getSimulator();
}
