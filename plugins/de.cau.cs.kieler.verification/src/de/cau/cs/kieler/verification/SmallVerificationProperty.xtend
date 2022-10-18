/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * A reduced version of VerificationProperty. It is used to send properties to the client.
 * 
 * @author jep
 * 
 */
class SmallVerificationProperty {
    
    @Accessors(PUBLIC_GETTER) String name = ""
    @Accessors(PUBLIC_GETTER) String formula = ""
    @Accessors(PUBLIC_GETTER) String id = ""
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
