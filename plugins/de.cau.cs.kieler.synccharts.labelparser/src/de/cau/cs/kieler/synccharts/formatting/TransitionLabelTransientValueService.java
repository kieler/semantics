/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Assignment;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.SignalReference;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * @author haf
 * 
 */
public class TransitionLabelTransientValueService implements
        ITransientValueService {

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isMixedList
     * (org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
     */
    public boolean isMixedList(EObject owner, EStructuralFeature feature) {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isTransient
     * (org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature,
     * int)
     */
    public boolean isTransient(EObject owner, EStructuralFeature feature,
            int index) {
        if ((owner instanceof Transition && (feature
                .equals(SyncchartsPackage.eINSTANCE.getTransition_Priority())
                || feature.equals(SyncchartsPackage.eINSTANCE
                        .getTransition_Type())
                || feature.equals(SyncchartsPackage.eINSTANCE
                        .getTransition_IsHistory())
                || feature.equals(SyncchartsPackage.eINSTANCE
                        .getTransition_SourceState()) || feature
                .equals(SyncchartsPackage.eINSTANCE.getTransition_TargetState())))
                || (owner instanceof Action && (feature
                        .equals(SyncchartsPackage.eINSTANCE
                                .getAction_ParentStateEntryAction())
                        || feature.equals(SyncchartsPackage.eINSTANCE
                                .getAction_ParentStateExitAction())
                        || feature.equals(SyncchartsPackage.eINSTANCE
                                .getAction_ParentStateInnerAction())
                        || feature.equals(SyncchartsPackage.eINSTANCE
                                .getAction_ParentStateSuspension()) || feature
                        .equals(SyncchartsPackage.eINSTANCE
                                .getAction_TriggersAndEffects())))
                || (owner instanceof Expression
                        && (feature.equals(SyncchartsPackage.eINSTANCE
                                .getExpression_ParentAction()))
                        || feature.equals(SyncchartsPackage.eINSTANCE
                                .getExpression_ParentAssignment())
                        || feature.equals(SyncchartsPackage.eINSTANCE
                                .getExpression_ParentEmisson()) || feature
                        .equals(SyncchartsPackage.eINSTANCE
                                .getExpression_ParentExpression()))
                  || (owner instanceof Effect
                                        && (feature.equals(SyncchartsPackage.eINSTANCE
                                                .getEffect_ParentEAction())))
                                                        
        )
            return true;
        else
            return false;
    }

}
