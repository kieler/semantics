/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KGridPlacement
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisActionHook
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import java.util.List
import de.cau.cs.kieler.sccharts.Action
import org.eclipse.elk.core.options.CoreOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.KNodeExtensionsReplacement
import org.eclipse.elk.core.math.ElkPadding
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.sccharts.ui.synthesis.DataflowRegionSynthesis

/**
 * Shows or hides state actions.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class ActionsAsDataflowHook extends SynthesisHook {

    @Inject extension AnnotationsExtensions
    @Inject extension StateStyles
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KNodeExtensionsReplacement
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension DataflowRegionSynthesis

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.StateActionsHook"
    /** The related synthesis option */
    
    public static val SynthesisOption SHOW_ACTIONS_AS_DATAFLOW = SynthesisOption.createCheckOption("Actions as Dataflow", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)

    override getDisplayedSynthesisOptions() {
//        return newLinkedList(SHOW_ACTIONS_AS_DATAFLOW)
    }

    override processState(State state, KNode node) {
//        val container = node.contentContainer
//        val actionContainer = container?.getProperty(StateStyles::ACTIONS_CONTAINER)
//
//        if (actionContainer === null) return;
//        
        // Hide actions
//        if (SHOW_ACTIONS_AS_DATAFLOW.booleanValue) {
//            container.children.remove(actionContainer)
//            
//            val actions = <Action> newArrayList(state.actions)
//            
//            node.addActionsAsDataflow(actions, state)
//        }
    }
    
    protected def void addActionsAsDataflow(KNode node, List<Action> actions, State parentState) {
        
        val container = "dfDeclarations".getNode(parentState) 
        container.addRectangle() => [
                invisible = true;
        ]
        container.setLayoutOption(CoreOptions::ALGORITHM, "org.eclipse.elk.box");
        container.setLayoutOption(CoreOptions::EXPAND_NODES, true);
        container.setLayoutOption(CoreOptions::PADDING, new ElkPadding(0));
        container.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 1.0)
        container.setLayoutOption(CoreOptions::PRIORITY, 1000)
        container.setLayoutOption(CoreOptions::ASPECT_RATIO, 10.0)
                
        val hasEntryActions = actions.exists[it instanceof EntryAction]
        val hasDuringActions = actions.exists[it instanceof DuringAction]
        val hasExitActions = actions.exists[it instanceof ExitAction]
        
        val dfEntry = createDataflowRegion("Entry", "entry") => [ addStringAnnotation("style", "entry") ]
        val dfDuring = createDataflowRegion("During", "during") => [ addStringAnnotation("style", "during") ]
        val dfExit = createDataflowRegion("Exit", "exit") => [ addStringAnnotation("style", "exit") ]
        
        for (action : actions) {
            for (effect : action.effects.filter(Assignment)) {
                val effectCopy = effect.copy
                switch (action) {
                    EntryAction: dfEntry.equations += effectCopy
                    DuringAction: dfDuring.equations += effectCopy
                    ExitAction: dfExit.equations += effectCopy
                }
            }
        }
        
//        val entriesNode = if (hasEntryActions) dfEntry.transform.head else null
//        val duringsNode = if (hasDuringActions) dfDuring.transform.head else null
//        val exitsNode = if (hasExitActions) dfExit.transform.head else null 
        val entriesNode = null
        val duringsNode = null
        val exitsNode = null 
        
        if (hasEntryActions) {
            container.children += entriesNode => [
                setLayoutOption(CoreOptions.PRIORITY, 3)        
            ]
        }
        if (hasDuringActions) {
            container.children += duringsNode => [
                setLayoutOption(CoreOptions.PRIORITY, 2)
            ]
        }
        if (hasExitActions) {
            container.children += exitsNode => [
                setLayoutOption(CoreOptions.PRIORITY, 1)
            ]
        }     
        
        node.children += container   
    }    
}