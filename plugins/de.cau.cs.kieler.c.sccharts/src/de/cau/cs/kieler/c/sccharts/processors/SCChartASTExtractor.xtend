/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.processors

import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ControlflowRegion
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTNameOwner

/**
 * @author lewe
 *
 */
class SCChartASTExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {
    
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
        
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
         
         println("AST ORDER CHECK:")
         for(var i=0;i<ast.children.length;i++) {
             println("node Filename: " + ast.children.get(i).getContainingFilename)
             printChildren(cRegion,ast.children.get(i))
         }
         println("")
         
         val comments = ast.getComments()
         for (var i  = 0; i < comments.length; i++) {
             val comment = comments.get(i)
             println("Comment found: \n" + comment)
             println("node Offset: \n" + comment.getNodeLocations.get(0).getNodeOffset)
             println("node Length: \n" + comment.getNodeLocations.get(0).getNodeLength)
             println("FileLocation: " + comment.getFileLocation)
             println("ContainingFileName: " + comment.getContainingFilename)
             println("Comment ParentNode: " + comment.getParent.toString + "\n")
         }
         
         val includes = ast.getIncludeDirectives()
         for (var i  = 0; i < includes.length; i++) {
             println("Include found: \n" + includes.get(i) + "\n")
         }
         
//         println("This represents a header file: " + ast.isHeaderUnit)
         
         SCChart
         
     }
     
     def State printChildren(ControlflowRegion cRegion, IASTNode node) {
         val State res = cRegion.createState("")
         var nodeASTClass = node.toString
         if(nodeASTClass.contains("CPPAST")) {
            nodeASTClass = nodeASTClass.substring(nodeASTClass.indexOf("CPPAST"))    
         }
         if(nodeASTClass.contains("@")) {
            nodeASTClass = nodeASTClass.substring(0, nodeASTClass.indexOf("@"))    
         }
         var resLabel = nodeASTClass + "\n"
         
         if(node instanceof IASTIdExpression) {
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
             resLabel += "\nresolvePreBinding: " + nodeName.resolvePreBinding*/
         }
          
         for(var i = 0; i < node.getNodeLocations.length; i++) {
            val nodeOffset = node.getNodeLocations.get(i).getNodeOffset
            resLabel += "nodeOffset[" + i + "]: " + nodeOffset + "\n"
            val nodeLength = node.getNodeLocations.get(i).getNodeLength
            resLabel += "nodeLength[" + i + "]: " + nodeLength + "\n"   
         }
         resLabel += "FileLocation: " + node.getFileLocation + "\n"
         resLabel += "ContainingFileName: " + node.getContainingFilename
         
         for (var i = 0; i < node.children.length; i++) {
             var child = printChildren(cRegion, node.children.get(i))
             res.createTransitionTo(child)
         }
         
         res.label = resLabel
         
         res
     }
    
}