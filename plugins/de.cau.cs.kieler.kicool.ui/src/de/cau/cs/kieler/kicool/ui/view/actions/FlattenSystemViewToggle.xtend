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
package de.cau.cs.kieler.kicool.ui.view.actions

import de.cau.cs.kieler.kicool.ui.view.CompilerView
import org.eclipse.jface.action.IAction
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author als
 * @kieler.design 2017-12-19 proposed
 * @kieler.rating 2017-12-19 proposed yellow  
 */
class FlattenSystemViewToggle extends AbstractAction {

    private static val FLATTEN_SYSTEM_VIEW_TOGGLE_ACTION_DEFAULT = false

    public static final ImageDescriptor ICON = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kicool.ui", "icons/IMBC_flat.png");

    @Accessors boolean isChecked

    new(CompilerView view) {
        super(view, 
            "FlattenSystemViewToggle", 
            IAction.AS_CHECK_BOX, 
            "flattenSystemViewToggle", 
            "No Hierarchy in Systems", 
            "Flatten compilation system hierarchy.", 
            ICON)
        action.setChecked(FLATTEN_SYSTEM_VIEW_TOGGLE_ACTION_DEFAULT)
    }
    
    override void invoke() {
        isChecked = action.isChecked
        view.updateView
    }
    
}