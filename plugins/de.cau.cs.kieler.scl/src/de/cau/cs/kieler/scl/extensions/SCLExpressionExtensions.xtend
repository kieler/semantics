package de.cau.cs.kieler.scl.extensions

import com.google.inject.Inject
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.RegularEventSpec

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression

class SCLExpressionExtensions {
   
    @Inject
    extension SCLFactoryExtensions
   
    // ======================================================================================================
    // ==                  E X P R E S S I O N    M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================

     def Expression toExpression(RegularEventSpec spec) {
//      val rel = SText.createLogicalRelationExpression()
      val elref = SText.createElementReferenceExpression()
//      val primval = SText.createPrimitiveValueExpression()
//      val bval = SText.createBoolLiteral()
      
      elref.setReference((spec.event.copy as ElementReferenceExpression).reference)
//      bval.setValue(true)
//      primval.setValue(bval)
      
//      rel.setLeftOperand(elref) 
//      rel.setOperator(RelationalOperator::EQUALS)
//      rel.setRightOperand(primval)
        
      elref
    }
    
//    def dispatch Expression toExpression(Expression exp) {
//        exp
//    }

    def Expression negate(Expression exp) {
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
    
//    def dispatch Expression negate(RegularEventSpec spec) {
//        val not = SText.createLogicalNotExpression()
//        val par = SText.createParenthesizedExpression()
//        par.setExpression(spec.toExpression)   
//        not.setOperand(par);
//        not  
//    }    

    // Because expression serialization, serializes ALL text until the preceding ";",
    // one needs to filter this maybe wrongly serialized text away. 
    def String correctSerialization(String text) {
        val i1 = text.lastIndexOf("\r");
        val i2 = text.lastIndexOf("\n");
        val i3 = text.lastIndexOf("\t");
        val i4 = text.lastIndexOf("*/")+1;
        
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