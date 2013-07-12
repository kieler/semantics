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
 */
package de.cau.cs.kieler.karma.conditions;

import org.eclipse.emf.ecore.EObject;


/**
 * A condition that is always true. Should mainly be used for testing purposes.
 *  
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 */
public class TrueCondition extends ICustomCondition<EObject> {

    /**
     * always return true.
     * @param object
     *          the input object
     * @return
     *          true
     */
    public boolean evaluate(final EObject object) {
        return true;
    }

}
