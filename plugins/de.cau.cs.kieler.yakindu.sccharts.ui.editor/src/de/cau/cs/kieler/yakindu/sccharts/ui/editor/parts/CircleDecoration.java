package de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts;


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A decoration that depicts a circle.
 * 
 * @author wah
 */
public class CircleDecoration extends PolygonDecoration{

    /**
     * Sets the angle by which rotation is to be done on the PolygonDecoration.
     * This method has to be empty, otherwise the circle would change its size
     * at different angles.
     * 
     * @param angle angle of rotation
     */
    @Override
    public void setRotation(final double angle) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void outlineShape(final Graphics g) {
        Rectangle ovalBounds = getBounds().getCopy();
        ovalBounds.shrink(new Insets(1));
        g.drawOval(ovalBounds);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void fillShape(final Graphics g) {
        Rectangle ovalBounds = getBounds().getCopy();
        ovalBounds.shrink(new Insets(1));
        g.fillOval(ovalBounds);
    }

}
