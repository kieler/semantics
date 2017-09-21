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
    public static val MODELS = #[SCCHART, ESTEREL]
    
    // Traces    
    public static val ESO = "eso"
    public static val KTRACE = "ktrace"
    public static val TRACES = #[ESO, KTRACE]

    // Configurations
    public static val COMPILATION_SYSTEM = "kico"
    public static val BUILD_CONFIG = "kibuild"
    public static val SIM_CONFIG = "kisim"
    public static val SIM_VISUALIZATION = "kivis"
    
    // Other
    public static val SIM_HISTORY = "sim"
    public static val SIM_INPUT = "simin"
    public static val SIM_OUTPUT = "simout"
    public static val FREEMARKER_TEMPLATE = "ftl"
    public static val TEMPLATES = #[FREEMARKER_TEMPLATE]
    
    /**
     * Checks if the given extension of the given file matches the allowed extension.
     * 
     * @param file The file
     * @param allowedExtension The allowed file extension
     * @return true if the file has the allowed extension
     */
    public static def boolean matches(IFile file, String allowedExtension) {
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
}