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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kivi.KiViDataComponent;

/**
 * This class is the main entry point to the debugger. A datacomponent is defined, that needs to be
 * added to the execution manager and as consequence enables debugging features.
 * 
 * @author lgr
 *
 */
public class DataComponent extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    /**
     * Shows the current activity of the debug mode. In case it's activated, the debug data
     * component is added to the execution schedule.
     */
    public static boolean DEBUG_MODE = true;
    public static boolean FAST_FORWARD = false;

    private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();
    private String stateKey = "state";
    private String transitionKey = "transition";
    private IPath currentModelFile;
    private EObject rootElement;
    private Resource resource;

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {
        currentModelFile = KiemPlugin.getCurrentModelFile();
        rootElement = KiemPlugin.getOpenedModelRootObjects().get(currentModelFile);
        resource = rootElement.eResource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void wrapup() throws KiemInitializationException {
        // no cleanup needed on termination
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isProducer() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isObserver() {
        return true;
    }

    /**
     * Checks the current state of the execution and in case there is a breakpoint enabled that
     * corresponds to the active model part, the execution is stopped.
     * 
     * {@inheritDoc}
     */
    @Override
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        System.out.println("Debug: " + jSONObject);
        if (KiemPlugin.getDefault().getExecution() != null) {
            List<List<EObject>> statesByStep = new ArrayList<List<EObject>>();
            List<EObject> currentStepObjects = new ArrayList<EObject>();

            if (jSONObject.has(transitionKey)) {
                try {
                    String transitionString = jSONObject.get(transitionKey).toString();
                    String[] transitions = transitionString.replaceAll("\\s", "").split(",");

                    for (String transition : transitions) {
                        System.out.println();
                        if (transition.length() > 1) {
                            EObject active = resource.getEObject(transition);
                            if (active == null) {
                                // try alternative (compact) representation
                                active = getEObject(transition);
                            }
                            if (active != null) {
                                if (!contains(statesByStep, active)) { // filter out newer
                                    currentStepObjects.add(active);
                                }
                            }
                        }
                    }
                    if (!currentStepObjects.isEmpty()) {
                        checkOnPause(currentStepObjects);
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;

    }

    private void checkOnPause(List<EObject> currentStepObjects) {
        if (KiemPlugin.getDefault().getExecution().isRunning()) {
            for (EObject elem : currentStepObjects) {
                if (elem instanceof Transition) {
                    if (SCChartsDebugPlugin.getDefault().checkTransitionequalsLine((Transition) elem)) {
                        if (KiemPlugin.getDefault().initExecution()) {
                            KiemPlugin.getDefault().getExecution().pauseExecutionSync();
                            break;
                        }
                    }
                }
            }

        }
    }

    private EObject getEObject(final String eObjectID) {
        if ((eObjectID == null) || eObjectID.equals("")) {
            return null;
        } else if (eObjectMap.containsKey(eObjectID)) {
            // Don't refresh the map when no need to do so.
            return eObjectMap.get(eObjectID);
        } else {
            refreshEObjectMap();
            if (eObjectMap.containsKey(eObjectID)) {
                return eObjectMap.get(eObjectID);
            }
        }
        return null;
    }

    protected final void refreshEObjectMap() {
        eObjectMap.clear();
        refreshEObjectMap(this.rootElement);
    }

    // -----------------------------------------------------------------------------

    /**
     * Recursively calls itself on eObjects that contain children to rebuild the eObject hash map.
     * 
     * @param baseObj
     *            the base EObject
     */
    private void refreshEObjectMap(final EObject baseObj) {

        String baseObjID = this.getEncodedEObjectId(baseObj);
        if (!eObjectMap.containsKey(baseObjID)) {
            eObjectMap.put(baseObjID, baseObj);
            System.out.println(baseObjID + ":" + baseObj);

            // Add all children
            TreeIterator<EObject> treeIterator = baseObj.eAllContents();
            while (treeIterator.hasNext()) {
                EObject treeIteratorObject = treeIterator.next();
                refreshEObjectMap(treeIteratorObject);
                // for (EObject treeIteratorObjectChild :
                // treeIteratorObject.eContents()) {
                // }
            }
        }

    }

    protected String getEncodedEObjectId(final EObject eObject) {
        if (eObject.eResource() != null) {
            String uri = eObject.eResource().getURIFragment(eObject);
            uri = (uri.hashCode() + "").replace("-", "M");
            return uri;
        }

        return null;
    }

    private static boolean contains(final List<List<EObject>> statesByStep, final EObject active) {
        for (List<EObject> list : statesByStep) {
            for (EObject e : list) {
                if (e.equals(active)) {
                    return true;
                }
            }
        }
        return false;
    }

}
