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
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.ui.KiCoolEditorInput
import de.cau.cs.kieler.kicool.ui.internal.KiCoolActivator
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PartInitException
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2017-05-12 proposed
 * @kieler.rating 2017-05-12 proposed yellow  
 */
class OpenSystemAction {

    public static final ImageDescriptor ICON_EDIT = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kicool.ui", "icons/IMBC_edit.png");    
    
    /** The action for compiling systems. */
    @Accessors private Action action
    @Accessors private CompilerView view
    
    new(CompilerView view) {  
        this.view = view
        action = new Action("OpenSystem", IAction.AS_PUSH_BUTTON) {
            override void run() {
                invokeOpenSystem
            }
        }
        action.setId("openSystemAction")
        action.setText("Open active system")
        action.setToolTipText("Opens the actual active system inside a seperate editor to enable modifications.")
        action.imageDescriptor = ICON_EDIT    
        action.disabledImageDescriptor = null
    }
    
    def void invokeOpenSystem() {
        val system = KiCoolRegistration.getSystemById(view.systemSelectionManager.selectedSystemId)
        system.openSystemInEditor
    }
    
    def private void openSystemInEditor(System system) {
        val IWorkbenchWindow window = view.getViewContext().getDiagramWorkbenchPart().getSite()
            .getWorkbenchWindow();

        val input = new KiCoolEditorInput(system)

        val page = window.getActivePage();
        if (page != null) {
            try {
                page.openEditor(input, KiCoolActivator.DE_CAU_CS_KIELER_KICOOL_KICOOL);
            } catch (PartInitException e) {
                e.printStackTrace();
            }
        }
    }    
}