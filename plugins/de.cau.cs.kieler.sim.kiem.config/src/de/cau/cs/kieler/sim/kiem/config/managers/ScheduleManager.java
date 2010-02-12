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

package de.cau.cs.kieler.sim.kiem.config.managers;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ltk.core.refactoring.RefactoringCore;
import org.eclipse.ltk.core.refactoring.RefactoringDescriptor;
import org.eclipse.ltk.core.refactoring.history.IRefactoringHistoryListener;
import org.eclipse.ltk.core.refactoring.history.RefactoringHistoryEvent;
import org.eclipse.ltk.core.refactoring.resource.DeleteResourcesDescriptor;
import org.eclipse.ltk.core.refactoring.resource.MoveResourcesDescriptor;
import org.eclipse.ltk.core.refactoring.resource.RenameResourceDescriptor;
import org.eclipse.ui.IEditorSite;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.KiemConfigurationPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.EditorDefinition;
import de.cau.cs.kieler.sim.kiem.config.data.EditorIdWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.KiemConfigEvent;
import de.cau.cs.kieler.sim.kiem.config.data.MostRecentCollection;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.config.exception.KiemParserException;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;
import de.cau.cs.kieler.sim.kiem.config.extension.KiemEventListener;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * Manages all data for the scheduling preferences.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public final class ScheduleManager extends AbstractManager implements
        IRefactoringHistoryListener {

    /** the default capacity for the recent list. */
    public static final int DEFAULT_RECENT_CAPACITY = 5;

    /** The singleton instance for this manager. */
    private static ScheduleManager instance = null;

    /** The list of most recently used schedules. */
    private MostRecentCollection<String> recentScheduleIds = null;

    /** The list of all saved schedules. */
    private List<ScheduleData> scheduleData = null;

    // --------------------------------------------------------------------------

    /** Singleton pattern. */
    private ScheduleManager() {
        super();
        RefactoringCore.getHistoryService().addHistoryListener(this);
    }

    // --------------------------------------------------------------------------

    /**
     * Returns the singleton instance of this manager.
     * 
     * @return the instance.
     */
    public static synchronized ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Getter for the list of schedules that were imported through the extension
     * point.
     * 
     * @return the list of imported schedules.
     */
    public List<ScheduleData> getImportedSchedules() {
        List<ScheduleData> result = new LinkedList<ScheduleData>();

        for (ScheduleData schedule : getAllSchedules()) {
            if (schedule.isLocked()) {
                result.add(schedule);
            }
        }

        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Get the list of all schedules that apply to the current editorID.
     * <p>
     * The list is sorted by the supported priority for the matching editor. The
     * best schedules have the lowest index to appear at the top of any list.
     * 
     * @param editorID
     *            the ID to look for.
     * @param editorName
     *            the name of the editor if the editor hasn't been added yet
     * @return the list of applicable schedules.
     */
    public List<ScheduleData> getMatchingSchedules(
            final EditorIdWrapper editorID, final String editorName) {
        List<ScheduleData> result = new LinkedList<ScheduleData>();

        if (!EditorManager.getInstance().getEditors().isEmpty()) {
            EditorDefinition matchingEditor = EditorManager.getInstance()
                    .findEditorById(editorID);

            if (matchingEditor == null) {
                // create and add the new editor
                matchingEditor = new EditorDefinition(editorName, editorID);
                EditorManager.getInstance().addEditor(matchingEditor);
            }

            for (ScheduleData data : getAllSchedules()) {
                // only add schedules that have a positive priority
                if (data.getSupportedPriority(editorID) > ScheduleData.MIN_PRIORITY) {
                    result.add(data);
                }
            }

            // sort by matching editor
            Collections.sort(result, new ScheduleComparator(matchingEditor));
        }
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Get the list of Ids of the most recently used schedules.
     * 
     * @return the list
     */
    public MostRecentCollection<String> getRecentScheduleIds() {
        loadMostRecentlyUsedSchedules();
        return recentScheduleIds;
    }

    // --------------------------------------------------------------------------

    /**
     * Get the list of most recently used schedules.
     * 
     * @return the list of most recently used schedules.
     */
    public List<ScheduleData> getRecentSchedules() {
        List<ScheduleData> result = new LinkedList<ScheduleData>();

        Iterator<String> iterator = getRecentScheduleIds().iterator();
        // try to find the schedules matching the list of ids
        while (iterator.hasNext()) {
            ScheduleData data = getScheduleData(iterator.next());
            if (data != null) {
                result.add(data);
            } else {
                iterator.remove();
            }

        }
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the list of all schedules.
     * 
     * @return the list of all saved schedules.
     */
    public List<ScheduleData> getAllSchedules() {
        loadSchedules();
        return scheduleData;
    }

    /**
     * Get the schedule data with the specified path.
     * 
     * @param location
     *            the location of the data
     * @return the data that was found or null
     */
    private ScheduleData getScheduleData(final IPath location) {
        ScheduleData result = null;

        if (location != null) {

            for (ScheduleData data : getAllSchedules()) {

                if (data != null && location.equals(data.getLocation())) {
                    result = data;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Try to find the schedule data with the specified id.
     * 
     * @param id
     *            the scheduleID to look for.
     * @return the found schedule data, may be null
     */
    public ScheduleData getScheduleData(final String id) {
        ScheduleData result = null;

        for (ScheduleData data : getAllSchedules()) {

            if (data != null && data.getId().equals(id)) {
                result = data;
                break;
            }
        }
        return result;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void historyNotification(final RefactoringHistoryEvent event) {

        RefactoringDescriptor desc = event.getDescriptor().requestDescriptor(
                null);

        if (desc instanceof RenameResourceDescriptor) {
            RenameResourceDescriptor renameDesc = (RenameResourceDescriptor) desc;
            renameSchedule(renameDesc);
        }

        if (desc instanceof DeleteResourcesDescriptor) {
            DeleteResourcesDescriptor deleteDesc = (DeleteResourcesDescriptor) desc;
            deleteSchedule(deleteDesc);
        }

        if (desc instanceof MoveResourcesDescriptor) {
            MoveResourcesDescriptor moveDesc = (MoveResourcesDescriptor) desc;
            moveSchedule(moveDesc);
        }

        notifyListeners(new KiemConfigEvent(
                KiemConfigEvent.FILE_LOCATION_CHANGED));

        KiemPlugin.getDefault().getKIEMViewInstance().updateViewAsync();
        save();
    }

    // --------------------------------------------------------------------------

    /**
     * Try to track a deletion and remove the affected schedule.
     * 
     * @param deleteDesc
     *            the deletion descriptor
     */
    private void deleteSchedule(final DeleteResourcesDescriptor deleteDesc) {
        IPath[] locations = deleteDesc.getResourcePaths();

        for (IPath path : locations) {
            ScheduleData schedule = getScheduleData(path);

            if (schedule != null) {
                removeSchedule(schedule);
            }
        }
    }

    /**
     * Try to track the move of a number of schedules.
     * 
     * @param moveDesc
     *            the move descriptor
     */
    private void moveSchedule(final MoveResourcesDescriptor moveDesc) {
        IPath[] src = moveDesc.getResourcePathsToMove();
        IPath dest = moveDesc.getDestinationPath();

        for (IPath path : src) {
            ScheduleData schedule = getScheduleData(path);

            if (schedule != null) {
                IPath srcName = path.removeFileExtension();
                String name = srcName.segment(srcName.segmentCount() - 1);

                name = dest.toOSString() + IPath.SEPARATOR + name
                        + ".execution";

                updateScheduleLocation(schedule, name);

            }
        }
    }

    /**
     * Try to update the location of a moved schedule.
     * 
     * @param renameDesc
     *            the renaming descriptor
     */
    private void renameSchedule(final RenameResourceDescriptor renameDesc) {
        // get the location of the renamed resource and try to find a
        // schedule for it
        IPath location = renameDesc.getResourcePath();
        String newName = renameDesc.getNewName();
        ScheduleData schedule = getScheduleData(location);

        if (schedule != null) {
            String newPath = schedule.getLocation().removeFileExtension()
                    .removeLastSegments(1).addTrailingSeparator().toOSString()
                    + newName;

            updateScheduleLocation(schedule, newPath);
        }
    }

    /**
     * Update the location of the schedule and the contents of the most recently
     * used list.
     * 
     * @param schedule
     *            the schedule to update
     * @param newLocation
     *            the new location as OSString
     */
    private void updateScheduleLocation(final ScheduleData schedule,
            final String newLocation) {
        IPath destination = Path.fromOSString(newLocation);

        String oldId = schedule.getId();

        schedule.setLocation(destination);

        getRecentScheduleIds().replace(oldId, schedule.getId());
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Create a new schedule.
     * <p>
     * First the method checks if the editor is already in the list of currently
     * available editors. If not the new editor is created and added to that
     * list.
     * <p>
     * After that the new Schedule is created and the default priority assigned
     * to the editor that the schedule was first used with.
     * 
     * @param editor
     *            the editor that created the schedule.
     * @param location
     *            the save location of the schedule.
     * @param priority
     *            the priority to assign to the editor
     * @return the added schedule, or null if no schedule was added.
     */
    public ScheduleData addSchedule(final EditorDefinition editor,
            final IPath location, final int priority) {

        EditorManager.getInstance().addEditor(editor);

        ScheduleData result = getScheduleData(location);

        if (result == null) {
            result = new ScheduleData(location);
            scheduleData.add(result);
        }

        // schedule already exists and has minimum priority, set default
        // priority
        if (result.getSupportedPriority(editor.getEditorId()) <= ScheduleData.MIN_PRIORITY) {
            result.setEditorSupport(editor.getEditorId(), priority);
        }

        save();
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Remove a schedule from the list.
     * 
     * @param schedule
     *            the schedule to be removed
     */
    public void removeSchedule(final ScheduleData schedule) {
        getAllSchedules().remove(schedule);
        // remove id from recent ids
        getRecentScheduleIds().remove(schedule.getId());
        // notify listeners of deletion
        notifyListeners(new KiemConfigEvent(KiemConfigEvent.DELETED, schedule));
    }

    /**
     * Remove a schedule with a specific key.
     * 
     * @param scheduleId
     *            the scheduleID to look for.
     */
    public void removeSchedule(final String scheduleId) {

        Iterator<ScheduleData> iterator = getAllSchedules().iterator();
        while (iterator.hasNext()) {
            ScheduleData data = iterator.next();
            if (data.getId().equals(scheduleId)) {
                removeSchedule(data);
                break;
            }
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Update a schedule or create a new one.
     * 
     * @param location
     *            the location to look for.
     */
    private void updateSchedule(final IPath location) {
        // try to find an existing schedule
        ScheduleData match = getScheduleData(location);

        if (match == null) {
            EditorIdWrapper editorId = null;
            String editorName = null;
            EditorDefinition matchingEditor = null;

            // try to get the editor from workbench
            IEditorSite editorSite = KiemConfigurationPlugin.getDefault()
                    .getActiveEditor();

            if (editorSite != null) {
                editorId = new EditorIdWrapper(editorSite.getId());
                editorName = editorSite.getRegisteredName();
            }

            if (editorId == null) {
                editorId = EditorManager.getInstance().getDefaultEditorId();
                editorName = EditorManager.getInstance().getDefaultEditorName();
            }

            // try to find an editor with the id
            matchingEditor = EditorManager.getInstance().findEditorById(
                    editorId);

            if (matchingEditor == null) {
                // create a new editor
                EditorDefinition editor = new EditorDefinition(editorName,
                        editorId);
                EditorManager.getInstance().addEditor(editor);
                matchingEditor = editor;
            }

            match = addSchedule(matchingEditor, location, ScheduleData
                    .getDefaultPriority());

        }

        if (match != null) {
            // add the schedule to the list of recently used schedules
            getRecentScheduleIds().add(match.getId());
            save();
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Load a schedule from the file system into the plugin. If the editor is
     * dirty a save is triggered. Then the plugin tries to load the .execution
     * file through the method provided by the main KIEM plugin. If that method
     * fails because the file is no longer at the saved location an Exception is
     * thrown to inform the loader. It is suggested that in this case the faulty
     * schedule should either be removed or the location updated and the load
     * tried again.
     * <p>
     * This method can be called from another plug-in and is part of the KIEM
     * Configurations API.
     * 
     * @param schedule
     *            the schedule data to load.
     * @throws ScheduleFileMissingException
     *             if the location in the schedule is no longer valid
     */
    public void loadSchedule(final ScheduleData schedule)
            throws ScheduleFileMissingException {

        KiemEventListener.getInstance().setLoadImminent();
        try {
            KiemPlugin.getDefault().openFile(schedule.getLocation(),
                    schedule.isLocked());
        } catch (IOException e0) {
            // loading failed due to missing .execution file
            throw new ScheduleFileMissingException(e0, schedule);
        } catch (IllegalArgumentException e0) {
            // file not in workspace
            throw new ScheduleFileMissingException(e0, schedule);
        }

        // loading successful
        getRecentScheduleIds().add(schedule.getId());
        notifyListeners(new KiemConfigEvent(KiemConfigEvent.FILE_LOADED,
                schedule.getLocation()));
    }

    // --------------------------------------------------------------------------

    /**
     * Notify the manager that the user triggered a save. The manager gathers
     * all information needed to create a new schedule and adds that schedule to
     * the list.
     * 
     * @param location
     *            the location where the file was saved.
     */
    public void userSaved(final IPath location) {
        updateSchedule(location);
        notifyListeners(new KiemConfigEvent(KiemConfigEvent.FILE_SAVED, this));
    }

    /**
     * Notify the manager that the user triggered a load. The manager gathers
     * all information needed to create a new schedule and adds that schedule to
     * the list.
     * 
     * @param location
     *            the location where the file was loaded from.
     */
    public void userLoaded(final IPath location) {
        updateSchedule(location);
        notifyListeners(new KiemConfigEvent(KiemConfigEvent.FILE_LOADED, this));
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Load the list of most recently used schedules from the Eclipse Preference
     * Store.
     */
    private void loadMostRecentlyUsedSchedules() {
        if (recentScheduleIds == null) {
            int capacity = DEFAULT_RECENT_CAPACITY;

            try {
                capacity = Integer.parseInt(ConfigurationManager.getInstance()
                        .findPropertyValue(Tools.RECENT_CAPACITY_KEY,
                                DEFAULT_RECENT_CAPACITY + ""));
            } catch (NumberFormatException e0) {
                // not a number in stored preferences, keep default
            } catch (KiemPropertyException e0) {
                // property missing, keep default
            }

            recentScheduleIds = new MostRecentCollection<String>(capacity);

            String input = super.load(Tools.MOST_RECENT_SCHEDULES_KEY, null);

            if (input != null) {
                String[] array = Tools.getValueList(Tools.LOCATION_NAME, input);
                if (array != null) {
                    for (String s : array) {
                        if (s != null) {
                            recentScheduleIds.add(s);
                        }
                    }
                }
            }
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Load all schedules from the Eclipse Preference Store.
     */
    private void loadSchedules() {
        if (scheduleData == null) {
            scheduleData = new LinkedList<ScheduleData>();

            loadFromPrefStore();
            loadFromExtensionPoint();
        }
    }

    /**
     * Load the schedules from the extension point.
     */
    private void loadFromExtensionPoint() {
        IConfigurationElement[] contributors = Platform
                .getExtensionRegistry()
                .getConfigurationElementsFor(
                        "de.cau.cs.kieler.sim.kiem.config.DefaultScheduleContributor");

        for (IConfigurationElement element : contributors) {
            if (element.isValid()) {
                try {
                    // get information from extension point
                    String fileName = element.getAttribute("file");

                    IPath location = Path.fromOSString(fileName);
                    // convert path into the desired format
                    Bundle bundle = Platform.getBundle(element.getContributor()
                            .getName());
                    URL url = FileLocator.find(bundle, location, null);

                    if (url != null) {
                        IPath path = Path.fromOSString(url.toString());

                        if (path.toOSString().startsWith("bundleentry:/")) {
                            // test if the file is valid before adding it
                            try {
                                String urlPath = path.toOSString()
                                        .replaceFirst("bundleentry:/",
                                                "bundleentry://");
                                URL pathUrl = new URL(urlPath);

                                InputStream inputStream = pathUrl.openStream();
                                inputStream.close();
                            } catch (IOException e0) {
                                // file not found, don't add
                                throw new ScheduleFileMissingException(e0, path);
                            }
                        }

                        IConfigurationElement[] children = element
                                .getChildren();

                        if (children != null && children.length > 0) {

                            for (IConfigurationElement child : children) {
                                String editorId = child
                                        .getAttribute("editorId");
                                String editorPriority = child
                                        .getAttribute("editorPriority");
                                String editorName = child
                                        .getAttribute("editorName");

                                if (editorId != null && !editorId.equals("")) {
                                    int priority = Integer
                                            .parseInt(editorPriority);
                                    EditorIdWrapper wrapper = new EditorIdWrapper(
                                            editorId);

                                    // add the editor and schedule
                                    EditorDefinition editor = EditorManager
                                            .getInstance()
                                            .addEditor(
                                                    new EditorDefinition(
                                                            editorName, wrapper));
                                    editor.setLocked(true);
                                    addSchedule(editor, path, priority);
                                }
                            }
                        }
                    }
                } catch (NumberFormatException e0) {
                    // not a number in editorId, ignore this extension
                } catch (ScheduleFileMissingException e0) {
                    // editor file is not there anymore, ignored this extension
                }
            }
        }
    }

    /**
     * Load the schedules from the preference store.
     */
    private void loadFromPrefStore() {
        String input = super.load(Tools.SCHEDULE_CONFIGURATION_KEY, null);
        if (input != null) {
            String[] array = Tools
                    .getValueList(Tools.SCHEDULE_DATA_NAME, input);
            if (array != null) {
                for (String s : array) {
                    if (s != null && !s.contains("bundleentry:")) {
                        try {
                            scheduleData.add(ScheduleData.fromString(s));
                        } catch (KiemParserException e0) {
                            // can't parse, skip to next
                        }
                    }
                }
            }
        }
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void load() {
        loadMostRecentlyUsedSchedules();
        loadSchedules();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void save() {

        // save the schedules
        if (!getAllSchedules().isEmpty()) {
            StringBuilder builder = new StringBuilder();
            for (ScheduleData data : scheduleData) {
                if (!data.getId().contains("bundleentry:")) {
                    builder.append(Tools.putValue(Tools.SCHEDULE_DATA_NAME,
                            data.toString()));
                }
            }
            super.save(Tools.SCHEDULE_CONFIGURATION_KEY, builder.toString());
        } else {
            super.remove(Tools.SCHEDULE_CONFIGURATION_KEY);
        }

        // save the list of most recently used schedules
        if (!getRecentScheduleIds().isEmpty()) {
            StringBuilder builder = new StringBuilder();
            for (String id : recentScheduleIds) {
                builder.append(Tools.putValue(Tools.LOCATION_NAME, id));
            }
            super.save(Tools.MOST_RECENT_SCHEDULES_KEY, builder.toString());
        } else {
            super.remove(Tools.MOST_RECENT_SCHEDULES_KEY);
        }

        // trigger a save in the editor manager to prevent inconsistencies
        EditorManager.getInstance().save();
    }

    // --------------------------------------------------------------------------
}
