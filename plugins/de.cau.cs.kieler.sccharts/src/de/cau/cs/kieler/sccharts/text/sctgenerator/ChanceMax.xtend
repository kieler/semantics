/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.sctgenerator

import org.eclipse.xtend.lib.annotations.Data

/**
 * Data holder for SCT Generator {@code ChanceMax} properties
 * A {@code ChanceMax} property comprises a value which determines the chance for an event to occur
 * and a maximum value of allowed occurrences.   
 * 
 * @author ssm
 * @kieler.rating 2016-06-10 yellow KI-125 als
 */
@Data
class ChanceMax<T, S> extends SCTGeneratorProperty {
    T chance    // The chance of occurrence
    S max       // The maximum number of occurrences
}