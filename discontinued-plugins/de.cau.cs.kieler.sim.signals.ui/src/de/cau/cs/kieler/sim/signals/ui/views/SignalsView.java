/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals.ui.views;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.signals.Signal;
import de.cau.cs.kieler.sim.signals.SignalASCIIChartPlotter;
import de.cau.cs.kieler.sim.signals.SignalASCIITimeLinePlotter;
import de.cau.cs.kieler.sim.signals.SignalList;
import de.cau.cs.kieler.sim.signals.ui.SelectInputOutputSignalDialog;
import de.cau.cs.kieler.sim.signals.ui.SignalsUIPlugin;

/**
 * The SignalView constructs the actual Eclipse View of the synchronous signal UI.
 * 
 * @author cmot
 * @kieler.rating 2012-07-25 yellow KI-21
 */
public class SignalsView extends ViewPart {

    /** The id of the view for KIEM. */
    private static final String SIGNALSUIVIEWID = "de.cau.cs.kieler.sim.signals.ui.view";

    /** The action for deleting an entry. */
    private Action actionDelete;

    /** The action to zoom in. */
    private Action actionZoomIn;

    /** The action to zoom out. */
    private Action actionZoomOut;

    /** ZOOM_LEVEL_DIFF defines how much the zoom level is changed when clicking on + or -. */
    private static final int ZOOM_LEVEL_DIFF = 10;

    /** The zoom level. */
    private static final int DEFAULT_ZOOM_LEVEL = 100;
    private int zoomLevel = DEFAULT_ZOOM_LEVEL;

    /** The action to save as. */
    private Action actionSaveAs;

    /** The action to save as ESO. */
    private Action actionSaveAsEso;

    /** The action to toggle colors. */
    private Action actionToggleColors;

    /** The action to toggle mode. */
    private Action actionToggleMode;

    /** The signals plotter. */
    private SignalsPlotter signalsPlotter;

    /** The signals view instance. */
    private static SignalsView signalsViewInstance;

    /** The maximal number of ticks. */
    private static final long MAXIMALTICKS = 250;

    /** The signal list. */
    private SignalList signalList = new SignalList(MAXIMALTICKS);

    /** The signal view colors. */
    private Colors colors = new Colors();

    /** The non default signal view colors. This is the second color scheme */
    private static final RGB NONDEFAULTBACKGROUNDCOLOR = new RGB(255, 255, 255); // white
    private static final RGB NONDEFAULTSIGNALCOLOR2 = new RGB(0, 0, 150); // dark blue
    private static final RGB NONDEFAULTSIGNALCOLOR0 = new RGB(230, 230, 230); // light gray
    private static final RGB NONDEFAULTSIGNALCOLORMARKER = new RGB(200, 0, 0); // dark red

    /**
     * The default color scheme flag. The default color scheme has the black background the other
     * has a white background.
     */
    private boolean defaultColorScheme = false;

    /** The default mode flag. The default mode has a line for each signal. */
    private int drawMode = 0;

    /** There are at most three drawing modes. */
    private static final int MAXDRAWMODE = 3;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new signals view.
     */
    public SignalsView() {
        signalsViewInstance = this;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void createPartControl(final Composite parent) {
        // instantiate a plotter, and provide data to it.
        signalsPlotter = new SignalsPlotter(parent);

        // set white or black  as default
        defaultColorScheme = SignalsUIPlugin.isBlackBackgroundSet();
        if (defaultColorScheme) {
            Colors tmpColors = new Colors();
            colors.setBackgroundColor(tmpColors.getBackgroundColor());
            colors.setSignalColor2(tmpColors.getSignalColor2());
            colors.setSignalColorMarker(tmpColors.getSignalColorMarker());
            colors.setSignalSpareColor(tmpColors.getSignalSpareColor());
        } else {
            colors.setBackgroundColor(NONDEFAULTBACKGROUNDCOLOR);
            colors.setSignalColor2(NONDEFAULTSIGNALCOLOR2);
            colors.setSignalColorMarker(NONDEFAULTSIGNALCOLORMARKER);
            colors.setSignalSpareColor(NONDEFAULTSIGNALCOLOR0);
        }
        signalsPlotter.plot(zoomLevel, colors, drawMode);

        // update signalList of plotter and plot
        this.refresh(0);

        // add clear button
        contributeToActionBars();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void dispose() {
        super.dispose();
        signalsPlotter.dispose();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFocus() {
        signalsPlotter.getOuterScrolledComposite().setFocus();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the single instance of SignalsView.
     * 
     * @return single instance of SignalsView
     */
    public static SignalsView getInstance() {
        return signalsViewInstance;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the signal list.
     * 
     * @param signalList
     *            the new signal list
     */
    public void setSignalList(final SignalList signalList) {
        this.signalList = signalList;
        this.signalList.setMaximalTicks(MAXIMALTICKS);
        this.signalsPlotter.setSignalList(signalList);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the signal list.
     * 
     * @return the signal list
     */
    public SignalList getSignalList() {
        return signalList;
    }

    // -------------------------------------------------------------------------

    /**
     * Refresh the signals view. This has to be called asynchronously w.r.t. the Display thread. Do
     * not call this in blocking mode.
     * 
     * @param currentTick
     *            the current tick
     */
    public void refresh(final long currentTick) {
        signalList.setCurrentTick(currentTick);
        this.signalList.setMaximalTicks(MAXIMALTICKS);
        this.signalsPlotter.setSignalList(signalList);
        try {
            this.signalsPlotter.plot(zoomLevel, colors, drawMode);
        } catch (Exception e) {
            e.printStackTrace();
            // ignore errors due to a closed View
        }
    }

    // -------------------------------------------------------------------------

    /**
     * This method brings the Signals View to the front, if this is possible. Otherwise it may
     * silently fail to do so.
     */
    public static void bringToFront() {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                // bring Synchronous Signals View to the front
                try {
                    IWorkbenchWindow window = SignalsUIPlugin.getDefault().getWorkbench()
                            .getActiveWorkbenchWindow();
                    IViewPart vP = window.getActivePage().showView(SIGNALSUIVIEWID);
                    vP.setFocus();
                    // set done flag
                } catch (Exception e) {
                    // ignore if we cannot bring it to front
                }
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * Contribute to the tool bar of this ViewPart.
     */
    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        IToolBarManager toolBarManager = bars.getToolBarManager();
        toolBarManager.add(getActionZoomIn());
        toolBarManager.add(getActionZoomOut());
        toolBarManager.add(new Separator());
        toolBarManager.add(getActionDelete());
        toolBarManager.add(new Separator());
        toolBarManager.add(getActionSaveAs());
        toolBarManager.add(getActionSaveAsEso());
        toolBarManager.add(new Separator());
        toolBarManager.add(getActionToggleMode());
        toolBarManager.add(getActionToggleColors());
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to delete a variable or signal.
     * 
     * @return the action delete
     */
    private Action getActionDelete() {
        if (actionDelete != null) {
            return actionDelete;
        }
        actionDelete = new Action() {
            public void run() {
                // reset all signals to the same tick, the current tick.
                long tickToResetTo = signalList.getMaxTick();
                for (Signal signal : signalList) {
                    signal.clear(tickToResetTo);
                }
                signalsPlotter.plot(zoomLevel, colors, drawMode);
            }
        };
        actionDelete.setText("Clear History");
        actionDelete.setToolTipText("Clear History");
        actionDelete.setImageDescriptor(SignalsUIPlugin.getImageDescriptor("icons/clear.png"));
        return actionDelete;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to zoom in.
     * 
     * @return the action zoom in
     */
    private Action getActionZoomIn() {
        if (actionZoomIn != null) {
            return actionZoomIn;
        }
        actionZoomIn = new Action() {
            public void run() {
                zoomLevel += ZOOM_LEVEL_DIFF;
                signalsPlotter.plot(zoomLevel, colors, drawMode);
            }
        };
        actionZoomIn.setText("Zoom In");
        actionZoomIn.setToolTipText("Zoom In");
        actionZoomIn.setImageDescriptor(SignalsUIPlugin.getImageDescriptor("icons/zoomin.png"));
        return actionZoomIn;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to zoom out.
     * 
     * @return the action zoom out
     */
    private Action getActionZoomOut() {
        if (actionZoomOut != null) {
            return actionZoomOut;
        }
        actionZoomOut = new Action() {
            public void run() {
                if (zoomLevel > ZOOM_LEVEL_DIFF) {
                    zoomLevel -= ZOOM_LEVEL_DIFF;
                }
                signalsPlotter.plot(zoomLevel, colors, drawMode);
            }
        };
        actionZoomOut.setText("Zoom Out");
        actionZoomOut.setToolTipText("Zoom Out");
        actionZoomOut.setImageDescriptor(SignalsUIPlugin.getImageDescriptor("icons/zoomout.png"));
        return actionZoomOut;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to save as.
     * 
     * @return the action save as
     */
    private Action getActionSaveAs() {
        if (actionSaveAs != null) {
            return actionSaveAs;
        }
        actionSaveAs = new Action() {
            public void run() {
                Shell shell = Display.getDefault().getActiveShell();
                if (shell != null) {
                    SaveAsDialog dlg = new SaveAsDialog(shell);
                    dlg.setBlockOnOpen(true);
                    IFile file = KiemPlugin.getDefault().getActiveEditorFile();
                    IProject project = file.getProject();
                    IFile txtFile = project.getFile(file.getProjectRelativePath().removeFileExtension() + ".txt");
                    dlg.setOriginalFile(txtFile);
                    if (dlg.open() == SaveAsDialog.OK) {
                        try {
                            if (drawMode == 0) {
                                new SignalASCIIChartPlotter().plotToTextFile(dlg.getResult(),
                                        signalList);
                            } else if (drawMode == 1) {
                                new SignalASCIITimeLinePlotter().plotToTextFile(dlg.getResult(),
                                        signalList);
                            } else {
                                SignalASCIITimeLinePlotter plotter = new SignalASCIITimeLinePlotter();
                                plotter.setPlotValues(true);
                                plotter.plotToTextFile(dlg.getResult(), signalList);

                            }
                        } catch (IOException e) {
                            IStatus status = new Status(IStatus.ERROR, SignalsUIPlugin.PLUGIN_ID,
                                    "Cannot write to output file.", e);
                            StatusManager.getManager().handle(status);
                        } catch (CoreException e) {
                            StatusManager.getManager().handle(e, SignalsUIPlugin.PLUGIN_ID);
                        }
                    }
                }
            }
        };
        actionSaveAs.setText("Save As");
        actionSaveAs.setToolTipText("Save As");
        actionSaveAs.setImageDescriptor(SignalsUIPlugin.getImageDescriptor("icons/saveas.png"));
        return actionSaveAs;
    }

    // -------------------------------------------------------------------------
    /**
     * Gets the action to save as ESO.
     * 
     * @return the action save as ESO
     */
    private Action getActionSaveAsEso() {
        if (actionSaveAsEso != null) {
            return actionSaveAsEso;
        }
        actionSaveAsEso = new Action() {
            public void run() {
                Shell shell = Display.getDefault().getActiveShell();
                if (shell != null) {
                    // first ask the user to select input signals
                    SelectInputOutputSignalDialog signalsDialog = new SelectInputOutputSignalDialog(
                            shell);
                    
                    signalsDialog.setSignalList(signalList);
                    if (signalsDialog.open() == 0) {
                        List<Signal> inputSignalList = signalsDialog.getInputSignals();
                        List<Signal> outputSignalList = signalsDialog.getOutputSignals();
                        if (inputSignalList.size() > 0 || outputSignalList.size() > 0) {
                            // do the export and ask the user where to write the file to
                            SaveAsDialog dlg = new SaveAsDialog(shell);
                            dlg.setBlockOnOpen(true);
                            IFile file = KiemPlugin.getDefault().getActiveEditorFile();
                            IProject project = file.getProject();
                            IFile esoFile = project.getFile(file.getProjectRelativePath().removeFileExtension() + ".eso");
                            dlg.setOriginalFile(esoFile);
                            int answer = dlg.open();
                            if (answer != SaveAsDialog.CANCEL) {
                                boolean append = true; // this is the default
                                try {
                                    new SignalASCIIChartPlotter().plotToEsoFile(dlg.getResult(),
                                            signalList, inputSignalList, outputSignalList, append);
                                } catch (IOException e) {
                                    IStatus status = new Status(IStatus.ERROR,
                                            SignalsUIPlugin.PLUGIN_ID, "Cannot write to output file.",
                                            e);
                                    StatusManager.getManager().handle(status);
                                } catch (CoreException e) {
                                    StatusManager.getManager().handle(e, SignalsUIPlugin.PLUGIN_ID);
                                }
                            }
                        }
                    }
                }
            }
        };
        actionSaveAsEso.setText("Save As ESO");
        actionSaveAsEso.setToolTipText("Save as ESO File for validation.");
        actionSaveAsEso.setImageDescriptor(SignalsUIPlugin
                .getImageDescriptor("icons/saveaseso.png"));
        return actionSaveAsEso;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to toggle the color scheme.
     * 
     * @return the action to toggle the color scheme
     */
    private Action getActionToggleColors() {
        if (actionToggleColors != null) {
            return actionToggleColors;
        }
        actionToggleColors = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                defaultColorScheme = !defaultColorScheme;
                SignalsUIPlugin.setBlackBackground(defaultColorScheme);
                if (defaultColorScheme) {
                    Colors tmpColors = new Colors();
                    colors.setBackgroundColor(tmpColors.getBackgroundColor());
                    colors.setSignalColor2(tmpColors.getSignalColor2());
                    colors.setSignalColorMarker(tmpColors.getSignalColorMarker());
                    colors.setSignalSpareColor(tmpColors.getSignalSpareColor());
                } else {
                    colors.setBackgroundColor(NONDEFAULTBACKGROUNDCOLOR);
                    colors.setSignalColor2(NONDEFAULTSIGNALCOLOR2);
                    colors.setSignalColorMarker(NONDEFAULTSIGNALCOLORMARKER);
                    colors.setSignalSpareColor(NONDEFAULTSIGNALCOLOR0);
                }
                signalsPlotter.plot(zoomLevel, colors, drawMode);
            }
        };
        actionToggleColors.setText("Toggle Colors");
        actionToggleColors.setToolTipText("Toggle Colors");
        actionToggleColors.setImageDescriptor(SignalsUIPlugin
                .getImageDescriptor("icons/togglecolors.png"));
        return actionToggleColors;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to toggle the color scheme.
     * 
     * @return the action to toggle the color scheme
     */
    private Action getActionToggleMode() {
        if (actionToggleMode != null) {
            return actionToggleMode;
        }
        actionToggleMode = new Action("") { // , IAction.AS_CHECK_BOX) {
            public void run() {
                drawMode = (drawMode + 1) % MAXDRAWMODE;
                signalsPlotter.plot(zoomLevel, colors, drawMode);
            }
        };
        actionToggleMode.setText("Toggle View Mode");
        actionToggleMode.setToolTipText("Toggle View Mode");
        actionToggleMode.setImageDescriptor(SignalsUIPlugin
                .getImageDescriptor("icons/togglemode.png"));
        return actionToggleMode;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the currently used color settings for this view.
     * 
     * @return the colors
     */
    public Colors getColors() {
        return colors;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the used color settings for this view..
     * 
     * @param colors
     *            the new colors
     */
    public void setColors(final Colors colors) {
        this.colors = colors;
        // refresh with new colors
        signalsPlotter.plot(zoomLevel, colors, drawMode);
    }

    // -------------------------------------------------------------------------

}
