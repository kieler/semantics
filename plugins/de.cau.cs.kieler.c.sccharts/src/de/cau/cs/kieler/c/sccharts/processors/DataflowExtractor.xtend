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
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions

/**
 * @author lan
 * 
 */

@SuppressWarnings("all","unchecked")
class DataflowExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {

    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension IllustratorExtensions
    
    var functions = new ArrayList<Pair<String, State>>
    
    override getId() {
        "de.cau.cs.kieler.c.sccharts.dataflowExtractor"
    }
    
    override getName() {
        "Dataflow Extractor"
    }
    
    override process() {
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
        val rootState = createState("")
        SCChart.rootStates += rootState
        val rootRegion = createControlflowRegion("")
        rootState.regions += rootRegion
        /*
        //auto created dataflow graph
        for (child : ast.children) {
            if (child instanceof CASTFunctionDefinition) {
                val funcDef = child as CASTFunctionDefinition
                val funcState = funcDef.illustrate
                SCChart.rootStates += funcState
                functions.add(new Pair(funcState.label, funcState))
            }    
        }
        */
        
        //Wie der euclyd aussehen sollte
        val euclydState = createState("euclyd")
        rootRegion.states += euclydState
        val euclydDRegion = createDataflowRegion("")
        euclydState.regions += euclydDRegion
        
        val inputDecl1 = createVariableDeclaration
        inputDecl1.type = ValueType.INT
        inputDecl1.input = true
        euclydState.declarations += inputDecl1
        val VOInput1 = inputDecl1.createValuedObject("x")
        
        val inputDecl2 = createVariableDeclaration
        inputDecl2.type = ValueType.INT
        inputDecl2.input = true
        euclydState.declarations += inputDecl2
        val VOInput2 = inputDecl2.createValuedObject("y")
        
        val outputDecl = createVariableDeclaration
        outputDecl.type = ValueType.INT
        outputDecl.output = true
        euclydState.declarations += outputDecl
        val VOOutput = outputDecl.createValuedObject("res")
        
        val innerIntDecl = createVariableDeclaration
        innerIntDecl.type = ValueType.INT
        euclydDRegion.declarations += innerIntDecl
        val innerA = innerIntDecl.createValuedObject("a0")
        val innerB = innerIntDecl.createValuedObject("b0")
        val innerRest = innerIntDecl.createValuedObject("rest0")
        
        val modExpr = createOperatorExpression(OperatorType::MOD)
        modExpr.subExpressions += innerA.reference
        modExpr.subExpressions += innerB.reference
        
        euclydDRegion.equations += createAssignment(innerA, VOInput1.reference)
        euclydDRegion.equations += createAssignment(innerB, VOInput2.reference)
        euclydDRegion.equations += createAssignment(innerRest, modExpr)
        
        val whileState = createState("while_0")
        val refDecl = createReferenceDeclaration
        refDecl.setReference(whileState)
        euclydState.declarations += refDecl
        val refVO = refDecl.createValuedObject("while_0")
        
        val whileInputDecl = createVariableDeclaration
        whileState.declarations += whileInputDecl
        whileInputDecl.type = ValueType.INT
        whileInputDecl.input = true
        
        val whileInputA = whileInputDecl.createValuedObject("a_in")
        val whileInputB = whileInputDecl.createValuedObject("b_in")
        val whileInputRest = whileInputDecl.createValuedObject("rest_in")
        
        val whileOutputDecl = createVariableDeclaration
        whileState.declarations += whileOutputDecl
        whileOutputDecl.type = ValueType.INT
        whileOutputDecl.output = true
        
        val whileOutputA = whileOutputDecl.createValuedObject("a_out")
        val whileOutputB = whileOutputDecl.createValuedObject("b_out")
        val whileOutputRest = whileOutputDecl.createValuedObject("rest_out")
        
        euclydDRegion.equations += createAssignment(refVO, whileInputA, innerA.reference)
        euclydDRegion.equations += createAssignment(refVO, whileInputB, innerB.reference)
        euclydDRegion.equations += createAssignment(refVO, whileInputRest, innerRest.reference)
        
        val innerB2 = innerIntDecl.createValuedObject("b1")
        
        var source = refVO.reference => [
            subReference = whileOutputB.reference
        ]
        
        euclydDRegion.equations += createAssignment(innerB2, source)
        
        val whileDRegion = createDataflowRegion("while (rest != 0)")
        whileDRegion.label = "while (rest != 0)"
        whileState.regions += whileDRegion
        
        whileDRegion.equations += createAssignment(whileOutputA, whileInputB.reference)
        whileDRegion.equations += createAssignment(whileOutputB, whileInputRest.reference)
        
        val whileModExpr = createOperatorExpression(OperatorType::MOD)
        whileModExpr.subExpressions += whileOutputA.reference
        whileModExpr.subExpressions += whileOutputB.reference
        
        whileDRegion.equations += createAssignment(whileOutputRest, whileModExpr)
        
        euclydDRegion.equations += createAssignment(VOOutput, innerB2.reference)
        
        //Main State
        
        val mainState = createState("main")
        rootRegion.states += mainState
        
        val mainOutputDecl = createVariableDeclaration
        mainState.declarations += mainOutputDecl
        mainOutputDecl.type = ValueType.INT
        mainOutputDecl.output = true
        val mainOutput = mainOutputDecl.createValuedObject("res")
        
        val mainDRegion = createDataflowRegion("")
        mainState.regions += mainDRegion
        
        val mainInnerIntDecl = createVariableDeclaration
        mainDRegion.declarations += mainInnerIntDecl
        mainInnerIntDecl.type = ValueType.INT
        
        val mainInnerX = mainInnerIntDecl.createValuedObject("x")
        val mainInnerY = mainInnerIntDecl.createValuedObject("y")
        
        mainDRegion.equations += createAssignment(mainInnerX, createIntValue(5))
        mainDRegion.equations += createAssignment(mainInnerY, createIntValue(3))
        
        val mainInnerGGT = mainInnerIntDecl.createValuedObject("ggt")
        
        val funcCallRef = createReferenceDeclaration
        mainState.declarations += funcCallRef
        funcCallRef.setReference = euclydState
        val funcCallObj = funcCallRef.createValuedObject("euclyd_0")
        
        mainDRegion.equations += createAssignment(funcCallObj, VOInput1, mainInnerX.reference)
        mainDRegion.equations += createAssignment(funcCallObj, VOInput2, mainInnerY.reference)
        
        source = funcCallObj.reference => [
            subReference = VOOutput.reference
        ]
        mainDRegion.equations += createAssignment(mainInnerGGT, source)
        mainDRegion.equations += createAssignment(mainOutput, mainInnerGGT.reference)
        
        SCChart
        
    }

    
    def State findFunctionState(String funcName) {
        var State res = null
        for(funcPair : functions) {
            if (funcPair.key.equals(funcName)) {
                res = funcPair.value
            }
        }
        
        res
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
    

    
    private def scc() {
        SCChartsFactory::eINSTANCE
    }

}
