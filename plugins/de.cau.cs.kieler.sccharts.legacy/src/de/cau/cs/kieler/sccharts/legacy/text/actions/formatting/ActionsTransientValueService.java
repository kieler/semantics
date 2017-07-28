/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 *****************************************************************************/
package de.cau.cs.kieler.sccharts.legacy.text.actions.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;

import de.cau.cs.kieler.sccharts.legacy.sccharts.Action;
import de.cau.cs.kieler.sccharts.legacy.sccharts.HistoryType;
import de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage;

/**
 * @author haf, chsch
 *
 */
public class ActionsTransientValueService implements ITransientValueService {

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isMixedList
     * (org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
     */
    public boolean isMixedList(EObject owner, EStructuralFeature feature) {
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isTransient
     * (org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, int)
     */
    public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
        if (feature.equals(SCChartsPackage.eINSTANCE.getTransition_Priority())
            || feature.equals(SCChartsPackage.eINSTANCE.getTransition_Type())
            || feature.equals(SCChartsPackage.eINSTANCE.getTransition_History().equals(HistoryType.RESET))
            || feature.equals(SCChartsPackage.eINSTANCE.getTransition_SourceState())
            || feature.equals(SCChartsPackage.eINSTANCE.getTransition_TargetState())
            || feature.equals(SCChartsPackage.eINSTANCE.getAction_Label()))
            return true;

        // this realizes the non-serialization of transition delay property if it is 1!
        if (feature.equals(SCChartsPackage.eINSTANCE.getAction_Delay())) {
        	return ((Action) owner).getDelay() == 1;
        }

        // this realizes the proper serialization of the immediate flag, for instance!
        return feature.isTransient() || !owner.eIsSet(feature);
    }

    public boolean isCheckElementsIndividually(EObject owner, EStructuralFeature feature) {
        return true;
    }

}
