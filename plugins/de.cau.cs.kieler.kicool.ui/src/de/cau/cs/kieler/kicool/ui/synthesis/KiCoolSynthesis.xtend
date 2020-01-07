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
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.kicool.System
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.alg.layered.options.NodePlacementStrategy
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.elk.core.math.ElkPadding
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import org.eclipse.elk.alg.layered.options.LayeringStrategy
import org.eclipse.elk.alg.layered.options.FixedAlignment
import de.cau.cs.kieler.kicool.ui.synthesis.styles.SkinSelector
import de.cau.cs.kieler.kgraph.text.KGraphStandaloneSetup
import org.eclipse.elk.alg.layered.options.WrappingStrategy
import org.eclipse.elk.alg.layered.options.GraphCompactionStrategy
import org.eclipse.elk.alg.layered.options.ConstraintCalculationStrategy
import de.cau.cs.kieler.klighd.SynthesisOption

import static extension de.cau.cs.kieler.klighd.kgraph.util.KGraphIterators.*
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectNothing
import com.google.inject.Injector

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
    
    public static final SynthesisOption FLATTEN_SYSTEM = SynthesisOption.createCheckOption("Flatten System", false)
    public static final SynthesisOption ON_OFF_BUTTONS = SynthesisOption.createCheckOption("On Off Buttons", false)
    
    override transform(System model) {
        onOffButtons = ON_OFF_BUTTONS.booleanValue
        val rootNode = model.createNode
        
        rootNode.setLayoutOption(CoreOptions::ALGORITHM, "org.eclipse.elk.layered");
        rootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction::RIGHT);
        rootNode.setLayoutOption(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy::BRANDES_KOEPF)
        rootNode.setLayoutOption(LayeredOptions::NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
//        rootNode.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 10d);
        rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 12d)
        rootNode.setLayoutOption(CoreOptions::PADDING, new ElkPadding(8d))
        rootNode.setLayoutOption(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)
        rootNode.setLayoutOption(LayeredOptions::WRAPPING_STRATEGY, WrappingStrategy.SINGLE_EDGE)
        rootNode.setLayoutOption(LayeredOptions::COMPACTION_POST_COMPACTION_STRATEGY, GraphCompactionStrategy.LEFT)
        rootNode.setLayoutOption(LayeredOptions::COMPACTION_POST_COMPACTION_CONSTRAINTS, ConstraintCalculationStrategy.QUADRATIC)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE, 5.0)
        rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE, 2.0)
        rootNode.setLayoutOption(LayeredOptions::WRAPPING_ADDITIONAL_EDGE_SPACING, 0.0)

        // Workaround until we use the next version of ELK        
        // val size = usedContext.getProperty(KlighdOptions.VIEWER).getControl.getSize
//      val aspectRatio = size.x as double / size.y * 2
//        rootNode.setLayoutOption(LayeredOptions::ASPECT_RATIO, 10.0) 
        rootNode.setLayoutOption(LayeredOptions::WRAPPING_CORRECTION_FACTOR, 1.4)
        
        rootNode.addRectangle => [
            addAction(Trigger::SINGLECLICK, SelectNothing.ID)
        ]
        
        val source = sourceNode
        val processorNodes = model.processors.transform()
        val nodes = processorNodes.head.children
        source.sourceConnect(nodes.head)
        nodes += source

        rootNode.children += nodes 
        
        if (FLATTEN_SYSTEM.booleanValue) rootNode.flattenHierarchy
        
        rootNode
    }
        
    public static val Injector KGTInjector = new KGraphStandaloneSetup().createInjectorAndDoEMFRegistration
    
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
                    node.incomingEdges.immutableCopy.forEach[target = head]
                    node.outgoingEdges.immutableCopy.forEach[tail.outgoingEdges.add(it)]
                    // Move
                    parent.children.addAll(node.children)
                    parent.children.remove(node)
                }
            }
        }
    }    
    
    def static getKGTFromBundle(String bundleId, String resourceLocation) {
        return getKGTFromBundle(bundleId, resourceLocation, SkinSelector.skinPrefix)
    }
    
}
