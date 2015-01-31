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
package de.cau.cs.kieler.scgprios.common;

/**
 * @author cbu
 *
 */

public class Tuple<A, B> { 
    public A a; 
    public B b; 
    
    public Tuple(A a, B b) { 
      this.a = a; 
      this.b = b; 
    }
    
    public A getFirst() {
        return a;
    }
    
    public B getSecond(){
        return b;
    }
  } 