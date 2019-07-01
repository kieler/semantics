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
import de.cau.cs.kieler.c.sccharts.extensions.ExpressionConverterExtensionsV2
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

/**
 * @author lan
 * 
 */

@SuppressWarnings("all","unchecked")
class DataflowExtractorV2 extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {

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
    @Inject extension ExpressionConverterExtensionsV2
    @Inject extension ValueExtensions
    
     var functions = <String, State> newHashMap
     var ifCounter = 0;
     var swCounter = 0;
     var forCounter = 0;
     var whileCounter = 0;
     var doCounter = 0;

    var ControlflowRegion topCRegion

    override getId() {
        "de.cau.cs.kieler.c.sccharts.dataflowExtractorV2"
    }
    
    override getName() {
        "Dataflow Extractor V2"
    }
    
    override process() {
        val tUnit = getModel
        setModel(tUnit.transform as SCCharts)
    }    

    def EObject transform(IASTTranslationUnit ast) {
        println("")
        println("Start dataflowExtractor V2")
        
        if(ast === null) {
            return null
        }
        
        val SCChart = createSCChart
        
        val rootState = createState("")
        rootState.label = "Welcome to Dataflow Extractor V2"
        
        SCChart.rootStates += rootState
        
        topCRegion = rootState.createControlflowRegion("")
        
        //auto created dataflow graph
        for(child : ast.children) {
            
            if(child instanceof CASTFunctionDefinition) {
                val state = buildFunction(child, rootState)
                functions.put(state.label, state)
                topCRegion.states += state
            } else if(child instanceof CASTSimpleDeclaration){
                val decl = createVariableDeclaration
                decl.type = ((child as CASTSimpleDeclaration).getDeclSpecifier as CASTSimpleDeclSpecifier).type.CDTTypeConversion
                
                rootState.declarations += decl
                
                val declarators = (child as CASTSimpleDeclaration).getDeclarators
                for(declarator : declarators) {
                    val VO = decl.createValuedObject(declarator.getName.toString)
                    if (declarator.getInitializer !== null) {
                        println(declarator.getName.toString + " hat initializer")
                    }
                } 
            }
             
        }
        
        println("End of DataflowExtractorV2")
        println("")
        
        SCChart
        
    }

    def State buildFunction(CASTFunctionDefinition func, State rootState) {
        println("")
        println("Inside buildFunction")
        
        //Bestimmt Func Name
        val funcDeclarator = func.getDeclarator as CASTFunctionDeclarator
        val funcName = funcDeclarator.name.toString
        
        val State res = createState(funcName)
        res.label = funcName
        
        //Bestimme Inputs
        val parameters = funcDeclarator.getParameters
        for (par : parameters) {
            val parDecl = par as CASTParameterDeclaration
            
            val decl = createVariableDeclaration
            decl.type = (parDecl.getDeclSpecifier as CASTSimpleDeclSpecifier).type.CDTTypeConversion
            decl.input = true
            
            res.declarations += decl
            
            val VO = decl.createValuedObject(parDecl.getDeclarator.name.toString)
            
        }
        
        //Bestimmt Rückgabe
        val declSpecifier = func.getDeclSpecifier
        if (declSpecifier !== null) {
            if (declSpecifier instanceof CASTSimpleDeclSpecifier) {
                val retDecl = createVariableDeclaration
                retDecl.type = (declSpecifier as CASTSimpleDeclSpecifier).type.CDTTypeConversion
                retDecl.output = true   
                
                res.declarations += retDecl
                val resVO = retDecl.createValuedObject("res")            
            }
        }
        
        val body = func.getBody
        if (body instanceof CASTCompoundStatement) {
            res.regions += buildCompound(body, res)
        } else {
            println("Func Body kein CompoundStatement")
        }
        
        println("End of buildFunction")
        println("")
        res
    }
    
    def DataflowRegion buildCompound(CASTCompoundStatement body, State bodyState) {
        val res = createDataflowRegion("")
        
        val statements = body.getStatements
        for (stmt : statements) {
            if (stmt instanceof CASTDeclarationStatement) {
                
                val declaration = stmt.getDeclaration
                if(declaration instanceof CASTSimpleDeclaration) {
                    bodyState.declarations += addDeclaration(declaration, bodyState, res)
                }
                
            } else if (stmt instanceof CASTExpressionStatement) {
                
                val expression = (stmt as CASTExpressionStatement).getExpression
                
                if (expression instanceof CASTBinaryExpression) {
                    
                    val kEffects = createKEffect(expression, bodyState)
                    for (kEffect : kEffects) {
                        res.equations += kEffect
                    }
                    
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
                val retKExpr = createKExpression(returnStmt.getReturnValue, bodyState)
                
                val retVO = bodyState.findValuedObjectByName("res")
                res.equations += createAssignment(retVO, retKExpr)
                
            }
        }
        
        res
    }
    
    def buildIf(CASTIfStatement ifStmt, State rootState, DataflowRegion dRegion) {
        
        println("")
        println("Baue IfStatement: If_" + ifCounter)
        val ifState = createState("If_" + ifCounter)
        
        val refDecl = createReferenceDeclaration
        rootState.declarations += refDecl
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
        println("thenTransition: " + thenTransition)
        thenTransition.trigger = (ifStmt.getConditionExpression).createKExpression(ifState)
        
        val elseState = cRegion.createState("Else")
        val elseCompound = ifStmt.getElseClause as CASTCompoundStatement
        val elseRegion = buildCompound(elseCompound, ifState)
        elseState.label = "Else"
        elseState.regions += elseRegion
        initState.createTransitionTo(elseState)
        
        topCRegion.states+= ifState
        
        println("")
        
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
        for(output : outputs) {
            println("Output found: " + output)
            val outputVO = rootState.findValuedObjectByName(output)
            val outputRootDecl = outputVO.getVariableDeclaration
            val outputType = outputRootDecl.getType
            
            val decl = createVariableDeclaration
            newState.declarations += decl
            decl.type = outputType
            decl.output = true
            val innerOutputVO = decl.createValuedObject(output)
            
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
        for (input : inputs) {
            println("Input found: " + input)
            val inputVO = rootState.findValuedObjectByName(input)
            val inputRootDecl = inputVO.getVariableDeclaration
            val inputType = inputRootDecl.getType
            
            val decl = createVariableDeclaration
            newState.declarations += decl
            decl.type = inputType
            decl.input = true
            val innerInputVO = decl.createValuedObject(input)
                
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
    
    def buildSwitch(CASTSwitchStatement swStmt, State rootState, DataflowRegion dRegion) {
        println("")
        println("Baue SwitchStatement: Switch_" + swCounter)
        val swState = createState("Switch_" + swCounter)
        
        val refDecl = createReferenceDeclaration
        rootState.declarations += refDecl
        refDecl.setReference(swState)
        val swObj = refDecl.createValuedObject("Switch_" + swCounter)
        swCounter++
        
        setInputs(swStmt, rootState, swState, dRegion, swObj)
        setOutputs(swStmt, rootState, swState, dRegion, swObj)
        val cRegion = swState.createControlflowRegion("")
        val initState = cRegion.createState("Init")
        initState.initial = true
        /*
        val thenState = cRegion.createState("Then")
        val thenCompound = ifStmt.getThenClause as CASTCompoundStatement
        val thenRegion = buildCompound(thenCompound, ifState)
        thenState.label = "Then"
        thenState.regions += thenRegion
        val thenTransition = initState.createTransitionTo(thenState)
        println("thenTransition: " + thenTransition)
        thenTransition.trigger = (ifStmt.getConditionExpression).createKExpression(ifState)
        
        val elseState = cRegion.createState("Else")
        val elseCompound = ifStmt.getElseClause as CASTCompoundStatement
        val elseRegion = buildCompound(elseCompound, ifState)
        elseState.label = "Else"
        elseState.regions += elseRegion
        initState.createTransitionTo(elseState)
        */
        topCRegion.states+= swState
        
        println("")        
    }
    
    def buildFor(CASTForStatement forStmt, State rootState, DataflowRegion dRegion) {
        
        println("")
        println("Baue ForStatement: For_" + forCounter)
        val forState = createState("For_" + forCounter)
        println("ForState erstellt: " + forState)
        
        val refDecl = createReferenceDeclaration
        println("refDecl erstellt: " + refDecl)
        rootState.declarations += refDecl
        refDecl.setReference(forState)
        val forObj = refDecl.createValuedObject("For_" + forCounter)
        println("forObj erstellt: " + forObj)
        
        setInputs(forStmt, rootState, forState, dRegion, forObj)
        println("Inputs erstellt")
        setOutputs(forStmt, rootState, forState, dRegion, forObj)
        println("Outputs erstellt")
        val condExpr = createKExpression(forStmt.getConditionExpression, forState)
        forState.label = "for " + condExpr.serialize
        forCounter++
        
        val forDBodyRegion = buildCompound(forStmt.getBody as CASTCompoundStatement, forState) 
        forState.regions += forDBodyRegion
        forDBodyRegion.label = "Body"
        
        val initExpr = (forStmt.getInitializerStatement() as CASTExpressionStatement).getExpression
        if(initExpr instanceof CASTBinaryExpression) {
            val forDInitRegion = createDataflowRegion("")
            forState.regions += forDInitRegion
            forDInitRegion.label = "Initialization"
            val initBExpr = initExpr as CASTBinaryExpression
            if(initBExpr.getOperator == 17) {
                val source = forState.findValuedObjectByName((initBExpr.getOperand1 as CASTIdExpression).getName.toString)
                val target = createKExpression(initBExpr.getOperand2, forState)
                forDInitRegion.equations += createAssignment(source, target)
            }
        }
        
        
        val forDIterationRegion = createDataflowRegion("")
        forState.regions += forDIterationRegion
        forDIterationRegion.label = "Iteration"
        println("For Compound gebaut")
        
        val itStmt = forStmt.getIterationExpression
        if (itStmt instanceof CASTUnaryExpression) {
            val unExpr = itStmt as CASTUnaryExpression
            val unOp = unExpr.getOperator
            
            if (unOp == 9 ) {
                val controlVar = forState.findValuedObjectByName((unExpr.getOperand as CASTIdExpression).getName.toString)
                val addKexpression = createOperatorExpression(OperatorType::ADD)
                addKexpression.subExpressions += createIntValue(1)
                addKexpression.subExpressions += controlVar.reference
                
                forDIterationRegion.equations += createAssignment(controlVar, addKexpression)
            } else if (unOp == 10) {
                val controlVar = forState.findValuedObjectByName((unExpr.getOperand as CASTIdExpression).getName.toString)
                val addKexpression = createOperatorExpression(OperatorType::SUB)
                addKexpression.subExpressions += createIntValue(1)
                addKexpression.subExpressions += controlVar.reference
                
                forDIterationRegion.equations += createAssignment(controlVar, addKexpression)
            }
            println("IterationExpression der ForSchleife hat operator: " + unOp)
        }
        
        
        topCRegion.states+= forState
        
        println("")
        
    }
    
    def buildWhile(CASTWhileStatement whileStmt, State rootState, DataflowRegion dRegion) {
                
        println("")
        println("Baue WhileStatement: While_" + whileCounter)
        val whileState = createState("While_" + whileCounter)
        println("WhileState erstellt: " + whileState)
        
        val refDecl = createReferenceDeclaration
        println("refDecl erstellt: " + refDecl)
        rootState.declarations += refDecl
        refDecl.setReference(whileState)
        val whileObj = refDecl.createValuedObject("While_" + whileCounter)
        println("whileObj erstellt: " + whileObj)
        
        setInputs(whileStmt, rootState, whileState, dRegion, whileObj)
        println("Inputs erstellt")
        setOutputs(whileStmt, rootState, whileState, dRegion, whileObj)
        println("Outputs erstellt")
        val condExpr = createKExpression(whileStmt.getCondition, whileState)
        whileState.label = "while " + condExpr.serialize
        whileCounter++
        
        val whileDBodyRegion = buildCompound(whileStmt.getBody as CASTCompoundStatement, whileState) 
        whileState.regions += whileDBodyRegion
        whileDBodyRegion.label = "Body"
        
        topCRegion.states+= whileState
        
        println("")
    }
    
    def buildDo(CASTDoStatement doStmt, State rootState, DataflowRegion dRegion) {
                
        println("")
        println("Baue DoStatement: Do_" + doCounter)
        val doState = createState("Do_" + doCounter)
        println("DoState erstellt: " + doState)
        
        val refDecl = createReferenceDeclaration
        println("refDecl erstellt: " + refDecl)
        rootState.declarations += refDecl
        refDecl.setReference(doState)
        val doObj = refDecl.createValuedObject("Do_" + doCounter)
        println("doObj erstellt: " + doObj)
        
        setInputs(doStmt, rootState, doState, dRegion, doObj)
        println("Inputs erstellt")
        setOutputs(doStmt, rootState, doState, dRegion, doObj)
        println("Outputs erstellt")
        val condExpr = createKExpression(doStmt.getCondition, doState)
        doState.label = "do ... while " + condExpr.serialize
        doCounter++
        
        val doDBodyRegion = buildCompound(doStmt.getBody as CASTCompoundStatement, doState) 
        doState.regions += doDBodyRegion
        doDBodyRegion.label = "Body"
        
        topCRegion.states+= doState
        
        println("")        
    }
    
    def VariableDeclaration addDeclaration(CASTSimpleDeclaration declaration, State state, DataflowRegion dRegion) {
        println("")
        println("Start addDeclaration")
        
        val res = createVariableDeclaration
        res.type = (declaration.getDeclSpecifier as CASTSimpleDeclSpecifier).type.CDTTypeConversion
        println("VariableDeclaration erstellt für typ: " + res.type)
        
        val declarators = declaration.getDeclarators
        for(decl : declarators) {
            val vo = res.createValuedObject(decl.getName.toString)
            println("variable erstellt: " + decl.getName.toString)
            
            if(decl.getInitializer !== null) {
                println("hat initializer")
                val initializer = decl.getInitializer
                if (initializer instanceof CASTEqualsInitializer) {
                    dRegion.equations += createAssignment(vo, createValue(initializer.children.head))
                }
            }
        }
        
        println("End addDeclaration")
        res
    }

    
    def State findFunctionState(String funcName) {
        functions.get(funcName)
    }
    
    def ValuedObject findValuedObjectByName(State state, String name) {
        var ValuedObject res
        //println("    Inside findValuedObjectByName für State: " + state)
        for(declaration : state.getVariableDeclarations) {
        //println("    Test declaration")
            val temp = declaration.findValuedObjectByName(name)
            if(temp !== null) {
        //println("    valuedObject gefunden!")
                res = temp
                }
        }
         
        res
    }

}
