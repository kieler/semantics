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
package de.cau.cs.kieler.railsl.ui.visualizer

import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.ModifyEvent
import com.google.inject.Injector
import com.google.inject.Inject
import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.eclipse.ui.IPropertyListener

/**
 * @author stu121235
 *
 */
class RailSLModifyListener implements ModifyListener {
    
    @Inject Injector injector
    
    var Visualizer visualizer
    
    static val instance = new RailSLModifyListener
    
    new() {
        visualizer = injector.getInstance(Visualizer)
        
        Display.getDefault().asyncExec(new Runnable() {

                @Override
                override void run() {
                    val editor = EditorUtils.activeXtextEditor
                    editor.addPropertyListener(RailSLModifyListener.instance as IPropertyListener)
                }
            })
    }
    
    @Override
    override modifyText(ModifyEvent e) {
        visualizer.updateView
    }
    
}