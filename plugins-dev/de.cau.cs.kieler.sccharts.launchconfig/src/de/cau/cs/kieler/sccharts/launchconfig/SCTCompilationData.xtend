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
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import org.eclipse.core.variables.VariablesPlugin

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
    
    static def List<SCTCompilationData> loadAllFromConfiguration(ILaunchConfiguration configuration){
        val List<String> sctFiles = configuration.getAttribute(LaunchConfiguration.ATTR_SCT_FILES, #[])
        val List<SCTCompilationData> datas = newArrayList()
        sctFiles.forEach [
            val data = SCTCompilationData.fromJSON(it)
            if(data != null)
                datas += data
        ]
        
        return datas
    }
    
    def String toJSON(){
        val gson = new Gson()
        return gson.toJson(this)
    }
    
    static def SCTCompilationData fromJSON(String json){
        val gson = new Gson()
        try{
            val data = gson.fromJson(json, typeof(SCTCompilationData))
            return data
        }catch(JsonSyntaxException e){
            println("Malformed JSON syntax:"+json)
            return null
        }
    } 
}
