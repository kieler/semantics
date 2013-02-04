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
import de.cau.cs.kieler.synccharts.Transition
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting

class SyncChartsDiagramSynthesis extends AbstractTransformation<Region, KNode> {
    
    private static val KRenderingFactory factory = KRenderingFactory::eINSTANCE;
    
    @Inject
    extension KNodeExtensions
    
    @Inject
    extension KEdgeExtensions
    
    @Inject
    extension KRenderingExtensions
    
    @Inject
    extension KPolylineExtensions
    
    @Inject
    extension KColorExtensions
    
    override transform(Region model, TransformationContext<Region, KNode> transformationContext) {
         val node = model.transform();
        return node;
    }

    def dispatch KNode transform(Region r) {
        return r.createNode() => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
            node.addLayoutParam(LayoutOptions::DIRECTION, Direction::RIGHT);
            node.transferAnnotationsOf(r);
            r.states.forEach[
               node.children += it.transform;
            ];            
            
            if (r.eContainer == null) {
                return;
            }
            
            node.data += factory.createKRectangle() => [
                it.styles += factory.createKInvisibility();
                it.foreground = factory.createKForeground() =>[
                    it.color = "white".color;
                    it.alpha = 0;
                ];
                it.children += factory.createKPolyline() => [
                    points += createKPosition(LEFT, 0, 0, TOP, 0, 0);
                    points += createKPosition(LEFT, 0, 0, BOTTOM, 0, 0);
                    it.foreground = "gray".color;
                    it.lineStyle = LineStyle::DASH;
                    it.lineWidth = 3;
                    it.invisible = true;
                    it.invisible.functionId = "de.cau.cs.kieler.synccharts.klighd.regionLineModifier";
                ];
                it.children += factory.createKPolyline() => [
                    points += createKPosition(LEFT, 0, 0, TOP, 0, 0);
                    points += createKPosition(RIGHT, 0, 0, TOP, 0, 0);
                    it.foreground = "gray".color;
                    it.lineStyle = LineStyle::DASH;
                    it.lineWidth = 3;
                    it.invisible = true;
                    it.invisible.functionId = "de.cau.cs.kieler.synccharts.klighd.regionLineModifier";
                ];
                it.children += factory.createKChildArea();
            ];
        ];
    }
    
    def dispatch KNode transform(State s) {
        return s.createNode() => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            node.addLayoutParam(LayoutOptions::EXPAND_NODES, true);
            node.addLayoutParam(LayoutOptions::BORDER_SPACING, 2f);
            node.addLayoutParam(LayoutOptions::SPACING, 0f);
            node.transferAnnotationsOf(s);

            val figure = node.addRoundedRectangle(30, 30, if (s.isInitial) 4 else 2);
            
            (
                if (s.isFinal) factory.createKRoundedRectangle => [
                    figure.children += it;
                    it.cornerWidth = 20f;
                    it.cornerHeight = 20f;
                    it.lineWidth = if (s.isInitial) 4 else 2;
                    it.placementData = factory.createKAreaPlacementData() => [
                        it.topLeft = createKPosition(LEFT, 5, 0, TOP, 5, 0);
                        it.bottomRight = createKPosition(RIGHT, 5, 0, BOTTOM, 5, 0);
                    ];
                ] else figure
             ) => [
                
                
                it.childPlacement = factory.createKGridPlacement() => [
                    numColumns = 1;
                ];
                it.children += factory.createKText => [
                    text = s.label;
                    placementData = factory.createKGridPlacementData() => [
                        it.topLeft = createKPosition(LEFT, 15, 0, TOP, 5, 0);
                        it.bottomRight = createKPosition(RIGHT, 15, 0, BOTTOM, 5, 0);
                    ];                    
                ];
                if (!s.regions.empty) {
                    //add line between title and childarea
                        it.children += factory.createKPolyline() => [
                        it.points += createKPosition(LEFT, 0, 0, TOP, 0, 0);
                        it.points += createKPosition(RIGHT, 1, 0, TOP, 0, 0);
                        it.foreground = "black".color;
                        it.lineWidth = 2;
                        it.placementData = factory.createKGridPlacementData() => [
                            maxCellHeight = 1;
                            minCellHeight = 1;
                        ];
                    ];
                    
                    //add childArea itself
                    it.children += factory.createKChildArea() => [
                        it.placementData = factory.createKGridPlacementData() => [
                            it.topLeft = createKPosition(LEFT, 0, 0, TOP, 0, 0);
                            it.bottomRight = createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0);
                        ];
                    ];
                }
            ];

            s.regions.forEach[
                node.children += it.transform;
            ];
            
            s.outgoingTransitions.forEach[
                it.transformTransition();
            ];
        ]
    }
    
    def KEdge transformTransition(Transition t) {
        return t.createEdge() => [ edge |
            edge.source = t.sourceState.node;
            edge.target = t.targetState.node;
            edge.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            edge.data += factory.createKSpline() => [                
                it.lineWidth = 2;
                it.addArrowDecorator();
            ];
        ];
    }    
}