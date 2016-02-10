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

import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

/** 
 * Auxilary class to load an EObject from a fully qualified file path.
 * 
 * @author aas
 */
class ModelImporter {
    
//    @Inject
//    private ResourceDescriptionsProvider resourceDescriptionsProvider;
    
    /**
     * Loads an EObject from a file path.
     * Other plug-ins have to take care that they register their DSL for EMF.
     * 
     * @param fullPath The fully qualified path to a file
     * @return the loaded EObject
     */
    public def EObject get(String fullPath) {
        
        val uri = URI.createFileURI(fullPath);
        
        val resSet = new XtextResourceSet();
        resSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
        
        // Get the resource
        val resource = resSet.getResource(uri, true);

        EcoreUtil2.resolveAll(resource)

//        resSet.getResource(URI.createFileURI("/home/aas/Proggen/Java/kieler-dev/runtime-KIELERTest/Ref/Referenced1062.sct"), true);
//        collectReferencedResources(resource)
//        collectReferencedResources2(resource)
        
        if(!resource.getContents().isEmpty) {
            return resource.getContents().get(0)
        } else {
            return null
        }
    }
    
//    public static def collectReferencedResources(Resource resource) {
//        // get the resource set
//        val resourceSet = resource.getResourceSet();
//
//        // search for other resources containing referenced objects
//        val resources = new ArrayList<Resource>();
//        resources.add(resource);
//        for(r : resources){
//            for(var contents = r.getAllContents(); contents.hasNext(); ) {
//                for(Object refObject : contents.next().eCrossReferences()) {                    
//                    val eObject = refObject as EObject;
//                    val otherResource = eObject.eResource();
//                    if(otherResource != null && !resources.contains(otherResource)){
//                        System.err.println("referenced Resource:"+otherResource)
//                        
////                        resources.add(otherResource);
//                    }
//                }
//            }
//        }
//    }
//    
//    public def collectReferencedResources2(Resource resource) {
//        val resourceSet = resource.getResourceSet();
//        println(resourceDescriptionsProvider)
//        if(resourceDescriptionsProvider == null){
//            System.err.println("Not injected")
//            resourceDescriptionsProvider = new ResourceDescriptionsProvider();
//        }
//        val iRD = resourceDescriptionsProvider.getResourceDescriptions(resourceSet);
//        System.err.println("YAY")
//        
//        for(IResourceDescription resourceDescription : iRD.getAllResourceDescriptions()) {
//            System.out.println(resourceDescription.getReferenceDescriptions()); //Prints an empty set
//            val iRefD = resourceDescription.getReferenceDescriptions();
//            for(ref : iRefD) {
//                System.out.println(ref);
//            }
//        }
//    }
}
