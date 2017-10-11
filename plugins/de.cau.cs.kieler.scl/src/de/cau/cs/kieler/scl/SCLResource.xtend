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
package de.cau.cs.kieler.scl

import com.google.inject.Inject
import de.cau.cs.kieler.scl.validation.InternalSyntaxValidation
import org.eclipse.xtext.linking.lazy.LazyLinkingResource

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCLResource extends LazyLinkingResource {
    
    @Inject extension InternalSyntaxValidation
    
    override addSyntaxErrors() {
        super.addSyntaxErrors
        if (!validationDisabled) {
            getErrors().addAll(parseResult.createSemicolonErrors)
        }
    }
    
}