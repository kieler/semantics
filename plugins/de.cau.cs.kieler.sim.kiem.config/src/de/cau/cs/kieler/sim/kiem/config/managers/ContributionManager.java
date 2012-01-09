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
package de.cau.cs.kieler.sim.kiem.config.managers;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.action.ControlContribution;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.config.ui.ScheduleSelector;

/**
 * Holds both combo boxes for selecting a configuration.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public final class ContributionManager extends AbstractManager {

    /** The Singleton instance of this manager. */
    private static ContributionManager instance = null;

    /**
     * the selector should use the list of matching schedules ordered by
     * priority.
     */
    public static final int MATCHING_COMBO = 1;

    /** the selector should use the list of most recently used schedules. */
    public static final int RECENT_COMBO = 0;

    /** true if the matching combo should be visible, false if not. */
    private boolean isMatchingVisible = true;

    /** true if the plugin is running in advanced mode. */
    private boolean isInAdvancedMode = false;

    /** true if the plugin will not display the execution summary message. */
    private boolean isSummaryMessageDisabled = false;

    /** true if the recent combo should be visible, false if not. */
    private boolean isRecentVisible = true;

    /** true if a configuration was already loaded from store, false if not. */
    private boolean loaded = false;

    /**
     * combo box holding the schedule Ids matching the currently selected
     * editor.
     */
    private ScheduleSelector matchingCombo;

    /** combo box holding the most recent schedule Ids. */
    private ScheduleSelector recentCombo;

    // --------------------------------------------------------------------------

    /** Singleton pattern. */
    private ContributionManager() {
        super();
    }

    /**
     * Returns the singleton instance.
     * 
     * @return the instance
     */
    public static synchronized ContributionManager getInstance() {
        if (instance == null) {
            instance = new ContributionManager();
        }
        return instance;
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for all control contributions in this plugin.
     * 
     * @return the array of contributions.
     */
    public ControlContribution[] getContributions() {
        load();
        List<ControlContribution> list = new LinkedList<ControlContribution>();

        if (isRecentVisible) {
            if (recentCombo == null) {
                recentCombo = new ScheduleSelector(RECENT_COMBO);
            }
            list.add(recentCombo);
        }

        if (isMatchingVisible) {
            if (matchingCombo == null) {
                matchingCombo = new ScheduleSelector(MATCHING_COMBO);
            }
            list.add(matchingCombo);
        }

        return list.toArray(new ControlContribution[list.size()]);
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the matchingCombo.
     * 
     * @return the matchingCombo
     */
    public ScheduleSelector getMatchingCombo() {
        return this.matchingCombo;
    }

    /**
     * Getter for the recentCombo.
     * 
     * @return the recentCombo
     */
    public ScheduleSelector getRecentCombo() {
        return this.recentCombo;
    }

    // --------------------------------------------------------------------------

    /**
     * Determine whether a component should be visible or not.
     * 
     * @param componentId
     *            the id of the component.
     * @return true if it should be visible false if not or if there is no
     *         component with the provided id.
     */
    public boolean isComponentEnabled(final int componentId) {
        load();
        if (componentId == MATCHING_COMBO) {
            return isMatchingVisible;
        }
        if (componentId == RECENT_COMBO) {
            return isRecentVisible;
        }
        return false;
    }

    /**
     * Set the visibility of components.
     * 
     * @param comboId
     *            the component id.
     * @param enabled
     *            true if the component should be visible, false if not.
     */
    public void toggleCombo(final int comboId, final boolean enabled) {
        if (comboId == MATCHING_COMBO) {
            isMatchingVisible = enabled;
        }
        if (comboId == RECENT_COMBO) {
            isRecentVisible = enabled;
        }

        // update the visibility of the boxes in the KIEM view
        KiemPlugin.getDefault().updateViewAsync();

        save();
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the isSummaryMessageDisabled.
     * 
     * @return the isSummaryMessageDisabled flag
     */
    public boolean isSummaryMessageDisabled()  {
        load();
        return this.isSummaryMessageDisabled;
    }

    /**
     * Setter for the isSummaryMessageDisabled.
     * 
     * @param isSummaryMessageDisabledParam
     *            the isInAdvancedMode to set
     */
    public void setSummaryMessageDisabled(final boolean isSummaryMessageDisabledParam) {
        this.isSummaryMessageDisabled = isSummaryMessageDisabledParam;

        // update visibility of the config data component in the KIEM view
        KiemPlugin.getDefault().updateViewAsync();

        save();
    }
    
    
    /**
     * Getter for the isInAdvancedMode.
     * 
     * @return the isInAdvancedMode
     */
    public boolean isInAdvancedMode() {
        load();
        return this.isInAdvancedMode;
    }

    /**
     * Setter for the isInAdvancedMode.
     * 
     * @param isInAdvancedModeParam
     *            the isInAdvancedMode to set
     */
    public void setInAdvancedMode(final boolean isInAdvancedModeParam) {
        this.isInAdvancedMode = isInAdvancedModeParam;

        // update visibility of the config data component in the KIEM view
        KiemPlugin.getDefault().updateViewAsync();

        save();
    }

    // --------------------------------------------------------------------------

    /**
     * load the saved data from the preference store.
     */
    @Override
    public void load() {
        if (!loaded) {
            String string = super.load(Tools.CONTRIBUTION_CONFIGURATION_KEY,
                    null);

            if (string != null) {
                String isRecentString = Tools.getValue(
                        Tools.IS_RECENT_VISIBLE_NAME, string);
                String isMatchingString = Tools.getValue(
                        Tools.IS_MATCHING_VISIBLE_NAME, string);
                String isAdvancedString = Tools.getValue(
                        Tools.IS_ADVANCED_NAME, string);
                String isSummaryMessageString = Tools.getValue(
                        Tools.IS_SUMMARYMESSAGE_NAME, string);

                if (isRecentString != null) {
                    isRecentVisible = isRecentString.equals("true");
                }
                if (isMatchingString != null) {
                    isMatchingVisible = isMatchingString.equals("true");
                }
                if (isAdvancedString != null) {
                    isInAdvancedMode = isAdvancedString.equals("true");
                }
                if (isSummaryMessageString != null) {
                	isSummaryMessageDisabled = isSummaryMessageString.equals("true");
                }
            }

            loaded = true;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save() {
        String isSummaryMessageString = Tools.putValue(Tools.IS_SUMMARYMESSAGE_NAME,
        		isSummaryMessageDisabled + "");
        String isRecentString = Tools.putValue(Tools.IS_RECENT_VISIBLE_NAME,
                isRecentVisible + "");
        String isMatchingString = Tools.putValue(
                Tools.IS_MATCHING_VISIBLE_NAME, isMatchingVisible + "");
        String isAdvancedString = Tools.putValue(Tools.IS_ADVANCED_NAME,
                isInAdvancedMode + "");

        String result = isRecentString + isMatchingString + isAdvancedString + isSummaryMessageString;
        super.save(Tools.CONTRIBUTION_CONFIGURATION_KEY, result);
    }
}
