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
    
    /** The Constant DEFAULT_SCL_FILE_EXTENSITION. */
    static final String DEFAULT_SCL_MODEL_EXTENSITION = "scl";
    
    /** The Constant PLUGIN_ID. */
    static final String PLUGIN_ID = "de.cau.cs.kieler.scl.vhdl.test";
    
    /** The Constant BUNDLE_TEST_PATH. */
    static final IPath BUNDLE_TEST_PATH = new Path ("testdata");
    
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
    public static final boolean STRICT_MODE_REQUIRE_ESO_FOR_ALL_MODEL_FILES = false;
    
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
     * @param clazz
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
        List<IPath> allWorkspaceFiles = createLinksForAllTestFiles(PLUGIN_ID,
                BUNDLE_TEST_PATH, TEMPORARY_WORKSPACE_FOLDER_NAME);

        // Fill esoFiles and modelFile list/hashmap
        fillModelAndEsoFiles(allWorkspaceFiles, DEFAULT_SCL_MODEL_EXTENSITION);

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
        
        //Temporary Folder, only needed inner this method, it will be created and also be deleted in this method 
        String modelName = currentEsoFile.removeFileExtension().lastSegment();
        
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
        IPath absolutePath = root.getLocation().append(TEMPORARY_WORKSPACE_FOLDER_NAME);

        //Create a temporary folder, it will be deleted after each JUjnit iteration
        IPath absoluteTempPath = absolutePath.append(modelName);
        File tempDir = absoluteTempPath.toFile();
        tempDir.mkdir();
        
        //create an relative temporary path from eso file
        String relativeTempPath = currentEsoFile.removeLastSegments(1).addTrailingSeparator().append(modelName).addTrailingSeparator().toString();
        
        //Get Model File path
        IPath modelFilePath = modelFile.get(currentEsoFile);
         
        //Load models from File
        EObject sclModel = ModelUtil.loadEObjectFromModelFile(modelFilePath);
        EObject esoModel = ModelUtil.loadEObjectFromModelFile(currentEsoFile);
             
        //Transform model into vhdl file and save it
        CharSequence transformedSCL2VHDL = (new SCL2VHDL().transform((Program)sclModel));
        IPath vhdlPath = new Path(relativeTempPath + modelFilePath.removeFileExtension().addFileExtension("vhd").lastSegment());
        createWorkspaceFile(vhdlPath, transformedSCL2VHDL.toString());
        
        //transform eso file to coreEso file and
        //transform coreEso file ti vhdl testbench
        tracelist transformedEso2CoreEso = (new ESO2CoreESO().transformESO2CoreESO((tracelist) esoModel));
        CharSequence transformedCoreESO2VHDLTB = (new ESO2VHDL().transformESO2VHDL(transformedEso2CoreEso,modelFilePath.toFile()));
        IPath tbPath = new Path(relativeTempPath + currentEsoFile.removeFileExtension().lastSegment() + "_tb.vhd");
        createWorkspaceFile(tbPath, transformedCoreESO2VHDLTB.toString());
           
        //generate .prj file the project file contains all vhdl files
        //so a LinkedList is created with all vhdl files
        LinkedList<String> allVhdlFiles = new LinkedList<String>();
        allVhdlFiles.add(vhdlPath.lastSegment());
        allVhdlFiles.add(tbPath.lastSegment());
        String prjFileContent = createPRJFile(allVhdlFiles);
        IPath prjPath = new Path(relativeTempPath.concat(modelName + PRJ_FILE_NAME_EXTENSION));
        createWorkspaceFile(prjPath, prjFileContent);
           
        //generate .cmd file
        //the .cmd file tells the ise simulater how long the simulation schould take
        //the simulation time is dirived from the number of ticks in the eso file
        String cmdFileContent = createCMDFile(currentEsoFile);
        IPath cmdPath = new Path(relativeTempPath.concat(modelName + CMD_FILE_NAME_EXTENSION));
        createWorkspaceFile(cmdPath, cmdFileContent);
            
        //generate batch file
        //the batch file executes the ise tool (compiling and simulation) 
        String batchFileContent = createBatchFile(currentEsoFile.removeFileExtension().lastSegment() + "_tb", modelName);
        IPath batchPath = new Path(relativeTempPath.concat(modelName + BATCH_FILE_NAME_EXTENSION));
        createWorkspaceFile(batchPath, batchFileContent);
            
        // Execute Batch
        ProcessBuilder pb = new ProcessBuilder("sh", absoluteTempPath + File.separator + modelName + BATCH_FILE_NAME_EXTENSION);
        pb.directory(absoluteTempPath.toFile());
        Process p = pb.start();
        p.waitFor();              

        //the batch file creates an log file which can be checked for errors
        //so are no errors in the log every thing is fine
        IPath logFilePath = new Path(relativeTempPath + SIMULATION_LOG_FILE_NAME); 
        String errorString = stringOccourInFile(logFilePath, "Error" );
        
        //check if there are any errors
        if(!errorString.isEmpty())
            Assert.fail("\n" + errorString);
    }

    // -------------------------------------------------------------------------
    
    /**
     * @param logFilePath
     * @param string
     * @return
     * @throws IOException 
     */
    private String stringOccourInFile(IPath relativeFilePath, String searchString) throws IOException {
        
        InputStream inStream = ModelUtil.openWorkspaceFile(relativeFilePath);
        String allFoundedSearchString = "";
        
        BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
        String lineIn;
        
        while ((lineIn = br.readLine()) != null) {
            if(lineIn.contains(searchString)){
                allFoundedSearchString += lineIn + "\n";
            }
        }
        inStream.close();
        br.close();
        
        return allFoundedSearchString;
    }

    // -------------------------------------------------------------------------
    
    /**
     * @param path
     * @param fileContent
     * @throws IOException 
     */
    private void createWorkspaceFile(IPath relativeFilePath, String fileContent) throws IOException {
        
        OutputStream os = ModelUtil.createWorkspaceFile(relativeFilePath);
        
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
    private String createBatchFile(String testbenchTopLevelEntityName, String filename) throws FileNotFoundException {
        
        //entityname is the same name as testbench filename (convention)
        
        String batchFileContent = "";
        
        batchFileContent += ""
                         +  "ise_path=\"" + ISE_PATH  + "\"\n"
                         +  "project=\"" + filename + PRJ_FILE_NAME_EXTENSION + "\"\n"
                         +  "toplevelEntity=\"" + testbenchTopLevelEntityName + "\"\n"
                         +  "simulation_tcl=\"" + filename + CMD_FILE_NAME_EXTENSION + "\"\n"
                         +  "\n"
                         
                         +  "export PLATFORM=nt" + "\n"
                         +  "export XILINX=$ise_path" + "\n"
                         +  "export PATH=$PATH:$XILINX/bin/$PLATFORM" + "\n"
                         +  "export LD_LIBRARY_PATH=$XILINX/lib/$PLATFORM" + "\n"
                         +  "\n"
                         
                         +  "binary=\"tb_" + filename + "_isim_beh\"" + "\n"
                         +  "compile_params=\"-intstyle ise -incremental -o \"$binary\" -prj \"$project" + "\n"
                         +  "sim_params=\"-intstyle ise -tclbatch \"$simulation_tcl\" -log out.log -sdfnowarn\"" + "\n" 
                         +  "tmp_out=\"" + SIMULATION_LOG_FILE_NAME + "\"" + "\n"
                         +  "\n"
                         
                         +  "fuse $compile_params $toplevelEntity" + "\n"
                         +  "\"./\"$binary\".exe\" $sim_params" + "\n"
                         +  "echo -e out.log | cat out.log | grep 'Error:' | sed 's/at.*ps: //' >> $tmp_out" + "\n"
                         +  "\n"; 
        
        return batchFileContent;
    }

    // -------------------------------------------------------------------------
    
    /**
     * @param eso path of the current eso file
     * @return String content of the .cmd file
     * @throws IOException 
     */
    private String createCMDFile(IPath eso) throws IOException {
        
        String fileContent = "";
        int resetCounter = 0;
        int tickCounter = 0;
        
        //Calculate Simulation time,
        //every output in the eso file correspondents to a tick
        //every reset in the eso file needs a tick in the testbench
        //and append some offset
        
        InputStream is = ModelUtil.openBundleOrWorkspaceFile(eso, PLUGIN_ID);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String lineIn;
        
        // Problem!: Grammer allows you to write !reset; and %Output: over more than one line
        // and/or with whitespaces. Or the whole eso in one line -> not all resets and output were seen
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
        
        int simulationTime = (tickCounter + resetCounter + 20) * SIMULATION_TICK_TIME_IN_NS;
        
        fileContent = "run " + simulationTime + " ns; \n" +
               "quit";
        
        return fileContent;
    }

    // -------------------------------------------------------------------------

    /**
     * Generate .prj file, it contians all used vhdl files
     * 
     * @param allVhdlFiles LinkedList which contains all needed vhdl file names for the current run
     * @return String contains the file content
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
        while (allBundleFilesUrl.hasMoreElements()) {
            URL bundleFileUrl = allBundleFilesUrl.nextElement();
            try {
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