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
package de.cau.cs.kieler.verification

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.verification.VerificationPropertyStatus

/**
 * @author jep
 * 
 */
class SmallVerificationProperty {
    @Accessors private String name = ""
    @Accessors private String formula = ""
    @Accessors private String id = ""
    @Accessors VerificationPropertyStatus status = VerificationPropertyStatus.PENDING

    new(String name, String formula, String id) {
        this.name = name
        this.formula = formula
        this.id = id
    }

    override toString() {
        return '''VerificationProperty@«hashCode»(name:«name», formula:«formula», status:«status»)'''
    }
}
