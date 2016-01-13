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

import java.util.Collection;

/**
 * @author nfl
 */
public interface ITestcaseProvider {

    /**
     * 
     * @return
     */
    public String getID();
    
    /**
     * 
     * @return
     */
    public String getExtension();
    
    /**
     * 
     * @param filePath
     * @return ITestcase, if the given file could be parsed into a testcase; null otherwise
     */
    public Collection<ITestcase> createTestcases(String filePath);
//    public ITestcase createTestcase(String filePath);
}
