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

import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.xtend.lib.annotations.Accessors

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
    private var String targetLanguage = "Java"
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

    def Map<String, String> getPropertyMap() {
        return #{"path" -> path, "name" -> name, "targetLanguage" -> targetLanguage,
            "targetPath" -> targetPath, "targetTemplate" -> targetTemplate,
            "wrapperCodeTemplate" -> wrapperCodeTemplate, "wrapperCodeTargetPath" -> wrapperCodeTargetPath,
            "wrapperCodeSnippetsDirectory" -> wrapperCodeSnippetsDirectory}
    }
    
    def loadFromPropertyMap(Map<String, String> map) {
        path = map.get("path")
        name = map.get("name")
        targetLanguage = map.get("targetLanguage")
        targetPath = map.get("targetPath")
        targetTemplate = map.get("targetTemplate")
        wrapperCodeTemplate = map.get("wrapperCodeTemplate")
        wrapperCodeTargetPath = map.get("wrapperCodeTargetPath")
        wrapperCodeSnippetsDirectory = map.get("wrapperCodeSnippetsDirectory")
    }
    
    static def List<SCTCompilationData> loadAllFromConfiguration(ILaunchConfiguration configuration){
        val List<String> sctFiles = configuration.getAttribute(LaunchConfiguration.ATTR_SCT_FILES, #[])
        val List<SCTCompilationData> datas = newArrayList()
        sctFiles.forEach [
            val Map<String, String> map = configuration.getAttribute(LaunchConfiguration.ATTR_SCT_FILE + "." + it,
                new HashMap())

            if (map != null && !map.isEmpty) {
                val data = new SCTCompilationData()
                data.loadFromPropertyMap(map)
                datas += data
            }

        ]
        return datas
    }
}
