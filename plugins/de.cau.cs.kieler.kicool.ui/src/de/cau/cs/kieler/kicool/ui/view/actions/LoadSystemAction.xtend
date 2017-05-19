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

import de.cau.cs.kieler.kicool.KiCoolStandaloneSetup
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import java.io.IOException
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.emf.ecore.EObject
import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * @author ssm
 * @kieler.design 2017-05-12 proposed
 * @kieler.rating 2017-05-12 proposed yellow  
 */
class LoadSystemAction {

    public static final ImageDescriptor ICON_LOAD_SYSTEM = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kicool.ui", "icons/IMBC_gear.png");    
    
    /** The action for compiling systems. */
    @Accessors private Action action
    @Accessors private CompilerView view
    
    new(CompilerView view) {  
        this.view = view  
        action = new Action("LoadSystem", IAction.AS_PUSH_BUTTON) {
            override void run() {
                invokeLoadSystem
            }
        }
        action.setId("loadSystemAction")
        action.setText("Load active system")
        action.setToolTipText("Loads the system that is opened in the active editor.")
        action.imageDescriptor = ICON_LOAD_SYSTEM    
        action.disabledImageDescriptor = null
    }
    
    def void invokeLoadSystem() {
        val editor = CompilerView.getActiveEditor
        
        if (editor instanceof XtextEditor) {
            val systemModel = editor.createModelInMemoryResource
            if (systemModel != null) {
                view.systemSelectionManager.temporarySystem = systemModel
            }
        }
    }
    
    private def de.cau.cs.kieler.kicool.System createModelInMemoryResource(XtextEditor editor) {
        val injector = KiCoolStandaloneSetup.doSetup
        val ResourceSet rs = injector.getInstance(typeof(ResourceSet))
        val r = rs.createResource(URI.createURI("temporary" + System.nanoTime + ".kico"))
        val doc = editor.getDocument
        var EObject m = doc.readOnly(new IUnitOfWork<EObject, XtextResource>() {
            override exec(XtextResource state) throws Exception {
                state.contents.head
            }
        });
                    
        r.getContents.add(m.copy)
        try {
            r.save(null);
            return (r.contents.head as de.cau.cs.kieler.kicool.System)
        } catch (IOException e) {
            e.printStackTrace
            return null
        }
    }
}