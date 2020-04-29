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
import org.eclipse.jdt.ui.JavaUI
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.IField
import org.eclipse.ui.IStartup
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.progress.UIJob
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.runtime.ICoreRunnable
import org.eclipse.core.runtime.CoreException
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.DebugBreakpointManager
import org.eclipse.jdt.internal.ui.javaeditor.CompilationUnitEditor
import org.eclipse.ui.IEditorPart

/**
 * Listener to couple the active editor with the diagram view.
 * 
 * @author peu
 */
class DebugDiagramPartListener implements IPartListener2, IStartup {
    
    /**
     * Ensures that the listener is registered on startup.
     * 
     * {@inheritDoc}
     */
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
                        }
                }
            }
        }
        if (page !== null) {
            page.addPartListener(this)
            page.getReference(page.activeEditor).partOpened        
        }
    }
    
    /**
     * Used to detect when the editor tab has changed.
     * 
     * {@inheritDoc}
     */
    override partBroughtToTop(IWorkbenchPartReference partRef) {
        if (partRef === null) {
            return
        }
        
        val part = partRef.getPart(false)
        if (part instanceof CompilationUnitEditor) {
            // Extract model path from editor
            val typeRoot = JavaUI.getEditorInputTypeRoot(part.editorInput)
            val compilationUnit = (typeRoot.getAdapter(ICompilationUnit) as ICompilationUnit)
            val originalVars = <IField>newLinkedList
            if (compilationUnit !== null) {
                for (type : compilationUnit.allTypes) {
                    originalVars.addAll(type.fields.filter[it.elementName == "ORIGINAL_SCCHART"])
                }
            }
            if (!originalVars.empty) {
                val doc = part.documentProvider.getDocument(part.editorInput)
                val lineNumber = doc.getLineOfOffset(originalVars.head.sourceRange.offset)
                val lineOffset = doc.getLineOffset(lineNumber)
                val lineLength = doc.getLineLength(lineNumber)
                val modelPath = doc.get(lineOffset, lineLength).split(" = ").last.replaceAll("[\";]", "").trim
                // Use a Job to load the breakpoints to not block the main thread
                val modelJob = Job.create("Load model", new ICoreRunnable {
                    
                    override run(IProgressMonitor monitor) throws CoreException {
                        DebugBreakpointManager.instance.setModel(modelPath)
                        DebugBreakpointManager.instance.loadBreakpoints(compilationUnit.resource)                
                    }
                })
                modelJob.schedule
                
            } else {
                DebugBreakpointManager.instance.clearModel
            }
        } else if (part instanceof IEditorPart) {
            DebugBreakpointManager.instance.clearModel
        }
    }
    
    override partClosed(IWorkbenchPartReference partRef) {
        if (partRef === null) {
            return
        }
        val part = partRef.getPart(false)
        // Ensure that no properties of a closed view are accessed
        if (part instanceof DebugDiagramView) {
            DebugDiagramView.clearInstance
        }
    }
    
    /**
     * Used to detect a new editor or the DebugDiagramView opening.
     * 
     * {@inheritDoc}
     */
    override partOpened(IWorkbenchPartReference partRef) {
        if (partRef === null) {
            return
        }
        val part = partRef.getPart(false)
        if (part instanceof DebugDiagramView) {
            val page = part.site.page
            
            // delayed to prevent KLighD init error
            new UIJob("Display Model") {
                override IStatus runInUIThread(IProgressMonitor monitor) {
                    DebugBreakpointManager.instance.clearModel
                    page.getReference(page.activeEditor).partOpened
                    return Status.OK_STATUS;
                }
            }.schedule(2)
        } else if (part instanceof CompilationUnitEditor) {
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
                val modelPath = doc.get(lineOffset, lineLength).split(" = ").last.replaceAll("[\";]", "").trim
                DebugBreakpointManager.instance.setModel(modelPath)
                DebugBreakpointManager.instance.loadBreakpoints(compilationUnit.resource)                
            } else {
                DebugBreakpointManager.instance.clearModel
            }
        }
    }
    
    override partDeactivated(IWorkbenchPartReference partRef) {
        // unsupported
    }
    
    override partHidden(IWorkbenchPartReference partRef) {
        // unsupported
    }
    
    override partInputChanged(IWorkbenchPartReference partRef) {
        // unsupported
    }
    
    override partVisible(IWorkbenchPartReference partRef) {
        // unsupported
    }
    override partActivated(IWorkbenchPartReference partRef) {
        // unsupported
    }
}