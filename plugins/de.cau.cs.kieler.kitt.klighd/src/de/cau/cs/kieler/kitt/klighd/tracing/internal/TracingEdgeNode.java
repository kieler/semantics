/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.tracing.internal;

import java.awt.geom.Dimension2D;
import java.awt.geom.Point2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KGraphElement;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KInvisibility;
import de.cau.cs.kieler.core.krendering.KRendering;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingProperties;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.INode;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KChildAreaNode;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KCustomConnectionFigureNode;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KEdgeNode;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KlighdPath;
import de.cau.cs.kieler.klighd.piccolo.internal.util.Styles;
import de.cau.cs.kieler.klighd.util.RenderingContextData;
import edu.umd.cs.piccolo.PNode;

/**
 * @author als
 * 
 */
@SuppressWarnings("restriction")
public class TracingEdgeNode extends KCustomConnectionFigureNode implements PropertyChangeListener {

    /** the property for the Piccolo2D representation of a node. */
    private static final IProperty<PNode> REP =
            new Property<PNode>("klighd.piccolo.representation");
    private static final long serialVersionUID = -8894573172549728418L;
    private final HashSet<KChildAreaNode> collapsedParentalChildAreaNodes =
            new HashSet<KChildAreaNode>();
    private boolean hide;
    private final KRendering parent;
    private final EObject source;
    private final EObject target;
    private final KNode attachNode;

    /**
     * Constructor.
     */
    public TracingEdgeNode(KRendering parent, EObject source, EObject target, KNode attachNode) {
        Preconditions.checkNotNull(parent, "Parent KRendring is null");
        Preconditions.checkNotNull(source, "Source object is null");
        Preconditions.checkNotNull(target, "Target object is null");
        Preconditions.checkNotNull(attachNode, "Attach node is null");
        this.parent = parent;
        this.source = source;
        this.target = target;
        this.attachNode = attachNode;
        // add listeners to hide edge when source or target container is collapsed
        addExpandPropertyChangeListeners(source.eContainer());
        addExpandPropertyChangeListeners(target.eContainer());
    }

    /**
     * @param source2
     */
    private void addExpandPropertyChangeListeners(final EObject startObject) {
        KNode node = getKNode(startObject);
        while (node != null) {
            PNode nodeNode = RenderingContextData.get(node).getProperty(REP);
            if (nodeNode instanceof INode) {
                final KChildAreaNode childAreaNode = ((INode) nodeNode).getChildAreaNode();
                if (childAreaNode != null) {
                    childAreaNode
                            .addPropertyChangeListener(KChildAreaNode.PROPERTY_EXPANSION, this);
                    if (!childAreaNode.isExpanded()) {
                        collapsedParentalChildAreaNodes.add(childAreaNode);
                        updateHiding();
                    }
                } else {
                    System.out.println("bububu");
                }
            }
            node = node.getParent();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void propertyChange(final PropertyChangeEvent event) {
        KChildAreaNode source = (KChildAreaNode) event.getSource();
        if ((Boolean) event.getNewValue()) {
            collapsedParentalChildAreaNodes.remove(source);
        } else {
            collapsedParentalChildAreaNodes.add(source);
        }
        updateHiding();
    }

    /**
     * 
     */
    private void updateHiding() {
        Iterable<KInvisibility> invisibilites =
                Iterables.filter(parent.getStyles(), KInvisibility.class);
        KInvisibility invisibility;
        if (invisibilites.iterator().hasNext()) {
            invisibility = Iterables.getLast(invisibilites);
        } else {
            invisibility = KRenderingFactory.eINSTANCE.createKInvisibility();
            parent.getStyles().add(invisibility);
        }
        if (!invisibility.isPropagateToChildren()) {
            invisibility.setProperty(TracingProperties.TRACING_INTERNAL_STYLE, true);
            invisibility.setPropagateToChildren(true);
        }
        if (invisibility.isInvisible() != (hide || !collapsedParentalChildAreaNodes.isEmpty())) {
            invisibility.setProperty(TracingProperties.TRACING_INTERNAL_STYLE, true);
            invisibility.setInvisible(hide || !collapsedParentalChildAreaNodes.isEmpty());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPoints(Point2D[] points) {
        try {
            if (!hide && collapsedParentalChildAreaNodes.isEmpty()) {
                final Point2D[] thePoints =
                        new Point2D[] { new Point2D.Double(), new Point2D.Double() };
                if (attachNode.getParent() != null) {
                    final PNode attachNodeNode =
                            RenderingContextData.get(attachNode.getParent()).getProperty(REP);
                    thePoints[0].setLocation(attachNodeNode.getGlobalTranslation());
                    thePoints[1].setLocation(attachNodeNode.getGlobalTranslation());
                }
                if (source instanceof KGraphElement) {
                    KGraphElement sourceElem = (KGraphElement) source;
                    PNode sourceNode = RenderingContextData.get(sourceElem).getProperty(REP);
                    addToPoint(thePoints[0], sourceNode.getGlobalTranslation());
                    if (source instanceof KEdge) {
                        addToPoint(thePoints[0], getAppropiateBendPoint((KEdgeNode) sourceNode));
                    } else {
                        addToPoint(thePoints[0], sourceNode.getFullBoundsReference().getSize(), 0.5);
                    }
                }
                if (target instanceof KGraphElement) {
                    KGraphElement targetElem = (KGraphElement) target;
                    PNode targetNode = RenderingContextData.get(targetElem).getProperty(REP);
                    addToPoint(thePoints[1], targetNode.getGlobalTranslation());
                    if (target instanceof KEdge) {
                        addToPoint(thePoints[1], getAppropiateBendPoint((KEdgeNode) targetNode));
                    } else {
                        addToPoint(thePoints[1], targetNode.getFullBoundsReference().getSize(), 0.5);
                    }
                }
                // Apply
                if (thePoints[0] != null && thePoints[1] != null) {
                    for (KlighdPath p : Iterables.filter(this.getChildrenReference(),
                            KlighdPath.class)) {
                        p.setPathToPolyline(thePoints);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void applyStyles(Styles styles) {
        if (styles.invisibility.getProperty(TracingProperties.TRACING_INTERNAL_STYLE)) {
            styles.invisibility.setProperty(TracingProperties.TRACING_INTERNAL_STYLE, false);
        } else {
            hide = styles.invisibility.isInvisible();
            updateHiding();
        }
    }

    /**
     * @param sourceNode
     * @return
     */
    private Point2D getAppropiateBendPoint(KEdgeNode node) {
        Point2D[] bendPoints = node.getBendPoints();
        if (bendPoints.length % 2 == 0) {
            return bendPoints[bendPoints.length / 2];
        } else {
            return bendPoints[bendPoints.length / 2 + 1];
        }
    }

    private static Point2D addToPoint(Point2D point, Point2D offset) {
        point.setLocation(point.getX() + offset.getX(), point.getY() + offset.getY());
        return point;
    }

    private static Point2D addToPoint(Point2D point, Dimension2D offset, double factor) {
        point.setLocation(point.getX() + (offset.getWidth() * factor),
                point.getY() + (offset.getHeight() * factor));
        return point;
    }

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
