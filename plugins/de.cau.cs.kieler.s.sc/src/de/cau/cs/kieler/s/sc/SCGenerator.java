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

package de.cau.cs.kieler.s.sc;

import org.eclipse.core.internal.resources.File;

import de.cau.cs.kieler.s.codegen.AbstractCodegenHandler;

/**
 * A simple class to invoke the process of generating SC-Code.
 * 
 * @author tam
 * 
 */
public class SCGenerator extends AbstractCodegenHandler {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createContext(final File selectedFile) {
        WorkflowGenerator wf = new WorkflowGenerator(selectedFile);
        wf.invokeWorkflow(false, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createContext() {
        WorkflowGenerator wf = new WorkflowGenerator();
        wf.invokeWorkflow(false, "");
    }

}
