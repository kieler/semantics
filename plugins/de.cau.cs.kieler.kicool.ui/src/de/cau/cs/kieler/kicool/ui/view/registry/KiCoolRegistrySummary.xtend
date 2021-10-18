/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view.registry

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.System
import java.util.Map
import java.util.Set
import de.cau.cs.kieler.kicool.ui.KiCoolUiModule
import org.eclipse.core.runtime.Platform
import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import org.eclipse.core.runtime.FileLocator
import java.io.BufferedReader
import java.io.InputStreamReader
import org.osgi.framework.Bundle
import java.net.URL

/**
 * @author ssm
 * @kieler.design 2018-06-01 proposed
 * @kieler.rating 2018-06-01 proposed yellow 
 *
 */
class KiCoolRegistrySummary {
    
    @Accessors List<System> systemList = <System> newLinkedList
    @Accessors Map<String, System> systemIdMap = <String, System> newHashMap   
    @Accessors List<System> temporarySystemsList = <System> newLinkedList
    @Accessors List<Class<? extends Processor<?,?>>> processorList = <Class<? extends Processor<?,?>>> newLinkedList
    @Accessors Map<String, Class<? extends Processor<?,?>>> processorIdMap = <String, Class<? extends Processor<?,?>>> newHashMap
    @Accessors Set<String> processorIds = <String> newHashSet
    @Accessors Multimap<String, String> bundleMap = HashMultimap.create
    @Accessors Multimap<String, System> fileMap = HashMultimap.create
    @Accessors Multimap<String, System> bundleMapPublic = HashMultimap.create

    def KiCoolRegistrySummary fetchAll() {
        fetchFromRegistry
        fetchBundles
        return this
    } 
    
    def KiCoolRegistrySummary fetchFromRegistry() {
        systemList.clear
        systemList.addAll(KiCoolRegistration.getSystemModels)
        
        temporarySystemsList.clear
        
        systemIdMap.clear
        systemList.forEach[ systemIdMap.put(id, it) ]
        
        processorList.clear
        processorList.addAll(KiCoolRegistration.getProcessorClasses)
        
        processorIdMap.clear
        processorList.forEach[ processorIdMap.put(name, it) ]
        
        processorIds.clear
        processorIds.addAll(KiCoolRegistration.getProcessorIds)
        
        for (s : systemList.filter[ it.public ]) {
            bundleMapPublic.put("PUBLIC", s)
        }
        
        
        return this
    }
    
    def KiCoolRegistrySummary fetchBundles() {
        val bundle = Platform.getBundle(KiCoolUiModule.BUNDLE_ID)
        val bundles = bundle.bundleContext.bundles
        
        for (b : bundles) {
            if (b.symbolicName.startsWith("de.cau.cs.kieler")) { 
                b.fetchFromBundle
            }
        }
                
        return this   
    }
    
    def KiCoolRegistrySummary fetchFromBundle(Bundle bundle) {
        var urls = bundle.findEntries("/src", "*.java", true)
        if (urls === null) return this;
        while (urls.hasMoreElements) {
            val u = urls.nextElement
            val file = FileLocator.toFileURL(u)
            val content = file.getFileContents     
            content.checkForSystemIds(file, bundle)       
        }            
        urls = bundle.findEntries("/src", "*.xtend", true)
        if (urls === null) return this;
        while (urls.hasMoreElements) {
            val u = urls.nextElement
            val file = FileLocator.toFileURL(u)
            val content = file.getFileContents     
            content.checkForSystemIds(file, bundle)       
        }            
        
        return this
    }
    
    protected def void checkForSystemIds(String s, URL file, Bundle bundle) {
        for (sys : systemIdMap.keySet) {
            
            if (s.contains("\"" + sys + "\"")) {
                val f = file.path.substring( file.path.lastIndexOf('/')+1)
                
                fileMap.put(f, systemIdMap.get(sys))
                bundleMap.put(bundle.symbolicName, f)
            }
            
        }
    }
    
    protected def String getFileContents(URL file) {
        val content = new StringBuilder
        
        val istr = file.openStream
        
        val reader = new BufferedReader(new InputStreamReader(istr, "UTF-8"))
    
        try {
            var String line
            while ((line = reader.readLine()) !== null) {
                content.append(line)
            }
        } finally {
            reader.close()
        }
        
        return content.toString
    }
    
}