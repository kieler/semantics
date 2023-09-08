/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package syntheses

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.EnumSet
import java.util.HashSet
import java.util.LinkedHashSet
import org.eclipse.elk.alg.radial.options.AnnulusWedgeCriteria
import org.eclipse.elk.alg.radial.options.CompactionStrategy
import org.eclipse.elk.alg.radial.options.RadialOptions
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.ContentAlignment
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.core.options.TopdownNodeTypes
import org.xtext.example.balloontrees.balloonTrees.BalloonTree
import org.xtext.example.balloontrees.balloonTrees.BalloonTreeNode

import static syntheses.GeneralSynthesisOptions.*

/**
 * @author mka
 *
 */
@ViewSynthesisShared
class BalloonSynthesis extends AbstractDiagramSynthesis<BalloonTree>{

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    extension KRenderingFactory = KRenderingFactory.eINSTANCE

    override getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet()
        
        options.add(DEBUGGING)
        options.add(SIZES)
        
        options.add(COMPOUND_NODE_ALPHA)
        options.add(SHOW_LAYOUT_EDGES)
        
        options.add(CENTER_ON_ROOT)
        options.add(ROUNDED_BOUNDING_BOX)
        options.add(SHOW_BOUNDING_BOXES)
        
        options.add(STRAIGHT_EDGE_LENGTH)
        options.add(BALLOON_RADIUS)
        options.add(LEAF_RADIUS)
        return options.toList
    }
    
    override transform(BalloonTree model) {
        val rootNode = createNode.associateWith(model)
        
        model.children.forEach[ c | 
            if (c.children.length > 0) {
                rootNode.children += createCompoundNode(c)
            } else {
                rootNode.children += createLeafNode(c)
            } 
        ]
        // add noLayoutEdges
        rootNode.children.forEach[ c | addNoLayoutEdges(c)]
        return rootNode
    }
    
    private def KNode createLeafNode(BalloonTreeNode node) {
        val leafNode = createNode.associateWith(node)

        val leafRadius = LEAF_RADIUS.floatValue
        leafNode.setSize(2*leafRadius, 2*leafRadius)
        leafNode.addRoundedRectangle(leafRadius,leafRadius,2) => [ rect | 
            rect.setBackgroundColor(100, 100, 100)
        ]
        leafNode.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.noneOf(SizeConstraint))
        leafNode.setLayoutOption(CoreOptions.NODE_SIZE_FIXED_GRAPH_SIZE, true)        
        return leafNode
    }
    
    private def KNode createCompoundNode(BalloonTreeNode node) {
        val compoundNode = createNode.associateWith(node)
        val internalNode = createNode.associateWith(node)

        val balloonRadius = BALLOON_RADIUS.floatValue
        val straightEdgeLength = STRAIGHT_EDGE_LENGTH.floatValue
        val LINE_THICKNESS = 2
        compoundNode.setSize(2*balloonRadius + straightEdgeLength, 2*balloonRadius + straightEdgeLength)
        
        val alpha = COMPOUND_NODE_ALPHA.intValue
        compoundNode.addRoundedRectangle(balloonRadius, balloonRadius,LINE_THICKNESS) => [ rect | 
            rect.setForegroundColor(100, 255, 100, alpha)
            rect.setBackgroundColor(150, 200, 150, alpha)
            rect.addChildArea()
            if (SHOW_BOUNDING_BOXES.booleanValue) {

                rect.addRoundedRectangle(0,0) => [ rect2 | 
                    rect2.setForegroundColor(255, 0, 0)
                    if (ROUNDED_BOUNDING_BOX.booleanValue) {
                        val shift = roundedRectangleShift(balloonRadius-LINE_THICKNESS, balloonRadius-LINE_THICKNESS)
                        rect2.setAreaPlacementData(
                            createKPosition(LEFT, shift as float, 0, TOP, shift as float, 0),
                            createKPosition(RIGHT, shift as float, 0, BOTTOM, shift as float, 0)
                        )
                    }
                ]
            }
        ]  
        
        compoundNode.setLayoutOption(RadialOptions::CENTER_ON_ROOT, CENTER_ON_ROOT.booleanValue);
//        compoundNode.setLayoutOption(CoreOptions::TOPDOWN_PROCESSORS_RADIAL_EDGE_ROTATION, true)
//        compoundNode.setLayoutOption(RadialOptions::OPTIMIZATION_CRITERIA, RadialTranslationStrategy.EDGE_LENGTH)
        compoundNode.setLayoutOption(RadialOptions::ROTATE, true)
//        compoundNode.setLayoutOption(RadialOptions::TARGET_ANGLE, Math.PI * 0.75)
        compoundNode.setLayoutOption(RadialOptions::ROTATION_OUTGOING_EDGE_ANGLES, true)
        compoundNode.setLayoutOption(RadialOptions::ROTATION_COMPUTE_ADDITIONAL_WEDGE_SPACE, true)
        compoundNode.setLayoutOption(RadialOptions::COMPACTOR, CompactionStrategy.RADIAL_COMPACTION)
        compoundNode.setLayoutOption(RadialOptions::WEDGE_CRITERIA, AnnulusWedgeCriteria.LEAF_NUMBER)
        compoundNode.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 0.0)
        compoundNode.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.noneOf(SizeConstraint))
        compoundNode.setLayoutOption(CoreOptions.NODE_SIZE_FIXED_GRAPH_SIZE, true)
        compoundNode.setLayoutOption(CoreOptions::ALGORITHM, RadialOptions.ALGORITHM_ID)
        compoundNode.setLayoutOption(CoreOptions::TOPDOWN_LAYOUT, true)
        compoundNode.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.HIERARCHICAL_NODE)
        compoundNode.setLayoutOption(CoreOptions::CONTENT_ALIGNMENT, 
            EnumSet.of(ContentAlignment.V_CENTER, ContentAlignment.H_CENTER)
        )

        if (ROUNDED_BOUNDING_BOX.booleanValue) {
            // TODO: fix general case
          val shift  = roundedRectangleShift(balloonRadius-LINE_THICKNESS, balloonRadius-LINE_THICKNESS)
//            val shift  = roundedSquareShift(BALLOON_RADIUS-LINE_THICKNESS)
//            System.out.println("shift " + shift)
            compoundNode.setLayoutOption(CoreOptions::PADDING, new ElkPadding(shift))
//            compoundNode.setLayoutOption(KlighdProperties::ROUNDED_RECTANGLE_AUTOPADDING, new KVector(balloonRadius-LINE_THICKNESS, balloonRadius-LINE_THICKNESS));
        } else {
            compoundNode.setLayoutOption(CoreOptions::PADDING, new ElkPadding(0))
        }
        
//        compoundNode.setLayoutOption(CoreOptions::SPACING_NODE_NODE, BALLOON_RADIUS/10.0)
        // TODO: make option
        val INTERNAL_NODE_RADIUS = 10
        internalNode.setSize(2*INTERNAL_NODE_RADIUS, 2*INTERNAL_NODE_RADIUS)
        internalNode.addRoundedRectangle(INTERNAL_NODE_RADIUS,INTERNAL_NODE_RADIUS,2) => [ rect | 
            rect.setBackgroundColor(255, 100, 100)
        ]

        internalNode.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.noneOf(SizeConstraint))
                
        val leaves = new HashSet<KNode>()
        node.children.forEach[ c | 
            if (c.children.length > 0) {
                compoundNode.children += createCompoundNode(c)
            } else {
                val leaf = createLeafNode(c)
                compoundNode.children += leaf
                leaves.add(leaf)
            } 
        ]
        compoundNode.children.forEach[ c |
            val edge = createEdge()
            edge.addPolyline() => [ poly |
                if (!leaves.contains(c)) {
                    poly.setForegroundColor(0,0,255)
                    poly.foregroundInvisible = !SHOW_LAYOUT_EDGES.booleanValue
                }
            ]
            internalNode.outgoingEdges.add(edge)
            c.incomingEdges.add(edge)
        ]
        compoundNode.children += internalNode

        return compoundNode
    }
    
    private def void addNoLayoutEdges(KNode node) {
        val internal = node.children.get(node.children.length-1)
        node.children.forEach[ c | 
            if (c.children.length > 0) {
                val noLayoutEdge = createEdge()
                noLayoutEdge.setLayoutOption(CoreOptions::NO_LAYOUT, true)
                // last child of a compoundNode is always the internal node, draw edge without layout between these nodes
                val childInternal = c.children.get(c.children.length-1)
                internal.outgoingEdges.add(noLayoutEdge)
                childInternal.incomingEdges.add(noLayoutEdge)
                
                // TEMP TEST STUFF

//                c.children.forEach[ gc | 
//                    if (gc.children.length > 0) {
//                        val grandfatherEdge = createEdge()
//                    grandfatherEdge.addPolyline() => [ poly |
//                        poly.setForegroundColor(255,0,255)
//                    ]
//                    grandfatherEdge.setLayoutOption(CoreOptions::NO_LAYOUT, true)
//                    internal.outgoingEdges.add(grandfatherEdge)
//                    val grandchild = gc.children.get(gc.children.length - 1)
//                    grandchild.incomingEdges.add(grandfatherEdge)
//                    }
//                ]

                // END TEMP TEST STUFF
                
                addNoLayoutEdges(c)
            } 
        ]
    }
    
    
    // In General the solution below is not very nice for actual circles or ellipses, when the internal layout also
    // has a circular shape, but we don't really know the shape of the internal layout beforehand or only in specific cases
    // such as radial layout with one ring
    
    // this would need to be passed to ELK for the bounding box consideration
    // the calculation should be part of ELK, and the property should be something like
    // consider rounded bounding box
    // the return value is effectively the padding necessary to fit within the rounded corners
    private def double roundedRectangleShift(double radiusX, double radiusY) {
        if (radiusX < 0.00001 || radiusY < 0.00001) {
            return 0
        }
        val numerator = radiusX * radiusY * (-Math.sqrt(2) * Math.sqrt(radiusX * radiusY) + radiusX + radiusY)
        val denominator = radiusX * radiusX + radiusY * radiusY
            
        return numerator / denominator
    }
    
    // simple case where both radii are equal
    // TODO: no longer need this since we have the general case
    private def double roundedSquareShift(double radius) {
        return radius - radius / Math.sqrt(2)
    }
    
}