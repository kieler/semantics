/*
 * generated by Xtext
 */
package de.cau.cs.kieler.sccharts.legacy.kexpressions.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractKExpressionsJavaValidator extends de.cau.cs.kieler.sccharts.legacy.annotations.validation.AnnotationsJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/emf/2002/Ecore"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/sccharts/legacy/kexpressions"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/sccharts/legacy/annotations"));
		return result;
	}

}
