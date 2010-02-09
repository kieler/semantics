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

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;

/**
 * The dialog for showing that the execution file is missing and dealing with
 * it.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
@SuppressWarnings("restriction")
public class ExecutionFileMissingDialog {

    /** The dialog title. */
    private static final String DIALOG_TITLE = "Execution file is missing.";

    /** The dialog message. */
    private static final String DIALOG_MESSAGE = "The .execution file associated"
            + " with this schedule can't be found at the saved location. "
            + " Do you want to enter a new location for it or should the schedule be "
            + " deleted.";

    /** The text for the delete button. */
    public static final String DELETE = "Delete";
    /** The text for the cancel button. */
    public static final String CANCEL = "Cancel";
    /** The text for the new location button. */
    public static final String NEW_LOCATION = "Enter new location";

    /** All labels for the dialog. */
    private static final String[] BUTTON_LABELS = { DELETE, NEW_LOCATION,
            CANCEL };

    /** The parent shell. */
    private Shell parentShell;

    /** The faulty schedule. */
    private ScheduleData schedule;

    /**
     * Creates a new ExecutionFileMissingDialog.
     * 
     * @param parentShellParam
     *            the parent shell
     * @param scheduleParam
     *            the faulty schedule
     */
    public ExecutionFileMissingDialog(final Shell parentShellParam,
            final ScheduleData scheduleParam) {
        this.parentShell = parentShellParam;
        this.schedule = scheduleParam;
    }

    /**
     * Open the dialog.
     * 
     * @return the choice of the user
     */
    public String open() {
        MessageDialog dialog = new MessageDialog(parentShell, DIALOG_TITLE,
                null, DIALOG_MESSAGE, MessageDialog.ERROR, BUTTON_LABELS, 0);

        switch (dialog.open()) {
        case 0:
            ScheduleManager.getInstance().removeSchedule(schedule);
            ScheduleManager.getInstance().save();
            return DELETE;
        case 1:
            return enterNewLocation(true);
        case 2:
        default:
            return CANCEL;
        }
    }

    /**
     * Open a file chooser so the user can select the file.
     * 
     * @param tryToOpen
     *            true if the an openFile() attempt should be made
     * @return the choice of the user
     */
    public String enterNewLocation(final boolean tryToOpen) {

        ElementTreeSelectionDialog dlg = new ElementTreeSelectionDialog(
                parentShell, new WorkbenchLabelProvider(),
                new BaseWorkbenchContentProvider());
        dlg.setTitle("Select the execution file.");
        dlg.setMessage("Select the execution file.");
        dlg.setInput(ResourcesPlugin.getWorkspace().getRoot());
        dlg.setAllowMultiple(false);
        int val = dlg.open();
        if (val == 0) {
            IPath newPath = ((File) dlg.getFirstResult()).getFullPath();

            schedule.setLocation(newPath);

            ScheduleManager.getInstance().save();
            if (tryToOpen) {
                try {
                    ScheduleManager.getInstance().loadSchedule(schedule);
                    return NEW_LOCATION;
                } catch (ScheduleFileMissingException e0) {
                    return open();
                }
            }
            return NEW_LOCATION;
        }
        return CANCEL;
    }
}
