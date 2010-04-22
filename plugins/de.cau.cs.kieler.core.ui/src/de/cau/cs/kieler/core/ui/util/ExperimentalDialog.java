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
package de.cau.cs.kieler.core.ui.util;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import de.cau.cs.kieler.core.ui.Messages;

/**
 *
 * @author msp
 */
public class ExperimentalDialog extends MessageDialog {

    /** preference identifier used to store the state of the dialog. */
    private static final String PREF_ID = "core.ui.experimental.dialog"; //$NON-NLS-1$
    
    /** the plugin for which the dialog is created. */
    private AbstractUIPlugin plugin;
    
    /**
     * Creates a dialog to display a warning about an experimental feature.
     * 
     * @param parentShell the shell for which the dialog is created
     * @param featureName the displayed feature name
     * @param theplugin the plugin for which the dialog is created
     */
    public ExperimentalDialog(final Shell parentShell, final String featureName,
            final AbstractUIPlugin theplugin) {
        super(parentShell, Messages.ExperimentalDialog_experimentalFeature, null,
                Messages.ExperimentalDialog_Warning + featureName + Messages.ExperimentalDialog_regarded
                + Messages.ExperimentalDialog_using,
                MessageDialog.WARNING, new String[] {"Ok"}, 0); //$NON-NLS-1$
        this.plugin = theplugin;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int open() {
        plugin.getPreferenceStore().setValue(PREF_ID, true);
        return super.open();
    }
    
    /**
     * Returns true if the experimental warning has not been shown yet for the given plugin.
     * 
     * @param theplugin a UI plugin
     * @return true if the warning dialog needs to bee shown
     */
    public static boolean needWarning(final AbstractUIPlugin theplugin) {
        return !theplugin.getPreferenceStore().getBoolean(PREF_ID);
    }

}
