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

package de.cau.cs.kieler.karma;

import java.util.HashMap;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.karma.util.AdvancedRenderingEditPartDelegate;
import de.cau.cs.kieler.karma.util.expandcollapsebutton.AdvancedRenderingResizableCompartmentEditPolicy;

/**
 * EditPart for using KARMA with BorderedShapeNodes.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating yellow 2012-07-06 review KI-11 by chsch, pkl
 */
public abstract class AdvancedRenderingBorderedShapeEditPart extends AbstractBorderedShapeEditPart
        implements IAdvancedRenderingEditPart {

    /**
     * Figure that that represents the model element.
     */
    // Visibility modification is necessary to be consistent with the generated EditParts.
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifier
    protected IFigure primaryShape;

    /**
     * Utility class containing the actual methods. Used to eliminate redundant code.
     */
    private AdvancedRenderingEditPartDelegate util;

    /**
     * The constructor. Just calls super and fills some fields.
     * 
     * @param view
     *            to be given to super
     */
    public AdvancedRenderingBorderedShapeEditPart(final View view) {
        super(view);
        String className = this.getClass().getName();
        ConditionProvider conditionProvider = ConditionProvider.getInstance();
        List<HashMap<String, Object>> conditions = conditionProvider.getPairs(className);
        util = new AdvancedRenderingEditPartDelegate(conditions);
    }

    @Override
    public void handleNotificationEvent(final Notification notification) {
        super.handleNotificationEvent(notification);
        util.handleNotificationEvent(notification, primaryShape, this.getModelElement(), this);
    }

    /**
     * {@inheritDoc}
     */
    public boolean updateFigure(final IFigure figure) {
        return util.updateFigure(figure, this.getModelElement(), this, false);
    }

    /**
     * Getter of the model element for conveniences sake.
     * 
     * @return the modelElement of this editPart
     */
    public EObject getModelElement() {
        return this.getNotationView().getElement();
    }

    /**
     * Flag for calling the updateFigure method only once while initializing the diagram.
     */
    private boolean updateTriggerFigure = true;

    /**
     * This Method installs the AdvancedRenderingResizableCompartmentEditPolicy as Primary_drag_role
     * editpolicy for all compartments of this Edit Part. This is necessary to make the
     * expand/collapse button exchangable.
     */
    private void activateExchangableExpandCollapse() {
        // Due to the nature of generics its not possible to do a real type check here.
        // The only other option is too much overhead for too less gain.
        @SuppressWarnings("unchecked")
        List<EditPart> resizeableCompartments = (List<EditPart>) this.getResizableCompartments();
        for (EditPart compartment : resizeableCompartments) {
            if (compartment instanceof IResizableCompartmentEditPart) {
                IResizableCompartmentEditPart resizeComp = (IResizableCompartmentEditPart) compartment;
                AdvancedRenderingResizableCompartmentEditPolicy arcep = 
                        new AdvancedRenderingResizableCompartmentEditPolicy();
                resizeComp.installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, arcep);
            }
        }
    }

    /**
     * set custom collapse figure.
     * 
     * @param figure
     *            the new custom figure
     */
    public void setCollapseFigure(final IFigure figure) {
        // Due to the nature of generics its not possible to do a real type check here.
        // The only other option is too much overhead for too less gain.
        @SuppressWarnings("unchecked")
        List<EditPart> resizeableCompartments = (List<EditPart>) this.getResizableCompartments();
        for (EditPart compartment : resizeableCompartments) {
            if (compartment instanceof IResizableCompartmentEditPart) {
                IResizableCompartmentEditPart resizeComp = (IResizableCompartmentEditPart) compartment;
                EditPolicy epol = resizeComp.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (epol instanceof AdvancedRenderingResizableCompartmentEditPolicy) {
                    ((AdvancedRenderingResizableCompartmentEditPolicy) epol)
                            .setCollapseFigure(figure);
                }
            }
        }
    }

    /**
     * get custom collapse figure.
     * 
     * Return value might be null if nothing has been set or something goes wrong.
     * 
     * @return the custom figure
     */
    public IFigure getCollapseFigure() {
        // Due to the nature of generics its not possible to do a real type check here.
        // The only other option is too much overhead for too less gain.
        @SuppressWarnings("unchecked")
        List<EditPart> resizeableCompartments = (List<EditPart>) this.getResizableCompartments();
        for (EditPart compartment : resizeableCompartments) {
            if (compartment instanceof IResizableCompartmentEditPart) {
                IResizableCompartmentEditPart resizeComp = (IResizableCompartmentEditPart) compartment;
                EditPolicy epol = resizeComp.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (epol instanceof AdvancedRenderingResizableCompartmentEditPolicy) {
                    return ((AdvancedRenderingResizableCompartmentEditPolicy) epol)
                            .getCollapseFigure();
                }
            }
        }

        return null;
    }

    /**
     * set custom expand figure.
     * 
     * @param figure
     *            the new custom figure
     */
    public void setExpandFigure(final IFigure figure) {
        // Due to the nature of generics its not possible to do a real type check here.
        // The only other option is too much overhead for too less gain.
        @SuppressWarnings("unchecked")
        List<EditPart> resizeableCompartments = (List<EditPart>) this.getResizableCompartments();
        for (EditPart compartment : resizeableCompartments) {
            if (compartment instanceof IResizableCompartmentEditPart) {
                IResizableCompartmentEditPart resizeComp = (IResizableCompartmentEditPart) compartment;
                EditPolicy epol = resizeComp.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (epol instanceof AdvancedRenderingResizableCompartmentEditPolicy) {
                    ((AdvancedRenderingResizableCompartmentEditPolicy) epol)
                            .setExpandFigure(figure);
                }
            }
        }
    }

    /**
     * get custom expand figure.
     * 
     * Return value might be null if nothing has been set or something goes wrong.
     * 
     * @return the custom figure
     */
    public IFigure getExpandFigure() {
        // Due to the nature of generics its not possible to do a real type check here.
        // The only other option is too much overhead for too less gain.
        @SuppressWarnings("unchecked")
        List<EditPart> resizeableCompartments = (List<EditPart>) this.getResizableCompartments();
        for (EditPart compartment : resizeableCompartments) {
            if (compartment instanceof IResizableCompartmentEditPart) {
                IResizableCompartmentEditPart resizeComp = (IResizableCompartmentEditPart) compartment;
                EditPolicy epol = resizeComp.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (epol instanceof AdvancedRenderingResizableCompartmentEditPolicy) {
                    return ((AdvancedRenderingResizableCompartmentEditPolicy) epol)
                            .getExpandFigure();
                }
            }
        }
        return null;
    }

    /**
     * set custom collapse/expand locator.
     * 
     * @param locator
     *            the new custom locator
     */
    public void setCollapseExpandLocator(final Locator locator) {
        // Due to the nature of generics its not possible to do a real type check here.
        // The only other option is too much overhead for too less gain.
        @SuppressWarnings("unchecked")
        List<EditPart> resizeableCompartments = (List<EditPart>) this.getResizableCompartments();
        for (EditPart compartment : resizeableCompartments) {
            if (compartment instanceof IResizableCompartmentEditPart) {
                IResizableCompartmentEditPart resizeComp = (IResizableCompartmentEditPart) compartment;
                EditPolicy epol = resizeComp.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (epol instanceof AdvancedRenderingResizableCompartmentEditPolicy) {
                    ((AdvancedRenderingResizableCompartmentEditPolicy) epol)
                            .setCollapseExpandLocator(locator);
                }
            }
        }
    }

    /**
     * get custom collapse/expand locator.
     * 
     * Return value might be null if nothing has been set or something goes wrong.
     * 
     * @return the custom locator
     */
    public Locator getCollapseExpandLocator() {
        // Due to the nature of generics its not possible to do a real type check here.
        // The only other option is too much overhead for too less gain.
        @SuppressWarnings("unchecked")
        List<EditPart> resizeableCompartments = (List<EditPart>) this.getResizableCompartments();
        for (EditPart compartment : resizeableCompartments) {
            if (compartment instanceof IResizableCompartmentEditPart) {
                IResizableCompartmentEditPart resizeComp = (IResizableCompartmentEditPart) compartment;
                EditPolicy epol = resizeComp.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (epol instanceof AdvancedRenderingResizableCompartmentEditPolicy) {
                    return ((AdvancedRenderingResizableCompartmentEditPolicy) epol)
                            .getCollapseExpandLocator();
                }
            }
        }
        return null;
    }

    /**
     * set custom size of the clickable area to expand/collapse.
     * 
     * @param dim
     *            the size of the clickable area
     */
    public void setCollapseExpandSize(final Dimension dim) {
        // Due to the nature of generics its not possible to do a real type check here.
        // The only other option is too much overhead for too less gain.
        @SuppressWarnings("unchecked")
        List<EditPart> resizeableCompartments = (List<EditPart>) this.getResizableCompartments();
        for (EditPart compartment : resizeableCompartments) {
            if (compartment instanceof IResizableCompartmentEditPart) {
                IResizableCompartmentEditPart resizeComp = (IResizableCompartmentEditPart) compartment;
                EditPolicy epol = resizeComp.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (epol instanceof AdvancedRenderingResizableCompartmentEditPolicy) {
                    ((AdvancedRenderingResizableCompartmentEditPolicy) epol)
                            .setCollapseExpandSize(dim);
                }
            }
        }
    }

    /**
     * get the custom size of the clickable area to expand/collapse.
     * 
     * Return value might be null if nothing has been set or something goes wrong.
     * 
     * @return the size of the clickable area
     */
    public Dimension getCollapseExpandSize() {
        // Due to the nature of generics its not possible to do a real type check here.
        // The only other option is too much overhead for too less gain.
        @SuppressWarnings("unchecked")
        List<EditPart> resizeableCompartments = (List<EditPart>) this.getResizableCompartments();
        for (EditPart compartment : resizeableCompartments) {
            if (compartment instanceof IResizableCompartmentEditPart) {
                IResizableCompartmentEditPart resizeComp = (IResizableCompartmentEditPart) compartment;
                EditPolicy epol = resizeComp.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (epol instanceof AdvancedRenderingResizableCompartmentEditPolicy) {
                    return ((AdvancedRenderingResizableCompartmentEditPolicy) epol)
                            .getCollapseExpandSize();
                }
            }
        }
        return null;
    }

    @Override
    public void refresh() {
        super.refresh();
        if (updateTriggerFigure) {
            this.activateExchangableExpandCollapse();
            updateTriggerFigure = false;
            util.updateFigure(primaryShape, this.getModelElement(), this, true);
        }
    }

    /**
     * @return the primaryShape
     */
    public IFigure getPrimaryShape() {
        return primaryShape;
    }
}
