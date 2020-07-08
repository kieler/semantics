/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.deploy.processor

import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File

/**
 * @author ssm
 * @kieler.design 2020-01-30 proposed 
 * @kieler.rating 2020-01-30 proposed yellow 
 * 
 */
class CodeContainerLoader extends ExogenousProcessor<Object, CodeContainer> {
    
    public static val CODE_FILE = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.codeContainer.codeFile", "result.txt")
    
    override getId() {
        "de.cau.cs.kieler.kicool.deploy.codeContainer"
    }
    
    override getName() {
        "Code Container"
    }
    
    override process() {
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        val codeFile = new File(new File(infra.generatedCodeFolder, "bin"), getProperty(CODE_FILE)?:CODE_FILE.^default)
        val codeContainer =  new CodeContainer
        
        codeContainer.addProxy(codeFile)
        
        model = codeContainer
    }
    
}