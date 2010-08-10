/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.text.ui;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;


/** Customized bundle activator initializing all of the Xtext stuff.
 * @author chsch
 *
 */
public class Activator extends AbstractUIPlugin {


	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static Activator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
			
			injectors.put("de.cau.cs.kieler.synccharts.text.actions.Actions", Guice.createInjector(
					Modules.override(Modules.override(getRuntimeModule("de.cau.cs.kieler.synccharts.text.actions.Actions")).with(getUiModule("de.cau.cs.kieler.synccharts.text.actions.Actions"))).with(getSharedStateModule())
				));
			injectors.put("de.cau.cs.kieler.synccharts.text.interfaces.Interfaces", Guice.createInjector(
					Modules.override(Modules.override(getRuntimeModule("de.cau.cs.kieler.synccharts.text.interfaces.Interfaces")).with(getUiModule("de.cau.cs.kieler.synccharts.text.interfaces.Interfaces"))).with(getSharedStateModule())
				));
			injectors.put("de.cau.cs.kieler.synccharts.text.kits.Kits", Guice.createInjector(
					Modules.override(Modules.override(getRuntimeModule("de.cau.cs.kieler.synccharts.text.kits.Kits")).with(getUiModule("de.cau.cs.kieler.synccharts.text.kits.Kits"))).with(getSharedStateModule())
				));
			
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	public static Activator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		
		if ("de.cau.cs.kieler.synccharts.text.actions.Actions".equals(grammar)) {
			  return new de.cau.cs.kieler.synccharts.text.actions.ActionsRuntimeModule();
			}
		if ("de.cau.cs.kieler.synccharts.text.interfaces.Interfaces".equals(grammar)) {
			  return new de.cau.cs.kieler.synccharts.text.interfaces.InterfacesRuntimeModule();
			}
		if ("de.cau.cs.kieler.synccharts.text.kits.Kits".equals(grammar)) {
			  return new de.cau.cs.kieler.synccharts.text.kits.KitsRuntimeModule();
			}
		
		throw new IllegalArgumentException(grammar);
	}
	protected Module getUiModule(String grammar) {
		
		if ("de.cau.cs.kieler.synccharts.text.actions.Actions".equals(grammar)) {
			  return new de.cau.cs.kieler.synccharts.text.actions.ui.ActionsUiModule(this);
			}
		if ("de.cau.cs.kieler.synccharts.text.interfaces.Interfaces".equals(grammar)) {
			  return new de.cau.cs.kieler.synccharts.text.interfaces.ui.InterfacesUiModule(this);
			}
		if ("de.cau.cs.kieler.synccharts.text.kits.Kits".equals(grammar)) {
			  return new de.cau.cs.kieler.synccharts.text.kits.ui.KitsUiModule(this);
			}		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}
}
