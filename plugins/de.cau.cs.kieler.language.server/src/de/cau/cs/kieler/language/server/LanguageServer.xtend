/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext
import org.eclipse.xtext.resource.IResourceServiceProvider

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
import com.google.inject.Injector

import de.cau.cs.kieler.sccharts.ide.text.SCTXIdeSetup
import de.cau.cs.kieler.sccharts.ide.text.SCTXIdeModule
import de.cau.cs.kieler.sccharts.text.SCTXRuntimeModule

import de.cau.cs.kieler.scl.ide.SCLIdeSetup
import de.cau.cs.kieler.scl.SCLRuntimeModule
import de.cau.cs.kieler.scl.ide.SCLIdeModule

/**
 * Entry point for the language server application for KIELER Theia.<br>
 * <br>
 * <b>Note:</b> On MacOS X make sure to add "-Djava.awt.headless=true" to the vmargs!
 * Otherwise the application will freeze! 
 * 
 * @author als, sdo
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class LanguageServer implements IApplication {
    
    static val LOG = Logger.getLogger(LanguageServer)
    
    
    override start(IApplicationContext context) throws Exception {
        // Start all language servers
        println("Starting language server")
        new SCLIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new SCLRuntimeModule, new SCLIdeModule))
            }
        }.createInjectorAndDoEMFRegistration()
        
        new SCTXIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new SCTXRuntimeModule, new SCTXIdeModule, new MyModule))
            }
        }.createInjectorAndDoEMFRegistration()
        
        val injector = Guice.createInjector(Modules2.mixin(new ServerModule, [
            bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)
        ]))
        println("Create injector and register emf")
        this.run(injector)
        
        
//        RunSocketServer.main()
//        print("Existed language server")
        return EXIT_OK
    }
    
    override stop() {
        // Stop all language servers
    }
    
    def run(Injector injector) {
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