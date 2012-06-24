/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 *****************************************************************************/

package de.cau.cs.kieler.synccharts.codegen.sc;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.internal.resources.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.PlatformUI;

/**
 * A simple class to invoke the process of generating SC-Code.
 * 
 * @kieler.rating 2010-06-14 yellow
 * 
 * @author tam
 * 
 */
@SuppressWarnings("restriction")
public class SCGenerator extends AbstractHandler implements IHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        String fileLocation2 = "";

        // get input model from currently selected file in Explorer
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        File file = (File) ((TreeSelection) selection).getFirstElement();
        fileLocation2 = WorkflowGenerator.getAbsoultePath(URI.createPlatformResourceURI(file
                .getFullPath().toString(), true));

        WorkflowGenerator wf = new WorkflowGenerator(fileLocation2);
        wf.invokeWorkflow(false, "");
        return null;
    }

    // -------------------------------------------------------------------------

}
