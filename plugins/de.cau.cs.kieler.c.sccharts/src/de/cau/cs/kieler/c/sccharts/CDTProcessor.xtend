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
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIfStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import org.eclipse.cdt.internal.core.dom.parser.c.CASTReturnStatement
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import org.eclipse.cdt.core.dom.ast.IASTExpression
import de.cau.cs.kieler.core.kexpressions.Declaration
import org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.kico.KielerCompilerContext
import org.eclipse.cdt.core.model.CoreModel
import org.eclipse.core.resources.IResource
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.cdt.internal.ui.editor.CEditor
import org.eclipse.ui.IEditorPart
import org.eclipse.cdt.internal.core.dom.parser.c.CASTForStatement
import de.cau.cs.kieler.sccharts.Assignment
import org.eclipse.cdt.internal.core.dom.parser.c.CASTUnaryExpression
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.sccharts.ControlflowRegion

/**
 * @author ssm
 *
 */
class CDTProcessor extends AbstractProductionTransformation {
    
    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension SCChartsExtension
    
    public static val RETURNVONAME = "return"
    
    val VOSet = <ValuedObject> newHashSet
    var _trc = 0
    
    var Declaration globalDeclaration 
    
    override String getId() {
        return "C2SCT";
    }
    
	override getProducedFeatureId() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
    
    
    override transform(EObject eObject, KielerCompilerContext context) {
        eObject
    }
    
    def EObject createFromEditor(IEditorPart editor) {
        val cEditor = editor as CEditor
        val tu = cEditor.translationUnit
//        val ITranslationUnit tu = CoreModel.getDefault().create as ITranslationUnit
        
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
        
        VOSet.clear
        
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
            VOSet += it
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
                root.regions += it
            ]
        ]
        
        // parameters
        val inputDeclaration = kex.createDeclaration => [
            type = ValueType::INT
            input = true
            model.declarations += it
        ]
        
        globalDeclaration = kex.createDeclaration => [
            type = ValueType::INT
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
                  VOSet += it
              ]  
        ]
        
        val compound = function.children.filter(typeof(CASTCompoundStatement)).head
        if (compound != null) {
            compound.transformCompound(null, model) => [
                initial = true
            ]
        }
        
        if (!globalDeclaration.valuedObjects.empty) {
            model.declarations += globalDeclaration
        }
        
        model
    } 
    
    def State transformCompound(CASTCompoundStatement cs, State state, State parentState) {
        var State newState 
        if (state == null) {
            newState = scc.createState => [ s |
                s.id = "_S" + trC
                s.label = s.id
            
                parentState.regions.filter(typeof(ControlflowRegion)).head.states += s
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
        
        stateF.regions += scc.createRegion => [
            id = "_r" + trC
        ]
        stateF.regions += scc.createDataflowRegion => [
            id = "_d" + trC
        ]
        
        
        val declarations = cs.children.filter(typeof(CASTDeclarationStatement))
        if (!declarations.empty) {
            for(decls : declarations) {
              val simpleDecl = decls.children.filter(typeof(CASTSimpleDeclaration)).head
              val decl = simpleDecl.children.filter(typeof(CASTDeclarator)).head
              
              decl.createDataflow(stateF)
//              val iName = decl.children.head.toString
//              val lVar = kex.createValuedObject => [
//                  name = iName
//                  VOSet += it
//              ]  
//              val init = decl.children.filter(typeof(CASTEqualsInitializer))
//              if (!init.empty) {
//                 lVar.initialValue = createIntValue(Integer.parseInt(init.head.children.head.toString))
//              }
//              globalDeclaration.valuedObjects += lVar
            }
        }      


        var actualState = stateF
        for(statement : cs.children) {
            if (statement instanceof CASTIfStatement) {
                actualState = statement.transformIf(actualState)
            }
            if (statement instanceof CASTReturnStatement) {
                actualState = statement.transformReturn(actualState)
            }
            if (statement instanceof CASTExpressionStatement) {
                statement.transformExpression(actualState)
            }
            if (statement instanceof CASTForStatement) {
            	statement.transformFor(actualState)
            }
        }
        
        stateF.regions.immutableCopy.forEach [
            if (it instanceof ControlflowRegion) {
                if (it.states.empty) stateF.regions.remove(it)
            }
            if (it instanceof DataflowRegion) {
                if (it.nodes.empty && it.equations.empty) stateF.regions.remove(it)
            }
        ]
        
        stateF
    }
    
    def State transformIf(CASTIfStatement ifStatement, State state) {
        val ifs = ifStatement
        val exp = ifs.children.filter(typeof(CASTBinaryExpression)).head
            val kExp = exp.createKExpression

            val trueState = scc.createState => [ s |
                s.id = state.id + trC + "T"
                s.label = s.id
            
                s.regions += scc.createRegion => [
                    id = s.id + "_r"
                    label = ""
                ]
                
                state.parentRegion.states += s
            ]
            
            val falseState = scc.createState => [ s |
                s.id = state.id + trC + "F"
                s.label = s.id
            
                s.regions += scc.createRegion => [
                    id = s.id + "_r"
                    label = ""
                ]
                
                state.parentRegion.states += s
            ]            

            val connectorState = scc.createState => [ s |
                s.id = state.id + trC
                s.label = s.id
                s.setTypeConnector
            
                s.regions += scc.createRegion => [
                    id = s.id + "_r"
                    label = ""
                ]
                
                state.parentRegion.states += s
            ]            
            
            val trueTrans = scc.createTransition => [
                targetState = trueState
                immediate = true
                state.outgoingTransitions += it
                trigger = kExp
            ]  
            
            val falseTrans = scc.createTransition => [
                targetState = falseState
                immediate = true
                state.outgoingTransitions += it
            ]    
            
            val trueConnector = scc.createTransition => [
                targetState = connectorState
                immediate = true
                trueState.outgoingTransitions += it
                type == TransitionType::TERMINATION
            ]  
            
            val falseConnector = scc.createTransition => [
                targetState = connectorState
                immediate = true
                falseState.outgoingTransitions += it
                type == TransitionType::TERMINATION
            ]  
            
        (ifs.thenClause as CASTCompoundStatement).transformCompound(trueState, state)        
        (ifs.elseClause as CASTCompoundStatement).transformCompound(falseState, state)        
            
        connectorState                         
    }
    
    def State transformFor(CASTForStatement forStatement, State state) {
//    	    for(int i=2; i<=n; i++) {
//    org.eclipse.cdt.internal.core.dom.parser.c.CASTForStatement@52b20f80
//     org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarationStatement@2817c6ea
//      org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration@31044136
//       org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclSpecifier@e55595e
//       org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@55e31ac
//        i
//        org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@6b0f15f4
//         2
//     org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@2b6a7d15
//      org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@5c3a03f7
//       i
//      org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@64da7c6e
//       n
//     org.eclipse.cdt.internal.core.dom.parser.c.CASTUnaryExpression@441f4d7c
//      org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@63182ad4
//       i
//     org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@47a3f71f
		val f = forStatement
		
		val localDeclaration = kex.createDeclaration => [
			type = ValueType::INT
			state.declarations += it
		]
		val iterateAction = state.createImmediateIterateAction
		
		val initializationExp = f.initializerStatement as CASTDeclarationStatement
        val counterVO = initializationExp.createValuedObjectFromDeclarationStatement(true) 
		localDeclaration.valuedObjects += counterVO		
		VOSet += counterVO
		
		val conditionExp = f.conditionExpression
		iterateAction.trigger = conditionExp.createKExpression
		
		val iterateExp = f.iterationExpression as CASTUnaryExpression
		val iterateAssignment = iterateExp.createAssignment 
		iterateAction.addAssignment(iterateAssignment)
		
		val body = f.body as CASTCompoundStatement
		
		body.transformCompound(state, state)
    	
    	state
    }
    
    def ValuedObject createValuedObjectFromDeclarationStatement(CASTDeclarationStatement declaration, boolean withInitializationPart) {
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
//        org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@50429fba
//         tmp
//         org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@46049580
//          org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@56f32a69
//           fh        
        
        val iName = declarator.children.head.toString
        val lVar = kex.createValuedObject => [
            name = iName
        ]
        
        lVar    	
    }
    
    def State transformReturn(CASTReturnStatement returnStatement, State state) {
        
        val returnState = scc.createState => [ s |
            s.id = state.id + trC
            s.label = s.id
            s.final = true
            state.parentRegion.states += s
            
//                s.concurrencies += scc.createRegion => [
//                    id = s.id + "_r"
//                    label = ""
//                ]            
                s.regions += scc.createDataflowRegion => [
                    id = s.id + "_d"
                    label = ""
                ]            
        ]
        state.outgoingTransitions += scc.createTransition => [
            targetState = returnState
            immediate = true
        ]        
        
//        val returnAssignment = scc.createAssignment => [
//            valuedObject = VOSet.filter[name.equals(RETURNVONAME)].head
//            expression = returnStatement.returnValue.createKExpression 
//        ]
        
        val df = returnState.dataflowRegion
        
        val eq = scc.createEquation
        eq.valuedObject = VOSet.filter[name.equals(RETURNVONAME)].head
        eq.expression = returnStatement.returnValue.createKExpression 
        
        df.equations += eq        
        
//        (returnState.incomingTransitions.head.eContainer as State).createEntryAction.addAssignment(returnAssignment)
//        returnState.createEntryAction.addAssignment(returnAssignment)
            
        returnState      
    }
    
    def transformExpression(CASTExpressionStatement es, State state) {
//   org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement@7f6adc09
//    org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement@40941439
//     org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@39bbcb4e
//      org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@58208b7e
//       fh
//      org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@40a62a65
//       n
        if (es.expression instanceof CASTBinaryExpression) {
            val exp = es.expression as CASTBinaryExpression
            exp.createDataflow(state)  
        }
        null     
     }
     
    def createDataflow(CASTBinaryExpression exp, State state) {
//   org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@7940791
//    org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@77cc47a
//     n
//    1
        val df = state.dataflowRegion
        
        val eq = scc.createEquation
        eq.valuedObject = (exp.operand1 as CASTIdExpression).createVOReference.valuedObject
        eq.expression = exp.operand2.createKExpression
        
        df.equations += eq
    }   
    
    def createDataflow(CASTDeclarator declarator, State state) {
//        org.eclipse.cdt.internal.core.dom.parser.c.CASTDeclarator@50429fba
//         tmp
//         org.eclipse.cdt.internal.core.dom.parser.c.CASTEqualsInitializer@46049580
//          org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@56f32a69
//           fh        
        
        val iName = declarator.children.head.toString
        val lVar = kex.createValuedObject => [
            name = iName
            VOSet += it
        ]
        globalDeclaration.valuedObjects += lVar        
        
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
        } else
        if (exp instanceof CASTBinaryExpression) {
			return (exp as CASTBinaryExpression).createKExpression        	
        } else {
            return Integer.parseInt(exp.toString).createIntValue
        }        
    }    
    
    def Expression createKExpression(CASTBinaryExpression exp) {
//   org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression@7940791
//    org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression@77cc47a
//     n
//    1
        val opExp = kex.createOperatorExpression
        
        if (exp.operator == IASTBinaryExpression::op_lessEqual) opExp.operator = OperatorType::LEQ
        else if (exp.operator == IASTBinaryExpression::op_greaterEqual) opExp.operator = OperatorType::GEQ
        else if (exp.operator == IASTBinaryExpression::op_lessThan) opExp.operator = OperatorType::LT
        else if (exp.operator == IASTBinaryExpression::op_greaterThan) opExp.operator = OperatorType::GT
        
        for(arg : exp.children) {
            if (arg instanceof CASTIdExpression) {
                opExp.subExpressions += (arg as CASTIdExpression).createVOReference
            } else {
                opExp.subExpressions += Integer.parseInt(arg.toString).createIntValue
            }
        }    

        opExp   
    }
    
    def Assignment createAssignment(CASTUnaryExpression unary) {
    	val assignment = scc.createAssignment
    	
    	val VOR = (unary.operand as CASTIdExpression).createVOReference
    	assignment.valuedObject = VOR.valuedObject
    	assignment.expression = kex.createOperatorExpression => [
    		subExpressions += VOR
    		subExpressions += 1.createIntValue
    	]
    	if (unary.operator == IASTUnaryExpression::op_postFixIncr) (assignment.expression as OperatorExpression).operator  = OperatorType::ADD
    	else if (unary.operator == IASTUnaryExpression::op_postFixDecr) (assignment.expression as OperatorExpression).operator  = OperatorType::SUB
    	
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