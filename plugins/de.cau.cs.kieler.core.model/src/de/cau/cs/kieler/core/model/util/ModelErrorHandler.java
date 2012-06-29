/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;
import de.cau.cs.kieler.core.ui.Messages;
import de.cau.cs.kieler.core.ui.errorhandler.GenericErrorHandler.StatusListener;

/**
 * A StatusHandler that displays error messages for KielerModelException Status
 * causes at the corresponding Diagram object as a problem marker. Other
 * exceptions and styles (BLOCK, LOG) are handled like the default Status
 * handler.
 * 
 * @author haf
 * @author soh
 * @kieler.rating 2010-06-11 proposed yellow soh
 */
public class ModelErrorHandler implements StatusListener, IStartup {

    /** The map of markers. */
    private static Map<EObject, List<IMarker>> markers = new HashMap<EObject, List<IMarker>>();

    /** True if the error handler is enabled and should add markers. */
    private static boolean enabled = true;

    /**
     * Enable the error handler.
     */
    public static void enable() {
        if (!enabled) {
            enabled = true;
        }
    }

    /**
     * Disable the error handler.
     */
    public static void disable() {
        if (enabled) {
            enabled = false;
        }
    }

    /**
     * Check whether the error handler is enabled.
     * 
     * @return true if it is
     */
    public static boolean isEnabled() {
        return enabled;
    }

    /**
     * 
     * {@inheritDoc}
     */
    public int reroute(final StatusAdapter statusAdapter, final int style) {
        Throwable e = statusAdapter.getStatus().getException();
        // Show problem markers
        if (e instanceof KielerModelException && style == StatusManager.SHOW) {
            Object modelObject = ((KielerModelException) e).getModelObject();
            if (modelObject instanceof EObject) {
                if (enabled) {
                    addMarker(e.getMessage(), (EObject) modelObject);
                }
                return StatusManager.LOG;
            }
        }
        return StatusListener.DONT_CARE;
    }

    /**
     * Add a problem marker to a given EObject to indicate problems graphically
     * in the diagram. Will silently fail at any errors, e.g. if there is no
     * graphical editor open corresponding to the object.
     * 
     * @param msg
     *            String message of the marker
     * @param target
     *            target object
     */
    public static void addMarker(final String msg, final EObject target) {
        Job job = new AddMarkerJob(msg, target);
        job.schedule();
    }

    /**
     * Remove all custom problem markers from a given EObject to indicate
     * problems graphically in the diagram. Will silently fail at any errors,
     * e.g. if there is no graphical editor open corresponding to the object.
     * 
     * @param target
     *            target object
     */
    public static void clearMarker(final EObject target) {
        try {
            List<IMarker> myMarkers = markers.get(target);
            if (myMarkers == null) {
                return;
            }
            for (IMarker marker : myMarkers) {
                marker.delete();
            }
            myMarkers.clear();
        } catch (Exception e) { /* nothing */
        }
    }

    /**
     * A job for adding error markers.
     */
    private static class AddMarkerJob extends Job {

        private String msg;

        private EObject target;

        private Status status;

        private AddMarkerJob thisJob;

        private int count = 0;

        /**
         * Creates a new AddMarkerJob.
         * 
         * @param msgParam
         *            the message
         * @param targetParam
         *            the target
         */
        public AddMarkerJob(final String msgParam, final EObject targetParam) {
            super("Add Marker");
            this.msg = msgParam;
            this.target = targetParam;
        }

        @Override
        protected IStatus run(final IProgressMonitor monitor) {
            thisJob = this;

            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

                public void run() {
                    try {
                        IGraphicalFrameworkBridge bridge = GraphicalFrameworkService
                                .getInstance().getBridge(GraphicalFrameworkService.FW_GMF);
                        EditPart editPart = bridge.getEditPart(target);

                        if (editPart != null) {
                            EObject view = bridge.getNotationElement(editPart);
                            String elementID = "";
                            if (view.eResource() instanceof XMLResource) {
                                    String id = ((XMLResource) view.eResource()).getID(view);
                                    if (id != null) {
                                        elementID = id;
                                    }
                            }
                            IResource resource = WorkspaceSynchronizer.getFile(view.eResource());
                            IMarker marker = resource
                                    .createMarker("de.cau.cs.kieler.synccharts.diagram.diagnostic");
                            marker.setAttribute(IMarker.MESSAGE, msg);
                            marker.setAttribute(IMarker.PRIORITY,
                                    IMarker.PRIORITY_HIGH);
                            marker.setAttribute(IMarker.SEVERITY,
                                    IMarker.SEVERITY_ERROR);
                            marker.setAttribute("elementId", elementID);
                            List<IMarker> myMarkers = markers.get(target);
                            if (myMarkers == null) {
                                myMarkers = new ArrayList<IMarker>();
                                markers.put(target, myMarkers);
                            }
                            myMarkers.add(marker);
                        } else {
                            count++;
                            // CHECKSTYLEOFF MagicNumber
                            if (count < 4) {
                                thisJob.schedule(count * 5000);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        status = new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID,
                                Messages.ModelErrorHandler_MarkerCreationError
                                + " (" + msg + ")");
                    }
                }
            });
            if (status != null) {
                return status;
            }
            return new Status(IStatus.OK, "de.cau.cs.kieler.core.model", "");
        }
    }

    /**
     * {@inheritDoc}
     */
    public void earlyStartup() {
        CoreModelPlugin.getDefault().addErrorListener();
    }

}
