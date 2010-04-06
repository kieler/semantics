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
package de.cau.cs.kieler.core.ui.figures;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.util.ICondition;
import de.cau.cs.kieler.core.util.Pair;

/**
 * An attribute aware polyline connection figure that is able to change its
 * decoration according to attribute changes. 
 * 
 * @kieler.rating 2010-01-26 proposed yellow msp
 * @author schm
 * @author msp
 */
public abstract class AttributeAwareConnection extends SplineConnection
        implements IAttributeAwareFigure {

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
    private List<Pair<Decoration, ICondition<EObject>>> conditionalFigures
            = new LinkedList<Pair<Decoration, ICondition<EObject>>>();
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
     * Set the default decoration of the connection.
     * 
     * @param sourceDeco the default source decoration
     * @param targetDeco the default target decoration
     */
    public void setDefaultDecoration(final RotatableDecoration sourceDeco,
            final RotatableDecoration targetDeco) {
        defaultDeco = new Decoration(sourceDeco, targetDeco);
        defaultDeco.apply(this);
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
        for (Pair<Decoration, ICondition<EObject>> cf : conditionalFigures) {
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
        // do not react to target change, as only {@link listenTo} may be used to change the target
    }

    /**
     * {@inheritDoc}
     */
    public void listenTo(final EObject object) {
        if (modelElement != null) {
            modelElement.eAdapters().remove(this);
        }
        modelElement = object;
        modelElement.eAdapters().add(this);
        notifyChanged(null);
    }

    /**
     * Adds a decoration with associated condition.
     * 
     * @param sourceDeco the source decoration
     * @param targetDeco the target decoration
     * @param condition the condition
     */
    protected void addConditionalDecoration(final RotatableDecoration sourceDeco,
            final RotatableDecoration targetDeco, final ICondition<EObject> condition) {
        conditionalFigures.add(new Pair<Decoration, ICondition<EObject>>(
                new Decoration(sourceDeco, targetDeco), condition));
    }

}
