package de.cau.cs.kieler.synccharts.klighd;

import org.eclipse.xtext.EcoreUtil2;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KInvisibility;
import de.cau.cs.kieler.core.krendering.KLeftPosition;
import de.cau.cs.kieler.core.krendering.KPolyline;
import de.cau.cs.kieler.core.krendering.KPosition;
import de.cau.cs.kieler.core.krendering.KStyle;
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout;
import de.cau.cs.kieler.klighd.IStyleModifier;
import de.cau.cs.kieler.klighd.StyleModificationContext;

public class RegionLineModifier implements IStyleModifier {

    /**
     * 
     * {@inheritDoc}
     */
    public boolean modify(StyleModificationContext context) {
        KStyle toBeModified = context.getStyle();
        if (toBeModified instanceof KInvisibility) {
            KInvisibility v = (KInvisibility) toBeModified;
            KPolyline r = (KPolyline) v.eContainer();

            KNode node = EcoreUtil2.getContainerOfType(v, KNode.class);
            KShapeLayout layout = node.getData(KShapeLayout.class);

            KNode parent = node.getParent();
            KShapeLayout parentlayout = parent.getData(KShapeLayout.class);

            if (r.getPoints().size() < 2) {
                // cannot determine direction of border, so no possibility to set visibility
                return false;
            } else {
                KPosition start = r.getPoints().get(0);
                KPosition end = r.getPoints().get(r.getPoints().size() - 1);

                if (isRightOf(end, start, parentlayout.getWidth())) {
                    // horizontal line
                    if (layout.getYpos() > 10) {
                        v.setInvisible(false);
                    }
                } else {
                    // vertical line
                    if (layout.getXpos() > 10) {
                        v.setInvisible(false);
                    }
                }
                return true;
            }

        } 
        return false;
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
