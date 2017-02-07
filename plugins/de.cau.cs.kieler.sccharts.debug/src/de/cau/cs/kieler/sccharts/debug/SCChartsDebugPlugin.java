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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.sccharts.debug.ui.SCChartsDebugModelPresentation;
import de.cau.cs.kieler.sccharts.debug.ui.ViewDebugContributor;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;
import de.cau.cs.kieler.sim.kiem.config.extension.KiemEventListener;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;

/**
 * The main controlling class for the debug plugin.
 * 
 * @author lgr
 * 
 */
public class SCChartsDebugPlugin extends AbstractUIPlugin {

    /**
     * The plugin ID.
     */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.debug"; //$NON-NLS-1$

    /**
     * The Postfix for the debug execution schedules.
     */
    public static final String DEFAULT_DEBUG_POSTFIX = "_debug.execution";

    /**
     * The instance for the breakpoint listener.
     */
    public BreakpointListener listener = new BreakpointListener();

    /**
     * Saves the data corresponding to a debug schedule in relation to the schedule chosen.
     */
    public ScheduleData debugSchedule;

    /**
     * Saves the data corresponding to a non-debug schedule in relation to the schedule chosen.
     */
    public ScheduleData nonDebugSchedule;

    /**
     * Indicates whether the selected schedule has a corresponding debug schedule.
     */
    private boolean correspondingDebugFound = false;

    /**
     * Indicates if the initial load of the schedule is terminated. Needed to allow the choosing of
     * other schedules that a debug schedule which as a consequence will quit debug mode.
     */
    private boolean loaded;

    /**
     * The shared instance.
     */
    private static SCChartsDebugPlugin plugin;

    /**
     * Save the current breakpoints with its corresponding line. This is needed to determine whether
     * there is a breakpoint associated with a line.
     */
    private HashMap<Integer, ArrayList<IBreakpoint>> breakpointLines = new HashMap<>();

    /**
     * If a Breakpoint is added or deleted, the map is dirty and needs to be refreshed.
     */
    private boolean dirtyBreakpointList = true;

    private IResourceChangeListener resLis = new IResourceChangeListener() {

        @Override
        public void resourceChanged(IResourceChangeEvent event) {
            if (event.getType() == IResourceChangeEvent.POST_CHANGE
                    && event.getDelta().getKind() == IResourceDelta.CHANGED) {
                updateBreakpointLines();
            }
        }
    };

    // --------------------------------------------------------------------------------------------

    /**
     * The constructor. The loaded variable only needs to indicate false in case the debug schedule
     * is initially turned on.
     */
    public SCChartsDebugPlugin() {
        loaded = DataComponent.DEBUG_MODE ? false : true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;

        // Add the breakpoint listener to the breakpoint manager.
        IBreakpointManager manager = DebugPlugin.getDefault().getBreakpointManager();
        manager.addBreakpointListener(listener);

        // Add a resource listener so highlighting can be adjusted accordingly.
        ResourcesPlugin.getWorkspace().addResourceChangeListener(resLis);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static SCChartsDebugPlugin getDefault() {
        return plugin;
    }

    // ------------------------------------------ BREAKPOINT ORGANISATION -------------------------
    /**
     * @return the breakpointLines
     */
    public HashMap<Integer, ArrayList<IBreakpoint>> getBreakpointLines() {
        return breakpointLines;
    }

    /**
     * Sets {@link dirtyBreakpointList} to true.
     */
    public void setDirtyBreakpointList() {
        dirtyBreakpointList = true;
    }

    /**
     * @return the loaded
     */
    public boolean isLoaded() {
        return loaded;
    }

    /**
     * Sets {@link loaded} to true.
     */
    public void setLoaded() {
        loaded = true;
    }

    /**
     * If the actual breakpoints map is dirty, it will be updated.
     */
    public void updateBreakpointLines() {
        if (dirtyBreakpointList) {
            breakpointLines.clear();

            IBreakpoint[] bps = DebugPlugin.getDefault().getBreakpointManager()
                    .getBreakpoints(SCChartsDebugModelPresentation.ID);
            // Add each breakpoint and its line number to the list of all breakpoints.
            for (IBreakpoint b : bps) {
                try {
                    int line = ((LineBreakpoint) b).getLineNumber();
                    ArrayList<IBreakpoint> bsList;
                    if (breakpointLines.containsKey(line)) {
                        bsList = (ArrayList<IBreakpoint>) breakpointLines.get(line);
                        bsList.add(b);
                    } else {
                        bsList = new ArrayList<IBreakpoint>();
                        bsList.add(b);
                    }
                    breakpointLines.put(line, bsList);
                } catch (CoreException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // --------------------------------------- METHODS DEBUG SCHEDULE -----------------------------
    /**
     * Updates the two saved schedule data with the given path that resolves to a the current chosen
     * schedule.
     * 
     * @param path
     *            The current chosen schedule.
     * @return Returns if the given schedule was a debug schedule or not.
     * @throws ScheduleFileMissingException
     */
    public boolean updateDebugScheduleData(IPath path) {
        IPath debugPath;
        IPath nonDebugPath;
        boolean isDebugSchedule = false;

        // ------------------------- Chosen schedule is debug? ------------------------------------
        if (path.toString().contains(SCChartsDebugPlugin.DEFAULT_DEBUG_POSTFIX)) {
            debugPath = path;
            nonDebugPath = new Path(path.toString()
                    .replaceAll(SCChartsDebugPlugin.DEFAULT_DEBUG_POSTFIX, ".execution"));
            isDebugSchedule = true;
        } else {
            debugPath = new Path("/execution/" + path.toString().replaceAll(".execution", "")
                    + SCChartsDebugPlugin.DEFAULT_DEBUG_POSTFIX);
            nonDebugPath = path;
        }

        // ---------------- Extract whether the path is equal to a saved schedule. ----------------
        boolean noDebugS = false;
        boolean debugS = false;

        if (nonDebugSchedule != null && debugSchedule != null) {
            noDebugS = path.toString().contains(nonDebugSchedule.getExtendedName() + ".execution");
            debugS = path.toString().contains(debugSchedule.getExtendedName() + ".execution");
        }

        // --------------------- Update the schedule data variables. ------------------------------
        if (!(noDebugS || debugS)) {
            boolean foundNonDebug = false;
            boolean foundDebug = false;
            List<ScheduleData> scheduledata = ScheduleManager.getInstance().getAllSchedules();
            for (ScheduleData s : scheduledata) {
                if (nonDebugPath.toString().contains(s.getExtendedName() + ".execution")) {
                    nonDebugSchedule = s;
                    foundNonDebug = true;
                }
                if (debugPath.toString().contains(s.getExtendedName() + ".execution")) {
                    debugSchedule = s;
                    foundDebug = true;
                }
                if (foundDebug && foundNonDebug) {
                    break;
                }
            }
            if (!foundDebug) {
                correspondingDebugFound = false;
            } else {
                correspondingDebugFound = true;
            }
        }
        return isDebugSchedule;
    }

    /**
     * Schedules the schedule data according to the debug mode.
     */
    public void scheduleExecution() {
        try {
            // DEBUG MODE - UP-TO-DATE SCHEDULE
            if (DataComponent.DEBUG_MODE && correspondingDebugFound) {
                ScheduleManager.getInstance().openSchedule(debugSchedule);
            
            // DEBUG MODE - NO UP-TO-DATE SCHEDULE
            } else if (DataComponent.DEBUG_MODE && !correspondingDebugFound) {
                throw new ScheduleFileMissingException("No debug schedule found! \n"
                        + "In order to use debugging functionalities, manually add the Debugger component. \n", nonDebugSchedule);
            
            // NO DEBUG MODE
            } else {
                ScheduleManager.getInstance().openSchedule(nonDebugSchedule);
            }
        } catch (ScheduleFileMissingException e) {
            KiemPlugin.getDefault().showError(e.getMessage() + "Corresponding schedule: " + ((ScheduleData) e.getInfo()).getExtendedName());
            if (DataComponent.DEBUG_MODE) {
                DataComponent.DEBUG_MODE = false;
                ViewDebugContributor.setButtonDebugSelection();
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
    public boolean isEObjectInLine(EObject obj, Resource resource) {
        plugin.updateBreakpointLines();
        ICompositeNode n = NodeModelUtils.getNode(obj);
        if (n != null) {
            int line = n.getStartLine();
            try {
                ArrayList<IBreakpoint> bsList = plugin.getBreakpointLines().get(line);
                if (bsList != null) {
                    for (int i = 0; i < bsList.size(); i++) {

                        IBreakpoint b = bsList.get(i);

                        if (b != null && b.isEnabled()) {

                            IResource bResource = b.getMarker().getResource();
                            String resourcePath = resource.getURI().path();
                            String breakpointResource = bResource.getFullPath().toString();

                            if (resourcePath.endsWith(breakpointResource)) {
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
    public boolean isEObjectInLine(EObject obj, IResource resource) {
        plugin.updateBreakpointLines();
        ICompositeNode n = NodeModelUtils.getNode(obj);
        if (n != null) {
            int line = n.getStartLine();
            try {
                ArrayList<IBreakpoint> bslist = plugin.getBreakpointLines().get(line);
                if (bslist != null) {
                    for (int i = 0; i < bslist.size(); i++) {

                        IBreakpoint b = bslist.get(i);

                        if (b != null && b.isEnabled()) {

                            IResource bResource = b.getMarker().getResource();

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
