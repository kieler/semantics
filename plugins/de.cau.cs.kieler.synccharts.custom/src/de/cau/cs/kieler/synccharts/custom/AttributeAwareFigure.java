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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.custom;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import de.cau.cs.kieler.core.ui.util.ICondition;
import de.cau.cs.kieler.core.util.Pair;

/**
 * This class represents node figures that are aware of changes made to their
 * corresponding model element.
 * 
 * @author schm
 * @author msp
 */
public abstract class AttributeAwareFigure extends Figure implements Adapter {

    /** Contains all possible figures and conditions when they are to be displayed. */
    private List<Pair<IFigure, ICondition>> conditionalFigures
            = new LinkedList<Pair<IFigure, ICondition>>();
    /** This figure's corresponding model element. */
    private EObject modelElement;
    /**
     * The default figure that is to be displayed when no conditions of other
     * figures are fulfilled.
     */
    private IFigure defaultFigure;
    /** The figure that will be drawn when the paint method is called. */
    private IFigure currentFigure;

    /**
     * The constructor.
     */
    public AttributeAwareFigure() {
        super();
    }

    /**
     * Establish a link between the figure and its edit part.
     * 
     * @param e The edit part to watch.
     */
    public void setModelElementAndRegisterFromEditPart(final EditPart e) {
        modelElement = ((View) (e.getModel())).getElement();
        modelElement.eAdapters().add(this);
    }

    /**
     * Set the figure that is to be drawn if no condition id fulfilled.
     * 
     * @param figure The figure to be drawn if no condition is fulfilled.
     */
    public void setDefaultFigure(final Figure figure) {
        defaultFigure = figure;
    }

    /**
     * Paints the figure. Instead of painting the figure itself, its currentFigure
     * is painted after its bounds have been adjusted.
     * 
     * @param graphics The Graphics object used for painting
     */
    @Override
    public void paint(final Graphics graphics) {
        super.paint(graphics);
        Rectangle newBounds = new Rectangle();
        newBounds.x = this.getBounds().x + 1;
        newBounds.y = this.getBounds().y + 1;
        newBounds.width = this.getBounds().width - 1;
        newBounds.height = this.getBounds().height - 1;
        currentFigure.setBounds(newBounds);
        currentFigure.paint(graphics);
    }

    /**
     * Returns the current figure that is to be drawn.
     * 
     * @return The current figure that is to be drawn.
     */
    public IFigure getCurrentFigure() {
        return currentFigure;
    }

    /**
     * Sets the figure that is currently to be drawn.
     * 
     * @param f The figure that is currently to be drawn.
     */
    public void setCurrentFigure(final IFigure f) {
        currentFigure = f;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setForegroundColor(final Color fg) {
        super.setForegroundColor(fg);
        currentFigure.setForegroundColor(fg);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBackgroundColor(final Color bg) {
        super.setBackgroundColor(bg);
        currentFigure.setBackgroundColor(bg);
    }

    /**
     * Adjust the appearance to the changes reported in the notification.
     * 
     * @param notification The notification containing the changes made to the
     *            model element.
     */
    public void notifyChanged(final Notification notification) {
        currentFigure = defaultFigure;
        for (Pair<IFigure, ICondition> cf : conditionalFigures) {
            if (cf.getSecond().evaluate(modelElement)) {
                currentFigure = cf.getFirst();
                break;
            }
        }
        this.repaint();
    }

    /**
     * {@inheritDoc}
     */
    public Notifier getTarget() {
        return modelElement;
    }

    /**
     * {@inheritDoc}
     */
    public void setTarget(final Notifier newTarget) {
        if (newTarget instanceof EObject) {
            modelElement = (EObject) newTarget;
        }
    }

    /**
     * Adds a figure with associated condition.
     * 
     * @param figure the figure
     * @param condition the condition
     */
    protected void addConditionalFigure(final IFigure figure, final ICondition condition) {
        conditionalFigures.add(new Pair<IFigure, ICondition>(figure, condition));
    }
}
