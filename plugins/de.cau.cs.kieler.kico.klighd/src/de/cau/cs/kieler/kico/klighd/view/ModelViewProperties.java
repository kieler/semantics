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
package de.cau.cs.kieler.kico.klighd.view;

import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;

/**
 * Class holding the Properties used by the ModelView.
 * 
 * @author als
 * @kieler.design 2015-07-21 proposed
 * @kieler.rating 2015-07-21 proposed yellow
 * 
 */
public final class ModelViewProperties {

    /**
     * Prevent Instantiation.
     */
    private ModelViewProperties() {
    }

    /** The editor part associated with model view. */
    public static final IProperty<IEditorPart> EDITOR_PART =
            new Property<IEditorPart>("de.cau.cs.kieler.kico.klighd.view.editor", null);

    /** Property to indicate the use of a fallback synthesis. */
    public static final IProperty<Boolean> USE_FALLBACK_SYSTHESIS =
            new Property<Boolean>("de.cau.cs.kieler.kico.klighd.view.synthesis.fallback", false);
}
