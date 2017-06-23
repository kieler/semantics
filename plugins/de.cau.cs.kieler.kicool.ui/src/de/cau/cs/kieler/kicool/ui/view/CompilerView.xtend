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

import de.cau.cs.kieler.kico.ui.KiCoSelectionView
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.ui.view.actions.AbstractAction
import de.cau.cs.kieler.kicool.ui.view.actions.AutoCompileToggle
import de.cau.cs.kieler.kicool.ui.view.actions.CompilationAction
import de.cau.cs.kieler.kicool.ui.view.actions.DeveloperToggle
import de.cau.cs.kieler.kicool.ui.view.actions.ForwardResultToggle
import de.cau.cs.kieler.klighd.ui.DiagramViewManager
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties.ZoomConfigButtonsHandling
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.Separator
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IEditorReference
import org.eclipse.ui.IMemento
import org.eclipse.ui.IViewSite
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.progress.UIJob
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.ui.view.actions.VisualLayoutFeedbackToggle
import org.eclipse.jface.action.MenuManager
import de.cau.cs.kieler.kicool.ui.view.actions.SkinSelectionActions

/**
 * The IMB Compiler View
 * 
 * @author ssm
 * @kieler.design 2016-11-04 proposed
 * @kieler.rating 2016-11-04 proposed yellow 
 */
class CompilerView extends DiagramViewPart {
    
    @Accessors private CompilerViewPartListener partListener
    @Accessors private IMemento memento
    @Accessors private ToolbarSystemCombo combo
    @Accessors private System activeSystem = null 
    @Accessors private EditPartSystemManager editPartSystemManager = null
    
    private var addButtonsDelay = true
    
    // Must be initialized in the view contributions. Hence, maybe null!
    @Accessors private var SystemSelectionManager systemSelectionManager = null
    @Accessors private var DeveloperToggle developerToggle = null
    @Accessors private var ForwardResultToggle forwardResultToggle = null
    @Accessors private var AutoCompileToggle autoCompileToggle = null
    @Accessors private var VisualLayoutFeedbackToggle visualLayoutFeedbackToggle = null
    @Accessors private var SkinSelectionActions skinSelectionActions = null
    
    @Accessors private var CompilationAction compilationAction = null
    
    /**
     * {@inheritDoc}
     */
    override createPartControl(Composite parent) {
        editPartSystemManager = new EditPartSystemManager(this)
        systemSelectionManager = new SystemSelectionManager(this)
        
        super.createPartControl(parent)

        val toolBarManager = getViewSite.getActionBars.getToolBarManager
        val menuManager = getViewSite.getActionBars.getMenuManager
        
        addContributions(toolBarManager, menuManager)
        systemSelectionManager.createSystemComboList
        addButtons()

        partListener = new CompilerViewPartListener(this, parent)
    }
    
    /* Workaround for the creation order of the DiagramViewPart */
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
        compilationAction = new CompilationAction(this) 
        toolBar.add(compilationAction.action)        
       
        combo = new ToolbarSystemCombo("System Combo")
        toolBar.add(combo)
        combo.systemSelectionManager = systemSelectionManager
        
        forwardResultToggle = new ForwardResultToggle(this)
        autoCompileToggle = new AutoCompileToggle(this)
        
        developerToggle = new DeveloperToggle(this)
        developerToggle.addContributions(toolBar, menu)
        visualLayoutFeedbackToggle = new VisualLayoutFeedbackToggle(this)
        
        toolBar.add(new Separator)
        // The standard klighd view part menu entries will be inserted after this separator.    

        menu.add(forwardResultToggle.action)
        menu.add(autoCompileToggle.action)
        menu.add(new Separator)
        menu.add(visualLayoutFeedbackToggle.action)
        
        menu.add(new Separator)
        
        val MenuManager skinMenu = new MenuManager("Synthesis Skins")
        skinSelectionActions = new SkinSelectionActions(this)
        skinSelectionActions.actions.forEach[ skinMenu.add(it) ]
        menu.add(skinMenu)
        menu.add(developerToggle.action)
        
        memento?.loadCheckedValue(forwardResultToggle)
        memento?.loadCheckedValue(autoCompileToggle)
        memento?.loadCheckedValue(visualLayoutFeedbackToggle)
        memento?.loadCheckedValue(developerToggle)
        
        menu.add(new Separator)
        // The standard klighd view part menu entries will be inserted after this separator.    
    }   
    
    override init(IViewSite site, IMemento memento) {
        super.init(site, memento)
        this.memento = memento
    }
    
    override saveState(IMemento memento) {
        super.saveState(memento)
        memento.saveCheckedValue(forwardResultToggle)
        memento.saveCheckedValue(autoCompileToggle)
        memento.saveCheckedValue(visualLayoutFeedbackToggle)
        memento.saveCheckedValue(developerToggle)
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
    
    def void updateToolbar() {
        viewSite.actionBars.updateActionBars
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

    private def void loadCheckedValue(IMemento memento, AbstractAction action) {
        val setting = memento.getString(action.action.id)
        if (setting != null) {
            action.action.checked = Boolean.parseBoolean(setting)
            action.invoke
        } 
    }
    
    private def void saveCheckedValue(IMemento memento, AbstractAction action) {
        memento?.putString(action.action.id, action.action.checked.toString)
    }

    public static def IEditorPart getActiveEditor() {
        PlatformUI.getWorkbench.getActiveWorkbenchWindow.getActivePage.getActiveEditor
    } 
    
    public static def IEditorReference getActiveEditorReference() {
        val activePage = PlatformUI.getWorkbench.getActiveWorkbenchWindow.getActivePage
        val activeEditor = activePage.activeEditor
        for(reference : activePage.editorReferences) {
            val editor = reference.getEditor(false)
            if (editor?.equals(activeEditor)) return reference
        }
        return null
    }     
}