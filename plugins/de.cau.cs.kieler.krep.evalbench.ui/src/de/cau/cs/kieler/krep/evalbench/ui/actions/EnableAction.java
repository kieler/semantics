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
package de.cau.cs.kieler.krep.evalbench.ui.actions;

import org.eclipse.jface.action.Action;

import de.cau.cs.kieler.krep.evalbench.ui.views.ConnectionView;

/**
 * TODO propose & comment, choose icon or move to view menu.
 * @author ctr
 * 
 */
public class EnableAction extends Action {

    private ConnectionView view;

    private boolean enabled;
    /** Identifier string for this action. */
    private static final String ENABLE_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.enable";


    /**
     * @param connectionView
     *            a text viewer which content is erased by this action.
     */
    public EnableAction(final ConnectionView connectionView) {
        super();
        setId(ENABLE_ID);
        setText("Disable");
        setToolTipText("Enable connection view");
        view = connectionView;
        enabled = true;
    }

    @Override
    public void run() {
        enabled = !enabled;
        if (enabled) {
            view.enable();
            setText("Disable");
        } else {
            view.disable();
            setText("Enable");
        }
    }

}
