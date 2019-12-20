package de.cau.cs.kieler.c.sccharts.extensions

import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.cdt.core.dom.ast.IBasicType
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression

/**
 * @author lan
 */

class ValueExtensions {
    
    @Inject extension KExpressionsCreateExtensions
    
    // Creates Value KExpression for a CDT literal node
    def Expression createValue(IASTLiteralExpression value) {
        var Expression valExpr
        val iastType = value.getExpressionType
        if(iastType instanceof IBasicType) {
                
            val iastBasicKind = iastType.getKind
            switch(iastBasicKind) {
                case IBasicType.Kind.eInt:
                    valExpr = createIntValue(Integer.parseInt(value.toString))
                case IBasicType.Kind.eDouble:
                    valExpr = createFloatValue(Double.parseDouble(value.toString))
                case IBasicType.Kind.eFloat:
                    valExpr = createFloatValue(Float.parseFloat(value.toString))
                default:
                    println("ValueExtensions: Type of literal node not defined!") 
            }
        } else {
            println("ValueExtensions: Type of literal node not a basic type!")
        }    
        
        return valExpr
    }
    
}