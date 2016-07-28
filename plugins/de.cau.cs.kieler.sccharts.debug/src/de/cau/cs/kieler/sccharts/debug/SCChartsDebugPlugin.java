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

import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.sccharts.debug.ui.SCChartsDebugModelPresentation;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;
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
     * Saves the data corresponding to a debug schedule in relation to the schedule chosen.
     */
    public ScheduleData debugSchedule;

    /**
     * Saves teh data corresponding to a non-debug schedule in relation to the schedule chosen.
     */
    public ScheduleData nonDebugSchedule;

    /**
     * Indicates if the initial load of the schedule is terminated. Needed to allow the choosing of
     * other schedules that a debug schedule which as a consequence will quit debug mode.
     */
    private boolean loaded;

    /**
     * The shared instance.
     */
    private static SCChartsDebugPlugin plugin;

    // ------------------------------- CURRENT BREAKPOINTS ----------------------------------------
    /**
     * Save the current breakpoints with its corresponding line.
     */
    private HashMap<Integer, IBreakpoint> breakpointLines = new HashMap<>();

    /**
     * If a Breakpoint is added or deleted, the map is dirty and needs to be refreshed.
     */
    private boolean dirtyBreakpointList = true;

    /**
     * The constructor. The loaded only needs to indicate false in case the debug schedule is
     * initially turned on.
     */
    public SCChartsDebugPlugin() {
        loaded = DataComponent.DEBUG_MODE ? false : true;
    }

    // --------------------------------------- PLUGIN METHODS -------------------------------------
    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        // Instantiate the breakpoints list on startup.
        IBreakpoint[] bs = DebugPlugin.getDefault().getBreakpointManager()
                .getBreakpoints(SCChartsDebugModelPresentation.ID);
        for (IBreakpoint b : bs) {
        }
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
    public HashMap<Integer, IBreakpoint> getBreakpointLines() {
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
                    breakpointLines.put(((LineBreakpoint) b).getLineNumber(), b);
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
            int foundBoth = 2;
            List<ScheduleData> scheduledata = ScheduleManager.getInstance().getAllSchedules();
            for (ScheduleData s : scheduledata) {
                if (nonDebugPath.toString().contains(s.getExtendedName() + ".execution")) {
                    nonDebugSchedule = s;
                    foundBoth--;
                }
                if (debugPath.toString().contains(s.getExtendedName() + ".execution")) {
                    debugSchedule = s;
                    foundBoth--;
                }
                if (foundBoth == 0) {
                    break;
                }
            }
        }
        return isDebugSchedule;
    }
    
    /**
     * Schedules the schedule data according to the debug mode. 
     */
    public void scheduleExecution() {
        ScheduleData toScheudle = DataComponent.DEBUG_MODE ? debugSchedule : nonDebugSchedule;
        try {
            ScheduleManager.getInstance().openSchedule(toScheudle);
        } catch (ScheduleFileMissingException e) {
            e.printStackTrace();
        }
    }

}
