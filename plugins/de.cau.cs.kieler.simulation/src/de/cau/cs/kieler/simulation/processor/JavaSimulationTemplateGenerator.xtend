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
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.compilation.VariableStore

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
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_TYPE, javaClassFile.className)
            }
        }
        
        // Generate template
        logger.println("Generating simulation code")
        
        val store = VariableStore.getVariableStore(environment)
        if (store.ambiguous) {
            environment.warnings.add("VariableStore contains ambiguous information for variables.")
            logger.println("WARNING:VariableStore contains ambiguous information for variables. Only first match will be used!")
        }
        
        val cc = new CodeContainer
        val code = 
            '''
            <#macro simulation_imports position>
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStreamReader;
            
            import org.json.*;
            </#macro>
            
            <#macro simulation_in position>
            receiveVariables();
            </#macro>
            
            <#macro simulation_out position>
            sendVariables();
            </#macro>
            
            <#macro simulation_body position>
                public static BufferedReader stdInReader = new BufferedReader(new InputStreamReader(System.in));
                        
                private static void receiveVariables() {
                    try {
                        String line = stdInReader.readLine();
                        JSONObject json = new JSONObject(line);
                        JSONArray jsonArray;
                        
                        «FOR v : store.variables.keySet»
                            // Receive «v»
                            if(json.has("«v»")) {
                                «IF store.variables.get(v).head.isArray»
                                jsonArray = json.getJSONArray("«v»");
                                «store.parseArray(v, "jsonArray")»
                                «ELSE»
                                «store.parse(v, "json")»
                                «ENDIF»
                            }
                        «ENDFOR»
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (JSONException e) {
                       // Ignore other input
                    }
                }
                
                private static void sendVariables() {
                    JSONObject json = new JSONObject();
                    JSONArray jsonArray;
                    
                    «FOR v : store.variables.keySet»
                        // Send «v»
                        «IF store.variables.get(v).head.isArray»
                        jsonArray = new JSONArray();
                        «store.serializeArray(v)»
                        json.put("«v»", jsonArray);
                        «ELSE»
                        json.put("«v»", «store.serialize(v)»);
                        «ENDIF»
                    «ENDFOR»
                    
                    System.out.println(json.toString());
                }
            </#macro>
            '''
        
        cc.add(FILE_NAME, code)
        
        environment.addIncludeInjection(FILE_NAME.relativeTemplatePath)
        environment.addMacroInjection(HEADER, "simulation_imports")
        environment.addMacroInjection(BODY, "simulation_body")
        environment.addMacroInjection(INIT, "simulation_out")
        environment.addMacroInjection(INPUT, "simulation_in")
        environment.addMacroInjection(OUTPUT, "simulation_out")
        
        return cc
    }
    
    def parse(VariableStore store, String varName, String json) {
        return '''${tickdata_name}.«varName» = «json».«store.jsonTypeGetter(varName)»("varName");'''
    }
    
    def jsonTypeGetter(VariableStore store, String varName) {
        val type = store.variables.get(varName).head.type
        return switch(type) {
            case BOOL: "getBoolean"
            case DOUBLE,
            case FLOAT: "getDouble"
            case INT: "getInt"
            case STRING: "getString"
            default: throw new IllegalArgumentException("Unsupported type: " + type)
        }
    }
    
    def parseArray(VariableStore store, String varName, String json) {
        return "//${tickdata_name}." + varName + ";"
    }
    
    def serializeArray(VariableStore store, String varName) {
        return "//${tickdata_name}." + varName + ";"
    }
    
    def serialize(VariableStore store, String varName) {
        return "${tickdata_name}." + varName
    }
    
}