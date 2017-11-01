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
package de.cau.cs.kieler.simulation.ui

import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelUpdateController
import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewUIContributor
import de.cau.cs.kieler.simulation.ui.highlighting.DiagramHighlighter
import java.util.List
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import de.cau.cs.kieler.simulation.core.SimulationManager

/**
 * @author aas
 *
 */
class DiagramHighlighterEnablementInDiagramView implements KiCoModelViewUIContributor {
    private var List<IAction> toggleDiagramHighlighterActions = newArrayList
    
    private var KiCoModelUpdateController muc
    
    /**
     * Constructor
     */
    new() {
        // Register this controller
        KiCoModelUpdateController.addExternalUIContributor(this)
        
        for(highlighter : DiagramHighlighter.diagramHighlighters) {
            val action = new Action(highlighter.name, IAction.AS_CHECK_BOX) {
                override run() {
                    highlighter.enabled = !highlighter.enabled
                    // This option requires a restart
                    SimulationManager.instance?.stop
                }
            }
            action.checked = highlighter.enabled
            toggleDiagramHighlighterActions.add(action)
        }
    }
    
    override contribute(KiCoModelUpdateController muc, IToolBarManager toolBar, IMenuManager menu) {
        this.muc = muc
        for(action : toggleDiagramHighlighterActions) {
            menu.add(action);
        }
    }
}