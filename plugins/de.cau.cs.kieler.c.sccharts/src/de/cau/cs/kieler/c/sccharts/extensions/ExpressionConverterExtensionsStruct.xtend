package de.cau.cs.kieler.c.sccharts.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.c.sccharts.processors.StructflowExtractor
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import java.util.ArrayList
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTCastExpression
import org.eclipse.cdt.core.dom.ast.IASTConditionalExpression
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement
import org.eclipse.cdt.core.dom.ast.IASTFieldReference
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTNode.CopyStyle
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression

import static de.cau.cs.kieler.c.sccharts.processors.CDTToStringConverter.*

class ExpressionConverterExtensionsStruct {
    
    @Inject extension SCChartsStateExtensions
    @Inject extension AnnotationsExtensions
    // XXX: This is dependant of the structflow extractor and therefore not a valid generic extension class.
    @Inject extension StructflowExtractor
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension ValueExtensions
    @Inject extension HighlightingExtensions
    
    // Create a list of assignments for the given binary expression
    def ArrayList<Assignment> createKEffect(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
        val operator = binExpr.getOperator
        var res = new ArrayList<Assignment>
        var Assignment ass = null
        // Only if the binary expression is an assignment some work is needed
        if(operator == IASTBinaryExpression.op_assign) {
            var sourceExpr = binExpr.children.get(1)
            var Expression source = null
            // If source expression is a variable read retrieve the respective VO
            if(sourceExpr instanceof IASTIdExpression) {
                source = funcState.findValuedObjectByName((sourceExpr as IASTIdExpression).getName.toString, false, dRegion).reference
            // Translate the expression that is meant to be assigned
            } else if(sourceExpr instanceof IASTBinaryExpression) {
                source = createKExpression(sourceExpr, funcState, dRegion)
            } else if(sourceExpr instanceof IASTUnaryExpression) {
                source = createKExpression(sourceExpr, funcState, dRegion)
            // Translate a function call that will be assigned
            } else if(sourceExpr instanceof IASTFunctionCallExpression) {
                // Create the function reference
                val funcCall = sourceExpr as IASTFunctionCallExpression
                var refDecl = createReferenceDeclaration
                dRegion.declarations += refDecl
                val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName.toString
                var refState = funcName.findFunctionState
                if (refState === null) {
                    refState = createUnknownFuncState(funcName, funcCall, true)
                }
                val refStateConst = refState
                refDecl.setReference(refState)
                refDecl.annotations += createTagAnnotation("hide")
                // Create Func Object
                val funcObj = refDecl.createValuedObject(funcName)
                funcObj.insertHighlightAnnotations(sourceExpr)
                // Retrieve Func output
                source = funcObj.reference => [
                    subReference = refStateConst.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.filter [ name == "res_out" ].head.reference
                ]
                // Link func inputs (add assignments to result)
                var i = 0
                for (argument : funcCall.getArguments) {
                    val funcObjArg = refStateConst.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.get(i)
                    val connectObj = funcState.findValuedObjectByName(argument.children.head.toString, false, dRegion)
                    ass = createAssignment(funcObj, funcObjArg, connectObj.reference)
                    res.add(ass)
                    i++
                }
            // Create a value expression for a literal    
            } else if(sourceExpr instanceof IASTLiteralExpression){
                
                source = createValue(sourceExpr)
            }
            
            // Retrieve the assignment target
            var ValuedObject target
            val targetExpr = binExpr.getOperand1
            if (targetExpr instanceof IASTIdExpression) {
                target = funcState.findValuedObjectByName(targetExpr.getName.toString, true, dRegion)    
            } else println("ExpressionConverterExtensions: Assignment to a non simple variable detected!")
            
            target.insertHighlightAnnotations(binExpr)
            ass = createAssignment(target, source)
        }
        res.add(ass)
        res
    }
    
    // Create a lazy assignment like +=
    def createLazyAssignment(IASTBinaryExpression expression, State funcState, DataflowRegion dRegion, int operator) {
        // Create a normal assignment out of lazy assignment
        val assExpr = expression.copy(CopyStyle.withLocations)
        assExpr.setOperator = IASTBinaryExpression.op_assign
        val operatorExpr = expression.copy(CopyStyle.withLocations)
        operatorExpr.setOperator = operator
        assExpr.setOperand2 = operatorExpr
        
        // Translate the normal assignment
        val kEffects = createKEffect(assExpr, funcState, dRegion)
        for (kEffect : kEffects) {
            dRegion.equations += kEffect
        }
    }
    
    // Create the assignment out of a BinaryExpression    
    def createBinaryAssignment(IASTBinaryExpression expression, State funcState, DataflowRegion dRegion) {
        
        switch (expression.getOperator) {
            // Translate the normal assignment
            case IASTBinaryExpression.op_assign: {
                val kEffects = createKEffect(expression, funcState, dRegion)
                for (kEffect : kEffects) {
                    dRegion.equations += kEffect
                }
            }
            // Translate lazy assignments
            case IASTBinaryExpression.op_multiplyAssign: {
                val arithmeticOP = IASTBinaryExpression.op_multiply
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_divideAssign: {
                val arithmeticOP = IASTBinaryExpression.op_divide
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_moduloAssign: {
                val arithmeticOP = IASTBinaryExpression.op_modulo
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_plusAssign: {
                val arithmeticOP = IASTBinaryExpression.op_plus
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_minusAssign: {
                val arithmeticOP = IASTBinaryExpression.op_minus
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_shiftLeftAssign: {
                val arithmeticOP = IASTBinaryExpression.op_shiftLeft
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_shiftRightAssign: {
                val arithmeticOP = IASTBinaryExpression.op_shiftRight
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_binaryAndAssign: {
                val arithmeticOP = IASTBinaryExpression.op_binaryAnd
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_binaryXorAssign: {
                val arithmeticOP = IASTBinaryExpression.op_binaryXor
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_binaryOrAssign: {
                val arithmeticOP = IASTBinaryExpression.op_binaryOr
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            
        }
        
    }
    
    // Translate a unary assignment like ++
    def createUnaryAssignment(IASTUnaryExpression expression, State funcState, DataflowRegion dRegion) {
        // Create the expression
        val sourceExpression = createKExpression(expression, funcState, dRegion)
        // Retrieve the respective variable VO                
        val opName = (expression.getOperand as IASTIdExpression).getName.toString
        val opVO = funcState.findValuedObjectByName(opName, true, dRegion)
                
        opVO.insertHighlightAnnotations(expression) 
        // Create the Assignment        
        dRegion.equations += createAssignment(opVO, sourceExpression)
        
    }
    
    // Translate a func call expression
    def createFuncCall(IASTFunctionCallExpression expression, State funcState, DataflowRegion dRegion, State refState, boolean knownFunction) {
        // Create the Reference
        val refDecl = createReferenceDeclaration
        refDecl.setReference(refState)
        refDecl.annotations += createTagAnnotation("hide")
        dRegion.declarations += refDecl
        val refObj = refDecl.createValuedObject(refState.name)
        refObj.insertHighlightAnnotations(expression)
        // Link the arguments        
        var arguments = expression.getArguments
        for(var i = 0; i < arguments.length; i++) {
            val argument = arguments.get(i)
            val argExpr = argument.createKExpression(funcState, dRegion)
            var inputVO = refState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.get(i)
            dRegion.equations += createAssignment(refObj, inputVO, argExpr)
            
        }
    }
    
    // Translate a CDT expression into a KExpression 
    def Expression createKExpression(IASTNode expr, State funcState, DataflowRegion dRegion) {
        var Expression kExpression
        
        switch expr {
            // For variable uses create a VO reference
            IASTIdExpression: {
                // TODO: use local prefix
                val varName = /*StructflowExtractor.LOCAL_PREFIX +*/ expr.getName.toString 
                var opValObj = funcState.findValuedObjectByName(varName, false, dRegion)
                kExpression = opValObj.reference
            }
            IASTFieldReference: {
                var opValObj = funcState.findValuedObjectByName(expr.getFieldName.toString, false, dRegion)
                kExpression = opValObj.reference
            }
            // For a function call create a reference and return the functions output VO reference
            IASTFunctionCallExpression: {
                // Casts are handled as function calls, figure out casts first.
                // Casts in dataflow are simply ignored and the expression that is casted is translated.
                if (expr.functionNameExpression instanceof IASTUnaryExpression
                    && (expr.functionNameExpression as IASTUnaryExpression).operand instanceof IASTIdExpression) {
                    return expr.arguments.head.createKExpression(funcState, dRegion)
                }
                
                // Create the Reference
                var refDecl = createReferenceDeclaration
                dRegion.declarations += refDecl
                val funcName = (expr.getFunctionNameExpression as IASTIdExpression).getName.toString//children.head.toString
                var refState = funcName.findFunctionState
                if (refState === null) {
                    refState = createUnknownFuncState(funcName, expr, true)
                }
                val refStateConst = refState
                refDecl.setReference(refStateConst)
                refDecl.annotations += createTagAnnotation("Hide")
                val funcObj = refDecl.createValuedObject(funcName)
                funcObj.insertHighlightAnnotations(expr)
                // Retrieve the output VO                
                kExpression = funcObj.reference => [
                    subReference = refStateConst.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.filter [ name == "res_out" ].head.reference
                ]
                // Connect the Inputs    
                var i = 0
                for (argument : expr.getArguments) {
                    val funcObjArg = refStateConst.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.get(i)
                    val connectExpr = argument.createKExpression(funcState, dRegion)
                    dRegion.equations += createAssignment(funcObj, funcObjArg, connectExpr)
                    i++
                }
            }
            // For a conditional expression create a state similar to an if    
            IASTConditionalExpression: {
                val condExpr = expr.getLogicalConditionExpression
                //Create the State
                val condState = createState(condExpr.exprToString)
                condState.insertHighlightAnnotations(expr)
                val condDRegion = createDataflowRegion(condState.name)
                condDRegion.label = condState.name
                condState.regions += condDRegion
                // Create the reference
                val refDecl = createReferenceDeclaration
                refDecl.setReference(condState)
                refDecl.annotations += createTagAnnotation("hide")
                dRegion.declarations += refDecl
                val condStateVO = refDecl.createValuedObject("?")
                // Set the inputs
                setInputs(expr, funcState, condState, dRegion, condStateVO)
                
                // Create the output
                val outputDecl = createVariableDeclaration
                outputDecl.output = true
                condState.declarations += outputDecl
                val outputVO = outputDecl.createValuedObject("res")
                // Create the positive expression
                condDRegion.equations += createAssignment(outputVO, expr.getPositiveResultExpression.createKExpression(condState,condDRegion))
                outputVO.insertHighlightAnnotations(expr)
                // Create the nagative expression
                val condNDRegion = createDataflowRegion("Else")
                condNDRegion.label = "Else"
                condState.regions += condNDRegion
                
                condNDRegion.equations += createAssignment(outputVO, expr.getNegativeResultExpression.createKExpression(condState,condNDRegion))
                outputVO.insertHighlightAnnotations(expr)
                
                // Return the output reference
                kExpression = condStateVO.reference => [
                    subReference = outputVO.reference
                ]
            }
            // Skip a cast and translate the inner expression
            IASTCastExpression: {
                kExpression = expr.getOperand.createKExpression(funcState, dRegion)
            }
            // Call subsequent translations for unary and binary expressions
            IASTUnaryExpression: {
                kExpression = expr.createKExpression(funcState, dRegion)
            }
            IASTBinaryExpression: {
                kExpression = expr.createKExpression(funcState, dRegion)
            }
            // Create a value expression for a literal
            IASTLiteralExpression: {
                kExpression = expr.createValue
            }
            // Extract the expression of an expression statement and translate it
            IASTExpressionStatement: {
                kExpression = expr.getExpression.createKExpression(funcState, dRegion)
            }
            IASTArraySubscriptExpression: {
                kExpression = createStringValue(expr.exprToString)
            }
            default: {
                println("Unsupported ast node to create an expression: " + expr.class)
            }
        }
        return kExpression
    }
    
    // Translate a bianryExpression
    def Expression createKExpression(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
        // Create the operator expression with the corresponding operator
        var opType = binExpr.getOperator().cdtBinaryOpTypeConversion
        var binKExpr = opType.createOperatorExpression
        // Translate the operands and attach them    
        for (operand : binExpr.children) {
            val expr = operand.createKExpression(funcState, dRegion)
            if (expr !== null) {
                binKExpr.subExpressions += expr 
            }
        }
        binKExpr
    }
    
    // Translate an UnaryExpression
    def Expression createKExpression(IASTUnaryExpression unExpr, State funcState, DataflowRegion dRegion) {
        var Expression res
        // Retrieve the operator and create the operatorExpression
        var opType = unExpr.getOperator.cdtUnaryOpTypeConversion
        var OperatorExpression unKExpr
        
        // Test if the operator exists (parentheses are an unary expression thus skip them)
        if(opType !== null) {
            unKExpr = opType.createOperatorExpression
            // Attach the operand
            var operand = unExpr.getOperand
            unKExpr.subExpressions += operand.createKExpression(funcState, dRegion)
            res = unKExpr
        } else {
            // Translate the operand
            var operand = unExpr.getOperand
            res = operand.createKExpression(funcState, dRegion)
        }
        res
        
    }
    
    // Build a string representation of the expression
    def String exprToString(IASTNode expr) {
        var res = ""
        
        if (expr instanceof IASTFunctionCallExpression) {
            // Retrieve the function's name
            val funcName = (expr.getFunctionNameExpression as IASTIdExpression).getName.toString
            res = funcName + "("
            
            // Translate the arguments
            val arguments = expr.getArguments
            for (var i = 0; i < arguments.length; i++) {
                val argument = arguments.get(i)
                
                res += argument.exprToString
                
                if (i < arguments.length - 1) {
                    res += ", "
                } else res += ")"
            }
            
            
        } else if (expr instanceof IASTBinaryExpression) {
            // Translate the elemenmts of the binary expression
            val operator = cdtBinaryOpTypeToString(expr.getOperator)
            val operand1 = expr.getOperand1.exprToString
            val operand2 = expr.getOperand2.exprToString
            
            res = "(" + operand1 + " " + operator + " " + operand2 + ")" 
        } else if (expr instanceof IASTUnaryExpression) {
            // Translate the elements of a unary expression
            var postOperator = cdtUnaryOpTypeToString(expr.getOperator)
            var preOperator = ""
            
            if (postOperator.contains("exp")) {
                preOperator = postOperator.substring(0, postOperator.indexOf("exp"))
                postOperator = ""
            }
            
            val operand = expr.getOperand.exprToString
            
            res = "(" + preOperator + operand + postOperator + ")"
        } else if (expr instanceof IASTFieldReference) {
            // Translate the use of a struct
            val structExpr = expr.getFieldOwner
            val structName = structExpr.exprToString
            val fieldName = expr.getFieldName
            res = structName + "->" + fieldName
            
        } else if (expr instanceof IASTArraySubscriptExpression) {
            // Translate the use on an array
            val arrayExpr = expr.getArrayExpression
            val arrayName = arrayExpr.exprToString
            val arrayArgExpr = expr.getArgument
            val arrayArgName = arrayArgExpr.exprToString
            
            res = arrayName + "[" + arrayArgName + "]"
            
        } else if (expr instanceof IASTIdExpression) {
            //Translate the use of a variable
            res = expr.getName.toString            
        } else if (expr instanceof IASTLiteralExpression) {
            // Translate the use of a literal
            res = expr.toString
        } else if (expr instanceof IASTExpressionStatement) {
            // Extract the expression out of the expression statement
            res = expr.getExpression.exprToString
        }
        
        res
    }    
    
}