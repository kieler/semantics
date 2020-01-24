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
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
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
    @Inject extension EquationSynthesisHelper
    @Inject extension KNodeExtensionsReplacement

    var List<KNode> inputNodes = null

    /**
     * Connects Tree graphs of different assignments and simplifies the resulting graph
     * @param nodes A List of Nodes of all Assignments
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    def List<KNode> simplify(List<KNode> nodes) {
        inputNodes = nodes.filter[isInput].map[copy].toList
        return nodes.sequentializeDataAccess.combineDataAccessNodes.sequentialize.connectInputWithOutput.
            combineInputNodes.combineReferenceNodes.removeDublicates.removeSequentialWrites.hideLocalObjects.
            resolvePreCicles.removeDoubledLabels.removeSequentialCicles.removeUnneededPorts
    }

    /**
     * for all sequential data access nodes (k,v) if k is an output node and v is an output node the source of k will be connected with v
     * The input nodes will be removed from the nodes list
     * The output nodes will be removed if there exists another output node which will be executed sequentially after this node
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def sequentializeDataAccess(List<KNode> nodes) {
        val list = nodes.filter[isOutput && isDataAccess].toList.sortSpecific
        for (n : list) {
            if (nodes.contains(n)) {
                val writes = nodes.filter [
                    it != n && isOutput && sourceEquals(n) && n.isDataArraySequential(it) && isDataAccess
                ].toList
                for (candidate : writes.filter[w|!writes.exists[isDataArraySequential(w)]].toList) {
                    val reads = nodes.filter [
                        it != n && isInput && sourceEquals(n) && isDataAccess && it.isDataArraySequential(candidate)
                    ].toList
                    for (read : reads) {
                        read.redirectIncommingWires(n)
                        read.redirectOutgoingWires(n)
                        n.removeUnneeded(nodes)
                        nodes.betterRemove(read, n)
                    }
                    val newPort = candidate.getInputPortWithNumber(candidate.ports.filter [ port |
                        candidate.incomingEdges.exists[targetPort == port]
                    ].size)
                    newPort.removeSourceElement
                    newPort.labels.clear
                    val e = n.outgoingEdges.filter[sourcePort.sourceElement === null].head
                    val oldTarget = e.target
                    if (e.targetPort.edges.size == 1) {
                        val port = e.targetPort
                        port.remove()
                        oldTarget.ports.remove(port)
                    }
                    e.target = candidate
                    e.targetPort = newPort
                    oldTarget.incomingEdges.remove(e)
                    oldTarget.removeUnneeded(nodes)
                }
            }
        }
        return nodes
    }

    /**
     * for all sequential nodes (k,v) if k is an output node and v is an input node the source of k will be connected with the target of v
     * The input nodes will be removed from the nodes list
     * The output nodes will be removed if there exists another output node which will be executed sequentially after this node
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def sequentialize(List<KNode> nodes) {
        val List<KNode> sequentializedOutputs = newArrayList
        val List<KNode> sequentializedInputs = newArrayList
        for (seq : sequentials.filter [
            key.isOutput && value.isInput && !value.isDataAccess && !key.isDataAccess && !key.isReference &&
                nodes.contains(key) && nodes.contains(value)
        ]) {
            if (!seq.key.getWritesAfter(nodes).exists [
                !seq.value.isInputForEquation(it, false) && !getReadsBefore(nodes).exists[seq.key.isSequential(it)]
            ]) {
                seq.value.connectToOutput(seq.key)
                if (!sequentializedInputs.contains(seq.value)) {
                    sequentializedInputs += seq.value
                }
                if (!sequentializedOutputs.contains(seq.key)) {
                    sequentializedOutputs.add(seq.key)
                }
            }
        }
        for (n : sequentializedInputs) {
            nodes.betterRemove(n, null)
        }
        // removes the output nodes if it is not the last output node for the references valued object
        for (n : sequentializedOutputs) {
            if (nodes.filter[isOutput && !isDataAccess && sourceEquals(n)].size > 1) {
                nodes.betterRemove(n, null)
            } else if (alignInputOutputs) {
                n.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::LAST)
            }
        }
        return nodes
    }

    /**
     * for all nodes (k,v) if k is an output node and v is an input node and k and v are associated with the same Value
     * the sources of k will be connected with the targets of v
     * The input nodes will be removed from the nodes list
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def connectInputWithOutput(List<KNode> nodes) {
        for (node : nodes.filter[isInput && !isDataAccess && !isReference].toList.clone) {
            val output = nodes.getOutputNode(node)
            if (output !== null) {
                node.connectToOutput(output)
                nodes.betterRemove(node, output)
            }
        }
        return nodes
    }

    /**
     * for all nodes (k,v) if k and v are input nodes and k and v are associated with the same Value
     * the targets of v will be connected with k and v will be removed from the nodes list
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def combineInputNodes(List<KNode> nodes) {
        for (node : nodes.filter[isInput && !isDataAccess].toList) {
            if (nodes.contains(node)) {
                for (unneeded : nodes.filter [
                    isInput && !isDataAccess && it != node && sourceEquals(node) && !isSequential(node) &&
                        !node.isSequential(it)
                ].toList) {
                    unneeded.redirectOutgoingWires(node)
                    nodes.betterRemove(unneeded, node)
                }
            }
        }
        return nodes
    }

    /**
     * for all nodes (k,v) if k and v are reference nodes and k and v are associated with the same Value and k and v do not have any sequential constraints to each other
     * The ports of v are merged in to k and v will be removed from the nodes list
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def combineReferenceNodes(List<KNode> nodes) {
        for (node : nodes.filter [ n |
            n.isReference && !nodes.exists[isReference && sourceEquals(n) && n.isReferenceSequential(it)]
        ].toList) {
            if (nodes.contains(node)) {
                for (unneeded : nodes.filter [ n |
                    n.isReference && n != node && n.sourceEquals(node) && !n.isReferenceSequential(node) &&
                        !node.isReferenceSequential(n) && !nodes.exists [
                            isReference && sourceEquals(n) && n.isReferenceSequential(it)
                        ]
                ].toList) {
                    unneeded.redirectIncommingWires(node)
                    unneeded.redirectOutgoingWires(node)
                    nodes.betterRemove(unneeded, node)
                }
                node.setProperty(EquationSynthesis.INPUT_FLAG, false)
                node.setProperty(EquationSynthesis.OUTPUT_FLAG, false)
                node.setProperty(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)
                node.setProperty(CoreOptions::ALIGNMENT, Alignment.AUTOMATIC)
            }
        }
        return nodes
    }

    /**
     * for all nodes (k,v) if k and v are data access nodes and k and v are associated with the same Value and k and v do not have any sequential constraints to each other
     * The ports of v are merged in to k and v will be removed from the nodes list
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def combineDataAccessNodes(List<KNode> nodes) {
        // This algorithm only works if the nodes which are more specific are merged first
        // for example the nodes for x[0] should be merged before the nodes for x are merged 
        var list = nodes.filter[isDataAccess].toList.sortSpecific
        for (node : list) {
            if (nodes.contains(node)) {
                for (unneeded : nodes.filter [
                    isDataAccess && it != node && sourceEquals(node) && !isDataArraySequential(node) &&
                        !node.isDataArraySequential(it) && isInput == node.isInput && isOutput == node.isOutput &&
                        !isInputForEquation(node, true) && !node.isInputForEquation(it, true)
                ].toList) {
                    unneeded.redirectIncommingWires(node)
                    unneeded.redirectOutgoingWires(node)
                    node.removeUnneeded(nodes)
                    nodes.betterRemove(unneeded, node)
                }
            }
        }
        // input and output nodes should be combined after input and input or output and output nodes are combined
        if (combineAllDataAccessNodes) {
            for (node : nodes.filter[isDataAccess && lastDataAccess].toList.sortSpecific) {
                if (nodes.contains(node)) {
                    for (unneeded : nodes.filter [
                        isDataAccess && lastDataAccess && it != node && sourceEquals(node) &&
                            !isDataArraySequential(node) && !node.isDataArraySequential(it) &&
                            !isInputForEquation(node, true) && !node.isInputForEquation(it, true)
                    ].toList) {
                        unneeded.redirectIncommingWires(node)
                        unneeded.redirectOutgoingWires(node)
                        node.removeUnneeded(nodes)
                        nodes.betterRemove(unneeded, node)
                    }
                }
            }
        }
        return nodes
    }

    def lastDataAccess(KNode node) {
        return !node.outgoingEdges.exists [
            sourcePort.sourceElement === null && target.sourceEquals(node) && target.isDataAccess
        ]
    }

    /**
     * Does nothing if HIDE_LOCALS is false
     * For a Input or Output node n witch stands for a local Valued Object that is not declared as input or output
     * n will be removed from the nodes list iff this would not lead to unused ports of other nodes which are connected to n
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def hideLocalObjects(List<KNode> nodes) {
        if (!showLocals) {
            // remove input nodes of local declared valued objects which are no inputs
            for (node : nodes.filter [
                isInput && !isDataAccess && isLocalValuedObject &&
                    !(sourceElement as ValuedObjectReference).valuedObject.input
            ].toList) {
                if (!node.isNeeded) {
                    nodes.betterRemove(node, null)
                }
            }
            // remove output nodes of local declared valued objects which are no outputs
            for (node : nodes.filter [
                isOutput && !isDataAccess && isLocalValuedObject &&
                    !(sourceElement as ValuedObjectReference).valuedObject.output
            ].toList) {
                if (!node.isNeeded) {
                    nodes.betterRemove(node, null)
                }
            }
        }
        return nodes
    }

    /**
     * For any node n which is not an input node and no reference or data access node
     * It will be checked if a node k exists which is associated witch the same expression as n
     * If so then the targets of k are connected with n and k will be removed from the nodes list
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def removeDublicates(List<KNode> nodes) {
        for (node : nodes.filter[!isInput && !isReference && !isDataAccess].toList) {
            if (nodes.contains(node)) {
                val unneed = nodes.findIndependentDublicateNode(node, false)
                if (unneed !== null) {
                    unneed.redirectOutgoingWires(node)
                    nodes.betterRemove(unneed, null)
                }
            }
        }
        return nodes
    }

    /**
     * for all nodes (k,v) if k and v are output nodes and k and v are associated with the same Value and k should be sequential before v
     * k will be removed from the nodes list
     * Also unneeded write Ports of reference Nodes are removed if they will be overwritten later
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def removeSequentialWrites(List<KNode> nodes) {
        val List<KNode> candidates = nodes.filter [
            ((isOutput && !isDataAccess) || isReference) && nodes.existsSequentialWrite(it)
        ].toList
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
                            ((isOutput && !isDataAccess) || isReference) && sourceEquals(node) && it != node &&
                                node.isSequential(it) && isReference && incomingEdges.exists [
                                    targetPort.sourceEquals(port)
                                ]
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
                    nodes.betterRemove(node, null)
                }
            } else {
                if (!node.outgoingEdges.exists[!isSequential && !isInstance]) {
                    candidates += node.incomingEdges.map[source]
                    nodes.betterRemove(node, null)
                }
            }
        }
        return nodes
    }

    /**
     * if PRE_CICLES is not enabled
     * For all nodes n which represents a pre operator expression an input node will be found (which was removed by an algorithm before) that represents the expression of the pre
     * n will be connected to the input node and the old input edge will be removed.
     * The input node will be added to the nodes list again
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def resolvePreCicles(List<KNode> nodes) {
        if (!preCicles) {
            for (n : nodes.filter [
                sourceElement instanceof OperatorExpression &&
                    (sourceElement as OperatorExpression).operator == OperatorType.PRE &&
                    !incomingEdges.map[source].exists[isInput && !isDataAccess] && incomingEdges.map[sourcePort].exists [ port |
                        port.edges.map[target].exists [
                            isOutput && !isDataAccess && sourceElement instanceof ValuedObjectReference
                        ]
                    ]
            ].toList) {
                val source = inputNodes.findFirst[sourceEquals((n.sourceElement as OperatorExpression).subExpressions.get(0))].copy
                if(source !== null){
                    nodes += source
                    source.incomingEdges.immutableCopy.forEach[source.incomingEdges.remove(it)]
                    source.outgoingEdges.immutableCopy.forEach[source.outgoingEdges.remove(it)]
                    source.ports.immutableCopy.forEach[p|p.edges.immutableCopy.forEach[p.edges.remove(it)]]
                    val sourcePort = source.findPortById(EquationSynthesis.OUT_PORT)
                    val oldEdges = n.incomingEdges.immutableCopy
                    sourcePort.connectWith(
                        n.incomingEdges.map[targetPort].get(0),
                        source.sourceElement.serializeHR.toString)
                    oldEdges.forEach[betterRemove]
                }
            }
        }
        return nodes
    }

    /**
     * removes edge labels if there is another edge on the same port which has the same label
     * @param nodes A List of Nodes of the graph
     * @returns The given List of nodes without the nodes which are not needed anymore
     */
    private def removeDoubledLabels(List<KNode> nodes) {
        val List<KEdge> edges = newArrayList
        nodes.forEach[edges += outgoingEdges]
        edges.forEach [ e |
            e.labels.immutableCopy.forEach [ l |
                if (edges.exists[it != e && e.sourcePort == sourcePort && labels.exists[text == l.text]]) {
                    e.labels.remove(l)
                }
            ]
        ]
        return nodes
    }

    /**
     * removes all sequential edges witch are part of a cicle
     */
    private def removeSequentialCicles(List<KNode> nodes) {
        var List<KEdge> sequentialEdges = newArrayList
        for (n : nodes) {
            sequentialEdges += n.outgoingEdges.filter[isSequential]
        }
        for (e : sequentialEdges) {
            if (e.target.isInputForEquation(e.source, true)) {
                e.betterRemove
            }
        }
        return nodes
    }

    private def removeUnneededPorts(List<KNode> nodes) {
        for (n : nodes.filter[isReference]) {
            for (p : n.ports.filter[edges.size == 0].toList) {
                p.remove()
                n.ports.remove(p)
            }
        }
        return nodes
    }

    /**
     * @param nodes A List of Nodes of the graph
     * @param node The node to be proved
     * @returns true if node is a write node witch is overwritten by another sequential write node later
     */
    private def existsSequentialWrite(List<KNode> nodes, KNode node) {
        return nodes.exists [
            ((isOutput && !isDataAccess) || isReference) && sourceEquals(node) && it != node && node.isSequential(it)
        ]
    }

    /**
     * @param nodes A List of Nodes of the graph
     * @param node The node to find a duble
     * @dataAccess true if the node is a data access node
     * @returns a KNode which stands for the same equation as node or returns null if no such node exists
     */
    private def findIndependentDublicateNode(List<KNode> nodes, KNode node, boolean dataAccess) {
        for (n : nodes) {
            if (n != node) {
                if (n.sourceEquals(node) && !n.isInputForEquation(node, false) && !node.isInputForEquation(n, false) &&
                    !n.isSequential(node) && !node.isSequential(n) && isDataAccess(n) == dataAccess) {
                    return n
                }
            }
        }
        return null
    }

    /**
     * removes an input node and connects the wires to the wires of the output node
     */
    private def connectToOutput(KNode input, KNode output) {
        for (e : input.outgoingEdges.filter[!isSequential && !isInstance]) {
            var targetPort = e.targetPort
            for (e2 : output.incomingEdges.filter[!isSequential && !isInstance]) {
                var sourcePort = e2.sourcePort
                sourcePort.connectWith(targetPort, e2.source.sourceElement.serializeHR.toString)
            }
        }
    }

    /**
     * redirects all incoming wires of old to target
     */
    private def redirectIncommingWires(KNode old, KNode target) {
        while (old.incomingEdges.size > 0) {
            val e = old.incomingEdges.get(0)
            if (!e.isSequential && !e.isInstance) {
                var targetPort = target.getInputPortWithNumber(0)
                if (target.isDataAccess || target.isReference) {
                    targetPort = target.findPort(e.targetPort)
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

    /**
     * redirects all outgoing wires of old to source
     */
    private def redirectOutgoingWires(KNode old, KNode source) {
        while (old.outgoingEdges.size > 0) {
            val e = old.outgoingEdges.get(0)
            if (!e.isSequential && !e.isInstance) {
                var sourcePort = source.findPortById(EquationSynthesis.OUT_PORT)
                if (source.isDataAccess || source.isReference) {
                    sourcePort = source.findPort(e.sourcePort)
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

    /**
     * removes unneeded edges and nodes
     */
    private def void removeUnneeded(KNode node, List<KNode> nodes) {
        if (node.isInput && node.outgoingEdges.size == 0) {
            val inputs = node.incomingEdges.filter[!isSequential && !isInstance].map[source].toList
            nodes.betterRemove(node, null)
            for (n : inputs) {
                n.removeUnneeded(nodes)
            }
        }
        if (node.isOutput && node.incomingEdges.size == 0) {
            val outputs = node.outgoingEdges.filter[!isSequential && !isInstance].map[target].toList
            nodes.betterRemove(node, null)
            for (n : outputs) {
                n.removeUnneeded(nodes)
            }
        }
        for (e : node.incomingEdges.filter[source.isInput].toList) {
            if (node.incomingEdges.exists [
                it != e && source.sourceEquals(e.source) && sourcePort.sourceEquals(e.sourcePort) &&
                    targetPort.sourceEquals(e.targetPort)
            ]) {
                val source = e.source
                e.betterRemove()
                source.removeUnneeded(nodes)
            }
        }
        for (e : node.incomingEdges.filter[!source.isInput].toList) {
            if (node.incomingEdges.exists [
                it != e && source.sourceEquals(e.source) && sourcePort.sourceEquals(e.sourcePort) &&
                    targetPort.sourceEquals(e.targetPort)
            ]) {
                val source = e.source
                e.betterRemove()
                source.removeUnneeded(nodes)
            }
        }
        for (e : node.outgoingEdges.immutableCopy) {
            if (node.outgoingEdges.exists [
                it != e && target.sourceEquals(e.target) && targetPort.sourceEquals(e.targetPort) &&
                    sourcePort.sourceEquals(e.sourcePort)
            ]) {
                val target = e.target
                e.betterRemove()
                target.removeUnneeded(nodes)
            }
        }
    }

    /**
     * checks if the node can be removed such that no ports of other nodes becomes unused
     */
    private def isNeeded(KNode node) {
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

    /**
     * returns true iff the node is associated with a valued object which is declared inside of the dataflow region
     */
    private def isLocalValuedObject(KNode node) {
        val element = node.sourceElement
        if (element instanceof ValuedObjectReference) {
            return currentRegion.declarations.contains((element as ValuedObjectReference).valuedObject.declaration)
        }
        return false
    }

    /**
     * checks for two reference nodes if they are sequential and use at least one same variable
     */
    private def isReferenceSequential(KNode ref1, KNode ref2) {
        return ref1.isSequential(ref2) && ref1.ports.exists [ p |
            p.sourceElement !== null && ref2.ports.exists[sourceElement !== null && sourceEquals(p)]
        ]
    }

    /**
     * finds an output node for a input node that is not sequential after the input node
     */
    private def getOutputNode(List<KNode> nodes, KNode node) {
        val filtered = nodes.filter [
            isOutput && !isDataAccess && sourceEquals(node) && !node.isSequential(it) &&
                !node.isInputForEquation(it, false)
        ].toList
        if (filtered.size == 0) {
            return null
        }
        return filtered.get(0)
    }

    /**
     * finds a port witch is associated with the same element as e
     */
    private def findPort(KNode node, KGraphElement e) {
        for (port : node.ports) {
            if (port.sourceEquals(e) && (!(e instanceof KPort) || port.portSide == (e as KPort).portSide)) {
                return port
            }
        }
        return null
    }

    /**
     * returns true iff before comes sequential before after
     */
    private def isDataArraySequential(KNode before, KNode after) {
        return before.dataAccessSource !== null && after.dataAccessSource !== null &&
            before.dataAccessSource.isSequential(after.dataAccessSource) && before.ports.exists [ p |
                p.sourceElement !== null && after.ports.exists [
                    sourceElement !== null && p.portSide == portSide && (sourceEquals(p) ||
                        (sourceElement instanceof ValuedObjectReference &&
                            p.sourceElement instanceof ValuedObjectReference &&
                            (sourceElement as ValuedObjectReference).maybeEquals(
                                p.sourceElement as ValuedObjectReference)))
                ]
            ]
    }

}
