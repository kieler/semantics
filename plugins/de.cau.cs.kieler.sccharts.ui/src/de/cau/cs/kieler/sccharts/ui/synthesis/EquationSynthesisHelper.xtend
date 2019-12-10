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
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import org.eclipse.elk.alg.layered.options.LayeredOptions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.EquationStyles
import de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import java.util.Comparator
import de.cau.cs.kieler.kexpressions.eval.PartialExpressionEvaluator
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.TransitionStyles

/**
 * @author kolja
 * 
 */
@ViewSynthesisShared
class EquationSynthesisHelper {

    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension KExpressionsCompareExtensions
    @Inject extension KEdgeExtensions
    @Inject extension EquationStyles
    @Inject extension KLabelExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension TransitionStyles

    protected val List<Pair<KNode, KNode>> sequentials = newArrayList
    protected var alignInputOutputs = false
    protected var showLocals = false
    protected var preCicles = false
    protected var showWireLabels = false
    protected var combineAllDataAccessNodes = false
    protected var showArrows = false
    protected var DataflowRegion currentRegion = null

    /**
     * removes a node from the list and from the graph
     */
    protected def betterRemove(List<KNode> nodes, KNode node, KNode sequentialReplacement) {
        if( sequentialReplacement !== null ){
            sequentials.immutableCopy.forEach[seq, i| 
                if( seq.key == node && seq.value != sequentialReplacement ){
                    sequentials.set(i, new Pair(sequentialReplacement, seq.value))
                }
                if( seq.value == node && seq.key != sequentialReplacement ){
                    sequentials.set(i, new Pair(seq.key, sequentialReplacement))
                }
            ]
        }
        while (node.incomingEdges !== null && node.incomingEdges.size > 0) {
            node.incomingEdges.get(0).betterRemove
        }
        while (node.outgoingEdges !== null && node.outgoingEdges.size > 0) {
            node.outgoingEdges.get(0).betterRemove
        }
        node.remove
        nodes.remove(node)
    }

    /**
     * removes the edge and the ports if they are not needed anymore
     */
    protected def void betterRemove(KEdge e) {
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

    protected def getId(KLabeledGraphElement node) {
        node.eContents?.filter(KIdentifier)?.head?.id
    }

    protected def setId(KLabeledGraphElement node, String id) {
        node.getData(KIdentifier).id = id
        node
    }

    protected def KLabel getLabel(KNode node) {
        node.eContents.filter(KLabel).head
    }

    protected def PortSide getPortSide(KPort port) {
        port.getProperty(CoreOptions::PORT_SIDE)
    }

    protected def findPortById(KNode node, String id) {
        for (p : node.ports) {
            if (p.id == id) {
                return p
            }
        }
        return null
    }

    protected def isInput(KNode node) {
        node.getProperty(EquationSynthesis.INPUT_FLAG) as boolean
    }

    protected def isOutput(KNode node) {
        node.getProperty(EquationSynthesis.OUTPUT_FLAG) as boolean
    }

    protected def isReference(KNode node) {
        return node.getProperty(EquationSynthesis.REFERENCE_NODE) as boolean
    }

    /**
     * given two KGraph elements the return value is true iff the elements are associated with the same source element
     * in case of associations with ValuedObjectReferences only the ValuedObject needs to be equal and so on
     */
    protected def sourceEquals(KGraphElement a, KGraphElement b) {
        if (a.sourceElement instanceof Expression && b.sourceElement instanceof Expression) {
            return (a.sourceElement as Expression).equals2(b.sourceElement as Expression)
        }
        return a.sourceElement == b.sourceElement
    }

    /**
     * given two ValuedObjectReferences the return value is true iff the associated indices could be evaluated to the same values
     * example: X[i + 1] is not equal to X[i - 1]
     * example2: X[i + 1] is equal to X[j + 1]
     */
    protected def boolean maybeEquals(ValuedObjectReference a, ValuedObjectReference b) {
        for (var i = 0; i < Math.min(a.indices.size, b.indices.size); i++) {
            var eval = new PartialExpressionEvaluator
            var expr1 = eval.evaluate(a.indices.get(i))
            var expr2 = eval.evaluate(b.indices.get(i))
            if (!expr1.equals2(expr2) && expr1.getAllReferences.size == 0 && expr2.getAllReferences.size == 0) {
                return false
            }
        }
        return true
    }

    protected def isSequential(KEdge edge) {
        edge.getProperty(EquationSynthesis.SEQUENTIAL_EDGE) as boolean
    }

    protected def isInstance(KEdge edge) {
        edge.getProperty(EquationSynthesis.INSTANCE_EDGE) as boolean
    }

    protected def isDataAccess(KNode node) {
        node.getProperty(EquationSynthesis.DATA_ACCESS_FLAG) as boolean
    }

    protected def getSourceElement(KGraphElement node) {
        return node.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)
    }

    protected def removeSourceElement(KGraphElement node) {
        node.setProperty(KlighdInternalProperties.MODEL_ELEMEMT, null)
    }

    /**
     * @returns true iff input is connected to output
     */
    protected def isInputForEquation(KNode input, KNode output, boolean sequentials) {
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
            if (!(current.sourceElement instanceof OperatorExpression) ||
                (current.sourceElement as OperatorExpression).operator != OperatorType.PRE) {
                for (e : current.outgoingEdges.filter[!isInstance && (!sequentials || !isSequential)]) {
                    if (!visited.exists[it == e.target] && !queue.exists[it == e.target]) {
                        queue.add(e.target)
                    }
                }
            }
        }
        return false
    }

    /**
     * @returns true iff the last sub reference has indices
     */
    protected def boolean lastSubReferenceIsArray(ValuedObjectReference reference) {
        if (reference.subReference !== null) {
            return reference.subReference.lastSubReferenceIsArray
        }
        return reference.indices.size > 0
    }

    /**
     * given a reference with sub references and indices
     * a copied reference is returned without the last index or sub reference
     */
    protected def ValuedObjectReference removeLastReference(ValuedObjectReference reference) {
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

    /**
     * @returns the label of the last index of the last sub reference or the label of the last sub reference
     */
    protected def String lastSubReferenceLabel(ValuedObjectReference reference) {
        if (reference.subReference !== null) {
            return reference.subReference.lastSubReferenceLabel
        }
        if (reference.indices.size > 0) {
            return "[" + reference.indices.get(reference.indices.size - 1).serializeHR.toString + "]"
        }
        return reference.serializeHR.toString
    }

    /**
     * @returns the number-th input port of a node and creates it if it doesn't exist
     */
    protected def KPort getInputPortWithNumber(KNode node, int number) {
        var maxIndex = -1
        var KPort maxPort = null
        for (p : node.ports) {
            val id = p.id
            if (id !== null) {
                if (id.startsWith(EquationSynthesis.PORT_IN_PREFIX)) {
                    try {
                        val n = Integer.parseInt(id.substring(2))
                        if(n == number) return p
                        if (n > maxIndex) {
                            maxIndex = n
                            maxPort = p
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
        }

        if(maxPort === null) return null

        var KPort result = null
        for (pi : (maxIndex + 1) .. number) {
            result = maxPort.copy
            result.id = (EquationSynthesis.PORT_IN_PREFIX + pi)
            node.ports.add(0, result)
        }
        return result
    }

    /**
     * connects two ports with a wire
     */
    protected def connectWith(KPort source, KPort target, String label) {
        if (source === null || target === null) {
            return
        }
        val edge = createEdge
        DiagramSyntheses.setLayoutOption(edge, LayeredOptions.INSIDE_SELF_LOOPS_YO, true)
        edge.source = source.node
        edge.sourcePort = source
        edge.target = target.node
        edge.targetPort = target
        if (source.node.hasProperty(EquationSynthesis.DATA_ARRAY_FLAG) ||
            target.node.hasProperty(EquationSynthesis.DATA_ARRAY_FLAG)) {
            edge.addWireBusFigure
        } else {
            edge.addWireFigure
        }
        if (showWireLabels && (!source.node.isInput || source.node.isDataAccess) && label !== null) {
            edge.createLabel.configureTailEdgeLabel(label, 5, KlighdConstants::DEFAULT_FONT_NAME)
        }
        if (showArrows) {
            edge.addDefaultDecorator
        }
    }

    protected def isSequential(KNode before, KNode after) {
        if (before.isInput && after.isInput) {
            return sequentials.exists [
                key == before && sequentials.filter[value == after].map[key].toList.contains(value)
            ]
        }
        return sequentials.exists[key == before && value == after]
    }

    /**
     * for a data access node the node which references to the referenced array or class variable is returned
     */
    protected def getDataAccessSource(KNode access) {
        var source = access
        while (source !== null && source.isDataAccess) {
            val current = source
            source = source.ports.findFirst [
                sourceElement === null && edges.exists [
                    (current.isOutput && current.outgoingEdges.contains(it)) ||
                        (current.isInput && current.incomingEdges.contains(it))
                ]
            ]?.edges?.map [
                if(it.source !== current) it.source else target
            ]?.head
        }
        return source
    }

    /**
     * the list will be sorted such that accesses of the same variable that are more specific comes first. 
     * for example x[0][1] will be before x[0]
     */
    protected def sortSpecific(List<KNode> dataAccesses) {
        dataAccesses.sort(new Comparator<KNode>() {

            private def int compareReference(ValuedObjectReference r1, ValuedObjectReference r2) {
                if (r1.valuedObject != r2.valuedObject) {
                    return 0
                }
                if (r1.indices !== null && r2.indices !== null) {
                    for (var i = 0; i < Math.max(r1.indices.size, r2.indices.size); i++) {
                        var Expression e1 = if(r1.indices.size > i) r1.indices.get(i) else null
                        var Expression e2 = if(r2.indices.size > i) r2.indices.get(i) else null
                        if (e1 !== null && e2 !== null) {
                            if (!e1.equals2(e2)) {
                                return 0
                            }
                        } else {
                            if (e1 !== null) {
                                return -1
                            }
                            if (e2 !== null) {
                                return 1
                            }
                        }
                    }
                } else {
                    if (r1.indices !== null && r1.indices.size > 0)
                        return -1
                    if (r2.indices !== null && r2.indices.size > 0)
                        return 1
                }
                if (r1.subReference !== null && r2.subReference !== null) {
                    return r1.subReference.compareReference(r2.subReference)
                }
                if (r1.subReference !== null) {
                    return -1
                }
                if (r2.subReference !== null) {
                    return 1
                }
                return 0
            }

            override compare(KNode o1, KNode o2) {
                if (o1.sourceElement instanceof ValuedObjectReference &&
                    o2.sourceElement instanceof ValuedObjectReference) {
                    return (o1.sourceElement as ValuedObjectReference).compareReference(
                        o2.sourceElement as ValuedObjectReference)
                }
                return 0
            }

        })
        return dataAccesses
    }

    protected def getWritesAfter(KNode node, List<KNode> nodes) {
        nodes.filter[it != node && isOutput && sourceEquals(node) && node.isSequential(it) && !isDataAccess]
    }

    protected def getReadsAfter(KNode node, List<KNode> nodes) {
        nodes.filter[it != node && isInput && sourceEquals(node) && node.isSequential(it) && !isDataAccess]
    }

    protected def getReadsBefore(KNode node, List<KNode> nodes) {
        nodes.filter[it != node && isInput && sourceEquals(node) && it.isSequential(node) && !isDataAccess]
    }
}
