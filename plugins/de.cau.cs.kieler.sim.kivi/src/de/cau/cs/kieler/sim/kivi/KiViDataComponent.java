/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kivi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.elk.graph.KEdge;
import org.eclipse.elk.graph.KLabel;
import org.eclipse.elk.graph.KNode;
import org.eclipse.elk.graph.properties.IProperty;
import org.eclipse.elk.graph.properties.Property;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.internal.KiCoUtil;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KBackground;
import de.cau.cs.kieler.klighd.krendering.KColor;
import de.cau.cs.kieler.klighd.krendering.KContainerRendering;
import de.cau.cs.kieler.klighd.krendering.KForeground;
import de.cau.cs.kieler.klighd.krendering.KRendering;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle;
import de.cau.cs.kieler.klighd.krendering.KStyle;
import de.cau.cs.kieler.klighd.krendering.KText;
import de.cau.cs.kieler.klighd.krendering.impl.KRoundedRectangleImpl;
import de.cau.cs.kieler.klighd.ui.view.DiagramView;
import de.cau.cs.kieler.klighd.util.Iterables2;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.JSONDataPool;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * A data component that observes the activity (active and error states and transitions) of
 * SyncCharts during simulation.
 * 
 * @author mmu, cmot
 * @kieler.ignore (excluded from review process)
 * 
 */
public abstract class KiViDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private static final int DEFAULT_STEPS = 0; // changed by cmot upon rvh's request

    private static final String DEFAULT_STATE_KEY = "state";

    private static final String DEFAULT_TRANSITION_KEY = "transition";

    private static final String DEFAULT_ERROR_STATE_KEY = "errorState";

    private static final String DEFAULT_ERROR_TRANSITION_KEY = "errorTransition";

    static final int KIEM_PROPERTY_STATENAME = 0;

    static final int KIEM_PROPERTY_TRANSITIONNAME = 1;

    static final int KIEM_PROPERTY_ERRORSTATENAME = 2;

    static final int KIEM_PROPERTY_ERRORTRANSITIONNAME = 3;

    static final int KIEM_PROPERTY_HISTORYSTEPS = 4;

    static final int KIEM_PROPERTY_MAX = 5;

    private IEditorPart diagramEditor;

    private Resource resource;

    private EObject modelRoot;

    private int steps;

    private String stateKey;

    private String transitionKey;

    private String errorStateKey;

    private String errorTransitionKey;

    private DataComponentWrapper wrapper;

    private ViewContext viewContext;

    /** Remember when wrapup() was executed. */
    private boolean wrapupDone = false;

    private static KColor SCCHARTSRED1 = KRenderingFactory.eINSTANCE.createKColor().setColor(255,
            215, 215);
    private static KColor SCCHARTSRED2 = KRenderingFactory.eINSTANCE.createKColor().setColor(255,
            158, 158);

    private static KBackground STYLE1 = KRenderingFactory.eINSTANCE.createKBackground()
            .setColors(SCCHARTSRED1, SCCHARTSRED2).setGradientAngle2(90);

    private ArrayList<KNode> expanded = new ArrayList<KNode>();

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        synchronized (this) {
            wrapupDone = false;
        }
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
        viewContext = viewPart.getViewer().getViewContext();
        
        Object potentionEObject = viewContext.getInputModel();
        if (potentionEObject instanceof EObject) {
            modelRoot = (EObject) potentionEObject;
        } else {
            modelRoot = getActiveModel();
        }

        resource = getModelResource(true);
//        if (resource == null) {
//            throw new KiemInitializationException(
//               "Model is not contained in a resource and cannot be visualized", true, null);
//        }
        
        stateKey = getProperties()[KIEM_PROPERTY_STATENAME].getValue();
        transitionKey = getProperties()[KIEM_PROPERTY_TRANSITIONNAME].getValue();
        errorStateKey = getProperties()[KIEM_PROPERTY_ERRORSTATENAME].getValue();
        errorTransitionKey = getProperties()[KIEM_PROPERTY_ERRORTRANSITIONNAME].getValue();
        steps = getProperties()[KIEM_PROPERTY_HISTORYSTEPS].getValueAsInt();
        for (DataComponentWrapper w : KiemPlugin.getDefault().getDataComponentWrapperList()) {
            if (w.getDataComponent() == this) {
                wrapper = w;
                break;
            }
        }
        if (wrapper == null) {
            throw new KiemInitializationException(
                    "Can't find wrapper for State Activity Data Component", true, null);
        }
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     * 
     */
    public void wrapup() throws KiemInitializationException {
        hightLightStates(new ArrayList<EObject>());
        hightLightTransitions(new ArrayList<EObject>());
        expanded.clear();
        eObjectMap.clear();
        if (diagramEditor == null) {
            return;
        }
        // Necessary to remove scaling!
        LightDiagramServices.layoutDiagram(viewContext);
        wrapupDone = true;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return false;
        // return true;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    // --------------------------------------------------------------------------

    @Override
    public boolean isHistoryObserver() {
        return true;
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
        properties[KIEM_PROPERTY_ERRORSTATENAME] =
                new KiemProperty("Error State Name", DEFAULT_ERROR_STATE_KEY);
        properties[KIEM_PROPERTY_ERRORTRANSITIONNAME] =
                new KiemProperty("Error Transition Name", DEFAULT_ERROR_TRANSITION_KEY);
        properties[KIEM_PROPERTY_HISTORYSTEPS] = new KiemProperty("History Steps", DEFAULT_STEPS);
        return properties;
    }

    // --------------------------------------------------------------------------
    
    Resource getModelResource(boolean force) {
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
        refreshEObjectMap();
        return resource;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        if (diagramEditor == null) {
            return null;
        }

        // only do this if execution is currently active
        if (KiemPlugin.getDefault().getExecution() != null) {
            JSONDataPool pool = KiemPlugin.getDefault().getExecution().getDataPool();
            long currentStep = KiemPlugin.getDefault().getExecution().getSteps();

            List<List<EObject>> statesByStep = new ArrayList<List<EObject>>();
            List<List<EObject>> errorStatesByStep = new ArrayList<List<EObject>>();
            List<EObject> currentStepObjects = new ArrayList<EObject>();
            List<EObject> currentErrorStepObjects = new ArrayList<EObject>();
            JSONObject currentJSONObject = jSONObject;
            try {
                for (int i = 0; i <= steps; i++) {
                    // ACTIVE STATES AND TRANSITIONS
                    if (currentJSONObject.has(stateKey)) {
                        String stateString = currentJSONObject.get(stateKey).toString();
                        String[] states = stateString.replaceAll("\\s", "").split(",");
                        for (String state : states) {
                            if (state.length() > 1) {
                                EObject active = getModelResource(false).getEObject(state);
                                if (active == null) {
                                    // try alternative (compact) representation
                                    active = getEObject(state);
                                }
                                if (active != null) {
                                    if (!contains(statesByStep, active)) { // filter out newer
                                        currentStepObjects.add(active);
                                    }
                                }
                            }
                        }
                    }
                    if (currentJSONObject.has(transitionKey)) {
                        String transitionString = currentJSONObject.get(transitionKey).toString();
                        String[] transitions = transitionString.replaceAll("\\s", "").split(",");
                        for (String transition : transitions) {
                            if (transition.length() > 1) {
                                EObject active = getModelResource(false).getEObject(transition);
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
                    }

                    // ERROR STATES AND ERROR TRANSITIONS
                    if (currentJSONObject.has(errorStateKey)) {
                        String stateString = currentJSONObject.get(errorStateKey).toString();
                        String[] states = stateString.replaceAll("\\s", "").split(",");
                        for (String state : states) {
                            if (state.length() > 1) {
                                EObject errorState = getModelResource(false).getEObject(state);
                                if (errorState == null) {
                                    // try alternative (compact) representation
                                    errorState = getEObject(state);
                                }
                                if (errorState != null) {
                                    if (!contains(errorStatesByStep, errorState)) { // filter out
                                                                                    // newer
                                        currentErrorStepObjects.add(errorState);
                                    }
                                }
                            }
                        }
                    }
                    if (currentJSONObject.has(errorTransitionKey)) {
                        String transitionString =
                                currentJSONObject.get(errorTransitionKey).toString();
                        String[] transitions = transitionString.replaceAll("\\s", "").split(",");
                        for (String transition : transitions) {
                            if (transition.length() > 1) {
                                EObject errorState = getModelResource(false).getEObject(transition);
                                if (errorState == null) {
                                    // try alternative (compact) representation
                                    errorState = getEObject(transition);
                                }
                                if (errorState != null) {
                                    if (!contains(errorStatesByStep, errorState)) { // filter out
                                                                                    // newer
                                        currentErrorStepObjects.add(errorState);
                                    }
                                }
                            }
                        }
                    }

                    // redeclare/reset for the next step (save history)
                    if (currentJSONObject.has(stateKey) || currentJSONObject.has(transitionKey)
                            || currentJSONObject.has(errorStateKey)
                            || currentJSONObject.has(errorTransitionKey)) {
                        statesByStep.add(currentStepObjects);
                        errorStatesByStep.add(currentErrorStepObjects);
                        currentErrorStepObjects = new ArrayList<EObject>();
                        currentStepObjects = new ArrayList<EObject>();
                    }
                    long index = wrapper.getPoolIndex(currentStep - i - 1 + 0);
                    currentJSONObject = pool.getData(null, index);
                }

                List<EObject> currentStatesAndTransitions = Iterables.getLast(statesByStep, null);
                if (currentStatesAndTransitions != null) {

                    hightLightStates(currentStatesAndTransitions);
                    hightLightTransitions(currentStatesAndTransitions);

                }

                // LightDiagramServices.layoutDiagram(viewContext);

                // !!!//
                // if (StateActivityTrigger.getInstance() != null) {
                // if (!wrapupDone) {
                // // StateActivityTrigger.getInstance().step(statesByStep, diagramEditor);
                //
                // /*
                // * performing a synchronized triggering of the KiVi trigger. This will block
                // * until all effects have finished executing that are caused by this
                // * triggering. This way we create back pressure from the effects to KIEM.
                // */
                // StateActivityTrigger.getInstance().synchronizedStep(statesByStep,
                // errorStatesByStep, diagramEditor);
                // }
                // }
            } catch (JSONException e) {
                // never happens because JSON.get() is checked by JSON.has()
            }
        }
        return null;
    }

    public static IProperty<Object> HIGHLIGHTING_MARKER = new Property<Object>("highlighting");

    private Predicate<KStyle> filter = new Predicate<KStyle>() {
        public boolean apply(final KStyle style) {
            return style.getProperty(HIGHLIGHTING_MARKER) == KiViDataComponent.this;
        }
    };
    private Predicate<KStyle> redFilter = new Predicate<KStyle>() {
        public boolean apply(final KStyle style) {
            return (style instanceof KForeground);
        }
    };

    // --------------------------------------------------------------------------

    private void hightLightStates(List<EObject> currentStatesAndTransitions) {
        List<KNode> currentStates = Lists.newArrayList();

        // Calculate NEW highlighting
        for (EObject eObject : currentStatesAndTransitions) {
            final KNode viewElementState = viewContext.getTargetElement(eObject, KNode.class);
            if (viewElementState != null) {
                currentStates.add(viewElementState);
            }
        }

        // Remove new highlighted from ALL elements to get NOT highlighted
        @SuppressWarnings("unchecked")
        final List<? extends KNode> notHighlightedStates =
                (List<? extends KNode>) Lists
                        .newArrayList(de.cau.cs.kieler.klighd.util.ModelingUtil
                                .eAllContentsOfType2(viewContext.getViewModel(), KNode.class));
        notHighlightedStates.removeAll(currentStates);

        // Remove highlighting for NOT highlighted elements
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                for (KNode k : notHighlightedStates) {
                    viewContext.getViewer().scale(k, 1f);
                    KRendering ren = k.getData(KRendering.class);
                    if (Iterables.any(ren.getStyles(), filter)) {
                        Iterables.removeIf(ren.getStyles(), filter);
                        for (KText t : Iterables2.toIterable(Iterators.filter(ren.eAllContents(),
                                KText.class))) {
                            Iterables.removeIf(t.getStyles(), redFilter);
                        }
                    }
                    if (expanded.contains(k)) {
                        viewContext.getViewer().collapse(k);
                        expanded.remove(k);
                    }
                }
            }
        });

        // Add highlighting for NEW highlighted elements
        final KBackground style1 =
                KRenderingFactory.eINSTANCE.createKBackground()
                        .setColorsAlphasGradientAngleCopiedFrom(STYLE1);
        style1.setProperty(HIGHLIGHTING_MARKER, KiViDataComponent.this);
        style1.setPropagateToChildren(true);
        final KStyle style2 = KRenderingFactory.eINSTANCE.createKForeground().setColor(Colors.RED);
        style2.setProperty(HIGHLIGHTING_MARKER, KiViDataComponent.this);
        final KStyle style3 = KRenderingFactory.eINSTANCE.createKForeground().setColor(Colors.RED);

        for (final KNode viewElementState : currentStates) {
            final KContainerRendering ren = viewElementState.getData(KContainerRendering.class);
            final boolean flagged = Iterables.any(ren.getStyles(), filter);
            if (!flagged) {
                final KRoundedRectangle kRoundedRectangle =
                        viewElementState.getData(KRoundedRectangleImpl.class);

                Display.getDefault().syncExec(new Runnable() {
                    public void run() {
                        for (KText viewElementStateLabel : Iterables2.toIterable(Iterators.filter(
                                ren.eAllContents(), KText.class))) {
                            viewElementStateLabel.getStyles().add(EcoreUtil.copy(style3));

                        }
                        ren.getStyles().add(EcoreUtil.copy(style2));
                        ren.getStyles().add(EcoreUtil.copy(style1));

                        viewContext.getViewer().scale(viewElementState, 1.0f);
                        for (KNode r : viewElementState.getChildren()) {
                            if (!viewContext.getViewer().isExpanded(r)) {
                                viewContext.getViewer().expand(r);
                                expanded.add(r);
                            }
                        }

                    }
                });
            }
        }

    }

    // --------------------------------------------------------------------------

    private void hightLightTransitions(List<EObject> currentStatesAndTransitions) {
        List<KEdge> currentTransitions = Lists.newArrayList();

        // Calculate NEW highlighting
        for (EObject eObject : currentStatesAndTransitions) {
            final KEdge viewElementTransition = viewContext.getTargetElement(eObject, KEdge.class);
            if (viewElementTransition != null) {
                currentTransitions.add(viewElementTransition);
            }
        }

        // Remove new highlighted from ALL elements to get NOT highlighted
        @SuppressWarnings("unchecked")
        final List<KEdge> notHighlightedEdges = new ArrayList<KEdge>();
        final List<? extends KNode> allNodes =
                (List<? extends KNode>) Lists
                        .newArrayList(de.cau.cs.kieler.klighd.util.ModelingUtil
                                .eAllContentsOfType2(viewContext.getViewModel(), KNode.class));
        for (KNode kNode : allNodes) {
            for (KEdge kEdge : kNode.getOutgoingEdges()) {
                notHighlightedEdges.add(kEdge);
            }
        }
        notHighlightedEdges.removeAll(currentTransitions);

        // Remove highlighting for NOT highlighted elements
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                for (KEdge k : notHighlightedEdges) {
                    KRendering ren = k.getData(KRendering.class);
                    if (Iterables.any(ren.getStyles(), filter)) {
                        Iterables.removeIf(ren.getStyles(), filter);
                        if (k.getLabels().size() > 0) {
                            KLabel label = k.getLabels().get(0);
                            KText ren2 = label.getData(KText.class);
                            Iterables.removeIf(ren2.getStyles(), redFilter);
                        }
                    }
                }
            }
        });

        // Add highlighting for NEW highlighted elements
        final KStyle style2 = KRenderingFactory.eINSTANCE.createKForeground().setColor(Colors.RED);
        style2.setProperty(HIGHLIGHTING_MARKER, KiViDataComponent.this);
        style2.setPropagateToChildren(true);
        final KStyle style3 = KRenderingFactory.eINSTANCE.createKForeground().setColor(Colors.RED);

        final List<KEdge> currentTransitionsCopy = currentTransitions;

        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                for (final KEdge viewElementTransition : currentTransitionsCopy) {
                    final KContainerRendering ren =
                            viewElementTransition.getData(KContainerRendering.class);
                    final boolean flagged = Iterables.any(ren.getStyles(), filter);
                    if (!flagged) {
                        ren.getStyles().add(EcoreUtil.copy(style2));
                        List<KLabel> labels = viewElementTransition.getLabels();
                        if (labels != null && labels.size() > 0) {
                            final KLabel label = labels.get(0);
                            if (label != null) {
                                final KText ren2 = label.getData(KText.class);
                                ren2.getStyles().add(EcoreUtil.copy(style3));
                            }
                        }
                    }
                }
            }
        });

    }

    // --------------------------------------------------------------------------

    /**
     * Utility method telling wether an active EObject is part of a list.
     * 
     * @param statesByStep
     *            the states by step
     * @param active
     *            the active
     * @return true, if successful
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

    // --------------------------------------------------------------------------

    /**
     * Implements a getter for the active editor.
     * 
     * @return the active editor
     */
    protected abstract IEditorPart getActiveEditor();

    // --------------------------------------------------------------------------

    /**
     * Implements a getter for the active model (root model element).
     * 
     * @return the active model
     */
    protected abstract EObject getActiveModel();

    // --------------------------------------------------------------------------
    // -----------------------------------------------------------------------------

    /**
     * Gets the encoded id to compare objects to the ones produced by the simulation of the
     * corresponding Xtext editor. The names of the statements and error statements produced by the
     * simulator must match these IDs.
     * 
     * @param eObject
     *            the EObject
     * @return the encoded EObject ID
     */
    protected abstract String getEncodedEObjectId(final EObject eObject);

    // -----------------------------------------------------------------------------

    private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();

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
     * Recursively calls itself on eObjects that contain children to rebuild the eObject hash map.
     * 
     * @param baseObj
     *            the base EObject
     */
    private void refreshEObjectMap(final EObject baseObj) {
        // Add this item
        if (baseObj.eResource() == null) {
            resource = getModelResource(true);
        }
        String baseObjID = this.getEncodedEObjectId(baseObj);
        if (!eObjectMap.containsKey(baseObjID)) {
            eObjectMap.put(baseObjID, baseObj);
            SimKiViPlugin.log(baseObjID + ":" + baseObj);

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
}
