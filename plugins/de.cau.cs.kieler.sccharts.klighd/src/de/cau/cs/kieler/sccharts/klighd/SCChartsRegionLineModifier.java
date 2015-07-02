/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KInvisibility;
import de.cau.cs.kieler.core.krendering.KLeftPosition;
import de.cau.cs.kieler.core.krendering.KPolyline;
import de.cau.cs.kieler.core.krendering.KPosition;
import de.cau.cs.kieler.core.krendering.KRenderingPackage;
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout;
import de.cau.cs.kieler.klighd.IStyleModifier;
import de.cau.cs.kieler.klighd.util.ModelingUtil;

/**
 * This modifier realizes the conditional visibility of the region separation lines.
 *
 * @author chsch
 */
public class SCChartsRegionLineModifier implements IStyleModifier {

    /**
     * {@inheritDoc}.<br>
     * <br>
     * This modifier realizes the conditional visibility of the region separation lines.
     */
    public boolean modify(StyleModificationContext context) {
        if (!KRenderingPackage.eINSTANCE.getKInvisibility().isInstance(context.getStyle())) {
            return false;
        }
        KInvisibility style = (KInvisibility) context.getStyle();
        KPolyline polyline = (KPolyline) style.eContainer();

        KNode regionNode = ModelingUtil.eContainerOfType(style, KNode.class);
        KShapeLayout layout = (KShapeLayout) context.getLayoutData();

        KNode parent = regionNode.getParent();
        if (parent == null) {
            // an emergency exit in case something really weird happened.
            return false;
        }

        if (polyline.getPoints().size() != 2) {
            // cannot determine direction of border, so no possibility to set visibility
            return false;
        }

        // chsch: simpler implementation
        if (isHorizontal(polyline)) {
            // horizontal line
            if (layout.getYpos() > 20) {
                // in case the Y component of the region's position is bigger than 20
                //  we assume there must be another one in north of 'regionNode'
                //  (20 is chosen to respect potential border spacing)
                if (style.isInvisible()) {
                    style.setInvisible(false);
                }
            } else {
                if (!style.isInvisible()) {
                    style.setInvisible(true);
                }
            }
        } else {
            // vertical line
            if (layout.getXpos() > 20) {
                // in case the X component of the region's position is bigger than 20
                //  we assume there must be another one in west of 'regionNode'
                //  (20 is chosen to respect potential border spacing)
                if (style.isInvisible()) {
                    style.setInvisible(false);
                }
            } else {
                if (!style.isInvisible()) {
                    style.setInvisible(true);
                }
            }
        }
        return true;
    }

    private Boolean isHorizontal(KPolyline line) {
        // within this method we advantage of the concrete line definition in the
        // SCChartsDiagramSynthesis!
        KPosition first = line.getPoints().get(0);
        KPosition second = line.getPoints().get(1);
        return first.getY().eClass().equals(second.getY().eClass());
    }

    /**
     * determine if p1 is right of p2
     *
     * @param p1
     *            the position to determine the position of
     * @param p2
     *            the reference position
     * @return true if p1 is right of p2, false otherwise
     */
    @SuppressWarnings("unused")
    private Boolean isRightOf(KPosition p1, KPosition p2, float parentWidth) {
        float absoluteX1 = 0.0f;
        float absoluteX2 = 0.0f;

        if (p1.getX() instanceof KLeftPosition) {
            absoluteX1 = p1.getX().getAbsolute() + p1.getX().getRelative() * parentWidth;
        } else {
            absoluteX1 = (1 - p1.getX().getRelative()) * parentWidth - p1.getX().getAbsolute();
        }

        if (p2.getX() instanceof KLeftPosition) {
            absoluteX2 = p2.getX().getAbsolute() + p2.getX().getRelative() * parentWidth;
        } else {
            absoluteX2 = (1 - p2.getX().getRelative()) * parentWidth - p2.getX().getAbsolute();
        }

        return absoluteX1 > absoluteX2;
    }
}
