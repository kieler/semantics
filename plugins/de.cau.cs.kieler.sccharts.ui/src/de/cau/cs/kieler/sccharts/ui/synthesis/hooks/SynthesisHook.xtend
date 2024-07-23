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

import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.DisplayedActionData
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.ui.synthesis.srtg.SRTGSynthesis

/** 
 * This class allows hooking into the {@link SRTGSynthesis}. Before and after each main
 * structural element the related method is invoked allowing modification of the input and output of
 * each step.
 * 
 * @author als ssm
 */
@SuppressWarnings("restriction") abstract class SynthesisHook {
    
    @Inject protected AbstractDiagramSynthesis<?> parent

    /** 
     * The {@link SynthesisOption} this hook contributes to the synthesis.
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getDisplayedSynthesisOptions()
     */
    def List<SynthesisOption> getDisplayedSynthesisOptions() {
        return Collections.emptyList()
    }

    /** 
     * The {@link de.cau.cs.kieler.klighd.IActionIAction IActions} this hook contributes to the synthesis.
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getDisplayedActions()
     */
    def List<DisplayedActionData> getDisplayedActions() {
        return Collections.emptyList()
    }

    /** 
     * Returns the priority of this hook. The priority defines the order of invocation between
     * hooks. A higher value results in a earlier invocation of the start and process[State|Transition|Region]
     * methods and a later invocation of the finish method. The recommended priority interval is [0, 100].
     * @return the priority value
     */
    def int getPriority() {
        return 50
    }

    /** 
     * Invoked before the translation of the model starts.
     * @param scopethe input model
     * @param nodethe empty diagram root node
     */
    def void start(Scope scope, KNode node) {
    }

    /** 
     * Invoked after the translation of the model finished.
     * @param scopethe input model
     * @param nodethe diagram root node
     */
    def void finish(Scope scope, KNode node) {
    }

    /** 
     * Invoked after a {@link State} is translated.
     * @param statethe state
     * @param nodethe translated state
     */
    def void processState(State state, KNode node) {
    }

    /** 
     * Invoked after a {@link Transition} is translated.
     * @param transitionthe transition
     * @param edgethe translated edge
     */
    def void processTransition(Transition transition, KEdge edge) {
    }

    /** 
     * Invoked after a {@link Region} is translated.
     * @param regionthe region
     * @param nodethe translated region
     */
    def void processRegion(Region region, KNode node) {
    }

    // -------------------------------------------------------------------------
    // Utility Methods
    /** 
     * Returns true if the given diagram element is associated with the given source model object.
     * @param elementthe diagram element
     * @param objectthe source model object
     * @return
     * @return true if associated, false otherwise
     */
    def boolean isAssociatedWith(KGraphElement element, Object object) {
        if (element !== null) {
            return element.getProperty(KlighdInternalProperties.MODEL_ELEMEMT) === object
        }
        return false
    }

    /** 
     * Returns true if the given diagram element is associated with the given source model object.
     * @param renderingthe rendering element
     * @param objectthe source model object
     * @return true if associated, false otherwise
     */
    def boolean isAssociatedWith(KRendering rendering, Object object) {
        if (rendering !== null) {
            return rendering.getProperty(KlighdInternalProperties.MODEL_ELEMEMT) === object
        }
        return false
    }

    // -------------------------------------------------------------------------
    // Delegate from AbstractDiagramSynthesis
    /** 
     * @param derived
     * @param source
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#associateWith(org.eclipse.emf.ecore.EObject, java.lang.Object)
     */
    def <T extends EObject> T associateWith(T derived, Object source) {
        return parent.associateWith(derived, source)
    }

    /** 
     * @param option
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getObjectValue(de.cau.cs.kieler.klighd.SynthesisOption)
     */
    def Object getObjectValue(SynthesisOption option) {
        return parent.getObjectValue(option)
    }

    /** 
     * @param option
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getBooleanValue(de.cau.cs.kieler.klighd.SynthesisOption)
     */
    def boolean getBooleanValue(SynthesisOption option) {
        return parent.getBooleanValue(option)
    }

    /** 
     * @param option
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getIntValue(de.cau.cs.kieler.klighd.SynthesisOption)
     */
    def int getIntValue(SynthesisOption option) {
        return parent.getIntValue(option)
    }

    /** 
     * @param option
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getFloatValue(de.cau.cs.kieler.klighd.SynthesisOption)
     */
    def float getFloatValue(SynthesisOption option) {
        return parent.getFloatValue(option)
    }

    /** 
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getUsedContext()
     */
    def ViewContext getUsedContext() {
        return parent.getUsedContext()
    }
}
