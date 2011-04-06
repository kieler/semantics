/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.handlers;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * A command handler that can be used to convert a model from one format into another.
 * 
 * @author msp
 */
public abstract class ConvertModelHandler extends AbstractHandler {

    /** the target file extension. */
    private String targetExtension;

    /**
     * Create a convert model handler for the given target extension.
     * 
     * @param targetExtension
     *            the target file extension
     */
    protected ConvertModelHandler(final String targetExtension) {
        this.targetExtension = targetExtension;
    }

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            Iterator<?> iterator = ((IStructuredSelection) selection).iterator();
            while (iterator.hasNext()) {
                Object object = iterator.next();
                if (object instanceof IFile) {
                    process((IFile) object);
                }
            }
        }
        return null;
    }

    /**
     * Process a source file.
     * 
     * @param file
     *            a source file
     */
    private void process(final IFile file) {

    }

    private List<EObject> readModel(final URI uri) {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();
        // Demand load the resource for this file.
        Resource resource = resourceSet.getResource(uri, true);
        
        return resource.getContents();
    }

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
