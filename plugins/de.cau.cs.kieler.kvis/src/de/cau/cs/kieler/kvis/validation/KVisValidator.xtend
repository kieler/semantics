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
package de.cau.cs.kieler.kvis.validation

import com.google.inject.Inject
import de.cau.cs.kieler.kvis.extensions.KVisExtensions
import de.cau.cs.kieler.kvis.kvis.Interaction
import de.cau.cs.kieler.kvis.kvis.Interval
import de.cau.cs.kieler.kvis.kvis.Mapping
import org.eclipse.xtext.validation.Check

/**
 * @author aas
 * 
 */
class KVisValidator extends KVisJavaValidator {
    @Inject
    extension KVisExtensions kvisExtensions
    
    @Check
    public def void checkMappingDomains(Mapping mapping) {
        if (mapping.variableDomain.value != null && mapping.attributeDomain.range != null) {
            error("Can't map a single value to a range.", mapping, null);
        }
    }
    
    @Check
    public def void checkIntervalFromLessOrEqualIntervalTo(Interval interval) {
        val from = interval.from
        val to = interval.to
        if (from != null && to != null) {
            val fromDouble = from.primitiveValue.doubleValue
            val toDouble = to.primitiveValue.doubleValue
            if(fromDouble > toDouble) {
                error("Lower value of an interval has to be on the left side.", interval, null);
            }
        }
    }
    
    @Check
    public def void checkEventOrConditionOnInteraction(Interaction interaction) {
        if(interaction.event == null && interaction.condition == null) {
            error("An interaction must have a condition or must listen to an event", interaction, null)
        }
    }
}
 