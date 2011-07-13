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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.text.kitsState.ui;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.IDiagnosticConverter;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.text.kits.ui.KitsDiagnosticConverterImpl;

/**
 * This filter realizes the filtering of the non-null-state-parentRegion-condition.
 * The condition is imposed by the SyncCharts meta model. In case of representing a
 * chosen state, however, this error diagnostic is not appropriate. 
 * The filter extends the general KITS diagnostic filter in {@link KitsDiagnosticConverterImpl}.
 * 
 * @author chsch
 */
public class KitsStateDiagnosticConverterImpl extends KitsDiagnosticConverterImpl {

    public void convertValidatorDiagnostic(org.eclipse.emf.common.util.Diagnostic diagnostic,
            IDiagnosticConverter.Acceptor acceptor) {
        if (SyncchartsPackage.eINSTANCE.getState().isInstance(getCauser(diagnostic))) {
            EStructuralFeature feature = getFeature(diagnostic);
            if (SyncchartsPackage.eINSTANCE.getState_ParentRegion().equals(feature)) {
                return;
            }
        }
        super.convertValidatorDiagnostic(diagnostic, acceptor);
    }    
}
