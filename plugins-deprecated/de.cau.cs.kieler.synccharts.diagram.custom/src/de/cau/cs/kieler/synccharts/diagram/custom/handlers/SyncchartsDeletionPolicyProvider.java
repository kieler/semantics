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
package de.cau.cs.kieler.synccharts.diagram.custom.handlers;

import org.eclipse.emf.ecore.EPackage;

import de.cau.cs.kieler.core.model.gmf.policies.AbstractDeletionPolicyProvider;
import de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl;

/**
 * This policy prevents deletion of edit parts that should not be deleted from a
 * synccharts diagram.
 * 
 * @author soh
 * @kieler.design 2010-06-15 msp, cmot
 * @kieler.ignore (excluded from review process)
 */
public class SyncchartsDeletionPolicyProvider extends
        AbstractDeletionPolicyProvider {

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    protected EPackage getEPackage() {
        return SyncchartsPackageImpl.eINSTANCE;
    }

    // /**
    // *
    // * {@inheritDoc}
    // */
    // @Override
    // protected boolean isUnremovableEditPart(final EditPart editPart) {
    // if (editPart instanceof StateRegionCompartment2EditPart
    // || editPart instanceof StateRegionCompartmentEditPart) {
    // return true;
    // }
    // return super.isUnremovableEditPart(editPart);
    // }
}
