package de.cau.cs.kieler.c.sccharts.extensions

import java.util.ArrayList
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.c.sccharts.processors.DataflowExtractorV2
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionCallExpression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTUnaryExpression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import org.eclipse.cdt.core.dom.ast.IASTExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTArraySubscriptExpression
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.internal.core.dom.parser.c.CASTLiteralExpression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeExtensions
import de.cau.cs.kieler.c.sccharts.processors.DataflowExtractorV2

class ExpressionConverterExtensionsV2 {
    
    @Inject extension DataflowExtractorV2
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsSerializeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension ValueExtensions
    
    def ArrayList<Assignment> createKEffect(CASTBinaryExpression binExpr, State funcState) {
        val operator = binExpr.getOperator
        var res = new ArrayList<Assignment>
        var Assignment ass = null
        if(operator == 17) {
            val target = funcState.findValuedObjectByName(binExpr.children.head.children.head.toString)
            var sourceExpr = binExpr.children.get(1)
            var Expression source = null
            if(sourceExpr instanceof CASTIdExpression) {
                source = funcState.findValuedObjectByName((sourceExpr as CASTIdExpression).getName.toString).reference
            } else if(sourceExpr instanceof CASTBinaryExpression) {
                source = createKExpression(sourceExpr/* as CASTBinaryExpression*/, funcState).head
            } else if(sourceExpr instanceof CASTUnaryExpression) {
                source = createKExpression(sourceExpr/* as CASTUnaryExpression*/, funcState).head
            } else if(sourceExpr instanceof CASTFunctionCallExpression) {
                
                val funcCall = sourceExpr as CASTFunctionCallExpression
                var refDecl = createReferenceDeclaration
                funcState.declarations += refDecl
                val funcName = (funcCall.getFunctionNameExpression as CASTIdExpression).getName.toString//children.head.toString
                val refState = funcName.findFunctionState
                refDecl.setReference(refState)
                
                val funcObj = refDecl.createValuedObject(funcName)
                
                source = funcObj.reference => [
                    subReference = refState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.filter [ name == "res" ].head.reference
                ]
                
                var i = 0
                for (argument : funcCall.getArguments) {
                    val funcObjArg = refState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.get(i)
                    val connectObj = funcState.findValuedObjectByName(argument.children.head.toString)
                    ass = createAssignment(funcObj, funcObjArg, connectObj.reference)
                    res.add(ass)
                    i++
                }
            } else if(sourceExpr instanceof CASTLiteralExpression){
                
                source = createValue(sourceExpr)
            }
            
            ass = createAssignment(target, source)
        }
        res.add(ass)
        res
    }
    
    def Expression createKExpression(IASTNode expr, State funcState) {
        var Expression res
        if(expr instanceof CASTIdExpression) {
            var opValObj = funcState.findValuedObjectByName((expr as CASTIdExpression).getName.toString)
            res = opValObj.reference
        } else if(expr instanceof CASTUnaryExpression) {
           res = (expr as CASTUnaryExpression).createKExpression(funcState).head 
        } else if(expr instanceof CASTBinaryExpression) {
            res = (expr as CASTBinaryExpression).createKExpression(funcState).head
        } else if(expr instanceof CASTArraySubscriptExpression) {
            val arrSubExp = expr as CASTArraySubscriptExpression
            val subExp = arrSubExp.getSubscriptExpression
            res = subExp.createKExpression(funcState)
        } else if(expr instanceof CASTLiteralExpression) {
            res = expr.createValue
        }
        
        
        res
    }
    
    def ArrayList<Expression> createKExpression(CASTBinaryExpression binExpr, State funcState) {
       var opType = binExpr.getOperator().CDTBinaryOpTypeConversion
       var binKExpr = opType.createOperatorExpression
            
            for (operand : binExpr.children) {
                
                binKExpr.subExpressions += operand.createKExpression(funcState)
                
            }
            var res = new ArrayList<Expression>
            res.add(binKExpr)
            res
    }
    
    def ArrayList<Expression> createKExpression(CASTUnaryExpression unExpr, State funcState) {
        var res = new ArrayList<Expression>
        var opType = unExpr.getOperator.CDTUnaryOpTypeConversion
        var OperatorExpression unKExpr
        if(opType !== null) {
            unKExpr = opType.createOperatorExpression
            
            var operand = unExpr.getOperand
            unKExpr.subExpressions += operand.createKExpression(funcState)
            
            res.add(unKExpr)
        } else {
            var operand = unExpr.getOperand
            if(operand instanceof CASTBinaryExpression) {
                res = (operand as CASTBinaryExpression).createKExpression(funcState)
            }
        }
        res
        
    }    
    
}