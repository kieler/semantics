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
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sccharts.ControlflowRegion;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * This class is the main entry point into the debugger. A data component is defined, that needs to
 * be added to the execution manager and as consequence enables debugging features. It is
 * recommended to enable the KART data component, so that input can be provided.
 * 
 * @author lgr
 *
 */
public class DataComponent extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    /**
     * Shows the current activity of the debug mode. In case it's activated, the debug data
     * component is added to the execution schedule.
     */
    public static boolean DEBUG_MODE = false;

    /**
     * During execution this enables the fast forward mode. The execution is only stopped in case
     * there was a breakpoint and can only be enabled in combination with {@link #DEBUG_MODE} set to
     * true.
     */
    public static boolean FAST_FORWARD = false;

    private SCChartsDebugPlugin plugin = SCChartsDebugPlugin.getDefault();
    private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();
    private String transitionKey = "transition";
    private IPath currentModelFile;
    private EObject rootElement;
    private Resource resource;

    // ------------------------------ DATA COMPONENT INTERN METHODS -------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {
        update();
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
     * It should not matter what internals this component provides, only its properties matter so
     * overriding this method enables changes in this component without having to update the
     * .execution files.
     * 
     * {@inheritDoc}
     */
    @Override
    public String getDataComponentId() {
        String propertiesId = "";
        if (this.provideProperties() != null) {
            KiemProperty[] propertiesTmp = this.provideProperties();
            for (int c = 0; c < propertiesTmp.length; c++) {
                try {
                    propertiesId = propertiesId + propertiesTmp[c].getKey();
                    propertiesId = propertiesId + propertiesTmp[c].getType().getClass().getName();
                } catch (Exception e) {
                    // ignore properties that a key/type cannot be retrieved for
                }
            }
        }
        return this.getCurrentComponentID() + propertiesId.hashCode();

    }

    /*
     * ********************************************************************************************
     * STEP METHOD
     *******************************************************************************************/
    /**
     * Checks the current state of the execution and in case there is a breakpoint enabled that
     * corresponds to the active model part, the execution is stopped.
     * 
     * {@inheritDoc}
     */
    @Override
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        if (KiemPlugin.getDefault().getExecution() != null) {
            List<List<EObject>> statesByStep = new ArrayList<List<EObject>>();
            List<EObject> currentStepObjects = new ArrayList<EObject>();

            if (jSONObject.has(transitionKey)) {
                try {
                    String transitionString = jSONObject.get(transitionKey).toString();
                    String[] transitions = transitionString.replaceAll("\\s", "").split(",");

                    for (String transition : transitions) {
                        if (transition.length() > 1) {
                            if (resource == null) {
                                update();
                            }
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

    // --------------------------------- HELPER METHODS FOR STEP METHOD ---------------------------

    /**
     * Receives a list of active objects and determines whether it is necessary to stop the
     * execution.
     * 
     * @param currentStepObjects
     *            A list of active model elements.
     */
    private void checkOnPause(List<EObject> currentStepObjects) {

        for (EObject elem : currentStepObjects) {
            if (elem instanceof Transition) {
                boolean stop = false;
                // Check on a transition breakpoint first.
                if (plugin.isEObjectInLine(elem, resource)) {
                    stop = true;
                }

                // Afterwards check the target states.
                // It's important to check on possible hierarchy.
                if (!stop) {
                    State s = ((Transition) elem).getTargetState();

                    if (plugin.isEObjectInLine((EObject) s, resource)) {
                        stop = true;
                    } else {
                        if (checkHierachicalNesting(s)) {
                            stop = true;
                        }
                    }
                }

                if (stop) {
                    if (KiemPlugin.getDefault().initExecution()) {
                        KiemPlugin.getDefault().getExecution().pauseExecutionSync();
                        break;
                    }
                }

            }
        }
    }

    /**
     * Recursively calls for the regions of a state until the state is no hierarchical state any
     * more. Also it's checked if there is a breakpoint associated with the state.
     * 
     * @param state
     *            The state that is
     * @return true if there is a breakpoint in an initial state
     */
    private boolean checkHierachicalNesting(State state) {
        // Get the regions to check for a hierarchy.
        EList<Region> regions = state.getRegions();

        if (regions.isEmpty()) {
            return false;
        }

        boolean stop = false;

        ArrayList<State> initialStatesInRegions = new ArrayList<>();

        // For every region check if there is a breakpoint on a initial state.
        for (Region region : regions) {

            if (region instanceof ControlflowRegion) {
                ControlflowRegion cfregion = (ControlflowRegion) region;
                EList<State> cfstates = cfregion.getStates();

                for (State cfstate : cfstates) {
                    if (cfstate.isInitial()) {
                        if (plugin.isEObjectInLine((EObject) cfstate, resource)) {
                            stop = true;
                        }
                        initialStatesInRegions.add(cfstate);
                    }
                }
            }

            // A reason to stop was found, don't continue looking for other
            // possible breakpoint occurrences.
            if (stop) {
                return true;
            }
        }
        for (State initialState : initialStatesInRegions) {
            if (!stop) {
                stop |= checkHierachicalNesting(initialState);
            } else {
                break;
            }
        }

        if (stop) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gets the current active model elements that are saved in the {@link KiemPlugin}.
     */
    private void update() {
        currentModelFile = KiemPlugin.getCurrentModelFile();
        rootElement = KiemPlugin.getOpenedModelRootObjects().get(currentModelFile);
        resource = rootElement.eResource();
    }

    // ------------------------------ METHODS NEEDED FOR INTERN EOBJECT MAP -----------------------

    /**
     * Searches for a EObject in the intern map {@link eObjectMap}.
     * 
     * @param eObjectID
     *            The objectID to look for, most likely a hash value.
     * @return The corresponding EObject if there is one, otherwise {@code null}.
     */
    private EObject getEObject(final String eObjectID) {
        if ((eObjectID == null) || eObjectID.equals("")) {
            return null;
        } else if (eObjectMap.containsKey(eObjectID)) {
            return eObjectMap.get(eObjectID);
        } else {
            refreshEObjectMap();
            if (eObjectMap.containsKey(eObjectID)) {
                return eObjectMap.get(eObjectID);
            }
        }
        return null;
    }

    /**
     * Refreshes the map.
     */
    private final void refreshEObjectMap() {
        eObjectMap.clear();
        refreshEObjectMap(this.rootElement);
    }

    /**
     * Recursively calls itself on eObjects that contain children to rebuild the eObject hash map.
     * 
     * @param baseObj
     *            The base EObject.
     */
    private void refreshEObjectMap(final EObject baseObj) {

        String baseObjID = this.getEncodedEObjectId(baseObj);
        if (!eObjectMap.containsKey(baseObjID)) {
            eObjectMap.put(baseObjID, baseObj);

            TreeIterator<EObject> treeIterator = baseObj.eAllContents();
            while (treeIterator.hasNext()) {
                EObject treeIteratorObject = treeIterator.next();
                refreshEObjectMap(treeIteratorObject);
            }
        }

    }

    /**
     * Encodes an EObject's URI fragment and returns the result.
     * 
     * @param eObject
     *            The base EObject.
     * @return A String representation of the object.
     */
    private String getEncodedEObjectId(final EObject eObject) {
        if (eObject.eResource() != null) {
            String uri = eObject.eResource().getURIFragment(eObject);
            uri = (uri.hashCode() + "").replace("-", "M");
            return uri;
        }

        return null;
    }

    /**
     * Checks if the list of lists contains the object.
     * 
     * @param statesByStep
     *            The list of lists to search for.
     * @param active
     *            The object of interest.
     * @return True if it is contained in the list of lists, otherwise false.
     */
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
