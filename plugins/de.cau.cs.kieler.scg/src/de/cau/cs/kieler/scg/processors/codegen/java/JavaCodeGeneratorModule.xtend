/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.java

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.Nameable
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGenerator
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorModule

import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import static de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames.*

/**
 * Root C Code Generator Module
 * 
 * Initializes necessary modules and invokes them in correct order.
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class JavaCodeGeneratorModule extends CCodeGeneratorModule {
    
    @Inject extension PragmaExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension JavaCodeSerializeHRExtensions
    
    @Inject Injector injector
    
    public static val PACKAGE = PragmaRegistry.register("package", StringPragma, "Package name for the generated file(s)")
    public static val HOSTCODE_JAVA = PragmaRegistry.register("hostcode-java", StringPragma, "Allows additional hostcode to be included (e.g. includes) only for Java.")

    public static val JAVA_EXTENSION = ".java"
    
    override configure() {
        modifications.clear
        
        struct = injector.getInstance(JavaCodeGeneratorStructModule)
        reset = injector.getInstance(JavaCodeGeneratorResetModule)
        tick = injector.getInstance(JavaCodeGeneratorTickModule)
        logic = injector.getInstance(JavaCodeGeneratorLogicModule)
            
        struct.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + JAVA_EXTENSION, this, TICKDATA_STRUCT_NAME)
        reset.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + JAVA_EXTENSION, this, RESET_FUNCTION_NAME)
        tick.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + JAVA_EXTENSION, this, TICK_FUNCTION_NAME)
        logic.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + JAVA_EXTENSION, this, LOGIC_FUNCTION_NAME)
    }
    
    override generateWrite(CodeContainer codeContainer) {
        val cFilename = codeFilename + JAVA_EXTENSION
        val cFile = new StringBuilder

        cFile.packageAdditions
        cFile.addHeader
        cFile.hostcodeAdditions
        
        cFile.append("public class " + codeFilename + " {\n\n")

        cFile.append(struct.code).append("\n")
        cFile.append(reset.code).append("\n")
        cFile.append(logic.code).append("\n")
        cFile.append(tick.code)
        
        cFile.append("}\n")

        naming.put(TICK, tick.getName)
        naming.put(RESET, reset.getName)
        naming.put(LOGIC, logic.getName)
        naming.put(TICKDATA, struct.getName)

        val javaCode = codeContainer.addJavaCode(cFilename, cFile.toString) => [
            it.naming.putAll(this.naming)   
            modelName = if (moduleObject instanceof Nameable) moduleObject.name else "_default"
        ]
        // associate variables the code file
        VariableStore.get(processorInstance.environment).associateCode(scg, javaCode)     
    }    
    
    override void addHeader(StringBuilder sb) {
        sb.append(
            "/*\n" + " * Automatically generated Java code by\n" + " * KIELER SCCharts - The Key to Efficient Modeling\n" +
                " *\n" + " * http://rtsys.informatik.uni-kiel.de/kieler\n" + " */\n\n")
                
        if (processorInstance.environment.getProperty(CCodeGenerator.DEBUG_COMMENTS)) {
            sb.addDebugComments
        }
    }  
    
    override void hostcodeAdditions(StringBuilder sb) {
        val includes = modifications.get(JavaCodeSerializeHRExtensions.INCLUDES)
        for (include : includes)  {
            sb.append("import " + include + "\n")
        }
        
        val hostcodePragmas = SCGraphs.getStringPragmas(HOSTCODE) + SCGraphs.getStringPragmas(HOSTCODE_JAVA)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        val hostcodeAnnotations = scg.getStringAnnotations(HOSTCODE) + scg.getStringAnnotations(HOSTCODE_JAVA)
        for (anno : hostcodeAnnotations) {
            sb.append(anno.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || hostcodeAnnotations.size > 0 || includes.size > 0) {
            sb.append("\n")
        }
    }  
    
    def void packageAdditions(StringBuilder sb) {
        val packagePragma = SCGraphs.getStringPragmas(PACKAGE)
        if (packagePragma.size > 0) {
            sb.append("package ").append(packagePragma.head.values.head).append(";\n\n")
        }
        val packageAnnotations = scg.getStringAnnotations(PACKAGE)
        if (packageAnnotations.size > 0) {
            sb.append("package ").append(packageAnnotations.head.values.head).append(";\n\n")
        }
    }
}