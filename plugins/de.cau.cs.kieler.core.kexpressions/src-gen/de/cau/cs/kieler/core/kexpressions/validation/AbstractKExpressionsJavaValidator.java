package de.cau.cs.kieler.core.kexpressions.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import de.cau.cs.kieler.core.annotations.validation.AnnotationsJavaValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class, org.eclipse.xtext.validation.NamesAreUniqueValidator.class})
public class AbstractKExpressionsJavaValidator extends AnnotationsJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/emf/2002/Ecore"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/kexpressions/0.1.2"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://kieler.cs.cau.de/annotations"));
		return result;
	}

}
