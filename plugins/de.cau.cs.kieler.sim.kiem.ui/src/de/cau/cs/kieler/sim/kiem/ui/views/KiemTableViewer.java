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

package de.cau.cs.kieler.sim.kiem.ui.views;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

/**
 * The Class KiemTableViewer. This is just a TreeViewer, where it is possible to add extensions or
 * modifications in the future within this class declaration.
 * 
 * @author cmot
 * @kieler.design 2009-12-08
 * @kieler.rating 2010-01-15 yellow
 * 
 */
public class KiemTableViewer extends TreeViewer {

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemTableViewer.
     * 
     * @param table
     *            the table to use as a basis
     */
    public KiemTableViewer(final Table table) {
        super(table);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemTableViewer.
     * 
     * @param parent
     *            the parent
     * @param style
     *            the style
     */
    public KiemTableViewer(final Composite parent, final int style) {
        super(parent, style);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemTableViewer. Use the default style.
     * 
     * @param parent
     *            the parent
     */
    public KiemTableViewer(final Composite parent) {
        super(parent);
    }
}
