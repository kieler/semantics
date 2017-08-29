/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.klighd.internal;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * This class contains utility methods for handling emf models.
 * 
 * @author als
 * @kieler.design 2015-09-30 proposed
 * @kieler.rating 2015-09-30 proposed yellow
 */
public final class ModelUtil {
    /**
     * Prevent instantiation.
     */
    private ModelUtil() {
    }

    /**
     * Save a models to the given URI.
     * 
     * @param model
     *            the models to store in the new file
     * @param uri
     *            the target file URI
     * @throws IOException
     *             if an error occurs while saving
     */
    public static void saveModel(final EObject model, final URI uri) throws IOException {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();
        // Create a resource for this file.
        Resource resource = resourceSet.createResource(uri);
        // Add the model objects to the contents.
        resource.getContents().add(model);
        // Save the contents of the resource to the file system.
        resource.save(Collections.EMPTY_MAP);
    }
}
