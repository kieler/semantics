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
package de.cau.cs.kieler.sccharts.klighd.synthesis.labels

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.KlighdOptions
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.krendering.KRenderingRef
import de.cau.cs.kieler.klighd.labels.SoftWrappingLabelManager
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import org.eclipse.elk.graph.ElkLabel

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
public class SemanticSoftWrappingLabelManager extends SoftWrappingLabelManager {

    @Inject extension SCChartsSerializeHRExtension

    new() {
        Guice.createInjector().injectMembers(this)
    }

    /**
     * {@inheritDoc}
     */
    override resizeLabel(ElkLabel elkLabel, double targetWidth) {
        var rendering = elkLabel.getProperty(KlighdOptions.K_RENDERING)
        if(rendering instanceof KRenderingRef) rendering = rendering.rendering
        val kLabel = rendering?.eContainer
        val transition = if(kLabel instanceof KLabel) kLabel.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)
        if (transition instanceof Transition) {
            if (transition.label.isNullOrEmpty) {
                val dummyLabel = elkLabel.copy
                val parts = newLinkedList
                val part = new StringBuilder
                var effectPrefix = new StringBuffer

                // Prio
                if (transition.sourceState.outgoingTransitions.size > 1) {
                    part.append(transition.sourceState.outgoingTransitions.indexOf(transition) + 1).append(": ")
                }
                // Trigger
                if (transition.trigger != null) {
                    if (transition.delay > 1) {
                        part.append(transition.delay).append(" ");
                    }
                    part.append(transition.trigger.serializeHR);

                    // Soft wrap first part
                    dummyLabel.text = part.toString
                    parts.add(super.resizeLabel(dummyLabel, targetWidth))
                } else {
                    effectPrefix.append(part)
                }

                // Effects
                if (parts.empty && transition.effects.empty) {
                    // Only priority
                    return effectPrefix.toString
                } else {
                    effectPrefix.append("/ ")
                    for (effect : transition.effects) {
                        part.length = 0 // clear part
                        part.append(effectPrefix)
                        part.append(effect.serializeHR)
                        part.append(";")

                        // Soft wrap first part
                        dummyLabel.text = part.toString
                        parts.add(super.resizeLabel(dummyLabel, targetWidth))

                        // Convert prefix to indentation
                        for (var i = 0; i < effectPrefix.length; i++) {
                            effectPrefix.setCharAt(i, ' ')
                        }
                    }
                }
                return parts.join("\n")
            }
        }
        return super.resizeLabel(elkLabel, targetWidth)
    }
}
