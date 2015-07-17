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
 * This class generates wrapper code for sct models.
 * Annotations in the SCT file are mapped to macro calls which are injected in the input template.
 * Afterwards the macro calls are evaluated by the template engine and the wrapper code which they define is inserted.
 * 
 * @author aas
 * 
 */
class WrapperCodeGenerator {

    /**
     * The project of the SCT launch configuration which started the generator.
     */
    private IProject project


    
    /**
     * The file path to the input template for wrapper code generation.
     * Wrapper code will be inserted in this file's text and the output is saved in the sct build directory.
     */
    private String wrapperCodeTemplate = ""
    
    /**
     * The path to a directory with FreeMarker template files.
     * Each file may contain several macro definitions for wrapper code generation.
     */
    private String wrapperCodeSnippetDirectory = ""



    /**
     * A file handle from the fully qualified path where the generated output will be saved.  
     */
    private File targetLocation
    
    /**
     * A file handle from the fully qualified path of the input template.
     */
    private File templateLocation
    
    /**
     *  A file handle from the fully qualified path of the snippet directory.
     */
    private File snippetDirectoryLocation



    /**
     * The name of the last processed SCChart.  
     */
    private String scchartName = ""



    new(IProject project, String wrapperCodeTemplate, String wrapperCodeSnippetDirectory, String targetLocation) {
        this.project = project
        this.wrapperCodeTemplate = wrapperCodeTemplate
        this.wrapperCodeSnippetDirectory = wrapperCodeSnippetDirectory

        this.targetLocation = new File(targetLocation)
        this.templateLocation = new File(project.location + File.separator + wrapperCodeTemplate)
        this.snippetDirectoryLocation = new File(wrapperCodeSnippetDirectory)
        
        // If the snippet directory is not an absolute path for itself,
        // we interpret it as a directory in the project.
        if(!snippetDirectoryLocation.isAbsolute)
            this.snippetDirectoryLocation = new File(project.location + File.separator + wrapperCodeSnippetDirectory)
    }

    /**
     * Generates and saves the wrapper code for a list of sct files. 
     */
    public def generateWrapperCode(SCTCompilationData... datas) {

        // Check consistency of paths
        if (wrapperCodeTemplate != "" && wrapperCodeSnippetDirectory != "") {

            val templateWithMacroCalls = getTemplateWithMacroCalls(datas)
//            System.err.println(templateWithMacroCalls)
            
            processTemplateAndSaveOutput(templateWithMacroCalls)
        }
    }

    /**
     * @return a String with the input template's wrapper code plus injected macro calls from annotations of the given SCT files.
     */
    private def String getTemplateWithMacroCalls(SCTCompilationData... datas) {
        
        // Get all annotations of input and output variables from the SCT files.
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

        val writer = new StringWriter()
        template.process(map, writer)

        return writer.toString()
    }

    /**
     * Processes the given template and saves the output to the target location of this generator.
     * The template is processed using all macro definitions from the wrapper code snippet directory. 
     */
    private def processTemplateAndSaveOutput(String templateWithMacroCalls) {
        // Set the snippets directory to implicitly load the macro definitions
        FreeMarkerPlugin.templateDirectory = snippetDirectoryLocation.absolutePath

        // Add implicit include of assignment macros such as <@init> and <@output>
        FreeMarkerPlugin.stringTemplateLoader.putTemplate("assignmentMacros", FreeMarkerPlugin.assignmentMacros)
        FreeMarkerPlugin.configuration.addAutoInclude("assignmentMacros")

        // Add implicit include of snippet definitions
        val List<File> snippetFiles = getFilesRecursive(snippetDirectoryLocation, "ftl")
        snippetFiles.forEach [
            // FreeMarker needs paths relative to the template directory.
            // We calculate this via the URI class.
            val relativeURI = snippetDirectoryLocation.toURI().relativize(it.toURI())
            FreeMarkerPlugin.configuration.addAutoInclude(relativeURI.getPath())
        ]

        // Process template with macro calls and now implicitly loaded snippet definitions.
        val template = new Template("templateWithMacroCalls", templateWithMacroCalls, FreeMarkerPlugin.configuration)

        // Process template and write output directly to target file
        val writer = new FileWriter(targetLocation)
        template.process(newHashMap(), writer)
        writer.close()
    }

    /**
     * @return a map where the keys 'inits', 'inputs' and 'outputs'
     *         are mapped to the corresponding macro calls for the given annotations.
     */
    private def getMacroCalls(WrapperCodeAnnotationData... annotationDatas) {
        val map = new HashMap<String, String>()
        
        // The assignment macros such as <@init> and <@output> use the variable 'phase'
        // to determine if their snippet should be inserted. 
        var inits = "<#assign phase='init' />\n"
        var inputs = "<#assign phase='input' />\n"
        var outputs = "<#assign phase='output' />\n"
        val alreadyInitialized = new ArrayList<WrapperCodeAnnotationData>()
        for (data : annotationDatas) {
            // We initialize every annotation only once
            // although the same annotation might be used twice: as input and output.
            if (!alreadyInitialized.contains(data)) {
                alreadyInitialized.add(data)
                inits += getTemplateCodeForAnnotation(data);
            }

            if (data.isInput) 
                inputs += getTemplateCodeForAnnotation(data);
            
            if (data.isOutput) 
                outputs += getTemplateCodeForAnnotation(data);
        }
        map.put("inits", inits)
        map.put("outputs", outputs)
        map.put("inputs", inputs)
        return map
    }

    /**
     * @return a String which globally sets variables with information
     *         about the next variable to be used.  
     */
    private static def String getTemplateCodeForAnnotation(WrapperCodeAnnotationData data) {
        return getMetaAssignments(data.varName, data.varType)+
                getMacroCall(data);
    }

    /**
     * @return a String which globally sets information
     *         about the next variable to be used.  
     */
    private static def String getMetaAssignments(String varname, String vartype) {
        return "<#assign varname = '" + varname + "' " + "vartype = '" + vartype + "' />\n";
    }

    /**
     * @return a String with the macro call for an wrapper code annotation data.
     */
    private static def String getMacroCall(WrapperCodeAnnotationData data) {        
        var txt = ""
        if(data.ignoreNonExistingSnippet)
            txt += '''<#if «data.name»??>'''
            
        txt += '''<@«data.name» '''
        for (String arg : data.arguments)
            txt += ''''«arg»' '''
        
        txt += '''/>''';
        
        if(data.ignoreNonExistingSnippet)
            txt += '''</#if>'''
        
        return txt
    }

    /**
     * @return a list with file handles from files in the given directory and all sub directories
     *         wich have the given file extension.
     */
    private def getFilesRecursive(File folder, String fileExtension) {
        // Filter that accepts directories and files with the given extension.
        val filter = new FileFilter() {
            override accept(File file) {
                return file.isDirectory || Files.getFileExtension(file.name).toLowerCase == fileExtension
            }
        }
        
        // Get files
        val list = new ArrayList<File>()
        getFilesRecursiveHelper(folder, list, filter)
        return list
    }

    /**
     * Auxilary method for getFilesRecursive(...).
     * Searches for files in the given folder and recursive in all sub folders.
     * Each file which is not filtered is added to the list.
     */
    private def void getFilesRecursiveHelper(File folder, List<File> list, FileFilter filter){
        // Iterate over files in the folder recursively.
        // Add every file that is not filtered to the list.
        for (fileEntry : folder.listFiles(filter)) {
            if (fileEntry.isDirectory()) {
                getFilesRecursiveHelper(fileEntry, list, filter);
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

        println(project.location.toOSString+File.separator+sctData.projectRelativePath)
        val model = ModelImporter.get(project.location.toOSString+File.separator+sctData.projectRelativePath)

        if (model != null && model instanceof State) {
            // Iterate over model to get all annotations
            val root = (model as State)
            scchartName = root.id
            println("scname:"+scchartName)
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