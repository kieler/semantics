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
package de.cau.cs.kieler.scg.ssc.scl

import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.StringValue
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.features.SSASCLFeature
import de.cau.cs.kieler.scg.ssc.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.ssc.ssa.MergeExpressionExtension
import de.cau.cs.kieler.scg.ssc.ssa.SSACoreExtensions
import java.util.Map

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.core.kexpressions.Value

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSASCG2SSASCL extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg2scl"
    }

    override getName() {
        return "SSA-SCL"
    }

    override getProducedFeatureId() {
        return SSASCLFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSAFeature.ID)
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
    
    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    
    def transform(SCGraph scg, KielerCompilerContext context) {
        transformation.context = context
               
        // Remove incompatible ssa annotation in declarations
        scg.declarations.forEach[annotations.clear]
        
        // Convert to booleans
        val def = scg.defs
        val use = scg.uses
        if (scg.declarations.exists[(input || output) && type != ValueType.BOOL && type != ValueType.PURE]) {
            context.compilationResult.addPostponedWarning(new KielerCompilerException(id, id, "Program contains non-boolean interface variables!"));
        }
        for (decl : scg.declarations.filter[type == ValueType.INT]) {
            if (decl.valuedObjects.forall[it.isBoolDef(def) && it.isBoolUse(use)]) {
                decl.type = ValueType.BOOL
            }
        }
        if (scg.declarations.exists[type != ValueType.BOOL && type != ValueType.PURE]) {
            context.compilationResult.addPostponedWarning(new KielerCompilerException(id, id, "Program contains boolean incompatible types!"));
        }
        
        // Normalize
        for (e : scg.mergeExpressions.values) {
            if (e.eAllContents.filter(StringValue).exists[!(value.equals("AND") || value.equals("OR") || value.equals("NOT"))]) {
                context.compilationResult.addPostponedWarning(new KielerCompilerException(id, id, "Program contains boolean incompatible combine functions!"))
            }
            e.replace(e.normalize)
        }
        
        try {
            for (n : scg.nodes) {
                if (n instanceof Assignment) {
                    n.assignment.replace(n.assignment.convertToBoolean)
                } else if (n instanceof Conditional) {
                    n.condition.replace(n.condition.convertToBoolean)
                }
            }
        } catch (IllegalArgumentException iae) {
            context.compilationResult.addPostponedWarning(new KielerCompilerException(id, id, iae.message));
        }
        // Split IO
        for (iodecl : scg.declarations.filter[input && output].toList) {
            scg.declarations.add(scg.declarations.indexOf(iodecl), createDeclaration => [
                type = iodecl.type
                output = true
                iodecl.output = false
                for (vo : iodecl.valuedObjects) {
                    context.compilationResult.addPostponedWarning(new KielerCompilerException(id, id, "Split up input output variable: " + vo.name));
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
        val scl = scg.transformSCGToSCL
        return scl
    }
    
    private def boolean isBoolDef(ValuedObject vo, Map<ValuedObject, Assignment> defs) {
        if (vo.isRegister) {
            return true
        }
        if (defs.containsKey(vo)) {
            return defs.get(vo).assignment.isBoolExp
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
