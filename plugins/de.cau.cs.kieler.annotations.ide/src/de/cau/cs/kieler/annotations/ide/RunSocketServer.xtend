/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.annotations.ide



import com.google.inject.Guice
import java.net.InetSocketAddress
import java.nio.channels.AsynchronousServerSocketChannel
import java.nio.channels.Channels
import java.util.concurrent.Executors
import org.apache.log4j.Logger
import org.eclipse.lsp4j.jsonrpc.Launcher
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtext.ide.server.LanguageServerImpl
import org.eclipse.xtext.ide.server.ServerModule
import org.eclipse.xtext.util.Modules2
/**
 * @author sdo
 *
 */

class RunSocketServer {
    
    static val LOG = Logger.getLogger(RunSocketServer)

    def static void main(String[] args) throws Exception {
        
        val injector = Guice.createInjector(Modules2.mixin(new ServerModule))
        val serverSocket = AsynchronousServerSocketChannel.open.bind(new InetSocketAddress("localhost", 5007))
        val threadPool = Executors.newCachedThreadPool()
        
        while (true) {
            val socketChannel = serverSocket.accept.get
            val in = Channels.newInputStream(socketChannel)
            val out = Channels.newOutputStream(socketChannel)
            
            val languageServer = injector.getInstance(LanguageServerImpl)
            val launcher = Launcher.createIoLauncher(languageServer, LanguageClient, in, out, threadPool, [it])
            languageServer.connect(launcher.remoteProxy)
            launcher.startListening
            LOG.info("Started language server for client " + socketChannel.remoteAddress)
        }
    }
}