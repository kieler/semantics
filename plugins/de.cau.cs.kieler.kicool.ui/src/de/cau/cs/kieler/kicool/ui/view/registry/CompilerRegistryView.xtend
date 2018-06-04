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
package de.cau.cs.kieler.kicool.ui.view.registry

import de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis
import de.cau.cs.kieler.kicool.ui.view.actions.AbstractAction
import de.cau.cs.kieler.kicool.ui.view.actions.AutoCompileToggle
import de.cau.cs.kieler.kicool.ui.view.actions.CompilationAction
import de.cau.cs.kieler.kicool.ui.view.actions.CompileInplaceToggle
import de.cau.cs.kieler.kicool.ui.view.actions.CompileTracingToggle
import de.cau.cs.kieler.kicool.ui.view.actions.DebugEnvironmentModelsToggle
import de.cau.cs.kieler.kicool.ui.view.actions.DeveloperToggle
import de.cau.cs.kieler.kicool.ui.view.actions.FlattenSystemViewToggle
import de.cau.cs.kieler.kicool.ui.view.actions.ForwardResultToggle
import de.cau.cs.kieler.kicool.ui.view.actions.ShowPrivateSystemsToggle
import de.cau.cs.kieler.kicool.ui.view.actions.SkinSelectionActions
import de.cau.cs.kieler.kicool.ui.view.actions.VisualLayoutFeedbackToggle
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.ZoomStyle
import de.cau.cs.kieler.klighd.ui.DiagramViewManager
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties.ZoomConfigButtonsHandling
import java.util.List
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.MenuManager
import org.eclipse.jface.action.Separator
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IMemento
import org.eclipse.ui.IViewSite
import org.eclipse.ui.progress.UIJob
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy

/**
 * The Kieler Compiler View, formerly knownas IMB Compiler View
 * 
 * @author ssm
 * @kieler.design 2018-06-01 proposed
 * @kieler.rating 2018-06-01 proposed yellow 
 */
class CompilerRegistryView extends DiagramViewPart {
    
    public static val ID = "de.cau.cs.kieler.kicool.ui.view.compiler.registry"
    
    @Accessors private CompilerRegistryViewPartListener partListener
    
    /**
     * {@inheritDoc}
     */
    override createPartControl(Composite parent) {
        super.createPartControl(parent)

        partListener = new CompilerRegistryViewPartListener(this, parent)
    }
    
    def void updateView() {
        val properties = new KlighdSynthesisProperties
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
            "de.cau.cs.kieler.kicool.ui.view.registry.KiCoolRegistrySynthesis")
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_ZOOM_CONFIG_BUTTONS_HANDLING,
                ZoomConfigButtonsHandling.HIDE)
//        properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID)
                                
        updateDiagram((new KiCoolRegistrySummary).fetchAll, properties)
    }
    
    private def void updateDiagram(Object model, KlighdSynthesisProperties properties) {
        if (this.getViewer() === null || this.getViewer().getViewContext() === null) {
            val instance = this
            new UIJob("Init" + this.getClass.getName()) {

                @SuppressWarnings("deprecation")
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
    
    def void reinitializeDiagram(Object model) {
        val properties = new KlighdSynthesisProperties
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
            "de.cau.cs.kieler.kicool.ui.view.registry.KiCoolRegistrySynthesis")
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_ZOOM_CONFIG_BUTTONS_HANDLING,
                ZoomConfigButtonsHandling.HIDE)
//        properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID)
                                
        DiagramViewManager.initializeView(this, model, null, properties);
    }    
    
    def void doLayout(boolean zoomToFit) {
        val layoutConfig = new LightDiagramLayoutConfig(viewContext)
        layoutConfig.zoomStyle(if (zoomToFit) ZoomStyle.ZOOM_TO_FIT else ZoomStyle.NONE)
        layoutConfig.performLayout           
    }

}