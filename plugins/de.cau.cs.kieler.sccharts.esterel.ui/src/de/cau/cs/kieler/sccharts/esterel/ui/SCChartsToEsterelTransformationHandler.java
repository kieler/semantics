package de.cau.cs.kieler.sccharts.esterel.ui;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;
import de.cau.cs.kieler.sccharts.esterel.transformation.SCChartsToEsterelTransformation;

public class SCChartsToEsterelTransformationHandler extends
		AbstractConvertModelHandler {
	
	private static Injector injector = new SctStandaloneSetup().createInjectorAndDoEMFRegistration();
	
	

	public SCChartsToEsterelTransformationHandler() {
		super();
	}

	@Override
	protected String getTargetExtension(EObject model, ExecutionEvent event,
			ISelection selection) {
		return "strl";
	}

	@Override
	protected Injector createResourceInjector() {
		return injector;
	}

	@Override
	protected Object transform(EObject model, ExecutionEvent event,
			ISelection selection) {
		EObject result = null;
		
		Injector injector = Guice.createInjector();
		SCChartsToEsterelTransformation transformation = injector.getInstance(SCChartsToEsterelTransformation.class);
		
		result = transformation.transform((State) model);
		return result;
	}

}
