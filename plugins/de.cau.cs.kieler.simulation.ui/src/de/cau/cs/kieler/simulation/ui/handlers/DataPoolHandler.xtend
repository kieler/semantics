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
package de.cau.cs.kieler.simulation.ui.handlers

import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DefaultDataHandler
import de.cau.cs.kieler.simulation.ui.views.DataPoolView
import org.eclipse.swt.widgets.Display

/**
 * @author aas
 *
 */
class DataPoolHandler extends DefaultDataHandler {
    
    override read(DataPool pool) {
        // Execute in UI thread
        Display.getDefault().asyncExec(new Runnable() {
            override void run() {
                DataPoolView.instance?.setDataPool(pool)
            }
        });
    }
    
    override updateEachStep() {
        return true
    }
    
    override stop() {
        // Execute in UI thread
         Display.getDefault().asyncExec(new Runnable() {
            override void run() {
                DataPoolView.instance?.setDataPool(null)
            }
        });
    }
}