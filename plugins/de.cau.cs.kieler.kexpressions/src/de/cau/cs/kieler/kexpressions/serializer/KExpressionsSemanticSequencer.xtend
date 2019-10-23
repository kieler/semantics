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
package de.cau.cs.kieler.kexpressions.serializer

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.services.KExpressionsGrammarAccess
import org.eclipse.xtext.Action
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.serializer.ISerializationContext
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder
import static de.cau.cs.kieler.kexpressions.OperatorType.*
/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@SuppressWarnings("restriction")
class KExpressionsSemanticSequencer extends AbstractKExpressionsSemanticSequencer {
    @Inject
    private KExpressionsGrammarAccess grammarAccess;
    
    override sequence_AddExpression_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FbyExpression_InitExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
    
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_DivExpression_FbyExpression_InitExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
    
    
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FbyExpression_InitExpression_LogicalAndExpression_LogicalOrExpression_ModExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FbyExpression_InitExpression_LogicalAndExpression_LogicalOrExpression_MultExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FbyExpression_InitExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_ShiftLeftExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FbyExpression_InitExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_ShiftRightExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FbyExpression_InitExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_ShiftRightUnsignedExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FbyExpression_InitExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SubExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FbyExpression_InitExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
    
    def void sequenceOperatorExpression(ISerializationContext context, OperatorExpression semanticObject) {
        val feeder = createSequencerFeeder(semanticObject, createNodeProvider(semanticObject));
        
        val op = semanticObject.operator
        switch (op) {
            // Multiple operands
            case ADD: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.sumExpressionAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.sumExpressionAccess.operatorAddOperatorEnumRuleCall_1_0_1_0,
                    grammarAccess.sumExpressionAccess.subExpressionsProductExpressionParserRuleCall_1_0_2_0,
                    grammarAccess.sumExpressionAccess.subExpressionsProductExpressionParserRuleCall_1_0_3_1_0
                )
            }
            case SUB: {
                if (semanticObject.subExpressions.size == 1) {
                    feeder.accept(grammarAccess.negExpressionAccess.operatorSubOperatorEnumRuleCall_0_1_0,
                        op)
                    feeder.accept(grammarAccess.negExpressionAccess.subExpressionsNegExpressionParserRuleCall_0_2_0,
                        semanticObject.subExpressions.head, 0)                    
                } else {
                    feeder.multiOP(
                        semanticObject,
                        grammarAccess.sumExpressionAccess.operatorExpressionSubExpressionsAction_1_1_0,
                        grammarAccess.sumExpressionAccess.operatorSubOperatorEnumRuleCall_1_1_1_0,
                        grammarAccess.sumExpressionAccess.subExpressionsProductExpressionParserRuleCall_1_1_2_0,
                        grammarAccess.sumExpressionAccess.subExpressionsProductExpressionParserRuleCall_1_1_3_1_0
                    )
                }
            }
            case MULT: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.productExpressionAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.productExpressionAccess.operatorMultOperatorEnumRuleCall_1_0_1_0,
                    grammarAccess.productExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_0_2_0,
                    grammarAccess.productExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_0_3_1_0
                )
            }
            case DIV: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.productExpressionAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.productExpressionAccess.operatorDivOperatorEnumRuleCall_1_1_1_0,
                    grammarAccess.productExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_1_2_0,
                    grammarAccess.productExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_1_3_1_0
                )
            }
            case MOD: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.productExpressionAccess.operatorExpressionSubExpressionsAction_1_2_0,
                    grammarAccess.productExpressionAccess.operatorModOperatorEnumRuleCall_1_2_1_0,
                    grammarAccess.productExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_2_2_0,
                    grammarAccess.productExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_2_3_1_0
                )
            }
            case BITWISE_AND: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.bitwiseAndExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.bitwiseAndExpressionAccess.operatorBitwiseAndOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.bitwiseAndExpressionAccess.subExpressionsCompareOperationParserRuleCall_1_1_1_0,
                    grammarAccess.bitwiseAndExpressionAccess.subExpressionsCompareOperationParserRuleCall_1_2_1_0
                )
            }
            case BITWISE_OR: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.bitwiseOrExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.bitwiseOrExpressionAccess.operatorBitwiseOrOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.bitwiseOrExpressionAccess.subExpressionsBitwiseXOrExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.bitwiseOrExpressionAccess.subExpressionsBitwiseXOrExpressionParserRuleCall_1_2_1_0
                )
            }
            case LOGICAL_AND: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.logicalAndExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.logicalAndExpressionAccess.operatorLogicalAndOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.logicalAndExpressionAccess.subExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.logicalAndExpressionAccess.subExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0
                )
            }
            case LOGICAL_OR: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.logicalOrExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.logicalOrExpressionAccess.operatorLogicalOrOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.logicalOrExpressionAccess.subExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.logicalOrExpressionAccess.subExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0
                )
            }
            // Compare
            case LT,
            case EQ,
            case GEQ,
            case GT,
            case LEQ,
            case NE: {
                feeder.accept(grammarAccess.compareOperationAccess.operatorExpressionSubExpressionsAction_1_0,
                    semanticObject.subExpressions.head, 0)
                feeder.accept(grammarAccess.compareOperationAccess.operatorCompareOperatorEnumRuleCall_1_1_0, op)
                feeder.accept(
                    grammarAccess.compareOperationAccess.subExpressionsNotOrValuedExpressionParserRuleCall_1_2_0,
                    semanticObject.subExpressions.last, 1)
            }
            // Unary OPs
            case NOT: {
                feeder.accept(grammarAccess.notExpressionAccess.operatorNotOperatorEnumRuleCall_0_1_0, op)
                feeder.accept(grammarAccess.notExpressionAccess.subExpressionsNotExpressionParserRuleCall_0_2_0,
                    semanticObject.subExpressions.head, 0)
            }
            case POSTFIX_ADD: {
            }
            case POSTFIX_SUB: {
            }
            case PRE: {
                feeder.accept(grammarAccess.valuedObjectTestExpressionAccess.operatorPreOperatorEnumRuleCall_0_1_0_0, op)
                feeder.accept(grammarAccess.valuedObjectTestExpressionAccess.
                    subExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0, semanticObject.subExpressions.head, 0)
            }
            case VAL: {
                feeder.accept(grammarAccess.valuedObjectTestExpressionAccess.operatorValOperatorEnumRuleCall_0_1_0_1, op)
                feeder.accept(grammarAccess.valuedObjectTestExpressionAccess.
                    subExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0, semanticObject.subExpressions.head, 0)
            }
            case BITWISE_NOT: {
                feeder.accept(grammarAccess.bitwiseNotExpressionAccess.operatorBitwiseNotOperatorEnumRuleCall_0_1_0, op)
                feeder.accept(grammarAccess.bitwiseNotExpressionAccess.subExpressionsBitwiseNotExpressionParserRuleCall_0_2_0,
                    semanticObject.subExpressions.head, 0)
            }
            case BITWISE_XOR: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.bitwiseXOrExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.bitwiseXOrExpressionAccess.operatorBitwiseXOrOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.bitwiseXOrExpressionAccess.subExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.bitwiseXOrExpressionAccess.subExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0
                )
            }
            case CONDITIONAL: {
                if (semanticObject.subExpressions.size == 2) {
                    feeder.accept(grammarAccess.ternaryOperationAccess.subExpressionsAtomicValuedExpressionParserRuleCall_0_1_0, semanticObject.subExpressions.head, 0)
                    feeder.accept(grammarAccess.ternaryOperationAccess.operatorConditionalOperatorEnumRuleCall_0_2_0, op)
                    feeder.accept(grammarAccess.ternaryOperationAccess.subExpressionsAtomicValuedExpressionParserRuleCall_0_3_0, semanticObject.subExpressions.get(1), 1)
                } else {
                    feeder.accept(grammarAccess.ternaryOperationAccess.subExpressionsAtomicValuedExpressionParserRuleCall_0_1_0,
                        semanticObject.subExpressions.head, 0)
                    feeder.accept(grammarAccess.ternaryOperationAccess.operatorConditionalOperatorEnumRuleCall_0_2_0,
                        op)
                    feeder.accept(grammarAccess.ternaryOperationAccess.subExpressionsAtomicValuedExpressionParserRuleCall_0_3_0,
                        semanticObject.subExpressions.get(1), 1)
//                        feeder.accept(grammarAccess.ternaryOperationAccess.colonKeyword_0_4_0,
//                            op)                            
                    feeder.accept(grammarAccess.ternaryOperationAccess.subExpressionsAtomicValuedExpressionParserRuleCall_0_4_1_0,
                        semanticObject.subExpressions.get(2), 2)
                }
            }
            case INIT: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.initExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.initExpressionAccess.operatorInitOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.initExpressionAccess.subExpressionsFbyExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.initExpressionAccess.subExpressionsFbyExpressionParserRuleCall_1_2_1_0
                )
            }
            case FBY: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.fbyExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.fbyExpressionAccess.operatorFbyOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.fbyExpressionAccess.subExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.fbyExpressionAccess.subExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0
                )
            }
            case SHIFT_LEFT: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftExpressionsAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.shiftExpressionsAccess.operatorShiftLeftOperatorEnumRuleCall_1_0_1_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsSumExpressionParserRuleCall_1_0_2_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsSumExpressionParserRuleCall_1_0_3_1_0
                )
            }
            case SHIFT_RIGHT: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftExpressionsAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.shiftExpressionsAccess.operatorShiftRightOperatorEnumRuleCall_1_1_1_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsSumExpressionParserRuleCall_1_1_2_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsSumExpressionParserRuleCall_1_1_3_1_0
                )
            }
            case SHIFT_RIGHT_UNSIGNED: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftExpressionsAccess.operatorExpressionSubExpressionsAction_1_2_0,
                    grammarAccess.shiftExpressionsAccess.operatorShiftRightUnsignedOperatorEnumRuleCall_1_2_1_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsSumExpressionParserRuleCall_1_2_2_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsSumExpressionParserRuleCall_1_2_3_1_0
                )
            }
        }
        feeder.finish();
    }

    /**
     * Generic composer of operator expressions with multiple operands.
     */
    def multiOP(SequenceFeeder feeder, OperatorExpression expression, Action firstOP, RuleCall op, RuleCall secondOP, RuleCall tailOP) {
        var pairList = expression.subExpressions.indexed
        for (subEx : pairList) {
            switch (subEx.key) {
                case 0: {
                    feeder.accept(firstOP, subEx.value, 0)
                }
                case 1: {
                    feeder.accept(op, expression.operator)
                    feeder.accept(secondOP, subEx.value, 1)
                }
                default: {
                    feeder.accept(tailOP, subEx.value, subEx.key)
                }
            }
        }
    }

}
