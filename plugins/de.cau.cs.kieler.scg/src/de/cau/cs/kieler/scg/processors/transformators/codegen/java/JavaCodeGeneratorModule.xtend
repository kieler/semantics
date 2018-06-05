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
package de.cau.cs.kieler.scg.processors.transformators.codegen.java

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeGenerator
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeGeneratorModule
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions

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
    @Inject extension JavaCodeSerializeHRExtensions
    
    @Inject Injector injector
    
    public static val JAVA_EXTENSION = ".java"
    
    override configure() {
        struct = injector.getInstance(JavaCodeGeneratorStructModule)
        reset = injector.getInstance(JavaCodeGeneratorResetModule)
        tick = injector.getInstance(JavaCodeGeneratorTickModule)
        logic = injector.getInstance(JavaCodeGeneratorLogicModule)
            
        struct.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + JAVA_EXTENSION, this)
        reset.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + JAVA_EXTENSION, this)
        tick.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + JAVA_EXTENSION, this)
        logic.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + JAVA_EXTENSION, this)
    }
    
    override generateWrite(CodeContainer codeContainer) {
        val cFilename = codeFilename + JAVA_EXTENSION
        val cFile = new StringBuilder

        cFile.addHeader
        cFile.hostcodeAdditions
        
        cFile.append("public class " + codeFilename + " {\n\n")

        cFile.append(struct.code).append("\n")        
        cFile.append(reset.code).append("\n")
        cFile.append(logic.code).append("\n")
        cFile.append(tick.code)
        
        cFile.append("}\n")

        codeContainer.addJavaCode(cFilename, cFile.toString)        
    }    
    
    override def void addHeader(StringBuilder sb) {
        sb.append(
            "/*\n" + " * Automatically generated Java code by\n" + " * KIELER SCCharts - The Key to Efficient Modeling\n" +
                " *\n" + " * http://rtsys.informatik.uni-kiel.de/kieler\n" + " */\n\n")
                
        if (processorInstance.environment.getProperty(CCodeGenerator.DEBUG_COMMENTS)) {
            sb.addDebugComments
        }
    }  
    
    override def void hostcodeAdditions(StringBuilder sb) {
        val includes = modifications.get(JavaCodeSerializeHRExtensions.INCLUDES)
        for (include : includes)  {
            sb.append("import " + include + "\n")
        }
        
        val hostcodePragmas = SCGraphs.getStringPragmas(HOSTCODE)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || includes.size > 0) {
            sb.append("\n")
        }
    }  
    
}