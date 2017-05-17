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

import java.util.Observer
import java.util.Observable
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.compilation.observer.AbstractProcessorNotification
import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager.updateProcessor
import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager.resetProcessor
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorStart

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class CompilationUpdate implements Observer {
    
    @Accessors private CompilerView view
    
    new(CompilerView view) {
        this.view = view
    }
    
    override update(Observable o, Object arg) {
        CompilationActionSimSalabim.simSalabim(arg)
        
        if (arg instanceof ProcessorStart) {
            arg.resetProcessor(view.viewContext.viewModel)
        }
        
        if (arg instanceof ProcessorFinished) {
            arg.updateProcessor(view.viewContext.viewModel)
        }
    }
    
}