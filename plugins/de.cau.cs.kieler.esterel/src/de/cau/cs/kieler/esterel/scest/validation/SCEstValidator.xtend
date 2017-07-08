/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.scest.validation

import de.cau.cs.kieler.esterel.esterel.Emit
import org.eclipse.xtext.validation.Check
import com.google.inject.Inject
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.esterel.esterel.IVariable
import de.cau.cs.kieler.esterel.esterel.VariableDecl
import de.cau.cs.kieler.esterel.esterel.ISignal
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.esterel.esterel.TrapSignal
import de.cau.cs.kieler.esterel.esterel.Constant
import de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls
import de.cau.cs.kieler.esterel.esterel.SensorWithType
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.esterel.esterel.Sustain
import de.cau.cs.kieler.esterel.esterel.EsterelAssignment
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.ElsIf
import de.cau.cs.kieler.esterel.esterel.DelayExpr
import de.cau.cs.kieler.esterel.esterel.Repeat
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.esterel.scest.scest.Set

/**
 * @author mrb
 *
 */
class SCEstValidator extends SCEstJavaValidator{
    
    @Inject
    extension SCEstExtension
    
    final String CALCULATION_EXPRESSION = "The expression should be of type INT/FLOAT/DOUBLE/UNSIGNED."
    final String BOOLEAN_EXPRESSION = "The expression should be of type BOOL."
        
    @Check
    def void emitSignal(Emit emit) {
        if (emit.signal.type.isPure) {
            if (emit.expression != null) {
                error(emit.signal.name + " is not a valued signal!", emit, null, -1)
            }
        }
        else {
            if (emit.expression == null) {
                error("No valued emit allowed for pure signal " + emit.signal.name + "!", emit, null, -1)
            }
        }
    }
    
    @Check
    def void annotation(Annotation annotation) {
        if (annotation.isGenerated || annotation.isInterfaceAnnotation) {
            error("Annotations of name '" + interfaceScope + "' or '" + generatedAnnotation + "' are forbidden!", annotation, null, -1)
        }
    }
    
    @Check
    def void combineOperator(ValuedObject vo) {
        if (vo.eContainer instanceof Declaration) {
            var type = (vo.eContainer as Declaration).type
            if (!combineOperatorFitsType(type, vo.combineOperator)) {
                error("The combine operator '" + vo.combineOperator + "' does not fit the valued objects type '" + type + "'!", vo, null, -1)
            }
        }
    }
    
    @Check
    def void combineOperator(IVariable variable) {
        if (!combineOperatorFitsType((variable.eContainer as VariableDecl).type?.type, (variable.eContainer as VariableDecl).type?.operator)) {
            error("The combine operator '" + (variable.eContainer as VariableDecl).type?.operator + "' does not fit the variables type '" + (variable.eContainer as VariableDecl).type?.type + "'!", variable, null, -1)
        }
    }
    
    @Check
    def void combineOperator(Constant constant) {
        if (!combineOperatorFitsType((constant.eContainer as OneTypeConstantDecls).type?.type, (constant.eContainer as OneTypeConstantDecls).type?.operator)) {
            error("The combine operator '" + (constant.eContainer as OneTypeConstantDecls).type?.operator + "' does not fit the constants type '" + (constant.eContainer as OneTypeConstantDecls).type?.type + "'!", constant, null, -1)
        }
    }
    
    @Check
    def void combineOperator(ISignal signal) {
        if (signal.eContainer instanceof SensorWithType) {
            if (!combineOperatorFitsType((signal.eContainer as SensorWithType).type?.type, (signal.eContainer as SensorWithType).type?.operator)) {
                error("The combine operator '" + (signal.eContainer as SensorWithType).type?.operator + "' does not fit the sensors type '" + (signal.eContainer as SensorWithType).type?.type + "'!", signal, null, -1)
            }
        }
        else if (!combineOperatorFitsType(signal.type, signal.combineOperator)) {
            error("The combine operator '" + signal.combineOperator + "' does not fit the signals type '" + signal.type + "'!", signal, null, -1)
        }
    }
    
    @Check
    def void combineOperator(TrapSignal trap) {
        if (!combineOperatorFitsType(trap.type, trap.combineOperator)) {
            error("The combine operator '" + trap.combineOperator + "' does not fit the traps type '" + trap.type + "'!", trap, null, -1)
        }
    }
    
    @Check
    def void expression(ISignal signal) {
        if (signal.expression != null) {
            if (signal.type.isBool && !signal.expression.isBoolExpr) {
                warning(BOOLEAN_EXPRESSION, null)
            }
            else if (signal.type.isCalculationType && !signal.expression.isCalculationExpr) {
                warning(CALCULATION_EXPRESSION, null)
            }
        }
    }
    
    @Check
    def void expression(TrapSignal trap) {
        if (trap.expression != null) {
            if (trap.type.isBool && !trap.expression.isBoolExpr) {
                warning(BOOLEAN_EXPRESSION, null)
            }
            else if (trap.type.isCalculationType && !trap.expression.isCalculationExpr) {
                warning(CALCULATION_EXPRESSION, null)
            }
        }
    }
    
    @Check
    def void expression(Emit emit) {
        if (emit.expression != null) {
            if (emit.signal.type.isBool && !emit.expression.isBoolExpr) {
                warning(BOOLEAN_EXPRESSION, null)
            }
            else if (emit.signal.type.isCalculationType && !emit.expression.isCalculationExpr) {
                warning(CALCULATION_EXPRESSION, null)
            }
        }
    }
    
    @Check
    def void expression(Sustain sustain) {
        if (sustain.expression != null) {
            if (sustain.signal.type.isBool && !sustain.expression.isBoolExpr) {
                warning(BOOLEAN_EXPRESSION, null)
            }
            else if (sustain.signal.type.isCalculationType && !sustain.expression.isCalculationExpr) {
                warning(CALCULATION_EXPRESSION, null)
            }
        }
    }
    
    @Check
    def void expression(EsterelAssignment assign) {
        if ((assign.getVar.eContainer as VariableDecl).type?.type.isBool && !assign.expression.isBoolExpr) {
            warning(BOOLEAN_EXPRESSION, null)
        }
        else if ((assign.getVar.eContainer as VariableDecl).type?.type.isCalculationType && !assign.expression.isCalculationExpr) {
            warning(CALCULATION_EXPRESSION, null)
        }
    }
    
    @Check
    def void expression(IfTest ifTest) {
        if (!ifTest.expression.isBoolExpr) {
            warning(BOOLEAN_EXPRESSION, null)
        }
    }
    
    @Check
    def void expression(ElsIf elsIf) {
        if (!elsIf.expression.isBoolExpr) {
            warning(BOOLEAN_EXPRESSION, null)
        }
    }
    
    @Check
    def void expression(DelayExpr delay) {
        if (delay.expression != null && !delay.expression.isCalculationExpr) {
            warning(CALCULATION_EXPRESSION, null)
        }
    }
    
    @Check
    def void expression(Repeat repeat) {
        if (!repeat.expression.isCalculationExpr) {
            warning("The expression should be of type INT.", null)
        }
    }
    
    @Check
    def void expression(Exit exit) {
        if (exit.expression != null) {
            if (exit.trap.type.isBool && !exit.expression.isBoolExpr) {
                warning(BOOLEAN_EXPRESSION, null)
            }
            else if (exit.trap.type.isCalculationType && !exit.expression.isCalculationExpr) {
                warning(CALCULATION_EXPRESSION, null)
            }
        }
    }
    
    @Check
    def void expression(IVariable variable) {
        if ((variable.eContainer as VariableDecl).type?.type.isBool && !variable.expression.isBoolExpr) {
            warning(BOOLEAN_EXPRESSION, null)
        }
        else if ((variable.eContainer as VariableDecl).type?.type.isCalculationType && !variable.expression.isCalculationExpr) {
            warning(CALCULATION_EXPRESSION, null)
        }
    }
    
    @Check
    def void expression(Conditional conditional) {
        if (!conditional.expression.isBoolExpr) {
            warning(BOOLEAN_EXPRESSION, null)
        }
    }
    
    @Check
    def void expression(Assignment assign) {
        if ((assign.valuedObject.eContainer as Declaration).type.isBool && !assign.expression.isBoolExpr) {
            warning(BOOLEAN_EXPRESSION, null)
        }
        else if ((assign.valuedObject.eContainer as Declaration).type.isCalculationType && !assign.expression.isCalculationExpr) {
            warning(CALCULATION_EXPRESSION, null)
        }
    }
    
    @Check
    def void expression(Set set) {
        if (set.signal.type.isBool && !set.expression.isBoolExpr) {
            warning(BOOLEAN_EXPRESSION, null)
        }
        else if (set.signal.type.isCalculationType && !set.expression.isCalculationExpr) {
            warning(CALCULATION_EXPRESSION, null)
        }
    }
    
    @Check
    def void expression(ValuedObject vo) {
        var parent = vo.eContainer
        if (parent instanceof Declaration) {
            if (parent.type.isBool && !vo.initialValue.isBoolExpr) {
                warning(BOOLEAN_EXPRESSION, null)
            }
            else if (parent.type.isCalculationType && !vo.initialValue.isCalculationExpr) {
                warning(CALCULATION_EXPRESSION, null)
            }
        }
    }
    
    
    /*
     * ##########################################################
     * ###                 HELPER METHODS                     ###
     * ##########################################################
     */
    
    /**
     * Checks if the given expression and its subexpressions are expressions which return a number
     * 
     * @param expr The expression in question
     */
    def boolean isCalculationExpr(Expression expr) {
        switch expr {
            OperatorExpression: {
                var op = expr.operator
                var isCalc = true
                switch op {
                    case op.isValuedOperator: {
                        for (se : expr.subExpressions) {
                            isCalc = isCalc && se.isCalculationExpr
                        }
                        return isCalc
                    }
                    case OperatorType.VAL: {
                        return (expr.subExpressions.head as ValuedObjectReference).isCalculationValuedObject
                    }
                    case OperatorType.PRE: {
                        return expr.subExpressions.head.isCalculationExpr
                    }
                    default: {
                        return false
                    }
                }
            }
            IntValue,
            FloatValue: {
                return true
            }
            ValuedObjectReference: {
                return expr.isCalculationValuedObject
            }
            default: {
                return false
            }
        }
    }
    
    /**
     * Checks if the given expression and its subexpressions are boolean expressions
     * 
     * @param expr The expression in question
     */
    def boolean isBoolExpr(Expression expr) {
        switch expr {
            OperatorExpression: {
                var op = expr.operator
                var isBool = true
                switch op {
                    case op.isBoolOperator: {
                        for (se : expr.subExpressions) {
                            isBool = isBool && se.isBoolExpr
                        }
                        return isBool
                    }
                    case OperatorType.VAL: {
                        return (expr.subExpressions.head as ValuedObjectReference).isBoolValuedObject
                    }
                    case OperatorType.PRE: {
                        return expr.subExpressions.head.isBoolExpr
                    }
                    default: {
                        return false
                    }
                }
            }
            BoolValue: {
                return true
            }
            ValuedObjectReference: {
                return expr.isBoolValuedObject
            }
            default: {
                return false
            }
        }
    }
    
    /**
     * Checks if the ValuedObjectReference references a valued object of type pure or boolean
     * 
     * @param voRef The ValuedObjectReference in question
     */
    def boolean isBoolValuedObject(ValuedObjectReference voRef) {
        var vo = voRef.valuedObject
        var parent = vo.eContainer
        switch vo {
            TrapSignal,
            ISignal: {
                return vo.type.isBoolOrPure
            }
            Constant: {
                if (parent instanceof OneTypeConstantDecls) {
                   return parent.type?.type.isBoolOrPure
                }
            }
            IVariable: {
                if (parent instanceof VariableDecl) {
                   return parent.type?.type.isBoolOrPure
                }
            }
            ValuedObject: {
                if (parent instanceof Declaration) {
                    return parent.type.isBoolOrPure
                }
            }
        }
        return false
    }
    
    /**
     * Checks if the ValuedObjectReference references a valued object of type INT/FLOAT/DOUBLE/UNSIGNED
     * 
     * @param voRef The ValuedObjectReference in question
     */
    def boolean isCalculationValuedObject(ValuedObjectReference voRef) {
        var vo = voRef.valuedObject
        var parent = vo.eContainer
        switch vo {
            TrapSignal,
            ISignal: {
                return vo.type.isCalculationType 
            }
            Constant: {
                if (parent instanceof OneTypeConstantDecls) {
                   return parent.type?.type.isCalculationType
                }
            }
            IVariable: {
                if (parent instanceof VariableDecl) {
                   return parent.type?.type.isCalculationType
                }
            }
            ValuedObject: {
                if (parent instanceof Declaration) {
                    return parent.type.isCalculationType
                }
            }
        }
        return false
    }
    
    /**
     * Checks if the given type is of type INT/DOUBLE/FLOAT/UNSIGNED
     * 
     * @param type The ValueType in question
     */
    def isCalculationType(ValueType type) {
        switch type {
            case ValueType.INT,
            case ValueType.DOUBLE,
            case ValueType.FLOAT,
            case ValueType.UNSIGNED: {
                return true
            }
            default: {
                return false
            }
        }
    }
    
    /**
     * Checks if the given type is of type BOOL or PURE
     * 
     * @param type The ValueType in question
     */
    def isBoolOrPure(ValueType type) {
        type == ValueType.BOOL || type == ValueType.PURE
    }
    
    /**
     * Checks if the given operator is of type 
     * EQ/LT/LEQ/GT/GEQ/NE/NOT
     * LOGICAL/BITWISE - OR/AND
     * 
     * @param type The OperatorType in question
     */
    def isBoolOperator(OperatorType operator) {
        switch operator {
            case OperatorType.EQ,
            case OperatorType.LT,
            case OperatorType.LEQ,
            case OperatorType.GT,
            case OperatorType.GEQ,
            case OperatorType.NE,
            case OperatorType.LOGICAL_OR,
            case OperatorType.LOGICAL_AND,
            case OperatorType.BITWISE_AND,
            case OperatorType.BITWISE_OR,
            case OperatorType.NOT: {
                return true
            }
            default: {
                return false
            }
        }
    }
    
    /**
     * Checks if the given operator is of type 
     * ADD/SUB/MULT/MOD/DIV
     * POSTFIX_ADD/POSTFIX_SUB
     * 
     * @param type The OperatorType in question
     */
    def isValuedOperator(OperatorType operator) {
        switch operator {
            case OperatorType.ADD,
            case OperatorType.POSTFIX_ADD,
            case OperatorType.SUB,
            case OperatorType.POSTFIX_SUB,
            case OperatorType.MULT,
            case OperatorType.MOD,
            case OperatorType.DIV: {
                return true
            }
            default: {
                return false
            }
        }
    }
    
    /**
     * Checks if the given ValueType is of type PURE
     * 
     * @param type The ValueType in question
     */
    def isPure(ValueType type) {
         type == ValueType.PURE
     }
     
     /**
     * Checks if the given ValueType is of type BOOL
     * 
     * @param type The ValueType in question
     */
    def isBool(ValueType type) {
         type == ValueType.BOOL
     }
    
    /**
      * Checks if combine operator fits value type
      * 
      * @param type The type of the valued object
      * @param the combine operator of the valued object
      */
     def combineOperatorFitsType(ValueType type, CombineOperator operator) {
         if (type == ValueType.DOUBLE || type == ValueType.FLOAT ||
             type == ValueType.INT || type == ValueType.UNSIGNED 
             ) {
                 if (operator == CombineOperator.ADD || operator == CombineOperator.MULT ||
                     operator == CombineOperator.MIN || operator == CombineOperator.MAX  ||
                     operator == CombineOperator.NONE || operator == null
                 ) {
                     return true
                 }
                 else {
                     return false
                 }
         }
         else if (type == ValueType.BOOL) {
             if (operator == CombineOperator.AND || operator == CombineOperator.OR ||
                     operator == CombineOperator.NONE || operator == null
                 ) {
                     return true
                 }
                 else {
                     return false
                 }
         }
         else {
             return true
         }
     }
    
    
}