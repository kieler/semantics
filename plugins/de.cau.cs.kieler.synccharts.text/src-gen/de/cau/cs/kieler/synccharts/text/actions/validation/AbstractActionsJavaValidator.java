package de.cau.cs.kieler.synccharts.text.actions.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import de.cau.cs.kieler.core.kexpressions.validation.KExpressionsJavaValidator;

public class AbstractActionsJavaValidator extends KExpressionsJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/synccharts/0.2.4"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/emf/2002/Ecore"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/kexpressions/0.1.2"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/annotations"));
		return result;
	}

}
