/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.c

import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.Processor
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.SCGraph
import java.util.Map
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import com.google.inject.Injector
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.kicool.environments.Environment

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
    
    @Inject extension AnnotationsExtensions
    @Inject extension CCodeSerializeHRExtensions
    
    @Inject Injector injector
    
    static val HOSTCODE = PragmaRegistry.register("hostcode", StringPragma, "Allows additional hostcode to be included (e.g. includes).")
    static val C_EXTENSION = ".c"
    static val H_EXTENSION = ".h"
    
    @Accessors var CCodeGeneratorStructModule struct
    @Accessors var CCodeGeneratorResetModule reset 
    @Accessors var CCodeGeneratorTickModule tick
    @Accessors var CCodeGeneratorLogicModule logic
    
    override configure(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap, String codeFilename, SCGCodeGeneratorModule parent
    ) {
        super.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename, parent)
        
        struct = injector.getInstance(CCodeGeneratorStructModule)
        reset = injector.getInstance(CCodeGeneratorResetModule)
        tick = injector.getInstance(CCodeGeneratorTickModule)
        logic = injector.getInstance(CCodeGeneratorLogicModule)
            
        struct.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + H_EXTENSION, this)
        reset.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + C_EXTENSION, this)
        tick.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + C_EXTENSION, this)
        logic.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + C_EXTENSION, this)
            
        return this
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
        
        code.addHeader
        code.hostcodeAdditions
        code.append(struct.code).append("\n")
        code.append(reset.code).append("\n")
        code.append(logic.code).append("\n")
        code.append(tick.code)
    }
    
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

        codeContainer.add(cFilename, cFile.toString)         
        codeContainer.add(hFilename, hFile.toString)
    }    
    
    protected def void addHeader(StringBuilder sb) {
        sb.append(
            "/*\n" + " * Automatically generated C code by\n" + " * KIELER SCCharts - The Key to Efficient Modeling\n" +
                " *\n" + " * http://rtsys.informatik.uni-kiel.de/kieler\n" + " */\n\n")
                
        if (processorInstance.environment.getProperty(CCodeGenerator.DEBUG_COMMENTS)) {
            sb.addDebugComments
        }
    }  
    
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
    
    protected def void addDebugComments(StringBuilder sb) {
        sb.append("/*\n" + " * Debug Comments\n *\n")
        
        val compilationContext = processorInstance.environment.getProperty(Environment.COMPILATION_CONTEXT)
        for(processor : compilationContext.processorInstancesSequence) {
            sb.append(" * " + processor.id + "\n")
        }
        
        sb.append(" */\n\n")
    }
    
}