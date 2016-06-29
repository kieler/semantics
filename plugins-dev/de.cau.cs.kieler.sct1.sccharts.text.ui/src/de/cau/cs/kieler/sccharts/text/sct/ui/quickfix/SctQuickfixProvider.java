/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct.ui.quickfix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.text.sct.validation.SctJavaValidator;


public class SctQuickfixProvider extends DefaultQuickfixProvider {


    @Fix(SctJavaValidator.MISSING_PRIO)
    public void disambiguateTransitionPrios(final Issue issue, IssueResolutionAcceptor acceptor) {
        acceptor.accept(issue, "Determine missing transition priority",
                "Determine missing transition priority", null,
                new ISemanticModification() {

                    public void apply(EObject element, IModificationContext context) throws Exception {
                        Transition theTransition = null;
                        if (SCChartsPackage.eINSTANCE.getTransition().isInstance(element)) {
                            theTransition = (Transition) element;
                            element = element.eContainer();
                        }
                        if (SCChartsPackage.eINSTANCE.getState().isInstance(element)) {
                            List<Integer> prios = new ArrayList<Integer>();

                            for (Transition t : ((State) element).getOutgoingTransitions()) {
                                if (t.getPriority() != 0) {
                                    prios.add(t.getPriority());
                                }
                            }

                            if (theTransition.getPriority() == 0) {
                                int i = 0;
                                while (prios.contains(Integer.valueOf(++i)));

                                theTransition.setPriority(i);
                                prios.add(i);
                            }
                        }
                    }
                });

        acceptor.accept(issue, "Determine all missing transition priorities",
                "Determine all missing transition priorities", null,
                new ISemanticModification() {

                    public void apply(EObject element, IModificationContext context) throws Exception {
                        if (SCChartsPackage.eINSTANCE.getTransition().isInstance(element)) {
                            element = element.eContainer();
                        }
                        if (SCChartsPackage.eINSTANCE.getState().isInstance(element)) {
                            State s = (State) element;
                            List<Integer> prios = new ArrayList<Integer>();
                            for (Transition t : s.getOutgoingTransitions()) {
                                if (t.getPriority() != 0) {
                                    prios.add(t.getPriority());
                                }
                            }

                            for (Transition t : s.getOutgoingTransitions()) {
                                if (t.getPriority() == 0) {
                                    int i = 0;
                                    while (prios.contains(Integer.valueOf(++i)));

                                    t.setPriority(i);
                                    prios.add(i);
                                }
                            }
                        }
                    }
                });
    }


    @Fix(SctJavaValidator.NON_UNIQUE_PRIO)
    public void increaseTransitionPrio(final Issue issue, IssueResolutionAcceptor acceptor) {
        acceptor.accept(issue, "Increase transition priority", "Increase transition priority", null,
                new ISemanticModification() {

                    public void apply(EObject element, IModificationContext context) throws Exception {
                        if (SCChartsPackage.eINSTANCE.getTransition().isInstance(element)) {
                            Transition t = (Transition) element;
                            State s = (State) t.eContainer();
                            List<Integer> prios = new ArrayList<Integer>();
                            for (Transition tt : s.getOutgoingTransitions()) {
                                prios.add(tt.getPriority());
                            }
                            Collections.sort(prios);

                            int p = t.getPriority();
                            while (prios.contains(Integer.valueOf(p++)));
                            t.setPriority(p);
                        }
                    }
                });
    }


   @Fix(SctJavaValidator.NO_PRIO_1_TRANSITION)
    public void setMostImportantTransitionPrio(final Issue issue, IssueResolutionAcceptor acceptor) {
        acceptor.accept(issue, "Set transition priority to 1", "Set transition priority to 1",
                null, new ISemanticModification() {

                    public void apply(EObject element, IModificationContext context)
                            throws Exception {
                        if (SCChartsPackage.eINSTANCE.getTransition().isInstance(element)) {
                            ((Transition) element).setPriority(1);
                            return;
                        }
                    }
        });
    }

    @Fix(SctJavaValidator.NON_SUCCEEDING_PRIOS)
    public void makeTransitionPriosSucceeding(final Issue issue, IssueResolutionAcceptor acceptor) {
        acceptor.accept(issue, "Minimize transistion priorities", "Minimize transistion priorities",
                null, new ISemanticModification() {

                    public void apply(EObject element, IModificationContext context)
                            throws Exception {
                        if (SCChartsPackage.eINSTANCE.getTransition().isInstance(element)) {
                            element = element.eContainer();
                        }
                        if (SCChartsPackage.eINSTANCE.getState().isInstance(element)) {
                            List<Integer> assignedPrios = new ArrayList<Integer>();
                            Map<Integer, Transition> prioTransMap = new HashMap<Integer, Transition>();

                            for (Transition t : ((State) element).getOutgoingTransitions()) {
                                assignedPrios.add(t.getPriority());
                                prioTransMap.put(t.getPriority(), t);
                            }
                            Collections.sort(assignedPrios);

                            for (int i = 0; i != assignedPrios.size(); i++) {
                                if (!assignedPrios.get(i).equals(i+1)) {
                                    prioTransMap.get(assignedPrios.get(i)).setPriority(i+1);
                                }
                            }
                        }
                    }
        });
    }

    @Fix(SctJavaValidator.UNSORTED_PRIOS)
    public void resortTransitionPrios(final Issue issue, IssueResolutionAcceptor acceptor) {
        acceptor.accept(issue, "Sort transitions according to priorities", "Sort transitions according to priorities",
                null, new ISemanticModification() {

                    public void apply(EObject element, IModificationContext context)
                            throws Exception {
                        if (SCChartsPackage.eINSTANCE.getTransition().isInstance(element)) {
                            element = element.eContainer();
                        }
                        if (SCChartsPackage.eINSTANCE.getState().isInstance(element)) {
                            State s = (State) element;
                            int i = 0;
                            Transition t = null;
                            while (i != s.getOutgoingTransitions().size()) {
                                t = s.getOutgoingTransitions().get(i);
                                if (t.getPriority() == i+1) {
                                    i++;
                                } else {
                                    s.getOutgoingTransitions().move(t.getPriority()-1, t);
                                }
                            }
                        }
                    }
                });
    }

}
