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

import de.cau.cs.kieler.sim.kiem.config.managers.Tools;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * The dialog window for adding a new property to the list of KIEM's default
 * properties.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class NewPropertyDialog extends AbstractPropertiesDialog<KiemProperty> {

    /** The labels of this dialog. */
    private static final String[] LABELS = { Tools.PROPERTY_KEY_NAME,
            Tools.PROPERTY_VALUE_NAME };
    /** The title of this dialog. */
    private static final String TITLE = "New Property";
    /** The tooltips for this dialog. */
    private static final String[] TOOLTIPS = { Tools.PROPERTY_KEY_HINT,
            Tools.PROPERTY_VALUE_HINT };

    // --------------------------------------------------------------------------

    /**
     * 
     * Creates a new NewPropertyDialog.
     * 
     * @param parent
     *            The parent frame.
     */
    public NewPropertyDialog(final Shell parent) {
        super(parent, LABELS, TOOLTIPS, TITLE);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemProperty open() {
        String[] values = super.openDialog();
        KiemProperty result = null;
        if (values != null) {
            result = new KiemProperty(values[0], values[1]);
        }
        return result;
    }
}
