/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.model.CoreModelPlugin;

/**
 * A command handler that can be used to convert a model from one format into another.
 * 
 * @author msp
 * @kieler.rating proposed yellow 2012-11-06 cds msp
 * @kieler.design proposed 2012-11-06 cds msp
 */
public class ConvertModelHandler extends AbstractHandler {

    /** parameter id for the target file extension. */
    private static final String PARAM_TARGET_EXT = "de.cau.cs.kieler.convert.targetExtension";
    
    /** the target file extension. */
    private String targetExtension;

    /**
     * Set the target file extension.
     * 
     * @param extension the new target file extension
     */
    public final void setTargetExtension(final String extension) {
        this.targetExtension = extension;
    }
    
    /**
     * {@inheritDoc}
     */
    public final Object execute(final ExecutionEvent event) throws ExecutionException {
        targetExtension = event.getParameter(PARAM_TARGET_EXT);
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection && targetExtension != null) {
            final Object[] elements = ((IStructuredSelection) selection).toArray();

            // put the conversion into a job with a progress bar,
            // because the conversion may take a while :-/ 
            Job job = new Job("convert model") {
                protected IStatus run(final IProgressMonitor monitor) {
                    monitor.beginTask("Convert model", elements.length);
                    for (Object object : elements) {
                        if (monitor.isCanceled()) {
                            break;
                        }
                        if (object instanceof IFile) {
                            convert((IFile) object);
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
     * Process a source file.
     * 
     * @param file a source file
     */
    public final void convert(final IFile file) {
        try {
            List<EObject> sourceModels = readModel(URI.createPlatformResourceURI(
                    file.getFullPath().toString(), false));
            List<EObject> targetModels = new ArrayList<EObject>(sourceModels.size());
            for (EObject model : sourceModels) {
                EObject copy = EcoreUtil.copy(model);
                transform(copy);
                targetModels.add(copy);
            }
            saveModel(targetModels, createTarget(file));
        } catch (IOException exception) {
            IStatus status = new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID,
                    "Error while converting the selected model.", exception);
            StatusManager.getManager().handle(status, StatusManager.SHOW);
        }
    }
    
    /**
     * Transform the model before it is written to the new file format.
     * 
     * @param model a model instance
     */
    protected void transform(final EObject model) {
        // default implementation does nothing, implement this in a subclass
    }
    
    /**
     * Create a target file URI from a source file.
     * 
     * @param file a source file
     * @return a target file URI with the specified extension
     */
    private URI createTarget(final IFile file) {
        IPath basePath = file.getFullPath();
        String name = basePath.removeFileExtension().lastSegment();
        IPath targetPath = new Path(name + "." + targetExtension);
        int i = 0;
        IContainer parent = file.getParent();
        while (parent.exists(targetPath)) {
            targetPath = new Path(name + (++i) + "." + targetExtension);
        }
        targetPath = parent.getFullPath().append(targetPath);
        return URI.createPlatformResourceURI(targetPath.toString(), false);
    }

    /**
     * Read the model contents from the given URI.
     * 
     * @param uri the source file URI
     * @return a collection of models that were read
     */
    private List<EObject> readModel(final URI uri) {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();
        // Demand load the resource for this file.
        Resource resource = resourceSet.getResource(uri, true);
        return resource.getContents();
    }

    /**
     * Save a collection of models to the given URI.
     * 
     * @param models the models to store in the new file
     * @param uri the target file URI
     * @throws IOException if an error occurs while saving
     */
    private void saveModel(final List<EObject> models, final URI uri) throws IOException {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();
        // Create a resource for this file.
        Resource resource = resourceSet.createResource(uri);
        // Add the model objects to the contents.
        resource.getContents().addAll(models);
        // Save the contents of the resource to the file system.
        resource.save(Collections.EMPTY_MAP);
    }

}
