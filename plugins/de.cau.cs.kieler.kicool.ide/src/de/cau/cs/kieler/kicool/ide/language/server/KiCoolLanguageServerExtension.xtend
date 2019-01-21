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
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.environments.Snapshots
import de.cau.cs.kieler.kicool.ide.view.IdeCompilerView
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.lsp4j.jsonrpc.validation.NonNull
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
class KiCoolLanguageServerExtension implements ILanguageServerExtension, CommandExtension {

    protected static val LOG = Logger.getLogger(KiCoolLanguageServerExtension)
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager
    
    @Inject
    Injector injector
    
    @Inject
    extension KGraphLanguageServerExtension kgraphLSEx
    
    extension IdeCompilerView compilerView = new IdeCompilerView
    protected extension ILanguageServerAccess languageServerAccess
    
    /**
     * Holds compilation snapshots for every uri, which was compiled. Send to Theia client after compilation
     */
    protected Map<String, List<SnapshotDescription>> snapshotMap = new HashMap<String, List<SnapshotDescription>>
    
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
    
    override compile(String uri, String command, boolean inplace) {
        var fileUri = uri
        
        this.snapshotMap.put(uri, new LinkedList)
        this.objectMap.put(uri, new LinkedList)
        
        if (fileUri.startsWith("file://")) {
            fileUri = fileUri.substring(7) 
        }
        
        var stringUri = URI.createFileURI(fileUri)
        
        var resourceSet = stringUri.xtextResourceSet 
        val resource = resourceSet.getResource(stringUri, true)
        
        var eobject = resource.getContents().head
        var context = compile(eobject, command, inplace)
        for (iResult : context.processorInstancesSequence) {
            convertImpl(iResult.environment , uri, iResult.name)
        }
        val result = requestManager.runRead[ cancelIndicator |
            new CompilationResults(this.snapshotMap.get(uri))
        ]
        result.thenRun [
            didCompile(uri, command, null)
        ].exceptionally [ throwable |
            LOG.error('Error while running additional compilation effects.', throwable)
            return null
        ]
        return result
    }
    
    /**
     * Called after the compilation function is done. Handles what needs to be updated when the compilation is done,
     * such as requesting a new diagram for the previously shown snapshot.
     */
    protected def didCompile(String uri, String command, CancelIndicator cancelIndicator) {
        if (command.equals(lastCommand) && uri.equals(lastUri)) {
            showSnapshot(uri, this.objectMap.get(uri).get(currentIndex), cancelIndicator, true)
        } else {
            val newIndex = this.objectMap.get(uri).size - 1
            showSnapshot(uri, this.objectMap.get(uri).get(newIndex), cancelIndicator, false)
            currentIndex = newIndex
        }
        lastUri = uri
        lastCommand = command
    }
    
    /**
     * Add snapshot to list of snapshots for uri. Add description to be displayed in compiler view
     */
    def convertImpl(Environment environment, String uri, String processorName) {
        var Snapshots snapshots = environment.getProperty(Environment.SNAPSHOTS)
        var impl = environment.model
        var errors = environment.errors
        var warnings = environment.warnings
        var infos = environment.infos
        this.objectMap.get(uri).add(impl)
        this.snapshotMap.get(uri).add(new SnapshotDescription(processorName, 0, errors, warnings, infos))
        for (snapshot : snapshots.indexed) {
            this.objectMap.get(uri).add(snapshot.value.object)
            this.snapshotMap.get(uri).add(new SnapshotDescription(processorName, snapshot.key, errors, warnings, infos))
        }
        
    }
    
    /**
     * @return the correct XtextResourceSet for the given uri based in its file extension.
     */
    def XtextResourceSet getXtextResourceSet(@NonNull URI uri) {
        return injector.getInstance(XtextResourceSet);
    }
    
    private def compile(EObject eobject, String systemId, boolean inplace) {
        val context = Compile.createCompilationContext(systemId, eobject)
        context.startEnvironment.setProperty(Environment.INPLACE, inplace)
        context.compile
        return context
    }
    
    override show(String uri, int index) {
        return requestManager.runRead[ cancelIndicator |
            currentIndex = index
            showSnapshot(uri, this.objectMap.get(uri).get(index), cancelIndicator, false)
        ]
    }
    
    override getSystems(String uri, boolean filter) {
        var fileUri = uri
        if (fileUri.startsWith("file://")) {
            fileUri = fileUri.substring(7) 
        }
        var uriObject = URI.createFileURI(fileUri)
        
        var resourceSet = uriObject.xtextResourceSet 
        val resource = resourceSet.getResource(uriObject, true)
        
        var eobject = resource.getContents().head
        val model = if(filter) eobject
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
     * @param stringUri uri as String for resource to get EObject from
     * @return EObject of specified resource
     */
    def EObject getEObjectFromURI(String stringUri) {
        var uri = URI.createFileURI(stringUri)
        var resourceSet = uri.xtextResourceSet
        val resource = resourceSet.getResource(uri, true)

        return resource.getContents().head
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
    
}
