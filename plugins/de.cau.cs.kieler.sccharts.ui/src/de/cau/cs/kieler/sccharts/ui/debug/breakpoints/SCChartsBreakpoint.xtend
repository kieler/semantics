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

import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IWorkspaceRunnable
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.core.model.IBreakpoint
import org.eclipse.debug.core.model.LineBreakpoint
import de.cau.cs.kieler.sccharts.ui.debug.SCChartsDebugModelPresentation

/** 
 * Line Breakpoints are represented and are designed for SCCharts.
 * 
 * @author lgr
 */
class SCChartsBreakpoint extends LineBreakpoint {
    
    /** 
     * This constructor is still needed for internal reasons.
     */
    new() {
    }

    /** 
     * Creates a new breakpoint using {@link #SCChartsBreakpoint(IResource, int, boolean)} as a
     * constructor with the {@code persistent} variable set to true.
     * 
     * @param resourceThe resource that the breakpoint should be added to.
     * @param lineNumberThe specified line, where the breakpoint is defined.
     * @throws CoreExceptionIf a CoreException occurs performing{@link #run(org.eclipse.core.runtime.jobs.ISchedulingRule, IWorkspaceRunnable)} .
     */
    new(IResource resource, int lineNumber) throws CoreException {
        this(resource, lineNumber, true)
    }

    /** 
     * Constructor for creating a breakpoint.
     * 
     * @param resourceThe resource that the breakpoint should be added to.
     * @param lineNumberThe specified line, where the breakpoint is laid.
     * @param persistentIndicates whether the breakpoint is persistent.
     * @throws CoreExceptionIf a CoreException occurs performing{@link #run(org.eclipse.core.runtime.jobs.ISchedulingRule, IWorkspaceRunnable)} .
     */
    protected new(IResource resource, int lineNumber, boolean persistent) throws CoreException {
        var IWorkspaceRunnable runnable = [ IProgressMonitor monitor |
            var IMarker marker = resource.createMarker("de.cau.cs.kieler.sccharts.ui.scchartsBreakpointMarker")
            setMarker(marker)
            marker.setAttribute(IBreakpoint.ENABLED, true)
            marker.setAttribute(IBreakpoint.PERSISTED, persistent)
            marker.setAttribute(IMarker.LINE_NUMBER, lineNumber)
            marker.setAttribute(IBreakpoint.ID, getModelIdentifier())
            marker.setAttribute(IMarker.MESSAGE, '''Line Breakpoint: «resource.getName()» [line: «lineNumber»]'''.toString)
        ]
        run(getMarkerRule(resource), runnable)
    }

    /** 
     * {@inheritDoc}
     */
    override String getModelIdentifier() {
        return SCChartsDebugModelPresentation.ID
    }
}
