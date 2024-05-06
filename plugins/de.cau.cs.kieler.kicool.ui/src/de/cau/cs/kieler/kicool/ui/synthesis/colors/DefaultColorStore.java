/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis.colors;

import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.klighd.util.ColorPreferences; 

/**
 * Only the general colors.
 * 
 * @author als
 */
@ViewSynthesisShared
public class DefaultColorStore extends AbstractColorStore {
 
    @Override
    public void configureOwnColors(final ColorPreferences preferences) {
        // nothing to configure
    }
}
