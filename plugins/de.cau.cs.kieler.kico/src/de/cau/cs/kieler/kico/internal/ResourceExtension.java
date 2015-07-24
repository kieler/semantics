/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.internal;

/**
 * This is the data class to the extension extension point
 * 
 * @author als
 * 
 */
public class ResourceExtension {
    private final String className;
    private final String extension;
    private final boolean isXMI;
    private final String editorID;

    /**
     * @param className
     * @param extension
     * @param isXMI
     * @param editorID
     */
    public ResourceExtension(String className, String extension, boolean isXMI, String editorID) {
        super();
        this.className = className;
        this.extension = extension;
        this.isXMI = isXMI;
        this.editorID = editorID;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @return the isXMI
     */
    public boolean isXMI() {
        return isXMI;
    }

    /**
     * @return the editorID
     */
    public String getEditorID() {
        return editorID;
    }
}
