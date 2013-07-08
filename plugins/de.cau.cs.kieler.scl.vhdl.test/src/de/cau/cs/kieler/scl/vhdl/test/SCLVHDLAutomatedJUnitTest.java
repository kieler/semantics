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
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
//import java.net.MalformedURLException;
//import java.net.URISyntaxException;
//import java.net.URL;
import java.util.Collection;
import java.util.Enumeration;
//import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
//import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
//import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
//import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.osgi.framework.Bundle;
//import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.model.util.ModelUtil;
//import de.cau.cs.kieler.eso.coreeso.xtend.ESO2CoreESO;
import de.cau.cs.kieler.eso.vhdl.xtend.ESO2VHDL;
import de.cau.cs.kieler.scl.scl.Program;
import de.cau.cs.kieler.scl.seqscl.xtend.SCLToSeqSCLTransformation;
import de.cau.cs.kieler.scl.vhdl.xtend.SCL2VHDL;
import de.cau.cs.kieler.sim.eso.eso.tracelist;

import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;

//New Version, when loading SCCharts instead of core SCL
//import de.cau.cs.kieler.yakindu.sccharts.scl.xtend.CoreToSCLTransformation;
//import de.cau.cs.kieler.yakindu.sccharts.scl.xtend.CoreToSCLOptimization;
//import org.yakindu.sct.model.sgraph.Statechart;

/**
 * 
 * 
 * 
 * 
 * @author gjo
 *
 */
@RunWith(VHDLTestRunner.class)
public  class SCLVHDLAutomatedJUnitTest {
  
    // -------------------------------------------------------------------------
    // General Configuration

    /** The Constant DEFAULT_ESO_FILE_EXTENSITION. */
    static final String DEFAULT_ESO_FILE_EXTENSITION = "eso";
    
    /** The Constant DEFAULT_SCL_FILE_EXTENSITION. */
    static final String DEFAULT_SCL_MODEL_EXTENSITION = "scl";
 
//New Version, when loading SCC instead of SCL
//    /** The Constant DEFAULT_SCC_FILE_EXTENSITION. */
//    static final String DEFAULT_SCC_MODEL_EXTENSITION = "scc";
    
    /** The Constant PLUGIN_ID. */
    static final String PLUGIN_ID = "de.cau.cs.kieler.scl.vhdl.test";
    
    /** The Constant BUNDLE_TEST_PATH. */
    static final IPath BUNDLE_TEST_PATH = new Path ("testdata");
    
    /** The Constant MODELS_REPOSITORY_PATH. */
    static final IPath MODELS_REPOSITORY_PATH = new Path("../../../models/SCCharts/");
    
    /** The Constant TEMPORARY_WORKSPACE_FOLDER_NAME. */
    static final String TEMPORARY_WORKSPACE_FOLDER_NAME = "temp-scl";

    // -------------------------------------------------------------------------
    // Private properties

    /** The ESO files. */
    private static List<IPath> esoFiles = new LinkedList<IPath>();

    /** The corresponding model file for an ESO file. */
    private static HashMap<IPath, IPath> modelFile = new HashMap<IPath, IPath>();

    /** The first test flag used to identify the first test and initialize all static lists/hashmaps. */
    private static boolean firstTestFlag = true;

    /** The currently tested ESO file as specified by parameters. */
    private IPath currentEsoFile = null;
    
    /** If in strict mode, require an ESO file for all model files and raise an error otherwise. */
    private static final boolean STRICT_MODE_REQUIRE_ESO_FOR_ALL_MODEL_FILES = false;
    
    /** The standard simulation tick time in ns  */
    private static int SIMULATION_TICK_TIME_IN_NS = 100;
    
    /** Name of the command file */
    private static String CMD_FILE_NAME_EXTENSION = ".cmd";
    
    /** Name of the project file */
    private static String PRJ_FILE_NAME_EXTENSION = ".prj";
    
    /** Name of the batch file */
    private static String BATCH_FILE_NAME_EXTENSION = ".sh";
    
    /** Name of the simulation log file file */
    private static String SIMULATION_LOG_FILE_NAME = "sim_out.txt";
    
    /** Path from ISE distribution, used for PATH variable */
    private static String ISE_PATH = "/C/Xilinx/14.5/ISE_DS/ISE/";

    // -------------------------------------------------------------------------
    
    /**
     * Constructor
     * 
     * @param esoFile
     *          the current ESO file
     * @throws Throwable
     */
    public SCLVHDLAutomatedJUnitTest(final IPath esoFile) throws Throwable {
        super();
        
        this.currentEsoFile = esoFile;
    }
    
    // -------------------------------------------------------------------------

    /**
     * Gets all ESO files and provides the parameters for the consecutive tests run by the
     * VHDLTestRunner.
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
     * Initializes all ESO and model files. @BeforeClass can only be used with
     * static methods so we used @Before and add an extra flag that guards against multiple
     * initializations. The @Before became irrelevant because the initialization is called
     * anyway from the VHDLTestRunner.
     */
    public void SCLVHDLTestRunnerInitialization() {
        // Only initialize for several consecutive tests iff this is the first test,
        // i.e., the static variable firstTest is true; set it to false in this case
        // it will be reset to true in the @AfterClass wrapup method.
        if (!firstTestFlag) {
            // We already initialized all static lists, we can
            // safely exit here because re-initialization for EVERY test would
            // result in much overhead!
            return;
        }
        // We are in the first test (of a possible list of severel tests)
        // we need to reset the flag so that we initialize 
        // just ONCE for a set of consecutive tests
        firstTestFlag = false;

        // -----------------------------------------------------------------------------------------
        
        // First create links to local bundle file in a temporary workspace
        List<IPath> allWorkspaceFiles = createLinksForAllTestFiles(PLUGIN_ID,
                BUNDLE_TEST_PATH, TEMPORARY_WORKSPACE_FOLDER_NAME);
        
        // Fill esoFiles and modelFile list/hashmap
        fillModelAndEsoFiles(allWorkspaceFiles, DEFAULT_SCL_MODEL_EXTENSITION);
        
        //new loading, from models repository
//        List<IPath> allFiles = createLinksForAllExternalTestFiles(PLUGIN_ID,
//                MODELS_REPOSITORY_PATH, TEMPORARY_WORKSPACE_FOLDER_NAME);
//        fillModelAndEsoFiles(allFiles, DEFAULT_SCL_MODEL_EXTENSITION);

        // Test if ESO files and corresponding model files exist
        if (esoFiles.size() == 0) {
            throw new RuntimeException(
                    "No model files are provided and also no model file extension was provided to search"
                            + " for model files in the current workspace. "
                            + "Cannot proceed without model files to test!");
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Wraps up VHDL pointer that is stored statically.
     */
    @AfterClass
    public static void SCLVHDLTestRunnerWrapup() {
        
        // Clear all static fields
        esoFiles.clear();
        modelFile.clear();
        // Reset important firstTestFlag to initialization only one time
        firstTestFlag = true;
    }

    // -------------------------------------------------------------------------

    /**
     * This generic test will look for model files in a provided test files folder. If for a model
     * file also an ESO file is found these both serve as a test case. 
     * 
     * Attention: Core Variants will be expected: xy.core.scc and xy.core.eso
     * 
     * @throws IOException 
     * @throws InterruptedException 
     */
    @Test
    public void SCLVHDLTestRunnerExecution() throws IOException, InterruptedException {
        
        // Get model name 
        String modelName = currentEsoFile.removeFileExtension().lastSegment();
        
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
        IPath absolutePath = root.getLocation().append(TEMPORARY_WORKSPACE_FOLDER_NAME);

        // Create a temporary folder for each model
        IPath absoluteTempPath = absolutePath.append(modelName);
        File tempDir = absoluteTempPath.toFile();
        tempDir.mkdir();
        
        // create an relative temporary path from ESO file
        String relativeTempPath = currentEsoFile.removeLastSegments(1).addTrailingSeparator().
                append(modelName).addTrailingSeparator().toString();
        
        // Get Model File path
        IPath modelFilePath = modelFile.get(currentEsoFile);
 
//new Version for Loading SCCharts instead of SCL
//        EObject scchart = ModelUtil.loadEObjectFromModelFile(modelFilePath);
//        EObject esoModel = ModelUtil.loadEObjectFromModelFile(currentEsoFile);
//        
//        // Transform SCL model into VHDL file and save it
//        Program sclmodel = (new CoreToSCLTransformation().transformCoreToSCL((Statechart) scchart,
//                    CoreToSCLOptimization.OPTIMIZE_DEFAULT));
//        Program seqSCL = (new SCLToSeqSCLTransformation().transformSCLToSCLControlflow((Program)sclmodel));
//        CharSequence sclVhdlModel = (new SCL2VHDL().transform(seqSCL, modelFilePath.toFile()));
//        IPath vhdlPath = new Path(relativeTempPath + modelFilePath.removeFileExtension()
//                .addFileExtension("vhd").lastSegment());
//        createWorkspaceFile(vhdlPath, sclVhdlModel.toString());
//end new Version
        
// old Version
        // Load models from File
        EObject sclModel = ModelUtil.loadEObjectFromModelFile(modelFilePath);
        EObject esoModel = ModelUtil.loadEObjectFromModelFile(currentEsoFile);    
        
        // Transform SCL model into VHDL file and save it
        Program seqSCL = (new SCLToSeqSCLTransformation().transformSCLToSCLControlflow((Program)sclModel));
        CharSequence sclVhdlModel = (new SCL2VHDL().transform(seqSCL, modelFilePath.toFile()));
        IPath vhdlPath = new Path(relativeTempPath + modelFilePath.removeFileExtension()
                .addFileExtension("vhd").lastSegment());
        createWorkspaceFile(vhdlPath, sclVhdlModel.toString());
//end old Version
  
        // We expected a core variant from an eso file, therefore we don't need this transformation
        // transform ESO file to core ESO file and
        // tracelist transformedEso2CoreEso = (new ESO2CoreESO().transformESO2CoreESO((tracelist) esoModel));
        
        
        //transform core ESO file to VHDl testbench and save it
        CharSequence transformedCoreESO2VHDLTB = (new ESO2VHDL().transformESO2VHDL(
                (tracelist) esoModel,modelFilePath.toFile()));
        IPath tbPath = new Path(relativeTempPath + currentEsoFile.removeFileExtension()
                .lastSegment() + "_tb.vhd");
        createWorkspaceFile(tbPath, transformedCoreESO2VHDLTB.toString());
           
        // generate .prj file the project file contains all VHDL files
        // so a LinkedList is created with all VHDL files
        LinkedList<String> allVhdlFiles = new LinkedList<String>();
        allVhdlFiles.add(vhdlPath.lastSegment());
        allVhdlFiles.add(tbPath.lastSegment());
        String prjFileContent = createPRJFile(allVhdlFiles);
        IPath prjPath = new Path(relativeTempPath.concat(modelName + PRJ_FILE_NAME_EXTENSION));
        createWorkspaceFile(prjPath, prjFileContent);
           
        // generate .cmd file
        // the .cmd file tells the ISE simulator how long the simulation should take
        // the simulation time is derived from the number of ticks in the ESO file
        String cmdFileContent = createCMDFile(currentEsoFile);
        IPath cmdPath = new Path(relativeTempPath.concat(modelName + CMD_FILE_NAME_EXTENSION));
        createWorkspaceFile(cmdPath, cmdFileContent);
            
        // generate batch file
        // the batch file executes the ISE tool (compiling and simulation)
        
        // but first of all compute topLevelEntityName, this is the eso file name without leading
        // numbers and - replaced by _ and the _tb extension
        // BE CAREFULL!! TO CHANGE THIS COMPUTATION
        // the same computation take place when transforming eso into vhdl, these two names must match:
        // the entityname in vhdl file and the name which will be computed here
        String modelname = modelFilePath.lastSegment().toString();
        //delete all extensions such core, tick, etc
        String topLevelEntityName = modelname.subSequence(0, modelname.indexOf(".")).toString(); 
        //in vhdl only - are allowed
        topLevelEntityName = topLevelEntityName.replace("-","_");
          
        //vhdl entity must start with (A...Z or a..z), better to use RegExp?
        Character firstChar = topLevelEntityName.charAt(0);
        while( Character.isDigit(firstChar) || (firstChar == '_')){
            if(!topLevelEntityName.isEmpty()){
                 topLevelEntityName = topLevelEntityName.subSequence(1, topLevelEntityName.length()).toString();
                 firstChar = topLevelEntityName.charAt(0);
            }else{
                topLevelEntityName = "no_valid_name";
            }
        }
        
        String batchFileContent = createBatchFile(topLevelEntityName + "_tb", modelName);
        IPath batchPath = new Path(relativeTempPath.concat(modelName + BATCH_FILE_NAME_EXTENSION));
        createWorkspaceFile(batchPath, batchFileContent);
            
        // Execute Batch file (here ISE will start compiling and simulating)
        ProcessBuilder pb = new ProcessBuilder("sh", absoluteTempPath + File.separator + modelName 
                + BATCH_FILE_NAME_EXTENSION);
        pb.directory(absoluteTempPath.toFile());
        Process p = pb.start();
        p.waitFor();              

        // the batch file creates an log file which can be checked for errors
        // so are there no errors in the log everything is fine
        IPath logFilePath = new Path(relativeTempPath + SIMULATION_LOG_FILE_NAME); 
        // All errors are marked with key: Error
        // Search in the log file for this key word
        String errorString = stringOccourInFile(logFilePath, "Error" );
        
        // check if there are any errors, if there are the assertion is hit and
        // all errors are printed into the stack trace
        if(!errorString.isEmpty())
            Assert.fail("\n" + errorString);
    }

    // -------------------------------------------------------------------------
    
    /**
     * Opens a given file and scan it according to the search string
     * 
     * Only one occurrence of the error string per line is found in the given file
     * 
     * @param relativeFilePath
     *                  the relative file path to file which should be checked
     *                  
     * @param searchString
     *                  the string to look for
     *                  
     * @return a String which contains all founded errors
     * 
     * @throws IOException
     */
    private String stringOccourInFile(IPath relativeFilePath, String searchString) throws IOException {
        
        InputStream inStream = ModelUtil.openWorkspaceFile(relativeFilePath);
        String allFoundedSearchString = "";
        
        //Create new Reader which reads the file
        BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
        String lineIn;
        
        //read line by line and scan for the search string
        while ((lineIn = br.readLine()) != null) {
            if(lineIn.contains(searchString)){
                //add the line in which the search string was found
                allFoundedSearchString += lineIn + "\n";
            }
        }
        //close stream and reader
        inStream.close();
        br.close();
        
        return allFoundedSearchString;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Writes a given file content to a given file path
     * 
     * @param relativeFilePath
     *                  relative file path to which the data should be written
     * @param fileContent
     *                  the content which should be written
     * @throws IOException
     */
    private void createWorkspaceFile(IPath relativeFilePath, String fileContent) throws IOException {
        
        //Get an output stream to which the content can be written
        OutputStream os = ModelUtil.createWorkspaceFile(relativeFilePath);
        
        //write byte by byte
        for(int i = 0; i < fileContent.length(); i++){
            os.write(fileContent.charAt(i));
        }
        
        //clean up
        os.flush();
        os.close();
    }

    // -------------------------------------------------------------------------
    
    /**
     * create a batch file
     * 
     * This batch file starts the ISE compiler and afterwards the ISE simulation 
     * 
     * @param testbenchTopLevelEntityName
     *                  the name of the top level entity from the testbench file
     *                  normally it ends wit _tb
     *                  
     * @param filename
     *                  the file name the cmd-file and prj-file have
     *                  
     * @return the batch file content
     */
    private String createBatchFile(String testbenchTopLevelEntityName, String filename){
        
        // entitynames are the same name as testbench filename (convention)
        
        String batchFileContent = "";
        
        batchFileContent += ""
                         // set variables with the hardcoded(!) ISE path, prj and cmd file and
                         // the top level entity
                         +  "ise_path=\"" + ISE_PATH  + "\"\n"
                         +  "project=\"" + filename + PRJ_FILE_NAME_EXTENSION + "\"\n"
                         +  "toplevelEntity=\"" + testbenchTopLevelEntityName + "\"\n"
                         +  "simulation_tcl=\"" + filename + CMD_FILE_NAME_EXTENSION + "\"\n"
                         +  "\n"
                         
                         //set ISE path
                         +  "export PLATFORM=nt" + "\n"
                         +  "export XILINX=$ise_path" + "\n"
                         +  "export PATH=$PATH:$XILINX/bin/$PLATFORM" + "\n"
                         +  "export LD_LIBRARY_PATH=$XILINX/lib/$PLATFORM" + "\n"
                         +  "\n"
                         
                         // set binary file name
                         // build compile and simulation parameter
                         // set log file name
                         +  "binary=\"tb_" + filename + "_isim_beh\"" + "\n"
                         +  "compile_params=\"-intstyle ise -incremental -o \"$binary\" -prj \"$project" + "\n"
                         +  "sim_params=\"-intstyle ise -tclbatch \"$simulation_tcl\" -log out.log -sdfnowarn\"" + "\n" 
                         +  "tmp_out=\"" + SIMULATION_LOG_FILE_NAME + "\"" + "\n"
                         +  "\n"
                         
                         // start compiler (fuse) and start simulator (xx.exe sim_params)
                         // and report all errors to shell
                         +  "fuse $compile_params $toplevelEntity" + "\n"
                         +  "\"./\"$binary\".exe\" $sim_params" + "\n"
                         +  "echo -e out.log | cat out.log | grep 'Error:' | sed 's/at.*ps: //' >> $tmp_out" + "\n"
                         +  "\n"; 
        
        return batchFileContent;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Creates the command file (cmd)
     * 
     * In the command file is specified how long the simulation take place.
     * Due to all ESO traces have another length, the number of ticks must 
     * compute to get the simulation time. 
     * 
     * @param esoFilepath
     *               the file path to the ESO file
     *               
     * @return cmd file content
     * 
     * @throws IOException
     */
    private String createCMDFile(IPath esoFilepath) throws IOException {
        
        String fileContent = "";
        int counter = 0;
        
        // Calculate Simulation time,
        // every '% Output :' in the ESO file correspondents to a tick and is closed with a ';'
        // every reset in the ESO file needs a tick in the testbench and is also closed with a ';'
        // ';' never used in additional cases, so count the ';'
        // and append some safety offset
        
        // Open ESO file
        InputStream is = ModelUtil.openBundleOrWorkspaceFile(esoFilepath, PLUGIN_ID);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String lineIn;

        //check line by line
        while ((lineIn = br.readLine()) != null) {
            if (lineIn.contains(";")){
                // a ';' was found increment counter
                counter++;
            }
        }
        
        //clean up
        is.close();
        br.close();
        
        //calculate simulation time with some offset
        int simulationTime = (counter + 20) * SIMULATION_TICK_TIME_IN_NS;
        
        //generate cmd file content
        fileContent = "run " + simulationTime + " ns; \n" +
               "quit";
        
        return fileContent;
    }

    // -------------------------------------------------------------------------

    /**
     * Generate .prj file, it contains all used VHDL files
     * 
     * @param allVhdlFiles 
     *                  LinkedList which contains all needed VHDL file names for the current run
     *                  
     * @return prj file content
     */
    private String createPRJFile(LinkedList<String> allVhdlFiles) {
        
        String prjFileContent = "";
        
        //add all VHDL files to prj file
        for(String path : allVhdlFiles){
            prjFileContent  += "vhdl work \"" + path + "\"\n";
        }
        
        return prjFileContent;
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
    
    /**
     * Creates links for all external files in a test directory relative to the bundle and returns
     * all paths as a list.
     * 
     * @param pluginId
     *            the plugin id
     * @param bundleTestPath
     *            the bundle test path
     * @param temporaryWorkspaceFolderName
     *            the temporary workspace folder name
     * @return the list
     */
    public static List<IPath> createLinksForAllExternalTestFiles(final String pluginId,
            final IPath bundleTestPath, final String temporaryWorkspaceFolderName) {
        List<IPath> allFiles = new LinkedList<IPath>();
        // If the bundle is not ready then there is no image
        final Bundle bundle = Platform.getBundle(pluginId);

        URL bundleLocation = bundle.getEntry("");
        URL modelLocation = null;
        String directoryPathString = null;
        String filenames[] = null;
        try {
            bundleLocation = ModelUtil.getAbsoluteBundlePath(bundleLocation);
            // file:/C:/DATA/kielergitrepository/semantics/test/de.cau.cs.kieler.s.sim.sc.test/./
            String modelLocationString = bundleLocation.toString();
            // Now add relative bundleTestPath
            modelLocationString += bundleTestPath.toPortableString();
            modelLocation = URI.create(modelLocationString).toURL();
            // Now access all files within the modelLocation directory
            modelLocation = FileLocator.toFileURL(modelLocation);

            File directory = new File(modelLocation.getFile());
            directoryPathString = directory.getCanonicalPath() + File.separator;
            filenames = directory.list();
            // for (String filename : filenames) {
            // System.out.println(directoryPathString + filename);
            // }
        } catch (IOException e2) {
            e2.printStackTrace();
        }

        if (directoryPathString != null && filenames != null) {
            // Search for all files in the test directory
            // Enumeration<URL> allBundleFilesUrl = bundle.findEntries(bundleTestPath.toString(),
            // "*.*",
            // false);
//            logger.debug("testpath:" + bundleTestPath.toString());
            for (String filename : filenames) {
                URL bundleFileUrl = null;
                try {
                    String fileString = directoryPathString + filename;
                    fileString = fileString.replace(File.separator, "/");
                    fileString = "file://" + fileString.replace(" ", "%20");
                    bundleFileUrl = new URI(fileString).toURL();
//                    logger.debug("FileUrl:" + bundleFileUrl.toString());
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
        }

        return allFiles;
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
    
}