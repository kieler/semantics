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
import de.cau.cs.kieler.prom.templates.VariableInterfaceType

/**
 * Class that impelments the filter for the data pool view.
 * 
 * @author aas
 *
 */
class DataPoolFilter extends ViewerFilter {

    /**
     * The regular expression to filter the view
     */
    @Accessors
    private var String searchString = ""

    /**
     * Determines if internal variables of the models should be shown, or only inputs/outputs.
     */
    @Accessors
    private var boolean internalVariables = false
    
    /**
     * Determines if other variables of the models should be shown, or only inputs/outputs/internal.
     */
    @Accessors
    private var boolean otherVariables = false
    
    /**
     * Determines if an element should be visible in the data pool view.
     * Per default only inputs and outputs are shown,
     * except if internal variables should be shown as well. 
     * 
     * Only elements are visible that match the searchString.
     * 
     * @param viewer The viewer
     * @param parentElement the parentElement (in case of a tree viewer)
     * @param element The element of which the visibility is determined
     * @return true if the element should be shown in the view. false otherwise
     */
    override boolean select(Viewer viewer, Object parentElement, Object element) {
        if(element instanceof Variable) {
            var boolean visible = (element.isInput || element.isOutput)
            // Show only inputs and outputs or internal variables
            if(internalVariables) {
                visible = visible || element.interfaceTypes.contains(VariableInterfaceType.INTERNAL)
            }
            if(otherVariables) {
                visible = visible || element.interfaceTypes.isNullOrEmpty
            }
            // Filter with (regex) search term
            if(!searchString.isNullOrEmpty) {
                visible = visible && element.name.matches(".*("+searchString+").*")
            }
            return visible
        }
        return true
    }
}