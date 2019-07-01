package de.cau.cs.kieler.c.sccharts.extensions

import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDefinition
import de.cau.cs.kieler.sccharts.State
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTParameterDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator
import org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement
import de.cau.cs.kieler.sccharts.ControlflowRegion
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.internal.core.dom.parser.c.CASTReturnStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTForStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTUnaryExpression
import de.cau.cs.kieler.c.sccharts.processors.DataflowExtractor
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTWhileStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIfStatement
import java.util.ArrayList
import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSwitchStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTCaseStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBreakStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDefaultStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDoStatement

class IllustratorExtensions {
    
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsSerializeExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension ExpressionConverterExtensions
    @Inject extension ValueExtensions
    @Inject extension DataflowExtractor
    
    def State illustrate(CASTFunctionDefinition func) {
        val funcDeclarator = func.getDeclarator
        var res = createState(funcDeclarator.children.head.toString)
        //Set func name
        res.label = funcDeclarator.children.head.toString
        
        //Set func inputs
        for(parameter : funcDeclarator.children.filter(typeof(CASTParameterDeclaration))) {
            val paramDec = createVariableDeclaration
            paramDec.input = true
            paramDec.type = parameter.children.filter(typeof(CASTSimpleDeclSpecifier)).head.type.CDTTypeConversion
            res.declarations += paramDec
            
            val param = paramDec.createValuedObject(parameter.children.filter(typeof(CASTDeclarator)).head.children.head.toString)        
        }
        
        
        //Set func outputs
        println("")
        println("Func definition for: " + res.label)
        val funcDeclSpecifier = func.getDeclSpecifier
        if(funcDeclSpecifier instanceof CASTSimpleDeclSpecifier) {
            val funcDeclSpec = funcDeclSpecifier as CASTSimpleDeclSpecifier
            println("declSpecifier is simple for CDT-type: " + funcDeclSpec.getType)
            if (funcDeclSpec.type > 0) {
                
                val returnDec = createVariableDeclaration
                returnDec.output = true
                returnDec.type = funcDeclSpec.type.CDTTypeConversion
                res.declarations += returnDec
                
                val returnVal = returnDec.createValuedObject("res")
            }
        }
        
        
        //illustrate func body
        val controlFlowRegion = func.children.filter(typeof(CASTCompoundStatement)).head.illustrate(res)
        res.regions += controlFlowRegion
        println("")
        res
    }
    
    def ControlflowRegion illustrate(CASTCompoundStatement compound, State funcState) {
        val res = createControlflowRegion("")
        var State previousState
        
        for (statement : compound.children) {
            if(statement instanceof CASTDeclarationStatement) {
                var state = (statement as CASTDeclarationStatement).illustrate(funcState)
                res.states += state
                if (previousState !== null) previousState.createTransitionTo(state)
                previousState = state
            } else if (statement instanceof CASTForStatement) {
                var state = (statement as CASTForStatement).illustrate(funcState)
                res.states += state
                if(previousState !== null) previousState.createTransitionTo(state)
                previousState = state
            } else if (statement instanceof CASTExpressionStatement) {
                var state = (statement as CASTExpressionStatement).illustrate(funcState)
                res.states += state
                if(previousState !== null) previousState.createTransitionTo(state)
                previousState = state
            } else if (statement instanceof CASTWhileStatement) {
                var state = (statement as CASTWhileStatement).illustrate(funcState)
                res.states += state
                if(previousState !== null) previousState.createTransitionTo(state)
                previousState = state
            } else if (statement instanceof CASTIfStatement) {
                var state = (statement as CASTIfStatement).illustrate(funcState)
                res.states += state
                if(previousState !== null) previousState.createTransitionTo(state)
                previousState = state
            } else if (statement instanceof CASTSwitchStatement) {
                var state = (statement as CASTSwitchStatement).illustrate(funcState)
                res.states += state
                if(previousState !== null) previousState.createTransitionTo(state)
                previousState = state
            } else if (statement instanceof CASTDoStatement) {
                var state = (statement as CASTDoStatement).illustrate(funcState)
                res.states += state
                if(previousState !== null) previousState.createTransitionTo(state)
                previousState = state
            } else if (statement instanceof CASTReturnStatement) {
                val returnState = compound.children.filter(typeof(CASTReturnStatement)).head.illustrate(funcState)
                res.states +=  returnState
                if(previousState !== null) previousState.createTransitionTo(returnState)
            }
        }
        
        res
    }
    
    def State illustrate(CASTSwitchStatement switchStatement, State funcState) {
        var res = createState
        var resLabel = "Switch ("
     
        //Complete Label
        var controllerExpr = switchStatement.getControllerExpression
        if(controllerExpr instanceof CASTIdExpression) {
            resLabel += (controllerExpr as CASTIdExpression).getName.toString + ")"
        }
        
        var cRegion = res.createControlflowRegion("")
        var baseState = createState
        baseState.initial = true
        cRegion.states += baseState
        var finalState = createState
        finalState.final = true
        cRegion.states += finalState
        var State prevBreaklessState = null
        
        var bodyStatement = switchStatement.getBody
        for (var i = 0; i < bodyStatement.children.length; i++) {
            var child = bodyStatement.children.get(i)
            if(child instanceof CASTCaseStatement) {
                var State caseState
                var caseLabel = "case" 
                
                var caseExpr = (child as CASTCaseStatement).getExpression
                caseLabel += " " + caseExpr.toString
                
                if(bodyStatement.children.get(i + 1) instanceof CASTExpressionStatement) {
                    caseState = (bodyStatement.children.get(i+1) as CASTExpressionStatement).illustrate(funcState)
                    caseState.label = caseLabel
                    cRegion.states += caseState
                    baseState.createTransitionTo(caseState)
                    i++
                    if(prevBreaklessState !== null) {
                        prevBreaklessState.createTransitionTo(caseState)
                        prevBreaklessState = null
                    }
                    if(bodyStatement.children.get(i + 1) instanceof CASTBreakStatement) {
                        caseState.createTransitionTo(finalState)
                        i++
                    } else {
                        prevBreaklessState = caseState 
                    }
                }
            } else if (child instanceof CASTDefaultStatement) {
                var State defaultState
                
                if(((i+1) < bodyStatement.children.length) && (bodyStatement.children.get(i + 1) instanceof CASTExpressionStatement)) {
                    defaultState = (bodyStatement.children.get(i + 1) as CASTExpressionStatement).illustrate(funcState)
                    defaultState.label = "default"
                    cRegion.states += defaultState
                    baseState.createTransitionTo(defaultState)
                    i++
                    if(prevBreaklessState !== null) {
                        prevBreaklessState.createTransitionTo(defaultState)
                        prevBreaklessState = null
                    }
                    defaultState.createTransitionTo(finalState)
                    
                }
            }
        }
        
        println("")
        println("Inside illustrate SwitchStatement")
        
        println("")
        res.label = resLabel
        res
    }
    
    def State illustrate(CASTIfStatement ifStatement, State funcState) {
        var res = createState
        var resLabel = "If"
        
        println("")
        println("Inside illustrate IfStatement")
        
        val cRegion = res.createControlflowRegion("")
        res.regions += cRegion
        val initState = createState
        initState.initial = true
        cRegion.states += initState
        
        var condExpr = ifStatement.getConditionExpression
        var condKExpr = (condExpr as CASTBinaryExpression).createKExpression(funcState)
        
        
        val thenState = createState
        thenState.final = true
        thenState.label = "Then"
        thenState.regions += (ifStatement.getThenClause as CASTCompoundStatement).illustrate(funcState)
        cRegion.states += thenState
        val thenTransition = initState.createTransitionTo(thenState)
        thenTransition.trigger = condKExpr.head
        
        val elseState = createState
        elseState.final = true
        val elseStatement = ifStatement.getElseClause
        if(elseStatement !== null) {
            elseState.label = "Else"
            elseState.regions += (elseStatement as CASTCompoundStatement).illustrate(funcState)
        }         
        cRegion.states += elseState
        val elseTransition = initState.createTransitionTo(elseState)
        elseTransition.label = "else"
        
        println("")
        res.label = resLabel
        res
    }
    
    def State illustrate(CASTDeclarationStatement declStatement, State funcState) {
        var res = createState
        res.label = "Declaration"
        val dRegion = res.createDataflowRegion("")
        
        val decl = createVariableDeclaration
        funcState.declarations += decl
        decl.type = declStatement.children.head.children.filter(typeof(CASTSimpleDeclSpecifier)).head.type.CDTTypeConversion
        
        val valObj = decl.createValuedObject(declStatement.children.head.children.filter(typeof(CASTDeclarator)).head.children.head.toString)
        val initExpr = createValue(declStatement.children.head.children.filter(typeof(CASTDeclarator)).head.children.filter(typeof(CASTEqualsInitializer)).head.children.head)
        
        dRegion.equations += createAssignment(valObj, initExpr)
        
        res        
    }
    
    def State illustrate(CASTExpressionStatement exprStatement, State funcState) {
        var res = createState("Expression")
        var resLabel = "Expression"
        
        println("")
        println("Inside illustrate ExpressionStatement")
        
        val expr = exprStatement.getExpression
        if(expr instanceof CASTUnaryExpression) {
            val unExpr = expr as CASTUnaryExpression
            val unKExpr = unExpr.createKExpression(funcState)
            resLabel += "\n"+unKExpr.toString
            
        }else if(expr instanceof CASTBinaryExpression) {
            val binExpr = expr as CASTBinaryExpression
            val operator = binExpr.getOperator
            if((operator > 16) && (operator < 29)) {
                val dataflowRegion = res.createDataflowRegion("")
                for(assignment : createKEffect(binExpr,funcState)) {
                    dataflowRegion.equations += assignment
                }
            } else {
                resLabel += " calculation"
            }
        }
        
        println("")
        res.label = resLabel
        res
    }
    
    def State illustrate(CASTDoStatement doStatement, State funcState) {
        val res = createState("")
        var resLabel = "Do ... while ("
        
        //Cond Expression
        val condStatement = doStatement.getCondition as CASTBinaryExpression
        val condKExpr = condStatement.createKExpression(funcState).head
        resLabel += condKExpr.serialize + ")"
        
        //Body
        val bodyStatement = doStatement.getBody as CASTCompoundStatement
        val controlFlowRegion = bodyStatement.illustrate(funcState)
        res.regions += controlFlowRegion
        
        res.label = resLabel
        res
    }
    
    def State illustrate(CASTWhileStatement whileStatement, State funcState) {
        val res = createState("")
        var resLabel = "while ("
        
        //Cond Expression
        val condStatement = whileStatement.getCondition as CASTBinaryExpression
        val condKExpr = condStatement.createKExpression(funcState).head
        resLabel += condKExpr.serialize + ")"
        
        //Body
        val bodyStatement = whileStatement.getBody as CASTCompoundStatement
        val controlFlowRegion = bodyStatement.illustrate(funcState)
        res.regions += controlFlowRegion
        
        res.label = resLabel
        res
    }
    
    def State illustrate(CASTForStatement forStatement, State funcState) {
        val res = createState("")
        var resLabel = "for ("
        
        //Init Expression
        val initStatement = forStatement.getInitializerStatement as CASTExpressionStatement
        if (initStatement.children.head instanceof CASTBinaryExpression) {
            val initBinExpr = initStatement.children.head as CASTBinaryExpression
            val autoKEffect = createKEffect(initBinExpr, funcState).head
            resLabel += autoKEffect.toString.substring(autoKEffect.toString.indexOf(" ") + 1) + "; "
        }
        
        //Conditional Expression
        val condStatement = forStatement.getConditionExpression as CASTBinaryExpression
        val condKExpr = condStatement.createKExpression(funcState).head
        resLabel += condKExpr.serialize + "; "
                
        //Attribute Modifier
        val itStatement = forStatement.getIterationExpression as CASTUnaryExpression
        val itKExpr = itStatement.createKExpression(funcState).head
        resLabel += itKExpr.serialize + ")"
        
        res.label = resLabel
        
        //Body
        val bodyStatement = forStatement.getBody as CASTCompoundStatement
        val controlFlowRegion = bodyStatement.illustrate(funcState)
        res.regions += controlFlowRegion
        
        res
    }
    
    def State illustrate(CASTReturnStatement returnStatement, State funcState) {
        val res = createState("return")
        res.final = true
        
        val returnChild = returnStatement.children.head
        if(returnChild instanceof CASTIdExpression) {
            val returnVal = findValuedObjectByName(funcState,"res")
            val returnVar = findValuedObjectByName(funcState,returnChild.children.head.toString)
            
            val dataflowRegion = res.createDataflowRegion("")
            dataflowRegion.equations += createAssignment(returnVal, returnVar.reference)
            
        } else if(returnChild instanceof CASTBinaryExpression) {
            val binExpr = returnChild as CASTBinaryExpression
            val returnVal = findValuedObjectByName(funcState, "res")
            val opType = binExpr.getOperator().CDTBinaryOpTypeConversion
            val binKExpr = opType.createOperatorExpression
            
            for (operand : binExpr.children) {
                if(operand instanceof CASTIdExpression) {
                    val opValObj = funcState.findValuedObjectByName(operand.children.head.toString)
                    binKExpr.subExpressions += opValObj.reference
                } else {
                    binKExpr.subExpressions += operand.createValue
                }
            }
            
            val dataflowRegion = res.createDataflowRegion("")
            dataflowRegion.equations += createAssignment(returnVal, binKExpr)
        }
        
        res
    }    
    
}

//alter compound code

        /*//Init Phase
        var initDeclStatements = <CASTDeclarationStatement> newArrayList => [ list |
            var initDone = false
            for(child : compound.children) {
                if(!initDone && (child instanceof CASTDeclarationStatement)) {
                    list += child as CASTDeclarationStatement
                } else {
                    initDone = true
                }
            }
        ]  
        
        if (initDeclStatements.length > 0) {
            val initState = res.createState("Init")
            previousState = initState
            val initRegion = initState.createDataflowRegion("")
            
            for (declStatement : initDeclStatements) {
                val decl = createVariableDeclaration
                funcState.declarations += decl
                decl.type = declStatement.children.head.children.filter(typeof(CASTSimpleDeclSpecifier)).head.type.CDTTypeConversion
                
                val valObj = decl.createValuedObject(declStatement.children.head.children.filter(typeof(CASTDeclarator)).head.children.head.toString)
                
                val initExpr = createValue(Integer.parseInt(declStatement.children.head.children.filter(typeof (CASTDeclarator)).head.children.filter(typeof(CASTEqualsInitializer)).head.children.head.toString))
                
                initRegion.equations += createAssignment(valObj, initExpr)
            }
        }
        
        //Middle Statements
        var middleStatements = newArrayList => [ list |
            var initDone = false
            var IASTNode prevChild
            for(child : compound.children) {
                if(((prevChild instanceof CASTDeclarationStatement) || (prevChild === null)) && !initDone && !(child instanceof CASTDeclarationStatement)) {
                    initDone = true
                }
                if(initDone && (!(child instanceof CASTReturnStatement))) {
                    list += child
                } else {
                    prevChild = child
                }
            }            
        ]
        
        for(statement : middleStatements) {
            if (statement instanceof CASTForStatement) {
                var state = (statement as CASTForStatement).illustrate(funcState)
                res.states += state
                if(previousState !== null) previousState.createTransitionTo(state)
                previousState = state
            }
            if (statement instanceof CASTExpressionStatement) {
                var state = (statement as CASTExpressionStatement).illustrate(funcState)
                res.states += state
                if(previousState !== null) previousState.createTransitionTo(state)
                previousState = state
            }
        }
        
        //Return Phase
        if(compound.children.filter(typeof(CASTReturnStatement)).length > 0) {
            val returnState = compound.children.filter(typeof(CASTReturnStatement)).head.illustrate(funcState)
            res.states +=  returnState
            if(previousState !== null) previousState.createTransitionTo(returnState)
        }*/