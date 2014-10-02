package de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.module.SCCModule;

public class Activator extends AbstractUIPlugin implements BundleActivator {


	private static Activator plugin;
	
	private Injector injector;

	public Activator() {
		injector = Guice.createInjector(new SCCModule());
	}
	
	public void start(BundleContext bundleContext) throws Exception {
		plugin = this;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
	}

	public static Activator getDefault() {
		return plugin;
	}
	
	public Injector getInjector() {
		return injector;
	}

}
