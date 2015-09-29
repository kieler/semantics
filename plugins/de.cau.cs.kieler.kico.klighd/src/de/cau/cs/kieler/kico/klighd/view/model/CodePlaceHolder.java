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
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.view.model;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.util.StringInputStream;

/**
 * Placeholder for a huge text or code.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class CodePlaceHolder implements ISaveableModel {

    /** The default editor. */
    private final static String DEFAULT_EDITOR = "org.eclipse.ui.DefaultTextEditor";

    /** Content. */
    protected String code;

    /** Name of program represented by code. */
    protected String name;

    /** ID of the editor to open. */
    protected String editorID;

    /** The file/resource extension. */
    protected String resourceExtension;

    /**
     * Creates a CodePlaceHolder for given code.
     * 
     * @param name
     *            The name of the file/code
     * @param code
     *            The content
     */
    public CodePlaceHolder(String name, String code) {
        this(name, code, null, "txt");
    }

    /**
     * Creates a CodePlaceHolder for given code with specified editor.
     * 
     * @param name
     *            The name of the file/code
     * @param code
     *            The content
     * @param editorID
     *            The editor to open
     * @param resourceExtension
     *            The file/resource extension for the code type
     */
    public CodePlaceHolder(String name, String code, String editorID, String resourceExtension) {
        super();
        this.name = name;
        this.code = code;
        this.editorID = editorID;
        this.resourceExtension = resourceExtension;
    }

    // -- Save
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(IFile file, URI uri) throws Exception {
        // save to text file (create it if necessary)
        if (!file.exists()) {
            file.create(new StringInputStream(getCode()), 0, null);
        } else {
            file.setContents(new StringInputStream(getCode()), 0, null);
        }
    }

    // -- Getters
    // -------------------------------------------------------------------------

    /**
     * @return the code string, never null
     */
    public String getCode() {
        return code == null ? "" : code;
    }

    /**
     * @return name of program represented by code, never null
     */
    public String getName() {
        return name == null ? "" : name;
    }

    /**
     * @return the editorID
     */
    public String getEditorID() {
        return editorID != null ? editorID : DEFAULT_EDITOR;
    }

    /**
     * @return the resource extension, never null
     */
    public String getResourceExtension() {
        return resourceExtension == null ? "" : resourceExtension;
    }
}
