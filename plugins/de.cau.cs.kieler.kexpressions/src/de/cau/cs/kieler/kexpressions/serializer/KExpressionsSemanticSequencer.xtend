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

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@SuppressWarnings("restriction")
class KExpressionsSemanticSequencer extends AbstractKExpressionsSemanticSequencer {
    @Inject
    private KExpressionsGrammarAccess grammarAccess;

    override sequence_AddExpression_BitwiseAndExpression_BitwiseOrExpression_CompareOperation_DivExpression_LogicalAndExpression_LogicalOrExpression_ModExpression_MultExpression_NegExpression_NotExpression_SubExpression_ValuedObjectTestExpression(
        ISerializationContext context, OperatorExpression semanticObject) {
//        genericSequencer.createSequence(context, semanticObject)

        val feeder = createSequencerFeeder(semanticObject, createNodeProvider(semanticObject));

        switch (semanticObject.operator) {
            // Multiple operands
            case ADD: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.addExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.addExpressionAccess.operatorAddOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.addExpressionAccess.subExpressionsSubExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.addExpressionAccess.subExpressionsSubExpressionParserRuleCall_1_2_1_0
                )
            }
            case SUB: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.subExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.subExpressionAccess.operatorSubOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.subExpressionAccess.subExpressionsMultExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.subExpressionAccess.subExpressionsMultExpressionParserRuleCall_1_2_1_0
                )
            }
            case MULT: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.multExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.multExpressionAccess.operatorMultOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.multExpressionAccess.subExpressionsDivExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.multExpressionAccess.subExpressionsDivExpressionParserRuleCall_1_2_1_0
                )
            }
            case DIV: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.divExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.divExpressionAccess.operatorDivOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.divExpressionAccess.subExpressionsModExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.divExpressionAccess.subExpressionsModExpressionParserRuleCall_1_2_1_0
                )
            }
            case MOD: {
                feeder.multiOP(
                    semanticObject,
                    grammarAccess.modExpressionAccess.operatorExpressionSubExpressionsAction_1_0,
                    grammarAccess.modExpressionAccess.operatorModOperatorEnumRuleCall_1_1_0_0,
                    grammarAccess.modExpressionAccess.subExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.modExpressionAccess.subExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0
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
                    grammarAccess.bitwiseOrExpressionAccess.subExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0,
                    grammarAccess.bitwiseOrExpressionAccess.subExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0
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
                feeder.accept(grammarAccess.compareOperationAccess.operatorCompareOperatorEnumRuleCall_1_1_0,
                    semanticObject.operator)
                feeder.accept(
                    grammarAccess.compareOperationAccess.subExpressionsNotOrValuedExpressionParserRuleCall_1_2_0,
                    semanticObject.subExpressions.last, 1)
            }
            // Unary OPs
            case NOT: {
                feeder.accept(grammarAccess.notExpressionAccess.operatorNotOperatorEnumRuleCall_0_1_0,
                    semanticObject.operator)
                feeder.accept(grammarAccess.notExpressionAccess.subExpressionsNotExpressionParserRuleCall_0_2_0,
                    semanticObject.subExpressions.head, 0)
            }
            case POSTFIX_ADD: {
//            feeder.accept(grammarAccess.notExpressionAccess.operatorNotOperatorEnumRuleCall_0_1_0, semanticObject.operator)
//            feeder.accept(grammarAccess.notExpressionAccess.subExpressionsNotExpressionParserRuleCall_0_2_0, semanticObject.subExpressions.head, 0)
            }
            case POSTFIX_SUB: {
//            feeder.accept(grammarAccess.notExpressionAccess.operatorNotOperatorEnumRuleCall_0_1_0, semanticObject.operator)
//            feeder.accept(grammarAccess.notExpressionAccess.subExpressionsNotExpressionParserRuleCall_0_2_0, semanticObject.subExpressions.head, 0)
            }
            case PRE: {
                feeder.accept(grammarAccess.valuedObjectTestExpressionAccess.operatorPreOperatorEnumRuleCall_0_1_0_0,
                    semanticObject.operator)
                feeder.accept(grammarAccess.valuedObjectTestExpressionAccess.
                    subExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0, semanticObject.subExpressions.head, 0)
            }
            case VAL: {
                feeder.accept(grammarAccess.valuedObjectTestExpressionAccess.operatorValOperatorEnumRuleCall_0_1_0_1,
                    semanticObject.operator)
                feeder.accept(grammarAccess.valuedObjectTestExpressionAccess.
                    subExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0, semanticObject.subExpressions.head, 0)
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
