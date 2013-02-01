package org.yakindu.sct.ui.editor.factories;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.yakindu.sct.ui.editor.DiagramActivator;

import com.google.inject.Injector;

public class SCTExecutableExtensionFactory extends
		AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DiagramActivator.getDefault().getBundle();
	}

	@Override
	protected Injector getInjector() {
		return DiagramActivator.getDefault().getInjector();
	}

}
