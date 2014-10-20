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
package de.cau.cs.kieler.klighd.server;

import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;

/**
 * The non-gui server application for KlighdServer.
 * 
 * Start the sever: kieler -application de.cau.cs.kieler.klighd.server.headless -noExit -p 4444
 * Start the sever with console log: kieler -application de.cau.cs.kieler.klighd.server.headless
 * -consoleLog -noExit --port 4444
 * 
 * -application will tell eclipse which application to start. You might omit this if you want to run
 * the default application you exported. It makes sense for RCPs with multiple applications though.
 * -consoleLog opens a dedicated eclipse console and should be well known already. -noExit will keep
 * eclipse running even if our application finished. It keeps the console open to examine output.
 * 
 * For Console Logging on Linux: /home/layout/kielercompiler/kieler/kieler -application
 * de.cau.cs.kieler.klighd.server.headless -noExit -p 4444 --debug -consoleLog &
 * 
 * @author cmot
 * @kieler.design 2014-04-08 proposed
 * @kieler.rating 2014-04-08 proposed yellow
 */
public class KlighdServerApplication implements IApplication {

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
                    System.out.println("Setting KLighD TCP Server port to " + newPort);
                    KlighdServerPlugin.savePort(newPort);
                } else {
                    System.out.println("Error setting KLighD TCP Server port (" + arg + ")");
                }
            }
        }

        KlighdServerPlugin.saveEnabled(true);
        System.out.println("Starting KLighD TCP Server at port " + KlighdServerPlugin.loadPort());
        KlighdServerPlugin.startServer(debug);

        // We need the following code to ensure that a GUI is created and dispatched which is needed
        // for rendering PNG (or other bitmap) renderings, there a Shell is needed
        // (BitmapOffscreenRenderer.java of KLighD)
        while (true) {
            try {
                Display.getDefault().readAndDispatch();
                Thread.sleep(100);
            } catch (final InterruptedException e) {
                // nothing
            }
        }

        // return IApplication.EXIT_OK;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop() {
        System.out.println("Stopping KLighD TCP Server");
        KlighdServerPlugin.stopServer();
    }

    // -------------------------------------------------------------------------
}
