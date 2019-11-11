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

import java.util.List
import org.eclipse.debug.core.model.IBreakpoint
import org.eclipse.core.resources.IResourceChangeListener
import org.eclipse.core.resources.IResourceChangeEvent
import org.eclipse.core.resources.IResourceDelta
import java.util.HashMap
import org.eclipse.debug.core.DebugPlugin
import de.cau.cs.kieler.sccharts.ui.debug.SCChartsDebugModelPresentation
import org.eclipse.debug.core.model.LineBreakpoint
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.core.resources.IResource

/**
 * Wrapper for legacy functionality from SCCharts Debug Plugin by lgr.
 * Probably temporary.
 * 
 * @author stu121235
 *
 */
class BreakpointUtility {
    
    val breakpointListener = SCTXBreakpointListener.instance
    
    val breakpointLines = <Integer, List<IBreakpoint>> newHashMap
    
    var dirtyBreakpointList = true
    
    static BreakpointUtility instance
    
    val resLis = new IResourceChangeListener() {

        override resourceChanged(IResourceChangeEvent event) {
            if (event.type == IResourceChangeEvent.POST_CHANGE
                    && event.delta.kind == IResourceDelta.CHANGED) {
                updateBreakpointLines();
            }
        }
    };
    
    static def create() {
        instance = getInstance()
    }
    
    static def BreakpointUtility getInstance() {
        if (instance === null) {
            instance = new BreakpointUtility()
        }
        return instance
    }
    
    private new() {
        DebugPlugin.^default.breakpointManager.addBreakpointListener(breakpointListener)
        ResourcesPlugin.workspace.addResourceChangeListener(resLis);
    }
    
    /**
     * @return the breakpointLines
     */
    def HashMap<Integer, List<IBreakpoint>> getBreakpointLines() {
        return breakpointLines;
    }
    
    /**
     * Sets {@link dirtyBreakpointList} to true.
     */
    def void setDirtyBreakpointList() {
        dirtyBreakpointList = true;
    }
    
    /**
     * If the actual breakpoints map is dirty, it will be updated.
     */
    def void updateBreakpointLines() {
        if (dirtyBreakpointList) {
            breakpointLines.clear();

            val bps = DebugPlugin.getDefault().getBreakpointManager()
                    .getBreakpoints(SCChartsDebugModelPresentation.ID);
            // Add each breakpoint and its line number to the list of all breakpoints.
            for (IBreakpoint b : bps) {
                try {
                    val line = (b as LineBreakpoint).getLineNumber();
                    var List<IBreakpoint> bsList;
                    if (breakpointLines.containsKey(line)) {
                        bsList = breakpointLines.get(line);
                        bsList.add(b);
                    } else {
                        bsList = <IBreakpoint> newArrayList;
                        bsList.add(b);
                    }
                    breakpointLines.put(line, bsList);
                } catch (CoreException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    /**
     * For a given EObject checks whether there is a breakpoint specified that is associated with
     * this object in the correct resource.
     * 
     * @param obj
     *            The object of interest.
     * @return Returns true is there is a breakpoint associated with the object, otherwise false.
     */
    def boolean isEObjectInLine(EObject obj, Resource resource) {
        updateBreakpointLines();
        val n = NodeModelUtils.getNode(obj);
        if (n !== null) {
            val line = n.getStartLine();
            try {
                val bsList = getBreakpointLines().get(line);
                if (bsList !== null) {
                    for (var i = 0; i < bsList.size(); i++) {

                        val b = bsList.get(i);

                        if (b !== null && b.isEnabled()) {

                            val bResource = b.getMarker().getResource();

                            if (resource.getURI().toString().contains(bResource.getName())) {
                                return true;
                            }
                        }
                    }
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    
    /**
     * For a given EObject checks whether there is a breakpoint specified that is associated with
     * this object in the correct resource.
     * 
     * @param obj
     *            The object of interest.
     * @return Returns true is there is a breakpoint associated with the object, otherwise false.
     */
    def boolean isEObjectInLine(EObject obj, IResource resource) {
        updateBreakpointLines();
        val n = NodeModelUtils.getNode(obj);
        if (n !== null) {
            val line = n.getStartLine();
            try {
                val bslist = getBreakpointLines().get(line);
                if (bslist !== null) {
                    for (var i = 0; i < bslist.size(); i++) {

                        val b = bslist.get(i);

                        if (b !== null && b.isEnabled()) {

                            val bResource = b.getMarker().getResource();

                            if (resource.equals(bResource)) {
                                return true;
                            }
                        }
                    }
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    
}