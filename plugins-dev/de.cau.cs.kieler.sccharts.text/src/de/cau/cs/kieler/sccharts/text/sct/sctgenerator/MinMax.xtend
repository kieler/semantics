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
package de.cau.cs.kieler.sccharts.text.sct.sctgenerator

import org.eclipse.xtend.lib.annotations.Data

/**
 * Data holder for {@code MinMax} SCT Generator properties
 * {@code MinMax} properties include two values. One for the minimum and one for the maximum value. 
 * 
 * @author ssm
 * @kieler.rating 2016-06-10 yellow KI-125 als
 */
@Data
class MinMax<T> extends SCTGeneratorProperty {
    T min   // The minimum value
    T max   // The maximum value
}