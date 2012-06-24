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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.sim.eso.ISignal;
import de.cau.cs.kieler.sim.eso.eso.impl.EsoBoolImpl;
import de.cau.cs.kieler.sim.eso.eso.impl.EsoFloatImpl;
import de.cau.cs.kieler.sim.eso.eso.impl.EsoIntImpl;
import de.cau.cs.kieler.sim.eso.eso.impl.EsoJsonImpl;
import de.cau.cs.kieler.sim.eso.eso.impl.EsoStringImpl;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;

/**
 * Provides utility methods used by the validation component and the validation engine.
 * 
 * @author ssc, cmot
 * @kieler.rating 2012-01-24 red
 */
public final class Utilities {

    /**
     * Utility class should not be instantiated.
     */
    private Utilities() {
    }

    // -------------------------------------------------------------------------

    /**
     * Convert the value of a signal from an ESO file to its actual, typed Java representation.
     * 
     * @param signal
     *            the signal the value shall be extracted from
     * @return the signal value
     */
    public static Object getEsoSignalValue(final ISignal signal) {
        if (signal.getValue() instanceof EsoIntImpl) {
            return ((EsoIntImpl) signal.getValue()).getValue();
        } else if (signal.getValue() instanceof EsoFloatImpl) {
            return ((EsoFloatImpl) signal.getValue()).getValue();
        } else if (signal.getValue() instanceof EsoBoolImpl) {
            return ((EsoBoolImpl) signal.getValue()).isValue();
        } else if (signal.getValue() instanceof EsoStringImpl) {
            return ((EsoStringImpl) signal.getValue()).getValue();
        } else {
            return null;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Convert the value of a variable from an ESO file to its actual, typed Java representation.
     * 
     * @param var
     *            the variable value which shall be converted
     * @return the converted variable value
     */
    public static Object getEsoVarValue(final Entry<String, Object> var) {
        if (var.getValue() instanceof EsoIntImpl) {
            return ((EsoIntImpl) var.getValue()).getValue();
        } else if (var.getValue() instanceof EsoFloatImpl) {
            return ((EsoFloatImpl) var.getValue()).getValue();
        } else if (var.getValue() instanceof EsoBoolImpl) {
            return ((EsoBoolImpl) var.getValue()).isValue();
        } else if (var.getValue() instanceof EsoStringImpl) {
            return ((EsoStringImpl) var.getValue()).getValue();
        } else if (var.getValue() instanceof EsoJsonImpl) {
            try {
                return new JSONObject(((EsoJsonImpl) var.getValue()).getValue());
            } catch (JSONException e) {
                return ((EsoJsonImpl) var.getValue()).getValue();
            }
        } else {
            return null;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Build a tree-like list of states with indentations. Indirect descent, i. e. one or more nodes
     * between two states in the list is not displayed. The descendant node will be displayed as a
     * direct child of its ancestor.
     * 
     * @param root
     *            MUST ALWAYS be {@code new Tree(null)} states list of states that shall be put in
     *            the tree structure
     * @param states
     *            the states
     * @return the tree
     */
    public static Tree buildTree(final Tree root, final List<EObject> states) {
        while (!states.isEmpty()) {
            EObject itemObject = states.get(0);
            states.remove(0);

            boolean breakIf = false;
            EObject item = (EObject) itemObject;
            Tree itemTree = new Tree(item);

            while (item.eContainer() != null) {
                if (states.contains(item.eContainer())) {
                    states.remove(item.eContainer());
                    Tree parentTree = new Tree((EObject) item.eContainer());
                    parentTree.addChild(itemTree);
                    itemTree = parentTree;
                } else {
                    Tree parentTree = root.findValue((EObject) item.eContainer());
                    if (parentTree != null) {
                        parentTree.addChild(itemTree);
                        breakIf = true;
                        break;
                    }
                }
                item = (EObject) item.eContainer();
            }

            if (!breakIf) {
                root.addChild(itemTree);
            }
        }
        return root;
    }

    // -------------------------------------------------------------------------

    /**
     * Create a Set from an array of Strings.
     * 
     * @param string
     *            the string
     * @return a set including all String from the parameter
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    public static Set<Pair<String, String>> makeSetOfPairs(final String string)
            throws KiemInitializationException {
        try {
            String[] strPairs = string.split("\\)\\s*,\\s*\\(|\\(|\\)");
            HashSet<Pair<String, String>> retval = new HashSet<Pair<String, String>>();

            for (String strPair : strPairs) {
                if (!strPair.equals("")) {
                    String[] pair = strPair.split(",");
                    retval.add(new Pair<String, String>(pair[0].trim(), pair[1].trim()));
                }
            }
            return retval;
        } catch (Exception e) {
            throw new KiemInitializationException(
                    "Error during gathering variable names to validate", true, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Extract signal information from a JSON object and create a Map of signal names and signal
     * values. Signals without a value will be assigned {@code null} as value. Only present signals
     * will be put into the map
     * 
     * @param json
     *            the JSON object to extract signal information from
     * @return a map of signal names and their corresponding values (or null if not applicable)
     */
    public static Map<String, Object> getSignals(final JSONObject json) {
        String[] fieldNames = JSONObject.getNames(json);
        HashMap<String, Object> retval = new HashMap<String, Object>();

        for (String field : fieldNames) {
            try {
                Object obj = json.get(field);
                if (obj instanceof JSONObject && JSONSignalValues.isSignalValue(obj)
                        && JSONSignalValues.isPresent(obj)) {
                    retval.put(field, JSONSignalValues.getSignalValue(obj));
                }
            } catch (JSONException e) {
                // do nothing
            }
        }

        return retval;
    }

    // -------------------------------------------------------------------------

    /**
     * Compare two values, normally one taken from an ESO file and one taken from the simulation.
     * Value can be of any type and value b will be tried to be parsed according to that type.
     * 
     * @param a
     *            first value (from ESO)
     * @param b
     *            second value (from simulation)
     * @return true if both values are of the same type and represent the same value, false
     *         otherwise
     */
    public static boolean compareValues(final Object a, final String b) {
        if (a instanceof Integer) {
            try {
                return ((Integer) a).equals(Integer.parseInt((String) b));
            } catch (NumberFormatException e) {
                return false;
            }
        } else if (a instanceof Float) {
            try {
                return ((Float) a).equals(Float.parseFloat(b));
            } catch (NumberFormatException e) {
                return false;
            }
        } else if (a instanceof Boolean) {
            try {
                return ((Boolean) a).equals(Boolean.parseBoolean(b));
            } catch (NumberFormatException e) {
                return false;
            }
        } else if (a instanceof JSONObject) {
            try {
                return ((JSONObject) a).equals(new JSONObject(b));
            } catch (JSONException e) {
                return false;
            }
        } else if (a instanceof String) {
            return ((String) a).equals((String) b);
        } else {
            return a.equals(b);
        }
    }

    // -------------------------------------------------------------------------

}
