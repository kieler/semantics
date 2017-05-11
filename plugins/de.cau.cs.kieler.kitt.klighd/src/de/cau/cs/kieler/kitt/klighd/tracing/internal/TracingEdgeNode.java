/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.tracing.internal;

import java.awt.Dimension;
import java.awt.geom.Dimension2D;
import java.awt.geom.Point2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.elk.core.math.KVector;
import org.eclipse.elk.graph.properties.IProperty;
import org.eclipse.elk.graph.properties.Property;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

import de.cau.cs.kieler.klighd.internal.macrolayout.AnchorUtil;
import de.cau.cs.kieler.klighd.kgraph.KEdge;
import de.cau.cs.kieler.klighd.kgraph.KGraphElement;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.krendering.KRendering;
import de.cau.cs.kieler.klighd.piccolo.internal.controller.AbstractKGERenderingController;
import de.cau.cs.kieler.klighd.piccolo.internal.controller.PNodeController;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.IInternalKGraphElementNode;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KCustomConnectionFigureNode;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KEdgeNode;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KlighdPath;
import de.cau.cs.kieler.klighd.piccolo.internal.util.Styles;
import de.cau.cs.kieler.klighd.util.ModelingUtil;
import de.cau.cs.kieler.klighd.util.RenderingContextData;
import edu.umd.cs.piccolo.PNode;

/**
 * FigueNode to represent edges with arbitrary source and target (KGraphElements and KRenderings).
 * This Node handles its own correct orthogonal routing.
 * 
 * @author als
 * @kieler.design 2015-02-25 proposed
 * @kieler.rating 2015-02-25 proposed yellow
 */
@SuppressWarnings("restriction")
public class TracingEdgeNode extends KCustomConnectionFigureNode implements PropertyChangeListener {

    /** The property for the Piccolo2D representation of a node. */
    private static final IProperty<PNode> REP =
            new Property<PNode>("klighd.piccolo.representation");
    private static final long serialVersionUID = -8894573172549728418L;
    /** Set of all collapsed parental child area */
    private final HashSet<IInternalKGraphElementNode.IKNodeNode> collapsedParentalNodes =
            new HashSet<IInternalKGraphElementNode.IKNodeNode>();
    /** Source */
    private final EObject source;
    private final boolean sourceIsEdge;
    private PNode sourceNode = null;
    private boolean ignoreFirstCollapsibleParentForSource = false;
    /** Target */
    private final EObject target;
    private final boolean targetIsEdge;
    private PNode targetNode = null;
    private boolean ignoreFirstCollapsibleParentForTarget = false;
    /** The node this edge is attached to */
    private final KNode attachNode;
    /** Flag if this PropertyChangeListener is successfully added to all parental child areas */
    private boolean expandPropertyChangeListenersAdded = false;

    /**
     * Creates a new TracingEdgeNode with given source and target elements for an parent edge
     * attached to the given node.
     * 
     * @param source
     *            the source element
     * @param target
     *            the target element
     * @param attachNode
     *            Most upper node in the diagram, but not root node where the KEdge is attached to.
     */
    public TracingEdgeNode(final EObject source, final EObject target, final KNode attachNode) {
        Preconditions.checkNotNull(source, "Source object is null");
        Preconditions.checkNotNull(target, "Target object is null");
        Preconditions.checkNotNull(attachNode, "Attach node is null");

        this.source = source;
        this.sourceIsEdge = source instanceof KEdge;
        this.target = target;
        this.targetIsEdge = target instanceof KEdge;
        this.attachNode = attachNode;
        addExpandPropertyChangeListeners();
    }

    /**
     * Adds listeners to hide edge when any source or target container is collapsed.
     */
    private void addExpandPropertyChangeListeners() {
        if (!expandPropertyChangeListenersAdded) {
            expandPropertyChangeListenersAdded =
                    addExpandPropertyChangeListeners(source.eContainer(), ignoreFirstCollapsibleParentForSource)
                            && addExpandPropertyChangeListeners(target.eContainer(), ignoreFirstCollapsibleParentForTarget);
        }
    }

    /**
     * Adds PropertyChangeListener to all ChildAreaNode of the given startObject and all
     * eContainers.
     * 
     * @param startObject
     *            EObject to add
     * @return success of adding the listeners
     */
    private boolean addExpandPropertyChangeListeners(final EObject startObject, boolean ignoreFirstCollapsibleParent) {
        KNode node = getKNode(startObject);
        boolean ignore = ignoreFirstCollapsibleParent;
        while (node != null) {
            PNode nodeNode = RenderingContextData.get(node).getProperty(REP);
            if (nodeNode == null) {// In case this edge is created before any PNode is created
                                   // (synthesis time)
                return false;
            }
            if (nodeNode instanceof IKNodeNode) {
            	if (ignore) {
            		ignore = false;
            	} else {
	                nodeNode.addPropertyChangeListener(IKNodeNode.PROPERTY_EXPANSION, this);
	                if (!((IKNodeNode) nodeNode).isExpanded()) {
	                    collapsedParentalNodes.add((IKNodeNode) nodeNode);
	                }
            	}
            }
            node = node.getParent();
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void propertyChange(final PropertyChangeEvent event) {
        IKNodeNode source = (IKNodeNode) event.getSource();
        if ((Boolean) event.getNewValue()) {
            collapsedParentalNodes.remove(source);
        } else {
            collapsedParentalNodes.add(source);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParent(final PNode newParent) {
        // When the diagram is displayed it is faded in and the position of PNode are updated on
        // order and not by change events leading to the situation than source and target PNodes
        // don't have any points. As a consequence this case is handled by an listener reacting on
        // the fade in effect and updating the points again.
        if (newParent instanceof KEdgeNode) {
            newParent.addPropertyChangeListener(PNode.PROPERTY_TRANSPARENCY,
                    new PropertyChangeListener() {
                        public void propertyChange(PropertyChangeEvent evt) {
                            // update positions
                            TracingEdgeNode.this.setPoints(null);
                            // work done so remove the listener
                            newParent.removePropertyChangeListener(this);
                        }
                    });
        }
        super.setParent(newParent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPoints(Point2D[] points) {
        try {
            // If TracingEdgeNode is added at synthesis time the listeners must be added now
            addExpandPropertyChangeListeners();
            if (collapsedParentalNodes.isEmpty()) {
                this.setVisible(true);
                final Point2D[] thePoints =
                        new Point2D[] { new Point2D.Double(), new Point2D.Double() };

                // add offset translation of attachNode
                if (attachNode.getParent() != null) {
                    final PNode attachNodeNode =
                            RenderingContextData.get(attachNode.getParent()).getProperty(REP);
                    thePoints[0].setLocation(attachNodeNode.getGlobalTranslation());
                    thePoints[1].setLocation(attachNodeNode.getGlobalTranslation());
                }

                // source position
                if (sourceNode == null) {
                    sourceNode = getPNode(source);
                }
                if (sourceNode != null) {
                    addToPoint(thePoints[0], sourceNode.getGlobalTranslation());
                } else {
                	this.setVisible(false);
                    return;
                }

                // target position
                if (targetNode == null) {
                    targetNode = getPNode(target);
                }
                if (targetNode != null) {
                    addToPoint(thePoints[1], targetNode.getGlobalTranslation());
                } else {
                	this.setVisible(false);
                    return;
                }

                // If target or source is an edge calculate before colliding towards center
                // point edge to middle of an egde
                if (sourceIsEdge) {
                    addToPoint(thePoints[0], getAppropiateBendPoint((KEdgeNode) sourceNode));
                }
                if (targetIsEdge) {
                    addToPoint(thePoints[1], getAppropiateBendPoint((KEdgeNode) targetNode));
                }
                // Calculate vector and dimension of source and target to invoke collide edge
                // towards center. This is done after calculation positions of source or targets
                // pointing on edges to have correct values now
                KVector sourceVector = new KVector(thePoints[0].getX(), thePoints[0].getY());
                Dimension2D sourceDimension = null;
                KRendering sourceRendering = null;
                if (sourceIsEdge) {
                    sourceDimension = new Dimension(0, 0);
                } else {
                    sourceDimension = sourceNode.getFullBoundsReference().getSize();
                    if (source instanceof KRendering) {
                        sourceRendering = (KRendering) source;
                    } else if (source instanceof KNode) {
                        sourceRendering = ((KNode) source).getData(KRendering.class);
                    }
                }
                KVector targetVector = new KVector(thePoints[1].getX(), thePoints[1].getY());
                Dimension2D targetDimension = null;
                KRendering targetRendering = null;
                if (targetIsEdge) {
                    targetDimension = new Dimension(0, 0);
                } else {
                    targetDimension = targetNode.getFullBoundsReference().getSize();
                    if (target instanceof KRendering) {
                        targetRendering = (KRendering) target;
                    } else if (target instanceof KNode) {
                        targetRendering = ((KNode) target).getData(KRendering.class);
                    }
                }
                // Add offset to collide edge towards center if target or source is not an edge
                // target -> source
                if (!sourceIsEdge) {
                    addToPoint(thePoints[0], AnchorUtil.collideTowardsCenter(
                            targetVector
                                    .clone()
                                    .sub(sourceVector)
                                    .add(targetDimension.getWidth() / 2,
                                            targetDimension.getHeight() / 2),
                            sourceDimension.getWidth(), sourceDimension.getHeight(),
                            sourceRendering));
                }
                // source -> target
                if (!targetIsEdge) {
                    addToPoint(thePoints[1], AnchorUtil.collideTowardsCenter(
                            sourceVector
                                    .clone()
                                    .sub(targetVector)
                                    .add(sourceDimension.getWidth() / 2,
                                            sourceDimension.getHeight() / 2),
                            targetDimension.getWidth(), targetDimension.getHeight(),
                            targetRendering));
                }

                // Apply points
                if (thePoints[0] != null && thePoints[1] != null) {
                    for (KlighdPath p : Iterables.filter(this.getChildrenReference(),
                            KlighdPath.class)) {
                        p.setPathToPolyline(thePoints);
                        return;
                    }
                }
            } else {
                this.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.setVisible(false);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void applyStyles(Styles styles) {
    }
    
    /**
     * If ignore is set to true, the first parent which is collapsible is ignored when searching for collapse parents.
     */
    public void setIgnoreFirstCollapsibleParent(boolean ignoreForSource, boolean ignoreForTarget) {
    	ignoreFirstCollapsibleParentForSource = ignoreForSource;
    	ignoreFirstCollapsibleParentForTarget = ignoreForTarget;
    }
    
    /**
     * @return the source
     */
    public EObject getSource() {
		return source;
	}

    /**
     * @return the target
     */
	public EObject getTarget() {
		return target;
	}

    /**
     * Returns the PNode representation of the given KGraphElement or KRendering
     * 
     * @param elem
     *            graph element
     * @return PNode representation, null if non found
     */
    private PNode getPNode(final EObject elem) {
        if (elem instanceof KGraphElement) {
            return RenderingContextData.get((KGraphElement) elem).getProperty(REP);
        } else if (elem instanceof KRendering) {
            // Find least upper KGraphElement
            KGraphElement graphElement = ModelingUtil.eContainerOfType(elem, KGraphElement.class);
            // Find PNode representing KRending
            if (graphElement != null) {
                PNode graphElementNode = RenderingContextData.get(graphElement).getProperty(REP);
                if (graphElementNode instanceof IInternalKGraphElementNode) {
                    AbstractKGERenderingController<?, ?> renderingControler =
                            ((IInternalKGraphElementNode<?>) graphElementNode)
                                    .getRenderingController();
                    Collection<PNodeController<?>> pNodeControllers =
                            renderingControler.getPNodeController((KRendering) elem);
                    if (!pNodeControllers.isEmpty()) {
                        return pNodeControllers.iterator().next().getNode().asPNode();
                    }
                }
            }
            return null;
        } else {
            return null;
        }
    }

    /**
     * Returns a point to the middle part of an edge
     * 
     * @param node
     *            edge node
     * @return point
     */
    private Point2D getAppropiateBendPoint(KEdgeNode node) {
        Point2D[] bendPoints = node.getBendPoints();
        if (bendPoints.length % 2 == 0) {
            Point2D pointA = bendPoints[(bendPoints.length - 1) / 2];
            Point2D pointB = bendPoints[bendPoints.length / 2];
            return new Point2D.Double((pointA.getX() + pointB.getX()) / 2,
                    (pointA.getY() + pointB.getY()) / 2);
        } else {
            return bendPoints[(bendPoints.length - 1) / 2];
        }
    }

	/**
     * Added given offset point to given point.
     * 
     * @param point
     * @param offset
     * @return the modified point parameter
     */
    private static Point2D addToPoint(Point2D point, Point2D offset) {
        point.setLocation(point.getX() + offset.getX(), point.getY() + offset.getY());
        return point;
    }

    /**
     * Added given offset vector to given point.
     * 
     * @param point
     * @param offset
     * @return the modified point parameter
     */
    private static Point2D addToPoint(Point2D point, KVector offset) {
        point.setLocation(point.getX() + offset.x, point.getY() + offset.y);
        return point;
    }

    /**
     * Returns the least upper container KNode of the given KGraphElement or KRendering.
     * 
     * @param object
     *            KGraphElement or KRendering element
     * @return knode
     */
    private KNode getKNode(EObject object) {
        if (object instanceof KNode) {
            return (KNode) object;
        } else if (object instanceof KGraphElement || object instanceof KRendering) {
            return getKNode(object.eContainer());
        } else {
            return null;
        }
    }
}
