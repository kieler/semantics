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

import com.google.inject.Guice
import com.google.inject.Injector
import de.cau.cs.kieler.sccharts.ide.text.SCTXIdeModule
import de.cau.cs.kieler.sccharts.ide.text.SCTXIdeSetup
import de.cau.cs.kieler.sccharts.text.SCTXRuntimeModule
import de.cau.cs.kieler.scl.SCLRuntimeModule
import de.cau.cs.kieler.scl.ide.SCLIdeModule
import de.cau.cs.kieler.scl.ide.SCLIdeSetup
import java.net.InetSocketAddress
import java.nio.channels.AsynchronousServerSocketChannel
import java.nio.channels.Channels
import java.util.concurrent.Executors
import org.apache.log4j.Logger
import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext
import org.eclipse.lsp4j.jsonrpc.Launcher
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtext.ide.server.LanguageServerImpl
import org.eclipse.xtext.ide.server.ServerModule
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.util.Modules2
import de.cau.cs.kieler.esterel.ide.EsterelIdeSetup
import de.cau.cs.kieler.esterel.EsterelRuntimeModule
import de.cau.cs.kieler.esterel.ide.EsterelIdeModule
import de.cau.cs.kieler.lustre.ide.LustreIdeSetup
import de.cau.cs.kieler.lustre.ide.LustreIdeModule
import de.cau.cs.kieler.lustre.LustreRuntimeModule

/**
 * Entry point for the language server application for KIELER Theia.<br>
 * Has to be started with "socket" and #port as arguments to connect via socket <br>
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
        var socket = ""
        var args = (context.arguments.get("application.args")) as String[]
        if (args.size > 0) {
            socket = args.get(0)
        }
        if (socket == "socket") {
            // debug case, communicate via socket
            if (args.size != 2) {
                throw new Exception("Wrong number of arguments")
            }
            val port = Integer.parseInt(args.get(1))
            println(args.toString)
            println("Connection via: " + socket)
               
            // Start all language servers
            println("Starting language server socket")
            new SCLIdeSetup {
                override createInjector() {
                    Guice.createInjector(Modules2.mixin(new SCLRuntimeModule, new SCLIdeModule))
                }
            }.createInjectorAndDoEMFRegistration()
            new SCTXIdeSetup {
                override createInjector() {
                    Guice.createInjector(Modules2.mixin(new SCTXRuntimeModule, new SCTXIdeModule, new KeithServerModule))
                }
            }.createInjectorAndDoEMFRegistration()
            
            new EsterelIdeSetup {
                override createInjector() {
                    Guice.createInjector(Modules2.mixin(new EsterelRuntimeModule, new EsterelIdeModule))
                }
            }.createInjectorAndDoEMFRegistration()
            
            new LustreIdeSetup {
                override createInjector() {
                    Guice.createInjector(Modules2.mixin(new LustreRuntimeModule, new LustreIdeModule))
                }
            }.createInjectorAndDoEMFRegistration()
            
            val injector = Guice.createInjector(Modules2.mixin(new ServerModule, [
                bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)
            ])) 
            println("Create injector and register emf")
            this.run(injector, port)
            return EXIT_OK 
        } else {
            // product case, communicate via stdin/out
            LanguageServerLauncher.main(#[])
            return EXIT_OK
        }
    }
    
    override stop() {
        // not implemented
    }
    
    /**
     * Starts the language server (has to be separate method, since start method must have a "reachable" return
     */
    def run(Injector injector, int port) {
        val serverSocket = AsynchronousServerSocketChannel.open.bind(new InetSocketAddress("localhost", port))
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