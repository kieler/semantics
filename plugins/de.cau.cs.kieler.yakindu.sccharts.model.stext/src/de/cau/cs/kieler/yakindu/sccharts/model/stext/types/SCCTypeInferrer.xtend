package de.cau.cs.kieler.yakindu.sccharts.model.stext.types

import com.google.inject.Inject
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.PreValueExpression
import org.yakindu.base.types.Event
import org.yakindu.base.types.Feature
import org.yakindu.base.types.ITypeSystem$InferenceResult
import org.yakindu.base.types.ITypeSystem$InferredType
import org.yakindu.sct.model.stext.stext.EventRaisingExpression
import org.yakindu.sct.model.stext.stext.EventValueReferenceExpression
import org.yakindu.sct.model.stext.stext.FeatureCall
import org.yakindu.sct.model.stext.types.ISTextTypeSystem
import org.yakindu.sct.model.stext.types.STextDefaultTypeInferrer

/**
 * 
 * The TypeInferrer checks an expression AST for type conformance
 * 
 * @author andreas muelder - Initial contribution and API
 *  
 */
class SCCTypeInferrer extends STextDefaultTypeInferrer{
	@Inject protected extension
	ISTextTypeSystem ts
	
	override dispatch doInferType(FeatureCall featureCall){
		if(featureCall.feature instanceof Event /*ntDefinition*/ 
			&& !(featureCall.eContainer instanceof EventRaisingExpression) 
			&&!(featureCall.eContainer instanceof EventValueReferenceExpression)
			&&!(featureCall.eContainer instanceof PreValueExpression)
		){
			return new InferenceResult(getBooleanType)
		}
		if (featureCall.feature instanceof Feature) {
			val type = (featureCall.feature as Feature).type
			if(type != null){
				return new InferenceResult(new InferredType(type))
			}
			return new InferenceResult(getVoidType)
		}
		return featureCall.feature.doInferType
	}
//	
//	override dispatch inferType(Event /*Definition*/ definition,ElementReferenceExpression expression) {
//		if(expression.eContainer instanceof EventRaisingExpression
//				|| expression.eContainer instanceof EventValueReferenceExpression
//				|| expression.eContainer instanceof PreValueExpression)
//			return definition.type
//		return ts.^boolean
//	}
//
	/**
 	 * Pre(dec) operator should have the type of dec
 	 */
	def inferType(PreValueExpression expression){
		return inferType(expression.value)
	}
	
}