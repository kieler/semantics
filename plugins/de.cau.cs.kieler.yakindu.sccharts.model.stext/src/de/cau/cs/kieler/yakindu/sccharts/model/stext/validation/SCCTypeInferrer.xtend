package de.cau.cs.kieler.yakindu.sccharts.model.stext.validation

import org.yakindu.sct.model.stext.validation.TypeInferrer
import org.yakindu.sct.model.stext.stext.FeatureCall
import org.yakindu.base.types.Event
import org.yakindu.sct.model.stext.stext.EventRaisingExpression
import org.yakindu.sct.model.stext.stext.EventValueReferenceExpression
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.PreValueExpression
import org.yakindu.base.types.Feature
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression

/**
 * 
 * The TypeInferrer checks an expression AST for type conformance
 * 
 * @author andreas muelder - Initial contribution and API
 *  
 */
class SCCTypeInferrer extends TypeInferrer implements ISCCTypeInferrer {
	
	override dispatch inferType(FeatureCall featureCall){
		if(featureCall.feature instanceof Event /*ntDefinition*/ 
			&& !(featureCall.eContainer instanceof EventRaisingExpression) 
			&&!(featureCall.eContainer instanceof EventValueReferenceExpression)
			&&!(featureCall.eContainer instanceof PreValueExpression)
		){
			return ts.boolean
		}
		if (featureCall.feature instanceof Feature) {
			return (featureCall.feature as Feature)?.type
		} else if (featureCall.feature !=null) {
			error("Type of FeatureCall is unknown: "+featureCall)			
			return null;
		} else {
			return null;
		}
	}
	
	override dispatch inferType(Event /*Definition*/ definition,ElementReferenceExpression expression) {
		if(expression.eContainer instanceof EventRaisingExpression
				|| expression.eContainer instanceof EventValueReferenceExpression
				|| expression.eContainer instanceof PreValueExpression)
			return definition.type
		return ts.^boolean
	}

	def dispatch inferType(PreValueExpression expression){
		return getType(expression.value)
	}

}