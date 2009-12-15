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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This class represents connections that are able to change their appearance
 * when properties of their corresponding model elements change.
 * 
 * @author schm
 */
public abstract class AttributeAwareConnection extends PolylineConnectionEx implements Adapter {

    /**
     * The look of a figure contains only its decorations, but can easily be
     * extended to also contain line color etc. This list contains all possible
     * looks and when they are to be displayed
     */
    private List<ConditionalConnectionLook> conditionalFigureList;

    /** The model element that corresponds to this figure. */
    private EObject modelElement;
    /** The default look that is to be displayed when no conditionalFigure's
     * conditions are all fulfilled. */
    private ConditionalConnectionLook defaultLook;

    /**
     * The constructor.
     */
    public AttributeAwareConnection() {
        super();
    }

    /**
     * Returns the modelElement the connection is supposed to react to.
     * 
     * @return The model element
     */
    public EObject getModelElement() {
        return modelElement;
    }

    /**
     * Tells a connection which edit part it has to watch.
     * 
     * @param e The edit part to watch.
     */
    public void setModelElementAndRegisterFromEditPart(final EditPart e) {
        modelElement = ((View) (e.getModel())).getElement();
        modelElement.eAdapters().add(this);
    }

    /**
     * Set the default look of the connection.
     * 
     * @param look The look that is used if no condition is fulfilled.
     */
    public void setDefaultLook(final ConditionalConnectionLook look) {
        defaultLook = look;
    }

    /**
     * Returns the default look.
     * 
     * @return The look that is to be used if no condition is fulfilled.
     */
    public ConditionalConnectionLook getDefaultLook() {
        return defaultLook;
    }

    /**
     * Adjust the look of the connection according to the changes recorded in
     * the notification.
     * 
     * @param notification The notification that contains the changes to the
     *            model element.
     */
    public void notifyChanged(final Notification notification) {
        for (ConditionalConnectionLook cf : conditionalFigureList) {
            boolean fulfilled = true;
            for (Condition c : cf.getConditions()) {
                if (!(c.isValid(modelElement))) {
                    fulfilled = false;
                    break;
                }
            }
            if (fulfilled) {
                setLook(cf);
                break;
            } else {
                setLook(defaultLook);
            }
        }
        this.repaint();
    }

    /**
     * Set the current look of the connection.
     * 
     * @param look The current look.
     */
    protected void setLook(final ConditionalConnectionLook look) {
        this.setSourceDecoration(look.getSourceDeco());
        this.setTargetDecoration(look.getTargetDeco());
    }

    /**
     * Returns the conditionalFigureList.
     *
     * @return the conditionalFigureList
     */
    protected List<ConditionalConnectionLook> getConditionalFigureList() {
        if (conditionalFigureList == null) {
            conditionalFigureList = new LinkedList<ConditionalConnectionLook>();
        }
        return conditionalFigureList;
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

}
