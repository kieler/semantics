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
package de.cau.cs.kieler.esterel.transformation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.json.JSONObject;

import de.cau.cs.kieler.core.expressions.ExpressionsFactory;
import de.cau.cs.kieler.core.expressions.TextualCode;
import de.cau.cs.kieler.esterel.transformation.kivi.TransformationTrigger;
import de.cau.cs.kieler.kiml.ui.layout.EclipseLayoutServices;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorUtil;

/**
 * Data Component for an esterel to synccharts transformation. The component executes xpand
 * transformations stepwise until the esterel code is completely transformed.
 * 
 * @author uru
 * 
 */
public class Est2SyncDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    /** queue storing xpand transformations to be executed. */
    private Queue<QueueStatement> statements;

    /** xpand runner handling the actual execution. */
    private XpandRunner runner;

    // base packages and xpand transformation file.
    private static final String SYNCCHARTS_PACKAGE = "de.cau.cs.kieler.synccharts.SyncchartsPackage";
    private static final String EXPRESSIONS_PACKAGE = "de.cau.cs.kieler.core.expressions."
            + "ExpressionsPackage";
    private static final String ESTEREL_PACKAGE = "de.cau.cs.kieler.esterel.esterel.EsterelPackage";
    private static final String ECORE_PACKAGE = "org.eclipse.emf.ecore.EcorePackage";
    private static final String TRANSFORMATION_FILE = "toSyncchartTransformation.ext";

    /** first transformation being executed. */
    private static final String INITIAL_TRANSFORMATION = "initial";

    /** is the actual transformation started yet?. */
    private boolean started = false;

    private EObject rootState;

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        // init all needed functionality
        statements = new LinkedBlockingQueue<QueueStatement>();

        LinkedList<String> basePackages = new LinkedList<String>();
        basePackages.add(SYNCCHARTS_PACKAGE);
        basePackages.add(EXPRESSIONS_PACKAGE);
        basePackages.add(ESTEREL_PACKAGE);
        basePackages.add(ECORE_PACKAGE);
        runner = new XpandRunner(TRANSFORMATION_FILE, basePackages);

        // load the esterel document into a syncchart
        loadEsterelIntoSyncChart();
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject arg0) throws KiemExecutionException {

        // either we haven't started or no further transformation
        if (statements.isEmpty()) {
            if (!started) {
                started = true;

                // FIXME this should be done a better way!
                PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

                    public void run() {
                        IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                                .getActivePage().getActiveEditor();
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

                                // initializing first statement
                                QueueStatement qs = new QueueStatement(INITIAL_TRANSFORMATION, root);
                                statements.add(qs);
                                System.out.println("yeah");
                            }
                        }
                        System.out.println("Added First Statement");

                    }
                });
            } else {
                // nothing more to do
                System.out.println("No Further Transformations");
                return null;
            }

        } else {
            // poll a statement from the queue and execute
            PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

                public void run() {
                    IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                            .getActivePage().getActiveEditor();
                    if (!(activeEditor instanceof SyncchartsDiagramEditor)) {
                        return;
                    }

                    QueueStatement qs = statements.poll();
                    runner.executeTransformation(qs.modul, qs.transformation);

                    // update edit policies, so GMF will generate diagram elements
                    // for model elements which have been generated during the
                    // transformation.
                    if (activeEditor instanceof IDiagramWorkbenchPart) {
                        EObject obj = ((View) ((IDiagramWorkbenchPart) activeEditor)
                                .getDiagramEditPart().getModel()).getElement();
                        List<?> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(obj);
                        for (Iterator<?> it = editPolicies.iterator(); it.hasNext();) {
                            CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
                            nextEditPolicy.refresh();
                        }
                        IDiagramGraphicalViewer graphViewer = ((IDiagramWorkbenchPart) activeEditor)
                                .getDiagramGraphicalViewer();
                        graphViewer.flush();
                    }
                    // EclipseLayoutServices
                    // .getInstance()
                    // .getManager(activeEditor, null)
                    // .layout(activeEditor, null, true /* animation */,
                    // false /* ProgressBar */, true, false);

                    if (TransformationTrigger.getInstance() != null) {
                        TransformationTrigger.getInstance().step(rootState,
                                (DiagramEditor) activeEditor);
                        System.out.println("Layout applied");
                    }

                }
            });
        }

        return null;
    }

    /**
     * method provides ability for a xtend transformation to pass a new transformation request with
     * an according model to this data component. The request is placed within the queue and handled
     * in a future step.
     * 
     * @param transformation
     *            name of the transformation to execute
     * @param model
     *            model for which to execute this transformation
     */
    public void appendTransformation(final String transformation, final EObject model) {
        List<DataComponentWrapper> wrapper = KiemPlugin.getDefault().getDataComponentWrapperList();
        for (DataComponentWrapper w : wrapper) {
            if (w.getDataComponent() instanceof Est2SyncDataComponent) {
                Est2SyncDataComponent dc = (Est2SyncDataComponent) w.getDataComponent();
                QueueStatement qs = new QueueStatement(transformation, model);
                boolean sucess = dc.getStatements().add(qs);
                System.out.println("set new transformation: " + sucess);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        // clean all references
        runner = null;
        statements = null;
        started = false;

        // if (TransformationTrigger.getInstance() != null) {
        // // TransformationTrigger.getInstance().step(null,
        // // (DiagramEditor) activeEditor);
        // }
    }

    /**
     * @return the statements
     */
    public Queue<QueueStatement> getStatements() {
        return statements;
    }

    /**
     * represents a queue statement used to store a transformation and an according module within
     * the queue.
     * 
     */
    private class QueueStatement {

        // CHECKSTYLEOFF VisibilityModifier
        public String transformation;
        public EObject modul;

        // CHECKSTYLEON VisibilityModifier

        public QueueStatement(final String trans, final EObject mod) {
            this.transformation = trans;
            this.modul = mod;
        }
    }

    /**
     * loads an esterel program initially into a syncchart TODO do this somewhere else.
     */
    private void loadEsterelIntoSyncChart() {

        final String esterelLanguage = "de.cau.cs.kieler.esterel.Esterel";

        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

            public void run() {
                System.out.println("Initializing Esterel Transformation.");

                System.out.println("Reading current Esterel Editor");
                try {
                    // get Editor must be done in UI Thread, otherwise null
                    IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                            .getActivePage().getActiveEditor();
                    XtextEditor xeditor = ((XtextEditor) editor);
                    if (!xeditor.getLanguageName().equals(esterelLanguage)) {
                        throw new IllegalArgumentException("The currently open Xtext Editor is no"
                                + " Esterel Editor. Editor language is "
                                + xeditor.getLanguageName() + " but should be " + esterelLanguage);
                    }

                    IFile file = ((FileEditorInput) xeditor.getEditorInput()).getFile();

                    final URI strlURI = URI.createPlatformResourceURI(
                            file.getFullPath().toString(), true);
                    final URI kidsURI = URI.createPlatformResourceURI(file.getFullPath()
                            .removeFileExtension().addFileExtension("kids").toString(), false);
                    final URI kixsURI = URI.createPlatformResourceURI(file.getFullPath()
                            .removeFileExtension().addFileExtension("kixs").toString(), false);

                    System.out.println("Creating new SyncCharts Diagram.");
                    IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
                        protected void execute(final IProgressMonitor monitor)
                                throws CoreException, InterruptedException {
                            Resource diagram = SyncchartsDiagramEditorUtil.createDiagram(kidsURI,
                                    kixsURI, monitor);
                            try {
                                diagram.save(null);
                                SyncchartsDiagramEditorUtil.openDiagram(diagram);
                            } catch (Exception e) {
                                System.out.println(e);
                                e.printStackTrace();
                            }

                        }
                    };
                    op.run(null);

                    State rootState;

                    System.out.println("Creating initial SyncCharts contents.");
                    ResourceSet resourceSet = new ResourceSetImpl();
                    Resource resource = resourceSet.getResource(kixsURI, true);
                    SyncchartsFactory sf = SyncchartsFactory.eINSTANCE;
                    Region rootRegion = (Region) resource.getContents().get(0);
                    rootState = sf.createState();
                    rootRegion.getStates().add(rootState);
                    rootState.setLabel("EsterelState");
                    rootState.setType(StateType.TEXTUAL);

                    System.out.println("Reading Esterel Source Code.");

                    // IXtextDocument document = xeditor.getDocument();
                    // TextualCode code = ExpressionsFactory.eINSTANCE.createTextualCode();
                    // rootState.setBodyText(code);
                    // code.setCode(document.get());

                    System.out.println("Parsing Esterel Source Code.");
                    Resource xtextResource = resourceSet.getResource(strlURI, true);
                    EObject esterelModule = xtextResource.getContents().get(0);

                    System.out.println("Attaching Esterel Model to SyncChart");
                    rootState.setBodyContents(esterelModule);

                    resource.save(null);

                } catch (Exception e) {
                    // throw new KiemInitializationException(
                    // "Failed to initialize Esterel Transformation. No valid Esterel Editor found.",
                    // true, e);
                    e.printStackTrace();
                }

            }
        });
    }
}
