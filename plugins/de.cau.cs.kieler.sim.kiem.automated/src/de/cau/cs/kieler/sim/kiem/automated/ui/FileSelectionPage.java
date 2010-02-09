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
package de.cau.cs.kieler.sim.kiem.automated.ui;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.dialogs.WizardExportResourcesPage;

import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;

/**
 * This page displays the current workspace and asks the user to select the execution and model
 * files.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class FileSelectionPage extends WizardExportResourcesPage implements SelectionListener {

    /** The list of selected execution files. */
    private LinkedList<IPath> executionFiles;

    /** The list of schedules selected through the import page. */
    private List<ScheduleData> importedFiles;

    /** The list of selected model files. */
    private LinkedList<IPath> modelFiles;

    /** The button for selecting additional schedules from the list of imported ones. */
    private Button importButton;

    /** The parent component for this page. */
    private Composite parentComponent;

    // --------------------------------------------------------------------------

    /**
     * Creates a new FileSelectionPage with nothing selected.
     */
    protected FileSelectionPage() {
        super("FileSelectionPage", null);
    }

    /**
     * 
     * Creates a new FileSelectionPage with an initial selection.
     * 
     * @param selection
     *            the initial selection
     */
    protected FileSelectionPage(final IStructuredSelection selection) {
        super("FileSelectionPage", selection);
    }

    // --------------------------------------------------------------------------

    /**
     * Determines whether the user can flip to the next page.
     * 
     * @return true if both lists contain at least one file.
     */
    private boolean canFlip() {
        return !(getExecutionFiles().isEmpty() || getModelFiles().isEmpty());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canFlipToNextPage() {
        return canFlip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isPageComplete() {
        return canFlip();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createDestinationGroup(final Composite parent) {
        super.setDescription("Select model and Execution files");
        super.setTitle("Select all model and execution files that "
                + "should be used for the execution.");
        
        this.parentComponent = parent;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createOptionsGroupButtons(final Group parent) {
        importButton = super.createButton(parent, IDialogConstants.OPEN_ID,
                "Select imported schedules", false);
        importButton.addSelectionListener(this);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void handleEvent(final Event event) {
        fillLists();
    }

    // --------------------------------------------------------------------------

    /**
     * Get all selected files as a list of OSStrings.
     * 
     * @return the list of files
     */
    @SuppressWarnings("unchecked")
    public List<String> getAllSelectedFiles() {
        List selection = super.getSelectedResources();
        List<String> result = new LinkedList<String>();

        for (Object o : selection) {
            if (o instanceof IResource) {
                IResource resource = (IResource) o;
                result.add(resource.getFullPath().toOSString());
            }
        }

        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Fill the two lists with the appropriate elements from the user selection. All .execution
     * files will be added to the list of execution files, all other files to the list of models.
     * 
     */
    @SuppressWarnings("unchecked")
    private void fillLists() {
        List selection = super.getSelectedResources();
        executionFiles = new LinkedList<IPath>();
        modelFiles = new LinkedList<IPath>();

        for (Object o : selection) {
            if (o instanceof IResource) {
                IResource resource = (IResource) o;
                IPath resourcePath = resource.getFullPath();
                if (resourcePath.getFileExtension().equals("execution")) {
                    executionFiles.add(resourcePath);
                } else {
                    modelFiles.add(resourcePath);
                }
            }
        }

        // add imported files to the list
        if (importedFiles != null && !importedFiles.isEmpty()) {
            for (ScheduleData schedule : importedFiles) {
                IPath resourcePath = schedule.getLocation();
                if (resourcePath.getFileExtension().equals("execution")) {
                    executionFiles.add(resourcePath);
                } else {
                    modelFiles.add(resourcePath);
                }
            }
        }
    }

    /**
     * Getter for the executionFiles.
     * 
     * @return the executionFiles
     */
    public List<IPath> getExecutionFiles() {
        fillLists();
        return this.executionFiles;
    }

    /**
     * Getter for the modelFiles.
     * 
     * @return the modelFiles
     */
    public List<IPath> getModelFiles() {
        fillLists();
        return this.modelFiles;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void widgetDefaultSelected(final SelectionEvent e) {
    }

    /**
     * {@inheritDoc}
     */
    public void widgetSelected(final SelectionEvent e) {
        if (e.widget == importButton) {
            List<ScheduleData> imported = ScheduleManager.getInstance().getImportedSchedules();

            if (imported.isEmpty()) {
                MessageDialog.openInformation(parentComponent.getShell(), "Nothing imported",
                        "No schedules were imported.");
            } else {
                SelectImportedDialog dlg = new SelectImportedDialog(imported, parentComponent
                        .getShell());

                this.importedFiles = dlg.displayDialog();
                fillLists();
                
                super.updatePageCompletion();
            }
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------
}
