package de.cau.cs.kieler.sccharts.test

import java.io.File
import org.apache.commons.io.FilenameUtils
import org.eclipse.emf.ecore.EObject

class SCChartsTestBase {
    /**
     * The model that is used in the current test method
     */
    protected var EObject model
    /**
     * The project relative path of the model
     */
    protected var String modelPath
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
        this.modelName = FilenameUtils.getName(modelPath)
    }
}