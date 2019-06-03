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
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorExpression
//import de.cau.cs.kieler.kexpressions.OperatorType
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
import org.eclipse.cdt.internal.core.dom.parser.ASTNode
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.sccharts.Transition
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDoStatement
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.cdt.internal.core.dom.parser.ASTAttributeOwner
import de.cau.cs.kieler.c.sccharts.processors.CbasedSCChartFeature
import org.eclipse.cdt.core.dom.ast.IASTExpressionList
import java.util.Set
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.ui.view.EditPartSystemManager
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.internal.core.dom.parser.c.CASTLiteralExpression
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions

/**
 * @author lan
 * 
 */

@SuppressWarnings("all","unchecked")
class DataflowExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions
    
    
    
    override getId() {
        "de.cau.cs.kieler.c.sccharts.dataflowExtractor"
    }
    
    override getName() {
        "Dataflow Extractor"
    }
    
    override process() {
//        val tUnit = translationUnitFromEditor(EditPartSystemManager.getInputEditor(compilationContext))
        val tUnit = getModel
        setModel(tUnit.transform as SCCharts)
    }    

    def EObject transform(IASTTranslationUnit translationUnit) {
        
        if(translationUnit === null) {
            return null
        }
        val ast = translationUnit
        if(ast.children !== null) {
            //ast.children.printASTNodes("")
        } else {
            return null
        }
        
        val SCChart = scc.createSCCharts
        
        val rootState = createState("root")
        SCChart.rootStates += rootState
        val rootRegion = rootState.createControlflowRegion("0")
        
        //AST as SCChart
        val astState = rootRegion.createState("AST")
        
        val region = astState.createControlflowRegion("0")
        
        for (child : ast.children) {
            val state = createASTNodeState(child, region)
            region.states += state
            
        }      
        
        //DataFlow Test
        
        val dataflowState = scc.createState
        dataflowState.label = "main"
        rootRegion.states += dataflowState
        val topRegion = dataflowState.createControlflowRegion("0")
        //dataflowState.regions += topRegion
        
        val intDecl = createIntDeclaration()
        intDecl.output = true
        dataflowState.declarations += intDecl
        var a = intDecl.createValuedObject("a")
        var i = intDecl.createValuedObject("i")
        var x = intDecl.createValuedObject("x")
        
        val initState = scc.createState
        initState.label = "Init"
        initState.initial = true
        topRegion.states += initState
        
        val dRegion = initState.createDataflowRegion("0")
        //initState.regions += dRegion
        
        dRegion.equations += createAssignment(x, createIntValue(0))
        dRegion.equations += createAssignment(i, createIntValue(0))
        dRegion.equations += createAssignment(a, createIntValue(15))
        
        val forState = scc.createState
        forState.label = "for i < a"
        topRegion.states += forState
        initState.createTransitionTo(forState)
        
        val dForRegion = forState.createDataflowRegion("0")
        
        dForRegion.equations += createAssignment(x, mult(x.reference, createIntValue(2)))
        dForRegion.equations += createAssignment(i, add(i.reference, createIntValue(1)))
        
        val returnState = topRegion.createState("return")
        returnState.final = true
        forState.createTransitionTo(returnState)
        
        val dReturnRegion = returnState.createDataflowRegion("0")
        
        dReturnRegion.equations += createAssignment(x, x.reference)
        
        val times_2 = createState("times_2")
        rootRegion.states += times_2
        
        val parameter = createIntDeclaration()
        var xIn = parameter.createValuedObject("x")
        parameter.input = true
        times_2.declarations += parameter
        
        val topRegion2 = times_2.createControlflowRegion("0")
        
        val returnState2 = topRegion2.createState("return")
        returnState2.initial = true
        returnState2.final = true
        val dReturnRegion2 = returnState2.createDataflowRegion("0")
        dReturnRegion2.equations += createAssignment(xIn, mult(xIn.reference, createIntValue(2)))
        
        
        SCChart
        
    }
    
    def State createASTNodeState(IASTNode parentNode, ControlflowRegion region) {
        val returnState = scc.createState
        returnState.label = cutCASTLabel(parentNode.toString)
        if(parentNode.children !== null) {
            for(child : parentNode.children) {
                val childState = createASTNodeState(child, region)
                region.states += childState
                
                if(child instanceof CASTBinaryExpression) {
                    val bExp = child as CASTBinaryExpression
                    var operator = ""
                    switch(child.getOperator) {
                        case 1: operator = "*"
                        case 2: operator = "/"
                        case 3: operator = "%"
                        case 4: operator = "+"
                        case 5: operator = "-"
                        case 6: operator = "<<"
                        case 7: operator = ">>"
                        case 8: operator = "<"
                        case 9: operator = ">"
                        case 10: operator = "<="
                        case 11: operator = ">="
                        case 12: operator = "&"
                        case 13: operator = "^"
                        case 14: operator = "|"
                        case 15: operator = "&&"
                        case 16: operator = ">>"
                        case 17: operator = "="
                        case 18: operator = "*="
                        case 19: operator = "/="
                        case 20: operator = "%="
                        case 21: operator = "+="
                        case 23: operator = "-="
                        case 24: operator = "<<="
                        case 25: operator = ">>="
                        case 26: operator = "&="
                        case 27: operator = "^="
                        case 28: operator = "|="
                        case 29: operator = "=="
                        case 30: operator = "!="
                        case 31: operator = "pointer to member field dereference"
                        case 32: operator = "pointer to member pointer dereference"
                        case 33: operator = "op_max >?"
                        case 34: operator = "op_min <?"
                        case 35: operator = "op_ellipses ..."
                        default: operator = "op not found"
                        
                    }   
                    childState.label = "Binary Expression: " + operator
                } else {
                    childState.label = cutCASTLabel(child.toString)    
                }               
                
                returnState.createTransitionTo(childState)
            }
        
        }
        
        return returnState
    }
    
    def String cutCASTLabel(String CASTLabel) {
        val CASTIdx = CASTLabel.indexOf("CAST")
        var res = CASTLabel
        if(CASTIdx >= 0) {
            res = res.substring(CASTIdx + 4)
            val AtIdx = res.indexOf("@")
            res = res.substring(0, AtIdx)    
        }     
        
        return res
    }
    
    private def scc() {
        SCChartsFactory::eINSTANCE
    }

    
}
