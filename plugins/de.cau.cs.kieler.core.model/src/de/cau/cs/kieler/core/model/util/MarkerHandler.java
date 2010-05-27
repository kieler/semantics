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
package de.cau.cs.kieler.core.model.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtend.typesystem.emf.check.CheckRegistry;

import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.ui.handler.RemoveMarkerHandler;

/**
 * Handler for managing the error markers and check files.
 * 
 * @author soh
 */
public final class MarkerHandler extends AbstractHandler {

    private static Map<EPackage, Object> packages = new HashMap<EPackage, Object>();

    private static Map<String, CheckFile> checkFiles = new HashMap<String, CheckFile>();

    /** Prefix for the preference store. */
    public static final String PREFERENCE_PREFIX = "_Checkfile_";

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        Command command = event.getCommand();
        boolean oldValue = HandlerUtil.toggleCommandState(command);
        setEnabled(!oldValue);

        return null;
    }

    /**
     * Enable or disable the hiding of problem markers.
     * 
     * @param b
     *            true if markers should be visible, false if not
     */
    public static void setEnabled(final boolean b) {
        if (b) {
            enableAll();
            ModelErrorHandler.enabled();
        } else {
            disableAll();
            ModelErrorHandler.disable();
            RemoveMarkerHandler.removeMarkers();
        }
    }

    /**
     * Get all registered check files.
     * 
     * @return the set of registered files
     */
    public static Set<String> getRegisteredFiles() {
        return checkFiles.keySet();
    }

    /**
     * Determine whether or not a file is enabled.
     * 
     * @param file
     *            the file
     * @return true if enabled, false if not, null if unknown.
     */
    public static Boolean isEnabled(final String file) {
        CheckFile check = checkFiles.get(file);
        if (check == null) {
            return null;
        }
        return check.enabled;
    }

    /**
     * Show all checks.
     */
    public static void enableAll() {
        setAllEnabled(true);
    }

    /**
     * Hide all checks.
     */
    public static void disableAll() {
        setAllEnabled(false);
    }

    /**
     * Show or hide checks.
     * 
     * @param enabled
     *            true if checks should be shown
     */
    private static void setAllEnabled(final boolean enabled) {
        for (CheckFile file : checkFiles.values()) {
            file.setEnabled(enabled);
        }
        refreshChecks();
    }

    /**
     * Register a new check file.
     * 
     * @param ePackage
     *            the package
     * @param file
     *            the file
     * @param isWrapExistingValidator
     *            ???
     * @param referencedEPackageNsURIs
     *            ???
     */
    public static void registerCheckFile(final EPackage ePackage,
            final String file, final boolean isWrapExistingValidator,
            final List<String> referencedEPackageNsURIs) {
        packages.put(ePackage, null);

        IPreferenceStore store = CoreModelPlugin.getDefault()
                .getPreferenceStore();
        boolean value = true;
        String key = PREFERENCE_PREFIX + file;
        if (store.contains(key)) {
            value = store.getBoolean(key);
        } else {
            IEclipsePreferences prefs = new InstanceScope()
                    .getNode(CoreModelPlugin.PLUGIN_ID);
            value = prefs.getBoolean(key, true);
            store.setValue(key, value);
        }

        CheckFile checkFile = new CheckFile();
        checkFiles.put(file, checkFile);

        checkFile.ePackage = ePackage;
        checkFile.file = file;
        checkFile.isWrapExistingValidator = isWrapExistingValidator;
        checkFile.referencedEPackageNsURIs = referencedEPackageNsURIs;

        register(checkFile);
        checkFile.setEnabled(value);
        refreshChecks();
    }

    /**
     * Register a new check file.
     * 
     * @param checkFile
     *            the file
     */
    private static void register(final CheckFile checkFile) {
        if (checkFile.enabled) {
            CheckRegistry.getInstance().registerCheckFile(checkFile.ePackage,
                    checkFile.file, checkFile.isWrapExistingValidator,
                    checkFile.referencedEPackageNsURIs);
        }
    }

    /**
     * Deregisters all checkfiles on all editors editor.
     */
    public static void deregisterChecks() {
        for (EPackage ePackage : packages.keySet()) {
            EValidator.Registry.INSTANCE.remove(ePackage);
        }
    }

    /**
     * Remove a checkfile from the list.
     * 
     * @param file
     *            the file url
     */
    public static void removeCheck(final String file) {
        CheckFile checkFile = checkFiles.remove(file);
        if (checkFile != null) {
            EValidator.Registry.INSTANCE.remove(checkFile.ePackage);
            restoreChecks(checkFile.ePackage);
        }
    }

    /**
     * Restore the checks for a certain epackage.
     * 
     * @param ePackage
     *            the package.
     */
    public static void restoreChecks(final EPackage ePackage) {
        for (CheckFile file : checkFiles.values()) {
            if (ePackage == null || file.ePackage == ePackage) {
                register(file);
            }
        }
    }

    /**
     * Restore all checks.
     */
    public static void restoreChecks() {
        restoreChecks(null);
    }

    /**
     * Refreshes all checks by deregistering all of them and registering them
     * again.
     */
    public static void refreshChecks() {
        deregisterChecks();
        restoreChecks();
    }

    /**
     * Enable the given check.
     * 
     * @param file
     *            the file
     */
    public static void enableCheck(final String file) {
        setEnabled(file, true);
    }

    /**
     * Disable a check file.
     * 
     * @param file
     *            the file
     */
    public static void disableCheck(final String file) {
        setEnabled(file, false);
    }

    /**
     * Set the enablement of a file.
     * 
     * @param file
     *            the file
     * @param enabled
     *            true if visible
     */
    public static void setEnabled(final String file, final boolean enabled) {
        CheckFile check = checkFiles.get(file);
        if (check != null) {
            check.setEnabled(enabled);
            refreshChecks();
        }
    }

    /**
     * Stores all the information about a checkfile.
     * 
     * @author soh
     */
    private static final class CheckFile {

        private CheckFile() {

        }

        /**
         * Set the visibility of the file.
         * 
         * @param enabledParam
         *            true if it should be visible
         */
        public void setEnabled(final boolean enabledParam) {
            enabled = enabledParam;
            new InstanceScope().getNode(CoreModelPlugin.PLUGIN_ID).putBoolean(
                    PREFERENCE_PREFIX + file, enabled);
        }

        /** The package. */
        private EPackage ePackage;

        /** The path to the file. */
        private String file;

        /** ???. */
        private boolean isWrapExistingValidator;

        /** ???. */
        private List<String> referencedEPackageNsURIs;

        /** True if the file should be visible. */
        private boolean enabled = true;
    }
}
