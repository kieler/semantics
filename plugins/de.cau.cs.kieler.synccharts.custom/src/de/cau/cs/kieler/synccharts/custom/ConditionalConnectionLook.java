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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.custom;

import java.util.List;

import org.eclipse.draw2d.RotatableDecoration;

/**
 * Represents connection looks that are valid under certain
 * conditions. It consists of a list of conditions and the decorations that are
 * to be drawn if the conditions are fulfilled.
 * 
 * @author schm
 */
public class ConditionalConnectionLook {

    private List<Condition> conditions;
    private RotatableDecoration sourceDeco;
    private RotatableDecoration targetDeco;

    /**
     * The Constructor.
     * 
     * @param c List of conditions.
     * @param sD Source decoration.
     * @param tD Target decoration.
     */
    public ConditionalConnectionLook(final List<Condition> c, final RotatableDecoration sD,
            final RotatableDecoration tD) {
        conditions = c;
        sourceDeco = sD;
        targetDeco = tD;
    }

    /**
     * Return the conditions.
     * 
     * @return List of conditions.
     */
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * Return the source decoration.
     * 
     * @return Source decoration.
     */
    public RotatableDecoration getSourceDeco() {
        return sourceDeco;
    }

    /**
     * Return the target decoration.
     * 
     * @return Target decoration.
     */
    public RotatableDecoration getTargetDeco() {
        return targetDeco;
    }

}
