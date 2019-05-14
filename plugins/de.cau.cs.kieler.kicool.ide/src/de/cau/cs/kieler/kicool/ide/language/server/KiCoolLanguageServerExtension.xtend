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
package de.cau.cs.kieler.kicool.ide.language.server

import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Singleton
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.ide.view.IdeCompilerView
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.language.server.ILanguageClientProvider
import de.cau.cs.kieler.language.server.KeithLanguageClient
import java.net.URLDecoder
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.concurrent.CompletableFuture
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.lsp4j.jsonrpc.validation.NonNull
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.ide.server.concurrent.RequestManager
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.CancelIndicator

/**
 * Implements methods to extend the LSP to allow compilation
 * 
 * @author sdo
 * 
 */
@Singleton
class KiCoolLanguageServerExtension implements ILanguageServerExtension, CommandExtension, ILanguageClientProvider {

    protected static val LOG = Logger.getLogger(KiCoolLanguageServerExtension)
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager
    
    @Inject
    Injector injector

    @Inject
    extension KGraphLanguageServerExtension
    
    extension IdeCompilerView compilerView = new IdeCompilerView
    protected extension ILanguageServerAccess languageServerAccess
    
    /**
     * Holds compilation snapshots for every uri, which was compiled. Send to Theia client after compilation
     */
    protected Map<String, List<List<SnapshotDescription>>> snapshotMap = new HashMap<String, List<List<SnapshotDescription>>>
    
    /**
     * Holds eObjects for every snapshot of every uri, which was compiled. Used to generate diagrams if requested 
     */
    protected Map<String, List<Object>> objectMap = new HashMap<String, List<Object>>
  
    /**
     * Used to filter the compilation system according to the compiler preferences
     */
    var Class<?> modelClassFilter
    
    /**
     * The command that was compiled the last time.
     */
    protected String lastCommand
    
    /**
     * The index of the snapshot currently shown in the diagram view.
     */
     protected int currentIndex
    
    /**
     * The uri for that was compiled the last time.
     */
    protected String lastUri
    
    /**
     * Indicates if the last compilation was done inplace.
     */
    protected boolean lastInplace
    
    protected CompilationThread compilationThread
    protected Thread getSystemsThread
    protected Thread compilationListenerThread
    
    private var EObject model
    
    public KeithLanguageClient client
    
    override compile(String uri, String clientId, String command, boolean inplace) {
        val eobject = getEObjectFromUri(uri)
        val context = compile(eobject, command, inplace)
        context.addObserver(new KeithCompilationUpdater(this, context, uri, clientId, command, inplace))
        return
    }
    
    /**
     * Called after the compilation function is done. Handles what needs to be updated when the compilation is done,
     * such as requesting a new diagram for the previously shown snapshot.
     */
    protected def didCompile(String uri, String clientId, String command, boolean inplace, CancelIndicator cancelIndicator) {
        if (command.equals(lastCommand) && uri.equals(lastUri) && inplace === lastInplace) {

            showSnapshot(uri, clientId, this.objectMap.get(uri).get(currentIndex), cancelIndicator, true)
        } else {
            val newIndex = this.objectMap.get(uri).size - 1
            showSnapshot(uri, clientId, this.objectMap.get(uri).get(newIndex), cancelIndicator, false)
            currentIndex = newIndex
        }
        lastUri = uri
        lastCommand = command
        lastInplace = inplace
        return
    }
    
    private def compile(EObject eobject, String systemId, boolean inplace) {
        val context = Compile.createCompilationContext(systemId, eobject)
        context.startEnvironment.setProperty(Environment.INPLACE, inplace)
        this.compilationThread = new CompilationThread(context)
        this.compilationThread.start()
        return context
    }
    
    override show(String uri, String clientId, int index) {
        var Object model
        if (index != -1) {
            model = this.objectMap.get(uri).get(index)
        } else {
            // get eObject of model specified by uri        
            model = getEObjectFromUri(uri)
        }
        val modelToSend = model
        return requestManager.runRead[ cancelIndicator |
            currentIndex = index
            showSnapshot(uri, clientId, modelToSend, cancelIndicator, false)
        ]
    }
    
    override getSystems(String uri, boolean filter) {
        // Reset the calculation of the current snapshot index.
        lastUri = null
        this.getSystemsThread = new GetSystemsThread([
            this.model = getEObjectFromUri(uri)
        ])
        this.getSystemsThread.start
        this.getSystemsThread.join()
        if (model !== null && model.class !== modelClassFilter) {
            modelClassFilter = model.class
        }
        var systems = getSystemModels(true, modelClassFilter)
        val systemDescriptions = getSystemDescription(systems)
        return requestManager.runRead[ cancelIndicator |
            systemDescriptions
        ]
    }
    
    /**
     * Gets EObject for resource specified by given uri as String
     * 
     * @param uri uri as String for resource to get EObject from
     * @return EObject of specified resource
     */
    def EObject getEObjectFromUri(String uri) {
        var fileUri = URLDecoder.decode( uri, "UTF-8" );
        if (fileUri.startsWith("file://")) {
            fileUri = fileUri.substring(7) 
        }
        val uriObject = URI.createFileURI(fileUri)
        val resource = uriObject.xtextResourceSet.getResource(uriObject, true)
        
        return resource.getContents().head
    }
    
    /**
     * @param uri URI of file without file://
     * @return the correct XtextResourceSet for the given uri based in its file extension.
     */
    def XtextResourceSet getXtextResourceSet(@NonNull URI uri) {
        return injector.getInstance(XtextResourceSet);
    }
    
    /**
     * Converts systems returned from language server to system description containing the information the Theia client
     * needs to display the available compilation systems
     * 
     * @param systems list of compilation systems
     * @return list of system description usable by Theia client
     */
    def List<SystemDescription> getSystemDescription(List<System> systems) {
        var systemDescription = newLinkedList
        for (system : systems) {
            systemDescription.add(new SystemDescription(system.label, system.id, system.public))	
        }
        return systemDescription
    }
    
    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }
    
    override cancelCompilation() {
        if (compilationThread.alive) {
            this.compilationThread.terminated = true
            var context = this.compilationThread.context
            context.startEnvironment.setProperty(Environment.CANCEL_COMPILATION, true)
            for (iResult : context.processorInstancesSequence) {
                iResult.cancelCompilation()
            }
        }
        return
    }
    
    override cancelGetSystems() {
        println("Interrupt thread")
        if (getSystemsThread.alive) {
            this.getSystemsThread.interrupt()
            println(compilationThread.alive)
        }
        return requestManager.runRead[ cancelIndicator |
            true
        ]
    }
    
    override setLanguageClient(LanguageClient client) {
        this.client = client as KeithLanguageClient
    }
    
    override getLanguageClient() {
        return this.client
    }
    
    /**
     * Send list of current snapshots in snapshotMap to the client.
     * @param uri uri of model file
     * @param context CompilationContext of current compilation
     * @param clientId identifier used by the client to identify the diagram widget that should be updated. Only relevant if showSnapshot is true.
     * @param command Compilation system. Only relevant of showSnapshot is true.
     * @param inplace Whether the command was invoked with inplace compilation. Only relevant if showSnapshot is true.
     * @param showSnapshot indicates whether diagram should be updated on client side.
     */
    def update(String uri, CompilationContext context, String clientId, String command, boolean inplace, boolean showSnapshot, boolean finished) {
        var future = new CompletableFuture()
        future.complete(void)
        future.thenAccept([
            client.compile(new CompilationResults(this.snapshotMap.get(uri)), uri, finished)
        ])
        if (finished && compilationThread.terminated) {
            future.thenAccept([
                client.cancelCompilation(true)
            ])
        } else {
            if (showSnapshot) {
                future.thenRun [
                    didCompile(uri, clientId, command, inplace, CancelIndicator.NullImpl)
                ].exceptionally [ throwable |
                    LOG.error('Error while running additional compilation effects.', throwable)
                    return null
                ]
            }
        }
    }
    
}
