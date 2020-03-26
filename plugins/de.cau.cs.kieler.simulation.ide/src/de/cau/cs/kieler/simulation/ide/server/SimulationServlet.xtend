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

import org.eclipse.jetty.websocket.api.Session
import org.eclipse.jetty.websocket.api.WebSocketAdapter
import org.eclipse.jetty.websocket.servlet.WebSocketServlet
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory

/**
 * @author als
 */
class SimulationServlet extends WebSocketServlet {
    
    static val MAX_MESSAGE_SIZE = 1 * 1024 * 1024 // 1MB

    override configure(WebSocketServletFactory factory) {
        // configure socket
        factory.policy.maxBinaryMessageSize = MAX_MESSAGE_SIZE
        factory.policy.maxBinaryMessageBufferSize = MAX_MESSAGE_SIZE
        factory.policy.maxTextMessageSize = MAX_MESSAGE_SIZE
        factory.policy.maxTextMessageBufferSize = MAX_MESSAGE_SIZE
        // register SimulationSocket as the WebSocket to create on Upgrade
        factory.register(SimulationSocket)
    }

}

/**
 * @author als
 */
class SimulationSocket extends WebSocketAdapter {
    
    override onWebSocketConnect(Session sess) {
        super.onWebSocketConnect(sess)
        SimulationCommunication.clients += this
    }
    
    override onWebSocketClose(int statusCode, String reason) {
        SimulationCommunication.clients -= this
    }
    
    override onWebSocketError(Throwable cause) {
        System.err.println("Error in simulation server connection")
        cause.printStackTrace
    }
    
    override onWebSocketText(String message) {
        if (isConnected()) {
            SimulationCommunication.handleMessage(message)
        }
    }
}
