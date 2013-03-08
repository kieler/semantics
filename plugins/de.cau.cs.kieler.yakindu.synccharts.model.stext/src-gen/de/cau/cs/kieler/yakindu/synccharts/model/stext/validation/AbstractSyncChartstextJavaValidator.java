package de.cau.cs.kieler.yakindu.synccharts.model.stext.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import de.cau.cs.kieler.yakindu.model.stext.validation.SynctextJavaValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class, org.eclipse.xtext.validation.NamesAreUniqueValidator.class})
public class AbstractSyncChartstextJavaValidator extends SynctextJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SyncChartstextPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.yakindu.org/sct/sgraph/2.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.yakindu.org/base/base/2.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.yakindu.org/base/types/2.0.0"));
		return result;
	}

}
