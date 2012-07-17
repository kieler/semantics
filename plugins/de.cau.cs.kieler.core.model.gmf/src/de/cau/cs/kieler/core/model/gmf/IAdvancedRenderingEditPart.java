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
package de.cau.cs.kieler.core.model.gmf;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

/**
 * Advanced rendering edit part interface.
 * 
 * @author ckru
 */
public interface IAdvancedRenderingEditPart {
    
    /**
     * Override this method from the edit part. Is called every time something in the edit part changes.
     * 
     * @param notification observer notification
     */
    void handleNotificationEvent(final Notification notification);
    
    /**
     * Method that updates the given figures appearance.
     * 
     * @param figure the figure to be updated
     * @return True if figure was actually changed. False if nothing happened.
     */
    boolean updateFigure(final IFigure figure);

    /**
     * Provides easier access to the model element.
     * 
     * @return the model element
     */
    EObject getModelElement();
    
    /**
     * Returns the primary shape.
     * 
     * @return the primary shape
     */
    IFigure getPrimaryShape();
    
}
