/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.karma.kivi;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.karma.IAdvancedRenderingEditPart;
import de.cau.cs.kieler.karma.util.GmfFrameworkBridge;

/**
 * This effect requests a reevaluation of the rendering associated with a given model element.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 */
public class ReevaluateRenderingEffect extends AbstractEffect {

    private IAdvancedRenderingEditPart part;
    
    private EObject modelElement;
    
    /**
     * The constructor. The built effect will reevalute 
     * the given model element and set a new rendering.
     * @param modelElement the model element to reevaluate.
     */
    public ReevaluateRenderingEffect(final EObject modelElement) {
        this.modelElement = modelElement;
        EditPart p = GmfFrameworkBridge.getEditPart(modelElement);
        if (p instanceof IAdvancedRenderingEditPart) {
            this.part = (IAdvancedRenderingEditPart) p;
        }
    }
    
    /**
     * 
     * {@inheritDoc}
     */
    public void execute() {
        part.updateFigure(part.getPrimaryShape());
    }

    /**
     * Get the model element.
     * @return the model element
     */
    public EObject getModelElement() {
        return modelElement;
    }
    
}
