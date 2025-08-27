/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.ui.datacomponent;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.json.JSONObject;

import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeModel;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * The Class JSONObjectDataComponent. Implementation for the extension point JSONObjectDataComponent
 * that implements the interface {@link IJSONObjectDataComponent}.
 * 
 * @author cmot
 * @kieler.design 2009-12-08
 * @kieler.rating 2010-08-15 yellow
 * 
 */
public abstract class JSONObjectSimulationDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    /** How many characters maximum for the error message. */
    protected static final int ERROR_MESSAGE_MAX_CHARACTERS = 200;

    /** The properties added by this super-component shift all sub components properties by one. */
    protected static final int KIEM_PROPERTY_DIFF = 1;

    /** The Constant TOTAL_WORK for the progress monitor. */
    protected static final int TOTAL_WORK = 4;

    /** The Constant for the name of the KIEM property model file selection. */
    public static final String KIEM_PROPERTY_MODEFILE = "Model File";

    /** Time to wait for the model transformation to be completed. */
    public static final int SLEEP_TIME = 50;

    /** The transformation completed flag. */
    private boolean transformationCompleted;

    /** The transformation error flag. */
    private boolean transformationError;

    /** The initialization exception that can be possibly thrown. */
    private Exception exception;

    /** The model time stamp. */
    private long modelTimeStamp;
    
    /**
     * A flag that becomes true if the user was warned about unsaved changes during the simulation.
     */
    private boolean simulatingOldModelVersion;

    /**
     * The dirty flag indicates iff a new model transformation is required to be done. The default 
     * implementation just returns that the simulator is ALWAYS dirty. This means we never skip
     * the model transformation the default case. A smarter implementation might be to hash 
     * and cache the contents of the whole model and just return true if the old and current hash
     * is different.
     *
     * @return true, if is dirty
     */
    public boolean isDirty() {
        return true;
    }
    
    public void setDirty(boolean isDirty) {
        //
    }
    
    // -------------------------------------------------------------------------

    /**
     * Instantiates a new JSONObjectDataComponent.
     */
    public JSONObjectSimulationDataComponent() {
        super();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the kiem property model file name.
     * 
     * @return the kiem property model file name
     */
    protected String getKiemPropertyModelFileName() {
        return KIEM_PROPERTY_MODEFILE;
    }

    // -------------------------------------------------------------------------

    /**
     * Provide filter keys and default values as a JSONObject.
     * 
     * @return the JSONObject
     */
    public JSONObject provideFilterKeysJSON() {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether transformation completed is true.
     * 
     * @return true, if is transformation completed
     */
    protected boolean isTransformationCompleted() {
        return this.transformationCompleted;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether transformation error is true.
     * 
     * @return true, if is transformation error
     */
    protected boolean isTransformationError() {
        return this.transformationError;
    }

    // -----------------------------------------------------------------------------
    // -----------------------------------------------------------------------------
    /**
     * The Class M2MProgressMonitor.
     */
    protected static class M2MProgressMonitor implements ProgressMonitor {

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

    /**
     * Implementation of model 2 model transformation.
     * 
     * @param monitor
     *            the monitor
     * @throws Exception
     *             the exception
     */
    public void doModel2ModelTransform(final ProgressMonitorAdapter monitor) throws Exception {
        // not implemented
    }

    // -----------------------------------------------------------------------------

    /**
     * Performs the model 2 model transformation and handles exceptions <BR>
     * This transformation uses the Xtend transformation language.
     * 
     * @param monitor
     *            the monitor
     * @return true, if m2m transformation was successful
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    private IStatus model2ModelTransform(final ProgressMonitorAdapter monitor)
            throws KiemInitializationException {
        monitor.begin("Model2Model transformation", TOTAL_WORK);
        try {
            // skip the model transformation in case the execution is still valid and NOT dirty
            if (isDirty()) {
                doModel2ModelTransform(monitor);
            }
        } catch (Exception e) {
            setDirty(true);
            monitor.done();
            exception = e;
            String message = exception.getMessage();
            transformationCompleted = true;
            transformationError = true;
            return new Status(IStatus.ERROR, DataComponentPlugin.PLUGIN_ID,
                    "Model transformation failed.\n" , null);
//            return new Status(IStatus.ERROR, DataComponentPlugin.PLUGIN_ID,
//                    "Model transformation failed.", e);
        }
        setDirty(false);
        monitor.done();
        transformationCompleted = true;
        transformationError = false;
        return new Status(IStatus.OK, DataComponentPlugin.PLUGIN_ID, IStatus.OK, null, null);
    }

    // -------------------------------------------------------------------------

    /**
     * Implements the real step method for this simulation datacomponent.
     * 
     * @param jSONObject
     *            the j son object
     * @return the jSON object
     * @throws KiemExecutionException
     *             the kiem execution exception
     */
    public JSONObject doStep(final JSONObject jSONObject) throws KiemExecutionException {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public final JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        // If an opened EMF model editor is involved, check the timestamp
        if (this.getModelRootElement() != null && getModelRootElement().eResource() != null) {
            try {
                long newModelTimeStamp = getModelRootElement().eResource().getTimeStamp();
                // check the dirty state of the editor containing the simulated
                // model
                if (((newModelTimeStamp != modelTimeStamp) || getModelEditor().isDirty())
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
        }

        // the return object
        JSONObject returnObj = doStep(jSONObject);

        return returnObj;
    }

    // -------------------------------------------------------------------------

    /**
     * Check the model validation. Should return true if the model is valid, false otherwise. <BR>
     * <BR>
     * Example:<BR>
     * Region syncChart = (de.cau.cs.kieler.synccharts.Region) rootEObject; <BR>
     * Diagnostic diagnostic = diagnostician.validate(syncChart); <BR>
     * int serenity = diagnostic.getSeverity(); <BR>
     * return (serenity == Diagnostic.OK); <BR>
     * 
     * @param rootEObject
     *            the root e object
     * @return true, if successful
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    public boolean checkModelValidation(final EObject rootEObject)
            throws KiemInitializationException {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Performs the normal provide initial variables method.
     * 
     * @return the jSON object
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the model file property as selected in the KIEM properties table as a String.
     * 
     * @return the model file property
     */
    protected String getModelFileProperty() {
        return this.getProperties()[0].getValue();
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the active editor is selected.
     * 
     * @return true, if is active editor selected
     */
    protected boolean isActiveEditorSelected() {
        String modelFileProperty = getModelFileProperty();
        return (modelFileProperty.equals(KiemPropertyTypeModel.ACTIVE_EDITOR));
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the selected model file path as configured by the KiemPropertyModel.
     * 
     * @return the model file path
     */
    protected IPath getModelFilePath() {
        String modelFileProperty = getModelFileProperty();
        IPath modelFilePath = null;

        // If active editor is selected then KIEM will provide it
        if (isActiveEditorSelected()) {
            modelFilePath = KiemPlugin.getCurrentModelFile();
        } else {
            IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
            modelFilePath = new Path(modelFileProperty);
            IFile file = workspaceRoot.getFile(modelFilePath);
            if (!file.exists()) {
                return null;
            }
        }
        return modelFilePath;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the models root element, an EObject of the currently selected model file or null if no
     * opened EMF editor was found.
     * 
     * @return the model root element
     */
    public EObject getModelRootElement() {
        IPath modelFilePath = this.getModelFilePath();
        if (modelFilePath == null) {
            return null;
        }
        EObject eObject = KiemPlugin.getOpenedModelRootObjects().get(modelFilePath);
        if (eObject == null) {
            // try to load it
            try {
                eObject = KiemUtil.loadEObjectFromModelFile(modelFilePath);
            } catch (IOException e) {
                // ignore errors
                e.printStackTrace();
            }
            if (eObject != null) {
                // save in KIEM for future use
                KiemPlugin.getOpenedModelRootObjects().put(modelFilePath, eObject);
            }
        }
        return eObject;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the model editor of the currently selected file or null if no opened editor was found.
     * 
     * @return the model editor
     */
    public final IEditorPart getModelEditor() {
        IPath modelFilePath = this.getModelFilePath();
        if (modelFilePath == null) {
            return null;
        }
        return KiemPlugin.getOpenedModelEditors().get(modelFilePath);
    }

    // -------------------------------------------------------------------------

    /** The ask for model error return value. */
    private int askForModelErrorReturnValue = 0;

    /**
     * Ask for model error.
     *
     * @return true, if successful
     * @throws KiemInitializationException the kiem initialization exception
     */
    private boolean askForModelError() throws KiemInitializationException {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                final Shell shell = Display.getDefault().getShells()[0];

                String[] buttons = { "Yes", "No", "Cancel" };

                MessageDialog dlg = new MessageDialog(shell, "Errors or Warnings exist", null, "'"
                        + getModelEditor().getEditorInput().getName() + "'"
                        + " contains unsolved problems. Please check the Eclipse "
                        + "Problems View to fix these"
                        + ".\n\nNote that while errors or simulation warnings exist, the"
                        + " execution of the model is rather unpredictable.\n\n"
                        + "Do you still want to continue?", MessageDialog.QUESTION, buttons, 0);

                askForModelErrorReturnValue = 2;
                try {
                    askForModelErrorReturnValue = dlg.open();
                } catch (Exception e) {
                    askForModelErrorReturnValue = 2; // implicit CANCEL on
                                                     // exception
                }
            }
        });

        if ((askForModelErrorReturnValue == 2) || (askForModelErrorReturnValue == 1)) {
            // do not show a message, just abort execution initialization
            throw new KiemInitializationException("User aborted model simulation/execution.", true,
                    null, true);
        }
        return (askForModelErrorReturnValue == 0);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public final JSONObject provideInitialVariables() throws KiemInitializationException {
        JSONObject returnObj = null;

        // Do validation only for (opened) EMF editors
        if (this.getModelEditor() != null) {
            // Check if the model conforms to all check files and no warnings left!
            EObject rootEObject = this.getModelRootElement();
            boolean ok = checkModelValidation(rootEObject);

            if (!ok) {
                // bring Problems View to the front otherwise
                bringProblemsViewToFront();

                // the following method may throw an Exception and abort the
                // initialization in the case
                // that the user hits cancel or no.
                askForModelError();
            }
        }
        try {
            // first do the model transformation
            performModelTransformation();
            // then do the provide initial variables
            returnObj = doProvideInitialVariables();
            return returnObj;
        } catch (Exception e) {
            e.printStackTrace();
            throw new KiemInitializationException("Model could not be generated\n\n"
                    + "Please ensure that all simulation warnings in the "
                    + "respective Eclipse Problems View have been cleared.\n\n" + KiemUtil.getStackTraceString(e, ERROR_MESSAGE_MAX_CHARACTERS), true, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Perform model transformation.
     * 
     * @return true, if successful
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    private boolean performModelTransformation() throws KiemInitializationException {
        transformationCompleted = false;
        transformationError = false;
        exception = null;

// Problem: 26.06.2012
// 1. Strange Blocking (Deadlock) when running regression tests with UI, non-headless
// 2. Popup of progress monitor needs much longer than the actual transformation for
//    small models
// Removed this code for now.        
        
//        if (KiemUtil.isHeadlessRun()) {
            // headless run - sequential in current thread
            model2ModelTransform(new ProgressMonitorAdapter(new NullProgressMonitor()));
//        } else {
//            // normal run - concurrent to UI thread
//            Display.getDefault().asyncExec(new Runnable() {
//                public void run() {
//                    final Maybe<IStatus> status = new Maybe<IStatus>();
//                    try {
//                        PlatformUI.getWorkbench().getProgressService()
//                                .run(true, true, new IRunnableWithProgress() {
//                                    public void run(final IProgressMonitor monitor) {
//                                        try {
//                                            status.set(model2ModelTransform(new ProgressMonitorAdapter(
//                                                    monitor)));
//                                        } catch (KiemInitializationException e) {
//                                            transformationError = true;
//                                            exception = e;
//                                        }
//                                    }
//                                });
//                    } catch (InvocationTargetException e) {
//                        transformationError = true;
//                        exception = e;
//                    } catch (InterruptedException e) {
//                        transformationError = true;
//                        exception = e;
//                    }
//                }
//            });
//
//            // wait until error or transformation completed
//            while (!transformationCompleted && !transformationError) {
//                try {
//                    Thread.sleep(SLEEP_TIME);
//                } catch (InterruptedException e) { 
//                    // hide sleep error
//                }
//            } // end while
//        } // end if NOT headless

        if (transformationError) {
            if (exception instanceof KiemInitializationException) {
                throw (KiemInitializationException) exception;
//                throw (new KiemInitializationException(exception.getMessage(), true, null));
//                exception.printStackTrace();
            } else {
                exception.printStackTrace();
            }
            return false;
        } // end if
        return true;
    }

    // -------------------------------------------------------------------------

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

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Do provide properties.
     * 
     * @return the kiem property[]
     */
    public KiemProperty[] doProvideProperties() {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public final KiemProperty[] provideProperties() {
        KiemProperty[] returnProperties;
        KiemProperty[] properties = doProvideProperties();
        if (properties == null) {
            returnProperties = new KiemProperty[1];
            returnProperties[0] = new KiemProperty(getKiemPropertyModelFileName(),
                    new KiemPropertyTypeModel(), KiemPropertyTypeModel.ACTIVE_EDITOR);
        } else {
            returnProperties = new KiemProperty[KIEM_PROPERTY_DIFF + properties.length];
            returnProperties[0] = new KiemProperty(getKiemPropertyModelFileName(),
                    new KiemPropertyTypeModel(), KiemPropertyTypeModel.ACTIVE_EDITOR);
            for (int c = 0; c < properties.length; c++) {
                returnProperties[KIEM_PROPERTY_DIFF + c] = properties[c];
            }
        }
        return returnProperties;
    }

    // -------------------------------------------------------------------------

    /**
     * Save editor.
     */
    private void saveEditor() {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                IEditorSite part = getModelEditor().getEditorSite();
                part.getPage().saveEditor((IEditorPart) part.getPart(), false);
            }
        });
    }

    // -------------------------------------------------------------------------

    /** The ask for model is saved return value. */
    private int askForModelIsSavedReturnValue = 0;

    /**
     * Ask for model is saved. Only ask if there is an opened editor to the selected model.
     * 
     * @return true, if successful
     * @throws KiemPropertyException
     *             the kiem property exception
     */
    private boolean askForModelIsSaved() throws KiemPropertyException {
        // Shortcut if there is NO opened editor
        if (getModelEditor() == null) {
            return true;
        }
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                final Shell shell = Display.getDefault().getShells()[0];

                String[] buttons = { "Yes", "No", "Cancel" };

                MessageDialog dlg = new MessageDialog(shell, "Save Execution", null, "'"
                        + getModelEditor().getEditorInput().getName()
                        + "' has been modified. Save changes before proceeding?",
                        MessageDialog.QUESTION, buttons, 0);

                askForModelIsSavedReturnValue = 2;
                try {
                    askForModelIsSavedReturnValue = dlg.open();
                } catch (Exception e) {
                    askForModelIsSavedReturnValue = 2; // implicit CANCEL on
                                                       // exception
                }
            }
        });

        if (askForModelIsSavedReturnValue == 2) {
            // do not show a message, just abort execution initialization
            throw new KiemPropertyException("User aborted model simulation/execution.", null, true);
        }
        return (askForModelIsSavedReturnValue == 0);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void checkProperties(final KiemProperty[] properties) throws KiemPropertyException {
        IEditorPart modelEditor = getModelEditor();

        // if NOT the active editor is selected but a different file check whether the file exists
        if (this.getModelFilePath() == null) {
            // if the active editor is selected then this is the problem
            if (modelEditor == null && isActiveEditorSelected()) {
                throw new KiemPropertyException("There exists no active editor.\n"
                        + "Please ensure that an opened editor is selected and "
                        + "the file name matches.\n\nIf you want the currently active editor to be"
                        + "simulated make sure the (optional) editor property is empty!");
            } else {
                // this is an error, probably the selected editor isnt open any
                // more
                // or the file(name) opened has changed
                throw new KiemPropertyException("The selected editor '" + getModelFileProperty()
                        + "'"
                        + " does not exist.\nPlease ensure that an opened editor is selected and"
                        + "the file name matches.\n\nIf you want the currently active editor to be"
                        + "simulated select " + KiemPropertyTypeModel.ACTIVE_EDITOR
                        + " as model file property!");
            }
        }

        // if this model belongs to an opened editor check whether it is dirty
        if (modelEditor != null && modelEditor.isDirty()) {
            try {
                boolean b = askForModelIsSaved();
                if (b) {
                    // try to save the editor
                    saveEditor();
                    if (getModelRootElement() != null) {
                        // if this is an EMF editor, grab the time stamp
                        modelTimeStamp = this.getModelRootElement().eResource().getTimeStamp();
                        simulatingOldModelVersion = false;
                    }
                } else {
                    if (getModelRootElement() != null) {
                        // if this is an EMF editor, grab the time stamp
                        simulatingOldModelVersion = true;
                        modelTimeStamp = this.getModelRootElement().eResource().getTimeStamp();
                    }
                }
            } catch (KiemPropertyException e) {
                throw e;
            } catch (Exception e) {
                // if dialog cannot be opened, throw error
                throw new KiemPropertyException("There are unsaved changes of the model opened "
                        + "in the editor to simulate.\nYou should save these changes before "
                        + "starting any simulation/execution!");
            }
        } else if (modelEditor != null) {
            // not dirty
            EObject modelRootElement = getModelRootElement();
            if (modelRootElement != null && modelRootElement.eResource() != null) {
                // if this is an EMF editor, grab the time stamp
                modelTimeStamp = modelRootElement.eResource().getTimeStamp();
                simulatingOldModelVersion = false;
            }
        }
    }
    // -------------------------------------------------------------------------


    /**
     * Checks whether the system is based on windows.
     * 
     * @return true, if is windows
     */
    public static boolean isWindows() {
        String os = System.getProperty("os.name").toLowerCase();
        return (os.indexOf("win") >= 0);
    }    
}
