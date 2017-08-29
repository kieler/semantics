/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view

import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.ui.IPartListener2
import org.eclipse.ui.IWorkbenchPartReference
import org.eclipse.ui.part.EditorPart

/**
 * An adapter to listen for the action events of an editor.
 * 
 * @author ssm als
 * @kieler.design 2015-09-29 proposed
 * @kieler.rating 2015-09-29 proposed yellow
 *
 */
public class EditorActionAdapter implements IPropertyListener, IPartListener2 {

    public interface EditorSaveListener {
        def void onEditorSaved(IEditorPart editor)
    }

    public interface EditorCloseListener {
        def void onEditorClosed(IEditorPart editor)
    }

    @Accessors private var EditorSaveListener saveListener = null
    @Accessors private var EditorCloseListener closeListener = null
    private IEditorPart editor

    new(EditorSaveListener saveListener, EditorCloseListener closeListener) {
        this.saveListener = saveListener
        this.closeListener = closeListener
    }

    override void propertyChanged(Object source, int propId) {
        if (editor != null) {
            val sourceEditor = source as IEditorPart
            if (propId == IWorkbenchPartConstants.PROP_DIRTY && !sourceEditor.isDirty()) {
                // dirty flag changed and editor is not dirty -> saved
                if (saveListener != null) saveListener.onEditorSaved(sourceEditor)
            }
        }
    }

    /**
     * Starts listening on the given editor.
     *
     * @param newEditor
     *            the editor
     */
    def void activate(IEditorPart newEditor) {
        if (newEditor != null) {
            if (this.editor != null) {
                this.editor.removePropertyListener(this)
            }
            this.editor = newEditor;
            newEditor.addPropertyListener(this)
            newEditor.site.page.addPartListener(this)
        }
    }

    /**
     * Stops the listening on the current editor.
     */
    def void deactivate() {
        if (editor != null) {
            editor.removePropertyListener(this)
            editor.site.page.removePartListener(this)
        }
    }
    
    override partActivated(IWorkbenchPartReference partRef) {
    }
    
    override partBroughtToTop(IWorkbenchPartReference partRef) {
    }
    
    override partClosed(IWorkbenchPartReference partRef) {
        if (partRef == null) return
        val part = partRef.getPart(true)
        if (part instanceof EditorPart) {
            if (closeListener != null) closeListener.onEditorClosed(part)            
        } 
    }
    
    override partDeactivated(IWorkbenchPartReference partRef) {
    }
    
    override partHidden(IWorkbenchPartReference partRef) {
    }
    
    override partInputChanged(IWorkbenchPartReference partRef) {
    }
    
    override partOpened(IWorkbenchPartReference partRef) {
    }
    
    override partVisible(IWorkbenchPartReference partRef) {
    }

}

    
