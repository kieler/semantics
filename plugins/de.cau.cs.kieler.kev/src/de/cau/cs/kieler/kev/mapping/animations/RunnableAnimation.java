/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.kev.mapping.animations;

/**
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * @kieler.rating 2010-02-17 proposed yellow
 */
public class RunnableAnimation implements Runnable {

    /**
     * The code for manipulating the SVGDocument.
     */
    public void run() {
        //Here we can put some code for SVGDocument manipulation, 
        //but we don't need it now because we manipulate the tree already within
        //the animations itself.
    }

}
