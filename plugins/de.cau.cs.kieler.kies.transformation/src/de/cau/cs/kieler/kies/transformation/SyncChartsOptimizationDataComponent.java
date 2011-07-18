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
package de.cau.cs.kieler.kies.transformation;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtend.expression.Variable;
import org.json.JSONObject;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.model.xtend.util.XtendTransformationUtil;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;

/**
 * DataComponent optimizing an existing SyncCharts.
 * 
 * @author uru
 * 
 */
public class SyncChartsOptimizationDataComponent extends AbstractTransformationDataComponent {

    // base packages and xpand transformation file.
    private static final String SYNCCHARTS_PACKAGE = "de.cau.cs.kieler.synccharts.SyncchartsPackage";
    private static final String EXPRESSIONS_PACKAGE = "de.cau.cs.kieler.core.kexpressions."
            + "KExpressionsPackage";
    private static final String ECORE_PACKAGE = "org.eclipse.emf.ecore.EcorePackage";
    /** necessary because KiesUtil.ext has to be evaluated!. */
    private static final String ESTEREL_PACKAGE = "de.cau.cs.kieler.kies.esterel.EsterelPackage";
    private static final String TRANSFORMATION_FILE = "SyncchartOptimization.ext";

    private ArrayListMultimap<Integer, State> stateHierarchy = ArrayListMultimap.create();
    private LinkedList<State> flattenedStates = new LinkedList<State>();

    /**
     * global variable determining whether the transformation should be run recursively, hence
     * everything is transformed within one step.
     */
    public static final String GLOBALVAR_REC = "recursive";
    // CHECKSTYLEOFF Javadoc
    public static final String GLOBALVAR_RULE1 = "rule1";
    public static final String GLOBALVAR_RULE2 = "rule2";
    public static final String GLOBALVAR_RULE3 = "rule3";
    public static final String GLOBALVAR_RULE4 = "rule4";
    public static final String GLOBALVAR_RULE5 = "rule5";
    public static final String GLOBALVAR_RULE6 = "rule6";
    public static final String GLOBALVAR_RULE7 = "rule7";
    public static final String GLOBALVAR_RULE8 = "rule8";

    // CHECKSTYLEON Javadoc

    /**
     * default constructor.
     */
    public SyncChartsOptimizationDataComponent() {
        this(false);
    }

    /**
     * @param kivimode
     *            pass {@code true} if this data component is used in a way that does not use KIEM.
     */
    public SyncChartsOptimizationDataComponent(final boolean kivimode) {
        super(new ImmutableMap.Builder<String, Variable>()
                .put(GLOBALVAR_REC, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE1, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE2, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE3, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE4, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE5, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE6, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE7, TransformationUtil.getXtendVarBoolean(true))
                .put(GLOBALVAR_RULE8, TransformationUtil.getXtendVarBoolean(true)).build(),
                kivimode);
    }

    /**
     * @param theRootState
     *            the rootState to set
     */
    public void setRootState(final State theRootState) {
        this.rootState = theRootState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {

        if (!headless && !kiviMode) {
            // assure that a SyncCharts editor is opened.
            IEditorPart activeEditor = TransformationUtil.getActiveEditor();
            if (!(activeEditor instanceof SyncchartsDiagramEditor)) {
                throw new KiemInitializationException("Optimization of SyncCharts is only possible"
                        + " in the context of an SynchChartsDiagramEditor.", true, null, false);
            }
        }

        super.initialize();

        // get recursive property
        KiemProperty prop = getProperties()[0];
        boolean recursive = prop.getValueAsBoolean();
        globalVars.get(GLOBALVAR_REC).setValue(recursive);

        // get all rule properties
        // CHECKSTYLEOFF MagicNumber - no matter what, there are 9 rules!
        for (int i = 1; i < 9; i++) {
            // CHECKSTYLEON MagicNumber
            KiemProperty p = getProperties()[i];
            boolean ruleX = p.getValueAsBoolean();
            globalVars.get("rule" + i).setValue(ruleX);
        }

        // initialize facade
        facade = XtendTransformationUtil.initializeFacade(TRANSFORMATION_FILE, getBasePackages(),
                globalVars);

        // get current models' root element
        fetchRootRegionAndState();

        if (rootState != null) {
            // collect initial set of all possible states
            collectAllStatesHierarchically(rootState, 0);
            flattenedStates = Lists.newLinkedList();
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
        return new String[] { SYNCCHARTS_PACKAGE, EXPRESSIONS_PACKAGE, ESTEREL_PACKAGE,
                ECORE_PACKAGE };
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
        // if the list with flattened states was emptied during prior execution, there is no further
        // optimization potential
        // if (flattenedStates.isEmpty()) {
        // return null;
        // }

        // fetch user selection
        State start = rootState;
        List<EObject> selection = TransformationUtil.getCurrentEditorSelection();
        // currently only for one selected item possible
        if (selection != null && !selection.isEmpty() && selection.size() == 1) {
            for (EObject obj : selection) {
                if (obj instanceof State) {
                    start = (State) obj;
                }
            }
        }

        // collect all possible states
        stateHierarchy.clear();
        collectAllStatesHierarchically(start, 0);

        // flatten them
        flattenedStates = Lists.newLinkedList();
        for (int i = stateHierarchy.size() - 1; i >= 0; i--) {
            flattenedStates.addAll(stateHierarchy.get(i));
        }

        if (!flattenedStates.isEmpty()) {
            TransformationUtil.logger.info(" ######### foo " + flattenedStates.size() + " "
                    + flattenedStates.get(0));

            TransformationDescriptor descriptor = new TransformationDescriptor("ruleAll",
                    new Object[] { flattenedStates });
            return descriptor;
        }

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void wrapup() throws KiemInitializationException {
        super.wrapup();
        flattenedStates.clear();
        stateHierarchy.clear();
    }

    private void collectAllStatesHierarchically(final State parent, final int level) {
        // add the current state to the corresponding level
        stateHierarchy.put(level, parent);
        for (Region r : parent.getRegions()) {
            for (State s : r.getStates()) {
                collectAllStatesHierarchically(s, level + 1);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject step(final JSONObject arg0) throws KiemExecutionException {
        if (rootRegion == null) {
            return null;
        }
        // check if model was transformed completely
        TreeIterator<EObject> it = rootRegion.eAllContents();
        while (it.hasNext()) {
            EObject curr = it.next();
            if (curr instanceof State) {
                if (!((State) curr).getBodyText().isEmpty()) {
                    throw new KiemExecutionException("Model has not been transformed completely!"
                            + " Therefore, it cannot be optimized yet.", true, null);
                }
            }
        }

        if (!kiviMode && (currentDescriptor != null)
                && (currentDescriptor.getResult() instanceof Long)
                && ((Long) currentDescriptor.getResult()).equals(0L)) {
            finished();
        }
        try {
            super.step(arg0);
        } catch (StackOverflowError soe) {
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "A stackoverflow occured. As the optimization of large diagrams "
                            + "requires more stack than usual, increasing the stacksize "
                            + "may solve the problem.", soe);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
        return null;
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
        // assure that all references to old esterel signals are remove.
        // currently this is done by just applying a serialization and parsing of the action labels.
        try {
            ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                    ActionLabelProcessorWrapper.SERIALIZE);
            ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                    ActionLabelProcessorWrapper.PARSE);
        } catch (Exception e) {
            Status status = new Status(Status.ERROR, Activator.PLUGIN_ID,
                    "An error occured trying to serialize and"
                            + " parse Action labels after SyncCharts optimization.");
            StatusManager.getManager().handle(status);
        }
    }

}
