/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.types

import com.google.inject.Inject
import org.yakindu.base.types.Event
import org.yakindu.base.types.Feature
import org.yakindu.base.types.ITypeSystem$InferenceResult
import org.yakindu.base.types.ITypeSystem$InferredType
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import org.yakindu.sct.model.stext.stext.EventRaisingExpression
import org.yakindu.sct.model.stext.stext.EventValueReferenceExpression
import org.yakindu.sct.model.stext.stext.FeatureCall
import org.yakindu.sct.model.stext.types.ISTextTypeSystem
import org.yakindu.sct.model.stext.types.STextDefaultTypeInferrer
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.PreReferenceExpression
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ValReferenceExpression
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition
//import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.PreValueExpression
//import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition

/**
 * 
 * The SCCTypeInferrer extends the STextDefaultTypeInferrer 
 * to add supplement checks for type conformance (e.g. check the type of pre(int) which is an integer).
 * 
 * The StextDefaultTypeInferrer checks that:
 * 		- EventDefinition may not be null, 
 * 		- Cannot assign a value of type int to a variable of type boolean,
 * 		- ...
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 
 *  
 */
class SyncTypeInferrer extends STextDefaultTypeInferrer{
	@Inject protected extension
	ISTextTypeSystem typesystem
	
	/**
	 * This method is overridden to allow the check of PreValueExpression 
	 * which was implemented by the Synctext
	 * (allow the check of the type conformance of e.g. pre(S)==S). 
	 * 
	 */
	override dispatch doInferType(FeatureCall featureCall){
		if(featureCall.feature instanceof Event /*ntDefinition*/ 
			&& !(featureCall.eContainer instanceof EventRaisingExpression) 
			&&!(featureCall.eContainer instanceof EventValueReferenceExpression)
			&&!(featureCall.eContainer instanceof PreReferenceExpression)
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
	
	/**
	 * This method is override to allow the check of PreValueExpression 
	 * which was implemented by the Synctext.
	 * It returns the type of the operand by the following operations (raise, Valueof(), Pre()).
	 * 
	 */
	override dispatch InferenceResult doInferType(ElementReferenceExpression expression){
		if(expression.reference instanceof EventDefinition 
			&& !(expression.eContainer instanceof EventRaisingExpression
				|| expression.eContainer instanceof EventValueReferenceExpression
				|| expression.eContainer instanceof PreReferenceExpression
				)){
			return new InferenceResult(getBooleanType)
		}
		else {
			return expression.reference.doInferType
		}
	}

	/**
 	 * Pre(int) operator should have the type of int.
 	 */
	def dispatch InferenceResult doInferType(PreReferenceExpression expression){
		return inferType(expression.expression);
	}
	
}