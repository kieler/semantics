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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.Variable;

import de.cau.cs.kieler.kies.transformation.core.AbstractTransformationDataComponent;
import de.cau.cs.kieler.kies.transformation.core.TransformationDescriptor;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

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
    private static final String TRANSFORMATION_FILE = "syncchartOptimization.ext";

    private State rootState;

    private XtendFacade facade;

    private HashSet<State> workedStates = new HashSet<State>();
    private ArrayList<LinkedList<State>> stateHierarchy = new ArrayList<LinkedList<State>>(5);
    private LinkedList<State> flattenedStates = new LinkedList<State>();;

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {
        super.initialize();

        // get recursive property
        KiemProperty prop = getProperties()[0];
        boolean recursive = prop.getValueAsBoolean();

        // init global variables
        HashMap<String, Variable> globalVars = new HashMap<String, Variable>();
        globalVars.put("recursive", new Variable("boolean", recursive));

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

                // collect initial set of all possible states
                collectAllStatesRecursivley(rootState, 0);
                flattenedStates = new LinkedList<State>();
                for (int i = stateHierarchy.size() - 1; i >= 0; i--) {
                    flattenedStates.addAll(stateHierarchy.get(i));
                }
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
        if (!selected.isEmpty() && selected.size() == 1) {
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
                    new Object[] { flattenedStates, 1 });
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
    public XtendFacade getXtendFacade() {
        return facade;
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

}
