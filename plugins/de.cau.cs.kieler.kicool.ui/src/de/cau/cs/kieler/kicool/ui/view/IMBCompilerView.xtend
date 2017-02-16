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
import java.util.List
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

/**
 * @author ssm
 * @kieler.design 2016-11-04 proposed
 * @kieler.rating 2016-11-04 proposed yellow * 
 */
class IMBCompilerView extends DiagramViewPart {
    
    private ToolbarSystemCombo combo
    
    
    /**
     * {@inheritDoc}
     */
    public override createPartControl(Composite parent) {
        super.createPartControl(parent)

        val bars = getViewSite.getActionBars
        val toolBarManager = bars.getToolBarManager
        combo = new ToolbarSystemCombo("System Combo")
        toolBarManager.add(combo)
        combo.items.clear
        KiCoolRegistration.getRegisteredSystems.forEach[combo.items.add(it)]
        combo.update(0)

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
    

    private def void updateView() {
        val properties = new KlighdSynthesisProperties();
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
            "de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis");
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_ZOOM_CONFIG_BUTTONS_HANDLING,
                ZoomConfigButtonsHandling.HIDE);
                
        
//        updateDiagram(systemModel, properties);
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