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

import com.google.inject.Guice
import de.cau.cs.kieler.core.services.KielerServiceLoader
import de.cau.cs.kieler.kicool.KiCoolPackage
import de.cau.cs.kieler.kicool.KiCoolStandaloneSetup
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.classes.SourceTargetPair
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration
import java.io.Closeable
import java.net.URL
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.common.EMFPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator

import static com.google.common.base.Preconditions.*

import static extension java.lang.String.format
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EObject

/**
 * Main class for the registration of systems and processors.
 * 
 * @author ssm
 * @kieler.design 2016-10-19 proposed 
 * @kieler.rating 2016-10-19 proposed yellow
 *
 */
class KiCoolRegistration {
    
    public static val EXTENSION_POINT_SYSTEM = "de.cau.cs.kieler.kicool.system"
    public static val EXTENSION_POINT_PROCESSOR = "de.cau.cs.kieler.kicool.processor"
    
    static val injector = Guice.createInjector(TracingIntegration.MODULE)
    static val kicoolXtextInjector = KiCoolStandaloneSetup.doSetup
    
    static val Map<String, System> modelsMap = new HashMap<String, System>()
    static val Map<String, System> modelsIdMap = new HashMap<String, System>()
    static val List<System> systemsModels = loadRegisteredSystemModels
    static val Map<String, System> temporarySystems = <String, System> newHashMap
    
    static val Map<String, Class<? extends Processor<?,?>>> processorMap = new HashMap<String, Class<? extends Processor<?,?>>>()
    static val Map<String, SourceTargetPair<?,?>> processorModelTypes = new HashMap<String, SourceTargetPair<?,?>>()
    static val List<Class<? extends Processor<?,?>>> processorList = loadRegisteredProcessors
    
    
    static def getInjector() {
        injector
    }
    
    static def getInstance(Class<?> clazz) {
        injector.getInstance(clazz);
    }
    
    static def getInstance(Object object) {
        injector.getInstance(object.getClass());
    }
    
    static def List<System> getSystemModels() {
        val allSystemModels = newArrayList
        if(!temporarySystems.isEmpty) {
            allSystemModels.addAll(temporarySystems.values)
        }
        allSystemModels.addAll(systemsModels)
        return allSystemModels
    }
    
    static def registerTemporarySystem(System system) {
        val id = system.id
        if(modelsIdMap.containsKey(id)) {
            throw new Exception("Cannot register temporary system '"+id+"'. Another system with this id is already registered.")
        }
        temporarySystems.put(id, system)
    }
    
    static def removeTemporarySystem(String id) {
        temporarySystems.remove(id)
    }
    
    static def boolean isTemporarySystem(String id) {
        return temporarySystems.containsKey(id)
    }
    
    static def System getSystemByResource(String res) {
        checkArgument(modelsMap.containsKey(res), "No processor system registered for resource: " + res)
        modelsMap.get(res)
    }
    
    static def boolean hasSystemWithId(String id) {
        return temporarySystems.containsKey(id) || modelsIdMap.containsKey(id)
    }
    
    static def System getSystemById(String id) {
        for(ts : temporarySystems.keySet) {
            if (ts.startsWith(id)) {
                return temporarySystems.get(ts)
            }
        }
        checkArgument(modelsIdMap.containsKey(id), "No processor system registered with id: " + id)
        modelsIdMap.get(id)
    }
    
    static def System getProcessorSystemModel(String locationString) {
        modelsMap.get(locationString)
    }
    
    static def loadRegisteredSystemModels() {
        val modelList = <System> newArrayList
        val closeables = <Closeable> newArrayList()
        modelsMap.clear
        modelsIdMap.clear
        
        val XtextResourceSet resourceSet = kicoolXtextInjector.getInstance(XtextResourceSet)

        // Get the registered systems from the service loader
        KielerServiceLoader.load(ISystemProvider).forEach[provider |
        	// Do stuff for each system in the current provider
            provider.systems.forEach[ system |
            	// Check if we run in eclipse or as a standalone application
            	var Resource resource = null
            	try {
                	if (EMFPlugin.IS_ECLIPSE_RUNNING) {
                		// Just let eclipse platform handle the loading of files
    					val uri = URI.createPlatformPluginURI("/%s/%s".format(provider.bundleId, system), false)
    		        	resource = resourceSet.getResource(uri, true)
                	} else {
                		// Ensure that the package has been registered im EMF
                		KiCoolPackage.eINSTANCE.eClass
                		val URL url = provider.class.classLoader.getResource(system)
                		val stream = url.openStream
                		closeables += stream
    //            	    val stream = if (url.protocol == 'jar') {
    //            	    	// Fetch data from inside the jar file
    //                    	val file = new JarFile(url.file.substring(0, url.file.indexOf('!')).replaceFirst('^file:', ''))
    //                    	// Mark the file for later closing
    //        	            closeables += file
    //        	            // Create the needed Stream from inside the jar
    //        	            new ByteArrayInputStream(ByteStreams.toByteArray(file.getInputStream(file.getEntry(system))))
    //                	} else {
    //                		// Access the file directly, given the url
    //                    	try {
    //                    		// Check if we already have some file system as a handler
    //	                        FileSystems.getFileSystem(url.toURI);
    //                    	} catch ( FileSystemNotFoundException e ) {
    //                    		// If no file system ready, create a new one, but mark for closure later
    //                        	closeables += FileSystems.newFileSystem(url.toURI, emptyMap)
    //	                    } catch ( Throwable t) {
    //    	                    // do nothing; chsch: on osx I get an IllegalArgumentException if the path is unequal to '/'
    //        	            }
    //        	            // Create the stream from the file system
    //            	        new ByteArrayInputStream(Files.readAllBytes(Paths.get(url.toURI)))
    //					}
    					val uri = URI.createURI(system)
    					resource = resourceSet.createResource(uri)
    					resource.load(stream, emptyMap)
                	}
                } catch (Exception e) {
                    e.printStackTrace
                }

		        if (resource !== null && resource.getContents() !== null && resource.getContents().size() > 0) {
		            val validatorResults = kicoolXtextInjector.getInstance(IResourceValidator).validate(resource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
		            if (!validatorResults.empty) {
		                println("KiCool WARNING: There are error markers in system located at " + provider.bundleId + ":" + system + ": \n- " + validatorResults.map[message].join("\n- "))
		            }
		            val model = resource.getContents().get(0) as System 
	                modelList += model
	                modelsMap.put(system, model) 
	                modelsIdMap.put(model.id, model)
		        } else {
		            java.lang.System.err.println("KiCool ERROR: Could not load resource '" + system + "'!" + if (resource !== null && !resource.errors.nullOrEmpty) " Errors: " + resource.errors.map[toString].join(", ") else "");
		        }
            ]
        ]
        
        modelList
    }

    static def getRegisteredSystems() {
        systemsModels;       
    }
    
    
    static def void addProcessor(Processor<?,?> processor) {
        processorMap.put(processor.id, processor.class as Class<? extends Processor<?,?>>)
        processorList += processor.class as Class<? extends Processor<?,?>>
    }
    
    static def loadRegisteredProcessors() {
        val processors = getRegisteredProcessors
        processorMap.clear
        processorModelTypes.clear
        for(processor : processors) {
            try {
                val instance = getInstance(processor) as Processor<?,?>
                processorMap.put(instance.getId, processor)
                processorModelTypes.put(instance.getId, instance.getSourceTargetTypes)
            } catch(Throwable e) {
                java.lang.System.err.println("KiCool: Cannot load processor " + processor.name + " (" + e + ")");
            }
        }
        processors
    }
    
    static def getRegisteredProcessors() {
        KielerServiceLoader.load(IProcessorProvider).map[
            it.processors
        ].flatten.toList
    }    
    
    static def getProcessorClass(String id) {
        processorMap.get(id)
    }
    
    static def getProcessorClasses() {
        processorList
    }
    
    static def getProcessorIds() {
        processorMap.keySet
    }
    
    static def getProcessorInstance(String id) {
        val clazz = processorMap.get(id)
        if (clazz === null) return null;
        getInstance(clazz) as Processor<?,?>
    }
    
    static def checkProcessorCompatibility(String source, String target) {
        if (processorModelTypes.keySet.contains(source) && processorModelTypes.keySet.contains(target)) {
            val sPair = processorModelTypes.get(source)
            val tPair = processorModelTypes.get(target)
            return tPair.source.class.isAssignableFrom(sPair.target.class)
        } 
        return true
    }
    
    static def getModelTypes(String id) {
        return processorModelTypes.get(id)
    }
    
    
    static def dispatch ProcessorReference getFirstProcessor(ProcessorReference processor) {
        return processor
    }

    static def dispatch ProcessorReference getFirstProcessor(ProcessorGroup processorGroup) {
        return processorGroup.processors.head.getFirstProcessor
    }

    static def dispatch ProcessorReference getFirstProcessor(ProcessorAlternativeGroup processorGroup) {
        return processorGroup.processors.head.getFirstProcessor
    }

    static def dispatch ProcessorReference getFirstProcessor(ProcessorSystem processorSystem) {
        return processorSystem.id.getSystemById.processors.getFirstProcessor
    }
    
    static def dispatch ProcessorReference getFirstProcessor(System system) {
        return system.processors.getFirstProcessor
    }
    
    
    static def dispatch ProcessorReference getLastProcessor(ProcessorReference processor) {
        return processor
    }

    static def dispatch ProcessorReference getLastProcessor(ProcessorGroup processorGroup) {
        return processorGroup.processors.last.getLastProcessor
    }

    static def dispatch ProcessorReference getLastProcessor(ProcessorAlternativeGroup processorGroup) {
        return processorGroup.processors.last.getLastProcessor
    }

    static def dispatch ProcessorReference getLastProcessor(ProcessorSystem processorSystem) {
        return processorSystem.id.getSystemById.processors.getLastProcessor
    }
    
    static def dispatch ProcessorReference getLastProcessor(System system) {
        return system.processors.getLastProcessor
    }
    
    static def String getResourcePath(Resource resource) {
        if (resource.URI.toString.startsWith("file")) {
            var s = resource.URI.toString
            return s.trimLastSegment 
        } else {
            val sl = resource.URI.segmentsList
            val nsl = sl.take(sl.length - 1).drop(1)
            return nsl.join("/")
        }
    }
    
    private static def String trimLastSegment(String s) {
        return s.replaceAll("(.+)/(.+?)$", "$1") 
    }
    
    static def System getProcessorSystemFromModelFile(ProcessorSystem processorSystem) {
        processorSystem.id.getProcessorSystemFromModelFile(processorSystem.eResource.getResourcePath)
    }

    static def System getProcessorSystemFromModelFile(String processorSystemId, String path) {
        val newURI = if (path.startsWith("file:"))
            URI.createURI(path + "/" + processorSystemId + '.kico')
            else URI.createPlatformResourceURI(path + "/" + processorSystemId + '.kico', false)   
        val XtextResourceSet resourceSet = kicoolXtextInjector.getInstance(XtextResourceSet)
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
        val res = resourceSet.createResource(newURI)
        try {
            res.load(resourceSet.loadOptions)
            val node = (res.getContents().get(0) as System)
            return node
        } catch (Exception e) {
            val rSystem = KiCoolRegistration.getSystemById(processorSystemId)
            return rSystem
        }         
    }    
    
    static def System getOwnSystem(ProcessorSystem processorSystem) {
        var EObject eObj = processorSystem.eContainer
        while ((!(eObj instanceof System)) && (eObj !== null)) {
            eObj = eObj.eContainer
        }
        return if (eObj instanceof System) eObj else null
    }
    
}
