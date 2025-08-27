/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.table.views;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

/**
 * The Class DataTableViewer. This is just a TreeViewer, where it is possible to add extensions or
 * modifications in the future within this class declaration.
 * 
 * @author cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
public class DataTableViewer extends TreeViewer {

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new DataTableViewer.
     * 
     * @param parent
     *            the composite parent
     * @param style
     *            the style
     */
    public DataTableViewer(final Composite parent, final int style) {
        super(parent, style);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new DataTableViewer.
     * 
     * @param parent
     *            the composite parent
     */
    public DataTableViewer(final Composite parent) {
        super(parent);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new DataTableViewer.
     * 
     * @param table
     *            the table
     */
    public DataTableViewer(final Table table) {
        super(table);
    }

}
