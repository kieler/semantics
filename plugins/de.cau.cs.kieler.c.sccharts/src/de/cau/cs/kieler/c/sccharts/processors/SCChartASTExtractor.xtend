/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.ArrayList
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.emf.ecore.EObject

/**
 * @author lewe
 *
 */
class SCChartASTExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {
    
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
        
    val layers = <Integer, ArrayList<Integer>> newHashMap    
        
     override getId() {
        "de.cau.cs.kieler.c.sccharts.scchartsASTExtractor"
    }
    
    override getName() {
        "AST Extractor"
    }
    
    override process() {
        val tUnit = getModel
        setModel(tUnit.transform as SCCharts)
    }
    
    def EObject transform(IASTTranslationUnit ast) {
         
         if(ast === null) {
             return null
         }
         
         if (ast.children === null) {
             return null
         }
         
         val SCChart = createSCChart
         val rootState = createState("AST")
         SCChart.rootStates += rootState
         
         val cRegion = createControlflowRegion("")
         rootState.regions += cRegion
         
         for(var i=0;i<ast.children.length;i++) {
             printChildren(cRegion,ast.children.get(i), 0)
         }
         
         
         SCChart
         
     }
     
     def State printChildren(ControlflowRegion cRegion, IASTNode node, int layer) {
         val State res = cRegion.createState("")
         
         var layerIdx = 0
         var layerList = <Integer> newArrayList
         layerList.add(1)
         if (layers.containsKey(layer)) {
             layerList = layers.get(layer)
             layerIdx = layerList.size
             layerList.add(1)
         } else {
             layers.put(layer,layerList)
         }
         
         var nodeASTClass = node.toString
         if (node instanceof IASTIdExpression) {
             nodeASTClass = "IdExpression"
         }
         if (node instanceof IASTFunctionCallExpression) {
             nodeASTClass = "FunctionCallExpression"
         }
         if(nodeASTClass.contains("CPPAST")) {
            nodeASTClass = nodeASTClass.substring(nodeASTClass.indexOf("CPPAST") + 6)    
         }
         if(nodeASTClass.contains("CAST")) {
            nodeASTClass = nodeASTClass.substring(nodeASTClass.indexOf("CAST") + 4)    
         }
         if(nodeASTClass.contains("@")) {
            nodeASTClass = nodeASTClass.substring(0, nodeASTClass.indexOf("@"))    
         }
         var resLabel = nodeASTClass + "\n"
         
         
         /*if(node instanceof IASTIdExpression) {
             resLabel += "ist ne CPPASTIdExpression"
             if((node as IASTIdExpression).getRoleForName(node.getName) == IASTNameOwner.r_declaration) {
                 resLabel += "\nIs a declaration"
             } else if((node as IASTIdExpression).getRoleForName(node.getName) == IASTNameOwner.r_definition) {
                 resLabel += "\nIs a definition"
             } else if((node as IASTIdExpression).getRoleForName(node.getName) == IASTNameOwner.r_reference) {
                 resLabel += "\nIs a reference"
             } else if((node as IASTIdExpression).getRoleForName(node.getName) == IASTNameOwner.r_unclear) {
                 resLabel += "\nIs unclear"
             }
             val nodeName = node.getName
             /*resLabel += "\nBindings: "
             resLabel += "\ngetBinding: " + nodeName.getBinding
             resLabel += "\ngetPreBinding: " + nodeName.getPreBinding
             resLabel += "\nresolveBinding: " + nodeName.resolveBinding
             resLabel += "\nresolvePreBinding: " + nodeName.resolvePreBinding
         }*/
          
         /*for(var i = 0; i < node.getNodeLocations.length; i++) {
            val nodeOffset = node.getNodeLocations.get(i).getNodeOffset
            resLabel += "nodeOffset[" + i + "]: " + nodeOffset + "\n"
            val nodeLength = node.getNodeLocations.get(i).getNodeLength
            resLabel += "nodeLength[" + i + "]: " + nodeLength + "\n"   
         }
         resLabel += "FileLocation: " + node.getFileLocation + "\n"
         resLabel += "ContainingFileName: " + node.getContainingFilename
         */
         for (var i = 0; i < node.children.length; i++) {
             var child = printChildren(cRegion, node.children.get(i), layer + 1)
             res.createTransitionTo(child)
         }
         
         res.label = resLabel
         
         res
     }
    
}