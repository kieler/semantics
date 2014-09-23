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

import de.cau.cs.kieler.klighd.microlayout.Bounds;
import de.cau.cs.kieler.klighd.piccolo.internal.controller.KlighdPathController;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KCustomConnectionFigureNode;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KlighdPath;
import de.cau.cs.kieler.klighd.piccolo.internal.util.Styles;

/**
 * @author als
 *
 */
@SuppressWarnings("restriction")
public class TracingEdgeNode extends KCustomConnectionFigureNode {

    private static final long serialVersionUID = -8894573172549728418L;

    /**
     * Constructor.
     */
    public TracingEdgeNode() {
        this.addChild(delegate);
    }
    
    final KlighdPath delegate = new KlighdPath();
    final KlighdPathController controller = new KlighdPathController(delegate) {
        
        @Override
        public void setBounds(Bounds bounds) {
        }
    };
 
    /**
     * {@inheritDoc}
     */
    @Override
    public void setPoints(Point2D[] points) {
//        KGraphElement kge = getRendering().getProperty(SOURCE);
//        KLayoutData kld = kge.getData(KLayoutData.class);
//        
//        if (kld instanceof KEdgeLayout) {
//            KEdgeLayout el = kld;
//        } else {
//            
//        }
//        
//        for (KlighdPath p : Iterables.filter(this.getChildrenReference(), KlighdPath.class)) {
//            p.setPathToPolyline(points);
//            return;
//        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void applyStyles(Styles styles) {
        controller.applyChanges(styles);
    }
}
