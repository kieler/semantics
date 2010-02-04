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
package de.cau.cs.kieler.core.ui.errorhandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.core.ui.CoreUIPlugin;

/**
 * A StatusHandler that displays error messages for KielerModelException Status
 * causes at the corresponding Diagram object as a problem marker. Other
 * exceptions and styles (BLOCK, LOG) are handled like the default Status
 * handler.
 * 
 * @author haf
 */
public class ModelErrorHandler extends GenericErrorHandler {

    private static Map<EObject, List<IMarker>> markers = new HashMap<EObject, List<IMarker>>();

    @Override
    public void handle(final StatusAdapter statusAdapter, final int style) {
        Throwable e = statusAdapter.getStatus().getException();

        // Show problem markers
        if (e instanceof KielerModelException && style == StatusManager.SHOW) {
            Object modelObject = ((KielerModelException) e).getModelObject();
            if (modelObject instanceof EObject) {
                try {
                    addMarker(e.getMessage(), (EObject) modelObject);
                    return;
                } catch (KielerException e1) {
                    /*will go on in next case */
                    Status debugStatus = new Status(IStatus.ERROR,
                            CoreUIPlugin.PLUGIN_ID,
                            Messages.ModelErrorHandler_MarkerError
                                    + e1.getClass().getName(), e1);
                    StatusManager.getManager().handle(debugStatus,
                            StatusManager.LOG);
                }
            }
        }
        /*
         * Handle the error the classic way by using a popup of the Status Manager.
         */
        super.handle(statusAdapter, style);
        // System.out.println(e.getMessage());
        // e.printStackTrace();
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
     * @throws KielerException
     *             if the marker cannot be created
     */
    public static void addMarker(final String msg, final EObject target)
            throws KielerException {
        try {
            String elementID = ""; //$NON-NLS-1$
            EditPart editPart = ModelingUtil.getEditPart(target);
            View view = (View) editPart.getModel();
            elementID = ViewUtil.getIdStr(view);

            IResource resource = WorkspaceSynchronizer
                    .getFile(view.eResource());
            IMarker marker = resource
                    .createMarker("de.cau.cs.kieler.synccharts.diagram.diagnostic");
            marker.setAttribute(IMarker.MESSAGE, msg);
            marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
            marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
            marker
                    .setAttribute(
                            org.eclipse.gmf.runtime.common.ui.resources.IMarker.ELEMENT_ID,
                            elementID);

            List<IMarker> myMarkers = markers.get(target);
            if (myMarkers == null) {
                myMarkers = new ArrayList<IMarker>();
                markers.put(target, myMarkers);
            }
            myMarkers.add(marker);
        } catch (Exception e) {
            throw new KielerException(
                    Messages.ModelErrorHandler_MarkerCreationError, e);
        }
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

}
