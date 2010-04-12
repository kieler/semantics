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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;

import de.cau.cs.kieler.sim.kiem.automated.KiemAutomatedPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * The wizard for setting up the automated execution.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class AutomatedExecutionWizard extends Wizard {

    /** The identifier for the files saved in the preference store. */
    private static final String FILE_SELECTION_NAME = "FILE_SELECTION";
    /** The identifier for the properties saved in the preference store. */
    private static final String PROPERTY_SELECTION_NAME = "PROPERTY_SELECTION";

    /** The page for selecting all necessary files. */
    private FileSelectionPage fileSelectionPage;
    /** The page for setting up the properties. */
    private PropertySettingPage propertySettingPage;

    /** The list of execution files for the next run. */
    private IPath[] executionFiles;
    /** The list of model files for the next run. */
    private List<IPath> modelFiles;
    /** The list of properties for the next run. */
    private List<KiemProperty> properties;

    // --------------------------------------------------------------------------

    /**
     * Creates a new AutomatedExecutionWizard.
     */
    public AutomatedExecutionWizard() {
        super();
        super.setWindowTitle("Create a new automated execution.");

        // use defaults if no selection was loaded.
        if (!loadInitialFileSelection()) {
            fileSelectionPage = new FileSelectionPage();
        }
        if (!loadInitialPropertySelection()) {
            propertySettingPage = new PropertySettingPage();
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Try to load a list of properties from the preference store that should be
     * placed into the wizard.
     * 
     * @return true if an initial selection was found.
     */
    private boolean loadInitialPropertySelection() {
        String loaded = KiemAutomatedPlugin.getDefault().load(
                PROPERTY_SELECTION_NAME, null);

        if (loaded != null) {
            String[] list = Tools.getValueList(Tools.PROPERTY_NAME, loaded);

            if (list != null) {
                List<KiemProperty> selection = new LinkedList<KiemProperty>();

                for (String s : list) {
                    selection.add(Tools.getKiemProperty(s));
                }

                propertySettingPage = new PropertySettingPage(selection);
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     * Try to load the list of initially selected files from the eclipse
     * preference store and place them into the wizard.
     * 
     * @return true if an initial selection was found
     */
    private boolean loadInitialFileSelection() {
        String loaded = KiemAutomatedPlugin.getDefault().load(
                FILE_SELECTION_NAME, null);

        if (loaded != null) {
            String[] list = Tools.getValueList(Tools.LOCATION_NAME, loaded);

            if (list != null) {
                final List<IResource> selection = new LinkedList<IResource>();
                for (String s : list) {
                    // try to find the paths in the workspace and resolve to a
                    // resource
                    IResource resource = ResourcesPlugin.getWorkspace()
                            .getRoot().findMember(Path.fromOSString(s));

                    if (resource != null) {
                        selection.add(resource);
                    }

                }

                if (!selection.isEmpty()) {
                    // create the structured selection
                    IStructuredSelection loadedSelection = new Selection(
                            selection);

                    fileSelectionPage = new FileSelectionPage(loadedSelection);
                }
            }
        }
        return fileSelectionPage != null;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void addPages() {
        super.addPages();

        super.addPage(fileSelectionPage);
        super.addPage(propertySettingPage);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean performCancel() {
        saveSettings();
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean performFinish() {

        List<IPath> executions = fileSelectionPage.getExecutionFiles();
        executionFiles = executions.toArray(new IPath[executions.size()]);
        modelFiles = fileSelectionPage.getModelFiles();
        properties = propertySettingPage.getProperties();
        saveSettings();
        return true;
    }

    // --------------------------------------------------------------------------

    /**
     * Save the settings.
     */
    private void saveSettings() {

        // save file selection page
        List<String> files = fileSelectionPage.getAllSelectedFiles();
        StringBuilder builder = new StringBuilder();

        for (String s : files) {
            builder.append(Tools.putValue(Tools.LOCATION_NAME, s));
        }

        KiemAutomatedPlugin.getDefault().save(FILE_SELECTION_NAME,
                builder.toString());

        // save property page
        List<KiemProperty> propertiesList = propertySettingPage.getProperties();
        if (propertiesList != null && !propertiesList.isEmpty()) {
            builder = new StringBuilder();

            for (KiemProperty prop : propertiesList) {
                builder.append(Tools.putProperty(prop));
            }

            KiemAutomatedPlugin.getDefault().save(PROPERTY_SELECTION_NAME,
                    builder.toString());
        }

    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the execution files.
     * 
     * @return the execution files.
     */
    public IPath[] getExecutionFiles() {
        return executionFiles;
    }

    /**
     * Getter for the model files.
     * 
     * @return the model files
     */
    public List<IPath> getModelFiles() {
        return modelFiles;
    }

    /**
     * Getter for the properties.
     * 
     * @return the properties
     */
    public List<KiemProperty> getProperties() {
        return properties;
    }

    /**
     * Manages the selection for the wizard.
     * 
     * @author soh
     * @kieler.rating 2010-02-15 proposed yellow
     */
    private static class Selection implements IStructuredSelection {

        /** The selection. */
        private List<IResource> selection;

        /**
         * Creates a new structured selection.
         * 
         * @param selectionParam
         *            the selection
         */
        public Selection(final List<IResource> selectionParam) {
            this.selection = selectionParam;
        }

        public boolean isEmpty() {
            return selection.isEmpty();
        }

        public List<IResource> toList() {
            return selection;
        }

        public Object[] toArray() {
            return selection.toArray();
        }

        public int size() {
            return selection.size();
        }

        public Iterator<IResource> iterator() {
            return selection.iterator();
        }

        public Object getFirstElement() {
            return selection.get(0);
        }
    }

}
