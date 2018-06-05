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

import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.CCodeFile
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CSimulationTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {

    public static val FILE_NAME = "c-simulation.ftl" 

    public static val IProperty<String> STRUCT_ACCESS = 
        new Property<String>("de.cau.cs.kieler.simulation.c.struct.access", ".")

    override getId() {
        "de.cau.cs.kieler.simulation.c.template"
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
            val structFiles = infra.sourceCode.files.filter(CCodeFile).filter[!dataStructName.nullOrEmpty].toList
            var structFile = structFiles.findFirst[header]
            if (structFile === null) {
                structFile = structFiles.head
            }
            if (structFile !== null) {
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_TYPE, structFile.dataStructName)
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_FILE, structFile.fileName)
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
            #include <string.h>
            #include <stdlib.h>
            #include <stdio.h>
            
            #include "lib/cJSON.h"
            </#macro>
            
            <#macro simulation_in position>
            receiveVariables();
            </#macro>
            
            <#macro simulation_out position>
            sendVariables();
            </#macro>
            
            <#macro simulation_body position>
            void receiveVariables() {
                char buffer[10000];
                int i = 0;
                char c;
                // read next line
                for (i = 0; (c = getchar()) != '\n'; i++) {
                    buffer[i] = c;
                }
                buffer[i] = 0;
            
                cJSON *root = cJSON_Parse(buffer);
                cJSON *item = NULL;
                if(root != NULL) {
                    «FOR v : store.variables.keySet»
                        // Receive «v»
                        item = cJSON_GetObjectItemCaseSensitive(root, "«v»");
                        if(item != NULL) {
                            «IF store.variables.get(v).head.isArray»
                            jsonArray = json.getJSONArray("«v»");
                            «store.parseArray(v, "jsonArray")»
                            «ELSE»
                            «store.parse(v, "item")»
                            «ENDIF»
                        }
                    «ENDFOR» 
                }
              
                cJSON_Delete(root);
            }
            
            void sendVariables() {
                cJSON* root = cJSON_CreateObject();
                
                «FOR v : store.variables.keySet»
                    // Send «v»
                    item = cJSON_CreateObject();
                    «IF store.variables.get(v).head.isArray»
                    «store.serializeArray(v)»
                    «ELSE»
                    cJSON_AddItemToObject(root, "«v»", «store.serialize(v)»);
                    «ENDIF»
                «ENDFOR»
            
                // Get JSON object as string
                char* outString = cJSON_Print(root);
                cJSON_Minify(outString);
                // Flush to stdout
                printf("%s\n", outString);
                fflush(stdout);
            
                cJSON_Delete(root);
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
    
    private def access() {
        return environment.getProperty(STRUCT_ACCESS)?:STRUCT_ACCESS.^default
    }
    
    def parse(VariableStore store, String varName, String json) {
        return "${tickdata_name}" + access + varName + " = " + json + store.jsonTypeGetter(varName) + ";"
    }
    
    def jsonTypeGetter(VariableStore store, String varName) {
        val type = store.variables.get(varName).head.type
        return switch(type) {
            case BOOL,
            case INT: "->valueint"
            case DOUBLE,
            case FLOAT: "->valuedouble"
            case STRING: "->valuestring"
            default: throw new IllegalArgumentException("Unsupported type: " + type)
        }
    }
    
    def parseArray(VariableStore store, String varName, String json) {
        // TODO
        return "//${tickdata_name}." + varName + ";"
        /*
            <#if indices?has_content>
            cJSON *array_values = cJSON_GetObjectItemCaseSensitive(value_item, "values");
            int oneDimIndex = 0;
            <#assign index = 0>
            <#list indices as s>
            for(int i${index} = 0; i${index} < ${s}; i${index}++) {
            <#assign index = index+1>
            </#list>
                cJSON *array_value = cJSON_GetArrayItem(array_values, oneDimIndex);
                <@array_elem indices /> = <@value_of_item "array_value" />
                oneDimIndex++;
            <#list indices as s>
            }
            </#list>
        */
    }
    
    def serializeArray(VariableStore store, String varName) {
        // TODO
        return "//${tickdata_name}." + varName + ";"
    }
    
    def serialize(VariableStore store, String varName) {
        val type = store.variables.get(varName).head.type
        return switch(type) {
            case BOOL: "cJSON_CreateBool(${tickdata_name}" + access + varName + ")"
            case INT,
            case DOUBLE,
            case FLOAT: "cJSON_CreateNumber(${tickdata_name}" + access + varName + ")"
            case STRING: "cJSON_CreateString((${tickdata_name}" + access + varName + " != NULL) ? ${tickdata_name}" + access + varName + " : \"\")"
            default: throw new IllegalArgumentException("Unsupported type: " + type)
        }
    }
    
}