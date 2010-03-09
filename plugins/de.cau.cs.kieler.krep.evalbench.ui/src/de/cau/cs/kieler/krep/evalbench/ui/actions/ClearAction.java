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

import de.cau.cs.kieler.core.ui.views.TextViewer;
import de.cau.cs.kieler.krep.evalbench.ui.Activator;

/**
 * Erases the contents of a given text viewer.
 * 
 * @author ctr
 * 
 * @kieler.rating 2010-03-09 yellow 
 *   review by msp, soh
 *   
 * TODO consider moving to core.ui
 */
public class ClearAction extends Action {

    private TextViewer viewer;

    /** Identifier string for this action. */
    private static final String ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.clear";

    /** Relative path to the icon to use for this action. */
    private static final String ICON_PATH = "icons/clear.gif";

    /**
     * @param textViewer
     *            a text viewer which content is erased by this action.
     */
    public ClearAction(final TextViewer textViewer) {
        super();
        setId(ID);
        setText("Clear");
        setToolTipText("Verify all benchmarks");
        setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, ICON_PATH));
        viewer = textViewer;
    }

    @Override
    public void run() {
        viewer.setText("");
        viewer.refresh();
    }
}
