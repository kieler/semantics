/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.sequencetracker

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import de.cau.cs.kieler.sccharts.Transition

/**
 * @author cmo6008
 * 
 */
class TransitionSerializer {

    @Inject
    extension SCChartsSerializeHRExtension

    def serialize(Transition transition) {
        transition.serializeHR.toString
    }

    def serializeTrigger(Transition transition) {
        val trigger = transition.serialize
        return trigger.subSequence(0, trigger.indexOf("/")).toString
    }

    def serializeEffects(Transition transition) {
        val trigger = transition.serialize
        return trigger.subSequence(trigger.indexOf("/") + 1, trigger.length).toString
    }

}
