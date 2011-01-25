/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kies.transformation.core.kivi;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.kies.transformation.core.TransformationContext;

/**
 * @author uru
 * 
 */
public class TransformationEffect extends AbstractEffect {

    private TransformationContext context;
    private Object result;

    public TransformationEffect(final TransformationContext theContext) {
        this.context = theContext;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        context.executeCurrent();
        result = context.getLastResult();
    }

    /**
     * @return the result
     */
    public Object getResult() {
        return result;
    }
}
