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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.esterel.transformation.core.AbstractTransformationDataComponent;
import de.cau.cs.kieler.esterel.transformation.core.TransformationDescriptor;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * DataComponent for transforming an esterel program stepwise into a syncchart.
 * 
 * @author uru
 * 
 */
public class EsterelToSyncChartDataComponent extends AbstractTransformationDataComponent {

    // base packages and xpand transformation file.
    private static final String SYNCCHARTS_PACKAGE = "de.cau.cs.kieler.synccharts.SyncchartsPackage";
    private static final String EXPRESSIONS_PACKAGE = "de.cau.cs.kieler.core.expressions."
            + "ExpressionsPackage";
    private static final String ESTEREL_PACKAGE = "de.cau.cs.kieler.esterel.esterel.EsterelPackage";
    private static final String ECORE_PACKAGE = "org.eclipse.emf.ecore.EcorePackage";
    private static final String TRANSFORMATION_FILE = "toSyncchartTransformationNew.ext";
    // private static final String TRANSFORMATION_FILE = "optimization.ext";

    /** first transformation being executed. */
    public static final String INITIAL_TRANSFORMATION = "rule";

    /** current synccharts root state. */
    private State rootState;

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {
        super.initialize();

        boolean fromResource = false;
        if (fromResource) {
            // final URI kixsURI = URI.createPlatformResourceURI("platform:/dfghj/abro.kixs",
            // false);
            // ResourceSet resourceSet = new ResourceSetImpl();
            // resource = resourceSet.getResource(kixsURI, true);
            // Region rootRegion = (Region) resource.getContents().get(0);
            // State root = rootRegion.getStates().get(0);
            //
            // TransactionalEditingDomain ted = TransactionalEditingDomain.Factory.INSTANCE
            // .createEditingDomain(resourceSet);
            //
            // getRunner().setEditDomain(ted);
            //
            // // initializing first statement
            // QueueStatement qs = new QueueStatement(INITIAL_TRANSFORMATION, root,
            // root.getBodyReference());
            // appendToQueue(qs);
            // System.out.println("Added First Statement");
        } else {
            // catch the first model and place it on the queue
            // FIXME this should be done a better way!
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
                }
            }
            System.out.println("Added First Statement");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransformationDescriptor getNextTransformation() {

        State start = rootState;

        List<EObject> selected = getCurrentEditorSelection();
        // currently only for one selected item possible
        if (!selected.isEmpty() && selected.size() == 1) {
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
     * {@inheritDoc}
     */
    @Override
    public String[] getBasePackages() {
        LinkedList<String> basePackages = new LinkedList<String>();
        basePackages.add(SYNCCHARTS_PACKAGE);
        basePackages.add(EXPRESSIONS_PACKAGE);
        basePackages.add(ESTEREL_PACKAGE);
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

    private List<EObject> getCurrentEditorSelection() {
        LinkedList<EObject> selectedElements = null;
        // get the active editor
        IEditorPart editor = getActiveEditor();
        if (editor instanceof SyncchartsDiagramEditor) {
            EditPart rootEditPart = ((DiagramEditor) editor).getDiagramEditPart();
            EditPartViewer viewer = rootEditPart.getViewer();

            // get the selection
            ISelection selection = viewer.getSelection();
            if (!selection.isEmpty()) {
                selectedElements = new LinkedList<EObject>();
                if (selection instanceof StructuredSelection) {
                    // append all elements to the list being returned
                    for (Object o : ((StructuredSelection) selection).toArray()) {
                        if (o instanceof EditPart) {
                            EObject selModel = ((View) ((EditPart) o).getModel()).getElement();
                            selectedElements.add(selModel);
                        }
                    }
                }
            }
        }
        return selectedElements;
    }

    // /**
    // * returns a QueueStatement for the passed parameters.
    // *
    // * @param transName
    // * name of the transformation
    // * @param syncElement
    // * the state
    // * @param estElement
    // * the esterel element
    // * @return new QueueStatement
    // */
    // public static AbstractTransformationStatement getTransformationStatement(
    // final String transName, final State syncElement, final EObject estElement) {
    // QueueStatement qs = new QueueStatement(transName, syncElement, estElement);
    // return qs;
    // }
    //
    // /**
    // * {@inheritDoc}
    // */
    //
    // public AbstractTransformationStatement getNextQueueStatement() {
    //
    // // check if any state is selected
    // List<EObject> selected = getCurrentEditorSelection();
    //
    // QueueStatement returnStatement = null;
    // // currently only for one selected item possible
    // if (!selected.isEmpty() && selected.size() == 1) {
    // for (EObject obj : selected) {
    // if (obj instanceof State) {
    //
    // QueueStatement qs = stateQueueMapping.get((State) obj);
    //
    // if (qs != null) {
    // getQueue().clear();
    // if (!qs.isDone()) {
    // return qs;
    // } else {
    // recursivelyCollectQueueStatements(qs);
    // if (getQueue().isEmpty()) {
    // QueueStatement rootQs = stateQueueMapping.get(rootState);
    // recursivelyCollectQueueStatements(rootQs);
    // }
    // return getQueue().poll();
    // }
    // }
    // int i = 0;
    // } else {
    // // if no further elements in the queue, check if there is another branch which
    // // is not done yet
    // if (getQueue().isEmpty()) {
    // QueueStatement rootQs = stateQueueMapping.get(rootState);
    // recursivelyCollectQueueStatements(rootQs);
    // }
    // }
    // }
    // }
    // return super.getNextQueueStatement();
    // }
    //
    // private void recursivelyCollectQueueStatements(QueueStatement parent) {
    // for (QueueStatement qs : parent.getChildren()) {
    // if (qs.isDone()) {
    // recursivelyCollectQueueStatements(qs);
    // } else {
    // getQueue().add(qs);
    // }
    // }
    // }
    //
    // /**
    // * {@inheritDoc}
    // */
    // @Override
    // public boolean appendToQueue(final AbstractTransformationStatement statement) {
    //
    // if (statement instanceof QueueStatement) {
    // // map the current transformation statement to the corresponding state
    // State currentState = ((QueueStatement) statement).getState();
    // stateQueueMapping.put(currentState, (QueueStatement) statement);
    //
    // // register it at the parent
    // State parentState = currentState.getParentRegion().getParentState();
    // if (parentState != null) {
    // QueueStatement parentQs = stateQueueMapping.get(parentState);
    // parentQs.getChildren().add((QueueStatement) statement);
    // }
    // }
    // return super.appendToQueue(statement);
    // }
    //
}
