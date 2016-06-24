package de.cau.cs.kieler.sccharts.debug;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.debug.ui.SCChartsDebugModelPresentation;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;
import de.cau.cs.kieler.sim.kiem.config.kivi.KIEMExecutionAutoloadCombination;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;

/**
 * The main controlling class for the debug plugin. The
 */
public class SCChartsDebugPlugin extends AbstractUIPlugin {

    public static final String DEFAULT_DEBUG_SCHEDULE = "sccharts_c_debug";

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.debug"; //$NON-NLS-1$

    // The shared instance
    private Set<Integer> breakpointLines = new HashSet<>();
    private static SCChartsDebugPlugin plugin;

    /**
     * The constructor
     */
    public SCChartsDebugPlugin() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
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

    public void updateBreakpointLines() {
        breakpointLines.clear();

        IBreakpoint[] bps = DebugPlugin.getDefault().getBreakpointManager()
                .getBreakpoints(SCChartsDebugModelPresentation.ID);
        for (IBreakpoint b : bps) {
            try {
                breakpointLines.add(((LineBreakpoint) b).getLineNumber());
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
    }

    public void scheduleDefaultDebugExecution() {

        List<ScheduleData> scheduledata = ScheduleManager.getInstance().getAllSchedules();
        ScheduleData toScheudle = null;
        for (ScheduleData schedule : scheduledata) {
            if (DataComponent.DEBUG_MODE) {
            if (schedule.getName().equals(DEFAULT_DEBUG_SCHEDULE)) {
                toScheudle = schedule;
                break;
            }
            } else {
                break;
            }
        }
        if (toScheudle == null) {
            toScheudle = scheduledata.get(0);
        }

        try {
            ScheduleManager.getInstance().openSchedule(toScheudle);
        } catch (ScheduleFileMissingException e) {
            e.printStackTrace();
        }
    }

    public boolean checkTransitionequalsLine(Transition transition) {
        ICompositeNode n = NodeModelUtils.getNode((EObject) transition);
        int line = n.getStartLine();
        @SuppressWarnings("unused")
        String t = n.getText(); // debug use
        if (breakpointLines.contains(line)) {
            return true;
        } else {
            return false;
        }
    }

}
