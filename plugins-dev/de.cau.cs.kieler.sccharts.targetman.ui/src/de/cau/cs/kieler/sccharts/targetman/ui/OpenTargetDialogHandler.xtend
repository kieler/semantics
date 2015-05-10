/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.targetman.ui;

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil

public class OpenTargetDialogHandler extends AbstractHandler {

    override Object execute(ExecutionEvent event) throws ExecutionException {
        val selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            val element = (selection as IStructuredSelection).getFirstElement();
            if (element instanceof IFile) {
                val file = element as IFile;
                
                val dialog = new TargetDialog(HandlerUtil.getActiveShell(event), file);
                dialog.open();
            }
        }
        return selection;
    }

}
