/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
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
 */
package de.cau.cs.kieler.synccharts.codegen.esterel;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

/**
 * @author ctr
 * 
 *         Generate Esterel from a SyncChart.
 * 
 */
public class EsterelGenerator extends AbstractHandler implements IHandler {

    private WorkflowGenerator wf = new WorkflowGenerator();

    /** {@inheritDoc} */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        wf.invokeWorkflow();

        return null;
    }
}
