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

import org.eclipse.emf.compare.diff.engine.check.ReferencesCheck;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class KitsReferencesCheck extends ReferencesCheck {

    public KitsReferencesCheck(EcoreUtil.CrossReferencer referencer) {
        super(referencer);
    }

    /**
     * {@inheritDoc}
     */
    protected boolean shouldBeIgnored(EReference reference) {
        if (SyncchartsPackage.eINSTANCE.getTransition_SourceState().equals(reference)
                || SyncchartsPackage.eINSTANCE.getState_IncomingTransitions().equals(reference)) {
            return true;
        }
        return super.shouldBeIgnored(reference);
    }
    
}
