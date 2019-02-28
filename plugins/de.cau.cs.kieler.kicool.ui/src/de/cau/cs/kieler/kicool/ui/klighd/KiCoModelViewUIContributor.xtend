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
package de.cau.cs.kieler.kicool.ui.klighd

import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import org.eclipse.ui.IMemento

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
interface KiCoModelViewUIContributor {
    
    /**
     * Contributions to toolbar and menu.
     */
    abstract def void contributeControls(KiCoModelUpdateController muc, IToolBarManager toolBar, IMenuManager menu)

    /**
     * Contributions to diagram warnings (post synthesis).
     */    
    abstract def String[] contributeDiagramWarnings(KiCoModelUpdateController muc, Object model, KlighdSynthesisProperties properties)
    
    /**
     * Notifies this contribution that the given view update controller is saving its state in the given memento.
     */
    abstract def void saveState(KiCoModelUpdateController muc, IMemento memento)
        
    /**
     * Notifies this contribution that the given view update controller is loading its state from the given memento.
     */
    abstract def void loadState(KiCoModelUpdateController muc, IMemento memento)
    
}