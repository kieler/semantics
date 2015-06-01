/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd;

import org.eclipse.ui.IEditorPart;

/**
 * Interface for listening for activation of an editor and save events in the active editor.
 * 
 * @author als
 * @kieler.design 2015-03-25 proposed
 * @kieler.rating 2015-03-25 proposed yellow
 */
public interface IActiveEditorListener {

    /**
     * Indicates that the given editor is now the active editor.
     * 
     * @param editor new active editor
     */
    public abstract void activeEditorSaved(IEditorPart editor);

    /**
     * Indicates that the active editor was saved and may changed its content.
     * 
     * @param editor saved editor
     */
    public abstract void activeEditorChanged(IEditorPart editor);

}
