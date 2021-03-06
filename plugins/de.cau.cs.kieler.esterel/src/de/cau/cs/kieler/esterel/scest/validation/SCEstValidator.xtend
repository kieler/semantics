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
package de.cau.cs.kieler.esterel.scest.validation

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.esterel.Constant
import de.cau.cs.kieler.esterel.Emit
import de.cau.cs.kieler.esterel.EsterelFunctionCall
import de.cau.cs.kieler.esterel.EsterelVariableDeclaration
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.TrapSignal
import de.cau.cs.kieler.esterel.Variable
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import org.eclipse.xtext.validation.Check

/**
 * @author mrb
 *
 */
class SCEstValidator extends AbstractSCEstValidator {
    
    @Inject extension EsterelTransformationExtensions
    @Inject extension KEffectsExtensions
    
    final String CALCULATION_EXPRESSION = "The expression should be of type INT/FLOAT/DOUBLE/UNSIGNED."
    final String BOOLEAN_EXPRESSION = "The expression should be of type BOOL."
        
        
    /*
     * ##########################################################
     * ###                      ERRORS                        ###
     * ##########################################################
     */
        
    @Check
    def void emitSignal(Emit emit) {
        if ((emit.signal as Signal).type.isPure) {
            if (emit.expression !== null) {
                error(emit.signal.name + " is not a valued signal!", emit, null, -1)
            }
        }
        else {
            if (emit.expression === null) {
                error("Must be a valued emit since " + emit.signal.name + " is a valued signal!", emit, null, -1)
            }
        }
    }
    
    @Check
    def void annotation(Annotation annotation) {
        if (annotation.isGenerated  || annotation.isGeneratedModuleAnnotation) {
            error("Annotations of name '" + interfaceScope + "', '" + generatedModule + "' or '" + generatedAnnotation + "' are forbidden!", annotation, null, -1)
        }
    }
    
//    @Check
//    def void combineOperatorValuedObject(ValuedObject vo) {
//        if (vo.eContainer instanceof VariableDeclaration) {
//            var type = (vo.eContainer as VariableDeclaration).type
//            if (!combineOperatorFitsType(type, vo.combineOperator)) {
//                error("The combine operator '" + vo.combineOperator + "' does not fit the valued objects type '" + type + "'!", vo, null, -1)
//            }
//        }
//    }
//    
//    @Check
//    def void combineOperatorIVariable(Variable variable) {
//        var parent = variable.eContainer as EsterelVariableDeclaration
//        if (!combineOperatorFitsType(parent.type?.type, parent.type?.operator)) {
//            error("The combine operator '" + parent.type?.operator + "' does not fit the variables type '" + parent.type?.type + "'!", variable, null, -1)
//        }
//    }
//    
//    @Check
//    def void combineOperatorConstant(Constant constant) {
//        if (!combineOperatorFitsType(constant.type?.type, constant.type?.operator)) {
//            error("The combine operator '" + constant.type?.operator + "' does not fit the constants type '" + constant.type?.type + "'!", constant, null, -1)
//        }
//    }
//    
//    @Check
//    def void combineOperatorISignal(Signal signal) {
//        if (signal instanceof Sensor) {
//            var parent = signal.eContainer as Sensor
//            if (!combineOperatorFitsType(parent.type?.type, parent.type?.operator)) {
//                error("The combine operator '" + parent.type?.operator + "' does not fit the sensors type '" + parent.type?.type + "'!", signal, null, -1)
//            }
//        }
//        else if (!combineOperatorFitsType(signal.type, signal.combineOperator)) {
//            error("The combine operator '" + signal.combineOperator + "' does not fit the signals type '" + signal.type + "'!", signal, null, -1)
//        }
//    }
//    
//    @Check
//    def void combineOperatorTrapSignal(TrapSignal trap) {
//        if (!combineOperatorFitsType(trap.type, trap.combineOperator)) {
//            error("The combine operator '" + trap.combineOperator + "' does not fit the traps type '" + trap.type + "'!", trap, null, -1)
//        }
//    }
    
    
    /*
     * ##########################################################
     * ###                     WARNINGS                       ###
     * ##########################################################
     */
    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionISignal(Signal signal) {
//        if (signal.initialValue !== null) {
//            if (signal.type.isBool && !signal.initialValue.isBoolExpr) {
//                warning(BOOLEAN_EXPRESSION, null)
//            }
//            else if (signal.type.isCalculationType && !signal.initialValue.isCalculationExpr) {
//                warning(CALCULATION_EXPRESSION, null)
//            }
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionTrapSignal(TrapSignal trap) {
//        if (trap.initialValue !== null) {
//            if (trap.type.isBool && !trap.initialValue.isBoolExpr) {
//                warning(BOOLEAN_EXPRESSION, null)
//            }
//            else if (trap.type.isCalculationType && !trap.initialValue.isCalculationExpr) {
//                warning(CALCULATION_EXPRESSION, null)
//            }
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionEmit(Emit emit) {
//        if (emit.expression !== null) {
//            if ((emit.signal as Signal).type.isBool && !emit.expression.isBoolExpr) {
//                warning(BOOLEAN_EXPRESSION, null)
//            }
//            else if ((emit.signal as Signal).type.isCalculationType && !emit.expression.isCalculationExpr) {
//                warning(CALCULATION_EXPRESSION, null)
//            }
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionSustain(Sustain sustain) {
//        if (sustain.expression !== null) {
//            if ((sustain.signal as Signal).type.isBool && !sustain.expression.isBoolExpr) {
//                warning(BOOLEAN_EXPRESSION, null)
//            }
//            else if ((sustain.signal as Signal).type.isCalculationType && !sustain.expression.isCalculationExpr) {
//                warning(CALCULATION_EXPRESSION, null)
//            }
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionEsterelAssignment(Assignment assign) {
//        if ((assign.valuedObject.eContainer as EsterelVariableDeclaration).type?.type.isBool && !assign.expression.isBoolExpr) {
//            warning(BOOLEAN_EXPRESSION, null)
//        }
//        else if ((assign.valuedObject.eContainer as EsterelVariableDeclaration).type?.type.isCalculationType && !assign.expression.isCalculationExpr) {
//            warning(CALCULATION_EXPRESSION, null)
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionIfTest(IfTest ifTest) {
//        if (!ifTest.expression.isBoolExpr) {
//            warning(BOOLEAN_EXPRESSION, null)
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionElsIf(ElsIf elsIf) {
//        if (!elsIf.expression.isBoolExpr) {
//            warning(BOOLEAN_EXPRESSION, null)
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionDelayExpr(DelayExpression delay) {
//        if (delay.expression !== null && !delay.expression.isCalculationExpr) {
//            warning(CALCULATION_EXPRESSION, null)
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionRepeat(Repeat repeat) {
//        if (!repeat.expression.isCalculationExpr) {
//            warning("The expression should be of type INT.", null)
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionExit(Exit exit) {
//        if (exit.expression !== null) {
//            if (exit.trap.type.isBool && !exit.expression.isBoolExpr) {
//                warning(BOOLEAN_EXPRESSION, null)
//            }
//            else if (exit.trap.type.isCalculationType && !exit.expression.isCalculationExpr) {
//                warning(CALCULATION_EXPRESSION, null)
//            }
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionIVariable(Variable variable) {
//        if ((variable.eContainer as EsterelVariableDeclaration).type?.type.isBool && !variable.initialValue.isBoolExpr) {
//            warning(BOOLEAN_EXPRESSION, null)
//        }
//        else if ((variable.eContainer as EsterelVariableDeclaration).type?.type.isCalculationType && !variable.initialValue.isCalculationExpr) {
//            warning(CALCULATION_EXPRESSION, null)
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionConditional(Conditional conditional) {
//        if (!conditional.expression.isBoolExpr) {
//            warning(BOOLEAN_EXPRESSION, null)
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionAssignment(Assignment assign) {
//        if ((assign.valuedObject.eContainer as VariableDeclaration).type.isBool && !assign.expression.isBoolExpr) {
//            warning(BOOLEAN_EXPRESSION, null)
//        }
//        else if ((assign.valuedObject.eContainer as VariableDeclaration).type.isCalculationType && !assign.expression.isCalculationExpr) {
//            warning(CALCULATION_EXPRESSION, null)
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionSet(Set set) {
//        if (set.signal.type.isBool && !set.expression.isBoolExpr) {
//            warning(BOOLEAN_EXPRESSION, null)
//        }
//        else if (set.signal.type.isCalculationType && !set.expression.isCalculationExpr) {
//            warning(CALCULATION_EXPRESSION, null)
//        }
//    }
//    
//    @Check(CheckType.EXPENSIVE)
//    def void expressionValuedObject(ValuedObject vo) {
//        var parent = vo.eContainer
//        if (parent instanceof VariableDeclaration) {
//            if (parent.type.isBool && !vo.initialValue.isBoolExpr) {
//                warning(BOOLEAN_EXPRESSION, null)
//            }
//            else if (parent.type.isCalculationType && !vo.initialValue.isCalculationExpr) {
//                warning(CALCULATION_EXPRESSION, null)
//            }
//        }
//    }
    
    
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
            EsterelFunctionCall: {
                return expr.function.returnType.type.isCalculationType
            }
            case null: {
                return true
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
                return expr.justReferenceIsBoolValuedObject
            }
            EsterelFunctionCall: {
                return expr.function.returnType.type.isBool
            }
            case null: {
                return true
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
    def boolean justReferenceIsBoolValuedObject(ValuedObjectReference voRef) {
        if (voRef.valuedObject instanceof Signal) {
            return true
        }
        else {
            return voRef.isBoolValuedObject
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
            Signal: {
                return vo.type.isBoolOrPure
            }
            Constant: {
                return vo.type.type.isBoolOrPure
            }
            Variable: {
                if (parent instanceof EsterelVariableDeclaration) {
                   return parent.type?.type.isBoolOrPure
                }
            }
            ValuedObject: {
                if (parent instanceof VariableDeclaration) {
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
            Signal: {
                return vo.type.isCalculationType 
            }
            Constant: {
                return vo.type?.type.isCalculationType
            }
            Variable: {
                if (parent instanceof EsterelVariableDeclaration) {
                   return parent.type?.type.isCalculationType
                }
            }
            ValuedObject: {
                if (parent instanceof VariableDeclaration) {
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
            case null,
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
        type === null || type == ValueType.BOOL || type == ValueType.PURE
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
            case null,
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
            case null,
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
                     operator == CombineOperator.NONE || operator === null
                 ) {
                     return true
                 }
                 else {
                     return false
                 }
         }
         else if (type == ValueType.BOOL) {
             if (operator == CombineOperator.AND || operator == CombineOperator.OR ||
                     operator == CombineOperator.NONE || operator === null
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