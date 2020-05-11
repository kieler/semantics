/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.c.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.State
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.c.sccharts.extensions.CDTConvertExtensions
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.c.sccharts.extensions.HighlightingExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.core.dom.ast.IASTNode
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.HashMap
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import org.eclipse.cdt.core.dom.ast.IASTDeclarator
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement
import org.eclipse.cdt.core.dom.ast.IASTCompoundStatement
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier
import org.eclipse.cdt.core.dom.ast.IASTEqualsInitializer
import org.eclipse.cdt.core.dom.ast.IASTDeclarationStatement
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTIfStatement
import org.eclipse.cdt.core.dom.ast.IASTForStatement
import org.eclipse.cdt.core.dom.ast.IASTWhileStatement
import org.eclipse.cdt.core.dom.ast.IASTDoStatement
import org.eclipse.cdt.core.dom.ast.IASTReturnStatement
import org.eclipse.cdt.core.dom.ast.IASTCaseStatement
import org.eclipse.cdt.core.dom.ast.IASTBreakStatement
import org.eclipse.cdt.core.dom.ast.IASTDefaultStatement
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import java.util.HashSet
import java.time.format.DateTimeFormatter
import java.time.LocalDateTime
import de.cau.cs.kieler.c.sccharts.extensions.ExpressionConverterExtensions

/**
 * @author lan
 * 
 */

@SuppressWarnings("all","unchecked")
class DataflowExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {

    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsSerializeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension ExpressionConverterExtensions
    @Inject extension HighlightingExtensions
    
     var functions = <String, State> newHashMap
     var ifCounter = 0;
     var swCounter = 0;
     var forCounter = 0;
     var whileCounter = 0;
     var doCounter = 0;
    
    var VOs = <State, HashMap<String, ArrayList<ValuedObject>>> newHashMap
    
    var State baseState = null


    override getId() {
        "de.cau.cs.kieler.c.sccharts.dataflowExtractor"
    }
    
    override getName() {
        "Dataflow Extractor"
    }
    
    override process() {
        val dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS")
        var now = LocalDateTime.now
        
        println("Starting Dataflow Extractor - Time: " + dtf.format(now))
        val tUnit = getModel
        val model = tUnit.transform as SCCharts
         
        now = LocalDateTime.now
        println("Dataflow Extractor finished - Time: " + dtf.format(now))
        
        setModel(model)
    }    

    def EObject transform(IASTTranslationUnit ast) {
        
        if(ast === null) {
            return null
        }
        
        // Create SCCharts root elements
        val SCChart = createSCChart        
        baseState = createState("rootState")
        baseState.label = "Dataflow Extractor"        
        SCChart.rootStates += baseState        
        val topCRegion = baseState.createControlflowRegion("")
        
        // Start extraction for each defined function
        for(child : ast.children) {
            
            if(child instanceof IASTFunctionDefinition) {
                val state = buildFunction(child)
                functions.put(state.label, state)
                topCRegion.states += state
            } 
             
        }
        
        SCChart
        
    }


    // The function used to create the state representing a function
    def State buildFunction(IASTFunctionDefinition func) {
       // Determine function name
        val funcDeclarator = func.getDeclarator as CASTFunctionDeclarator
        val funcName = funcDeclarator.getName.toString
        
        // Create the state
        val State state = createState(funcName)
        state.label = funcName
        
        // Insert text highlighting annotations
        state.insertHighlightAnnotations(func)
        
        // Create a hashmap for the functions valued objects if needed
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(VOs.containsKey(state)) {
            stateVariables = VOs.get(state)
        } else {
            stateVariables = <String,ArrayList<ValuedObject>> newHashMap
            VOs.put(state, stateVariables)    
        }
    
        // Create inputs for the functions parameters
        val parameters = funcDeclarator.getParameters
        for (par : parameters) {
            // Determine parameter type
            val decl = createVariableDeclaration
            val declSpecifier = par.getDeclSpecifier
            if (declSpecifier instanceof IASTSimpleDeclSpecifier) {
                decl.type = declSpecifier.type.CDTTypeConversion
                decl.input = true
                state.declarations += decl
            }
            // Determine parameter name
            val varName = par.getDeclarator.getName.toString
            var varList = <ValuedObject> newArrayList
            
            // Create valued object for the input
            val VO = decl.createValuedObject(varName + "_in")
            VO.insertHighlightAnnotations(par)
            
            // Attach the valued object to its list and the list to the map
            varList.add(VO)
            stateVariables.put(varName, varList) 
        }
        
        // Determine function output
        val declSpecifier = func.getDeclSpecifier
        if (declSpecifier instanceof IASTSimpleDeclSpecifier) {
            val type = (declSpecifier as IASTSimpleDeclSpecifier).type.CDTTypeConversion
            if (type !== null) {
                // Determine output type
                val retDecl = createVariableDeclaration
                retDecl.type = type
                retDecl.output = true  
                state.declarations += retDecl
                
                // Set output name to res
                var varName = "res"
                var varList = <ValuedObject> newArrayList
                
                // Create valued object
                val resVO = retDecl.createValuedObject(varName + "_out")
                
                // Attach valued object to the listing
                varList.add(resVO)
                stateVariables.put(varName, varList)   
            }
        }
        
        // Translate function body
        val body = func.getBody
        if (body instanceof IASTCompoundStatement) {
            val bodyRegion = buildCompound(body, state)
            state.regions += bodyRegion
            bodyRegion.label = funcName
        } else {
            println("ERROR: Body of " + funcName + " is not a Compound Statement!")
        }
        
        state
    }
    
    // Create the dataflow region for a compound statement and extract each containing statement
    def DataflowRegion buildCompound(IASTCompoundStatement body, State bodyState) {
        val res = createDataflowRegion("")
        res.insertHighlightAnnotations(body)
        
        val statements = body.getStatements
        for (stmt : statements) {
            buildStatement(stmt, bodyState, res)
        }
        linkOutputs(bodyState, res)
        
        res
    }
    
    // Create a declaration of a local variable and attach it to the dataflow region
    def dispatch void buildStatement(IASTDeclarationStatement stmt, State rootState, DataflowRegion dRegion) {
        val declaration = stmt.getDeclaration
        if (declaration instanceof IASTSimpleDeclaration) {
            val decl = addDeclaration(declaration, rootState, dRegion)
            dRegion.declarations += decl
            decl.annotations += createTagAnnotation("Hide")
        } 
    }
    
    // Translate an expression
    def dispatch void buildStatement(IASTExpressionStatement stmt, State rootState, DataflowRegion dRegion) {
        val expression = stmt.getExpression
                
        // Translate binary and unary expressions
        if (expression instanceof IASTBinaryExpression) {
            createBinaryAssignment(expression, rootState, dRegion)
        } else if (expression instanceof IASTUnaryExpression) {
            createUnaryAssignment(expression, rootState, dRegion)
        // Create a function call by referencing the function state    
        } else if (expression instanceof IASTFunctionCallExpression) {
                
            val funcName = (expression.getFunctionNameExpression as IASTIdExpression).getName.toString
            val knownFunction = functions.containsKey(funcName)
            var State funcState 
            if (knownFunction) {
                funcState = functions.get(funcName)
            } else {
                funcState = createUnknownFuncState(funcName, expression, false)
            }
            createFuncCall(expression, rootState, dRegion, funcState, knownFunction)                
        }
    }
    
    // Translate If statement
    def dispatch void buildStatement(IASTIfStatement stmt, State rootState, DataflowRegion dRegion) {
        buildIf(stmt, rootState, dRegion)
    }
    
    // Translate Switch statment
    def dispatch void buildStatement(IASTSwitchStatement stmt, State rootState, DataflowRegion dRegion) {
        buildSwitch(stmt, rootState, dRegion)
    }
    
    // Translate For statement
    def dispatch void buildStatement(IASTForStatement stmt, State rootState, DataflowRegion dRegion) {
        buildFor(stmt, rootState, dRegion)
    }
    
    // Translate While statement
    def dispatch void buildStatement(IASTWhileStatement stmt, State rootState, DataflowRegion dRegion) {
        buildWhile(stmt, rootState, dRegion)
    }
    
    // Translate Do statement
    def dispatch void buildStatement(IASTDoStatement stmt, State rootState, DataflowRegion dRegion) {
        buildDo(stmt, rootState, dRegion)
    }
    
    // Translate Return statement
    def dispatch void buildStatement(IASTReturnStatement stmt, State rootState, DataflowRegion dRegion) {
        val retKExpr = createKExpression(stmt.getReturnValue, rootState, dRegion)
                
        val retVO = rootState.findValuedObjectByName("res", true, dRegion)
        retVO.insertHighlightAnnotations(stmt)
        dRegion.equations += createAssignment(retVO, retKExpr)
    }
    
    // Translate all children of a CompoundStatement
    def dispatch void buildStatement(IASTCompoundStatement stmt, State rootState, DataflowRegion dRegion) {
        for (child : stmt.getStatements) {
            buildStatement(child, rootState, dRegion)
        }
    }
    
    // Extract the body of an if Statement
    def void buildIf(IASTIfStatement ifStmt, State rootState, DataflowRegion dRegion) {
        // Creating the state to represent the if statement
        val ifState = createState("If_" + ifCounter)
        
        // Create a reference for this if state in the containing dataflow-region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(ifState)
        val ifObj = refDecl.createValuedObject("If_" + ifCounter)
        ifObj.insertHighlightAnnotations(ifStmt)
        ifCounter++
        
        // Set the in and outputs of the state
        setInputs(ifStmt, rootState, ifState, dRegion, ifObj)
        setOutputs(ifStmt, rootState, ifState, dRegion, ifObj)
        
        // Create the controlflow region for the if state and the initial state
        val cRegion = ifState.createControlflowRegion("")
        val initState = cRegion.createState("")
        initState.insertHighlightAnnotations(ifStmt)
        initState.initial = true
        
        // Create the state for the then part
        val thenState = cRegion.createState("then")
        val thenCompound = ifStmt.getThenClause as IASTCompoundStatement
        thenState.insertHighlightAnnotations(thenCompound)
        val thenRegion = buildCompound(thenCompound, ifState)
        thenState.label = "then"
        thenState.regions += thenRegion
        val thenTransition = initState.createImmediateTransitionTo(thenState)
        thenTransition.trigger = (ifStmt.getConditionExpression).createKExpression(ifState, dRegion)
        
        // If an else is given the state is also created
        if (ifStmt.getElseClause !== null) {
            val elseState = cRegion.createState("else")
            val elseCompound = ifStmt.getElseClause as IASTCompoundStatement
            elseState.insertHighlightAnnotations(elseCompound)
            val elseRegion = buildCompound(elseCompound, ifState)
            elseState.label = "else"
            elseState.regions += elseRegion
            initState.createImmediateTransitionTo(elseState)
        }
        
    }
    
    // Extract the body of a switch statement
    def void buildSwitch(IASTSwitchStatement swStmt, State rootState, DataflowRegion dRegion) {
        // Create the State representing the switch
        val swState = createState("Switch_" + swCounter)
        
        // Create the reference for the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(swState)
        val swObj = refDecl.createValuedObject("Switch_" + swCounter)        
        swObj.insertHighlightAnnotations(swStmt)
        swCounter++
        
        // Set the In and Outputs
        setInputs(swStmt, rootState, swState, dRegion, swObj)
        setOutputs(swStmt, rootState, swState, dRegion, swObj)
        
        // Create the controlflow region
        val cRegion = swState.createControlflowRegion("")
        cRegion.insertHighlightAnnotations(swStmt.getBody)
        
        // Create the controller expression label
        val controller = swStmt.getControllerExpression.createKExpression(swState, dRegion)
        cRegion.label = "switch (" + controller.serialize + ")"       
        
        // Create the initial state
        val initState = cRegion.createState("")
        initState.insertHighlightAnnotations(swStmt.getBody)
        initState.initial = true
        
        // Translate the switch body
        val swBody = swStmt.getBody as IASTCompoundStatement
        var State noBreakCase
        var State activeCase
        var DataflowRegion activeDRegion
        for (child : swBody.children) {
            
            // Create a new state for case or default statements
            if (child instanceof IASTCaseStatement || child instanceof IASTDefaultStatement) {
                // Save the previous case state
                noBreakCase = activeCase
                if (activeCase !== null) {
                    linkOutputs(swState, activeDRegion)
                }
                // Create the state
                activeCase = cRegion.createState("")
                activeCase.insertHighlightAnnotations(child)
                
                // Create its dataflow region
                activeDRegion = createDataflowRegion("")
                activeCase.regions += activeDRegion
                activeDRegion.insertHighlightAnnotations(child)
                
                // Create the transition from the previous case state to the new if needed
                if (noBreakCase !== null) {
                    noBreakCase.createImmediateTransitionTo(activeCase)
                    noBreakCase = null
                }
                
                // Create a triggered transition for a case state 
                if (child instanceof IASTCaseStatement) {
                    val caseTransition = initState.createImmediateTransitionTo(activeCase)
                    caseTransition.trigger = child.getExpression.createKExpression(swState, dRegion)                    
                    activeCase.label = controller.serialize + " == " + caseTransition.trigger.serialize
                // Create a transition without a trigger for a default statement    
                } else {
                    initState.createImmediateTransitionTo(activeCase)                 
                    activeCase.label = "default"
                }
            // Create a transition to the final state for break statements    
            } else if (child instanceof IASTBreakStatement) {
                linkOutputs(swState, activeDRegion)
                activeCase = null
            // Translate other statements into the currently active dataflow region    
            } else {
                buildStatement(child as IASTStatement, swState, activeDRegion)
            }
            
        }
        linkOutputs(swState, activeDRegion)
    }
    
    // Translate a For Statement   
    def void buildFor(IASTForStatement forStmt, State rootState, DataflowRegion dRegion) {
        // Create the state
        val forState = createState("For_" + forCounter)
        
        // Reference the state in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(forState)
        val forObj = refDecl.createValuedObject("For_" + forCounter)        
        forObj.insertHighlightAnnotations(forStmt)
        
        // Set the in and outputs
        setInputs(forStmt, rootState, forState, dRegion, forObj)
        setOutputs(forStmt, rootState, forState, dRegion, forObj)
        
        // Set the loop conditions as label
        val condExpr = forStmt.getConditionExpression.exprToString
        val initExpr = forStmt.getInitializerStatement.exprToString
        val itExpr = forStmt.getIterationExpression.exprToString        
        forState.label = "for (" + initExpr.serialize + "; " + condExpr.serialize + "; " + itExpr.serialize + ")"
        forCounter++
        
        // Translate the body
        val forDBodyRegion = buildCompound(forStmt.getBody as IASTCompoundStatement, forState) 
        forState.regions += forDBodyRegion
        forDBodyRegion.label = forState.label        
    }
    
    // Translate a while statement
    def void buildWhile(IASTWhileStatement whileStmt, State rootState, DataflowRegion dRegion) {
        // Create the state        
        val whileState = createState("While_" + whileCounter)
        
        // Create the reference in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(whileState)
        val whileObj = refDecl.createValuedObject("While_" + whileCounter)        
        whileObj.insertHighlightAnnotations(whileStmt)
        
        // Set the in and outputs
        setInputs(whileStmt, rootState, whileState, dRegion, whileObj)
        setOutputs(whileStmt, rootState, whileState, dRegion, whileObj)
        
        // Create the condition expression label
        val condExpr = createKExpression(whileStmt.getCondition, whileState, dRegion)
        whileState.label = "while " + condExpr.serialize
        whileCounter++
        
        // Translate the loop body
        val whileDBodyRegion = buildCompound(whileStmt.getBody as IASTCompoundStatement, whileState) 
        whileState.regions += whileDBodyRegion
        whileDBodyRegion.label = whileState.label
        
    }
    
    // Translate a Do statement
    def void buildDo(IASTDoStatement doStmt, State rootState, DataflowRegion dRegion) {
        // Create the state        
        val doState = createState("Do_" + doCounter)
        
        // Create the reference in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(doState)
        val doObj = refDecl.createValuedObject("Do_" + doCounter)        
        doObj.insertHighlightAnnotations(doStmt)
        
        // Set the in and outputs
        setInputs(doStmt, rootState, doState, dRegion, doObj)
        setOutputs(doStmt, rootState, doState, dRegion, doObj)
        
        // Create the condition expression label
        val condExpr = createKExpression(doStmt.getCondition, doState, dRegion)
        doState.label = "do ... while " + condExpr.serialize
        doCounter++
        
        // Translate the body
        val doDBodyRegion = buildCompound(doStmt.getBody as IASTCompoundStatement, doState) 
        doState.regions += doDBodyRegion
        doDBodyRegion.label = doState.label
               
    }
    
    // Create a variable declaration
    def VariableDeclaration addDeclaration(IASTSimpleDeclaration declaration, State state, DataflowRegion dRegion) {
        
        // Create the declaration with the cdt type
        val res = createVariableDeclaration
        res.type = (declaration.getDeclSpecifier as IASTSimpleDeclSpecifier).type.CDTTypeConversion
        res.insertHighlightAnnotations(declaration)
        
        // Retrieve the state's variable map
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(VOs.containsKey(state)) {
            stateVariables = VOs.get(state)    
        } else {
            stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            VOs.put(state, stateVariables)
        }
        
        // Create a valued object for each declared variable 
        val declarators = declaration.getDeclarators
        for(decl : declarators) {
            // Retrieve the variables name
            var varName = decl.getName.toString
            // Create a SSA list for the variable
            var varList = <ValuedObject> newArrayList
            
            //Create the valued object
            val vo = res.createValuedObject(varName + "_0")
            vo.insertHighlightAnnotations(decl)
            
            // Add the valued object and the ssa list to the respective elements    
            varList.add(vo)
            stateVariables.put(varName, varList)
            
            // Add the initialization assignment is needed
            if(decl.getInitializer !== null) {
                vo.initializeValuedObject(decl, state, dRegion)
            }
        }
        res
    }
    
    // Add an initialization assignment to the given valued object
    def void initializeValuedObject(ValuedObject vo, IASTDeclarator decl, State state, DataflowRegion dRegion) {
        val initializer = decl.getInitializer
        if (initializer instanceof IASTEqualsInitializer) {
            // If the init expression is not a function call translate the expression
            if(!(initializer.children.head instanceof IASTFunctionCallExpression)) {                        
                val initExpr = createKExpression(initializer.children.head, state, dRegion)
                dRegion.equations += createAssignment(vo, initExpr)
                
            } else {
                // Retrieve the name of the called function
                val funcInit = initializer.children.head as IASTFunctionCallExpression
                val funcName = (funcInit.getFunctionNameExpression as IASTIdExpression).getName.toString
                val funcState = findFunctionState(funcName)
                
                // Reference the function state         
                val refDecl = createReferenceDeclaration
                state.declarations += refDecl
                refDecl.setReference(funcState)                        
                val refObj = refDecl.createValuedObject(funcName)
                refObj.insertHighlightAnnotations(funcInit)
                
                // Connect the function agrument expressions        
                var i = 0
                for (argument : funcInit.getArguments) {
                    val funcObjArg = funcState.declarations.filter(VariableDeclaration).map[valuedObjects].flatten.get(i)
                    val connectExpr = argument.createKExpression(state, dRegion)
                    var ass = createAssignment(refObj, funcObjArg, connectExpr)
                    dRegion.equations += ass
                    i++
                }
                
                // Create the assignment to the given valued object        
                val outputSource = funcState.findOutputVar("res")
                val outputExpr = refObj.reference => [
                    subReference = outputSource.reference
                ]
                dRegion.equations += createAssignment(vo, outputExpr)
                        
            }
        }
    }
    
    // Connect the outputs of a control statement state to the respective valued objects of the containing state
    def void setOutputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj) {
        // Retrieve the set of outputs of the control statement
        var outputs = findOutputs(stmt, rootState)
        
        // Retrieve the state valued object map
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(VOs.containsKey(newState)) {
            stateVariables = VOs.get(newState)
        } else {
            stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            VOs.put(newState, stateVariables)
        }
        
        // Create an output declaration for each found output
        for(output : outputs) {
            // Get the respective valued object of the containing state
            val outputVO = rootState.findValuedObjectByName(output, true, dRegion)
            outputVO.insertHighlightAnnotations(stmt)
            val outputRootDecl = outputVO.getVariableDeclaration
            val outputType = outputRootDecl.getType
            
            // Create a declaration and valued object for the output 
            val decl = createVariableDeclaration
            newState.declarations += decl
            decl.type = outputType
            decl.output = true            
            val innerOutputVO = decl.createValuedObject(output + "_out")
            innerOutputVO.insertHighlightAnnotations(stmt)
            
            // Add the new create valued object to the ssa list and valued object list
            if(stateVariables.containsKey(output)) {
                var varList = stateVariables.get(output)
                varList.add(innerOutputVO)
            } else {
                var varList = <ValuedObject> newArrayList    
                varList.add(innerOutputVO)
                stateVariables.put(output, varList)
            }
            
            // Create the assignment
            val target = outputVO
            val source = refObj.reference => [
                subReference = innerOutputVO.reference
            ]            
            dRegion.equations += createAssignment(target, source)
        }
    }
    
    // Find the Outputs from the given control statements
    def HashSet<String> findOutputs(IASTNode stmt, State parentState) {
        var outputs = <String> newHashSet
        // Consider only non local variables that are target of an assignment
        if (stmt instanceof IASTBinaryExpression) {
            val operator = stmt.getOperator
            if ((operator >= IASTBinaryExpression.op_assign) && (operator <= IASTBinaryExpression.op_binaryOrAssign)) {
                val op1 = stmt.getOperand1
                if (op1 instanceof IASTIdExpression) {
                    val varName = op1.getName.toString 
                    if (VOs.get(parentState).containsKey(varName)) outputs += varName    
                }
                
            }
        // Check every child for other statements    
        } else {
            for (child : stmt.children) {
                outputs += findOutputs(child, parentState)
            }
        }        
        outputs
    }
    
    // Connect the Inputs of the given control statement to their respective valued objects of the containing state
    def void setInputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj) {
        // Find the needed inputs of teh given control statement
        var inputs = findInputs(stmt, rootState)
        
        // Retrieve the state's valued object map
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(VOs.containsKey(newState)) {
            stateVariables = VOs.get(newState)
        } else {
            stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            VOs.put(newState, stateVariables)
        }
        
        for (input : inputs) {
            // Retrieve the respective valued object of the containing state 
            var inputVO = rootState.findValuedObjectByName(input, false, dRegion)
            if (inputVO === null) {
                inputVO = baseState.findValuedObjectByName(input, false, dRegion)
            }
            val inputRootDecl = inputVO.getVariableDeclaration
            val inputType = inputRootDecl.getType
            
            // Create the input for the control statement state
            val decl = createVariableDeclaration
            newState.declarations += decl
            decl.type = inputType
            decl.input = true            
            val innerInputVO = decl.createValuedObject(input + "_in")
            innerInputVO.insertHighlightAnnotations(stmt)
            
            // Add the new create valued object to the ssa list and valued object list
            if(stateVariables.containsKey(input)) {
                var varList = stateVariables.get(input)
                varList.add(innerInputVO)
            } else {
                var varList = <ValuedObject> newArrayList    
                varList.add(innerInputVO)
                stateVariables.put(input, varList)
            }
            
            // Create the assignment    
            dRegion.equations += createAssignment(refObj, innerInputVO, inputVO.reference)
        }
    }
    
    // Find the Inputs needed for the given control statement
    def HashSet<String> findInputs(IASTNode stmt, State parentState) {
        var inputs = <String> newHashSet
            // Add a found non local variable use
            if(stmt instanceof IASTIdExpression) {
                val varName = stmt.getName.toString
                if (VOs.get(parentState).containsKey(varName)) inputs += varName 
            // Consider only variables that are not target of an assignment    
            } else if (stmt instanceof IASTBinaryExpression) {
                val operator = stmt.getOperator
                if ((operator >= IASTBinaryExpression.op_assign) && (operator <= IASTBinaryExpression.op_binaryOrAssign)) {
                    inputs = findInputs(stmt.getOperand2, parentState)
                } else {
                    inputs = findInputs(stmt.getOperand1, parentState)
                    inputs += findInputs(stmt.getOperand2, parentState)
                }
            // Consider only arguments of a function call    
            } else if (stmt instanceof IASTFunctionCallExpression) {
                val arguments = stmt.getArguments
                for (argument : arguments) {
                    inputs += findInputs(argument, parentState)
                }
            // Test all children of other statements    
            } else {
                for (child : stmt.children) {
                    inputs += findInputs(child, parentState)
                }
            }
        inputs
    }

    // Find the state for the given function name
    def State findFunctionState(String funcName) {
        functions.get(funcName)
    }
    
    // Find the valued object of the given state by its variables name and creates a new valued object if needed
    def ValuedObject findValuedObjectByName(State state, String name, boolean writing, Region dRegion) {
        // Retrieve the last valued object of the variables list
        var ValuedObject vo
        val varList = VOs.get(state).get(name)
        vo = varList.get(varList.length - 1)
        var varName = vo.getName()
        
        // If the last object is the "_out" object the preceding valued object has to be used
        var onlyOut = false
        var hasOut = false
        if ((varName.contains("_out")) && (varName.lastIndexOf("_out") == (varName.length - 4))) {
            hasOut = true
            if (varList.length > 1) {
                vo = varList.get(varList.length - 2)
                varName = vo.getName()
                
            // If the list only contains the "_out" valued object, a preceding one has to be created  
            } else {
                val OffsetAnno = vo.getAnnotations("Offset")
                val LengthAnno = vo.getAnnotations("Length")
                onlyOut = true
                var varDecl = vo.getVariableDeclaration
                varName = varName.substring(0, varName.length-3) + "0"
                val type = varDecl.type
                
                // If the original variable declaration was attached to the state the new one should be attached to the dataflow region
                if (!dRegion.declarations.contains(varDecl)) {
                    varDecl = createVariableDeclaration
                    varDecl.annotations += createTagAnnotation("Hide")
                    varDecl.type = type
                    dRegion.declarations += varDecl
                }
                
                // Create the valued object and add it to the variable list, before the "_out" object
                vo = varDecl.createValuedObject(varName)
                if (OffsetAnno.length > 0) vo.annotations += OffsetAnno.head
                if (LengthAnno.length > 0) vo.annotations += LengthAnno.head                
                varList.add(0, vo) 
            }
        } 
        
        // If the valued object is meant to be read on, a new one has to be created to preserve the SSA-form
        if (writing && !onlyOut) {
            var varDecl = vo.getVariableDeclaration
            var newName = ""
            
            // Create the right valued object suffix
            if (!(varName.lastIndexOf("_in") == varName.length - 3)) {
                val idxOfUS = varName.lastIndexOf("_")
                val varSuffix = varName.substring(idxOfUS + 1)
                val varNmr = Integer.parseInt(varSuffix)
                newName = varName.substring(0, idxOfUS + 1) + (varNmr + 1)    
            } else {
                newName = varName.substring(0, varName.length - 2) + "0"
            }
            
            // Make sure the declaration is attached to the dataflow region
            val type = varDecl.type
            if (!dRegion.declarations.contains(varDecl)) {
                varDecl = createVariableDeclaration
                varDecl.annotations += createTagAnnotation("Hide")
                varDecl.type = type
                dRegion.declarations += varDecl
            }
            
            // Create the valued object
            vo = varDecl.createValuedObject(newName)
            if (hasOut) {
                varList.add(varList.length - 1, vo)
            } else {
                varList.add(vo)    
            }
        } 
        vo
    }
    
    // Connects the last valued of the ssa list to the output valued object for each variable of the given state
    def void linkOutputs(State state, DataflowRegion dRegion) {
        var stateVariables = VOs.get(state)
        for (varList : stateVariables.values) {
            // Retrieve the output valued object
            val outVO = findOutputVar(varList)
            // If an output exists connect it
            if (outVO !== null && (varList.length > 1)) {
                // Retrieve the last ssa valued object
                var lastVO = varList.get(varList.length - 1)
                if(lastVO.getName.contains("_out") && (varList.length > 1)) {
                    lastVO = varList.get(varList.length - 2)
                }
                // Copy the location information of the last ssa vo to the output vo
                if (outVO.annotations.length < 2) {
                    outVO.annotations += createStringAnnotation("Offset", lastVO.getStringAnnotationValue("Offset"))
                    outVO.annotations += createStringAnnotation("Length", lastVO.getStringAnnotationValue("Length"))
                }
                // Add the linking assignment
                dRegion.equations += createAssignment(outVO, lastVO.reference)
            }
        }
    }
    
    // Find the output valued object of the given ssa list
    def ValuedObject findOutputVar(ArrayList<ValuedObject> varList) {
        var ValuedObject res = null
        
        for(var i = 0; (i < varList.length) && (res === null); i++) {
            var varName = varList.get(i).getName
            if (varName.contains("_out")) {
                res = varList.get(i)
            }
        }
        
        res
    }
    
    // Find the output valued object for the given variable name and the given state
    def ValuedObject findOutputVar(State state, String varName) {
        var ValuedObject res = null
        
        var varList = VOs.get(state).get(varName)
        res = varList.findOutputVar
        
        res
    }
    
    // Create a state representation for a call of a not known function
    def State createUnknownFuncState(String funcName, IASTFunctionCallExpression funcCall, boolean writing) {
        // Create the state
        val state = createState(funcName)
        state.label = funcName
        
        // Create an output if needed
        if (writing) {
            val outputDecl = createVariableDeclaration
            outputDecl.output = true
            state.declarations += outputDecl
            val outputVO = outputDecl.createValuedObject("res_out") 
        }
        
        // Create an input for each argument
        for (argument : funcCall.getArguments) {
            val inputDecl = createVariableDeclaration
            inputDecl.input = true
            state.declarations += inputDecl
            val inputVO = inputDecl.createValuedObject("")
        }
        state
    }

}
