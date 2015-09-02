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
package de.cau.cs.kieler.sccharts.klighd.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.DiagramProperties
import de.cau.cs.kieler.sccharts.klighd.hooks.SCChartsSynthesisHooks
import java.util.LinkedHashSet
import java.util.List
import java.util.logging.Logger

/**
 * Main diagram synthesis for SCCharts.
 * 
 * @author als
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
@ViewSynthesisShared
class SCChartsSynthesis extends AbstractDiagramSynthesis<Scope> implements GeneralSysthesisOptions {
    
    // -------------------------------------------------------------------------
    // Extensions 
    @Inject 
    extension KNodeExtensions
    
    // -------------------------------------------------------------------------
    // SubSyntheses
    @Inject
    StateSynthesis stateSynthesis
    
    @Inject
    ControlflowRegionSynthesis controlflowSynthesis    
    
    @Inject
    DataflowRegionSynthesis dataflowSynthesis  
      
    @Inject
    TransitionSynthesis transitionSynthesis
    
    // -------------------------------------------------------------------------
    // Hooks
    @Inject
    SCChartsSynthesisHooks hooks  
    
    // -------------------------------------------------------------------------
    // Fields
    val logger = Logger.getLogger(this.class.name);
       
    // -------------------------------------------------------------------------
    // Sidebar Options

    override public getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet();
        // Add general options
        options.addAll(USE_KLAY);//USE_ADAPTIVEZOOM
        // Add options of subsyntheses
        options.addAll(stateSynthesis.displayedSynthesisOptions);
        options.addAll(transitionSynthesis.displayedSynthesisOptions);
        options.addAll(controlflowSynthesis.displayedSynthesisOptions);
        options.addAll(dataflowSynthesis.displayedSynthesisOptions);
        // Add options of hooks
        hooks.allHooks.forEach[options.addAll(displayedSynthesisOptions)];
        return options.toList;
    }

    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[it.name])
            ,new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 150))
        );
    }
        
    // -------------------------------------------------------------------------
    // The main entry transform function   
    override transform(Scope root) {
        val startTime = System.currentTimeMillis;
        
        val rootNode = createNode();
        
        // usedContext.setProperty(KlighdProperties.EDGES_FIRST, true); //Why?
        
        // Configure synthesis options via annotation
        // TODO Check avaliable synthesis option and activate, requires id in options
//                for (Annotation a : root.annotations) {
//                    if (a.name.equals(GLOBALBWOPTION)) {
//                        globalBWOption = true;
//                    }
//                }

        // FIXME: ONLY for Debug
        val properties = new KlighdSynthesisProperties();
        properties.copyProperties(usedContext);
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, "de.cau.cs.kieler.sccharts.klighd.DeprecatedSCChartsSynthesis");
        rootNode.children += LightDiagramServices::translateModel(root, usedContext, properties).children;
        
        hooks.invokeStart(root, rootNode);

        if (root instanceof State) {
            rootNode.children += stateSynthesis.transform(root);
        } else if (root instanceof ControlflowRegion) {
            //Adding all children to the root node will hide the graphical representation of the region itself.
            rootNode.children += controlflowSynthesis.transform(root).children;
        }
        
        // Add tracking adapter to allow access to source model associations
        val trackingAdapter = new SourceModelTrackingAdapter();
        rootNode.setLayoutOption(DiagramProperties::MODEL_TRACKER, trackingAdapter);
        rootNode.eAdapters.add(trackingAdapter);
        
        hooks.invokeFinish(root, rootNode);

        // Log elapsed time
        logger.info(
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
