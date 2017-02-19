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
import org.eclipse.emf.ecore.resource.Resource
import java.io.IOException
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.osgi.framework.Bundle
import java.net.URL
import de.cau.cs.kieler.kicool.KiCoolActivator
import java.util.Map
import java.util.HashMap
import java.util.List
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.Processor
import com.google.inject.Guice

/**
 * @author ssm
 *
 */
class KiCoolRegistration {
    
    public static val EXTENSION_POINT_SYSTEM = "de.cau.cs.kieler.kicool.system"
    public static val EXTENSION_POINT_PROCESSOR = "de.cau.cs.kieler.kicool.processor"
    
    private static val injector = Guice.createInjector
    
    private static val Map<String, System> modelsMap = new HashMap<String, System>()
    private static val List<EObject> systemsModels = loadRegisteredSystemModels
    
    private static val Map<String, Processor> processorMap = new HashMap<String, Processor>()
    private static val List<Processor> processorList = loadRegisteredProcessors
    
    
    static def getInstance(Object object) {
        injector.getInstance(object.getClass());
    }
    
    static def getSystemModels() {
        systemsModels
    }
    
    static def System getProcessorSystemModel(String locationString) {
        modelsMap.get(locationString) as System
    }
    
    static def loadRegisteredSystemModels() {
        val systems = getRegisteredSystems
        val modelList = <EObject> newArrayList
        modelsMap.clear
        for(system : systems) {
            val model = loadEObjectFromResourceLocation(system)
            modelList += model
            modelsMap.put(system, model as System) 
        }
        modelList
    }

    static def getRegisteredSystems() {
        val resourceList = <String> newArrayList
        val systems = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_SYSTEM);
        for(system : systems) {
            resourceList += system.getAttribute("system")
        }
        resourceList       
    }
    
    static def EObject loadEObjectFromResourceLocation(String resourceLocation) throws IOException {
        
        val Bundle bundle = Platform.getBundle(KiCoolActivator.PLUGIN_ID);
        val URL bundleFileUrl = bundle.getEntry(resourceLocation.toString()); 
        
        val uri = URI.createURI(bundleFileUrl.toString, false)
        val Resource resource = new ResourceSetImpl().createResource(uri);
        resource.load(Collections.EMPTY_MAP);
        if (resource != null && resource.getContents() != null && resource.getContents().size() > 0) {
            val eobject = resource.getContents().get(0)
            return eobject
        }
        throw new IOException("Could not load resource '" + resourceLocation + "'!");
    }
    
    
    static def loadRegisteredProcessors() {
        val processors = getRegisteredProcessors
        processorMap.clear
        for(processor : processors) {
            processorMap.put(processor.name, processor)
        }
        processors
    }
    
    static def getRegisteredProcessors() {
        val resourceList = <Processor> newArrayList
        val processors = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_PROCESSOR);
        for(processor : processors) {
            try {
                resourceList += processor.createExecutableExtension("class") as Processor
            } catch(Exception e) {
                java.lang.System.err.println("KiCool: Cannot load processor " + processor.name);
            }
        }
        resourceList       
    }    
    
    static def getProcessor(String id) {
        processorMap.get(id)
    }
    
    static def getProcessors() {
        processorList
    }
}