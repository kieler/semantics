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
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import de.cau.cs.kieler.simulation.SimulationUtil
import de.cau.cs.kieler.simulation.ui.views.DataPoolViewToolbarAction
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.ui.PlatformUI

/**
 * @author aas
 *
 */
class SimulateModelInDiagramView implements KiCoModelViewUIContributor {
    private var IAction simulateAction
    private var IAction linkCompileChainToCompilerViewAction
    
    private var KiCoModelUpdateController muc
    
    private var boolean linkCompileChainToCompilerView
    
    new() {
        // Create link button
        linkCompileChainToCompilerViewAction = new DataPoolViewToolbarAction("Link Simulation with Compiler View", "linkedLaunch.png", IAction.AS_CHECK_BOX) {
            override run() {
                linkCompileChainToCompilerView = !linkCompileChainToCompilerView
            }
        }
        linkCompileChainToCompilerViewAction.checked = linkCompileChainToCompilerView
        // Create play button
        simulateAction = new DataPoolViewToolbarAction("Simulate model", "launch.png") {
            override run() {
                val model = muc.model
                if(model !== null && model instanceof EObject) {
                    if(linkCompileChainToCompilerView) {
                        val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                        val view = page?.findView(CompilerView.ID)
                        if(view !== null && view instanceof CompilerView) {
                            val selMan = (view as CompilerView).systemSelectionManager    
                            val compileChain = selMan.selectedSystem.id
                            SimulationUtil.startSimulation(model as EObject, compileChain)
                        } else{
                            throw new Exception("Cannot link compile chain for simulation to Compiler View.\n"
                                              + "Open the Compiler View or deselect the link option.")
                        }
                    } else {
                        SimulationUtil.startSimulation(model as EObject)
                    }
                }
            }
        }
    }
    
    override contribute(KiCoModelUpdateController muc, IToolBarManager toolBar, IMenuManager menu) {
        this.muc = muc
        toolBar.add(simulateAction)
        toolBar.add(linkCompileChainToCompilerViewAction)
    }
}