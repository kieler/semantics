/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.web.ui;

import org.eclipse.ui.IStartup;

import de.cau.cs.kieler.kico.web.KiCoWebPlugin;

/**
 * KiCoWebStartup starts the TCP server in the UI mode of Eclipse when it was started earlier.
 */
public class KiCoWebStartup implements IStartup {

    public void earlyStartup() {
        if (KiCoWebPlugin.loadEnabled()) {
            KiCoWebPlugin.startServer();
        }
    }

}
