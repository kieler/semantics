/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.launchconfig

import java.util.List
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map
import java.util.HashMap

/** 
 * @author aas
 */
class SCTCompilationData {

    new() {
    }

    new(String filePath, String fileName) {
        this.path = filePath
        this.name = fileName
    }

    @Accessors
    private var String path = ""
    @Accessors
    private var String name = ""
    @Accessors
    private var String targetLanguage = ""
    @Accessors
    private var String targetPath = ""
    @Accessors
    private var String targetTemplate = ""

    // Wrapper code
    @Accessors
    private var String wrapperCodeTemplate = ""
    @Accessors
    private var String wrapperCodeTargetPath = ""
    @Accessors
    private var String wrapperCodeSnippetsDirectory = ""
    
    static def List<SCTCompilationData> loadAllFromConfiguration(ILaunchConfiguration configuration){
        val List<String> sctFiles = configuration.getAttribute(LaunchConfiguration.ATTR_SCT_FILES, #[])
        val List<SCTCompilationData> datas = newArrayList()
        sctFiles.forEach [
            val data = new SCTCompilationData()
            data.path = it
            data.loadAttributesFromMap(configuration.getAttribute(data.path, new HashMap()))
            
            datas += data
        ]
        
        return datas
    }
    
    def loadAttributesFromMap(Map<String, String> map) {
        val classObject = typeof(SCTCompilationData)
        for(f : classObject.declaredFields){
            f.set(this, map.get(f.name))
        }
    }
    
    def Map<String, String> getAttributeMap(){
        val map = new HashMap<String, String>()
        val classObject = typeof(SCTCompilationData)
        for(f : classObject.declaredFields){
            map.put(f.name, f.get(this).toString())
        }
        return map
    }
}
