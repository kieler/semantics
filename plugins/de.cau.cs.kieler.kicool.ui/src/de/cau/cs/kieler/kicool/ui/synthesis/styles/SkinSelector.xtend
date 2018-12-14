/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis.styles

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.ui.view.actions.SkinSelectionActions

/**
 * @author ssm
 * @kieler.design 2017-06-19 proposed 
 * @kieler.rating 2017-06-19 proposed yellow
 */
class SkinSelector {
    
    @Accessors static String skinPrefix = "resources/skins/" + SkinSelectionActions.SKINS.head.value
    @Accessors static int skinMaxNameSize = SkinSelectionActions.SKINS_MAX_NAME_SIZE.head
    
}