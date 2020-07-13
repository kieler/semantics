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
package de.cau.cs.kieler.kicool.ui.synthesis

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kgraph.text.KGraphStandaloneSetup
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectNothing
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import org.eclipse.elk.alg.layered.options.ConstraintCalculationStrategy
import org.eclipse.elk.alg.layered.options.FixedAlignment
import org.eclipse.elk.alg.layered.options.GraphCompactionStrategy
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.LayeringStrategy
import org.eclipse.elk.alg.layered.options.NodePlacementStrategy
import org.eclipse.elk.alg.layered.options.WrappingStrategy
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

import static extension de.cau.cs.kieler.klighd.kgraph.util.KGraphIterators.*

/**
 * Main diagram synthesis for KiCool.
 * 
 * @author ssm
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class KiCoolSynthesis extends AbstractDiagramSynthesis<System> {

    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension ProcessorSynthesis
    @Inject extension SourceSynthesis

    public static final SynthesisOption FLATTEN_SYSTEM = SynthesisOption.createCheckOption(KiCoolSynthesis, "Flatten System", false)
    public static final SynthesisOption ON_OFF_BUTTONS = SynthesisOption.createCheckOption(KiCoolSynthesis, "On Off Buttons", false)
    
    override transform(System model) {
        onOffButtons = ON_OFF_BUTTONS.booleanValue
        val rootNode = model.createNode

        rootNode.configureBasicLayout()

        rootNode.addRectangle => [
            addAction(Trigger::SINGLECLICK, SelectNothing.ID)
        ]
        
        // Workaround to propagate aspectratio
        val size = usedContext.viewer?.control?.size
        if (size !== null) {
            // scale width down in consideration of other nodes in the chain
            defaultProcessGroupAspectRatio = ((size.x as double) * 0.8) / (size.y)
        }

        val source = sourceNode
        val processorNodes = model.processors.transform()
        val nodes = processorNodes.head.children
        source.sourceConnect(nodes.head)
        nodes += source

        rootNode.children += nodes

        if(FLATTEN_SYSTEM.booleanValue) {
            rootNode.flattenHierarchy
        }
        rootNode
    }
    
    /** Used for Root node and processor groups!!! */
    def static configureBasicLayout(KNode node) {
        node.setProperty(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID);
        node.setProperty(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        node.setProperty(CoreOptions::DIRECTION, Direction::RIGHT);
        node.setProperty(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy::BRANDES_KOEPF)
        node.setProperty(LayeredOptions::NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
        node.setProperty(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)
        node.setProperty(LayeredOptions::WRAPPING_STRATEGY, WrappingStrategy.SINGLE_EDGE)
        node.setProperty(LayeredOptions::WRAPPING_ADDITIONAL_EDGE_SPACING, 0.0)
        node.setProperty(LayeredOptions::WRAPPING_CORRECTION_FACTOR, 1.4)
        node.setProperty(LayeredOptions::COMPACTION_POST_COMPACTION_STRATEGY, GraphCompactionStrategy.LEFT)
        node.setProperty(LayeredOptions::COMPACTION_POST_COMPACTION_CONSTRAINTS, ConstraintCalculationStrategy.QUADRATIC)
        node.setProperty(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 12d)
        node.setProperty(LayeredOptions::SPACING_EDGE_NODE, 5.0)
        node.setProperty(LayeredOptions::SPACING_NODE_NODE, 2.0)
    }
    public static val Injector KGTInjector = new KGraphStandaloneSetup().createInjectorAndDoEMFRegistration
    
    def static doesKGTExist(String bundleId, String resourceLocation, String skinPrefix) {
        val newURI = URI.createPlatformPluginURI("/" + bundleId + "/" + skinPrefix + resourceLocation, true)
        val newResourceSet = KGTInjector.getInstance(XtextResourceSet)
        newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
        val res = newResourceSet.createResource(newURI)
        try {
            res.load(newResourceSet.loadOptions)
            (res.getContents().get(0) as KNode).children.head
            return true
        } catch (Exception e) {
            return false
        }
    }
    
    /**
     * Load a KGT from a bundle.
     */
    def static getKGTFromBundle(String bundleId, String resourceLocation, String skinPrefix) {
        val newURI = URI.createPlatformPluginURI("/" + bundleId + "/" + skinPrefix + resourceLocation, true)
        val newResourceSet = KGTInjector.getInstance(XtextResourceSet)
        newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
        val res = newResourceSet.createResource(newURI)
        try {
            res.load(newResourceSet.loadOptions)
            val node = (res.getContents().get(0) as KNode).children.head
            return node
        } catch (Exception e) {
            e.printStackTrace
        }
        return KGraphUtil::createInitializedNode
    }

    def void flattenHierarchy(KNode rootNode) {
        for (node : rootNode.getKNodeIterator(false).toList) {
            if (!node.children.empty && node.getProperty(ProcessorSynthesis.GROUP_NODE)) {
                val parent = node.parent
                val head = node.children.findFirst[it.incomingEdges.empty]
                val tail = node.children.findFirst[it.outgoingEdges.empty]
                if (parent !== null && head !== null && tail !== null) {
                    // Reconnect
                    node.incomingEdges.immutableCopy.forEach[
                        target = head
                        targetPort = head.ports.head // Assuming the first port is left
                    ]
                    node.outgoingEdges.immutableCopy.forEach[
                        source = tail
                        sourcePort = tail.ports.last // Assuming the last port is right
                    ]
                    // Move
                    parent.children.addAll(node.children)
                    parent.children.remove(node)
                }
            }
        }
    }

}
