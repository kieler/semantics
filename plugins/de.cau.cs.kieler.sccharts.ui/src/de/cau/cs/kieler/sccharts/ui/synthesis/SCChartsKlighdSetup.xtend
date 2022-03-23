/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import de.cau.cs.kieler.klighd.IKlighdStartupHook
import de.cau.cs.kieler.klighd.KlighdDataManager
import de.cau.cs.kieler.sccharts.ui.debug.actions.SetBreakpointAction
import de.cau.cs.kieler.sccharts.ui.debug.actions.SetCheckBreakpointAction
import de.cau.cs.kieler.sccharts.ui.synthesis.actions.ReferenceExpandAction
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.LabelShorteningHook
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.LayoutHook
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.CollapseAllRegionsAction
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.ExpandAllRegionsAction
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.MemorizingExpandCollapseAction
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.ToggleDependencyAction
import de.cau.cs.kieler.sccharts.ui.synthesis.srtg.SRTGSynthesis

/**
 * Configuration of KLighD with all registrations for this bundle to work.
 * 
 * @author nre
 */
class SCChartsKlighdSetup implements IKlighdStartupHook {
    
    override execute() {
        KlighdDataManager.instance
            .registerDiagramSynthesisClass(SCChartsSynthesis.ID, SCChartsSynthesis)
            .registerDiagramSynthesisClass(SRTGSynthesis.ID, SRTGSynthesis)
            .registerDiagramSynthesisClass(ScopeSynthesis.ID, ScopeSynthesis)
            .registerDiagramSynthesisClass(SCChartsClassDiagramSynthesis.ID, SCChartsClassDiagramSynthesis)
            .registerAction(ReferenceExpandAction.ID, new ReferenceExpandAction)
            .registerAction(LabelShorteningHook.ID, new LabelShorteningHook)
            .registerAction(LayoutHook.ID, new LayoutHook)
            .registerAction(MemorizingExpandCollapseAction.ID, new MemorizingExpandCollapseAction)
            .registerAction(CollapseAllRegionsAction.ID, new CollapseAllRegionsAction)
            .registerAction(ExpandAllRegionsAction.ID, new ExpandAllRegionsAction)
            .registerAction(ToggleDependencyAction.ID, new ToggleDependencyAction)
            .registerAction(SetBreakpointAction.ID, new SetBreakpointAction)
            .registerAction(SetCheckBreakpointAction.ID, new SetCheckBreakpointAction)
            .registerBlacklistedProperty(SCChartsDiagramProperties.MODEL_TRACKER)
    }
    
}