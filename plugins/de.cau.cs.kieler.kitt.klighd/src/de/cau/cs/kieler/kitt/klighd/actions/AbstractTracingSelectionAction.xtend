/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.actions

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.ViewContext
import org.eclipse.emf.ecore.EObject

/**
 * 
 * @author als
 * @kieler.design 2014-08-26 proposed
 * @kieler.rating 2014-08-26 proposed yellow
 */
abstract class AbstractTracingSelectionAction implements IAction {
    //TODO call traceAll /trace elemts with force
    
    
    static def clearTracingSelection(KNode diagram) {
    }

    static def showTracingSelection(KNode diagram) {
    }

    static def Pair<EObject, EObject> getTracingSelection(KNode diagram, ViewContext viewContext) {
        //check for wrapper mapping
        return null; //TODO Check source target resolve selection //TDOD check in selection if tracing is active
    }
    
}
