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
package de.cau.cs.kieler.cview.ecids

import de.cau.cs.kieler.cview.hooks.AbstractConnectionHook
import de.cau.cs.kieler.cview.hooks.IConnectionHook
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import java.util.List
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.cview.model.cViewModel.ComponentType

/**
 * @author cmot
 * 
 */
class ConnectionHook extends AbstractConnectionHook implements IConnectionHook {
    
    @Inject extension CViewModelExtensions
    
    override createConnections(Component component, CViewModel model) {
        val List<Connection> returnList = newArrayList()
        
        if (component.type == ComponentType::FILE) {
            //component.rawdata.contains("...")
        }

        if (component.name.equals("HWIO")) {
            for (filteredComponents : model.findByName("DRV_LL.h", true, true)) {
                returnList.add(component.connectTo(filteredComponents).setColor2("Blue"))
            }
        }

        if (component.name.contains("DRV_HL_CAN")) {
            for (filteredComponents : model.findByName("SYC_HWIO_pn", true, false)) {
                returnList.add(component.connectTo(filteredComponents))
            }
        }

        if (component.name.equals("DRV_HL")) {
            for (filteredComponents : model.findByName("SYC_HWIO.c", true, false)) {
                returnList.add(component.connectTo(filteredComponents).setColor2("DarkGreen"))
            }
        }
        return returnList
    }
}
