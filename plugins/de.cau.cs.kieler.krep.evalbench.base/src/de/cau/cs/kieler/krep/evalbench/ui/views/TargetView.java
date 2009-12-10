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
package de.cau.cs.kieler.krep.evalbench.ui.views;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.krep.evalbench.ui.actions.TargetInfoAction;

/**
 * A View for displaying target information.
 * 
 * @kieler.rating 2009-12-10 proposed yellow ctr
 * @author msp, ctr
 */
public class TargetView extends ViewPart {

    /** The identifier string for this view. */
    public static final String VIEW_ID = "de.cau.cs.kieler.krep.evalbench.ui.views.target";

    /** The viewer used to display target info. */
    private TextViewer viewer = null;

    /**
     * {@inheritDoc}
     */
    @Override
    public void createPartControl(final Composite parent) {
        // create text viewer
        viewer = new TextViewer(parent);
        // create actions
        IToolBarManager manager = getViewSite().getActionBars().getToolBarManager();
        manager.add(new TargetInfoAction());
    }

    @Override
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    /**
     * Gets the text viewer.
     * 
     * @return text viewer
     */
    public TextViewer getViewer() {
        return viewer;
    }

    /**
     * @param string
     *            target information to show.
     */
    public void show(final String string) {
        if (viewer != null) {
            viewer.setText(string);
        }
    }
}
