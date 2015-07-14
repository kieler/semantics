/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.core.model.xtend.util;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.utils.Reader;



/**
 * A workflow component that knows about the reader that loaded a source model.
 * An instance of this class can be hooked into the transformation run by
 * {@link XtendTransformationUtil} just before the transformed model is written
 * to do some last work.
 * 
 * @author cds
 */
public abstract class TransformationWorkflowHook extends AbstractWorkflowComponent {
    /**
     * Reader used to read the input model.
     */
    private Reader inputReader = null;
    
    /**
     * Name of the slot that stores the originally loaded model.
     */
    private String inputModelSlot = WorkflowContext.DEFAULT_SLOT;
    
    /**
     * Name of the slot that stores the model to be transformed.
     */
    private String outputModelSlot = WorkflowContext.DEFAULT_SLOT;
    
    
    /**
     * Returns the reader used to read the input model.
     * 
     * @return the reader.
     */
    public Reader getReader() {
        return inputReader;
    }
    
    /**
     * Sets the reader used to load the source model.
     * 
     * @param reader the reader used to load the source model.
     */
    public void setReader(final Reader reader) {
        inputReader = reader;
    }
    
    /**
     * Returns the name of the slot containing the original model.
     * 
     * @return the slot's name.
     */
    public String getInputModelSlot() {
        return inputModelSlot;
    }
    
    /**
     * Sets the name of the slot containing the originally loaded model.
     * 
     * @param slot the slot's name.
     */
    public void setInputModelSlot(final String slot) {
        inputModelSlot = slot;
    }
    
    /**
     * Returns the name of the slot containing the model to be transformed.
     * 
     * @return the slot's name.
     */
    public String getOutputModelSlot() {
        return outputModelSlot;
    }
    
    /**
     * Sets the name of the slot containing the model to be transformed. The
     * model is stored in a workflow context under the given slot name.
     * 
     * @param slot the slot's name.
     */
    public void setOutputModelSlot(final String slot) {
        outputModelSlot = slot;
    }

    /**
     * {@inheritDoc}
     */
    public void checkConfiguration(final Issues issues) {
        // This implementation does nothing.
    }
}
