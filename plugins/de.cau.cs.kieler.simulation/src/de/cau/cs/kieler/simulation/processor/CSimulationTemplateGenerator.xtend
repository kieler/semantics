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

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.CCodeFile
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.CodeFile
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine
import de.cau.cs.kieler.simulation.internal.SimulationVariableStore

import static de.cau.cs.kieler.kicool.deploy.TemplatePosition.*

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*

/**
 * @author als
 */
class CSimulationTemplateGenerator extends AbstractSimulationTemplateGenerator {

    public static val FILE_NAME = "c-simulation.ftl" 

    public static val IProperty<String> STRUCT_ACCESS = 
        new Property<String>("de.cau.cs.kieler.simulation.c.struct.access", ".")

    public static val IProperty<Integer> MESSAGE_BUFFER_SIZE = 
        new Property<Integer>("de.cau.cs.kieler.simulation.c.buffer.size", 2048)
    
    var VariableStore store

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
        
        var CodeFile structFile = null
        if (infra.sourceCode !== null) {
            val structFiles = infra.sourceCode.files.filter(CCodeFile).filter[!library && !naming.empty].toList
            structFile = structFiles.findFirst[header]
            if (structFile === null) {
                structFile = structFiles.head
            }
            if (structFile !== null) {
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_TYPE, structFile.naming.get(CodeGeneratorNames.TICKDATA))
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_FILE, structFile.fileName)
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_RESET_NAME, structFile.naming.get(CodeGeneratorNames.RESET))
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_TICK_NAME, structFile.naming.get(CodeGeneratorNames.TICK))
            }
        }
        
        // Generate template
        logger.println("Generating simulation code")
        
        store = VariableStore.getVariableStore(environment).getFilteredCopy(structFile)
        if (store.ambiguous) {
            environment.warnings.add("VariableStore contains ambiguous information for variables.")
            logger.println("WARNING:VariableStore contains ambiguous information for variables. Only first match will be used!")
        }
        
        if (store.variables.values.exists[input && container]) {
            environment.errors.add("Input variables of type object (class/struct) are currently not supported and will be ignored.")
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
            
            <#macro simulation_init position>
            sendVariables(1);
            </#macro>
            
            <#macro simulation_in position>
            receiveVariables();
            </#macro>
            
            <#macro simulation_out position>
            sendVariables(0);
            </#macro>
            
            <#macro simulation_body position>
            void receiveVariables() {
                size_t blocksize = «MESSAGE_BUFFER_SIZE.property»;
                char *buffer = realloc(NULL, sizeof(char) * blocksize);
                size_t i = 0;
                
                // read next line
                int c = getchar();
                while (c != EOF && c != '\n') {
                    buffer[i++] = (char) c;
                    if (i == blocksize) {
                        buffer = realloc(buffer, sizeof(char) * (blocksize += «MESSAGE_BUFFER_SIZE.property»));
                    }
                    c = getchar();
                }
                buffer[i++] = '\0';
                
                if (c == EOF) {
                    exit(EOF);
                }
                
                cJSON *root = cJSON_Parse(buffer);
                cJSON *item = NULL;
                if(root != NULL) {
                    «FOR v : store.orderedVariables.dropHostTypes.dropBlacklisted.filter[!value.encapsulated && !value.container]»
                        // Receive «v.key»
                        item = cJSON_GetObjectItemCaseSensitive(root, "«v.key»");
                        if(item != NULL) {
                            «v.parse("item")»
                        }
                    «ENDFOR»
                }
              
                cJSON_Delete(root);
                free(buffer);
            }
            
            void sendVariables(int send_interface) {
                cJSON* root = cJSON_CreateObject();
                «IF store.variables.values.exists[array]»
                    cJSON *array;
                «ENDIF»
                «IF store.variables.values.exists[container]»
                    cJSON *obj;
                «ENDIF»
                
                «FOR v : store.orderedVariables.dropHostTypes.dropBlacklisted.filter[!value.encapsulated]»
                    // Send «v.key»
                    «v.serialize("root", "array", "obj")»
                «ENDFOR»
                
                if (send_interface) {
                    cJSON *interface = cJSON_CreateObject();
                    cJSON *info, *properties;
                    
                    «FOR v : store.orderedVariables.dropHostTypes.dropBlacklisted»
                        info = cJSON_CreateObject();
                        properties = cJSON_CreateArray();
                        «FOR p : v.value.properties»
                        cJSON_AddItemToArray(properties, cJSON_CreateString("«p»"));
                        «ENDFOR»
                        cJSON_AddItemToObject(info, "type", cJSON_CreateString("«v.value.typeName»"));
                        cJSON_AddItemToObject(info, "properties", properties);
                        cJSON_AddItemToObject(interface, "«v.key»", info);
                    «ENDFOR»
                    
                    cJSON_AddItemToObject(root, "«SimulationVariableStore.INTERFACE_KEY»", interface);
                }
            
                // Get JSON object as string
                char* outString = cJSON_Print(root);
                cJSON_Minify(outString);
                // Flush to stdout
                printf("%s\n", outString);
                fflush(stdout);
            
                cJSON_Delete(root);
                free(outString);
            }
            </#macro>
            '''
        
        cc.add(FILE_NAME, code)
        
        environment.addIncludeInjection(FILE_NAME.relativeTemplatePath)
        environment.addMacroInjection(HEADER, "simulation_imports")
        environment.addMacroInjection(BODY, "simulation_body")
        environment.addMacroInjection(INIT, "simulation_init")
        environment.addMacroInjection(INPUT, "simulation_in")
        environment.addMacroInjection(OUTPUT, "simulation_out")
        
        // Mark all variables as part of communation interface
        // This need to be done after #interface was generated to prevent redundant properties
        store.orderedVariables.dropHostTypes.dropBlacklisted.forEach[value.properties.add(SimulationVariableStore.INTERFACE_KEY)]
        
        return cc
    }
    
    private def accessor() {
        return environment.getProperty(STRUCT_ACCESS)?:STRUCT_ACCESS.^default
    }
    
    def String serialize(Pair<String, VariableInformation> variable, String json, String array, String clazz) {
        serialize(variable, "${tickdata_name}" + accessor, json, array, clazz, 0)
    }
    
    def String serialize(Pair<String, VariableInformation> variable, String accessPrefix, String json, String array, String clazz, int depth) {
        val varName = variable.key.simpleName
        val info = variable.value
        if (info.array) {
            if (info.isExternal) throw new UnsupportedOperationException("Cannot handle external array variables.")
            val arrayVar = array?:'''array_«depth»'''
            return '''
                «IF clazz === null»cJSON *«ENDIF»«arrayVar» = cJSON_CreateArray();
                «variable.serializeArray(accessPrefix, 0, arrayVar, depth)»
                cJSON_AddItemToObject(«json», "«varName»", «arrayVar»);
            '''
        } else if (info.container) {
            val clazzVar = clazz?:'''obj_«depth»'''
            return '''
                «IF clazz === null»cJSON *«ENDIF»«clazzVar» = cJSON_CreateObject();
                cJSON_AddItemToObject(«json», "«varName»", «clazzVar»);
                «variable.serializeMember(accessPrefix + varName + ".", clazzVar, depth)»
            '''
        } else {
            val type = info.type
            val access = if (info.isExternal) {
                info.externalName
            } else {
                accessPrefix + varName
            }
            val creator = switch(type) {
                case BOOL: '''cJSON_CreateBool(«access»)'''
                case UNSIGNED,
                case INT,
                case DOUBLE,
                case FLOAT: '''cJSON_CreateNumber(«access»)'''
                case STRING: '''cJSON_CreateStringReference((«access» != NULL) ? «access» : "")'''
                case CLASS,
                case STRUCT: '''cJSON_CreateObject()'''
                default: {
                    environment.errors.add("Cannot serialize simulation interface. Unsupported type: " + type)
                    ""
                }
            }
            return '''cJSON_AddItemToObject(«json», "«varName»", «creator»);'''
        }
    }
    
    def String serializeArray(Pair<String, VariableInformation> variable, String accessPrefix, int idx, String json, int depth) {
        val varName = variable.key.simpleName
        val info = variable.value
        val dimensions = info.dimensions
        val iPrefix = if (depth == 0) "i" else "i_" + depth + "_"
        val i = iPrefix + idx
        val item = if (depth == 0) "item" + idx else "item_" + depth + "_" + idx
        val access = accessPrefix + varName + (0..<dimensions.size).map["["+iPrefix+it+"]"].join
        val creator = if (idx + 1 >= dimensions.size) {
            switch(info.type) {
                case BOOL: '''cJSON_CreateBool(«access»)'''
                case UNSIGNED,
                case INT,
                case DOUBLE,
                case FLOAT: '''cJSON_CreateNumber(«access»)'''
                case STRING: '''cJSON_CreateString((«access» != NULL) ? «access» : "")'''
                case CLASS,
                case STRUCT: '''cJSON_CreateObject()'''
                default: {
                    environment.errors.add("Cannot serialize simulation interface. Unsupported type: " + info.type)
                    ""
                }
            }
        } else {
            '''cJSON_CreateArray()'''
        }
        return '''
            for (int «i» = 0; «i» < «dimensions.get(idx)»; «i»++) {
                cJSON *«item» = «creator»;
                cJSON_AddItemToArray(«json», «item»);
                «IF idx + 1 < dimensions.size»
                    «variable.serializeArray(accessPrefix, idx + 1, item, depth)»
                «ELSE»
                    «IF info.container»
                    «variable.serializeMember(access + ".", item, depth)»
                    «ENDIF»
                «ENDIF»
            }
        '''
    }
    
    def serializeMember(Pair<String, VariableInformation> variable, String accessPrefix, String item, int depth) {
        val members = store.orderedVariables.filter[variable.value.containerName.equals(value.encapsulatedIn)]
        return '''
            «FOR member : members»
                // Add member «member.key.simpleName»
                «member.serialize(accessPrefix, item, null, null, depth + 1)»
            «ENDFOR»
        '''
    }
    
    def parse(Pair<String, VariableInformation> variable, String json) {
        val varName = variable.key
        val info = variable.value
        if (info.array) {
            if (info.isExternal) throw new UnsupportedOperationException("Cannot handle external array variables.")
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
                environment.errors.add("Cannot serialize simulation interface. Unsupported type: " + info.type)
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