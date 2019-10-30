/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.deploy

import com.google.common.collect.LinkedListMultimap
import de.cau.cs.kieler.annotations.Pragmatable
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.environments.Environment
import java.io.File
import java.io.PrintStream
import java.nio.file.Files
import java.util.List
import java.util.Map
import java.util.Set
import java.util.stream.Collectors

import static extension com.google.common.collect.Sets.*
import static extension java.lang.String.format

/**
 * @author als
 */
class AdditionalResources {
    
    public static val IProperty<Map<File, Set<Type>>> RESOURCES = 
        new Property<Map<File, Set<Type>>>("de.cau.cs.kieler.kicool.deploy.resources.all", null)
    public static val IProperty<Map<File, File>> RELOCATION = 
        new Property<Map<File, File>>("de.cau.cs.kieler.kicool.deploy.resources.relocation", null)
    
    static val RESOURCE_PRAGMA_NAME = "resource"
    // All resource types that should be relocated to kieler-gen
    static val DO_RELOCATE = newHashSet(Type.COMPILE, Type.SIMULATION)
    
    enum Type {
        COMPILE, // include in compilation, copied into kieler-gen
        INCLUDE, // set as include directory in gcc
        LIBRARY, // set as library directory in gcc
        // TODO support?
        // CLASSPATH, // set as class path directory in javac and jar
        SIMULATION // available on cwd during simulation
    }
    
    static def void collectAdditionalResources(Environment environment, PrintStream logger) {
        val pinf = ProjectInfrastructure.getProjectInfrastructure(environment)
        
        logger.println("== Additional Resources ==")
        
        val resourceDefs = environment.getPropertyAndSetIfAbsent(RESOURCES, newHashMap)
        
        // collect all
        val cc = environment.getProperty(Environment.COMPILATION_CONTEXT)
        for (proc : cc.processorInstances.filter[sourceModel instanceof Pragmatable]) {
            for (pragma : (proc.sourceModel as Pragmatable).pragmas) {
                val types = newHashSet
                if (RESOURCE_PRAGMA_NAME.equalsIgnoreCase(pragma.name)) {
                    types += Type.COMPILE
                } else if (pragma.name?.contains("-")) {
                    val parts = pragma.name.split("-")
                    if (RESOURCE_PRAGMA_NAME.equalsIgnoreCase(parts.head)) {
                        for (ptype : parts.drop(1)) {
                            for (etype : Type.values) {
                                if (etype.name.equalsIgnoreCase(ptype)) {
                                    types += etype
                                }
                            }
                        }
                    }
                }
                if (!types.empty) {
                    if (pragma instanceof StringPragma) {
                        for (path : pragma.values) {
                            if (!resourceDefs.containsKey(path)) {
                                resourceDefs.put(new File(path), types)
                            } else {
                                resourceDefs.get(path).addAll(types)
                            }
                        }
                    }
                }
            }
        }
        
        if (resourceDefs.empty) {
            logger.println("Resources found: none")
            return
        }
        
        // Resolve relative to model file
        if (!pinf.modelFile.exists) {
            logger.println("Cannot find model location to resolve resources against. (%s)".format(pinf.modelFile))
        } else {
            val validResources = newHashMap
            for (resDef : resourceDefs.keySet) {
                if (resDef.absolute && resDef.exists) {
                    validResources.put(resDef, resourceDefs.get(resDef))
                } else {
                    val rel = new File(pinf.modelFile.canonicalFile.parentFile, resDef.path)
                    if (rel.exists) {
                        validResources.put(rel, resourceDefs.get(resDef))
                    } else if (resDef.absolute) {
                        logger.println("Cannot find resource: " + resDef)
                    } else {
                        logger.println("Cannot find resource (relative to model file): " + rel)
                    }
                }
            }
            if (validResources.size !== resourceDefs.size) {
                logger.println("All missing resources will be excluded from processing!")
            }
            resourceDefs.clear
            resourceDefs.putAll(validResources)
        }
        
        val relocation = newHashMap
        logger.println("Resources found:")
        for (entry : resourceDefs.entrySet) {
            logger.println("[%s]: %s".format(entry.value.map[name.toLowerCase].join(", "), entry.key))
            // Compute relocation
            if (!entry.value.intersection(DO_RELOCATE).empty) {
                relocation.put(entry.key, new File(pinf.generatedCodeFolder, entry.key.name))
            }
        }
        environment.setProperty(RELOCATION, relocation)
    }
    
    static def Map<String, String> getAdditionalResourcesToCopy(Environment environment) {
        val genFolder = ProjectInfrastructure.getProjectInfrastructure(environment).generatedCodeFolder
        val copy = newHashMap
        val ressources = environment.getProperty(RELOCATION)
        if (ressources !== null && !ressources.empty) {
            for (res : ressources.entrySet) {
                copy.put(res.key.canonicalFile.toURI.toString, genFolder.toPath.relativize(res.value.toPath).toString)
            }
        }
        return copy
    }
       
    static def List<String> getAdditionalResourcesToClear(Environment environment) {
        val genFolder = ProjectInfrastructure.getProjectInfrastructure(environment).generatedCodeFolder
        return (environment.getProperty(RELOCATION)?:emptyMap).values.map[genFolder.toPath.relativize(it.toPath).toString].toList
    }
       
    static def List<File> getAdditionalResources(Environment environment, Type type, boolean flatten) {
        val files = newArrayList
        val res = environment.getProperty(RESOURCES)?:emptyMap
        if (DO_RELOCATE.contains(type)) {
            val reloc = environment.getProperty(RELOCATION)?:emptyMap
            files += res.entrySet.filter[value.contains(type)].map[
                if (reloc.containsKey(it.key)) {
                    reloc.get(it.key)
                } else {
                    it.key
                }
            ]
        } else {
            files += res.entrySet.filter[value.contains(type)].map[key]
        }
        if (flatten) {
            val flattened = LinkedListMultimap.<File, File>create
            for (dir : files.filter[directory]) {
                flattened.putAll(dir, Files.walk(dir.toPath).filter[
                    Files.isRegularFile(it)
                ].map[
                    it.toFile
                ].collect(Collectors.toList))
            }
            for (dir : flattened.keySet) {
                val flatFiles = flattened.get(dir)
                val idx = files.indexOf(dir)
                files.remove(idx)
                for (file : flatFiles.reverseView) {
                    files.add(idx, file)
                }
            }
        }
        return files
    }
    
}