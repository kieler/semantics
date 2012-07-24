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

package de.cau.cs.kieler.kaom.sim.ptolemy;

import java.io.File;
import java.net.URL;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.util.BundleUtility;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.ui.ProgressMonitorAdapter;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeModel;

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
 * @author cmot
 * @kieler.ignore (excluded from review process)
 */
@SuppressWarnings("restriction")
public class KaomSimDataComponent extends JSONObjectDataComponent {

    /** The Ptolemy Executor. */
    private ExecutePtolemyModel executePtolemyModel;

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
    
    /** The current state. */
    private String currentState;

    /** The Constant SLEEP_TIME. */
    private static final int SLEEP_TIME = 50;
    
    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SimpleRailCtrl DataComponent for the KIELER Execution Manager.
     */
    public KaomSimDataComponent() {
    }

    // -----------------------------------------------------------------------------
    // -----------------------------------------------------------------------------
    /**
     * A Progress monitor for the KAOM simulation model transformation.
     * 
     * @author cmot
     * 
     */
    class M2MProgressMonitor implements ProgressMonitor {

        /** The kieler progress monitor. */
        private ProgressMonitorAdapter kielerProgressMonitor;

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
        public M2MProgressMonitor(final ProgressMonitorAdapter kielerProgressMonitorParam,
                final int numberOfComponentsParam) {
            kielerProgressMonitor = kielerProgressMonitorParam;
            numberOfComponents = numberOfComponentsParam;
            numberOfComponentsDone = 0;
        }

        /**
         * {@inheritDoc}
         */
        public void beginTask(final String name, final int totalWork) {
            kielerProgressMonitor.begin(name, numberOfComponents);
        }

        /**
         * {@inheritDoc}
         */
        public void done() {
            // is called by the workflow wrapper
        }

        /**
         * {@inheritDoc}
         */
        public void finished(final Object element, final Object context) {
        }

        /**
         * {@inheritDoc}
         */
        public void internalWorked(final double work) {
        }

        /**
         * {@inheritDoc}
         */
        public boolean isCanceled() {
            return (kielerProgressMonitor.isCanceled());
        }

        /**
         * {@inheritDoc}
         */
        public void postTask(final Object element, final Object context) {
            kielerProgressMonitor.worked(numberOfComponentsDone);
            numberOfComponentsDone++;
        }

        /**
         * {@inheritDoc}
         */
        public void preTask(final Object element, final Object context) {
            // kielerProgressMonitor.begin(element.toString(), 1);
            kielerProgressMonitor.worked(numberOfComponentsDone);
        }

        /**
         * {@inheritDoc}
         */
        public void setCanceled(final boolean value) {
        }

        /**
         * {@inheritDoc}
         */
        public void setTaskName(final String name) {
        }

        /**
         * {@inheritDoc}
         */
        public void started(final Object element, final Object context) {
        }

        /**
         * {@inheritDoc}
         */
        public void subTask(final String name) {
            kielerProgressMonitor.subTask(UNKNOWN);
        }

        /**
         * {@inheritDoc}
         */
        public void worked(final int work) {
            kielerProgressMonitor.worked(work);
        }

    }

    // -----------------------------------------------------------------------------
    // -----------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent#step(de.cau.cs.kieler.sim.kiem
     * .json.JSONObject)
     */
    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        try {
            long newModelTimeStamp = this.getInputModelEObject(this.modelEditor).eResource()
                    .getTimeStamp();
            // SyncchartsSimPtolemyPlugin.DEBUG("TIMESTAMP NEW " + newModelTimeStamp);

            // check the dirty state of the editor containing the simulated model
            if (((newModelTimeStamp != modelTimeStamp) || modelEditor.isDirty())
                    && !simulatingOldModelVersion) {
                // remember that we warned the user (do this only once)
                simulatingOldModelVersion = true;
                // warn the user
                throw new KiemExecutionException(
                        "The simulated model changed since the simulation "
                                + "was started.\n\nYou should restart the simulation in order to "
                                + "simulate the changed version of your model.", false, null);
            }
        } catch (Exception e) {
            // editor might have been closed -> no problem
        }

        KaomSimPtolemyPlugin.dEBUG("Step in Ptolemy Model...");

        // the return object to construct
        JSONObject returnObj = new JSONObject();

        // contains the current state
        currentState = "";

        try {
            // set current input data
            executePtolemyModel.setData(jSONObject);

            // perform an synchronous step in PtolemyExecutor
            executePtolemyModel.executionStep();

            // get the current states
            currentState = executePtolemyModel.getCurrentState();
        } catch (Exception e) {
            throw (new KiemExecutionException("Ptolemy Model cannot make a step.\n\n"
                    + "Please ensure that all simulation warnings in the "
                    + "respective Eclipse Problems View have been cleared. If"
                    + " all warings have been cleared and still 'unknown "
                    + " inputs remain', possibly your model is not constructive.\n\n", true, e));
        }

        // get the output present signals
        String[] tokenNames = executePtolemyModel.getInterfaceTokens();
        String[] tokens = executePtolemyModel.getModelOutput();
        for (int c = 0; c < tokens.length; c++) {
            KaomSimPtolemyPlugin.dEBUG("Token:" + tokenNames[c]);
            try {
                returnObj.accumulate(tokenNames[c], tokens[c]);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        KaomSimPtolemyPlugin.dEBUG(returnObj.toString());

        // the stateName is the second KIEM property
        // String stateName = this.getProperties()[1].getValue();

        // try {
        // returnObj.accumulate(stateName, currentState);
        // } catch (Exception e) {
        // }
        return returnObj;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Gets the current state.
     *
     * @return the current state
     */
    public String getCurrentState() { 
        return currentState;
    }

    /**
     * Checks if is recursive.
     * 
     * @return true, if is recursive
     */
    public boolean isRecursive() {
        return this.getProperties()[1].getValueAsBoolean();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        JSONObject returnObj = new JSONObject();

        // do the initialization prior to providing the interface keys
        // this may rise an exception
        executePtolemyModel = null;
        System.gc();
        String[] keys = null;

        // // Check if the model conforms to all check files and no warnings left!
        // Diagnostician diagnostician = new Diagnostician();
        // Diagnostic diagnostic = diagnostician.validate(this.getInputModelEObject(this
        // .getInputEditor()));
        // boolean ok = diagnostic.getSeverity() == Diagnostic.OK;
        // TODO: No checks yet for KAOM models
        boolean ok = true;

        if (!ok) {
            // bring Problems View to the front otherwise
            bringProblemsViewToFront();
            // prompt the user
            try {
                Display.getDefault().syncExec(new Runnable() {
                    public void run() {
                        final Shell shell = Display.getCurrent().getShells()[0];
                        MessageDialog
                                .openWarning(
                                        shell,
                                        "Errors or Warnings exist",
                                        "'"
                                                + modelEditor.getEditorInput().getName()
                                                + "'"
                                                + " contains unsolved problems. Please check" 
                                                + " the Eclipse" 
                                                + " Problems View to fix these"
                                                + ".\n\nNote that while errors or simulation warnings" 
                                                + " exist, the"
                                                + " execution of the model is rather unpredictable.");

                    }
                });
            } catch (Exception e) {
                // in case of an error here, do not start simulation
                throw new KiemInitializationException(
                        "Please fix all errors and KlePto simulation warnings listed "
                                + "in the Eclipse Problems View before simulating.\n\n", false, e);
            }
        }
        try {
            loadAndExecuteModel();
            keys = executePtolemyModel.getInterfaceTokens();
            for (String key : keys) {
                returnObj.accumulate(key, "");
            }
        } catch (KiemInitializationException e) {
            // propagate KiemInitializationException
            throw e;
        } catch (Exception e) {
            throw new KiemInitializationException("Ptolemy Model could not be generated\n\n"
                    + "Please ensure that all simulation warnings in the "
                    + "respective Eclipse Problems View have been cleared.\n\n", true, e);
        }
        return returnObj;
    } // -------------------------------------------------------------------------

    /** The diagram editor. */
    private DiagramEditor diagramEditor = null;

    /** The diagram editor flag. */
    private boolean diagramEditorFlag = false;

    /**
     * Gets the input editor.
     * 
     * @return the input editor
     */
    DiagramEditor getInputEditor() {
        String kiemEditorProperty = this.getProperties()[0].getValue();
        diagramEditorFlag = false;

        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                // get the active editor as a default case (if property is empty)
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                IWorkbenchPage activePage = window.getActivePage();
                IEditorPart editor = activePage.getActiveEditor();
                if (editor instanceof DiagramEditor) {
                    diagramEditor = (DiagramEditor) editor;
                }
                diagramEditorFlag = true;
            }
        });

        // only check non-empty and valid property (this is optional)
        if (!kiemEditorProperty.equals("")) {
            if (getEditor(kiemEditorProperty) != null) {
                diagramEditor = getEditor(kiemEditorProperty);
            }
        } else {
            while (!diagramEditorFlag) {
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return diagramEditor;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the input model.
     * 
     * @return the input model
     */
    String getInputModel() {
        DiagramEditor localDiagramEditor = this.getInputEditor();
        // now extract the file
        View notationElement = ((View) localDiagramEditor.getDiagramEditPart().getModel());
        EObject myModel = (EObject) notationElement.getElement();
        URI uri = myModel.eResource().getURI();

        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

        IPath path = new Path(uri.toPlatformString(false));
        IFile file = myWorkspaceRoot.getFile(path);

        IPath fullPath = file.getLocation();

        // If we have spaces, try it like this...
        if (fullPath == null && file instanceof org.eclipse.core.internal.resources.Resource) {
            org.eclipse.core.internal.resources.Resource resource 
            = (org.eclipse.core.internal.resources.Resource) file;
            fullPath = resource.getLocalManager().locationFor(resource);
        }

        // Ensure it is absolute
        fullPath.makeAbsolute();

        java.io.File javaFile = fullPath.toFile();

        if (javaFile.exists()) {
            String fileString = javaFile.getAbsolutePath();
            return fileString;
        }

        // Something went wrong, we could not resolve the file location
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the input model e object.
     * 
     * @param diagramEditorParam
     *            the diagram editor
     * @return the input model e object
     */
    EObject getInputModelEObject(final DiagramEditor diagramEditorParam) {
        // now extract the file
        View notationElement = ((View) diagramEditorParam.getDiagramEditPart().getModel());
        EObject myModel = (EObject) notationElement.getElement();

        return myModel;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the input resource set.
     * 
     * @return the input resource set
     */
    ResourceSet getInputResourceSet() {
        DiagramEditor localDiagramEditor = this.getInputEditor();
        // now extract the file
        View notationElement = ((View) localDiagramEditor.getDiagramEditPart().getModel());
        EObject myModel = (EObject) notationElement.getElement();
        return myModel.eResource().getResourceSet();
    }

    // -------------------------------------------------------------------------

    /**
     * Resolve bundel file.
     * 
     * @param relativePath
     *            the relative path
     * @return the uRL
     */
    public URL resolveBundelFile(final String relativePath) {
        Bundle bundle = Platform.getBundle(KaomSimPtolemyPlugin.PLUGIN_ID);
        if (!BundleUtility.isReady(bundle)) {
            return null;
        }
        URL fullPathString = BundleUtility.find(bundle, relativePath);
        return fullPathString;
    }

    // -------------------------------------------------------------------------

    /**
     * Load and execute model.
     * 
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    public void loadAndExecuteModel() throws KiemInitializationException {
        String ptolemyModelFile = null;
        try {
            String modelInput = this.getInputModel();

            ptolemyModelFile = modelInput.substring(0, modelInput.lastIndexOf("."));
            ptolemyModelFile += ".moml";

            // test file for actual existence, if not try xml, otherwise fail with null
            File f = new File(ptolemyModelFile);
            if (!f.exists()) {
                ptolemyModelFile = modelInput.substring(0, modelInput.lastIndexOf("."));
                ptolemyModelFile += ".xml";
                f = new File(ptolemyModelFile);
                if (!f.exists()) {
                    ptolemyModelFile = null;
                }
            }
            // ptolemyModelFile = ptolemyModelFile.substring(1, ptolemyModelFile.length());
        } catch (Exception e) {
            ptolemyModelFile = null;
        }

        if (ptolemyModelFile == null) {
            throw new KiemInitializationException("Original Ptolemy Model could not be found",
                    true, null);
        }

        KaomSimPtolemyPlugin.dEBUG("Now creating Ptolemy Model ..." + ptolemyModel);

        transformationCompleted = false;
        transformationError = false;

        if (!transformationError) {
            KaomSimPtolemyPlugin.dEBUG("Now loading Ptolemy Model..." + ptolemyModelFile);
            // load the Ptolemy Model
            executePtolemyModel = new ExecutePtolemyModel(ptolemyModelFile);
            KaomSimPtolemyPlugin.dEBUG("Now initializing Ptolemy Model...");

            // recursive deep data outputs
            executePtolemyModel.setRecursive(this.isRecursive());

            executePtolemyModel.executionInitialize();
            KaomSimPtolemyPlugin.dEBUG("Now executing Ptolemy Model...");
        } else {
            throw new KiemInitializationException("Ptolemy Model could not be generated", true,
                    null);
        }
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
     */
    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
    }

    // -------------------------------------------------------------------------
    /**
     * Bring problems view to front.
     */
    public void bringProblemsViewToFront() {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                try {
                    IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                    IViewPart vP = window.getActivePage().showView(
                            org.eclipse.ui.IPageLayout.ID_PROBLEM_VIEW);
                    vP.setFocus();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // -------------------------------------------------------------------------
    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
     */
    /**
     * {@inheritDoc}
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
    /**
     * {@inheritDoc}
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
    /**
     * {@inheritDoc}
     */
    public void wrapup() {
        // stop the model and unlink the PtolemyExecutor thread
        try {
            executePtolemyModel.executionStop();
        } catch (Exception e) {
            // we expect no serious errors here
        }
        executePtolemyModel = null;
        System.gc();
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#initializeProperties()
     */
    /**
     * {@inheritDoc}
     */
    @Override
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[2];
        properties[0] = new KiemProperty("Kaom Editor", new KiemPropertyTypeModel(), "");
        properties[1] = new KiemProperty("Recursive", false);
        return properties;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.DataComponent#testProperties(de.cau.cs.kieler.sim.kiem
     * .data.KiemProperty[])
     */
    /**
     * {@inheritDoc}
     */
    @Override
    public void checkProperties(final KiemProperty[] properties) throws KiemPropertyException {
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

        modelEditor = this.getInputEditor();

        if (modelEditor == null) {
            throw new KiemPropertyException("There exists no active editor.\n"
                    + "Please ensure that an opened editor is selected and"
                    + "the file name matches.\n\nIf you want the currently active editor to be"
                    + "simulated make sure the (optional) editor property is empty!");
        }

        if (modelEditor.isDirty()) {
            try {
                final Shell shell = Display.getCurrent().getShells()[0];
                boolean b = MessageDialog.openQuestion(shell, "Save Resource", "'"
                        + modelEditor.getEditorInput().getName() + "'"
                        + " has been modified. Save changes before simulating?");
                if (b) {
                    IEditorSite part = modelEditor.getEditorSite();
                    part.getPage().saveEditor((IEditorPart) part.getPart(), false);
                    // modelEditor.doSaveAs(); // doSave(new IProgressMonitor());
                    modelTimeStamp = this.getInputModelEObject(this.modelEditor).eResource()
                            .getTimeStamp();
                    simulatingOldModelVersion = false;
                } else {
                    simulatingOldModelVersion = true;
                    modelTimeStamp = this.getInputModelEObject(this.modelEditor).eResource()
                            .getTimeStamp();
                }
            } catch (Exception e) {
                // if dialog cannot be opened, throw error
                throw new KiemPropertyException("There are unsaved changes of the model opened "
                        + "in the editor to simulate.\n\nPlease save these changes before "
                        + "starting the simulation!");
            }
        } else {
            // not dirty
            modelTimeStamp = this.getInputModelEObject(this.modelEditor).eResource().getTimeStamp();
            simulatingOldModelVersion = false;
        }

        KaomSimPtolemyPlugin.dEBUG("TIMESTAMP" + modelTimeStamp);

    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is transformation completed.
     * 
     * @return true, if is transformation completed
     */
    public boolean isTransformationCompleted() {
        return transformationCompleted;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the editor.
     * 
     * @param kiemEditorProperty
     *            the kiem editor property
     * @return the editor
     */
    DiagramEditor getEditor(final String kiemEditorProperty) {
        if ((kiemEditorProperty == null) || (kiemEditorProperty.length() == 0)) {
            return null;
        }

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
