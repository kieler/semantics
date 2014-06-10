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

import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * The non-gui server application for KiCoServer.
 * 
 * Start the sever: kieler -application de.cau.cs.kieler.kico.web.server -consoleLog -noExit first second
 * last
 * 
 * -application will tell eclipse which application to start. You might omit this if you want to run
 * the default application you exported. It makes sense for RCPs with multiple applications though.
 * -consoleLog opens a dedicated eclipse console and should be well known already. -noExit will keep
 * eclipse running even if our apllication finished. It keeps the console open to examine output
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

        final Map<?, ?> args = context.getArguments();
        final String[] appArgs = (String[]) args.get("application.args");
        for (final String arg : appArgs) {
            System.out.println(arg);
        }

        //if (KiCoWebPlugin.loadEnabled()) {
        System.out.println("Starting KiCo TCP Server at port " + KiCoWebPlugin.loadPort());
        KiCoWebPlugin.startServer();
        //}
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop() {
        System.out.println("Stopping KiCo TCP Server");
        KiCoWebPlugin.stopServer();
    }

    // -------------------------------------------------------------------------
}
