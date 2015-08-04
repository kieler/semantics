/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.view.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.kico.klighd.view.ISelectableGeneralSynthesis;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * This class wraps a Ecore model to allow usage of the {@link EcoreModelSythesis}.
 * <p>
 * This wrapping is done to prevent registering the synthesis for EObjct in general and cause
 * problem wit all other registered syntheses.
 * 
 * @author als
 * @kieler.design 2015-07-06 proposed
 * @kieler.rating 2015-07-06 proposed yellow
 * 
 */
public class EcoreModelWrapper {

    /** The model. */
    private final EObject model;

    /**
     * Default Constructor.
     * 
     * @param model
     */
    public EcoreModelWrapper(EObject model) {
        this.model = model;
    }

    /**
     * @return the model
     */
    public EObject getModel() {
        return model;
    }

}
