/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.karma.conditions;

import org.eclipse.gef.EditPart;


/**
 * This condition additional to an EObject also has an EditPart which can be used to 
 * determinate the result. This has to be initialized with an EditPart before it can be used.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 * @param <T> type of condition
 */
public abstract class IEditPartSensitiveCondition<T> extends ICustomCondition<T> {

    private EditPart editPart;
    
    /**
     * Set the EditPart.
     * @param editPart the edit part to be evaluated
     */
    public void setEditPart(final EditPart editPart) {
        this.editPart = editPart;
    }
    
    /**
     * Get the EditPart.
     * @return the EditPart
     */
    public EditPart getEditPart() {
        return this.editPart;
    }
    
}
