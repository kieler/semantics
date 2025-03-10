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
import de.cau.cs.kieler.kicool.compilation.PythonCodeFile
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine

import static de.cau.cs.kieler.kicool.deploy.TemplatePosition.*

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*

/**
 * @author als
 */
class PythonSimulationTemplateGenerator extends AbstractSimulationTemplateGenerator {
    
    public static val FILE_NAME = "python-simulation.ftl" 
    
    override getId() {
        "de.cau.cs.kieler.simulation.python.template"
    }
    
    override getName() {
        "Generate Python Simulation Template"
    }
    
    override generateTemplate() {
        // Extend general template environment
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        val generalTemplateEnvironment = environment.getProperty(TemplateEngine.GENRAL_ENVIRONMENT)?:newHashMap
        environment.setProperty(TemplateEngine.GENRAL_ENVIRONMENT, generalTemplateEnvironment)
        
        if (infra.sourceCode !== null) {
            val pyFile = infra.sourceCode.files.filter(PythonCodeFile).filter[!library].head
            if (pyFile !== null && !pyFile.className.nullOrEmpty) {
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_TYPE, pyFile.className)
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_FILE, pyFile.fileName)
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_RESET_NAME, pyFile.naming.get(CodeGeneratorNames.RESET))
                generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_TICK_NAME, pyFile.naming.get(CodeGeneratorNames.TICK))                
            }
        }
        
        // Generate template
        logger.println("Generating simulation code")
        
        val store = VariableStore.getVariableStore(environment)
        if (store.ambiguous) {
            environment.warnings.add("VariableStore contains ambiguous information for variables.")
            logger.println("WARNING:VariableStore contains ambiguous information for variables. Only first match will be used!")
        }
        
        if (store.variables.values.exists[container]) {
            if (store.variables.values.exists[(input || output) && container]) {
                environment.errors.add("Input/Output variables of type object (class/struct) are currently not supported and will be ignored.")
            } else {
                environment.warnings.add("Variables of type object (class/struct) are currently not supported and will be ignored.")
            }
        }
        
        val cc = new CodeContainer
        val code = 
            '''
            <#macro simulation_imports position>
            import json
            import traceback
            </#macro>
            
            <#macro simulation_in position>
            _sim_receive_variables()
            </#macro>
            
            <#macro simulation_out position>
            _sim_send_variables()
            </#macro>
            
            <#macro simulation_body position>
            def _sim_receive_variables():
                try:
                    msg = json.loads(input())
                    
                    «FOR v : store.orderedVariables.dropHostTypes.dropBlacklisted.filter[!value.encapsulated && !value.container]»
                        # Receive «v.key»
                        if "«v.key»" in msg:
                            «v.parse("msg")»
                    «ENDFOR»
                except:
                    traceback.print_exc()
            
            def _sim_send_variables():
                msg = {}
                
                «FOR v : store.orderedVariables.dropHostTypes.dropBlacklisted.filter[!value.encapsulated && !value.container]»
                    # Send «v.key»
                    «v.serialize("msg")»
                «ENDFOR»
                
                print(json.dumps(msg));
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
            if (info.isExternal) throw new UnsupportedOperationException("Cannot handle external array variables.")
            return '''«json»["«varName»"] = ${tickdata_name}.«varName»'''
        } else if (info.isExternal) {
            return '''«json»["«varName»"] = «info.externalName»'''
        } else if (info.isContainer) {
            throw new UnsupportedOperationException("Cannot handle class type variables.")
        } else {
            return '''«json»["«varName»"] = ${tickdata_name}.«varName»'''
        }
    }
    
    def parse(Pair<String, VariableInformation> variable, String json) {
        val varName = variable.key
        val info = variable.value
        if (info.array) {
            if (info.external) throw new UnsupportedOperationException("Cannot handle external array variables.")
            return '''${tickdata_name}.«varName» = «info.jsonTypeCast»(«json»["«varName»"]);'''
        } else if (info.external) {
            return '''«info.externalName» = «info.jsonTypeCast»(«json»["«varName»"]);'''
        } else if (info.isContainer) {
            throw new UnsupportedOperationException("Cannot handle class type variables.")
        } else {
            return '''${tickdata_name}.«varName» = «info.jsonTypeCast»(«json»["«varName»"]);'''
        }
    }
    
    def jsonTypeCast(VariableInformation info) {
        return switch(info.type) {
            case BOOL: "bool"
            case DOUBLE,
            case FLOAT: "float"
            case UNSIGNED,
            case INT: "int"
            case STRING: "str"
            default: {
                environment.errors.add("Cannot serialize simulation interface. Unsupported type: " + info.type)
                ""
            }
        }
    }
    
}