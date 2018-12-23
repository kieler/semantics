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
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

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
    
    protected static val PROPERTY_GUARD= "guard"
    protected static val PROPERTY_PREGUARD= "preGuard"
    protected static val PROMELA_EXTENSION = ".pml"
    
    private var List<SCGCodeGeneratorModule> codeGeneratorModules
    
    override configure() {
        val declarations = createAndConfigureModule(PromelaCodeGeneratorDeclarationModule)
        val init = createAndConfigureModule(PromelaCodeGeneratorInitModule)
        val tick = createAndConfigureModule(PromelaCodeGeneratorTickModule)
        codeGeneratorModules = #[declarations, init, tick]
        
        serializer.valuedObjectPrefix = ""
        serializer.prePrefix = PRE_GUARD_PREFIX
        addPreGuardsToVariableStore
    }
    
    override generateInit() {
        codeGeneratorModules.forEach[it.generateInit]
    }
    
    override generate() {
        codeGeneratorModules.forEach[it.generate]
    }
    
    
    override generateDone() {
        codeGeneratorModules.forEach[it.generateDone]
    }
    
    override generateWrite(CodeContainer codeContainer) {
        val pmlFilename = codeFilename + PROMELA_EXTENSION
        val pmlFile = new StringBuilder

        pmlFile.addHeader
        codeGeneratorModules.forEach[
            pmlFile.append(it.code)
            pmlFile.append("\n")
        ]
        codeContainer.add(pmlFilename, pmlFile.toString)
    }
    
    protected def SCGCodeGeneratorModule createAndConfigureModule(Class<? extends SCGCodeGeneratorModule> clazz) {
        val module = injector.getInstance(clazz)
        module.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + PROMELA_EXTENSION, this)
        return module
    }
    
    protected def addPreGuardsToVariableStore() {
        val store = VariableStore.get(processorInstance.environment)
        for( assignment : scg.nodes.filter(Assignment) ) {
            if(assignment.expression !== null && assignment.expression instanceof OperatorExpression) {
                val operatorExpression = assignment.expression as OperatorExpression
                for(preOp : operatorExpression.getPreOperatorExpressions) {
                    val preOpName = preOp.serializeHR
                    val variableInformation = store.add(preOpName, PROPERTY_GUARD, PROPERTY_PREGUARD)
                    variableInformation.type = ValueType.BOOL    
                }
            }
        }
    }
}