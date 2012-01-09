/*
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
 */
package de.cau.cs.kieler.sim.kiem.config.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.config.KiemConfigurationPlugin;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * Contains a number of useful tools. <BR>
 * Also contains a number of Strings needed in more than one class.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public final class Tools {

    /** identifier for the step duration. */
    public static final KiemPropertyKeyWrapper AIMED_STEP_DURATION_KEY = new KiemPropertyKeyWrapper(
            KiemPlugin.AIMED_STEP_DURATION_ID);
    /** the key for the default editor. */
    public static final KiemPropertyKeyWrapper DEFAULT_EDITOR_KEY = new KiemPropertyKeyWrapper(
            "DEFAULT_EDITOR");
    /** the key for the default editor name. */
    public static final KiemPropertyKeyWrapper DEFAULT_EDITOR_NAME_KEY = new KiemPropertyKeyWrapper(
            "DEFAULT_EDITOR_NAME");
    /** the key for the default priority. */
    public static final KiemPropertyKeyWrapper DEFAULT_PRIORITY_KEY = new KiemPropertyKeyWrapper(
            "DEFAULT_PRIORITY");
    /** the key for the capacity of the recent schedules list. */
    public static final KiemPropertyKeyWrapper RECENT_CAPACITY_KEY = new KiemPropertyKeyWrapper(
            "RECENT_CAPACITY");
    /** identifier for the timeout. */
    public static final KiemPropertyKeyWrapper TIMEOUT_KEY = new KiemPropertyKeyWrapper(
            KiemPlugin.TIMEOUT_ID);

    // --------------------------------------------------------------------------

    /** the tooltip for the add property dialog. */
    public static final String ADD_PROPERTY_TOOLTIP = "A dialog "
            + "where you can enter the key and value of a new property.";
    /** the tooltip for the advanced user mode. */
    public static final String ADVANCED_MODE_HINT = "In advanced "
            + "mode the user can add, remove and modify the currently running "
            + "ConfigurationDataComponent.";
    /** the name of the application. */
    public static final String APPLICATION_NAME = "KIELER";
    /** title string for confirmation boxes. */
    public static final String ARE_YOU_SURE = "Are you sure?";

    /** the key for the preference store for the contribution manager. */
    public static final String CONTRIBUTION_CONFIGURATION_KEY = "CONTRIBUTION_CONFIGURATION";

    /** identifier for the default configuration. */
    public static final String DEFAULT_CONFIGURATION_KEY = "DEFAULT_CONFIGURATION";
    /** message string for delete boxes. */
    public static final String DELETE_QUESTION = "Are you sure that you want to delete ";

    /** identifier for an editor. */
    public static final String EDITOR_NAME = "EDITOR";
    /** identifier for the list of editors. */
    public static final String EDITOR_IDS_KEY = "EDITOR_IDS";
    /** identifier for the editor name. */
    public static final String EDITOR_NAME_NAME = "EDITOR_NAME";
    /** identifier for the editor id. */
    public static final String EDITOR_ID_NAME = "EDITOR_ID";

    /** identifier for the list of ignored keys. */
    public static final String IGNORED_KEYS_KEY = "IGNORED_KEYS";
    /** the tooltip for the always use defaults dialog. */
    public static final String IGNORED_KEYS_BUTTON_TOOLTIP = "A dialog where "
            + "you can select those properties\n where the default value of the property should "
            + "be used\n rather than the one saved in the configuration of each schedule.";

    /** identifier for the summary message combo. */
    public static final String IS_SUMMARYMESSAGE_NAME = "IS_SUMMARY_MESSAGE_DISABLED";
    /** identifier for the recent combo. */
    public static final String IS_RECENT_VISIBLE_NAME = "IS_RECENT_VISIBLE";
    /** identifier for the matching combo. */
    public static final String IS_MATCHING_VISIBLE_NAME = "IS_MATCHING_VISIBLE";
    /** identifier for the advanced mode property. */
    public static final String IS_ADVANCED_NAME = "IS_ADVANCED_ENABLED";

    /** identifier for the location of a file. */
    public static final String LOCATION_NAME = "LOCATION";

    /** identifier for the list of most recently used schedules. */
    public static final String MOST_RECENT_SCHEDULES_KEY = "MOST_RECENT_SCHEDULES";

    /** the name for configuration component. */
    public static final String CONFIG_DATA_COMPONENT_NAME = "CONFIG_DATA_COMP";

    /** the plugin id for configuration component. */
    public static final String CONFIG_DATA_PLUGIN_ID = "CONFIG_PLUGIN_ID";

    /** the name for a property. */
    public static final String PROPERTY_NAME = "KIEM_PROPERTY";
    /** the name for a property value. */
    public static final String PROPERTY_VALUE_NAME = "Value";
    /** the hint for the property value field. */
    public static final String PROPERTY_VALUE_HINT = "The "
            + PROPERTY_VALUE_NAME + " of a property.";
    /** the name for a property key. */
    public static final String PROPERTY_KEY_NAME = "Key";
    /** An error message showing that the key can't be null. */
    public static final String PROPERTY_KEY_CANT_BE_NULL = PROPERTY_KEY_NAME
            + " can't be null.";
    /** the hint for the property key field. */
    public static final String PROPERTY_KEY_HINT = "The " + PROPERTY_KEY_NAME
            + " of a property. Has to be non-null and unique.";

    /** identifier for the schedule configuration. */
    public static final String SCHEDULE_CONFIGURATION_KEY = "SCHEDULE_CONFIGURATION";
    /** identifier for a single scheduling data. */
    public static final String SCHEDULE_DATA_NAME = "SCHEDULE_DATA";

    /** the title of warning dialogs. */
    public static final String WARNING_TITLE = "Warning!";

    // --------------------------------------------------------------------------

    /**
     * Do nothing.
     */
    private Tools() {

    }

    // --------------------------------------------------------------------------

    /**
     * Constructs an info message about restart.
     * 
     * @param attribute
     *            the attribute that was changed.
     * @return the info message.
     */
    public static String getRestartMessage(final String attribute) {
        String result = "You have to restart " + APPLICATION_NAME;
        result += " for changes to " + attribute;
        result += " to take effect.";
        result += " Restart now?";
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Get the humanly readable label for one of the keys.
     * 
     * @param key
     *            the key to look for.
     * @return a label or the key itself if no label was found.
     */
    public static String getLabelFor(final String key) {
        KiemPropertyKeyWrapper wrapper = new KiemPropertyKeyWrapper(key);
        if (AIMED_STEP_DURATION_KEY.equals(wrapper)) {
            return "Step duration (ms)";
        }
        if (TIMEOUT_KEY.equals(wrapper)) {
            return "DataComponent timeout (ms)";
        }
        if (DEFAULT_PRIORITY_KEY.equals(wrapper)) {
            return "Default schedule priority";
        }
        if (RECENT_CAPACITY_KEY.equals(wrapper)) {
            return "Recent list capacity";
        }
        return key;
    }

    /**
     * Get a tooltip text for the element with the specified key.
     * 
     * @param key
     *            the key to look for.
     * @return the tooltip text.
     */
    public static String getTooltipFor(final String key) {
        KiemPropertyKeyWrapper wrapper = new KiemPropertyKeyWrapper(key);
        if (AIMED_STEP_DURATION_KEY.equals(wrapper)) {
            // get hint from KiemPlugin, same as the box in the toolbar
            return Messages.mDurationTextFieldHint;
        }
        if (RECENT_CAPACITY_KEY.equals(wrapper)) {
            return "The maximum capacity of the recent schedules combo box.";
        }
        if (DEFAULT_PRIORITY_KEY.equals(wrapper)) {
            return "The priority assigned to new schedules on creation.";
        }
        if (TIMEOUT_KEY.equals(wrapper)) {
            return "The timeout for the DataComponents during execution.";
        }
        return "";
    }

    // --------------------------------------------------------------------------

    /**
     * Converts an array to a list.
     * 
     * @param array
     *            the array to convert
     * @return the resulting list
     * @param <T>
     *            the type of the list
     */
    public static <T> List<T> arrayToList(final T[] array) {
        if (array == null) {
            return null;
        }
        List<T> result = new ArrayList<T>();
        for (T t : array) {
            result.add(t);
        }
        return result;
    }

    /**
     * Convert a list to a KiemProperty array.
     * 
     * @param list
     *            the list to convert.
     * @return the resulting array.
     */
    public static KiemProperty[] listToKiemPropertyArray(
            final List<KiemProperty> list) {
        return list.toArray(new KiemProperty[list.size()]);
    }

    /**
     * Removes an element from an array.
     * 
     * @param <Type>
     *            the type of the array
     * @param array
     *            the array
     * @param index
     *            the index to be removed
     * @return the resulting array
     */
    public static <Type> Type[] removeFromArray(final Type[] array,
            final int index) {
        if (array != null && index > 0 && index < array.length) {
            List<Type> list = Tools.arrayToList(array);
            list.remove(index);
            return list.toArray(array);
        }
        return array;
    }

    // --------------------------------------------------------------------------

    /**
     * Display an error dialog with a message.
     * 
     * @param message
     *            the message to display.
     * @param shell
     *            the parent shell.
     */
    public static void showErrorDialog(final String message, final Shell shell) {
        MessageDialog.openError(shell, "Error!", message);
    }

    /**
     * Display an error dialog with a message.
     * 
     * @param e0
     *            the exception that should be printed.
     * @param shell
     *            the parent shell.
     */
    public static void showErrorWithStackTrace(final RuntimeException e0,
            final Shell shell) {
        ListDialog dialog = new ListDialog(shell);
        dialog.setTitle("Error!");
        dialog.setMessage("Ooops, your machine seems to be broken..."
                + e0.toString());
        dialog.setInput(e0.getStackTrace());
        StackTraceListProvider provider = new StackTraceListProvider();
        dialog.setContentProvider(provider);
        dialog.setLabelProvider(provider);
        dialog.open();
    }

    // --------------------------------------------------------------------------

    /**
     * {@link KiemPlugin#showWarning(String, String, Exception, boolean)}.
     * 
     * @param textMessage
     *            the message explaining the error.
     * @param exception
     *            the exception causing the error.
     * @param silent
     *            true if a message box should be displayed.
     */
    public static void showWarning(final String textMessage,
            final Exception exception, final boolean silent) {
        KiemPlugin.getDefault().showWarning(textMessage,
                KiemConfigurationPlugin.PLUGIN_ID, exception, silent);
    }

    /**
     * Shows a silent warning in the main KIEMPlugin to notify<BR>
     * the user that one of the KiemProperties couldn't be parsed.
     * 
     * @param string
     *            the key of the property that has no value
     */
    public static void showParseWarningMissingPropertyAttributes(
            final String string) {
        String message = "Could not parse a KiemProperty. ";
        message += "Missing second attribute for " + string;
        showWarning(message, null, true);
    }

    /**
     * Shows a silent warning in the main KIEMPlugin to notify<BR>
     * the user that one of the EditorDefinitions couldn't be parsed.
     * 
     * @param string
     *            the key of the property that has no value
     */
    public static void showParseWarningMissingEditorAttributes(
            final String string) {
        String message = "Could not parse an EditorDefinition. ";
        message += "Missing second attribute for " + string;
        showWarning(message, null, true);
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Construct the starting tag from a given key.
     * 
     * @param key
     *            the key
     * @return the tag
     */
    private static String startKey(final String key) {
        return "<" + key + ">";
    }

    /**
     * Construct the ending tag from a given key.
     * 
     * @param key
     *            the key
     * @return the tag
     */
    private static String endKey(final String key) {
        return "</" + key + ">";
    }

    /**
     * Create a string with start and end tags.
     * 
     * @param key
     *            the key of the property
     * @param value
     *            the value of the property
     * @return the value enclosed in tags
     */
    public static String putValue(final String key, final String value) {
        if (key != null && value != null) {
            return startKey(key) + value + endKey(key);
        }
        return "";
    }

    /**
     * Convenience method for creating the string for a property.
     * 
     * @param prop
     *            the property
     * @return the string
     */
    public static String putProperty(final KiemProperty prop) {
        String keyString = putValue(Tools.PROPERTY_KEY_NAME, prop.getKey());
        String valueString = putValue(Tools.PROPERTY_VALUE_NAME, prop
                .getValue());
        return putValue(Tools.PROPERTY_NAME, keyString + valueString);
    }

    // --------------------------------------------------------------------------

    /**
     * Get a value from an input string.
     * 
     * @param key
     *            the key to look for.
     * @param input
     *            the input string
     * @return the value or null
     */
    public static String getValue(final String key, final String input) {

        if (input != null && input.contains(startKey(key))) {
            int start = input.indexOf(startKey(key));
            int end = input.lastIndexOf(endKey(key));
            StringBuilder withTags = new StringBuilder(input.substring(start,
                    end + endKey(key).length()));

            withTags = withTags
                    .delete(withTags.length() - endKey(key).length(), withTags
                            .length());

            withTags = withTags.delete(0, startKey(key).length());

            return withTags.toString();
        }
        return null;
    }

    /**
     * Get a list of values from an input string.
     * 
     * @param key
     *            the key to look for each individual element in the list
     * @param input
     *            the input string
     * @return the value or null
     */
    public static String[] getValueList(final String key, final String input) {

        List<String> results = new LinkedList<String>();
        StringBuilder remaining = null;

        if (input != null && input.length() > 0) {
            remaining = new StringBuilder(input);

            while (remaining.toString().contains(startKey(key))) {

                int start = remaining.indexOf(startKey(key));
                int end = remaining.indexOf(endKey(key));
                StringBuilder withTags = new StringBuilder(remaining.substring(
                        start, end + endKey(key).length()));

                remaining.delete(start, end + endKey(key).length());

                withTags = withTags.delete(withTags.length()
                        - endKey(key).length(), withTags.length());

                withTags = withTags.delete(0, startKey(key).length());

                results.add(withTags.toString());
            }
        }
        if (results.isEmpty()) {
            return null;
        }
        return results.toArray(new String[results.size()]);
    }

    /**
     * Convenience method for parsing a property key and value and constructing
     * a KiemProperty from it.
     * 
     * @param input
     *            the input string
     * @return the KiemProperty or null
     */
    public static KiemProperty getKiemProperty(final String input) {
        KiemProperty result = null;
        String keyString = getValue(Tools.PROPERTY_KEY_NAME, input);
        String valueString = getValue(Tools.PROPERTY_VALUE_NAME, input);
        if (keyString != null) {
            result = new KiemProperty(keyString, valueString);
        }
        return result;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Provider for the error dialog.
     * 
     * @author soh
     * @kieler.rating 2010-01-27 proposed yellow
     */
    private static class StackTraceListProvider implements
            IStructuredContentProvider, ILabelProvider {

        /**
         * {@inheritDoc}
         */
        public Object[] getElements(final Object inputElement) {
            if (inputElement instanceof StackTraceElement[]) {
                return (StackTraceElement[]) inputElement;
            }
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public void dispose() {
        }

        /**
         * {@inheritDoc}
         */
        public void inputChanged(final Viewer viewer, final Object oldInput,
                final Object newInput) {
        }

        /**
         * {@inheritDoc}
         */
        public Image getImage(final Object element) {
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public String getText(final Object element) {
            return element.toString();
        }

        /**
         * {@inheritDoc}
         */
        public void addListener(final ILabelProviderListener listener) {
        }

        /**
         * {@inheritDoc}
         */
        public boolean isLabelProperty(final Object element,
                final String property) {
            return false;
        }

        /**
         * {@inheritDoc}
         */
        public void removeListener(final ILabelProviderListener listener) {
        }

    }
}
