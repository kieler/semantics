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
package de.cau.cs.kieler.sccharts.debug;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.IBreakpointListener;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.emf.ecore.EObject;
import de.cau.cs.kieler.sccharts.debug.ui.BreakpointVisualizationHook;
import de.cau.cs.kieler.sccharts.debug.ui.SCChartsBreakpointTargetAdapter;

/**
 * This class listens to adding breakpoints, changing them or removing them. According to the event
 * the highlighting is delegated so breakpoints are visualized.
 * 
 * @author lgr
 *
 */
public class BreakpointListener implements IBreakpointListener {
    
    private BreakpointVisualizationHook visHook = BreakpointVisualizationHook.getInstance();

    /**
     * When a breakpoint is added and enabled, it will get highlighted.
     * 
     * {@inheritDoc}
     */
    @Override
    public void breakpointAdded(IBreakpoint breakpoint) {
        try {
            if (breakpoint.isEnabled()) {
                int line = ((LineBreakpoint) breakpoint).getLineNumber();
                EObject obj = SCChartsBreakpointTargetAdapter.lineToModelElement.get(line);
                visHook.handleHighlight(obj, true);
            }
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    /**
     * When a breakpoint is removed, its highlighting will be removed.
     * 
     * {@inheritDoc}
     */
    @Override
    public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
        try {
            int line = ((LineBreakpoint) breakpoint).getLineNumber();
            EObject obj = SCChartsBreakpointTargetAdapter.lineToModelElement.get(line);
            visHook.handleHighlight(obj, false);
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    /**
     * When a breakpoint is changed, its checked on whether it is still enabled or not. The
     * highlighting will be changed accordingly.
     * 
     * {@inheritDoc}
     */
    @Override
    public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
        try {
            if (delta != null) {
                int line = ((LineBreakpoint) breakpoint).getLineNumber();
                EObject obj = SCChartsBreakpointTargetAdapter.lineToModelElement.get(line);
                if (breakpoint.isEnabled()) {
                    visHook.handleHighlight(obj, true);
                } else {
                    visHook.handleHighlight(obj, false);
                }
            }

        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

}
