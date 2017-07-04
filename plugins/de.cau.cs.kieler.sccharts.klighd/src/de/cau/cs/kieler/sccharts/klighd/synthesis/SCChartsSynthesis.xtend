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
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.SCChartsDiagramProperties
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHooks
import java.util.LinkedHashSet
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.IViewPart
import org.eclipse.ui.PlatformUI

import static de.cau.cs.kieler.sccharts.klighd.synthesis.GeneralSynthesisOptions.*

/**
 * Main diagram synthesis for SCCharts.
 * 
 * @author als
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
@ViewSynthesisShared
class SCChartsSynthesis extends AbstractDiagramSynthesis<Scope> {

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
    SynthesisHooks hooks  
    
    // -------------------------------------------------------------------------
    // Fields
    public val ID = "de.cau.cs.kieler.sccharts.klighd.synthesis.SCChartsSynthesis"
       
    // -------------------------------------------------------------------------
    // Sidebar Options
    
    override getDisplayedActions() {
        return newLinkedList => [ list |
            hooks.allHooks.forEach[list.addAll(getDisplayedActions)];
        ]
    }

    override getDisplayedSynthesisOptions() {
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
        
        // Add categories options
        options.addAll(APPEARANCE, DEBUGGING, LAYOUT)
        
        return options.toList;
    }

//    override getDisplayedLayoutOptions() {
//        return newLinkedList(
//            specifyLayoutOption(CoreOptions::DIRECTION, #[Direction::UNDEFINED, Direction::RIGHT, Direction::DOWN]),
//            specifyLayoutOption(CoreOptions::SPACING_NODE, newArrayList(0, 150))
//        );
//    }
           
    // -------------------------------------------------------------------------
    // The main entry transform function   
    override transform(Scope root) {
        val startTime = System.currentTimeMillis;
        
        val rootNode = createNode();
                
        //START
        hooks.invokeStart(root, rootNode);
        
        // If dot is used draw edges first to prevent overlapping with states when layout is bad
        usedContext.setProperty(KlighdProperties.EDGES_FIRST, !USE_KLAY.booleanValue);

        if (root instanceof State) {
            rootNode.children += stateSynthesis.transform(root);
        } else if (root instanceof ControlflowRegion) {
            //Adding all children to the root node will hide the graphical representation of the region itself.
            rootNode.children += controlflowSynthesis.transform(root).children;
        }
        
        // Add tracking adapter to allow access to source model associations
        val trackingAdapter = new SourceModelTrackingAdapter();
        rootNode.setLayoutOption(SCChartsDiagramProperties::MODEL_TRACKER, trackingAdapter);
        // Since the root node will node use to display the diagram (SimpleUpdateStrategy) the tracker must be set on the children.
        rootNode.children.forEach[eAdapters.add(trackingAdapter)]
        
        hooks.invokeFinish(root, rootNode);

        // Log elapsed time to status line of DiagramView
        val message = "SCCharts synthesis transformed model " + (root.label ?: root.id) + " in " +
                ((System.currentTimeMillis - startTime) as float / 1000) + "s."
        val view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(DiagramView.ID);
        if(view != null) {
            view.setStatusBarMessage(message)
        }
		
        return rootNode;
    }

    // -------------------------------------------------------------------------
    // Increase Visibility of needed protected inherited methods
    
    override getUsedContext() {
        return super.usedContext;
    }
    
    private def void setStatusBarMessage(IViewPart view, String message) {
        val bars = view.getViewSite().getActionBars();
        if(bars != null) {
            val statusLineManager = bars.getStatusLineManager()
            // Run in UI thread
            Display.getDefault().asyncExec(new Runnable() {
                override void run() {
                    statusLineManager.message = message
                }
            });
        }
    }
}
