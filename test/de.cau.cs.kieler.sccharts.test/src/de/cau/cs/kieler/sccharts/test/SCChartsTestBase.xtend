package de.cau.cs.kieler.sccharts.test

import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.Models
import java.io.File
import java.util.ArrayList
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class SCChartsTestBase {
    
    /**
     * Project relative path to the input models of the tests.
     */
    public static val INPUT_MODELS_FOLDER = "tests/input/"
    
    /**
     * Folder in which the prototype for a test model is stored.
     * The path has to be relative to the input model.
     * Models in target folders are assumed to be a correct transformation of the corresponding input model.
     */
    public static val TARGET_FOLDER = "expected_output"

    /**
     * Input models that are stored in a folder with this name will not be tested.
     */
    public static val IGNORE_FOLDER = "known_to_fail"

    /**
     * Folder in which the compiled output of a test model will be saved.
     * The path has to be relative to the input model.
     * The models are saved to this folder only to have a human readable form of the compilation result.  
     */
    public static val COMPILATION_RESULT_FOLDER = "compilation_result"
    
    /**
     * The model that is used in the current test method
     */
    protected var EObject model
    /**
     * The project relative path of the model
     */
    protected var String modelPath
    /**
     * The project relative directory of the model
     */
    protected var String modelDirectory
    /**
     * The file name of the model (including file extension)
     */
    protected var String modelName
    
    /**
     * Constructor for a testing the given model.
     */
    public new(EObject model) {
        this.model = model;
        // Set the model path to the project relative path of the model
        val path = model.eResource.URI.path
        if(path.startsWith(File.separator))
            modelPath = path.substring(1)
        else
            modelPath = path
        // Get the name from the model path
        this.modelName = new Path(modelPath).lastSegment
        // Get the directory from the model path
        this.modelDirectory = new Path(modelPath).removeLastSegments(1).toOSString
    }
    
    /**
     * Searches for models in the test input directory
     *  
     * @return the models to be tested.  
     */
     @Models
     def public static Iterable<Object> getModels() {
         // Find and filter files
         val fileURLs = newArrayList()
         val bundle = Platform.getBundle(SCChartsTestActivator.PLUGIN_ID)
         val allFiles = bundle.findEntries(INPUT_MODELS_FOLDER, "*.sct", true)
         while(allFiles.hasMoreElements) {
             val file = allFiles.nextElement()
             val path = file.path
             val ignore = path.contains(File.separator + TARGET_FOLDER + File.separator)
                || path.contains(File.separator + COMPILATION_RESULT_FOLDER + File.separator)
                || path.contains(File.separator + IGNORE_FOLDER + File.separator)
//                || !path.contains("history") // Debug code to compile a specific file
             if(!ignore) {
                 fileURLs.add(file)
             }
         }
         // Load EObjects
         val resourceSet = new ResourceSetImpl()
         val models = new ArrayList<Object>()
         for(url : fileURLs) {
            val r = resourceSet.getResource(URI.createURI(url.toString()), true);
            models += r.getContents().get(0);
         }
         return models as Iterable<Object>
     }
}