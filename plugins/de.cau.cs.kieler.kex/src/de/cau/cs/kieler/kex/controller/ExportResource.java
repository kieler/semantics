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
package de.cau.cs.kieler.kex.controller;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

/**
 * Export resources are resources with a {@link IResource}, a localPath {@link IPath} and a flag
 * directOpen.
 * 
 * @author pkl
 * 
 */
public class ExportResource {

    private final IResource resource;

    private final IPath localPath;

    private boolean directOpen;

    /**
     * Creates a new export resource with a {@link IResource} and a {@link IPath}.
     * 
     * @param resourceParam
     *            , {@link IResource}
     * @param localPathParam
     *            , {@link IPath}
     */
    public ExportResource(final IResource resourceParam, final IPath localPathParam) {
        this.resource = resourceParam;
        this.localPath = localPathParam;
    }

    /**
     * Getter for resource.
     * 
     * @return {@link IResource}
     */
    public IResource getResource() {
        return resource;
    }

    /**
     * Getter for local path.
     * 
     * @return {@link IPath}
     */
    public IPath getLocalPath() {
        return localPath;
    }

    /**
     * Setter for direct open attribute.
     * 
     * @param directOpenParam
     *            , boolean
     */
    public void setDirectOpen(final boolean directOpenParam) {
        this.directOpen = directOpenParam;
    }

    /**
     * Getter for direct open attribute.
     * 
     * @return boolean
     */
    public boolean isDirectOpen() {
        return directOpen;
    }

}
