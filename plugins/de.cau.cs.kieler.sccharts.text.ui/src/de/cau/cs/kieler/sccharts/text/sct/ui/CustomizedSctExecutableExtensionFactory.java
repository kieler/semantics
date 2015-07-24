/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 *****************************************************************************/
package de.cau.cs.kieler.sccharts.text.sct.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.cau.cs.kieler.sccharts.text.ui.SctUIPlugin;

public class CustomizedSctExecutableExtensionFactory extends
        AbstractGuiceAwareExecutableExtensionFactory {

    @Override
    protected Bundle getBundle() {
        return de.cau.cs.kieler.sccharts.text.ui.SctUIPlugin.getInstance().getBundle();
    }

    @Override
    public Injector getInjector() {
        return de.cau.cs.kieler.sccharts.text.ui.SctUIPlugin.getInstance().getInjector(
                SctUIPlugin.SCT_LANGUAGE);
    }

}
