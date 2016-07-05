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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sccharts.HistoryType;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.StateType;
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
 * added to the execution manager and as consequence enables debugging features. It is recommended
 * to enable the KART data component, so that input can be provided.
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

    private SCChartsDebugPlugin plugin = SCChartsDebugPlugin.getDefault();
    private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();
    private String stateKey = "state";
    private String transitionKey = "transition";
    private IPath currentModelFile;
    private EObject rootElement;
    private Resource resource;

    // ------------------------------ DATA COMPONENT INTERN THINGS --------------------------------

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
        
        String s = this.getCurrentComponentID() + propertiesId.hashCode();
        return this.getCurrentComponentID() + propertiesId.hashCode();

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

    // --------------------------------- HELPER METHODS FOR STEP METHOD ---------------------------

    /**
     * Receives a list of active objects and determines whether it is necessary to stop the
     * execution.
     * 
     * @param currentStepObjects
     *            A list of active model elements.
     */
    private void checkOnPause(List<EObject> currentStepObjects) {
        if (KiemPlugin.getDefault().getExecution().isRunning()) {
            for (EObject elem : currentStepObjects) {
                if (elem instanceof Transition) {
                    boolean stop = false;
                    // first check on transition breakpoint
                    if (isEObjectInLine(elem)) {
                        stop = true;
                    }

                    // then check target states, important to check on possible hierarchy
                    if (!stop) {
                        State s = ((Transition) elem).getTargetState();
                        if (isEObjectInLine((EObject) s)) {
                            stop = true;
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
    }

    /**
     * For a given EObject checks whether there is a breakpoint specified that is associated with
     * this object.
     * 
     * @param obj
     *            The object of interest.
     * @return Returns true is there is a breakpoint associated with the object, otherwise false.
     */
    public boolean isEObjectInLine(EObject obj) {
        plugin.updateBreakpointLines();
        ICompositeNode n = NodeModelUtils.getNode(obj);
        int line = n.getStartLine();
        System.out.print(obj + " ");
        try {
            IBreakpoint b = plugin.getBreakpointLines().get(line);
            HashMap map = plugin.getBreakpointLines();
            if (b != null && b.isEnabled()) {
                System.out.println(true);
                return true;
            }
        } catch (CoreException e) {
            e.printStackTrace();
        }
        System.out.println(false);
        return false;
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
    protected final void refreshEObjectMap() {
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
            System.out.println(baseObjID + ":" + baseObj);

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
