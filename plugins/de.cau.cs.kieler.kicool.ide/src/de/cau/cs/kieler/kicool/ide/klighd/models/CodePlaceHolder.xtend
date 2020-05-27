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
package de.cau.cs.kieler.kicool.ide.klighd.models

import de.cau.cs.kieler.kicool.compilation.CodeFile
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * Placeholder for a huge text or code.
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 */
class CodePlaceHolder {
    /** 
     * The default editor. 
     */
    public static final String DEFAULT_EDITOR = "org.eclipse.ui.DefaultTextEditor"
    /** 
     * Content. 
     */
    protected String code
    /** 
     * Name of program represented by code. 
     */
    protected String name
    /** 
     * ID of the editor to open. 
     */
    protected String editorID
    /** 
     * The file/resource extension. 
     */
    protected String resourceExtension
    /** 
     * Optional CodeFile represented by this placeholder 
     */
    @Accessors
    protected CodeFile codeFile
    /** 
     * Adjustable type label.
     */
    @Accessors
    protected String typeLabel = "CODE"

    /** 
     * Creates a CodePlaceHolder for given code.
     * @param nameThe name of the file/code
     * @param codeThe content
     */
    new(String name, String code) {
        this(name, code, null, "txt")
    }

    /** 
     * Creates a CodePlaceHolder for given code.
     * @param nameThe name of the file/code
     * @param codeThe content
     */
    new(CodeFile codeFile) {
        this(codeFile.getFileName(), codeFile.getCode(), null,
            if(codeFile.getFileName().contains(".")) codeFile.getFileName().substring(
                codeFile.getFileName().lastIndexOf(".") + 1) else "txt")
        this.codeFile = codeFile
    }

    /** 
     * Creates a CodePlaceHolder for given code with specified editor.
     * @param nameThe name of the file/code
     * @param codeThe content
     * @param editorIDThe editor to open
     * @param resourceExtensionThe file/resource extension for the code type
     */
    new(String name, String code, String editorID, String resourceExtension) {
        super()
        this.name = name
        this.code = code
        this.editorID = editorID
        this.resourceExtension = resourceExtension
    }

    // -- Save
    // -------------------------------------------------------------------------
    /** 
     * {@inheritDoc}
     */
    override String toString() {
        return getCode()
    }

    // -- Getters
    // -------------------------------------------------------------------------
    /** 
     * @return the code string, never null
     */
    def String getCode() {
        return if(code === null) "" else code
    }

    /** 
     * @return name of program represented by code, never null
     */
    def String getName() {
        return if(name === null) "" else name
    }

    /** 
     * @return the editorID
     */
    def String getEditorID() {
        return if(editorID !== null) editorID else DEFAULT_EDITOR
    }

    /** 
     * @return the resource extension, never null
     */
    def String getResourceExtension() {
        return if(resourceExtension === null) "" else resourceExtension
    }
}
