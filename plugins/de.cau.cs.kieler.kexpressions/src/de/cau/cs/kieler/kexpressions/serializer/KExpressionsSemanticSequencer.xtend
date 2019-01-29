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
    
    override sequence_AddExpression_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
    
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_DivExpression_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
    
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_DivModExpression_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_ModExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_MultDivExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_MultExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_MultModExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_ShiftLeftExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_ShiftLeftRightExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_ShiftLeftRightUnsignedExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_ShiftRightExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_ShiftRightRightUnsignedExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_ShiftRightUnsignedExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SubExpression_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
        
    override sequence_BitwiseAndExpression_BitwiseNotExpression_BitwiseOrExpression_BitwiseXOrExpression_CompareOperation_FBYExpression_LogicalAndExpression_LogicalOrExpression_NegExpression_NotExpression_ProductExpression_ShiftExpressions_SumExpression_TernaryOperation_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
            sequenceOperatorExpression(context, semanticObject)
    }
    
    def void sequenceOperatorExpression(ISerializationContext context, OperatorExpression semanticObject) {
        val feeder = createSequencerFeeder(semanticObject, createNodeProvider(semanticObject));
        
        val op = semanticObject.operator
        val superExpr = if (semanticObject.eContainer instanceof OperatorExpression) semanticObject.eContainer as OperatorExpression
        val superOp = if (superExpr !== null) superExpr.operator
        val isFirstOperant = if (superExpr !== null) superExpr.subExpressions.indexOf(semanticObject) == 0
        
        val sumExpr = (op == ADD || op == SUB) &&
            semanticObject.subExpressions.size > 1 && // Not negExpression
            (   superExpr === null // Not a child at all
            ||  !(!isFirstOperant && ((op == ADD && superOp == SUB) || (op == SUB && superOp == ADD))) // Add in Sub or Sub in Add
            )
            
        val divmodExpr  = superExpr !== null && !isFirstOperant && superOp == MULT && (op == DIV || op == MOD)              
        val multmodExpr = superExpr !== null && !isFirstOperant && superOp == DIV && (op == MULT || op == MOD)            
        val multdivExpr = superExpr !== null && !isFirstOperant && superOp == MOD && (op == DIV || op == MULT)
        val productExpr = (op == MULT || op == DIV || op == MOD) &&
            (   superExpr === null // Not a child at all
            ||  !(divmodExpr || multdivExpr || multmodExpr) // Not one of the nested ones
            )
            
        val shiftRRuExpr = superExpr !== null && !isFirstOperant && superOp == SHIFT_LEFT && (op == SHIFT_RIGHT || op == SHIFT_RIGHT_UNSIGNED)              
        val shiftLRuExpr = superExpr !== null && !isFirstOperant && superOp == SHIFT_RIGHT && (op == SHIFT_LEFT || op == SHIFT_RIGHT_UNSIGNED)            
        val shiftLRExpr  = superExpr !== null && !isFirstOperant && superOp == SHIFT_RIGHT_UNSIGNED && (op == SHIFT_LEFT || op == SHIFT_RIGHT)
        val shiftExpr = (op == SHIFT_LEFT || op == SHIFT_RIGHT || op == SHIFT_RIGHT_UNSIGNED) &&
            (   superExpr === null // Not a child at all
            ||  !(shiftRRuExpr || shiftLRuExpr || shiftLRExpr) // Not one of the nested ones
            )
        
        if (sumExpr) {
            if (op == ADD) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.sumExpressionAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.sumExpressionAccess.operatorAddOperatorEnumRuleCall_1_0_1_0_0,
                    grammarAccess.sumExpressionAccess.subExpressionsSubExpressionParserRuleCall_1_0_1_1_0,
                    grammarAccess.sumExpressionAccess.subExpressionsSubExpressionParserRuleCall_1_0_2_1_0
                )
            } else { // SUB
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.sumExpressionAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.sumExpressionAccess.operatorSubOperatorEnumRuleCall_1_1_1_0_0,
                    grammarAccess.sumExpressionAccess.subExpressionsAddExpressionParserRuleCall_1_1_1_1_0,
                    grammarAccess.sumExpressionAccess.subExpressionsAddExpressionParserRuleCall_1_1_2_1_0
                )
            }
        } else if (divmodExpr) {
            if (op == DIV) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.divModExpressionAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.divModExpressionAccess.operatorDivOperatorEnumRuleCall_1_0_1_0_0,
                    grammarAccess.divModExpressionAccess.subExpressionsMultModExpressionParserRuleCall_1_0_1_1_0,
                    grammarAccess.divModExpressionAccess.subExpressionsMultModExpressionParserRuleCall_1_0_2_1_0
                )
            } else { // MOD
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.divModExpressionAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.divModExpressionAccess.operatorModOperatorEnumRuleCall_1_1_1_0_0,
                    grammarAccess.divModExpressionAccess.subExpressionsMultDivExpressionParserRuleCall_1_1_1_1_0,
                    grammarAccess.divModExpressionAccess.subExpressionsMultDivExpressionParserRuleCall_1_1_2_1_0
                )
            }
        } else if (multmodExpr) {
            if (op == MULT) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.multModExpressionAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.multModExpressionAccess.operatorMultOperatorEnumRuleCall_1_0_1_0_0,
                    grammarAccess.multModExpressionAccess.subExpressionsDivModExpressionParserRuleCall_1_0_1_1_0,
                    grammarAccess.multModExpressionAccess.subExpressionsDivModExpressionParserRuleCall_1_0_2_1_0
                )
            } else { // MOD
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.multModExpressionAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.multModExpressionAccess.operatorModOperatorEnumRuleCall_1_1_1_0_0,
                    grammarAccess.multModExpressionAccess.subExpressionsMultDivExpressionParserRuleCall_1_1_1_1_0,
                    grammarAccess.multModExpressionAccess.subExpressionsMultDivExpressionParserRuleCall_1_1_2_1_0
                )
            }
        } else if (multdivExpr) {
            if (op == MULT) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.multDivExpressionAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.multDivExpressionAccess.operatorMultOperatorEnumRuleCall_1_0_1_0_0,
                    grammarAccess.multDivExpressionAccess.subExpressionsDivModExpressionParserRuleCall_1_0_1_1_0,
                    grammarAccess.multDivExpressionAccess.subExpressionsDivModExpressionParserRuleCall_1_0_2_1_0
                )
            } else { // DIV
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.multDivExpressionAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.multDivExpressionAccess.operatorDivOperatorEnumRuleCall_1_1_1_0_0,
                    grammarAccess.multDivExpressionAccess.subExpressionsMultModExpressionParserRuleCall_1_1_1_1_0,
                    grammarAccess.multDivExpressionAccess.subExpressionsMultModExpressionParserRuleCall_1_1_2_1_0
                )
            }
        } else if (productExpr) {
            if (op == MULT) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.productExpressionAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.productExpressionAccess.operatorMultOperatorEnumRuleCall_1_0_1_0_0,
                    grammarAccess.productExpressionAccess.subExpressionsDivModExpressionParserRuleCall_1_0_1_1_0,
                    grammarAccess.productExpressionAccess.subExpressionsDivModExpressionParserRuleCall_1_0_2_1_0
                )
            } else if (op == DIV) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.productExpressionAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.productExpressionAccess.operatorDivOperatorEnumRuleCall_1_1_1_0_0,
                    grammarAccess.productExpressionAccess.subExpressionsMultModExpressionParserRuleCall_1_1_1_1_0,
                    grammarAccess.productExpressionAccess.subExpressionsMultModExpressionParserRuleCall_1_1_2_1_0
                )
            } else { // MOD
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.productExpressionAccess.operatorExpressionSubExpressionsAction_1_2_0,
                    grammarAccess.productExpressionAccess.operatorModOperatorEnumRuleCall_1_2_1_0_0,
                    grammarAccess.productExpressionAccess.subExpressionsMultDivExpressionParserRuleCall_1_2_1_1_0,
                    grammarAccess.productExpressionAccess.subExpressionsMultDivExpressionParserRuleCall_1_2_2_1_0
                )
            }
        } else if (shiftRRuExpr) {
            if (op == SHIFT_RIGHT) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftRightRightUnsignedExpressionAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.shiftRightRightUnsignedExpressionAccess.operatorShiftRightOperatorEnumRuleCall_1_0_1_0_0,
                    grammarAccess.shiftRightRightUnsignedExpressionAccess.subExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_0_1_1_0,
                    grammarAccess.shiftRightRightUnsignedExpressionAccess.subExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_0_2_1_0
                )
            } else { // SHIFT_RIGHT_UNSIGNED
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftRightRightUnsignedExpressionAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.shiftRightRightUnsignedExpressionAccess.operatorShiftRightUnsignedOperatorEnumRuleCall_1_1_1_0_0,
                    grammarAccess.shiftRightRightUnsignedExpressionAccess.subExpressionsShiftLeftRightExpressionParserRuleCall_1_1_1_1_0,
                    grammarAccess.shiftRightRightUnsignedExpressionAccess.subExpressionsShiftLeftRightExpressionParserRuleCall_1_1_2_1_0
                )
            }
        } else if (shiftLRuExpr) {
            if (op == SHIFT_LEFT) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftLeftRightUnsignedExpressionAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.shiftLeftRightUnsignedExpressionAccess.operatorShiftLeftOperatorEnumRuleCall_1_0_1_0_0,
                    grammarAccess.shiftLeftRightUnsignedExpressionAccess.subExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_1_1_0,
                    grammarAccess.shiftLeftRightUnsignedExpressionAccess.subExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_2_1_0
                )
            } else { // SHIFT_RIGHT_UNSIGNED
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftLeftRightUnsignedExpressionAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.shiftLeftRightUnsignedExpressionAccess.operatorShiftRightUnsignedOperatorEnumRuleCall_1_1_1_0_0,
                    grammarAccess.shiftLeftRightUnsignedExpressionAccess.subExpressionsShiftLeftRightExpressionParserRuleCall_1_1_1_1_0,
                    grammarAccess.shiftLeftRightUnsignedExpressionAccess.subExpressionsShiftLeftRightExpressionParserRuleCall_1_1_2_1_0
                )
            }
        } else if (shiftLRExpr) {
            if (op == SHIFT_LEFT) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftLeftRightExpressionAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.shiftLeftRightExpressionAccess.operatorShiftLeftOperatorEnumRuleCall_1_0_1_0_0,
                    grammarAccess.shiftLeftRightExpressionAccess.subExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_1_1_0,
                    grammarAccess.shiftLeftRightExpressionAccess.subExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_2_1_0
                )
            } else { // SHIFT_RIGHT
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftLeftRightExpressionAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.shiftLeftRightExpressionAccess.operatorShiftRightOperatorEnumRuleCall_1_1_1_0_0,
                    grammarAccess.shiftLeftRightExpressionAccess.subExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_1_1_0,
                    grammarAccess.shiftLeftRightExpressionAccess.subExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_2_1_0
                )
            }
        } else if (shiftExpr) {
            if (op == SHIFT_LEFT) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftExpressionsAccess.operatorExpressionSubExpressionsAction_1_0_0,
                    grammarAccess.shiftExpressionsAccess.operatorShiftLeftOperatorEnumRuleCall_1_0_1_0_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_1_1_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_2_1_0
                )
            } else if (op == SHIFT_RIGHT) {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftExpressionsAccess.operatorExpressionSubExpressionsAction_1_1_0,
                    grammarAccess.shiftExpressionsAccess.operatorShiftRightOperatorEnumRuleCall_1_1_1_0_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_1_1_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_2_1_0
                )
            } else { // SHIFT_RIGHT_UNSIGNED
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.shiftExpressionsAccess.operatorExpressionSubExpressionsAction_1_2_0,
                    grammarAccess.shiftExpressionsAccess.operatorShiftRightUnsignedOperatorEnumRuleCall_1_2_1_0_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsShiftLeftRightExpressionParserRuleCall_1_2_1_1_0,
                    grammarAccess.shiftExpressionsAccess.subExpressionsShiftLeftRightExpressionParserRuleCall_1_2_2_1_0
                )
            }
        } else {
            // Simple rule case
            switch (op) {
                // Multiple operands
                case ADD: {
                    feeder.multiOP(
                        semanticObject,
                        grammarAccess.addExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                        grammarAccess.addExpressionAccess.operatorAddOperatorEnumRuleCall_1_1_0_0,
                        grammarAccess.addExpressionAccess.subExpressionsProductExpressionParserRuleCall_1_1_1_0,
                        grammarAccess.addExpressionAccess.subExpressionsProductExpressionParserRuleCall_1_2_1_0
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
                            grammarAccess.subExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                            grammarAccess.subExpressionAccess.operatorSubOperatorEnumRuleCall_1_1_0_0,
                            grammarAccess.subExpressionAccess.subExpressionsProductExpressionParserRuleCall_1_1_1_0,
                            grammarAccess.subExpressionAccess.subExpressionsProductExpressionParserRuleCall_1_2_1_0
                        )
                    }
                }
                case MULT: {
                    feeder.multiOP(
                        semanticObject,
                        grammarAccess.multExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                        grammarAccess.multExpressionAccess.operatorMultOperatorEnumRuleCall_1_1_0_0,
                        grammarAccess.multExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_1_1_0,
                        grammarAccess.multExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_2_1_0
                    )
                }
                case DIV: {
                    feeder.multiOP(
                        semanticObject,
                        grammarAccess.divExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                        grammarAccess.divExpressionAccess.operatorDivOperatorEnumRuleCall_1_1_0_0,
                        grammarAccess.divExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_1_1_0,
                        grammarAccess.divExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_2_1_0
                    )
                }
                case MOD: {
                    feeder.multiOP(
                        semanticObject,
                        grammarAccess.modExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                        grammarAccess.modExpressionAccess.operatorModOperatorEnumRuleCall_1_1_0_0,
                        grammarAccess.modExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_1_1_0,
                        grammarAccess.modExpressionAccess.subExpressionsNegExpressionParserRuleCall_1_2_1_0
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
                    feeder.accept(grammarAccess.ternaryOperationAccess.subExpressionsAtomicValuedExpressionParserRuleCall_0_1_0,
                        semanticObject.subExpressions.head, 0)
                    feeder.accept(grammarAccess.ternaryOperationAccess.operatorConditionalOperatorEnumRuleCall_0_2_0,
                        op)
                    feeder.accept(grammarAccess.ternaryOperationAccess.subExpressionsAtomicValuedExpressionParserRuleCall_0_3_0,
                        semanticObject.subExpressions.get(1), 1)
                    feeder.accept(grammarAccess.ternaryOperationAccess.subExpressionsAtomicValuedExpressionParserRuleCall_0_5_0,
                        semanticObject.subExpressions.get(2), 2)
                }
                case FBY: {
                    feeder.accept(grammarAccess.FBYExpressionAccess.subExpressionsAtomicValuedExpressionParserRuleCall_0_1_0,
                        semanticObject.subExpressions.head, 0)
                    feeder.accept(grammarAccess.FBYExpressionAccess.operatorFBYOperatorEnumRuleCall_0_2_0,
                        op)
                    feeder.accept(grammarAccess.FBYExpressionAccess.subExpressionsAtomicValuedExpressionParserRuleCall_0_3_0,
                        semanticObject.subExpressions.get(1), 1)
                }    
                case SHIFT_LEFT: {
                    feeder.multiOP(
                        semanticObject,
                        grammarAccess.shiftLeftExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                        grammarAccess.shiftLeftExpressionAccess.operatorShiftLeftOperatorEnumRuleCall_1_1_0_0,
                        grammarAccess.shiftLeftExpressionAccess.subExpressionsShiftRightExpressionParserRuleCall_1_1_1_0,
                        grammarAccess.shiftLeftExpressionAccess.subExpressionsShiftRightExpressionParserRuleCall_1_2_1_0
                    )
                }
                case SHIFT_RIGHT: {
                    feeder.multiOP(
                        semanticObject,
                        grammarAccess.shiftRightExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                        grammarAccess.shiftRightExpressionAccess.operatorShiftRightOperatorEnumRuleCall_1_1_0_0,
                        grammarAccess.shiftRightExpressionAccess.subExpressionsShiftRightUnsignedExpressionParserRuleCall_1_1_1_0,
                        grammarAccess.shiftRightExpressionAccess.subExpressionsShiftRightUnsignedExpressionParserRuleCall_1_2_1_0
                    )
                }
                case SHIFT_RIGHT_UNSIGNED: {
                    feeder.multiOP(
                        semanticObject,
                        grammarAccess.shiftRightUnsignedExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                        grammarAccess.shiftRightUnsignedExpressionAccess.operatorShiftRightUnsignedOperatorEnumRuleCall_1_1_0_0,
                        grammarAccess.shiftRightUnsignedExpressionAccess.subExpressionsSumExpressionParserRuleCall_1_1_1_0,
                        grammarAccess.shiftRightUnsignedExpressionAccess.subExpressionsSumExpressionParserRuleCall_1_2_1_0
                    )
                }
            }
        }
        feeder.finish();
    }

    /**
     * Generic composer of operator expressions with multiple operands.
     */
    def multiOP(SequenceFeeder feeder, OperatorExpression expression, Action firstOP, RuleCall op, RuleCall secondOP, RuleCall tailOP) {
        for (subEx : expression.subExpressions.indexed) {
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
