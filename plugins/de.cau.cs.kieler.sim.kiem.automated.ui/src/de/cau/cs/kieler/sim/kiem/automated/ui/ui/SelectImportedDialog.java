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

package de.cau.cs.kieler.sim.kiem.automated.ui.ui;

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

import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;

/**
 * This dialog is for selecting additional schedules from the list of schedules that were imported
 * through the extension point.
 * 
 * @author soh
 * @kieler.rating 2010-01-31 proposed yellow
 * 
 */
public class SelectImportedDialog {

    /** The list of all available imported schedules in the workspace. */
    private List<ScheduleData> importedSchedules;

    /** The shell where to display the dialog. */
    private Shell shell;

    // --------------------------------------------------------------------------

    /**
     * Create a new dialog.
     * 
     * @param imported
     *            the list for the list selection dialog
     * @param shellParam
     *            the shell where to display the dialog
     */
    public SelectImportedDialog(final List<ScheduleData> imported, final Shell shellParam) {
        importedSchedules = imported;
        shell = shellParam;
    }

    // --------------------------------------------------------------------------

    /**
     * Open the dialog, wait for the user selection and return the selected schedules.
     * 
     * @return the list of selected schedules or null if the user clicked cancel.
     */
    public List<ScheduleData> displayDialog() {
        ListSelectionProvider provider = new ListSelectionProvider();

        ListSelectionDialog dialog = new ListSelectionDialog(shell, importedSchedules, provider,
                provider, "Select schedules for execution");

        dialog.setHelpAvailable(false);

        // open the dialog
        if (dialog.open() == Dialog.OK) {
            Object[] result = dialog.getResult();

            // convert result to the format
            List<ScheduleData> output = new LinkedList<ScheduleData>();
            for (Object o : result) {
                output.add((ScheduleData) o);
            }
            return output;
        }
        return null;
    }

    /**
     * The content and label provider for the list selection dialog.
     * 
     * 
     * @author soh
     * @kieler.rating 2010-01-31 proposed yellow
     */
    private static class ListSelectionProvider implements IStructuredContentProvider,
            ILabelProvider {

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
            List<ScheduleData> input = new LinkedList<ScheduleData>();
            if (inputElement instanceof List<?>) {
                input = (List<ScheduleData>) inputElement;
            }
            return input.toArray(new ScheduleData[1]);
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
            if (element instanceof ScheduleData) {
                ScheduleData data = (ScheduleData) element;
                return data.getExtendedName();
            }
            return null;
        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public boolean isLabelProperty(final Object element, final String property) {
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
