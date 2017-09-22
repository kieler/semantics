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

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;

import de.cau.cs.kieler.sccharts.debug.ui.SCChartsDebugModelPresentation;

/**
 * Line Breakpoints are represented and are designed for SCCharts.
 * 
 * @author lgr
 *
 */
public class SCChartsBreakpoint extends LineBreakpoint {

    /**
     * This constructor is still needed for internal reasons.
     */
    public SCChartsBreakpoint() {
    }

    /**
     * Creates a new breakpoint using {@link #SCChartsBreakpoint(IResource, int, boolean)} as a
     * constructor with the {@code persistent} variable set to true.
     * 
     * @param resource
     *            The resource that the breakpoint should be added to.
     * @param lineNumber
     *            The specified line, where the breakpoint is defined.
     * @throws CoreException
     *             If a CoreException occurs performing
     *             {@link #run(org.eclipse.core.runtime.jobs.ISchedulingRule, IWorkspaceRunnable)} .
     */
    public SCChartsBreakpoint(final IResource resource, final int lineNumber) throws CoreException {
        this(resource, lineNumber, true);
    }

    /** 
     * Constructor for creating a breakpoint.
     * 
     * @param resource
     *            The resource that the breakpoint should be added to.
     * @param lineNumber
     *            The specified line, where the breakpoint is laid.
     * @param persistent
     *            Indicates whether the breakpoint is persistent.
     * @throws CoreException
     *             If a CoreException occurs performing
     *             {@link #run(org.eclipse.core.runtime.jobs.ISchedulingRule, IWorkspaceRunnable)} .
     */
    protected SCChartsBreakpoint(final IResource resource, final int lineNumber,
            final boolean persistent) throws CoreException {
        IWorkspaceRunnable runnable = new IWorkspaceRunnable() {

            @Override
            public void run(IProgressMonitor monitor) throws CoreException {
                IMarker marker = resource
                        .createMarker("de.cau.cs.kieler.sccharts.debug.scchartsBreakpointMarker");
                setMarker(marker);
                marker.setAttribute(IBreakpoint.ENABLED, true);
                marker.setAttribute(IBreakpoint.PERSISTED, persistent);
                marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
                marker.setAttribute(IBreakpoint.ID, getModelIdentifier());
                marker.setAttribute(IMarker.MESSAGE,
                        "Line Breakpoint: " + resource.getName() + " [line: " + lineNumber + "]");
            }
        };
        run(getMarkerRule(resource), runnable);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getModelIdentifier() {
        return SCChartsDebugModelPresentation.ID;
    }

}
