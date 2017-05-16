/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kexpressions.extensions

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.DoubleValue
import de.cau.cs.kieler.kexpressions.FloatValue

/**
 * @author ssm
 * @kieler.design 2016-04-06 proposed 
 * @kieler.rating 2016-04-06 proposed yellow
 */

class KExpressionsValueExtensions {
	
	def boolean isValue(Expression expression) {
		expression instanceof Value
	}
	
	def boolean isSameValueType(Expression expression1, Expression expression2) {
		expression1.isValue && expression2.isValue && (
			expression1 instanceof IntValue == expression2 instanceof IntValue ||
			expression1 instanceof StringValue == expression2 instanceof StringValue ||
			expression1 instanceof BoolValue == expression2 instanceof BoolValue ||
			expression1 instanceof DoubleValue == expression2 instanceof DoubleValue ||
			expression1 instanceof FloatValue == expression2 instanceof FloatValue
		)	
	}

	def boolean isSameValue(Expression expression1, Expression expression2) {
		if (!expression1.isSameValueType(expression2)) return false;
		if (expression1 instanceof IntValue) return expression1.value == expression2.asIntValue.value
		if (expression1 instanceof BoolValue) return expression1.value == expression2.asBoolValue.value
		if (expression1 instanceof StringValue) return expression1.value == expression2.asStringValue.value
		if (expression1 instanceof DoubleValue) return expression1.value == expression2.asDoubleValue.value
		if (expression1 instanceof FloatValue) return expression1.value == expression2.asFloatValue.value
		return false;
	}
	
	def IntValue asIntValue(Expression expression) {
		expression as IntValue
	}
	
	def BoolValue asBoolValue(Expression expression) {
		expression as BoolValue
	}
	
	def StringValue asStringValue(Expression expression) {
		expression as StringValue
	}
	
	def DoubleValue asDoubleValue(Expression expression) {
		expression as DoubleValue
	}

	def FloatValue asFloatValue(Expression expression) {
		expression as FloatValue
	}
	
	def getIntValue(Expression expression) {
	    expression.asIntValue.value 
	}
}