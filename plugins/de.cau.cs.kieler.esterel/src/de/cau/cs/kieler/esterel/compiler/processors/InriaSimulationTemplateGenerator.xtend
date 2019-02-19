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
package de.cau.cs.kieler.esterel.compiler.processors

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
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
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.esterel.Signal

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class InriaSimulationTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {

    public static val FILE_NAME = "c-simulation.ftl"
    
    private static val SIM_SIG_PREFIX = "_SIM_SIG_"
    private static val SIM_VAL_PREFIX = "_SIM_VAL_"
    private static val SIM_SIG_RESET_FUNC = "_SIM_resetOutput"
    

    override getId() {
        "de.cau.cs.kieler.esterel.compiler.inria.simulation.template"
    }
    
    override getName() {
        "Generate Inria Simulation Template"
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
            
            <#macro simulation_output_decl position>
            // Output variable declaration
            «FOR v : store.orderedVariables.filter[value.properties.contains(VariableStore.OUTPUT) && value.properties.contains(InriaSimulationPreparation.ESTEREL_ORIG)]»
            char «SIM_SIG_PREFIX + v.key»;
                «IF v.value.type != ValueType.PURE»
                 «v.value.cType» «SIM_VAL_PREFIX + v.key»;
                «ENDIF»
            «ENDFOR» 
            </#macro>
            
            <#macro simulation_output position>
            // Reset function for output signals
            void «SIM_SIG_RESET_FUNC»() {
                «FOR v : store.orderedVariables.filter[value.properties.contains(VariableStore.OUTPUT) && value.properties.contains(InriaSimulationPreparation.ESTEREL_ORIG)]»
                «SIM_SIG_PREFIX + v.key» = 0;
                «ENDFOR» 
            }
            
            // Esterel output callbacks
            «FOR v : store.orderedVariables.filter[value.properties.contains(VariableStore.OUTPUT) && value.properties.contains(InriaSimulationPreparation.ESTEREL_ORIG)]»
            void ${tickdata_name}_O_«v.key»(«if (v.value.type != ValueType.PURE) v.value.cType + " value" else ""») {
                «SIM_SIG_PREFIX + v.key» = 1;
                «IF v.value.type != ValueType.PURE»
                «SIM_VAL_PREFIX + v.key» = value;
                «ENDIF»
            }
            «ENDFOR»
            </#macro>
            
            <#macro simulation_output_reset position>
            «SIM_SIG_RESET_FUNC»();
            </#macro>
            
            <#macro simulation_init position>
            notifyInterfaceVariables();
            </#macro>
            
            <#macro simulation_in position>
            receiveVariables();
            </#macro>
            
            <#macro simulation_out position>
            sendVariables();
            </#macro>
            
            <#macro simulation_communication position>
            // Simulation communication
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
                    «FOR v : store.orderedVariables.filter[value.isExternal || value.properties.contains(VariableStore.INPUT) && value.properties.contains(InriaSimulationPreparation.ESTEREL_ORIG)]»
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
                «FOR v : store.orderedVariables.filter[value.isExternal || value.properties.contains(VariableStore.OUTPUT) && value.properties.contains(InriaSimulationPreparation.ESTEREL_ORIG)]»
                    // Send «v.key»
                    «v.serialize("root", false)»
                «ENDFOR»
            
                // Get JSON object as string
                char* outString = cJSON_Print(root);
                cJSON_Minify(outString);
                // Flush to stdout
                printf("%s\n", outString);
                fflush(stdout);
            
                cJSON_Delete(root);
            }
            
            void notifyInterfaceVariables() {
                cJSON* root = cJSON_CreateObject();
                «FOR v : store.orderedVariables.filter[value.isExternal || value.properties.contains(InriaSimulationPreparation.ESTEREL_ORIG)]»
                    // Notify about «v.key»
                    «v.serialize("root", true)»
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
            
            <#macro simulation_loop position>
            while (1) {
                while(getchar() != '\n');
                sendVariables();
            }
            </#macro>
        '''
        
        cc.add(FILE_NAME, code)
        
        environment.addIncludeInjection(FILE_NAME.relativeTemplatePath)
        environment.addMacroInjection(HEADER, "simulation_imports")
        environment.addMacroInjection(GLOBAL_DECLARATION, "simulation_output_decl")
        environment.addMacroInjection(BODY, "simulation_output")
        environment.addMacroInjection(END_LOOP, "simulation_output_reset")
        environment.addMacroInjection(BODY, "simulation_communication")
        environment.addMacroInjection(INIT, "simulation_init")
        environment.addMacroInjection(INPUT, "simulation_in")
        environment.addMacroInjection(OUTPUT, "simulation_out")
        environment.addMacroInjection(END_MAIN, "simulation_loop")
        
        return cc
    }
    
    def serialize(Pair<String, VariableInformation> variable, String json, boolean notify) {
        val varName = variable.key
        val info = variable.value
        if (info.array) {
            throw new UnsupportedOperationException("Cannot handle arrays.")
        } else {
            val type = info.type
            if (info.isExternal) {
                return '''cJSON_AddItemToObject(«json», "«varName»", «type.getCreator(if (notify) "0" else info.externalName)»);'''
            } else if (type == ValueType.PURE) {
                return '''cJSON_AddItemToObject(«json», "«varName»", cJSON_CreateBool(«if (notify) "0" else SIM_SIG_PREFIX + varName»));'''
            } else {
                return '''
                cJSON_AddItemToObject(«json», "«varName»", cJSON_CreateBool(«if (notify) "0" else SIM_SIG_PREFIX + varName»));
                cJSON_AddItemToObject(«json», "«varName»_val", «type.getCreator(if (notify) "0" else SIM_VAL_PREFIX + varName)»);
                '''
            }
        }
    }
    
    private def getCreator(ValueType type, String access) {
        return switch(type) {
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
    }
    
    def parse(Pair<String, VariableInformation> variable, String json) {
        val varName = variable.key
        val info = variable.value
        if (info.array) {
            throw new UnsupportedOperationException("Cannot handle arrays.")
        } else if (info.isExternal) {
            return '''«info.externalName» = «json»«info.jsonTypeGetter»;'''
        } else if (variable.value.type == ValueType.PURE) {
            return '''if («json»->valueint) ${tickdata_name}_I_«varName»();'''
        } else {
            return '''
            if («json»->valueint) {
                cJSON *val_item = cJSON_GetObjectItemCaseSensitive(root, "«variable.key»_val");
                if(val_item != NULL) {
                    ${tickdata_name}_I_«varName»(val_item«info.jsonTypeGetter»);
                } else {
                    ${tickdata_name}_I_«varName»(0);
                }
            }'''
        }
    }
    
    def jsonTypeGetter(VariableInformation info) {
        return switch(info.type) {
            case UNSIGNED,
            case BOOL,
            case PURE,
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

    def cType(VariableInformation info) {
        val valueType = info.type
        if (valueType == ValueType.BOOL) {
            return "char"
        } else if (valueType == ValueType.STRING) {
            return "char*"
        } else {
            return valueType.literal
        }
    }
}
