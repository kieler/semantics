package de.cau.cs.kieler.scg.test;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.test.AbstractModelComparator;
import de.cau.cs.kieler.core.model.test.AbstractModelTransformationComparator;
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;

public class SCGModelTransformationComparator extends
		AbstractModelTransformationComparator {

    private static Injector injector = new SctStandaloneSetup()
    	.createInjectorAndDoEMFRegistration();	
	private AbstractModelComparator modelComparator;
	
	SCGModelTransformationComparator() {
		modelComparator = new SCGModelComparator();
	}
	
	@Override
	protected AbstractModelComparator getModelComparator() {
		return modelComparator;
	}

	@Override
	protected Injector getResourceInjector() {
		return injector;
	}

}
