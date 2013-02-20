package de.cau.cs.kieler.synccharts.klighd

import javax.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.KPolygon
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.KTrigger
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.transformations.AbstractTransformation
import de.cau.cs.kieler.klighd.TransformationContext
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.synccharts.Transition
import de.cau.cs.kieler.synccharts.TransitionType
import de.cau.cs.kieler.synccharts.text.actions.ActionsStandaloneSetup
import de.cau.cs.kieler.synccharts.text.actions.scoping.ActionsScopeProvider
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.serializer.ISerializer
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KDecoratorPlacementData

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class SyncChartsDiagramSynthesis extends AbstractTransformation<Region, KNode> {
    
    private static val KRenderingFactory factory = KRenderingFactory::eINSTANCE;
    private static val Injector i = ActionsStandaloneSetup::doSetup();
    private static val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
    private static val Resource TMP_RES = i.getInstance(typeof(ResourceSet))
            .createResource(URI::createFileURI("dummy.action"));
    
    @Inject
    extension KNodeExtensions
    
    @Inject
    extension KEdgeExtensions
    
    @Inject
    extension KLabelExtensions
    
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
            node.addLayoutParam(LayoutOptions::SPACING, 40f);
            if (r.states.size > 1) {
                // node.addLayoutParam(KlighdConstants::EXPAND, false);
            }
            node.transferAnnotationsOf(r);
            
            for (s : r.states) node.children += s.transform;
                        
            if (r.eContainer == null) {
                return;
            }
            
            node.data += factory.createKRectangle() => [
                it.invisible = true;
                // it.invisible = false;
                it.foreground = "red".color;
                it.children += factory.createKText => [
                    it.foreground = "gray".color
                    it.text = "Region:";
                    it.setPointPlacementData(createKPosition(LEFT, 1, 0, TOP, 0, 0), H_LEFT, V_TOP, 10, 10);
                    // it.actions +=
                    factory.createKExpandAction() => [
                        it.trigger = KTrigger::DOUBLECLICK;
                        it.id = KlighdConstants::ACTION_COLLAPSE_EXPAND; 
                    ];
                ];
                it.addVerticalLine(LEFT, 1) => [
                    it.lineStyle = LineStyle::DASH;
                    it.lineWidth = 1;
                    it.invisible = true;
                    it.invisible.functionId = "de.cau.cs.kieler.synccharts.klighd.regionLineModifier";
                ];
                it.addHorizontalLine(TOP, 1) => [
                    it.lineStyle = LineStyle::DASH;
                    it.lineWidth = 1;
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

            val figure = node.addRoundedRectangle(30, 30, if (s.isInitial) 4 else 1);
            (
                if (s.isFinal) figure.addRoundedRectangle(30, 30) => [
                    it.styleRef = figure;
                    val offset = figure.lineWidthValue + 2;
                    figure.setCornerSize(offset + 34f, offset + 34f)
                    it.setAreaPlacementData().from(LEFT, offset, 0, TOP, offset, 0).to(RIGHT, offset, 0, BOTTOM, offset, 0);
                ] else figure
             ) => [
                it.setGridPlacement(1);
                it.children += factory.createKText().putToLookUpWith(s) => [
                    val vSpace = 8 + figure.lineWidthValue;
                    it.text = s.label;
                    it.background = "white".color;
                    it.setGridPlacementData().setMaxCellHeight(40).from(LEFT, 15, 0, TOP, vSpace, 0).to(RIGHT, 15, 0, BOTTOM, vSpace, 0);
                ];
                if (!s.signals.empty) {
                    it.children += factory.createKRectangle => [
                        it.invisible = true;
                        it.setGridPlacementData.setMaxCellHeight(40);
                        it.setGridPlacement(s.signals.size + 2);
                        it.children += factory.createKText() => [
                            text = "Signals:"
                            it.setGridPlacementData.from(LEFT, 5, 0, TOP, 0, 0).to(RIGHT, 2, 0, BOTTOM, 5, 0);
                        ];
                        for (sig : s.signals) {
                            it.children += factory.createKText() => [
                                it.text = sig.name + ";";
                                it.setGridPlacementData.from(LEFT, 5, 0, TOP, 0, 0).to(RIGHT, 2, 0, BOTTOM, 5, 0);
                            ];
                        }
                        it.children += factory.createKRectangle() => [
                            it.invisible = true;
                        ];
                    ];
                }
                
                if (!s.regions.empty) {
                    it.addHorizontalLine(1) => [
                        it.lineWidth = 1;
                        it.setGridPlacementData().maxCellHeight = 1;
                    ];
                    
                    it.children += factory.createKChildArea() => [
                        it.setGridPlacementData() //.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                    ];
                }
            ];

            for (r : s.regions) node.children += r.transform;
            
            for (t : s.outgoingTransitions) t.transformTransition();
        ];
    }
    
    def KEdge transformTransition(Transition t) {
        return t.createEdge().putToLookUpWith(t) => [ edge |
            edge.source = t.sourceState.node;
            edge.target = t.targetState.node;
            edge.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            edge.addSpline() => [
                it.lineWidth = 2;
                it.addArrowDecorator() => [
                    if (t.isHistory) {
                        it.parent.addHistoryDecorator();
                        (it.placementData as KDecoratorPlacementData).absolute = -15.0f;
                    }
                ];
                switch (t.type) {
                    case TransitionType::STRONGABORT:
                        it.addStrongAbortionDecorator 
                    case TransitionType::NORMALTERMINATION:
                        it.addNormalTerminationDecorator() 
                };
            ];

            scopeProvider.parent = t.sourceState;
            val label = serializer.serialize(t.copy => [
                    TMP_RES.contents.clear;
                    TMP_RES.contents += it;
            ]);
            t.createLabel(edge).putToLookUpWith(t).configureCenteralLabel(
                label, 11, KlighdConstants::DEFAULT_FONT_NAME
            );
            t.createLabel("prio", edge).putToLookUpWith(t).configureTailLabel(String::valueOf(
                if (t.priority != 0) t.priority else t.sourceState.outgoingTransitions.indexOf(t)
            ), 11, KlighdConstants::DEFAULT_FONT_NAME); 
        ];
    }
    
    def KRendering addStrongAbortionDecorator(KPolyline line) {
        return factory.createKEllipse() => [
            line.children += it;
            it.lineWidth = 1;
            it.background = "red".color
            it.setDecoratorPlacementData(7, 7, 3, 0, false);
        ];
    }
    
    def KPolygon addNormalTerminationDecorator(KPolyline line) {
        return line.drawTriangle() => [
            it.lineWidth = 1;
            it.background = "green".color
            it.setDecoratorPlacementData(8, 8, 4, 0, true);
        ];
    }
    
    def KRendering addHistoryDecorator(KContainerRendering line) {
        return factory.createKEllipse() => [
            line.children += it;
            it.lineWidth = 1;
            it.background = "gray".color
            it.setDecoratorPlacementData(12, 12, -6, 1, false);
            it.children += factory.createKPolyline() => [
                it.lineWidth = 1f;
                it.points += createKPosition(LEFT, 4, 0, TOP, 3, 0);
                it.points += createKPosition(LEFT, 4, 0, BOTTOM, 3, 0);
                it.points += createKPosition(LEFT, 4, 0, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 4, 0, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 4, 0, BOTTOM, 3, 0);
                it.points += createKPosition(RIGHT, 4, 0, TOP, 3, 0);
            ];
        ];
    }
}
