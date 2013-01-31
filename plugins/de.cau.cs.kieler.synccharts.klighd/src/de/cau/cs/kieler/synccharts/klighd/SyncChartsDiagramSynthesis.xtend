package de.cau.cs.kieler.synccharts.klighd

import de.cau.cs.kieler.klighd.transformations.AbstractTransformation
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.klighd.TransformationContext
import de.cau.cs.kieler.synccharts.Scope
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import javax.inject.Inject

class SyncChartsDiagramSynthesis extends AbstractTransformation<Region, KNode> {
    
    @Inject
    extension KNodeExtensions
    
    override transform(Region model, TransformationContext<Region, KNode> transformationContext) {
        return model.transform();
    }

    def dispatch KNode transform(State s) {
        return s.createNode() => [ node |
            s.regions.forEach[
               node.children += it.transform.setNodeSize(50f, 50f);
            ];            
        ];
    }
    
    def dispatch KNode transform(Region r) {
        return r.createNode() => [ node |
            r.states.forEach[
               node.children += it.transform.setNodeSize(50f, 50f);
            ];            
        ];
    }
    
}