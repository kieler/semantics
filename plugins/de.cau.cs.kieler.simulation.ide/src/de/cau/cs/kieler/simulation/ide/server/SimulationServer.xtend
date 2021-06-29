/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ide.server

import de.cau.cs.kieler.core.services.KielerServiceLoader
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletHolder
import org.eclipse.jetty.websocket.server.config.JettyWebSocketServletContainerInitializer

/**
 * @author als
 */
class SimulationServer {
    
    public static val PORT = 5010
    private static val JOB = new Job("Simulation Server") {

        override protected run(IProgressMonitor monitor) {
            monitor.beginTask("Simulation Remote Interface", IProgressMonitor.UNKNOWN)

            monitor.subTask("Starting server")
            val server = new Server(PORT)
            server.stopAtShutdown = true
            
            val ctx = new ServletContextHandler()
            ctx.setContextPath("/");
            
            ctx.addServlet(new ServletHolder(new SimulationServlet()), "/simulation");
            
            for (contribution : KielerServiceLoader.load(ISimulationServerContribution)) {
                val entry = contribution.getServletWithMapping()
                if (entry !== null) {
                    ctx.addServlet(entry.value, entry.key)
                }
            }
            
            JettyWebSocketServletContainerInitializer.configure(ctx, null); // init websocket
            server.setHandler(ctx);
            server.start()

            monitor.subTask("Server is running")
            while (!monitor.canceled) {
                Thread.sleep(100)
            }

            monitor.subTask("Stopping server")
            server.stop()

            return Status.CANCEL_STATUS
        }
    }

    static def start() {
        if (JOB.state === Job.NONE) {
            JOB.schedule
        }
    }
    

    static def stop() {
        if (JOB !== null) {
            JOB.cancel()
        }
    }
    
    def static isRunning() {
        return JOB.state !== Job.NONE
    }
    
}
