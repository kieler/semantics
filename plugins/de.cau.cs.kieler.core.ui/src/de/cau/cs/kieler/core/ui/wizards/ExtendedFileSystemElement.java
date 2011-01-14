/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.core.ui.wizards;

import java.io.File;

import org.eclipse.ui.dialogs.FileSystemElement;


/**
 * A {@code FileSystemElement} representing {@code File}s and carrying extended states.
 * Most importantly, this element tracks whether it has already been visited or not.
 * "Visited" in this context means that someone has already added all subdirectories
 * and subfolders to it. This class is used by {@link FileSystemResourcesPage}.
 * 
 * @author cds
 */
public class ExtendedFileSystemElement extends FileSystemElement {
    /**
     * Whether this element has already been visited or not.
     */
    private boolean visited = false;
    
    
    /**
     * Constructs a new instance.
     * 
     * @param theFile the file represented by this object..
     * @param parent the parent, if any.
     */
    public ExtendedFileSystemElement(final File theFile, final FileSystemElement parent) {
        super(theFile.getName(), parent, theFile.isDirectory());
        
        setFileSystemObject(theFile);
    }
    
    
    /**
     * Checks if the element has already been visited. Visited objects can be trusted to
     * return correct results for {@code getFiles()} and {@code getFolders()}.
     * 
     * @return {@code true} if the element has already been visited, {@code false} otherwise.
     */
    public boolean isVisited() {
        return visited;
    }
    
    /**
     * Indicates that this object has now been visited.
     */
    public void visit() {
        visited = true;
    }
    
    /**
     * Returns the file this object represents.
     * 
     * @return the file.
     */
    public File getFile() {
        return (File) getFileSystemObject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFileSystemObject(final Object value) {
        if (value instanceof File) {
            super.setFileSystemObject(value);
        } else {
            super.setFileSystemObject(null);
        }
    }
    
}
