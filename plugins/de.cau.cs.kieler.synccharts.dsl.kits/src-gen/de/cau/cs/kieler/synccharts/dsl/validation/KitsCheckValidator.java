
package de.cau.cs.kieler.synccharts.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.CheckType;

public class KitsCheckValidator extends org.eclipse.xtext.check.AbstractCheckValidator {

	public KitsCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("de::cau::cs::kieler::synccharts::dsl::validation::KitsFastChecks", CheckType.FAST);
		addCheckFile("de::cau::cs::kieler::synccharts::dsl::validation::KitsChecks", CheckType.NORMAL);
		addCheckFile("de::cau::cs::kieler::synccharts::dsl::validation::KitsExpensiveChecks", CheckType.EXPENSIVE);
	}
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
		return result;
	}
	
}
