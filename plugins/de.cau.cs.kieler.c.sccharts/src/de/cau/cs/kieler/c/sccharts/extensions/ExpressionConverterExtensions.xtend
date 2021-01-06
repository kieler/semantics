package de.cau.cs.kieler.c.sccharts.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.c.sccharts.processors.DataflowExtractor
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
import org.eclipse.cdt.core.dom.ast.IASTDeclarationStatement
import org.eclipse.cdt.core.dom.ast.IASTEqualsInitializer
import org.eclipse.cdt.core.dom.ast.IASTExpression
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement
import org.eclipse.cdt.core.dom.ast.IASTFieldReference
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTInitializer
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTNode.CopyStyle
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import de.cau.cs.kieler.kexpressions.ValuedObjectReference

class ExpressionConverterExtensions {
    
    @Inject extension SCChartsStateExtensions
    @Inject extension AnnotationsExtensions
    // XXX: This is dependant of the dataflow extractor and therefore not a valid generic extension class.
    @Inject extension DataflowExtractor
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension ValueExtensions
    @Inject extension HighlightingExtensions
    
    /**
     * Create a list of assignments for the given binary expression.
     */
    def ArrayList<Assignment> createAssignments(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
        val operator = binExpr.getOperator
        var assignments = new ArrayList<Assignment>
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
                    ass = createDataflowAssignment(funcObj, funcObjArg, connectObj.reference)
                    assignments.add(ass)
                    i++
                }
            // Create a value expression for a literal    
            } else if(sourceExpr instanceof IASTLiteralExpression){
                
                source = createValue(sourceExpr)
            }
            
            // Retrieve the assignment target
            var ValuedObject target
            val targetExpr = binExpr.getOperand1
            var Expression index
            if (targetExpr instanceof IASTIdExpression) {
                target = funcState.findValuedObjectByName(targetExpr.getName.toString, true, dRegion)    
            } else if (targetExpr instanceof IASTArraySubscriptExpression) {
                val arrayIndex = targetExpr.argument.createKExpression(funcState, dRegion)
                target = funcState.findValuedObjectByName(targetExpr.arrayExpression.exprToString, arrayIndex, true, dRegion)
                index = targetExpr.argument.createKExpression(funcState, dRegion)
            } else {
                println("ExpressionConverterExtensions: Unsupported assignment target detected!" + targetExpr.expressionType)
            }
            
            target.insertHighlightAnnotations(binExpr)
            ass = createDataflowAssignment(target, source)
            if (index !== null) {
                ass.reference.indices += index
            }
        }
        assignments.add(ass)
        return assignments
    }
    
    /**
     * Create a lazy assignment like += and add them to the given dataflow region.
     */ 
    def void createLazyAssignment(IASTBinaryExpression expression, State funcState, DataflowRegion dRegion, int operator) {
        // Create a normal assignment out of lazy assignment
        val assExpr = expression.copy(CopyStyle.withLocations)
        assExpr.setOperator = IASTBinaryExpression.op_assign
        val operatorExpr = expression.copy(CopyStyle.withLocations)
        operatorExpr.setOperator = operator
        assExpr.setOperand2 = operatorExpr
        
        // Translate the normal assignment
        val assignments = createAssignments(assExpr, funcState, dRegion)
        for (assignment : assignments) {
            dRegion.equations += assignment
        }
    }
    
    /**
     * Create the assignment out of a BinaryExpression and add them to the given dataflow region.
     */   
    def void createBinaryAssignment(IASTBinaryExpression expression, State funcState, DataflowRegion dRegion) {
        
        switch (expression.getOperator) {
            // Translate the normal assignment
            case IASTBinaryExpression.op_assign: {
                val assignments = createAssignments(expression, funcState, dRegion)
                for (assignment : assignments) {
                    dRegion.equations += assignment
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
    
    /**
     * Translate a unary assignment like ++ and add them to the dataflow region.
     */
    def void createUnaryAssignment(IASTUnaryExpression expression, State funcState, DataflowRegion dRegion) {
        // Create the expression
        val sourceExpression = createKExpression(expression, funcState, dRegion)
        // Retrieve the respective variable VO                
        val opName = (expression.getOperand as IASTIdExpression).getName.toString
        val opVO = funcState.findValuedObjectByName(opName, true, dRegion)
                
        opVO.insertHighlightAnnotations(expression) 
        // Create the Assignment        
        dRegion.equations += createDataflowAssignment(opVO, sourceExpression)
        
    }
    
    /**
     * Translate a func call expression and add it to the dataflow region.
     */
    def void createFuncCall(IASTFunctionCallExpression expression, State funcState, DataflowRegion dRegion, State refState, boolean knownFunction) {
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
            dRegion.equations += createDataflowAssignment(refObj, inputVO, argExpr)
            
        }
    }
    
    /**
     * Translate a CDT expression into a KExpression 
     */
    def Expression createKExpression(IASTNode expr, State funcState, DataflowRegion dRegion) {
        var Expression kExpression
        
        switch expr {
            // For variable uses create a VO reference
            IASTIdExpression: {
                var opValObj = funcState.findValuedObjectByName((expr as IASTIdExpression).getName.toString, false, dRegion)
                kExpression = opValObj.reference
            }
            IASTFieldReference: {
                var opValObj = funcState.findValuedObjectByName((expr as IASTFieldReference).getFieldName.toString, false, dRegion)
                kExpression = opValObj.reference
            }
            // For an array, just use the array expression (and leave out the subscript for now).
            IASTArraySubscriptExpression: {
                kExpression = expr.arrayExpression.createKExpression(funcState, dRegion)
                (kExpression as ValuedObjectReference).indices += expr.argument.createKExpression(funcState, dRegion)
            }
            // For a function call create a reference an return the functions output VO reference
            IASTFunctionCallExpression: {
                // Create the Reference
                val funcCall = expr as IASTFunctionCallExpression
                var refDecl = createReferenceDeclaration
                dRegion.declarations += refDecl
                val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName.toString//children.head.toString
                var refState = funcName.findFunctionState
                if (refState === null) {
                    refState = createUnknownFuncState(funcName, funcCall, true)
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
                for (argument : funcCall.getArguments) {
                    val funcObjArg = refStateConst.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.get(i)
                    val connectExpr = argument.createKExpression(funcState, dRegion)
                    dRegion.equations += createDataflowAssignment(funcObj, funcObjArg, connectExpr)
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
                condDRegion.equations += createDataflowAssignment(outputVO, expr.getPositiveResultExpression.createKExpression(condState,condDRegion))
                outputVO.insertHighlightAnnotations(expr)
                // Create the nagative expression
                val condNDRegion = createDataflowRegion("Else")
                condNDRegion.label = "Else"
                condState.regions += condNDRegion
                
                condNDRegion.equations += createDataflowAssignment(outputVO, expr.getNegativeResultExpression.createKExpression(condState,condNDRegion))
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
                kExpression = (expr as IASTUnaryExpression).createKExpression(funcState, dRegion)
            }
            IASTBinaryExpression: {
                kExpression = (expr as IASTBinaryExpression).createKExpression(funcState, dRegion)
            }
            // Create a value expression for a literal
            IASTLiteralExpression: {
                kExpression = expr.createValue
            }
            // Extract the expression of an expression statement and translate it
            IASTExpressionStatement: {
                kExpression = expr.getExpression.createKExpression(funcState, dRegion)
            }
            default: {
                println("Unsupported ast node to create an expression: " + expr.class)
            }
        }
        return kExpression
    }
    
    /**
     * Translate a bianryExpression
     */
    def OperatorExpression createKExpression(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
        // Create the operator expression with the corresponding operator
        var opType = binExpr.getOperator().CDTBinaryOpTypeConversion
        var expression = opType.createOperatorExpression
        // Translate the operands and attach them    
        for (operand : binExpr.children) {
                
            expression.subExpressions += operand.createKExpression(funcState, dRegion)
                
        }
        return expression
    }
    
    /**
     * Translate an UnaryExpression
     */
    def Expression createKExpression(IASTUnaryExpression unExpr, State funcState, DataflowRegion dRegion) {
        var Expression expression
        // Retrieve the operator and create the operatorExpression
        var opType = unExpr.getOperator.CDTUnaryOpTypeConversion
        var OperatorExpression unKExpr
        
        // Test if the operator exists (parentheses are an unary expression thus skip them)
        if(opType !== null) {
            unKExpr = opType.createOperatorExpression
            // Attach the operand
            var operand = unExpr.getOperand
            unKExpr.subExpressions += operand.createKExpression(funcState, dRegion)
            expression = unKExpr
        } else {
            // Translate the operand
            var operand = unExpr.getOperand
            expression = operand.createKExpression(funcState, dRegion)
        }
        return expression
        
    }
    
    /**
     * Build a string representation of the expression
     */
    def String exprToString(IASTExpression expr) {
        var expressionAsString = ""
        
        if (expr instanceof IASTFunctionCallExpression) {
            // Retrieve the function's name
            val funcName = (expr.getFunctionNameExpression as IASTIdExpression).getName.toString
            expressionAsString = funcName + "("
            
            // Translate the arguments
            val arguments = expr.getArguments
            for (var i = 0; i < arguments.length; i++) {
                val argument = arguments.get(i)
                
                if (argument instanceof IASTExpression) {
                    expressionAsString += argument.exprToString
                } else {
                    println("unsupported argument type in function call to convert to string: " + argument.class)
                }
                
                if (i < arguments.length - 1) {
                    expressionAsString += ", "
                } else expressionAsString += ")"
            }
            
            
        } else if (expr instanceof IASTBinaryExpression) {
            // Translate the elemenmts of the binary expression
            val operator = expr.getOperator.CDTBinaryOpTypeToString
            val operand1 = expr.getOperand1.exprToString
            val operand2 = expr.getOperand2.exprToString
            
            expressionAsString = "(" + operand1 + " " + operator + " " + operand2 + ")" 
        } else if (expr instanceof IASTUnaryExpression) {
            // Translate the elements of a unary expression
            var postOperator = expr.getOperator.CDTUnaryOpTypeToString
            var preOperator = ""
            
            if (postOperator.contains("exp")) {
                preOperator = postOperator.substring(0, postOperator.indexOf("exp"))
                postOperator = ""
            }
            
            val operand = expr.getOperand.exprToString
            
            expressionAsString = "(" + preOperator + operand + postOperator + ")"
        } else if (expr instanceof IASTFieldReference) {
            // Translate the use of a struct
            val structExpr = expr.getFieldOwner
            val structName = structExpr.exprToString
            val fieldName = expr.getFieldName
            expressionAsString = structName + "->" + fieldName
            
        } else if (expr instanceof IASTArraySubscriptExpression) {
            // Translate the use on an array
            val arrayExpr = expr.getArrayExpression
            val arrayName = arrayExpr.exprToString
            val arrayArgExpr = expr.getArgument
            var String arrayArgName;
            if (arrayArgExpr instanceof IASTExpression) {
                arrayArgName = arrayArgExpr.exprToString
            } else {
                println("unsupported argument type in array subscript expression to convert to string: " + arrayArgExpr.class)
            }
            
            expressionAsString = arrayName + "[" + arrayArgName + "]"
            
        } else if (expr instanceof IASTIdExpression) {
            //Translate the use of a variable
            expressionAsString = expr.getName.toString            
        } else if (expr instanceof IASTLiteralExpression) {
            // Translate the use of a literal
            expressionAsString = expr.toString
        } else if (expr instanceof IASTExpressionStatement) {
            // Extract the expression out of the expression statement
            expressionAsString = expr.getExpression.exprToString
        } else {
            println("Unsupported expression to convert to string: " + expr.class)
        }
        
        return expressionAsString
    }
    
    /**
     * Build a string representation of the statement
     */
    def String stmtToString(IASTStatement stmt) {
        var String stmtAsString = ""
        
        switch (stmt) {
            IASTDeclarationStatement: {
                val decl = stmt.declaration
                if (decl instanceof IASTSimpleDeclaration) {
                    val specifier = decl.declSpecifier
                    if (specifier instanceof IASTSimpleDeclSpecifier) {
                        stmtAsString += specifier.specifierToString + " "
                    }
                    for (var int i = 0; i < decl.declarators.length; i++) {
                        val declarator = (decl as IASTSimpleDeclaration).declarators.get(i);
                        val name = declarator.name
                        val initializer = declarator.initializer
                        var String value
                        if (initializer instanceof IASTEqualsInitializer &&
                            (initializer as IASTEqualsInitializer).initializerClause instanceof IASTExpression) {
                            value = ((initializer as IASTEqualsInitializer).initializerClause as IASTExpression).exprToString
                        }
                        stmtAsString += name + " " + initializer.initializerToString + " " + value
                        if (i != decl.declarators.length - 1) {
                            stmtAsString += ", "
                        }
                    }
                }
            }
            default: {
                println("Yet unsupported statement to String: " + stmt.class)
            }
        }
        
        return stmtAsString
    }
    
    /**
     * Build a string representation of the IASTInitializer.
     */
    def String initializerToString(IASTInitializer initializer) {
        switch (initializer) {
            IASTEqualsInitializer: {
                return "="
            }
            default: {
                println("Yet unsupported initializer to String: " + initializer.class)
                return "unsupportedInitializer"
            }
        }
    }
    
    /**
     * Build a string representation of the IASTSimpleDeclSpecifier.
     */
    def String specifierToString(IASTSimpleDeclSpecifier specifier) {
        switch (specifier.type) {
            case IASTSimpleDeclSpecifier.t_unspecified: {
                return "unspecified"
            }
            case IASTSimpleDeclSpecifier.t_void: {
                return "void"
            }
            case IASTSimpleDeclSpecifier.t_char: {
                return "char"
            }
            case IASTSimpleDeclSpecifier.t_int: {
                return "int"
            }
            case IASTSimpleDeclSpecifier.t_float: {
                return "float"
            }
            case IASTSimpleDeclSpecifier.t_double: {
                return "double"
            }
            case IASTSimpleDeclSpecifier.t_bool: {
                return "bool"
            }
            case IASTSimpleDeclSpecifier.t_wchar_t: {
                return "wchar"
            }
            case IASTSimpleDeclSpecifier.t_typeof: {
                return "typeof"
            }
            case IASTSimpleDeclSpecifier.t_decltype: {
                return "decltype"
            }
            case IASTSimpleDeclSpecifier.t_auto: {
                return "auto"
            }
            case IASTSimpleDeclSpecifier.t_char16_t: {
                return "char16"
            }
            case IASTSimpleDeclSpecifier.t_char32_t: {
                return "char32"
            }
            case IASTSimpleDeclSpecifier.t_int128: {
                return "int128"
            }
            case IASTSimpleDeclSpecifier.t_float128: {
                return "float128"
            }
            case IASTSimpleDeclSpecifier.t_decimal32: {
                return "decimal32"
            }
            case IASTSimpleDeclSpecifier.t_decimal64: {
                return "decimal64"
            }
            case IASTSimpleDeclSpecifier.t_decimal128: {
                return "decimal128"
            }
            case IASTSimpleDeclSpecifier.t_decltype_auto: {
                return "decltype_auto"
            }
        }
    }
    
}