/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.extensions

import com.google.inject.Inject
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.RegularEventSpec

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import org.yakindu.sct.model.stext.stext.AssignmentOperator
import de.cau.cs.kieler.scl.scl.VariableDefinition
import org.yakindu.sct.model.stext.stext.LogicalNotExpression

/**
 * Extensions for the SText / SyncText expression language used in SCL.
 * 
 * @author: ssm
 */

class SCLExpressionExtensions {
   
    @Inject
    extension SCLFactoryExtensions

    // Copies a regular event spec to a standard expression for further use.    
    def Expression toExpression(RegularEventSpec spec) {
      val elref = SText.createElementReferenceExpression()
      elref.setReference((spec.event.copy as ElementReferenceExpression).reference)
      elref
    }
    
    // Negates the given expression.
    // If the expression is already an negation, the negation is removed.
    // Otherwise a new negation is added and parenthesized if necessary.
    def Expression negate(Expression exp) {
        if (exp instanceof LogicalNotExpression) {
            return (exp as LogicalNotExpression).operand.copy
        }
        
        var not = SText.createLogicalNotExpression()
        
        if (exp instanceof ElementReferenceExpression) {
            not.setOperand(exp)
            return not
        }
        
        var par = SText.createParenthesizedExpression()
        par.setExpression(exp)
        not.setOperand(par)
        not
    }
    

    // Create parenthesizes around a given expression.
    def Expression createParanthesizedExpression(Expression exp) {
        val newExp = SText.createParenthesizedExpression
        newExp.setExpression(exp)
        newExp
    }

    // Create an element reference expression for a given variable definition.
    def Expression createElementReferenceExpression(VariableDefinition varDec) {
        val exp = SText.createElementReferenceExpression 
        exp.setReference(varDec)
        exp
    }

    // If op1 is already an expression, op1 and op2 are combined via an or expression.
    // Otherwise op2 is returned.
    def Expression addOrExpression(Expression op1, Expression op2) {
        if (op1 == null) {
            return op2
        } else {
            return createOrExpression(op1, op2)
        }
    }
    
    // Equivalent as or for and expressions.
    def Expression addAndExpression(Expression op1, Expression op2) {
        if (op1 == null) {
            return op2
        } else {
            return createAndExpression(op1, op2)
        }
    }
    
    // Adds parenthesis around a given expression.
    def Expression addParanthesizedExpression(Expression exp) {
        val pe = SText.createParenthesizedExpression
        pe.setExpression(exp)
        pe
    }

    // Creates an or expression.
    def Expression createOrExpression(Expression op1, Expression op2) {
        val or = SText.createLogicalOrExpression()
        or.setLeftOperand(op1)
        or.setRightOperand(op2)
        or
    } 

    // Creates an and expression.
    def Expression createAndExpression(Expression op1, Expression op2) {
        val and = SText.createLogicalAndExpression()
        and.setLeftOperand(op1)
        and.setRightOperand(op2)
        and
    } 
    
    // Create an assignment expression.
    // The expression (on the right hand side) is assigned to the var ref.
    def Expression createAssignmentExpression(ElementReferenceExpression varRef, Expression expression) {
        val assignment = SText.createAssignmentExpression()
        assignment.setVarRef(varRef)
        assignment.setOperator(AssignmentOperator::ASSIGN)
        assignment.setExpression(expression);
        assignment
    }
    
    // Returns a primitive boolean (true or false) expression.
    def Expression assignBoolean(boolean bool) {
        val primitiveValueExpression = SText.createPrimitiveValueExpression()
        val literal = SText.createBoolLiteral()
        literal.setValue(bool)
        primitiveValueExpression.setValue(literal)        
        primitiveValueExpression
    }

    // Because expression serialization, serializes ALL text until the preceding ";",
    // one needs to filter this maybe wrongly serialized text away. 
    def String correctSerialization(String text) {
        val i1 = text.lastIndexOf("\r")
        val i2 = text.lastIndexOf("\n")
        val i3 = text.lastIndexOf("\t")
        val i4 = text.lastIndexOf("*/")+1
        
        if (i3 > 0) {
            var text2 = text.substring(i3 + 1);
            return text2.replace("\r", "").replace("\n", "");
        }
        
        if ((i1 > 0) || (i2 > 0) || (i3 > 0) || (i4 > 1)) {
            var i = i4;
            if ((i1 > i2) && (i1 > i3)  && (i1 > i4)) {
                i = i1;
            }
            else if ((i2 > i1) && (i2 > i3)  && (i2 > i4)) {
                i = i2;
            }
            else if ((i3 > i1) && (i3 > i2)  && (i3 > i4)) {
                i = i3;
            }
            return text.substring(i+1);
        }
        text;
    }  
    
}