package de.cau.cs.kieler.simulation.ui.view

import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.ISimulationListener
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.ui.SimulationUI
import de.cau.cs.kieler.simulation.ui.SimulationUIPlugin
import java.util.Set
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.ToolBarManager
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.ToolBar
import org.eclipse.ui.menus.WorkbenchWindowControlContribution
import org.eclipse.ui.progress.UIJob
import org.eclipse.ui.statushandlers.StatusManager

import static de.cau.cs.kieler.simulation.ui.SimulationUI.*

class SimulationControlButtons extends WorkbenchWindowControlContribution implements ISimulationListener {
    
    private static val PLAY_ICON = SimulationUIPlugin.imageDescriptorFromPlugin(SimulationUIPlugin.PLUGIN_ID, "icons/runIcon.png")
    private static val PAUSE_ICON = SimulationUIPlugin.imageDescriptorFromPlugin(SimulationUIPlugin.PLUGIN_ID, "icons/pauseIcon.png")
    private static val RESUME_ICON = SimulationUIPlugin.imageDescriptorFromPlugin(SimulationUIPlugin.PLUGIN_ID, "icons/resumeIcon.png")
    private static val RESTART_ICON = SimulationUIPlugin.imageDescriptorFromPlugin(SimulationUIPlugin.PLUGIN_ID, "icons/restartIcon.png")
    private static val STEP_ICON = SimulationUIPlugin.imageDescriptorFromPlugin(SimulationUIPlugin.PLUGIN_ID, "icons/stepIcon.png")
    private static val STOP_ICON = SimulationUIPlugin.imageDescriptorFromPlugin(SimulationUIPlugin.PLUGIN_ID, "icons/stopIcon.png")
    
    public static val Set<SimulationControlButtons> instances = newHashSet
    
    val Action playpause
    val Action step
    val Action stop
    
    new() {this("SimulationControlButtons", true)}
    new(boolean listen) {this("SimulationControlButtons", listen)}
    new(String id) {this(id, true)}
    
    new(String id, boolean listen) {
        super(id)
        instances += this
        
        // -- Create Controls --
        // Play/Pause
        playpause = new Action("Play/Pause Simulation", IAction.AS_PUSH_BUTTON) {
            override run() {
                if (currentSimulation !== null) {
                    if (currentSimulation.running) {
                        if (currentSimulation.isPlaying) {
                            currentSimulation.pause()
                        } else {
                            currentSimulation.play()
                        }
                    } else if (SimulationUI.canRestartSimulation) {
                        currentSimulation.start(currentSimulation.isAsynchronous)
                    }
                }
            }
        }
        playpause.imageDescriptor = PLAY_ICON
        
        // Step
        step = new Action("Single Simulation Step", IAction.AS_PUSH_BUTTON) {
            override run() {
                if (currentSimulation !== null) {
                    if (currentSimulation.running) {
                        val success = currentSimulation.step()
                        if (!success) {
                            StatusManager.getManager().handle(new Status(IStatus.ERROR, SimulationUIPlugin.PLUGIN_ID,
                                "Could not perform step!"), StatusManager.SHOW)
                        }
                    }
                }
            }
        }
        step.imageDescriptor = STEP_ICON
        
        // Stop
        stop = new Action("Stop Simulation", IAction.AS_PUSH_BUTTON) {
            override run() {
                currentSimulation?.stop()
            }
        }
        stop.imageDescriptor = STOP_ICON
        
        // -- Register Listener --
        if (listen) CentralSimulation.addListener(this)
    }
    
    override getName() {
        "Simulation Controls (Toolbar Buttons)"
    }
    
    override canBeDisabled() {
        return false
    }
    
    override update(SimulationContext ctx, SimulationEvent e) {
        if (ctx !== null) {
            if (e instanceof SimulationControlEvent) {
                updateUI[
                    updateButtons(e.operation)
                ]
            }
        }
    }
    
    def updateButtons(SimulationControlEvent.SimulationOperation op) {
        val sim = currentSimulation
        if (sim !== null) {
            if (op !== null) {
                switch (op) {
                    case START,
                    case MODE: {
                        playpause.enabled = sim.mode.supportsPlaying
                        step.enabled = sim.mode.supportsStepping
                        stop.enabled = true
                    }
                    case STOP: {
                        playpause.enabled = SimulationUI.canRestartSimulation
                        step.enabled = false
                        stop.enabled = false
                    }
                }
            }
            if (!sim.running) {
                playpause.enabled = SimulationUI.canRestartSimulation
                playpause.imageDescriptor = RESTART_ICON
                playpause.toolTipText = "Restart Simulation"
            } else if (sim.playing && sim.mode.supportsPausing) {
                playpause.imageDescriptor = PAUSE_ICON
                playpause.toolTipText = "Pause Simulation"
            } else if (sim.paused && sim.mode.supportsPausing) {
                playpause.imageDescriptor = RESUME_ICON
                playpause.toolTipText = "Resume Simulation"
            } else {
                playpause.imageDescriptor = PLAY_ICON
                playpause.toolTipText = "Play Simulation"
            }
        } else {
            playpause.enabled = false
            step.enabled = false
            stop.enabled = false
            
            playpause.imageDescriptor = PLAY_ICON
            playpause.toolTipText = "Play Simulation"
        }
    }
    
    override protected Control createControl(Composite parent) {
        var search = parent
        while (!(search instanceof ToolBar)) {
            search = search.parent
        }
        val toolbar = search as ToolBar
        
        // Populate real toolbar
        val tbm = new ToolBarManager(toolbar)
        new UIJob("") {
            
            override runInUIThread(IProgressMonitor monitor) {
                tbm.addButtons
                tbm.update(true)
                
                return Status.OK_STATUS
            }
            
        } => [
            system = true
            schedule(1)
        ]
        
        // Create fake toolbar
        val virtual = new ToolBarManager()
        virtual.addButtons
        return virtual.createControl(parent)
    }
    
    override isDirty() {
        true
    }
    
    def addButtons(IToolBarManager tbm) {
        // Init state
        if (currentSimulation?.running) {
            updateButtons(SimulationControlEvent.SimulationOperation.START)
        } else {
            updateButtons(SimulationControlEvent.SimulationOperation.STOP)
        }
        
        tbm.add(playpause)
        tbm.add(step)
        tbm.add(stop)
    }
    
}
