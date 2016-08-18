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

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.klight.synthesis.actorShapes.AndActorSynthesis
import de.cau.cs.kieler.circuit.klight.synthesis.actorShapes.FlipFlopActorSynthesis
import de.cau.cs.kieler.circuit.klight.synthesis.actorShapes.MuxActorSynthesis
import de.cau.cs.kieler.circuit.klight.synthesis.actorShapes.NotActorSynthesis
import de.cau.cs.kieler.circuit.klight.synthesis.actorShapes.OrActorSynthesis
import de.cau.cs.kieler.circuit.klight.synthesis.actorShapes.RegisterActorSynthesis
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.Trigger
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.SizeConstraint
import de.cau.cs.kieler.klay.layered.properties.EdgeLabelSideSelection
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.EnumSet

/**
 * @author fry
 * 
 * Synthesis for Actors in circuits. 
 * Actors are transformed to KNodes.
 * 
 */
class ActorSynthesis extends AbstractDiagramSynthesis<Actor> {

    // -------------------------------------------------------------------------
    // --      Injections for all selectable gates of the circuit             --
    // -------------------------------------------------------------------------
    @Inject
    AndActorSynthesis andActorSynthesis

    @Inject
    NotActorSynthesis notActorSynthesis

    @Inject
    OrActorSynthesis orActorSynthesis

    @Inject
    MuxActorSynthesis muxActorSynthesis

    @Inject
    RegisterActorSynthesis registerActorSynthesis

    @Inject
    FlipFlopActorSynthesis flipflopActorSynthesis

    // -------------------------------------------------------------------------
    // --                      Injections for KExtensions                     --
    // -------------------------------------------------------------------------
    /** Rendering factory used to instantiate KRendering instances. */
    val renderingFactory = KRenderingFactory::eINSTANCE
    @Inject extension KNodeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KColorExtensions
    extension KRenderingFactory = KRenderingFactory.eINSTANCE

    override KNode transform(Actor actor) {

        val atomicActor = !(actor.innerActors.toList.length > 0)
        val hasType = !(actor.type == null)
        val hasName = !(actor.name == null)

        // -------------------------------------------------------------------------
        // --                     Create KNode for Actor                          --
        // --    this can either be a gate(1) or a frame(2) for a region          --
        // -------------------------------------------------------------------------
        var KNode actorNode = actor.node; // getNode, NICHT createNode()!
        if (hasName) {
            actorNode.addOutsideTopLeftNodeLabel(actor.name, KlighdConstants.DEFAULT_FONT_SIZE,
                KlighdConstants.DEFAULT_FONT_NAME);
        }
        // -------------------------------------------------
        // --             (1) Create circuit gates        --
        // -------------------------------------------------
        if (atomicActor) {
            if (!hasType) { // without a type no specified gate can be created.
                actorNode.addRoundedRectangle(4, 4, 2)
                actorNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
                    EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
            } else {
                // check for type and call synthesis for the gate
                switch (actor.type) {
                    case "AND":
                        actorNode = andActorSynthesis.draw(actor)
                    case "OR":
                        actorNode = orActorSynthesis.draw(actor)
                    case "NOT":
                        actorNode = notActorSynthesis.draw(actor)
                    case "REG":
                        actorNode = registerActorSynthesis.draw(actor)
                    case "SampleREG":
                        actorNode = registerActorSynthesis.draw(actor)
                    case "MUX":
                        actorNode = muxActorSynthesis.draw(actor)
                    case "FF":
                        actorNode = flipflopActorSynthesis.draw(actor)
                    default: {
                        actorNode.setNodeSize(2, 2);
                        actorNode.addRectangle => [
                            it.setBackground("white".color);
                            it.selectionBackground = "red".color;
                        ]
                        actorNode.addInsideBottomLeftNodeLabel(actor.type, KlighdConstants.DEFAULT_FONT_SIZE,
                            KlighdConstants.DEFAULT_FONT_NAME)
                        actorNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
                            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
                    }
                }
            }
        } // -------------------------------------------------
        // --           (2) Create circuit regions        --
        // -------------------------------------------------
        else {
            if (actor.name != "Circuit Initialization" && actor.name != "Program Logic") {
                val int portCount = actor.ports.length
                // Add a rendering for the collapsed version of this region
                val collapsedRendering = createRegion(actorNode, actor)
                collapsedRendering.addAction(Trigger::DOUBLECLICK, KlighdConstants::ACTION_COLLAPSE_EXPAND)
                collapsedRendering.setAreaPlacementData(createKPosition(LEFT, 0, 0, TOP, 0, 0),
                    createKPosition(LEFT, 40, 0, TOP, portCount*30, 0));
                collapsedRendering.setBackgroundColor(100, 140, 200)
                collapsedRendering.setProperty(KlighdProperties::COLLAPSED_RENDERING, true)

                // Create the rendering for the expanded version of this region
                val expandedRendering = createRegion(actorNode, actor)
                expandedRendering.setProperty(KlighdProperties::EXPANDED_RENDERING, true)
                expandedRendering.setProperty(Properties.EDGE_LABEL_SIDE_SELECTION, EdgeLabelSideSelection.SMART)
                expandedRendering.setProperty(LayoutOptions.SELF_LOOP_INSIDE, true);
                expandedRendering.addAction(Trigger::DOUBLECLICK, KlighdConstants::ACTION_COLLAPSE_EXPAND)
                expandedRendering.setProperty(LayoutOptions.SIZE_CONSTRAINT, SizeConstraint.free)

                actorNode.data += expandedRendering
                actorNode.data += collapsedRendering

            } else {
                val rendering = createRegion(actorNode, actor)
                actorNode.data += rendering
            }
        }

        // default for initialization region	
//		if (actor.name == "Circuit Initialization") {
//			actorNode.setLayoutOption(KlighdProperties::EXPAND, false)
//		}
        return actorNode;

    }

    // ------------------------------------------------------------------  
    // --           Create frames for gate groups expressing guards.   --  
    // --           Or create circuit region backgrounds               --
    // ------------------------------------------------------------------
    def createRegion(KNode actorNode, Actor actor) {
        val lightBlue = createKColor.setColor(240, 247, 253);
        val red = createKColor.setColor(222, 100, 100);
        val frame = renderingFactory.createKRoundedRectangle() => [ rect |
            rect.lineWidth = 0
            if (actor.name.startsWith("g") && !actor.innerActors.empty) {
                rect.lineWidth = 1;
                rect.setForeground(red);
            } else {
                if (actor.eContainer != null) {
                    rect.setBackground(lightBlue)
                } else {
                    rect.lineWidth = 1;
                    rect.setForeground = "black".color
                }
            }
        ]
        return frame
    }
}
