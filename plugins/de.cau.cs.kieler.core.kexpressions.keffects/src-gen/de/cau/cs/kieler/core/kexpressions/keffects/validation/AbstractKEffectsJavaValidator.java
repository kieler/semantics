/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.keffects.validation;
 
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage;

public class AbstractKEffectsJavaValidator extends de.cau.cs.kieler.core.kexpressions.validation.KExpressionsJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = super.getEPackages();
	    result.add(KEffectsPackage.eINSTANCE);
	    return result;
	}
}
