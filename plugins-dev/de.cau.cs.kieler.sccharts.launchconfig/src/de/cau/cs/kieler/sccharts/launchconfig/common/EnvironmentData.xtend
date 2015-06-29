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
package de.cau.cs.kieler.sccharts.launchconfig.common

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class EnvironmentData extends SerializableData {
    
    new(){
        
    }
    
    new(String name){
        this.name = name
    }
    
    @Accessors
    protected String name = ""
    
    @Accessors
    protected String targetLanguage = ""
    @Accessors
    protected String targetFileExtension = ""
    @Accessors
    protected String targetTemplate = ""
    
    @Accessors
    protected String wrapperCodeTemplate = ""
    @Accessors
    protected String wrapperCodeTarget = ""
    @Accessors
    protected String wrapperCodeSnippetsDirectory = ""
    @Accessors
    protected String wrapperCodeSnippetsOrigin = ""
    
    @Accessors
    protected String compileCommand = ""
    @Accessors
    protected String deployCommand = ""
    @Accessors
    protected String runCommand = ""
    
    @Accessors
    protected String relatedProjectWizardClass = ""
    
    @Accessors
    protected String mainFile = ""
    @Accessors
    protected String mainFileOrigin = ""
}