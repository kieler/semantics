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
package de.cau.cs.kieler.sccharts.klighd;

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

/**
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 *
 */
public class SCChartsSynthesisHook {
    
    @Inject
    private SCChartsSynthesis parent;

    /**
     * @return
     * @see de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis#getDisplayedSynthesisOptions()
     */
    public List<SynthesisOption> getDisplayedSynthesisOptions() {
        return Collections.emptyList();
    }

    /**
     * @param scope
     * @param node
     */
    public void start(Scope scope, KNode node) {
    }

    /**
     * @param scope
     * @param node
     */
    public void finish(Scope scope, KNode node) {
    }

    /**
     * @param object
     */
    public void preState(State object) {
    }

    /**
     * @param object
     * @param elem
     */
    public void postState(State object, KNode elem) {
    }

    /**
     * @param object
     */
    public void preTransition(Transition object) {
    }

    /**
     * @param object
     * @param elem
     */
    public void postTransition(Transition object, KEdge elem) {
    }

    /**
     * @param object
     */
    public void preRegion(Region object) {
    }

    /**
     * @param object
     * @param elem
     */
    public void postRegion(Region object, KNode elem) {
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
