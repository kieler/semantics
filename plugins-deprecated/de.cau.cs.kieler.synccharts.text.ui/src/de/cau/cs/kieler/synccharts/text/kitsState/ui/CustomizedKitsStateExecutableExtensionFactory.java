/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.text.kitsState.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.cau.cs.kieler.synccharts.text.ui.KitsUIPlugin;

public class CustomizedKitsStateExecutableExtensionFactory extends
        AbstractGuiceAwareExecutableExtensionFactory {

    @Override
    protected Bundle getBundle() {
        return de.cau.cs.kieler.synccharts.text.ui.KitsUIPlugin.getInstance().getBundle();
    }

    @Override
    public Injector getInjector() {
        return de.cau.cs.kieler.synccharts.text.ui.KitsUIPlugin.getInstance().getInjector(
                KitsUIPlugin.KITS_STATE_LANGUAGE);
    }

}
