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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.jface.text.source.IVerticalRulerInfo;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;

import de.cau.cs.kieler.sccharts.debug.core.breakpoints.SCChartsBreakpoint;
import de.cau.cs.kieler.sccharts.debug.ui.presentation.SCChartsDebugModelPresentation;

/**
 * An Adapter to create breakpoints in .sct-files using the XText Editor. This
 * class gets instantiated by the
 * {@link SCChartsBreakpointTargetAdapterFactory#getAdapter(Object, Class)}
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
	public void toggleLineBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		if (editor != null) {
		    IVerticalRulerInfo ruler = (IVerticalRulerInfo) ((ITextEditor) editor).getAdapter(IVerticalRulerInfo.class);
		    
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
						breakpoint.delete();
						return;

					}
				}
			}
			
			// Create a new breakpoint in the specified line.
			SCChartsBreakpoint breakpoint = new SCChartsBreakpoint(resource, lineNumber + 1);
			DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(breakpoint);
			DebugPlugin.getDefault().getBreakpointManager().fireBreakpointChanged(breakpoint);
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
	public void toggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
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
