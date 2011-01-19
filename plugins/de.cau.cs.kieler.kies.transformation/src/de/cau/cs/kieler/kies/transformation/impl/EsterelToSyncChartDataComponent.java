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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend.expression.Variable;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.kies.transformation.core.AbstractTransformationDataComponent;
import de.cau.cs.kieler.kies.transformation.core.TransformationDescriptor;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;

/**
 * DataComponent for transforming an esterel program stepwise into a syncchart.
 * 
 * @author uru
 * 
 */
public class EsterelToSyncChartDataComponent extends AbstractTransformationDataComponent {

    // base packages and xpand transformation file.
    private static final String SYNCCHARTS_PACKAGE = "de.cau.cs.kieler.synccharts.SyncchartsPackage";
    private static final String EXPRESSIONS_PACKAGE = "de.cau.cs.kieler.core.kexpressions."
            + "KExpressionsPackage";
    private static final String ESTEREL_PACKAGE = "de.cau.cs.kieler.kies.esterel.EsterelPackage";
    private static final String ECORE_PACKAGE = "org.eclipse.emf.ecore.EcorePackage";
    private static final String TRANSFORMATION_FILE = "ToSyncchartTransformation.ext";

    /** first transformation being executed. */
    public static final String INITIAL_TRANSFORMATION = "rule";

    /** current syncchart's root state. */
    private State rootState;
    private Region rootRegion;

    /**
     * global variable determining whether the transformation should be run recursively, hence
     * everything is transformed within one step.
     */
    public static final String GLOBVAR_REC = "recursive";

    /**
     * default constructor providing one global variable. Namely GLOBALVAR_REC, determining whether
     * transformation should be executed recursively or not.
     */
    public EsterelToSyncChartDataComponent() {
        super(new ImmutableMap.Builder<String, Variable>().put(GLOBVAR_REC,
                TransformationUtil.getXtendVarBoolean(true)).build());
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
        globalVars.get(GLOBVAR_REC).setValue(recursive);

        // initialize facade
        facade = AbstractTransformationDataComponent.initializeFacade(TRANSFORMATION_FILE,
                getBasePackages(), globalVars);

        // fetch the root model element
        IEditorPart editor = TransformationUtil.getActiveEditor();
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
            }
        }
        TransformationUtil.logger.info("Added First Statement");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransformationDescriptor getNextTransformation() {

        // first case is that we demand recursive execution
        if (((Boolean) globalVars.get(GLOBVAR_REC).getValue())) {
            List<State> states;
            // either fetch the root state or any child state that has not been transformed yet
            if (rootState.getBodyText().size() > 0) {
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
        List<EObject> selected = TransformationUtil.getCurrentEditorSelection();
        // currently only for one selected item possible
        if (selected != null && !selected.isEmpty() && selected.size() == 1) {
            for (EObject obj : selected) {
                if (obj instanceof State) {
                    start = (State) obj;
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
        if (parent.getBodyText().size() != 0) {
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
                if (s.getBodyText().size() != 0) {
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
                if (s.getBodyText().size() != 0) {
                    foundStates.add(s);
                } else {
                    // scan the children
                    foundStates.addAll(findAllTransformableStates(s));
                }

            }
        }
        return foundStates;
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
}
