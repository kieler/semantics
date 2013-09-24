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

import org.eclipse.ui.IStartup;

import de.cau.cs.kieler.synccharts.diagram.custom.handlers.SyncchartsPropertyTester;

/**
 * @author soh
 * @kieler.ignore (excluded from review process)
 */
public class KsbaseStarter implements IStartup {

    /**
     * {@inheritDoc}
     */
    public void earlyStartup() {
        SyncchartsPropertyTester.ksbaseIsActive();
    }

}
