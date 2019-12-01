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
import de.cau.cs.kieler.kexpressions.ValuedObject
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression
import org.eclipse.cdt.core.dom.ast.IASTNode.CopyStyle
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import org.eclipse.cdt.core.dom.ast.IASTFieldReference
import org.eclipse.cdt.core.dom.ast.IASTConditionalExpression
import org.eclipse.cdt.core.dom.ast.IASTCastExpression
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions

class ExpressionConverterExtensionsV3 {
    
    @Inject extension SCChartsStateExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension DataflowExtractorV25
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsSerializeHRExtensions
    @Inject extension KEffectsExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension ValueExtensions
    @Inject extension HighlightingExtensions
    
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
                source = createKExpression(sourceExpr/* as IASTBinaryExpression*/, funcState, dRegion)
            } else if(sourceExpr instanceof IASTUnaryExpression) {
                source = createKExpression(sourceExpr/* as IASTUnaryExpression*/, funcState, dRegion)
            } else if(sourceExpr instanceof IASTFunctionCallExpression) {
                
                val funcCall = sourceExpr as IASTFunctionCallExpression
                var refDecl = createReferenceDeclaration
                dRegion.declarations += refDecl
                val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName.toString//children.head.toString
                val refState = funcName.findFunctionState
                refDecl.setReference(refState)
                refDecl.annotations += createTagAnnotation("hide")
                
                val funcObj = refDecl.createValuedObject(funcName)
                funcObj.insertHighlightAnnotations(sourceExpr)
                
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
            
            var ValuedObject target
            val targetExpr = binExpr.getOperand1
            if (targetExpr instanceof IASTIdExpression) {
                target = funcState.findValuedObjectByName(targetExpr.getName.toString, true, dRegion)    
            } else if (targetExpr instanceof IASTArraySubscriptExpression) {
                target = funcState.findValuedObjectByName((targetExpr.getArrayExpression as IASTIdExpression).getName.toString, true, dRegion)
            }
            
            //println("Inside createKEffect - binExpr.getNodeLocations.length: " + binExpr.getNodeLocations.length)
            target.insertHighlightAnnotations(binExpr)
            ass = createAssignment(target, source)
        }
        res.add(ass)
        res
    }
    
    def createLazyAssignment(IASTBinaryExpression expression, State funcState, DataflowRegion dRegion, int operator) {
        
        val assExpr = expression.copy(CopyStyle.withLocations)
        assExpr.setOperator = 17
        val operatorExpr = expression.copy(CopyStyle.withLocations)
        operatorExpr.setOperator = operator
        
        assExpr.setOperand2 = operatorExpr
        
        val kEffects = createKEffect(assExpr, funcState, dRegion)
        for (kEffect : kEffects) {
            dRegion.equations += kEffect
        }
    }
        
    def createBinaryAssignment(IASTBinaryExpression expression, State funcState, DataflowRegion dRegion) {
        
        switch (expression.getOperator) {
            case 17: {
                val kEffects = createKEffect(expression, funcState, dRegion)
                for (kEffect : kEffects) {
                    dRegion.equations += kEffect
                }
            }
            case 18: {
                val arithmeticOP = 1
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case 19: {
                val arithmeticOP = 2
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case 20: {
                val arithmeticOP = 3
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case 21: {
                val arithmeticOP = 4
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case 22: {
                val arithmeticOP = 5
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case 23: {
                val arithmeticOP = 6
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case 24: {
                val arithmeticOP = 7
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case 25: {
                val arithmeticOP = 12
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case 26: {
                val arithmeticOP = 13
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case 27: {
                val arithmeticOP = 14
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            
        }
        
    }
    
    def createUnaryAssignment(IASTUnaryExpression expression, State funcState, DataflowRegion dRegion) {
        
        val sourceExpression = createKExpression(expression, funcState, dRegion)
                
        val opName = (expression.getOperand as IASTIdExpression).getName.toString
        val opVO = funcState.findValuedObjectByName(opName, true, dRegion)
                
        opVO.insertHighlightAnnotations(expression) 
                
        dRegion.equations += createAssignment(opVO, sourceExpression)
        
    }
    
    def createFuncCall(IASTFunctionCallExpression expression, State funcState, DataflowRegion dRegion, State refState, boolean knownFunction) {

        val refDecl = createReferenceDeclaration
        refDecl.setReference(refState)
        refDecl.annotations += createTagAnnotation("hide")
        dRegion.declarations += refDecl
                
        val refObj = refDecl.createValuedObject(refState.name)
        refObj.insertHighlightAnnotations(expression)
                
        var arguments = expression.getArguments
        for(var i = 0; i < arguments.length; i++) {
            val argument = arguments.get(i)
            if (argument instanceof IASTIdExpression) {
                var ValuedObject inputVO
                if (!knownFunction) {
                    val varDecl = createVariableDeclaration
                    varDecl.input = true
                    refState.declarations += varDecl
                            
                    inputVO = varDecl.createValuedObject(i.toString)
                } else {
                    inputVO = refState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.get(i)
                }
                val stateVO = funcState.findValuedObjectByName(argument.getName.toString, false, dRegion)
                dRegion.equations += createAssignment(refObj, inputVO, stateVO.reference)
            }
        }
    }
    
    def Expression createKExpression(IASTNode expr, State funcState, DataflowRegion dRegion) {
        var Expression res
        //println("Inside createKExpression for node: " + expr)
        if(expr instanceof IASTIdExpression) {
            var opValObj = funcState.findValuedObjectByName((expr as IASTIdExpression).getName.toString, false, dRegion)
            res = opValObj.reference
        } else if(expr instanceof IASTFunctionCallExpression) {
            
            
            val funcCall = expr as IASTFunctionCallExpression
            var refDecl = createReferenceDeclaration
            dRegion.declarations += refDecl
            val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName.toString//children.head.toString
            val refState = funcName.findFunctionState
            refDecl.setReference(refState)
            refDecl.annotations += createTagAnnotation("Hide")
                
            val funcObj = refDecl.createValuedObject(funcName)
            funcObj.insertHighlightAnnotations(expr)
                
            res = funcObj.reference => [
                subReference = refState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.filter [ name == "res_out" ].head.reference
            ]
                
            var i = 0
            for (argument : funcCall.getArguments) {
                val funcObjArg = refState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.get(i)
                val connectExpr = argument.createKExpression(funcState, dRegion)
                dRegion.equations += createAssignment(funcObj, funcObjArg, connectExpr)
                i++
            }
            
            
        } else if (expr instanceof IASTConditionalExpression) {
            
            val condExpr = expr.getLogicalConditionExpression
            
            val condState = createState(condExpr.exprToString)
            condState.insertHighlightAnnotations(expr)
            val condDRegion = createDataflowRegion(condState.name)
            condDRegion.label = condState.name
            condState.regions += condDRegion
            val refDecl = createReferenceDeclaration
            refDecl.setReference(condState)
            refDecl.annotations += createTagAnnotation("hide")
            dRegion.declarations += refDecl
            val condStateVO = refDecl.createValuedObject("?")
            
            setInputs(expr, funcState, condState, dRegion, condStateVO)
            
            
            val outputDecl = createVariableDeclaration
            outputDecl.output = true
            condState.declarations += outputDecl
            val outputVO = outputDecl.createValuedObject("res")
            
            condDRegion.equations += createAssignment(outputVO, expr.getPositiveResultExpression.createKExpression(condState,condDRegion))
            outputVO.insertHighlightAnnotations(expr)
            
            val condNDRegion = createDataflowRegion("Else")
            condNDRegion.label = "Else"
            condState.regions += condNDRegion
            
            condNDRegion.equations += createAssignment(outputVO, expr.getNegativeResultExpression.createKExpression(condState,condNDRegion))
            outputVO.insertHighlightAnnotations(expr)
            
            
            res = condStateVO.reference => [
                subReference = outputVO.reference
            ]
            
        } else if (expr instanceof IASTCastExpression) {
            res = expr.getOperand.createKExpression(funcState, dRegion)
        } else if(expr instanceof IASTUnaryExpression) {
           res = (expr as IASTUnaryExpression).createKExpression(funcState, dRegion) 
        } else if(expr instanceof IASTBinaryExpression) {
            res = (expr as IASTBinaryExpression).createKExpression(funcState, dRegion)
        } else if(expr instanceof IASTArraySubscriptExpression) {
            
            val arrSubExp = expr as IASTArraySubscriptExpression
            val arrayName = expr.getArrayExpression as IASTIdExpression
            val arrVO = findValuedObjectByName(funcState, arrayName.getName.toString, false, dRegion)
            val arrVOreference = arrVO.reference
            val subExp = arrSubExp.getSubscriptExpression.createKExpression(funcState, dRegion)
            arrVOreference.indices.add(subExp)
            //println("es wurde gesucht nach VO: " + arrayName)
            //println("das gefundene Objekt ist: " + arrVO)
            //println("arrVO.isArray: " + arrVO.isArray)
            //println("arrVO.reference.isArrayReference: " + arrVO.reference.isArrayReference)
            res = arrVOreference//.indices.get(0)
        
        } else if(expr instanceof IASTLiteralExpression) {
            res = expr.createValue
        } else if (expr instanceof IASTExpressionStatement) {
            res = expr.getExpression.createKExpression(funcState, dRegion)
        }
        
        res
    }
    
    def Expression createKExpression(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
//       //println("    Inside createKExpression with:\nbinExpr: " + binExpr.toString + "\nfuncState: " + funcState.getName + "\ndRegion: " + dRegion.toString)
        var opType = binExpr.getOperator().CDTBinaryOpTypeConversion
        var binKExpr = opType.createOperatorExpression
            
        for (operand : binExpr.children) {
                
            binKExpr.subExpressions += operand.createKExpression(funcState, dRegion)
                
        }
        binKExpr
    }
    
    def Expression createKExpression(IASTUnaryExpression unExpr, State funcState, DataflowRegion dRegion) {
        var Expression res
        var opType = unExpr.getOperator.CDTUnaryOpTypeConversion
        var OperatorExpression unKExpr
        
        if(opType !== null) {
            unKExpr = opType.createOperatorExpression
            
            var operand = unExpr.getOperand
            unKExpr.subExpressions += operand.createKExpression(funcState, dRegion)
            res = unKExpr
        } else {
            var operand = unExpr.getOperand
            if(operand instanceof IASTBinaryExpression) {
                res = (operand as IASTBinaryExpression).createKExpression(funcState, dRegion)
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
        } else if (expr instanceof IASTFieldReference) {
            
            val structExpr = expr.getFieldOwner
            val structName = structExpr.exprToString
            val fieldName = expr.getFieldName
            res = structName + "->" + fieldName
            
        } else if (expr instanceof IASTArraySubscriptExpression) {
            
            val arrayExpr = expr.getArrayExpression
            val arrayName = arrayExpr.exprToString
            val arrayArgExpr = expr.getArgument
            val arrayArgName = arrayArgExpr.exprToString
            
            res = arrayName + "[" + arrayArgName + "]"
            
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