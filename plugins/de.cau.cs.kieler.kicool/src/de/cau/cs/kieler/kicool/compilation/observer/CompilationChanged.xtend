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
package de.cau.cs.kieler.kicool.compilation.observer

import de.cau.cs.kieler.kicool.compilation.CompilationContext
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.ProcessorEntry

/**
 * 
 * Notification class for the compilation has started event.
 * 
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class CompilationChanged extends AbstractCompilationNotification {
    
    @Accessors val de.cau.cs.kieler.kicool.System system
    @Accessors val ProcessorEntry processorEntry
    
    new(CompilationContext compilationContext, de.cau.cs.kieler.kicool.System system, ProcessorEntry processorEntry) {
        super(compilationContext)
        this.system = system
        this.processorEntry = processorEntry
    }
    
}