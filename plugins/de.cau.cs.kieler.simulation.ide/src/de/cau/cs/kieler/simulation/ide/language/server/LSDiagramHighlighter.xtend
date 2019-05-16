/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ide.language.server

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.ide.language.server.KiCoolLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ide.visualization.IdeDiagramHighlighter
import de.cau.cs.kieler.klighd.lsp.SprottyViewer
import de.cau.cs.kieler.klighd.ZoomStyle

/**
 * @author sdo
 *
 */
abstract class LSDiagramHighlighter extends IdeDiagramHighlighter {
    
    /**
     * Compiler LS extension to access the compilation snapshots, namely the simulation executable.
     */
    @Inject extension KiCoolLanguageServerExtension kicool

    @Inject extension KGraphLanguageServerExtension kgraphExt
    
    override update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof SimulationControlEvent) {
            diagramModel = getDiagramModel
            // If there is no model in the diagram, then there is nothing to highlight
            if(diagramModel === null) {
                return;
            }
            show(lastUri, lastClientId, -1)
        }
    }
    
    override protected getDiagramViewContext() {
        if (diagramState === null) {
            return null
        }
        return diagramState.getKGraphContext(lastUri)
        
    }
    
    override protected startDiagramBatchUpdate() {
        val viewer = diagramViewContext.viewer
        if (viewer instanceof SprottyViewer) {
            // handle this
        }
    }
    
    override protected applyDiagramBatchUpdate() {
        val viewer = diagramViewContext.viewer
        if(viewer instanceof SprottyViewer) {
            viewer.zoom(ZoomStyle.NONE, 0)
        }
    }
    
}