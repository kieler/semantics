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
import com.google.inject.Injector
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import java.util.List
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.Alignment
import org.eclipse.elk.core.options.CoreOptions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions

/**
 * @author kolja
 * 
 */
class EquationSimplification {

    @Inject extension KExpressionsCompareExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsSerializeHRExtensions

    val DataflowRegion currentRegion
    val EquationSynthesis synthesis

    new(KNode root, EquationSynthesis es, Injector injector) {
        injector.injectMembers(this)
        currentRegion = root.getProperty(KlighdInternalProperties.MODEL_ELEMEMT) as DataflowRegion
        synthesis = es
    }

    // uses all simplifications in the correct order
    def simplify(List<KNode> nodes) {
        return nodes.connectInputWithOutput.combineInputNodes.combineReferenceNodes.hideLocalObjects.removeDublicates
    }

    // connects reads (input nodes) of a valued object with the write (output node) of the object
    // only if the input nodes are from a different assignment as the output node
    // the input nodes are removed
    def connectInputWithOutput(List<KNode> nodes) {
        for (node : nodes.filter[isInput && !isReference && !isDataArray].toList) {
            if (node.sourceElement instanceof ValuedObjectReference) {
                val vo = (node.sourceElement as ValuedObjectReference).valuedObject
                val output = nodes.getOutputNode(vo)
                if (output !== null && !node.isInputForEquation(output)) {
                    node.connectToOutput(output)
                    nodes.remove(node)
                }
            }
        }
        return nodes
    }

    // remove doubled input nodes
    def combineInputNodes(List<KNode> nodes) {
        for (node : nodes.filter[isInput].toList) {
            if (nodes.contains(node)) {
                for (unneeded : nodes.filter[isInput && it != node && sourceEquals(node)].toList) {
                    unneeded.redirectOutgoingWires(node)
                    unneeded.remove
                    nodes.remove(unneeded)
                }
            }
        }
        return nodes
    }

    // removes doubled reference nodes
    def combineReferenceNodes(List<KNode> nodes) {
        for (node : nodes.filter[isReference].toList) {
            if (nodes.contains(node)) {
                val vo = (node.sourceElement as ValuedObjectReference).valuedObject
                for (unneeded : nodes.filter [
                    isReference && it != node && sourceElement instanceof ValuedObjectReference &&
                        (sourceElement as ValuedObjectReference).valuedObject == vo
                ].toList) {
                    unneeded.redirectIncommingWires(node)
                    unneeded.redirectOutgoingWires(node)
                    unneeded.remove
                    nodes.remove(unneeded)
                }
                node.setProperty(EquationSynthesis.INPUT_FLAG, false)
                node.setProperty(EquationSynthesis.OUTPUT_FLAG, false)
                node.setProperty(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)
                node.setProperty(CoreOptions::ALIGNMENT, Alignment.AUTOMATIC)
            }
        }
        return nodes
    }

    // removes input and output nodes of local defined variables iff they are not explicitly specified as input or output
    def hideLocalObjects(List<KNode> nodes) {
        // remove input nodes of local declared valued objects which are no inputs
        for (node : nodes.filter [
            isInput && isLocalValuedObject && !(sourceElement as ValuedObjectReference).valuedObject.input && !isNeeded
        ].toList) {
            while (node.outgoingEdges.size > 0) {
                val e = node.outgoingEdges.get(0)
                e.remove
                node.outgoingEdges.remove(e)
            }
            node.remove
            nodes.remove(node)
        }
        // remove output nodes of local declared valued objects which are no outputs
        for (node : nodes.filter [
            isOutput && isLocalValuedObject && !(sourceElement as ValuedObjectReference).valuedObject.output &&
                !isNeeded
        ].toList) {
            while (node.incomingEdges.size > 0) {
                val e = node.incomingEdges.get(0)
                e.remove
                node.incomingEdges.remove(e)
            }
            node.remove
            nodes.remove(node)
        }
        return nodes
    }

    // removes doubled expression nodes
    def removeDublicates(List<KNode> nodes) {
        for (node : nodes.filter[!isInput && !isOutput && !isReference && !isDataArray].toList) {
            if (nodes.contains(node)) {
                val unneed = nodes.findIndependentDublicateNode(node)
                if (unneed !== null) {
                    unneed.redirectOutgoingWires(node)
                    while (unneed.incomingEdges.size > 0) {
                        val e = unneed.incomingEdges.get(0)
                        e.remove
                        unneed.incomingEdges.remove(e)
                    }
                    unneed.remove
                    nodes.remove(unneed)
                }
            }
        }
        return nodes
    }

    // returns a KNode which stands for the same equation as node or returns null if no such node exists
    def findIndependentDublicateNode(List<KNode> nodes, KNode node) {
        for (n : nodes) {
            if (n != node) {
                if (n.sourceEquals(node) && !n.isInputForEquation(node) && !node.isInputForEquation(n) ) {
                    return n
                }
            }
        }
        return null
    }

    // removes an input node and connects the wires to the wires of the output node
    def connectToOutput(KNode input, KNode output) {
        for (e : input.outgoingEdges) {
            var targetPort = e.targetPort
            for (e2 : output.incomingEdges) {
                var sourcePort = e2.sourcePort
                synthesis.connectWith(sourcePort, targetPort,
                    (input.sourceElement as ValuedObjectReference).valuedObject.serializeHR.toString)
            }
        }
        while (input.outgoingEdges.size > 0) {
            val e = input.outgoingEdges.get(0)
            e.remove
            input.outgoingEdges.remove(e)
        }
        input.remove
    }

    // redirects all incoming wires of old to target
    def redirectIncommingWires(KNode old, KNode target) {
        while (old.incomingEdges.size > 0) {
            val e = old.incomingEdges.get(0)
            var targetPort = synthesis.getInputPortWithNumber(target, 0)
            if (e.targetPort.sourceElement instanceof ValuedObjectReference) {
                targetPort = target.findPort((e.targetPort.sourceElement as ValuedObjectReference).valuedObject)
                if (targetPort === null) {
                    targetPort = e.targetPort.copy
                    synthesis.setId(targetPort, EquationSynthesis.IN_PORT + "_" + target.ports.size)
                    target.ports.add(targetPort)
                }
            }
            e.target = target
            e.targetPort = targetPort
            old.incomingEdges.remove(e)
            target.incomingEdges.add(e)
        }
    }

    // redirects all outgoing wires of old to source
    def redirectOutgoingWires(KNode old, KNode source) {
        while (old.outgoingEdges.size > 0) {
            val e = old.outgoingEdges.get(0)
            var sourcePort = EquationSynthesis.findPortById(source, EquationSynthesis.OUT_PORT)
            if (e.sourcePort.sourceElement instanceof ValuedObjectReference) {
                sourcePort = source.findPort((e.sourcePort.sourceElement as ValuedObjectReference).valuedObject)
                if (sourcePort === null) {
                    sourcePort = e.sourcePort.copy
                    synthesis.setId(sourcePort, EquationSynthesis.OUT_PORT + "_" + source.ports.size)
                    source.ports.add(sourcePort)
                }
            }
            e.source = source
            e.sourcePort = sourcePort
            old.outgoingEdges.remove(e)
        }
    }

    // checks if the node can be removed such that no ports of other nodes becomes unused
    def isNeeded(KNode node) {
        for (e : node.incomingEdges) {
            if (!e.source.outgoingEdges.exists[it != e && it.sourcePort == e.sourcePort]) {
                return true
            }
        }
        for (e : node.outgoingEdges) {
            if (!e.target.incomingEdges.exists[it != e && it.targetPort == e.targetPort]) {
                return true
            }
        }
        return false
    }
    
    def isDataArray(KNode node){
        node.getProperty(EquationSynthesis.DATA_ARRAY_FLAG) as boolean
    }

    def isInput(KNode node) {
        node.getProperty(EquationSynthesis.INPUT_FLAG) as boolean
    }

    def isOutput(KNode node) {
        node.getProperty(EquationSynthesis.OUTPUT_FLAG) as boolean
    }

    def getSourceElement(KGraphElement node) {
        return node.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)
    }

    // returns true iff the node is associated with a valued object which is declared inside of the dataflow region
    def isLocalValuedObject(KNode node) {
        val element = node.sourceElement
        if (element instanceof ValuedObjectReference) {
            return currentRegion.declarations.contains((element as ValuedObjectReference).valuedObject.declaration)
        }
        return false
    }

    def isReference(KNode node) {
        return node.getProperty(EquationSynthesis.REFERENCE_NODE) as boolean
    }

    // finds an output node for a valued Object
    def getOutputNode(List<KNode> nodes, ValuedObject o) {
        val filtered = nodes.filter [
            isOutput && sourceElement instanceof ValuedObjectReference &&
                (sourceElement as ValuedObjectReference).valuedObject == o
        ].toList
        if (filtered.size == 0) {
            return null
        }
        return filtered.get(0)
    }

    // finds a port witch is associated with a valued Object
    def findPort(KNode node, ValuedObject o) {
        for (port : node.ports) {
            if (port.sourceElement instanceof ValuedObjectReference &&
                (port.sourceElement as ValuedObjectReference).valuedObject == o) {
                return port
            }
        }
        return null
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
            for (e : current.outgoingEdges) {
                if (!visited.exists[it == e.target] && !queue.exists[it == e.target]) {
                    queue.add(e.target)
                }
            }
        }
        return false
    }
}
