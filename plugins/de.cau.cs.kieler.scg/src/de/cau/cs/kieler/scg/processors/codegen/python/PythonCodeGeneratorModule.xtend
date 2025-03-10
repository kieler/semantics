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
package de.cau.cs.kieler.scg.processors.codegen.python

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.Nameable
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGenerator
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorModule

import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import static de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames.*

/**
 * Root Python Code Generator Module
 * 
 * Initializes necessary modules and invokes them in correct order.
 * 
 * @author als
 * 
 */
class PythonCodeGeneratorModule extends CCodeGeneratorModule {
    
    @Inject extension PragmaExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension PythonCodeSerializeHRExtensions
    
    @Inject Injector injector
    
    public static val HOSTCODE_PYTHON = PragmaRegistry.register("hostcode-python", StringPragma, "Allows additional hostcode to be included (e.g. imports) only for Python.")
    
    public static val PYTHON_EXTENSION = ".py"
    
    override configure() {
        modifications.clear
        
        struct = injector.getInstance(PythonCodeGeneratorStructModule)
        reset = injector.getInstance(PythonCodeGeneratorResetModule)
        tick = injector.getInstance(PythonCodeGeneratorTickModule)
        logic = injector.getInstance(PythonCodeGeneratorLogicModule)
            
        struct.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + PYTHON_EXTENSION, this, TICKDATA_STRUCT_NAME)
        reset.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + PYTHON_EXTENSION, this, RESET_FUNCTION_NAME)
        tick.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + PYTHON_EXTENSION, this, TICK_FUNCTION_NAME)
        logic.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + PYTHON_EXTENSION, this, LOGIC_FUNCTION_NAME)
    }
    
    override generateWrite(CodeContainer codeContainer) {
        val cFilename = codeFilename + PYTHON_EXTENSION
        val cFile = new StringBuilder

        cFile.addHeader
        cFile.hostcodeAdditions
        
        cFile.append("class " + codeFilename + ":\n\n")

        cFile.append(struct.code).append("\n")
        cFile.append(reset.code).append("\n")
        cFile.append(logic.code).append("\n")
        cFile.append(tick.code)

        naming.put(TICK, tick.getName)
        naming.put(RESET, reset.getName)
        naming.put(LOGIC, logic.getName)
        naming.put(TICKDATA, struct.getName)

        codeContainer.addPythonCode(cFilename, cFile.toString) => [
            it.naming.putAll(this.naming)   
            modelName = if (moduleObject instanceof Nameable) moduleObject.name else "_default"
        ]        
    }    
    
    override void addHeader(StringBuilder sb) {
        sb.append(
            "\"\"\"\n" + " Automatically generated Python code by\n" + " KIELER SCCharts - The Key to Efficient Modeling\n" +
                " \n" + " http://rtsys.informatik.uni-kiel.de/kieler\n" + "\"\"\"\n\n")
                
        if (processorInstance.environment.getProperty(CCodeGenerator.DEBUG_COMMENTS)) {
            sb.addDebugComments
        }
    }
    
    override void addDebugComments(StringBuilder sb) {
        sb.append("'''\n" + " * Debug Comments\n *\n")
        
        val compilationContext = processorInstance.environment.getProperty(Environment.COMPILATION_CONTEXT)
        for(processor : compilationContext.processorInstancesSequence) {
            sb.append(" * " + processor.id + "\n")
        }
        
        sb.append("'''\n\n")
    }
    
    override void hostcodeAdditions(StringBuilder sb) {
        val includes = modifications.get(PythonCodeSerializeHRExtensions.INCLUDES)
        for (include : includes)  {
            sb.append("import " + include + "\n")
        }
        
        val hostcodePragmas = SCGraphs.getStringPragmas(HOSTCODE) + SCGraphs.getStringPragmas(HOSTCODE_PYTHON)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        val hostcodeAnnotations = scg.getStringAnnotations(HOSTCODE) + scg.getStringAnnotations(HOSTCODE_PYTHON)
        for (anno : hostcodeAnnotations) {
            sb.append(anno.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || hostcodeAnnotations.size > 0 || includes.size > 0) {
            sb.append("\n")
        }
    }
}