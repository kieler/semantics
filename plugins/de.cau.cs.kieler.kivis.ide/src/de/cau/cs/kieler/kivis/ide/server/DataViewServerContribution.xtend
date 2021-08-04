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

import de.cau.cs.kieler.simulation.ide.server.ISimulationServerContribution
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.net.URL
import java.nio.charset.StandardCharsets
import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.eclipse.emf.common.util.URI
import org.eclipse.jetty.servlet.ServletHolder

/**
 * @author als
 */
class DataViewServerContribution implements ISimulationServerContribution {

    override getServletWithMapping() {
        return new Pair("/dataview", new ServletHolder(new DataViewServlet()))
    }

}

class DataViewServlet extends HttpServlet {

    override protected doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8")
        val out = resp.getWriter()
        val path = URI.createPlatformPluginURI("/de.cau.cs.kieler.kivis.ide/resources/DataView.html", true)
        val stream = new URL(path.toString).openConnection().getInputStream()
        val os = new ByteArrayOutputStream();
        var byte[] buffer = newByteArrayOfSize(1024);
        var int len;
        while ((len = stream.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        val bytes = os.toByteArray();
        out.print(new String(bytes, StandardCharsets.UTF_8))
    }
}
