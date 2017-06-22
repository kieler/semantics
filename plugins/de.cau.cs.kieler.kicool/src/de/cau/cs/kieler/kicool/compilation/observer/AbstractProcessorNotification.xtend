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
 * Abstract class for processor notifications such as start or stop of a processor.
 * Holds the compilation context of the notification and also processor specific data.
 * 
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
@Data
abstract class AbstractProcessorNotification extends AbstractContextNotification {
    val de.cau.cs.kieler.kicool.Processor processorEntry
    val de.cau.cs.kieler.kicool.compilation.Processor processorUnit
}