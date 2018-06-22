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
import org.eclipse.xtext.ide.server.ServerLauncher
import com.google.inject.Inject
import org.apache.log4j.AsyncAppender
import java.util.function.Consumer
import com.google.gson.GsonBuilder
import org.eclipse.xtext.ide.server.LaunchArgs
import java.util.function.Function
import org.eclipse.lsp4j.jsonrpc.MessageConsumer
import org.eclipse.lsp4j.jsonrpc.validation.ReflectiveMessageValidator
import org.apache.log4j.AppenderSkeleton
import org.apache.log4j.spi.LoggingEvent
import org.eclipse.lsp4j.MessageParams
import org.apache.log4j.Level
import org.eclipse.lsp4j.MessageType

/**
 * @author sdo
 *
 */
class LanguageServerLauncher extends ServerLauncher {
    
    def static void main(String[] args) {
        

        // Do a manual setup that includes the Yang diagram module
        
        new SCLIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new SCLRuntimeModule, new SCLIdeModule))
            }
        }.createInjectorAndDoEMFRegistration()
        
        new SCTXIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new SCTXRuntimeModule, new SCTXIdeModule, new SCChartsServerModule))
            }
        }.createInjectorAndDoEMFRegistration()
        
        // Launch the server
        launch(ServerLauncher.name, args, Modules2.mixin(new ServerModule, [
            bind(ServerLauncher).to(LanguageServerLauncher)
            bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)
        ]))
    }

    @Inject LanguageServerImpl languageServer
    
    override start(LaunchArgs args) {
        val executorService = Executors.newCachedThreadPool
//        val Consumer<GsonBuilder> configureGson = [ gsonBuilder |
//            ActionTypeAdapter.configureGson(gsonBuilder)
//        ] from sprotty
        val launcher = Launcher.createIoLauncher(languageServer, LanguageClient, args.in, args.out, executorService,
                args.wrapper)
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
                result = new ReflectiveMessageValidator(result)
            }
            return result
        ]
    }
    
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