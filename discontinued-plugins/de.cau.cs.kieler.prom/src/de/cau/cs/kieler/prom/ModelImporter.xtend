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
package de.cau.cs.kieler.prom

import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.XtextResourceSet

/** 
 * Auxilary class to load EObjects and handle ResourceSets.
 * 
 * @author aas
 */
class ModelImporter {
    /**
     * Loads an EObject from a file without cross-references.
     * 
     * @param file The file containing the model
     * @return the loaded EObject
     */
    public static def EObject load(IFile file) {
        return load(file, new XtextResourceSet())
    }
    
    /**
     * Loads an EObject from a file using the given resource set to resolve cross-references.
     * 
     * @param file The file containing the model
     * @param resourceSet The resource in which the file will be loaded
     * @return the loaded EObject
     */
    public static def EObject load(IFile file, ResourceSet resourceSet) {
        val resource = getResource(file, resourceSet)
        if(resource != null) {
            reload(resource, resourceSet)
            if(!resource.getContents().isEmpty) {
                return resource.getContents().get(0)
            }
        }
        return null
    }
    
    /**
     * Reloads the the contents of a resource to reflect changes in the file.
     * 
     * @param res The resource to be reloaded
     * @param resourceSet A resourceSet of which the load options are used
     * 
     */
    public static def void reload(Resource res, ResourceSet resourceSet) {
        res.unload()
        res.load(resourceSet.loadOptions)
    }
    
    /**
     * Loads a resource from a file using the resource set and adds it to the given resource set.
     * 
     * @param file The file to be loaded
     * @param resourceSet The resource set
     * @return the loaded resource
     */
    public static def Resource getResource(IFile file, ResourceSet resourceSet) {
        val uri = URI.createFileURI(file.location.toOSString)
        try {
            return resourceSet.getResource(uri, true)
        } catch(Exception e) {
            return null
        }
    }
    
    /**
     * Returns the EObject from the resource set that corresponds to the given file.
     * 
     * @param file The file
     * @param resourceSet The resource set
     * @return the EObject from the resource set that corresponds to the given file
     *         or null if no such file is present in the resource set. 
     */
    public static def EObject getEObject(IFile file, ResourceSet resourceSet) {
        val res = getResource(file, resourceSet)
        val content = res?.contents
        if(!content.isNullOrEmpty) {
            return content.get(0)
        } else {
            return null
        }
    }
    
    /**
     * Returns the underlying file for a resource.
     * 
     * @param eResource the resource
     * @return the file that is represented by the resource or null if none.
     */
    public static def IFile toPlatformResource(Resource eResource) {
        if(eResource === null) {
            return null
        }
        val eUri = eResource.URI;
        var IFile file
        if(eUri.isPlatform) {
            file = ResourcesPlugin.workspace.root.getFile(new Path(eUri.toPlatformString(true)))
        } else if(eUri.isFile) { 
            val path = new Path(eUri.toFileString());
            file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
        }
        return file
    }
}
