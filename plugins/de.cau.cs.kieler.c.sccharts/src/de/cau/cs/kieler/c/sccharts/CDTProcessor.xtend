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
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment
import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsFactory
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
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.transformations.Termination
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDoStatement

/**
 * @author ssm
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
    
    public static val RETURNVONAME = "return"

    val VOSet = <ValuedObject>newHashSet
    var _trc = 0

    var Declaration globalDeclaration

    var State funcGlobalState
    
    // save all different labels of defined functions. Used for lookup for function-calls
    var funcLabelSet = <String>newHashSet

    Map<String, State> functionStates = new HashMap<String, State>();
    List<State> connectorStates = new ArrayList<State>();
    String parameterStr

    def State createFromEditor(IEditorPart editor) {
        val cEditor = editor as CEditor
        val tu = cEditor.translationUnit
        tu.transform as State
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
        
        // print different function-definitions
        ast.children.forEach [f | 
            val declarator = f.children.filter(typeof(CASTFunctionDeclarator)).head
            val label = declarator.children.head.toString
            // save label in a set so we can look up all defined functions of the program afterwards
            funcLabelSet.add(label)
//            println("AST-Children: " + label)
        ]

        VOSet.clear

        // Root State (program)
        val surroundmodel = scc.createState => [ root |
            root.label = translationUnit.file.name
            root.id = root.label
            
            val rootRegion = scc.createControlflowRegion => [
                        id = "_rootRegion"
                        label = ""
                        root.regions += it
            ]
            
            ast.children.forEach [ func | // for each defined function
                if (func instanceof CASTFunctionDefinition) {
                    val rootFunctionDefinition = func as CASTFunctionDefinition

                    val model = rootFunctionDefinition.transformFunction

                    rootRegion.states += model
                    
                }
            ]
        ]
        removeConnectorStates();
        surroundmodel.createStringAnnotation("cgeneratedscchart","")
        surroundmodel
    }

    def State transformFunction(CASTFunctionDefinition function) {

        // org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDefinition@6c704a9e
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@403302b0
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator@54f591bd
        // fib
        val returnDeclaration = kex.createDeclaration => [
            type = parseCDTType(function.children.filter(typeof(CASTSimpleDeclSpecifier)).head.type)
            output = true
        ]

        val returnValue = kex.createValuedObject => [
            name = "return"
            returnDeclaration.valuedObjects += it
            VOSet += it
        ]

        // create the scchart model for the function 
        val declarator = function.children.filter(typeof(CASTFunctionDeclarator)).head
        // Function State 
        val model = scc.createState => [ root |
            root.label = declarator.children.head.toString
            root.id = root.label
            root.declarations += returnDeclaration
            val mainRegion = scc.createControlflowRegion => [
                    id = "_main"
                    label = id
                    root.regions += it
                ]
               
            if (declarator.children.head.toString == "main") {
                
                root.initial = true
    
                
                
            
            }
        ]

        // parameters
        funcGlobalState = model

        // createDeclaration
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTParameterDeclaration@46333ade
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@4d5de8d3
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@50609c53
        // n        
        declarator.children.filter(typeof(CASTParameterDeclaration)).forEach [ parameter |
            val iName = parameter.children.filter(typeof(CASTDeclarator)).head.children.head.toString
            val intParamater = kex.createDeclaration => [
                type = parseCDTType(parameter.children.filter(typeof(CASTSimpleDeclSpecifier)).head.type)
                input = true
                model.declarations += it

            ]
            kex.createValuedObject => [
                name = iName
                intParamater.valuedObjects += it
                VOSet += it
            ]
        ]

        val compound = function.children.filter(typeof(CASTCompoundStatement)).head
        if (compound != null) {
            compound.transformCompound(null, model)
        }

        model
    }

    def State transformCompound(CASTCompoundStatement cs, State state, State parentState) {
        var State newState
        if (state == null) {
            // initial state of a function
            newState = scc.createState => [ s |
                s.id = "_S" + trC + "_initFuncState"
                s.label = s.id
                s.initial = true

                parentState.regions.filter(typeof(ControlflowRegion)).head.states += s
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
        }
        if (statement instanceof CASTReturnStatement) {
            actualState = statement.transformReturn(actualState)
        }
        if (statement instanceof CASTExpressionStatement) {
            actualState = statement.transformExpression(actualState)
        }
        if (statement instanceof CASTForStatement) {
            actualState = statement.transformFor(actualState)
        }
        if (statement instanceof CASTWhileStatement) {
            actualState = statement.transformWhile(actualState)
        }
        if (statement instanceof CASTDoStatement) {
            actualState = statement.transformDoWhile(actualState)
        }
        if (statement instanceof CASTSwitchStatement) {
            actualState = statement.transformSwitch(actualState)
        }
        if (statement instanceof CASTBinaryExpression) {
            actualState = statement.createDataflow(actualState)
        }
        if (statement instanceof CASTDeclarationStatement) {
            // parentState.regions.filter(typeof(ControlflowRegion)).head.states += actualState
            actualState = statement.castDeclaration(actualState)
        }

        actualState
    }


    // TODO Bei case ohne break soll beim "durchfallen" nicht nochmal die condition der anderen cases überprüft werden
    def State transformSwitch(CASTSwitchStatement statement, State state) {
        val f = statement

        val connectorState = scc.createState => [ s |
            s.id = trC.toString
            s.label = s.id
            s.setTypeConnector
//            s.regions += scc.createControlflowRegion => [
//                id = s.id + "_r"
//                label = ""
//            ]
            state.parentRegion.states += s
        ]
        connectorStates.add(connectorState)
        val switchVar = statement.children.filter(typeof(CASTIdExpression)).head.syntax.toString
        var lastState = state;
        var breakState = state;
        var Expression kExp = null;
        var parent = state;
        var Boolean defaultExpression = false;
        var Boolean casebefore = false;
        var Boolean noBreakBefore = false;
        
        
        
        for (caseExpression : f.children.filter(typeof(CASTCompoundStatement)).head.children.filter(
            typeof(IASTStatement))) {

            if (caseExpression instanceof CASTCaseStatement) {
                // caseExpression.transformStatement(state)
                if (!casebefore) { //Break
                    kExp = (switchVar + " == " + caseExpression.children.filter(typeof(IASTExpression)).head.toString).
                        createTextExpression
                    if (lastState != parent && !parent.final) {  // ??? Passiert nie ???
                        val backConnector = scc.createTransition => [
                            targetState = connectorState
                            immediate = true
                        ]
                        parent.outgoingTransitions += backConnector
                    }
                    parent = lastState
                    casebefore = true;
                
                } else { //no break
                    kExp = (switchVar + " == " + caseExpression.children.filter(typeof(IASTExpression)).head.toString).
                        createTextExpression
                    if (lastState != parent && !parent.final) {
//                        val notBreakState = scc.createState => [ s |
//                            s.id = trC.toString + "_noBreak"
//                            s.label = createLabel(statement) + "_noBreak"
//                            
//                            state.parentRegion.states += s 
//                        ]
//                        
//                        
//                        val backConnector = scc.createTransition => [
//                            targetState = notBreakState
//                            immediate = false
//                        ]
//                         val connector = scc.createTransition => [
//                            targetState = notBreakState
//                            immediate = false
//                        ]
//                        lastState.outgoingTransitions+=connector
//                        parent.outgoingTransitions += backConnector
                    
                    breakState = parent
                    noBreakBefore = true
//                    parent = notBreakState
                    casebefore=true;
                    
                    }
                }
            } else if (caseExpression instanceof CASTBreakStatement) {
                casebefore=false;
                
                //parent=lastState
            } else if (caseExpression instanceof CASTDefaultStatement) {
                if (parent != lastState && !parent.final) {
                    val backConnector = scc.createTransition => [
                        targetState = connectorState
                        immediate = true
                    ]
                    parent.outgoingTransitions += backConnector
                }
                parent = lastState;
                defaultExpression = true;

            } else {
                // hier kommt man auch rein, wenn statement ein SwitchStatement ist.
                // parent wird hier auf einen neuen state gesetzt
                parent = caseExpression.transformStatement(parent);
                println("PARENT: " +  parent)
                if (!defaultExpression) {
                    lastState.outgoingTransitions.last.trigger = kExp
                }
                
                // Das hier funktioniert glaube ich. Das Problem ist noch, dass dieser Teil hier erst dran kommt,
                // nachdem der case 3 schon gezeichnet wurde. Dieser wird halt mit falschen Transitionen gezeichnet.
                if (noBreakBefore) {
                    val noBreakTrans = scc.createTransition => [
                        immediate = true
                    ]
                    breakState.outgoingTransitions += noBreakTrans
                    parent.incomingTransitions += noBreakTrans
                    noBreakBefore = false
                    parent = state
                }

                // lastTransition.targetState=trueState
                
            }

        // caseExpression.children.filter(typeof(IASTStatement)).head.transformStatement(state)


        }  // ENDE DER FOR-SCHLEIFE
        
               
        // hier wird der letzte state des switch-case Graphen mit dem connectorState verbunden, falls dieser
        // nicht final ist.
        if (!parent.final) {
            var backConnector = scc.createTransition => [
                targetState = connectorState
                immediate = true
            ]
            parent.outgoingTransitions += backConnector
        }

        // Falls kein default-case im switch vorhanden ist, wird diese Transition genommen.
        // defaultExpression = true heißt, dass es einen default-case gibt.
        if (!defaultExpression) {
            var backConnector = scc.createTransition => [
                targetState = connectorState
                immediate = true
            ]
            state.outgoingTransitions += backConnector
        }

        connectorState
    }

    def State transformWhile(CASTWhileStatement statement, State state) {
        val f = statement

        // condition
        val exp = f.condition

        val kExp = exp.createKExpression

        // while loop state
        val whileState = scc.createState => [ s |
            s.id = trC + "_while"
            s.label = "while"
            state.parentRegion.states += s
        ]
        
        // region of whileState. It contains all states of while loop                 
        val whileStateRegion = scc.createControlflowRegion => [ region |
                region.id = whileState.id + "_region"
                region.label = ""
                whileState.regions += region
        ]


        val condState = scc.createState => [ s |
            s.id = trC.toString + "_cond"
            s.label = createLabel(statement) + "cond"
            s.initial = true
            // s.setTypeConnector
//            s.regions += scc.createControlflowRegion => [
//                id = s.id + "_r"
//                label = ""
//            ]
            whileStateRegion.states += s
        ]
        
        
        
        // Connects while loop to the parent
        val whileConnector = scc.createTransition => [
            targetState = whileState
            
            // Falls es geschachtelte Kontrollstrukturen sind, ohne dass nach dem cond State eine weitere Zeile kommt,
            // fixt dies den Bug, dass die Condition der oberen for-Schleife richtig dargestellt wird.
            if(state.id.contains("_cond")) {
                
                 val condStatement = statement.parent.parent
                    // TODO NOCH IRGENDWIE VERBESSERN
                    if (condStatement instanceof CASTForStatement) {
                        val condCondition = (condStatement as CASTForStatement).conditionExpression
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                        annotations.add(createStringAnnotation("notImmediate",""))
                        immediate = true
                    } 
                    else if (condStatement instanceof CASTIfStatement) {
                        val condCondition = (condStatement as CASTIfStatement).conditionExpression
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                        annotations.add(createStringAnnotation("notImmediate",""))
                        immediate = true
                    } 
                    else if (condStatement instanceof CASTWhileStatement) {
                        val condCondition = (condStatement as CASTWhileStatement).condition
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                        annotations.add(createStringAnnotation("notImmediate",""))
                        immediate = true
                    } 
                    
            } else if(state.hasInnerStatesOrControlflowRegions) {
                type = TransitionType::TERMINATION
            } else {
                immediate = true
            }
            state.outgoingTransitions += it
        ]

        // TODO ConnectorState entfernen
//        val trueState = scc.createState => [ s |
//            s.id = trC + "T"
//            s.label = "T"
//            s.setTypeConnector
//            whileStateRegion.states += s
//        ]
//        
//        // Transition is taken when while condition is met
//        val trueTrans = scc.createTransition => [
//            targetState = trueState
//            immediate = false
//            condState.outgoingTransitions += it
//            trigger = kExp
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

        //condState
        
        whileState

    }
    
    
    def State transformDoWhile(CASTDoStatement statement, State state) {
        val f = statement

        // condition
        val exp = f.condition

        val kExp = exp.createKExpression

        // do-while loop state
        val doWhileState = scc.createState => [ s |
            s.id = trC + "_doWhile"
            s.label = "doWhile"
            state.parentRegion.states += s
        ]
        
        // region of do-whileState. It contains all states of do-while loop                 
        val doWhileStateRegion = scc.createControlflowRegion => [ region |
                region.id = doWhileState.id + "_region"
                region.label = "" 
                doWhileState.regions += region
        ]

        // Inital state of do-while loop
        val doState = scc.createState => [ s |
            s.id = trC.toString + "_do"
            s.label = "do"
            s.initial = true
            // s.setTypeConnector
//            s.regions += scc.createControlflowRegion => [
//                id = s.id + "_r"
//                label = ""
//            ]
            doWhileStateRegion.states += s
        ]
        

        // TODO ConnectorState entfernen
//        val trueState = scc.createState => [ s |
//            s.id = trC + "T"
//            s.label = "T"
//            s.setTypeConnector
//            whileStateRegion.states += s
//        ]
//        
//        // Transition is taken when while condition is met
//        val trueTrans = scc.createTransition => [
//            targetState = trueState
//            immediate = false
//            condState.outgoingTransitions += it
//            trigger = kExp
//        ]
        

        // continue to transform body of do-while loop
        val body = f.body as CASTCompoundStatement
        val bodyState = body.transformCompound(doState, doState)


        val condState = scc.createState => [ s |
            s.id = trC.toString + "_cond"
            s.label = createLabel(statement) + "cond"
            // s.setTypeConnector
//            s.regions += scc.createControlflowRegion => [
//                id = s.id + "_r"
//                label = ""
//            ]
            doWhileStateRegion.states += s
        ]
        
        // Connect body to condState to check condition after body
        val condTrans = scc.createTransition => [
            targetState = condState
            // Falls es geschachtelte Kontrollstrukturen sind, ohne dass nach dem cond State eine weitere Zeile kommt,
            // fixt dies den Bug, dass die Condition der oberen for-Schleife richtig dargestellt wird.
            if(state.id.contains("_cond")) {
                
                 val condStatement = statement.parent.parent
                 // TODO Hier muss noch überprüft werden, of hier CASTWhileStatement oder CASTDoStatement hin kommt.
                    if (condStatement instanceof CASTWhileStatement) {
                        val condCondition = (condStatement as CASTWhileStatement).condition
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                        immediate = true
                        annotations.add(createStringAnnotation("notImmediate",""))
                    }
            } else if (bodyState.hasInnerStatesOrControlflowRegions) {
                type = TransitionType::TERMINATION
            } else {
                immediate = true
            }
           
            bodyState.outgoingTransitions += it
        ]
        
        // Connects do-while loop to the parent
        val doWhileConnector = scc.createTransition => [
            targetState = doWhileState
            if(state.id.contains("_cond")) {
                trigger = kExp
                immediate = true
                annotations.add(createStringAnnotation("notImmediate",""))
            } else if(state.hasInnerStatesOrControlflowRegions) {
                type = TransitionType::TERMINATION
            } else {
                immediate = true
            }
            state.outgoingTransitions += it
        ]



        // transition returns to condition-check
        val backTransition = scc.createTransition => [
            targetState = doState
            immediate = true
            annotations.add(createStringAnnotation("notImmediate",""))
            trigger = kExp
            condState.outgoingTransitions += it
        ]

        // final state of loop. It is reached when loop condition is not met anymore
        val falseState = scc.createState => [s |
            s.id = trC + "_end"
            s.label = "End"
            s.final = true
            doWhileStateRegion.states += s
        ]
        
        // transition to falseState
        val falseTrans = scc.createTransition => [
            targetState = falseState
            immediate = true
            annotations.add(createStringAnnotation("notImmediate",""))
            condState.outgoingTransitions += it
        ]

        //condState
        
        doWhileState

    }
    

    def State castDeclaration(CASTDeclarationStatement statement, State parent) {

        // TODO verschachtelte Binary Expressions (a+2+3) => ((a+2)+3)
            
        val simpleDeclaration = statement.children.filter(typeof(CASTSimpleDeclaration)).head
        val declarator = simpleDeclaration.children.filter(typeof(CASTDeclarator)).head
        if (declarator != null) {

            val iName = declarator.children.head.toString
            val intParamater = kex.createDeclaration => [
                type = parseCDTType(simpleDeclaration.children.filter(typeof(CASTSimpleDeclSpecifier)).head.type)
                input = false
                //funcGlobalState.declarations += it
                
                // If the declaration is the initializer of a for statement, it needs to be added to the forState
                if (parent.id.contains("_for")) {
                    parent.declarations += it
                } else {
                    // Füge die Variablendeklaration dem State eine Hierarchieebene drüber hinzu (z.B. int i)
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
//                val initVarState = scc.createState => [ s |
//                    s.id = parent.id + "T"
//                    s.label = createLabel(statement)
//
//                    parent.parentRegion.states += s
//                ]
//                val trans = scc.createTransition => [
//                    targetState = initVarState
//                    immediate = true
//                    parent.outgoingTransitions += it
//
//                ]


                // Initialisierung, die eine Abhängigkeit zu einer anderen Variablen hat, soll nicht als entry action eingeführt werden
                if (initializer.children.head instanceof IASTExpression) {
                    var exp = (initializer.children.head as IASTExpression)
                    
                   
                    val a = initializer.children.head
                    val b = a.children.toList
                    
                    if (a instanceof CASTIdExpression) {
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
                                parent.outgoingTransitions += it
                            ]
                            var entryAction = initVarState.createEntryAction
                            entryAction.createAssignment(value, exp.createKExpression)
                            return initVarState 
                            
                       }
                        
                    } else if (a instanceof CASTBinaryExpression) {
                        // Falls die Variablenzuweisung abhängig von einer anderen Variable ist...
                        if (b.filter(typeof(CASTSimpleDeclSpecifier)) != []) {
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
                                parent.outgoingTransitions += it
                            ]
                            var entryAction = initVarState.createEntryAction
                            entryAction.createAssignment(value, exp.createKExpression)
                            return initVarState 
                            
                            }
                        }
                    }
                    
           // DAS HIER, WAS BEREITS AUSKOMMENTIERT IST, IST GLAUBE ICH UNNÖTIG BIS ...
                    
//                    // Check if initialization can be a entryAction or needs to be a separat state
//                    if (parent.parent.id.contains("_while") || parent.parent.id.contains("_for") || parent.parent.id.contains("_doWhile")) {
//                        // Separate state
//                        val initVarState = scc.createState => [ s |
//                            s.id = parent.id + "T"
//                            s.label = createLabel(statement)
//        
//                            parent.parentRegion.states += s
//                        ]
//                        val trans = scc.createTransition => [
//                            targetState = initVarState
//                            immediate = true
//                            parent.outgoingTransitions += it
//                        ]
//                        var entryAction = initVarState.createEntryAction
//                        entryAction.createAssignment(value, exp.createKExpression)
//                        return initVarState
//                    } else {
                        
                    
                //  var entryAction = initVarState.createEntryAction
                    var EntryAction entryAction = null
                    // If the declaration is the initializer of a for statement, create entryAction for forState
                    if (parent.id.contains("_for")) {
                        entryAction = parent.createEntryAction
                    } else {
                        // For declaration, create entryAction for parentState (der in der Hierarchie eins oben drüber)
                        entryAction = parent.parentRegion.parentState.createEntryAction
                    }
                    
                    //var entryAction = parent.createEntryAction
                    
                    
//                    var textExpression=kex.createTextExpression
//                    textExpression.text = exp
                    entryAction.createAssignment(value, exp.createKExpression)
//                    }

           // ... BIS HIER HIN

                // return initVarState

                // if (initializer.children.head instanceof CASTBinaryExpression){
                // System.out.println("text")
                // return (initializer.children.head as IASTStatement).transformStatement(parent)
                // }
                }
            } else {
                return parent
            }

        // Neuer State wenn nicht Null sonst den alten zurück geben. 
//            value.initialValue = initializer.casteEqualsInitializer(
//                parseCDTType(simpleDecl.children.filter(typeof(CASTSimpleDeclSpecifier)).head.type))
        }
        parent
    }

    def Expression casteEqualsInitializer(CASTEqualsInitializer initializer, ValueType type) {
        if (initializer != null) {
//            if (type == ValueType::INT) {
//                val intval = kex.createIntValue
//                intval.value = Integer.parseInt(initializer.children.head.toString)
//                intval
//            } else {
//                System.out.println("test")
//                val intval = null
//                intval
//            }
            return (initializer.children.head as IASTExpression).createKExpression
        } else {
            null
        }

    }


    // TODO    BUG                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Wenn im if oder im else ein return steht, muss man aus dem ifState raus und dann den returnState machen.
    // Immoment wird der returnState noch im ifState gemacht, womit nur der ifState beendet und nicht der Funktionsaufruf
    // BEI ALLEN ANDEREN KONTROLLSTRUKTUREN DAS GLEICHE PROBLEM
    def State transformIf(CASTIfStatement ifStatement, State state) {
        
        var needExtraEndState = false
        val ifs = ifStatement
        val exp = ifs.children.filter(typeof(CASTBinaryExpression)).head
        val kExp = exp.createKExpression

        
        // if construct state
        val ifState = scc.createState => [ s |
            s.id = trC + "_if"
            s.label = "if"
            state.parentRegion.states += s
        ]
        
        // region of ifState. It contains all states of the if statement
        val ifStateRegion = scc.createControlflowRegion => [ region |
                region.id = ifState.id + "_region"
                region.label = ""
                ifState.regions += region
        ]

        // Connects if construct to the parent
        val ifConnector = scc.createTransition => [
            targetState = ifState
            // Falls es geschachtelte Kontrollstrukturen sind, ohne dass nach dem cond State eine weitere Zeile kommt,
            // fixt dies den Bug, dass die Condition des oberen for-Schleife richtig dargestellt wird.
            if (state.id.contains("_cond")) {
                
                val condStatement = ifStatement.parent.parent
                    if (condStatement instanceof CASTForStatement) {
                        val condCondition = (condStatement as CASTForStatement).conditionExpression
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                        immediate = true
                        annotations.add(createStringAnnotation("notImmediate",""))
                    } 
                    else if (condStatement instanceof CASTIfStatement) {
                        val condCondition = (condStatement as CASTIfStatement).conditionExpression
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                        annotations.add(createStringAnnotation("notImmediate",""))
                        immediate = true
                    } 
                    else if (condStatement instanceof CASTWhileStatement) {
                        val condCondition = (condStatement as CASTWhileStatement).condition
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                        annotations.add(createStringAnnotation("notImmediate",""))
                        immediate = true
                    } 
            // If multiple if statements follow one after an other, wait for the previous to finish
            } else if (state.hasInnerStatesOrControlflowRegions) {
                type = TransitionType::TERMINATION
            } else {
                immediate = true
            }
            state.outgoingTransitions += it
        ]
        
        // The outgoing transitions of the condState check the condition of the if statement
        val condState = scc.createState => [ s |
            s.id = trC.toString + "_cond"
            s.label = createLabel(ifs) + "cond"
            s.initial = true
            ifStateRegion.states += s
        ]

        // Connects states to the final End state of the if statement, if necessary
        val connectorState = scc.createState => [ s |
            s.id = trC.toString
            s.label = s.id
            s.setTypeConnector

            ifStateRegion.states += s
        ]
        connectorStates += connectorState

        
        // Body of statements if condition is met
        val trueBody = (ifs.thenClause as CASTCompoundStatement).transformCompound(condState, condState)
        
        
        // If argument is set to true, then we only want an extra endState if necessary
        if (ifTransformationOption) {
            
           // A final state cannot have inner behavior for Core SCCharts, so we need an extra final state
            if (trueBody.hasInnerStatesOrControlflowRegions) {
                val trueConnector = scc.createTransition => [
                    targetState = connectorState
                    immediate = true
                    type = TransitionType::TERMINATION
                    trueBody.outgoingTransitions += it
                ]
                needExtraEndState = true
            } else {
                // If no inner behavior, there is no need for an extra final state
                trueBody.final = true
            }
        
        } else {
            // Argument is set to false, so we want a extra endState for every if statement
            if (!trueBody.final) {
                val trueConnector = scc.createTransition => [
                    targetState = connectorState
                    immediate = true
                    trueBody.outgoingTransitions += it
                    type == TransitionType::TERMINATION
                ]
            }
        }
        
        // Check whether a else clause exists
        if (ifs.elseClause != null) {
            // Body of statements if condition is not met
            var State falseBody = null;
            
            if (ifs.elseClause instanceof CASTCompoundStatement) {

//                // TODO Der hier muss weg
//                val elseBody = scc.createState => [s |
//                    s.id = trC + "_else"
//                    s.label = ""
//                    s.setTypeConnector
//                    ifStateRegion.states += s
//                ]
//                
//                val conn = scc.createTransition => [
//                    targetState = elseBody
//                    immediate = true
//                    annotations.add(createStringAnnotation("notImmediate",""))
//                    condState.outgoingTransitions += it
//                ]
                
                falseBody = (ifs.elseClause as CASTCompoundStatement).transformCompound(condState, condState)
                
//                falseBody.incomingTransitions.head.trigger = null
//                falseBody.incomingTransitions.head.annotations.add(createStringAnnotation("notImmediate",""))
                
            // Check for else if statement
            } else if (ifs.elseClause instanceof CASTIfStatement) {
                falseBody = (ifs.elseClause as CASTIfStatement).transformIf(condState)
            }
            
            // Here we check whether there needs to be an extra endState due to the content of falseBody
            if (ifTransformationOption) {
                // Final state cannot have inner behavior for Core SCCharts, so we need an extra final state
                if (falseBody.hasInnerStatesOrControlflowRegions) {
                    val falseConnector = scc.createTransition => [
                        targetState = connectorState
                        immediate = true
                        type = TransitionType::TERMINATION
                    ]
                    // Therefore, we need an extra endState
                    needExtraEndState = true
                    falseBody.outgoingTransitions += falseConnector
                } else {
                    // As falseBody has no inner behavior, it can be final
                    falseBody.final = true 
                }
            } else {
                // We want an extra endState regardless of the content of falseBody
                if (!falseBody.final) {
                    val falseConnector = scc.createTransition => [
                        targetState = connectorState
                        immediate = true
    
                        type == TransitionType::TERMINATION
                    ]
                    falseBody.outgoingTransitions += falseConnector
                }
            }

            // TODO dies vll noch verbessern
            // Here we ensure that the else condition transition has no trigger and is immediate
            val elseTransition = condState.outgoingTransitions.last // condState's last transition in list is always the else transition
            elseTransition.trigger = null
            elseTransition.immediate = true
            elseTransition.annotations.add(createStringAnnotation("notImmediate",""))

        }
        
        if ((ifs.elseClause == null || needExtraEndState) && ifTransformationOption) {
            
            // Final state of statement. It is reached when condition is not met anymore
            val endState = scc.createState => [s |
                s.id = trC + "_end"
                s.label = "End"
                s.final = true
                ifStateRegion.states += s
            ]
            
            // This default transition from condState to endState is only needed if there is no else clause
            if (ifs.elseClause == null) {
                // transition to endState
                val defaultTrans = scc.createTransition => [
                targetState = endState
                immediate = true
                annotations.add(createStringAnnotation("notImmediate",""))
                condState.outgoingTransitions += it
                ]
            }
    
            // Transition to falseState
            val falseTrans = scc.createTransition => [
                targetState = endState
                immediate = true
                annotations.add(createStringAnnotation("notImmediate",""))
                connectorState.outgoingTransitions += it
            ]
                
        } else if (!ifTransformationOption) {
            // Final state of loop. It is reached when loop condition is not met anymore
            val endState = scc.createState => [s |
                s.id = trC + "_end"
                s.label = "End"
                s.final = true
                ifStateRegion.states += s
            ]
            if (ifs.elseClause == null) {
                
                val defaultTrans = scc.createTransition => [
                    targetState = endState
                    immediate = true
                    annotations.add(createStringAnnotation("notImmediate",""))
                    condState.outgoingTransitions += it
                ]
            
            }
            
            // Transition to falseState
            val falseTrans = scc.createTransition => [
                targetState = endState
                immediate = true
                annotations.add(createStringAnnotation("notImmediate",""))
                connectorState.outgoingTransitions += it
            ]
        }
        
        ifState
    }
    
    
    

    def State transformFor(CASTForStatement forStatement, State state) {
        val f = forStatement
        
        // For loop state
        val forState = scc.createState => [ s |
            s.id = trC + "_for"
            s.label = "for"
            state.parentRegion.states += s
        ]
        
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
            (f.initializerStatement as CASTExpressionStatement).transformExpression(forState)
        }

        // Condition
        val exp = f.conditionExpression

        val kExp = exp.createKExpression

        val condState = scc.createState => [ s |
            s.id = trC + "_cond"
            s.label = "cond"
            s.initial = true

            forStateRegion.states += s
        ]

        // Connects for loop to the parent
        val forConnector = scc.createTransition => [
            targetState = forState
            // Falls es geschachtelte Kontrollstrukturen sind, ohne dass nach dem cond State eine weitere Zeile kommt,
            // fixt dies den Bug, dass die Condition der oberen for-Schleife richtig dargestellt wird.
            if(state.id.contains("_cond")) {
                
                 val condStatement = forStatement.parent.parent
                    if (condStatement instanceof CASTForStatement) {
                        val condCondition = (condStatement as CASTForStatement).conditionExpression
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                        immediate = true
                        annotations.add(createStringAnnotation("notImmediate",""))
                    }
                    else if (condStatement instanceof CASTIfStatement) {
                        val condCondition = (condStatement as CASTIfStatement).conditionExpression
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                        annotations.add(createStringAnnotation("notImmediate",""))
                        immediate = true
                    } 
                    else if (condStatement instanceof CASTWhileStatement) {
                        val condCondition = (condStatement as CASTWhileStatement).condition
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                        annotations.add(createStringAnnotation("notImmediate",""))
                        immediate = true
                    }
            // Falls davor eine Kontrollstruktur kam, muss man darauf warten, bis diese fertig ist
            } else if(state.hasInnerStatesOrControlflowRegions) {
                type = TransitionType::TERMINATION
                
            } else {
                immediate = true
            }
            state.outgoingTransitions += it
        ]



        val iterateState = scc.createState => [ s |
            s.id = trC + "T"
            s.label = createLabel(forStatement)

            forStateRegion.states += s
        ]

        // Iterate-action
        val body = f.body as CASTCompoundStatement

        val bodyState = body.transformCompound(condState, condState)
        val iterateExp = (f.iterationExpression as CASTBinaryExpression).createDataflow(iterateState)
        val iterateTrans = scc.createTransition => [
            targetState = iterateState
            if (bodyState.hasInnerStatesOrControlflowRegions) {
                type = TransitionType::TERMINATION
            } else {
                immediate = true
            }
            bodyState.outgoingTransitions += it
        ]

        val backTransition = scc.createTransition => [
            targetState = condState
            immediate = true
            iterateExp.outgoingTransitions += it
        ]
        
        // Final state of loop. It is reached when loop condition is not met anymore
        val falseState = scc.createState => [s |
            s.id = trC + "_end"
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

        val returnState = scc.createState => [ s |
            s.id = trC.toString
            s.label = createLabel(returnStatement)
            s.final = true
            state.parentRegion.states += s
        // s.concurrencies += scc.createRegion => [
        // id = s.id + "_r"
        // label = ""
        // ]            
        // s.regions += scc.createDataflowRegion => [
        // id = s.id + "_d"
        // label = ""
        // ]
        ]

        state.outgoingTransitions += scc.createTransition => [
            targetState = returnState
            if(state.hasInnerStatesOrControlflowRegions) {
                type = TransitionType::TERMINATION
            } else {
                immediate = true
            }
        ]

        val entryact = returnState.createEntryAction
        entryact.createAssignment(VOSet.filter[name.equals(RETURNVONAME)].head,
            returnStatement.returnValue.createKExpression)

        returnState
    }
    

    def State transformExpression(CASTExpressionStatement es, State state) {

        // org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@7f6adc09
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement@40941439
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@39bbcb4e
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@58208b7e
        // fh
        // org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@40a62a65
        // n
        
        
        if (es.expression instanceof CASTBinaryExpression) {

            // create binary expression
            val exp = es.expression as CASTBinaryExpression
            // if variable assignment happens right after the initial state of the function -> entry action parent state
            if(state.id.contains("_initFuncState")) {
                val entryact = state.parent.createEntryAction
                entryact.createAssignment((exp.operand1 as CASTIdExpression).createVOReference.valuedObject,
                    exp.operand2.createKExpression)
            }
            // if variable assignments is follows by another variable assignment -> put them into one state
            else if (state.id.contains("_binEx")) {
                val entryact = state.createEntryAction
                entryact.createAssignment((exp.operand1 as CASTIdExpression).createVOReference.valuedObject,
                    exp.operand2.createKExpression)
            }
            // else -> create new state for variable assignment
            else {
            val codeState = scc.createState => [ s |
                s.id = trC + "_binEx"
                s.label = createLabel(es)

                state.parentRegion.states += s
                val entryact = s.createEntryAction
                entryact.createAssignment((exp.operand1 as CASTIdExpression).createVOReference.valuedObject,
                    exp.operand2.createKExpression)
            ]

            val trans = scc.createTransition => [
                targetState = codeState
                if (state.hasInnerStatesOrControlflowRegions) {
                    type = TransitionType::TERMINATION
                } else if (state.id.contains("_cond")) {
                // ensure that all outgoing transitions of a cond-state are non-immediate to prevent instant loops       
                    immediate = true
                    annotations.add(createStringAnnotation("notImmediate",""))
                    // get condition of control structure (for, while, ect) for condition-transition
                    var hlp = es.parent.parent
                    println("ASDA " + hlp)
                    val condStatement = es.parent.parent
                    // one case for each casting (-> optimize)
                    if (condStatement instanceof CASTWhileStatement) {
                        val condCondition = (condStatement as CASTWhileStatement).condition
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                    } else if (condStatement instanceof CASTForStatement) {
                        val condCondition = (condStatement as CASTForStatement).conditionExpression
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                    } else if (condStatement instanceof CASTIfStatement) {
                        val condCondition = (condStatement as CASTIfStatement).conditionExpression
                        val condKExp = condCondition.createKExpression
                        trigger = condKExp
                    
                    }
                    
                } else {
                    immediate = true
                }

            ]
            state.outgoingTransitions += trans

            return codeState
            
            }
            return state
        }

        if (es.expression instanceof CASTFunctionCallExpression) {

            //
            val sa = scc.createState => [ s |
                s.id = trC + "T"
                s.label = createLabel(es)
                state.parentRegion.states += s
            ]

            if (functionStates.get("wasauchimmer") != null) {

                sa.referencedScope = functionStates.get("wasauchimmer")
                val bind = BindingImpl.newInstance

//                bind.actual = funcGlobalState.declarations.head
//                bind.formal = functionStates.get("wasauchimmer").valuedObjects.head
                sa.bindings += bind

                state.parentRegion.states += sa
            } else {
                val cal = (es.expression as CASTFunctionCallExpression).createFunctionCallValuedObject();

                val entryact = sa.createEntryAction
                entryact.createEmission(cal)

            }

            val trans = scc.createTransition => [
                targetState = sa
                immediate = true
            // codeState.outgoingTransitions += it
            ]
            state.outgoingTransitions += trans

            return sa

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

            val eq = scc.createEquation
            eq.valuedObject = lVar
            eq.expression = kExp

            df.equations += eq
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

    private def int getMultiEntryOption() {
        return 0;
    // return 1;
    }
    
    /* Toggle the transformation option for if control structures
     * return false = create a separate endState for each if construct
     * return true = create only a separate endState for each if construct if necessary
     */
    private def boolean getIfTransformationOption() {
//        return false;
        return true;
    }

    private def void removeConnectorStates() {
        for (var int i = 0; i < connectorStates.length(); i++) {

            if (connectorStates.get(i).outgoingTransitions.empty) {
                connectorStates.get(i).parentRegion.states.remove(connectorStates.get(i))
            // connectorStates.remove(i);
            }else if (connectorStates.get(i).incomingTransitions.empty){
                connectorStates.get(i).parentRegion.states.remove(connectorStates.get(i))
            }
        // state.outgoingTransitions.head.targetState=state
        // state.incomingTransitions+=state.outgoingTransitions.head
        // state.parentRegion.states.remove(state);
//            for(var int i=0; i<state.incomingTransitions.length(); i++) {
//                
//                state.incomingTransitions.get(i).targetState = targetstate
//                
//            }
//            for (transi:state.incomingTransitions){
//                transi.targetState = targetstate
//                //System.out.println(transi);
//            }
        //
        }
    }
//    private createExpression    
}
