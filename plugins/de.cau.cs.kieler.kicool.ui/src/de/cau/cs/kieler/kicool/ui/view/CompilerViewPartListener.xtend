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

import org.eclipse.swt.events.DisposeEvent
import org.eclipse.swt.events.DisposeListener
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IEditorReference
import org.eclipse.ui.IPartListener2
import org.eclipse.ui.IWorkbenchPartReference
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.part.EditorPart

/**
 * Own PartListener for the compilation view
 * 
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class CompilerViewPartListener implements IPartListener2 {
    
    private CompilerView view
    
    new(CompilerView view, Composite parent) {
        this.view = view
        
        val listener = this
        view.getSite.getPage.addPartListener(listener)
        parent.addDisposeListener(new DisposeListener {
            override void widgetDisposed(DisposeEvent e) {
                view.getSite.getPage.removePartListener(listener);
            }
        });        
    }
    
    def updateCompilerView(IWorkbenchPartReference partRef) {
        if (partRef === null) return
        val part = partRef.getPart(true)
        if (part instanceof EditorPart) {
            if (view.editPartSystemManager.activeEditor !== part) {
                view.editPartSystemManager.activeEditor = part
                view.systemSelectionManager.updateSystemList
                view.editPartSystemManager.intermediateSelection = null 
                view.updateView
            }
        }
    }    
    
    override partActivated(IWorkbenchPartReference partRef) {
        updateCompilerView(partRef)
    }
    
    override partBroughtToTop(IWorkbenchPartReference partRef) {
    }
    
    override partClosed(IWorkbenchPartReference partRef) {
        if (partRef === null) return
        val part = partRef.getPart(true)
        if (part instanceof EditorPart) {
            // view.editPartSystemManager.removeSystem(part)
            view.editPartSystemManager.removeAttachedContextFromEditor(part)
        }
    }
    
    override partDeactivated(IWorkbenchPartReference partRef) {
    }
    
    override partHidden(IWorkbenchPartReference partRef) {
    }
    
    override partInputChanged(IWorkbenchPartReference partRef) {
    }
    
    override partOpened(IWorkbenchPartReference partRef) {
        val part = partRef.getPart(false)
        if (part === null) return;
        if (part instanceof CompilerView) {
            val activePartRef = activeEditorReference
            if (activePartRef !== null) {
                updateCompilerView(activePartRef)
            }
            view.updateView
        }
    }
    
    override partVisible(IWorkbenchPartReference partRef) {
    }
    
    public static def IEditorPart getActiveEditor() {
        PlatformUI.getWorkbench.getActiveWorkbenchWindow.getActivePage.getActiveEditor
    }
    
    public static def IEditorReference getActiveEditorReference() {
        val activePage = PlatformUI.getWorkbench.getActiveWorkbenchWindow.getActivePage
        val activeEditor = activePage.activeEditor
        for(reference : activePage.editorReferences) {
            val editor = reference.getEditor(false)
            if (editor !== null && editor.equals(activeEditor)) return reference
        }
        return null
    }
    
}