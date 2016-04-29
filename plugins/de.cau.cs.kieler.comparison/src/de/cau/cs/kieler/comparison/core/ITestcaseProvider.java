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

import java.io.File;
import java.util.Collection;

/**
 * @author nfl
 */
public interface ITestcaseProvider {

    /**
     * This method is used to uniquely identify the ITestcaseProvider.
     * 
     * @return an identifier
     */
    public String getID();
    
    /**
     * This method returns which file extension the ITestcaseProvider handles. Out of these files the
     * ITestcaseProvider can create a list of ITestcase.
     * 
     * @return the file extension this ITestcaseProvider handles
     */
    public String getExtension();
    
    /**
     * This method takes a file and tries to create a list of ITestcase from this file.
     * 
     * @param file the file to create ITestcases from
     * @return a collection of ITestcase
     */
    public Collection<ITestcase> createTestcases(File file);
}
