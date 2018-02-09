/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom

import java.util.List
import org.eclipse.core.resources.IFile
import java.io.File
import de.cau.cs.kieler.prom.templates.ModelAnalyzer

/**
 * Central place to register and categorize file extensions within the KIELER semantics universe.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class FileExtensions {
    
    // Models
    public static val SCCHART = "sctx"
    public static val ESTEREL = "strl"
    public static val SCL = "scl"
    public static val MODELS = #[SCCHART, ESTEREL, SCL]
    
    // Traces
    public static val ESO = "eso"
    public static val KTRACE = "ktrace"
    public static val TRACES = #[ESO, KTRACE]

    // Configurations
    public static val COMPILATION_CONFIG = "kico"
    public static val BUILD_CONFIG = "kibuild"
    public static val SIM_CONFIG = "kisim"
    public static val SIM_VISUALIZATION = "kivis"
    
    // Other
    public static val SIM_HISTORY = "sim"
    public static val SIM_INPUT = "simin"
    public static val SIM_OUTPUT = "simout"
    public static val FREEMARKER_TEMPLATE = "ftl"
    public static val TEMPLATES = #[FREEMARKER_TEMPLATE]
    
    public static val JAVA_ARCHIVE = "jar"
    
    // Executables for the simulation
    public static val EXE = "exe"
    public static val EXECUTABLES = #[EXE, JAVA_ARCHIVE]
    
    /**
     * Checks if the given extension of the given file matches the allowed extension.
     * 
     * @param file The file
     * @param allowedExtension The allowed file extension
     * @return true if the file has the allowed extension
     */
    public static def boolean matches(IFile file, String allowedExtension) {
        if(file == null) {
            return false
        }
        val ext = file.fileExtension
        return ext != null && allowedExtension == ext.toLowerCase
    }
    
    /**
     * Checks if the given extension of the given file is one of the allowed file extensions.
     * 
     * @param file The file
     * @param allowedExtensions The file extensions
     * @return true if the file has one of the allowed extensions 
     */
    public static def boolean matches(IFile file, List<String> allowedExtensions) {
        val ext = file.fileExtension
        return ext != null && allowedExtensions.contains(ext.toLowerCase)
    }
    
    /**
     * Checks whether the file is an executable on the current OS.
     * If the file does not exist, false is returned.
     * 
     * @param file The potential executable
     * @return true if the file is an executable, false otherwise
     */
    public static def boolean isExecutable(IFile file) {
        if(file == null || !file.exists) {
            return false
        }
        if(matches(file, EXECUTABLES)) {
            return true
        }
        // Check if the OS can execute the file
        val jFile = new File(file.location.toOSString)
        try {
            return jFile.canExecute
        } catch(SecurityException e) {
            // The access to the file was denied, thus it cannot be executed.
            return false    
        }
    }
    
    /**
     * Checks whether the file is a jar file.
     * 
     * @param file The file
     * @return true is the file is a jar file, false otherw
     */
    public static def boolean isJavaArchive(IFile file) {
        return matches(file, JAVA_ARCHIVE)
    }
    
    /**
     * Checks whether the file is a trace file.
     * 
     * @param file The file
     * @return true is the file is a trace file, false otherw
     */
    public static def boolean isTrace(IFile file) {
        return matches(file, TRACES)
    }
    
    /**
     * Checks if the file is a model file.
     * 
     * @param file The file
     * @return true if it is a model file, false otherwise.
     */
    public static def boolean isModel(IFile file) {
        return ModelAnalyzer.analyzers.exists[it.isSupported(file)]
    }
    
    /**
     * Checks if the file is a template file.
     * 
     * @param file The file
     * @return true if it is a template file, false otherwise.
     */
    public static def boolean isTemplate(IFile file) {
        return matches(file, TEMPLATES)
    }
    
    /**
     * Checks if the file contains a build configuration.
     * 
     * @param file The file
     * @return true if the file contains a build configuration, false otherwise
     */
    public static def boolean isBuildConfiguration(IFile file) {
        return matches(file, BUILD_CONFIG)
    }
    
    /**
     * Checks if the file contains a compilation configuration for the KIELER compiler.
     * 
     * @param file The file
     * @return true if the file contains a compilation configuration, false otherwise
     */
    public static def boolean isCompilationConfiguration(IFile file) {
        return matches(file, COMPILATION_CONFIG)
    }
    
    /**
     * Checks if the file contains a simulation configuration.
     * 
     * @param file The file
     * @return true if the file contains a simulation configuration, false otherwise
     */
    public static def boolean isSimulationConfiguration(IFile file) {
        return matches(file, SIM_CONFIG)
    }
    
    /**
     * Checks if the file contains a simulation visualization configuration.
     * 
     * @param file The file
     * @return true if the file contains a simulation visualization, false otherwise
     */
    public static def boolean isVisualizationConfiguration(IFile file) {
        return matches(file, SIM_VISUALIZATION)
    }
    
    /**
     * Checks if the file contains a simulation input for a model.
     * 
     * @param file The file
     * @return true if the file contains a simulation input, false otherwise
     */
    public static def boolean isSimulationInput(IFile file) {
        return matches(file, SIM_INPUT)
    }
    
    /**
     * Checks if the file is for simulation output of a model.
     * 
     * @param file The file
     * @return true if the file is for simulation output, false otherwise
     */
    public static def boolean isSimulationOutput(IFile file) {
        return matches(file, SIM_OUTPUT)
    }
    
     /**
     * Checks if the file is for a simulation history.
     * 
     * @param file The file
     * @return true if the file is for a simulation history, false otherwise
     */
    public static def boolean isSimulationHistory(IFile file) {
        return matches(file, SIM_HISTORY)
    }
}