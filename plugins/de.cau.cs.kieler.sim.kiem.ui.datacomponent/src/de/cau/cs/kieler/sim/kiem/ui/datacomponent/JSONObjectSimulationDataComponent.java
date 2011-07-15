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

package de.cau.cs.kieler.sim.kiem.ui.datacomponent;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
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
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.ui.KielerProgressMonitor;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;

/**
 * The Class JSONObjectDataComponent. Implementation for the extension point JSONObjectDataComponent
 * that implements the interface {@link IJSONObjectDataComponent}.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2010-08-15 yellow
 * 
 */
@SuppressWarnings("restriction") // for BundleUtility
public abstract class JSONObjectSimulationDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    /** The transformation completed flag. */
    private boolean transformationCompleted;

    /** The transformation error flag. */
    private boolean transformationError;

    /** The editor of the model being simulated. */
    protected IEditorPart modelEditor;

//    /** The global initial variables as JSONObjects. */
//    private JSONObject globalInitialVariables;

    /** The model time stamp. */
    private long modelTimeStamp;

    /**
     * A flag that becomes true if the user was warned about unsaved changes during the simulation.
     */
    private boolean simulatingOldModelVersion;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new JSONObjectDataComponent.
     */
    public JSONObjectSimulationDataComponent() {
        super();
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
    protected class M2MProgressMonitor implements ProgressMonitor {

        private KielerProgressMonitor kielerProgressMonitor;
        private int numberOfComponents = 1;
        private int numberOfComponentsDone = 0;

        public M2MProgressMonitor(KielerProgressMonitor kielerProgressMonitorParam,
                int numberOfComponentsParam) {
            kielerProgressMonitor = kielerProgressMonitorParam;
            numberOfComponents = numberOfComponentsParam;
            numberOfComponentsDone = 0;
        }

        public void beginTask(String name, int totalWork) {
            kielerProgressMonitor.begin(name, numberOfComponents);
        }

        public void done() {
            // is called by the workflow wrapper
        }

        public void finished(Object element, Object context) {
        }

        public void internalWorked(double work) {
        }

        public boolean isCanceled() {
            return (kielerProgressMonitor.isCanceled());
        }

        public void postTask(Object element, Object context) {
            kielerProgressMonitor.worked(numberOfComponentsDone);
            numberOfComponentsDone++;
        }

        public void preTask(Object element, Object context) {
            // kielerProgressMonitor.begin(element.toString(), 1);
            kielerProgressMonitor.worked(numberOfComponentsDone);
        }

        public void setCanceled(boolean value) {
        }

        public void setTaskName(String name) {
        }

        public void started(Object element, Object context) {
        }

        public void subTask(String name) {
            kielerProgressMonitor.subTask(UNKNOWN);
        }

        public void worked(int work) {
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
    public void doModel2ModelTransform(KielerProgressMonitor monitor) throws Exception {
        // not implemented
    }

    // -----------------------------------------------------------------------------

    /**
     * Performs the model 2 model transformation and handles exceptions <BR>
     * This transformation uses the Xtend transformation language.
     * 
     * @param progressBar
     *            if true a progress bar is displayed
     * 
     * @return true, if m2m transformation was successful
     * 
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    private final IStatus model2ModelTransform(KielerProgressMonitor monitor)
            throws KiemInitializationException {
        monitor.begin("Model2Model transformation", 4);
        try {
            doModel2ModelTransform(monitor);
        } catch (Exception e) {
            monitor.done();
            e.printStackTrace();
            transformationCompleted = true;
            transformationError = true;
            return new Status(IStatus.ERROR, DataComponentPlugin.PLUGIN_ID,
                    "Model transformation failed.", e);
        }
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
    public JSONObject doStep(JSONObject jSONObject) throws KiemExecutionException {
        return null;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent#step(de.cau.cs.kieler.sim.kiem
     * .json.JSONObject)
     */
    public final JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        try {
            long newModelTimeStamp = this.getInputModelEObject(this.modelEditor).eResource()
                    .getTimeStamp();

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
     * @return true, if successful
     */
    public boolean checkModelValidation(EObject rootEObject) {
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
     * Gets the models root element, an EObject.
     * 
     * @return the model root element
     */
    public final EObject getModelRootElement() {
        EObject rootEObject = this.getInputModelEObject(this.getInputEditor());
        return rootEObject;
    }
    
    // -------------------------------------------------------------------------
    
    int askForModelErrorReturnValue = 0;
     
     private boolean askForModelError() throws KiemInitializationException {
         Display.getDefault().syncExec(new Runnable() {
             public void run() {
                 final Shell shell = Display.getDefault().getShells()[0];
                 
                 String[] buttons = { "Yes", "No", "Cancel" };

                 MessageDialog dlg = new MessageDialog(shell, "Errors or Warnings exist", null, "'"
                         + modelEditor.getEditorInput().getName() + "'" 
                         + " contains unsolved problems. Please check the Eclipse Problems View to fix these"
                         + ".\n\nNote that while errors or simulation warnings exist, the"
                         + " execution of the model is rather unpredictable.\n\nDo you still want to continue?",
                         MessageDialog.QUESTION,
                         buttons, 0);

                 askForModelErrorReturnValue = 2;
                 try {
                     askForModelErrorReturnValue = dlg.open();
                 } catch (Exception e) {
                     askForModelErrorReturnValue = 2; // implicit CANCEL on exception
                 }                
             }
         });
         
         if ((askForModelErrorReturnValue == 2)||(askForModelErrorReturnValue == 1)) {
             // do not show a message, just abort execution initialization
             throw new KiemInitializationException("User aborted model simulation/execution.", true, null, true);
         }
         return (askForModelErrorReturnValue == 0);
     }
     
     // -------------------------------------------------------------------------

    public final JSONObject provideInitialVariables() throws KiemInitializationException {
        JSONObject returnObj = new JSONObject();

        // Check if the model conforms to all check files and no warnings left!
        EObject rootEObject = getModelRootElement();
        
        boolean ok = checkModelValidation(rootEObject);

        if (!ok) {
            // bring Problems View to the front otherwise
            bringProblemsViewToFront();
            
            // the following method may throw an Exception and abort the initialization in the case
            // that the user hits cancel or no.
            askForModelError();
            
        }
        try {
            // first do the model transformation
            performModelTransformation();
            // then do the provide initial variables
            returnObj = doProvideInitialVariables();
        } catch (Exception e) {
            throw new KiemInitializationException("Model could not be generated\n\n"
                    + "Please ensure that all simulation warnings in the "
                    + "respective Eclipse Problems View have been cleared.\n\n", true, e);
        }
        return returnObj;

    }

    // -------------------------------------------------------------------------

    protected IWorkbenchPage activePage = null;
    protected boolean activePageFlag = false;

    /**
     * Gets the active page (blocking) from the UI thread.
     * 
     * @return the active page
     */
    protected IWorkbenchPage getActivePage() {
        activePageFlag = false;

        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                // get the active editor as a default case (if property is empty)
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                activePage = window.getActivePage();
                activePageFlag = true;
            }
        });

        while (!activePageFlag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return activePage;
    }

    // -------------------------------------------------------------------------

    protected IEditorPart getInputEditor() {
        String kiemEditorProperty = this.getProperties()[0].getValue();
        IEditorPart diagramEditor = null;

        // only check non-empty and valid property (this is optional)
        if (!kiemEditorProperty.equals("")) {
            if (getEditor(kiemEditorProperty) != null) {
                diagramEditor = getEditor(kiemEditorProperty);
            }
        } else {
            IWorkbenchPage activePage = getActivePage();
            IEditorPart editor = activePage.getActiveEditor();
            // if (editor instanceof DiagramEditor) {
            diagramEditor = (IEditorPart) editor;
        }
        return diagramEditor;
    }

    // -------------------------------------------------------------------------

//    protected String getInputModel() {
//        IEditorPart diagramEditor = this.getInputEditor();
//        // now extract the file
//        View notationElement = getNotationElement(diagramEditor);
//        if (notationElement == null) {
//            return null;
//        }
//        // View notationElement = ((View) ((DiagramEditor) diagramEditor).getDiagramEditPart()
//        // .getModel());
//        EObject myModel = (EObject) notationElement.getElement();
//        URI uri = myModel.eResource().getURI();
//        return uri.toPlatformString(false);
//    }

    
    // -------------------------------------------------------------------------

    protected URI getInputModelAsURI() {
        String file = getInputModel();
        if (file != null) {
            URI uri = URI.createURI("file://" + file.replaceAll(" ", "%20").replace("\\", "/"));//.replaceAll(" ", "%20"));
            return uri;
        }
        return null;
    }

    // -------------------------------------------------------------------------

    protected String getInputModel() {
        IEditorPart diagramEditor = this.getInputEditor();

      // now extract the file
      View notationElement = getNotationElement(diagramEditor);
      if (notationElement == null) {
          return null;
      }
        
        EObject myModel = (EObject) notationElement.getElement();
        URI uri = myModel.eResource().getURI();

        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

        IPath path = new Path(uri.toPlatformString(false));
        IFile file = myWorkspaceRoot.getFile(path);
        
        IPath fullPath = file.getLocation();
        
        //If we have spaces, try it like this...
        if (fullPath == null && file instanceof org.eclipse.core.internal.resources.Resource) {
            org.eclipse.core.internal.resources.Resource resource = (org.eclipse.core.internal.resources.Resource)file;
            fullPath = resource.getLocalManager().locationFor(resource);
        }
        
        //Ensure it is absolute
        fullPath.makeAbsolute();
        
        java.io.File javaFile = new File(fullPath.toString().replaceAll("%20", " "));
        
        if (javaFile.exists()) {
            String fileString = javaFile.getAbsolutePath();
            return fileString;
        }
        
        // Something went wrong, we could not resolve the file location
        return null;
    }
    
    // -------------------------------------------------------------------------

    protected EObject getInputModelEObject(IEditorPart diagramEditor) {
        // now extract the file
        EObject myModel = null;
        View notationElement = getNotationElement(diagramEditor);
        if (notationElement == null) {
            return null;
        }
        myModel = (EObject) notationElement.getElement();
        return myModel;
    }

    // -------------------------------------------------------------------------

    protected View getNotationElement(IEditorPart diagramEditor) {
        if (diagramEditor instanceof DiagramEditor) {
            View notationElement = ((View) ((DiagramEditor) diagramEditor).getDiagramEditPart()
                    .getModel());
            return notationElement;
        }
        return null;
    }

    // -------------------------------------------------------------------------

    protected ResourceSet getInputResourceSet() {
        IEditorPart diagramEditor = this.getInputEditor();
        // now extract the file
        View notationElement = getNotationElement(diagramEditor);
        if (notationElement == null) {
            return null;
        }
        // View notationElement = ((View) ((DiagramEditor) diagramEditor).getDiagramEditPart()
        // .getModel());
        EObject myModel = (EObject) notationElement.getElement();

        return myModel.eResource().getResourceSet();
    }

    // -------------------------------------------------------------------------

    public URL resolveBundelFile(String relativePath) {
        Bundle bundle = Platform.getBundle(DataComponentPlugin.PLUGIN_ID);
        if (!BundleUtility.isReady(bundle)) {
            return null;
        }
        URL fullPathString = BundleUtility.find(bundle, relativePath);
        return fullPathString;
    }

    // -------------------------------------------------------------------------

    private final boolean performModelTransformation() throws KiemInitializationException {
        transformationCompleted = false;
        transformationError = false;

        Display.getDefault().syncExec(new Runnable() {
            public void run() {

                final Maybe<IStatus> status = new Maybe<IStatus>();
                try {
                    PlatformUI.getWorkbench().getProgressService()
                            .run(false, false, new IRunnableWithProgress() {
                                public void run(final IProgressMonitor monitor) {
                                    try {
                                        status.set(model2ModelTransform(new KielerProgressMonitor(
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
            }
        });

        // wait until error or transformation completed
        while (!transformationCompleted && !transformationError) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) { /* hide sleep error */
            }
        }// end while

        if (!transformationError) {
            return false;
        }// end if
        return true;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
     */
    public void initialize() throws KiemInitializationException {
    }

    // -------------------------------------------------------------------------
    
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

    public KiemProperty[] doProvideProperties() {
        return null;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#initializeProperties()
     */
    @Override
    public final KiemProperty[] provideProperties() {
        KiemProperty[] returnProperties;
        KiemProperty[] properties = doProvideProperties();
        if (properties == null) {
            returnProperties = new KiemProperty[1];
            returnProperties[0] = new KiemProperty("Model Editor", new KiemPropertyTypeEditor(), "");
        } else {
            returnProperties = new KiemProperty[1 + properties.length];
            returnProperties[0] = new KiemProperty("Model Editor", new KiemPropertyTypeEditor(), "");
            for (int c = 0; c < properties.length; c++) {
                returnProperties[1 + c] = properties[c];
            }
        }
        return returnProperties;
    }

    // -------------------------------------------------------------------------
    
    private void saveEditor() {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                IEditorSite part = modelEditor.getEditorSite();
                part.getPage().saveEditor((IEditorPart) part.getPart(), false);
                // modelEditor.doSaveAs(); // doSave(new IProgressMonitor());
            }
        });
    }

    // -------------------------------------------------------------------------
    
   int askForModelIsSavedReturnValue = 0;
    
    private boolean askForModelIsSaved() throws KiemPropertyException {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                final Shell shell = Display.getDefault().getShells()[0];
                
                String[] buttons = { "Yes", "No", "Cancel" };

                MessageDialog dlg = new MessageDialog(shell, "Save Execution", null, "'"
                        + modelEditor.getEditorInput().getName() + "' has been modified. Save changes before proceeding?", 
                        MessageDialog.QUESTION,
                        buttons, 0);

                askForModelIsSavedReturnValue = 2;
                try {
                    askForModelIsSavedReturnValue = dlg.open();
                } catch (Exception e) {
                    askForModelIsSavedReturnValue = 2; // implicit CANCEL on exception
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

        modelEditor = this.getInputEditor();

        if (modelEditor == null) {
            throw new KiemPropertyException("There exists no active editor.\n"
                    + "Please ensure that an opened editor is selected and "
                    + "the file name matches.\n\nIf you want the currently active editor to be"
                    + "simulated make sure the (optional) editor property is empty!");
        }

        if (modelEditor.isDirty()) {
            try {
                boolean b = askForModelIsSaved();
                if (b) {
                    saveEditor();
                    modelTimeStamp = this.getInputModelEObject(this.modelEditor).eResource()
                            .getTimeStamp();
                    simulatingOldModelVersion = false;
                } else {
                    simulatingOldModelVersion = true;
                    modelTimeStamp = this.getInputModelEObject(this.modelEditor).eResource()
                            .getTimeStamp();
                }
            } catch (KiemPropertyException e) {
                throw e;
            } catch (Exception e) {
                // if dialog cannot be opened, throw error
                throw new KiemPropertyException("There are unsaved changes of the model opened "
                        + "in the editor to simulate.\nYou should save these changes before "
                        + "starting any simulation/execution!");
            }
        } else {
            // not dirty
            EObject eObject = this.getInputModelEObject(this.modelEditor);
            if (eObject != null) {
                modelTimeStamp = eObject.eResource().getTimeStamp();
                simulatingOldModelVersion = false;
            }
            else {
                // if dialog cannot be opened, throw error
                throw new KiemPropertyException("The selected Editor cannot be used for simulation/execution!");
            }
        }
    }

    // -------------------------------------------------------------------------

    protected IEditorPart getEditor(String kiemEditorProperty) {
        if ((kiemEditorProperty == null) || (kiemEditorProperty.length() == 0))
            return null;

        StringTokenizer tokenizer = new StringTokenizer(kiemEditorProperty, " ()");
        if (tokenizer.hasMoreTokens()) {
            String fileString = tokenizer.nextToken();
            String editorString = tokenizer.nextToken();

            IEditorReference[] editorRefs = getActivePage().getEditorReferences();
            for (int i = 0; i < editorRefs.length; i++) {
                if (editorRefs[i].getId().equals(editorString)) {
                    IEditorPart editor = editorRefs[i].getEditor(true);
                    // test if correct file
                    if (fileString.equals(editor.getTitle())) {
                        return (IEditorPart) editor;
                        // rootEditPart = ((DiagramEditor) editor)
                        // .getDiagramEditPart();
                        // break;
                    }
                }
            }
        }
        return null;
    }

}
