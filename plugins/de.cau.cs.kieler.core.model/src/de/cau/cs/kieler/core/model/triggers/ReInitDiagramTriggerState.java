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
package de.cau.cs.kieler.core.model.triggers;

import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;

/**
 * The state for triggers on the diagram reinitialization.
 * 
 * TODO: Take a look at this code.
 * 
 * @author soh
 */
public class ReInitDiagramTriggerState extends AbstractTriggerState {

    /** The editor. */
    private IEditorPart editor;

    /**
     * 
     * Default constructor for KiVi.
     * 
     */
    public ReInitDiagramTriggerState() {
        super();
    }

    /**
     * 
     * Convenience constructor calling setEditor().
     * 
     * @param editorParam
     *            the editor
     */
    public ReInitDiagramTriggerState(final IEditorPart editorParam) {
        super();
        setEditor(editorParam);
    }

    /**
     * 
     * {@inheritDoc}
     */
    public Class<? extends ITrigger> getTriggerClass() {
        return ReInitDiagramDoneTrigger.class;
    }

    /**
     * Set the editor.
     * 
     * @param editorParam
     *            the editor to set
     */
    public void setEditor(final IEditorPart editorParam) {
        this.editor = editorParam;
    }

    /**
     * Get the editor.
     * 
     * @return the editor
     */
    public IEditorPart getEditor() {
        return editor;
    }

}
