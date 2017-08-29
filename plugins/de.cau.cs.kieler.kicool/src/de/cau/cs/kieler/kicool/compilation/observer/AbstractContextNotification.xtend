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

/**
 * Abstract notification class, which holds the compilation context of the notification.
 * 
 * @author ssm
 * @kieler.design 2017-05-18 proposed
 * @kieler.rating 2017-05-18 proposed yellow 
 */
@Data
abstract class AbstractContextNotification {
    val de.cau.cs.kieler.kicool.compilation.CompilationContext compilationContext
}