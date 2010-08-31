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
package de.cau.cs.kieler.kvid.visual.complex;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Factory for creating registered DataDisplayEditParts.
 * 
 * @author jjc
 *
 */
public abstract class AbstractDisplayFactory {
    
    /**
     * Creates a {@link ShapeNodeEditPart} corresponding to the given hint.
     * 
     * @param view The view to contribute to
     * @param semanticHint The sematic hint which determines the type of the new Part
     * @return The EditPart which represents the given factors
     */
    public abstract ShapeNodeEditPart create(View view, String semanticHint);

}
