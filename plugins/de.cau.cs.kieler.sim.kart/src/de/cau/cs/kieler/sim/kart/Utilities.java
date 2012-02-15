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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.sim.esi.ISignal;
import de.cau.cs.kieler.sim.esi.esi.impl.EsoBoolImpl;
import de.cau.cs.kieler.sim.esi.esi.impl.EsoFloatImpl;
import de.cau.cs.kieler.sim.esi.esi.impl.EsoIntImpl;
import de.cau.cs.kieler.sim.esi.esi.impl.EsoJsonImpl;
import de.cau.cs.kieler.sim.esi.esi.impl.EsoStringImpl;
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
    public static List<EObject> getStates(DiagramEditor editor, Object stateObject) {
        List<EObject> retval = new ArrayList<EObject>();
        String[] states = stateObject.toString().replaceAll("\\s", "").split(",");
        for (String state : states) {
            retval.add(editor.getDiagram().getElement().eResource().getEObject(state.trim()));
        }
        return retval;
    }
    
    /**
     * Convert the value of a signal from an ESO file to its actual, typed
     * Java representation
     * 
     * @param signal the signal the value shall be extracted from
     * @return the signal value
     */
    public static Object getEsoSignalValue(ISignal signal) {
        if (signal.getValue() instanceof EsoIntImpl) {
            return ((EsoIntImpl)signal.getValue()).getValue();
        } else if (signal.getValue() instanceof EsoFloatImpl) {
            return ((EsoFloatImpl)signal.getValue()).getValue();
        } else if (signal.getValue() instanceof EsoBoolImpl) {
            //return ((EsoBoolImpl)signal.getValue()).getValue();
            return false;
        } else if (signal.getValue() instanceof EsoStringImpl) {
            return ((EsoStringImpl)signal.getValue()).getValue();
        } else {
            return null;
        }
    }
    
    /**
     * Convert the value of a variable from an ESO file to its actual, typed
     * Java representation
     * 
     * @param var the variable value which shall be converted
     * @return the converted variable value
     */
    public static Object getEsoVarValue(Entry<String,Object> var) {
        if (var.getValue() instanceof EsoIntImpl) {
            return ((EsoIntImpl)var.getValue()).getValue();
        } else if (var.getValue() instanceof EsoFloatImpl) {
            return ((EsoFloatImpl)var.getValue()).getValue();
        } else if (var.getValue() instanceof EsoBoolImpl) {
            //return ((EsoBoolImpl)var.getValue()).getValue();
            return false;
        } else if (var.getValue() instanceof EsoStringImpl) {
            return ((EsoStringImpl)var.getValue()).getValue();
        } else if (var.getValue() instanceof EsoJsonImpl) {
            try {
                return new JSONObject(((EsoJsonImpl)var.getValue()).getValue());
            } catch (JSONException e) {
                return ((EsoJsonImpl)var.getValue()).getValue();
            }
        } else {
            return null;
        }
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
                    retval.add(new Pair<String,String>(pair[0].trim(), pair[1].trim()));
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

    /**
     * Compare two variables, normally one taken from an ESO file and one taken from the simulation.
     * 
     * @param recValue first value
     * @param simValue second value
     * @return true if both values are of the same type and represent the same value, false otherwise
     */
    public static boolean compareVariables(DiagramEditor ed, Object a, Object b) {
        if(a.getClass().equals(b.getClass())) {
            if (a instanceof Integer && b instanceof Integer) {
                return ((Integer)a).equals((Integer)b);
            } else if (a instanceof Float && b instanceof Float) {
                return ((Float)a).equals((Float)b);
            } else if (a instanceof Boolean && b instanceof Boolean) {
                return ((Boolean)a).equals((Boolean)b);
            } else if (a instanceof JSONObject && b instanceof JSONObject) {
                return ((JSONObject)a).equals((JSONObject)b);
            } else if(a instanceof String && b instanceof String) {
                try {
                    List<String> aS = getStrings(getStates(ed, a));
                    List<String> bS = getStrings(getStates(ed, b));
                    Collections.sort(aS);
                    Collections.sort(bS);
                    return aS.equals(bS);
                } catch (Exception e) {
                    e.printStackTrace();
                    return ((String)a).equals((String)b);
                }
            } else {
                return a.equals(b);
            }
        } else {
            return false;
        }
    }

    /**
     * @param states
     * @return
     */
    private static List<String> getStrings(List<EObject> states) {
        List<String> retval = new LinkedList<String>();
        for(EObject s : states) {
            retval.add(s.toString());
        }
        return retval;
    }
}
