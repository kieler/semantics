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

import com.google.common.io.Files
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.launchconfig.common.ModelImporter
import de.cau.cs.kieler.sccharts.launchconfig.common.SCTCompilationData
import freemarker.template.Template
import java.io.File
import java.io.FileFilter
import java.io.FileWriter
import java.io.StringWriter
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.core.resources.IProject
import org.freemarker.FreeMarkerPlugin

import static org.freemarker.FreeMarkerPlugin.*

/**
 * @author aas
 * 
 */
class WrapperCodeGenerator {

    private IProject project
    private String wrapperCodeTemplate = ""
    private String wrapperCodeSnippetDirectory = ""

    private File targetLocation
    private File templateLocation
    private File snippetDirectoryLocation

    private String scchartName = ""

    new(IProject project, String wrapperCodeTemplate, String wrapperCodeSnippetDirectory, String targetLocation) {
        this.project = project
        this.wrapperCodeTemplate = wrapperCodeTemplate
        this.wrapperCodeSnippetDirectory = wrapperCodeSnippetDirectory

        this.targetLocation = new File(targetLocation)
        this.templateLocation = new File(project.location + "/" + wrapperCodeTemplate)
        this.snippetDirectoryLocation = new File(wrapperCodeSnippetDirectory)
        
        // If the snippet directory is not an absolute path for itself,
        // We interpret it as a directory in the project.
        if(!snippetDirectoryLocation.isAbsolute)
            this.snippetDirectoryLocation = new File(project.location + "/" + wrapperCodeSnippetDirectory)
    }

    public def generateWrapperCode(SCTCompilationData... datas) {

        // Check consistency of paths
        if (wrapperCodeTemplate != "" && wrapperCodeSnippetDirectory != "") {

            val templateWithMacroCalls = getTemplateWithMacroCalls(datas)
            System.err.println(templateWithMacroCalls)
            
            processAndSaveOutput(templateWithMacroCalls)
        }
    }

    private def String getTemplateWithMacroCalls(SCTCompilationData... datas) {
        val List<WrapperCodeAnnotationData> annotationDatas = newArrayList()

        for (data : datas) {
            getWrapperCodeAnnotationData(data, annotationDatas)
        }

        // Create template macro calls from annotations
        val map = getMacroCalls(annotationDatas)
        map.put("scchart_name", scchartName)

        // Inject macro calls in input template
        FreeMarkerPlugin.templateDirectory = project.location.toOSString()
        val template = FreeMarkerPlugin.configuration.getTemplate(wrapperCodeTemplate)

        val writer = new StringWriter();
        template.process(map, writer)

        return writer.toString()
    }

    private def processAndSaveOutput(String templateWithMacroCalls) {
        // Set the snippets directory to implicitly load the macro definitions
        FreeMarkerPlugin.templateDirectory = snippetDirectoryLocation.absolutePath

        // Add implicit include of assignment macros such as <@init> and <@output>
        FreeMarkerPlugin.stringTemplateLoader.putTemplate("assignmentMacros", FreeMarkerPlugin.assignmentMacros)
        FreeMarkerPlugin.configuration.addAutoInclude("assignmentMacros")

        // Add implicit include of snippet definitions
        val List<File> snippetFiles = newArrayList()
        getFilesRecursive(snippetDirectoryLocation, snippetFiles)
        snippetFiles.forEach [
            // FreeMarker needs paths relative to the template directory.
            // We calculate this via the URI class.
            val relativeURI = snippetDirectoryLocation.toURI().relativize(it.toURI())
            FreeMarkerPlugin.configuration.addAutoInclude(relativeURI.getPath())
        ]

        // Process template with macro calls and now implicitly loaded snippet definitions.
        val template = new Template("tmp", templateWithMacroCalls, FreeMarkerPlugin.configuration)

        // Process template and write output directly to target file
        template.process(newHashMap(), new FileWriter(targetLocation))
    }

    private def getMacroCalls(WrapperCodeAnnotationData... annotationDatas) {
        val map = new HashMap<String, String>()
        var outputs = ""
        var inputs = ""
        var inits = ""
        val alreadyInitialized = new ArrayList<WrapperCodeAnnotationData>()
        for (data : annotationDatas) {
            // We initialize every annotation only once
            // although the same annotation might be used twice: as input and output.
            if (!alreadyInitialized.contains(data)) {
                alreadyInitialized.add(data)
                inits += getAssignments(data.varName, data.varType);
                inits += getInitAnnotationMacro(data);
            }

            if (data.isInput) {
                inputs += getAssignments(data.varName, data.varType);
                inputs += getInputAnnotationMacro(data);
            }

            if (data.isOutput) {
                outputs += getAssignments(data.varName, data.varType);
                outputs += getOutputAnnotationMacro(data);
            }
        }
        map.put("inits", inits)
        map.put("outputs", outputs)
        map.put("inputs", inputs)
        return map
    }

    private static def String getAssignments(String varname, String vartype) {
        return "<#assign varname = '" + varname + "' " + "vartype = '" + vartype + "'" +
            " init_snippet ='' output_snippet = '' input_snippet = '' />\n";
    }

    private static def String getInitAnnotationMacro(WrapperCodeAnnotationData data) {
        return getAnnotationMacro(data) + "${init_snippet!}\n";
    }

    private static def String getInputAnnotationMacro(WrapperCodeAnnotationData data) {
        return getAnnotationMacro(data) + "${input_snippet!}\n";
    }

    private static def String getOutputAnnotationMacro(WrapperCodeAnnotationData data) {
        return getAnnotationMacro(data) + "${output_snippet!}\n";
    }

    private static def String getAnnotationMacro(WrapperCodeAnnotationData data) {        
        var txt = ""
        if(data.ignoreNonExistingSnippet)
            txt += '''<#if «data.name»??>'''
            
        txt += '''<@«data.name» '''
        for (String arg : data.arguments)
            txt += ''''«arg»' '''
        
        txt += '''/>''';
        
        if(data.ignoreNonExistingSnippet)
            txt += "\n\n"+'''</#if><#t>'''
        
        return txt
    }

    def void getFilesRecursive(File folder, List<File> list) {
        // Filter that accepts directories and files with extension ftl
        val ftlFilter = new FileFilter() {
            override accept(File file) {
                return file.isDirectory || Files.getFileExtension(file.name).toLowerCase == "ftl"
            }
        }

        // Iterate over files in the folder recursively.
        // Add every file that is not filtered to the list.
        for (fileEntry : folder.listFiles(ftlFilter)) {
            if (fileEntry.isDirectory()) {
                getFilesRecursive(fileEntry, list);
            } else {
                list.add(fileEntry)
            }
        }
    }

    /**
     * Generates wrapper code with the settings from the launch configuration.
     * This is done independently from the sct compilation in a separate job.
     */
    private def getWrapperCodeAnnotationData(SCTCompilationData sctData,
        List<WrapperCodeAnnotationData> annotationDatas) {

        val model = ModelImporter.get(sctData.path)

        var wrapperCodeGenerationEnabled = false

        if (model != null && model instanceof State) {
            // Iterate over model to get all annotations
            val root = (model as State)
            scchartName = root.id
            for (decl : root.declarations) {
                // Only consider annotations of inputs and outputs.
                if (decl.input || decl.output) {
                    for (annotation : decl.annotations){    
                        annotationDatas += new WrapperCodeAnnotationData(decl, annotation)        
                    }
                }
            }
        }
    }
}