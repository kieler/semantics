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

/**
 * Customized bundle activator initializing all of the Xtext stuff.
 * 
 * @author chsch
 * 
 */
public class KitsUIPlugin extends AbstractUIPlugin {

    public static final String ACTIONS_LANGUAGE = "de.cau.cs.kieler.synccharts.text.actions.Actions";

    public static final String KITS_LANGUAGE = "de.cau.cs.kieler.synccharts.text.kits.Kits";

    public static final String KITS_STATE_LANGUAGE = "de.cau.cs.kieler.synccharts.text.kitsState.KitsState";

    public static final String KITS_LANGUAGE_EMBEDDED = "de.cau.cs.kieler.synccharts.text.kits.KitsEmbedded";

    private Map<String, Injector> injectors = new HashMap<String, Injector>();
    private static KitsUIPlugin INSTANCE;

    public Injector getInjector(String languageName) {
        return injectors.get(languageName);
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        INSTANCE = this;
        try {

            injectors.put(ACTIONS_LANGUAGE,
                    Guice.createInjector(Modules.override(
                            Modules.override(getRuntimeModule(ACTIONS_LANGUAGE)).with(
                                    getUiModule(ACTIONS_LANGUAGE))).with(getSharedStateModule())));
            injectors.put(KITS_LANGUAGE,
                    Guice.createInjector(Modules.override(
                            Modules.override(getRuntimeModule(KITS_LANGUAGE)).with(
                                    getUiModule(KITS_LANGUAGE))).with(getSharedStateModule())));
            injectors.put(KITS_STATE_LANGUAGE,
                    Guice.createInjector(Modules.override(
                            Modules.override(getRuntimeModule(KITS_STATE_LANGUAGE)).with(
                                    getUiModule(KITS_STATE_LANGUAGE))).with(getSharedStateModule())));
            injectors.put(KITS_LANGUAGE_EMBEDDED,
                    Guice.createInjector(Modules.override(
                            Modules.override(getRuntimeModule(KITS_LANGUAGE_EMBEDDED)).with(
                            		getUiModule(KITS_LANGUAGE_EMBEDDED)))
                            		.with(getSharedStateModule())));

        } catch (Exception e) {
            Logger.getLogger(getClass()).error(e.getMessage(), e);
            throw e;
        }
    }

    public static KitsUIPlugin getInstance() {
        return INSTANCE;
    }

    protected Module getRuntimeModule(String grammar) {

        if (ACTIONS_LANGUAGE.equals(grammar)) {
            return new de.cau.cs.kieler.synccharts.text.actions.ActionsRuntimeModule();
        }
        if (KITS_LANGUAGE.equals(grammar)) {
            return new de.cau.cs.kieler.synccharts.text.kits.KitsRuntimeModule();
        }
        if (KITS_STATE_LANGUAGE.equals(grammar)) {
            return new de.cau.cs.kieler.synccharts.text.kitsState.KitsStateRuntimeModule();
        }
        if (KITS_LANGUAGE_EMBEDDED.equals(grammar)) {
        	return new de.cau.cs.kieler.synccharts.text.kits.KitsEmbeddedRuntimeModule();
        }
        throw new IllegalArgumentException(grammar);
    }

    protected Module getUiModule(String grammar) {

        if (ACTIONS_LANGUAGE.equals(grammar)) {
            return new de.cau.cs.kieler.synccharts.text.actions.ui.ActionsUiModule(this);
        }
        if (KITS_LANGUAGE.equals(grammar)) {
            return new de.cau.cs.kieler.synccharts.text.kits.ui.KitsUiModule(this);
        }
        if (KITS_STATE_LANGUAGE.equals(grammar)) {
            return new de.cau.cs.kieler.synccharts.text.kitsState.ui.KitsStateUiModule(this);
        }
        if (KITS_LANGUAGE_EMBEDDED.equals(grammar)) {
            return new de.cau.cs.kieler.synccharts.text.kits.ui.KitsEmbeddedUIModule(this);
    }
        throw new IllegalArgumentException(grammar);
    }
    
    protected Module getSharedStateModule() {
        return new org.eclipse.xtext.ui.shared.SharedStateModule();
    }
}
