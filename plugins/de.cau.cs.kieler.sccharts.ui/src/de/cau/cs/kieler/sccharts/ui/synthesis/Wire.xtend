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
package de.cau.cs.kieler.sccharts.ui.synthesis

import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.xtend.lib.annotations.Accessors

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
    @Accessors var boolean sourceIsInterface = false
    @Accessors var boolean sinkIsInterface = false

    new(Expression source, Expression sink, Wiring wiring) {
        this.wiring = wiring
        this.source = source
        this.sink = sink
    }

}
