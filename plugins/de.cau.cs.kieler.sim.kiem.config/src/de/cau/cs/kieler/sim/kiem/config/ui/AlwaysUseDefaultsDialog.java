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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListSelectionDialog;

import de.cau.cs.kieler.sim.kiem.config.data.KiemPropertyKeyWrapper;
import de.cau.cs.kieler.sim.kiem.config.managers.ConfigurationManager;
import de.cau.cs.kieler.sim.kiem.config.managers.PropertyUsageManager;
import de.cau.cs.kieler.sim.kiem.config.managers.Tools;

/**
 * Open a dialog where the user can select the keys that should be taken from
 * the default configuration rather than the currently opened configuration.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public final class AlwaysUseDefaultsDialog {

    /** Does nothing. */
    private AlwaysUseDefaultsDialog() {

    }

    // --------------------------------------------------------------------------

    /**
     * Open a dialog where the user can select the keys that should be taken
     * from the default configuration rather than the currently opened
     * configuration.
     * 
     * @param shell
     *            The shell on which the dialog should be displayed.
     */
    public static void displayDialog(final Shell shell) {
        // get data about keys from manager, none of the lists can be null,
        // empty at worst
        List<KiemPropertyKeyWrapper> ignoredKeys = PropertyUsageManager
                .getInstance().getIgnoredKeys();
        List<KiemPropertyKeyWrapper> allKeys = ConfigurationManager
                .getInstance().getAllKeys();

        String message = Tools.IGNORED_KEYS_BUTTON_TOOLTIP;

        ListSelectionProvider provider = new ListSelectionProvider();

        ListSelectionDialog dialog = new ListSelectionDialog(shell, allKeys,
                provider, provider, message);

        // set up initial selection if any keys are already ignored
        if (!ignoredKeys.isEmpty()) {
            dialog.setInitialSelections(ignoredKeys
                    .toArray(new KiemPropertyKeyWrapper[1]));
        }
        dialog.setHelpAvailable(false);

        // open the dialog
        if (dialog.open() == Dialog.OK) {
            Object[] result = dialog.getResult();

            // convert result to the format
            List<KiemPropertyKeyWrapper> output = new LinkedList<KiemPropertyKeyWrapper>();
            for (Object o : result) {
                output.add((KiemPropertyKeyWrapper) o);
            }

            // set and save
            PropertyUsageManager.getInstance().setIgnoredKeys(output);
            PropertyUsageManager.getInstance().save();
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * The content and label provider for the dialog where the user can choose
     * the keys that should be ignored when looking for values in the current
     * configuration.
     * 
     * @author soh
     * @kieler.rating 2010-01-27 proposed yellow
     */
    private static class ListSelectionProvider implements
            IStructuredContentProvider, ILabelProvider {

        /**
         * {@inheritDoc}
         */
        public void addListener(final ILabelProviderListener listener) {

        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public void dispose() {

        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        @SuppressWarnings("unchecked")
        public Object[] getElements(final Object inputElement) {
            List<KiemPropertyKeyWrapper> input = new LinkedList<KiemPropertyKeyWrapper>();
            if (inputElement instanceof List<?>) {
                input = (List<KiemPropertyKeyWrapper>) inputElement;
            }
            return input.toArray(new KiemPropertyKeyWrapper[1]);
        }

        /**
         * {@inheritDoc}
         */
        public Image getImage(final Object element) {
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public String getText(final Object element) {
            return element.toString();
        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public void inputChanged(final Viewer viewer, final Object oldInput,
                final Object newInput) {
        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public boolean isLabelProperty(final Object element,
                final String property) {
            return false;
        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public void removeListener(final ILabelProviderListener listener) {

        }

    }

}
