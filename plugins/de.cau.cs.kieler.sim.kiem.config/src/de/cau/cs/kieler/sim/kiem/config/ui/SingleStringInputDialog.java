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
package de.cau.cs.kieler.sim.kiem.config.ui;

import org.eclipse.swt.widgets.Shell;

/**
 * Reads a single String from the user.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class SingleStringInputDialog extends AbstractPropertiesDialog<String> {

    /**
     * 
     * Creates a new SingleStringInputDialog.
     * 
     * @param parent
     *            the parent shell
     * @param newTitle
     *            the title of the dialog
     * @param newLabel
     *            the label of the input field
     * @param tooltip
     *            the tooltip for this dialog
     */
    public SingleStringInputDialog(final Shell parent, final String newTitle,
            final String newLabel, final String tooltip) {
        super(parent, newLabel, tooltip, newTitle);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String open() {
        String[] array = super.openDialog();
        String result = null;
        if (!(array == null)) {
            result = array[0];
        }
        return result;
    }
}
