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
package de.cau.cs.kieler.sccharts.debug.ui.breakpoints;

import java.util.HashMap;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.source.IVerticalRulerInfo;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.debug.SCChartsBreakpoint;
import de.cau.cs.kieler.sccharts.debug.SCChartsDebugPlugin;
import de.cau.cs.kieler.sccharts.debug.ui.SCChartsDebugModelPresentation;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * An Adapter to create breakpoints in .sct-files using the XText Editor. This class gets
 * instantiated by the {@link SCChartsBreakpointTargetAdapterFactory#getAdapter(Object, Class)}
 * adapter factory for the XText editor.
 * 
 * @author lgr
 * 
 */
public class SCChartsBreakpointTargetAdapter implements IToggleBreakpointsTarget {

    /**
     * For the current element, maps a line number to the corresponding EObject.
     */
    public static HashMap<Integer, EObject> lineToModelElement = new HashMap<>();
    
    private static SCChartsBreakpointTargetAdapter instance;

    private IResource activeResource = null;

    public SCChartsBreakpointTargetAdapter() {
        instance = this;
    }

    public static SCChartsBreakpointTargetAdapter getInstance() {
        if (instance == null) {
            instance = new SCChartsBreakpointTargetAdapter();
        }
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toggleLineBreakpoints(IWorkbenchPart part, ISelection selection)
            throws CoreException {
        IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        IEditorPart editor = workbenchWindow.getActivePage().getActiveEditor();

        if (editor != null) {
            ITextEditor textEditor = (ITextEditor) editor;
            IVerticalRulerInfo ruler = textEditor.getAdapter(IVerticalRulerInfo.class);

            // Get needed information to reach breakpoints.
            IResource resource = (IResource) editor.getEditorInput().getAdapter(IResource.class);

            activeResource = resource;
            updateLineEObjectMap();

            int lineNumber = ruler.getLineOfLastMouseButtonActivity();

            IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager()
                    .getBreakpoints(SCChartsDebugModelPresentation.ID);

            // Look for existing breakpoints and delete them if needed.
            for (int i = 0; i < breakpoints.length; i++) {
                IBreakpoint breakpoint = breakpoints[i];
                if (resource.equals(breakpoint.getMarker().getResource())) {
                    int bl;
                    bl = ((LineBreakpoint) breakpoint).getLineNumber();
                    if (bl == (lineNumber + 1)) {
                        SCChartsDebugPlugin.getDefault().setDirtyBreakpointList();
                        breakpoint.delete();
                        return;

                    }
                }
            }

            if (lineToModelElement.containsKey(lineNumber + 1)) {
                // Create a new breakpoint in the specified line.
                SCChartsDebugPlugin.getDefault().setDirtyBreakpointList();
                SCChartsBreakpoint breakpoint = new SCChartsBreakpoint(resource, lineNumber + 1);
                DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(breakpoint);
                DebugPlugin.getDefault().getBreakpointManager().fireBreakpointChanged(breakpoint);
            }
        }
    }

    /**
     * This will updated the map that maps a line number to an EObject.
     */
    public void updateLineEObjectMap(EObject rootObject) {
        lineToModelElement.clear();

        // IPath p = activeResource.getFullPath();
        // HashMap<IPath, EObject> rootMap = KiemPlugin.getOpenedModelRootObjects();
        // EObject rootObject = rootMap.get(p);

        ICompositeNode rootNode = NodeModelUtils.findActualNodeFor((EObject) rootObject);
        Iterable<ILeafNode> leafs = rootNode.getLeafNodes();

        for (ILeafNode leaf : leafs) {
            boolean validLeaf = !(leaf instanceof HiddenLeafNode)
                    && !lineToModelElement.containsValue(leaf.getSemanticElement());
            boolean leafOfInterest = leaf.getSemanticElement() instanceof State
                    || leaf.getSemanticElement() instanceof Transition;
            if (validLeaf && leafOfInterest)
                lineToModelElement.put(leaf.getStartLine(), leaf.getSemanticElement());
        }
    }

    private void updateLineEObjectMap() {
        IPath p = activeResource.getFullPath();
        HashMap<IPath, EObject> rootMap = KiemPlugin.getOpenedModelRootObjects();
        EObject rootObject = rootMap.get(p);
        updateLineEObjectMap(rootObject);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canToggleLineBreakpoints(IWorkbenchPart part, ISelection selection) {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toggleMethodBreakpoints(IWorkbenchPart part, ISelection selection)
            throws CoreException {
        // NOT SUPPORTED
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canToggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) {
        // NOT SUPPORTED
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toggleWatchpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
        // NOT SUPPORTED
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canToggleWatchpoints(IWorkbenchPart part, ISelection selection) {
        // NOT SUPPORTED
        return false;
    }

}
