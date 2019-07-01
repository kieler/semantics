package de.cau.cs.kieler.c.sccharts.extensions

import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import org.eclipse.cdt.core.dom.ast.IASTNode
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTLiteralExpression
import org.eclipse.cdt.core.dom.ast.IBasicType

class ValueExtensions {
    
    @Inject extension KExpressionsCreateExtensions
    
    def Expression createValue(IASTNode value) {
        var Expression res
        println("")
        println("inside createvalue mit node: " + value.toString)
        println("")
        if(value instanceof CASTLiteralExpression) {
            val iastType = (value as CASTLiteralExpression).getExpressionType
            println("    IType vom Literal: " + iastType)
            if(iastType instanceof IBasicType) {
                
                println("        iastType ist IBasicType")
                val iastBasicKind = (iastType as IBasicType). getKind
                println("        BasicKind vom Literal: " + iastBasicKind)
                switch(iastBasicKind) {
                    case IBasicType.Kind.eInt:
                        res = createIntValue(Integer.parseInt(value.toString))
                    case IBasicType.Kind.eDouble:
                        res = createFloatValue(Double.parseDouble(value.toString))
                    case IBasicType.Kind.eFloat:
                        res = createFloatValue(Float.parseFloat(value.toString))
                    default:
                        println("        keinen passenden IBasicType definiert") 
                }
            } else {
                println("    iastType ist NICHT IBasicType")
            }  
        } else {
            println("    IASTNode ist nicht CASTLiteralExpression")
        }     
        
        return res
    }
    
}