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
package de.cau.cs.kieler.kicool.ui.view.actions

import de.cau.cs.kieler.kicool.compilation.observer.AbstractContextNotification
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorStart
import de.cau.cs.kieler.kicool.ui.KiCoolUIObserver
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import java.util.Observable
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager.resetProcessor
import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager.updateProcessor
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorProgress

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class CompilationUpdate extends KiCoolUIObserver {
    
    @Accessors private CompilerView view
    
    new(CompilerView view) {
        this.view = view
    }
    
    override runInUIThread() {
        true
    }
    
    override update(AbstractContextNotification notification) {
        CompilationActionSimSalabim.simSalabim(notification)
        
        if (notification instanceof ProcessorStart) {
            notification.resetProcessor(view.viewContext.viewModel)
        }
        else if (notification instanceof ProcessorFinished) {
            notification.updateProcessor(view.viewContext.viewModel)
        }
        else if (notification instanceof ProcessorProgress) {
            notification.updateProcessor(view.viewContext.viewModel)
        }
    }
    
}