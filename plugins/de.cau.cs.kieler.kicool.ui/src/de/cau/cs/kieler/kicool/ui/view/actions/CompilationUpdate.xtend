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
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager.resetSystem
import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager.resetProcessor
import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager.updateProcessor
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorProgress
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished

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
        
        switch notification {
            ProcessorProgress: notification.updateProcessor(view.viewContext.viewModel)
            ProcessorStart: notification.resetProcessor(view.viewContext.viewModel)
            ProcessorFinished: notification.updateProcessor(view.viewContext.viewModel) 
            CompilationStart: notification.resetSystem(view.viewContext.viewModel)
            CompilationFinished: CompilationActionSimSalabim.simSalabim(notification) 
        }
        
    }
    
}