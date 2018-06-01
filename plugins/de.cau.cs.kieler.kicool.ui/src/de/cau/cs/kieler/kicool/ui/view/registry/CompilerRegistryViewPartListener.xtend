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
package de.cau.cs.kieler.kicool.ui.view.registry

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
 * Own PartListener for the compilation registry view
 * 
 * @author ssm
 * @kieler.design 2018-06-01 proposed
 * @kieler.rating 2018-06-01 proposed yellow 
 */
class CompilerRegistryViewPartListener implements IPartListener2 {
    
    private CompilerRegistryView view
    
    new(CompilerRegistryView view, Composite parent) {
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
        view.updateView
    }    
    
    override partActivated(IWorkbenchPartReference partRef) {
        val part = partRef.getPart(false)
        if (part === null) return;
        if (part instanceof CompilerRegistryView) {
            view.updateView
        }
    }
    
    override partBroughtToTop(IWorkbenchPartReference partRef) {
    }
    
    override partClosed(IWorkbenchPartReference partRef) {
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
        if (part instanceof CompilerRegistryView) {
            view.updateView
        }
    }
    
    override partVisible(IWorkbenchPartReference partRef) {
    }
    
}