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
package de.cau.cs.kieler.cview.c.extensions

import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.ComponentType
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import java.util.List
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import java.util.Set
import java.util.ArrayList
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.cview.CViewPlugin

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.common.collect.ImmutableList
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import java.util.HashSet
import org.eclipse.cdt.core.dom.ast.IASTFileLocation
import org.eclipse.cdt.core.dom.ast.IASTName
import de.cau.cs.kieler.cview.extensions.CViewAnalysisExtensions

/**
 * Basic commonly usable CDT access methods.
 * 
 * @author cmot
 * 
 */
class CViewCDTExtensions {

    // static final String  
    @Inject
    extension CViewModelExtensions

    @Inject
    extension CViewAnalysisExtensions

    // -------------------------------------------------------------------------

    def int lineStart(IASTName definitionName) {
        var returnLine = 0
        val IASTFileLocation loc = definitionName.getFileLocation();
        if (definitionName != null && loc != null) {
            returnLine = loc.startingLineNumber
        }
        return returnLine
    }

    def int lineEnd(IASTName definitionName) {
        var returnLine = 0
        val IASTFileLocation loc = definitionName.getFileLocation();
        if (definitionName != null && loc != null) {
            returnLine = loc.endingLineNumber
        }
        return returnLine
    }

// -------------------------------------------------------------------------
}
