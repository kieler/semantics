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
package de.cau.cs.kieler.kico.web;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * The non-gui server application for KiCoServer.
 * 
 * @author cmot
 * @kieler.design 2014-04-08 proposed
 * @kieler.rating 2014-04-08 proposed yellow
 */
public class KiCoServerApplication implements IApplication {

    /**
     * {@inheritDoc}
     */
    public Object start(IApplicationContext context) throws Exception {
        if (KiCoWebPlugin.loadEnabled()) {
            KiCoWebPlugin.startServer();
        }
        return null;
    }
    
    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop() {
        KiCoWebPlugin.stopServer();
    }

    //-------------------------------------------------------------------------
}
