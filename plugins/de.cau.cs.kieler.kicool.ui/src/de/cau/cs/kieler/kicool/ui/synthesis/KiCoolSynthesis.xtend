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
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.kicool.System
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.alg.layered.p4nodes.NodePlacementStrategy
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.osgi.framework.Bundle
import org.eclipse.core.runtime.Platform
import java.net.URL
import org.eclipse.core.runtime.FileLocator
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.elk.graph.KNode
import org.eclipse.elk.core.util.ElkUtil

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
    @Inject extension AnnotationsExtensions
    @Inject extension ProcessorSynthesis
    @Inject extension SourceSynthesis
    
    override transform(System model) {
        val rootNode = model.createNode
        
        rootNode.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered");
        rootNode.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        rootNode.addLayoutParam(CoreOptions::DIRECTION, Direction::RIGHT);
        rootNode.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy::BRANDES_KOEPF);
        rootNode.setLayoutOption(CoreOptions::SPACING_NODE, 20f);
        rootNode.setLayoutOption(CoreOptions::SPACING_BORDER, 8f);
        
        val source = sourceNode
        val nodes = model.processors.transform
        source.sourceConnect(nodes.head)
        nodes += source

        rootNode.children += nodes 
        
        rootNode
    }
    
    protected def static getKGTFromBundle(String bundleId, String resourceLocation) {
        val Bundle bundle = Platform.getBundle(bundleId)
        val URL fileURL = bundle.getEntry(resourceLocation)
        val absFile = FileLocator.resolve(fileURL)
        val newURI = URI.createFileURI(absFile.getFile)
        val provider = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(newURI)
        val newResourceSet = provider.get(XtextResourceSet)
        newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
        val res = newResourceSet.createResource(newURI)
        try {
            res.load(newResourceSet.loadOptions)
            val node = (res.getContents().get(0) as KNode).children.head
            return node
        } catch (Exception e) {
        }         
        return ElkUtil::createInitializedNode
    }    
    
}