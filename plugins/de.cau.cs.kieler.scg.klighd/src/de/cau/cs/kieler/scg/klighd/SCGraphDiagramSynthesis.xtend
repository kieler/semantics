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
import de.cau.cs.kieler.core.util.Pair

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
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.ControlFlow

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.kiml.options.PortConstraints

import de.cau.cs.kieler.scg.extensions.SCGExtensions
import java.util.ArrayList
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgdep.Dependency
import de.cau.cs.kieler.scgdep.AbsoluteWrite_Read
import de.cau.cs.kieler.scgdep.RelativeWrite_Read
import de.cau.cs.kieler.scgdep.AbsoluteWrite_RelativeWrite
import de.cau.cs.kieler.scgdep.Write_Write
import de.cau.cs.kieler.core.kexpressions.KExpressionsStandaloneSetup
import com.google.inject.Guice
import de.cau.cs.kieler.core.kexpressions.KExpressionsRuntimeModule
import de.cau.cs.kieler.core.kexpressions.KExpressionsStandaloneSetupGenerated
import org.eclipse.xtext.service.SingletonBinding
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.serializer.sequencer.IContextFinder
import javax.inject.Singleton

class SCGRuntimeModule extends KExpressionsRuntimeModule {
    
    @Singleton
    override Class<? extends IScopeProvider> bindIScopeProvider() {
        return typeof(SCGKExpressionsScopeProvider);
    }    
    
//    def Class<? extends IContextFinder> bindIContextFinder() {
//        return typeof(SCGKExpressionsContextFinder)
//    }
}

class SCGraphDiagramSynthesis extends AbstractDiagramSynthesis<SCGraph> {
        
    private static var Injector guiceInjector;
    private static val KExpressionsStandaloneSetup setup = new KExpressionsStandaloneSetup() => [
        guiceInjector = Guice.createInjector(new SCGRuntimeModule);
        it.register(guiceInjector);        
    ]
//    private val Injector i = KExpressionsStandaloneSetup::createInjectorAndDoEMFRegistration();
    private static val SCGKExpressionsScopeProvider scopeProvider = guiceInjector.getInstance(typeof(SCGKExpressionsScopeProvider));
    private static val ISerializer serializer = guiceInjector.getInstance(typeof(ISerializer));
    
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
    
    @Inject
    extension SCGExtensions
    
    private static val TransformationOption SHOW_CAPTION
        = TransformationOption::createCheckOption("Captions", true);
        
    private static val TransformationOption SHOW_DEPENDENCIES
        = TransformationOption::createCheckOption("Show dependencies", true);

    private static val TransformationOption LAYOUT_DEPENDENCIES
        = TransformationOption::createCheckOption("Layout dependencies", false);
        
    private static val TransformationOption SHOW_SHADOW
        = TransformationOption::createCheckOption("Shadow", true);
        
    private static val TransformationOption ALIGN_TICK_START
        = TransformationOption::createCheckOption("Tick start alignment", true);

    private static val TransformationOption ALIGN_ENTRYEXIT_NODES
        = TransformationOption::createCheckOption("Entry/Exit alignment", false);
        
    private static val TransformationOption SHOW_HIERARCHY
        = TransformationOption::createCheckOption("Display hierarchy", true);
        
    private static val TransformationOption HIERARCHY_TRANSPARENCY 
        = TransformationOption::createRangeOption("Hierarchy transparency", Pair::of(0f, 255f), 128f);
        
//    private static val TransformationOption ALIGN_EDGES
//        = TransformationOption::createCheckOption("Control flow edge alignment", true);
//
//    private static val TransformationOption FIXATE_EDGES
//        = TransformationOption::createCheckOption("Fixate control flow edge", true);


    override public getTransformationOptions() {
//        return ImmutableSet::of(SHOW_LABELS, SHOW_SHADOW, ALIGN_TICK_START, ALIGN_EDGES, FIXATE_EDGES);
        return ImmutableSet::of(SHOW_CAPTION, SHOW_DEPENDENCIES, LAYOUT_DEPENDENCIES, 
            ALIGN_TICK_START, ALIGN_ENTRYEXIT_NODES, 
            SHOW_HIERARCHY, HIERARCHY_TRANSPARENCY, SHOW_SHADOW
        );
    }
    
    override public getRecommendedLayoutOptions() {
        return ImmutableMap::<IProperty<?>, Collection<?>>of(
//            LayoutOptions::ALGORITHM, emptyList,
            LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[ it.name ],
            LayoutOptions::SPACING, newArrayList(0, 255),
            Properties::NODE_PLACER, NodePlacementStrategy::values
        );
    }
    
    override transform(SCGraph model) {
        scopeProvider.parent = model;
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
    private static val KColor KEYWORD = RENDERING_FACTORY.createKColor()=>[it.red=115;it.green=0;it.blue=65];
    private static val KColor DARKGRAY = RENDERING_FACTORY.createKColor()=>[it.red=60;it.green=60;it.blue=60];
    
    private static val KColor DEPENDENCY_ABSWRITEREAD = RENDERING_FACTORY.createKColor()=>[it.red = 0; it.green = 192; it.blue = 0;]
    private static val KColor DEPENDENCY_RELWRITEREAD = RENDERING_FACTORY.createKColor()=>[it.red = 0; it.green = 192; it.blue = 192;]
    private static val KColor DEPENDENCY_ABSWRITERELWRITE = RENDERING_FACTORY.createKColor()=>[it.red = 0; it.green = 0; it.blue = 255;]
    private static val KColor DEPENDENCY_ABSWRITEABSWRITE = RENDERING_FACTORY.createKColor()=>[it.red = 255; it.green = 0; it.blue = 0;]
    
    private static val String SCGPORTID_INCOMING = "incoming"
    private static val String SCGPORTID_OUTGOING = "outgoing"
    private static val String SCGPORTID_OUTGOING_THEN = "outgoingThen"
    private static val String SCGPORTID_OUTGOING_ELSE = "outgoingElse"
    private static val String SCGPORTID_HIERARCHY = "hierarchy"
    private static val String SCGPORTID_HIERARCHYEDGE = "hierarchyEdge"
    private static val String SCGPORTID_HIERARCHYPORTS = "hierarchyPorts"
    private static val String SCGPORTID_INCOMINGDEPENDENCY = "incomingDependency"
    private static val String SCGPORTID_OUTGOINGDEPENDENCY = "outgoingDependency"

    private KNode rootNode;

    def dispatch KNode translate(SCGraph r) {
        return r.createNode().putToLookUpWith(r) => [ node |
            rootNode = node
            // node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
             node.setLayoutOption(LayoutOptions::DIRECTION, Direction::DOWN);
             node.setLayoutOption(LayoutOptions::SPACING, 25f);
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

            if (r instanceof SCGraphDep && SHOW_DEPENDENCIES.optionBooleanValue &&
                LAYOUT_DEPENDENCIES.optionBooleanValue
            ) {
                r.eAllContents.filter(Dependency).forEach[ it.drawDependency ]
            }
            
            if (SHOW_HIERARCHY.optionBooleanValue) {    
                for (s : r.nodes.filter(typeof(Fork))) {
                    val threadEntries = s.getAllNext
                    for(t : threadEntries) {
                        if (t.target instanceof Entry) (t.target as Entry).getThreadNodes.createHierarchy
                    }
                }            
            }
            
            if (r instanceof SCGraphDep && SHOW_DEPENDENCIES.optionBooleanValue &&
                !LAYOUT_DEPENDENCIES.optionBooleanValue
            ) {
                r.eAllContents.filter(Dependency).forEach[ it.drawDependency ]
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
                if (s.valuedObject != null && s.assignment != null)
                    it.addText(s.valuedObject.name + " = " + serializer.serialize(s.assignment.copy))
                        .putToLookUpWith(s);
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            node.addPort(SCGPORTID_INCOMING, 36, -1, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING, 36, 22, 3, PortSide::SOUTH)          
            node.addPort(SCGPORTID_INCOMINGDEPENDENCY, 46, -1, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 46, 22, 3, PortSide::SOUTH)                      
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
                if (s.condition != null)  
                    node.KRendering.add(factory.createKText.of(serializer.serialize(s.condition.copy))
                        .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 1, 0, BOTTOM, 1, 0)
                        .putToLookUpWith(s)
                    );
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]

            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS)
            node.addPort(SCGPORTID_INCOMING, 36, -1, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING_ELSE, 36, 22, 3, PortSide::SOUTH)
            node.addPort(SCGPORTID_OUTGOING_THEN, 70, 11, 3, PortSide::EAST)
            node.addPort(SCGPORTID_INCOMINGDEPENDENCY, 46, 5, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 46, 17, 3, PortSide::SOUTH)                      
        ]
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
                if (SHOW_CAPTION.optionBooleanValue)
                    node.KRendering.add(factory.createKText.of("surface").putToLookUpWith(s));
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            node.addPort(SCGPORTID_INCOMING, 36, -1, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING, 36, 22, 3, PortSide::SOUTH)          
            
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
                if (SHOW_CAPTION.optionBooleanValue)
                    node.KRendering.add(factory.createKText.of("depth")
                        .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 4, 0)
                        .putToLookUpWith(s)
                    );
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            node.addPort(SCGPORTID_INCOMING, 36, -1, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING, 36, 22, 3, PortSide::SOUTH)          
        ]
    }
    
    def dispatch KNode translate(Entry s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            if (ALIGN_ENTRYEXIT_NODES.optionBooleanValue)
                node.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST)

            val figure = node.addEllipse();
//                .background = "white".color;

            figure => [ node.setMinimalNodeSize(75, 25); 
                if (SHOW_CAPTION.optionBooleanValue)
                    node.KRendering.add(factory.createKText.of("entry")
                        .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 1, 0)
                        .putToLookUpWith(s)
                    );
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]

            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            node.addPort(SCGPORTID_INCOMING, 36, 0, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING, 36, 22, 3, PortSide::SOUTH)          
        ]
    }    
 
    def dispatch KNode translate(Exit s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            //node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
            // node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            // node.setLayoutOption(LayoutOptions::SPACING, 0f);
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            if (ALIGN_ENTRYEXIT_NODES.optionBooleanValue)
                node.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::LAST)

            val figure = node.addEllipse();
//                .background = "white".color;

            figure => [ node.setMinimalNodeSize(75, 25);
                if (SHOW_CAPTION.optionBooleanValue) 
                    node.KRendering.add(factory.createKText.of("exit")
                        .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 1, 0)
                        .putToLookUpWith(s)
                    );
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            node.addPort(SCGPORTID_INCOMING, 36, -1, 3, PortSide::NORTH)
            node.addPort(SCGPORTID_OUTGOING, 36, 22, 3, PortSide::SOUTH)          
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
                if (SHOW_CAPTION.optionBooleanValue) 
                    node.KRendering.add(factory.createKText.of("fork")
                        .setAreaPlacementData.from(LEFT, 0, 0, TOP, 4, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0)
                        .putToLookUpWith(s)
                    );
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            val port = node.addPort(SCGPORTID_INCOMING, 36, 0, 3, PortSide::NORTH)
            port.addLayoutParam(LayoutOptions::OFFSET, -2f)
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
                if (SHOW_CAPTION.optionBooleanValue) 
                    node.KRendering.add(factory.createKText.of("join")
                        .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 10, 0)
                        .putToLookUpWith(s)
                    );
                if (SHOW_SHADOW.optionBooleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            val port = node.addPort(SCGPORTID_OUTGOING, 36, 22, 3, PortSide::SOUTH)
            port.addLayoutParam(LayoutOptions::OFFSET, -3f)
        ]
    }


    def KEdge translateTickEdge(Depth t) {
        return t.createEdge().putToLookUpWith(t) => [ edge |
            edge.source = t.surface?.node;
            edge.target = t.node;
            edge.sourcePort = t.surface?.node.getPort(SCGPORTID_OUTGOING)
            edge.targetPort = t.node.getPort(SCGPORTID_INCOMING)
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
      
            edge.addRoundedBendsPolyline(8,2) => [
                    it.lineStyle = LineStyle::DOT;
//                    it.lineStyle.dashPattern.clear;
//                    it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
            ]
                        
        ]
    }
    
    def KEdge translateControlFlow(ControlFlow t, String outgoing) {
        if (t.target == null || t.eContainer == null) return null;
        
        return t.createEdge().putToLookUpWith(t) => [ edge |
            val sourceObj = t.eContainer
            val targetObj = t.target
            var sourceNode = sourceObj.node
            var targetNode = targetObj.node
            var addArrow = true
            
            edge.source = sourceNode
            edge.target = targetNode
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)

            if (sourceObj instanceof Fork) {
                edge.sourcePort = sourceObj.node.createPort("fork" + targetObj.hashCode()) => [
                    it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::SOUTH);
                    it.setPortSize(3,3)
                    it.addRectangle.invisible = true;
                    it.addLayoutParam(LayoutOptions::OFFSET, -3f)
                    sourceObj.node.ports += it
                ]
            } else {
                edge.sourcePort = sourceNode.getPort(outgoing)
            }
            
            if (targetObj instanceof Join) {
                edge.targetPort = targetObj.node.createPort("join" + sourceObj.hashCode()) => [
                    it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::NORTH);
                    it.setPortSize(3,3)
                    it.addRectangle.invisible = true;
                    it.addLayoutParam(LayoutOptions::OFFSET, -2f)
                    targetObj.node.ports += it
                ]
            } else {
                edge.targetPort = targetNode.getPort(SCGPORTID_INCOMING)
            }
      
            val addArrowFinal = addArrow
            edge.addRoundedBendsPolyline(8,2) => [
                    it.lineStyle = LineStyle::SOLID
                    if (addArrowFinal) it.addArrowDecorator
            ]
            
            if (outgoing == SCGPORTID_OUTGOING_THEN) {
                edge.createLabel.configureTailLabel('true', 9, KlighdConstants::DEFAULT_FONT_NAME)
            }               
        ]
    }    
    
    def Dependency drawDependency(Dependency dependency) {
        val sourceNode = (dependency.eContainer as Node).node
        val targetNode = dependency.target.node
        
        sourceNode.createEdge() => [ edge |
            edge.source = sourceNode
            edge.target = targetNode
            edge.addRoundedBendsPolyline(8,2) => [    
                if (dependency instanceof AbsoluteWrite_Read) it.foreground = DEPENDENCY_ABSWRITEREAD.copy
                if (dependency instanceof RelativeWrite_Read) it.foreground = DEPENDENCY_RELWRITEREAD.copy
                if (dependency instanceof AbsoluteWrite_RelativeWrite) it.foreground = DEPENDENCY_ABSWRITERELWRITE.copy
                if (dependency instanceof Write_Write) it.foreground = DEPENDENCY_ABSWRITEABSWRITE.copy
                it.lineStyle = LineStyle::DASH
                it.addArrowDecorator
            ]  
            
            if (LAYOUT_DEPENDENCIES.optionBooleanValue) {
                edge.sourcePort = sourceNode.getPort(SCGPORTID_OUTGOINGDEPENDENCY)
                edge.targetPort = targetNode.getPort(SCGPORTID_INCOMINGDEPENDENCY)
            }          
        ]
        
        dependency
    }

    def createHierarchy(List<Node> nodes) {
        val threadEntry = nodes.head as Entry
        val kParent = threadEntry.node.eContainer as KNode
        val kContainer = threadEntry.createNode("hierarchy")
        val kNodeList = new ArrayList<KNode>
        nodes.forEach[e|kNodeList.add(e.node)]
        
        kContainer.addLayoutParam(LayoutOptions::SPACING, 25.0f)
        kContainer.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN)
        kContainer.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        kContainer.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered")
        kContainer.addLayoutParam(LayoutOptions::SEPARATE_CC, false);      
        kContainer.addRoundedRectangle(5, 5, 0)
        kContainer.KRendering.foreground = SCCHARTSBLUE2.copy;
        kContainer.KRendering.foreground.alpha = Math.round(HIERARCHY_TRANSPARENCY.optionValue as Float)
        kContainer.KRendering.background = SCCHARTSBLUE2.copy;
        kContainer.KRendering.background.alpha = Math.round(HIERARCHY_TRANSPARENCY.optionValue as Float)
        kContainer.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FREE);
                    
        for(tn : nodes) {
            val kNode = tn.node
            //kNode.KRendering.background = "red".color            
            
            kContainer.children += kNode
        }

        kParent.children += kContainer
        
        val iSecEdges = new ArrayList<KEdge>
         
        for(rc : kParent.children) {
            iSecEdges.addAll(rc.outgoingEdges.filter[edge | kNodeList.contains(edge.target)])
            iSecEdges.addAll(rc.incomingEdges.filter[edge | kNodeList.contains(edge.source)])
        }
        for(ne : iSecEdges) {
            val portName = SCGPORTID_HIERARCHYPORTS + ne.hashCode.toString();
            val hPort = kContainer.addHelperPort(portName)
            val origSource = ne.source
            val origSourcePort = ne.sourcePort            
            ne.source = kContainer
            ne.sourcePort = hPort 
            val helperEdge = kParent.createEdge(SCGPORTID_HIERARCHYEDGE + 
                ne.hashCode.toString() + origSource.hashCode.toString()) => [ autoEdge |
                autoEdge.source = origSource
                autoEdge.sourcePort = origSourcePort
                autoEdge.target = kContainer
                autoEdge.targetPort = kContainer.getPort(portName)
                autoEdge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
                autoEdge.addRoundedBendsPolyline(8,2) => [
                    it.lineStyle = ne.KRendering.lineStyleValue
                    it.foreground = ne.KRendering.foreground
                ]
            ]
        }     
                        
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
    
    def KPort addHelperPort(KNode node, String mapping) {
      node.createPort(mapping) => [
         node.ports += it
      ]
    }  
   
}
