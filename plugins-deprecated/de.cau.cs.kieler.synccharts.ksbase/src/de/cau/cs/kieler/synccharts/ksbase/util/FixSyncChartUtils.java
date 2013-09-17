/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.synccharts.ksbase.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;
import de.cau.cs.kieler.synccharts.ksbase.SyncchartsKsbasePlugin;
import de.cau.cs.kieler.synccharts.listener.SyncchartsContentUtil;
import de.cau.cs.kieler.synccharts.listener.UniqueStringCache;

/**
 * Utils for optimization.
 * 
 * @author soh
 * @kieler.ignore (excluded from review process)
 */
public final class FixSyncChartUtils {

    /** Preference Prefix. */
    public static final String PREFIX = "_OPTIMIZE_";
    /** Identifier for fixing the state and region ids. */
    public static final String FIX_IDS = "fixIDs";
    /** Identifier for fixing transitions leaving conditional states. */
    public static final String FIX_CONDITIONAL_OUTGOING_IMMEDIATE = "fixConditionalOutgoingImmediate";
    /** Identifier for removing dummy states. */
    public static final String REMOVE_DUMMY_STATES = "removeDummyStates";
    /** Identifier for removing white space from trigger and effects. */
    public static final String REMOVE_WHITE_SPACES = "removeWhiteSpaces";
    /** Identifier for removing dummy regions. */
    public static final String REMOVE_DUMMY_REGIONS = "removeDummyRegions";
    /** Identifier for removing dead ending conditionals. */
    public static final String REMOVE_DEAD_END_CONDITIONALS = "removeDeadEndConditionals";
    /** Identifier for fixing transitions with priority zero. */
    public static final String FIX_TRANSITION_PRIORITY_IS_ZERO = "fixTransitionPriorityIsZero";
    /** Identifier for fixing the transition priorities. */
    public static final String FIX_TRANSITION_PRIORITY_BASED_ON_TYPE
            = "fixTransitionPriorityBasedOnType";
    /**
     * Identifier for fixing transition types of transitions leaving simple
     * states.
     */
    public static final String FIX_TRANSITION_TYPES_LEAVING_SIMPLE_STATE
            = "fixTransitionTypeLeavingSimpleState";
    /** Identifier for turning normal terminations with trigger into weakaborts. */
    public static final String NORMAL_TERMINATION_WITH_TRIGGER_TO_WEAK_ABORT
            = "normalTerminationWithTriggerToWeakAbort";

    /** Identifier for removing signals and variables that are not used. */
    public static final String REMOVE_UNUSED_SIGNALS_AND_VARIABLES = "removeUnusedSignalsAndVariables";

    /**
     * Identifier for choosing what to do with normal terminations leaving
     * complex states.
     */
    public static final String FIX_NORMAL_TERMINATION_LEAVING_COMPLEX_STATE
            = "fixNormalTerminationLeavingComplexState";
    /** Identifier for removing the trigger from normal termination transitions. */
    public static final String REMOVE_TRIGGER_FROM_NORMAL_TERMINATION
            = "removeTriggerFromNormalTermination";
    /** Identifier for turning normal terminations into weak aborts. */
    public static final String TURN_NORMAL_TERMINATION_INTO_WEAK_ABORT
            = "turnNormalTerminationIntoWeakAbort";

    /** Identifier for doing nothing. */
    public static final String DO_NOTHING = "doNothing";

    /**
     * Contains the identifiers for all optimizations that are required to have
     * a valid syncchart. Register new optimizations here.
     * 
     */
    private static final String[] REQUIRED_KEYS = { FIX_IDS,
            FIX_TRANSITION_PRIORITY_IS_ZERO,
            FIX_TRANSITION_PRIORITY_BASED_ON_TYPE,
            FIX_CONDITIONAL_OUTGOING_IMMEDIATE, REMOVE_DEAD_END_CONDITIONALS };

    /**
     * Contains the identifiers for all optimizations that improve a syncchart
     * but are not required.
     */
    private static final String[] OPTIONAL_KEYS = { REMOVE_DUMMY_STATES,
            REMOVE_WHITE_SPACES, REMOVE_DUMMY_REGIONS,
            REMOVE_UNUSED_SIGNALS_AND_VARIABLES,
            FIX_TRANSITION_TYPES_LEAVING_SIMPLE_STATE };

    /**
     * Contains the identifiers for all optimizations that contain a choice.
     */
    private static final String[] CHOICE_KEYS = { FIX_NORMAL_TERMINATION_LEAVING_COMPLEX_STATE };

    /** Contains the list of all available boolean keys. */
    private static List<String> keys = null;

    /** Contains the list of all available choice keys. */
    private static List<String> choiceKeys = null;

    /** The preference store. */
    private static IPreferenceStore store = null;

    /** Cached region and state ids. */
    private static List<UniqueStringCache> caches = new LinkedList<UniqueStringCache>();

    /**
     * 
     * Dummy.
     * 
     */
    private FixSyncChartUtils() {

    }

    /**
     * Initialize the list of keys.
     * 
     * @return the list of keys
     */
    public static List<String> getKeys() {
        if (keys == null) {
            keys = new ArrayList<String>(REQUIRED_KEYS.length
                    + OPTIONAL_KEYS.length);
            for (String s : REQUIRED_KEYS) {
                keys.add(PREFIX + s);
            }
            for (String s : OPTIONAL_KEYS) {
                keys.add(PREFIX + s);
            }
        }
        return keys;
    }

    /**
     * Initialize the list of choice keys.
     * 
     * @return the list of choice keys
     */
    public static List<String> getChoiceKeys() {
        if (choiceKeys == null) {
            choiceKeys = new ArrayList<String>(CHOICE_KEYS.length);
            for (String s : CHOICE_KEYS) {
                choiceKeys.add(PREFIX + s);
            }
        }
        return choiceKeys;
    }

    /**
     * Get the choices for one the keys.
     * 
     * @param key
     *            the key
     * @return the choices.
     */
    public static List<String> getChoices(final String key) {
        List<String> result = new ArrayList<String>();
        result.add(DO_NOTHING);
        String theKey = key.replaceFirst(PREFIX, "");

        if (theKey.equals(FIX_NORMAL_TERMINATION_LEAVING_COMPLEX_STATE)) {
            result.add(TURN_NORMAL_TERMINATION_INTO_WEAK_ABORT);
            result.add(REMOVE_TRIGGER_FROM_NORMAL_TERMINATION);
        }

        return result;
    }

    /**
     * Save the configuration in the preference store back to the persistent
     * store.
     * 
     */
    public static void saveConfiguration() {
        if (store != null) {
            IEclipsePreferences prefs = InstanceScope.INSTANCE
                    .getNode(SyncchartsKsbasePlugin.PLUGIN_ID);
            for (String key : keys) {
                Boolean value = store.getBoolean(key);
                if (value != null) {
                    prefs.putBoolean(key, value);
                }
            }

            for (String key : choiceKeys) {
                String value = store.getString(key);
                if (value != null) {
                    prefs.put(key, value);
                }
            }
        }
    }

    /**
     * Load the configuration from the persistent store to the preference store.
     * This has to be done before the values are accessed the first time. It
     * will have no effect once the store is loaded for the first time.
     * 
     */
    public static void loadConfiguration() {
        if (store == null) {
            store = SyncchartsKsbasePlugin.getDefault().getPreferenceStore();
            IEclipsePreferences prefs = InstanceScope.INSTANCE
                    .getNode(SyncchartsKsbasePlugin.PLUGIN_ID);
            for (String key : getKeys()) {
                boolean value = prefs.getBoolean(key, false);
                store.setValue(key, value);
            }

            for (String key : getChoiceKeys()) {
                String value = prefs.get(key, DO_NOTHING);
                store.setValue(key, value);
            }
        }
    }

    /**
     * Debug output for xtend code.
     * 
     * @param object
     *            the message
     */
    public static void debug(final Object object) {
        System.out.println("BUGFIX DEBUG: " + object.toString());
    }

    /**
     * 
     * @return a new list of states
     */
    public static List<State> getStateList() {
        return new LinkedList<State>();
    }

    /**
     * 
     * @return a new list of strings
     */
    public static List<String> getStringList() {
        return new LinkedList<String>();
    }

    /**
     * 
     * @return a new list of regions
     */
    public static List<Region> getRegionList() {
        return new LinkedList<Region>();
    }

    /**
     * Clear the caches.
     */
    public static void clearCache() {
        caches.clear();
    }

    /**
     * Generate a unique id for the state.
     * 
     * @param state
     *            the state.
     */
    public static void generateStateId(final State state) {
        if (state.getId() == null || state.getId().trim().equals("")) {
            String anonymousId = getUniqueString(state,
                    SyncchartsPackage.eINSTANCE.getScope_Id(), "_S");
            state.setId(anonymousId);
            return;
        }

        // check whether ID is unique
        Region parentRegion = state.getParentRegion();
        if (parentRegion != null) {
            for (State sibling : parentRegion.getStates()) {
                String siblingId = sibling.getId();
                if (siblingId != null && siblingId.equals(state.getId())
                        && sibling != state) {
                    // resolve conflict by changing auto generated IDs (for
                    // anonymous states)

                    String dummyId = getUniqueString(sibling,
                            SyncchartsPackage.eINSTANCE.getScope_Id(),
                            sibling.getLabel());
                    sibling.setId(dummyId);

                }
            }
        }
    }

    /**
     * Generate a unique id for the region.
     * 
     * @param region
     *            the region
     */
    public static void generateRegionId(final Region region) {
        if (region.getId() == null || region.getId().trim().equals("")) {
            String anonymousId = getUniqueString(region,
                    SyncchartsPackage.eINSTANCE.getScope_Id(), "_R");
            region.setId(anonymousId);
            return;
        } else if (region.getLabel() == null
                || region.getLabel().trim().equals("")) {
            region.setLabel(region.getId());
        }

        // check whether ID is unique
        State parentState = region.getParentState();
        if (parentState != null) {
            for (Region sibling : parentState.getRegions()) {
                String siblingId = sibling.getId();
                if (siblingId != null && siblingId.equals(region.getId())) {
                    // resolve conflict by changing auto generated IDs (for
                    // anonymous states)
                    if (sibling.getId() == null
                            || sibling.getId().trim().equals("")) {
                        String dummyId = getUniqueString(sibling,
                                SyncchartsPackage.eINSTANCE.getScope_Id(), "_R");
                        sibling.setId(dummyId);
                    }
                }
            }
        }
    }

    /**
     * 
     * @param target
     * @param attribute
     * @param prefix
     * @return
     */
    private static String getUniqueString(final EObject target,
            final EAttribute attribute, final String prefix) {
        EObject parent = target.eContainer();
        UniqueStringCache cache = null;
        for (UniqueStringCache c : caches) {
            if (c != null && (parent == null && c.getParent() == null)
                    || (c.getParent() != null && c.getParent().equals(parent))
                    && c.getAttribute().equals(attribute)) {
                cache = c;
            }
        }
        if (cache == null) {
            cache = new UniqueStringCache(parent, attribute);
            caches.add(cache);
        }
        String temp = SyncchartsContentUtil.getNewUniqueString(target,
                attribute, prefix, cache);
        cache.add(temp);
        return temp;
    }

    /**
     * Returns whether or not an optimization should be run.
     * 
     * @param key
     *            the key
     * @return true if it should be run
     */
    public static Boolean isEnabled(final String key) {
        loadConfiguration();
        Boolean result = store.getBoolean(PREFIX + key);
        if (result != null) {
            return result;
        }
        return false;
    }

    /**
     * Get the chosen option for choices.
     * 
     * @param key
     *            the key
     * @return the chosen option
     */
    public static String getChoice(final String key) {
        loadConfiguration();
        String result = store.getString(PREFIX + key);
        if (result != null) {
            return result;
        }
        return DO_NOTHING;
    }

    /**
     * Getter for the displayable name of the optimization.
     * 
     * @param key
     *            the key
     * @return the display name
     */
    public static String getDisplay(final String key) {
        String theKey = key.replaceFirst(PREFIX, "");
        String result = theKey;
        if (theKey.equals(DO_NOTHING)) {
            result = "Do nothing";
        } else if (theKey.equals(FIX_IDS)) {
            result = "Fix state and region IDs";
        } else if (theKey.equals(FIX_TRANSITION_PRIORITY_IS_ZERO)) {
            result = "Fix transitions with priority zero";
        } else if (theKey.equals(FIX_CONDITIONAL_OUTGOING_IMMEDIATE)) {
            result = "Fix transitions leaving conditional states";
        } else if (theKey.equals(FIX_TRANSITION_TYPES_LEAVING_SIMPLE_STATE)) {
            result = "Set transitions leaving simple states to WEAKABORT";
        } else if (theKey.equals(REMOVE_DUMMY_STATES)) {
            result = "Remove redundant states";
        } else if (theKey.equals(REMOVE_DUMMY_REGIONS)) {
            result = "Remove empty regions";
        } else if (theKey.equals(REMOVE_WHITE_SPACES)) {
            result = "Remove white spaces from trigger and effects";
        } else if (theKey.equals(REMOVE_DEAD_END_CONDITIONALS)) {
            result = "Remove dead end conditional states";
        } else if (theKey.equals(FIX_TRANSITION_PRIORITY_BASED_ON_TYPE)) {
            result = "Fix transition priorities based on their types";
        } else if (theKey.equals(REMOVE_TRIGGER_FROM_NORMAL_TERMINATION)) {
            result = "Remove trigger from NORMALTERMINATION transitions";
        } else if (theKey.equals(TURN_NORMAL_TERMINATION_INTO_WEAK_ABORT)) {
            result = "Turn NORMALTERMINATION transitions into WEAKABORT transitions";
        } else if (theKey.equals(FIX_NORMAL_TERMINATION_LEAVING_COMPLEX_STATE)) {
            result = "Fix NORMALTERMINATION transitions with trigger leaving a complex state";
        } else if (theKey.equals(REMOVE_UNUSED_SIGNALS_AND_VARIABLES)) {
            result = "Remove unused signals and variables.";
        }
        return result
                + (Arrays.asList(REQUIRED_KEYS).contains(theKey) ? " (REQUIRED)"
                        : "");
    }

    /**
     * Getter for the tooltip of the optimization.
     * 
     * @param key
     *            the key
     * @return the tooltip
     */
    public static String getTooltip(final String key) {
        String theKey = key.replaceFirst(PREFIX, "");
        String result = theKey;
        if (theKey.equals(FIX_IDS)) {
            result = "Each state and region requires a unique identifier."
                    + " This transformation generates unique IDs for each region and state.";
        } else if (theKey.equals(FIX_TRANSITION_PRIORITY_IS_ZERO)) {
            result = "Ensures that the lowest transition priority is 1.";
        } else if (theKey.equals(FIX_CONDITIONAL_OUTGOING_IMMEDIATE)) {
            result = "Makes all transitions leaving conditional states immediate.";
        } else if (theKey.equals(REMOVE_DUMMY_STATES)) {
            result = "Removes states that have no effect on the syncchart. For a state"
                    + " to be removed it must be simple state and all outgoing transitions"
                    + " must be immediate and have no trigger or effect.";
        } else if (theKey.equals(REMOVE_DUMMY_REGIONS)) {
            result = "Removes empty regions with no variables and signals since"
                    + " they have no effect on the syncchart.";
        } else if (theKey.equals(REMOVE_WHITE_SPACES)) {
            result = "Removes white spaces from trigger and effects string as they are redundant.";
        } else if (theKey.equals(FIX_TRANSITION_TYPES_LEAVING_SIMPLE_STATE)) {
            result = "Transitions leaving simple states should be WEAKABORT.";
        } else if (theKey.equals(REMOVE_DEAD_END_CONDITIONALS)) {
            result = "Conditional states without any outgoing transitions don't make sense.";
        } else if (theKey.equals(FIX_TRANSITION_PRIORITY_BASED_ON_TYPE)) {
            result = "STRONGABORTs must have the highest priority (lowest numerical value),"
                    + " followed by WEAKABORTs. The NORMALTERMINATION must have the lowest"
                    + " priority. This optimization ensures correct priorities while keeping"
                    + " order within each type.";
        } else if (theKey.equals(REMOVE_TRIGGER_FROM_NORMAL_TERMINATION)) {
            result = "Transitions of type NORMALTERMINATION mustn't have a trigger"
                    + " as they are triggered by final states in the source state being"
                    + " reached.";
        } else if (theKey.equals(REMOVE_UNUSED_SIGNALS_AND_VARIABLES)) {
            result = "Signals that are never emitted or referenced can never have "
                    + "an impact on the current syncchart. The same goes for "
                    + "non-constant variables that are never read or assigned a value.";
        }
        return result;
    }

    /**
     * Sort the priorities in a list of transitions.
     * 
     * @param object
     *            the list of transitions
     */
    @SuppressWarnings("unchecked")
    public static void fixTransList(final Object object) {
        if (object instanceof List<?>) {
            List<Transition> list = (List<Transition>) object;
            int prioCounter = 1;
            for (Transition t : list) {
                if (t.getType().equals(TransitionType.STRONGABORT)) {
                    t.setPriority(prioCounter++);
                }
            }
            for (Transition t : list) {
                if (t.getType().equals(TransitionType.WEAKABORT)) {
                    t.setPriority(prioCounter++);
                }
            }
        }
    }
}
