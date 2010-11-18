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
package de.cau.cs.kieler.esterel.transformation.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.esterel.transformation.core.AbstractTransformationDataComponent;
import de.cau.cs.kieler.esterel.transformation.core.TransformationDescriptor;
import de.cau.cs.kieler.esterel.transformation.kivi.RefreshGMFElementsEffect;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
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
    private static final String EXPRESSIONS_PACKAGE = "de.cau.cs.kieler.core.expressions."
            + "ExpressionsPackage";
    private static final String ECORE_PACKAGE = "org.eclipse.emf.ecore.EcorePackage";
    private static final String TRANSFORMATION_FILE = "syncchartOptimization.ext";

    private State rootState;

    private HashSet<State> workedStates = new HashSet<State>();
    private ArrayList<LinkedList<State>> stateHierarchy = new ArrayList<LinkedList<State>>(5);

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {
        super.initialize();

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
                
                collectAllStatesRecursivley(rootState, 0);
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

        State foo = null;
        List<State> states = rootState.getRegions().get(0).getStates();
        for (State s : states) {
            if (!workedStates.contains(s)) {
                foo = s;
            }
        }
        System.out.println("foo " + foo);
        if (foo != null) {
            TransformationDescriptor descriptor = new TransformationDescriptor("rule",
                    new Object[] { foo });
            workedStates.add(foo);

            RefreshGMFElementsEffect effect = new RefreshGMFElementsEffect(getActiveEditor());
            effect.execute();
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
        workedStates.clear();
    }    

    private void collectAllStatesRecursivley(State parent, int level) {
        LinkedList<State> levelStates = stateHierarchy.get(level);
        if (levelStates == null) {
            levelStates = new LinkedList<State>();
            stateHierarchy.set(level, levelStates);
        }
        levelStates.add(parent);

        for (Region r : parent.getRegions()) {
            for (State s : r.getStates()) {
                collectAllStatesRecursivley(s, level + 1);
            }
        }
    }

}
