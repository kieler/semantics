/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification

import de.cau.cs.kieler.kexpressions.ValuedObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/** 
 * @author aas
 */
@FinalFieldsConstructor
class RangeAssumption extends VerificationAssumption {
    @Accessors(PUBLIC_GETTER) private val ValuedObject valuedObject
    @Accessors(PUBLIC_GETTER) private val int minValue
    @Accessors(PUBLIC_GETTER) private val int maxValue
}
