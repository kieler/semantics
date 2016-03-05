/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kex.ui.wizards.importing;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.kex.controller.ExampleManager;
import de.cau.cs.kieler.kex.model.Example;
import de.cau.cs.kieler.kex.ui.KEXUIPlugin;
import de.cau.cs.kieler.kiml.ui.KimlUiPlugin;
import de.cau.cs.kieler.kiml.service.DiagramLayoutEngine;
import de.cau.cs.kieler.kiml.service.LayoutManagersService;
import de.cau.cs.kieler.kiml.ui.LayoutHandler;

/**
 * This wizard contains all elements for an kex import wizard.
 * 
 * @author pkl
 * 
 */
public class ExampleImportWizard extends Wizard implements IImportWizard {
    
    /**
     * Inner class that does the work of importing the actual examples, complete with a
     * progress monitor and stuff.
     * 
     * @author cds
     */
    private static class ImportWorker implements IRunnableWithProgress {
        /**
         * List of examples to import.
         */
        private List<Example> examples;
        
        /**
         * Destination to import the examples to.
         */
        private IPath destination;
        
        /**
         * Whether to check for duplicate imports.
         */
        private boolean checkDuplicates;
        
        /**
         * Whether the import was cancelled by the user.
         */
        private boolean cancelled;
        
        /**
         * List of resources to open in editors.
         */
        private List<String> resourcesToOpen;
        
        
        /**
         * Constructs a new instance.
         * 
         * @param examples list of examples to import.
         * @param destination import destination.
         * @param checkDuplicates whether to check for duplicate imports.
         */
        public ImportWorker(final List<Example> examples, final IPath destination,
                final boolean checkDuplicates) {
            
            this.examples = examples;
            this.destination = destination;
            this.checkDuplicates = checkDuplicates;
        }
        

        /**
         * {@inheritDoc}
         */
        public void run(final IProgressMonitor monitor) throws InvocationTargetException,
                InterruptedException {
            
            monitor.beginTask("Creating example projects...", examples.size());
            cancelled = false;
            
            // Get an instance of the example manager
            ExampleManager exampleManager = ExampleManager.get();
            
            // Make sure the destination exists
            ExampleManager.get().generateProject(destination);

            // Prepare a list of resources to be opened
            resourcesToOpen = new ArrayList<String>();
            
            // Import the different examples
            for (Example example : examples) {
                // Check if the user requested the import to be cancelled
                if (monitor.isCanceled()) {
                    cancelled = true;
                    break;
                }
                
                try {
                    resourcesToOpen.addAll(exampleManager.importExample(
                            destination, example, checkDuplicates));
                    monitor.worked(1);
                } catch (Exception e) {
                    StatusManager.getManager().handle(
                            new Status(IStatus.ERROR, KEXUIPlugin.PLUGIN_ID,
                                    "Problem importing example.", e),
                            StatusManager.BLOCK);
                }
            }
            
            // Refresh workspace
            IContainer element = ResourcesPlugin.getWorkspace().getRoot();
            try {
                if (element != null) {
                    element.refreshLocal(IContainer.DEPTH_INFINITE, new NullProgressMonitor());
                }
            } catch (CoreException e1) {
                // do nothing
            }
            
            monitor.done();
        }
    }
    


    /* Wizard Pages */
    private ImportExamplePage mainPage;
    private ImportDestPage destinationPage;
    
    private static final int WARNING_THRESHOLD = 5;
    private boolean checkDuplicate;

    /**
     * Constructor for {@link ExampleImportWizard}.
     */
    public ExampleImportWizard() {
        super();
    }

    /**
     * initializes the Wizard and adds the mainpage of Type {@link WizardPage} to it.
     * 
     * @param workbench
     *            , {@link IWorkbench}
     * @param selection
     *            , {@link IStructuredSelection}
     */
    public void init(final IWorkbench workbench, final IStructuredSelection selection) {
        // Set basic wizard properties
        setWindowTitle("KIELER Examples Import");
        setNeedsProgressMonitor(true);
        
        this.checkDuplicate = false;
        
        // Load examples
        try {
            ExampleManager.get().load(true);
        } catch (RuntimeException e) {
            IStatus status = new Status(IStatus.ERROR, KEXUIPlugin.PLUGIN_ID,
                    Messages.getString("loadError"), e);
            StatusManager.getManager().handle(status, StatusManager.SHOW);
        }
        
        // Create wizard pages
        mainPage = new ImportExamplePage("Import Examples", selection);
        destinationPage = new ImportDestPage("Location", selection);
    }

    @Override
    public final void addPages() {
        super.addPages();
        
        addPage(mainPage);
        addPage(destinationPage);
    }

    @Override
    public final boolean performFinish() {
        // Get selected examples
        final List<Example> selectedExamples = mainPage.getCheckedExamples();
        if (selectedExamples.isEmpty()) {
            // Display a proper message to the user
            MessageDialog.openWarning(
                    this.getShell(),
                    "No Examples",
                    "Select at least one example to import.");
            return false;
        }
        
        // Warning if more examples selected than WARNING_THRESHOLD
        if (selectedExamples.size() > WARNING_THRESHOLD) {
            boolean result = MessageDialog.openQuestion(this.getShell(),
                    "More than " + WARNING_THRESHOLD + " examples selected",
                    "Importing may take a while. Do you really want to continue?");
            
            if (!result) {
                return false;
            }
        }
        
        // Find the destination location
        final IPath destinationLocation = destinationPage.getResourcePath();
        if (destinationLocation == null || destinationLocation.isEmpty()) {
            throw new RuntimeException("No import location has been set.");
        }
        
        // Let the work commence!
        ImportWorker worker = new ImportWorker(selectedExamples, destinationLocation, checkDuplicate);
        try {
            this.getContainer().run(true, true, worker);
        } catch (Exception e) {
            StatusManager.getManager().handle(
                    new Status(IStatus.ERROR, KEXUIPlugin.PLUGIN_ID,
                            "Problem importing examples.", e),
                    StatusManager.BLOCK);
            return false;
        }
        
        this.getShell().setVisible(false);
        
        // Open direct opens
        if (!worker.cancelled && !worker.resourcesToOpen.isEmpty() && destinationPage.openImports()) {
            IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            IWorkbenchPage page = window.getActivePage();
            
            for (String path : worker.resourcesToOpen) {
                IFile[] files = ResourcesPlugin.getWorkspace().getRoot()
                        .findFilesForLocationURI(URIUtil.toURI(path), IResource.FILE);
                if (files.length == 1) {
                    IEditorDescriptor defaultEditor = PlatformUI.getWorkbench()
                            .getEditorRegistry().getDefaultEditor(files[0].getName());
                    if (defaultEditor == null) {
                        defaultEditor = PlatformUI.getWorkbench().getEditorRegistry()
                                .findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
                    }
                    try {
                        IEditorPart editorPart = page.openEditor(new FileEditorInput(files[0]),
                                defaultEditor.getId());
                        if (destinationPage.autoLayout() && LayoutManagersService.getInstance()
                                .getManager(editorPart, null) != null) {
                            IPreferenceStore preferenceStore = KimlUiPlugin.getDefault()
                                    .getPreferenceStore();
                            boolean animation = preferenceStore.getBoolean(
                                    LayoutHandler.PREF_ANIMATION);
                            boolean zoomToFit = preferenceStore.getBoolean(
                                    LayoutHandler.PREF_ZOOM);
                            boolean progressDialog = preferenceStore.getBoolean(
                                    LayoutHandler.PREF_PROGRESS);
                            DiagramLayoutEngine.INSTANCE.layout(editorPart, null, animation,
                                    progressDialog, false, zoomToFit);
                        }
                    } catch (PartInitException e) {
                        IStatus status = new Status(IStatus.WARNING, KEXUIPlugin.PLUGIN_ID,
                                "Could not open editor.", e);
                        StatusManager.getManager().handle(status, StatusManager.SHOW);
                        continue;
                    }
                }
            }
        }
        
        return true;
    }
}
