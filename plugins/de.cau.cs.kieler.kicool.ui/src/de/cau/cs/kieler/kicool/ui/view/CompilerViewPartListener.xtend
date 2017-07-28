/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view

import org.eclipse.ui.IPartListener2
import org.eclipse.ui.IWorkbenchPartReference
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.events.DisposeListener
import org.eclipse.swt.events.DisposeEvent
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
        if (partRef == null) return
        val part = partRef.getPart(true)
        if (part instanceof EditorPart) { 
//            val editorTypeID = partRef.getId
//            val currentPartName = editorPart.getPartName
            var system = view.editPartSystemManager.getSystem(part)
            if (system == null) {
               system = view.systemSelectionManager.selectedSystem 
               view.editPartSystemManager.attachSystemToEditPart(part, system)
            }
            view.activeSystem = system
                
            view.updateView
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
            view.editPartSystemManager.removeSystem(part)
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
        if (part == null) return;
        if (part instanceof CompilerView) {
            val activePartRef = CompilerView.getActiveEditorReference
            if (activePartRef != null) {
                updateCompilerView(activePartRef)
            }
            view.updateView
        } else if (part instanceof EditorPart) {
            updateCompilerView(partRef)
        }
    }
    
    override partVisible(IWorkbenchPartReference partRef) {
    }
    
}