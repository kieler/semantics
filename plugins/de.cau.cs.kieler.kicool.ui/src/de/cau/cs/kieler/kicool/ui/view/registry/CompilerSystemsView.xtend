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

import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.ZoomStyle
import de.cau.cs.kieler.klighd.ui.DiagramViewManager
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties.ZoomConfigButtonsHandling
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.progress.UIJob
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart

/**
 * The Kieler Compiler View, formerly knownas IMB Compiler View
 * 
 * @author ssm
 * @kieler.design 2018-06-01 proposed
 * @kieler.rating 2018-06-01 proposed yellow 
 */
class CompilerSystemsView extends DiagramViewPart implements IDiagramViewUpdate {
    
    public static val ID = "de.cau.cs.kieler.kicool.ui.view.compiler.systems"
    
    @Accessors CompilerSystemsViewPartListener partListener
    @Accessors KiCoolSystemsSummary summary
    
    /**
     * {@inheritDoc}
     */
    override createPartControl(Composite parent) {
        super.createPartControl(parent)

        partListener = new CompilerSystemsViewPartListener(this, parent)

        val s = new KiCoolSystemsSummary        
        summary = s.fetchAll
    }
    
    override void updateView() {
        val properties = new KlighdSynthesisProperties
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
            "de.cau.cs.kieler.kicool.ui.view.registry.KiCoolSystemsSynthesis")
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_ZOOM_CONFIG_BUTTONS_HANDLING,
                ZoomConfigButtonsHandling.HIDE)
//        properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID)
                                
        updateDiagram(summary, properties)
    }
    
    private def void updateDiagram(Object model, KlighdSynthesisProperties properties) {
        if (this.getViewer() === null || this.getViewer().getViewContext() === null) {
            val instance = this
            new UIJob("Init" + this.getClass.getName()) {

                @SuppressWarnings("deprecation")
                override IStatus runInUIThread(IProgressMonitor monitor) {
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
            "de.cau.cs.kieler.kicool.ui.view.registry.KiCoolSystemsSynthesis")
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