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

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.JavaCodeFile
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class JavaSimulationTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {
    
    static val FILE_NAME = "java-simulation.ftl" 
    
    override getId() {
        "de.cau.cs.kieler.simulation.java.template"
    }
    
    override getName() {
        "Generate Java Simulation Template"
    }
    
    override generateTemplate() {
        // Extend general template environment
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        val generalTemplateEnvironment = environment.getProperty(TemplateEngine.GENRAL_ENVIRONMENT)?:newHashMap
        environment.setProperty(TemplateEngine.GENRAL_ENVIRONMENT, generalTemplateEnvironment)
        
        if (infra.sourceCode !== null) {
            val javaClassFile = infra.sourceCode.files.filter(JavaCodeFile).head
            if (javaClassFile !== null && !javaClassFile.className.nullOrEmpty) {
                generalTemplateEnvironment.put("model_class", javaClassFile.className)
            }
        }
        
        // Generate template
        val cc = new CodeContainer
        val builder = new StringBuilder
        
        // import
        logger.println("Generating simulation imports")
        environment.addMacroInjection(HEADER, "simulation_imports")
        builder.append(
            '''
            <#macro simulation_imports position>
                import java.io.BufferedReader;
                import java.io.IOException;
                import java.io.InputStreamReader;
                
                import org.json.*;
            </#macro>
            '''
        )

        // communication
        logger.println("Generating simulation communication")
        environment.addMacroInjection(INIT, "simulation_out")
        environment.addMacroInjection(INPUT, "simulation_in")
        environment.addMacroInjection(OUTPUT, "simulation_out")
        builder.append(
            '''
            <#macro simulation_in position>
                receiveVariables();
            </#macro>
            <#macro simulation_out position>
                sendVariables();
            </#macro>
            '''
        )

        // send/receive
        logger.println("Generating send/receive code")
        environment.addMacroInjection(BODY, "simulation_body")
        builder.append(
            '''
            <#macro simulation_body position>
                public static BufferedReader stdInReader = new BufferedReader(new InputStreamReader(System.in));
                        
                private static void receiveVariables() {
                    try {
                      String line = stdInReader.readLine();
                      JSONObject json = new JSONObject(line);
                      JSONObject jsonVar;
                      JSONObject arrayObject;
                      JSONArray jsonArray;
                      
                      // TODO !!
                    
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (JSONException e) {
                      // Ignore other input
                    }
                }
                
                private static void sendVariables() {
                    JSONObject json = new JSONObject();
                    JSONObject jsonVar;
                    JSONObject arrayObject;
                    JSONArray jsonArray;
                    
                    // TODO !!
                
                    System.out.println(json.toString());
                }
            </#macro>
            '''
        )
        
        cc.add(FILE_NAME, builder.toString)
        environment.addIncludeInjection(FILE_NAME.relativeTemplatePath)
        return cc
    }
    
}