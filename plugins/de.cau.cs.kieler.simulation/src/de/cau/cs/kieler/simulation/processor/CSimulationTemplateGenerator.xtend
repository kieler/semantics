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
                    «FOR v : store.orderedVariables»
                        // Receive «v.key»
                        item = cJSON_GetObjectItemCaseSensitive(root, "«v.key»");
                        if(item != NULL) {
                            «v.parse("item")»
                        }
                    «ENDFOR» 
                }
              
                cJSON_Delete(root);
            }
            
            void sendVariables() {
                cJSON* root = cJSON_CreateObject();
                «IF store.variables.values.exists[array]»
                    cJSON* array;
                «ENDIF»
                
                «FOR v : store.orderedVariables»
                    // Send «v.key»
                    «v.serialize("root", "array")»
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
    
    private def accessor() {
        return environment.getProperty(STRUCT_ACCESS)?:STRUCT_ACCESS.^default
    }
    
    def serialize(Pair<String, VariableInformation> variable, String json, String array) {
        val varName = variable.key
        val info = variable.value
        if (info.array) {
            if (info.isExternal) throw new UnsupportedOperationException("Cannot handle external array variabels.")
            return '''
                «array» = cJSON_CreateArray();
                «info.serializeArray(varName, 0, array)»
                cJSON_AddItemToObject(«json», "«varName»", «array»);
            '''
        } else {
            val type = info.type
            val access = if (info.isExternal) {
                info.externalName
            } else {
                "${tickdata_name}" + accessor + varName
            }
            val creator = switch(type) {
                case BOOL: '''cJSON_CreateBool(«access»)'''
                case UNSIGNED,
                case INT,
                case DOUBLE,
                case FLOAT: '''cJSON_CreateNumber(«access»)'''
                case STRING: '''cJSON_CreateString((«access» != NULL) ? «access» : "")'''
                default: {
                    environment.errors.add("Cannot serialize simulation interface. Unsupported type: " + type)
                    ""
                }
            }
            return '''cJSON_AddItemToObject(«json», "«varName»", «creator»);'''
        }
    }
    
    def String serializeArray(VariableInformation info, String varName, int idx, String json) {
        val dimensions = info.dimensions
        val creator = if (idx + 1 >= dimensions.size) {
            val access = accessor + varName + (0..<dimensions.size).map["[i"+it+"]"].join
            switch(info.type) {
                case BOOL: '''cJSON_CreateBool(${tickdata_name}«access»)'''
                case UNSIGNED,
                case INT,
                case DOUBLE,
                case FLOAT: '''cJSON_CreateNumber(${tickdata_name}«access»)'''
                case STRING: '''cJSON_CreateString((${tickdata_name}«access» != NULL) ? ${tickdata_name}«access» : "")'''
                default: {
                    environment.errors.add("Cannot serialize simulation interface. Unsupported type: " + type)
                    ""
                }
            }
        } else {
            '''cJSON_CreateArray()'''
        }
        return '''
            for (int i«idx» = 0; i«idx» < «dimensions.get(idx)»; i«idx»++) {
                cJSON *item«idx» = «creator»;
                «IF idx + 1 < dimensions.size»
                «info.serializeArray(varName, idx + 1, "item" + idx)»
                «ENDIF»
                cJSON_AddItemToArray(«json», item«idx»);
            }
        '''
    }
    
    def parse(Pair<String, VariableInformation> variable, String json) {
        val varName = variable.key
        val info = variable.value
        if (info.array) {
            if (info.isExternal) throw new UnsupportedOperationException("Cannot handle external array variabels.")
            return info.parseArray(varName, 0, info.dimensions.size, json)
        } else if (info.isExternal){
            return '''«info.externalName» = «json»«info.jsonTypeGetter»;'''
        } else {
            return '''${tickdata_name}«accessor»«varName» = «json»«info.jsonTypeGetter»;'''
        }
    }
    
    def jsonTypeGetter(VariableInformation info) {
        return switch(info.type) {
            case UNSIGNED,
            case BOOL,
            case INT: "->valueint"
            case DOUBLE,
            case FLOAT: "->valuedouble"
            case STRING: "->valuestring"
            default: {
                environment.errors.add("Cannot serialize simulation interface. Unsupported type: " + type)
                ""
            }
        }
    }

    def String parseArray(VariableInformation info, String varName, int idx, int dimensions, String json) {
        if (idx == dimensions) {
            return '''${tickdata_name}«accessor»«varName»«(0..<dimensions).map["[i"+it+"]"].join» = item«idx - 1»«info.jsonTypeGetter»;'''
        } else {
            return '''
                for (int i«idx» = 0; i«idx» < cJSON_GetArraySize(«json»); i«idx»++) {
                    cJSON *item«idx» = cJSON_GetArrayItem(«json», i«idx»);
                    «info.parseArray(varName, idx + 1, dimensions, "item" + idx)»
                }
            '''
        }
    }
}