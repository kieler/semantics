package de.cau.cs.kieler.yakindu.synccharts.ui.editor.factory;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;

import de.cau.cs.kieler.yakindu.synccharts.ui.editor.editor.Activator;

import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class SyncChartsExecutableExtensionFactory extends
		AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected Injector getInjector() {
		return Activator.getDefault().getInjector();
	}

}
