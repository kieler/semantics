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

import com.google.inject.Inject
import de.cau.cs.kieler.cview.hooks.IExportHook
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions

/**
 * @author cmot
 * 
 */
class ECidsExportHookCountCSV implements IExportHook {

    @Inject extension CViewModelExtensions

    override getName() {
        return "eCIDS Component Count Connections - CSV"
    }

    override getId() {
        return "de.cau.cs.kieler.cview.ecids.count"
    }

    override getFileExtension() {
        return "csv"
    }

    override export(CViewModel model) {
        var returnString = ''''''
        for (component : model.components) {
            if (component.outgoingConnections.size > 0) {
                if (returnString.length > 0) {
                    returnString += " \n"
                }
                returnString += component.name + ";" + component.outgoingConnections.size
            }
        }
        return returnString
    }

}
