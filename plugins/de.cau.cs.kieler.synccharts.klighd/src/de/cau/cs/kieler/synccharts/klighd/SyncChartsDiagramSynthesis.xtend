package de.cau.cs.kieler.synccharts.klighd

import de.cau.cs.kieler.klighd.transformations.AbstractTransformation
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.klighd.TransformationContext
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import javax.inject.Inject
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.LineStyle

class SyncChartsDiagramSynthesis extends AbstractTransformation<Region, KNode> {
    
    private static val KRenderingFactory factory = KRenderingFactory::eINSTANCE;
    
    @Inject
    extension KNodeExtensions
    
    @Inject
    extension KRenderingExtensions
    
    @Inject
    extension KColorExtensions
    
    override transform(Region model, TransformationContext<Region, KNode> transformationContext) {
         val node = model.transform();
        return node;
    }

    def dispatch KNode transform(State s) {
        return s.createNode() => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            node.addLayoutParam(LayoutOptions::EXPAND_NODES, true);
            node.addLayoutParam(LayoutOptions::BORDER_SPACING, 2f);
            node.addLayoutParam(LayoutOptions::SPACING, 0f);

            node.addRoundedRectangle(30, 30, 2) => [
                it.childPlacement = factory.createKGridPlacement() => [
                    numColumns = 1;
                ];
                it.children += factory.createKText => [
                    text = s.label;
                    placementData = factory.createKGridPlacementData() => [
                        it.minCellHeight = 40;
                        it.minCellWidth = 100;
//                        it.maxCellHeight = 60;
                        it.topLeft = createKPosition(LEFT, 15, 0, TOP, 15, 0);
                        it.bottomRight = createKPosition(RIGHT, 15, 0, BOTTOM, 15, 0);
                    ];                    
                ];
                it.children += factory.createKPolyline() => [
                    it.points += createKPosition(LEFT, 0, 0, TOP, 0, 0);
                    it.points += createKPosition(RIGHT, 0, 0, TOP, 0, 0);
                    it.foreground = "black".color;
                    it.lineWidth = 2;
                    it.placementData = factory.createKGridPlacementData() => [
                        maxCellHeight = 1;
                        minCellHeight = 1;
                    ];
                ];
//                it.children += factory.createKChildArea() => [
//                    it.placementData = factory.createKGridPlacementData() => [
//                        it.topLeft = createKPosition(LEFT, 0, 0, TOP, 0, 0);
//                        it.bottomRight = createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0);
//                    ];
//                ];
            ];

            s.regions.forEach[
               node.children += it.transform.setNodeSize(30f, 30f);
            ];            
        ];
    }
    
    def dispatch KNode transform(Region r) {
        return r.createNode() => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");

            r.states.forEach[
               node.children += it.transform;//.setNodeSize(30f, 30f);
            ];            
            
            if (r.eContainer == null) {
                return;
            }
            
            node.data += factory.createKRectangle() => [
                it.styles += factory.createKInvisibility();
                it.foreground = "white".color;
                it.children += factory.createKPolyline() => [
                    points += createKPosition(LEFT, 0, 0, TOP, 0, 0);
                    points += createKPosition(LEFT, 0, 0, BOTTOM, 0, 0);
                    it.foreground = "black".color;
                    it.lineStyle = LineStyle::DASH;
                    it.lineWidth = 3;
                    it.lineWidth.functionId = "de.cau.cs.kieler.synccharts.klighd.regionLineModifier";
                ];
                it.children += factory.createKPolyline() => [
                    points += createKPosition(LEFT, 0, 0, TOP, 0, 0);
                    points += createKPosition(RIGHT, 0, 0, TOP, 0, 0);
                    it.foreground = "black".color;
                    it.lineStyle = LineStyle::DASH;
                    it.lineWidth = 3;
                    it.lineWidth.functionId = "de.cau.cs.kieler.synccharts.klighd.regionLineModifier";
                ];
                it.children += factory.createKChildArea();
            ]
        ];
    }
    
}