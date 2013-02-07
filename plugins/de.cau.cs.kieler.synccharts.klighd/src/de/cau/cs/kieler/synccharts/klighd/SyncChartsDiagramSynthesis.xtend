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
import de.cau.cs.kieler.core.krendering.KPolygon
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.synccharts.TransitionType

class SyncChartsDiagramSynthesis extends AbstractTransformation<Region, KNode> {
    
    private static val KRenderingFactory factory = KRenderingFactory::eINSTANCE;
    
    @Inject
    extension KNodeExtensions
    
    @Inject
    extension KEdgeExtensions
    
    @Inject
    extension KRenderingExtensions
    
    @Inject
    extension KContainerRenderingExtensions
    
    @Inject
    extension KPolylineExtensions
    
    @Inject
    extension KColorExtensions
    
    override transform(Region model, TransformationContext<Region, KNode> transformationContext) {
        use(transformationContext);
        return model.transform();
    }

    def dispatch KNode transform(Region r) {
        return r.createNode().putToLookUpWith(r) => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
            node.addLayoutParam(LayoutOptions::DIRECTION, Direction::RIGHT);
            node.addLayoutParam(LayoutOptions::SPACING, 30f);
            node.transferAnnotationsOf(r);
            node.setNodeSize(30, 30);
            
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
                it.addVerticalLine(LEFT, 2) => [
                    it.foreground = "gray".color;
                    it.lineStyle = LineStyle::DASH;
                    it.lineWidth = 2;
                    it.invisible = true;
                    it.invisible.functionId = "de.cau.cs.kieler.synccharts.klighd.regionLineModifier";
                ];
                it.addHorizontalLine(TOP, 2) => [
                    it.foreground = "gray".color;
                    it.lineStyle = LineStyle::DASH;
                    it.lineWidth = 2;
                    it.invisible = true;
                    it.invisible.functionId = "de.cau.cs.kieler.synccharts.klighd.regionLineModifier";
                ];
                it.children += factory.createKChildArea();
            ];
        ];
    }
    
    def dispatch KNode transform(State s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            node.addLayoutParam(LayoutOptions::EXPAND_NODES, true);
            node.addLayoutParam(LayoutOptions::BORDER_SPACING, 2f);
            node.addLayoutParam(LayoutOptions::SPACING, 0f);
            node.transferAnnotationsOf(s);

            val figure = node.addRoundedRectangle(30, 30, if (s.isInitial) 4 else 2);
            (
                if (s.isFinal) figure.addRoundedRectangle(30, 30, figure.getLineWidthValue) => [
                    figure.cornerWidth = 40f;
                    figure.cornerHeight = 40f;
                    it.placementData = factory.createKAreaPlacementData() => [
                        it.topLeft = createKPosition(LEFT, 5, 0, TOP, 5, 0);
                        it.bottomRight = createKPosition(RIGHT, 5, 0, BOTTOM, 5, 0);
                    ];
                ] else figure
             ) => [
                it.childPlacement = factory.createKGridPlacement() => [
                    it.numColumns = 1;
                ];
                it.children += factory.createKText => [
                    text = s.label;
                    placementData = factory.createKGridPlacementData() => [
                        it.topLeft = createKPosition(LEFT, 15, 0, TOP, 10, 0);
                        it.bottomRight = createKPosition(RIGHT, 15, 0, BOTTOM, 10, 0);
                    ];                    
                ];
                if (!s.regions.empty) {
                    it.addHorizontalLine(TOP, 1) => [
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
        ];
    }
    
    def KEdge transformTransition(Transition t) {
        return t.createEdge().putToLookUpWith(t) => [ edge |
            edge.source = t.sourceState.node;
            edge.target = t.targetState.node;
            edge.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            edge.data += factory.createKSpline() => [
                it.lineWidth = 2;
                it.addArrowDecorator();
                switch (t.type) {
                    case TransitionType::STRONGABORT:
                        it.addStringAbortionDecorator 
                    case TransitionType::NORMALTERMINATION:
                        it.addNormalTerminationDecorator() 
                };
            ];
        ];
    }
    
    def KRendering addStringAbortionDecorator(KContainerRendering line) {
        return factory.createKEllipse() => [
            line.children += it;
            it.lineWidth = 1;
            it.background = "red".color
            it.setDecoratorPlacementData(7, 7, 0, 0, true);
        ];
    }
    
    def KPolygon addNormalTerminationDecorator(KContainerRendering line) {
        return line.drawTriangle() => [
            it.lineWidth = 1;
            it.background = "green".color
            it.setDecoratorPlacementData(8, 8, 0, 0, true);
        ];
    }
}