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

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.scg.Assignment
import javax.management.OperationsException

/**
 * Root Promela Code Generator Module
 * 
 * @author aas
 * 
 */
class PromelaCodeGeneratorModule extends PromelaCodeGeneratorModuleBase {
    
    @Inject Injector injector
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension PromelaCodeSerializeHRExtensions serializer
    
    public static val PROMELA_EXTENSION = ".pml"
    
    @Accessors var SCGCodeGeneratorModule declarations
    @Accessors var SCGCodeGeneratorModule init
    @Accessors var SCGCodeGeneratorModule tick
    
    override configure() {
        declarations = injector.getInstance(PromelaCodeGeneratorDeclarationModule)
        declarations.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + PROMELA_EXTENSION, this)
        init = injector.getInstance(PromelaCodeGeneratorInitModule)
        init.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + PROMELA_EXTENSION, this)
        tick = injector.getInstance(PromelaCodeGeneratorTickModule)
        tick.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + PROMELA_EXTENSION, this)
        
        serializer.valuedObjectPrefix = ""
        serializer.prePrefix = PRE_GUARD_PREFIX
        addPreGuardsToVariableStore
    }
    
    override generateInit() {
        declarations.generateInit
        init.generateInit
        tick.generateInit
    }
    
    override generate() {
        declarations.generate
        init.generate
        tick.generate
    }
    
    
    override generateDone() {
        declarations.generateDone
        init.generateDone
        tick.generateDone
    }
    
    override generateWrite(CodeContainer codeContainer) {
        val pmlFilename = codeFilename + PROMELA_EXTENSION
        val pmlFile = new StringBuilder

        pmlFile.addHeader
        pmlFile.append(declarations.code)
        pmlFile.append("\n")
        pmlFile.append(init.code)
        pmlFile.append("\n")
        pmlFile.append(tick.code)
        pmlFile.append("\n")
        
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
    
    protected def addPreGuardsToVariableStore() {
        val store = VariableStore.get(processorInstance.environment)
        for( assignment : scg.nodes.filter(Assignment) ) {
            if(assignment.expression !== null && assignment.expression instanceof OperatorExpression) {
                val operatorExpression = assignment.expression as OperatorExpression
                for(preOp : operatorExpression.getPreOperatorExpressions) {
                    val preOpName = preOp.serializeHR
                    val variableInformation = store.add(preOpName, "guard", "preGuard")
                    variableInformation.type = ValueType.BOOL    
                }
            }
        }
    } 
}