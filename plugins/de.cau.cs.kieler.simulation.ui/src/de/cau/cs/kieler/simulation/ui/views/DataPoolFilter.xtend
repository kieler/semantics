/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.views

import de.cau.cs.kieler.simulation.core.Variable
import org.eclipse.jface.viewers.Viewer
import org.eclipse.jface.viewers.ViewerFilter
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Class that impelents the filter for the data pool view.
 * 
 * @author aas
 *
 */
class DataPoolFilter extends ViewerFilter {

    @Accessors
    private var String searchString = ""

    /**
     * Determines if an element should be visible in the data pool view.
     * Per default, visible elements are only inputs and outputs.
     * 
     * @return true if the element should be shown in the view. false otherwise
     */
    override boolean select(Viewer viewer, Object parentElement, Object element) {
        if(element instanceof Variable) {
            var boolean visible = (element.isInput || element.isOutput)
            if(!searchString.isNullOrEmpty) {
                visible = visible && element.name.matches(".*"+searchString+".*")
            }
            return visible
        }
        return true
    }
}