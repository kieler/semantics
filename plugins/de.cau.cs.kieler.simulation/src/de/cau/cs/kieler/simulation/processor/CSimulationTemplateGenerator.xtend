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
package de.cau.cs.kieler.simulation.processor

import de.cau.cs.kieler.kicool.compilation.CCodeFile
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CSimulationTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {

    static val FILE_NAME = "c-simulation.ftl" 

    override getId() {
        "de.cau.cs.kieler.simulation.template.preparation"
    }
    
    override getName() {
        "Generate C Simulation Template"
    }
    
    override generateTemplate() {
        // Extend general template environment
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        val generalTemplateEnvironment = environment.getProperty(TemplateEngine.GENRAL_ENVIRONMENT)?:newHashMap
        environment.setProperty(TemplateEngine.GENRAL_ENVIRONMENT, generalTemplateEnvironment)
        
        if (infra.sourceCode !== null) {
            val structFile = infra.sourceCode.files.filter(CCodeFile).filter[!dataStructName.nullOrEmpty].head
            if (structFile !== null) {
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_TYPE, structFile.dataStructName)
            }
        }
        
        // Generate templates
        val cc = new CodeContainer
        val builder = new StringBuilder
        
        // TODO
        
        cc.add(FILE_NAME, builder.toString)
        environment.addIncludeInjection(FILE_NAME.relativeTemplatePath)
        return cc
    }
}