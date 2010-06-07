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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtend.typesystem.emf.check.CheckRegistry;

import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.ui.handler.RemoveMarkerHandler;

/**
 * Handler for managing the error markers and check files.
 * 
 * @author soh
 */
public final class ValidationManager extends AbstractHandler {

    /**
     * Factory for creating the validate actions used in the validation.
     * 
     * @author soh
     */
    public static interface IActionFactory {

        /**
         * Get the validate action for the given ePackage.
         * 
         * @return the action
         */
        Action getAction();

    }

    /**
     * Contains all registered packages with a factory for creating validate
     * actions.
     */
    private static Map<EPackage, IActionFactory> packages = new HashMap<EPackage, IActionFactory>();

    /** Maps the path of a check file to the internal checkfile objects. */
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
            validateActiveEditor();
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
     * Get all files registered for a specific ePackage.
     * 
     * @param ePackage
     *            the package
     * @return the files
     */
    public static Set<String> getRegisteredFiles(final EPackage ePackage) {
        Set<String> result = new HashSet<String>();
        for (CheckFile file : checkFiles.values()) {
            if (file.ePackage == ePackage) {
                result.add(file.file);
            }
        }
        return result;
    }

    /**
     * Get the Epackage of the file.
     * 
     * @param file
     *            the file
     * @return the package
     */
    public static EPackage getEPackage(final String file) {
        EPackage result = null;
        CheckFile checkFile = checkFiles.get(file);
        if (checkFile != null) {
            result = checkFile.ePackage;
        }
        return result;
    }

    /**
     * Get the ePackage for the currently active editor.
     * 
     * @return the package
     */
    public static EPackage getEPackage() {
        EPackage ePackage = null;
        IWorkbenchPage page = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getActivePage();
        if (page != null) {
            IEditorPart ed = page.getActiveEditor();
            if (ed != null && ed instanceof DiagramEditor) {
                DiagramEditor diagEd = (DiagramEditor) ed;
                Object obj = diagEd.getDiagramEditPart().getModel();
                if (obj != null && obj instanceof View) {
                    EObject eObj = ((View) obj).getElement();
                    ePackage = eObj.eClass().getEPackage();
                }
            }
        }
        return ePackage;
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
        if (!packages.containsKey(ePackage)) {
            packages.put(ePackage, null);
        }

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
     * Register a validate action with the given ePackage.
     * 
     * @param ePackage
     *            the package
     * @param action
     *            the validate action
     */
    public static void registerValidateAction(final EPackage ePackage,
            final IActionFactory action) {
        packages.put(ePackage, action);
    }

    /**
     * Run all validate actions.
     * 
     */
    public static void validate() {
        for (IActionFactory action : packages.values()) {
            if (action != null) {
                action.getAction().run();
            }
        }
    }

    /**
     * Run the validate action of the currently active editor.
     */
    public static void validateActiveEditor() {
        EPackage ePackage = getEPackage();
        IActionFactory factory = packages.get(ePackage);
        if (factory != null) {
            factory.getAction().run();
        }
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
            if ((ePackage == null || file.ePackage == ePackage)
                    && !file.isWrapExistingValidator) {
                register(file);
            }
        }
        for (CheckFile file : checkFiles.values()) {
            if ((ePackage == null || file.ePackage == ePackage)
                    && file.isWrapExistingValidator) {
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

    /** The list of listeners to be notified of visibility changes. */
    private static Set<IPropertyChangeListener> listeners = new HashSet<IPropertyChangeListener>();

    /**
     * Notify listeners of a property change.
     * 
     * @param file
     *            the file
     * @param oldValue
     *            the old value
     * @param newValue
     *            the new value
     */
    private static void firePropertyChangedEvent(final String file,
            final boolean oldValue, final boolean newValue) {
        PropertyChangeEvent event = new PropertyChangeEvent(
                CoreModelPlugin.PLUGIN_ID, PREFERENCE_PREFIX + file, oldValue,
                newValue);

        for (IPropertyChangeListener listener : listeners) {
            listener.propertyChange(event);
        }
    }

    /**
     * Registers a new listener on the manager.
     * 
     * @param listener
     *            the listener
     */
    public static void addListener(final IPropertyChangeListener listener) {
        listeners.add(listener);
    }

    /**
     * Removes a listener from the manager.
     * 
     * @param listener
     *            the listener
     */
    public static void removeListener(final IPropertyChangeListener listener) {
        listeners.remove(listener);
    }

    /**
     * Stores all the information about a checkfile.
     * 
     * @author soh
     */
    private static final class CheckFile {

        /**
         * 
         * Does nothing.
         * 
         */
        private CheckFile() {

        }

        /**
         * Set the visibility of the file.
         * 
         * @param enabledParam
         *            true if it should be visible
         */
        public void setEnabled(final boolean enabledParam) {
            boolean oldValue = enabled;
            enabled = enabledParam;
            new InstanceScope().getNode(CoreModelPlugin.PLUGIN_ID).putBoolean(
                    PREFERENCE_PREFIX + file, enabled);
            firePropertyChangedEvent(file, oldValue, enabled);
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
