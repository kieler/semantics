/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view.actions

import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.ui.KiCoolEditorInput
import de.cau.cs.kieler.kicool.ui.internal.KiCoolActivator
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2017-06-13 proposed
 * @kieler.rating 2017-06-13 proposed yellow  
 */
class VisualFeedbackAction {

    public static final ImageDescriptor ICON_VISUAL_FEEDBACK = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kicool.ui", "icons/IMBC_eye.png");    
    
    /** The action for compiling systems. */
    @Accessors private Action action
    @Accessors private CompilerView view
    
    new(CompilerView view) {  
        this.view = view
        action = new Action("VisualFeedback", IAction.AS_CHECK_BOX) {
            override void run() {
                invokeVisualFeedBack
            }
        }
        action.setId("visualFeedbackAction")
        action.setText("Activate Visual Feedback")
        action.setToolTipText("Gives visual clues about the compilation such as processor time and model metrics.")
        action.imageDescriptor = ICON_VISUAL_FEEDBACK    
        action.disabledImageDescriptor = null
    }
    
    def void invokeVisualFeedBack() {
        // Implement me!
    }
    
}