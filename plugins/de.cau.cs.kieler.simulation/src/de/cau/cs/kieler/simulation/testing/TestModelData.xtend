/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testing

import com.google.common.io.Files
import com.google.inject.Guice
import com.google.inject.Injector
import java.nio.file.Path
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * Data holder for test models in the models repository.
 * 
 * @author als
 */
@Data
class TestModelData {
    /** The system path to the repository root. */
    val Path repositoryPath
    /** Relative path to the model file. */
    val Path modelPath
    /** Relative paths to the trace files. */
    val List<Path> tracePaths
    /** Unique ID for the resource set of the model. */
    val String resourceSetID
    /** All model paths with the same resource set ID, including this model. */
    val Set<Path> resourceSetModels
    /** Set of property String characterizing the the model. */
    val Set<String> modelProperties
    /** Map with all properties specified in the repository for this model. */
    val Map<String, String> additionalProperties
    /** Flag indicating that this model is confidential and its content should not be publish in any way. */
    val boolean confidential
    
    /** The file name (incl. extension) of the loaded model. */
    def String modelFile() {
        return modelPath.fileName.toString
    }
    
    /** The file name without extension of the model. */
    def String modelFileBasename() {
        return Files.getNameWithoutExtension(modelFile)
    }
    
    /** The file extension of the model. */
    def String modelFileExtension() {
        return Files.getFileExtension(modelFile)
    }
    
    def EObject load(Injector resourceSetInjector) {
        val absModelPath = repositoryPath.resolve(modelPath)
        try {
            val uri = URI.createFileURI(absModelPath.toFile.absolutePath)
            
            // Get resource set
            var resourceSet = if (resourceSetInjector !== null) {
                resourceSetInjector.getInstance(XtextResourceSet)
            } else if (uri !== null) {
                val registry = Guice.createInjector().getInstance(IResourceServiceProvider.Registry)
                registry.getResourceServiceProvider(uri).get(XtextResourceSet)
            }
            resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
            
            // Load referenced model
            for (absRelatedPath : resourceSetModels.filter[it != modelPath].map[repositoryPath.resolve(it)]) {
                val relatedURI = URI.createFileURI(absRelatedPath.toFile.absolutePath)
                resourceSet.getResource(relatedURI, true)
            }
            
            // Load file
            val resource = resourceSet.getResource(uri, true)
            
            // Fix references
            if (resourceSet.resources.size > 1) {
                resourceSet.resources.filter(XtextResource).forEach[relink]
            }
            
            return resource.getContents().head
        } catch (Exception e) {
            throw new Exception("Cannot load model from "+absModelPath.toString, e)
        }
    }
    
    
    /**
     * @return the name of the test model.
     */
    def getName() {
        return if (confidential) {
            "confidential"
        } else if (additionalProperties.containsKey("name")) {
            additionalProperties.get("name")
        } else {
            modelFileBasename
        }
    }
}
