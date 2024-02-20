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

import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.VectorValue
import java.util.List

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
		expression1.isValue && expression2.isValue && expression1.eClass.equals(expression2.eClass)
	}

	def boolean isSameValue(Expression expression1, Expression expression2) {
		if (!expression1.isSameValueType(expression2)) return false;
		if (expression1 instanceof IntValue) return expression1.value == expression2.asIntValue.value
		if (expression1 instanceof BoolValue) return expression1.value == expression2.asBoolValue.value
		if (expression1 instanceof StringValue) return expression1.value == expression2.asStringValue.value
		//if (expression1 instanceof DoubleValue) return expression1.value == expression2.asDoubleValue.value
		if (expression1 instanceof FloatValue) return expression1.value == expression2.asFloatValue.value
		if (expression1 instanceof VectorValue) {
		    for (subValue : expression1.values.indexed) {
		        val companion = expression2.asVectorValue.values.get(subValue.key)
		        if (!subValue.value.isSameValue(companion)) return false
		    }
		    return true
		}
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

	def FloatValue asFloatValue(Expression expression) {
		expression as FloatValue
	}
	
	def VectorValue asVectorValue(Expression expression) {
	    expression as VectorValue
	}
	
	def getIntValue(Expression expression) {
	    expression.asIntValue.value 
	}
	
    def List<Value> getAllValues(Expression expression) {
        <Value> newArrayList => [
            if (expression === null) {
            } else if (expression instanceof Value) { 
                it += expression
            } else { 
                it += expression.eAllContents.filter(Value).toList
            }
        ]  
    }  	
    
    def boolean isGenericTrue(Expression expression) {
        switch(expression) {
            IntValue: { if (expression.value === 1) return true; }
            BoolValue: { return expression.value; }
        }
        return false
    }
}