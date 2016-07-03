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
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.source.IVerticalRulerInfo;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.formatting.impl.NodeModelStreamer;
import org.eclipse.xtext.formatting2.regionaccess.internal.NodeModelBasedRegionAccess;
import org.eclipse.xtext.nodemodel.BidiIterable;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.NodeModelBuilder;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.sequencer.NodeModelSemanticSequencer;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.ITextRegionWithLineInformation;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.debug.SCChartsBreakpoint;
import de.cau.cs.kieler.sccharts.debug.SCChartsDebugPlugin;
import de.cau.cs.kieler.sccharts.debug.ui.SCChartsDebugModelPresentation;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * An Adapter to create breakpoints in .sct-files using the XText Editor. This class gets
 * instantiated by the {@link SCChartsBreakpointTargetAdapterFactory#getAdapter(Object, Class)}
 * adapter factory for the XText editor.
 * 
 * TODO: filter if breakpoint position is reasonable
 * 
 * @author lgr
 */
public class SCChartsBreakpointTargetAdapter implements IToggleBreakpointsTarget {

    /**
     * {@inheritDoc}
     */
    @Override
    public void toggleLineBreakpoints(IWorkbenchPart part, ISelection selection)
            throws CoreException {
        IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .getActiveEditor();

        if (editor != null) {
            IVerticalRulerInfo ruler = (IVerticalRulerInfo) ((ITextEditor) editor)
                    .getAdapter(IVerticalRulerInfo.class);

            // Get needed information to reach breakpoints.
            IResource resource = (IResource) editor.getEditorInput().getAdapter(IResource.class);
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

            IPath p = KiemPlugin.getCurrentModelFile();
            EObject e = KiemPlugin.getOpenedModelRootObjects().get(p);

            ICompositeNode node = NodeModelUtils.findActualNodeFor(e);

            Iterable<ILeafNode> leafs = node.getLeafNodes();
            HashMap<Integer, String> map = new HashMap<Integer, String>();
            StringBuffer text = new StringBuffer();

            int counter = 1;
            for (ILeafNode leaf : leafs) {
                System.out.println();
                if (counter < leaf.getEndLine()) {
                    map.put(counter, text.toString().replaceAll("\\s", ""));
                    text = new StringBuffer();
                    counter++;
                }
                text.append(leaf.getText());
            }
            if (isValidString(map.get(lineNumber + 1))) {
                // Create a new breakpoint in the specified line.
                SCChartsDebugPlugin.getDefault().setDirtyBreakpointList();
                SCChartsBreakpoint breakpoint = new SCChartsBreakpoint(resource, lineNumber + 1);
                DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(breakpoint);
                DebugPlugin.getDefault().getBreakpointManager().fireBreakpointChanged(breakpoint);
            }
            
            for (int i = 0; i < map.size(); i++) {
                System.out.println(i + " " + map.get(i));
            }
        }
    }

    private boolean isValidString(String s) {
        if (s.contains("state") || s.contains("-->") || s.contains(">->") || s.contains("o->")) {
            return true;
        } else {
            return false;
        }

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
