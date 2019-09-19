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
package de.cau.cs.kieler.kivis.ide.server

import de.cau.cs.kieler.kivis.KiVisConstants
import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.ide.server.ISimulationServerContribution
import java.io.File
import java.io.IOException
import java.net.URL
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.eclipse.jetty.servlet.ServletHolder

/**
 * @author als
 */
class VisualizationServerContribution implements ISimulationServerContribution {

    override getServletWithMapping() {
        return new Pair("/visualization", new ServletHolder(new VisualizationServlet()))
    }

}

class VisualizationServlet extends HttpServlet {

    override protected doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8")
        resp.setStatus(HttpServletResponse.SC_OK)
        val out = resp.getWriter()

        if (CentralSimulation.currentSimulation !== null) {
            val sim = CentralSimulation.currentSimulation
            val cc = sim.sourceCompilationContext
            if (cc !== null) {
                val vizURL = cc.result.getProperty(KiVisConstants.VISUALIZATION);
                if (vizURL !== null) {
                    val bytes = Files.readAllBytes(new File(new URL(vizURL).toURI).toPath)
                    out.print(new String(bytes, StandardCharsets.UTF_8))
                    return
                }
            }
        }
        out.print("No Visualuzation available")
    }

}
