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
package de.cau.cs.kieler.kicool.compilation.observer

import de.cau.cs.kieler.kicool.compilation.CompilationContext

/**
 * 
 * Abstract class for compilation notifications such as start or stop of a compilation.
 * Holds the compilation context of the notification.
 * 
 * @author ssm
 * @kieler.design 2017-05-17 proposed
 * @kieler.rating 2017-05-17 proposed yellow 
 */
abstract class AbstractCompilationNotification extends AbstractContextNotification {
    
    new(CompilationContext compilationContext) {
        super(compilationContext)
    }
    
}