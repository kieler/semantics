package de.cau.cs.kieler.core.kexpressions.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;

import com.google.inject.Inject;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.OperatorExpression;
import de.cau.cs.kieler.core.kexpressions.OperatorType;
import de.cau.cs.kieler.core.kexpressions.services.KExpressionsGrammarAccess;

@SuppressWarnings("restriction")
public class KExpressionsSemanticSequencer extends AbstractKExpressionsSemanticSequencer {

    
//    @Inject
//    private KExpressionsGrammarAccess grammarAccess;
//
//    protected void sequence_CompareOperation_NotExpression_OrAndExpression_ValuedObjectTestExpression(EObject context, OperatorExpression semanticObject) {
//        INodesForEObjectProvider nodesProvider = createNodeProvider(semanticObject);
//        SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodesProvider);
//        
//        if (semanticObject.getOperator() == OperatorType.OR) {
//            for (Expression e : semanticObject.getSubExpressions()) {
//                feeder.accept(grammarAccess.getOrAndExpressionAccess().getCompareOperationParserRuleCall_0(), semanticObject);
//                feeder.accept(grammarAccess.getOrAndExpressionAccess().getOperatorAlternatives_1_1_0());
//                
//            }
//        }
//        if (semanticObject.getOperator() == OperatorType.AND) {
//            feeder.accept(grammarAccess.getBoolExpressionAccess().getOrAndExpressionParserRuleCall(), semanticObject);
//        }
//        if (semanticObject.getOperator() == OperatorType.EQ) {
//            feeder.accept(grammarAccess.getOrAndExpressionAccess().getCompareOperationParserRuleCall_0(), semanticObject);
//        }
//        
//        feeder.finish();
//     }
//
//        
	
//	protected void sequence_AddExpression_AndExpression_CompareOperation_DivExpression_Expression_ModExpression_MultExpression_NegExpression_NotExpression_OrExpression_SubExpression_ValuedObjectTestExpression(EObject context, OperatorExpression semanticObject) {
////		genericSequencer.createSequence(context, semanticObject);
//		super.sequence_AddExpression_AndExpression_CompareOperation_DivExpression_Expression_ModExpression_MultExpression_NegExpression_NotExpression_OrExpression_SubExpression_ValuedObjectTestExpression(context, semanticObject);
//	}
//	
//	protected void sequence_AndExpression_CompareOperation_NotExpression_OrExpression_ValuedObjectTestExpression(EObject context, OperatorExpression semanticObject) {
////		genericSequencer.createSequence(context, semanticObject);
//		super.sequence_AndExpression_CompareOperation_NotExpression_OrExpression_ValuedObjectTestExpression(context, semanticObject);
//	}	
}
