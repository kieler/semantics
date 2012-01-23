/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart.engine;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import de.cau.cs.kieler.sim.esi.ISignal;
import de.cau.cs.kieler.sim.kart.Utilities;
import de.cau.cs.kieler.sim.kart.ValidationException;
import de.cau.cs.kieler.sim.kart.Tree;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;

/**
 * @author ssc
 *
 */
public class DefaultValidationEngine implements IValidationEngine {
    private DiagramEditor editor;
    private boolean ignoreAdditionalSignals;
    private String stateVariable;

    public DefaultValidationEngine(DiagramEditor editor, boolean ignoreAdditionalSignals, String stateVariable) {
        this.editor = editor;
        this.ignoreAdditionalSignals = ignoreAdditionalSignals;
        this.stateVariable = stateVariable;
    }
    
    public void validateVariable(String key, String recValue, String simValue, boolean isHistoryStep)
            throws KiemExecutionException {
        
        System.out.println("RecValue: " + recValue);
        System.out.println("SimValue: " + simValue);
        
        // undo effects from previous step
        Utilities.visualizeStates(null, null, editor);
                
        //String simValue = ;
        if (simValue == null) {
            throw new KiemExecutionException("Validation error", false, new ValidationException(
                    "The simulation step did not generate a variable \"" + key + "\". "
                            + "No validation for this signal will take place in this step!"));
        } else {
            if (!simValue.equals(recValue)) {
                if (key.equals(stateVariable)) {
                
                    List<EObject> isStates = Utilities.getStates(editor, simValue);
                    List<EObject> shallStates = Utilities.getStates(editor, recValue);

                    // Colorize the diagram
                    Utilities.visualizeStates(isStates, shallStates, editor);

                    // Get meaningful names for the states
                    String stateNamesTree = Utilities.buildTree(new Tree(null), shallStates).toString();
                    String simStateNamesTree = Utilities.buildTree(new Tree(null), isStates).toString();
                    
                    if(!isHistoryStep) {
                        // Display an error message
                        String errorMessage = "Validation error: The simulation's active states should be:\n"
                                + stateNamesTree
                                + "\nbut the states actually active are:\n"
                                + simStateNamesTree;
                        
                        throw new KiemExecutionException("Validation error", false,
                                new ValidationException(errorMessage));
                    }
                } else if(!isHistoryStep) {
                    throw new KiemExecutionException("Validation error", false,
                            new ValidationException(
                                    "Validation error: The simulation should provide a variable \""
                                            + key + "\" with a value of \"" + recValue
                                            + "\", but it actually generated the value \""
                                            + simValue + "\"."));
                }
            }
        }
    }
    
    public void validateSignals(List<ISignal> recSignals, Map<String, Object> simSignals, boolean isHistoryStep, long step)
            throws KiemExecutionException {
        Iterator<ISignal> it = recSignals.iterator();
        while (it.hasNext()) {
            ISignal recSignal = it.next();
            // presence
            if (!simSignals.containsKey(recSignal.getName())) {
                System.out.println("Presence check failed");
                Utilities.visualizeSignals(recSignal.getName(), step);
                if(!isHistoryStep) {
                    throw new KiemExecutionException("Validation error", false,
                            new ValidationException("Validation error: Signal \"" + recSignal.getName()
                                    + "\" is not present, but it should be."));
                }
            }

            // value
            if (recSignal.isValued()
                    && !(recSignal.getValue() == simSignals.get(recSignal.getName()))) {
                Utilities.visualizeSignals(recSignal.getName(), step);
                if(!isHistoryStep) {
                    throw new KiemExecutionException(
                            "Validation error",
                            false,
                            new ValidationException(
                                    "Validation error: Signal \""
                                            + recSignal.getName()
                                            + "\" was recorded as a valued signal with value \""
                                            + recSignal.getValue()
                                            + "\" but "
                                            + ((simSignals.get(recSignal.getName()) == null) ? "is not a valued signal in the simulation."
                                                    : ("was simulatated with value \""
                                                            + recSignal.getValue() + "\"."))));
                }
            }

            simSignals.remove(recSignal.getName());
        }

        // additional signals
        if (!ignoreAdditionalSignals && !simSignals.isEmpty()) {
            String excessSignals = "";
            Iterator<String> it2 = simSignals.keySet().iterator();
            while (it2.hasNext()) {
                String signal = it2.next();
                Utilities.visualizeSignals(signal, step);
                excessSignals += "\"" + signal + "\"";

                if (it2.hasNext()) {
                    excessSignals += ", ";
                }
            }

            if(!isHistoryStep) {
                throw new KiemExecutionException("Validation error", false, new ValidationException(
                        "Validation error: The signal(s) " + excessSignals
                                + " were not recorded, but generated in the simulation"));
            }
        }
    }
}
