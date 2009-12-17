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

import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.core.ui.util.ICondition;
import de.cau.cs.kieler.core.util.Pair;

/**
 * This class represents connections that are able to change their appearance
 * when properties of their corresponding model elements change.
 * 
 * @author schm
 * @author msp
 */
public abstract class AttributeAwareConnection extends PolylineConnectionEx implements Adapter {

    /** Container for source and target decoration. */
    private static class Decoration {
        private RotatableDecoration sourceDeco;
        private RotatableDecoration targetDeco;
        
        /**
         * Creates a decoration container.
         * 
         * @param thesourceDeco the source decoration
         * @param thetargetDeco the target decoration
         */
        public Decoration(final RotatableDecoration thesourceDeco,
                final RotatableDecoration thetargetDeco) {
            this.sourceDeco = thesourceDeco;
            this.targetDeco = thetargetDeco;
        }
        
        /**
         * Applies the decoration to a given connection figure.
         * 
         * @param connection the connection figure
         */
        public void apply(final PolylineConnection connection) {
            connection.setSourceDecoration(sourceDeco);
            connection.setTargetDecoration(targetDeco);
        }
        
    }
    
    /** Contains all possible decorations and conditions when they are to be displayed. */
    private List<Pair<Decoration, ICondition>> conditionalFigures
            = new LinkedList<Pair<Decoration, ICondition>>();
    /** This figure's corresponding model element. */
    private EObject modelElement;
    /** 
     * The default decoration that is to be displayed when no conditions of
     * other decorations are fulfilled.
     */
    private Decoration defaultDeco;

    /**
     * The constructor.
     */
    public AttributeAwareConnection() {
        super();
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
     * Set the default decoration of the connection.
     * 
     * @param sourceDeco the default source decoration
     * @param targetDeco the default target decoration
     */
    public void setDefaultDecoration(final RotatableDecoration sourceDeco,
            final RotatableDecoration targetDeco) {
        this.defaultDeco = new Decoration(sourceDeco, targetDeco);
    }

    /**
     * Adjust the look of the connection according to the changes recorded in
     * the notification.
     * 
     * @param notification The notification that contains the changes to the
     *            model element.
     */
    public void notifyChanged(final Notification notification) {
        defaultDeco.apply(this);
        for (Pair<Decoration, ICondition> cf : conditionalFigures) {
            if (cf.getSecond().evaluate(modelElement)) {
                cf.getFirst().apply(this);
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
     * Adds a decoration with associated condition.
     * 
     * @param sourceDeco the source decoration
     * @param targetDeco the target decoration
     * @param condition the condition
     */
    protected void addConditionalDecoration(final RotatableDecoration sourceDeco,
            final RotatableDecoration targetDeco, final ICondition condition) {
        conditionalFigures.add(new Pair<Decoration, ICondition>(
                new Decoration(sourceDeco, targetDeco), condition));
    }

}
