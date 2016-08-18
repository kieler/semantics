/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.circuit.klighd

import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.Link
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.circuit.klighd.synthesis.hooks.CollapseGuardRegionsHook
import de.cau.cs.kieler.circuit.klighd.synthesis.hooks.HookHandlingBeforeUpdate
import de.cau.cs.kieler.circuit.klighd.synthesis.hooks.ResetWireHook
import de.cau.cs.kieler.circuit.klighd.synthesis.hooks.ShowEntireCircuitHook
import de.cau.cs.kieler.circuit.klighd.synthesis.hooks.TickWireHook
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineCap
import de.cau.cs.kieler.core.krendering.LineJoin
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortLabelPlacement
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.klay.layered.p4nodes.NodePlacementStrategy
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.LinkedHashSet
import java.util.LinkedList
import java.util.List
import javax.inject.Inject

/** 
 * 
 * Synthesis transforms Circuit metamodel components into KGraph metamodel components for visualization.
 * 
 *  @author fry
 * 
 */
 @ViewSynthesisShared
class CircuitDiagramSynthesis extends AbstractDiagramSynthesis<Actor> {

    @Inject ActorSynthesis actorSynthesis
    
    @Inject HookHandlingBeforeUpdate hookHandling

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    @Inject extension KLabelExtensions
    
    extension KRenderingFactory = KRenderingFactory.eINSTANCE
    
    
//    val logger = Logger.getLogger(this.class.name)
    public val ID = "de.cau.cs.kieler.circuit.klight.CircuitDiagramSynthesis"
    // -------------------------------------------------------------------------
    // -- KlighD Options
    // -------------------------------------------------------------------------

    /** The visibility category */
    public static final SynthesisOption VISIBILITY = SynthesisOption.createCategory("Visibility");

    /** DIAGRAM LAYOUT */
    private static val SynthesisOption LAYOUT = SynthesisOption::createChoiceOption("Node Placement",
        <String>newLinkedList("Brandes Koepf", "Linear Segments", "Network Simplex", "Simple"), "Top-Down");

    
    /**  
     * Returns a list of KlighD visualization options. Called by KlighD.
     * 
     */
    override public getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet();
        options.addAll(ResetWireHook.displayedSynthesisOptions);
        options.addAll(TickWireHook.displayedSynthesisOptions);
        options.addAll(ShowEntireCircuitHook.displayedSynthesisOptions);
        options.addAll(CollapseGuardRegionsHook.displayedSynthesisOptions)
        options.addAll(VISIBILITY);
        options.addAll(LAYOUT);

        return options.toList

    }

    override KNode transform(Actor model) {

            val root = createNode().associateWith(model);
//            root.setLayoutOption(LayoutOptions.HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN);
            model.transformActor(root);

            /* Update diagram after refreshing.
             * optionHooks gives hook information for option. */
            val options = displayedSynthesisOptions.filter[updateAction != null]
            val List<Pair<String,Boolean>> optionHooks = new LinkedList<Pair<String,Boolean>>
            for(option : options){
                val id = option.updateAction
                val value = option.booleanValue
                val pair = new Pair<String,Boolean>(id,value)
                optionHooks.add(pair)
                
            }
            hookHandling.updateDigram(root, optionHooks)
            
            return root;
    }

    // -------------------------------------------------------------------------
    // --                     Transform Actor to KNode                        --
    // -------------------------------------------------------------------------
    def void transformActor(Actor actor, KNode parent) {

        // draw KNode gates and attach them to parent
        val actorNode = actorSynthesis.transform(actor)
        actorNode.associateWith(actor)
        parent.children += actorNode

        // check if actor is a gate or an inner circuit
        val Boolean atomicActor = actor.innerActors.empty

        // rendering for edges and ports of actor
        actorNode.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
        actorNode.setLayoutOption(LayoutOptions.PORT_LABEL_PLACEMENT, PortLabelPlacement.OUTSIDE);
        actorNode.setLayoutOption(LayoutOptions.PORT_SPACING, 20.0f)
        actorNode.addLayoutParam(LayoutOptions.SELF_LOOP_INSIDE, true);
        actorNode.setLayoutOption(LayoutOptions.DIRECTION, Direction.RIGHT);

        if (LAYOUT.objectValue == "Brandes Koepf") {
            actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.BRANDES_KOEPF);
        }
        if (LAYOUT.objectValue == "Linear Segments") {
            actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.LINEAR_SEGMENTS);
        }
        if (LAYOUT.objectValue == "Network Simplex") {
            actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.NETWORK_SIMPLEX);
        }
        if (LAYOUT.objectValue == "Simple") {
            actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.SIMPLE);
        }

        // ------------------------------------------------------------------------
        // --                     Add KPorts to KNode                            --
        // ------------------------------------------------------------------------
        // Layout options for ports
        for (port : actor.ports) {
            val kPort = port.port.associateWith(port)
            actorNode.ports += kPort => [
                it.associateWith(port)
                if (!atomicActor) {
                    // TODO: FIX THIS _GO, g0 stuff...!
                    if (port.name == "g0") {
                        it.addInsidePortLabel("_GO", 8, KlighdConstants.DEFAULT_FONT_NAME)
                    } // .associateWith(port)
                    else {
                        it.addInsidePortLabel(port.name, 8, KlighdConstants.DEFAULT_FONT_NAME)
                    } // .associateWith(port)
                }

                // --------------------------------------------------------------
                // --   Input ports: are placed on the left side of actors     --
                // --------------------------------------------------------------
                if (port.type.startsWith("In") || port.type.startsWith("redIn")) {

                    // ports for the tick function are marked with triangle 
                    if (port.name == "Tick") { // 
                        it.setPortSize(0, 0)
                        it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
                        it.addPolygon => [
                            it.lineWidth = 1
                            it.lineCap = LineCap.CAP_ROUND;
                            it.lineJoin = LineJoin.JOIN_ROUND;
                            it.background = "white".color;
                            it.selectionBackground = "gray".color;
                            it.addKPosition(LEFT, 0.5f, 0, TOP, 4, 0)
                            it.addKPosition(RIGHT, -5, 0, TOP, 0, 0.5f)
                            it.addKPosition(LEFT, 0.5f, 0, BOTTOM, 4, 0)
                        ]
                    } // all other input ports have no special design
                    else {
                        it.setPortSize(5, 2);
                        it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
                        it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
                        it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)
                    }

                    // "In_1" and "In_0" are MUX input ports. They have a specified order to ensure the flap in simulation working correctly.
                    if (port.type == "In_1") {
                        actorNode.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER);
                        it.setLayoutOption(LayoutOptions.PORT_INDEX, 1)
                    } else if (port.type == "In_0") {
                        actorNode.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER);
                        it.setLayoutOption(LayoutOptions.PORT_INDEX, 0)
                    }

                } // --------------------------------------------------------------
                // --  Output ports: are placed on the right side of actors    --
                // --------------------------------------------------------------
                else if (port.type.startsWith("Out") ||port.type.startsWith("redOut")) {
                    it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.EAST)
                    it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)
                    if (port.outgoingLinks.length == 0) { // mark unnecessary nodes in circuit...
                        it.addEllipse.setBackground("red".color).lineWidth = 0;
                        it.setPortSize(6, 6);
                    } else {
                        it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
                        it.setPortSize(5, 2);
                    }

                } // --------------------------------------------------------------
                // --   Selection ports: are placed at the bottom of actors    --
                // --------------------------------------------------------------	
                else if (port.type.startsWith("Sel")) {
                    it.setPortSize(2, 5);
                    it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.SOUTH)
                    it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
                    it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)
                }
            ]
        }

        // ------------------------------------------------------------------------
        // --              Create all inner actors of circuit                    --
        // ------------------------------------------------------------------------
        actor.innerActors.forEach [
            it.transformActor(actorNode);
        ]

        // ------------------------------------------------------------------------
        // --              Create KEdges for Links                               --
        // ------------------------------------------------------------------------
        actor.innerLinks.forEach [ l |
            createEdgeForLink(l);
        ]

    }

    def createEdgeForLink(Link link) {
        createEdge().associateWith(link) => [
            switch (link.source) {
                Actor:
                    it.source = link.source.node
                Port: {
                    it.source = link.source.eContainer.node;
                    it.sourcePort = link.source.port
                }
            }
            switch (link.target) {
                Actor:
                    it.target = link.target.node
                Port: {
                    it.target = link.target.eContainer.node;
                    it.targetPort = link.target.port
                }
            }
            it.addRoundedBendsPolyline(3, 1).addJunctionPointDecorator;

            // this is necessary because otherwise ports are not placed correctly
            // e.g. A in ABO.. 
            if (it.sourcePort.node == it.targetPort.node) {
                it.addLayoutParam(LayoutOptions.SELF_LOOP_INSIDE, true);
            }

        ]

    }

}
