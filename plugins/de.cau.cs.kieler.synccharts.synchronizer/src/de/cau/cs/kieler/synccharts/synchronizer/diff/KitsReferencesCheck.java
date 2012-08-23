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
package de.cau.cs.kieler.synccharts.synchronizer.diff;

import org.eclipse.emf.compare.diff.engine.IMatchManager;
import org.eclipse.emf.compare.diff.engine.check.ReferencesCheck;
import org.eclipse.emf.ecore.EReference;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * A customized {@link AttributesCheck} that masks the 'incomingTransitions' reference of states
 * and the 'sourceState' reference of transitions.
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class KitsReferencesCheck extends ReferencesCheck {

    /**
     * Constructor.
     * @param manager a manager
     */
    public KitsReferencesCheck(final IMatchManager manager) {
        super(manager);
    }

    /**
     * {@inheritDoc}
     */
    protected boolean shouldBeIgnored(final EReference reference) {
        if (SyncchartsPackage.eINSTANCE.getTransition_SourceState().equals(reference)
                || SyncchartsPackage.eINSTANCE.getState_IncomingTransitions().equals(reference)) {
            return true;
        }
        return super.shouldBeIgnored(reference);
    }
    
}
