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
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

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
class SmvCodeGeneratorModule extends SmvCodeGeneratorModuleBase {
    
    @Inject Injector injector
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SmvCodeSerializeHRExtensions serializer
    
    public static val SMV_EXTENSION = ".smv"
    
    @Accessors var SCGCodeGeneratorModule tick
    
    override configure() {
        tick = injector.getInstance(SmvCodeGeneratorTickModule)
        tick.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + SMV_EXTENSION, this)
        
        serializer.valuedObjectPrefix = ""
        serializer.prePrefix = PRE_GUARD_PREFIX
        addPreGuardsToVariableStore
    }
    
    override generateInit() {
        tick.generateInit
    }
    
    override generate() {
        tick.generate
    }
    
    
    override generateDone() {
        tick.generateDone
    }
    
    override generateWrite(CodeContainer codeContainer) {
        val smvFilename = codeFilename + SMV_EXTENSION
        val smvFile = new StringBuilder

        smvFile.addHeader
        smvFile.append(tick.code)
        smvFile.append("\n")
        
        codeContainer.add(smvFilename, smvFile.toString)
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