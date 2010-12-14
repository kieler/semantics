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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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
    private static final String TRANSFORMATION_FILE = "toSyncchartTransformation.ext";
    // private static final String TRANSFORMATION_FILE = "optimization.ext";

    /** first transformation being executed. */
    public static final String INITIAL_TRANSFORMATION = "rule";

    /** current synccharts root state. */
    private State rootState;

    private XtendFacade facade;

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
    public XtendFacade getXtendFacade() {
        return facade;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransformationDescriptor getNextTransformation() {

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
