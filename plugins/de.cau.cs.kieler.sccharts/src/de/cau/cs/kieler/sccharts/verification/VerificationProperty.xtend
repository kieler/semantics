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
package de.cau.cs.kieler.sccharts.verification

import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * @author aas
 */
class VerificationProperty {
    @Accessors private String name = ""
    @Accessors private String formula = ""
    @Accessors private VerificationPropertyType type = VerificationPropertyType.INVARIANT
    @Accessors private VerificationResult result = new VerificationResult(VerificationResultStatus.PENDING)
    
    new(String name, String formula, VerificationPropertyType type) {
        this.name = name
        this.formula = formula
        this.type = type
    }
    
    override toString() {
        return '''VerificationProperty(name:«name», formula:«formula», type:«type», result:«result.status»)'''
    }
    
    public def void failWithException(Exception e) {
        result = new VerificationResult(e)
    }
}
