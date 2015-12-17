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



/**
 * @author nfl
 *
 */
public interface ICompiler {

    public String getID();
    public Language getSrcLanguage();
    public Language getTrgLanguage();
    public String compile(String srcFile, String outputPath) throws CompilationException;
}
