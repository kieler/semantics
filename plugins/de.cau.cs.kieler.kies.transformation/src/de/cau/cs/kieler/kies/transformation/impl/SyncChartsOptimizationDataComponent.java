/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kies.transformation.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtend.expression.Variable;
import org.json.JSONObject;

import com.google.common.collect.ImmutableMap;

import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.kies.transformation.core.AbstractTransformationDataComponent;
import de.cau.cs.kieler.kies.transformation.core.TransformationDescriptor;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;

/**
 * @author uru
 * 
 */
public class SyncChartsOptimizationDataComponent extends AbstractTransformationDataComponent {

    // base packages and xpand transformation file.
    private static final String SYNCCHARTS_PACKAGE = "de.cau.cs.kieler.synccharts.SyncchartsPackage";
    private static final String EXPRESSIONS_PACKAGE = "de.cau.cs.kieler.core.kexpressions."
            + "KExpressionsPackage";
    private static final String ECORE_PACKAGE = "org.eclipse.emf.ecore.EcorePackage";
    private static final String TRANSFORMATION_FILE = "SyncchartOptimization.ext";

    private State rootState;
    private Region rootRegion;

    private HashSet<State> workedStates = new HashSet<State>();
    private ArrayList<LinkedList<State>> stateHierarchy = new ArrayList<LinkedList<State>>(5);
    private LinkedList<State> flattenedStates = new LinkedList<State>();;

    public static final String GLOBALVAR_REC = "recursive";
    public static final String GLOBALVAR_RULE1 = "rule1";
    public static final String GLOBALVAR_RULE2 = "rule2";
    public static final String GLOBALVAR_RULE3 = "rule3";
    public static final String GLOBALVAR_RULE4 = "rule4";
    public static final String GLOBALVAR_RULE5 = "rule5";
    public static final String GLOBALVAR_RULE6 = "rule6";
    public static final String GLOBALVAR_RULE7 = "rule7";
    public static final String GLOBALVAR_RULE8 = "rule8";

    /**
     * 
     */
    public SyncChartsOptimizationDataComponent() {
        super(new ImmutableMap.Builder<String, Variable>()
                .put(GLOBALVAR_REC, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE1, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE2, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE3, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE4, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE5, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE6, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE7, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE8, TransformationUtil.getXtendVarBoolean(true)).build());
    }

    /**
     * @param rootState
     *            the rootState to set
     */
    public void setRootState(State rootState) {
        this.rootState = rootState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {
        super.initialize();

        // get recursive property
        KiemProperty prop = getProperties()[0];
        boolean recursive = prop.getValueAsBoolean();
        globalVars.get(GLOBALVAR_REC).setValue(recursive);
        // init global variables
        // HashMap<String, Variable> globalVars = new HashMap<String, Variable>();
        // globalVars.put("recursive", new Variable("boolean", recursive));

        for (int i = 1; i < 9; i++) {
            KiemProperty p = getProperties()[i];
            boolean ruleX = p.getValueAsBoolean();
            globalVars.get("rule" + i).setValue(ruleX);
        }

        facade = AbstractTransformationDataComponent.initializeFacade(TRANSFORMATION_FILE,
                getBasePackages(), globalVars);

        IEditorPart editor = getActiveEditor();
        if (editor instanceof SyncchartsDiagramEditor) {
            EditPart rootEditPart = ((DiagramEditor) editor).getDiagramEditPart();
            EditPartViewer viewer = rootEditPart.getViewer();

            // programmatically select the root state
            viewer.select(rootEditPart);

            @SuppressWarnings("unchecked")
            List<EditPart> selected = viewer.getSelectedEditParts();
            if (selected.size() == 1) {
                EditPart selPart = selected.get(0);
                Object selView = selPart.getModel();
                EObject selModel = ((View) selView).getElement();
                rootRegion = (Region) selModel;
                State root = ((Region) selModel).getStates().get(0);
                rootState = root;

                // check if model was transformed completely
                TreeIterator<EObject> it = root.eAllContents();
                while (it.hasNext()) {
                    EObject curr = it.next();
                    if (curr instanceof State) {
                        if (!((State) curr).getBodyText().isEmpty()) {
                            throw new KiemInitializationException(
                                    "Model has not been transformed completely!", true, null);
                        }
                    }
                }
            }
        }
        if (rootState != null) {
            // collect initial set of all possible states
            collectAllStatesRecursivley(rootState, 0);
            flattenedStates = new LinkedList<State>();
            for (int i = stateHierarchy.size() - 1; i >= 0; i--) {
                flattenedStates.addAll(stateHierarchy.get(i));
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getBasePackages() {
        LinkedList<String> basePackages = new LinkedList<String>();
        basePackages.add(SYNCCHARTS_PACKAGE);
        basePackages.add(EXPRESSIONS_PACKAGE);
        basePackages.add(ECORE_PACKAGE);
        return basePackages.toArray(new String[basePackages.size()]);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTransformationFile() {
        return TRANSFORMATION_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransformationDescriptor getNextTransformation() {

        if (flattenedStates.isEmpty()) {
            return null;
        }

        State start = rootState;

        List<EObject> selected = TransformationUtil.getCurrentEditorSelection();
        // currently only for one selected item possible
        if (selected != null && !selected.isEmpty() && selected.size() == 1) {
            for (EObject obj : selected) {
                if (obj instanceof State) {
                    start = (State) obj;
                }
            }
        }

        // collect all possible states
        stateHierarchy.clear();
        collectAllStatesRecursivley(start, 0);
        flattenedStates = new LinkedList<State>();
        for (int i = stateHierarchy.size() - 1; i >= 0; i--) {
            flattenedStates.addAll(stateHierarchy.get(i));
        }

        if (!flattenedStates.isEmpty()) {
            // foo = flattenedStates.poll();
            System.out.println(" ######### foo " + flattenedStates.size() + " "
                    + flattenedStates.get(0));
            // if (foo != null) {
            TransformationDescriptor descriptor = new TransformationDescriptor("ruleAll",
                    new Object[] { flattenedStates });
            // workedStates.add(foo);
            return descriptor;
            // }
        } else {
            System.out.println("DONE");
        }

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void wrapup() throws KiemInitializationException {
        super.wrapup();
        workedStates.clear();
        flattenedStates.clear();
        stateHierarchy.clear();
    }

    private void collectAllStatesRecursivley(final State parent, final int level) {

        if (stateHierarchy.size() <= level || stateHierarchy.get(level) == null) {
            LinkedList<State> levelStates = new LinkedList<State>();
            // stateHierarchy.ensureCapacity(level + 1);
            stateHierarchy.add(level, levelStates);
        }
        LinkedList<State> levelStates = stateHierarchy.get(level);
        levelStates.add(parent);

        for (Region r : parent.getRegions()) {
            for (State s : r.getStates()) {
                collectAllStatesRecursivley(s, level + 1);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject step(final JSONObject arg0) throws KiemExecutionException {
        JSONObject o = null;
        try {
            o = super.step(arg0);
        } catch (StackOverflowError soe) {
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "A stackoverflow occured. As the optimization of large diagrams "
                            + "requires more stack than usual, increasing the stacksize "
                            + "may solve the problem.", soe);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
        return o;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemProperty[] provideProperties() {
        final int numberOfProperties = 9;
        KiemProperty[] properties = new KiemProperty[numberOfProperties];

        properties[0] = new KiemProperty("Recursive", true);
        // create rules for the optimizations
        for (int i = 1; i < numberOfProperties; i++) {
            properties[i] = new KiemProperty("rule" + i, true);
        }

        return properties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doPostTransformation() {
        try {
            ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                    ActionLabelProcessorWrapper.SERIALIZE);
            ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                    ActionLabelProcessorWrapper.PARSE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
