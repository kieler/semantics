/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification.ltl

import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author jep
 *
 */
class LTLFormulaResource extends LazyLinkingResource {
    
    @Accessors
    var boolean standaloneParse = false;
    
}