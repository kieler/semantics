/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.annotations.xtext

import java.util.List

/**
 * Interface to generate highlighting file.
 * 
 * @author sdo
 *
 */
interface IHighlighting {
    
    
    def String getId();
    
    def String getName();
    
    def List<String> getKeywords();
    
}