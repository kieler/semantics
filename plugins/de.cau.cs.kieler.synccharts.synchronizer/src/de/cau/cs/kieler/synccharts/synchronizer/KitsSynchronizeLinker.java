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
package de.cau.cs.kieler.synccharts.synchronizer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.match.metamodel.Match2Elements;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.metamodel.MatchPackage;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.core.expressions.Signal;
import de.cau.cs.kieler.core.expressions.ValuedObject;
import de.cau.cs.kieler.core.expressions.ValuedObjectReference;
import de.cau.cs.kieler.core.expressions.Variable;
import de.cau.cs.kieler.synccharts.Assignment;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.util.SyncchartsSwitch;

/**
 * 
 * @author chsch
 */
public class KitsSynchronizeLinker {

    private DiffModel diffModel = null;
    private Map<EObject, EObject> LRmatchTable = null;
    private Map<EObject, EObject> RLmatchTable = null;

    /**
     * Convenience method to initialize the linker.
     * 
     * @param theDiffModel
     * @return
     */
    public KitsSynchronizeLinker setDiffModel(DiffModel theDiffModel) {
        this.diffModel = theDiffModel;
        if (theDiffModel != null) {
            return consultSrcAndCopy(this.diffModel.getLeftRoots().get(0), this.diffModel
                    .getRightRoots().get(0));
        }
        return this;
    }

    /**
     * Default method to initialize the linker.
     * 
     * @param src
     * @param copy
     * @return
     */
    @SuppressWarnings("unchecked")
    public KitsSynchronizeLinker consultSrcAndCopy(EObject src, EObject copy) {
        MatchModel newMatchModel = null;
        try {
            newMatchModel = MatchService.doContentMatch(src, copy,
                    ModelSynchronizerJob.getMatchOptions());

            this.LRmatchTable = new HashMap<EObject, EObject>();
            this.RLmatchTable = new HashMap<EObject, EObject>();

            EObject eObj = null;
            Match2Elements match = null;
            for (Iterator<EObject> it = newMatchModel.eAllContents(); it.hasNext();) {
                eObj = it.next();
                if (MatchPackage.eINSTANCE.getMatch2Elements().isInstance(eObj)) {
                    match = (Match2Elements) eObj;
                    this.LRmatchTable.put(match.getLeftElement(), match.getRightElement());
                    this.RLmatchTable.put(match.getRightElement(), match.getLeftElement());
                }
            }
        } catch (InterruptedException e) {
            this.LRmatchTable = Collections.EMPTY_MAP;
            this.RLmatchTable = Collections.EMPTY_MAP;
        }
        return this;
    }

    /**
     * Implements linking.
     * 
     * @param root
     */
    public KitsSynchronizeLinker linkElement(EObject root) {

        EObject element = null;
        for (Iterator<EObject> it = root.eAllContents(); it.hasNext();) {
            element = it.next();

            new SyncchartsSwitch<Void>() {

                public Void caseTransition(Transition transition) {
                    try {
                        State target = (State) LRmatchTable.get(((Transition) RLmatchTable
                                .get(transition)).getTargetState());
                        transition.setTargetState(target);
                    } catch (NullPointerException e) {
                        /* nothing */
                        // System.out.println("hier");
                    }
                    return null;
                }

                public Void caseAssignment(Assignment assignment) {
                    Variable variable = (Variable) LRmatchTable.get(((Assignment) RLmatchTable
                            .get(assignment)).getVariable());
                    assignment.setVariable(variable);
                    return null;
                }

                public Void caseEmission(Emission emission) {
                    Signal signal = (Signal) LRmatchTable.get(((Emission) RLmatchTable
                            .get(emission)).getSignal());
                    emission.setSignal(signal);
                    return null;
                }

                public Void defaultCase(EObject object) {
                    if (ExpressionsPackage.eINSTANCE.getValuedObjectReference().isInstance(object)) {
                        ValuedObjectReference valuedObjectRef = (ValuedObjectReference) object;

                        ValuedObject valuedObject = (ValuedObject) LRmatchTable
                                .get(((ValuedObjectReference) RLmatchTable.get(valuedObjectRef))
                                        .getValuedObject());
                        valuedObjectRef.setValuedObject(valuedObject);
                    }
                    return null;
                }

            }.doSwitch(element);

        }

        return this;
    }
    
    
    public KitsSynchronizeLinker linkTransitionsInElement(EObject element) {
        EObject eObj = null;
        for (Iterator<EObject> it = element.eAllContents(); it.hasNext();) {
            eObj = it.next();
            if (SyncchartsPackage.eINSTANCE.getTransition().isInstance(eObj)) {
                Transition transition = (Transition) eObj;
                try {
                    State target = (State) LRmatchTable.get(((Transition) RLmatchTable
                            .get(transition)).getTargetState());
                    if (target == null) {
                        target = ((Transition) RLmatchTable.get(transition)).getTargetState();
                    }
                    transition.setTargetState(target);
                } catch (NullPointerException e) {
                    /* nothing */
                }
            }
        }
        return this;
    }
    

    @SuppressWarnings("unchecked")
    public <T extends EObject> T getMatched(T eObj) {
        T match = (T) this.LRmatchTable.get(eObj);
        if (match == null) {
            match = (T) this.RLmatchTable.get(eObj);
        }
        return match;
    }

}
