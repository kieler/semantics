/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.server;

import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * The non-gui server application for KiCoServer.
 * 
 * Start the sever: kieler -application de.cau.cs.kieler.kico.server.headless -noExit -p 5555 Start
 * the sever with console log: kieler -application de.cau.cs.kieler.kico.server.headless -consoleLog
 * -noExit --port 5555
 * 
 * -application will tell eclipse which application to start. You might omit this if you want to run
 * the default application you exported. It makes sense for RCPs with multiple applications though.
 * -consoleLog opens a dedicated eclipse console and should be well known already. -noExit will keep
 * eclipse running even if our application finished. It keeps the console open to examine output.
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
        boolean nextPort = false;
        boolean debug = false;
        ;
        for (final String arg : appArgs) {
            System.out.println(arg);
            if (arg.equals("-d")) {
                debug = true;
            } else if (arg.equals("--debug")) {
                debug = true;
            } else if (arg.equals("-p")) {
                nextPort = true;
            } else if (arg.equals("--port")) {
                nextPort = true;
            } else if (nextPort) {
                nextPort = false;
                int newPort = -1;
                try {
                    newPort = Integer.parseInt(arg);
                } catch (Exception e) {
                    newPort = -1;
                }
                if (newPort > 0) {
                    System.out.println("Setting KiCo TCP Server port to " + newPort);
                    KiCoServerPlugin.savePort(newPort);
                } else {
                    System.out.println("Error setting KiCo TCP Server port (" + arg + ")");
                }
            }
        }

        KiCoServerPlugin.saveEnabled(true);
        System.out.println("Starting KiCo TCP Server at port " + KiCoServerPlugin.loadPort());
        KiCoServerPlugin.startServer(debug);
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop() {
        System.out.println("Stopping KiCo TCP Server");
        KiCoServerPlugin.stopServer();
    }

    // -------------------------------------------------------------------------
}
