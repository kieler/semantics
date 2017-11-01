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
package de.cau.cs.kieler.esterel.processors.transformators.kernel

import de.cau.cs.kieler.kicool.compilation.Processor

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class KernelTransformations {
    static val STRICT = new de.cau.cs.kieler.core.model.properties.Property<Boolean>("de.cau.cs.kieler.esterel.processors.transformators.kernel.strict", true)

    static def isStrict(Processor p) {
        return p.environment.getProperty(STRICT)
    }
}