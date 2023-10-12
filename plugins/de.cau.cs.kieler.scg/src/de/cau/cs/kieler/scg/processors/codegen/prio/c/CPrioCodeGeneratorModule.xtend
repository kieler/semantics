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
package de.cau.cs.kieler.scg.processors.codegen.prio.c

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.deploy.processor.CCompiler
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorModule
import org.eclipse.emf.common.util.URI

import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*

/**
 * Root C Prio Code Generator Module
 * Migrated from SCLPTransformation
 * 
 * Initializes necessary modules and invokes them in correct order.
 * 
 * @author ssm
 * @kieler.design 2019-06-09 proposed 
 * @kieler.rating 2019-06-09 proposed yellow 
 * 
 */
class CPrioCodeGeneratorModule extends CCodeGeneratorModule {
    
    @Inject Injector injector
    @Inject extension CPrioCodeSerializeHRExtensions
    
    protected static val PACKAGE = PragmaRegistry.register("package", StringPragma, "Package name for the generated file(s)")
    
    public static val JAVA_EXTENSION = ".java"
    
    override configure() {
        modifications.clear
        
        struct = injector.getInstance(CPrioCodeGeneratorStructModule)
        reset = injector.getInstance(CPrioCodeGeneratorResetModule)
        tick = injector.getInstance(CPrioCodeGeneratorTickModule)
        logic = injector.getInstance(CPrioCodeGeneratorLogicModule)
            
        struct.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + JAVA_EXTENSION, this, TICKDATA_STRUCT_NAME)
        reset.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + JAVA_EXTENSION, this, RESET_FUNCTION_NAME)
        tick.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + JAVA_EXTENSION, this, TICK_FUNCTION_NAME)
        logic.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, 
            codeFilename + C_EXTENSION, this, LOGIC_FUNCTION_NAME)
    }
    
    override generateDone() {
        struct?.generateDone
        reset?.generateDone
        logic?.generateDone
        tick.code.append(logic.code)
        tick?.generateDone
    }
    
    override generateWrite(CodeContainer codeContainer) {
        super.generateWrite(codeContainer)
        
        for (uri : #[
            "/de.cau.cs.kieler.scg/resources/sc/sc-generic.h",
            "/de.cau.cs.kieler.scg/resources/sc/sc.h",
            "/de.cau.cs.kieler.scg/resources/sc/scl.h",
            "/de.cau.cs.kieler.scg/resources/sc/sc.c"
        ]) {
            codeContainer.addProxyCCodeFile(URI.createPlatformPluginURI(uri, true)) => [
                library = true
            ]
        }
        
        // The SC macros contain tentative definitions and need to be compiled with -fcommon in GCC 10+
        val env = processorInstance.environment
        if (env.getProperty(CCompiler.ADDITIONAL_OPTIONS).nullOrEmpty) {
            env.setProperty(CCompiler.ADDITIONAL_OPTIONS, "-fcommon")
        } else {
            env.setProperty(CCompiler.ADDITIONAL_OPTIONS, env.getProperty(CCompiler.ADDITIONAL_OPTIONS) + " -fcommon")
        }
    }
    
    override generateWriteCodeModules(StringBuilder hFile, StringBuilder cFile) {
        // Swap logic and reset w.r.t. super implementation.
        hFile.append(struct.code)
        cFile.append(tick.code).append("\n")
        cFile.append(reset.code)
    }     
}