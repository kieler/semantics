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
package de.cau.cs.kieler.synccharts.synchronizer.match;

import java.util.List;

import org.eclipse.emf.compare.match.statistic.MetamodelFilter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * A Kits-specific customized {@link MetamodelFilter}.
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class KitsFilter extends MetamodelFilter {
    
    /**
     * Constructor.
     */
    public KitsFilter() {
        super();
    }
    
    /**
     * {@inheritDoc}
     */
    public List<EStructuralFeature> getFilteredFeatures(final EObject eObj) {
        List<EStructuralFeature> result = super.getFilteredFeatures(eObj);
        if (SyncchartsPackage.eINSTANCE.getState().isInstance(eObj)) {
            result.remove(SyncchartsPackage.eINSTANCE.getState_IncomingTransitions());
        }
        if (SyncchartsPackage.eINSTANCE.getTransition().isInstance(eObj)) {
            result.remove(SyncchartsPackage.eINSTANCE.getTransition_SourceState());
            result.remove(SyncchartsPackage.eINSTANCE.getAction_Label());
        }
        return result;
    }

}
