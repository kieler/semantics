///*
// * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
// * 
// * http://rtsys.informatik.uni-kiel.de/kieler
// * 
// * Copyright 2019 by
// * + Kiel University
// *   + Department of Computer Science
// *     + Real-Time and Embedded Systems Group
// * 
// * This code is provided under the terms of the Eclipse Public License (EPL).
// */
//package de.cau.cs.kieler.simulation.ide.server
//
//import org.eclipse.jetty.websocket.api.Session
//import org.eclipse.jetty.websocket.api.WebSocketAdapter
//import org.eclipse.jetty.websocket.api.WebSocketPolicy
//import org.eclipse.jetty.websocket.server.JettyWebSocketServlet
//import org.eclipse.jetty.websocket.server.JettyWebSocketServletFactory
//
///**
// * @author als
// */
//class SimulationServlet extends JettyWebSocketServlet {
//    
//    static val long MAX_MESSAGE_SIZE = 1 * 1024 * 1024 // 1MB
//
//    override configure(JettyWebSocketServletFactory factory) {
//        // configure socket
//        (factory as WebSocketPolicy).setMaxBinaryMessageSize(MAX_MESSAGE_SIZE)
//        (factory as WebSocketPolicy).setMaxTextMessageSize(MAX_MESSAGE_SIZE)
//        // register SimulationSocket as the WebSocket to create on Upgrade
//        factory.register(SimulationSocket)
//    }
//
//}
//
///**
// * @author als
// */
//class SimulationSocket extends WebSocketAdapter {
//    
//    override onWebSocketConnect(Session sess) {
//        super.onWebSocketConnect(sess)
//        SimulationCommunication.clients += this
//    }
//    
//    override onWebSocketClose(int statusCode, String reason) {
//        SimulationCommunication.clients -= this
//    }
//    
//    override onWebSocketError(Throwable cause) {
//        System.err.println("Error in simulation server connection")
//        cause.printStackTrace
//    }
//    
//    override onWebSocketText(String message) {
//        if (isConnected()) {
//            SimulationCommunication.handleMessage(message)
//        }
//    }
//}
