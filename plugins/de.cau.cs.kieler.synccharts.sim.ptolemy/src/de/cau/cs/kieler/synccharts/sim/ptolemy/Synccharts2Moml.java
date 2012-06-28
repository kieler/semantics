/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.synccharts.sim.ptolemy;

import java.io.File;

/**
 * The Class Synccharts2Moml.
 * 
 * @author cmot
 */
public final class Synccharts2Moml {
    
    /** The Constant DEFAULT_MOML_FILE. */
    private static final String DEFAULT_MOML_FILE = "generated.moml";

    /**
     * Utility class should not be instantiated.
     */
    private Synccharts2Moml() {

    }

    // -------------------------------------------------------------------------

    /**
     * The main method.
     * 
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        File file = new File(DEFAULT_MOML_FILE);
        MOMLBuilder builder = new MOMLBuilder();

        builder.writeMomlTo(file);
    }

    // -------------------------------------------------------------------------

}
