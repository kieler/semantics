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

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.ide.CompilerViewUtil
import de.cau.cs.kieler.klighd.IOffscreenRenderer
import de.cau.cs.kieler.klighd.LightDiagramServices
import java.io.ByteArrayOutputStream
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

/**
 * Implements methods to extend the LSP to allow compilation
 * 
 * @author sdo
 * 
 */
class KeithLanguageServerExtension implements ILanguageServerExtension, CommandExtension {

    protected static val LOG = Logger.getLogger(KeithLanguageServerExtension)
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager
    
    @Inject
    Injector injector
    
    /**
     * Holds compilation snapshots for every uri, which was compiled. Send to Theia client after compilation
     */
    protected Map<String, List<SnapshotDescription>> snapshotMap = new HashMap<String, List<SnapshotDescription>>
    
    /**
     * Holds eObjects for every snapshot of every uri, which was compiled. Used to generate diagrams if requested 
     */
    protected Map<String, List<Object>> objectMap = new HashMap<String, List<Object>>

    protected extension ILanguageServerAccess languageServerAccess
    
    /**
     * Used to filter the compilation system according to the compiler preferences
     */
    var Class<?> modelClassFilter
    
    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }
    def ILanguageServerAccess getLanguageServerAccess() {
        return languageServerAccess
    }
    
    override compile(String uri, String command, boolean inplace) {
        var fileUri = uri
        
        CompilerViewUtil.compileInplace = inplace
        
        this.snapshotMap.put(uri, new LinkedList)
        this.objectMap.put(uri, new LinkedList)
        
        if (fileUri.startsWith("file://")) {
            fileUri = fileUri.substring(7) 
        }
        
        var stringUri = URI.createFileURI(fileUri)
        
        var resourceSet = stringUri.xtextResourceSet 
        val resource = resourceSet.getResource(stringUri, true)
        
        var eobject = resource.getContents().head
        var context = compile(eobject, command)
        for (iResult : context.processorInstancesSequence) {
            convertImpl(iResult.environment , uri, iResult.name)
        }
        return requestManager.runRead[ cancelIndicator |
            new CompilationResults(this.snapshotMap.get(uri))
        ]
    }
    
    /**
     * Add snapshot to list of snapshots for uri. Add description to be displayed in compiler view
     */
    def convertImpl(Environment environment, String uri, String processorName) {
        var List<Object> snapshots = environment.getProperty(Environment.SNAPSHOTS)
        var impl = environment.model
        var errors = environment.errors
        var warnings = environment.warnings
        var infos = environment.infos
        if (impl instanceof CodeContainer) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new SnapshotDescription("generated", 0, errors, warnings, infos))
        } else if (impl instanceof EObject) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new SnapshotDescription(processorName, 0, errors, warnings, infos))
            for (snapshot : snapshots.indexed) {
                this.objectMap.get(uri).add(snapshot.value as EObject)
                this.snapshotMap.get(uri).add(new SnapshotDescription(processorName, snapshot.key, errors, warnings, infos))
            }
        } else {
            println("Got something I currently do not recognize " + impl.class)
        }
        
    }
    
    /**
     * @return the correct XtextResourceSet for the given uri based in its file extension.
     */
    def XtextResourceSet getXtextResourceSet(@NonNull URI uri) {
        return injector.getInstance(XtextResourceSet);
    }
    
    private def compile(EObject eobject, String systemId) {
        val context = Compile.createCompilationContext(systemId, eobject)
        context.compile
        return context
    }
    
    override show(String uri, int index) {
        var Object model = this.objectMap.get(uri).get(index)
        var writer = new ByteArrayOutputStream()
        LightDiagramServices.renderOffScreen(model, IOffscreenRenderer.SVG, writer)
        val svg = writer.toString
        return requestManager.runRead[ cancelIndicator |
            svg
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
        var systems = CompilerViewUtil.getSystemModels(true, modelClassFilter)
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
}