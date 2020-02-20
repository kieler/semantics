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
import org.eclipse.jdt.core.IField
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.JavaBreakpointListener
import org.eclipse.ui.IStartup
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PlatformUI
import de.cau.cs.kieler.klighd.ui.view.model.MessageModel
import org.eclipse.ui.progress.UIJob
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.runtime.ICoreRunnable
import org.eclipse.core.runtime.CoreException

/**
 * @author stu121235
 *
 */
class DebugDiagramPartListener implements IPartListener2, IStartup {
    
    override earlyStartup() {
        var IWorkbenchPage page = null
        var IWorkbenchWindow window = PlatformUI.workbench.activeWorkbenchWindow
        if (window !== null) {
            page = window.activePage
        }

        if (page === null) {
            // Look for a window and find the associated page
            var IWorkbenchWindow[] windows = PlatformUI.workbench.workbenchWindows
            for (var i = 0; i < windows.length; i++) {
                val currWindow = windows.get(i)
                if (currWindow !== null) {
                        window = currWindow
                        page = currWindow.activePage
                        if (page !== null) {
                            // ugly fix for missing break in xtend
                            i = windows.length
                            println("found a page!")
                        }
                }
            }
        }
        page.addPartListener(this)
        
        val editor = page.activeEditor
        page.getReference(page.activeEditor).partOpened        
    }
    
    override partActivated(IWorkbenchPartReference partRef) {
//        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override partBroughtToTop(IWorkbenchPartReference partRef) {
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
                
                val modelJob = Job.create("Load model", new ICoreRunnable {
                    
                    override run(IProgressMonitor monitor) throws CoreException {
                        JavaBreakpointListener.instance.setModel(modelPath)
                        JavaBreakpointListener.instance.loadBreakpoints(compilationUnit.resource)                
                    }
                })
                modelJob.schedule
                
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
//            JavaBreakpointListener.instance.clearModel
        }
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
//            DebugDiagramView.setInstance(part)
            val page = part.site.page
            
            // delayed to prevent KLighD init error
            new UIJob("Display Model") {
                override IStatus runInUIThread(IProgressMonitor monitor) {
                    JavaBreakpointListener.instance.clearModel
                    page.getReference(page.activeEditor).partOpened
                    return Status.OK_STATUS;
                }
            }.schedule(2)
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