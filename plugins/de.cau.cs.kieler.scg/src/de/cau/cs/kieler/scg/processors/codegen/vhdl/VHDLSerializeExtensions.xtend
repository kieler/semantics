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
package de.cau.cs.kieler.scg.processors.codegen.vhdl

import com.google.inject.Singleton
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference

/**
 * @author ssm
 * @kieler.design 2017-10-04 proposed 
 * @kieler.rating 2017-10-04 proposed yellow 
 *
 */
@Singleton
class VHDLSerializeExtensions extends CCodeSerializeHRExtensions {
    
    val ignore = <EObject>newHashSet
    
    def ignoreInSerializer(EObject obj) {
        ignore += obj
    }
    def isIgnoredInSerializer(EObject obj) {
        ignore.contains(obj)
    }
    
    def dispatch CharSequence serialize(VariableDeclaration decl) {
        val sb = new StringBuilder
        sb.append(decl.valuedObjects.filter[!isIgnoredInSerializer].map[name].join(", "))
        sb.append(": ")
        if (decl.input) {
            sb.append("IN ")
        }
        if (decl.output) {
            sb.append("OUT ")
        }
        sb.append(decl.type.serialize)
        return sb
    }
    
    override dispatch CharSequence serialize(Assignment asm) {
        return asm.reference.serializeVOR + " <= " + asm.expression.serialize
    }
    
    override dispatch CharSequence serialize(OperatorExpression oExp) {
        val serialized = switch(oExp.operator) {
            case CONDITIONAL: oExp.subExpressions.get(1).serialize + " WHEN " + oExp.subExpressions.get(0).serialize + " ELSE " + oExp.subExpressions.get(2).serialize
            default: oExp.subExpressions.map[serialize].join(" " + oExp.operator.serialize + " ")
        }
        if (oExp.eContainer instanceof OperatorExpression) {
            return "(" + serialized + ")"
        }
        return serialized
    }
    
    def dispatch CharSequence serialize(OperatorType operatorType) {
        return switch(operatorType) {
            case BITWISE_AND: "and"
            case BITWISE_NOT: "not"
            case BITWISE_OR: "or"
            case BITWISE_XOR: "xor"
            case EQ: "="
            case LOGICAL_AND: "and"
            case LOGICAL_OR: "or"
            case LOGICAL_XOR: "xor"
            case MOD: "mod"
            case NE: "/="
            case NOR: "nor"
            case NOT: "not"
            case SHIFT_LEFT: "sll"
            case SHIFT_RIGHT: "srl"
            case SHIFT_RIGHT_UNSIGNED: "sra"
            default: operatorType.literal
        }
    }
    
    override dispatch CharSequence serialize(ValueType valueType) {
        return switch (valueType) {
            case ValueType.BOOL: "boolean"
            default: valueType.literal
        }
    }
    
    override dispatch CharSequence serialize(BoolValue expression) {
        if (expression.value) return "true"
        return "false"
    }
    
    override dispatch CharSequence serialize(ValuedObjectReference valuedObjectReference) {
        return valuedObjectReference.serializeVOR
    }
    
}
