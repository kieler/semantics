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
package de.cau.cs.kieler.sccharts.processors.codegen.statebased

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import com.google.inject.Injector
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions

/**
 * Root C Code Generator Module
 * 
 * Initializes necessary modules and invokes them in correct order.
 * 
 * @author ssm
 * @kieler.design 2018-04-16 proposed 
 * @kieler.rating 2018-04-16 proposed yellow 
 * 
 */
class StatebasedCCodeGeneratorModule extends SCChartsCodeGeneratorModule {
    
    @Inject extension PragmaExtensions
    @Inject extension StatebasedCCodeSerializeHRExtensions
    
    @Inject Injector injector
    
    protected static val HOSTCODE = PragmaRegistry.register("hostcode", StringPragma, "Allows additional hostcode to be included (e.g. includes).")
    public static val C_EXTENSION = ".c"
    public static val H_EXTENSION = ".h"
    
    @Accessors var SCChartsCodeGeneratorModule struct
    @Accessors var SCChartsCodeGeneratorModule reset 
    @Accessors var SCChartsCodeGeneratorModule tick
    @Accessors var SCChartsCodeGeneratorModule logic
    
    override configure() {
        commentsEnabled = processorInstance.environment.getProperty(AbstractCodeGenerator.COMMENTS_ENABLED)
        
        struct = injector.getInstance(StatebasedCCodeGeneratorStructModule)
        reset = injector.getInstance(StatebasedCCodeGeneratorResetModule)
        tick = injector.getInstance(StatebasedCCodeGeneratorTickModule)
        logic = injector.getInstance(StatebasedCCodeGeneratorLogicModule)
            
        struct.configure(baseName, SCCharts, rootState, processorInstance, codeGeneratorModuleMap, codeFilename + H_EXTENSION, this)
        reset.configure(baseName, SCCharts, rootState, processorInstance, codeGeneratorModuleMap, codeFilename + C_EXTENSION, this)
        tick.configure(baseName, SCCharts, rootState, processorInstance, codeGeneratorModuleMap, codeFilename + C_EXTENSION, this)
        logic.configure(baseName, SCCharts, rootState, processorInstance, codeGeneratorModuleMap, codeFilename + C_EXTENSION, this)
    }
    
    override generateInit() {
        struct.printDebug = printDebug
        reset.printDebug = printDebug
        tick.printDebug = printDebug
        logic.printDebug = printDebug
        
        struct.generateInit
        reset.generateInit
        logic.generateInit
        tick.generateInit
    }
    
    override generate() {
        struct.generate
        logic.generate
        reset.generate
        tick.generate
    }
    
    
    override generateDone() {
        struct.generateDone
        logic.generateDone
        reset.generateDone
        tick.generateDone
        
        populateAnnotationModel
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

        codeContainer.add(cFilename, cFile.toString)         
        codeContainer.add(hFilename, hFile.toString)
    }    
    
    /**
     * Adds the information header.
     */
    protected def void addHeader(StringBuilder sb) {
        sb.append(
            "/*\n" + " * Automatically generated C code by\n" + " * KIELER SCCharts - The Key to Efficient Modeling\n" +
                " *\n" + " * http://rtsys.informatik.uni-kiel.de/kieler\n" + " */\n\n")
    }  
    
    /**
     * Adds hostcode additions. These can come from internal sources like the serialization, 
     * but also from the model via hostcode pragmas.
     */
    protected def void hostcodeAdditions(StringBuilder sb) {
        val includes = modifications.get(StatebasedCCodeSerializeHRExtensions.INCLUDES)
        for (include : includes)  {
            sb.append("#include " + include + "\n")
        }
        
        val hostcodePragmas = SCCharts.getStringPragmas(HOSTCODE)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || includes.size > 0) {
            sb.append("\n")
        }
    }  
 
 
    protected def populateAnnotationModel() {
        val annotationModel = (processorInstance as StatebasedCCodeGenerator).annotationModel
        
        for (object : (logic as StatebasedCCodeGeneratorLogicModule).objectFunctionMap.keySet) {
            val sb = (logic as StatebasedCCodeGeneratorLogicModule).objectFunctionMap.get(object)
            annotationModel.addInfo(object, sb.toString.trim)
        }        
    }
    
    
    
}