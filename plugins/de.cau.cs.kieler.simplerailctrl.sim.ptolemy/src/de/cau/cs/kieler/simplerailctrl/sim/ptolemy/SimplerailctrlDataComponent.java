/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.simplerailctrl.sim.ptolemy;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.core.ui.KielerProgressMonitor;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeWorkspaceFile;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import org.json.JSONObject;
import de.cau.cs.kieler.simplerailctrl.sim.ptolemy.oaw.MomlWriter;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.emf.mwe.utils.AbstractEMFWorkflowComponent;
import org.eclipse.emf.common.util.URI;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeWorkspaceFile;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import org.json.JSONException;
import org.json.JSONObject;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress;
import de.cau.cs.kieler.core.alg.BasicProgressMonitor;
import de.cau.cs.kieler.core.alg.IKielerProgressMonitor;
import de.cau.cs.kieler.core.ui.KielerProgressMonitor;
import de.cau.cs.kieler.core.util.Maybe;

// TODO: Auto-generated Javadoc
/**
 * The class SimpleRailCtrl DataComponent implements a KIELER Execution Manager DataComponent. <BR>
 * Within its {@link #initialize()} method it performs the model2model Xtend transformation to
 * create a semantically equivalent but executable Ptolemy model out of the SimpleRailCtrl EMF model
 * instance. It also loads the Ptolemy model within a PtolemyExecutor and adapts the port and host
 * for connecting to the model railway simulation engine. <BR>
 * Within its {@link #step(JSONObject)} method it then triggers a step of the PtolemyExecutor.
 * Because this is done asynchronously the triggering of a consecutive step may lead to an
 * KiemExecutionError be thrown that was initially the consequence of the last (async) call to the
 * step method of the PtolemyExecutor.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
@SuppressWarnings("restriction")
public class SimplerailctrlDataComponent extends JSONObjectDataComponent {

    /** The PTOEXE thread. */
    private Thread PTOEXE_Thread;

    /** The Ptolemy Executor. */
    private ExecutePtolemyModel PTOEXE;

    /** The Ptolemy model. */
    private Resource ptolemyModel;

    /** The transformation completed flag. */
    private boolean transformationCompleted;

    /** The transformation error flag. */
    private boolean transformationError;

    /** The editor of the model being simulated. */
    private DiagramEditor modelEditor;

    /** The model time stamp. */
    private long modelTimeStamp;
    /**
     * A flag that becomes true if the user was warned about unsaved changes during the simulation.
     */
    private boolean simulatingOldModelVersion;

    // -----------------------------------------------------------------------------
    // -----------------------------------------------------------------------------
    /**
     * The Class M2MProgressMonitor.
     */
    class M2MProgressMonitor implements ProgressMonitor {

        /** The kieler progress monitor. */
        private KielerProgressMonitor kielerProgressMonitor;

        /** The number of components. */
        private int numberOfComponents = 1;

        /** The number of components done. */
        private int numberOfComponentsDone = 0;

        /**
         * Instantiates a new m2 m progress monitor.
         * 
         * @param kielerProgressMonitorParam
         *            the kieler progress monitor param
         * @param numberOfComponentsParam
         *            the number of components param
         */
        public M2MProgressMonitor(KielerProgressMonitor kielerProgressMonitorParam,
                int numberOfComponentsParam) {
            kielerProgressMonitor = kielerProgressMonitorParam;
            numberOfComponents = numberOfComponentsParam;
            numberOfComponentsDone = 0;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#beginTask(java.lang.String, int)
         */
        public void beginTask(String name, int totalWork) {
            kielerProgressMonitor.begin(name, numberOfComponents);
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#done()
         */
        public void done() {
            // is called by the workflow wrapper
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#finished(java.lang.Object,
         * java.lang.Object)
         */
        public void finished(Object element, Object context) {
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#internalWorked(double)
         */
        public void internalWorked(double work) {
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#isCanceled()
         */
        public boolean isCanceled() {
            return (kielerProgressMonitor.isCanceled());
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#postTask(java.lang.Object,
         * java.lang.Object)
         */
        public void postTask(Object element, Object context) {
            kielerProgressMonitor.worked(numberOfComponentsDone);
            numberOfComponentsDone++;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#preTask(java.lang.Object,
         * java.lang.Object)
         */
        public void preTask(Object element, Object context) {
            // kielerProgressMonitor.begin(element.toString(), 1);
            kielerProgressMonitor.worked(numberOfComponentsDone);
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#setCanceled(boolean)
         */
        public void setCanceled(boolean value) {
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#setTaskName(java.lang.String)
         */
        public void setTaskName(String name) {
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#started(java.lang.Object,
         * java.lang.Object)
         */
        public void started(Object element, Object context) {
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#subTask(java.lang.String)
         */
        public void subTask(String name) {
            kielerProgressMonitor.subTask(UNKNOWN);
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#worked(int)
         */
        public void worked(int work) {
            kielerProgressMonitor.worked(work);
        }

    }

    // -----------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SimpleRailCtrl DataComponent for the KIELER Execution Manager.
     */
    public SimplerailctrlDataComponent() {
    }

    // -------------------------------------------------------------------------

    /**
     * Transform KIELER SimpleRailCtrl model into a semantically equivalent Ptolemy model. <BR>
     * This transformation uses the Xtend transformation language.
     * 
     * @param monitor
     *            the monitor
     * 
     * @return true, if m2m transformation was successful
     * 
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    public IStatus Model2ModelTransformation(KielerProgressMonitor monitor)
            throws KiemInitializationException {
        monitor.begin("Model2Model transformation", 4);
        try {
            // Workflow
            Workflow workflow = new Workflow();

            // EMF reader
            Reader emfReader = new Reader();
            emfReader.setUri(this.getInputModel());
            emfReader.setModelSlot("emfmodel");
            emfReader.setResourceSet(this.getInputResourceSet());

            // MOML writer
            MomlWriter momlWriter = new MomlWriter();
            momlWriter.setUri(ptolemyModel.getURI().toString());
            momlWriter.setResourceSet(ptolemyModel.getResourceSet());
            momlWriter.setModelSlot("momlmodel");

            // Meta models
            EmfMetaModel metaModel1 = new EmfMetaModel(
                    de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage.eINSTANCE);
            EmfMetaModel metaModel2 = new EmfMetaModel(Moml.MomlPackage.eINSTANCE);

            // XtendComponent
            XtendComponent xtendComponent = new XtendComponent();
            xtendComponent.addMetaModel(metaModel1);
            xtendComponent.addMetaModel(metaModel2);
            xtendComponent.setInvoke("simplerailctrl2moml::transform(emfmodel)");
            xtendComponent.setOutputSlot("momlmodel");

            // workflow
            WorkflowContext wfx = new WorkflowContextDefaultImpl();
            Issues issues = new org.eclipse.emf.mwe.core.issues.IssuesImpl();
            NullProgressMonitor nullMonitor = new NullProgressMonitor();
            M2MProgressMonitor m2mMonitor = new M2MProgressMonitor(monitor, 3);

            workflow.addComponent(emfReader);
            workflow.addComponent(xtendComponent);
            workflow.addComponent(momlWriter);
            // workflow.invoke(wfx, (ProgressMonitor)monitor.subTask(80), issues);
            workflow.invoke(wfx, m2mMonitor, issues);

            System.out.print(xtendComponent.getLogMessage());
            System.out.print(issues.getInfos());
            System.out.print(issues.getIssues());
            System.out.print(issues.getWarnings());
            System.out.print(issues.getErrors().toString());
        } catch (Exception e) {
            monitor.done();
            e.printStackTrace();
            transformationCompleted = true;
            transformationError = true;
            return new Status(IStatus.ERROR, SimplerailctrlSimPtolemyPlugin.PLUGIN_ID,
                    "Ptolemy Model could not be created.", e);
        }
        monitor.done();
        transformationCompleted = true;
        transformationError = false;
        return new Status(IStatus.OK, SimplerailctrlSimPtolemyPlugin.PLUGIN_ID, IStatus.OK, null,
                null);
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent#step(de.cau.cs.kieler.sim.kiem
     * .json.JSONObject)
     */
    public JSONObject step(JSONObject JSONobject) throws KiemExecutionException {
        long newModelTimeStamp = this.getInputModelEObject(this.modelEditor).eResource().getTimeStamp();
        // check the dirty state of the editor containing the simulated model
        if (((newModelTimeStamp != modelTimeStamp) || modelEditor.isDirty()) 
                                    && !simulatingOldModelVersion) {
            // remember that we warned the user (do this only once)
            simulatingOldModelVersion = true;
            // warn the user
            throw new KiemExecutionException("The simulated model changed since the simulation "
                    + "was started.\n\nYou should restart the simulation in order to "
                    + "simulate the changed version of your model.", false, null);
        }

        JSONObject returnObj = null;
        try {
            // perform an asynchronous step in PtolemyExecutor
            // note that this may produce a KiemExecutionException which has it
            // source in the previous call.
            PTOEXE.executionStep();
            String currentState = PTOEXE.getCurrentState();
            // the stateName is the second KIEM property
            String stateName = this.getProperties()[1].getValue();
            returnObj = new JSONObject();
            try {
                returnObj.accumulate(stateName, currentState);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            throw new KiemExecutionException("Ptolemy Model cannot make a step.", true, e);
        }

        return returnObj;
    }

    // -------------------------------------------------------------------------

    DiagramEditor getInputEditor() {
        String kiemEditorProperty = this.getProperties()[0].getValue();
        DiagramEditor diagramEditor = null;

        // get the active editor as a default case (if property is empty)
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage();
        IEditorPart editor = activePage.getActiveEditor();
        if (editor instanceof DiagramEditor) {
            diagramEditor = (DiagramEditor) editor;
        }

        // only check non-empty and valid property (this is optional)
        if (!kiemEditorProperty.equals("")) {
            if (getEditor(kiemEditorProperty) != null) {
                diagramEditor = getEditor(kiemEditorProperty);
            }
        }
        return diagramEditor;
    }

    // -------------------------------------------------------------------------

    String getInputModel() {
        DiagramEditor diagramEditor = this.getInputEditor();
        // now extract the file
        View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
        EObject myModel = (EObject) notationElement.getElement();
        URI uri = myModel.eResource().getURI();

        return uri.toPlatformString(false);
    }

    // -------------------------------------------------------------------------

    ResourceSet getInputResourceSet() {
        DiagramEditor diagramEditor = this.getInputEditor();
        // now extract the file
        View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
        EObject myModel = (EObject) notationElement.getElement();
        URI uri = myModel.eResource().getURI();

        return myModel.eResource().getResourceSet();
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
     */
    public void initialize() throws KiemInitializationException {
        // do the initialization prior to providing the interface keys
        // this may rise an exception
        PTOEXE = null;
        System.gc();
        try {
            loadAndExecuteModel();
        } catch (Exception e) {
            throw new KiemInitializationException("Ptolemy Model could not be generated", true, e);
        }
        return;
    }

    // -------------------------------------------------------------------------
    /**
     * Load and execute model.
     * 
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    public void loadAndExecuteModel() throws KiemInitializationException {
        // workspaceFolder = Platform.getLocation().toString();
        // ptolemyModel = this.getInputModel() + ".moml"; //this.getProperties()[0].getDirectory() +
        // "generated.moml";

        ResourceSet resourceSet = new ResourceSetImpl();
        URI fileUri = URI.createFileURI(new File("generated.moml").getAbsolutePath());
        ptolemyModel = resourceSet.createResource(fileUri);

        String ptolemyModelFile = ptolemyModel.getURI().toFileString();

        System.out.println("Now creating Ptolemy Model ..." + ptolemyModel);

        transformationCompleted = false;
        transformationError = false;

        final Maybe<IStatus> status = new Maybe<IStatus>();
        try {
            PlatformUI.getWorkbench().getProgressService().run(false, false,
                    new IRunnableWithProgress() {
                        public void run(final IProgressMonitor monitor) {
                            try {
                                status
                                        .set(Model2ModelTransformation(new KielerProgressMonitor(
                                                monitor)));
                            } catch (KiemInitializationException e) {
                                transformationError = true;
                                e.printStackTrace();
                            }
                        }
                    });
        } catch (InvocationTargetException e) {
            transformationError = true;
            e.printStackTrace();
        } catch (InterruptedException e) {
            transformationError = true;
            e.printStackTrace();
        }

        // wait until error or transformation completed
        while (!transformationCompleted && !transformationError) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) { /* hide sleep error */
            }
        }// end while

        if (!transformationError) {
            String host = this.getProperties()[2].getValue();
            String port = this.getProperties()[3].getValue();

            System.out.println("Now loading Ptolemy Model..." + ptolemyModelFile);
            // load the Ptolemy Model
            PTOEXE = new ExecutePtolemyModel(ptolemyModelFile, host, port);
            System.out.println("Now initializing Ptolemy Model...");
            PTOEXE_Thread = new Thread(PTOEXE);
            PTOEXE_Thread.start();
            System.out.println("Now executing Ptolemy Model...");
        }// end if
        else {
            throw new KiemInitializationException("Ptolemy Model could not be generated", true,
                    null);
        }
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
     */
    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
     */
    public boolean isProducer() {
        return true;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
     */
    public void wrapup() {
        // stop the model and unlink the PtolemyExecutor thread
        try {
            PTOEXE.executionStop();
        } catch (Exception e) {
            // we expect no serious errors here
        }
        PTOEXE_Thread = null;
        PTOEXE = null;
        System.gc();
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#initializeProperties()
     */
    @Override
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[4];
        properties[0] = new KiemProperty("SimpleRailCtrl Editor", new KiemPropertyTypeEditor(), "");
        properties[1] = new KiemProperty("State Name", "state");
        properties[2] = new KiemProperty("Host", "localhost");
        // "epoch");
        properties[3] = new KiemProperty("Port", 2000);
        // 5000);
        return properties;
    }

    // -------------------------------------------------------------------------

    EObject getInputModelEObject(DiagramEditor diagramEditor) {
        // now extract the file
        View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
        EObject myModel = (EObject) notationElement.getElement();

        return myModel;
    }

    // -------------------------------------------------------------------------
    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.DataComponent#testProperties(de.cau.cs.kieler.sim.kiem
     * .data.KiemProperty[])
     */
    @Override
    public void checkProperties(KiemProperty[] properties) throws KiemPropertyException {
        String kiemEditorProperty = this.getProperties()[0].getValue();

        // only check non-empty property (this is optional)
        if (!kiemEditorProperty.equals("")) {
            if (getEditor(kiemEditorProperty) == null) {
                // this is an error, probably the selected editor isnt open any more
                // or the file(name) opened has changed
                throw new KiemPropertyException("The selected editor '" + kiemEditorProperty + "'"
                        + " does not exist.\nPlease ensure that an opened editor is selected and"
                        + "the file name matches.\n\nIf you want the currently active editor to be"
                        + "simulated make sure the (optional) editor property is empty!");
            }
        }

        if (this.getInputEditor() == null) {
            throw new KiemPropertyException("There exists no active editor.\n"
                    + "Please ensure that an opened editor is selected and"
                    + "the file name matches.\n\nIf you want the currently active editor to be"
                    + "simulated make sure the (optional) editor property is empty!");
        }

        if (this.getInputEditor().isDirty()) {
            throw new KiemPropertyException("There are unsaved changes of the model opened "
                    + "in the editor to simulate.\n\nPlease save these changes before "
                    + "starting the simulation!");
        }

        modelEditor = this.getInputEditor();
        modelTimeStamp = this.getInputModelEObject(this.modelEditor).eResource().getTimeStamp();
        simulatingOldModelVersion = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the editor.
     * 
     * @param kiemEditorProperty
     *            the kiem editor property
     * 
     * @return the editor
     */
    DiagramEditor getEditor(String kiemEditorProperty) {
        if ((kiemEditorProperty == null) || (kiemEditorProperty.length() == 0))
            return null;

        StringTokenizer tokenizer = new StringTokenizer(kiemEditorProperty, " ()");
        if (tokenizer.hasMoreTokens()) {
            String fileString = tokenizer.nextToken();
            String editorString = tokenizer.nextToken();

            IEditorReference[] editorRefs = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage().getEditorReferences();
            for (int i = 0; i < editorRefs.length; i++) {
                if (editorRefs[i].getId().equals(editorString)) {
                    IEditorPart editor = editorRefs[i].getEditor(true);
                    if (editor instanceof DiagramEditor) {
                        // test if correct file
                        if (fileString.equals(editor.getTitle())) {
                            return (DiagramEditor) editor;
                            // rootEditPart = ((DiagramEditor) editor)
                            // .getDiagramEditPart();
                            // break;
                        }
                    }
                }
            }
        }
        return null;
    }

}
