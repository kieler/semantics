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
package de.cau.cs.kieler.sim.kart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.Scope;

/**
 * Provides utility methods used by the validation component and the validation engine.
 * 
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2012-01-24 red
 */
public class Utilities {
    /**
     * Generate a List of the states contained in the parameter string
     * 
     * @param stateString
     *            the string of states to be converted into a List
     * @return a List of states
     */
    public static List<EObject> getStates(DiagramEditor editor, String stateString) {
        List<EObject> retval = new ArrayList<EObject>();
        String[] states = stateString.replaceAll("\\s", "").split(",");
        for (String state : states) {
            retval.add(editor.getDiagram().getElement().eResource().getEObject(state));
        }
        return retval;
    }

    /**
     * Build a tree-like list of states with indentations. Indirect descent, i. e. one or more nodes
     * between two states in the list is not displayed. The descendant node will be displayed as a
     * direct child of its ancestor.
     * 
     * @param root
     *            MUST ALWAYS be {@code new Tree(null)} states list of states that shall be put in
     *            the tree structure
     * @return
     */
    public static Tree buildTree(Tree root, List<EObject> states) {
        while (!states.isEmpty()) {
            EObject itemObject = states.get(0);
            states.remove(0);

            if (itemObject instanceof Scope) {
                boolean breakIf = false;
                Scope item = (Scope) itemObject;
                Tree itemTree = new Tree(item);

                while (item.eContainer() != null) {
                    if (states.contains(item.eContainer())) {
                        states.remove(item.eContainer());
                        Tree parentTree = new Tree((Scope) item.eContainer());
                        parentTree.addChild(itemTree);
                        itemTree = parentTree;
                    } else {
                        Tree parentTree = root.findValue((Scope) item.eContainer());
                        if (parentTree != null) {
                            parentTree.addChild(itemTree);
                            breakIf = true;
                            break;
                        }
                    }
                    item = (Scope) item.eContainer();
                }

                if (!breakIf) {
                    root.addChild(itemTree);
                }

            }
        }

        return root;
    }

    /**
     * Create a Set from an array of Strings
     * 
     * @param split the array of Strings
     * @return a set including all String from the parameter
     */
    public static Set<Pair<String,String>> makeSetOfPairs(String string) throws KiemInitializationException {
        try {
            String[] strPairs = string.split("\\)\\s*,\\s*\\(|\\(|\\)");
            HashSet<Pair<String,String>> retval = new HashSet<Pair<String,String>>();
    
            for (String strPair : strPairs) {
                if(!strPair.equals("")) {
                    String[] pair = strPair.split(",");
                    retval.add(new Pair<String,String>(pair[0], pair[1]));
                } else {
                }
            }
            return retval;
        } catch (Exception e) {
            throw new KiemInitializationException("Error during gathering variable names to validate", true, e);
        }
    }

    /**
     * Decide whether a signal is a signal or a variable
     * 
     * @param variables the set of known variables
     * @param key the name of the signal
     * @return true if variables contains the key, false otherwise
     */
    public static boolean isVariable(Set<String> variables, String key) {
        return variables.contains(key);
    }

    /**
     * Converts a JSON object representing the simulation's signals to a map and records the signals
     * internally. Input and special signals are automatically stripped from the returned map, thus
     * a map of true output signals, i. e. those that only became present after executing the
     * {@link DataReplayComponent}, is returned.
     * 
     * @param obj
     *            the JSON object representing the simulation's signals
     * @return the map of true output signals
     */
    public static HashMap<String, Object> convertAndRecordSignals(JSONObject obj,
            List<HashMap<String, Object>> recInputs, List<HashMap<String, Object>> recOutputs,
            List<HashMap<String, Object>> recVariables, Set<String> variables) {
        @SuppressWarnings("unchecked")
        // necessary because the JSON library does not return a parameterized Iterator
        Iterator<String> keys = obj.keys();

        HashMap<String, Object> signals = new HashMap<String, Object>();
        HashMap<String, Object> extraInfo = new HashMap<String, Object>();

        HashMap<String, Object> inputs = new HashMap<String, Object>();
        if (recInputs.size() > 0) {
            inputs = recInputs.get(recInputs.size() - 1);
        }

        while (keys.hasNext()) {
            String key = keys.next();
            try {
                if (!inputs.containsKey(key) && !isVariable(variables, key)
                        && obj.getJSONObject(key).getBoolean("present")) {
                    Object val = obj.getJSONObject(key).opt("value");
                    signals.put(key, val);
                }
                if (isVariable(variables, key)) {
                    Object val = obj.get(key);
                    extraInfo.put(key, val);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        recOutputs.add(signals);
        recVariables.add(extraInfo);

        return signals;
    }

    /**
     * Visualize invalid states. This method will visually mark invalid states using all
     * currently registered extensions to the visualStates extension point.
     * 
     * @param isStates set of states generated by the simulation
     * @param shallStates set of states expected to be generated but not generated
     */
    public static void visualizeStates(List<EObject> isStates, List<EObject> shallStates,
            DiagramEditor editor) {
        IConfigurationElement[] extensions = Platform.getExtensionRegistry()
                .getConfigurationElementsFor("de.cau.cs.kieler.sim.kart.visualStates");

        for (IConfigurationElement element : extensions) {
            try {
                IStateVisualization vis = (IStateVisualization) (element
                        .createExecutableExtension("class"));

                vis.visualize(isStates, shallStates, editor);
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Visualize invalid signals. This method will visually mark invalid signals using all
     * currently registered extensions to the visualSignals extension point.
     * 
     * @param signalName the name of the signal to be marked invalid
     * @param step the step in which the signal shall be marked invalid
     */
    public static void visualizeSignals(String signalName, long step) {
        IConfigurationElement[] extensions = Platform.getExtensionRegistry()
                .getConfigurationElementsFor("de.cau.cs.kieler.sim.kart.visualSignals");

        for (IConfigurationElement element : extensions) {
            try {
                ISignalVisualization vis = (ISignalVisualization) (element
                        .createExecutableExtension("class"));

                vis.visualize(signalName, step);
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
    }
}
