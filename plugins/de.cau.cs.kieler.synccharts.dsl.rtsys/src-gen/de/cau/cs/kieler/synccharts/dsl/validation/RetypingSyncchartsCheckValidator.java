
package de.cau.cs.kieler.synccharts.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.CheckType;

public class RetypingSyncchartsCheckValidator extends org.eclipse.xtext.check.AbstractCheckValidator {

	public RetypingSyncchartsCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("de::cau::cs::kieler::synccharts::dsl::validation::RetypingSyncchartsFastChecks", CheckType.FAST);
		addCheckFile("de::cau::cs::kieler::synccharts::dsl::validation::RetypingSyncchartsChecks", CheckType.NORMAL);
		addCheckFile("de::cau::cs::kieler::synccharts::dsl::validation::RetypingSyncchartsExpensiveChecks", CheckType.EXPENSIVE);
	}
	
	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage.eINSTANCE);
		return result;
	}
	
}
