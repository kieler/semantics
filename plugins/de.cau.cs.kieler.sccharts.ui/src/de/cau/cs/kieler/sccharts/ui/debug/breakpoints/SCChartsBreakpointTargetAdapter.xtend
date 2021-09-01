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
package de.cau.cs.kieler.sccharts.ui.debug.breakpoints

import de.cau.cs.kieler.kicool.ui.klighd.ModelReaderUtil
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.ui.debug.SCChartsDebugModelPresentation
import java.util.HashMap
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.model.LineBreakpoint
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.source.IVerticalRulerInfo
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.texteditor.ITextEditor
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.ui.editor.XtextEditor

/** 
 * An Adapter to create breakpoints in .sct-files using the XText Editor. This class gets
 * instantiated by the {@link SCChartsBreakpointTargetAdapterFactory#getAdapter(Object, Class)}adapter factory for the XText editor.
 * 
 * @author lgr
 */
class SCChartsBreakpointTargetAdapter implements IToggleBreakpointsTarget {
    /** 
     * For the current element, maps a line number to the corresponding EObject.
     */
    public static HashMap<Integer, EObject> lineToModelElement = new HashMap()
    static SCChartsBreakpointTargetAdapter instance
    IResource activeResource = null

    new() {
        instance = this
    }

    def static SCChartsBreakpointTargetAdapter getInstance() {
        if (instance === null) {
            instance = new SCChartsBreakpointTargetAdapter()
        }
        return instance
    }

    /** 
     * {@inheritDoc}
     */
    override void toggleLineBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
        val workbenchWindow = PlatformUI.workbench.activeWorkbenchWindow
        val editor = workbenchWindow.activePage.activeEditor
        if (editor !== null) {
            val textEditor = editor as ITextEditor
            val ruler = textEditor.getAdapter(IVerticalRulerInfo) as IVerticalRulerInfo
            // Get needed information to reach breakpoints.
            val resource = editor.editorInput.getAdapter(IResource) as IResource
            val edit = editor as XtextEditor
            val rootObject = ModelReaderUtil.readModelFromEditor(edit) as EObject
            activeResource = resource
            updateLineEObjectMap(rootObject)
            val lineNumber = ruler.lineOfLastMouseButtonActivity
            val breakpoints = DebugPlugin.^default.breakpointManager.getBreakpoints(
                SCChartsDebugModelPresentation.ID)
            // Look for existing breakpoints and delete them if needed.
            for (var int i = 0; i < breakpoints.length; i++) {
                val breakpoint = breakpoints.get(i)
                
                if (resource.equals(breakpoint.marker.resource)) {
                    val bl = (breakpoint as LineBreakpoint).lineNumber
                    if (bl === lineNumber + 1) {
                        BreakpointUtility.instance.setDirtyBreakpointList();
                        breakpoint.delete()
                        return;
                    }
                }
            }
            if (lineToModelElement.containsKey(lineNumber + 1)) {
                BreakpointUtility.instance.setDirtyBreakpointList();
                val breakpoint = new SCChartsBreakpoint(resource, lineNumber + 1)
                DebugPlugin.^default.breakpointManager.addBreakpoint(breakpoint)
                DebugPlugin.^default.breakpointManager.fireBreakpointChanged(breakpoint)
            }
        }
    }

    /** 
     * This will updated the map that maps a line number to an EObject.
     */
    def void updateLineEObjectMap(EObject rootObject) {
        lineToModelElement.clear()
//        val p = activeResource.getFullPath()
        val rootNode = NodeModelUtils.findActualNodeFor(rootObject as EObject)
        if (rootNode !== null) {
            val leafs = rootNode.leafNodes
            for (leaf : leafs) {
                val validLeaf = !(leaf instanceof HiddenLeafNode) &&
                    !lineToModelElement.containsValue(leaf.semanticElement)
                val leafOfInterest = leaf.semanticElement instanceof State ||
                    leaf.semanticElement instanceof Transition
                if(validLeaf && leafOfInterest) {
                    lineToModelElement.put(leaf.startLine, leaf.semanticElement)
                }
            }
        }
    }

    /** 
     * {@inheritDoc}
     */
    override boolean canToggleLineBreakpoints(IWorkbenchPart part, ISelection selection) {
        return true
    }

    /** 
     * {@inheritDoc}
     */
    override void toggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException { // NOT SUPPORTED
    }

    /** 
     * {@inheritDoc}
     */
    override boolean canToggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) {
        // NOT SUPPORTED
        return false
    }

    /** 
     * {@inheritDoc}
     */
    override void toggleWatchpoints(IWorkbenchPart part, ISelection selection) throws CoreException { // NOT SUPPORTED
    }

    /** 
     * {@inheritDoc}
     */
    override boolean canToggleWatchpoints(IWorkbenchPart part, ISelection selection) {
        // NOT SUPPORTED
        return false
    }
}
