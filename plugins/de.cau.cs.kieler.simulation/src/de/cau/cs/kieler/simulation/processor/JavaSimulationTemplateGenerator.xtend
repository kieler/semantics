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
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine

import static de.cau.cs.kieler.kicool.deploy.TemplatePosition.*

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class JavaSimulationTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {
    
    public static val FILE_NAME = "java-simulation.ftl" 
    
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
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_FILE, javaClassFile.fileName)
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
                        
                        «FOR v : store.orderedVariables»
                            // Receive «v.key»
                            if (json.has("«v.key»")) {
                                «v.parse("json")»
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
                    
                    «FOR v : store.orderedVariables»
                        // Send «v.key»
                        «v.serialize("json")»
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
    
    def serialize(Pair<String, VariableInformation> variable, String json) {
        val varName = variable.key
        val info = variable.value
        if (info.array) {
            if (info.isExternal) throw new UnsupportedOperationException("Cannot handle external array variabels.")
            return '''«json».put("«varName»", JSONObject.wrap(${tickdata_name}.«varName»));'''
        } else if (info.isExternal) {
            return '''«json».put("«varName»", «info.externalName»);'''
        } else {
            return '''«json».put("«varName»", ${tickdata_name}.«varName»);'''
        }
    }
    
    def parse(Pair<String, VariableInformation> variable, String json) {
        val varName = variable.key
        val info = variable.value
        if (info.array) {
            if (info.external) throw new UnsupportedOperationException("Cannot handle external array variabels.")
            return '''
                JSONArray _array = «json».getJSONArray("«varName»");
                for (int i = 0; i < _array.length(); i++) {
                    «info.parseArray(varName, 1, info.dimensions.size, "_array")»
                }
            '''
        } else if (info.external) {
            return '''«info.externalName» = «json».«info.jsonTypeGetter»("«varName»");'''
        } else {
            return '''${tickdata_name}.«varName» = «json».«info.jsonTypeGetter»("«varName»");'''
        }
    }
    
    def jsonTypeGetter(VariableInformation info) {
        return switch(info.type) {
            case BOOL: "getBoolean"
            case DOUBLE,
            case FLOAT: "getDouble"
            case UNSIGNED,
            case INT: "getInt"
            case STRING: "getString"
            default: {
                environment.errors.add("Cannot serialize simulation interface. Unsupported type: " + type)
                ""
            }
        }
    }
    
    def String parseArray(VariableInformation info, String varName, int idx, int dimensions, String json) {
        if (idx == dimensions) {
            if (idx == 1) {
                return '''${tickdata_name}.«varName»[i] = «json».«info.jsonTypeGetter»(i);'''
            } else {
                return '''${tickdata_name}.«varName»[i]«(1..<dimensions).map["[i"+it+"]"].join» = «json».«info.jsonTypeGetter»(i«idx - 1»);'''
            }
        } else {
            return '''
                JSONArray _array«idx» = «json».getJSONArray(i«if (idx > 1) idx - 1 else ""»);
                for (int i«idx» = 0; i«idx» < _array«idx».length(); i«idx»++) {
                    «info.parseArray(varName, idx+1, dimensions, "_array" + idx)»
                }
            '''
        }
    }
    
}