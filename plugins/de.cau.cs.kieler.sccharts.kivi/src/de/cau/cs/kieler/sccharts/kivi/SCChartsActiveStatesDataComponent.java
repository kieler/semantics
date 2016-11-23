/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.kivi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.core.model.util.XtextModelingUtil;
import org.eclipse.elk.core.util.Maybe;
import org.eclipse.elk.core.util.Pair;

import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.internal.KiCoUtil;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.view.DiagramView;
import de.cau.cs.kieler.sccharts.ControlflowRegion;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

public class SCChartsActiveStatesDataComponent extends JSONObjectDataComponent
        implements IJSONObjectDataComponent {

    private static final boolean DEBUG = true;

    private static final String DEFAULT_STATE_KEY = "state";

    private static final String DEFAULT_TRANSITION_KEY = "transition";

    static final int KIEM_PROPERTY_STATENAME = 0;

    static final int KIEM_PROPERTY_TRANSITIONNAME = 1;

    static final int KIEM_PROPERTY_MAX = 2;

    static long tick = 0;

    SCChartsActiveStates activeStates = null;

    private IEditorPart diagramEditor;

    /** Remember when wrapup() was executed. */
    private boolean wrapupDone = false;

    // --------------------------------------------------------------------------

    /**
     * Instantiates a new SC charts active states data component.
     */
    public SCChartsActiveStatesDataComponent() {
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {
        synchronized (this) {
            wrapupDone = false;
        }

        activeStates = new SCChartsActiveStates();
        tick = 0;

        diagramEditor = getActiveEditor();
        if (diagramEditor == null) {
            return;
        }
        IEditorInput editorInput = diagramEditor.getEditorInput();
        if (!(editorInput instanceof FileEditorInput)) {
            return;
        }

        List<DiagramView> diagramViews = DiagramView.getDiagramViews(diagramEditor);
        if (diagramViews.isEmpty()) {
            throw new KiemInitializationException(
                    "Model visualization not shown, cannot visualize simulation.", true, null);
        }
        DiagramView viewPart = diagramViews.get(0);
        ViewContext viewContext = viewPart.getViewer().getViewContext();

        Object potentionEObject = viewContext.getInputModel();
        if (potentionEObject instanceof EObject) {
            modelRoot = (EObject) potentionEObject;
        } else {
            modelRoot = getActiveModel();
        }

        resource = getModelResource(true);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void wrapup() throws KiemInitializationException {
        activeStates = null;
        wrapupDone = true;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isProducer() {
        return true;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isObserver() {
        return true;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {

        // Derive the actually taken transitions
        ArrayList<Transition> takenTransitions = new ArrayList<Transition>();
        String transitionKey = getProperties()[KIEM_PROPERTY_TRANSITIONNAME].getValue();

        if (jSONObject.has(transitionKey)) {
            String transitionString;
            try {
                transitionString = jSONObject.get(transitionKey).toString();
                String[] transitions = transitionString.replaceAll("\\s", "").split(",");
                for (String transition : transitions) {
                    if (transition.length() > 1) {
                        EObject active = getModelResource(false).getEObject(transition);
                        if (active == null) {
                            // try alternative (compact) representation
                            active = getEObject(transition);
                        }
                        if (active != null) {
                            if (active instanceof Transition) {
                                takenTransitions.add((Transition) active);
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if (DEBUG) {
            System.out.println("#TICK: " + tick);
        }

        // TODO: in the initial step, enter the SCCharts itself!
        if (tick <= 1) {
            if (modelRoot instanceof State) {
                State state = (State) modelRoot;
                for (Region region : state.getRegions()) {
                    if (region instanceof ControlflowRegion) {
                        for (State innerState : ((ControlflowRegion) region).getStates()) {
                            if (innerState.isInitial()) {
                                activeStates.enterState(innerState);
                            }
                        }
                    }
                }
            }
        }

        // // Calculate left and then entered states
        // for (Transition transition : takenTransitions) {
        // State leaveState = transition.getSourceState();
        // activeStates.leaveState(leaveState);
        // }
        // for (Transition transition : takenTransitions) {
        // State leaveState = transition.getSourceState();
        // State enterState = transition.getTargetState();
        // activeStates.enterState(enterState);
        // //activeStates.leaveState(leaveState);
        // //SCChartsKiViPlugin.log(leaveState.getId() + " ----> " + enterState.getId());
        // }

        
        // Calculate left and then entered states
        for (Transition transition : takenTransitions) {
            State leaveState = transition.getSourceState();
            State enterState = transition.getTargetState();
            activeStates.leaveState(leaveState);
            activeStates.enterState(enterState);
        }
        
        
        
        // Calculate left and then entered states
        for (Transition transition : takenTransitions) {
            State leaveState = transition.getSourceState();
            State enterState = transition.getTargetState();
            activeStates.leaveState(leaveState);
            activeStates.enterState(enterState);
            // activeStates.leaveState(leaveState);
            if (DEBUG) {
                SCChartsKiViPlugin.log(leaveState.getId() + " ----> " + enterState.getId());
            }
        }

        for (State activeState : activeStates.getAllActiveStates()) {
            if (DEBUG) {
                SCChartsKiViPlugin.log("ACTIVE: " + activeState.getId());
            }
        }

        // Build list for visualization
        StringBuffer activeStatesBuf = new StringBuffer();

        for (State activeState : activeStates.getAllActiveStates()) {
            if (activeStatesBuf.length() > 0) {
                activeStatesBuf.append(",");
            }
            String activeStateName = getEncodedEObjectId(activeState);
            activeStatesBuf.append(activeStateName);
        }

        String activeStates = "";
        activeStates = activeStatesBuf.toString();
        String activeStatesName = this.getProperties()[KIEM_PROPERTY_STATENAME].getValue();
        // The return object to construct
        JSONObject returnObj = new JSONObject();
        try {
            returnObj.accumulate(activeStatesName, activeStates);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return returnObj;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[KIEM_PROPERTY_MAX];
        properties[KIEM_PROPERTY_STATENAME] = new KiemProperty("State Name", DEFAULT_STATE_KEY);
        properties[KIEM_PROPERTY_TRANSITIONNAME] =
                new KiemProperty("Transition Name", DEFAULT_TRANSITION_KEY);
        return properties;
    }

    /**
     * Sets the step number according to the button the user pressed. This is needed to correctly
     * handle history steps or jumps.
     * 
     * @param event
     *            the event
     */
    @SuppressWarnings("unchecked")
    @Override
    public void notifyEvent(final KiemEvent event) {
        if (event.isEvent(KiemEvent.STEP_INFO) && event.getInfo() instanceof Pair) {
            tick = ((Pair<Long, Long>) event.getInfo()).getFirst().longValue();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Return the types of events this component listens to.
     * 
     * @return the event types, currently only {@code KiemEvent.STEP_INFO}
     */
    @Override
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.STEP_INFO };
        KiemEvent event = new KiemEvent(events);
        return event;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    private Resource resource;
    private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();
    private EObject modelRoot;

    Resource getModelResource(boolean force) {
        return getModelResource(force, false);
    }

    Resource getModelResource(boolean force, boolean norefresh) {
        if (resource != null && !force) {
            return resource;
        }
        resource = modelRoot.eResource();
        if (resource == null) { // || resource.getURI() == null) {
            // We try to create a dummy resource
            // Create a dummy resource by calling serialization (this creates a dummy
            // resource on the fly)
            @SuppressWarnings("unused")
            KielerCompilerContext context = new KielerCompilerContext("", null);
            String discard = KiCoUtil.serialize(modelRoot, context, true);
            resource = context.getMainResource();
        }
        if (!norefresh) {
            refreshEObjectMap();
        }
        return resource;
    }

    // --------------------------------------------------------------------------

    /**
     * Recursively calls itself on eObjects that contain children to rebuild the eObject hash map.
     * 
     * @param baseObj
     *            the base EObject
     */
    private void refreshEObjectMap(final EObject baseObj) {
        // Add this item
        if (baseObj.eResource() == null) {
            resource = getModelResource(true, true);
        }
        String baseObjID = this.getEncodedEObjectId(baseObj);
        if (!eObjectMap.containsKey(baseObjID)) {
            eObjectMap.put(baseObjID, baseObj);
            if (DEBUG) {
                SCChartsKiViPlugin.log(baseObjID + ":" + baseObj);
            }

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

    // -----------------------------------------------------------------------------

    /**
     * Gets the eObject to an eObjectID cached by the hash map. With a first call of this function
     * the hash map is lazily filled.
     * 
     * @param eObjectID
     *            the EObject ID
     * @return the EObject
     */
    private EObject getEObject(final String eObjectID) {
        if ((eObjectID == null) || eObjectID.equals("")) {
            return null;
        } else if (eObjectMap.containsKey(eObjectID)) {
            // only do this if editor input has not changed
            return eObjectMap.get(eObjectID);
        } else {
            // Refresh the map and try again
            refreshEObjectMap();
            if (eObjectMap.containsKey(eObjectID)) {
                return eObjectMap.get(eObjectID);
            }
        }

        return null;
    }

    // -----------------------------------------------------------------------------

    /**
     * Refreshes and totally rebuilds the eObject hash map.
     */
    protected final void refreshEObjectMap() {
        eObjectMap.clear();
        refreshEObjectMap(this.modelRoot);
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected IEditorPart getActiveEditor() {
        final Maybe<IEditorPart> maybe = new Maybe<IEditorPart>();
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                // get the active editor
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                IWorkbenchPage activePage = window.getActivePage();
                IEditorPart editor = activePage.getActiveEditor();
                maybe.set((IEditorPart) editor);
            }
        });
        return maybe.get();
    }

    protected String getEncodedEObjectId(final EObject eObject) {
        if (eObject.eResource() != null) {
            String uri = eObject.eResource().getURIFragment(eObject);
            uri = (uri.hashCode() + "").replace("-", "M");
            return uri;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    protected EObject getActiveModel() {
        final IEditorPart editor = getActiveEditor();
        if (editor instanceof XtextEditor) {
            return XtextModelingUtil.getModelFromXtextEditor((XtextEditor) editor, true);
        }
        return null;
    }

}
