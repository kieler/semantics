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
package de.cau.cs.kieler.kicool.deploy

import de.cau.cs.kieler.kicool.environments.Environment

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CommonTemplateVariables {
    
    // -- RESERVED KEYS --
    // Template environment
    /** Base directory of the template engine */
    public static val BASE_DIR = "base_dir"
    /** Full target output file path */
    public static val TARGET = "target"
    /** Target output file name */
    public static val TARGET_NAME = "target_name"
    /** Target output file name without file extension */
    public static val TARGET_BASENAME = "target_basename"
    // Template injection
    public static val INJECTION_INCLUDES = "inject_templates"
    public static val INJECTION_MACROS = "inject_macros"
    // Model
    /** The name of the type (i.e. struct or class) providing the tick interface */
    public static val MODEL_DATA_TYPE = "tickdata_type"
    
    // -- General Variables --
    /** The name for the tick interface variable  */
    public static val MODEL_DATA_NAME = "tickdata_name"
    
    // -- Defaults --
    public static val DEFAULTS = #{
        "tickdata_name" -> "model"
    }
    
}