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
package de.cau.cs.kieler.scg.klighd

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
import java.util.Collection
import java.util.List
import javax.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.serializer.ISerializer
import de.cau.cs.kieler.klay.layered.p4nodes.NodePlacementStrategy
import de.cau.cs.kieler.klay.layered.properties.LayerConstraint
import de.cau.cs.kieler.klay.layered.properties.Properties


import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.klighd.SCGraphShapes
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.ControlFlow

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.kiml.options.PortConstraints

class SCGraphDiagramSynthesis extends AbstractDiagramSynthesis<SCGraph> {
        
    @Inject
    extension KNodeExtensions
    
    @Inject
    extension KEdgeExtensions
    
    @Inject
    extension KLabelExtensions
    
    @Inject
    extension KRenderingExtensions

    @Inject
    extension KPortExtensions
    
    @Inject
    extension KContainerRenderingExtensions
    
    @Inject
    extension KPolylineExtensions
    
    @Inject
    extension KColorExtensions
    
    @Inject
    extension SCGraphShapes
    
    private static val TransformationOption SHOW_LABELS
        = TransformationOption::createCheckOption("Transition labels", true);
        
    private static val TransformationOption SHOW_SHADOW
        = TransformationOption::createCheckOption("Shadow", true);
        
    private static val TransformationOption ALIGN_TICK_START
        = TransformationOption::createCheckOption("Tick start alignment", true);

//    private static val TransformationOption ALIGN_EDGES
//        = TransformationOption::createCheckOption("Control flow edge alignment", true);
//
//    private static val TransformationOption FIXATE_EDGES
//        = TransformationOption::createCheckOption("Fixate control flow edge", true);


    override public getTransformationOptions() {
//        return ImmutableSet::of(SHOW_LABELS, SHOW_SHADOW, ALIGN_TICK_START, ALIGN_EDGES, FIXATE_EDGES);
        return ImmutableSet::of(SHOW_LABELS, SHOW_SHADOW, ALIGN_TICK_START);
    }
    
    override public getRecommendedLayoutOptions() {
        return ImmutableMap::<IProperty<?>, Collection<?>>of(
            LayoutOptions::ALGORITHM, emptyList,
            LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[ it.name ],
            LayoutOptions::SPACING, newArrayList(0, 255)
        );
    }
    
    override transform(SCGraph model) {
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
    
    
    private static val String SCGPORTID_INCOMING = "incoming"
    private static val String SCGPORTID_OUTGOING = "outgoing"
    private static val String SCGPORTID_OUTGOING_THEN = "outgoingthen"
    private static val String SCGPORTID_OUTGOING_ELSE = "outgoingelse"


    def dispatch KNode translate(SCGraph r) {
        return r.createNode().putToLookUpWith(r) => [ node |
            // node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
             node.setLayoutOption(LayoutOptions::DIRECTION, Direction::DOWN);
             node.setLayoutOption(LayoutOptions::SPACING, 20f);
             node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
             node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
             node.addLayoutParam(Properties::THOROUGHNESS, 100)
             node.addLayoutParam(LayoutOptions::SEPARATE_CC, false);             
            for (s : r.nodes) {
                node.children += s.translate;
            }
            
            for (s : r.nodes) {
                if (s instanceof Surface)    (s as Surface).depth?.translateTickEdge
                if (s instanceof Assignment) (s as Assignment).next?.translateControlFlow(SCGPORTID_OUTGOING)
                if (s instanceof Entry)      (s as Entry).next?.translateControlFlow(SCGPORTID_OUTGOING)
                if (s instanceof Exit)       (s as Exit).next?.translateControlFlow(SCGPORTID_OUTGOING)
                if (s instanceof Join)       (s as Join).next?.translateControlFlow(SCGPORTID_OUTGOING)
                if (s instanceof Depth)      (s as Depth).next?.translateControlFlow(SCGPORTID_OUTGOING)
                
                if (s instanceof Fork) {
                    (s as Fork).getNext().forEach[e | e.translateControlFlow(""); ]   
                } 
                
                if (s instanceof Conditional) {
                    (s as Conditional).then?.translateControlFlow(SCGPORTID_OUTGOING_THEN)
                    (s as Conditional).getElse()?.translateControlFlow(SCGPORTID_OUTGOING_ELSE)
                }
            }
            
        ]
    }
    
    def dispatch KNode translate(Assignment s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);

            val cornerRadius = 2;
            val lineWidth = 1.0f;

            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth)
                .background = "white".color;

            (figure) => [
                node.setMinimalNodeSize(75, 25);
//                it.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
                it.setGridPlacement(1);
                it.addText("assignment").putToLookUpWith(s);

            ];
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            node.addPort(SCGPORTID_INCOMING, 37, 0, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING, 37, 25, 3, PortSide::SOUTH)          
            
        ]
    }
    
    def dispatch KNode translate(Conditional s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);

            val figure = node.addPolygon().createDiamondShape();
//                .background = "white".color;

            figure => [ node.setMinimalNodeSize(75, 25); 
                node.KRendering.add(factory.createKText.of("cond").putToLookUpWith(s));
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]

            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS)
            node.addPort(SCGPORTID_INCOMING, 37, 0, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING_THEN, 37, 25, 3, PortSide::SOUTH)
            node.addPort(SCGPORTID_OUTGOING_ELSE, 75, 11, 3, PortSide::EAST)
        ];
    }
    
    def dispatch KNode translate(Surface s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);

            val figure = node.addPolygon().createSurfaceShape();
//                .background = "white".color;

            figure => [ node.setMinimalNodeSize(75, 25); 
                node.KRendering.add(factory.createKText.of("surface").putToLookUpWith(s));
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            node.addPort(SCGPORTID_INCOMING, 37, 0, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING, 37, 25, 3, PortSide::SOUTH)          
            
        ]
    }

    def dispatch KNode translate(Depth s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            if (ALIGN_TICK_START.optionBooleanValue) {
                node.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST)
            }

            val figure = node.addPolygon().createDepthShape();
//                .background = "white".color;

            figure => [ node.setMinimalNodeSize(75, 25); 
                node.KRendering.add(factory.createKText.of("depth").putToLookUpWith(s));
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            node.addPort(SCGPORTID_INCOMING, 37, 0, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING, 37, 25, 3, PortSide::SOUTH)          
        ]
    }
    
    def dispatch KNode translate(Entry s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);

            val figure = node.addEllipse();
//                .background = "white".color;

            figure => [ node.setMinimalNodeSize(75, 25); 
                node.KRendering.add(factory.createKText.of("entry").putToLookUpWith(s));
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]

            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            node.addPort(SCGPORTID_INCOMING, 37, 0, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING, 37, 25, 3, PortSide::SOUTH)          
        ]
    }    
 
    def dispatch KNode translate(Exit s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);

            val figure = node.addEllipse();
//                .background = "white".color;

            figure => [ node.setMinimalNodeSize(75, 25); 
                node.KRendering.add(factory.createKText.of("exit").putToLookUpWith(s));
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            node.addPort(SCGPORTID_INCOMING, 37, 0, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING, 37, 25, 3, PortSide::SOUTH)          
        ]
    }

    def dispatch KNode translate(Fork s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);

            val figure = node.addPolygon().createTriangleShape();
//                .background = "white".color;

            figure => [ node.setMinimalNodeSize(75, 25); 
                node.KRendering.add(factory.createKText.of("fork").putToLookUpWith(s));
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            node.addPort(SCGPORTID_INCOMING, 37, 0, 3, PortSide::NORTH)
        ]
    }

    def dispatch KNode translate(Join s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);

            val figure = node.addPolygon().createTriangleShapeReversed();
//                .background = "white".color;

            figure => [ node.setMinimalNodeSize(75, 25); 
                node.KRendering.add(factory.createKText.of("join").putToLookUpWith(s));
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            node.addPort(SCGPORTID_OUTGOING, 37, 25, 3, PortSide::SOUTH)
        ]
    }


    def KEdge translateTickEdge(Depth t) {
        return t.createEdge().putToLookUpWith(t) => [ edge |
            edge.source = t.surface?.node;
            edge.target = t.node;
            edge.sourcePort = t.surface?.node.getPort(SCGPORTID_OUTGOING)
            edge.targetPort = t.node.getPort(SCGPORTID_INCOMING)
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
      
            edge.addRoundedBendsPolyline(1,2) => [
                    it.lineStyle = LineStyle::DOT;
//                    it.lineStyle.dashPattern.clear;
//                    it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
            ]
                        
        ]
    }
    
    def KEdge translateControlFlow(ControlFlow t, String outgoing) {
        return t.createEdge().putToLookUpWith(t) => [ edge |
            val sourceObj = t.eContainer
            val targetObj = t.target
            edge.source = sourceObj.node
            edge.target = targetObj.node
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)

            if (sourceObj instanceof Fork) {
            } else {
                edge.sourcePort = sourceObj.node.getPort(outgoing)
            }
            
            if (targetObj instanceof Join) {
                
            } else {
                edge.targetPort = targetObj.node.getPort(SCGPORTID_INCOMING)
            }
      
            edge.addRoundedBendsPolyline(1,2) => [
                    it.lineStyle = LineStyle::SOLID
//                    it.lineStyle.dashPattern.clear;
//                    it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
            ]
                        
        ]
    }    
   
   
    def KPort addPort(KNode node, String mapping, float x, float y, int size, PortSide side) {
      node.createPort(mapping) => [
         it.addLayoutParam(LayoutOptions::PORT_SIDE, side);
         it.setPortPos(x, y)
         it.setPortSize(size,size)
         it.addRectangle.invisible = true;
         node.ports += it
      ]
    }
    
    def KPort addPortFixedSide(KNode node, String mapping, PortSide side) {
        node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
        node.addPort(mapping, 37, 0, 3, side)
    }    
   
}
