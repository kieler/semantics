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
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import java.util.List
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.Alignment
import org.eclipse.elk.core.options.CoreOptions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author kolja
 * 
 */
class EquationSimplification {

    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension EquationSynthesis
    @Inject extension EquationSynthesisHelper
    @Inject extension KNodeExtensionsReplacement

    val DataflowRegion currentRegion

    new(KNode root, Injector injector) {
        injector.injectMembers(this)
        currentRegion = root.sourceElement as DataflowRegion
    }

    // uses all simplifications in the correct order
    def simplify(List<KNode> nodes) {
        return nodes.sequentialize.connectInputWithOutput.combineInputNodes.combineReferenceNodes.hideLocalObjects.
            removeDublicates.removeSequentialWrites
    }

    // removes sequential edges and removes the input and output nodes
    def sequentialize(List<KNode> nodes) {
        val List<KNode> sequentializedOutputs = newArrayList
        val List<KNode> sequentializedInputs = newArrayList
        for (seq : sequentials.filter[key.isOutput && value.isInput && !key.isReference]) {
            seq.value.connectToOutput(seq.key)
            if (!sequentializedInputs.contains(seq.value)) {
                sequentializedInputs += seq.value
            }
            if (!sequentializedOutputs.contains(seq.key)) {
                sequentializedOutputs.add(seq.key)
            }
        }
        for (n : sequentializedInputs) {
            nodes.betterRemove(n)
        }
        // removes the output nodes if it is not the last output node for the references valued object
        for (n : sequentializedOutputs) {
            if (nodes.filter[isOutput && sourceEquals(n)].size > 1) {
                nodes.betterRemove(n)
            } else if (EquationSynthesis.ALIGN_INPUTS_OUTPUTS.booleanValue) {
                n.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::LAST)
            }
        }
        return nodes
    }

    // connects reads (input nodes) of a valued object with the write (output node) of the object
    // only if the input nodes are from a different assignment as the output node
    // the input nodes are removed
    def connectInputWithOutput(List<KNode> nodes) {
        for (node : nodes.filter[isInput && !isReference && !isDataArray].toList.clone) {
            val output = nodes.getOutputNode(node)
            if (output !== null) {
                node.connectToOutput(output)
                nodes.betterRemove(node)
            }
        }
        return nodes
    }

    // remove doubled input nodes
    def combineInputNodes(List<KNode> nodes) {
        for (node : nodes.filter[isInput].toList) {
            if (nodes.contains(node)) {
                for (unneeded : nodes.filter [
                    isInput && it != node && sourceEquals(node) && !isSequential(node) && !node.isSequential(it)
                ].toList) {
                    unneeded.redirectOutgoingWires(node)
                    nodes.betterRemove(unneeded)
                }
            }
        }
        return nodes
    }

    // removes doubled reference nodes
    // TODO: find a solution for sequential usage of references
    def combineReferenceNodes(List<KNode> nodes) {
        for (node : nodes.filter[isReference].toList) {
            if (nodes.contains(node)) {
                for (unneeded : nodes.filter [
                    isReference && it != node && sourceEquals(node) && !isReferenceSequential(node) &&
                        !node.isReferenceSequential(it)
                ].toList) {
                    unneeded.redirectIncommingWires(node)
                    unneeded.redirectOutgoingWires(node)
                    nodes.betterRemove(unneeded)
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
            nodes.betterRemove(node)
        }
        // remove output nodes of local declared valued objects which are no outputs
        for (node : nodes.filter [
            isOutput && isLocalValuedObject && !(sourceElement as ValuedObjectReference).valuedObject.output &&
                !isNeeded
        ].toList) {
            nodes.betterRemove(node)
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
                    nodes.betterRemove(unneed)
                }
            }
        }
        return nodes
    }

    // removes sequential write nodes if the result is overwritten and never be used
    def removeSequentialWrites(List<KNode> nodes) {
        val List<KNode> candidates = nodes.filter[(isOutput || isReference) && nodes.existsSequentialWrite(it)].toList
        while (!candidates.empty) {
            val node = candidates.get(0)
            candidates.remove(node)
            if (node.isReference) {
                // for all written variables in this reference
                for (port : node.incomingEdges.filter[!isSequential && !isInstance].map[targetPort].toList) {
                    // if they are not used
                    if (!node.outgoingEdges.exists[!isSequential && !isInstance && sourcePort.sourceEquals(port)]) {
                        // if they are overwritten later
                        if (nodes.exists [
                            (isOutput || isReference) && sourceEquals(node) && it != node && node.isSequential(it) &&
                                isReference && incomingEdges.exists[targetPort.sourceEquals(port)]
                        ]) {
                            // remove the port
                            while (port.edges.size > 0) {
                                var e = port.edges.get(0)
                                candidates += e.source
                                e.betterRemove
                                port.edges.remove(e)
                            }
                            port.remove
                        }
                    }
                }
                if (!node.incomingEdges.exists[!isSequential && !isInstance] && !node.outgoingEdges.exists [
                    !isSequential && !isInstance
                ]) {
                    nodes.betterRemove(node)
                }
            } else {
                if (!node.outgoingEdges.exists[!isSequential && !isInstance]) {
                    candidates += node.incomingEdges.map[source]
                    nodes.betterRemove(node)
                }
            }
        }
        return nodes
    }

    // returns true if node is a write node witch is overwritten by another sequential write node
    def existsSequentialWrite(List<KNode> nodes, KNode node) {
        return nodes.exists[(isOutput || isReference) && sourceEquals(node) && it != node && node.isSequential(it)]
    }

    // returns a KNode which stands for the same equation as node or returns null if no such node exists
    def findIndependentDublicateNode(List<KNode> nodes, KNode node) {
        for (n : nodes) {
            if (n != node) {
                if (n.sourceEquals(node) && !n.isInputForEquation(node) && !node.isInputForEquation(n) &&
                    !n.isSequential(node) && !node.isSequential(n)) {
                    return n
                }
            }
        }
        return null
    }

    // removes an input node and connects the wires to the wires of the output node
    def connectToOutput(KNode input, KNode output) {
        for (e : input.outgoingEdges.filter[!isSequential && !isInstance]) {
            var targetPort = e.targetPort
            for (e2 : output.incomingEdges.filter[!isSequential && !isInstance]) {
                var sourcePort = e2.sourcePort
                sourcePort.connectWith(targetPort,
                    (input.sourceElement as ValuedObjectReference).valuedObject.serializeHR.toString)
            }
        }
    }

    // redirects all incoming wires of old to target
    def redirectIncommingWires(KNode old, KNode target) {
        while (old.incomingEdges.size > 0) {
            val e = old.incomingEdges.get(0)
            if (!e.isSequential && !e.isInstance) {
                var targetPort = target.getInputPortWithNumber(0)
                if (e.targetPort.sourceElement instanceof ValuedObjectReference) {
                    targetPort = target.findPort((e.targetPort.sourceElement as ValuedObjectReference).valuedObject)
                    if (targetPort === null) {
                        targetPort = e.targetPort.copy
                        targetPort.setId(EquationSynthesis.IN_PORT + "_" + target.ports.size)
                        target.ports.add(targetPort)
                    }
                }
                if (e.targetPort.edges.size == 1) {
                    e.targetPort.remove
                }
                e.target = target
                e.targetPort = targetPort
                old.incomingEdges.remove(e)
            } else {
                e.betterRemove
            }
        }
    }

    // redirects all outgoing wires of old to source
    def redirectOutgoingWires(KNode old, KNode source) {
        while (old.outgoingEdges.size > 0) {
            val e = old.outgoingEdges.get(0)
            if (!e.isSequential && !e.isInstance) {
                var sourcePort = source.findPortById(EquationSynthesis.OUT_PORT)
                if (e.sourcePort.sourceElement instanceof ValuedObjectReference) {
                    sourcePort = source.findPort((e.sourcePort.sourceElement as ValuedObjectReference).valuedObject)
                    if (sourcePort === null) {
                        sourcePort = e.sourcePort.copy
                        sourcePort.setId(EquationSynthesis.OUT_PORT + "_" + source.ports.size)
                        source.ports.add(sourcePort)
                    }
                }
                if (e.sourcePort.edges.size == 1) {
                    e.sourcePort.remove
                }
                e.source = source
                e.sourcePort = sourcePort
                old.outgoingEdges.remove(e)
            } else {
                e.betterRemove
            }
        }
    }

    // checks if the node can be removed such that no ports of other nodes becomes unused
    def isNeeded(KNode node) {
        for (e : node.incomingEdges.filter[!isSequential && !isInstance]) {
            if (!e.source.outgoingEdges.exists[it != e && it.sourcePort == e.sourcePort]) {
                return true
            }
        }
        for (e : node.outgoingEdges.filter[!isSequential && !isInstance]) {
            if (!e.target.incomingEdges.exists[it != e && it.targetPort == e.targetPort]) {
                return true
            }
        }
        return false
    }

    def isDataArray(KNode node) {
        node.getProperty(EquationSynthesis.DATA_ARRAY_FLAG) as boolean
    }

    // returns true iff the node is associated with a valued object which is declared inside of the dataflow region
    def isLocalValuedObject(KNode node) {
        val element = node.sourceElement
        if (element instanceof ValuedObjectReference) {
            return currentRegion.declarations.contains((element as ValuedObjectReference).valuedObject.declaration)
        }
        return false
    }

    // checks for two reference nodes if they are sequential and use at least one same variable
    def isReferenceSequential(KNode ref1, KNode ref2) {
        return ref1.isSequential(ref2) && ref1.ports.exists [ p |
            p.sourceElement !== null && ref2.ports.exists[sourceElement !== null && sourceEquals(p)]
        ]
    }

    // finds an output node for a input node that is not sequential after the input node
    def getOutputNode(List<KNode> nodes, KNode node) {
        val filtered = nodes.filter [
            isOutput && sourceEquals(node) && !node.isSequential(it) && !node.isInputForEquation(it)
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
}
