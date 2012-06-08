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

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
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
public abstract class KiemAutomatedJUnitTest {

    /**
     * The maximum number of ticks for executing one trace in an ESO file. If this boundary is
     * reached an error will be thrown.
     */
    static final int MAX_NUMBER_OF_TICKS_UNTIL_ERROR = 100;

    /**
     * The delay between consecutive executions is needed for garbage collecting/freeing resources.
     */
    static final long SLEEP_DELAY_BETWEEN_EXECUTIONS = 500;

    /** The Constant DEFAULT_ESO_FILE_EXTENSITION. */
    static final String DEFAULT_ESO_FILE_EXTENSITION = "eso";

    // -------------------------------------------------------------------------

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
     * The id used to separate traces within ESO files is used to count the number of available
     * traces.
     */
    static final String ESO_FILE_RESET_TRACE_ID = "! reset;";

    /**
     * The error signal name to observe the KIEM data pool for potential execution errors detected
     * by KART. This is configurable in the KART data component properties and need to be extracted
     * from the execution file.
     */
    private String errorSignalName = "errorState";

    // -------------------------------------------------------------------------

    /** The kiem plugin single instance. */
    private KiemPlugin kiemPlugin = null;

    /** The ESO files. */
    protected List<IPath> esoFiles = new LinkedList<IPath>();

    /** The corresponding model file for an ESO file. */
    protected HashMap<IPath, IPath> modelFile = new HashMap<IPath, IPath>();

    /** The current model file path. */
    private String modelFilePathString;

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
     * Defines a path in the bundle where the model files, the eso files and the execution files are
     * located.
     * 
     * @return the ESO files
     */
    protected abstract IPath getBundleTestPath();

    // -------------------------------------------------------------------------

    /**
     * Defines the file extension for the model files.
     * 
     * @return the model file extension
     */
    protected abstract String getModelFileExtension();

    // -------------------------------------------------------------------------

    /**
     * Defines the name of the folder in the workspace where links to the bundle files will be
     * created.
     * 
     * @return the temporary workspace folder name
     */
    protected abstract String getTemporaryWorkspaceFolderName();

    // -------------------------------------------------------------------------

    /**
     * Gets the name of the considered KIEM execution scheduling file. Derived test classes should
     * provide the name of the execution file that should be part of the plugin in the
     * BundleTestPath.
     * 
     * @return the plugin execution file
     */
    protected abstract String getExecutionFileName();

    // -------------------------------------------------------------------------

    /**
     * Creates links for all files in the bundles test directory and returns all paths as a list.
     */
    private List<IPath> createLinksForAllTestFiles() {
        List<IPath> allFiles = new LinkedList<IPath>();
        // If the bundle is not ready then there is no image
        final Bundle bundle = Platform.getBundle(this.getPluginId());

        // Search for all files in the test directory
        Enumeration<URL> allBundleFilesURL = bundle.findEntries(
                this.getBundleTestPath().toString(), "*.*", false);
        while (allBundleFilesURL.hasMoreElements()) {
            URL bundleFileURL = allBundleFilesURL.nextElement();
            try {
                IPath fullBundleFilePath = new Path(bundleFileURL.toString());

                IFile workspaceFile = KiemUtil.createLinkedWorkspaceFile(fullBundleFilePath,
                        this.getTemporaryWorkspaceFolderName(), false, true);
                IPath filePath = workspaceFile.getFullPath();
                allFiles.add(filePath);
            } catch (CoreException e) {
                throw new RuntimeException(
                        "Cannot create temporary workspace link for the following bundle file:"
                                + bundleFileURL.toString());
            } catch (MalformedURLException e) {
                throw new RuntimeException(
                        "Cannot create temporary workspace link for the following bundle file:"
                                + bundleFileURL.toString());
            } catch (URISyntaxException e) {
                throw new RuntimeException(
                        "Cannot create temporary workspace link for the following bundle file:"
                                + bundleFileURL.toString());
            } catch (IOException e) {
                throw new RuntimeException(
                        "Cannot create temporary workspace link for the following bundle file:"
                                + bundleFileURL.toString());
            }
        }
        return allFiles;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the path of the execution file if this is found in the files that were copied to the
     * temporary workspace folder.
     * 
     * @param allFiles
     *            the all files
     * @return true, if successful
     */
    private IPath getExecutionFilePath(List<IPath> allWorkspaceFiles) {
        for (IPath workspaceFilePath : allWorkspaceFiles) {
            // If this is a model file search for the corresponding ESO file
            if (workspaceFilePath.toString().endsWith(this.getExecutionFileName())) {
                return workspaceFilePath;
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Fill model and ESO files.
     */
    private void fillModelAndEsoFiles(List<IPath> allFiles) {
        this.esoFiles.clear();
        this.modelFile.clear();

        for (IPath filePath : allFiles) {
            // If this is a model file search for the corresponding ESO file
            if (filePath.getFileExtension().equals(this.getModelFileExtension())) {
                IPath modelFilePath = filePath;
                IPath esoFilePath = modelFilePath.removeFileExtension().addFileExtension(
                        KiemAutomatedJUnitTest.DEFAULT_ESO_FILE_EXTENSITION);

                boolean foundEsoFile = false;
                for (IPath filePath2 : allFiles) {
                    if (filePath2.toString().equals(esoFilePath.toString())) {
                        foundEsoFile = true;
                        break;
                    }
                }
                if (foundEsoFile) {
                    // ESO file was found => add both to their lists
                    this.esoFiles.add(esoFilePath);
                    this.modelFile.put(esoFilePath, modelFilePath);
                }
                // Only a testcase if matching ESO files are found
                // if (!foundEsoFile) {
                // throw new RuntimeException(
                // "ESO file:'"
                // + esoFilePath.toString()
                // +
                // "' can not be found but its corresponding model file was specified to be tested.");
                // }
            }

        }

    }

    // -------------------------------------------------------------------------

    /**
     * This generic test will look for model files in a provided test files folder. If for a model
     * file also an ESO file is found these both serve as a test case. Additionally a valid
     * execution file has to be defined.
     */
    @Test
    public void KiemAutomatedJUnitTestExecution() {
        // if (true) {
        // return;
        // }

        // -----------------------------------------------------------------------------------------
        // Create links in temp workspace and test if valid input (eso files and execution file)

        // First create links to local bundle file in a temporary workspace
        List<IPath> allWorkspaceFiles = createLinksForAllTestFiles();

        // Test if a valid execution file is defined
        if (getExecutionFilePath(allWorkspaceFiles) == null) {
            throw new RuntimeException(
                    "No execution file is defined or the execution file is not found.");
        }

        // Fill esoFiles and modelFile list/hashmap
        fillModelAndEsoFiles(allWorkspaceFiles);

        // Test if ESO files and corresponding model files exist
        if (esoFiles.size() == 0) {
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
        String executionFileString = getExecutionFilePath(allWorkspaceFiles).toString();
        try {
            kiemPlugin.openFile(getExecutionFilePath(allWorkspaceFiles), true);
        } catch (IOException e) {
            fail("Cannot find execution scheduling file '" + executionFileString + "'.");
        }

        // -----------------------------------------------------------------------------------------
        // Initialize the KART data component properties
        DataComponentWrapper kartReplay = getKartReplayComponent();
        DataComponentWrapper kartValidation = getKartValidationComponent();
        KiemProperty traceProperty = getProperty(KART_PROPERTY_TRACNUMBER, kartReplay);
        KiemProperty errorProperty = getProperty(KART_PROPERTY_ERRORVARIABLE, kartValidation);
        KiemProperty stopProperty = getProperty(KART_PROPERTY_STOPONSUCCESS, kartReplay);
        stopProperty.setValue("true"); // not stop execution after ESO file is
                                       // done
        errorSignalName = errorProperty.getValue(); // extract the correct error
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

        for (IPath esoFilePath : esoFiles) {
            // Get the corresponding model file
            IPath modelFilePath = this.modelFile.get(esoFilePath);

            // Try to open it
            //openModelFile(modelFilePath);

            // Set modelFile in execution manager
            // modelFilePath = getWorkspaceFile(modelFilePath).getProjectRelativePath();
            System.out.println("Model File:" + modelFilePath.toString());
            // Set the global model file in KIEM, other components will retrieve this
            KiemPlugin.setCurrentModelFile(modelFilePath);

            int numberOfTraces = getNumberOfTraces(esoFilePath);
            System.out.println("NUMBER OF TRACES " + numberOfTraces);

            for (int traceNumber = 0; traceNumber < numberOfTraces; traceNumber++) {
                System.out.println("traceNumber" + traceNumber);

                // set the current trace number
                traceProperty.setValue(traceNumber + "");
                // now run the execution stepwise until it has stopped

                System.out.println("opening model file A 0");
                pause();
                System.out.println("opening model file A 1");
                if (kiemPlugin.initExecution()) {
                    System.out.println("opening model file A 2");
                    pause();
                    Execution execution = kiemPlugin.getExecution();
                    System.out.println("opening model file A 3");
                    if (execution == null) {
                        throw new RuntimeException(
                                "KIEM cannot start execution. Try to do this manually for the following scheduling file:'"
                                        + executionFileString + "'.");
                    }
                    pause();

                    // at this point we know that the execution is not null
                    int tick = 0;
                    while (execution.isStarted() && !errorFlag) {
                        System.out.println("Tick" + tick);

                        if (tick > MAX_NUMBER_OF_TICKS_UNTIL_ERROR) {
                            throw new RuntimeException("Maximum number of ticks ("
                                    + MAX_NUMBER_OF_TICKS_UNTIL_ERROR + ") reached.");
                        }

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
                                                    + esoFilePath.toString()
                                                    + "' during execution '" + executionFileString
                                                    + "'.";
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
                else {
                    throw new RuntimeException(
                            "KIEM cannot initialize execution. Try to do this manually for the following scheduling file:'"
                                    + executionFileString + "'. Error message: "
                                    + KiemPlugin.getLastError());
                }

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

    private IEditorInput createEditorInput(String fullFilePathString) {
        IPath path = new Path(fullFilePathString);
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IFile workspaceFile = workspace.getRoot().getFile(path);
        if (workspaceFile != null)
            return new FileEditorInput(workspaceFile);
        return null;
    }

    // -------------------------------------------------------------------------

    private String getEditorId(IPath fullFilePath) throws URISyntaxException, IOException {
        URL absoluteFileUrl = KiemUtil.resolveWorkspaceFile(fullFilePath.toString());
        String absoluteFilePathString = KiemUtil.getAbsoluteFilePath(absoluteFileUrl);
        IPath absoluteFilePath = new Path(absoluteFilePathString);
        IFileStore fileStore = EFS.getLocalFileSystem().getStore(absoluteFilePath);
        try {
            IWorkbench workbench = PlatformUI.getWorkbench();
            IEditorRegistry editorRegistry = workbench.getEditorRegistry();
            InputStream inputStream;
            inputStream = fileStore.openInputStream(EFS.NONE, null);
            IContentType contentType = Platform.getContentTypeManager().findContentTypeFor(
                    inputStream, fileStore.getName());
            IEditorDescriptor descriptor = editorRegistry.getDefaultEditor(fileStore.getName(),
                    contentType);

            // check the OS for in-place editor (OLE on Win32)
            if (descriptor == null
                    && editorRegistry.isSystemInPlaceEditorAvailable(fileStore.getName()))
                descriptor = editorRegistry.findEditor(IEditorRegistry.SYSTEM_INPLACE_EDITOR_ID);

            // check the OS for external editor
            if (descriptor == null
                    && editorRegistry.isSystemExternalEditorAvailable(fileStore.getName()))
                descriptor = editorRegistry.findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);

            if (descriptor != null)
                return descriptor.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "org.eclipse.ui.DefaultTextEditor";
    }

    // -------------------------------------------------------------------------

    /**
     * Open model file.
     * 
     * @param modelFilePath2
     *            the model file path2
     * @throws
     */
    void openModelFile(IPath modelFilePath) {
        System.out.println("opening model file");
        this.modelFilePathString = modelFilePath.toString();
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                IPath modelFilePath = new Path(modelFilePathString);

                IWorkbenchWindow win = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                IWorkbenchPage page = win.getActivePage();

                // Get the default editor and the editor ID
                String fileExtension = (modelFilePath).getFileExtension();
                IEditorDescriptor defaultEditor = PlatformUI.getWorkbench().getEditorRegistry()
                        .getDefaultEditor("default." + fileExtension);
                if (defaultEditor == null) {
                    defaultEditor = PlatformUI.getWorkbench().getEditorRegistry()
                            .findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
                }
                try {
                    String editorId = getEditorId(modelFilePath);

                    // Close all other editors
                    page.closeAllEditors(false);

                    // Try to open as workspace file
                    IEditorInput input = createEditorInput(modelFilePathString);
                    if (input.exists()) {
                        // If this exists then directly open it
                        page.openEditor(input, editorId);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

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
    int getNumberOfTraces(IPath esoFilePath) {
        try {
            URL esoFileURL = KiemUtil.resolveBundleOrWorkspaceFile(esoFilePath.toString());
            InputStream inputStream = KiemUtil.openBundleOrWorkspaceFile(esoFileURL,
                    this.getPluginId());
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
            throw new RuntimeException("Cannot load ESO file '" + esoFilePath.toString()
                    + "' in order to count the maximum number of traces.");
        } catch (IOException e) {
            throw new RuntimeException("Cannot load ESO file '" + esoFilePath.toString()
                    + "' in order to count the maximum number of traces.");
        } catch (URISyntaxException e) {
            throw new RuntimeException("Cannot load ESO file '" + esoFilePath.toString()
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
