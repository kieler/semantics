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
package de.cau.cs.kieler.scg.processors.transformators.codegen.c

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import com.google.inject.Injector
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
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
class CCodeGeneratorModule extends SCGCodeGeneratorModule {
    
    @Inject extension PragmaExtensions
    @Inject extension CCodeSerializeHRExtensions
    
    @Inject Injector injector
    
    protected static val HOSTCODE = PragmaRegistry.register("hostcode", StringPragma, "Allows additional hostcode to be included (e.g. includes).")
    public static val C_EXTENSION = ".c"
    public static val H_EXTENSION = ".h"
    
    @Accessors var SCGCodeGeneratorModule struct
    @Accessors var SCGCodeGeneratorModule reset 
    @Accessors var SCGCodeGeneratorModule tick
    @Accessors var SCGCodeGeneratorModule logic
    
    override configure() {
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
        struct.generateInit
        reset.generateInit
        logic.generateInit
        tick.generateInit
    }
    
    override generate() {
        struct.generate
        reset.generate
        logic.generate
        tick.generate
    }
    
    
    override generateDone() {
        struct.generateDone
        reset.generateDone
        logic.generateDone
        tick.generateDone
    }
    
    /**
     * In C, the generator write creates two files, a header and a c file.
     */
    override generateWrite(CodeContainer codeContainer) {
        val hFilename = codeFilename + H_EXTENSION
        val cFilename = codeFilename + C_EXTENSION
        val hFile = new StringBuilder
        val cFile = new StringBuilder

        hFile.addHeader
        hFile.append(struct.code)
        
        cFile.addHeader
        cFile.hostcodeAdditions
        cFile.append("#include \"" + hFilename + "\"\n\n")        
        cFile.append(reset.code).append("\n")
        cFile.append(logic.code).append("\n")
        cFile.append(tick.code)

        codeContainer.addCCode(cFilename, cFile.toString, struct.name)         
        codeContainer.addCHeader(hFilename, hFile.toString, struct.name)
        
        naming.put(TICK, tick.getName)
        naming.put(RESET, reset.getName)
        naming.put(LOGIC, logic.getName)
        naming.put(TICKDATA, struct.getName)
        
        codeContainer.naming.add(naming)        
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
        
        val hostcodePragmas = SCGraphs.getStringPragmas(HOSTCODE)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || includes.size > 0) {
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
    
}