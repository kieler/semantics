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
package de.cau.cs.kieler.scg.processors.codegen.promela

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.processors.codegen.smv.ScgConditionalAssignmentAnalyzer
import de.cau.cs.kieler.verification.VerificationPropertyType
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.verification.codegen.CodeGeneratorExtensions.*
import static extension de.cau.cs.kieler.verification.extensions.VerificationContextExtensions.*

/**
 * Handles the declaration of variables.
 * 
 * @author aas
 * 
 */
class PromelaCodeGeneratorDeclarationModule extends PromelaCodeGeneratorModuleBase {
    
    @Inject extension PromelaCodeSerializeHRExtensions
    
    private var ScgConditionalAssignmentAnalyzer scgConditionalAssignmentAnalyzer
    
    private static class ConditionalTree {
        @Accessors var Conditional conditional
        @Accessors var boolean branchOfConditional
        @Accessors var ConditionalTree parent
        new(ConditionalTree parent, boolean branchOfParent, Conditional conditional) {
            this.parent = parent
            this.branchOfConditional = branchOfParent
            this.conditional = conditional
        }
        
        override toString() {
            if(parent !== null) {
                return '''ConditionalTree@«hashCode»(«branchOfConditional» branch of «conditional.toString», parent:ConditionalTree@«parent.hashCode»)'''
            } else {
                return '''ConditionalTree@«hashCode»(«branchOfConditional» branch of «conditional.toString», no parent)'''
            }
        }
    }
    
    override getName() {
        return class.simpleName;
    }
    
    override generateInit() {
        scgConditionalAssignmentAnalyzer = injector.getInstance(ScgConditionalAssignmentAnalyzer)
        scgConditionalAssignmentAnalyzer.init(scg)
    }
    
    override generate() {
        val store = VariableStore.get(processorInstance.environment)
        
        // Add ltl properties
        val verificationProperties = verificationContext?.verificationProperties
        if(!verificationProperties.isNullOrEmpty) {
            val property = verificationProperties.head
            if(property.type == VerificationPropertyType.LTL) {
                val pmlFormula = property.formula.toPmlLtlFormula
                appendIndentedComment('''The property is prepended by an additional next (X in ltl)''')
                appendIndentedComment('''because spin needs one reaction for setup and entering the tick loop.''')
                appendIndentedLine('''ltl «property.name.toIdentifier» { «pmlFormula» }''')
                code.append("\n")
            } else if(property.type == VerificationPropertyType.CTL) {
                val exception = new Exception("Promela does not support specification of CTL properties")
                processorInstance.environment.errors.add(exception)
            }
        }
        
        // Add the declarations of the model.
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if(valuedObject.name != "_GO" && valuedObject.name != "_TERM"
                    && !valuedObject.isAssignedEveryTick(scgConditionalAssignmentAnalyzer)) {
                    if (declaration instanceof VariableDeclaration) {
                        val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                            declaration.type.serializeHR
                            else declaration.hostType
                        appendIndentedLine('''«declarationType» «valuedObject.name»;''')
                    }    
                }
            }
        }
        
        // Add pre guards
        for(entry : store.variables.entries) {
            val variableInformation = entry.value
            if(variableInformation.properties.contains(PromelaCodeGeneratorModule.PROPERTY_PREGUARD)) {
                val preGuardName = entry.key
                appendIndentedLine('''bool «preGuardName» = 0;''')
            }
        }
        
        // Add _GO signal
        appendIndentedLine('''bool _GO = 1;''')
    }
    
    override generateDone() {
    }
    
    private def String toPmlLtlFormula(String ltlFormula) {
        // Replace LTL-operators with SPIN syntax
        val pmlLtlFormula = ltlFormula.replaceAll('''\bG\b''', "[]").replaceAll('''\bF\b''', "<>").replaceAll('''\bR\b''', " V ")
        // Promela needs one step for entering the tick loop. Thus an initial X has to be prepended to the formula.
        val pmlLtlFormulaAfterSetupDone = '''X( «pmlLtlFormula» )'''
        return pmlLtlFormulaAfterSetupDone
    }
}