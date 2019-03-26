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
package de.cau.cs.kieler.verification.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.verification.DefaultRangeAssumption
import de.cau.cs.kieler.verification.RangeAssumption
import de.cau.cs.kieler.verification.VerificationAssumption
import java.util.List

/** 
 * @author aas
 */
class VerificationExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    
    public def RangeAssumption findRangeAssumption(List<VerificationAssumption> assumptions, ValuedObject valuedObject) {
        if(assumptions === null) {
            return null
        }
        
        var RangeAssumption defaultRangeAssumption = null
        for(assumption : assumptions.filter(RangeAssumption)) {
            if(assumption instanceof DefaultRangeAssumption) {
                defaultRangeAssumption = assumption
            } else {
                if(assumption.valuedObject.name == valuedObject.name) {
                    return assumption
                }
            } 
        }
        
        if(valuedObject.type == ValueType.INT) {
            return defaultRangeAssumption            
        }
        
        return null
    }
}
