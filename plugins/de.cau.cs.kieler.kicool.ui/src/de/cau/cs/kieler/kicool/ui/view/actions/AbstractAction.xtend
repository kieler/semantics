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

import org.eclipse.jface.action.Action
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.ui.view.CompilerView

/**
 * Abstract action for the compiler view
 * 
 * @author ssm
 * @kieler.design 2017-05-12 proposed
 * @kieler.rating 2017-05-12 proposed yellow  
 */
abstract class AbstractAction {

    /** The action for compiling systems. */
    @Accessors private Action action
    @Accessors private CompilerView view
    
    new(CompilerView view, String name, int style, String id, String text, String toolTip, ImageDescriptor imageDesc) {
        this.view = view  
        action = new Action(name, style) {
            override void run() {
                invoke
            }
        }
        action.setId(id)
        action.setText(text)
        action.setToolTipText(toolTip)
        action.imageDescriptor = imageDesc    
    }
    
    abstract def void invoke()
}