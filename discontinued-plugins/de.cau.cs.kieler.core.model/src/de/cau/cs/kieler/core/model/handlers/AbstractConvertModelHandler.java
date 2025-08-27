/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.handlers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.util.ModelUtil;


/**
 * This abstract command handler can be used to convert models to models or text files.
 * If necessary the handler creates a diagram for the transformed model and opens an associated editor.
 * Multiple resource selection is supported and class injection is implemented.
 * All information must be provided in the abstract methods. No further extensions are 
 * necessary (on purpose).
 * 
 * @author ssm
 */
public abstract class AbstractConvertModelHandler extends AbstractHandler {

    /** 
     * @return target resource extension name
     */
    protected abstract String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection);

    /**
     * @return injector of a certain resource. 
     */
    protected abstract Injector createResourceInjector();

    /**
     * Override this method with your transformation.
     * 
     * @param model original model
     * @param event command menu event
     * @param selection resource selection
     * @return transformed model or text object
     */
    protected abstract Object transform(EObject model, ExecutionEvent event, ISelection selection);

    /**
     * You can insert the ID of your editor here. By default no ID is selected.
     * 
     * @return editors ID
     */
    protected String getDiagramEditorID() {
        return null;
    }

// Deprecated GMF stuff
//    /**
//     * 
//     * {@inheritDoc}
//     * 
//     * @return PreferencesHint
//     */
//    protected PreferencesHint getPreferencesHint() {
//        return new PreferencesHint("");
//    }

    /**
     * At each selected item this method decides if a diagram must be created. 
     * By default, a diagram is created if diagram ID is not null.
     * 
     * @param model 
     * @param event command menu event
     * @param selection resource selection
     * @return Set to true if you want to create a diagram for this model.
     */
    protected boolean doCreateDiagram(final EObject model, final ExecutionEvent event, 
            final ISelection selection) {
        return getDiagramEditorID() != null;
    }

    /**
     * At each selected item this method decides if an associated editor must be opened. 
     * 
     * @param modelObject model
     * @param event command menu event
     * @param selection resource selection
     * @return Set to true if you want to open an editor for this model.
     */
    protected boolean doOpenEditor(final Object modelObject, final ExecutionEvent event, 
            final ISelection selection) {
        return false;
    }

    /**
     * Override this method if you want to do any post-processing.
     * 
     * @param modelObject the model
     */
    protected void postProcess(final Object modelObject) {

    }

    /**
     * 
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        // Get input selection
        final ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();

        if (selection instanceof IStructuredSelection) {
            final Object[] elements = ((IStructuredSelection) selection).toArray();
            final ExecutionEvent fEvent = event;

            // Because the processing could take some time,
            // start a new job and execute the conversion for every selected resource.
            Job job = new Job("Processing model") {
                protected IStatus run(final IProgressMonitor monitor) {
                    monitor.beginTask("Processing model", elements.length);
                    for (Object object : elements) {
                        if (monitor.isCanceled()) {
                            break;
                        }
                        if (object instanceof IFile) {
                            try {
                                // Execute conversion
                                convert(fEvent, (IFile) object, selection);
                            } catch (ExecutionException e) {
                                e.printStackTrace();
                            }
                        }
                        monitor.worked(1);
                    }
                    monitor.done();
                    return Status.OK_STATUS;
                }

            };
            job.setUser(true);
            job.schedule();
        }

        return null;
    }

    /**
     * This method loads the model, starts the transformation and saves the newly generated model.
     * If the derived class says so, a diagram is created and/or an editor is opened.
     * 
     * @param event command menu event
     * @param file resource file
     * @param selection resource selection
     * @throws ExecutionException read/write error
     */
    protected void convert(final ExecutionEvent event, final IFile file, final ISelection selection)
            throws ExecutionException {

        // Create URIs and load the instance with our resource injector
        URI input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        URI output = URI.createURI("");
        EObject model;
        Injector rInjector = createResourceInjector();
        if (rInjector != null) {
            ResourceSet resourceSet = rInjector.getInstance(ResourceSet.class);
            Resource resourceLoad = resourceSet.getResource(input, true);
            model = resourceLoad.getContents().get(0);
        }
        else {
            // Try to load SCCharts model
            XMIResourceImpl inputResource = new XMIResourceImpl(input);            
            // Load SCCharts model
            try {
                inputResource.load(null);
                model = inputResource.getContents().get(0);
            } catch (IOException e) {
                throw new ExecutionException("Could not load SCChart as an XMIResource.", e);
            }
        }

        // Transform the model and unload the resource
        Object transformedObject = transform(model, event, selection);
        model.eResource().unload();

        // Set destination uri
        output = URI.createURI(input.toString());
        output = output.trimFragment();
        output = output.trimFileExtension().appendFileExtension(getTargetExtension(model, event, selection));

        try {
            ResourceSet resSet = new ResourceSetImpl();
            Resource saveRes = resSet.createResource(output);

            if (transformedObject instanceof EObject) {
                EObject transformedModel = (EObject) transformedObject;

                // Create Diagram, if necessary
                // Note: Diagrams created this way are empty
                
                // Deprecated GMF diagram code
                // Diagram diagram = null;
                // if (doCreateDiagram(transformedModel, event, selection)) {
                // diagram = ViewService.createDiagram(transformedModel, getDiagramEditorID(),
                // getPreferencesHint());
                //
                // saveRes.getContents().add(transformedModel);
                // if (diagram != null) {
                // diagram.setElement(transformedModel);
                // // Save both the model and the diagram in one resource
                // saveRes.getContents().add(diagram);
                // }
                //
                // } else {                
                // Save only the model
                saveRes.getContents().add(transformedModel);
                // }
                saveRes.save(getSaveOptions());
                setCharset(WorkspaceSynchronizer.getFile(saveRes));
            }

            // Save text
            if (transformedObject instanceof CharSequence) {
                IPath txtOutputPath = new Path(output.toPlatformString(false).replace("%20", " "));
                IFile txtOutputFile = ModelUtil.convertIPathToIFile(txtOutputPath);
                String txtOutputString = ModelUtil.getAbsoluteFilePath(txtOutputFile);

                CharSequence charSequenceContent = (CharSequence) transformedObject;
                String stringContent = charSequenceContent.toString();

                // Write out model/program
                FileWriter fileWriter = new FileWriter(txtOutputString);
                if (fileWriter != null) {
                    BufferedWriter out = new BufferedWriter(fileWriter);
                    if (out != null) {
                        out.write(stringContent);
                        out.close();
                    }
                }

            }

            // Open associated editor, if necessary
            // Because this code is not execute in the ui thread, this must be done synchronously.
            if (doOpenEditor(transformedObject, event, selection)) {
                openEditorSync(transformedObject);
            }

            // Call post-processing
            postProcess(transformedObject);

        } catch (IOException e) {
            throw new ExecutionException("Cannot write output SCChart file: " + e.getMessage());
        }

        // Refresh the file explorer
        try {
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e2) {
            e2.printStackTrace();
        }

    }

    /**
     * This method calls the method to opens an editor for a model in the context of the ui thread.
     * 
     * @param modelObject model
     */
    protected void openEditorSync(final Object modelObject) {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                openEditor(modelObject);
            }
        });
    }

    /**
     * Open an editor.
     * 
     * @param modelObject model
     */
    protected void openEditor(final Object modelObject) {
        EObject transformedModel = (EObject) modelObject;

        URI uri = EcoreUtil.getURI(transformedModel);
        IFile file2 = ResourcesPlugin.getWorkspace().getRoot()
                .getFile(new Path(uri.toPlatformString(true)));

        IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry()
                .getDefaultEditor(file2.getName());

        final IWorkbenchPage wbPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage();
        FileEditorInput fileInput = new FileEditorInput(file2);
        try {
            wbPage.openEditor(fileInput, desc.getId());
        } catch (PartInitException e) {
            e.printStackTrace();
        }

    }

    /**
     * You can alter the SaveOptions here.
     * 
     * @return Save options
     */
    protected Map<String, String> getSaveOptions() {
        Map<String, String> saveOptions = new HashMap<String, String>();
        saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
        saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
                Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
        return saveOptions;
    }

    /**
     * You can alter the charset here. By default, UTF-8 is chosen.
     * 
     * @param file file
     */
    protected void setCharset(final IFile file) {
        if (file == null) {
            return;
        }
        try {
            file.setCharset("UTF-8", new NullProgressMonitor());
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

}
