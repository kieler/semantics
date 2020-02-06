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
package de.cau.cs.kieler.sccharts.ui.debug.view

import org.eclipse.ui.IPartListener2
import org.eclipse.ui.IWorkbenchPartReference
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.events.DisposeListener
import org.eclipse.swt.events.DisposeEvent
import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor
import org.eclipse.jdt.ui.JavaUI
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.IJavaElement
import org.eclipse.jdt.core.IField
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.DebugBreakpointManager
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.JavaBreakpointListener
import org.eclipse.core.resources.ResourcesPlugin

/**
 * @author stu121235
 *
 */
class DebugDiagramPartListener implements IPartListener2 {
    
    private var DebugDiagramView view;
    
    new(DebugDiagramView view, Composite parent) {
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
//        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override partBroughtToTop(IWorkbenchPartReference partRef) {
        println("Part brought to top!")
        if (partRef === null) {
            return
        }
        
        val part = partRef.getPart(false)
        if (part instanceof JavaEditor) {
            val typeRoot = JavaUI.getEditorInputTypeRoot(part.editorInput)
            val compilationUnit = (typeRoot.getAdapter(ICompilationUnit) as ICompilationUnit)
            val originalVars = <IField>newLinkedList
            for (type : compilationUnit.allTypes) {
                originalVars.addAll(type.fields.filter[it.elementName == "ORIGINAL_SCCHART"])
            }
            
            if (!originalVars.empty) {
                val doc = part.documentProvider.getDocument(part.editorInput)
                val lineNumber = doc.getLineOfOffset(originalVars.head.sourceRange.offset)
                val lineOffset = doc.getLineOffset(lineNumber)
                val lineLength = doc.getLineLength(lineNumber)
                val modelPath = doc.get(lineOffset, lineLength).split(" = ").last.replaceAll("[;\n\"]", "")
                JavaBreakpointListener.instance.setModel(modelPath)
                JavaBreakpointListener.instance.loadBreakpoints(compilationUnit.resource)                
            } else {
                JavaBreakpointListener.instance.clearModel
            }
        }
    }
    
    override partClosed(IWorkbenchPartReference partRef) {
        if (partRef === null) {
            return
        }
        val part = partRef.getPart(false)
        // Ensure that no properties of a closed view are accessed
        if (part instanceof DebugDiagramView) {
            // TODO debug
            println("Clearing instance...")
            DebugDiagramView.clearInstance
        }
//        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override partDeactivated(IWorkbenchPartReference partRef) {
//        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override partHidden(IWorkbenchPartReference partRef) {
//        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override partInputChanged(IWorkbenchPartReference partRef) {
//        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override partOpened(IWorkbenchPartReference partRef) {
        println("part opened")
        if (partRef === null) {
            return
        }
        val part = partRef.getPart(false)
        if (part instanceof DebugDiagramView) {
            DebugDiagramView.setInstance(part)
        } else if (part instanceof JavaEditor) {
            val typeRoot = JavaUI.getEditorInputTypeRoot(part.editorInput)
            val compilationUnit = (typeRoot.getAdapter(ICompilationUnit) as ICompilationUnit)
            val originalVars = <IField>newLinkedList
            for (type : compilationUnit.allTypes) {
                originalVars.addAll(type.fields.filter[it.elementName == "ORIGINAL_SCCHART"])
            }
            
            if (!originalVars.empty) {
                val doc = part.documentProvider.getDocument(part.editorInput)
                val lineNumber = doc.getLineOfOffset(originalVars.head.sourceRange.offset)
                val lineOffset = doc.getLineOffset(lineNumber)
                val lineLength = doc.getLineLength(lineNumber)
                val modelPath = doc.get(lineOffset, lineLength).split(" = ").last.replaceAll("[;\n\"]", "")
                JavaBreakpointListener.instance.setModel(modelPath)
                JavaBreakpointListener.instance.loadBreakpoints(compilationUnit.resource)                
            } else {
                JavaBreakpointListener.instance.clearModel
            }
        }
    }
    
    override partVisible(IWorkbenchPartReference partRef) {
//        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
}