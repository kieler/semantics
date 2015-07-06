/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.model;

/**
 * Placeholder of KiCoModelView to represent code.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class CodePlaceHolder {

    /** Code content */
    private final String code;
    
    /** name of program represented by code */
    private final String name;

    /** ID of the editor to open */
    private final String editorID;
    
    /** The file/resource extension. */
    private final String resourceExtension;

    /**
     * Creates a CodePlaceHolder for given code.
     * 
     * @param code
     */
    public CodePlaceHolder(String name, String code) {
        this(name, code, null, "txt");
    }
    
    /**
     * Creates a CodePlaceHolder for given code.
     * 
     * @param code
     */
    public CodePlaceHolder(String name, String code, String editorID, String resourceExtension) {
        super();
        this.name = name;
        this.code = code;
        this.editorID = editorID;
        this.resourceExtension = resourceExtension;
    }

    public String getResourceExtension() {
        return resourceExtension;
    }
    
    /**
     * @return the code string
     */
    public String getCode() {
        return code;
    }

    /**
     * @return name of program represented by code
     */
    public String getName() {
        return name;
    }

    /**
     * @return the editorID
     */
    public String getEditorID() {
        return editorID != null ? editorID : "org.eclipse.ui.DefaultTextEditor";
    }
    
}
