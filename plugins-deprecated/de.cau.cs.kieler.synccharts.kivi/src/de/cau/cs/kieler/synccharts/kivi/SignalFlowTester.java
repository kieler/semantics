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

import org.eclipse.core.expressions.PropertyTester;

import de.cau.cs.kieler.core.kivi.KiVi;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * Tests whether the active editor is a SyncChart editor.
 * 
 * @author mmu
 * @kieler.ignore (excluded from review process)
 */
public class SignalFlowTester extends PropertyTester {

    /**
     * {@inheritDoc}
     */
    public boolean test(final Object receiver, final String property, final Object[] args,
            final Object expectedValue) {
        return receiver instanceof SyncchartsDiagramEditor && KiVi.getInstance().isActive()
                && KiVi.getInstance().isCombinationClassActive(SignalFlowCombination.class);
    }

}
