/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.instructions;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * The class SJInstructionsDataLabelProvider provides the labels for the content of an SJInstructionsData
 * entry within the SJ instructions view.
 * 
 * @author cmot
 * @kieler.design proposed 2013-02-28
 * @kieler.rating proposed 2013-02-28 yellow
 */
public class InstructionsDataLabelProvider implements ITableLabelProvider {

    /** The Constant COLUMN_0. */
    private static final int COLUMN_0 = 0;

    /** The Constant COLUMN_1. */
    private static final int COLUMN_1 = 1;

    /** The Constant COLUMN_2. */
    private static final int COLUMN_2 = 2;

    /** The Constant COLUMN_3. */
    private static final int COLUMN_3 = 3;

    //-------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public String getColumnText(final Object element, final int columnIndex) {
        InstructionsData instructionsData = (InstructionsData) element;
        switch (columnIndex) {
        case COLUMN_0: // NOT_VISIBLE_COLUMN
            return "";
        case COLUMN_1: // INSTRUCTION_NAME_COLUMN
            return instructionsData.getName();
        case COLUMN_2: // LABEL_COLUMN
            return instructionsData.getLabel();
        case COLUMN_3: // PRIO_COLUMN
            return instructionsData.getPrio();
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds (3)");
        }
    }

    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Image getColumnImage(final Object element, final int columnIndex) {
        // noop
        return null;
    }

    //-------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public void addListener(final ILabelProviderListener listener) {
        // noop
    }

    //-------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public void dispose() {
        // noop
    }

    //-------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public boolean isLabelProperty(final Object element, final String property) {
        return false;
    }

    //-------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public void removeListener(final ILabelProviderListener listener) {
        // noop
    }

    //-------------------------------------------------------------------------
}