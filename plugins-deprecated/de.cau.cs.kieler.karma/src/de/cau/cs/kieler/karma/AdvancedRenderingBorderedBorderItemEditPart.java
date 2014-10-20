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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.karma.util.AdvancedRenderingEditPartDelegate;

/**
 * EditPart for using KARMA with BorderedBorderItems.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating yellow 2012-07-06 review KI-11 by chsch, pkl
 */
public abstract class AdvancedRenderingBorderedBorderItemEditPart extends
        BorderedBorderItemEditPart implements IAdvancedRenderingEditPart {

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
    public AdvancedRenderingBorderedBorderItemEditPart(final View view) {
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

    @Override
    public void refresh() {
        super.refresh();
        if (updateTriggerFigure) {
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
