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

import com.google.gson.GsonBuilder
import com.google.inject.Guice
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.ide.language.server.KiCoolLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.gson_utils.KGraphTypeAdapterUtil
import de.cau.cs.kieler.language.server.registration.RegistrationLanguageServerExtension
import java.net.InetSocketAddress
import java.nio.channels.AsynchronousServerSocketChannel
import java.nio.channels.Channels
import java.util.concurrent.Executors
import java.util.function.Consumer
import org.apache.log4j.Logger
import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext
import org.eclipse.lsp4j.jsonrpc.Launcher.Builder
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtext.ide.server.IWorkspaceConfigFactory
import org.eclipse.xtext.ide.server.LanguageServerImpl
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.util.Modules2

/**
 * Entry point for the language server application for KIELER Theia.<br>
 * Expects none or host and port as arguments. If none the language server is started via<br>
 * stdin/out, otherwise it is started via a socket connection on specified host and port. If only one argument<br>
 * is provided it will be interpreted as port and host will be localhost<br>
 * <br>
 * <b>Note:</b> On MacOS X make sure to add "-Djava.awt.headless=true" to the vmargs!
 * Otherwise the application will freeze! 
 * 
 * @see LanguageServerLauncher
 * 
 * @author als, sdo
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class LanguageServer implements IApplication {
    
    static val defaultHost = "localhost"
    
    static val LOG = Logger.getLogger(LanguageServer)
    
    extension LanguageRegistration languageRegistration = new LanguageRegistration
    
    /**
     * Starts the language server.
     */
    override start(IApplicationContext context) throws Exception {
        var host = System.getProperty("host")
        var portArg = System.getProperty("port")
        if (portArg !== null) {
            // debug case, communicate via socket
            if (host === null) {
                host = defaultHost
            }
            var port = 0
            try {
                port = Integer.parseInt(portArg)
            } catch (NumberFormatException e) {
                println(e.stackTrace)
                return 1
            }
            println("Connection to: " + host + ":" + port)
            // Register all languages
            println("Starting language server socket")
            val kgraphExt = bindAndRegisterLanguages()
            
            val injector = Guice.createInjector(Modules2.mixin(new KeithServerModule, [
                bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)
                bind(IWorkspaceConfigFactory).to(KeithProjectWorkspaceConfigFactory)
            ]))
            this.run(injector, host, port, kgraphExt)
            return EXIT_OK 
        } else {
            LanguageServerLauncher.main(#[])
            return EXIT_OK
        }
    }
    
    override stop() {
        // implementation not needed
    }
    
    /**
     * Starts the language server (has to be separate method, since start method must have a "reachable" return
     */
    def run(Injector injector, String host,  int port, KGraphLanguageServerExtension kgraphExt) {
        val serverSocket = AsynchronousServerSocketChannel.open.bind(new InetSocketAddress(host, port))
        val threadPool = Executors.newCachedThreadPool()
        while (true) {
            val socketChannel = serverSocket.accept.get
            val in = Channels.newInputStream(socketChannel)
            val out = Channels.newOutputStream(socketChannel)
            val Consumer<GsonBuilder> configureGson = [ gsonBuilder |
                KGraphTypeAdapterUtil.configureGson(gsonBuilder)
            ]
            val languageServer = injector.getInstance(LanguageServerImpl)
            val regExtension = injector.getInstance(RegistrationLanguageServerExtension)
            val kicoolExtension = injector.getInstance(KiCoolLanguageServerExtension)
            kicoolExtension.kgraphLSEx = kgraphExt
            val launcher = new Builder<LanguageClient>()
                .setLocalServices(#[languageServer, regExtension, kicoolExtension])
                .setRemoteInterface(LanguageClient)
                .setInput(in)
                .setOutput(out)
                .setExecutorService(threadPool)
                .wrapMessages([it])
                .configureGson(configureGson)
                .setClassLoader(this.getClass.classLoader)
                .create();
//            val launcher = Launcher.createIoLauncher(languageServer, LanguageClient, in, out, threadPool, [it], configureGson)
            languageServer.connect(launcher.remoteProxy)
            launcher.startListening
            LOG.info("Started language server for client " + socketChannel.remoteAddress)
        }
    }
    
}