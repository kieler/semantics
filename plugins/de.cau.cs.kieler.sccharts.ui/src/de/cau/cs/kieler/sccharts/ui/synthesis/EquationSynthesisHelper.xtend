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
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import java.util.List
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortSide

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author kolja
 *
 */
class EquationSynthesisHelper {
    
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension KExpressionsCompareExtensions

    // removes a node from the list and from the graph
    def betterRemove(List<KNode> nodes, KNode node) {
        while (node.incomingEdges !== null && node.incomingEdges.size > 0) {
            node.incomingEdges.get(0).betterRemove
        }
        while (node.outgoingEdges !== null && node.outgoingEdges.size > 0) {
            node.outgoingEdges.get(0).betterRemove
        }
        node.remove
        nodes.remove(node)
    }

    // removes the edge and the ports if they are not needed anymore
    def void betterRemove(KEdge e) {
        val source = e.source
        val target = e.target
        if (e.sourcePort !== null && e.sourcePort.edges !== null && e.sourcePort.edges.size == 1) {
            e.sourcePort.remove
        }
        if (e.targetPort !== null && e.targetPort.edges !== null && e.targetPort.edges.size == 1) {
            e.targetPort.remove
        }
        e.remove
        source?.outgoingEdges?.remove(e)
        target?.incomingEdges?.remove(e)
        e.sourcePort?.edges?.remove(e)
        e.targetPort?.edges?.remove(e)
    }

    def getId(KLabeledGraphElement node) {
        node.eContents?.filter(KIdentifier)?.head?.id
    }

    def setId(KLabeledGraphElement node, String id) {
        node.getData(KIdentifier).id = id
        node
    }

    def KLabel getLabel(KNode node) {
        node.eContents.filter(KLabel).head
    }

    def PortSide getPortSide(KPort port) {
        port.getProperty(CoreOptions::PORT_SIDE)
    }

    def findPortById(KNode node, String id) {
        for (p : node.ports) {
            if (p.id == id) {
                return p
            }
        }
        return null
    }

    def isInput(KNode node) {
        node.getProperty(EquationSynthesis.INPUT_FLAG) as boolean
    }

    def isOutput(KNode node) {
        node.getProperty(EquationSynthesis.OUTPUT_FLAG) as boolean
    }

    def isReference(KNode node) {
        return node.getProperty(EquationSynthesis.REFERENCE_NODE) as boolean
    }

    // given two KGraph elements the return value is true iff the elements are associated with the same source element
    // in case of associations with ValuedObjectReferences only the ValuedObject needs to be equal
    def sourceEquals(KGraphElement a, KGraphElement b) {
        if (a.sourceElement instanceof ValuedObjectReference && b.sourceElement instanceof ValuedObjectReference) {
            return (a.sourceElement as ValuedObjectReference).valuedObject ==
                (b.sourceElement as ValuedObjectReference).valuedObject
        }
        if (a.sourceElement instanceof Value && b.sourceElement instanceof Value &&
            a.sourceElement.serializeHR == b.sourceElement.serializeHR) {
            return true
        }
        if (a.sourceElement instanceof Expression && b.sourceElement instanceof Expression) {
            return (a.sourceElement as Expression).equals2(b.sourceElement as Expression)
        }
        return a.sourceElement == b.sourceElement
    }
    
    def isSequential(KEdge edge) {
        edge.getProperty(EquationSynthesis.SEQUENTIAL_EDGE) as boolean
    }

    def isInstance(KEdge edge) {
        edge.getProperty(EquationSynthesis.INSTANCE_EDGE) as boolean
    }

    def getSourceElement(KGraphElement node) {
        return node.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)
    }

    // returns true iff input is a node for the assignment equation of output
    // only usable when the equations are separated
    def isInputForEquation(KNode input, KNode output) {
        val List<KNode> queue = newArrayList
        queue.add(input)
        val List<KNode> visited = newArrayList
        while (queue.size > 0) {
            val current = queue.get(0)
            queue.remove(current)
            visited.add(current)
            if (current == output) {
                return true
            }
            for (e : current.outgoingEdges.filter[!isInstance]) {
                if (!visited.exists[it == e.target] && !queue.exists[it == e.target]) {
                    queue.add(e.target)
                }
            }
        }
        return false
    }

    // returns the last index of the last sub reference or the last sub reference
    def Expression lastSubReference(ValuedObjectReference reference) {
        if (reference.subReference !== null) {
            return reference.subReference.lastSubReference
        }
        if (reference.indices.size > 0) {
            return reference.indices.get(reference.indices.size - 1)
        }
        return reference
    }

    // returns true iff the last sub reference has indices
    def boolean lastSubReferenceIsArray(ValuedObjectReference reference) {
        if (reference.subReference !== null) {
            return reference.subReference.lastSubReferenceIsArray
        }
        return reference.indices.size > 0
    }

    // given a reference with sub references and indices
    // a copied reference is returned without the last index or sub reference
    def ValuedObjectReference removeLastReference(ValuedObjectReference reference) {
        val ref = reference.copy
        if (ref.subReference !== null) {
            ref.subReference = ref.subReference.removeLastReference
            return ref
        }
        if (ref.indices.size > 0) {
            ref.indices.remove(ref.indices.size - 1)
            return ref
        }
        return null
    }

    // returns the label of the last index of the last sub reference or the label of the last sub reference
    def String lastSubReferenceLabel(ValuedObjectReference reference) {
        if (reference.subReference !== null) {
            return reference.subReference.lastSubReferenceLabel
        }
        if (reference.indices.size > 0) {
            return "[" + reference.indices.get(reference.indices.size - 1).serializeHR.toString + "]"
        }
        return reference.serializeHR.toString
    }
}