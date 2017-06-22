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
import de.cau.cs.kieler.kicool.Processor
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * 
 * Notification class for the processor encountered an error event.
 * 
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class ProcessorError extends AbstractProcessorNotification {
    
    @Accessors String error
    
    new(String error, CompilationContext compilationContext, Processor processorEntry, de.cau.cs.kieler.kicool.compilation.Processor processorUnit) {
        super(compilationContext, processorEntry, processorUnit)
        this.error = error
    }
    
}