/*  * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.AbstractSCChartsSynthesis
import de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsDiagramProperties
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHooks
import java.util.LinkedHashSet

import static de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions.*
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Scope diagram synthesis for SCCharts
 * This class is still important for resolving referenced scopes.
 * 
 * @author als ssm
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
@ViewSynthesisShared
class ScopeSynthesis extends AbstractSCChartsSynthesis<Scope> {

    @Inject extension KNodeExtensionsReplacement
    @Inject StateSynthesis stateSynthesis
    @Inject DataflowRegionSynthesis dataflowSynthesis  
        
    @Inject SynthesisHooks hooks  

    override getDisplayedActions() {
        return newLinkedList => [ list |
            hooks.allHooks.forEach[list.addAll(getDisplayedActions)];
        ]
    }

    @Accessors private var String skinPath = ""
       
    override getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet()
        
        // Add categories options
        options.addAll(APPEARANCE, DATAFLOW, LAYOUT, DEBUGGING)
        options.add(USE_KLAY)
        options.addAll(dataflowSynthesis.displayedSynthesisOptions)
        
        // Add options of hooks
        hooks.allHooks.forEach[options.addAll(displayedSynthesisOptions)]
        
        return options.toList
    }

    override transform(Scope root) {
        
        val rootNode = createNode
                
        hooks.invokeStart(root, rootNode)
        
        usedContext.setProperty(KlighdProperties.EDGES_FIRST, !USE_KLAY.booleanValue)
        
        if (root instanceof State) {
            rootNode.children += stateSynthesis.transform(root);
        } else if (root instanceof ControlflowRegion) {
            // not implemented yet
        }
        
        // Add tracking adapter to allow access to source model associations
        val trackingAdapter = new SourceModelTrackingAdapter();
        rootNode.setLayoutOption(SCChartsDiagramProperties::MODEL_TRACKER, trackingAdapter);
        // Since the root node will node use to display the diagram (SimpleUpdateStrategy) the tracker must be set on the children.
        rootNode.children.forEach[eAdapters.add(trackingAdapter)]
        
        hooks.invokeFinish(root, rootNode)

        return rootNode
    }
   
}
