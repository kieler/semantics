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
import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.ide.language.server.KiCoolLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.gson_utils.KGraphTypeAdapterUtil
import de.cau.cs.kieler.klighd.lsp.gson_utils.ReflectiveMessageValidatorExcludingSKGraph
import de.cau.cs.kieler.language.server.registration.RegistrationLanguageServerExtension
import java.util.concurrent.Executors
import java.util.function.Consumer
import java.util.function.Function
import org.apache.log4j.AppenderSkeleton
import org.apache.log4j.AsyncAppender
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.log4j.spi.LoggingEvent
import org.eclipse.lsp4j.MessageParams
import org.eclipse.lsp4j.MessageType
import org.eclipse.lsp4j.jsonrpc.Launcher.Builder
import org.eclipse.lsp4j.jsonrpc.MessageConsumer
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.ide.server.LanguageServerImpl
import org.eclipse.xtext.ide.server.LaunchArgs
import org.eclipse.xtext.ide.server.ServerLauncher
import org.eclipse.xtext.ide.server.ServerModule
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.util.Modules2

/**
 * Used to start language server via stdin/out connection.
 * 
 * @author sdo
 *
 */
class LanguageServerLauncher extends ServerLauncher {
    
    static extension LanguageRegistration registration = new LanguageRegistration
    
    @Inject Injector injector
    
    static KGraphLanguageServerExtension kgtExt = null
    
    def static void main(String[] args) {       
        // Launch the server
        kgtExt = registration.bindAndRegisterLanguages()        
        launch(ServerLauncher.name, args, Modules2.mixin(new ServerModule, [
            bind(ServerLauncher).to(LanguageServerLauncher)
            bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)
        ]))
    }
    
    override start(LaunchArgs args) {
        val executorService = Executors.newCachedThreadPool
        val Consumer<GsonBuilder> configureGson = [ gsonBuilder |
            KGraphTypeAdapterUtil.configureGson(gsonBuilder)
        ]
        val languageServer = injector.getInstance(LanguageServerImpl)
        val regExtension = injector.getInstance(RegistrationLanguageServerExtension)
        val kicoolExtension = injector.getInstance(KiCoolLanguageServerExtension)
        kicoolExtension.kgraphLSEx = kgtExt
        val launcher = new Builder<LanguageClient>()
                .setLocalServices(#[languageServer, regExtension, kicoolExtension])
                .setRemoteInterface(LanguageClient)
                .setInput(args.in)
                .setOutput(args.out)
                .setExecutorService(executorService)
                .wrapMessages(args.wrapper)
                .configureGson(configureGson)
                .setClassLoader(LanguageServer.classLoader)
                .create();
        val client = launcher.remoteProxy
        languageServer.connect(client)
        // Redirect Log4J output to a file
        Logger.rootLogger => [
            removeAllAppenders()
            addAppender(new AsyncAppender() => [
                addAppender(new LanguageClientAppender(client))
            ])
        ]
        val future = launcher.startListening
        while (!future.done) {
            Thread.sleep(10_000l)
        }
    }
    
    private def Function<MessageConsumer, MessageConsumer> getWrapper(LaunchArgs args) {
        [ consumer |
            var result = consumer
            if (args.trace !== null) {
                result = [ message |
                    args.trace.println(message)
                    args.trace.flush()
                    consumer.consume(message)
                ]
            }
            if (args.validate) {
                result = new ReflectiveMessageValidatorExcludingSKGraph(result)
            }
            return result
        ]
    }
    
    /**
     * Asynchronous string appender used for logging
     */
    @Data static class LanguageClientAppender extends AppenderSkeleton {
        LanguageClient client
        
        override protected append(LoggingEvent event) {
            client.logMessage(new MessageParams => [
                message = event.message.toString 
                    + if(event.throwableStrRep !== null && event.throwableStrRep.length > 0) 
                        ': ' + event.throwableStrRep?.join('\n')
                      else 
                        ''
                type = switch event.getLevel {
                    case Level.ERROR: MessageType.Error
                    case Level.INFO : MessageType.Info
                    case Level.WARN : MessageType.Warning
                    default : MessageType.Log
                }
            ])
        }
        
        override close() {
            
        }
        
        override requiresLayout() {
            return false
        }
        
    }
    
}