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
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.sccharts.verification.VerificationProperty
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Root SMV Code Generator Module
 * 
 * @author aas
 * 
 */
class SmvCodeGeneratorModule extends SmvCodeGeneratorModuleBase {
    
    @Inject Injector injector
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SmvCodeSerializeHRExtensions serializer
    
    protected static val PROPERTY_GUARD= "guard"
    protected static val PROPERTY_PREGUARD= "preGuard"
    protected static val SMV_EXTENSION = ".smv"
    
    @Accessors private var List<VerificationProperty> verificationProperties
    
    private var List<SCGCodeGeneratorModule> codeGeneratorModules
    private val preVariableToOriginalVariable = <String,String>newHashMap
    
    override configure() {
        val declarations = createAndConfigureModule(SmvCodeGeneratorDeclarationsModule)
        val tick = createAndConfigureModule(SmvCodeGeneratorTickModule)
        val specifications = createAndConfigureModule(SmvCodeGeneratorSpecificationsModule)
        codeGeneratorModules = #[declarations, tick, specifications]
        
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
        val smvFilename = codeFilename + SMV_EXTENSION
        val smvFile = new StringBuilder

        smvFile.addHeader
        smvFile.append("MODULE main\n")
        codeGeneratorModules.forEach[
            smvFile.append(it.code)
            smvFile.append("\n")
        ]
        codeContainer.add(smvFilename, smvFile.toString)
    }
    
    protected def SCGCodeGeneratorModule createAndConfigureModule(Class<? extends SCGCodeGeneratorModule> clazz) {
        val module = injector.getInstance(clazz)
        module.configure(baseName, SCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename + SMV_EXTENSION, this)
        return module
    }
    
    protected def addPreGuardsToVariableStore() {
        preVariableToOriginalVariable.clear
        val store = VariableStore.get(processorInstance.environment)
        for( assignment : scg.nodes.filter(Assignment) ) {
            if(assignment.expression !== null && assignment.expression instanceof OperatorExpression) {
                val operatorExpression = assignment.expression as OperatorExpression
                for(preOp : operatorExpression.getPreOperatorExpressions) {
                    val preVariableName = preOp.serializeHR
                    val variableInformation = store.add(preVariableName, PROPERTY_GUARD, PROPERTY_PREGUARD)
                    variableInformation.type = ValueType.BOOL
                    val originalVariableName = preOp.subExpressions.head.serializeHR
                    preVariableToOriginalVariable.put(preVariableName.toString, originalVariableName.toString)
                }
            }
        }
    }
    
    protected def String getOriginalVariableName(String preVariableName) {
        return preVariableToOriginalVariable.get(preVariableName)
    }
    
    protected def void addHeader(StringBuilder sb) {
        sb.append("-- Automatically generated code by\n" +
                  "-- KIELER SCCharts - The Key to Efficient Modeling\n" +
                  "--\n" +
                  "-- http://rtsys.informatik.uni-kiel.de/kieler\n\n") 
    }
}