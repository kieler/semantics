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
 */

package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.LinkedList;

import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.trace.Tick;
import de.cau.cs.kieler.krep.evalbench.ui.editors.AssemblerEditor;

/**
 * Abstract superclass for extensions of the tick manager extension point.
 * 
 * @author msp, ctr
 */
public abstract class AbstractTickManager implements ISignalListener {

    /** Identifier for the signal listener extension point. */
    public static final String EXTENSION_ID = "de.cau.cs.kieler.krep.evalbench.tickManager";

    /**
     * {@inheritDoc}
     * 
     */
    public abstract void tickPerformed(LinkedList<Signal> inputs, LinkedList<Signal> outputs);

    /**
     * Retrieves the currently active assembler editor from the common layer.
     * 
     * @return the active assembler editor, or null if there is no active assembler editor
     */
    protected final AssemblerEditor getActiveAssemblerEditor() {
        return Activator.getDefault().commonLayer.getActiveAssemblerEditor();
    }

    /**
     * Triggers a program tick in the common layer. The given editor part is brought to top, so the
     * common layer can synchronize with it.
     * <p>
     * Note that this method may throw a <code>NullPointerException</code> if the given editor part
     * is no longer available.
     * 
     * @param editorPart
     *            assembler editor to use
     */
    protected final void triggerTick(final IEditorPart editorPart) {
        editorPart.getSite().getPage().bringToTop(editorPart);
        Activator.getDefault().commonLayer.step(new Tick());
    }

    /**
     * Triggers a program reset in the common layer.
     */
    protected final void triggetReset() {
        try {
            Activator.getDefault().commonLayer.reset();
        } catch (CommunicationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Updates the signal views of the evaluation bench.
     */
    protected final void updateSignalViews() {
        Activator.getDefault().commonLayer.updateSignalViews();
    }

}
