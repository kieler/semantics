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
import de.cau.cs.kieler.kicool.KiCoolStandaloneSetup
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.classes.SourceTargetPair
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration
import java.io.IOException
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator

import static com.google.common.base.Preconditions.*

import static extension java.lang.String.format
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup
import de.cau.cs.kieler.kicool.ProcessorSystem
import org.eclipse.emf.common.EMFPlugin
import java.io.ByteArrayInputStream
import java.net.URL
import java.util.jar.JarFile
import java.io.Closeable
import com.google.common.io.ByteStreams
import java.nio.file.FileSystems
import java.nio.file.FileSystemNotFoundException
import java.nio.file.Files
import java.nio.file.Paths
import de.cau.cs.kieler.kicool.KiCoolPackage

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
    
    static def boolean isTemporarySystem(String id) {
        return temporarySystems.containsKey(id)
    }
    
    static def System getSystemByResource(String res) {
        checkArgument(modelsMap.containsKey(res), "No processor system registered for resource: " + res)
        modelsMap.get(res)
    }
    
    static def System getSystemById(String id) {
        if (temporarySystems.containsKey(id)) {
            return temporarySystems.get(id)
        }
        checkArgument(modelsIdMap.containsKey(id), "No processor system registered with id: " + id)
        modelsIdMap.get(id)
    }
    
    static def System getProcessorSystemModel(String locationString) {
        modelsMap.get(locationString)
    }
    
    static def loadRegisteredSystemModels() {
        val systems = getRegisteredSystems
        val modelList = <System> newArrayList
        modelsMap.clear
        modelsIdMap.clear
        for(system : systems) {
            try {
                val model = loadEObjectFromResourceLocation(system.key, system.value)
                modelList += model as System
                modelsMap.put(system.key, model as System) 
                modelsIdMap.put((model as System).id, model as System)
            } catch (Exception e) {
                java.lang.System.err.println("There was an error loading the registered processor system " + system.toString)
                e.printStackTrace
            }
        }
        modelList
    }

    static def getRegisteredSystems() {
        val resourceList = <Pair<String, Object>> newArrayList
        val closeables = <Closeable> newArrayList()
        
        KielerServiceLoader.load(ISystemProvider).forEach[provider |
            provider.systems.forEach[ system |
            	if (EMFPlugin.IS_ECLIPSE_RUNNING) {
	                resourceList += new Pair<String, Object>(system, provider.bundleId) 
            	} else {
            		// Ensure that the package has been registered
            		KiCoolPackage.eINSTANCE.eClass
            		val URL url = provider.class.classLoader.getResource(system)
            	    val stream = if (url.protocol == 'jar') {
                    	val file = new JarFile(url.file.substring(0, url.file.indexOf('!')).replaceFirst('^file:', ''))
        	            closeables += file
        	            new ByteArrayInputStream(ByteStreams.toByteArray(file.getInputStream(file.getEntry(system))))
                	} else {
                    	try {
	                        FileSystems.getFileSystem(url.toURI);
                    	} catch ( FileSystemNotFoundException e ) {
                        	closeables += FileSystems.newFileSystem(url.toURI, emptyMap)
	                    } catch ( Throwable t) {
    	                    // do nothing; chsch: on osx I get an IllegalArgumentException if the path is unequal to '/'
        	            }
            	        new ByteArrayInputStream(Files.readAllBytes(Paths.get(url.toURI)))
					}
    	            resourceList += new Pair<String, Object>(system, stream)
            	}
            ]
        ]
        
        for (c : closeables) {
        	c.close
        }
        
        resourceList       
    }
    
    static def EObject loadEObjectFromResourceLocation(String resourceLocation, Object access) throws IOException {
        val XtextResourceSet resourceSet = kicoolXtextInjector.getInstance(XtextResourceSet)
		val Resource resource = switch access {
			String: {
				val uri = URI.createPlatformPluginURI("/%s/%s".format(access, resourceLocation), false)
	        	resourceSet.getResource(uri, true)
	        }
			ByteArrayInputStream: {
				val uri = URI.createURI(resourceLocation)
				val res = resourceSet.createResource(uri)
				res.load(access, emptyMap)
				res
			}
		}
        if (resource !== null && resource.getContents() !== null && resource.getContents().size() > 0) {
            val validatorResults = kicoolXtextInjector.getInstance(IResourceValidator).validate(resource, CheckMode.ALL, CancelIndicator.NullImpl).filter[severity === Severity.ERROR].toList
            if (!validatorResults.empty) {
                println("KiCool WARNING: There are error markers in system located at " + access + ":" + resourceLocation + ": \n- " + validatorResults.map[message].join("\n- "))
            }
            val eobject = resource.getContents().get(0)
            return eobject
        }
        throw new IOException("Could not load resource '" + resourceLocation + "'!" + if (resource !== null && !resource.errors.nullOrEmpty) " Errors: " + resource.errors.map[toString].join(", ") else "");
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
    
}
