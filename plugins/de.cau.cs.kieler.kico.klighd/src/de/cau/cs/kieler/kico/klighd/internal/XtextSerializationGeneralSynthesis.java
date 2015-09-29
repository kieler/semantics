/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.kico.klighd.view.menu.ISelectableGeneralSynthesis;
import de.cau.cs.kieler.kico.klighd.view.menu.SynthesisSelectionMenu;
import de.cau.cs.kieler.kico.klighd.view.model.CodePlaceHolderSynthesis;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * This class represents the {@link XtextSerializationModel} and {@link CodePlaceHolderSynthesis} as
 * a selectable general synthesis for the {@link SynthesisSelectionMenu}.
 * 
 * @author als
 * @kieler.design 2015-08-04 proposed
 * @kieler.rating 2015-08-04 proposed yellow
 *
 */
public class XtextSerializationGeneralSynthesis implements ISelectableGeneralSynthesis {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return CodePlaceHolderSynthesis.ID + ".XtextSerializationSythesis";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSynthesisID() {
        return CodePlaceHolderSynthesis.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isApplicable(Object model) {
        return model instanceof EObject;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object prepare(Object model, IEditorPart editor, KlighdSynthesisProperties properties) {
        return new XtextSerializationModel((EObject) model, editor.getTitle());
    }

}
