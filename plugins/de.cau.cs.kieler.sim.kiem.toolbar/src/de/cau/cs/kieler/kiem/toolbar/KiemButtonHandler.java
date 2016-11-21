package de.cau.cs.kieler.kiem.toolbar;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * KIEM Toolbar ButtonHandler implements the button handler for modifying KIEM.
 *
 * @author cmot
 * @kieler.design 2016-11-21 proposed
 * @kieler.rating 2016-11-21 proposed yellow
 */
public class KiemButtonHandler extends AbstractHandler {

    /**
     * Instantiates a new KiCoButtonHandler handler.
     */
    public KiemButtonHandler() {
    }

    // ---------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object execute(ExecutionEvent event) {
        KiemPlugin kiemPlugin = KiemPlugin.getDefault();

        Thread t = (new Thread(new Runnable() {
            public void run() {

                if (event.getCommand().getId().toString().endsWith("commandStepBack")) {
                    if (kiemPlugin.getExecution() == null) {
                        return;
                    }
                    if (kiemPlugin.getExecution().getSteps() <= 1) {
                        return;
                    }
                    // otherwise default implementation
                    if (kiemPlugin != null && kiemPlugin.initExecution()) {
                        kiemPlugin.getExecution().stepBackExecutionSync();
                    }
                } else if (event.getCommand().getId().toString().endsWith("commandStep")) {
                    if ((kiemPlugin.getExecution() != null) && kiemPlugin.getExecution().isRunning()) {
                        return;
                    }
                    // otherwise default implementation
                    if (kiemPlugin.getExecution() == null) {
                        if (kiemPlugin.initExecution()) {
                            // per default make a pause as a first step
                            kiemPlugin.getExecution().pauseExecutionSync();
                        }
                    } else if (kiemPlugin.initExecution()) {
                        kiemPlugin.getExecution().stepExecutionSync();
                    }
                } else if (event.getCommand().getId().toString().endsWith("commandRun")) {
                    if ((kiemPlugin.getExecution() != null) && kiemPlugin.getExecution().isRunning()) {
                        return;
                    }
                    if (kiemPlugin != null && kiemPlugin.initExecution()) {
                        kiemPlugin.getExecution().runExecutionSync();
                    }
                } else if (event.getCommand().getId().toString().endsWith("commandStop")) {
                    if (kiemPlugin.getExecution() == null) {
                        return;
                    }
                    if (kiemPlugin != null && kiemPlugin.initExecution()) {
                        kiemPlugin.getExecution().stopExecutionSync();
                    }
                } else if (event.getCommand().getId().toString().endsWith("commandPause")) {
                    if (kiemPlugin.getExecution() == null) {
                        return;
                    }
                    if (!kiemPlugin.getExecution().isRunning()) {
                        return;
                    }
                    if (kiemPlugin != null && kiemPlugin.initExecution()) {
                        kiemPlugin.getExecution().pauseExecutionSync();
                    }
                }
            }
        }));
        t.start();

        // dialog.open();
        return null;
    }

    // ---------------------------------------------------------------------

}
