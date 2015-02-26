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
package de.cau.cs.kieler.scgprios.extensions;

/**
 * This class provides a Tuple 
 * 
 * @author cbu
 *
 */

public class Tuple<A, B> { 
    public A a; 
    public B b; 
    
    /**
     * Declares a Tuple
     * @param a
     *          first parameter
     * @param b
     *          second parameter
     */
    public Tuple(A a, B b) { 
      this.a = a; 
      this.b = b; 
    }
    
    /**
     * Returns first Element of Tuple
     * 
     * @return
     *          first Element of Tuple
     */
    public A getFirst() {
        return a;
    }
    
    /**
     * Returns second Element of Tuple
     * 
     * @return
     *          second Element of Tuple
     */
    public B getSecond(){
        return b;
    }
  } 