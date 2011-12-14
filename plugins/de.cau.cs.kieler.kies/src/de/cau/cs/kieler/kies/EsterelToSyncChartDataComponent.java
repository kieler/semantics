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
package de.cau.cs.kieler.kies;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.model.xtend.util.XtendTransformationUtil;
import de.cau.cs.kieler.kies.util.TransformationUtil;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;

/**
 * DataComponent for transforming an esterel program step-wise into a SyncCharts.
 * 
 * @author uru
 * 
 */
public class EsterelToSyncChartDataComponent extends AbstractTransformationDataComponent {

    /** base packages. */
    private static final String SYNCCHARTS_PACKAGE = "de.cau.cs.kieler.synccharts.SyncchartsPackage";
    private static final String EXPRESSIONS_PACKAGE = "de.cau.cs.kieler.core.kexpressions."
            + "KExpressionsPackage";
    private static final String ESTEREL_PACKAGE = "de.cau.cs.kieler.kies.esterel.EsterelPackage";
    private static final String ECORE_PACKAGE = "org.eclipse.emf.ecore.EcorePackage";
    private static final String TRANSFORMATION_FILE = "ToSyncchartTransformation.ext";

    /** first transformation being executed. */
    public static final String INITIAL_TRANSFORMATION = "rule";

    /**
     * global variable determining whether the transformation should be run recursively, hence
     * everything is transformed within one step.
     */
    public static final String GLOBALVAR_REC = "recursive";

    /**
     * default constructor providing one global variable. Namely GLOBALVAR_REC, determining whether
     * transformation should be executed recursively or not.
     */
    public EsterelToSyncChartDataComponent() {
        this(false);
    }

    /**
     * @param kiviMode
     *            pass {@code true} if this data component is used in a way that does not use KIEM.
     */
    public EsterelToSyncChartDataComponent(final boolean kiviMode) {
        super(ImmutableMap.of(GLOBALVAR_REC, TransformationUtil.getXtendVarBoolean(true)), kiviMode);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {

        if (!headless && !kiviMode) {
            // assure that a SyncCharts editor is opened. (Xtext is also valid as the first
            // transformation is started in the esterel editor)
            IEditorPart activeEditor = TransformationUtil.getActiveEditor();
            if (!(activeEditor instanceof SyncchartsDiagramEditor)
                    && !(activeEditor instanceof XtextEditor)) {
                throw new KiemInitializationException(
                        "Esterel To SyncCharts Transformation is only possible"
                                + " in the context of an SynchChartsDiagramEditor.", true, null,
                        false);
            }
        }

        super.initialize();

        // get recursive property
        KiemProperty prop = getProperties()[0];
        boolean recursive = prop.getValueAsBoolean();
        globalVars.get(GLOBALVAR_REC).setValue(recursive);

        // initialize facade
        facade = XtendTransformationUtil.initializeFacade(TRANSFORMATION_FILE, getBasePackages(),
                globalVars);

        // fetch the root model elements
        fetchRootRegionAndState();
        TransformationUtil.logger.info("Added First Statement");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransformationDescriptor getNextTransformation() {

        if (rootState == null) {
            fetchRootRegionAndState();
            if (rootState == null) {
                return null;
            }
        }

        // first case is that we demand recursive execution
        if (((Boolean) globalVars.get(GLOBALVAR_REC).getValue())) {
            List<State> states;
            // either fetch the root state or any child state that has not been transformed yet
            if (isTransformable(rootState)) {
                states = Lists.newArrayList(rootState);
            } else {
                states = findAllTransformableStates(rootState);
            }

            // if no state was found return
            if (states.isEmpty()) {
                return null;
            }

            // else fetch corresponding esterel elements
            List<Object> esterel = Lists.newLinkedList();
            for (State s : states) {
                esterel.add(s.getBodyReference());
            }

            // and return descriptor
            TransformationDescriptor descr = new TransformationDescriptor(INITIAL_TRANSFORMATION,
                    new Object[] { states, esterel });
            return descr;
        }

        // second case is non recursive execution
        State start = rootState;

        // there might be a user selection, consider it!
        List<EObject> selected = TransformationUtil.getCurrentEditorSelection();
        // currently only for one selected item possible
        if (selected != null && !selected.isEmpty() && selected.size() == 1) {
            for (EObject obj : selected) {
                if (obj instanceof State) {
                    start = (State) obj;
                }
                // extension by chsch:
                if (obj instanceof Region) {
                    Region r = (Region) obj;
                    if (r.getParentState() != null) {
                        start = r.getParentState();
                    } else if (!r.getStates().isEmpty()) {
                        start = r.getStates().get(0);
                    }
                }
            }
        }

        State next = findNextTransformableState(start);
        if (next == null && start != rootState) {
            next = findNextTransformableState(rootState);
        }

        if (next != null) {
            TransformationDescriptor descr = new TransformationDescriptor(INITIAL_TRANSFORMATION,
                    new Object[] { next, next.getBodyReference() });
            return descr;
        }
        return null;
    }

    /**
     * find the next transformable state. For this first the same hierarchy level {@code parent} is
     * in is scanned, and if nothing is found, level per level is searched.
     */
    private State findNextTransformableState(final State parent) {
        if (isTransformable(parent)) {
            return parent;
        }
        State hierarchy = scanHierarchy(parent);
        if (hierarchy != null) {
            return hierarchy;
        } else {
            for (Region r : parent.getRegions()) {
                for (State s : r.getStates()) {
                    State inner = findNextTransformableState(s);
                    if (inner != null) {
                        return inner;
                    }
                }
            }
        }
        return null;
    }

    private State scanHierarchy(final State parent) {
        for (Region r : parent.getRegions()) {
            for (State s : r.getStates()) {
                if (isTransformable(s)) {
                    return s;
                }
            }
        }
        return null;
    }

    /**
     * returns a list with all possibly transformable states in any hierarchy level below
     * {@code parent}'s.
     */
    private List<State> findAllTransformableStates(final State parent) {
        List<State> foundStates = Lists.newLinkedList();
        for (Region r : parent.getRegions()) {
            for (State s : r.getStates()) {
                if (isTransformable(s)) {
                    foundStates.add(s);
                } else {
                    // scan the children
                    foundStates.addAll(findAllTransformableStates(s));
                }

            }
        }
        return foundStates;
    }

    private boolean isTransformable(final State s) {
        if (s == null || s.getBodyReference() == null) {
            return false;
        }
        return TransformationUtil.isEsterelElement(s.getBodyReference());
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
    public KiemProperty[] provideProperties() {
        final int numberOfProperties = 1;
        KiemProperty[] properties = new KiemProperty[numberOfProperties];

        properties[0] = new KiemProperty("Recursive", true);
        return properties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doPostTransformation() {
        try {

            // serialize and parse transition labels in order to remove references to the original
            // esterel document
            ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                    ActionLabelProcessorWrapper.SERIALIZE);
            ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                    ActionLabelProcessorWrapper.PARSE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param theRootState
     *            the rootState to set
     */
    public void setRootState(final State theRootState) {
        this.rootState = theRootState;
    }

    /**
     * @return the rootState
     */
    public State getRootState() {
        return rootState;
    }
}
