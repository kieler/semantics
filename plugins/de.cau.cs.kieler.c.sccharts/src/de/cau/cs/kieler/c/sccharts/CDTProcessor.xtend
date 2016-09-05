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
package de.cau.cs.kieler.c.sccharts

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.HashMap
import java.util.Map
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTExpression
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import org.eclipse.cdt.core.model.ITranslationUnit
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBreakStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTCaseStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDefaultStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer
import org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTForStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionCallExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDefinition
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIfStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTParameterDeclaration
import org.eclipse.cdt.internal.core.dom.parser.c.CASTProblem
import org.eclipse.cdt.internal.core.dom.parser.c.CASTReturnStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSwitchStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTUnaryExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTWhileStatement
import org.eclipse.cdt.internal.ui.editor.CEditor
import org.eclipse.emf.ecore.EObject
import org.eclipse.ui.IEditorPart
import de.cau.cs.kieler.sccharts.EntryAction
import org.eclipse.cdt.core.model.ITranslationUnit
import org.eclipse.cdt.internal.core.dom.parser.ASTNode
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.transformations.Termination
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDoStatement
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.cdt.internal.core.dom.parser.ASTAttributeOwner
import de.cau.cs.kieler.c.sccharts.transformation.CbasedSCChartFeature
import org.eclipse.cdt.core.dom.ast.IASTExpressionList
import de.cau.cs.kieler.kexpressions.Parameter
import org.eclipse.cdt.internal.core.model.VariableDeclaration
import java.util.Set
import java.util.HashSet

/**
 * @author ssm
 * @author sle
 * 
 */
 
class CDTProcessor {

    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension SCChartsExtension

    @Inject
    extension AnnotationsExtensions
    
    private static val RETURNVONAME = "return"
    
    private static val NESTEDRETURN = "nestedReturn"
    
    var nestedReturnParameter = kex.createVariableDeclaration
    
    val VOSet = <ValuedObject>newHashSet
    var _trc = 0
    
//    var State funcGlobalState

    // Contains children nodes of a FunctionCallExpression.
    List<IASTExpression> argumentList = new ArrayList<IASTExpression>();


    // Save FunctionCallExpression and referencing state to handle function calls
    ArrayList<Pair<CASTFunctionCallExpression,State>> functionCallRefs = new ArrayList<Pair<CASTFunctionCallExpression,State>>();
    
    
    // Save FunctionCallExpression and referencing state to handle function calls
    ArrayList<Pair<CASTIdExpression,CASTFunctionCallExpression>> functionCallAssignment = new ArrayList<Pair<CASTIdExpression,CASTFunctionCallExpression>>();
    
    
    // Contains all defined functions of the given C code.
    val functions = new ArrayList<Pair<State, Set<ValuedObject>>>();
    
    

//    Map<String, State> functionStates = new HashMap<String, State>();
//    ArrayList<State> connectorStates = new ArrayList<State>();
//    String parameterStr



    def SCCharts createFromEditor(IEditorPart editor) {
        val cEditor = editor as CEditor
        val tu = cEditor.translationUnit
        tu.transform as SCCharts
    }

    def EObject transform(ITranslationUnit translationUnit) {
        if (translationUnit == null) {
            return null
        }
        val ast = translationUnit.getAST
        if (ast.children != null) {
            ast.children.printASTNodes("")
        } else {
            return null
        }
        
//        // Print different function-definitions.
//        ast.children.forEach [f | 
//            val declarator = f.children.filter(typeof(CASTFunctionDeclarator)).head
//            val label = declarator.children.head.toString
//            // Save label in a set so we can look up all defined functions of the program afterwards.
//            funcLabelSet.add(label)
////            println("AST-Children: " + label)
//        ]

        VOSet.clear
        
        // Root SCChart (program)
        val rootSCChart = scc.createSCCharts
        
        // For each function definition add a new rootState to the rootSCChart
        ast.children.forEach [ func | // for each defined function
            // ssm: RESET VO SET for each function!
            // The scoper will not look for the VOs in other root states.
            VOSet.clear  
//            functionCallRefs.clear
            
            if (func instanceof CASTFunctionDefinition) {
                val rootFunctionDefinition = func as CASTFunctionDefinition
                val model = rootFunctionDefinition.transformFunction
                functions.add(new Pair(model, VOSet.clone))
                rootSCChart.rootStates += model
            }
        ]
        
        // Create reference of function call.
        if (!functionCallRefs.empty) {
            functionCallRefs.forEach [ entry |
                /* Look up the to be referenced function inside CASTFunctionCallExpression (key) and connect
                 * it to the referencing state (value). */
                val funcCallExp = entry.key
                val referencingState = entry.value
                val rootState = referencingState.getRootState
                
                VOSet.clear
                VOSet += functions.filter[ key == rootState ].head.value                
                
                val funcID = funcCallExp.functionNameExpression.children.head.toString
                // Search the list functions for the to be referenced function state
                val State referencedState = lookForFunctions(funcID)
                if (referencedState != null) {
                    referencingState.referencedScope = referencedState
                }
                
                // Handle arguments of function call.
                val argumentList = getFunctionCallArguments(funcCallExp)
                if(!argumentList.empty){
                    // Create a parameter for each given argument.
                    for (arg : argumentList) {
                        kex.createParameter => [ p |
                            p.expression = arg.createKExpression
                            referencingState.parameters.add(p)
                        ]
                    }
                }
                
                // If necessary, add reference to the variable which is assigned to the retun value of the function call.
                val CASTIdExpression assignedVar = getAssignedVariableForReturnVal(funcCallExp)
                if (assignedVar != null) {
                    kex.createParameter => [ p |
                        p.callByReference = true
                        p.expression = assignedVar.createKExpression
                        referencingState.parameters.add(p)
                    ]
                }
            ]
        }
        
//        removeConnectorStates();
        rootSCChart.rootStates.head.createStringAnnotation(CbasedSCChartFeature.ID,"")
        rootSCChart
    }

    def State transformFunction(CASTFunctionDefinition function) {

        // org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDefinition@6c704a9e
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@403302b0
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator@54f591bd
        // fib
        val returnDeclaration = kex.createVariableDeclaration => [
            type = parseCDTType(function.children.filter(typeof(CASTSimpleDeclSpecifier)).head.type)
            output = true
        ]

        val returnValue = kex.createValuedObject => [
            name = "return"
            returnDeclaration.valuedObjects += it
            VOSet += it
        ]

        val declarator = function.children.filter(typeof(CASTFunctionDeclarator)).head
        
        // Function State 
        val funcState = scc.createState => [
            label = declarator.children.head.toString
            if (returnDeclaration.type == ValueType.PURE) {
                id = label + "_void" // Mark void functions.
            } else {
                id = label + "_" + returnDeclaration.type // Mark type of function.
            }
            
            if (label == "main") { 
//                initial = true
            }
        ]
        val funcStateLabel = funcState.label
        
        
        // Function region
        val funcRegion = scc.createControlflowRegion => [
            id = funcStateLabel + "_function" // to identify nested return statements
            label = "_" + funcStateLabel
            funcState.regions += it
        ]
        

        // parameters
//        funcGlobalState = model

        // Create declaration of given arguments of the function.
            // org.eclipse.cdt.internal.core.dom.parser.c.CASTParameterDeclaration@46333ade
            // org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@4d5de8d3
            // org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@50609c53
            // n        
            
        // Transform parameters of a function.
        
        declarator.children.filter(typeof(CASTParameterDeclaration)).forEach [ parameter |
            println("PARAMETER: " + parameter)
            val iName = parameter.declarator.name.toString
            println("NAME: " + iName)
            val iParamater = kex.createVariableDeclaration => [
                type = parseCDTType(parameter.children.filter(typeof(CASTSimpleDeclSpecifier)).head.type)
                input = true
                funcState.declarations += it
            ]
            println("TYPE: " + iParamater.type)
            // Add parameter to VOSet to give it a name.
            kex.createValuedObject => [
                name = iName
                iParamater.valuedObjects += it
                VOSet += it
            ]
        ]

        val compound = function.children.filter(typeof(CASTCompoundStatement)).head
        var State lastState = null
        if (compound != null) {
            lastState = compound.transformCompound(null, funcState)
        }
        
        // In case the function is of type void, we need to create a endState as there is no return statement.
        if (returnDeclaration.type == ValueType.PURE) {
            val endState = scc.createState => [
                id = "_S" + trC + "_end"
                label = "End"
                final = true
                funcRegion.states += it
            ]
        
            // transition to endState
            val endTrans = scc.createTransition => [
                targetState = endState
                immediate = true
            ]
            if (lastState.hasInnerStatesOrControlflowRegions) {
                endTrans.type = TransitionType::TERMINATION
            }
            lastState.outgoingTransitions += endTrans
        } else {
            // For a non-void function, add declaration of a output variable.
            funcState.declarations += returnDeclaration
        }
        
        /* In case a nested return exists inside the function, the valuedObject-List contains a nestedReturn-value
         * If so, create a boolean variable declaration. */
        if (!nestedReturnParameter.valuedObjects.empty) {
            val parameter = nestedReturnParameter
            funcState.declarations += parameter
            
            // Set nestedReturn variable to initially false.
            var boolVal = kex.createBoolValue
            boolVal.value = false
            var entryAction = funcState.createEntryAction
            entryAction.createAssignment(VOSet.filter[name.equals(NESTEDRETURN)].head, boolVal)
        }

        funcState
    }

    def State transformCompound(CASTCompoundStatement cs, State state, State parentState) {
        var State newState
        if (state == null) {
            // initial state of a function
            newState = scc.createState => [
                id = "_S" + trC + "_initFuncState"
                label = "Init"
                initial = true
                parentState.regions.filter(typeof(ControlflowRegion)).head.states += it
            ]
        } else {
            newState = state
        }
        val stateF = newState

        // org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@76b7365e
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement@76529235
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration@26fd1243
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@30ba00b4
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@384426a
        // fl
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@60243ef3
        // 0        
        var actualState = stateF
        for (statement : cs.children.filter(IASTStatement)) {
            actualState = (statement as IASTStatement).transformStatement(actualState)
        }
        actualState
    }

    def State transformStatement(IASTStatement statement, State parent) {

        var actualState = parent;
        if (statement instanceof CASTIfStatement) {
            actualState = statement.transformIf(actualState)
            checkForNestedReturn(actualState)
        }
        else if (statement instanceof CASTReturnStatement) {
            actualState = statement.transformReturn(actualState)
        }
        else if (statement instanceof CASTExpressionStatement) {
            actualState = statement.transformExpression(actualState)
        }
        else if (statement instanceof CASTForStatement) {
            actualState = statement.transformFor(actualState)
            checkForNestedReturn(actualState)
        }
        else if (statement instanceof CASTWhileStatement) {
            actualState = statement.transformWhile(actualState)
            checkForNestedReturn(actualState)
        }
        else if (statement instanceof CASTDoStatement) {
            actualState = statement.transformDoWhile(actualState)
            checkForNestedReturn(actualState)
        }
        else if (statement instanceof CASTSwitchStatement) {
            actualState = statement.transformSwitch(actualState)
            checkForNestedReturn(actualState)
        }
        else if (statement instanceof CASTBinaryExpression) {
            actualState = statement.createDataflow(actualState)
        }
        else if (statement instanceof CASTDeclarationStatement) {
            actualState = statement.castDeclaration(actualState)
        }

        actualState
    }


    def State transformSwitch(CASTSwitchStatement statement, State state) {
        val f = statement
        var Expression kExp = null
        val switchVar = statement.children.filter(typeof(CASTIdExpression)).head.syntax.toString
        var Boolean defaultExpression = false // Saves whether there is a default case.
        var Boolean casebefore = false // Saves whether there is a case before the case we are currently working on.
        var Boolean noBreakBefore = false // Saves whether the case before does not have a break statement.

        // Switch statement state.
        val switchState = scc.createState => [
            id = trC + "_switch_cs"
            label = "switch"
            state.parentRegion.states += it
        ]
        
        // Region of switchState. It contains all states of the switch statement.
        val switchStateRegion = scc.createControlflowRegion => [
                id = switchState.id + "_region"
                label = ""
                switchState.regions += it
        ]

        val condState = scc.createState => [
            id = trC.toString + "_cond"
            label = createLabel(statement) + "cond"
            initial = true
            switchStateRegion.states += it
        ]
        
        // Create transition which connects the parent state "state" to the switchState.
        createConnectingTransition(state, switchState, statement)
        
//        // Connects switch statement to the parent.
//        val switchConnector = scc.createTransition => [
//            targetState = switchState
//            
//            // Falls es geschachtelte Kontrollstrukturen sind, ohne dass nach dem cond State eine weitere Zeile kommt,
//            // fixt dies den Bug, dass die Condition der oberen for-Schleife richtig dargestellt wird.
//            if(state.id.contains("_cond")) {
//                var Expression condKExp = null
//                var IASTExpression condCondition = null
//                val condStatement = statement.parent.parent
//
//                if (condStatement instanceof CASTForStatement) {
//                    condCondition = condStatement.conditionExpression
//                } 
//                else if (condStatement instanceof CASTIfStatement) {
//                    condCondition = condStatement.conditionExpression
//                } 
//                else if (condStatement instanceof CASTWhileStatement) {
//                    condCondition = condStatement.condition
//                }
//                condKExp = condCondition.createKExpression
//                trigger = condKExp
//                annotations.add(createStringAnnotation("notImmediate",""))
//                immediate = true
//         
//            } else if(state.hasInnerStatesOrControlflowRegions) {
//                type = TransitionType::TERMINATION
//            } else {
//                immediate = true
//            }
//            state.outgoingTransitions += it
//        ]


        val connectorState = scc.createState => [ s |
            s.id = "_C" + trC.toString
            s.label = s.id
            s.setTypeConnector
            switchStateRegion.states += s
        ]
//        connectorStates.add(connectorState)
      
        // Save condState ID, so we can reset the ID after the switch case statement is transformed
        val condID = condState.id
        // Last state of case where the break statement is missing
        var missingBreakState = condState
        // Last state we have worked on and we want to continue
        var parent = condState
        // Save last state of a case for connecting it to the connectorState
        var lastState = condState
        
        // Transform the different cases of the switch statement.
        for (caseExpression : f.children.filter(typeof(CASTCompoundStatement)).head.children.filter(
            typeof(IASTStatement))) {
            if (caseExpression instanceof CASTCaseStatement) {
                // If lastState is final, start at condState again for next cases.
                if (lastState.final) {
                    lastState = condState
                }
                // Always start at condState for each new case.
                parent = condState

                // Create kExpression for condition of case.
                kExp = (switchVar + " == " + caseExpression.children.filter(typeof(IASTExpression)).head.toString).
                        createTextExpression
                casebefore = true
                if (condState != lastState && !lastState.final) { // Break statement for last case does not exist.
                    // Set missingBreakState accordingly, so we can connect it and the current state to each other.
                    missingBreakState = lastState
                    // Set id, so that transformStatement does not join CASTBinaryExpression states of the two cases.
                    lastState = condState
                    // Mark state so that transformStatement does not merge multiple binary statements of two cases.
                    lastState.id = lastState.id + "fallthrough"
                    noBreakBefore = true
                    casebefore = true
                }
            } else if (caseExpression instanceof CASTBreakStatement) {
                // This is not necessary for default state as default should be last case, so no break is needed.
                if (!defaultExpression) {
                    casebefore = false;
                    if (!lastState.final) {
                        val backConnector = scc.createTransition => [
                            targetState = connectorState
                            immediate = true
                        ]
                        // Check to determine transition type.
                        if(lastState.hasInnerStatesOrControlflowRegions) {
                            backConnector.type = TransitionType::TERMINATION
                        }
                        lastState.outgoingTransitions += backConnector
                    }
                    // Start again at condState for next case
                    lastState = condState
                }
            } else if (caseExpression instanceof CASTDefaultStatement) {
                
                if (condState != lastState && !lastState.final) { // Break statement for last case does not exist.
                    // Set missingBreakState accordingly, so we can connect it and the current state to each other.
                    missingBreakState = lastState
                    // Set id, so that transformStatement does not join CASTBinaryExpression states of the two cases.
                    lastState = condState
                    // Mark state so that transformStatement does not merge multiple binary statements of two cases.
                    lastState.id = lastState.id + "fallthrough"
                    noBreakBefore = true
                    casebefore = true
                }
                
                parent = condState
                defaultExpression = true
            } else {
                // Finish transforming the content of the case we are looking at.
                parent = caseExpression.transformStatement(lastState)
                // Save the state to determine the last state of the case later.
                lastState = parent
                
                // If this is not a default case, we need the condition for the transition
                if (!defaultExpression) {
                    // This transition connects condState to the content of the case we are looking at
                    condState.outgoingTransitions.last.trigger = kExp
                }
                
                // If the case before the case we are looking at has no break statement...
                if (noBreakBefore) {
                    // ... create a transition between these two.
                    val noBreakTrans = scc.createTransition => [
                        immediate = true
                    ]
                    // Check to determine transition type.
                    if(missingBreakState.hasInnerStatesOrControlflowRegions) {
                        noBreakTrans.type = TransitionType::TERMINATION
                    }
                    missingBreakState.outgoingTransitions += noBreakTrans
                    parent.incomingTransitions += noBreakTrans
                    noBreakBefore = false
                    
                }
            }
        }  // End of for loop
        
        // Reset condState ID back to normal
        condState.id = condID
        
        // Connect the last state of the switch statement to the connectorState. 
        if (!lastState.final) {
            val backConnector = scc.createTransition => [
                targetState = connectorState
                immediate = true
            ]
            if(lastState.hasInnerStatesOrControlflowRegions) {
                    backConnector.type = TransitionType::TERMINATION
            }
            lastState.outgoingTransitions += backConnector
        }

        // Final state of switch statement.
        val endState = scc.createState => [s |
            s.id = "_S" + trC + "_end"
            s.label = "End"
            s.final = true
            switchStateRegion.states += s
        ]
    
        // Check whether the connectorState can be removed. If not, create transition from connectorState to endState.
        checkRemoveConnector(connectorState, endState, switchStateRegion)
        
        
//        var incTransitions = connectorState.incomingTransitions
//        // The connectorState can be removed if it only has one incoming transition.
//        if (incTransitions.length == 1) {
//            incTransitions.head.targetState = endState
//            switchStateRegion.states.remove(connectorState)
//        } else {
//            val falseTrans = scc.createTransition => [
//                targetState = endState
//                immediate = false
//                annotations.add(createStringAnnotation("notImmediate",""))
//                connectorState.outgoingTransitions += it
//            ]
//        }
        
        
        
        switchState
    }
    
    
    def State transformWhile(CASTWhileStatement statement, State state) {
        val f = statement

        // condition
        val exp = f.condition
        val kExp = exp.createKExpression

        // While loop state.
        val whileState = scc.createState => [ s |
            s.id = "_S" + trC + "_while_cs"
            s.label = "while"
            state.parentRegion.states += s
        ]
        
        // Region of whileState. It contains all states of while loop  .               
        val whileStateRegion = scc.createControlflowRegion => [ region |
                region.id = whileState.id + "_region"
                region.label = ""
                whileState.regions += region
        ]

        val condState = scc.createState => [ s |
            s.id = trC.toString + "_cond"
            s.label = createLabel(statement) + "cond"
            s.initial = true
            whileStateRegion.states += s
        ]
        
        // Create transition which connects the parent state "state" to the whileState.
        createConnectingTransition(state, whileState, statement)
        
//        // Connects while loop to the parent.
//        val whileConnector = scc.createTransition => [
//            targetState = whileState
//            
//            // Falls es geschachtelte Kontrollstrukturen sind, ohne dass nach dem cond State eine weitere Zeile kommt,
//            // fixt dies den Bug, dass die Condition der oberen for-Schleife richtig dargestellt wird.
//            if(state.id.contains("_cond")) {
//                var Expression condKExp = null
//                var IASTExpression condCondition = null
//                val condStatement = statement.parent.parent
//
//                if (condStatement instanceof CASTForStatement) {
//                    condCondition = condStatement.conditionExpression
//                } 
//                else if (condStatement instanceof CASTIfStatement) {
//                    condCondition = condStatement.conditionExpression
//                } 
//                else if (condStatement instanceof CASTWhileStatement) {
//                    condCondition = condStatement.condition
//                }
//                condKExp = condCondition.createKExpression
//                trigger = condKExp
//                annotations.add(createStringAnnotation("notImmediate",""))
//                immediate = true
//         
//            } else if(state.hasInnerStatesOrControlflowRegions) {
//                type = TransitionType::TERMINATION
//            } else {
//                immediate = true
//            }
//            state.outgoingTransitions += it
//        ]


        // continue to transform body of while loop
        val body = f.body as CASTCompoundStatement
        val bodyState = body.transformCompound(condState, condState)

        // transition returns to condition-check
        val backTransition = scc.createTransition => [
            targetState = condState
            if (bodyState.hasInnerStatesOrControlflowRegions) {
                type = TransitionType::TERMINATION
            } else {
                immediate = true
            }
            bodyState.outgoingTransitions += it
        ]

        // final state of loop. It is reached when loop condition is not met anymore
        val falseState = scc.createState => [s |
            s.id = trC + "_end"
            s.label = "End"
            s.final = true
            whileStateRegion.states += s
        ]
        
        // transition to falseState
        val falseTrans = scc.createTransition => [
            targetState = falseState
            immediate = true
            annotations.add(createStringAnnotation("notImmediate",""))
            condState.outgoingTransitions += it
        ]

        whileState

    }
    
    
    def State transformDoWhile(CASTDoStatement statement, State state) {
        val f = statement

        // condition
        val exp = f.condition

        val kExp = exp.createKExpression

        // do-while loop state
        val doWhileState = scc.createState => [ s |
            s.id = trC + "_doWhile_cs"
            s.label = "doWhile"
            state.parentRegion.states += s
        ]
        
        // Region of do-whileState. It contains all states of do-while loop   .              
        val doWhileStateRegion = scc.createControlflowRegion => [ region |
                region.id = doWhileState.id + "_region"
                region.label = "" 
                doWhileState.regions += region
        ]

        // Initial state of do-while loop.
        val doState = scc.createState => [ s |
            s.id = "_S" + trC.toString + "_do"
            s.label = "do"
            s.initial = true
            doWhileStateRegion.states += s
        ]
    
        // Continue to transform body of do-while loop.
        val body = f.body as CASTCompoundStatement
        val bodyState = body.transformCompound(doState, doState)

        val condState = scc.createState => [ s |
            s.id = "_S" + trC.toString + "_cond"
            s.label = createLabel(statement) + "cond"
            doWhileStateRegion.states += s
        ]

        // Connect body to condState.
        val condTrans = scc.createTransition => [
            targetState = condState
            if (bodyState.hasInnerStatesOrControlflowRegions) {
                type = TransitionType::TERMINATION
            } else {
                immediate = true
            }
            bodyState.outgoingTransitions += it
        ]
        
        // Create transition which connects the parent state "state" to the doWhileState.
        createConnectingTransition(state, doWhileState, statement)
        
//        // Connects do-while loop to the parent
//        val doWhileConnector = scc.createTransition => [
//            targetState = doWhileState
//            if(state.id.contains("_cond")) {
//                trigger = kExp
//                immediate = true
//                annotations.add(createStringAnnotation("notImmediate",""))
//            } else if(state.hasInnerStatesOrControlflowRegions) {
//                type = TransitionType::TERMINATION
//            } else {
//                immediate = true
//            }
//            state.outgoingTransitions += it
//        ]



        // Transition returns to condition-check.
        val backTransition = scc.createTransition => [
            targetState = doState
            immediate = true
            annotations.add(createStringAnnotation("notImmediate",""))
            trigger = kExp
            condState.outgoingTransitions += it
        ]

        // Final state of loop. It is reached when loop condition is not met anymore.
        val falseState = scc.createState => [s |
            s.id = "_S" + trC + "_end"
            s.label = "End"
            s.final = true
            doWhileStateRegion.states += s
        ]
        
        // Transition to falseState.
        val falseTrans = scc.createTransition => [
            targetState = falseState
            immediate = true
            annotations.add(createStringAnnotation("notImmediate",""))
            condState.outgoingTransitions += it
        ]
        doWhileState

    }
    

    //TODO Da noch mal drüber schauen....
    def State castDeclaration(CASTDeclarationStatement statement, State parent) {
        
        // Stores the state which will be returned at the end of this method.
        var State returnState = null
        val simpleDeclaration = statement.children.filter(typeof(CASTSimpleDeclaration)).head
        /* org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@632de6a4
            org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement@39a94146
             org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration@2603a455
              org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@286a4709
               org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@247e9c66
                a
               org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@57ae4ade
                b */
                
        // Contains all declarators of a DeclarationStatement
        val declaratorList = simpleDeclaration.children.filter(typeof(CASTDeclarator))
        
        // Convert each declarator
        for (declarator : declaratorList) {
            println(declarator.name)
        
            if (declarator != null) {
    
                val iName = declarator.children.head.toString
                val intParamater = kex.createVariableDeclaration => [
                    type = parseCDTType(simpleDeclaration.children.filter(typeof(CASTSimpleDeclSpecifier)).head.type)
                    input = false
                    
                    // If the declaration is the initializer of a for statement, it needs to be added to the forState.
                    if (parent.id.contains("_for")) {
                        parent.declarations += it
                    } else {
                        // Add declaration of variable to the state which is one hierarchy above.
                        parent.parentRegion.parentState.declarations += it
                    }
                ]
                
                val value = kex.createValuedObject => [
                    name = iName
                    intParamater.valuedObjects += it
                    VOSet += it
                ]
    
                val initializer = declarator.children.filter(typeof(CASTEqualsInitializer)).head
                if (initializer != null) {                
                    // A initialization of a variable which depends on an other variable does not become an entry action.
                    if (initializer.children.head instanceof IASTExpression) {
                        var exp = (initializer.children.head as IASTExpression)
                        val initChild = initializer.children.head
                        val childList = initChild.children.toList
                        
                        // Variable declarations inside a control structure must not become entry actions of the control
                        // structure state, since the declaration is only done if the condition is met.
                        if (parent.parentRegion.parentState.id.contains("_cs")) {
                            if (parent.id.contains("_varInit") || parent.id.contains("_binEx")) {
                               var entryAction = parent.createEntryAction
                               entryAction.createAssignment(value, exp.createKExpression)
                               returnState = parent
                           } else {
                               val initVarState = scc.createState => [ s |
                                    s.id = parent.id + "_varInit"
                                    s.label = createLabel(statement)
                                    parent.parentRegion.states += s
                                ]
                                var entryAction = initVarState.createEntryAction
                                entryAction.createAssignment(value, exp.createKExpression)
                                // Create transition which connects the parent state "state" to the codeState.
                                createConnectingTransition(parent, initVarState, statement)
                                returnState = initVarState
                           }
                        }
                        
                        
                        if (initChild instanceof CASTIdExpression) {
                           // Write into previous state if there also is an other variable initialization.
                           if (parent.id.contains("_varInit") || parent.id.contains("_binEx")) {
                               var entryAction = parent.createEntryAction
                               entryAction.createAssignment(value, exp.createKExpression)
                           }
                           // If this is not the case, create an extra state.
                           else {
                                val initVarState = scc.createState => [ s |
                                    s.id = parent.id + "_varInit"
                                    s.label = createLabel(statement)
                                    parent.parentRegion.states += s
                                ]
                                val trans = scc.createTransition => [
                                    targetState = initVarState
                                    immediate = true
                                    if (parent.hasInnerStatesOrControlflowRegions) {
                                        type = TransitionType::TERMINATION
                                    }
                                    parent.outgoingTransitions += it
                                ]
                                var entryAction = initVarState.createEntryAction
                                entryAction.createAssignment(value, exp.createKExpression)
                                returnState = initVarState 
                                
                           }
                            
                        } else if (initChild instanceof CASTBinaryExpression) {
                            // Falls die Variablenzuweisung abhängig von einer anderen Variable ist...
                            if (childList.filter(typeof(CASTSimpleDeclSpecifier)) != []) {
                                // Schreibe in den vorherigen State, falls direkt davor auch schon eine Variablenzuweisung war...
                                if (parent.id.contains("_varInit")) {
                                   var entryAction = parent.createEntryAction
                                   entryAction.createAssignment(value, exp.createKExpression)
                                }
                                // ... sonst separate state
                                else {
                                    val initVarState = scc.createState => [ s |
                                        s.id = parent.id + "_varInit"
                                        s.label = createLabel(statement)
                    
                                        parent.parentRegion.states += s
                                    ]
                                    val trans = scc.createTransition => [
                                        targetState = initVarState
                                        immediate = true
                                        if (parent.hasInnerStatesOrControlflowRegions) {
                                            type = TransitionType::TERMINATION
                                        }
                                        parent.outgoingTransitions += it
                                    ]
                                    var entryAction = initVarState.createEntryAction
                                    entryAction.createAssignment(value, exp.createKExpression)
                                    returnState = initVarState 
                                    
                                }
                            }
                        }
                         
                        var EntryAction entryAction = null
                        // If the declaration is the initializer of a for statement, create entryAction for forState
                        if (parent.id.contains("_for")) {
                            entryAction = parent.createEntryAction
                        } else {
                            // For declaration, create entryAction for parentState (der in der Hierarchie eins oben drüber)
                            entryAction = parent.parentRegion.parentState.createEntryAction
                        }
                        entryAction.createAssignment(value, exp.createKExpression)
                    }
                } else {
                    returnState = parent
                }
            }
        
        }
        if (returnState != null) {
            return returnState
        }
        parent
    }

    def Expression casteEqualsInitializer(CASTEqualsInitializer initializer, ValueType type) {
        if (initializer != null) {
            return (initializer.children.head as IASTExpression).createKExpression
        } else {
            null
        }

    }


    def State transformIf(CASTIfStatement statement, State state) {
        
        var needExtraEndState = false
        var trueBodyFinal = false
        var bothBodiesFinal = false
        val ifs = statement
        val exp = ifs.children.filter(typeof(CASTBinaryExpression)).head
        val kExp = exp.createKExpression

        
        // If construct state.
        val ifState = scc.createState => [ s |
            s.id = "_S" + trC + "_if_cs"
            s.label = "if"
            state.parentRegion.states += s
        ]
        
        // Region of ifState. It contains all states of the if statement.
        val ifStateRegion = scc.createControlflowRegion => [ region |
                region.id = ifState.id + "_region"
                region.label = ""
                ifState.regions += region
        ]

        // Create transition which connects the parent state "state" to the ifState.
        createConnectingTransition(state, ifState, statement)
        
//        // Connects if construct to the parent
//        val ifConnector = scc.createTransition => [
//            targetState = ifState
//            // Falls es geschachtelte Kontrollstrukturen sind, ohne dass nach dem cond State eine weitere Zeile kommt,
//            // fixt dies den Bug, dass die Condition des oberen for-Schleife richtig dargestellt wird.
//            if(state.id.contains("_cond")) {
//                var Expression condKExp = null
//                var IASTExpression condCondition = null
//                val condStatement = statement.parent.parent
//
//                if (condStatement instanceof CASTForStatement) {
//                    condCondition = condStatement.conditionExpression
//                } 
//                else if (condStatement instanceof CASTIfStatement) {
//                    condCondition = condStatement.conditionExpression
//                } 
//                else if (condStatement instanceof CASTWhileStatement) {
//                    condCondition = condStatement.condition
//                }
//                condKExp = condCondition.createKExpression
//                trigger = condKExp
//                annotations.add(createStringAnnotation("notImmediate",""))
//                immediate = true
//         
//            } else if(state.hasInnerStatesOrControlflowRegions) {
//                type = TransitionType::TERMINATION
//            } else {
//                immediate = true
//            }
//            state.outgoingTransitions += it
//        ]
        
        // The outgoing transitions of the condState to check the condition of the if statement.
        val condState = scc.createState => [ s |
            s.id = "_S" + trC.toString + "_cond"
            s.label = createLabel(ifs) + "cond"
            s.initial = true
            ifStateRegion.states += s
        ]

        // Connects states to the final endState of the if statement, if necessary.
        val connectorState = scc.createState => [ s |
            s.id = "_S" + trC.toString
            s.label = s.id
            s.setTypeConnector
            ifStateRegion.states += s
        ]

        
        // Body of statements, if condition is met.
        val trueBody = (ifs.thenClause as CASTCompoundStatement).transformCompound(condState, condState)

        // If true, then we only want an extra endState if necessary.
        if (!extraEndStateOption) {
            
           // A final state cannot have inner behavior for Core SCCharts, so we need an extra final state.
            if (trueBody.hasInnerStatesOrControlflowRegions) {
                val trueConnector = scc.createTransition => [
                    targetState = connectorState
                    immediate = true
                    type = TransitionType::TERMINATION
                    trueBody.outgoingTransitions += it
                ]
                needExtraEndState = true
            } else {
                // If no inner behavior, there is no need for an extra final state.
                trueBody.final = true
                trueBodyFinal = true
            }
        
        } else {
            // If false, so we want a extra endState for every if statement.
//            if (!trueBody.final) {
                val trueConnector = scc.createTransition => [
                    targetState = connectorState
                    immediate = true
                    if (trueBody.hasInnerStatesOrControlflowRegions) {
                        type = TransitionType::TERMINATION
                    }
                    trueBody.outgoingTransitions += it
                ]
//            }
        }
        
        // Check whether a else clause exists.
        if (ifs.elseClause != null) {
            // Body of statements, if condition is not met.
            var State falseBody = null;
            
            if (ifs.elseClause instanceof CASTCompoundStatement) {
   
                falseBody = (ifs.elseClause as CASTCompoundStatement).transformCompound(condState, condState)
                
            // Check for else if statement.
            } else if (ifs.elseClause instanceof CASTIfStatement) {
                falseBody = (ifs.elseClause as CASTIfStatement).transformIf(condState)
            }
            
            // Here we check whether there needs to be an extra endState due to the content of falseBody.
            if (!extraEndStateOption) {
                // Final state cannot have inner behavior for Core SCCharts, so we need an extra final state.
                if (falseBody.hasInnerStatesOrControlflowRegions) {
                    val falseConnector = scc.createTransition => [
                        targetState = connectorState
                        immediate = true
                        type = TransitionType::TERMINATION
                    ]
                    // Therefore, we need an extra endState.
                    needExtraEndState = true
                    falseBody.outgoingTransitions += falseConnector
                } else {
                    // As falseBody has no inner behavior, it can be final.
                    falseBody.final = true
                    if (trueBodyFinal) {
                        bothBodiesFinal = true
                    }
                }
            } else {
                // We want an extra endState regardless of the content of falseBody.
//                if (!falseBody.final) {
                    val falseConnector = scc.createTransition => [
                        targetState = connectorState
                        immediate = true
                    ]
                    if (falseBody.hasInnerStatesOrControlflowRegions) {
                        falseConnector.type = TransitionType::TERMINATION
                    }
                    falseBody.outgoingTransitions += falseConnector
//                }
            }

            // Here we ensure that the else condition transition has no trigger and is immediate.
            val elseTransition = condState.outgoingTransitions.last // condState's last transition in list is always the else transition.
            elseTransition.trigger = null
            elseTransition.immediate = true
//            elseTransition.annotations.add(createStringAnnotation("notImmediate",""))

        }
        
        // If needed, add an extra endState and transitions.
        if (ifs.elseClause == null || needExtraEndState || extraEndStateOption) {
            // In case that trueBody and falseBody are both final, then we do not need an endState regardless.
            if (!bothBodiesFinal) {
                // Final state of loop. It is reached when loop condition is not met anymore.
                val endState = scc.createState => [s |
                    s.id = "_S" + trC + "_end"
                    s.label = "End"
                    s.final = true
                    ifStateRegion.states += s
                ]
                // This default transition from condState to endState is only needed if there is no else clause.
                if (ifs.elseClause == null) {
                    // Transition to endState.
                    val defaultTrans = scc.createTransition => [
                        targetState = connectorState
                        immediate = true
//                        annotations.add(createStringAnnotation("notImmediate",""))
                        condState.outgoingTransitions += it
                    ]
                }
                
                
                
    //            // Final transition to endState.            
    //            val falseTrans = scc.createTransition => [
    //                targetState = endState
    //                immediate = false
    //                annotations.add(createStringAnnotation("notImmediate",""))
    //                connectorState.outgoingTransitions += it
    //            ]
                
                // Check whether the connectorState can be removed. If not, create transition from connectorState to endState.
                checkRemoveConnector(connectorState, endState, ifStateRegion)
            }
            // If connectorState has no incoming transitions, remove it.
            checkRemoveConnector(connectorState, null, ifStateRegion)
        } else {
            // If connectorState has no incoming transitions, remove it.
            checkRemoveConnector(connectorState, null, ifStateRegion)
        }
        
        
        
        ifState
    }
    
    
    

    def State transformFor(CASTForStatement statement, State state) {
        val f = statement
        
        // For loop state
        val forState = scc.createState => [ s |
            s.id = "_S" + trC + "_for_cs"
            s.label = "for"
            state.parentRegion.states += s
        ]
        val saveID = forState.id
        
        // Region of forState. It contains all states of the for loop                 
        val forStateRegion = scc.createControlflowRegion => [ region |
                region.id = forState.id + "_region"
                region.label = ""
                forState.regions += region
        ]
        
        // Initializer
        if (f.initializerStatement instanceof CASTDeclarationStatement) {
            val initializationExp = f.initializerStatement as CASTDeclarationStatement
            initializationExp.castDeclaration(forState) // add declaration to function head
        } else {
            forState.id = "_initFor"
            (f.initializerStatement as CASTExpressionStatement).transformExpression(forState)
            forState.id = saveID
        }

        // Condition
        val exp = f.conditionExpression
        val kExp = exp.createKExpression

        val condState = scc.createState => [ s |
            s.id = "_S" + trC + "_cond"
            s.label = "cond"
            s.initial = true

            forStateRegion.states += s
        ]
        
        // Create transition which connects the parent state "state" to the forState.
        createConnectingTransition(state, forState, statement)
        
//        // Connects for loop to the parent
//        val forConnector = scc.createTransition => [
//            targetState = forState
//            // Falls es geschachtelte Kontrollstrukturen sind, ohne dass nach dem cond State eine weitere Zeile kommt,
//            // fixt dies den Bug, dass die Condition der oberen for-Schleife richtig dargestellt wird.
//            if(state.id.contains("_cond")) {
//                var Expression condKExp = null
//                var IASTExpression condCondition = null
//                val condStatement = statement.parent.parent
//
//                if (condStatement instanceof CASTForStatement) {
//                    condCondition = condStatement.conditionExpression
//                } 
//                else if (condStatement instanceof CASTIfStatement) {
//                    condCondition = condStatement.conditionExpression
//                } 
//                else if (condStatement instanceof CASTWhileStatement) {
//                    condCondition = condStatement.condition
//                }
//                condKExp = condCondition.createKExpression
//                trigger = condKExp
//                annotations.add(createStringAnnotation("notImmediate",""))
//                immediate = true
//         
//            } else if(state.hasInnerStatesOrControlflowRegions) {
//                type = TransitionType::TERMINATION
//            } else {
//                immediate = true
//        }
//            state.outgoingTransitions += it
//        ]

        

        // Iterate-action
        val body = f.body as CASTCompoundStatement

        val bodyState = body.transformCompound(condState, condState)
        var State iterateExp = null
        if (bodyState.id.contains("_varInit") || bodyState.id.contains("_binEx")) {
            iterateExp = (f.iterationExpression as CASTBinaryExpression).createDataflow(bodyState)
        } else {
            val iterateState = scc.createState => [ s |
                s.id = "_S" + trC + "T"
                s.label = createLabel(statement)
    
                forStateRegion.states += s
            ]
            iterateExp = (f.iterationExpression as CASTBinaryExpression).createDataflow(iterateState)
            val iterateTrans = scc.createTransition => [
                targetState = iterateState
                if (bodyState.hasInnerStatesOrControlflowRegions) {
                    type = TransitionType::TERMINATION
                } else {
                    immediate = true
                }
                bodyState.outgoingTransitions += it
            ]
        }
        
        

        val backTransition = scc.createTransition => [
            targetState = condState
            immediate = true
            annotations.add(createStringAnnotation("notImmediate",""))
        ]
        iterateExp.outgoingTransitions += backTransition
        
        // Final state of loop. It is reached when loop condition is not met anymore
        val falseState = scc.createState => [s |
            s.id = "_S" + trC + "_end"
            s.label = "End"
            s.final = true
            forStateRegion.states += s
        ]
        
        // Transition to falseState
        val falseTrans = scc.createTransition => [
            targetState = falseState
            immediate = true
            annotations.add(createStringAnnotation("notImmediate",""))
            condState.outgoingTransitions += it
        ]

        forState
    }

    def ValuedObject createValuedObjectFromDeclarationStatement(CASTDeclarationStatement declaration,
        boolean withInitializationPart) {
        val simpleDecl = declaration.children.filter(typeof(CASTSimpleDeclaration)).head
        val decl = simpleDecl.children.filter(typeof(CASTDeclarator)).head

        val VO = decl.createValuedObjectFromDeclarator

        if (withInitializationPart) {
            val init = decl.children.filter(typeof(CASTEqualsInitializer))
            if (!init.empty) {
                VO.initialValue = createIntValue(Integer.parseInt(init.head.children.head.toString))
            }
        }

        VO
    }

    def ValuedObject createValuedObjectFromDeclarator(CASTDeclarator declarator) {

        // org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@50429fba
        // tmp
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@46049580
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@56f32a69
        // fh        
        val iName = declarator.children.head.toString
        val lVar = kex.createValuedObject => [
            name = iName
        ]

        lVar
    }

    def State transformReturn(CASTReturnStatement returnStatement, State state) {
        
        var returnState = scc.createState
         => [
              id = "_S" + trC.toString
              label = ""
//            id = trC.toString
//            label = createLabel(returnStatement)
//            state.parentRegion.states += it
        ]
        
        
        if ((state.id.contains("_binEx") || state.id.contains("_varInit")) && !state.id.contains("fallthrough")) {
//            // Combine last state and return statement.
//            val entryact = state.createEntryAction
//            entryact.createAssignment(VOSet.filter[name.equals(RETURNVONAME)].head,
//                                      returnStatement.returnValue.createKExpression)
            returnState = state
//            if (!extraEndStateOption) {
//                returnState.final = true
////                state.final = true
//            }
            
        } else {
            // Create transition which connects the parent state "state" to the returnState.
            state.parentRegion.states += returnState
        
            createConnectingTransition(state, returnState, returnStatement)
            
            }
        
            val entryact = returnState.createEntryAction
            entryact.createAssignment(VOSet.filter[name.equals(RETURNVONAME)].head,
                                      returnStatement.returnValue.createKExpression)
//        }
        
        // In case of a nested return statement...
        if (!state.parentRegion.id.contains("_function")) {
            val parameter = kex.createVariableDeclaration => [
                type = ValueType::BOOL
            ]
            
            // ... add parameter to VOSet and give it a name.
            val value = kex.createValuedObject => [
                id = trC.toString
                name = "nestedReturn"
                parameter.valuedObjects += it
                VOSet += it
            ]
            
            // Save it so we can create the variable declaration at the top-level region of the function.
            nestedReturnParameter = parameter
            
            // Set nestedReturn variable to true, so that the exit condition for the nested return is met.
            var boolVal = kex.createBoolValue
            boolVal.value = true
            var entryAction = returnState.createEntryAction
            entryAction.createAssignment(value, boolVal)
            
            if (state.parentRegion.parentState != null && state.parentRegion.parentState.hasInnerStatesOrControlflowRegions) {
                var tmp = state.parentRegion.parentState.id
                tmp += "_hasNestedReturn"
                state.parentRegion.parentState.id = tmp
                
            }
            
        } else {
            if (extraEndStateOption) {
                val endState = scc.createState => [
                    id = "_S" + trC + "_end"
                    label = "End"
                    final = true
                    state.parentRegion.states += it
                ]
                
                val falseTrans = scc.createTransition => [
                    targetState = endState
                    immediate = true
//                    returnState.outgoingTransitions += it
                ]
                returnState.outgoingTransitions += falseTrans
            } else {
                returnState.final = true
            }
        }

        returnState
    }
    
    // Status whether it is a non-void function call (assignment of the return value to a variable).
    var funcCallWithAssignment = false
    
    def State transformExpression(CASTExpressionStatement es, State state) {
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@7f6adc09
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement@40941439
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@39bbcb4e
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@58208b7e
        // fh
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@40a62a65
        // n
        var CASTIdExpression operand1 = null
        var CASTFunctionCallExpression operand2 = null
        
        if (es.expression instanceof CASTBinaryExpression) {
            // Create binary expression
            val exp = es.expression as CASTBinaryExpression
            // In case of a non-void function call:
            if (exp.operand2 instanceof CASTFunctionCallExpression) {
                funcCallWithAssignment = true
                operand1 = exp.operand1 as CASTIdExpression
                operand2 = exp.operand2 as CASTFunctionCallExpression
                
                /* Contains the variable (operand1) which the return value of the function call (operand2) is assigned to.
                 * Later on, it is used for referencing. */
                val Pair<CASTIdExpression, CASTFunctionCallExpression> p = new Pair(operand1,operand2)
                /* The referencing needs to be done at a later point because until now, the called function
                 * does not have to be looked at yet.
                 */
                functionCallAssignment.add(p)
            }
            // If variable assignment happens right after the initial state of the function -> entry action parent state
            else if(state.id.contains("_initFuncState")) {
                val entryact = state.parent.createEntryAction
                entryact.createAssignment((exp.operand1 as CASTIdExpression).createVOReference.valuedObject,
                    exp.operand2.createKExpression)
                return state
            }
            // If variable assignments is follows by another variable assignment / declaration -> put them into one state.
            // This does not apply to "fallthrough" switch states.
            else if ((state.id.contains("_binEx") || state.id.contains("_varInit")) && !state.id.contains("fallthrough")) {
                val entryact = state.createEntryAction
                entryact.createAssignment((exp.operand1 as CASTIdExpression).createVOReference.valuedObject,
                    exp.operand2.createKExpression)
                return state
            }
            // If variable assignments is done for counter variable of for loop / declaration -> put them into one state.
            else if (state.id.contains("_initFor")) {
                val entryact = state.createEntryAction
                entryact.createAssignment((exp.operand1 as CASTIdExpression).createVOReference.valuedObject,
                    exp.operand2.createKExpression)
                return state
            }
            // else -> create new state for variable assignment
            else {
                val codeState = scc.createState => [ s |
                    s.id = "_S" + trC + "_binEx"
                    s.label = createLabel(es)
    
                    state.parentRegion.states += s
                    val entryact = s.createEntryAction
                    entryact.createAssignment((exp.operand1 as CASTIdExpression).createVOReference.valuedObject,
                        exp.operand2.createKExpression)
                ]

                // Create transition which connects the parent state "state" to the codeState.
                createConnectingTransition(state, codeState, es)

                return codeState
            }
        }


        // Handle function calls.
        if (es.expression instanceof CASTFunctionCallExpression || funcCallWithAssignment) {

            var CASTFunctionCallExpression funcCallExp = null
            
            if (funcCallWithAssignment) {
                // In case of a non-void function call:
                funcCallExp = operand2
            } else {
                // In case of a void function:
                funcCallExp = es.children.filter(CASTFunctionCallExpression).head
            }
            
            // Create referencing state.
            val refState = scc.createState => [ s |
                s.id = "_S" + trC + "_ref"
                s.label = "Call"
                state.parentRegion.states += s
            ]
            
            // The function of the FunctionCallExpression should be referenced to later on by refState.
            val Pair<CASTFunctionCallExpression, State> p = new Pair(funcCallExp,refState)
            /* The referencing needs to be done at a later point because until now, the called function
             * does not have to be looked at yet.
             */
            functionCallRefs.add(p)
            
            // Create transition which connects the parent state "state" to the refState.
            createConnectingTransition(state, refState, es)
            
            // Set to false for next function calls.
            funcCallWithAssignment = false
            
            return refState
        }
        null
    }
    

    def ValuedObject createFunctionCallValuedObject(CASTFunctionCallExpression expression) {
        val cal = kex.createValuedObject;
        cal.name = expression.children.filter(typeof(CASTIdExpression)).head.name.toString

        cal.name = cal.name + "("

        for (parameter : expression.arguments) {
            if (parameter instanceof IASTExpression) {
                cal.name = cal.name + (parameter as IASTExpression).rawSignature + ","
            } else {
                cal.name = cal.name + parameter.toString + ","
            }

        }
        if (!expression.arguments.empty) {
            cal.name = cal.name.substring(0, cal.name.length - 1) + ")"
        } else {
            cal.name = cal.name + ")"
        }
        

        cal.id("test")
        return cal
    }

    def State createDataflow(CASTBinaryExpression exp, State state) {

        // org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@7940791
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@77cc47a
        // n
        // 1
        
        // Create entryAction for variable assignment.
        val entryact = state.createEntryAction
        entryact.createAssignment((exp.operand1 as CASTIdExpression).createVOReference.valuedObject,
                                   exp.operand2.createKExpression)
        state
    }

    def createDataflow(CASTDeclarator declarator, State state) {

        // org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@50429fba
        // tmp
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@46049580
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@56f32a69
        // fh        createDataflow
        val iName = declarator.children.head.toString
        val lVar = kex.createValuedObject => [
            name = iName
            VOSet += it
        ]

        // funcGlobalState.valuedObjects += lVar
        val init = declarator.initializer
        if (init != null) {
            val value = init.children.head
            var Expression kExp
            if (value instanceof CASTIdExpression) {
                kExp = (value as CASTIdExpression).createKExpression
            } else {
                kExp = createIntValue(Integer.parseInt(value.toString))
            }
            val df = state.dataflowRegion

            val eq = KEffectsFactory.eINSTANCE.createAssignment
            eq.valuedObject = lVar
            eq.expression = kExp

//            df.equations.add(eq)
        }
    }

    def Expression createKExpression(IASTExpression exp) {
        if (exp instanceof CASTIdExpression) {
            return (exp as CASTIdExpression).createVOReference
        } else if (exp instanceof CASTFunctionCallExpression) {
            return (exp as CASTFunctionCallExpression).transformFunctionCall
        } else if (exp instanceof CASTBinaryExpression) {
            return (exp as CASTBinaryExpression).createKExpression
        } else if (exp instanceof CASTUnaryExpression) {
            (exp as CASTUnaryExpression).createUnaryExpression
        } else {
//            return exp.toString.createStringValue;
             return Integer.parseInt(exp.toString).createIntValue
        }
    }

    def Expression createUnaryExpression(CASTUnaryExpression expression) {
        (expression.children.head as IASTExpression).createKExpression
    }

    def Expression transformFunctionCall(CASTFunctionCallExpression expression) {

        val opExp = kex.createOperatorExpression

        expression.createFunctionCallValuedObject

        // opExp.addValuedObject(expression.createFunctionCallValuedObject) //= expression.functionNameExpression.createKExpression
        val exp = kex.createTextExpression
        exp.text = expression.createFunctionCallValuedObject.name

        // exp.addValuedObject(expression.createFunctionCallValuedObject)
        //
        // for (IASTExpression child : expression.arguments.filter(IASTExpression)) {
        // opExp.subExpressions += createKExpression(child)
        // }
        return exp // opExp
    }

    def Expression createKExpression(CASTBinaryExpression exp) {

        // org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@7940791
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@77cc47a
        // n
        // 1
        val opExp = kex.createOperatorExpression
        switch exp.operator {
            case IASTBinaryExpression::op_lessEqual:
                opExp.operator = OperatorType::LEQ
            case IASTBinaryExpression::op_greaterEqual:
                opExp.operator = OperatorType::GEQ
            case IASTBinaryExpression::op_lessThan:
                opExp.operator = OperatorType::LT
            case IASTBinaryExpression::op_greaterThan:
                opExp.operator = OperatorType::GT
            case IASTBinaryExpression::op_plus:
                opExp.operator = OperatorType::ADD
            case IASTBinaryExpression::op_binaryAnd:
                opExp.operator = OperatorType::BITWISE_AND
            case IASTBinaryExpression::op_binaryOr:
                opExp.operator = OperatorType::BITWISE_OR
            // case IASTBinaryExpression::op_binaryXor:     opExp.operator = OperatorType::XOR
            case IASTBinaryExpression::op_divide:
                opExp.operator = OperatorType::DIV
            case IASTBinaryExpression::op_minus:
                opExp.operator = OperatorType::SUB
            case IASTBinaryExpression::op_modulo:
                opExp.operator = OperatorType::MOD
            case IASTBinaryExpression::op_multiply:
                opExp.operator = OperatorType::MULT
        }

        for (arg : exp.children) {
            if (arg instanceof CASTIdExpression) {
                opExp.subExpressions += (arg as CASTIdExpression).createVOReference
            } else if (arg instanceof CASTFunctionCallExpression) {
                opExp.subExpressions += (arg as CASTFunctionCallExpression).createKExpression
            } else if ((arg instanceof CASTBinaryExpression)) {
                opExp.subExpressions += kex.createOperatorExpression
            } else if ((arg instanceof CASTUnaryExpression)) {
                opExp.subExpressions += arg.createKExpression;
            } else {
                opExp.subExpressions += Integer.parseInt(arg.toString).createIntValue
            }
        }

        opExp
    }

    def Assignment createAssignment(CASTUnaryExpression unary) {
        val assignment = KEffectsFactory.eINSTANCE.createAssignment

        val VOR = (unary.operand as CASTIdExpression).createVOReference
        assignment.valuedObject = VOR.valuedObject
        assignment.expression = kex.createOperatorExpression => [
            subExpressions += VOR
            subExpressions += 1.createIntValue
        ]
        if (unary.operator == IASTUnaryExpression::op_postFixIncr)
            (assignment.expression as OperatorExpression).operator = OperatorType::ADD
        else if (unary.operator == IASTUnaryExpression::op_postFixDecr)
            (assignment.expression as OperatorExpression).operator = OperatorType::SUB

        assignment
    }

    def ValuedObjectReference createVOReference(CASTIdExpression idExp) {
        val VO = VOSet.filter[name.equals(idExp.children.head.toString)].head
        if (VO != null) {
            return VO.reference
        }
        return null
    }

    def printASTNodes(Iterable<IASTNode> nodes, String indent) {
        if(nodes == null) return;
        for (node : nodes) {
            System.out.println(indent + node.toString)

            if (node instanceof CASTProblem) {
                val prob = node as CASTProblem
                System.out.println(indent + " == " + prob.message + " ==");
                for (arg : prob.arguments) {
                    System.out.println(indent + "     " + prob.message + " ");
                }
            }

            node.children.printASTNodes(indent + " ")
        }
    }

    private def scc() {
        SCChartsFactory::eINSTANCE
    }

    private def kex() {
        KExpressionsFactory::eINSTANCE
    }

    private def ControlflowRegion getControlflowRegion(State state) {
        state.regions.filter(typeof(ControlflowRegion)).head
    }

    private def DataflowRegion getDataflowRegion(State state) {
        state.regions.filter(typeof(DataflowRegion)).head
    }

    private def State getParent(State state) {
        state.parentRegion.parentState
    }

    private def int trC() {
        _trc = _trc + 1
        _trc
    }

    private def ValueType parseCDTType(int n) {
        switch n {
            case 1: null
            case 2: ValueType::STRING
            case 3: ValueType::INT
            case 4: ValueType::FLOAT
            case 5: ValueType::DOUBLE
            case 6: ValueType::BOOL
            case 7: ValueType::STRING
            case 8: null
            case 9: null
            case 10: null
            case 11: ValueType::STRING
            case 12: ValueType::STRING
            default: null
        }
    }

    def EntryAction createEntryAction(State state) {
        val action = SCChartsFactory::eINSTANCE.createEntryAction
        state.localActions.add(action);

        action
    }
    
    private def String createLabel(IASTNode node) {
        var option = getLabelOption
        switch (option) {
            case 1: return createLineLabel(node)
            case 2: return ""
            default: return createLineLabel(node)
        }
    }

    private def String createLineLabel(IASTNode node) {
        return "line: " + (node as IASTStatement).nodeLocations.head.asFileLocation.startingLineNumber;
    }

    private def int getLabelOption() {
        return 2;
    }
    
    /* Toggle the transformation option for if control structures:
     *   return true = create a separate endState for each construct
     *   return false = create only a separate endState for each construct if necessary
     */
    private def boolean getExtraEndStateOption() {
        return false;
//        return true;
    }
    
    // Creates the outgoing transition of a condState with the condition of the respective control structure.
    private def Transition createConnectingTransition(State src, State dst, ASTNode statement) {
        // Connects switch statement to the parent.
        val connector = scc.createTransition => [
            targetState = dst

            if(src.id.contains("_cond")) {
                var Expression condKExp = null
                var IASTExpression condCondition = null
                val condStatement = statement.parent.parent

                if (condStatement instanceof CASTForStatement) {
                    condCondition = condStatement.conditionExpression
                } 
                else if (condStatement instanceof CASTIfStatement) {
                    condCondition = condStatement.conditionExpression
                } 
                else if (condStatement instanceof CASTWhileStatement) {
                    condCondition = condStatement.condition
                }
                if (condCondition != null) {
                    condKExp = condCondition.createKExpression
                }
                
                trigger = condKExp
//                annotations.add(createStringAnnotation("notImmediate",""))
                immediate = true
         
            } else if(src.hasInnerStatesOrControlflowRegions) {
                type = TransitionType::TERMINATION
            } else {
                immediate = true
            }
            src.outgoingTransitions += it
        ]
        
        return connector
    }
    

    // Return the entry of the global function list which has the same id as the one we are looking for.
    private def State lookForFunctions(String id) {
        for (s : functions) {
            if (s.key.id.contains(id)) {
                return s.key
            }
        }
        // If there is no such entry, return null.
        return null
    }
    
    
    private def CASTIdExpression getAssignedVariableForReturnVal(CASTFunctionCallExpression f) {
        for (entry : functionCallAssignment) {
            val variable = entry.key
            val funcName = entry.value
            if (f.equals(funcName)) {
                return variable
            }
        }
        return null
    }
    
    
    // Check whether a given connectorState can be removed.
    private def checkRemoveConnector(State connectorState, State dst, ControlflowRegion region) {
        // Final transition to endState.
        var incTransitions = connectorState.incomingTransitions
        // The connectorState can be removed if it only has none or one incoming transition.
        if (incTransitions.length == 0) {
            region.states.remove(connectorState)
        }
        else if (dst != null) {
            if (incTransitions.length == 1) {
                // The incoming transition needs to be redirected to a given destination state (dst).
                incTransitions.head.targetState = dst
                region.states.remove(connectorState)
            } else {
                // If the connectorState is not removed, connect it to a given destination state (dst).
                scc.createTransition => [
                    targetState = dst
                    immediate = true
                    connectorState.outgoingTransitions += it
                ]
            }
        }
    }
   
    // Return a list of arguments of the given FunctionCallExpression.
    private def List<IASTExpression> getFunctionCallArguments(CASTFunctionCallExpression funcCallExp) {
        // Ensure that argumentList is empty
        argumentList.clear
        val children = funcCallExp.children
        // Get name of called function
        val funcId = children.head
        // Copy entries to our working list argumentList
        for(a : children) {
            argumentList.add(a as IASTExpression)
        }
        /* Remove first entry, which is the IdExpression of the function. We only want the arguments of the 
         * function call in our argumentList. */
        argumentList.remove(funcId)
        
        return argumentList
    }
    
    
    /* In case of a nested return statement, we need to add an additional exit out of the nested control
     * structures so that the code after the return statement is not executed. */
    private def checkForNestedReturn(State state) {
        // If this valuedObject list is empty then there is no nested return statement inside the program code.
        if (!nestedReturnParameter.valuedObjects.empty) {
            // Check if the nested return statement can be found inside state.
            if (state.id.contains("_hasNestedReturn")) {
                val parentRegion = state.parentRegion
                // Set id of parent state because the return statement is inside it.
                var tmp = parentRegion.parentState.id
                tmp += "_hasNestedReturn"
                parentRegion.parentState.id = tmp
                
                // Create additional exit out of the nested control structures.
                val endState = scc.createState => [s |
                    s.id = "_S" + trC + "_end" + "_nestedReturn"
                    s.label = "End"
                    s.final = true
                    parentRegion.states += s
                ]
                val endTrans = scc.createTransition => [
                    targetState = endState
                    immediate = true 
                ]
            
                // Get valued object reference for trigger of transition.
                val VO = VOSet.filter[name.equals(NESTEDRETURN)].head
                var ValuedObjectReference ex = null
                if (VO != null) {
                    ex = VO.reference
                }
                
                // Set trigger to ensure that this exit is only taken when a nested return statement exists.
                endTrans.trigger = ex
                
                // Check for transition type.
                if (state.hasInnerStatesOrControlflowRegions) {
                    endTrans.type = TransitionType::TERMINATION
                }
                state.outgoingTransitions += endTrans
            
            }
        }
    }
    

// DAS HIER IST ALT. IST GLAUBE ICH UNNÖTIG!

//    private def void removeConnectorStates() {
//        for (var int i = 0; i < connectorStates.length(); i++) {
//
//            if (connectorStates.get(i).outgoingTransitions.empty) {
//                connectorStates.get(i).parentRegion.states.remove(connectorStates.get(i))
//            // connectorStates.remove(i);
//            }else if (connectorStates.get(i).incomingTransitions.empty){
//                connectorStates.get(i).parentRegion.states.remove(connectorStates.get(i))
//            }
//        // state.outgoingTransitions.head.targetState=state
//        // state.incomingTransitions+=state.outgoingTransitions.head
//        // state.parentRegion.states.remove(state);
////            for(var int i=0; i<state.incomingTransitions.length(); i++) {
////                
////                state.incomingTransitions.get(i).targetState = targetstate
////                
////            }
////            for (transi:state.incomingTransitions){
////                transi.targetState = targetstate
////                //System.out.println(transi);
////            }
//        //
//        }
//    }
//    private createExpression    
}
