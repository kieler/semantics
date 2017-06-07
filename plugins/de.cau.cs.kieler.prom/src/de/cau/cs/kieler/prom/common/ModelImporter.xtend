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

import org.eclipse.core.resources.IFile
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
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
    public static def EObject load(IFile file) {
        return load(file, new XtextResourceSet())
    }
    
    public static def EObject load(IFile file, ResourceSet resourceSet) {
        val resource = getResource(file, resourceSet)
        resource.unload()
        resource.load(#{})
        
        if(!resource.getContents().isEmpty) {
            return resource.getContents().get(0)
        } else {
            return null
        }
    }
    
    public static def Resource getResource(IFile file, ResourceSet resourceSet) {
        val uri = URI.createFileURI(file.location.toOSString)
        val resource = resourceSet.getResource(uri, true)
        return resource
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
//    public static def EObject load(IFile file, boolean resolveReferences) {
//        
//        val injector = new SctStandaloneSetup().createInjectorAndDoEMFRegistration();
//        val resourceSet = injector.getInstance(typeof(XtextResourceSet))
//
//        // Collect possibly referenced resources and resolve references
//        if(resolveReferences){
//            resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
////            System.err.println("\tCollecting possibly referenced resources")
////            collectPossiblyReferencedResources(getFile(fullPath), resourceSet)
////            System.err.println("\tDone!")
//        }
//
//        return load(file, resourceSet)
//    }
}
