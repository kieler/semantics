/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.kivi.view;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;


/**
 * @author cmot
 *
 */
public class SInstructionsViewer extends TreeViewer {

    /**
     * 
     */
    public static final String ID = "de.cau.cs.kieler.s.ui.view.SInstructionsViewer";



    /**
     * Instantiates a new SJInstructionsViewer.
     * 
     * @param parent
     *            the composite parent
     * @param style
     *            the style
     */
    public SInstructionsViewer(final Composite parent, final int style) {
        super(parent, style);
    }



    /**
     * Instantiates a new SJInstructionsViewer.
     * 
     * @param parent
     *            the composite parent
     */
    public SInstructionsViewer(final Composite parent) {
        super(parent);
    }


    

    /**
     * Instantiates a new SJInstructionsViewer.
     * 
     * @param table
     *            the table
     */
    public SInstructionsViewer(final Table table) {
        super(table);
    }

}