/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.c.sccharts

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.SCChartsFactory
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.model.ITranslationUnit
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDefinition
import org.eclipse.cdt.internal.core.dom.parser.c.CASTProblem
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.State
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator
import org.eclipse.cdt.internal.core.dom.parser.c.CASTParameterDeclaration
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator
import org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import com.google.inject.Inject
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration
import org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension

/**
 * @author ssm
 *
 */
class CDTProcessor {
    
    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension SCChartsExtension
    
    var _trc = 0
    
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
        
        val astRoot = ast.children.head
        
        if (astRoot instanceof CASTFunctionDefinition) {
            val rootFunctionDefinition = astRoot as CASTFunctionDefinition
            val model = rootFunctionDefinition.transformFunction
            
            return model
        }
        
        null
    }
    
    def State transformFunction(CASTFunctionDefinition function) {

// org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDefinition@6c704a9e
// org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@403302b0
// org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator@54f591bd
//  fib

        // create return declaration         
        val returnDeclaration = kex.createDeclaration => [
            type = ValueType::INT
            output = true
        ]
        val returnValue = kex.createValuedObject => [
            name = "return"
            returnDeclaration.valuedObjects += it
        ]
        
        // create the scchart model for the function 
        val declarator = function.children.filter(typeof(CASTFunctionDeclarator)).head
        val model = scc.createState => [ root |
            root.label = declarator.children.head.toString
            root.id = root.label
            
            root.declarations += returnDeclaration
            
            scc.createRegion => [
                id = "_main"
                label = id
                root.concurrencies += it
            ]
        ]
        
        // parameters
        val inputDeclaration = kex.createDeclaration => [
            type = ValueType::INT
            input = true
            model.declarations += it
        ]
        
//  org.eclipse.cdt.internal.core.dom.parser.c.CASTParameterDeclaration@46333ade
//   org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@4d5de8d3
//   org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@50609c53
//    n        
        
        declarator.children.filter(typeof(CASTParameterDeclaration)).forEach[ parameter |
              val iName = parameter.children.filter(typeof(CASTDeclarator)).head.children.head.toString
              kex.createValuedObject => [
                  name = iName
                  inputDeclaration.valuedObjects += it
              ]  
        ]
        
        val compound = function.children.filter(typeof(CASTCompoundStatement)).head
        if (compound != null) {
            compound.transformCompound(model, model)
        }
        
        model
    } 
    
    def State transformCompound(CASTCompoundStatement cs, State state, State parentState) {
        var State newState 
        if (state == null) {
            newState = scc.createState => [ s |
                s.id = "_S" + trC
                s.label = s.id

                scc.createRegion => [
                    id = "_r" + trC
                    s.concurrencies += it
                ]
            
                parentState.concurrencies.filter(typeof(Region)).head.states += s
            ]
        } else {
            newState = state
        }
    val stateF = newState
        
// org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@76b7365e
//  org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement@76529235
//   org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration@26fd1243
//    org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@30ba00b4
//    org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@384426a
//     fl
//     org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@60243ef3
//      0        
        
        val declarations = cs.children.filter(typeof(CASTDeclarationStatement))
        if (!declarations.empty) {
            val localDeclaration = kex.createDeclaration => [
                type = ValueType::INT
                stateF.declarations += it
            ]
        
            declarations.forEach[ decls |
              val simpleDecl = decls.children.filter(typeof(CASTSimpleDeclaration)).head
              val decl = simpleDecl.children.filter(typeof(CASTDeclarator)).head
              val iName = decl.children.head.toString
              val lVar = kex.createValuedObject => [
                  name = iName
                  localDeclaration.valuedObjects += it
              ]  
              val init = decl.children.filter(typeof(CASTEqualsInitializer))
              if (!init.empty) {
                 lVar.initialValue = createIntValue(Integer.parseInt(init.head.children.head.toString))
              }
            ]
        }        
        
        state
    }
    
    def printASTNodes(Iterable<IASTNode> nodes, String indent) {
        if (nodes == null) return;
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
    
    private def int trC() {
        _trc = _trc + 1
        _trc
    }
    
//    private createExpression    
}


/*
 org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDefinition@6c704a9e
 org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@403302b0
 org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator@54f591bd
  fib
  org.eclipse.cdt.internal.core.dom.parser.c.CASTParameterDeclaration@46333ade
   org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@4d5de8d3
   org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@50609c53
    n
 org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@76b7365e
  org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement@76529235
   org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration@26fd1243
    org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@30ba00b4
    org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@384426a
     fl
     org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@60243ef3
      0
  org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement@6ba0f4d4
   org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration@1429c180
    org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@415ec4d7
    org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@34cd20c8
     fh
     org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@723458d
      1
  org.eclipse.cdt.internal.core.dom.parser.c.CASTIfStatement@1cab2fa4
   org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@2ac4c6b0
    org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@5cd062bf
     n
    1
   org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@75031933
    org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement@1e6b9f49
     org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@2ba68139
      org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@406ddb92
       fh
      org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@6c6a6f49
       n
   org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@3fb0593a
    org.eclipse.cdt.internal.core.dom.parser.c.CASTForStatement@52b20f80
     org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement@2817c6ea
      org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration@31044136
       org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@e55595e
       org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@55e31ac
        i
        org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@6b0f15f4
         2
     org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@2b6a7d15
      org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@5c3a03f7
       i
      org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@64da7c6e
       n
     org.eclipse.cdt.internal.core.dom.parser.c.CASTUnaryExpression@441f4d7c
      org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@63182ad4
       i
     org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@47a3f71f
      org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement@5db538f7
       org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration@24af1031
        org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@615013c7
        org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@50429fba
         tmp
         org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@46049580
          org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@56f32a69
           fh
      org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement@76658017
       org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@1bca2bb
        org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@75fa3e1
         fh
        org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@18000c8f
         fl
      org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement@2b388c98
       org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@d966553
        org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@cd6331d
         fl
        org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@42b5bb80
         tmp
  org.eclipse.cdt.internal.core.dom.parser.c.CASTReturnStatement@2928f2b7
   org.ecl
 */