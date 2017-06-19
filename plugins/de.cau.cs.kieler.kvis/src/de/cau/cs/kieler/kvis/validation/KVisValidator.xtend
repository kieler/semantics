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
package de.cau.cs.kieler.kvis.validation

import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kvis.kvis.Interval
import de.cau.cs.kieler.kvis.kvis.Mapping
import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.kvis.kvis.Interaction

/**
 * @author aas
 * 
 */
class KVisValidator extends KVisJavaValidator {
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
        var float low = Float.MIN_VALUE
        var float high = Float.MAX_VALUE
        if (from != null && to != null) {
            if(from instanceof IntValue) {
                low = from.value
            } else if(from instanceof FloatValue) {
                low = from.value
            }
            if(to instanceof IntValue) {
                high = to.value
            } else if(to instanceof FloatValue) {
                high = to.value
            }
            if(low > high) {
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
 