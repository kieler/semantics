/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd

import com.google.common.collect.ImmutableMap
import com.google.common.collect.ImmutableSet
import com.google.inject.Injector
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.core.krendering.KPolygon
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.TransformationOption
import de.cau.cs.kieler.klighd.transformations.AbstractDiagramSynthesis
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.text.actions.ActionsStandaloneSetup
import de.cau.cs.kieler.sccharts.text.actions.scoping.ActionsScopeProvider
import java.util.Collection
import java.util.List
import javax.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.serializer.ISerializer

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.krendering.KColor

class SCChartsDiagramSynthesis extends AbstractDiagramSynthesis<Region> {
    
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
    
    private static val TransformationOption SHOW_LABELS
        = TransformationOption::createCheckOption("Transition labels", true);
        
//    private static val TransformationOption SHOW_PRIORITY_LABELS
//        = TransformationOption::createCheckOption("Transition priorities", false);

    private static val TransformationOption SHOW_SIGNAL_DECLARATIONS
        = TransformationOption::createCheckOption("Declarations", true);

    override public getTransformationOptions() {
        return ImmutableSet::of(SHOW_SIGNAL_DECLARATIONS, SHOW_LABELS );
    }
    
    override public getRecommendedLayoutOptions() {
        return ImmutableMap::<IProperty<?>, Collection<?>>of(
            LayoutOptions::ALGORITHM, emptyList,
            LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[ it.name ],
            LayoutOptions::SPACING, newArrayList(0, 255)
        );
    }
    
    override transform(Region model) {
        return model.translate();
    }
    
    
    private static val float REGION_DASH_BLACK = 10;
    private static val float REGION_DASH_WHITE = 5;
    private static val List<Float> REGION_DASH_PATTERN = newArrayList(REGION_DASH_BLACK, REGION_DASH_WHITE); 
    private static val float TRANSITION_DASH_BLACK = 7;
    private static val float TRANSITION_DASH_WHITE = 3;
    private static val List<Float> TRANSITION_DASH_PATTERN = newArrayList(TRANSITION_DASH_BLACK, TRANSITION_DASH_WHITE); 

    private static val KColor SCCHARTSGRAY = RENDERING_FACTORY.createKColor()=>[it.red=240;it.green=240;it.blue=240];
    private static val KColor SCCHARTSBLUE1 = RENDERING_FACTORY.createKColor()=>[it.red=248;it.green=249;it.blue=253];
    private static val KColor SCCHARTSBLUE2 = RENDERING_FACTORY.createKColor()=>[it.red=205;it.green=220;it.blue=243];
    
    


    def dispatch KNode translate(Region r) {
        return r.createNode().putToLookUpWith(r) => [ node |
            // node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
            // node.setLayoutOption(LayoutOptions::DIRECTION, Direction::RIGHT);
            // node.setLayoutOption(LayoutOptions::SPACING, 40f);
            if (r.states.size > 1) {
                //node.setLayoutOption(KlighdConstants::EXPAND, false);
            }

            for (s : r.states) {
                node.children += s.translate;
            }

            if (r.eContainer == null) {
                return;
            }
            
            node.addRectangle() => [
                it.setBackgroundGradient("white".color, SCCHARTSGRAY, 90);
                it.setSurroundingSpace(7,0);
                it.invisible = false;
                it.lineWidth = 0;
                // it.invisible = false;
                //it.foreground = "red".color;
                it.addText("Region:" + if (r.label.nullOrEmpty) "" else " "+r.label).putToLookUpWith(r) => [
                    it.foreground = "gray".color
                    it.fontSize = 10                  
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                it.addVerticalLine(LEFT, 1, 1) => [
                    it.lineStyle = LineStyle::CUSTOM;
                    it.lineStyle.dashPattern.clear;
                    it.lineStyle.dashPattern += REGION_DASH_PATTERN;
                    it.invisible = true;
                    it.invisible.modifierId = "de.cau.cs.kieler.sccharts.klighd.regionLineModifier";
                ];
                it.addHorizontalLine(TOP, 1, 1) => [
                    it.lineStyle = LineStyle::CUSTOM;
                    it.lineStyle.dashPattern.clear;
                    it.lineStyle.dashPattern += REGION_DASH_PATTERN;
                    it.invisible = true;
                    it.invisible.modifierId = "de.cau.cs.kieler.sccharts.klighd.regionLineModifier";
                ];
                it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
            ];
        ];
    }
    
    def dispatch KNode translate(State s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);

            val conditional = s.type == StateType::CONDITIONAL;
            val simpleState = s.valuedObjects.empty && s.regions.empty;
            val cornerRadius = if (conditional) 10 else if (simpleState) 17 else 8;
            val lineWidth = if (s.isInitial && s.isFinal) 2.1f else if (s.isInitial) 4 else 1;

            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth)
                .background = "white".color;
            (
                if (conditional) figure => [
                    it.background = "black".color;
                    it.addArc => [
                        it.foreground = "white".color;
                        it.startAngle = 45;
                        it.arcAngle = 270;
                        it.lineWidth = 2;
                        it.setSurroundingSpace(0, 0.3f);
                    ];
                    node.setNodeSize(20,20);
                ] else if (s.isFinal) figure.addRoundedRectangle(cornerRadius, cornerRadius) => [
                    // re-configure the outer rounded rectangle
                    val offset = figure.lineWidthValue + 3;
                    figure.setCornerSize(offset + cornerRadius, offset + cornerRadius)
                    figure.lineWidth = 2;

                    // configure the inner one
                    it.background = "white".color;
                    it.styleRef = figure;
                    it.lineWidth = 2;
                    it.setAreaPlacementData().from(LEFT, offset, 0, TOP, offset, 0).to(RIGHT, offset, 0, BOTTOM, offset, 0);
                ] else figure
                
             ) => [
                node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
                it.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);
                it.shadow = "black".color;
                if (conditional) {
                    return;
                }
                
                if (!simpleState) {
                    it.setGridPlacement(1);
                } 
                
                
                 if (!s.regions.empty) {
                    // Get a smaller window-title-bare if this a macro state 
                    it.addText(s.label).putToLookUpWith(s) => [
                        it.fontSize = 10;
                        it.setFontBold(true);
                        it.setGridPlacementData().setMaxCellHeightEx(40)
                            .from(LEFT, 0, 0, TOP, 0f, 0)
                            .to(RIGHT, 10, 0, BOTTOM, 0, 0);
                    ];
                 }
                 else {
                    // For simple states we want a larger area 
                    it.addText(s.label).putToLookUpWith(s) => [
                        it.fontSize = 10;
                        it.setFontBold(true);
                        it.setGridPlacementData().setMaxCellHeightEx(40)
                            .from(LEFT, 10, 0, TOP, 9f, 0)
                            .to(RIGHT, 10, 0, BOTTOM, 10, 0);
                    ];
                 }
                
                        //it.setGridPlacementData.setMaxCellHeight(40);
                        //it.setGridPlacement(s.valuedObjects.size + 2);
//                        it.addText("Signals:")
//                            .setGridPlacementData.from(LEFT, 5, 0, TOP, 0, 0).to(RIGHT, 2, 0, BOTTOM, 5, 0);

                                //it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                                //.setPointPlacementData() (LEFT, 0, 0, TOP, 0, i2)//.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                
                if (SHOW_SIGNAL_DECLARATIONS.optionBooleanValue && !s.valuedObjects.empty) {
                        for (sig : s.valuedObjects) {
                    it.addRectangle => [
                    //it.background = "white".color;
                        it.invisible = true;
                            var declaration = "";
                            if (sig.isInput) {
                                declaration = declaration + "input ";
                            }
                            if (sig.isOutput) {
                                declaration = declaration + "output "
                            }
                            if (sig.isSignal) {
                                declaration = declaration + "signal ";
                            }
                            if (sig.isStatic) {
                                declaration = declaration + "static ";
                            }
                            if (declaration.equals("")) {
                                it.addText(sig.name + ";")
                            }
                            else {
                                it.addText(declaration.trim + " " + sig.name + ";") => [
                                    it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 0, 0, 0, 0);
                                    it.putToLookUpWith(sig);
                                ]
                            }
                            it.addRectangle().invisible = true;
                    ];
                        }
                }
                
                if (!s.regions.empty) {
                    it.addHorizontalLine(1, 1)
                        .setGridPlacementData() //.from(LEFT, 0, 0, TOP, 30, 0).to(RIGHT, 0, 0, TOP, 30, 0)
                        .maxCellHeight = 1;                        
                    
                    it.addChildArea().setGridPlacementData() => [
                        from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0)
                        minCellHeight = 20;
                    ];
                }
            ];

            for (r : s.regions) node.children += r.translate;
            
            for (t : s.outgoingTransitions) t.translateTransition();
        ];
    }
    
    def KEdge translateTransition(Transition t) {
        return t.createEdge().putToLookUpWith(t) => [ edge |
            edge.source = t.sourceState.node;
            edge.target = t.targetState.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            
            edge.addSpline(2) => [
                if (t.isImmediate) {
                    it.lineStyle = LineStyle::CUSTOM;
                    it.lineStyle.dashPattern.clear;
                    it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
                }
                it.addArrowDecorator() => [
                    if (t.isHistory) {
                        it.parent.addHistoryDecorator();
                        (it.placementData as KDecoratorPlacementData).absolute = -15.0f;
                    }
                ];
                // it.lineCap = LineCap::CAP_ROUND;
                switch (t.type) {
                    case TransitionType::STRONGABORT:
                        it.addStrongAbortionDecorator 
                    case TransitionType::NORMALTERMINATION:
                        it.addNormalTerminationDecorator() 
                };
            ];

            if (SHOW_LABELS.optionBooleanValue) {
                scopeProvider.parent = t.sourceState;
                var String label =
                    try {
                        serializer.serialize(t.copy => [
                            TMP_RES.contents += it;
                        ]);
                    } finally {
                        TMP_RES.contents.clear;
                    } 
                if (t.sourceState.outgoingTransitions.size > 1) {
                    label =  t.sourceState.outgoingTransitions.indexOf(t) + 1 + ": " + label;
                }
                if (!label.nullOrEmpty) {
                    t.createLabel(edge).putToLookUpWith(t).configureCenteralLabel(
                        label, 10, KlighdConstants::DEFAULT_FONT_NAME
                    );
                }
            }
//            if (SHOW_PRIORITY_LABELS.optionBooleanValue) {
//                t.createLabel("prio", edge).putToLookUpWith(t).configureTailLabel(String::valueOf(
//                    if (t.priority != 0) t.priority else t.sourceState.outgoingTransitions.indexOf(t)
//                ), 11, KlighdConstants::DEFAULT_FONT_NAME);
//            }
        ];
    }
    
    def KRendering addStrongAbortionDecorator(KPolyline line) {
        return line.addEllipse() => [
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
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "gray".color
            it.setDecoratorPlacementData(12, 12, -6, 1, false);
            it.addPolyline(1) => [
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
