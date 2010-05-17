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
import java.util.LinkedList;
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
 * @author soh
 */
public final class MarkerHandler extends AbstractHandler {

    private static Map<EPackage, Object> packages = new HashMap<EPackage, Object>();

    private static List<CheckFile> checkFiles = new LinkedList<CheckFile>();

    private MarkerHandler() {

    }

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        Command command = event.getCommand();
        boolean oldValue = HandlerUtil.toggleCommandState(command);
        if (oldValue) {
            MarkerHandler.deregisterChecks();
            ModelErrorHandler.disable();
            RemoveMarkerHandler.removeMarkers();
        } else {
            MarkerHandler.restoreChecks();
            ModelErrorHandler.enabled();
        }
        return null;
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

        checkFiles.add(checkFile);
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
     * Restore all checks.
     */
    public static void restoreChecks() {
        for (CheckFile file : checkFiles) {
            register(file);
        }
    }

    /**
     * Stores all the information about a checkfile.
     * 
     * @author soh
     */
    private static class CheckFile {

        /** The package. */
        EPackage ePackage;

        /** The path to the file. */
        String file;

        /** ???. */
        boolean isWrapExistingValidator;

        /** ???. */
        List<String> referencedEPackageNsURIs;
    }
}
