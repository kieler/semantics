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
package de.cau.cs.kieler.sccharts.ui.debug

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.runtime.CoreException
import org.eclipse.jface.action.IAction
import org.eclipse.jface.viewers.ISelection
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.IEditorActionDelegate
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.SCChartsBreakpointTargetAdapter
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.SCChartsBreakpointTargetAdapterFactory

/** 
 * This class is used as the Handler for the TextRulerContext command 'Toggle Breakpoint'.
 * Reaction to a double click event enabled through {@link IEditorActionDelegate} but use of
 * editorActions-action is deprecated (see plugin.xml). No other workaround found yet.
 * 
 * @author lgr
 */
class TextRulerHandler extends AbstractHandler implements IEditorActionDelegate {
    
    /** 
     * This class is the entry point when starting a 'Toggle Breakpoint' event from the editor's
     * ruler context.{@inheritDoc}
     */
    override Object execute(ExecutionEvent event) throws ExecutionException {
        delegateToggleToTarget()
        return null // Reserved for future use, must be null.
    }

    /** 
     * {@inheritDoc}
     */
    override void run(IAction action) {
        delegateToggleToTarget()
    }

    def private void delegateToggleToTarget() {
        val editor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor
        val factory = new SCChartsBreakpointTargetAdapterFactory()
        val target = factory.getAdapter(editor,
            SCChartsBreakpointTargetAdapter) as SCChartsBreakpointTargetAdapter
        try {
            target.toggleLineBreakpoints(null, null)
            Display.getDefault().update()
        } catch (CoreException e) {
            e.printStackTrace()
        }

    }

    /** 
     * {@inheritDoc}
     */
    override void selectionChanged(IAction action, ISelection selection) {
    }

    /** 
     * {@inheritDoc}
     */
    override void setActiveEditor(IAction action, IEditorPart targetEditor) {
    }
}
