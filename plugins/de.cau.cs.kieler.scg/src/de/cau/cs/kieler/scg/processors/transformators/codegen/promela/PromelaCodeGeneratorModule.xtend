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
package de.cau.cs.kieler.scg.processors.transformators.codegen.promela

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import com.google.inject.Injector
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeGenerator

/**
 * Root Promela Code Generator Module
 * 
 * @author aas
 * 
 */
class PromelaCodeGeneratorModule extends SCGCodeGeneratorModule {
    
    @Inject Injector injector
    
    protected static val HOSTCODE = PragmaRegistry.register("hostcode", StringPragma, "Allows additional hostcode to be included (e.g. includes).")
    public static val PROMELA_EXTENSION = ".pml"
    
    @Accessors var SCGCodeGeneratorModule variables
    
    override configure() {
        variables = injector.getInstance(PromelaCodeGeneratorVariablesModule)
        variables.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + PROMELA_EXTENSION, this)
    }
    
    override generateInit() {
        variables.generateInit
    }
    
    override generate() {
        variables.generate
    }
    
    
    override generateDone() {
        variables.generateDone
    }
    
    override generateWrite(CodeContainer codeContainer) {
        val pmlFilename = codeFilename + PROMELA_EXTENSION
        val pmlFile = new StringBuilder

        pmlFile.addHeader
        pmlFile.append(variables.code)
        
        codeContainer.add(pmlFilename, pmlFile.toString)
    }
    
    /**
     * Adds the header for KIELER generated code.
     */
    protected def void addHeader(StringBuilder sb) {
        sb.append("/*\n" +
                  " * Automatically generated Promela code by\n" +
                  " * KIELER SCCharts - The Key to Efficient Modeling\n" +
                  " *\n" +
                  " * http://rtsys.informatik.uni-kiel.de/kieler\n" +
                  " */\n\n") 
    }
}