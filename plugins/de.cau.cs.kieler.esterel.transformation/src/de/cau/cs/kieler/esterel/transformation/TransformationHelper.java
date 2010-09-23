/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.transformation;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.synccharts.State;

/**
 * Contains some helping functionality.
 * 
 * @author uru
 * 
 */
public final class TransformationHelper {

    /**
     * private constructor.
     */
    private TransformationHelper() {
    }

    /**
     * Do some casting.
     * 
     * @param obj
     *            object to cast
     * @return casted object
     */
    public static EObject castToEObjcet(final EObject obj) {
        return obj;
    }

    public static void setBodyContents(final State s, final EObject obj) {
        s.setBodyContents(obj);
    }

}
