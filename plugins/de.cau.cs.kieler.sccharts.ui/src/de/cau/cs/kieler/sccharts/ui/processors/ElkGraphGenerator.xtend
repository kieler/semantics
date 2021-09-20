/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */

package de.cau.cs.kieler.sccharts.ui.processors

import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Module
import com.google.inject.Scopes
import com.google.inject.TypeLiteral
import de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsSynthesis
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Runs layout of a graph, however, it saves the underlying elkg graphs that would be normally generated.
 * 
 * @author sdo
 */
class ElkGraphGenerator extends AbstractCodeGenerator<SCCharts, SCCharts> {
    
    @Inject protected Injector injector

    @Accessors Map<CodeGeneratorNames, String> naming = <CodeGeneratorNames, String> newHashMap
    
    override getId() {
        "de.cau.cs.kieler.sccharts.ui.processors.codegen.kraph"
    }

    override getName() {
        "Generate KGraph Chunkies"
    }
    
    override createModuleMap(SCCharts rootModel, Map<SCCharts, CodeGeneratorModule<SCCharts, SCCharts>> moduleMap) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override process() {
        val vc = LightDiagramServices.translateModel2(this.model, null, null)
        LightDiagramServices.layoutDiagram(new LightDiagramLayoutConfig(vc));
    }
}
