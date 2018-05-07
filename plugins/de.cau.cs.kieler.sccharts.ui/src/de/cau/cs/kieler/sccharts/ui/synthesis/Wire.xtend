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
package de.cau.cs.kieler.sccharts.ui.synthesis

import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration

/**
 * @author ssm
 * @kieler.design 2017-09-26 proposed
 * @kieler.rating 2017-09-26 proposed yellow
 * 
 */
class Wire {

    @Accessors var Wiring wiring = null
    @Accessors var Expression source = null
    @Accessors var Expression sink = null
    @Accessors var Expression semanticSource = null
    @Accessors var Expression semanticSink = null
    @Accessors var int sinkIndex = 0
    @Accessors var boolean sourceIsInterface = false
    @Accessors var boolean sinkIsInterface = false
    @Accessors var ReferenceDeclaration semanticSourceReferenceDeclaration = null
    @Accessors var ReferenceDeclaration semanticSinkReferenceDeclaration = null
    @Accessors var int externalSourceReferenceCounter = 0
    @Accessors var int externalSinkReferenceCounter = 0

    new(Expression source, Expression sink, Wiring wiring) {
        this.wiring = wiring
        this.source = source
        this.sink = sink
    }
    
    def ReferenceDeclaration getReferenceDeclaration() {
        if (semanticSourceReferenceDeclaration !== null) return semanticSourceReferenceDeclaration 
            else semanticSinkReferenceDeclaration
    }

}
