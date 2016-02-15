/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.launchconfig

import com.google.common.io.Files
import de.cau.cs.kieler.prom.common.FileCompilationData
import de.cau.cs.kieler.prom.common.ModelImporter
import freemarker.template.Template
import java.io.File
import java.io.FileFilter
import java.io.FileWriter
import java.io.StringWriter
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import org.apache.commons.io.FilenameUtils
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.xtend.lib.annotations.Accessors
import org.freemarker.FreeMarkerPlugin

/**
 * This class generates wrapper code for models.
 * Annotations are mapped to macro calls which are injected in the input template.
 * Afterwards the macro calls are evaluated by the template engine and the wrapper code which they define is inserted.
 * 
 * @author aas
 */
class WrapperCodeGenerator extends AbstractWrapperCodeGenerator {

    /**
     * The id of the extension point for wrapper code annotation analyzers.
     */
    private static val WRAPPER_CODE_ANNOTATION_ANALYZER_EXTENSION_POINT_ID = "de.cau.cs.kieler.prom.wrapperCodeAnnotationAnalyzer"

    /**
     * List with all wrapper code annotation analyzers loaded from extensions.
     */
    private static var List<IWrapperCodeAnnotationAnalyzer> wrapperCodeAnnotationAnalyzers


    /**
     * A template variable which is replaced with the name of the last analyzed model.
     */
    private static val MODEL_NAME_VARIABLE = "model_name"    

    /**
     * A template variable which is replaced with the name of the file (without file extension)
     * that is created during wrapper code generation.
     */
    private static val FILE_NAME_VARIABLE = "file_name"

    private static val declarationPhase = new CodeGenerationPhase("declaration", true, [data | true], "decl")
    private static val initializationPhase = new CodeGenerationPhase("initialization", true, [data | true], "init")
    private static val releasePhase = new CodeGenerationPhase("release", true, [data | true], "free")
    private static val inputPhase = new CodeGenerationPhase("input", false, [data | data.isInput])
    private static val outputPhase = new CodeGenerationPhase("output", false, [data | data.isOutput])

    public static var List<CodeGenerationPhase> codeGenerationPhases = #[declarationPhase, initializationPhase, inputPhase, outputPhase, releasePhase]

    /**
     * Macro definitions to use <@init>, <@input>, <@output> in wrapper code snippets.
     */
    public static var String macroDefinitions = null

    /**
     * The name of the last processed model
     * (e.g. the name for an SCChart).  
     */
    private String modelName = ""

    /**
     * Initializes the macro definitions when they are not yet initialized.
     * Afterwards they are returned.
     * 
     * @return the macro definitions of assignment macros such as <@input>
     */
    private def String getOrInitializeMacroDefinitions() {
        // Initialize if not done yet
        if(macroDefinitions == null){
            macroDefinitions = ""
            
            for(phase : codeGenerationPhases ){
                for(macro : phase.macros){
                    macroDefinitions += macro.freeMarkerDefinition
                    macroDefinitions += "\n"
                }                
            }
        }
        return macroDefinitions
    }

    /**
     * Generates and saves the wrapper code for a list of files.
     * 
     * @param datas The data objects to generate wrapper code for 
     */
    override void generateWrapperCode(FileCompilationData... datas) {

        // Check consistency of paths
        if (launchConfiguration.wrapperCodeTemplate != "" && launchConfiguration.wrapperCodeSnippetDirectory != "") {

            val templateWithMacroCalls = getTemplateWithMacroCalls(datas)

            // Debug output macro calls
//            System.err.println(templateWithMacroCalls)

            processTemplateAndSaveOutput(templateWithMacroCalls)
        }
    }

    /**
     * Searches for wrapper code annotations in the models
     * and injects macro calls accordingly in the template.
     * 
     * @param datas List with containers holding paths to model files
     * @return a String with the input template's wrapper code
     * plus injected macro calls from annotations of the given files.
     */
    private def String getTemplateWithMacroCalls(FileCompilationData... datas) {

        // Get all annotations of input and output variables from the files.
        val List<WrapperCodeAnnotationData> annotationDatas = newArrayList()
        for (data : datas) {
            getWrapperCodeAnnotationData(data, annotationDatas)
        }

        // Create macro calls from annotations
        val map = getMacroCalls(annotationDatas)
        
        // Add name of model 
        map.put(MODEL_NAME_VARIABLE, modelName)
        
        // Add name of output file 
        val fileName = new File(launchConfiguration.wrapperCodeTargetLocation).name
        val fileNameWithoutExtension = FilenameUtils.removeExtension(fileName)
        map.put(FILE_NAME_VARIABLE, fileNameWithoutExtension)
        
        // Inject macro calls in input template
        FreeMarkerPlugin.newConfiguration(launchConfiguration.project.location.toOSString())
        val template = FreeMarkerPlugin.configuration.getTemplate(launchConfiguration.wrapperCodeTemplate)

        val writer = new StringWriter()
        template.process(map, writer)

        return writer.toString()
    }

    /**
     * Processes the given template and saves the output to the target location of this generator.
     * The template is processed using all macro definitions from the wrapper code snippet directory.
     * 
     * @param templateWithMacroCalls The template text to be processed 
     */
    private def void processTemplateAndSaveOutput(String templateWithMacroCalls) {
        var File snippetDirectoryLocation = new File(launchConfiguration.wrapperCodeSnippetDirectory)
        if (!snippetDirectoryLocation.isAbsolute)
            snippetDirectoryLocation = new File(launchConfiguration.project.location + File.separator + launchConfiguration.wrapperCodeSnippetDirectory)

        // Set the snippets directory to implicitly load the macro definitions
        FreeMarkerPlugin.newConfiguration(snippetDirectoryLocation.absolutePath)

        // Add implicit include of assignment macros such as <@init> and <@output>
        FreeMarkerPlugin.stringTemplateLoader.putTemplate("assignmentMacros", getOrInitializeMacroDefinitions() )
        FreeMarkerPlugin.configuration.addAutoInclude("assignmentMacros")

        // Add implicit include of snippet definitions
        val List<File> snippetFiles = getFilesRecursive(snippetDirectoryLocation, "ftl")
        for(snippetFile : snippetFiles) {
            // FreeMarker needs paths relative to the template directory.
            // We calculate this via the URI class.
            val relativeURI = snippetDirectoryLocation.toURI().relativize(snippetFile.toURI())
            FreeMarkerPlugin.configuration.addAutoInclude(relativeURI.getPath())
        }

        // Process template with macro calls and now implicitly loaded snippet definitions.
        val template = new Template("templateWithMacroCalls", templateWithMacroCalls, FreeMarkerPlugin.configuration)

        // Process template and write output directly to target file
        val writer = new FileWriter(launchConfiguration.wrapperCodeTargetLocation)
        template.process(newHashMap(), writer)
        writer.close()
    }

    /**
     * Creates macro calls from wrapper code annotation datas.
     * 
     * @param annotationDatas List with the datas to generate macro calls for 
     * @return a map where the keys 'inits', 'inputs' and 'outputs'
     *         are mapped to the corresponding macro calls for the given annotations.
     */
    private def HashMap<String, String> getMacroCalls(WrapperCodeAnnotationData... annotationDatas) {
        val map = new HashMap<String, String>()
        // The assignment macros such as <@init> and <@output> use a variable
        // to determine if their snippet should be inserted.
        for(phase : codeGenerationPhases) {
            phase.macroCallsToInject = phase.freeMarkerAssignment+"\n"
        }

        // Keep track of the annotations that were already seen before in this collection
        val doneAnnotations = new ArrayList<WrapperCodeAnnotationData>()
        var boolean isAnnotationDoneAlready
        
        // Add macro calls for annotations to the different phases
        var WrapperCodeAnnotationData prev = null; 
        for (data : annotationDatas) {
            
            isAnnotationDoneAlready = true
            if (!doneAnnotations.contains(data)) {
                doneAnnotations.add(data)
                isAnnotationDoneAlready = false
            }

            for(phase : codeGenerationPhases) {
                // We initialize every annotation only once
                // although the same annotation might be used twice: as input and output.
                if(!phase.isUsesAnnotationsOnce || (phase.isUsesAnnotationsOnce && !isAnnotationDoneAlready) ) {
                    // Use input annotations on inputs only, and output annotations on outputs only
                    if(phase.isApplicable(data)) {
                        // The macro of this annotation should be called in this phase
                        phase.macroCallsToInject += getTemplateCodeForAnnotation(data)
                    }
                }
            }
            prev = data;
        }

        // Send FreeMarker the text to replace the placeholder of each phase
        for(phase : codeGenerationPhases) {
            for(macro : phase.macros) {
                // Calling the phase in the template is possible by
                // using the name of the assignment macro with an 's' added
                // (e.g. ${declarations} for <@declaration>)
                map.put(macro.name+"s", phase.macroCallsToInject)
            }
        }
        return map
    }

    /**
     * Creates meta assignments and macro calls for an wrapper code annotation data.
     * 
     * @param data The annotation data
     * @return a string to set information about the variable which the annotation is used for.
     *         as well as the macro call for the annotation.    
     */
    private static def String getTemplateCodeForAnnotation(WrapperCodeAnnotationData data) {
        return getMetaAssignments(data) + getMacroCall(data);
    }

    /**
     * Creates a statements that sets meta information about the next variable to be used.
     * 
     * @param data The wrapper code annotation data 
     * @return a string which globally sets meta information.  
     */
    private static def String getMetaAssignments(WrapperCodeAnnotationData data) {
        return '''<#assign varname = '«data.varName»' vartype = '«data.varType»' />'''+"\n"
    }

    /**
     * Creates a statement that calls a macro to generate code for the wrapper code annotation data.
     * 
     * @param data The wrapper code annotation data
     * @return a string with the macro call for an wrapper code annotation data.
     */
    private static def String getMacroCall(WrapperCodeAnnotationData data) {
        var txt = ""
        if (data.ignoreNonExistingSnippet)
            txt += '''<#if «data.name»??>'''

        txt += '''<@«data.name» '''
        for (String arg : data.arguments)
            txt += ''''«arg»' '''

        txt += '''/>''';
 
        if (data.ignoreNonExistingSnippet)
            txt += '''</#if>'''
        
        txt += "\n"

        return txt
    }

    /**
     * Searches for files of a given file extension in a directory and sub directories.
     * 
     * @param folder The directory to start the search in
     * @param fileExtension A file extension that found files must match
     * @return a list with file handles for the found files.
     */
    private def List<File> getFilesRecursive(File folder, String fileExtension) {
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
     * 
     * @param folder the current folder to be searched for files
     * @param list A list of found files
     * @param filter A filter that found files must match
     */
    private def void getFilesRecursiveHelper(File folder, List<File> list, FileFilter filter) {
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
     * Adds wrapper code data objects to the annotationDatas list,
     * which where found in the given files.
     * 
     * @param data File data holding a path to a model file
     * @param annotationDatas List to add found annotation datas to
     */
    private def getWrapperCodeAnnotationData(FileCompilationData data,
        List<WrapperCodeAnnotationData> annotationDatas) {

        // Load EObject from file
        val model = new ModelImporter().get(launchConfiguration.project.location.toOSString + File.separator + data.projectRelativePath)

        if (model != null) {
            initAnalyzers()
            
            // Analyze the model with all wrapper code annotation analyzers
            for (analyzer : wrapperCodeAnnotationAnalyzers) {
                // Get model name if possible
                val name = analyzer.getModelName(model)
                if (name != null)
                    modelName = name

                // Add annotations from analyzer
                val annotations = analyzer.getAnnotations(model)
                if (annotations != null)
                    annotationDatas.addAll(annotations)
            }

            // If none of the analyzers can get a name for the model
            // we interpret the file name as the model's name, like it is in java classes. 
            if (modelName == null)
                modelName = FilenameUtils.getBaseName(data.projectRelativePath)
        }
    }
    
    /**
     * Load and initialize wrapper code annotation analyzers from all implementing extensions
     * if not yet done.
     */
    private def void initAnalyzers(){
        if(wrapperCodeAnnotationAnalyzers == null){
            // Initialize list
            wrapperCodeAnnotationAnalyzers = newArrayList()
            
            // Fill list with wrapper code annotation analyzers from extensions.
            val config = Platform.getExtensionRegistry().getConfigurationElementsFor(WRAPPER_CODE_ANNOTATION_ANALYZER_EXTENSION_POINT_ID);
            try {
                for (IConfigurationElement e : config) {
                    val o = e.createExecutableExtension("class");
                    if (o instanceof IWrapperCodeAnnotationAnalyzer) {
                        wrapperCodeAnnotationAnalyzers += o
                    }
                }
            } catch (CoreException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // New Class
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Class to define the phases for which wrapper code is used and thus to define which macro calls
     * need to be injected in the template.
     */
    private static class CodeGenerationPhase {
        
        /**
         * The unique name of this phase.
         * Used to identify which phase is currently active in the template.
         */
        private var String name
        
        /**
         * Defines if the same annotation may be used multiple times in this phase.
         * (e.g. the same annotation should be initialized only once
         * but may be used multiple times: as input and output) 
         */
        private boolean isUsesAnnotationsOnce
        
        /**
         * Method to check if the snippet definition for a wrapper code annotation
         * should be inserted in this phase.
         * (e.g. the input phase is only relevant for annotations on an input variable) 
         */
        private (WrapperCodeAnnotationData) => boolean isApplicableFunction;
        
        /**
         * The list of assignment macros that will insert its content as part of this phase.
         * (e.g. <@init> as well as <@initialization> will insert its content as part of the initialization phase)
         */
        private val List<AssignmentMacro> macros = newArrayList();
        
        /**
         * A variable to calculate the assignments and macros,
         * which should be injected in this phase for the current wrapper code generation launch.
         */
        @Accessors
        private var String macroCallsToInject
        
        /**
         * Constructor.
         * 
         * @param name The unique name of the phase.
         * @param isUsesAnnotationsOnce Defines whether the same annotation may be used multiple times in this phase
         * @param  isApplicableFunction A function that takes a WrapperCodeAnnotationData
         * and returns true iff the snippet definition for the annotation should be called as part of this phase.
         * @param alternativeMacroNames A list of macro names that should be equiivalent to the macro with the same name as this phase. 
         */
        new(String name, boolean isUsesAnnotationsOnce, (WrapperCodeAnnotationData) => boolean isApplicableFunction, String... alternativeMacroNames) {
            this.name = name
            this.isUsesAnnotationsOnce = isUsesAnnotationsOnce
            this.isApplicableFunction = isApplicableFunction
            
            // Create macros
            this.macros += new AssignmentMacro(name, this)
            for(alternativeMacroName : alternativeMacroNames) {
                this.macros += new AssignmentMacro(alternativeMacroName, this)
            }
        }
        
        /**
         * The FreeMarker assignment statement which will set this phase as active.
         */
        public def getFreeMarkerAssignment() '''
            <#assign phase='«name»' />
        '''
        
        /**
         * Returns the list of assignment macros, which will insert its content as part of this phase.
         * 
         * @return the list of assignment macros for this phase.
         */
        public def getMacros(){
            return macros
        }
        
        /**
         * Checks if the snippet definition for the annotation should be inserted as part of this phase.
         * 
         * @return true if the snippet definition for the annotation should be inserted as part of this phase.
         */
        public def boolean isApplicable(WrapperCodeAnnotationData data){
            return isApplicableFunction.apply(data)
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // New Class
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Class to define assignment macros that will insert their content as part of a given phase. 
     */
    private static class AssignmentMacro {
        /**
         * The name for the macro
         */
        private var String name;
        
        /**
         * The phase in which the content of this macro should be used
         */
        private var CodeGenerationPhase phase;
        
        /**
         * Constructor.
         * 
         * @param name The name
         * @param phase The phase
         */
        new(String name, CodeGenerationPhase phase) {
            this.name = name
            this.phase = phase
        }
        
        /**
         * The definition of this assignment macro for the FreeMarker template engine.
         * 
         * @return the FreeMarker definition of this assignment macro
         */
        def getFreeMarkerDefinition() '''
            <#macro «name»>
                <#if phase=='«phase.name»'>
                    <#nested />
                    </#if>
            </#macro>
        '''
    }
}