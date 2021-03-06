/*
 * generated by Xtext
 */
package de.cau.cs.kieler.esterel.scest.validation;

import de.cau.cs.kieler.esterel.validation.EsterelValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractSCEstValidator extends EsterelValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.cau.de/cs/kieler/esterel/Esterel"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/scl/0.2.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/kexpressions/0.1.2"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/annotations"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/keffects/0.1.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/kext/0.1.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/emf/2002/Ecore"));
		return result;
	}
}
