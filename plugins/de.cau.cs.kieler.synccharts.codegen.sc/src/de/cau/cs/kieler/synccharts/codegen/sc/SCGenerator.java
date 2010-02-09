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

/**
 * A simple class to invoke the process of generating SC-Code.
 * 
 * @author tam
 * 
 */
public class SCGenerator extends AbstractHandler implements IHandler {

    private WorkflowGenerator wf = new WorkflowGenerator();

    public Object execute(final ExecutionEvent event) throws ExecutionException {
        // TODO path for output
        // wf.invokeWorkflow(false);
        return null;
    }
}
