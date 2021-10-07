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
package de.cau.cs.kieler.scg.processors.codegen.c

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.Nameable
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import static de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames.*
import de.cau.cs.kieler.kexpressions.NullValue

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
class CCodeGeneratorModule extends SCGCodeGeneratorModule {
    
    @Inject extension PragmaExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension CCodeSerializeHRExtensions
    
    @Inject Injector injector
    
    protected static val HOSTCODE = PragmaRegistry.register("hostcode", StringPragma, "Allows additional hostcode to be included (e.g. includes).")
    protected static val HOSTCODE_C = PragmaRegistry.register("hostcode-c", StringPragma, "Allows additional hostcode to be included (e.g. includes) only for C.")
    protected static val HOSTCODE_HEADER = PragmaRegistry.register("hostcode-c-header", StringPragma, "Allows additional hostcode to be included (e.g. includes) only for the C header fie.")
    
    public static val C_EXTENSION = ".c"
    public static val H_EXTENSION = ".h"
    
    @Accessors var SCGCodeGeneratorModule struct = null
    @Accessors var SCGCodeGeneratorModule reset = null
    @Accessors var SCGCodeGeneratorModule tick = null
    @Accessors var SCGCodeGeneratorModule logic = null
    
    override configure() {
        modifications.clear
        
        struct = injector.getInstance(CCodeGeneratorStructModule)
        reset = injector.getInstance(CCodeGeneratorResetModule)
        tick = injector.getInstance(CCodeGeneratorTickModule)
        logic = injector.getInstance(CCodeGeneratorLogicModule)
            
        struct.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + H_EXTENSION, this, TICKDATA_STRUCT_NAME)
        reset.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + C_EXTENSION, this, RESET_FUNCTION_NAME)
        tick.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + C_EXTENSION, this, TICK_FUNCTION_NAME)
        logic.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + C_EXTENSION, this, LOGIC_FUNCTION_NAME)
    }
    
    override generateInit() {
        struct?.generateInit
        reset?.generateInit
        logic?.generateInit
        tick?.generateInit
    }
    
    override generate() {
        struct?.generate
        reset?.generate
        logic?.generate
        tick?.generate
    }
    
    
    override generateDone() {
        struct?.generateDone
        reset?.generateDone
        logic?.generateDone
        tick?.generateDone
    }
    
    /**
     * In C, the generator write creates two files, a header and a c file.
     */
    override generateWrite(CodeContainer codeContainer) {
        val hFilename = codeFilename + H_EXTENSION
        val hDefine = hFilename.toUpperCase.replaceAll("\\W", "_")
        val cFilename = codeFilename + C_EXTENSION
        val hFile = new StringBuilder
        val cFile = new StringBuilder

        hFile.pragmaOnceStart(hDefine)
        hFile.addHeader
        hFile.hostcodeHeaderAdditions
        cFile.addHeader
        cFile.hostcodeAdditions
        cFile.append("#include \"" + hFilename + "\"\n\n")
        
        generateWriteCodeModules(hFile, cFile)        

        hFile.pragmaOnceEnd(hDefine)
        naming.put(TICK, tick.getName)
        naming.put(RESET, reset.getName)
        naming.put(LOGIC, logic.getName)
        naming.put(TICKDATA, struct.getName)
        
        val cCode = codeContainer.addCCode(cFilename, cFile.toString) => [
            it.naming.putAll(this.naming)
            modelName = if (moduleObject instanceof Nameable) moduleObject.name else "_default"
        ]        
        val hCode = codeContainer.addCHeader(hFilename, hFile.toString) => [
            it.naming.putAll(this.naming)   
            modelName = if (moduleObject instanceof Nameable) moduleObject.name else "_default"
        ]
        // associate variables with the code files
        VariableStore.get(processorInstance.environment).associateCode(scg, cCode, hCode)
    } 
    
    protected def generateWriteCodeModules(StringBuilder hFile, StringBuilder cFile) {
        hFile.append(struct.code)
        cFile.append(logic.code).append("\n")
        cFile.append(reset.code).append("\n")
        cFile.append(tick.code)
    }   
    
    /**
     * Adds the information header.
     */
    protected def void addHeader(StringBuilder sb) {
        sb.append(
            "/*\n" + " * Automatically generated C code by\n" + " * KIELER SCCharts - The Key to Efficient Modeling\n" +
                " *\n" + " * http://rtsys.informatik.uni-kiel.de/kieler\n" + " */\n\n")
                
        if (processorInstance.environment.getProperty(CCodeGenerator.DEBUG_COMMENTS)) {
            sb.addDebugComments
        }
    }  
    
    /**
     * Adds hostcode additions. These can come from internal sources like the serialization, 
     * but also from the model via hostcode pragmas.
     */
    protected def void hostcodeAdditions(StringBuilder sb) {
        val includes = modifications.get(CCodeSerializeHRExtensions.INCLUDES)
        for (include : includes)  {
            sb.append("#include " + include + "\n")
        }
        
        val hostcodePragmas = SCGraphs.getStringPragmas(HOSTCODE) + SCGraphs.getStringPragmas(HOSTCODE_C)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        val hostcodeAnnotations = scg.getStringAnnotations(HOSTCODE) + scg.getStringAnnotations(HOSTCODE_C)
        for (anno : hostcodeAnnotations) {
            sb.append(anno.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || hostcodeAnnotations.size > 0 || includes.size > 0) {
            sb.append("\n")
        }
    }
    
    /**
     * Adds hostcode additions for header. These can come from internal sources like the serialization, 
     * but also from the model via hostcode pragmas.
     */
    protected def void hostcodeHeaderAdditions(StringBuilder sb) {
        val includes = modifications.get(CCodeSerializeHRExtensions.HEADER_INCLUDES)
        for (include : includes)  {
            sb.append("#include " + include + "\n")
        }
        
        if (scg.eAllContents.exists[it instanceof NullValue]) {
            sb.append("#ifndef NULL\n#define NULL 0\n#endif\n")
        }
        
        val hostcodePragmas = SCGraphs.getStringPragmas(HOSTCODE) + SCGraphs.getStringPragmas(HOSTCODE_HEADER)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        val hostcodeAnnotations = scg.getStringAnnotations(HOSTCODE) + scg.getStringAnnotations(HOSTCODE_HEADER)
        for (anno : hostcodeAnnotations) {
            sb.append(anno.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || hostcodeAnnotations.size > 0 || includes.size > 0) {
            sb.append("\n")
        }
    } 
    
    /**
     * If debug comments are toggled, information from the context are also saved.
     * For now this includes a list of executed processors.
     */
    protected def void addDebugComments(StringBuilder sb) {
        sb.append("/*\n" + " * Debug Comments\n *\n")
        
        val compilationContext = processorInstance.environment.getProperty(Environment.COMPILATION_CONTEXT)
        for(processor : compilationContext.processorInstancesSequence) {
            sb.append(" * " + processor.id + "\n")
        }
        
        sb.append(" */\n\n")
    }
    
    /**
     * Add pragma for single header include.
     */
    protected def void pragmaOnceStart(StringBuilder sb, String define) {
        sb.append("#ifndef " + define)
        sb.append("\n#define " + define)
        sb.append("\n")
    }
    protected def void pragmaOnceEnd(StringBuilder sb, String define) {
        sb.append("\n#endif /* !" + define + " */")
        sb.append("\n")
    }
    
}