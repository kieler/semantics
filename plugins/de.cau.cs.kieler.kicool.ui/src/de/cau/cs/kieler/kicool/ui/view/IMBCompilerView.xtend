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
import org.eclipse.swt.events.DisposeEvent
import org.eclipse.swt.events.DisposeListener
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IPartListener2
import org.eclipse.ui.IWorkbenchPartReference
import org.eclipse.ui.part.EditorPart
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI
import org.eclipse.core.runtime.IStatus
import de.cau.cs.kieler.klighd.ui.DiagramViewManager
import org.eclipse.ui.progress.UIJob
import de.cau.cs.kieler.kico.ui.KiCoSelectionView
import org.eclipse.core.runtime.Status
import de.cau.cs.kieler.klighd.ViewContext
import org.eclipse.core.runtime.IProgressMonitor
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.Separator
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.jface.resource.ImageDescriptor
import de.cau.cs.kieler.kicool.ui.view.actions.CompilationAction
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2016-11-04 proposed
 * @kieler.rating 2016-11-04 proposed yellow * 
 */
class IMBCompilerView extends DiagramViewPart {
    

    
    /** The action for toggling the smart system select. */
    private Action smartSystemSelectionToggleAction;
    private static final boolean SMART_SYSTEM_SELECTION_TOGGLE_ACTION_DEFAULT = true;
    
    /** The action for toggling the debug mode. */
    private Action debugToggleAction;
    private static final boolean DEBUG_TOGGLE_ACTION_DEFAULT = true;
    
    
    @Accessors private ToolbarSystemCombo combo
    
    
    private var addButtonsDelay = true
    
    private var SystemSelectionManager systemSelectionManager 
    
    /**
     * {@inheritDoc}
     */
    public override createPartControl(Composite parent) {
        super.createPartControl(parent)

        val bars = getViewSite.getActionBars
        val toolBarManager = bars.getToolBarManager
        val menuManager = getViewSite().getActionBars().getMenuManager();
        addContributions(toolBarManager, menuManager);
        addButtons();

        // Create an IPartListener2
        val pl = new IPartListener2() {
            public override void partOpened(IWorkbenchPartReference partRef) {
                val part = partRef.getPart(false)
                if (part != null) {
                    if (part instanceof IMBCompilerView) {
                        updateView(partRef.getPage().getReference(
                                partRef.getPage().getActiveEditor()));
                    }
                }
            }
            public override void partClosed(IWorkbenchPartReference partRef) {
                updateViewOnClose(partRef);
            }
            public override void partActivated(IWorkbenchPartReference ref) {
                updateView(ref);
            }
            public override void partVisible(IWorkbenchPartReference partRef) {}
            public override void partInputChanged(IWorkbenchPartReference partRef) {}
            public override void partHidden(IWorkbenchPartReference partRef) {}
            public override void partDeactivated(IWorkbenchPartReference partRef) {}
            public override void partBroughtToTop(IWorkbenchPartReference partRef) {}
        }

        val page = this.getSite().getPage()
        page.addPartListener(pl);

        parent.addDisposeListener(new DisposeListener {
            public override void widgetDisposed(DisposeEvent e) {
                page.removePartListener(pl);
            }
        });
        
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
    public def void addContributions(IToolBarManager toolBar, IMenuManager menu) {
        
        // Compile

        toolBar.add(new CompilationAction(this).compileAction)        
       
        combo = new ToolbarSystemCombo("System Combo")
        toolBar.add(combo)
        systemSelectionManager = new SystemSelectionManager(this)
        
        toolBar.add(new Separator())
        // The standard klighd view part buttons will be inserted after this separator. 

        menu.add(new Separator())
        
        // Smart System Selection
        smartSystemSelectionToggleAction = new Action("Smart System Selection", IAction.AS_CHECK_BOX) {
            override void run() {
                // Implement me!
            }
        }
        smartSystemSelectionToggleAction.setId("smartSystemSelectionToggleAction")
        smartSystemSelectionToggleAction.setText("Smart System Toggle")
        smartSystemSelectionToggleAction.setToolTipText("Selects the appropriate system automatically depending on " + 
            "the pragma, the filename, and the selected system.")
        smartSystemSelectionToggleAction.setChecked(SMART_SYSTEM_SELECTION_TOGGLE_ACTION_DEFAULT)
        menu.add(smartSystemSelectionToggleAction)
        
        // Smart System Selection
        debugToggleAction = new Action("Debug Mode", IAction.AS_CHECK_BOX) {
            override void run() {
                // Implement me!
            }
        }
        debugToggleAction.setId("debugToggleAction")
        debugToggleAction.setText("Debug Mode")
        debugToggleAction.setToolTipText("Sets the system to debug mode meaning that each processor step and each " + 
            "intermediate result will be saved during processing.")
        debugToggleAction.setChecked(DEBUG_TOGGLE_ACTION_DEFAULT)
        menu.add(debugToggleAction)
        
    }    
    

    private def void updateView() {
        val properties = new KlighdSynthesisProperties();
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
            "de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis");
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_ZOOM_CONFIG_BUTTONS_HANDLING,
                ZoomConfigButtonsHandling.HIDE);
                
        val String location = combo.selectedText            
        val systemModel = KiCoolRegistration.getProcessorSystemModel(location)
        
        updateDiagram(systemModel, properties)

//        updateSelectionTransformationVisualization(activeEditorID);
//        notifySelectionChangeEventListener();
    }


    /**
     * Update view.
     * 
     * @param ref
     *            the ref
     */
    public def void updateView(IWorkbenchPartReference ref) {
        if (ref != null) {
            val part = ref.getPart(true)
            val editorTypeID = ref.getId()
            if (part instanceof EditorPart) {
                val editorPart = part
                val currentPartName = editorPart.getPartName
                
//                updateCompileChainCombo(editorTypeID, currentEditorId);
                updateView()
            }
        }
    }


    /**
     * Update view on close clears the cache for registered Editors to ensure that if you open the
     * model again no strange behavior occurs.
     * 
     * @param ref
     *            the ref
     */
    public def void updateViewOnClose(IWorkbenchPartReference ref) {
        if (ref != null) {
            val part = ref.getPart(true)
            if (part instanceof EditorPart) {
                val editorPart = part
            }
        }
    }



    public static def IEditorPart getActiveEditor() {
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .getActiveEditor();
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
            }.schedule();
        } else {
            // update case
            val viewContext = this.getViewer().getViewContext();
            viewContext.configure(properties);
            DiagramViewManager.updateView(viewContext, model);
        }
    }    
    
}