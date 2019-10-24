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
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.c.sccharts.extensions.CDTConvertExtensions
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.c.sccharts.extensions.ExpressionConverterExtensionsV3
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.core.dom.ast.IASTNode
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.c.sccharts.extensions.ValueExtensions
import de.cau.cs.kieler.c.sccharts.extensions.BuilderExtensions
import org.eclipse.cdt.core.dom.ast.IASTExpression
import java.util.HashMap
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import org.eclipse.cdt.core.dom.ast.IASTDeclarator
import org.eclipse.cdt.core.dom.ast.IASTArrayDeclarator
import de.cau.cs.kieler.annotations.Annotatable
import org.eclipse.cdt.core.dom.ast.IASTNode.CopyStyle
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement
import org.eclipse.cdt.core.dom.ast.IASTCompoundStatement
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier
import org.eclipse.cdt.core.dom.ast.IASTEqualsInitializer
import org.eclipse.cdt.core.dom.ast.IASTFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.IASTParameterDeclaration
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
        //println("")
        //println("Start dataflowExtractor V2.5")
        
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
            
            if(child instanceof IASTFunctionDefinition) {
                val state = buildFunction(child, baseState)
                functions.put(state.label, state)
                topCRegion.states += state
            } else if(child instanceof IASTSimpleDeclaration){
                val decl = createVariableDeclaration
                decl.type = ((child as IASTSimpleDeclaration).getDeclSpecifier as IASTSimpleDeclSpecifier).type.CDTTypeConversion
                
                baseState.declarations += decl
                var HashMap<String, ArrayList<ValuedObject>> baseStateVariables = null
                if(VOs.containsKey(baseState)) {
                    baseStateVariables = VOs.get(baseState)
                } else {
                    baseStateVariables = <String,ArrayList<ValuedObject>> newHashMap
                    VOs.put(baseState, baseStateVariables)    
                }
                
                val declarators = (child as IASTSimpleDeclaration).getDeclarators
                
                for(declarator : declarators) {
                    val varName = declarator.getName.toString
                    var varList = <ValuedObject> newArrayList
                    val VO = decl.createValuedObject(varName + "_0")
                    
                    VO.insertHighlightAnnotations(declarator)
                    
                    varList.add(VO)
                    baseStateVariables.put(varName, varList)
                    if (declarator.getInitializer !== null) {
                        if(declarator.getInitializer instanceof IASTEqualsInitializer) {
                            VO.initialValue = createValue(declarator.getInitializer.children.head)
                        }
                    }
                } 
            }
             
        }
        
        printVOs()
        
        //println("End of DataflowExtractorV2.5")
        //println("")
        
        SCChart
        
    }

    def State buildFunction(IASTFunctionDefinition func, State rootState) {
       //Bestimmt Func Name
        val funcDeclarator = func.getDeclarator as CASTFunctionDeclarator
        val funcName = funcDeclarator.name.toString
        
        val State res = createState(funcName)
        res.label = funcName
        
        res.insertHighlightAnnotations(func)
        
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
            val parDecl = par as IASTParameterDeclaration
            
            val decl = createVariableDeclaration
            decl.type = (parDecl.getDeclSpecifier as IASTSimpleDeclSpecifier).type.CDTTypeConversion
            decl.input = true
            
            res.declarations += decl
            
            val varName = parDecl.getDeclarator.getName.toString
            var varList = <ValuedObject> newArrayList
            
            val VO = decl.createValuedObject(varName + "_in")
            VO.insertHighlightAnnotations(parDecl)
            
            varList.add(VO)
            stateVariables.put(varName, varList)
            
            
        }
        
        //Bestimmt Rückgabe
        val declSpecifier = func.getDeclSpecifier
        if (declSpecifier !== null) {
            if (declSpecifier instanceof IASTSimpleDeclSpecifier) {
                val retDecl = createVariableDeclaration
                retDecl.type = (declSpecifier as IASTSimpleDeclSpecifier).type.CDTTypeConversion
                retDecl.output = true   
                
                res.declarations += retDecl
                
                var varName = "res"
                var varList = <ValuedObject> newArrayList
                
                val resVO = retDecl.createValuedObject(varName + "_out")
                resVO.insertHighlightAnnotations(declSpecifier)
                
                varList.add(resVO)
                stateVariables.put(varName, varList)            
            }
        }
        
        val body = func.getBody
        if (body instanceof IASTCompoundStatement) {
            val bodyRegion = buildCompound(body, res)
            res.regions += bodyRegion
            bodyRegion.label = funcName
        } else {
            //println("Func Body ist kein CompoundStatement")
        }
        
        res
    }
    
    def DataflowRegion buildCompound(IASTCompoundStatement body, State bodyState) {
        val res = createDataflowRegion("")
        
        res.insertHighlightAnnotations(body)
        
        val statements = body.getStatements
        for (stmt : statements) {
            buildStatement(stmt, bodyState, res)
        }
        linkOutputs(bodyState, res)
        
        //println("")
        //println("Compound in Dataflow umgewandelt - equations:")
        for (eq : res.equations) {
            //println(eq.toString)
        }
        
        //println("")
        
        res
    }
    
    def buildStatement(IASTStatement stmt, State rootState, DataflowRegion dRegion) {
        if (stmt instanceof IASTDeclarationStatement) {
                
            val declaration = stmt.getDeclaration
            if(declaration instanceof IASTSimpleDeclaration) {
                val decl = addDeclaration(declaration, rootState, dRegion)
                dRegion.declarations += decl
                decl.annotations += createTagAnnotation("Hide")
            } 
                
        } else if (stmt instanceof IASTExpressionStatement) {
                
            val expression = (stmt as IASTExpressionStatement).getExpression
                
            if (expression instanceof IASTBinaryExpression) {
                    
                if(expression.getOperator == 17) {
                    val kEffects = createKEffect(expression, rootState, dRegion)
                    for (kEffect : kEffects) {
                        dRegion.equations += kEffect
                    }
                } else {
                    //println("ERROR: BinaryExpression im Compound keine Zuweisung")
                }
                    
            } else {
                //println("ERROR: Expression Statement kein BinaryExpression")
            }
                
                
        } else if (stmt instanceof IASTIfStatement) {
                
            val ifStmt = (stmt as IASTIfStatement)
            buildIf(ifStmt, rootState, dRegion)
                
        } else if (stmt instanceof IASTSwitchStatement) {
                
            val swStmt = (stmt as IASTSwitchStatement)
            buildSwitch(swStmt, rootState, dRegion)
                
        } else if (stmt instanceof IASTForStatement) {
                
            val forStmt = (stmt as IASTForStatement)
            buildFor(forStmt, rootState, dRegion)
                
        } else if (stmt instanceof IASTWhileStatement) {
                
            val whileStmt = (stmt as IASTWhileStatement)
            buildWhile(whileStmt, rootState, dRegion)
                
        } else if (stmt instanceof IASTDoStatement) {
               
            val doStmt = (stmt as IASTDoStatement)
            buildDo(doStmt, rootState, dRegion)
                
        } else if (stmt instanceof IASTReturnStatement) {
                
            val returnStmt = stmt as IASTReturnStatement
            val retKExpr = createKExpression(returnStmt.getReturnValue, rootState, dRegion)
                
            val retVO = rootState.findValuedObjectByName("res", true, dRegion)
            retVO.insertHighlightAnnotations(stmt)
            dRegion.equations += createAssignment(retVO, retKExpr)
                
        }
    }
    
    def buildIf(IASTIfStatement ifStmt, State rootState, DataflowRegion dRegion) {
        
        val ifState = createState("If_" + ifCounter)
        //topCRegion.states += ifState
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(ifState)
        val ifObj = refDecl.createValuedObject("If_" + ifCounter)
        ifObj.insertHighlightAnnotations(ifStmt)
        ifCounter++
        
        setInputs(ifStmt, rootState, ifState, dRegion, ifObj)
        setOutputs(ifStmt, rootState, ifState, dRegion, ifObj)
        val cRegion = ifState.createControlflowRegion("")
        val initState = cRegion.createState("Init")
        initState.insertHighlightAnnotations(ifStmt)
        initState.initial = true
        
        val thenState = cRegion.createState("Then")
        val thenCompound = ifStmt.getThenClause as IASTCompoundStatement
        thenState.insertHighlightAnnotations(thenCompound)
        val thenRegion = buildCompound(thenCompound, ifState)
        thenState.label = "Then"
        thenState.regions += thenRegion
        val thenTransition = initState.createTransitionTo(thenState)
        thenTransition.trigger = (ifStmt.getConditionExpression).createKExpression(ifState, dRegion)
        
        if (ifStmt.getElseClause !== null) {
            val elseState = cRegion.createState("Else")
            val elseCompound = ifStmt.getElseClause as IASTCompoundStatement
            elseState.insertHighlightAnnotations(elseCompound)
            val elseRegion = buildCompound(elseCompound, ifState)
            elseState.label = "Else"
            elseState.regions += elseRegion
            initState.createTransitionTo(elseState)
        }
        
    }
    
    def buildSwitch(IASTSwitchStatement swStmt, State rootState, DataflowRegion dRegion) {
        println("")
        println("Inside New buildSwitch")
        
        val swState = createState("Switch_" + swCounter)
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(swState)
        val swObj = refDecl.createValuedObject("Switch_" + swCounter)
        
        swObj.insertHighlightAnnotations(swStmt)
        swCounter++
        println("Switch State erstellt")
        
        setInputs(swStmt, rootState, swState, dRegion, swObj)
        setOutputs(swStmt, rootState, swState, dRegion, swObj)
        println("in und outputs erstellt")
        
        val cRegion = swState.createControlflowRegion("")
        cRegion.insertHighlightAnnotations(swStmt.getBody)
        
        val controller = swStmt.getControllerExpression.createKExpression(swState, dRegion)
        cRegion.label = "switch (" + controller.serialize + ")"
        println("cRegion erstellt und betitelt")        
        
        val initState = cRegion.createState("Init")
        initState.insertHighlightAnnotations(swStmt.getBody)
        initState.initial = true
        println("InitState erstellt")
        
        val finalState = cRegion.createState("final")
        finalState.insertHighlightAnnotations(swStmt.getBody)
        finalState.final = true
        println("Final State erstellt")
        
        val swBody = swStmt.getBody as IASTCompoundStatement
        println("Build SwitchBody")
        var State noBreakCase
        var State activeCase
        var DataflowRegion activeDRegion
        for (child : swBody.children) {
            
            if (child instanceof IASTCaseStatement || child instanceof IASTDefaultStatement) {
                noBreakCase = activeCase
                if (activeCase !== null) {
                    linkOutputs(swState, activeDRegion)
                
                    if (activeDRegion !== null) {
                        println("Assignments in: " + activeCase.label)
                        for (ass : activeDRegion.equations) {
                            //println(ass.serialize)
                        }
                    }
                }
                activeCase = cRegion.createState("")
                activeCase.insertHighlightAnnotations(child)
                
                activeDRegion = createDataflowRegion("")
                activeCase.regions += activeDRegion
                activeDRegion.insertHighlightAnnotations(child)
                
                if (noBreakCase !== null) {
                    noBreakCase.createTransitionTo(activeCase)
                    noBreakCase = null
                }
                
                if (child instanceof IASTCaseStatement) {
                    val caseTransition = initState.createTransitionTo(activeCase)
                    caseTransition.trigger = child.getExpression.createKExpression(swState, dRegion)
                    
                    activeCase.label = controller.serialize + " == " + caseTransition.trigger.serialize
                } else {
                    initState.createTransitionTo(activeCase)
                    activeCase.createTransitionTo(finalState)
                    
                    activeCase.label = "default"
                }
            } else if (child instanceof IASTBreakStatement) {
                activeCase.createTransitionTo(finalState)
                linkOutputs(swState, activeDRegion)
                activeCase = null
            } else {
                buildStatement(child as IASTStatement, swState, activeDRegion)
            }
            
        }
        linkOutputs(swState, activeDRegion)
        println("Assignments in: " + activeCase.label)
        for (ass : activeDRegion.equations) {
            //println(ass.serialize)
        }
        println("Build Switch done")
        println("")
    }
    /*
    def buildSwitchOld(IASTSwitchStatement swStmt, State rootState, DataflowRegion dRegion) {
        val swState = createState("Switch_" + swCounter)
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(swState)
        val swObj = refDecl.createValuedObject("Switch_" + swCounter)
        
        swObj.insertHighlightAnnotations(swStmt)
        swCounter++
        
        setInputs(swStmt, rootState, swState, dRegion, swObj)
        setOutputs(swStmt, rootState, swState, dRegion, swObj)
        
        val cRegion = swState.createControlflowRegion("")
        cRegion.insertHighlightAnnotations(swStmt)
        
        val controller = (swStmt.getControllerExpression).createKExpression(swState, dRegion)
        cRegion.label = "switch (" + controller.serialize + ")"
        
        val initState = cRegion.createState("Init")
        initState.insertHighlightAnnotations(swStmt)
        initState.initial = true
        
        val finalState = cRegion.createState("Fin")
        finalState.insertHighlightAnnotations(swStmt)
        finalState.final = true
        
        val swBody = swStmt.getBody as IASTCompoundStatement
        
        for (var i = 0; i < swBody.children.length; i++) {
            
            var child = swBody.children.get(i)
            var State prevNoBreak = null
            if(child instanceof IASTCaseStatement) {
                val caseState = cRegion.createState("")
                caseState.insertHighlightAnnotations(child)
                
                if(prevNoBreak !== null) {
                    prevNoBreak.createTransitionTo(caseState)
                    prevNoBreak = null
                }
                val caseTransition = initState.createTransitionTo(caseState)
                caseTransition.trigger = (child as IASTCaseStatement).getExpression.createKExpression(swState, dRegion)
                
                caseState.label = controller.serialize + " == " + caseTransition.trigger.serialize
                
                var caseBody = new IASTCompoundStatement
                while (!(swBody.children.get(i + 1) instanceof IASTCaseStatement) && !(swBody.children.get(i + 1) instanceof IASTBreakStatement) && !(swBody.children.get(i + 1) instanceof IASTDefaultStatement)) {
                    i++
                    val stmt = swBody.children.get(i).copy(CopyStyle.withLocations)
                    caseBody.addStatement((stmt as IASTStatement).copy(CopyStyle.withLocations))
                    //println("Statement in neues Compound kopiert! Neue Locations: ")
                    //println(stmt.getNodeLocations.get(0).getNodeOffset)
                    //println(stmt.getNodeLocations.get(0).getNodeLength)
//                    //println(stmt.getFileLocation.toString)
                }
                val caseRegion = buildCompound(caseBody, swState)
                caseRegion.insertHighlightAnnotations(child)
                caseState.regions += caseRegion
                
                if (swBody.children.get(i + 1) instanceof IASTBreakStatement) {
                    caseState.createTransitionTo(finalState)
                    i++
                } else {
                    prevNoBreak = caseState
                }
            } else if (child instanceof IASTDefaultStatement) {
                val defaultState = cRegion.createState("default")
                defaultState.insertHighlightAnnotations(child)
                
                if(prevNoBreak !== null) {
                    prevNoBreak.createTransitionTo(defaultState)
                }
                val defaultTransition = initState.createTransitionTo(defaultState)
                
                var defaultBody = new IASTCompoundStatement
                while((i+1) < swBody.children.length) {
                    i++
                    val stmt = swBody.children.get(i)
                    defaultBody.addStatement((stmt as IASTStatement).copy(CopyStyle.withLocations))
                }
                val defaultRegion = buildCompound(defaultBody, swState)
                defaultRegion.insertHighlightAnnotations(child)
                defaultState.regions += defaultRegion
                val finTransition = defaultState.createTransitionTo(finalState)
            }
        }       
    }
    */
    def buildFor(IASTForStatement forStmt, State rootState, DataflowRegion dRegion) {
        
        val forState = createState("For_" + forCounter)
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(forState)
        val forObj = refDecl.createValuedObject("For_" + forCounter)
        
        forObj.insertHighlightAnnotations(forStmt)
        
        setInputs(forStmt, rootState, forState, dRegion, forObj)
        setOutputs(forStmt, rootState, forState, dRegion, forObj)
        //println("")
        //println("create For CondExpr: " + forStmt.getConditionExpression.exprToString)
        val condExpr = forStmt.getConditionExpression.exprToString
        //println("")
        //println("create For InitExpr: " + forStmt.getInitializerStatement.exprToString)
        val initExpr = forStmt.getInitializerStatement.exprToString
        //println("")
        //println("Create For ItExpression: " + forStmt.getIterationExpression.exprToString)
        val itExpr = forStmt.getIterationExpression.exprToString
        //println("")
        
        forState.label = "for (" + initExpr.serialize + "; " + condExpr.serialize + "; " + itExpr.serialize + ")"
        forCounter++
        /*
        val initExpr = (forStmt.getInitializerStatement() as IASTExpressionStatement).getExpression
        if(initExpr instanceof IASTBinaryExpression) {
            val forDInitRegion = createDataflowRegion("")
            forState.regions += forDInitRegion
            forDInitRegion.label = "Initialization"
            val initBExpr = initExpr as IASTBinaryExpression
            if(initBExpr.getOperator == 17) {
                val source = forState.findValuedObjectByName((initBExpr.getOperand1 as IASTIdExpression).getName.toString, false, forDInitRegion)
                val target = createKExpression(initBExpr.getOperand2, forState, forDInitRegion)
                forDInitRegion.equations += createAssignment(source, target)
            }
        }
        
        
        val forDIterationRegion = createDataflowRegion("")
        forState.regions += forDIterationRegion
        forDIterationRegion.label = "Iteration"
        
        val itStmt = forStmt.getIterationExpression
        if (itStmt instanceof IASTUnaryExpression) {
            val unExpr = itStmt as IASTUnaryExpression
            val unOp = unExpr.getOperator
            
            if (unOp == 9 ) {
                val controlVarIn = forState.findValuedObjectByName((unExpr.getOperand as IASTIdExpression).getName.toString, false, forDIterationRegion)
                val controlVarOut = forState.findValuedObjectByName((unExpr.getOperand as IASTIdExpression).getName.toString, true, forDIterationRegion)
                val addKexpression = createOperatorExpression(OperatorType::ADD)
                addKexpression.subExpressions += createIntValue(1)
                addKexpression.subExpressions += controlVarIn.reference
                
                forDIterationRegion.equations += createAssignment(controlVarOut, addKexpression)
            } else if (unOp == 10) {
                val controlVar = forState.findValuedObjectByName((unExpr.getOperand as IASTIdExpression).getName.toString, true, forDIterationRegion)
                val addKexpression = createOperatorExpression(OperatorType::SUB)
                addKexpression.subExpressions += createIntValue(1)
                addKexpression.subExpressions += controlVar.reference
                
                forDIterationRegion.equations += createAssignment(controlVar, addKexpression)
            }
        }
        */
        val forDBodyRegion = buildCompound(forStmt.getBody as IASTCompoundStatement, forState) 
        forState.regions += forDBodyRegion
        forDBodyRegion.label = forState.label
        
    }
    
    def buildWhile(IASTWhileStatement whileStmt, State rootState, DataflowRegion dRegion) {
                
        val whileState = createState("While_" + whileCounter)
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(whileState)
        val whileObj = refDecl.createValuedObject("While_" + whileCounter)
        
        whileObj.insertHighlightAnnotations(whileStmt)
        
        setInputs(whileStmt, rootState, whileState, dRegion, whileObj)
        setOutputs(whileStmt, rootState, whileState, dRegion, whileObj)
        val condExpr = createKExpression(whileStmt.getCondition, whileState, dRegion)
        whileState.label = "while " + condExpr.serialize
        whileCounter++
        
        val whileDBodyRegion = buildCompound(whileStmt.getBody as IASTCompoundStatement, whileState) 
        whileState.regions += whileDBodyRegion
        whileDBodyRegion.label = whileState.label
        
    }
    
    def buildDo(IASTDoStatement doStmt, State rootState, DataflowRegion dRegion) {
                
        val doState = createState("Do_" + doCounter)
        
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(doState)
        val doObj = refDecl.createValuedObject("Do_" + doCounter)
        
        doObj.insertHighlightAnnotations(doStmt)
        
        setInputs(doStmt, rootState, doState, dRegion, doObj)
        setOutputs(doStmt, rootState, doState, dRegion, doObj)
        val condExpr = createKExpression(doStmt.getCondition, doState, dRegion)
        doState.label = "do ... while " + condExpr.serialize
        doCounter++
        
        val doDBodyRegion = buildCompound(doStmt.getBody as IASTCompoundStatement, doState) 
        doState.regions += doDBodyRegion
        doDBodyRegion.label = doState.label
               
    }
    
    def VariableDeclaration addDeclaration(IASTSimpleDeclaration declaration, State state, DataflowRegion dRegion) {
        
        val res = createVariableDeclaration
        res.type = (declaration.getDeclSpecifier as IASTSimpleDeclSpecifier).type.CDTTypeConversion
        
        res.insertHighlightAnnotations(declaration)
        
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
                //println("")
                //println("Found ArrayDeclarator")
                var varList = <ValuedObject> newArrayList
                
                val vo = res.createValuedObject(varName + "_0")
                vo.insertHighlightAnnotations(decl)
                
                varList.add(vo)
                stateVariables.put(varName, varList)
                val arrayModifiers = decl.getArrayModifiers
                //println("arrayModifiers: " + arrayModifiers)
                
                for (arrayModifier : arrayModifiers) {
                    //println("ArrayModifier constantExpression: " + arrayModifier.getConstantExpression)
                    vo.cardinalities.add(createKExpression(arrayModifier.getConstantExpression, state, dRegion))
                }
                
                
            } else {
                var varList = <ValuedObject> newArrayList
            
                val vo = res.createValuedObject(varName + "_0")
                vo.insertHighlightAnnotations(decl)
                
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
        if (initializer instanceof IASTEqualsInitializer) {
            if(!(initializer.children.head instanceof IASTFunctionCallExpression)) {
                        
                val initExpr = createKExpression(initializer.children.head, state, dRegion)
                dRegion.equations += createAssignment(vo, initExpr)
            } else {
                val funcInit = initializer.children.head as IASTFunctionCallExpression
                val funcName = (funcInit.getFunctionNameExpression as IASTIdExpression).getName.toString
                val funcState = findFunctionState(funcName)
                        
                val refDecl = createReferenceDeclaration
                state.declarations += refDecl
                refDecl.setReference(funcState)
                        
                val refObj = refDecl.createValuedObject(funcName)
                refObj.insertHighlightAnnotations(funcInit)
                        
                var i = 0
                for (argument : funcInit.getArguments) {
                    val funcObjArg = funcState.declarations.filter(VariableDeclaration).map[valuedObjects].flatten.get(i)
                    val connectObj = state.findValuedObjectByName((argument as IASTIdExpression).getName.toString, false, dRegion)
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
            outputVO.insertHighlightAnnotations(stmt)
            val outputRootDecl = outputVO.getVariableDeclaration
            val outputType = outputRootDecl.getType
            
            val decl = createVariableDeclaration
            newState.declarations += decl
            decl.type = outputType
            decl.output = true
            
            val innerOutputVO = decl.createValuedObject(output + "_out")
            innerOutputVO.insertHighlightAnnotations(stmt)
            
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
        
        if (stmt instanceof IASTBinaryExpression) {
            val binExpr = stmt as IASTBinaryExpression
            if (binExpr.getOperator == 17) {
                val op1 = binExpr.getOperand1
                if (op1 instanceof IASTIdExpression) {
                    res += op1.getName.toString    
                } else if (op1 instanceof IASTArraySubscriptExpression) {
                    res += (op1.getArrayExpression as IASTIdExpression).getName.toString
                }
                
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
            if (inputVO.isArray) {
                innerInputVO.applyCardinalities(inputVO)
            }
            innerInputVO.insertHighlightAnnotations(stmt)
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
            
            if(stmt instanceof IASTIdExpression) {
                res += (stmt as IASTIdExpression).getName.toString
            } else if (stmt instanceof IASTBinaryExpression) {
                val binExpr = stmt as IASTBinaryExpression
                if(binExpr.getOperator == 17) {
                    res = findInputs(binExpr.getOperand2)
                } else {
                    res = findInputs(binExpr.getOperand1)
                    res += findInputs(binExpr.getOperand2)
                }
            } else if (stmt instanceof IASTFunctionCallExpression) {
                val arguments = (stmt as IASTFunctionCallExpression).getArguments
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
//        //println("")
//        //println("looking for " + name + " in state " + state.getName() + " with writing: " + writing)
//        //println("current varList: " + varList)
        res = varList.get(varList.length - 1)
//        //println("last Elem found: " + res)
        var varName = res.getName()
        var onlyOut = false
        if(varName.contains("_out")) {
//            //println("contains _out")
            if(varList.length > 1) {
                res = varList.get(varList.length - 2)
//                //println("use now: " + res)
                varName = res.getName()
            } else {
                val OffsetAnno = res.getAnnotations("Offset")
                val LengthAnno = res.getAnnotations("Length")
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
                if (OffsetAnno.length > 0) res.annotations += OffsetAnno.head
                if (LengthAnno.length > 0) res.annotations += LengthAnno.head
                
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
//            //println("writing==true => use: " + res)
            varList.add(res)
        }
         
//        //println("") 
        res
    }
    
    def linkOutputs(State state, DataflowRegion dRegion) {
        //println("")
        //println("inside linkOutputs for state: " + state.getName)
        var stateVariables = VOs.get(state)
        for (varList : stateVariables.values) {
            val outVO = findOutputVar(varList)
            if (outVO !== null && (varList.length > 1)) {
                var lastVO = varList.get(varList.length - 1)
                if(lastVO.getName.contains("_out") && (varList.length > 1)) {
                    lastVO = varList.get(varList.length - 2)
                }
                if (outVO.annotations.length < 2) {
                    outVO.annotations += createStringAnnotation("Offset", lastVO.getStringAnnotationValue("Offset"))
                    outVO.annotations += createStringAnnotation("Length", lastVO.getStringAnnotationValue("Length"))
                }
                //println("linking " + lastVO.getName + " onto " + outVO.getName)
                dRegion.equations += createAssignment(outVO, lastVO.reference)
            }
        }
        //println("")
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
    
    def insertHighlightAnnotations(Annotatable annotatable, IASTNode node) {
        
        val nodeLocations = node.getNodeLocations
        
//        val annotations = annotatable.annotations
        
        if (annotatable.getAnnotations("Offset").length == 0) {
        
            if (nodeLocations.length > 0) {        
                val nodeOffset = node.getNodeLocations.get(0).getNodeOffset
                val nodeLength = node.getNodeLocations.get(0).getNodeLength
                
                annotatable.annotations += createStringAnnotation("Offset", nodeOffset.toString)
                annotatable.annotations += createStringAnnotation("Length", nodeLength.toString)
            } else {
                //println("insertHighlightAnnotations aufgerufen - node hat aber keine NodeLocations")
            }
        
        } else {
            //println("insertHighlightAnnotations aufgerufen object hat aber bereits offset annotation")
        }
    }
    
    def printVOs() {
        //println("")
        //println("Ausgabe aller ValuedObjects mit Annotations")
        val keys = VOs.keySet.toArray
        for (key : keys) {
            //println("")
            //println("State: " + key.toString)
            val variables = VOs.get(key).keySet.toArray
            for (variable : variables) {
                //println("Variable: " + variable)
                val valuedObjects = VOs.get(key).get(variable)
                for (VO : valuedObjects) {
                    //println("VO: " + VO.toString)
                    val annotations = VO.annotations
                    for (anno : annotations) {
                        //println("Annotation: " + anno.toString)
                    }
                }
            }
        }
        
    }

}
