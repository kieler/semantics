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
package de.cau.cs.kieler.lustre.compiler.processors

import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kicool.compilation.CCodeFile
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractSystemCompilerProcessor
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine
import de.cau.cs.kieler.lustre.compiler.LustreV6Compiler

import static de.cau.cs.kieler.kicool.deploy.TemplatePosition.*

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames

/**
 * @author lgr
 */
class LustreSimulationTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {

    public static val FILE_NAME = "c-simulation.ftl"
    
    static val SIM_VAR_PREFIX = "_SIM_VAR_"

    override getId() {
        "de.cau.cs.kieler.lustre.compiler.v6.simulation.template"
    }
    
    override getName() {
        "Generate V6 Simulation Template"
    }
    
    override generateTemplate() {
        // Extend general template environment
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        val generalTemplateEnvironment = environment.getProperty(TemplateEngine.GENRAL_ENVIRONMENT)?:newHashMap
        environment.setProperty(TemplateEngine.GENRAL_ENVIRONMENT, generalTemplateEnvironment)
        
        if (environment.propertyExists(LustreV6Compiler.NODE_NAME)) {
            var nodeName = environment.getProperty(LustreV6Compiler.NODE_NAME)
            environment.setProperty(AbstractSystemCompilerProcessor.ADDITIONAL_OPTIONS, nodeName + "_" + nodeName + ".h")
        }
        
        if (infra.sourceCode !== null) {
            val structFiles = infra.sourceCode.files.filter(CCodeFile).filter[!naming.empty].toList
            var structFile = structFiles.findFirst[header]
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
        
        val store = VariableStore.getVariableStore(environment)
        if (store.ambiguous) {
            environment.warnings.add("VariableStore contains ambiguous information for variables.")
            logger.println("WARNING:VariableStore contains ambiguous information for variables. Only first match will be used!")
        }
        
        var inputs = store.orderedVariables.filter[value.properties.contains(VariableStore.INPUT) && value.properties.contains(LustreSimulationPreparation.LUSTRE_ORIG)].map[key].map[LustreSimulationTemplateGenerator.SIM_VAR_PREFIX + it]
        var outputReferences = store.orderedVariables.filter[value.properties.contains(VariableStore.OUTPUT) && value.properties.contains(LustreSimulationPreparation.LUSTRE_ORIG)].map[key].map["&" + LustreSimulationTemplateGenerator.SIM_VAR_PREFIX + it]
        var hasState = if (environment.propertyExists(LustreV6CodeGenerator.HAS_STATE)) environment.getProperty(LustreV6CodeGenerator.HAS_STATE) else false;
        
        val cc = new CodeContainer
        
        val code = 
            '''
            <#macro simulation_imports position>
            #include <stdio.h>
            #include <unistd.h>
            
            #include "lib/cJSON.h"
            </#macro>
            
            <#macro simulation_output_decl position>
            // Output variable declaration
            «FOR v : store.orderedVariables.filter[value.properties.contains(VariableStore.OUTPUT) && value.properties.contains(LustreSimulationPreparation.LUSTRE_ORIG)]»
                «v.value.cType» «LustreSimulationTemplateGenerator.SIM_VAR_PREFIX + v.key»;
            «ENDFOR» 
            </#macro>
                        
            <#macro simulation_input_decl position>            
            // Input variable declaration
            «FOR v : store.orderedVariables.filter[value.properties.contains(VariableStore.INPUT) && value.properties.contains(LustreSimulationPreparation.LUSTRE_ORIG)]»
                «v.value.cType» «LustreSimulationTemplateGenerator.SIM_VAR_PREFIX + v.key»;
            «ENDFOR» 
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
                c = getchar();
                for (i = 0; (c != EOF) && (c != '\n'); i++) {
                    buffer[i] = c;
                    c = getchar();
                }
                buffer[i] = 0;
            
                cJSON *root = cJSON_Parse(buffer);
                cJSON *item = NULL;

                if(root != NULL) {
                    «FOR v : store.orderedVariables.filter[value.isExternal || value.properties.contains(VariableStore.INPUT) && value.properties.contains(LustreSimulationPreparation.LUSTRE_ORIG)]»
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
                «FOR v : store.orderedVariables.filter[value.isExternal || value.properties.contains(VariableStore.OUTPUT) && value.properties.contains(LustreSimulationPreparation.LUSTRE_ORIG)]»
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
                «FOR v : store.orderedVariables.filter[value.isExternal || value.properties.contains(LustreSimulationPreparation.LUSTRE_ORIG)]»
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
            
            <#macro step_parameter position>«(inputs + outputReferences).join(", ")»«IF hasState», ctx«ENDIF»</#macro>
            
            
            <#macro simulation_local_decl position>
            «IF hasState»
            // Init lustre
                ${tickdata_name}_ctx_type* ctx = ${tickdata_name}_ctx_new_ctx(NULL);
            «ENDIF»
            </#macro>            
        '''
            
        
        cc.add(FILE_NAME, code)
        
        environment.addIncludeInjection(FILE_NAME.relativeTemplatePath)
        environment.addMacroInjection(HEADER, "simulation_imports")
        environment.addMacroInjection(GLOBAL_DECLARATION, "simulation_output_decl")
        environment.addMacroInjection(GLOBAL_DECLARATION, "simulation_input_decl")
        environment.addMacroInjection(BODY, "simulation_communication")
        environment.addMacroInjection(PARAMETER, "step_parameter")
        environment.addMacroInjection(LOCAL_DECLARATION, "simulation_local_decl");
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
            } else {
                return '''
                cJSON_AddItemToObject(«json», "«varName»", «type.getCreator(if (notify) "0" else LustreSimulationTemplateGenerator.SIM_VAR_PREFIX + varName)»);
                '''
            }
        }
    }
    
    private def getCreator(ValueType type, String access) {
        return switch(type) {
            case BOOL: '''cJSON_CreateBool(«access»)'''
            case INT,
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
        } else {
            return '''
                cJSON *val_item = cJSON_GetObjectItemCaseSensitive(root, "«variable.key»");
                if(val_item != NULL) {
                    «LustreSimulationTemplateGenerator.SIM_VAR_PREFIX + varName» = val_item«info.jsonTypeGetter»;
                } else {
                    «LustreSimulationTemplateGenerator.SIM_VAR_PREFIX + varName» = 0;
                }
            '''
        }
    }
    
    def jsonTypeGetter(VariableInformation info) {
        return switch(info.type) {
            case BOOL,
            case PURE,
            case INT: "->valueint"
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
        } else if (valueType == ValueType.FLOAT) {
            return "double"
        } else {
            return valueType.literal
        }
    }
}
