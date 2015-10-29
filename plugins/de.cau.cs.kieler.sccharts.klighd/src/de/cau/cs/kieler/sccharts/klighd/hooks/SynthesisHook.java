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
package de.cau.cs.kieler.sccharts.klighd.hooks;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.klighd.synthesis.SCChartsSynthesis;

/**
 * This class allows hooking into the {@link SCChartsSynthesis}. Before and after each main
 * structural element the related method is invoked allowing modification of the input and output of
 * each step.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 *
 */
public abstract class SynthesisHook {

    @Inject
    private SCChartsSynthesis parent;

    /**
     * The {@link SynthesisOption} this hook contributes to the synthesis.
     * 
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getDisplayedSynthesisOptions()
     */
    public List<SynthesisOption> getDisplayedSynthesisOptions() {
        return Collections.emptyList();
    }

    /**
     * Invoked before the translation of the model starts.
     * 
     * @param scope
     *            the input model
     * @param node
     *            the empty diagram root node
     */
    public void start(Scope scope, KNode node) {
    }

    /**
     * Invoked after the translation of the model finished.
     * 
     * @param scope
     *            the input model
     * @param node
     *            the diagram root node
     */
    public void finish(Scope scope, KNode node) {
    }

    /**
     * Invoked before a {@link State} is translated.
     * 
     * @param state
     *            the state
     */
    public void preState(State state) {
    }

    /**
     * Invoked after a {@link State} is translated.
     * 
     * @param state
     *            the state
     * @param node
     *            the translated state
     */
    public void postState(State state, KNode node) {
    }

    /**
     * Invoked before a {@link Transition} is translated.
     * 
     * @param transition
     *            the transition
     */
    public void preTransition(Transition transition) {
    }

    /**
     * Invoked after a {@link Transition} is translated.
     * 
     * @param transition
     *            the transition
     * @param edge
     *            the translated edge
     */
    public void postTransition(Transition transition, KEdge edge) {
    }

    /**
     * Invoked before a {@link Region} is translated.
     * 
     * @param region
     *            the region
     */
    public void preRegion(Region region) {
    }

    /**
     * Invoked after a {@link Region} is translated.
     * 
     * @param region
     *            the region
     * @param node
     *            the translated region
     */
    public void postRegion(Region region, KNode node) {
    }

    // -------------------------------------------------------------------------
    // Delegate from AbstractDiagramSynthesis

    /**
     * @param derived
     * @param source
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#associateWith(org.eclipse.emf.ecore.EObject,
     *      java.lang.Object)
     */
    public <T extends EObject> T associateWith(T derived, Object source) {
        return parent.associateWith(derived, source);
    }

    /**
     * @param option
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getObjectValue(de.cau.cs.kieler.klighd.SynthesisOption)
     */
    public Object getObjectValue(SynthesisOption option) {
        return parent.getObjectValue(option);
    }

    /**
     * @param option
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getBooleanValue(de.cau.cs.kieler.klighd.SynthesisOption)
     */
    public boolean getBooleanValue(SynthesisOption option) {
        return parent.getBooleanValue(option);
    }

    /**
     * @param option
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getIntValue(de.cau.cs.kieler.klighd.SynthesisOption)
     */
    public int getIntValue(SynthesisOption option) {
        return parent.getIntValue(option);
    }

    /**
     * @param option
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getFloatValue(de.cau.cs.kieler.klighd.SynthesisOption)
     */
    public float getFloatValue(SynthesisOption option) {
        return parent.getFloatValue(option);
    }

    /**
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getUsedContext()
     */
    public ViewContext getUsedContext() {
        return parent.getUsedContext();
    }

}
