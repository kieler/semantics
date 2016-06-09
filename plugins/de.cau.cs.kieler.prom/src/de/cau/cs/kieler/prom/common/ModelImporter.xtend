/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.common

import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

/** 
 * Auxilary class to load an EObject from a fully qualified file path.
 * 
 * @author aas
 */
class ModelImporter {
    
    /**
     * Loads an EObject from a file path without cross-references.
     * 
     * Other plug-ins have to take care that they register their DSL for EMF.
     * 
     * @param fullPath The fully qualified path to a file
     * @return the loaded EObject
     */
    public static def EObject load(String fullPath) {
        return load(fullPath, false)
    }
    
    /**
     * Loads an EObject from a file path, optionally with cross-references to other models resolved.
     * Resolving of cross-references works only if the referenced files are in the same project
     * and have the same file extension.
     * 
     * @param fullPath The fully qualified path to a file that shall be loaded
     * @param resolveReferences Flag that indicated whether cross-references to other files in the project shall be resolved
     * @return the loaded EObject 
     */
    public static def EObject load(String fullPath, boolean resolveReferences) {
        
        val uri = URI.createFileURI(fullPath);
        
        val resourceSet = new XtextResourceSet();
        
        // Collect possibly referenced resources and resolve references
        if(resolveReferences){
            resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
            collectPossiblyReferencedResources(fullPath, resourceSet)
        }

        // Get the resource
        val resource = resourceSet.getResource(uri, true);
        
        // Return EObject from resource
        if(!resource.getContents().isEmpty) {
            return resource.getContents().get(0)
        } else {
            return null
        }
    }
    
    /**
     * Searches in the project of the model file for files with the same file extension.
     * All findings are added to the resource set, such that they can be resolved when loading the model file.
     * 
     * @param modelFileLocation Fully qualified path to a model file
     * @param resourceSet The ResourceSet to which possible references should be added
     */
    private static def collectPossiblyReferencedResources(String modelFileLocation, ResourceSet resourceSet) {      
        val modelFile = getFile(modelFileLocation)
        if(modelFile != null && modelFile.exists) {
            val fileExtensionOfModelFiles = modelFile.fileExtension
            // Search in project for other files with the model file extension
            // and add them to the resource set.
            val project = modelFile.project
            for(IResource res : project.members) {
                val fileExtension = res.fileExtension
                if(fileExtension != null && fileExtension.equals(fileExtensionOfModelFiles) ){
                    val location = res.location.toOSString
                    // Don't add resource of model file itself
                    if(!modelFileLocation.equals(location)) {
                        val uri = URI.createFileURI(res.location.toOSString)
                        resourceSet.getResource(uri, true)
                    }
                }
            }
        }
    }
    
    /**
     * Creates a file handle to a resource in the Eclipse workspace from an absolute file path.
     * 
     * @param fullPath The fully qualified file path to a resource in the Eclipse workspace.
     * @return the loaded file handle or null if the file path is invalid
     */
    private static def IFile getFile(String fullPath) {
        val uri = new File(fullPath).toURI();
        val files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(uri)
        if (files.isEmpty)
            return null
        else
            return files.get(0)
    }
}
