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
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGenerator
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorModule
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.registry.PragmaRegistry

import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import static de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames.*
import de.cau.cs.kieler.annotations.Nameable

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
class CPrioCodeGeneratorModule extends CCodeGeneratorModule {
    
    @Inject Injector injector
    
    protected static val PACKAGE = PragmaRegistry.register("package", StringPragma, "Package name for the generated file(s)")
    
    public static val JAVA_EXTENSION = ".java"
    
    override configure() {
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
    
    override generateWriteCodeModules(StringBuilder hFile, StringBuilder cFile) {
        // Swap logic and reset w.r.t. super implementation.
        hFile.append(struct.code)
        cFile.append(tick.code).append("\n")
        cFile.append(reset.code)
    }     
}