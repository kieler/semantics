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
package de.cau.cs.kieler.core.model.xtend.validation;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.typesystem.emf.check.CheckRegistry;

import de.cau.cs.kieler.core.model.validation.IValidationRegistry;

/**
 * Validation registry for the Check language.
 *
 * @author msp
 */
public class CheckValidationRegistry implements IValidationRegistry {

    /**
     * {@inheritDoc}
     */
    public void register(final EPackage epackage, final String file,
            final boolean isWrapExistingValidator,
            final List<String> referencedEPackageNsURIs) {
        CheckRegistry.getInstance().registerCheckFile(epackage, file, isWrapExistingValidator,
                referencedEPackageNsURIs);
    }

}
