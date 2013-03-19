package de.cau.cs.kieler.yakindu.sccharts.sim.scg.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.validation.SCLJavaValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class})
public class AbstractSCGJavaValidator extends SCLJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.yakindu.org/sct/statechart/SText"));
		return result;
	}

}
