/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.kivi;

import de.cau.cs.kieler.kivi.core.ICombination;
import de.cau.cs.kieler.kivi.core.Viewmanagement;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * Tests whether the active editor is a SyncChart editor, whether view management is active, and
 * whether the signal flow combination is active.
 * 
 * @author mmu
 * 
 */
public class SignalFlowTester extends org.eclipse.core.expressions.PropertyTester {

    /**
     * {@inheritDoc}
     */
    public boolean test(final Object receiver, final String property, final Object[] args,
            final Object expectedValue) {
        ICombination combination = Viewmanagement.getInstance().getCombinationInstance(
                SignalFlowCombination.class);
        return receiver instanceof SyncchartsDiagramEditor
                && Viewmanagement.getInstance().isActive() && combination != null
                && combination.isActive();
    }

}
