package de.cau.cs.kieler.c.sccharts.extensions

import java.util.ArrayList
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.c.sccharts.processors.DataflowExtractorV25
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.OperatorExpression
import org.eclipse.cdt.core.dom.ast.IASTExpression
import org.eclipse.cdt.core.dom.ast.IASTNode
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeExtensions
import de.cau.cs.kieler.c.sccharts.processors.DataflowExtractorV2
import de.cau.cs.kieler.sccharts.DataflowRegion
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression

class ExpressionConverterExtensionsV4 {
    
    @Inject extension DataflowExtractorV25
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsSerializeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension ValueExtensions
    
    def ArrayList<Assignment> createKEffect(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
        val operator = binExpr.getOperator
        var res = new ArrayList<Assignment>
        var Assignment ass = null
        if(operator == 17) {
            var sourceExpr = binExpr.children.get(1)
            var Expression source = null
            if(sourceExpr instanceof IASTIdExpression) {
                source = funcState.findValuedObjectByName((sourceExpr as IASTIdExpression).getName.toString, false, dRegion).reference
            } else if(sourceExpr instanceof IASTBinaryExpression) {
                source = createKExpression(sourceExpr/* as IASTBinaryExpression*/, funcState, dRegion).head
            } else if(sourceExpr instanceof IASTUnaryExpression) {
                source = createKExpression(sourceExpr/* as IASTUnaryExpression*/, funcState, dRegion).head
            } else if(sourceExpr instanceof IASTFunctionCallExpression) {
                
                val funcCall = sourceExpr as IASTFunctionCallExpression
                var refDecl = createReferenceDeclaration
                funcState.declarations += refDecl
                val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName.toString//children.head.toString
                val refState = funcName.findFunctionState
                refDecl.setReference(refState)
                
                val funcObj = refDecl.createValuedObject(funcName)
                
                source = funcObj.reference => [
                    subReference = refState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.filter [ name == "res_out" ].head.reference
                ]
                
                var i = 0
                for (argument : funcCall.getArguments) {
                    val funcObjArg = refState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.get(i)
                    val connectObj = funcState.findValuedObjectByName(argument.children.head.toString, false, dRegion)
                    ass = createAssignment(funcObj, funcObjArg, connectObj.reference)
                    res.add(ass)
                    i++
                }
            } else if(sourceExpr instanceof IASTLiteralExpression){
                
                source = createValue(sourceExpr)
            }
            
            val target = funcState.findValuedObjectByName(binExpr.children.head.children.head.toString, true, dRegion)
            ass = createAssignment(target, source)
        }
        res.add(ass)
        res
    }
    
    def Expression createKExpression(IASTNode expr, State funcState, DataflowRegion dRegion) {
        var Expression res
        if(expr instanceof IASTIdExpression) {
            var opValObj = funcState.findValuedObjectByName((expr as IASTIdExpression).getName.toString, false, dRegion)
            res = opValObj.reference
        } else if(expr instanceof IASTFunctionCallExpression) {
            
            
            val funcCall = expr as IASTFunctionCallExpression
            var refDecl = createReferenceDeclaration
            funcState.declarations += refDecl
            val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName.toString//children.head.toString
            val refState = funcName.findFunctionState
            refDecl.setReference(refState)
                
            val funcObj = refDecl.createValuedObject(funcName)
                
            res = funcObj.reference => [
                subReference = refState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.filter [ name == "res_out" ].head.reference
            ]
                
            var i = 0
            for (argument : funcCall.getArguments) {
                val funcObjArg = refState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.get(i)
                val connectObj = funcState.findValuedObjectByName(argument.children.head.toString, false, dRegion)
                dRegion.equations += createAssignment(funcObj, funcObjArg, connectObj.reference)
                i++
            }
            
            
        } else if(expr instanceof IASTUnaryExpression) {
           res = (expr as IASTUnaryExpression).createKExpression(funcState, dRegion).head 
        } else if(expr instanceof IASTBinaryExpression) {
            res = (expr as IASTBinaryExpression).createKExpression(funcState, dRegion).head
        } else if(expr instanceof IASTArraySubscriptExpression) {
            val arrSubExp = expr as IASTArraySubscriptExpression
            val subExp = arrSubExp.getSubscriptExpression
            res = subExp.createKExpression(funcState, dRegion)
        } else if(expr instanceof IASTLiteralExpression) {
            res = expr.createValue
        }
        
        
        res
    }
    
    def ArrayList<Expression> createKExpression(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
       println("    Inside createKExpression with:\nbinExpr: " + binExpr.toString + "\nfuncState: " + funcState.getName + "\ndRegion: " + dRegion.toString)
       var opType = binExpr.getOperator().CDTBinaryOpTypeConversion
       var binKExpr = opType.createOperatorExpression
            
            for (operand : binExpr.children) {
                
                binKExpr.subExpressions += operand.createKExpression(funcState, dRegion)
                
            }
            var res = new ArrayList<Expression>
            res.add(binKExpr)
            res
    }
    
    def ArrayList<Expression> createKExpression(IASTUnaryExpression unExpr, State funcState, DataflowRegion dRegion) {
        var res = new ArrayList<Expression>
        var opType = unExpr.getOperator.CDTUnaryOpTypeConversion
        var OperatorExpression unKExpr
        if(opType !== null) {
            unKExpr = opType.createOperatorExpression
            
            var operand = unExpr.getOperand
            unKExpr.subExpressions += operand.createKExpression(funcState, dRegion)
            
            res.add(unKExpr)
        } else {
            var operand = unExpr.getOperand
            if(operand instanceof IASTBinaryExpression) {
                res = (operand as IASTBinaryExpression).createKExpression(funcState, dRegion)
            }
        }
        res
        
    }    
    
}