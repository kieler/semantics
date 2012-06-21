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
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kart.KartConstants;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

/**
 * The class KiemAutomatedJUnit enables the integration of several KIEM execution runs into a JUnit
 * plugin test.
 * 
 * A new test plugin has to have a class C extending KiemAutomatedJUnitTest. The new class C has to
 * have "Test" in its name to be found as a JUnit class by the build system.
 * 
 * Test model files and corresponding (same name by convention!) ESO files must be provided with the
 * bundle implementing the KiemAutomatedJUnitTest abstract class in a bundle directory specified by
 * getBundleTestPath().
 * 
 * The execution file that should be used must exist also in this directory. Its name must be
 * specified by getExecutionFileName().
 * 
 * Model, ESO and the execution file are linked in a temporary workspace folder. The name of this
 * folder in the temporary workspace is defined by getTemporaryWorkspaceFolderName().
 * 
 * ESO file names are derived by model files. Model files are identified by the file extension that
 * is specified by getModelFileExtension(). If a model has no corresponding ESO file it is not
 * considered as a test case.
 * 
 * The maximum number of ticks is defined by 100. Reaching this maximum will generate an error
 * because typical test models should be small (!) and should test specific functionality only.
 * Hence ESO files for such test models should contain only a small number of ticks far below this
 * maximum!
 * 
 * @author cmot
 * 
 */
@RunWith(KiemTestRunner.class)
public abstract class KiemAutomatedJUnitTest {

    // -------------------------------------------------------------------------
    // General Configuration

    /**
     * The maximum number of ticks for executing one trace in an ESO file. If this boundary is
     * reached an error will be thrown.
     */
    static final int MAX_NUMBER_OF_TICKS_UNTIL_ERROR = 100;

    /**
     * The delay between consecutive executions is needed for garbage collecting/freeing resources.
     */
    static final long SLEEP_DELAY_BETWEEN_EXECUTIONS = 1;

    /** The Constant DEFAULT_ESO_FILE_EXTENSITION. */
    static final String DEFAULT_ESO_FILE_EXTENSITION = "eso";

    /** The DEBUG constant. */
    static final boolean DEBUG = false;

    // -------------------------------------------------------------------------
    // ESO file an KART configuration

    /**
     * The id used to separate traces within ESO files is used to count the number of available
     * traces.
     */
    private static final String ESO_FILE_RESET_TRACE_ID = "! reset;";

    /**
     * The error signal name to observe the KIEM data pool for potential execution errors detected
     * by KART. This is configurable in the KART data component properties and need to be extracted
     * from the execution file.
     */
    private static String errorSignalName = KartConstants.DEF_VAL_ERRORSTATE; // "errorState"

    // -------------------------------------------------------------------------
    // Private properties

    /** The kiem plugin single instance. */
    private static KiemPlugin kiemPlugin = null;

    /** The ESO files. */
    private static List<IPath> esoFiles = new LinkedList<IPath>();

    /** The corresponding model file for an ESO file. */
    private static HashMap<IPath, IPath> modelFile = new HashMap<IPath, IPath>();

    // -------------------------------------------------------------------------

    /**
     * The first test flag used to identify the first test and initialize KIEM and all static
     * lists/hashmaps.
     */
    private static boolean firstTestFlag = true;

    /** The current model file path. */
    private static String modelFilePathString = null;

    /** The currently tested ESO file as specified by parameters. */
    private IPath currentEsoFile = null;

    // -------------------------------------------------------------------------

    /**
     * Important for scanning files is the Plugin ID.
     * 
     * @return the plugin id
     */
    protected abstract String getPluginId();

    // -------------------------------------------------------------------------

    /**
     * Defines a path in the bundle where the model files, the ESO files and the execution files are
     * located.
     * 
     * E.g., return new Path("/testdata/");
     * 
     * @return the ESO files
     */
    protected abstract IPath getBundleTestPath();

    // -------------------------------------------------------------------------

    /**
     * Defines the file extension for the model files.
     * 
     * E.g., return "s"
     * 
     * @return the model file extension
     */
    protected abstract String getModelFileExtension();

    // -------------------------------------------------------------------------

    /**
     * Defines the name of the folder in the workspace where links to the bundle files will be
     * created.
     * 
     * E.g., return "temp-s"
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
     * E.g., return "myexecution.execution";
     * 
     * @return the plugin execution file
     */
    protected abstract String getExecutionFileName();

    // -------------------------------------------------------------------------

    /**
     * Gets all ESO files and provides the parameters for the consecutive tests run by the
     * KiemTestRunner.
     * 
     * The objectArray contains exactly ONE entry because the constructor
     * KiemAutomatedJUnitTest(final IPath esoFile) takes ONE parameter value.
     * 
     * @return all ESO files as a hash map
     */
    @Parameters
    public static Collection<Object[]> getEso() {
        LinkedList<Object[]> esoFilesList = new LinkedList<Object[]>();

        for (IPath esoFile : esoFiles) {
            Object[] objectArray = new Object[1];
            objectArray[0] = esoFile;
            esoFilesList.add(objectArray);
        }
        return esoFilesList;
    }

    // -------------------------------------------------------------------------

    /**
     * KIEM Automated JUnit test constructor taking an esoFile to test.
     * 
     * @param esoFile
     *            the eso file
     */
    public KiemAutomatedJUnitTest(final IPath esoFile) {
        super();
        this.currentEsoFile = esoFile;
    }

    // -------------------------------------------------------------------------

    /**
     * Initializes all ESO and model files, initializes KIEM.
     */
    @Before
    public void kiemAutomatedJUnitTestInitialization() {
        // Only initialize for several consecutive tests iff this is the first test,
        // i.e., the static variable firstTest is true; set it to false in this case
        // it will be reset to true in the @AfterClass wrapup method.
        if (!firstTestFlag) {
            // We already initialized KIEM and all static lists, we can
            // safely exit here because re-initialization for EVERY test would
            // result in much overhead!
            return;
        }
        // We are in the first test (of a possible list of severel tests)
        // we need to initialize KIEM, reset the flag so that we initialize KIEm
        // just ONCE for a set of consecutive tests
        firstTestFlag = false;

        // -----------------------------------------------------------------------------------------
        // Create links in temp workspace and test if valid input (eso files and execution file)

        // First create links to local bundle file in a temporary workspace
        List<IPath> allWorkspaceFiles = createLinksForAllTestFiles(getPluginId(),
                getBundleTestPath(), getTemporaryWorkspaceFolderName());

        // Test if a valid execution file is defined
        IPath executionFilePath = getExecutionFilePath(allWorkspaceFiles, getExecutionFileName());
        if (executionFilePath == null) {
            throw new RuntimeException(
                    "No execution file is defined or the execution file is not found.");
        }

        // Fill esoFiles and modelFile list/hashmap
        fillModelAndEsoFiles(allWorkspaceFiles, getModelFileExtension());

        // Test if ESO files and corresponding model files exist
        if (esoFiles.size() == 0) {
            throw new RuntimeException(
                    "No model files are provided and also no model file extension was provided to search"
                            + " for model files in the current workspace. "
                            + "Cannot proceed without model files to test!");
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
        String executionFileString = executionFilePath.toString();
        try {
            kiemPlugin.openFile(executionFilePath, true);
        } catch (IOException e) {
            fail("Cannot find execution scheduling file '" + executionFileString + "'.");
        }

        // -----------------------------------------------------------------------------------------
        // Initialize the KART data component properties
        DataComponentWrapper kartReplay = getKartReplayComponent();
        DataComponentWrapper kartValidation = getKartValidationComponent();
        KiemProperty errorProperty = getProperty(KartConstants.SIGNALVAR, kartValidation);
        KiemProperty stopProperty = getProperty(KartConstants.STOPEXECUTION, kartReplay);
        stopProperty.setValue("true"); // not stop execution after ESO file is
                                       // done
        errorSignalName = errorProperty.getValue(); // extract the correct error
                                                    // signal name to look for
        KiemPlugin.getDefault().setForceNoErrorOutput(true);
    }

    // -------------------------------------------------------------------------

    /**
     * Wraps up KIEM pointer that is stored statically.
     */
    @AfterClass
    public static void kiemAutomatedJUnitTestWrapup() {
        // Clear all static fields
        kiemPlugin = null;
        esoFiles.clear();
        modelFile.clear();
        modelFilePathString = null;
        // Reset important firstTestFlag used to initialize KIEM at the
        // first test of a set of consecutive tests.
        firstTestFlag = true;
    }

    // -------------------------------------------------------------------------

    /**
     * This generic test will look for model files in a provided test files folder. If for a model
     * file also an ESO file is found these both serve as a test case. Additionally a valid
     * execution file has to be defined.
     */
    @Test
    public void kiemAutomatedJUnitTestExecution() {
        // Get the trace property of KART
        DataComponentWrapper kartReplay = getKartReplayComponent();
        KiemProperty traceProperty = getProperty(KartConstants.TRACENUM, kartReplay);

        // -----------------------------------------------------------------------------------------
        // For all ESO files grab the number of executions (separated by
        // reset!), set the
        // validation KART component and play the execution until stop.
        // Continuously monitor the
        // the KART variable/signal for errors and declare success if this stays
        // empty. Otherwise
        // raise a JUNIT error and abort the testing

        // test this ESO file with all its included traces
        // the traceProperty is required to be able to update the trace number
        testEsoFile(currentEsoFile, traceProperty, getExecutionFileName(), getPluginId());
    }

    // -------------------------------------------------------------------------

    /**
     * Test ESO file and return a potential (first) error as a String.
     * 
     * @param esoFilePath
     *            the ESO file path
     * @param traceProperty
     *            the trace property
     * @return a possible error string or null if no error
     */
    private static String testEsoFile(final IPath esoFilePath, final KiemProperty traceProperty,
            final String executionFileName, final String pluginId) {
        boolean errorFlag = false;
        String errorInformation = null;

        // Get the corresponding model file
        IPath modelFilePath = modelFile.get(esoFilePath);

        // Try to open it
        if (!KiemUtil.isHeadlessRun()) {
            openModelFile(modelFilePath);
        }

        // Set modelFile in execution manager
        // modelFilePath = getWorkspaceFile(modelFilePath).getProjectRelativePath();
        // Set the global model file in KIEM, other components will retrieve this
        KiemPlugin.setCurrentModelFile(modelFilePath);
        Logger.getRootLogger().info("\nModel File: " + modelFilePath);
        StatusManager.getManager().addLoggedStatus(
                new Status(Status.ERROR, pluginId, "\nModel File: " + modelFilePath));

        int numberOfTraces = getNumberOfTraces(esoFilePath);

        for (int traceNumber = 0; traceNumber < numberOfTraces; traceNumber++) {
            StatusManager.getManager().addLoggedStatus(
                    new Status(Status.INFO, pluginId, "Trace Number " + traceNumber));

            // set the current trace number
            traceProperty.setValue(traceNumber + "");
            // now run the execution stepwise until it has stopped

            pause();
            if (kiemPlugin.initExecution()) {
                pause();
                Execution execution = kiemPlugin.getExecution();
                if (execution == null) {
                    throw new RuntimeException("KIEM cannot start execution. "
                            + "Try to do this manually for the following scheduling file:'"
                            + executionFileName + "'.");
                }
                pause();

                // at this point we know that the execution is not null
                int tick = 0;
                while (execution.isStarted() && !errorFlag) {
                    StatusManager.getManager().addLoggedStatus(
                            new Status(Status.INFO, pluginId, "Tick " + tick));

                    if (tick > MAX_NUMBER_OF_TICKS_UNTIL_ERROR) {
                        throw new RuntimeException("Maximum number of ticks ("
                                + MAX_NUMBER_OF_TICKS_UNTIL_ERROR + ") reached.");
                    }

                    // remember the pool counter number
                    long poolCounter = execution.getDataPool().getPoolCounter();
                    execution.stepExecutionSync();
                    // wait until step is done
                    while (!execution.isPaused() && execution.isStarted()) {
                        pause();
                    }
                    // now inspect the data pool
                    try {
                        JSONObject jSONData = execution.getDataPool().getData(null, poolCounter);
                        if (DEBUG) {
                            StatusManager.getManager().addLoggedStatus(
                                    new Status(Status.INFO, pluginId, jSONData.toString()));
                        }
                        if (jSONData != null) {

                            // // Evaluate KIEM's getLastError()
                            // if (KiemPlugin.getLastError() != null &&
                            // !KiemPlugin.getLastError().equalsIgnoreCase("")) {
                            // errorFlag = true;
                            // errorInformation = "Error (" + (String) KiemPlugin.getLastError()
                            // + ") in tick " + tick + " of trace " + traceNumber
                            // + " of ESO file '" + esoFilePath.toString()
                            // + "' during execution '"
                            // + this.getExecutionFileName() + "'.";
                            // break;
                            //
                            // }

                            // Evaluate KART-Diff
                            if (jSONData.has(KartConstants.CONFIGVAR)) {
                                Object kartConfigContent = jSONData.get(KartConstants.CONFIGVAR);
                                if (kartConfigContent != null
                                        && kartConfigContent instanceof JSONObject
                                        && ((JSONObject) kartConfigContent)
                                                .has(KartConstants.VAR_EOT)) {
                                    Object kartEOTContent = ((JSONObject) kartConfigContent)
                                            .get(KartConstants.VAR_EOT);
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
                                        execution.stopExecutionSync();
                                        execution.cancel();
                                        while (kiemPlugin.getExecution() != null) {
                                            pause();
                                        }
                                        errorFlag = true;
                                        errorInformation = "Error (" + (String) errorContent
                                                + ") in tick " + tick + " of trace " + traceNumber
                                                + " of ESO file '" + esoFilePath.toString()
                                                + "' during execution '" + executionFileName + "'.";
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

                // If an error occurred tell!
                if (errorFlag) {
                    fail(errorInformation);
                }

            } else {
                throw new RuntimeException("KIEM cannot initialize execution. "
                        + "Try to do this manually for the following scheduling file:'"
                        + executionFileName + "'. Error message: " + KiemPlugin.getLastError());
            }
        } // next trace

        // return a possible error message or null if no error
        return errorInformation;
    }

    // -------------------------------------------------------------------------

    /**
     * Creates links for all files in the bundles test directory and returns all paths as a list.
     * 
     * @param pluginId
     *            the plugin id
     * @param bundleTestPath
     *            the bundle test path
     * @param temporaryWorkspaceFolderName
     *            the temporary workspace folder name
     * @return the list
     */
    private static List<IPath> createLinksForAllTestFiles(final String pluginId,
            final IPath bundleTestPath, final String temporaryWorkspaceFolderName) {
        List<IPath> allFiles = new LinkedList<IPath>();
        // If the bundle is not ready then there is no image
        final Bundle bundle = Platform.getBundle(pluginId);

        // Search for all files in the test directory
        Enumeration<URL> allBundleFilesUrl = bundle.findEntries(bundleTestPath.toString(), "*.*",
                false);
        if (DEBUG) {
            StatusManager.getManager().addLoggedStatus(
                    new Status(Status.INFO, pluginId, "testpath:" + bundleTestPath.toString()));
        }
        while (allBundleFilesUrl.hasMoreElements()) {
            URL bundleFileUrl = allBundleFilesUrl.nextElement();
            try {
                if (DEBUG) {
                    StatusManager.getManager().addLoggedStatus(
                            new Status(Status.INFO, pluginId, "bundleFileUrl:"
                                    + bundleFileUrl.toString()));
                }
                // IPath fullBundleFilePath = new Path(bundleFileURL.toString());

                IFile workspaceFile = KiemUtil.createLinkedWorkspaceFile(bundleFileUrl,
                        temporaryWorkspaceFolderName, false, true);
                if (!workspaceFile.exists()) {
                    throw new RuntimeException(
                            "Cannot create temporary workspace link for the following bundle file (1) :"
                                    + bundleFileUrl.toString());
                }
                IPath filePath = workspaceFile.getFullPath();
                allFiles.add(filePath);
            } catch (CoreException e) {
                throw new RuntimeException(
                        "Cannot create temporary workspace link for the following bundle file (2) :"
                                + bundleFileUrl.toString());
            } catch (MalformedURLException e) {
                throw new RuntimeException(
                        "Cannot create temporary workspace link for the following bundle file (3) :"
                                + bundleFileUrl.toString());
            } catch (URISyntaxException e) {
                throw new RuntimeException(
                        "Cannot create temporary workspace link for the following bundle file (4) :"
                                + bundleFileUrl.toString());
            } catch (IOException e) {
                throw new RuntimeException(
                        "Cannot create temporary workspace link for the following bundle file (5) :"
                                + bundleFileUrl.toString());
            }
        }
        return allFiles;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the path of the execution file if this is found in the files that were copied to the
     * temporary workspace folder.
     * 
     * @param allWorkspaceFiles
     *            the all workspace files
     * @return true, if successful
     */
    private static IPath getExecutionFilePath(final List<IPath> allWorkspaceFiles,
            final String executionFileName) {
        for (IPath workspaceFilePath : allWorkspaceFiles) {
            // If this is a model file search for the corresponding ESO file
            if (workspaceFilePath.toString().endsWith(executionFileName)) {
                return workspaceFilePath;
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Fill model and ESO files list and hash map.
     * 
     * @param allFiles
     *            the all files
     */
    private static void fillModelAndEsoFiles(final List<IPath> allFiles,
            final String modelFileExtension) {
        esoFiles.clear();
        modelFile.clear();

        for (IPath filePath : allFiles) {
            // If this is a model file search for the corresponding ESO file
            if (filePath.getFileExtension().equals(modelFileExtension)) {
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
                    esoFiles.add(esoFilePath);
                    modelFile.put(esoFilePath, modelFilePath);
                }
                // Consider this only a test case if matching ESO files are found.
                // Otherwise this model file is ignored
                //
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
     * A pause instruction for delaying execution.
     */
    private static void pause() {
        try {
            Thread.sleep(SLEEP_DELAY_BETWEEN_EXECUTIONS);
        } catch (InterruptedException e1) {
            // ignore sleeping error
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Creates the editor input for opening model files.
     * 
     * @param fullFilePathString
     *            the full file path string
     * @return the i editor input
     */
    private static IEditorInput createEditorInput(final String fullFilePathString) {
        IPath path = new Path(fullFilePathString);
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IFile workspaceFile = workspace.getRoot().getFile(path);
        if (workspaceFile != null) {
            return new FileEditorInput(workspaceFile);

        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the editor id for opening model files.
     * 
     * @param fullFilePath
     *            the full file path
     * @return the editor id
     * @throws URISyntaxException
     *             the uRI syntax exception
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private static String getEditorId(final IPath fullFilePath) throws URISyntaxException,
            IOException {
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
                    && editorRegistry.isSystemInPlaceEditorAvailable(fileStore.getName())) {
                descriptor = editorRegistry.findEditor(IEditorRegistry.SYSTEM_INPLACE_EDITOR_ID);
            }

            // check the OS for external editor
            if (descriptor == null
                    && editorRegistry.isSystemExternalEditorAvailable(fileStore.getName())) {
                descriptor = editorRegistry.findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
            }

            // otherwise
            if (descriptor != null) {
                return descriptor.getId();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "org.eclipse.ui.DefaultTextEditor";
    }

    // -------------------------------------------------------------------------

    /**
     * Open model file.
     * 
     * @param modelFilePath
     *            the model file path
     */
    private static void openModelFile(final IPath modelFilePath) {
        modelFilePathString = modelFilePath.toString();
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
     * Gets the number of traces of an eso file.
     * 
     * @param esoFilePath
     *            the ESO file path
     * @return the number of traces
     */
    private static int getNumberOfTraces(final IPath esoFilePath) {
        try {
            InputStream inputStream = KiemUtil.openWorkspaceFile(esoFilePath);
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
                    + "' in order to count the maximum number of traces. (FileNotFoundException)");
        } catch (IOException e) {
            throw new RuntimeException("Cannot load ESO file '" + esoFilePath.toString()
                    + "' in order to count the maximum number of traces. (IOException)");
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
    private static KiemProperty getProperty(final String propertyKey,
            final DataComponentWrapper dataComponentWrapper) {
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
    private static DataComponentWrapper getKartReplayComponent() {
        List<DataComponentWrapper> dataComponentWrapperList = kiemPlugin
                .getDataComponentWrapperList();
        for (DataComponentWrapper dataComponentWrapper : dataComponentWrapperList) {
            String dataComponentId = dataComponentWrapper.getDataComponent().getDataComponentId();
            if (dataComponentId.startsWith(KartConstants.KART_REPLAY_DATACOMPONENT_ID_START)) {
                return dataComponentWrapper;
            }
        }
        throw new RuntimeException("KART DataComponent ("
                + KartConstants.KART_REPLAY_DATACOMPONENT_ID_START
                + ") was not loaded. The KART Plugin must be added to the run configuration "
                + "together with all dependend plugins.");
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the KART Validation component.
     * 
     * @return the KART Validation component
     */
    private static DataComponentWrapper getKartValidationComponent() {
        List<DataComponentWrapper> dataComponentWrapperList = kiemPlugin
                .getDataComponentWrapperList();
        for (DataComponentWrapper dataComponentWrapper : dataComponentWrapperList) {
            String dataComponentId = dataComponentWrapper.getDataComponent().getDataComponentId();
            if (dataComponentId.startsWith(KartConstants.KART_VALIDATION_DATACOMPONENT_ID_START)) {
                return dataComponentWrapper;
            }
        }
        throw new RuntimeException("KART DataComponent ("
                + KartConstants.KART_VALIDATION_DATACOMPONENT_ID_START
                + ") was not loaded. The KART Plugin must be added to the run configuration"
                + " together with all dependend plugins.");
    }

    // -------------------------------------------------------------------------

}
