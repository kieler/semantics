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
import org.eclipse.jetty.servlet.ServletHandler

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
            val handler = new ServletHandler()
            handler.addServletWithMapping(SimulationServlet, "/simulation")
            for (contribution : KielerServiceLoader.load(ISimulationServerContribution)) {
                val entry = contribution.getServletWithMapping()
                if (entry !== null) {
                    handler.addServletWithMapping(entry.value, entry.key)
                }
            }
            server.setHandler(handler);
            server.start()

            monitor.subTask("Server is runnig")
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
