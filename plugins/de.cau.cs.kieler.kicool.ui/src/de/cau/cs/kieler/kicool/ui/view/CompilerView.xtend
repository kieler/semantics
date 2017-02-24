/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view

import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties.ZoomConfigButtonsHandling
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI
import org.eclipse.core.runtime.IStatus
import de.cau.cs.kieler.klighd.ui.DiagramViewManager
import org.eclipse.ui.progress.UIJob
import de.cau.cs.kieler.kico.ui.KiCoSelectionView
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.Separator
import org.eclipse.jface.action.IToolBarManager
import de.cau.cs.kieler.kicool.ui.view.actions.CompilationAction
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.ui.view.actions.SmartSystemSelectionToggleAction
import de.cau.cs.kieler.kicool.ui.view.actions.DebugToggleAction
import de.cau.cs.kieler.kicool.System

/**
 * @author ssm
 * @kieler.design 2016-11-04 proposed
 * @kieler.rating 2016-11-04 proposed yellow 
 */
class CompilerView extends DiagramViewPart {
    
    @Accessors private ToolbarSystemCombo combo
    @Accessors private System activeSystem = null 
    @Accessors private EditPartSystemManager editPartSystemManager = new EditPartSystemManager
    
    private var addButtonsDelay = true
    
    // Must be initialized in the view contributions. Hence, maybe null!
    @Accessors private var SystemSelectionManager systemSelectionManager = null
    
    /**
     * {@inheritDoc}
     */
    override createPartControl(Composite parent) {
        super.createPartControl(parent)

        val toolBarManager = getViewSite.getActionBars.getToolBarManager
        val menuManager = getViewSite.getActionBars.getMenuManager
        
        addContributions(toolBarManager, menuManager)
        addButtons()

        new CompilerViewPartListener(this, parent)
    }
    
    protected override addButtons() {
        if (addButtonsDelay) {
            addButtonsDelay = false
        } else {
            super.addButtons();
        }
    }
    
    /**
     * {@inheritDoc}
     */
    protected def void addContributions(IToolBarManager toolBar, IMenuManager menu) {
        
        // Compile
        toolBar.add(new CompilationAction(this).compileAction)        
       
        combo = new ToolbarSystemCombo("System Combo")
        toolBar.add(combo)
        systemSelectionManager = new SystemSelectionManager(this)
        
        toolBar.add(new Separator)
        // The standard klighd view part buttons will be inserted after this separator. 

        menu.add(new SmartSystemSelectionToggleAction(this).smartSystemSelectionToggleAction)
        menu.add(new DebugToggleAction(this).debugToggleAction)
        
        menu.add(new Separator)
        // The standard kligd view part menu entries will be inserted after this separator.    
    }    
    
    public static def IEditorPart getActiveEditor() {
        PlatformUI.getWorkbench.getActiveWorkbenchWindow.getActivePage.getActiveEditor
    }    
    
    def void updateView() {
        if (activeSystem == null) return
        
        val properties = new KlighdSynthesisProperties
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
            "de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis")
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_ZOOM_CONFIG_BUTTONS_HANDLING,
                ZoomConfigButtonsHandling.HIDE)
                                
        updateDiagram(activeSystem, properties)
    }


    /**
     * Update view on close clears the cache for registered Editors to ensure that if you open the
     * model again no strange behavior occurs.
     * 
     * @param ref
     *            the ref
     */
    def void updateViewOnClose() {
    }
    
    
    private def void updateDiagram(Object model, KlighdSynthesisProperties properties) {
        if (this.getViewer() == null || this.getViewer().getViewContext() == null) {
            val instance = this
            new UIJob("Init" + KiCoSelectionView.getClass.getName()) {

                @SuppressWarnings("deprecation")
                @Override
                public override IStatus runInUIThread(IProgressMonitor monitor) {
                    DiagramViewManager.initializeView(instance, model, null, properties);
                    return Status.OK_STATUS;
                }
            }.schedule
        } else {
            // update case
            val viewContext = this.getViewer.getViewContext
            viewContext.configure(properties)
            DiagramViewManager.updateView(viewContext, model)
        }
    }    



    
}