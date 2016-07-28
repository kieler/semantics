/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis

import de.cau.cs.kieler.sccharts.Equation
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import java.util.Set
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import com.google.inject.Inject
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.EquationStyles
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValueExtensions
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.kexpressions.Value
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.kexpressions.VariableDeclaration
import de.cau.cs.kieler.core.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.sccharts.State

/**
 * @author ssm
 *
 */
@ViewSynthesisShared
class EquationSynthesis extends SubSetSynthesis<Equation, KNode, Set<KNode>> {
    
    @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension KExpressionsValueExtensions
    
    @Inject
    extension SCChartsSerializeHRExtension    
    
    @Inject
    extension EquationStyles
    
    @Inject
    extension DataflowRegionSynthesis
    
    
    private val dataSources = <EObject> newHashSet
    private val dataSinks = <ValuedObject> newHashSet
    
    override performTranformationToSet(Equation equation) {
        val nodes = <KNode> newHashSet
        
        nodes += equation.performDataSourceTransformation;
        nodes += equation.performDataSinkTransformation;
        
        val equationNodes = equation.expression.performEquationTransformation;
        
        val node = equation.valuedObject.createNode
        node.addNodeLabel(equation.serializeAssignmentRoot.toString)
        
        val edge = equation.expression.performWireTransformation
        edge.target = node
        
        nodes += equationNodes
        nodes += node
        
        
        nodes
    }
    
    private def dispatch Set<KNode> performEquationTransformation(Value value) {
        val node = value.createNode.associateWith(value)
        node.addNodeLabel(value.serializeHR.toString);
        <KNode> newHashSet => [ it += node ]
    }
    
    private def dispatch Set<KNode> performEquationTransformation(ValuedObjectReference reference) {
        
        val declaration = reference.valuedObject.eContainer
        
        if (declaration instanceof VariableDeclaration) {
            val node = reference.valuedObject.createNode.associateWith(reference.valuedObject)
            node.addNodeLabel(reference.serializeHR.toString);
            return <KNode> newHashSet => [ it += node ]
        } else { // ReferenceDeclaration
            val node = reference.valuedObject.createNode.associateWith(reference.valuedObject) 
//            node.addNodeLabel(reference.serializeHR.toString)
            return <KNode> newHashSet => [ it += node ]
        }
    }
    
    private def dispatch Set<KNode> performEquationTransformation(OperatorExpression expression) {
        val result = <KNode> newHashSet
        val node = expression.createNode.associateWith(expression) => [ addOperatorNodeFigure ]
        node.addOperatorNodeLabel(expression.operator.serializeHR.toString)
        
        result += node
        
        for(se : expression.subExpressions) {
            val nodes = se.performEquationTransformation
            
            result += nodes
        }
        
        return result 
    }
    
    private def dispatch KEdge performWireTransformation(Value value) {
        val edge = createEdge.associateWith(value)
        edge.addWireFigure
        edge.source = value.getNode
        edge
    }
    
    private def dispatch KEdge performWireTransformation(ValuedObjectReference reference) {
        val edge = createEdge.associateWith(reference)
        edge.addWireFigure
        edge.source = reference.valuedObject.getNode
        edge        
    }

    private def dispatch KEdge performWireTransformation(OperatorExpression expression) {
        val node = expression.getNode
        
        for(se : expression.subExpressions) {
            val edge = se.performWireTransformation
            edge.target = node
        }
        val edge = createEdge.associateWith(expression)
        edge.source = node
        edge.addWireFigure
        
        edge
    }
    
    
    private def Set<KNode> performDataSourceTransformation(Equation equation) {
        val result = <KNode> newHashSet
        val vors = equation.expression.getAllReferences.map[ valuedObject ]
            + equation.expression.getAllValues
        for(vo : vors) {
            if (!dataSources.contains(vo)) {
                
                var isReference = false
                if (vo instanceof ValuedObject) {
                    if (vo.eContainer instanceof ReferenceDeclaration) isReference = true            
                }
                
                dataSources += vo
                if (!isReference) {
                    result += vo.createNode => [ addInputNodeFigure ]
                } else {
                    val referenceDeclaration = (vo as ValuedObject).eContainer as ReferenceDeclaration
                    
                    val node = vo.createNode => [ addReferenceNodeFigure ]
                    
                    node.addNodeLabel((vo as ValuedObject).serializeHR.toString)
                    node.addRegionsArea
                    
                    node.children += (vo as ValuedObject).createReferenceDataflowRegion
                    
                    result += node
                }
            }
        }
        result 
    }
    
    private def Set<KNode> performDataSinkTransformation(Equation equation) {
        val result = <KNode> newHashSet
        val vo = equation.valuedObject
        if (!dataSinks.contains(vo)) {
            dataSinks += vo
            result += vo.createNode => [ addOutputNodeFigure ]
        }
        result 
    }
    
    
}