package de.cau.cs.kieler.c.sccharts.extensions

import java.util.ArrayList
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.c.sccharts.processors.DataflowExtractorV25
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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeHRExtensions
import de.cau.cs.kieler.c.sccharts.processors.DataflowExtractorV2
import de.cau.cs.kieler.sccharts.DataflowRegion
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement
import de.cau.cs.kieler.kexpressions.OperatorType
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions

class ExpressionConverterExtensionsV3 {
    
    @Inject extension AnnotationsExtensions
    @Inject extension DataflowExtractorV25
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsSerializeHRExtensions
    @Inject extension KEffectsExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension ValueExtensions
    
    def ArrayList<Assignment> createKEffect(CASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
        val operator = binExpr.getOperator
        var res = new ArrayList<Assignment>
        var Assignment ass = null
        if(operator == 17) {
            var sourceExpr = binExpr.children.get(1)
            var Expression source = null
            if(sourceExpr instanceof CASTIdExpression) {
                source = funcState.findValuedObjectByName((sourceExpr as CASTIdExpression).getName.toString, false, dRegion).reference
            } else if(sourceExpr instanceof CASTBinaryExpression) {
                source = createKExpression(sourceExpr/* as CASTBinaryExpression*/, funcState, dRegion).head
            } else if(sourceExpr instanceof CASTUnaryExpression) {
                source = createKExpression(sourceExpr/* as CASTUnaryExpression*/, funcState, dRegion).head
            } else if(sourceExpr instanceof CASTFunctionCallExpression) {
                
                val funcCall = sourceExpr as CASTFunctionCallExpression
                var refDecl = createReferenceDeclaration
                dRegion.declarations += refDecl
                val funcName = (funcCall.getFunctionNameExpression as CASTIdExpression).getName.toString//children.head.toString
                val refState = funcName.findFunctionState
                refDecl.setReference(refState)
                refDecl.annotations += createTagAnnotation("hide")
                
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
            } else if(sourceExpr instanceof CASTLiteralExpression){
                
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
        println("Inside createKExpression for node: " + expr)
        if(expr instanceof CASTIdExpression) {
            var opValObj = funcState.findValuedObjectByName((expr as CASTIdExpression).getName.toString, false, dRegion)
            res = opValObj.reference
        } else if(expr instanceof CASTFunctionCallExpression) {
            
            
            val funcCall = expr as CASTFunctionCallExpression
            var refDecl = createReferenceDeclaration
            dRegion.declarations += refDecl
            val funcName = (funcCall.getFunctionNameExpression as CASTIdExpression).getName.toString//children.head.toString
            val refState = funcName.findFunctionState
            refDecl.setReference(refState)
            refDecl.annotations += createTagAnnotation("Hide")
                
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
            
            
        } else if(expr instanceof CASTUnaryExpression) {
           res = (expr as CASTUnaryExpression).createKExpression(funcState, dRegion).head 
        } else if(expr instanceof CASTBinaryExpression) {
            res = (expr as CASTBinaryExpression).createKExpression(funcState, dRegion).head
        } else if(expr instanceof CASTArraySubscriptExpression) {
            
            val arrSubExp = expr as CASTArraySubscriptExpression
            val arrayName = expr.getArrayExpression as IASTIdExpression
            val arrVO = findValuedObjectByName(funcState, arrayName.getName.toString, false, dRegion)
            val subExp = arrSubExp.getSubscriptExpression
            println("es wurde gesucht nach VO: " + arrayName)
            println("das gefundene Objekt ist: " + arrVO)
            println("arrVO.isArray: " + arrVO.isArray)
            println("arrVO.reference.isArrayReference: " + arrVO.reference.isArrayReference)
            res = arrVO.reference//.indices.get(0)
        
        } else if(expr instanceof CASTLiteralExpression) {
            res = expr.createValue
        } else if (expr instanceof IASTExpressionStatement) {
            res = expr.getExpression.createKExpression(funcState, dRegion)
        }
        
        
        res
    }
    
    def ArrayList<Expression> createKExpression(CASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
//       println("    Inside createKExpression with:\nbinExpr: " + binExpr.toString + "\nfuncState: " + funcState.getName + "\ndRegion: " + dRegion.toString)
       var opType = binExpr.getOperator().CDTBinaryOpTypeConversion
       var binKExpr = opType.createOperatorExpression
            
            for (operand : binExpr.children) {
                
                binKExpr.subExpressions += operand.createKExpression(funcState, dRegion)
                
            }
            var res = new ArrayList<Expression>
            res.add(binKExpr)
            res
    }
    
    def ArrayList<Expression> createKExpression(CASTUnaryExpression unExpr, State funcState, DataflowRegion dRegion) {
        println("Inside createKExpression for UnaryExpressions")
        var res = new ArrayList<Expression>
        var opType = unExpr.getOperator.CDTUnaryOpTypeConversion
        println("opType: " + opType)
        var OperatorExpression unKExpr
        
        if(opType !== null) {
            unKExpr = opType.createOperatorExpression
            
            var operand = unExpr.getOperand
            unKExpr.subExpressions += operand.createKExpression(funcState, dRegion)
            
            res.add(unKExpr)
        } else {
            var operand = unExpr.getOperand
            if(operand instanceof CASTBinaryExpression) {
                res = (operand as CASTBinaryExpression).createKExpression(funcState, dRegion)
            }
        }
        res
        
    }
    
    def String exprToString(IASTNode expr) {
        var res = ""
        
        if (expr instanceof IASTFunctionCallExpression) {
            val funcName = (expr.getFunctionNameExpression as IASTIdExpression).getName.toString
            res = funcName + "("
            
            val arguments = expr.getArguments
            for (var i = 0; i < arguments.length; i++) {
                val argument = arguments.get(i)
                
                res += argument.exprToString
                
                if (i < arguments.length - 1) {
                    res += ", "
                } else res += ")"
            }
            
            
        } else if (expr instanceof IASTBinaryExpression) {
            val operator = expr.getOperator.CDTBinaryOpTypeToString
            val operand1 = expr.getOperand1.exprToString
            val operand2 = expr.getOperand2.exprToString
            
            res = "(" + operand1 + " " + operator + " " + operand2 + ")" 
        } else if (expr instanceof IASTUnaryExpression) {
            var postOperator = expr.getOperator.CDTUnaryOpTypeToString
            var preOperator = ""
            
            if (postOperator.contains("exp")) {
                preOperator = postOperator.substring(0, postOperator.indexOf("exp"))
                postOperator = ""
            }
            
            val operand = expr.getOperand.exprToString
            
            res = "(" + preOperator + operand + postOperator + ")"
        } else if (expr instanceof IASTIdExpression) {
            res = expr.getName.toString            
        } else if (expr instanceof IASTLiteralExpression) {
            res = expr.toString
        } else if (expr instanceof IASTExpressionStatement) {
            res = expr.getExpression.exprToString
        }
        
        res
    }    
    
}