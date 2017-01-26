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
package de.cau.cs.kieler.sccharts.klighd.srtg.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.core.model.Log
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.AbstractSCChartsSynthesis
import de.cau.cs.kieler.sccharts.klighd.SCChartsDiagramProperties
import java.util.LinkedHashSet

import static de.cau.cs.kieler.sccharts.klighd.synthesis.GeneralSynthesisOptions.*

/**
 * Main diagram synthesis for SCCharts.
 * 
 * @author ssm
 * @kieler.design 2017-01-18 proposed 
 * @kieler.rating 2017-01-18 proposed 
 */
@ViewSynthesisShared
class SRTGSynthesis extends AbstractSCChartsSynthesis<Scope> {

    @Inject 
    extension KNodeExtensions
    
    // -------------------------------------------------------------------------
    // SubSyntheses
    @Inject
    SRTGStateSynthesis stateSynthesis
    
    @Inject
    SRTGControlflowRegionSynthesis controlflowSynthesis    
    
    @Inject
    SRTGTransitionSynthesis transitionSynthesis
        
    // -------------------------------------------------------------------------
    // Fields
    public val ID = "de.cau.cs.kieler.sccharts.klighd.srtg.synthesis.SRTGSynthesis"
       
    // -------------------------------------------------------------------------
    // Sidebar Options

    override getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet();
        
        // Add general options
        options.addAll(USE_KLAY);//USE_ADAPTIVEZOOM
        
        // Add options of subsyntheses
        options.addAll(stateSynthesis.displayedSynthesisOptions);
        options.addAll(transitionSynthesis.displayedSynthesisOptions);
        options.addAll(controlflowSynthesis.displayedSynthesisOptions);
        
        // Add categories options
        options.addAll(APPEARANCE, DEBUGGING)
        
        return options.toList;
    }

    // -------------------------------------------------------------------------
    // The main entry transform function   
    override transform(Scope root) {
        val startTime = System.currentTimeMillis;
        
        val rootNode = createNode();
                
        // If dot is used draw edges first to prevent overlapping with states when layout is bad
        usedContext.setProperty(KlighdProperties.EDGES_FIRST, !USE_KLAY.booleanValue);

        if (root instanceof State) {
            rootNode.children += stateSynthesis.transform(root);
        } else if (root instanceof ControlflowRegion) {
            rootNode.children += controlflowSynthesis.transform(root).children;
        }
        
        // Add tracking adapter to allow access to source model associations
        val trackingAdapter = new SourceModelTrackingAdapter();
        rootNode.setLayoutOption(SCChartsDiagramProperties::MODEL_TRACKER, trackingAdapter);
        // Since the root node will node use to display the diagram (SimpleUpdateStrategy) the tracker must be set on the children.
        rootNode.children.forEach[eAdapters.add(trackingAdapter)]
        
        // Log elapsed time
        Log.log(
            "SCCharts synthesis transformed model " + (root.label ?: root.id) + " in " +
                ((System.currentTimeMillis - startTime) as float / 1000) + "s.");
		
        return rootNode;
    }

    // -------------------------------------------------------------------------
    // Increase Visibility of needed protected inherited methods
    
    override getUsedContext() {
        return super.usedContext;
    }
    
}
