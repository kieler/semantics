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
package de.cau.cs.kieler.synccharts.text.kits.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import de.cau.cs.kieler.core.model.validation.CustomEValidator;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;

public class KitsJavaValidator extends AbstractKitsJavaValidator implements
        CustomEValidator {

    public static final String BAD_ID = "bad_id";

    public static final String MISSING_PRIO = "missing_prio";
    public static final String NON_UNIQUE_PRIO = "non_unique_prio";

    public static final String NON_SUCCEEDING_PRIOS = "non_succeeding_prios";
    public static final String NO_PRIO_1_TRANSITION = "no_prio_1_transition";
    public static final String UNSORTED_PRIOS = "unsorted_prios";

//    @Override
//    protected List<EPackage> getEPackages() {
//        List<EPackage> result = new ArrayList<EPackage>();
//         result.add(de.cau.cs.kieler.synccharts.SyncchartsPackage.eINSTANCE);
//        return result;
//    }

    // @Check
    public void checkTypeNameStartsWithCapital(
            final de.cau.cs.kieler.synccharts.State s) {
        if (!Character.isUpperCase(s.getId().charAt(0))) {
            warning("Name should start with a capital", SyncchartsPackage.eINSTANCE.getScope_Id(),
                    SyncchartsPackage.SCOPE__ID, BAD_ID);
        }
    }

    @Check
    public void checkTransitionPriorities(
            final de.cau.cs.kieler.synccharts.State s) {

        if (s.getOutgoingTransitions().isEmpty()
                || s.getOutgoingTransitions().size() == 1) {
            return;
        }

        Set<Integer> prios = new HashSet<Integer>();
        int count = s.getOutgoingTransitions().size();
        boolean subsequent = true;
        boolean startsWithOne = false;
        boolean sorted = true;

        Transition highestPrioTransition = s.getOutgoingTransitions().get(0);

        for (Transition t : s.getOutgoingTransitions()) {
            if (t.getPriority() == 1) {
                startsWithOne = true;
            }
            if (t.getPriority() == 0) {
                error("Priority must be assigned.",
                        SyncchartsPackage.eINSTANCE.getTransition_Priority(),
                        SyncchartsPackage.TRANSITION__PRIORITY, MISSING_PRIO);
            } else {
                if (t.getPriority() < highestPrioTransition.getPriority()) {
                    highestPrioTransition = t;
                }
                if (prios.contains(Integer.valueOf(t.getPriority()))) {
                    error("Priority is not unique.",
                            SyncchartsPackage.eINSTANCE.getTransition_Priority(),
                            SyncchartsPackage.TRANSITION__PRIORITY,
                            NON_UNIQUE_PRIO);
                } else {
                    if (t.getPriority() > count) {
                        subsequent = false;
                    }
                    if (s.getOutgoingTransitions().indexOf(t) + 1 != t
                            .getPriority()) {
                        sorted = false;
                    }
                }
                prios.add(Integer.valueOf(t.getPriority()));
            }
        }

        if (!startsWithOne) {
            warning("Transition priorities should start with value 1",
                    SyncchartsPackage.eINSTANCE.getTransition_Priority(),
                    SyncchartsPackage.STATE__OUTGOING_TRANSITIONS,
                    NO_PRIO_1_TRANSITION);
        } else {
            if (!subsequent) {
                warning("Priorities are not subsequent.",
                        SyncchartsPackage.eINSTANCE.getTransition_Priority(),
                        SyncchartsPackage.STATE__OUTGOING_TRANSITIONS,
                        NON_SUCCEEDING_PRIOS);
            } else {
                if (!sorted) {
                    warning("Transition are not sorted according to their priorities.",
                            SyncchartsPackage.eINSTANCE.getTransition_Priority(),
                            SyncchartsPackage.STATE__OUTGOING_TRANSITIONS,
                            UNSORTED_PRIOS);
                }
            }
        }
    }
}
