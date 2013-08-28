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
 */
package de.cau.cs.kieler.synccharts.ksbase.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.synccharts.ksbase.SyncchartsKsbasePlugin;

/**
 * @author soh
 * @kieler.ignore (excluded from review process)
 */
public class KsbaseStarter implements IStartup {

    /**
     * {@inheritDoc}
     */
    public void earlyStartup() {
        Class<?> c;
        try {
            // chsch: optionalized dependency to synccharts.diagram.custom for use with KLighD
            //  thus the following call won't work under all circumstances and is therefore
            //  performed by means of Java reflections
            
            // SyncchartsPropertyTester.ksbaseIsActive();
            
            c = Class.forName(
                    "de.cau.cs.kieler.synccharts.diagram.custom.handlers.SyncchartsPropertyTester");
            c.getMethod("ksbaseIsActive").invoke(null);

        } catch (ClassNotFoundException e) {
            // the bundle synccharts.diagram.custom is not available -> no nothing

        } catch (Exception e) {
            StatusManager.getManager().handle(
                    new Status(IStatus.ERROR, SyncchartsKsbasePlugin.PLUGIN_ID, "Bundle "
                            + SyncchartsKsbasePlugin.PLUGIN_ID + ": "
                            + "Initialization of KSbasE for the ThinkCharts editor failed."),
                    StatusManager.LOG);
        }
    }
}
