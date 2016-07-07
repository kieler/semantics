package de.cau.cs.kieler.sccharts.debug;

import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.sccharts.debug.ui.SCChartsDebugModelPresentation;
import de.cau.cs.kieler.sim.kiem.config.data.EditorIdWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * The main controlling class for the debug plugin. The
 */
public class SCChartsDebugPlugin extends AbstractUIPlugin {

    /**
     * The plugin ID.
     */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.debug"; //$NON-NLS-1$

    // /**
    // * The name of the default debug schedule.
    // */
    // public static final String DEFAULT_DEBUG_SCHEDULE = "sccharts_c_debug";

    public static final String DEFAULT_DEBUG_POSTFIX = "_debug.execution";

    public ScheduleData debugSchedule;
    public ScheduleData nonDebugSchedule;

    /**
     * The shared instance.
     */
    private static SCChartsDebugPlugin plugin;

    //
    // // ------------------------------- USED FOR HANDLING DEFAULT SCHEDULE
    // -------------------------
    // /**
    // * Needed for schedule reasons. The previous non-debug schedule is saved as a restore point
    // when
    // * debug mode is disabled.
    // */
    // private ScheduleData previousNonDebugSchedule = null;
    //
    // /**
    // * If no recent debug schedule exists ({@code previousNonDebugSchedule == null}) then this
    // * schedule is taken.
    // */
    // private String defaultNonDebugSchedule = "sccharts_c";

    /**
     * Indicates if the initial loaded is terminated. Needed to allow the choosing of other
     * schedules that a debug schedule which as a consequence will quit debug mode.
     */
    private boolean loaded;

    // ------------------------------- CURRENT BREAKPOINTS ----------------------------------------
    /**
     * Save the current breakpoints with the corresponding line.
     */
    private HashMap<Integer, IBreakpoint> breakpointLines = new HashMap<>();

    /**
     * If a Breakpoint is added or deleted, the map is dirty and needs to be refreshed.
     */
    private boolean dirtyBreakpointList = true;

    /**
     * The constructor
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
        IBreakpoint[] bs = DebugPlugin.getDefault().getBreakpointManager()
                .getBreakpoints(SCChartsDebugModelPresentation.ID);
        for (IBreakpoint b : bs) {
            System.out.println(((LineBreakpoint) b).getLineNumber());
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

    // /**
    // * @return the previousNonDebugSchedule
    // */
    // public ScheduleData getPreviousNonDebugSchedule() {
    // return previousNonDebugSchedule;
    // }
    //
    // /**
    // * @param previousNonDebugSchedule
    // * the previousNonDebugSchedule to set
    // */
    // public void setPreviousNonDebugSchedule(ScheduleData previousNonDebugSchedule) {
    // this.previousNonDebugSchedule = previousNonDebugSchedule;
    // }
    //
    // /**
    // * @return the defaultNonDebugSchedule
    // */
    // public String getDefaultNonDebugSchedule() {
    // return defaultNonDebugSchedule;
    // }
    //
    // /**
    // * @param defaultNonDebugSchedule
    // * the defaultNonDebugSchedule to set
    // */
    // public void setDefaultNonDebugSchedule(String defaultNonDebugSchedule) {
    // this.defaultNonDebugSchedule = defaultNonDebugSchedule;
    // }

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
            for (IBreakpoint b : bps) {
                try {
                    if (b.isEnabled()) {
                        breakpointLines.put(((LineBreakpoint) b).getLineNumber(), b);
                    }
                } catch (CoreException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean updateDebugScheduleData(IPath path) {
        boolean noDebugS = false;
        boolean debugS = false;
        if (nonDebugSchedule != null && debugSchedule != null) {
            noDebugS = path.toString().contains(nonDebugSchedule.getExtendedName() + ".execution");
            debugS = path.toString().contains(debugSchedule.getExtendedName() + ".execution");
        }

        IPath debugPath;
        boolean isDebugSchedule = false;
        if (path.toString().contains(SCChartsDebugPlugin.DEFAULT_DEBUG_POSTFIX)) {
            debugPath = path;
            path = new Path(path.toString().replaceAll(SCChartsDebugPlugin.DEFAULT_DEBUG_POSTFIX,
                    ".execution"));
            isDebugSchedule = true;
        } else {
            debugPath = new Path("/execution/" + path.toString().replaceAll(".execution", "")
                    + SCChartsDebugPlugin.DEFAULT_DEBUG_POSTFIX);
        }

        if (!(noDebugS || debugS)) {
            // Update the schedule data variables with the given data
            int foundBoth = 2;
            List<ScheduleData> scheduledata = ScheduleManager.getInstance().getAllSchedules();
            for (ScheduleData s : scheduledata) {
                if (path.toString().contains(s.getExtendedName() + ".execution")) {
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

    public void scheduleExecution() {
        ScheduleData toScheudle = DataComponent.DEBUG_MODE ? debugSchedule : nonDebugSchedule;
        try {
            ScheduleManager.getInstance().openSchedule(toScheudle);
        } catch (ScheduleFileMissingException e) {
            e.printStackTrace();
        }
    }

    // public void scheduleDefaultDebugExecution() {
    // List<ScheduleData> scheduledata = ScheduleManager.getInstance().getAllSchedules();
    //
    // ScheduleData toScheudle = null;
    //
    // for (ScheduleData schedule : scheduledata) {
    // // Search for a debug schedule in debug mode.
    // if (DataComponent.DEBUG_MODE) {
    // if (schedule.getName().equals(DEFAULT_DEBUG_SCHEDULE)) {
    // toScheudle = schedule;
    // break;
    // }
    // // Otherwise set the previous schedule that is not debug
    // } else if (previousNonDebugSchedule == null
    // && schedule.getName().equals(defaultNonDebugSchedule)) {
    // previousNonDebugSchedule = schedule;
    // break;
    // }
    // }
    // if (toScheudle == null) {
    // toScheudle = previousNonDebugSchedule;
    // }
    //
    // try {
    // ScheduleManager.getInstance().openSchedule(toScheudle);
    // } catch (ScheduleFileMissingException e) {
    // e.printStackTrace();
    // }
    // }

}
