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
package de.cau.cs.kieler.sccharts.ls

import com.google.inject.Injector
import de.cau.cs.kieler.language.server.ILSDiagramHighlighterContribution
import de.cau.cs.kieler.sccharts.ide.simulation.SCChartsDiagramHighlighter
import de.cau.cs.kieler.simulation.ls.LSDiagramHighlightingHandler

/**
 * @author sdo
 *
 */
class SCChartsLSDiagramHighlighterContribution implements ILSDiagramHighlighterContribution {
    
    override getHighlighter(Injector injector) {
        return LSDiagramHighlightingHandler.create(injector, SCChartsDiagramHighlighter)
    }
}
