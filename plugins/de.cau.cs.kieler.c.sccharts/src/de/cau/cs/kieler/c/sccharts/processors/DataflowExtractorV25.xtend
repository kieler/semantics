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
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import de.cau.cs.kieler.c.sccharts.extensions.IllustratorExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDefinition
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration
import de.cau.cs.kieler.c.sccharts.extensions.CDTConvertExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator
import org.eclipse.cdt.internal.core.dom.parser.c.CASTParameterDeclaration
import org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTReturnStatement
import de.cau.cs.kieler.c.sccharts.extensions.ExpressionConverterExtensionsV3
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIfStatement
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionCallExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTUnaryExpression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import org.eclipse.cdt.internal.core.dom.parser.c.CASTForStatement
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.OperatorType
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSwitchStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer
import de.cau.cs.kieler.c.sccharts.extensions.ValueExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTWhileStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDoStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTCaseStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBreakStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDefaultStatement
import de.cau.cs.kieler.c.sccharts.extensions.BuilderExtensions
import org.eclipse.cdt.core.dom.ast.IASTExpression
import java.util.HashMap
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import org.eclipse.cdt.core.dom.ast.IASTDeclarator
import org.eclipse.cdt.core.dom.ast.IASTArrayDeclarator

/**
 * @author lan
 * 
 */

@SuppressWarnings("all","unchecked")
class DataflowExtractorV25 extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {

    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsSerializeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension ExpressionConverterExtensionsV3
    @Inject extension ValueExtensions
    @Inject extension BuilderExtensions
    
     var functions = <String, State> newHashMap
     var ifCounter = 0;
     var swCounter = 0;
     var forCounter = 0;
     var whileCounter = 0;
     var doCounter = 0;
    
    var VOs = <State, HashMap<String, ArrayList<ValuedObject>>> newHashMap
    
    var State baseState = null

    var ControlflowRegion topCRegion

    override getId() {
        "de.cau.cs.kieler.c.sccharts.dataflowExtractorV25"
    }
    
    override getName() {
        "Dataflow Extractor V2.5"
    }
    
    override process() {
        val tUnit = getModel
        setModel(tUnit.transform as SCCharts)
    }    

    def EObject transform(IASTTranslationUnit ast) {
        println("")
        println("Start dataflowExtractor V2.5")
        
        if(ast === null) {
            return null
        }
        
        val SCChart = createSCChart
        
        baseState = createState("")
        baseState.label = "Welcome to Dataflow Extractor V2.5"
        
        SCChart.rootStates += baseState
        
        topCRegion = baseState.createControlflowRegion("")
        
        //auto created dataflow graph
        for(child : ast.children) {
            
            if(child instanceof CASTFunctionDefinition) {
                val state = buildFunction(child, baseState)
                functions.put(state.label, state)
                topCRegion.states += state
            } else if(child instanceof CASTSimpleDeclaration){
                val decl = createVariableDeclaration
                decl.type = ((child as CASTSimpleDeclaration).getDeclSpecifier as CASTSimpleDeclSpecifier).type.CDTTypeConversion
                
                baseState.declarations += decl
                var HashMap<String, ArrayList<ValuedObject>> baseStateVariables = null
                if(VOs.containsKey(baseState)) {
                    baseStateVariables = VOs.get(baseState)
                } else {
                    baseStateVariables = <String,ArrayList<ValuedObject>> newHashMap
                    VOs.put(baseState, baseStateVariables)    
                }
                
                val declarators = (child as CASTSimpleDeclaration).getDeclarators
                
                for(declarator : declarators) {
                    val varName = declarator.getName.toString
                    var varList = <ValuedObject> newArrayList
                    val VO = decl.createValuedObject(varName + "_0")
                    varList.add(VO)
                    baseStateVariables.put(varName, varList)
                    if (declarator.getInitializer !== null) {
                        if(declarator.getInitializer instanceof CASTEqualsInitializer) {
                            VO.initialValue = createValue(declarator.getInitializer.children.head)
                        }
                    }
                } 
            }
             
        }
        
        println("End of DataflowExtractorV2.5")
        println("")
        
        SCChart
        
    }

    def State buildFunction(CASTFunctionDefinition func, State rootState) {
       //Bestimmt Func Name
        val funcDeclarator = func.getDeclarator as CASTFunctionDeclarator
        val funcName = funcDeclarator.name.toString
        
        val funcOffset = func.getNodeLocations.get(0).getNodeOffset
        val funcLength = func.getNodeLocations.get(0).getNodeLength
        
        val State res = createState(funcName)
        res.label = funcName
        
        res.annotations += createStringAnnotation("Offset", funcOffset.toString)
        res.annotations += createStringAnnotation("Length", funcLength.toString)
        
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(VOs.containsKey(res)) {
            stateVariables = VOs.get(baseState)
        } else {
            stateVariables = <String,ArrayList<ValuedObject>> newHashMap
            VOs.put(res, stateVariables)    
        }
    
        //Bestimme Inputs
        val parameters = funcDeclarator.getParameters
        for (par : parameters) {
            val parDecl = par as CASTParameterDeclaration
            
            val decl = createVariableDeclaration
            decl.type = (parDecl.getDeclSpecifier as CASTSimpleDeclSpecifier).type.CDTTypeConversion
            decl.input = true
            
            res.declarations += decl
            
            val varName = parDecl.getDeclarator.getName.toString
            var varList = <ValuedObject> newArrayList
            
            val VO = decl.createValuedObject(varName + "_in")
            
            varList.add(VO)
            stateVariables.put(varName, varList)
            
            
        }
        
        //Bestimmt Rückgabe
        val declSpecifier = func.getDeclSpecifier
        if (declSpecifier !== null) {
            if (declSpecifier instanceof CASTSimpleDeclSpecifier) {
                val retDecl = createVariableDeclaration
                retDecl.type = (declSpecifier as CASTSimpleDeclSpecifier).type.CDTTypeConversion
                retDecl.output = true   
                
                res.declarations += retDecl
                
                var varName = "res"
                var varList = <ValuedObject> newArrayList
                
                val resVO = retDecl.createValuedObject(varName + "_out")
                
                varList.add(resVO)
                stateVariables.put(varName, varList)            
            }
        }
        
        val body = func.getBody
        if (body instanceof CASTCompoundStatement) {
            val bodyRegion = buildCompound(body, res)
            res.regions += bodyRegion
            bodyRegion.label = funcName
        } else {
            println("Func Body ist kein CompoundStatement")
        }
        
        res
    }
    
    def DataflowRegion buildCompound(CASTCompoundStatement body, State bodyState) {
        val res = createDataflowRegion("")
        
        val statements = body.getStatements
        for (stmt : statements) {
            if (stmt instanceof CASTDeclarationStatement) {
                
                val declaration = stmt.getDeclaration
                if(declaration instanceof CASTSimpleDeclaration) {
                    val decl = addDeclaration(declaration, bodyState, res)
                    res.declarations += decl
                    decl.annotations += createTagAnnotation("Hide")
                }
                
            } else if (stmt instanceof CASTExpressionStatement) {
                
                val expression = (stmt as CASTExpressionStatement).getExpression
                
                if (expression instanceof CASTBinaryExpression) {
                    
                    if(expression.getOperator == 17) {
                        val kEffects = createKEffect(expression, bodyState, res)
                        for (kEffect : kEffects) {
                            res.equations += kEffect
                        }
                    } else {
                        println("ERROR: BinaryExpression im Compound keine Zuweisung")
                    }
                    
                } else {
                    println("ERROR: Expression Statement kein BinaryExpression")
                }
                
                
            } else if (stmt instanceof CASTIfStatement) {
                
                val ifStmt = (stmt as CASTIfStatement)
                buildIf(ifStmt, bodyState, res)
                
            } else if (stmt instanceof CASTSwitchStatement) {
                
                val swStmt = (stmt as CASTSwitchStatement)
                buildSwitch(swStmt, bodyState, res)
                
            } else if (stmt instanceof CASTForStatement) {
                
                val forStmt = (stmt as CASTForStatement)
                buildFor(forStmt, bodyState, res)
                
            } else if (stmt instanceof CASTWhileStatement) {
                
                val whileStmt = (stmt as CASTWhileStatement)
                buildWhile(whileStmt, bodyState, res)
                
            } else if (stmt instanceof CASTDoStatement) {
                
                val doStmt = (stmt as CASTDoStatement)
                buildDo(doStmt, bodyState, res)
                
            } else if (stmt instanceof CASTReturnStatement) {
                
                val returnStmt = stmt as CASTReturnStatement
                val retKExpr = createKExpression(returnStmt.getReturnValue, bodyState, res)
                
                val retVO = bodyState.findValuedObjectByName("res", true, res)
                res.equations += createAssignment(retVO, retKExpr)
                
            }
        }
        linkOutputs(bodyState, res)
        
        println("")
        println("Compound in Dataflow umgewandelt - equations:")
        for (eq : res.equations) {
            println(eq.toString)
        }
        
        println("")
        
        res
    }
    
    def buildIf(CASTIfStatement ifStmt, State rootState, DataflowRegion dRegion) {
        
        val ifState = createState("If_" + ifCounter)
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(ifState)
        val ifObj = refDecl.createValuedObject("If_" + ifCounter)
        ifCounter++
        
        setInputs(ifStmt, rootState, ifState, dRegion, ifObj)
        setOutputs(ifStmt, rootState, ifState, dRegion, ifObj)
        val cRegion = ifState.createControlflowRegion("")
        val initState = cRegion.createState("Init")
        initState.initial = true
        
        val thenState = cRegion.createState("Then")
        val thenCompound = ifStmt.getThenClause as CASTCompoundStatement
        val thenRegion = buildCompound(thenCompound, ifState)
        thenState.label = "Then"
        thenState.regions += thenRegion
        val thenTransition = initState.createTransitionTo(thenState)
        thenTransition.trigger = (ifStmt.getConditionExpression).createKExpression(ifState, dRegion)
        
        val elseState = cRegion.createState("Else")
        val elseCompound = ifStmt.getElseClause as CASTCompoundStatement
        val elseRegion = buildCompound(elseCompound, ifState)
        elseState.label = "Else"
        elseState.regions += elseRegion
        initState.createTransitionTo(elseState)
        
    }
    
    def buildSwitch(CASTSwitchStatement swStmt, State rootState, DataflowRegion dRegion) {
        val swState = createState("Switch_" + swCounter)
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(swState)
        val swObj = refDecl.createValuedObject("Switch_" + swCounter)
        swCounter++
        
        setInputs(swStmt, rootState, swState, dRegion, swObj)
        setOutputs(swStmt, rootState, swState, dRegion, swObj)
        
        val cRegion = swState.createControlflowRegion("")
        
        val controller = (swStmt.getControllerExpression).createKExpression(swState, dRegion)
        cRegion.label = "switch (" + controller.serialize + ")"
        
        val initState = cRegion.createState("Init")
        initState.initial = true
        
        val finalState = cRegion.createState("Fin")
        finalState.final = true
        
        val swBody = swStmt.getBody as CASTCompoundStatement
        
        for (var i = 0; i < swBody.children.length; i++) {
            
            var child = swBody.children.get(i)
            var State prevNoBreak = null
            if(child instanceof CASTCaseStatement) {
                val caseState = cRegion.createState("")
                if(prevNoBreak !== null) {
                    prevNoBreak.createTransitionTo(caseState)
                    prevNoBreak = null
                }
                val caseTransition = initState.createTransitionTo(caseState)
                caseTransition.trigger = (child as CASTCaseStatement).getExpression.createKExpression(swState, dRegion)
                
                caseState.label = controller.serialize + " == " + caseTransition.trigger.serialize
                
                var caseBody = new CASTCompoundStatement
                while (!(swBody.children.get(i + 1) instanceof CASTCaseStatement) && !(swBody.children.get(i + 1) instanceof CASTBreakStatement) && !(swBody.children.get(i + 1) instanceof CASTDefaultStatement)) {
                    i++
                    val stmt = swBody.children.get(i)
                    caseBody.addStatement((stmt as IASTStatement).copy())
                }
                caseState.regions += buildCompound(caseBody,swState)
                
                if (swBody.children.get(i + 1) instanceof CASTBreakStatement) {
                    caseState.createTransitionTo(finalState)
                    i++
                } else {
                    prevNoBreak = caseState
                }
            } else if (child instanceof CASTDefaultStatement) {
                val defaultState = cRegion.createState("default")
                if(prevNoBreak !== null) {
                    prevNoBreak.createTransitionTo(defaultState)
                }
                val defaultTransition = initState.createTransitionTo(defaultState)
                
                var defaultBody = new CASTCompoundStatement
                while((i+1) < swBody.children.length) {
                    i++
                    val stmt = swBody.children.get(i)
                    defaultBody.addStatement((stmt as IASTStatement).copy())
                }
                defaultState.regions += buildCompound(defaultBody, swState)
                val finTransition = defaultState.createTransitionTo(finalState)
            }
        }       
    }
    
    def buildFor(CASTForStatement forStmt, State rootState, DataflowRegion dRegion) {
        
        val forState = createState("For_" + forCounter)
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(forState)
        val forObj = refDecl.createValuedObject("For_" + forCounter)
        
        setInputs(forStmt, rootState, forState, dRegion, forObj)
        setOutputs(forStmt, rootState, forState, dRegion, forObj)
        println("")
        println("create For CondExpr: " + forStmt.getConditionExpression.exprToString)
        val condExpr = forStmt.getConditionExpression.exprToString
        println("")
        println("create For InitExpr: " + forStmt.getInitializerStatement.exprToString)
        val initExpr = forStmt.getInitializerStatement.exprToString
        println("")
        println("Create For ItExpression: " + forStmt.getIterationExpression.exprToString)
        val itExpr = forStmt.getIterationExpression.exprToString
        println("")
        
        forState.label = "for (" + initExpr.serialize + "; " + condExpr.serialize + "; " + itExpr.serialize + ")"
        forCounter++
        /*
        val initExpr = (forStmt.getInitializerStatement() as CASTExpressionStatement).getExpression
        if(initExpr instanceof CASTBinaryExpression) {
            val forDInitRegion = createDataflowRegion("")
            forState.regions += forDInitRegion
            forDInitRegion.label = "Initialization"
            val initBExpr = initExpr as CASTBinaryExpression
            if(initBExpr.getOperator == 17) {
                val source = forState.findValuedObjectByName((initBExpr.getOperand1 as CASTIdExpression).getName.toString, false, forDInitRegion)
                val target = createKExpression(initBExpr.getOperand2, forState, forDInitRegion)
                forDInitRegion.equations += createAssignment(source, target)
            }
        }
        
        
        val forDIterationRegion = createDataflowRegion("")
        forState.regions += forDIterationRegion
        forDIterationRegion.label = "Iteration"
        
        val itStmt = forStmt.getIterationExpression
        if (itStmt instanceof CASTUnaryExpression) {
            val unExpr = itStmt as CASTUnaryExpression
            val unOp = unExpr.getOperator
            
            if (unOp == 9 ) {
                val controlVarIn = forState.findValuedObjectByName((unExpr.getOperand as CASTIdExpression).getName.toString, false, forDIterationRegion)
                val controlVarOut = forState.findValuedObjectByName((unExpr.getOperand as CASTIdExpression).getName.toString, true, forDIterationRegion)
                val addKexpression = createOperatorExpression(OperatorType::ADD)
                addKexpression.subExpressions += createIntValue(1)
                addKexpression.subExpressions += controlVarIn.reference
                
                forDIterationRegion.equations += createAssignment(controlVarOut, addKexpression)
            } else if (unOp == 10) {
                val controlVar = forState.findValuedObjectByName((unExpr.getOperand as CASTIdExpression).getName.toString, true, forDIterationRegion)
                val addKexpression = createOperatorExpression(OperatorType::SUB)
                addKexpression.subExpressions += createIntValue(1)
                addKexpression.subExpressions += controlVar.reference
                
                forDIterationRegion.equations += createAssignment(controlVar, addKexpression)
            }
        }
        */
        val forDBodyRegion = buildCompound(forStmt.getBody as CASTCompoundStatement, forState) 
        forState.regions += forDBodyRegion
        forDBodyRegion.label = forState.label
        
    }
    
    def buildWhile(CASTWhileStatement whileStmt, State rootState, DataflowRegion dRegion) {
                
        val whileState = createState("While_" + whileCounter)
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(whileState)
        val whileObj = refDecl.createValuedObject("While_" + whileCounter)
        
        setInputs(whileStmt, rootState, whileState, dRegion, whileObj)
        setOutputs(whileStmt, rootState, whileState, dRegion, whileObj)
        val condExpr = createKExpression(whileStmt.getCondition, whileState, dRegion)
        whileState.label = "while " + condExpr.serialize
        whileCounter++
        
        val whileDBodyRegion = buildCompound(whileStmt.getBody as CASTCompoundStatement, whileState) 
        whileState.regions += whileDBodyRegion
        whileDBodyRegion.label = whileState.label
        
    }
    
    def buildDo(CASTDoStatement doStmt, State rootState, DataflowRegion dRegion) {
                
        val doState = createState("Do_" + doCounter)
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(doState)
        val doObj = refDecl.createValuedObject("Do_" + doCounter)
        
        setInputs(doStmt, rootState, doState, dRegion, doObj)
        setOutputs(doStmt, rootState, doState, dRegion, doObj)
        val condExpr = createKExpression(doStmt.getCondition, doState, dRegion)
        doState.label = "do ... while " + condExpr.serialize
        doCounter++
        
        val doDBodyRegion = buildCompound(doStmt.getBody as CASTCompoundStatement, doState) 
        doState.regions += doDBodyRegion
        doDBodyRegion.label = doState.label
               
    }
    
    def VariableDeclaration addDeclaration(CASTSimpleDeclaration declaration, State state, DataflowRegion dRegion) {
        
        val res = createVariableDeclaration
        res.type = (declaration.getDeclSpecifier as CASTSimpleDeclSpecifier).type.CDTTypeConversion
        
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(VOs.containsKey(state)) {
            stateVariables = VOs.get(state)    
        } else {
            stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            VOs.put(state, stateVariables)
        }
        
        val declarators = declaration.getDeclarators
        for(decl : declarators) {
            var varName = decl.getName.toString
            
            if (decl instanceof IASTArrayDeclarator) {
                println("")
                println("Found ArrayDeclarator")
                var varList = <ValuedObject> newArrayList
                
                val vo = res.createValuedObject(varName + "_0")
                varList.add(vo)
                stateVariables.put(varName, varList)
                val arrayModifiers = decl.getArrayModifiers
                println("arrayModifiers: " + arrayModifiers)
                
                for (arrayModifier : arrayModifiers) {
                    println("ArrayModifier constantExpression: " + arrayModifier.getConstantExpression)
                    vo.cardinalities.add(createKExpression(arrayModifier.getConstantExpression, state, dRegion))
                }
                
                
            } else {
                var varList = <ValuedObject> newArrayList
            
                val vo = res.createValuedObject(varName + "_0")
                varList.add(vo)
                stateVariables.put(varName, varList)
            
                if(decl.getInitializer !== null) {
                    vo.initializeValuedObject(decl, state, dRegion)
                }
            }
            
            
        }
        res
    }
    
    def initializeValuedObject(ValuedObject vo, IASTDeclarator decl, State state, DataflowRegion dRegion) {
        val initializer = decl.getInitializer
        if (initializer instanceof CASTEqualsInitializer) {
            if(!(initializer.children.head instanceof CASTFunctionCallExpression)) {
                        
                val initExpr = createKExpression(initializer.children.head, state, dRegion)
                dRegion.equations += createAssignment(vo, initExpr)
            } else {
                val funcInit = initializer.children.head as CASTFunctionCallExpression
                val funcName = (funcInit.getFunctionNameExpression as CASTIdExpression).getName.toString
                val funcState = findFunctionState(funcName)
                        
                val refDecl = createReferenceDeclaration
                state.declarations += refDecl
                refDecl.setReference(funcState)
                        
                val refObj = refDecl.createValuedObject(funcName)
                        
                var i = 0
                for (argument : funcInit.getArguments) {
                    val funcObjArg = funcState.declarations.filter(VariableDeclaration).map[valuedObjects].flatten.get(i)
                    val connectObj = state.findValuedObjectByName((argument as CASTIdExpression).getName.toString, false, dRegion)
                    var ass = createAssignment(refObj, funcObjArg, connectObj.reference)
                    dRegion.equations += ass
                    i++
                }
                        
                val outputSource = funcState.findOutputVar("res")
                val outputExpr = refObj.reference => [
                    subReference = outputSource.reference
                ]
                dRegion.equations += createAssignment(vo, outputExpr)
                        
            }
        }
    }
    
    def ArrayList<String> removeDuplicates(ArrayList<String> list) {
       var res = <String> newArrayList
       
       for(elem : list) {
           var found = false
           
           for(var i = 0; (i < res.length) && (!found); i++) {
               found = res.get(i).equals(elem)
           }
           
           if(!found) {
               res += elem
           }
       }
       
       res 
    }
    
    def setOutputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj) {
        var outputs = findOutputs(stmt)
        outputs = removeDuplicates(outputs)
        
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(VOs.containsKey(newState)) {
            stateVariables = VOs.get(newState)
        } else {
            stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            VOs.put(newState, stateVariables)
        }
        
        for(output : outputs) {
            val outputVO = rootState.findValuedObjectByName(output, true, dRegion)
            val outputRootDecl = outputVO.getVariableDeclaration
            val outputType = outputRootDecl.getType
            
            val decl = createVariableDeclaration
            newState.declarations += decl
            decl.type = outputType
            decl.output = true
            
            val innerOutputVO = decl.createValuedObject(output + "_out")
            if(stateVariables.containsKey(output)) {
                var varList = stateVariables.get(output)
                varList.add(innerOutputVO)
            } else {
                var varList = <ValuedObject> newArrayList    
                varList.add(innerOutputVO)
                stateVariables.put(output, varList)
            }
            
            val target = outputVO
            val source = refObj.reference => [
                subReference = innerOutputVO.reference
            ]
            dRegion.equations += createAssignment(target, source)
        }
    }
    
    def ArrayList<String> findOutputs(IASTNode stmt) {
        var res = <String> newArrayList
        
        if (stmt instanceof CASTBinaryExpression) {
            val binExpr = stmt as CASTBinaryExpression
            if (binExpr.getOperator == 17) {
                res += (binExpr.getOperand1 as CASTIdExpression).getName.toString
            }
        } else {
            for (child : stmt.children) {
                res += findOutputs(child)
            }
        }
        
        res
    }
    
    def setInputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj) {
        var inputs = findInputs(stmt)
        inputs = removeDuplicates(inputs)
        
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(VOs.containsKey(newState)) {
            stateVariables = VOs.get(newState)
        } else {
            stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            VOs.put(newState, stateVariables)
        }
        
        for (input : inputs) {
            var inputVO = rootState.findValuedObjectByName(input, false, dRegion)
            if (inputVO === null) {
                inputVO = baseState.findValuedObjectByName(input, false, dRegion)
            }
            val inputRootDecl = inputVO.getVariableDeclaration
            val inputType = inputRootDecl.getType
            
            val decl = createVariableDeclaration
            newState.declarations += decl
            decl.type = inputType
            decl.input = true
            
            val innerInputVO = decl.createValuedObject(input + "_in")
            if(stateVariables.containsKey(input)) {
                var varList = stateVariables.get(input)
                varList.add(innerInputVO)
            } else {
                var varList = <ValuedObject> newArrayList    
                varList.add(innerInputVO)
                stateVariables.put(input, varList)
            }
                
            dRegion.equations += createAssignment(refObj, innerInputVO, inputVO.reference)
        }
    }
    
    def ArrayList<String> findInputs(IASTNode stmt) {
        var res = <String> newArrayList
            
            if(stmt instanceof CASTIdExpression) {
                res += (stmt as CASTIdExpression).getName.toString
            } else if (stmt instanceof CASTBinaryExpression) {
                val binExpr = stmt as CASTBinaryExpression
                if(binExpr.getOperator == 17) {
                    res = findInputs(binExpr.getOperand2)
                } else {
                    res = findInputs(binExpr.getOperand1)
                    res += findInputs(binExpr.getOperand2)
                }
            } else if (stmt instanceof CASTFunctionCallExpression) {
                val arguments = (stmt as CASTFunctionCallExpression).getArguments
                for(argument : arguments) {
                    res += findInputs(argument)
                }
            } else {
                for(child : stmt.children) {
                    res += findInputs(child)
                }
            }
            
        res
    }

    
    def State findFunctionState(String funcName) {
        functions.get(funcName)
    }
    
    def ValuedObject findValuedObjectByName(State state, String name, boolean writing, Region dRegion) {
        var ValuedObject res
        val varList = VOs.get(state).get(name)
//        println("")
//        println("looking for " + name + " in state " + state.getName() + " with writing: " + writing)
//        println("current varList: " + varList)
        res = varList.get(varList.length - 1)
//        println("last Elem found: " + res)
        var varName = res.getName()
        var onlyOut = false
        if(varName.contains("_out")) {
//            println("contains _out")
            if(varList.length > 1) {
                res = varList.get(varList.length - 2)
//                println("use now: " + res)
                varName = res.getName()
            } else {
                onlyOut = true
                var varDecl = res.getVariableDeclaration
                varName = varName.substring(0, varName.length-3) + "0"
                val type = varDecl.type
                
                if(!dRegion.declarations.contains(varDecl)) {
                    varDecl = createVariableDeclaration
                    varDecl.annotations += createTagAnnotation("Hide")
                    varDecl.type = type
                    dRegion.declarations += varDecl
                }
                
                res = varDecl.createValuedObject(varName)
                varList.add(0, res)
                
            }
        } 
        if(writing && !onlyOut) {
            var varDecl = res.getVariableDeclaration
            var newName = ""
            
            if (!(varName.lastIndexOf("_in") == varName.length - 3)) {
                val varSuffix = varName.substring(varName.lastIndexOf("_") + 1)
                val varNmr = Integer.parseInt(varSuffix)
                newName = varName.substring(0, varName.lastIndexOf("_") + 1) + (varNmr + 1)    
            } else {
                newName = varName.substring(0, varName.length - 2) + "0"
            }
            
            
            
            val type = varDecl.type
            if(!dRegion.declarations.contains(varDecl)) {
                varDecl = createVariableDeclaration
                varDecl.annotations += createTagAnnotation("Hide")
                varDecl.type = type
                dRegion.declarations += varDecl
            }
            
            res = varDecl.createValuedObject(newName)
//            println("writing==true => use: " + res)
            varList.add(res)
        }
         
//        println("") 
        res
    }
    
    def linkOutputs(State state, DataflowRegion dRegion) {
        println("")
        println("inside linkOutputs for state: " + state.getName)
        var stateVariables = VOs.get(state)
        for (varList : stateVariables.values) {
            val outVO = findOutputVar(varList)
            if (outVO !== null && (varList.length > 1)) {
                var lastVO = varList.get(varList.length - 1)
                if(lastVO.getName.contains("_out") && (varList.length > 1)) {
                    lastVO = varList.get(varList.length - 2)
                }
                println("linking " + lastVO.getName + " onto " + outVO.getName)
                dRegion.equations += createAssignment(outVO, lastVO.reference)
            }
        }
        println("")
    }
    
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
    
    def ValuedObject findOutputVar(State state, String varName) {
        var ValuedObject res = null
        
        var varList = VOs.get(state).get(varName)
        res = varList.findOutputVar
        
        res
    }

}
