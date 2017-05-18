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
package de.cau.cs.kieler.kicool.ui

import de.cau.cs.kieler.kicool.compilation.observer.AbstractContextNotification
import java.util.Observable
import java.util.Observer
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.ui.progress.UIJob

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
abstract class KiCoolUIObserver implements Observer {

    abstract def boolean runInUIThread()
    
    abstract def void update(AbstractContextNotification notification)
    
    override update(Observable o, Object arg) {
        if (arg instanceof AbstractContextNotification) {
            if (runInUIThread) {
                new UIJob("Updating...") {
                    @Override
                    override IStatus runInUIThread(IProgressMonitor monitor) {
                        arg.update
                        return Status.OK_STATUS;
                    }
                }.schedule
            } else {
                arg.update
            }
        }
    }
    
}