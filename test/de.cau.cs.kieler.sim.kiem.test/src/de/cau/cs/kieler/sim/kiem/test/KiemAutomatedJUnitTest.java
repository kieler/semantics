/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * The class KiemAutomatedJUnit enabled the integration of several KIEM execution runs into a JUNIT
 * plugin test.
 * 
 * Execution schedules may be passed using the -execution="/project/file.exeution" parameter.
 * Typically all ESO files found in all projects of the selected workspace are run.
 * 
 * You should select a model file extension -model=s or select directly some model files use the
 * -model={"/project/file1.s","/project/file2.s"} parameter to select some.
 * 
 * ATTENTION: Be sure to uncheck the run in UI thread option in the run configuration of the JUnit
 * test case ([ ] run in UI thread).
 * 
 * ATTENTION: The Kiem.UI Plugin should not be part of the run configuration because the executions
 * may be too fast done and the Kiem.UI Plugin may get problems handling already closed widgets.
 * 
 * @author cmot
 * 
 */
public class KiemAutomatedJUnitTest {

    /** The Constant EXECUTION_FILE_ARG. */
    static final String EXECUTION_FILE_ARG = "-execution";

    /** The Constant MODEL_FILE_ARG. */
    static final String MODEL_FILE_ARG = "-model";

    /** The plugin id of the required KART plugin. */
    static final String KART_REPLAY_DATACOMPONENT_ID_START = "de.cau.cs.kieler.sim.kart.replay";

    /** The plugin id of the required KART plugin. */
    static final String KART_VALIDATION_DATACOMPONENT_ID_START = "de.cau.cs.kieler.sim.kart.validation";

    /** The Constant KART_KONFIG. */
    static final String KART_KONFIG = "kartConfig";

    /** The Constant KART_END_OF_TRANCE. */
    static final String KART_END_OF_TRANCE = "eot";

    /**
     * The delay between consecutive executions is needed for garbage collecting/freeing resources.
     */
    static final long SLEEP_DELAY_BETWEEN_EXECUTIONS = 500;

    /** The Constant DEFAULT_ESO_FILE_EXTENSITION. */
    static final String DEFAULT_ESO_FILE_EXTENSITION = "eso";

    /**
     * The Constant KART_PROPERTY_ESOFILE - must be equal to the one defined in sim.kart.Constants!
     */
    static final String KART_PROPERTY_ESOFILE = "ESI/ESO trace file";

    /**
     * The Constant KART_PROPERTY_TRACNUMBER - must be equal to the one defined in
     * sim.kart.Constants!
     */
    static final String KART_PROPERTY_TRACNUMBER = "Trace number to replay";

    /**
     * The Constant KART_PROPERTY_ERRORVARIABLE - must be equal to the one defined in
     * sim.kart.Constants!
     */
    static final String KART_PROPERTY_ERRORVARIABLE = "Erroneous signals variable";

    /**
     * The Constant KART_PROPERTY_STOPONSUCCESS - must be equal to the one defined in
     * sim.kart.Constants!
     */
    static final String KART_PROPERTY_STOPONSUCCESS = "Stop execution upon end of ESO file";

    /**
     * The id used to separate traces within eso files is used to count the number of available
     * traces.
     */
    static final String ESO_FILE_RESET_TRACE_ID = "! reset;";

    // -------------------------------------------------------------------------

    /** The kiem plugin sigle instance. */
    private KiemPlugin kiemPlugin = null;

    /**
     * The error signal name to observe the KIEM data pool for potential execution errors detected
     * by KART. This is configurable in the KART data component properties and need to be extracted
     * from the execution file.
     */
    private String errorSignalName = "errorState";

    /** The execution file name. */
    protected String executionFile = "automated.execution";

    /**
     * The model file extension that is used in case no direct model files are provided.
     */
    protected String modelFileExtension = "";

    /** The model file names. */
    protected List<String> modelFiles = new LinkedList<String>();

    /** The eso files. */
    protected List<URL> esoFiles = new LinkedList<URL>();

    /** The corresponding model file for an eso file. */
    protected HashMap<URL, URL> modelFile = new HashMap<URL, URL>();

    /** The current model file path. */
    private String modelFilePath;

    // -------------------------------------------------------------------------

    /**
     * Important for scanning files is the Plugin ID
     * 
     * @return the plugin id
     */
    protected String getPluginId() {
        return KiemTestPlugin.PLUGIN_ID;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets a list of paths of the considered ESO files. Derived test classes should provide a list
     * of ESO files that should be part of the plugin.
     * 
     * @return the ESO files
     */
    protected List<String> getPluginModelFiles() {
        return new LinkedList<String>();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the path to the considered KIEM execution scheduling file. Derived test classes should
     * provide the name of the execution file that should be part of the plugin.
     * 
     * @return the plugin execution file
     */
    protected String getPluginExecutionFile() {
        return "";
    }

    // -------------------------------------------------------------------------

    /**
     * This generic test will look for *.eso files for provided corresponding model files. If there
     * are no provided specific model files it will scan the current workspace for all model files
     * and consider the linked eso files. It will run the models using the automated.execution
     * execution scheduling file by default.
     * 
     * Use -execution="/project/file.exeution" to change the default execution scheduling file. Use
     * -model={"/project/file1.s","/project/file2.s"} to select some model files.
     * 
     * Corresponding eso files will be searched according to the model file names and the default
     * ESO file extension.
     */
    @Test
    public void KiemAutomatedJUnitTestExecution() {
//        if (true) {
//            return;
//        }
        // if the bundle is not ready then there is no image
        Bundle bundle = Platform.getBundle(this.getPluginId());

        // -----------------------------------------------------------------------------------------
        // Inspect program arguments for -execution and -model parameters
        // OR
        // take the implementations of the according methods from derived
        // classes
        boolean executionFileAlreadySet = false;
        boolean modelFilesAlreadySet = false;
        if (!getPluginExecutionFile().equals("")) {
            executionFile =  getPluginExecutionFile();
            executionFileAlreadySet = true;
        }
        if (getPluginModelFiles().size() > 0) {
            modelFiles = getPluginModelFiles();
            modelFilesAlreadySet = true;
        }
        for (String arg : Platform.getApplicationArgs()) {
            if (arg.startsWith(EXECUTION_FILE_ARG) && !executionFileAlreadySet) {
                executionFile = arg.substring(EXECUTION_FILE_ARG.length() + 1, arg.length());
                executionFile = executionFile.replace("\"", "");
            }
            if (arg.startsWith(MODEL_FILE_ARG) && !modelFilesAlreadySet) {
                // if this code is executed twice newer parameters replace older
                // ones
                modelFiles.clear();
                String esoFilesString = arg.substring(MODEL_FILE_ARG.length() + 1, arg.length());
                esoFilesString = esoFilesString.replace("\"", "");
                esoFilesString = esoFilesString.replace("{", "");
                esoFilesString = esoFilesString.replace("}", "");
                String[] esoFilesArray = esoFilesString.split(",");
                // decide whether these are direct model files provided as a
                // parameter
                // or this is a model file extension
                if (esoFilesArray.length == 1 && !esoFilesArray[0].contains(".")
                        && !esoFilesArray[0].contains("/") && !esoFilesArray[0].contains("\\")) {
                    // consider this model file extension and NO specific
                    // provided model files
                    this.modelFileExtension = esoFilesArray[0];
                    if (!modelFileExtension.startsWith(".")) {
                        modelFileExtension = "." + modelFileExtension;
                    }
                } else {
                    // consider specific model files and NO general model file
                    // extension
                    if (esoFilesArray != null && esoFilesArray.length > 0) {
                        for (String esoFileString : esoFilesArray) {
                            modelFiles.add(esoFileString);
                        }
                    }
                }
            }
        }
        // test if a model file extenion is used OR modelFiles > 0
        if (modelFiles.size() == 0 && this.modelFileExtension.equals("")) {
            throw new RuntimeException(
                    "No model files are provided and also no model file extension was provided to search"
                            + " for model files in the current workspace. Cannot proceed without model files to test!");
        }

        // -----------------------------------------------------------
        // Set the KIEM plugin
        kiemPlugin = KiemPlugin.getDefault();
        if (kiemPlugin == null) {
            throw new RuntimeException(
                    "KIEM Plugin is not loaded. Verify that it is added in the run configuration "
                            + "with all its dependend plugins.");
        }

        // -----------------------------------------------------------------------------------------
        // Figure out execution file path and try to load it with KIEM
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        try {
            URL executionFileURL = resolveBundleOrWorkspaceFile(executionFile);
            if (executionFileURL != null) {
                kiemPlugin.openFile(new Path(executionFileURL.toString()), true);
            } else {
                fail("Cannot find execution scheduling file '" + executionFile + "'.");
            }
        } catch (IOException e) {
            fail("Cannot find execution scheduling file '" + executionFile + "'.");
        }

        // -----------------------------------------------------------------------------------------
        // Figure model and eso files of the all projects in the WORKSPACE if no
        // specific
        // parameter was
        if (modelFiles.size() == 0) {
            // find ESO files in the workspace
            IProject[] projects = myWorkspaceRoot.getProjects();
            for (IProject project : projects) {
                try {
                    IResource[] resources = project.members();
                    for (IResource resource : resources) {
                        String modelFileExtension = resource.getFileExtension();
                        // only test model files that end with the model file extension
                        if (("." + modelFileExtension).endsWith(this.modelFileExtension)) {
                            String modelFileName = resource.getFullPath().toString();
                            int replacePosition = modelFileName.lastIndexOf(modelFileExtension);
                            String esoFileName = modelFileName.substring(0, replacePosition)
                                    + DEFAULT_ESO_FILE_EXTENSITION;

                            // test if eso file exists
                            IFile esoFile = myWorkspaceRoot.getFile(new Path(esoFileName));
                            IFile modelFile = myWorkspaceRoot.getFile(new Path(modelFileName));
                            if (esoFile.exists() && modelFile.exists()) {
                                // create mapping and add eso file
                                try {
                                    String esoFileString = myWorkspaceRoot
                                            .getFile(esoFile.getFullPath()).getLocation()
                                            .toString();
                                    String modelFileString = myWorkspaceRoot
                                            .getFile(modelFile.getFullPath()).getLocation()
                                            .toString();
                                    // URL esoFileUrl =
                                    // EFS.getLocalFileSystem().getStore(esoFile.getFullPath()).toURI().toURL();
                                    // URL modelFileUrl =
                                    // EFS.getLocalFileSystem().getStore(modelFile.getFullPath()).toURI().toURL();
                                    URL esoFileUrl = new URI("file://" + esoFileString).toURL();
                                    URL modelFileUrl = new URI("file://" + modelFileString).toURL();
                                    this.modelFile.put(esoFileUrl, modelFileUrl);
                                    this.esoFiles.add(esoFileUrl);
                                } catch (MalformedURLException e) {
                                    e.printStackTrace();
                                } catch (URISyntaxException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                } catch (CoreException e) {
                    // ignore
                }
            }
        } else {
            // if model files are given then try to find corresponding eso
            // files and add both
            for (String modelFileName : modelFiles) {
                URL modelFileUrl = resolveBundleOrWorkspaceFile(modelFileName);
                if (modelFileUrl == null) {
                    throw new RuntimeException("Model file:'" + modelFileName
                            + "' can not be found but was specified to be tested.");
                }
                // can we finde an eso file for it?
                int replacePosition = modelFileName.lastIndexOf(".");
                String esoFileName = modelFileName.substring(0, replacePosition) + "."
                        + DEFAULT_ESO_FILE_EXTENSITION;
                URL esoFileUrl = resolveBundleOrWorkspaceFile(esoFileName);
                if (esoFileUrl == null) {
                    throw new RuntimeException(
                            "Eso file:'"
                                    + esoFileName
                                    + "' can not be found but its corresponding model file was specified to be tested.");
                }
                // if we got here then we can add both to be tested
                this.modelFile.put(esoFileUrl, modelFileUrl);
                this.esoFiles.add(esoFileUrl);
            }
        }

        // -----------------------------------------------------------------------------------------
        // Initialize the KART data component properties
        DataComponentWrapper kartReplay = getKartReplayComponent();
        DataComponentWrapper kartValidation = getKartValidationComponent();
        KiemProperty fileProperty = getProperty(KART_PROPERTY_ESOFILE, kartReplay);
        KiemProperty traceProperty = getProperty(KART_PROPERTY_TRACNUMBER, kartReplay);
        KiemProperty errorProperty = getProperty(KART_PROPERTY_ERRORVARIABLE, kartValidation);
        KiemProperty stopProperty = getProperty(KART_PROPERTY_STOPONSUCCESS, kartReplay);
        stopProperty.setValue("false"); // not stop execution after eso file is
                                        // done
        errorSignalName = errorProperty.getValue(); // extract the corrct error
                                                    // signal name to look for
        KiemPlugin.getDefault().setForceNoErrorOutput(true);

        // -----------------------------------------------------------------------------------------
        // For all ESO files grab the number of executions (separated by
        // reset!), set the
        // validation KART component and play the execution until stop.
        // Continuously monitor the
        // the KART variable/signal for errors and declare success if this stays
        // empty. Otherwise
        // raise a JUNIT error and abort the testing

        boolean errorFlag = false;
        String errorInformation = "";

        for (URL esoFileUrl : esoFiles) {
            // IPath esoFilePath = new Path(esoFileString);
            // IFile esoFile = myWorkspaceRoot.getFile(esoFilePath);
            // String esoFileAbsolute = getAbsoluteFilePath(esoFile);

            // set the correct eso file
            // fileProperty.setValue(esoFileAbsolute);
            fileProperty.setValue(esoFileUrl.toString());

            // open the according model file
            // modelFilePath =
            // esoFilePath.removeFileExtension().addFileExtension(
            // modelFileExtension);

            URL modelFileUrl = this.modelFile.get(esoFileUrl);
            openModelFile(modelFileUrl);

            System.out.println("Model File" + modelFilePath.toString());

            int numberOfTraces = getNumberOfTraces(esoFileUrl);
            System.out.println("NUMBER OF TRACES " + numberOfTraces);

            for (int traceNumber = 0; traceNumber < numberOfTraces; traceNumber++) {
                System.out.println("traceNumber" + traceNumber);

                // set the current trace number
                traceProperty.setValue(traceNumber + "");
                // now run the execution stepwise until it has stopped

                if (kiemPlugin.initExecution()) {
                    Execution execution = kiemPlugin.getExecution();
                    if (execution == null) {
                        throw new RuntimeException(
                                "KIEM cannot start execution. Try to do this manually for the following scheduling file:'"
                                        + executionFile + "'.");
                    }
                    pause();

                    // at this point we know that the execution is not null
                    int tick = 0;
                    while (execution.isStarted() && !errorFlag) {
                        System.out.println("Tick" + tick);

                        // remember the pool counter number
                        long poolCounter = execution.getDataPool().getPoolCounter();
                        execution.stepExecutionSync();
                        // wait until step is done
                        while (!execution.isPaused() && execution.isStarted()) {
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                // ignore sleeping errors
                            }
                        }
                        // now inspect the data pool
                        try {
                            JSONObject jSONData = execution.getDataPool()
                                    .getData(null, poolCounter);
                            System.out.println(jSONData.toString());
                            if (jSONData != null) {
                                if (jSONData.has(KART_KONFIG)) {
                                    Object kartConfigContent = jSONData.get(KART_KONFIG);
                                    if (kartConfigContent instanceof JSONObject
                                            && ((JSONObject) kartConfigContent)
                                                    .has(KART_END_OF_TRANCE)) {
                                        Object kartEOTContent = ((JSONObject) kartConfigContent)
                                                .get(KART_END_OF_TRANCE);
                                        if (kartEOTContent instanceof Boolean) {
                                            if (((Boolean) kartEOTContent)) {
                                                // !!! EOT DETECTED !!! //
                                                execution.stopExecutionSync();
                                                execution.cancel();
                                                while (kiemPlugin.getExecution() != null) {
                                                    pause();
                                                }
                                            }
                                        }
                                    }
                                }
                                if (jSONData.has(errorSignalName)) {
                                    Object errorContent = jSONData.get(errorSignalName);
                                    if (errorContent instanceof String) {
                                        if (!((String) errorContent).equals("")) {
                                            // !!! ERRROR DETECTED !!! //
                                            // execution.stopExecutionSync();
                                            errorFlag = true;
                                            errorInformation = "Error (" + (String) errorContent
                                                    + ") in tick " + tick + " of trace "
                                                    + traceNumber + " of ESO file '"
                                                    + esoFileUrl.getFile() + "' during execution '"
                                                    + executionFile + "'.";
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        tick++;
                    } // while executing
                } // init execution

                // if an error occurred, do not proceed with the next trace!
                if (errorFlag) {
                    break;
                }
            } // next trace

            // if an error occurred, do not proceed with the next eso file!
            if (errorFlag) {
                break;
            }
        } // next eso file

        // -----------------------------------------------------------------------------------------
        // if an error occurred than print it out
        if (errorFlag) {
            fail(errorInformation);
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Pause.
     */
    void pause() {
        try {
            Thread.sleep(SLEEP_DELAY_BETWEEN_EXECUTIONS);
        } catch (InterruptedException e1) {
            // irgnore sleeping error
        }
    }

    // -------------------------------------------------------------------------

    private IFile getWorkspaceFile(IFileStore fileStore) {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IFile[] files = workspace.getRoot().findFilesForLocationURI(fileStore.toURI());
        // files= filterNonExistentFiles(files);
        if (files == null || files.length == 0)
            return null;
        if (files.length == 1)
            return files[0];
        return (IFile) files[0];
    }

    private IEditorInput createEditorInput(IFileStore fileStore) {
        IFile workspaceFile = getWorkspaceFile(fileStore);
        if (workspaceFile != null)
            return new FileEditorInput(workspaceFile);
        return null;// new JavaFileEditorInput(fileStore);
    }

    private String getEditorId(IFileStore file) {
        try {
            IWorkbench workbench = PlatformUI.getWorkbench();
            IEditorRegistry editorRegistry = workbench.getEditorRegistry();
            InputStream inputStream;
            inputStream = file.openInputStream(EFS.NONE, null);
            IContentType contentType = Platform.getContentTypeManager().findContentTypeFor(
                    inputStream, file.getName());
            IEditorDescriptor descriptor = editorRegistry.getDefaultEditor(file.getName(),
                    contentType);

            // check the OS for in-place editor (OLE on Win32)
            if (descriptor == null && editorRegistry.isSystemInPlaceEditorAvailable(file.getName()))
                descriptor = editorRegistry.findEditor(IEditorRegistry.SYSTEM_INPLACE_EDITOR_ID);

            // check the OS for external editor
            if (descriptor == null
                    && editorRegistry.isSystemExternalEditorAvailable(file.getName()))
                descriptor = editorRegistry.findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);

            if (descriptor != null)
                return descriptor.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "org.eclipse.ui.DefaultTextEditor";
    }

    // -------------------------------------------------------------------------

    URL resolveBundleOrWorkspaceFile(String fileLocation) {
        // if the bundle is not ready then there is no image
        final Bundle bundle = Platform.getBundle(this.getPluginId());

        URL fileURL = null;
        if (fileLocation.contains("bundleentry")) {
            // already resolved bundle file
            try {
                fileURL = new URI(fileLocation).toURL();
            } catch (Exception e) {
                // ignore errors
            }
        } else {
            // first try to resolve bundle files (give preference to bundle files)
            fileURL = org.eclipse.core.runtime.FileLocator.find(bundle, new Path(fileLocation),
                    null);
            // then try to resolve workspace files
            if (fileURL == null) {
                fileURL = bundle.getResource(fileLocation);
            }
        }
        return fileURL;
    }

    // -------------------------------------------------------------------------

    /**
     * Open model file.
     * 
     * @param modelFilePath2
     *            the model file path2
     */
    void openModelFile(URL modelFileUrl) {
        this.modelFilePath = KiemUtil.getAbsoluteFilePath(modelFileUrl);
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {

                IWorkbenchWindow win = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                IWorkbenchPage page = win.getActivePage();

                IPath modelFilePath2 = new Path(modelFilePath);

                IEditorDescriptor defaultEditor = PlatformUI.getWorkbench().getEditorRegistry()
                        .getDefaultEditor("default." + modelFilePath2.getFileExtension());

                if (defaultEditor == null) {
                    defaultEditor = PlatformUI.getWorkbench().getEditorRegistry()
                            .findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
                }

                IFileStore fileStore = EFS.getLocalFileSystem().getStore(modelFilePath2);
                // fileStore = fileStore.getChild(names[i]);
                if (!fileStore.fetchInfo().isDirectory() && fileStore.fetchInfo().exists()) {
                    IEditorInput input = createEditorInput(fileStore);
                    String editorId = getEditorId(fileStore);
                    try {
                        page.openEditor(input, editorId);
                    } catch (Exception e) {
                        // bla
                    }

                }

                // try {
                // page.openEditor(FileEditorInput(modelFilePath2),
                // defaultEditor.getId());
                // } catch (PartInitException exception) {
                // }
                //
                // IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
                // .getRoot();
                //
                //
                // IFile modelFile = myWorkspaceRoot.getFile(modelFilePath);
                // IFile file = myWorkspaceRoot.getFile(path);
                //
                // IPath fullPath = file.getLocation();
                // String modelFileString = (myWorkspaceRoot.getFile(modelFilePath)).getLocation();
                //
                // // only open the model file iff it exists (in the workspace)
                // // otherwise do not open it
                // if (modelFile.exists()) {
                // IEditorDescriptor defaultEditor = PlatformUI.getWorkbench()
                // .getEditorRegistry()
                // .getDefaultEditor(modelFile.getName());
                //
                // if (defaultEditor == null) {
                // defaultEditor = PlatformUI
                // .getWorkbench()
                // .getEditorRegistry()
                // .findEditor(
                // IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
                // }
                // try {
                // page.openEditor(new FileEditorInput(modelFilePath),
                // defaultEditor.getId());
                // } catch (PartInitException e) {
                //
                // }
                // }

            }
        });

    }

    // -------------------------------------------------------------------------
    
    /**
     * Gets the number of traces.
     * 
     * @param esoFileAbsolute
     *            the eso file absolute
     * @return the number of traces
     */
    int getNumberOfTraces(URL esoFileAbsolute) {
        try {
            InputStream inputStream = KiemUtil.openBundleOrWorkspaceFile(esoFileAbsolute, this.getPluginId());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            int number = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(ESO_FILE_RESET_TRACE_ID)) {
                    number++;
                }
            }
            bufferedReader.close();
            inputStream.close();
            return number;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Cannot load ESO file '" + esoFileAbsolute
                    + "' in order to count the maximum number of traces.");
        } catch (IOException e) {
            throw new RuntimeException("Cannot load ESO file '" + esoFileAbsolute
                    + "' in order to count the maximum number of traces.");
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the property.
     * 
     * @param propertyKey
     *            the property key
     * @param dataComponentWrapper
     *            the data component wrapper
     * @return the property
     */
    KiemProperty getProperty(String propertyKey, DataComponentWrapper dataComponentWrapper) {
        KiemProperty[] kiemProperties = dataComponentWrapper.getProperties();
        for (KiemProperty kiemProperty : kiemProperties) {
            if (kiemProperty.getKey().equals(propertyKey)) {
                return kiemProperty;
            }
        }
        throw new RuntimeException(
                "This is most likely a KIELER internal programming error. KART Property ("
                        + propertyKey
                        + ") was not found. Maybe the property name has changed in the KART"
                        + " plugin? This is name binded and must be consistent.");
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the KART Replay component.
     * 
     * @return the KART Replay component
     */
    DataComponentWrapper getKartReplayComponent() {
        List<DataComponentWrapper> dataComponentWrapperList = kiemPlugin
                .getDataComponentWrapperList();
        for (DataComponentWrapper dataComponentWrapper : dataComponentWrapperList) {
            String dataComponentId = dataComponentWrapper.getDataComponent().getDataComponentId();
            if (dataComponentId.startsWith(KART_REPLAY_DATACOMPONENT_ID_START)) {
                return dataComponentWrapper;
            }
        }
        throw new RuntimeException("KART DataComponent (" + KART_REPLAY_DATACOMPONENT_ID_START
                + ") was not loaded. The KART Plugin must be added to the run configuration "
                + "together with all dependend plugins.");
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the KART Validation component.
     * 
     * @return the KART Validation component
     */
    DataComponentWrapper getKartValidationComponent() {
        List<DataComponentWrapper> dataComponentWrapperList = kiemPlugin
                .getDataComponentWrapperList();
        for (DataComponentWrapper dataComponentWrapper : dataComponentWrapperList) {
            String dataComponentId = dataComponentWrapper.getDataComponent().getDataComponentId();
            if (dataComponentId.startsWith(KART_VALIDATION_DATACOMPONENT_ID_START)) {
                return dataComponentWrapper;
            }
        }
        throw new RuntimeException("KART DataComponent (" + KART_VALIDATION_DATACOMPONENT_ID_START
                + ") was not loaded. The KART Plugin must be added to the run configuration"
                + " together with all dependend plugins.");
    }

    // -------------------------------------------------------------------------

}
