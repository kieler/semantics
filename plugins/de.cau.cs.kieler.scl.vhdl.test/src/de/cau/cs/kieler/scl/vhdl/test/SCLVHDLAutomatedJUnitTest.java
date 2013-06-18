/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.vhdl.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.eso.coreeso.xtend.ESO2CoreESO;
import de.cau.cs.kieler.eso.vhdl.xtend.ESO2VHDL;
import de.cau.cs.kieler.scl.scl.Program;
import de.cau.cs.kieler.scl.vhdl.xtend.SCL2VHDL;
import de.cau.cs.kieler.sim.eso.eso.tracelist;
//import org.apache.log4j.Level;
//import org.apache.log4j.Logger;
//import org.eclipse.core.filesystem.EFS;
//import org.eclipse.core.filesystem.IFileStore;
//import org.eclipse.ui.part.FileEditorInput;
//import de.cau.cs.kieler.sim.kart.KartConstants;
//import de.cau.cs.kieler.sim.kart.KartPlugin;
//import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;
//import de.cau.cs.kieler.vhdl.test.VHDLTestRunner;
//import de.cau.cs.kieler.scl.vhdl.VHDLGenerator;
//import de.cau.cs.kieler.vhdl.test.VHDLTestRunner;
//import de.cau.cs.kieler.scl.scl.Program;
/**
 * @author gjo
 *
 */
@RunWith(VHDLTestRunner.class)
public  class SCLVHDLAutomatedJUnitTest {

  
    // -------------------------------------------------------------------------
    // General Configuration

    /** The Constant DEFAULT_ESO_FILE_EXTENSITION. */
    static final String DEFAULT_ESO_FILE_EXTENSITION = "eso";

    // -------------------------------------------------------------------------
    // Private properties

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
    
    /** If in strict mode, require an ESO file for all model files and raise an error otherwise. */
    public static final boolean STRICT_MODE_REQUIRE_ESO_FOR_ALL_MODEL_FILES = false;
    
    private static int SIMULATION_TICK_TIME = 100;
    
    private static String CMD_FILE_NAME = "my.cmd";
    
    private static String PRJ_FILE_NAME = "my.prj";
    
    private static String BATCH_FILE_NAME = "exec.sh";
    
    private static String SIMULATION_LOG_FILE_NAME = "sim_out.log";

    // -------------------------------------------------------------------------
    
    /**
     * @param clazz
     * @throws Throwable
     */
    public SCLVHDLAutomatedJUnitTest(final IPath esoFile) throws Throwable {
        super();
        
        this.currentEsoFile = esoFile;
       // this.currentModelFile = modelFile;
        
        // TODO Auto-generated constructor stub
    }
    
    // -------------------------------------------------------------------------

    /**
     * Important for scanning files is the Plugin ID.
     * 
     * @return the plugin id
     */
    private  String getPluginId(){
        return "de.cau.cs.kieler.scl.vhdl.test";
    }

    // -------------------------------------------------------------------------

    /**
     * Defines a path in the bundle where the model files, the ESO files and the execution files are
     * located.
     * 
     * E.g., return new Path("/testdata/");
     * 
     * @return the ESO files
     */
    private IPath getBundleTestPath(){
        return new Path("testdata");
    }

    // -------------------------------------------------------------------------

    /**
     * Defines the file extension for the model files.
     * 
     * E.g., return "s"
     * 
     * @return the model file extension
     */
    private String getModelFileExtension(){
        return "scl";
    }

    // -------------------------------------------------------------------------

    /**
     * Defines the name of the folder in the workspace where links to the bundle files will be
     * created.
     * 
     * E.g., return "temp-s"
     * 
     * @return the temporary workspace folder name
     */
    private String getTemporaryWorkspaceFolderName(){
        return "test-scl";
    }

    // -------------------------------------------------------------------------

//    /**
//     * Gets the name of the considered KIEM execution scheduling file. Derived test classes should
//     * provide the name of the execution file that should be part of the plugin in the
//     * BundleTestPath.
//     * 
//     * E.g., return "myexecution.execution";
//     * 
//     * @return the plugin execution file
//     */
//   private String getExecutionFileName(){
//       return "";     //still missing, needed?
//   }

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
    public static Collection<Object[]> getEsoAndModelFiles() {
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
     * Initializes all ESO and model files, initializes KIEM. @BeforeClass can only be used with
     * static methods so we used @Before and add an extra flag that guards against multiple
     * initializations. The @Before became irrelevant because the initialization is called
     * anyway from the KiemRunner.
     */
//    @BeforeClass
    public void SCLVHDLTestRunnerInitialization() {
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

        // Fill esoFiles and modelFile list/hashmap
        fillModelAndEsoFiles(allWorkspaceFiles, getModelFileExtension());

        // Test if ESO files and corresponding model files exist
        if (esoFiles.size() == 0) {
            throw new RuntimeException(
                    "No model files are provided and also no model file extension was provided to search"
                            + " for model files in the current workspace. "
                            + "Cannot proceed without model files to test!");
        }

//        // -----------------------------------------------------------
//        // Set the KIEM plugin
//        kiemPlugin = KiemPlugin.getDefault();
//        if (kiemPlugin == null) {
//            throw new RuntimeException(
//                    "KIEM Plugin is not loaded. Verify that it is added in the run configuration "
//                            + "with all its dependend plugins.");
//        }
//
//        // -----------------------------------------------------------------------------------------
//        // Figure out execution file path and try to load it with KIEM
//        String executionFileString = executionFilePath.toString();
//        try {
//            kiemPlugin.openFile(executionFilePath, true);
//        } catch (IOException e) {
//            fail("Cannot find execution scheduling file '" + executionFileString + "'.");
//        }
//
//        // -----------------------------------------------------------------------------------------
//        // Initialize the KART data component properties
//        DataComponentWrapper kartReplay = getKartReplayComponent();
//        DataComponentWrapper kartValidation = getKartValidationComponent();
//        KiemProperty errorProperty = getProperty(KartConstants.SIGNALVAR, kartValidation);
//        KiemProperty stopProperty = getProperty(KartConstants.AUTOMATIC, kartReplay);
//        stopProperty.setValue("true"); // not stop execution after ESO file is
//                                       // done
//        errorSignalName = errorProperty.getValue(); // extract the correct error
//                                                    // signal name to look for
//        KiemPlugin.getDefault().setForceNoErrorOutput(true);
    }

    // -------------------------------------------------------------------------

    /**
     * Wraps up KIEM pointer that is stored statically.
     */
    @AfterClass
    public static void SCLVHDLTestRunnerWrapup() {
        // Clear all static fields
//        kiemPlugin = null;
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
     * @throws IOException 
     * @throws InterruptedException 
     */
    @Test
    public void SCLVHDLTestRunnerExecution() throws IOException, InterruptedException {
        
       //SCLVHDLTestRunnerInitialization();
        
        IPath modelFilePath = modelFile.get(currentEsoFile);
         
        EObject sclModel = ModelUtil.loadEObjectFromModelFile(modelFilePath);
        EObject esoModel = ModelUtil.loadEObjectFromModelFile(currentEsoFile);
             
        CharSequence transformedSCL2VHDL = (new SCL2VHDL().transform((Program)sclModel));
        IPath vhdlPath = modelFilePath.removeFileExtension().addFileExtension("vhd");
        createWorkspaceFile(vhdlPath, transformedSCL2VHDL.toString());
        
        tracelist transformedEso2CoreEso = (new ESO2CoreESO().transformESO2CoreESO((tracelist) esoModel));
        CharSequence transformedCoreESO2VHDLTB = (new ESO2VHDL().transformESO2VHDL(transformedEso2CoreEso,modelFilePath.toFile()));
        IPath tbPath = new Path(currentEsoFile.removeFileExtension().toString() + "_tb.vhd");
        createWorkspaceFile(tbPath, transformedCoreESO2VHDLTB.toString());
           
        LinkedList<String> allVhdlFiles = new LinkedList<String>();
        allVhdlFiles.add(vhdlPath.lastSegment());
        allVhdlFiles.add(tbPath.lastSegment());
        String prjFileContent = createPRJFile(allVhdlFiles);
        IPath prjPath = new Path(currentEsoFile.removeLastSegments(1).addTrailingSeparator().toString().concat(PRJ_FILE_NAME));
        createWorkspaceFile(prjPath, prjFileContent);
           
        String cmdFileContent = createCMDFile(currentEsoFile);
        IPath cmdPath = new Path(currentEsoFile.removeLastSegments(1).addTrailingSeparator().toString().concat(CMD_FILE_NAME));
        createWorkspaceFile(cmdPath, cmdFileContent);
            
        String batchFileContent = createBatchFile(currentEsoFile.removeFileExtension().lastSegment());
        IPath batchPath = new Path(currentEsoFile.removeLastSegments(1).addTrailingSeparator().toString().concat(BATCH_FILE_NAME));
        createWorkspaceFile(batchPath, batchFileContent);
            
        // Execute Batch
          
        String userhome = System.getProperty("user.home");
        String path = userhome + File.separator + "junit-workspace" + File.separator + "test-scl";
        String cmd = "exec.sh";
        
        ProcessBuilder pb = new ProcessBuilder("sh", path + File.separator + cmd);
        pb.directory(new java.io.File(path));
        Process p = pb.start();
        p.waitFor();              

        //_--------------
        
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
       
        IPath logFilePath = root.getFullPath().append(getTemporaryWorkspaceFolderName()).append(SIMULATION_LOG_FILE_NAME);
         
        InputStream inStream = ModelUtil.openWorkspaceFile(logFilePath);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
        String lineIn;
        boolean errorFlag = false;
        
        while ((lineIn = br.readLine()) != null) {
            if(lineIn.contains("ERROR")){
                errorFlag = true;
                break;
            }
        }
        br.close();
   
        Assert.assertEquals(errorFlag , false);
        File temp = new File(path);
//        System.out.println(" Files deleted: " + ModelUtil.deleteFolder(temp));
    }

    /**
     * @param os
     * @param string
     * @throws IOException 
     */
    private void createWorkspaceFile(IPath path, String fileContent) throws IOException {
        
        OutputStream os = ModelUtil.createWorkspaceFile(path);
        
        for(int i = 0; i < fileContent.length(); i++){
            os.write(fileContent.charAt(i));
        }
        os.flush();
        os.close();
    }

    // -------------------------------------------------------------------------
    
    /**
     * @param prjFilename
     * @param cmdFilename
     * @return
     * @throws FileNotFoundException 
     */
    private String createBatchFile(String testbenchFilenameWoExtension) throws FileNotFoundException {
        
        //entityname is the same name as testbench filename (convention)
        
        String batchFileContent = "";
        
        batchFileContent += ""
                         +  "ise_path=\"/C/Xilinx/14.5/ISE_DS/ISE/\"\n"
                         +  "project=\"" + PRJ_FILE_NAME + "\"\n"
                         +  "toplevelEntitys=\"" + testbenchFilenameWoExtension + "_tb" + "\"\n"
                         +  "simulation_tcl=\"" + CMD_FILE_NAME + "\"\n"
                         +  "\n"
                         +  "export PLATFORM=nt" + "\n"
                         +  "export XILINX=$ise_path" + "\n"
                         +  "export PATH=$PATH:$XILINX/bin/$PLATFORM" + "\n"
                         +  "export LD_LIBRARY_PATH=$XILINX/lib/$PLATFORM" + "\n"
                         +  "\n"
                         +  "compile_params=\"-intstyle silent -incremental -o tb_abo_seq_isim_beh -prj \"$project" + "\n"
                         +  "sim_params=\"-intstyle silent -tclbatch \"$simulation_tcl\" -log sim_out.log -sdfnowarn\"" + "\n"
                         +  "binary=\"tb_isim_beh\"" + "\n"
                         +  "tmp_out=\"" + SIMULATION_LOG_FILE_NAME + "\"" + "\n"
                         +  "\n"
                         
                         +  "for file in `echo $toplevelEntitys`" + "\n"
                         +  "do" + "\n"
                         +  "   fuse $compile_params $file" + "\n"
                         +  "   \"./\"$binary\".exe\" $sim_params" + "\n"
                         +  "#   echo -n $file\"   \" >> $tmp_out" + "\n"
                         +  "   echo -e out.log | cat out.log | grep 'Error:' | sed 's/at.*ps: //' >> $tmp_out" + "\n"
                         +  "done" + "\n"
                         +  "\n" 
                         
                         +  "# tests failed if a 0 is written, so omit all '1's" + "\n"
                         +  "#fails=$(grep \"Error\" $tmp_out)" + "\n"
                         +  "#\n" + "\n"
                         
                         +  "# print results" + "\n"
                         +  "#if [ -n \"$fails\" ]" + "\n"
                         +  "#then" + "\n"
                         +  "#   echo \"Following tests failed ...\"" + "\n"
                         +  "#   echo -e $fails" + "\n"
                         +  "#else" + "\n"
                         +  "#   echo \"All tests successful ...\"" + "\n"
                         +  "#fi" + "\n"
                         +  "#\n" + "\n" 
                         
                         +  "# rm $tmp_out "
                         +  "\n"; 
        
//        path = writeStringToFile(batchFileContent, BATCH_FILE_NAME);
        
        return batchFileContent;
    }

    // -------------------------------------------------------------------------
    
    /**
     * @param eso
     * @return
     * @throws IOException 
     */
    private String createCMDFile(IPath eso) throws IOException {
        
        String fileContent = "";
        int resetCounter = 0;
        int tickCounter = 0;
        
        //String esofile = eso.toFile().toString();
        
        //Calculate Simulation time,
        //every output in the eso file correspondents to a tick
        //every reset in the eso file needs a tick in the testbench
        //and append some offset
        
        String pluginID = "de.cau.cs.kieler.de.sch.vhdl.test";
        
        InputStream is = ModelUtil.openBundleOrWorkspaceFile(eso,pluginID);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String lineIn;
        
        //Problem!: Grammer allows you to write !reset; and %Output: over more than one line
        // and or with whitespaces. Or the whole eso in one line -> not all resets and output were seen
        // RegExp didnt solve the Problem -> you need the eso file in one line but if there are 10 resets
        // only one would recognized
        while ((lineIn = br.readLine()) != null) {
         
            //finds &Output: ([\\s]*)%([\\s]*(Output))([\\s]*[:]*)
            if (lineIn.contains("% Output")){
                tickCounter++;
            }
            //finds !reset; ([\\s]*)!([\\s]*(reset))([\\s]*[;]*)
            if (lineIn.contains("!reset ;")) {
                resetCounter++;
            }
        }
        
        is.close();
        br.close();
        
        int simulationTime = (tickCounter + resetCounter + 20) * SIMULATION_TICK_TIME;
        
        fileContent = "run " + simulationTime + " ns; \n" +
               "quit";
        
        return fileContent;
    }

    // -------------------------------------------------------------------------

    /**
     * @param allVhdlFiles
     * @return
     * @throws FileNotFoundException 
     */
    private String createPRJFile(LinkedList<String> allVhdlFiles) throws FileNotFoundException {
        
        String prjFileContent = "";
        
        for(String path : allVhdlFiles){
            prjFileContent  += "vhdl work \"" + path + "\"\n";
        }
        
        return prjFileContent;
    }
    
    // -------------------------------------------------------------------------
    
    /**
     * @param file
     * @param string
     * @return
     * @throws FileNotFoundException 
     */
    private String writeStringToFile(String fileContent, String filename) throws FileNotFoundException {
        
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
       
        IPath tempFolderPath = root.getFullPath().append(getTemporaryWorkspaceFolderName());
        
        String filepath = tempFolderPath.toString().concat(filename);
        
        PrintWriter out = new PrintWriter(filepath);
        
        out.print(fileContent);

        out.close();
        
        return filepath;
        
        //-----
//        File file = new File(filename);
//        FileWriter writer = null;
//              
//        try {
//            writer = new FileWriter(file);
//            
//            writer.write(fileContent);
//        } catch (IOException e) {
//            e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
//        } finally {
//            if (writer != null) try { writer.close(); } catch (IOException ignore) {}
//        }
//        
//        System.out.printf("File is located at %s%n", file.getAbsolutePath());
//        
//        writer.close();
//        
//        return file.getAbsolutePath();
    }
    
    //-------------------------------------------------------------------------

//    /**
//     * Test ESO file and return a potential (first) error as a String.
//     * 
//     * @param esoFilePath
//     *            the ESO file path
//     * @param traceProperty
//     *            the trace property
//     * @return a possible error string or null if no error
//     */
//    private static String testEsoFile(final IPath esoFilePath, final KiemProperty traceProperty,
//            final String executionFileName, final String pluginId) {
//        boolean errorFlag = false;
//        String errorInformation = null;
//
//        // Get the corresponding model file
//        IPath modelFilePath = modelFile.get(esoFilePath);
//        
//    }

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
        Enumeration<URL> allBundleFilesUrl = bundle.findEntries(bundleTestPath.toString(), "*.*",false);
//        logger.debug("testpath:" + bundleTestPath.toString());
        while (allBundleFilesUrl.hasMoreElements()) {
            URL bundleFileUrl = allBundleFilesUrl.nextElement();
            try {
//                logger.debug("bundleFileUrl:" + bundleFileUrl.toString());

                IFile workspaceFile = ModelUtil.createLinkedWorkspaceFile(bundleFileUrl,
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

//    /**
//     * Gets the path of the execution file if this is found in the files that were copied to the
//     * temporary workspace folder.
//     * 
//     * @param allWorkspaceFiles
//     *            the all workspace files
//     * @param executionFileName
//     *            the execution file name
//     * @return the execution file path
//     */
//    private static IPath getExecutionFilePath(final List<IPath> allWorkspaceFiles,
//            final String executionFileName) {
//        for (IPath workspaceFilePath : allWorkspaceFiles) {
//            // If this is a model file search for the corresponding ESO file
//            if (workspaceFilePath.toString().endsWith(executionFileName)) {
//                return workspaceFilePath;
//            }
//        }
//        return null;
//    }

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
                IPath esoFilePath = modelFilePath.removeFileExtension().addFileExtension(DEFAULT_ESO_FILE_EXTENSITION);

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

                // In the NON-strict mode consider this only a test case if matching ESO files are
                // found. Otherwise this model file is ignored
                // In the strict mode, the above will raise an error.
                if (STRICT_MODE_REQUIRE_ESO_FOR_ALL_MODEL_FILES) {
                    if (!foundEsoFile) {
                        throw new RuntimeException("ESO file:'" + esoFilePath.toString()
                                + "' can not be found but its corresponding model file "
                                + "was specified to be tested.");
                    }
                }
            }

        }

    }

    // -------------------------------------------------------------------------

//    /**
//     * Creates the editor input for opening model files.
//     * 
//     * @param fullFilePathString
//     *            the full file path string
//     * @return the i editor input
//     */
//    private static IEditorInput createEditorInput(final String fullFilePathString) {
//        IPath path = new Path(fullFilePathString);
//        IWorkspace workspace = ResourcesPlugin.getWorkspace();
//        IFile workspaceFile = workspace.getRoot().getFile(path);
//        if (workspaceFile != null) {
//            return new FileEditorInput(workspaceFile);
//
//        }
//        return null;
//    }

    // -------------------------------------------------------------------------

//    /**
//     * Gets the editor id for opening model files.
//     * 
//     * @param fullFilePath
//     *            the full file path
//     * @return the editor id
//     * @throws URISyntaxException
//     *             the uRI syntax exception
//     * @throws IOException
//     *             Signals that an I/O exception has occurred.
//     */
//    private static String getEditorId(final IPath fullFilePath) throws URISyntaxException,
//            IOException {
//        URL absoluteFileUrl = KiemUtil.resolveWorkspaceFile(fullFilePath.toString());
//        String absoluteFilePathString = KiemUtil.getAbsoluteFilePath(absoluteFileUrl);
//        IPath absoluteFilePath = new Path(absoluteFilePathString);
//        IFileStore fileStore = EFS.getLocalFileSystem().getStore(absoluteFilePath);
//        try {
//            IWorkbench workbench = PlatformUI.getWorkbench();
//            IEditorRegistry editorRegistry = workbench.getEditorRegistry();
//            InputStream inputStream;
//            inputStream = fileStore.openInputStream(EFS.NONE, null);
//            IContentType contentType = Platform.getContentTypeManager().findContentTypeFor(
//                    inputStream, fileStore.getName());
//            IEditorDescriptor descriptor = editorRegistry.getDefaultEditor(fileStore.getName(),
//                    contentType);
//
//            // check the OS for in-place editor (OLE on Win32)
//            if (descriptor == null
//                    && editorRegistry.isSystemInPlaceEditorAvailable(fileStore.getName())) {
//                descriptor = editorRegistry.findEditor(IEditorRegistry.SYSTEM_INPLACE_EDITOR_ID);
//            }
//
//            // check the OS for external editor
//            if (descriptor == null
//                    && editorRegistry.isSystemExternalEditorAvailable(fileStore.getName())) {
//                descriptor = editorRegistry.findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
//            }
//
//            // otherwise
//            if (descriptor != null) {
//                return descriptor.getId();
//            }
//        } catch (Exception e) {
//            logger.error(e.getMessage());
//        }
//
//        return "org.eclipse.ui.DefaultTextEditor";
//    }

    // -------------------------------------------------------------------------

//    /**
//     * Open model file.
//     * 
//     * @param modelFilePath
//     *            the model file path
//     */
//    public static void openModelFile(final IPath modelFilePath) {
//        modelFilePathString = modelFilePath.toString();
//        Display.getDefault().asyncExec(new Runnable() {
//            public void run() {
//                IPath modelFilePath = new Path(modelFilePathString);
//
//                IWorkbenchWindow win = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//                IWorkbenchPage page = win.getActivePage();
//
//                // Get the default editor and the editor ID
//                String fileExtension = (modelFilePath).getFileExtension();
//                IEditorDescriptor defaultEditor = PlatformUI.getWorkbench().getEditorRegistry()
//                        .getDefaultEditor("default." + fileExtension);
//                if (defaultEditor == null) {
//                    defaultEditor = PlatformUI.getWorkbench().getEditorRegistry()
//                            .findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
//                }
//                try {
//                    String editorId = getEditorId(modelFilePath);
//
//                    // Close all other editors
//                    page.closeAllEditors(false);
//
//                    // Try to open as workspace file
//                    IEditorInput input = createEditorInput(modelFilePathString);
//                    if (input.exists()) {
//                        // If this exists then directly open it
//                        page.openEditor(input, editorId);
//                    }
//                } catch (Exception e) {
//                    logger.error(e.getMessage());
//                }
//
//            }
//        });
//
//    }



    // -------------------------------------------------------------------------

//    /**
//     * Gets the property.
//     * 
//     * @param propertyKey
//     *            the property key
//     * @param dataComponentWrapper
//     *            the data component wrapper
//     * @return the property
//     */
//    private static KiemProperty getProperty(final String propertyKey,
//            final DataComponentWrapper dataComponentWrapper) {
//        KiemProperty[] kiemProperties = dataComponentWrapper.getProperties();
//        for (KiemProperty kiemProperty : kiemProperties) {
//            if (kiemProperty.getKey().equals(propertyKey)) {
//                return kiemProperty;
//            }
//        }
//        throw new RuntimeException(
//                "This is most likely a KIELER internal programming error. KART Property ("
//                        + propertyKey
//                        + ") was not found. Maybe the property name has changed in the KART"
//                        + " plugin? This is name binded and must be consistent.");
//    }

    // -------------------------------------------------------------------------

//    /**
//     * Gets the KART Replay component.
//     * 
//     * @return the KART Replay component
//     */
//    private static DataComponentWrapper getKartReplayComponent() {
//        List<DataComponentWrapper> dataComponentWrapperList = kiemPlugin
//                .getDataComponentWrapperList();
//        for (DataComponentWrapper dataComponentWrapper : dataComponentWrapperList) {
//            String dataComponentId = dataComponentWrapper.getDataComponent().getDataComponentId();
//            if (dataComponentId.startsWith(KartConstants.KART_REPLAY_DATACOMPONENT_ID_START)) {
//                return dataComponentWrapper;
//            }
//        }
//        throw new RuntimeException("KART DataComponent ("
//                + KartConstants.KART_REPLAY_DATACOMPONENT_ID_START
//                + ") was not loaded. The KART Plugin must be added to the run configuration "
//                + "together with all dependend plugins.");
//    }

    // -------------------------------------------------------------------------

//    /**
//     * Gets the KART Validation component.
//     * 
//     * @return the KART Validation component
//     */
//    private static DataComponentWrapper getKartValidationComponent() {
//        List<DataComponentWrapper> dataComponentWrapperList = kiemPlugin
//                .getDataComponentWrapperList();
//        for (DataComponentWrapper dataComponentWrapper : dataComponentWrapperList) {
//            String dataComponentId = dataComponentWrapper.getDataComponent().getDataComponentId();
//            if (dataComponentId.startsWith(KartConstants.KART_VALIDATION_DATACOMPONENT_ID_START)) {
//                return dataComponentWrapper;
//            }
//        }
//        throw new RuntimeException("KART DataComponent ("
//                + KartConstants.KART_VALIDATION_DATACOMPONENT_ID_START
//                + ") was not loaded. The KART Plugin must be added to the run configuration"
//                + " together with all dependend plugins.");
//    }

    // -------------------------------------------------------------------------
    
}
