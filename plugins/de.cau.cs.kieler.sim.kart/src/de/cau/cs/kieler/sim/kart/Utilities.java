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
import java.util.Map;
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
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
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
     * Extract signal information from a JSON object and create a Map of signal names and signal values.
     * Signals without a value will be assigned {@code null} as value. Only present signals will be
     * put into the map
     * @param json the JSON object to extract signal information from
     * @return a map of signal names and their corresponding values (or null if not applicable)
     */
    public static Map<String,Object> getSignals(JSONObject json) {
        String[] fieldNames = JSONObject.getNames(json);
        HashMap<String,Object> retval = new HashMap<String,Object>();
        
        for(String field : fieldNames) {
            try {
            Object obj = json.get(field);
                if(obj instanceof JSONObject && JSONSignalValues.isSignalValue(obj) && JSONSignalValues.isPresent(obj)) {
                    retval.put(field, JSONSignalValues.getSignalValue(obj));
                }
            } catch (JSONException e) {
                // do nothing
            }
        }
        
        return retval;
    }
}
