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
package de.cau.cs.kieler.sccharts.text.sct.validation;
 
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import de.cau.cs.kieler.sccharts.SCChartsPackage;

public class AbstractSctJavaValidator extends de.cau.cs.kieler.sccharts.text.actions.validation.ActionsJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = super.getEPackages();
	    result.add(SCChartsPackage.eINSTANCE);
	    return result;
	}

}
