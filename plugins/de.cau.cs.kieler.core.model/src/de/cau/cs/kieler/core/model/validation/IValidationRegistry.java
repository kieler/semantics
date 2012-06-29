/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.validation;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

/**
 * Interface for validation registry classes.
 *
 * @author msp
 */
public interface IValidationRegistry {
    
    /**
     * Register a check file in this registry.
     * 
     * @param epackage the EMF package
     * @param file the check file
     * @param isWrapExistingValidator True if the checkfile wraps around another checkfile and thus
     *            has to be added after it.
     * @param referencedEPackageNsURIs the referenced package namespace URIs
     */
    void register(EPackage epackage, String file, boolean isWrapExistingValidator,
            List<String> referencedEPackageNsURIs);

}
