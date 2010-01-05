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
package de.cau.cs.kieler.krep.compiler.helper;

import java.util.HashMap;

/**
 * Compute unique temporary names.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr 
 */
public final class TempName {

    private TempName() {

    }

   private  static HashMap<String, Integer> names = new HashMap<String, Integer>();

    /**
     * 
     * @param prefix
     *            of the unique name
     * @return a unique name of the form prefix_N
     */
    public static String get(final String prefix) {
        Integer i = names.get(prefix);
        if (i == null) {
            names.put(prefix, 1);
            return prefix + "_0";
        }
        names.put(prefix, i + 1);
        return prefix + "_" + i;
    }

}
