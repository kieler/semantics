/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsSynthesis
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.ViewContext

/**
 * A Synthesis that invoked the Lustre to SCCharts transformation and then invokes the SCCharts synthesis.
 * 
 * @author lgr
 *
 */
@ViewSynthesisShared
class LustreSCChartsSynthesis extends AbstractDiagramSynthesis<LustreProgram> {
    
    @Inject SCChartsSynthesis scchartsSynthesis
    
    val compilationSystemID = "de.cau.cs.kieler.lustre.scc.dataflow"
    
    override getDisplayedActions() {
        scchartsSynthesis.displayedActions
    }
    
    override getDisplayedSynthesisOptions() {
        scchartsSynthesis.displayedSynthesisOptions
    }
    
    override transform(LustreProgram model) {
        val scc = model.compile
        scchartsSynthesis.transform(scc.processorInstancesSequence.last.targetModel as SCCharts)
    }
    
    private def compile(LustreProgram lus) {
        val context = Compile.createCompilationContext(compilationSystemID, lus)
        context.startEnvironment.setProperty(Environment.INPLACE, false)
        context.compile
        
        return context
    }
    
    override use(ViewContext viewContext) {
        super.use(viewContext)
        scchartsSynthesis.use(viewContext)
    }
    
}