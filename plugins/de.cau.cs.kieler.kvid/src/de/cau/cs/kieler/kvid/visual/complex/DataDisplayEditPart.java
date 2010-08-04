/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kvid.visual.complex;


import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.common.ui.util.DisplayUtils;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.internal.mapmode.HiMetricMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.internal.mapmode.IdentityMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.WrapperNodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.kvid.data.DataObject;
import de.cau.cs.kieler.kvid.visual.GmfGraphicsFigure;

/**
 * @author jjc
 *
 */
public class DataDisplayEditPart extends ShapeNodeEditPart {

    /**
     * 
     * @param view The view connected to this edit part
     */
    public DataDisplayEditPart(final View view) {
        super(view);
    }

    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#createNodeFigure()
     */
    @Override
    protected NodeFigure createNodeFigure() {
        RenderedImage image = 
            RenderedImageFactory.getInstance(
                    "/home/jjc/workspace/kieler/de.cau.cs.kieler.kvid/images/drawing.svg");
        GmfGraphicsFigure figure = new GmfGraphicsFigure(new DataObject("muh", "3"), image);
        WrapperNodeFigure container = new WrapperNodeFigure(figure);
        return container;
    }

}
