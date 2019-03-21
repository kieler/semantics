/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scl.processors.transformators.ssa

import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.processors.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.processors.ssa.MergeExpressionExtension
import de.cau.cs.kieler.scg.processors.ssa.SSACoreExtensions
import de.cau.cs.kieler.scl.processors.transformators.RestrictedSCG2SCL
import java.util.Map

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.SCLFactory
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions

/**
 * This transformation creates an SCL program from an SCG in SSA form.
 * Note that it uses the {@link RestrictedSCG2SCL} transformation and has the same restrictions!
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSASCG2SSASCL extends RestrictedSCG2SCL {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    override getId() {
        return "de.cau.cs.kieler.scl.processors.transformators.ssa.scg2scl"
    }

    override getName() {
        return "SSA-SCL"
    }
    
    override process() {
        val scl = createSCLProgram
        model.scgs.forEach[scl.modules += it.transform]
        model = scl
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------

    @Inject extension RestrictedSCG2SCL transformation
    @Inject extension SSACoreExtensions
    @Inject extension IOPreserverExtensions
    @Inject extension MergeExpressionExtension
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions  
    @Inject extension KExpressionsValuedObjectExtensions  
    extension SCLFactory = SCLFactory::eINSTANCE  
    @Inject extension KEffectsExtensions
    
    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    
    override transform(SCGraph scg) {
        // Remove incompatible ssa annotation in declarations
        scg.declarations.forEach[annotations.clear]
        
        // Convert to booleans
        val def = scg.defs
        val use = scg.uses
        if (scg.variableDeclarations.exists[(input || output) && type != ValueType.BOOL && type != ValueType.PURE] || scg.declarations.size > scg.variableDeclarations.size) {
            environment.errors.add("Program contains non-boolean interface variables!")
        }
        for (decl : scg.variableDeclarations.filter[type == ValueType.INT]) {
            if (decl.valuedObjects.forall[it.isBoolDef(def) && it.isBoolUse(use)]) {
                decl.type = ValueType.BOOL
            }
        }
        if (scg.declarations.exists[type != ValueType.BOOL && type != ValueType.PURE]) {
            environment.errors.add("Program contains boolean incompatible types!")
        }
        
        // Normalize
        for (e : scg.mergeExpressions.values) {
            if (e.eAllContents.filter(StringValue).exists[!(value.equals("AND") || value.equals("OR") || value.equals("NOT"))]) {
                environment.errors.add("Program contains boolean incompatible combine functions!")
            }
            e.replace(e.normalize)
        }
        
        try {
            for (n : scg.nodes) {
                if (n instanceof Assignment) {
                    n.expression.replace(n.expression.convertToBoolean)
                } else if (n instanceof Conditional) {
                    n.condition.replace(n.condition.convertToBoolean)
                }
            }
        } catch (IllegalArgumentException iae) {
            environment.errors.add(iae.message)
        }
        // Split IO
        for (iodecl : scg.variableDeclarations.filter[input && output].toList) {
            scg.declarations.add(scg.declarations.indexOf(iodecl), createDeclaration => [
                type = iodecl.type
                output = true
                iodecl.output = false
                for (vo : iodecl.valuedObjects) {
                    environment.warnings.add("Split up input output variable: " + vo.name)
                    val oldname = vo.name
                    vo.name = oldname + "i"
                    val ovo = createValuedObject => [
                        name = oldname + "o"
                    ]
                    for (defsite : scg.nodes.filter(Assignment).filter[valuedObject == vo]) {
                        defsite.valuedObject = ovo
                    }
                    valuedObjects += ovo
                }
            ])
        }
        
        // Transform to SCL
        return super.transform(scg)
    }
    
    private def boolean isBoolDef(ValuedObject vo, Map<ValuedObject, Assignment> defs) {
        if (vo.isRegister) {
            return true
        }
        if (defs.containsKey(vo)) {
            return defs.get(vo).expression.isBoolExp
        }
        return true
    }
    
    private def boolean isBoolUse(ValuedObject vo, Multimap<ValuedObject, Node> uses) {
        if (vo.isRegister) {
            return true
        }
        val usingExp = uses.get(vo)
        if (usingExp.empty) {
            return true
        }
        return usingExp.map[
            it.eContents.filter(Expression).head
        ].forall[isBoolExp]
    }
    
    private def dispatch boolean isBoolExp(IntValue exp) {
        return exp.value == 0 || exp.value == 1
    }
    
    private def dispatch boolean isBoolExp(ValuedObjectReference exp) {
        return true
    }
    
    private def dispatch boolean isBoolExp(BoolValue exp) {
        return true
    }
    
    private def dispatch boolean isBoolExp(FunctionCall exp) {
        return true
    }
    
    private def dispatch boolean isBoolExp(OperatorExpression exp) {
           return exp.operator == OperatorType.EQ ||
                  exp.operator == OperatorType.NE ||
                  exp.operator == OperatorType.LOGICAL_AND ||
                  exp.operator == OperatorType.LOGICAL_OR ||
                  exp.operator == OperatorType.NOT
    }
    
    private def dispatch Expression convertToBoolean(OperatorExpression oexp) {
        // Reduce variaty of operators
        if (oexp.operator == OperatorType.BITWISE_AND) {
            oexp.operator = OperatorType.LOGICAL_AND
        }
        if (oexp.operator == OperatorType.BITWISE_OR) {
            oexp.operator = OperatorType.LOGICAL_OR
        }
        // Convert subexpressions
        val constants = newHashMap
        for (subexp : oexp.subExpressions) {
            val converted = subexp.convertToBoolean
            subexp.replace(converted)
            if (converted instanceof BoolValue) {
                constants.put(converted, converted.value)
            }
        }
        // Transform and partially evaluate expression
        // TODO further transform
        switch (oexp.operator) {
            case EQ: {
                val exp = createOperatorExpression(OperatorType.LOGICAL_OR) => [
                    subExpressions += createOperatorExpression(OperatorType.LOGICAL_AND) => [
                        subExpressions += oexp.subExpressions.get(0).copy
                        subExpressions += oexp.subExpressions.get(1).copy
                    ]
                    subExpressions += createOperatorExpression(OperatorType.LOGICAL_AND) => [
                        subExpressions += createOperatorExpression(OperatorType.NOT) => [
                            subExpressions += oexp.subExpressions.get(0).copy
                        ]
                        subExpressions += createOperatorExpression(OperatorType.NOT) => [
                            subExpressions += oexp.subExpressions.get(1).copy
                        ]                        
                    ]
                ]
                return exp.convertToBoolean // convert again for partial evaluation
            }
            case NE: {
                val exp = createOperatorExpression(OperatorType.LOGICAL_OR) => [
                    subExpressions += createOperatorExpression(OperatorType.LOGICAL_AND) => [
                        subExpressions += createOperatorExpression(OperatorType.NOT) => [
                            subExpressions += oexp.subExpressions.get(0).copy
                        ]
                        subExpressions += oexp.subExpressions.get(1).copy
                    ]
                    subExpressions += createOperatorExpression(OperatorType.LOGICAL_AND) => [
                        subExpressions += oexp.subExpressions.get(0).copy
                        subExpressions += createOperatorExpression(OperatorType.NOT) => [
                            subExpressions += oexp.subExpressions.get(1).copy
                        ]                        
                    ]
                ]
                return exp.convertToBoolean // convert again for partial evaluation
            }
            case LOGICAL_AND: {
                if (constants.containsValue(false)) {
                    return createBoolValue(false)
                } else if (oexp.subExpressions.forall[constants.containsKey(it)]) {
                    return createBoolValue(true)
                } else {
                    oexp.subExpressions.removeIf[constants.containsKey(it)]
                    if (oexp.subExpressions.size == 1) {
                        return oexp.subExpressions.head
                    } else {
                        return oexp
                    }
                }
            }
            case LOGICAL_OR: {
                if (constants.containsValue(true)) {
                    return createBoolValue(true)
                } else if (oexp.subExpressions.forall[constants.containsKey(it)]) {
                    return createBoolValue(false)
                } else {
                    oexp.subExpressions.removeIf[constants.containsKey(it)]
                    if (oexp.subExpressions.size == 1) {
                        return oexp.subExpressions.head
                    } else {
                        return oexp
                    }
                }                
            }
            case NOT: {
                if (constants.empty) {
                    return oexp
                } else {
                    return createBoolValue(!constants.get(oexp.subExpressions.head))
                }
            }
            case PRE: return oexp
            default: throw new IllegalArgumentException("Program contains boolean-incompatible operator expression with operator: " + oexp.operator)
        }
    }
    
    private def dispatch Expression convertToBoolean(ValuedObjectReference vor) {
        return vor
    }
    
    private def dispatch Expression convertToBoolean(FunctionCall fc) {
        return fc
    }
    
    private def dispatch Expression convertToBoolean(Value value) {
        if (value instanceof BoolValue) {
            return value
        } else if (value instanceof IntValue) {
            return createBoolValue(value.value != 0)
        } else {
            throw new IllegalArgumentException("Program contains boolean-incompatible value: " + value)
        }
    }

}
