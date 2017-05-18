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
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI

/**
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
    
    override partActivated(IWorkbenchPartReference partRef) {
        if (partRef == null) return
        val part = partRef.getPart(true)
        if (part instanceof EditorPart) { 
//            val editorTypeID = partRef.getId
//            val currentPartName = editorPart.getPartName
            var system = view.editPartSystemManager.get(part)
            if (system == null) {
               system = view.systemSelectionManager.selectedSystem 
               view.editPartSystemManager.attachSystemToEditPart(part, system)
            }
            view.activeSystem = system
                
            view.updateView
        }
    }
    
    override partBroughtToTop(IWorkbenchPartReference partRef) {
    }
    
    override partClosed(IWorkbenchPartReference partRef) {
        if (partRef == null) return
        val part = partRef.getPart(true)
        if (part instanceof EditorPart) {
            view.editPartSystemManager.remove(part)
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
            view.updateView
        } else if (part instanceof EditorPart) {
            partActivated(partRef)
        }
    }
    
    override partVisible(IWorkbenchPartReference partRef) {
    }
    
}