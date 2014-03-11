/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.List;

/**
 * @author cmot
 * @kieler.design 2014-03-11 proposed 
 * @kieler.rating 2014-03-11 proposed yellow
 *
 */
public interface ITransformation {
    
    
    /**
     * Must supply a unique ID to identify this transformation. 
     *
     * @return the string
     */
    public String id();
    
    /**
     * Must supply a list of transformation IDs that this transformation depends on. Be advised to
     * use the minimal set of transformation IDs here. Transformations specified here will be forced
     * to run before.
     *
     * @return the list
     */
    public List<String> dependsOn();
    
    
//    /**
//     * The transformation may optionally declare its input type.
//     *
//     * @return the class
//     */
//    public Class inputType();
//
//    /**
//     * The transformation may optionally declare its output type.
//     *
//     * @return the class
//     */
//    public Class outputType();


}
