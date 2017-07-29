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
import de.cau.cs.kieler.cview.hooks.AbstractAnalysisHook
import de.cau.cs.kieler.cview.hooks.IAnalysisHook
import de.cau.cs.kieler.cview.hooks.IExportHook
import de.cau.cs.kieler.cview.hooks.AbstractExportHook

/**
 * @author cmot
 * 
 */
class ECidsExportHook extends AbstractExportHook implements IExportHook {

    @Inject extension CViewModelExtensions

    
    override getName() {
        return "eCIDS OAL Message Export";
    }

    override getId() {
        return "de.cau.cs.kieler.cview.ecids";
    }
    
    override export(CViewModel model) {
        return "Hello eCIDS"
    }
    
    override getFileExtension() {
        return null
    }
    
}
