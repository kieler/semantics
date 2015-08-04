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
package de.cau.cs.kieler.kico.klighd.view;

import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * An interface for a general synthesis to provide alternative diagram visualization selectable in
 * the {@link SynthesisSelectionMenu}.
 * 
 * @author als
 * @kieler.design 2015-08-04 proposed
 * @kieler.rating 2015-08-04 proposed yellow
 *
 */
public interface ISelectableGeneralSynthesis {

    /**
     * Return the ID of this general synthesis. This may differ from the actual synthesis ID.
     * 
     * @return id string
     */
    public String getID();

    /**
     * Return the ID of the synthesis to use.
     * 
     * @return synthesis id
     */
    public String getSynthesisID();

    /**
     * Tests if this synthesis is applicable for the given model.
     * 
     * @param model
     *            the model
     * @return true if applicable
     */
    public boolean isApplicable(Object model);

    /**
     * Prepares the given model to be compatible to this synthesis.
     * 
     * @param model
     *            the model
     * @param editor
     *            the source editor
     * @param properties
     *            the properties
     * @return The prepared model
     */
    public Object prepare(Object model, IEditorPart editor, KlighdSynthesisProperties properties);
}
