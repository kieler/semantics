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

/**
 * @author lan
 * 
 */

@SuppressWarnings("all","unchecked")
class DataflowExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {

    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
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
        
        //auto created dataflow graph
        for (child : ast.children) {
            if (child instanceof CASTFunctionDefinition) {
                val funcDef = child as CASTFunctionDefinition
                val funcState = funcDef.illustrate
                SCChart.rootStates += funcState
                functions.add(new Pair(funcState.label, funcState))
            }    
        }
        
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
