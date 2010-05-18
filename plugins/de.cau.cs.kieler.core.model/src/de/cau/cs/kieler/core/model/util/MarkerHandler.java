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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtend.typesystem.emf.check.CheckRegistry;

import de.cau.cs.kieler.core.ui.handler.RemoveMarkerHandler;

/**
 * Handler for managing the error markers and check files.
 * 
 * @author soh
 */
public final class MarkerHandler extends AbstractHandler {

    private static Map<EPackage, Object> packages = new HashMap<EPackage, Object>();

    private static Map<String, CheckFile> checkFiles = new HashMap<String, CheckFile>();

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
            restoreChecks();
            ModelErrorHandler.enabled();
        } else {
            deregisterChecks();
            ModelErrorHandler.disable();
            RemoveMarkerHandler.removeMarkers();
        }
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
        CheckFile checkFile = new CheckFile();
        checkFile.ePackage = ePackage;
        checkFile.file = file;
        checkFile.isWrapExistingValidator = isWrapExistingValidator;
        checkFile.referencedEPackageNsURIs = referencedEPackageNsURIs;

        register(checkFile);

        checkFiles.put(file, checkFile);
        packages.put(ePackage, null);
    }

    /**
     * Register a new check file.
     * 
     * @param checkFile
     *            the file
     */
    private static void register(final CheckFile checkFile) {
        CheckRegistry.getInstance().registerCheckFile(checkFile.ePackage,
                checkFile.file, checkFile.isWrapExistingValidator,
                checkFile.referencedEPackageNsURIs);
    }

    /**
     * Deregisters all checkfiles on the synccharts editor.
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
            if (file.ePackage == ePackage) {
                register(file);
            }
        }
    }

    /**
     * Restore all checks.
     */
    public static void restoreChecks() {
        for (CheckFile file : checkFiles.values()) {
            register(file);
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

        /** The package. */
        private EPackage ePackage;

        /** The path to the file. */
        private String file;

        /** ???. */
        private boolean isWrapExistingValidator;

        /** ???. */
        private List<String> referencedEPackageNsURIs;
    }
}
