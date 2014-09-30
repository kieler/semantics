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

import java.awt.geom.Point2D;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

import de.cau.cs.kieler.core.kgraph.KGraphElement;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KCustomConnectionFigureNode;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KlighdPath;
import de.cau.cs.kieler.klighd.piccolo.internal.util.Styles;
import de.cau.cs.kieler.klighd.util.RenderingContextData;
import edu.umd.cs.piccolo.PNode;

/**
 * @author als
 * 
 */
@SuppressWarnings("restriction")
public class TracingEdgeNode extends KCustomConnectionFigureNode {

    /** the property for the Piccolo2D representation of a node. */
    static final IProperty<PNode> REP = new Property<PNode>("klighd.piccolo.representation");
    private static final long serialVersionUID = -8894573172549728418L;
    private final EObject source;
    private final EObject target;
    private final KNode attachNode;

    /**
     * Constructor.
     */
    public TracingEdgeNode(EObject source, EObject target, KNode attachNode) {
        Preconditions.checkNotNull(source, "Source object is null");
        Preconditions.checkNotNull(source, "Target object is null");
        this.source = source;
        this.target = target;
        this.attachNode = attachNode;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPoints(Point2D[] points) {
        final Point2D[] thePoints = new Point2D[] { new Point2D.Double(), new Point2D.Double() };
        if (attachNode != null) {
            final PNode attachNodeNode = RenderingContextData.get(attachNode).getProperty(REP);
            thePoints[0].setLocation(attachNodeNode.getGlobalTranslation());
            thePoints[1].setLocation(attachNodeNode.getGlobalTranslation());
        }
        if (source instanceof KGraphElement) {
            KGraphElement sourceElem = (KGraphElement) source;
            PNode sourceNode = RenderingContextData.get(sourceElem).getProperty(REP);
            add(thePoints[0], sourceNode.getGlobalTranslation());
        }
        if (target instanceof KGraphElement) {
            KGraphElement targetElem = (KGraphElement) target;
            PNode targetNode = RenderingContextData.get(targetElem).getProperty(REP);
            add(thePoints[1], targetNode.getGlobalTranslation());
        }
        // Apply
        if (thePoints[0] != null && thePoints[1] != null) {
            for (KlighdPath p : Iterables.filter(this.getChildrenReference(), KlighdPath.class)) {
                p.setPathToPolyline(thePoints);
                return;
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void applyStyles(Styles styles) {
    }

    private static Point2D add(Point2D first, Point2D second) {
        first.setLocation(first.getX() + second.getX(), first.getY() + second.getY());
        return first;
    }

}
