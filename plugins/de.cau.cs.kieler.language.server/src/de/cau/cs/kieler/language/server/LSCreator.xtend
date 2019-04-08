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
package de.cau.cs.kieler.language.server

import com.google.gson.GsonBuilder
import de.cau.cs.kieler.core.services.KielerServiceLoader
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.gson_utils.KGraphTypeAdapterUtil
import java.io.InputStream
import java.io.OutputStream
import java.util.concurrent.ExecutorService
import java.util.function.Consumer
import org.apache.log4j.AsyncAppender
import org.eclipse.lsp4j.jsonrpc.MessageConsumer
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtext.ide.server.IWorkspaceConfigFactory
import org.eclipse.xtext.ide.server.LanguageServerImpl
import org.eclipse.xtext.ide.server.ServerLauncher
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.util.Modules2
import com.google.inject.Injector
import org.apache.log4j.Logger
import org.eclipse.sprotty.xtext.launch.DiagramServerLauncher.LanguageClientAppender
import org.eclipse.lsp4j.jsonrpc.Launcher.Builder
import java.util.function.Function
import com.google.inject.Provider

/** 
 * Provides methods to create a LS.
 * This involves binding of modules and creating, starting, and configure logging for an LS.
 * 
 * @author sdo
 */
class LSCreator {
    
    
    /**
     * Binds all necessary classes to start the LS.
     * @param kgl KGraphLSExtension which is registered at the injector to inject it into other LSExtensions.
     * @param socket boolean whether modules for socket or stdio case are generated.
     */
    def createLSModules(KGraphLanguageServerExtension kgl, boolean socket) {
        return Modules2.mixin(new KeithServerModule, [
            if (socket) {
                // nothing special to bind
            } else {
                bind(ServerLauncher).to(LanguageServerLauncher)
            }
            bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)
            // the KGraphLSExtension is bound to make it accessible via injection
            bind(KGraphLanguageServerExtension).toProvider(new Provider<KGraphLanguageServerExtension>() {
                override get() {
                    kgl
                }
            })
            // the WorkspaceConfigFactory is overridden to disable the creation of a folder with xtext nature.
            bind(IWorkspaceConfigFactory).to(KeithProjectWorkspaceConfigFactory)
        ])
    }
    
    /**
     * Build and starts a LS and handles logging configuration if necessary.
     * Registers all ILanguageServerExtensions registered via ServiceLoader as extensions to the existing ls given as
     * parameter.
     * @param injector injector used to get all LSExtensions. KGraphLSExtension must be registered.
     * @param ls the LangaugeServerImpl that is started. Usually the KGraphLSExtension, which is a DiagramLanguageServer
     * @param in InputStream for communication
     * @param out OutputStream for communication
     * @param threadPool ExecutorService
     * @param wrapper 
     * @param socket whether the LS is created for the socket or stdio case
     */
    def buildAndStartLS(Injector injector, LanguageServerImpl ls, InputStream in, OutputStream out,
        ExecutorService threadPool, Function<MessageConsumer, MessageConsumer> wrapper, boolean socket
    ) {
        // TypeAdapter is needed to be able to send recursive data in json
        val Consumer<GsonBuilder> configureGson = [ gsonBuilder |
            KGraphTypeAdapterUtil.configureGson(gsonBuilder)
        ]
        // Get all LSExtensions to use them as local services
        var iLanguageServerExtensions = <Object>newArrayList(ls)
        for (lse : KielerServiceLoader.load(ILanguageServerContribution)) {
            iLanguageServerExtensions.add(lse.getLanguageServerExtension(injector))
        }
        val launcher = new Builder<LanguageClient>()
                .setLocalServices(iLanguageServerExtensions)
                .setRemoteInterface(LanguageClient)
                .setInput(in)
                .setOutput(out)
                .setExecutorService(threadPool)
                .wrapMessages(wrapper)
                .configureGson(configureGson)
                .setClassLoader(LanguageServer.classLoader)
                .create();
        val client = launcher.remoteProxy
        ls.connect(client)
        val future = launcher.startListening
        if (socket) {
            // nothing special to handle
        } else { // case stdio
            // Redirect Log4J output to a file
            Logger.rootLogger => [
                removeAllAppenders()
                addAppender(new AsyncAppender() => [
                    addAppender(new LanguageClientAppender(client))
                ])
            ]
            while (!future.done) {
                Thread.sleep(10_000l)
            }
            
        }
        
    }
}
