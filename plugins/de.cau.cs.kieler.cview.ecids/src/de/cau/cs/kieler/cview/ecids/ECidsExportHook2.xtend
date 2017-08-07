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

import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import java.util.List
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.cview.model.cViewModel.ComponentType
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import java.util.Set
import java.util.ArrayList
import java.util.HashSet
import de.cau.cs.kieler.cview.hooks.IAnalysisHook
import de.cau.cs.kieler.cview.hooks.IExportHook
import de.cau.cs.kieler.cview.hooks.AbstractExportHook
import de.cau.cs.kieler.cview.hooks.AbstractAnalysisHook

/**
 * @author cmot
 * 
 */
class ECidsExportHook2 extends AbstractExportHook implements IExportHook {

    @Inject extension CViewModelExtensions

    override getName() {
        return "eCIDS OAL Message Count"
    }

    override getId() {
        return "de.cau.cs.kieler.cview.ecids.count"
    }

    override export(CViewModel model) {
//        var returnValue = ""
//        for (component : model.components) {
//            if (component.isDir) {
//                returnValue += component.location + "\n"
//            }
//        }
//        return returnValue
'''START { 
    «
    FOR component: model.components»
    «IF component.isPhilipp(component.location)»
       DIR: "«component.location»" 
    «ENDIF»
    «ENDFOR»
} END'''


    }

    override getFileExtension() {
        return "txt"
    }
    
    def isPhilipp(Component c, String string) {
        
        (c.dir && string.length > 5)
    }
    

}
