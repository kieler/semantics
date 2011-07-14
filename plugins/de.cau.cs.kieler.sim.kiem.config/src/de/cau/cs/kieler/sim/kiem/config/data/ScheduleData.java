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

package de.cau.cs.kieler.sim.kiem.config.data;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import de.cau.cs.kieler.sim.kiem.config.exception.KiemParserException;
import de.cau.cs.kieler.sim.kiem.config.managers.ConfigurationManager;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * Holds all data needed to manage a specific schedule.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class ScheduleData {

    /** default priority on schedule creation. */
    public static final int DEFAULT_PRIORITY = 5;

    /** The minimum priority of supported editors. */
    public static final int MIN_PRIORITY = 0;

    /** Location of the schedule on disc. */
    private IPath location;

    /** ID of the contribution plug-in. */
    private String pluginId;

    /** Holds editor ids and non-negative priority. */
    private ConfigDataComponent priorities = new ConfigDataComponent(false);

    // --------------------------------------------------------------------------

    /**
     * Create a new Scheduling data.
     * 
     * @param newLocation
     *            the new id and location
     */
    public ScheduleData(final IPath newLocation) {
        this.location = newLocation;
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the id.
     * 
     * @return the id
     */
    public String getId() {
        return this.location.toOSString();
    }

    /**
     * Getter for the location.
     * 
     * @return the location
     */
    public IPath getLocation() {
        return this.location;
    }

    /**
     * Determines whether this schedule is an imported one and thus should not
     * be removed or changed.
     * 
     * @return true if the schedule was imported
     */
    public boolean isLocked() {
        return getLocation().toOSString().contains("bundleentry:");
    }

    // --------------------------------------------------------------------------

    /**
     * Setter for the pluginId.
     * 
     * @param pluginIdParam
     *            the pluginId to set
     */
    public void setPluginId(final String pluginIdParam) {
        this.pluginId = pluginIdParam;
    }

    /**
     * Getter for the pluginId.
     * 
     * @return the pluginId
     */
    public String getPluginId() {
        return pluginId;
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for a user friendly name.
     * 
     * @return filename[project name]
     */
    public String getName() {
        return getName(location);
    }

    /**
     * Create a new name from an IPath object.
     * 
     * @param newLocation
     *            the location of the .execution file
     * @return filename[project name]
     */
    private String getName(final IPath newLocation) {
        String result = "";
        String[] segments = newLocation.removeFileExtension().segments();
        result += segments[segments.length - 1];
        if (newLocation.toOSString().startsWith("bundleentry")) {
            result += "[IMPORTED]";
        } else {
            result += "[" + segments[0] + "]";
        }
        return result;
    }

    /**
     * Creates a short version of the name.
     * 
     * @return filename
     */
    public String getShortName() {
        String result = "";
        String[] segments = location.removeFileExtension().segments();
        result += segments[segments.length - 1];
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Get the supported priority of the given editor.
     * <p>
     * The priority indicates the usefulness of a schedule for a given editor
     * type.
     * </p>
     * 
     * @param editorId
     *            the id of the editor to look for
     * @return the supported priority of the given editor.
     */
    public int getSupportedPriority(final EditorIdWrapper editorId) {
        int result = MIN_PRIORITY;
        try {
            result = Integer.parseInt(priorities.findPropertyValue(editorId));
        } catch (NumberFormatException e0) {
            // saved property is not an integer, use MIN_PRIORITY
        } catch (KiemPropertyException e0) {
            // not found, use MIN_PRIORITY
        }
        return result;
    }

    /**
     * Set the supported priority of the given editor.
     * <p>
     * The priority indicates the usefulness of a schedule for a given editor
     * type.
     * </p>
     * 
     * @param editorId
     *            the editor id to change.
     * @param newPriority
     *            the new priority of the editor.
     */
    public void setEditorSupport(final EditorIdWrapper editorId,
            final int newPriority) {
        priorities.updateProperty(editorId, newPriority + "");
    }

    /**
     * Set the location of the schedule.
     * 
     * @param locationParam
     *            the new location
     */
    public void setLocation(final IPath locationParam) {
        this.location = locationParam;
    }

    // --------------------------------------------------------------------------

    /**
     * Parses a ScheduleData object from an input String that was constructed
     * with the toString() method.
     * 
     * @param input
     *            the input string.
     * @return the parsed object.
     * @throws KiemParserException
     *             if the input is empty
     */
    public static ScheduleData fromString(final String input)
            throws KiemParserException {
        ScheduleData result = null;
        if (input != null) {
            String locationString = Tools.getValue(Tools.LOCATION_NAME, input);
            String prioritiesString = Tools.getValue(
                    Tools.CONFIG_DATA_COMPONENT_NAME, input);
            String pluginIdString = Tools.getValue(
                    Tools.CONFIG_DATA_PLUGIN_ID, input);

            if (locationString == null) {
                throw new KiemParserException(input, "Location");
            }

            result = new ScheduleData(Path.fromOSString(locationString));
            if (prioritiesString != null) {
                result.priorities = ConfigDataComponent
                        .fromString(prioritiesString);
            }
            if (pluginIdString != null) {
                result.setPluginId(pluginIdString);
            }
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        String locationString = Tools.putValue(Tools.LOCATION_NAME, location
                .toOSString());
        String prioritiesString = Tools.putValue(
                Tools.CONFIG_DATA_COMPONENT_NAME, priorities.toString());
        String pluginIdString = Tools.putValue(
                Tools.CONFIG_DATA_PLUGIN_ID, pluginId);
        return locationString + prioritiesString + pluginIdString;
    }

    // --------------------------------------------------------------------------

    /**
     * Remove an editor from the list of supported priorities.
     * 
     * @param editorId
     *            The id of the editor to remove.
     */
    public void removeEditor(final EditorIdWrapper editorId) {
        priorities.removeProperty(editorId);
    }

    // --------------------------------------------------------------------------

    /**
     * Returns the default priority. Either stored or hard coded.
     * 
     * @return the default priority.
     */
    public static int getDefaultPriority() {
        int result = DEFAULT_PRIORITY;
        try {
            result = Integer.parseInt(ConfigurationManager.getInstance()
                    .findPropertyValue(Tools.DEFAULT_PRIORITY_KEY,
                            DEFAULT_PRIORITY + ""));
        } catch (NumberFormatException e0) {
            // do nothing, keep default
        } catch (KiemPropertyException e0) {
            // can't happen, do nothing
        }
        return result;
    }

}
