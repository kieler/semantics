/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.registration

import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.ecore.resource.Resource
import java.io.IOException
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.osgi.framework.Bundle
import java.net.URL
import de.cau.cs.kieler.kicool.KiCoolActivator
import org.eclipse.core.runtime.FileLocator

/**
 * @author ssm
 *
 */
class KiCoolRegistration {
    
    private static val EXTENSION_POINT_SYSTEM = "de.cau.cs.kieler.kicool.system"
    private static val systemsModels = loadRegisteredSystemModels
    
    public static def getSystemModels() {
        systemModels
    }
    
    public static def loadRegisteredSystemModels() {
        val systems = getRegisteredSystems
        val modelList = <EObject> newArrayList
        for(system : systems) {
            modelList += loadEObjectFromResourceLocation(system)
        }
        modelList
    }

    public static def getRegisteredSystems() {
        val resourceList = <String> newArrayList
        val systems = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_SYSTEM);
        for(system : systems) {
            resourceList += system.getAttribute("system")
        }
        resourceList       
    }
    
    public static def EObject loadEObjectFromResourceLocation(String resourceLocation) throws IOException {
        
        val Bundle bundle = Platform.getBundle(KiCoolActivator.PLUGIN_ID);
        val URL bundleFileUrl = bundle.getEntry(resourceLocation.toString()); 
        val absolutePath = FileLocator.resolve(bundleFileUrl)       
        
        val uri = URI.createFileURI(absolutePath.toString)
        val Resource resource = new ResourceSetImpl().createResource(uri);
        resource.load(Collections.EMPTY_MAP);
        if (resource != null && resource.getContents() != null && resource.getContents().size() > 0) {
            val eobject = resource.getContents().get(0)
            return eobject
        }
        throw new IOException("Could not load resource '" + resourceLocation + "'!");
    }    
}