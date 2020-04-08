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
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.DataflowRegionSynthesis
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.KNodeExtensionsReplacement
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import java.util.List
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Shows actions as dataflow regions.
 * 
 * @author ssm
 * @kieler.design 2019-05-28 proposed
 * @kieler.rating 2019-05-28 proposed yellow
 * 
 */
@ViewSynthesisShared
class ActionsAsDataflowHook extends SynthesisHook {

    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension StateStyles
    @Inject extension KRenderingExtensions
    @Inject extension KNodeExtensionsReplacement
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension DataflowRegionSynthesis

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.ActionAsDataflow"
    /** The related synthesis option */
    
    public static val SynthesisOption SHOW_ACTIONS_AS_DATAFLOW = SynthesisOption.createCheckOption("sccharts.actionsAsDataflow.showActionsAsDataflow", "Actions as Dataflow", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_ACTIONS_AS_DATAFLOW)
    }

    override processState(State state, KNode node) {
        val container = node.contentContainer
        val actionContainer = container?.getProperty(StateStyles::ACTIONS_CONTAINER)

        if (actionContainer === null) return;
        
        if (SHOW_ACTIONS_AS_DATAFLOW.booleanValue) {
            container.children.remove(actionContainer)
            node.addRegionsArea
            
            val actions = <Action> newArrayList(state.actions)
            
            node.addActionsAsDataflow(actions, state)
        }
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
                if (action.trigger !== null) {
                    val triggerCopy = action.trigger.copy
                    effectCopy.expression = createConditionalExpression(triggerCopy, effectCopy.expression)
                }
                switch (action) {
                    EntryAction: dfEntry.equations += effectCopy
                    DuringAction: dfDuring.equations += effectCopy
                    ExitAction: dfExit.equations += effectCopy
                }
            }
        }
        
        val entriesNode = if (hasEntryActions) dfEntry.transform.head else null
        val duringsNode = if (hasDuringActions) dfDuring.transform.head else null
        val exitsNode = if (hasExitActions) dfExit.transform.head else null 
        
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