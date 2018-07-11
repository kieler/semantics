/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.labels

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.KRenderingOptions
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.krendering.KRenderingRef
import de.cau.cs.kieler.klighd.labels.management.SoftWrappingLabelManager
import de.cau.cs.kieler.sccharts.Transition
import org.eclipse.elk.graph.ElkLabel

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
public class SemanticSoftWrappingLabelManager extends SoftWrappingLabelManager {

    @Inject extension TransitionLabelSerializer

    new() {
        Guice.createInjector().injectMembers(this)
    }

    /**
     * {@inheritDoc}
     */
    override doResizeLabel(ElkLabel elkLabel, double targetWidth) {
        var rendering = elkLabel.getProperty(KRenderingOptions.K_RENDERING)
        if(rendering instanceof KRenderingRef) rendering = rendering.rendering
        val kLabel = rendering?.eContainer
        val transition = if(kLabel instanceof KLabel) kLabel.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)
        if (transition instanceof Transition) {
            if (transition.label.isNullOrEmpty) {
                val dummyLabel = elkLabel.copy
                return Result.modified(transition.serializeMultilineLabel(false).map[
                    dummyLabel.text = it
                    super.doResizeLabel(dummyLabel, targetWidth).newText?:it
                ].join("\n"))
            }
        }
        return super.doResizeLabel(elkLabel, targetWidth)
    }
}
