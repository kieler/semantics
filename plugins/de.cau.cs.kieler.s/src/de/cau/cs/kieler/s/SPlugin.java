/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed 
 * @kieler.rating 2013-10-10 proposed yellow
 */
public class SPlugin  {

        public static String EDITOR_ID = "de.cau.cs.kieler.s.S";
        
        /**
         * The Constant AUXILIARY_VARIABLE_TAG for a Transition.
         */
        public static final String AUXILIARY_VARIABLE_TAG_TRANSITION 
                               = "oSoAUXTRANSo";

        /**
         * The Constant AUXILIARY_VARIABLE_TAG for a State.
         */
        public static final String AUXILIARY_VARIABLE_TAG_STATE 
                               = "oSoAUXSTATEo";
}
