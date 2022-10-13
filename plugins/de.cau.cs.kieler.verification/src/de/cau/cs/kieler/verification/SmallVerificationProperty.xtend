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

/**
 * A reduced version of VerifcationProperty. It is used to send properties to the client.
 * 
 * @author jep
 * 
 */
class SmallVerificationProperty {
    
    @Accessors String name = ""
    @Accessors String formula = ""
    @Accessors String id = ""
    @Accessors String counterexampleUri 
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
