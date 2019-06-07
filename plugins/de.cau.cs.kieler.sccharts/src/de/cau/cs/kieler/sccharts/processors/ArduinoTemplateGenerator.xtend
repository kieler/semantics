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
package de.cau.cs.kieler.sccharts.processors

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.CCodeFile
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kicool.deploy.processor.MacroAnnotations

import static de.cau.cs.kieler.kicool.deploy.TemplatePosition.*
import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames

/**
 * @author ssm
 * @kieler.design 2018-11-19 proposed
 * @kieler.rating 2018-11-19 proposed yellow
 */
class ArduinoTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {

    public static val FILE_NAME = "arduino-deployment.ftl"
     
    public static val ANNOTATION_PINMODE_NAME = "pin"
    public static val ANNOTATION_PULLUP_NAME = "pullup"
    public static val ANNOTATION_INVERT_NAME = "invert"

    public static val IProperty<String> STRUCT_ACCESS = 
        new Property<String>("de.cau.cs.kieler.c.struct.access", ".")

    override getId() {
        "de.cau.cs.kieler.sccharts.arduino.template"
    }
    
    override getName() {
        "Arduino Deployment Template"
    }
    
    override generateTemplate() {
        // Extend general template environment
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        val generalTemplateEnvironment = environment.getProperty(TemplateEngine.GENRAL_ENVIRONMENT)?:newHashMap
        environment.setProperty(TemplateEngine.GENRAL_ENVIRONMENT, generalTemplateEnvironment)
        
        if (infra.sourceCode !== null) {
            val structFiles = infra.sourceCode.files.filter(CCodeFile).filter[!naming.empty].toList
            var structFile = structFiles.findFirst[!header]
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
        logger.println("Generating templates code")
        
        val store = VariableStore.getVariableStore(environment)
        if (store.ambiguous) {
            environment.warnings.add("VariableStore contains ambiguous information for variables.")
            logger.println("WARNING:VariableStore contains ambiguous information for variables. Only first match will be used!")
        }
        
        val inputPinVariables = <String, String> newHashMap
        val inputPinIsPullUp = <String, Boolean> newHashMap
        val inputPinIsInverted = <String, Boolean> newHashMap
        val outputPinVariables = <String, String> newHashMap
        for (v : store.orderedVariables.map[key]) {
            val vi = store.variables.get(v).head
            if (vi.input) {
                if (vi.annotations.exists[ name == ANNOTATION_PINMODE_NAME ]) {
                    inputPinVariables.put(v, vi.annotations.filter[ name == ANNOTATION_PINMODE_NAME ].filter(StringAnnotation).head.values.head )
                    inputPinIsPullUp.put(v, vi.annotations.exists[ name == ANNOTATION_PULLUP_NAME ])
                    inputPinIsInverted.put(v, vi.annotations.exists[ name == ANNOTATION_INVERT_NAME ])
                    if (vi.type !== ValueType.INT && vi.type !== ValueType.BOOL) {
                        environment.warnings.add("Variable " + v + " has an unsupported interface type. It will be ignored.")
                        logger.println("WARNING:Variable " + v + " has an unsupported interface type. It will be ignored.")
                    }
                } else {
                    if (vi.annotations.forall[ name != MacroAnnotations.ANNOTATION_MACRO_NAME ]) {
                        environment.warnings.add("Variable " + v + " is an input, but has no pin associated with it.")
                        logger.println("WARNING:Variable " + v + " is an input, but has no pin associated with it.")
                    }
                }
            }
            if (vi.output) {
                if (vi.annotations.exists[ name == ANNOTATION_PINMODE_NAME ]) {
                    outputPinVariables.put(v, vi.annotations.filter[ name == ANNOTATION_PINMODE_NAME ].filter(StringAnnotation).head.values.head )
                    if (vi.type !== ValueType.INT && vi.type !== ValueType.BOOL) {
                        environment.warnings.add("Variable " + v + " has an unsupported interface type. It will be ignored.")
                        logger.println("WARNING:Variable " + v + " has an unsupported interface type. It will be ignored.")
                    }
                } else {
                    if (vi.annotations.forall[ name != MacroAnnotations.ANNOTATION_MACRO_NAME ]) {
                        environment.warnings.add("Variable " + v + " is an output, but has no pin associated with it.")
                        logger.println("WARNING:Variable " + v + " is an output, but has no pin associated with it.")
                    }
                }
            } 
        }
        
        val cc = new CodeContainer
        val code = 
            '''
            <#macro pin_init position>
            «FOR v : inputPinVariables.keySet»
            pinMode(«inputPinVariables.get(v)», «IF inputPinIsPullUp.get(v)»INPUT_PULLUP«ELSE»INPUT«ENDIF»);
            «ENDFOR» 
            «FOR v : outputPinVariables.keySet»
            pinMode(«outputPinVariables.get(v)», OUTPUT);
            «ENDFOR» 
            </#macro>
            
            <#macro pin_input position>
            «FOR v : inputPinVariables.keySet»
            «store.parse(v, inputPinVariables.get(v), inputPinIsInverted.get(v))»
            «ENDFOR»
            </#macro>
            
            <#macro pin_output position>
            «FOR v : outputPinVariables.keySet»
            «store.serialize(v, outputPinVariables.get(v))»
            «ENDFOR»
            </#macro>
            '''
        
        cc.add(FILE_NAME, code)
        
        environment.addIncludeInjection(FILE_NAME.relativeTemplatePath)
        environment.addMacroInjection(INIT, "pin_init")
        environment.addMacroInjection(INPUT, "pin_input")
        environment.addMacroInjection(OUTPUT, "pin_output")
        
        return cc
    }
    
    private def access() {
        return environment.getProperty(STRUCT_ACCESS)?:STRUCT_ACCESS.^default
    }
    
    def serialize(VariableStore store, String varName, String pin) {
        if (store.variables.get(varName).head.array) {
            return store.serializeArray(varName, 0, pin)
        } else {
            val type = store.variables.get(varName).head.type
            val writeType = if (type == ValueType.INT) '''analogWrite''' else '''digitalWrite'''
            return '''«writeType»(«pin», ${tickdata_name}«access»«varName»);'''
        }
    }
    
    def String serializeArray(VariableStore store, String varName, int idx, String json) {
        val type = store.variables.get(varName).head.inferType
        val writeType = if (type == ValueType.INT) '''analogWrite''' else '''digitalWrite'''
        val info = store.variables.get(varName).head
        val pinAnnotation = info.annotations.filter[ name == ANNOTATION_PINMODE_NAME ].filter(StringAnnotation).head
        
        val code = 
            '''
            «FOR pa : pinAnnotation.values.indexed»
            «writeType»(«pa.value», ${tickdata_name}«access»«varName»[«pa.key»]);
            «ENDFOR»
            '''
            
        return code
    }
    
    def parse(VariableStore store, String varName, String pin, boolean invert) {
        if (store.variables.get(varName).head.array) {
            return store.parseArray(varName, 0, store.variables.get(varName).head.dimensions.size, pin, invert)
        } else {
            val type = store.variables.get(varName).head.inferType
            if (type == ValueType.INT)              
                return '''${tickdata_name}«access»«varName» = analogRead(«pin»);'''
            if (type == ValueType.BOOL)
                return '''${tickdata_name}«access»«varName» = «IF invert»!«ENDIF»digitalRead(«pin»);''' 
        }
    }
    
    def String parseArray(VariableStore store, String varName, int idx, int dimensions, String pin, boolean invert) {
        val type = store.variables.get(varName).head.inferType
        val readType = if (type == ValueType.INT) '''analogRead''' else '''«IF invert»!«ENDIF»digitalRead'''
        val info = store.variables.get(varName).head
        val pinAnnotation = info.annotations.filter[ name == ANNOTATION_PINMODE_NAME].filter(StringAnnotation).head
        
        val code = 
            '''
            «FOR pa : pinAnnotation.values.indexed»
            ${tickdata_name}«access»«varName»[«pa.key»] = «readType»(«pa.value»);
            «ENDFOR»
            '''
            
        return code
    }
}