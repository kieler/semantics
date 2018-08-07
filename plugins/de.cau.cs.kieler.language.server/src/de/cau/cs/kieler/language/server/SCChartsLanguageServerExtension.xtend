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

import com.google.gson.JsonPrimitive
import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.impl.SCChartsImpl
import de.cau.cs.kieler.scg.impl.SCGraphsImpl
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.lsp4j.ExecuteCommandParams
import org.eclipse.lsp4j.jsonrpc.Endpoint
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints
import org.eclipse.lsp4j.jsonrpc.validation.NonNull
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.ide.server.concurrent.RequestManager
import org.eclipse.xtext.resource.XtextResourceSet
import java.io.ByteArrayOutputStream
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.IOffscreenRenderer

/**
 * @author sdo
 * 
 */
class SCChartsLanguageServerExtension implements ILanguageServerExtension, CommandExtension {

    protected static val LOG = Logger.getLogger(SCChartsLanguageServerExtension)
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager
    
    @Inject
    Injector injector
    
    protected Map<String, List<Snapshot>> snapshotMap = new HashMap<String, List<Snapshot>>
    protected Map<String, List<Object>> objectMap = new HashMap<String, List<Object>>
    
    CommandExtension _client

    protected extension ILanguageServerAccess languageServerAccess
    
    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }
    def ILanguageServerAccess getLanguageServerAccess() {
        languageServerAccess
    }

    protected def CommandExtension getClient() {
        if (_client === null) {
            val client = languageServerAccess.languageClient
            if (client instanceof Endpoint) {
                _client = ServiceEndpoints.toServiceObject(client, CommandExtension)
            }
        }
        return _client
    }
    
    override compile(ExecuteCommandParams params) {
        val originalUri = (params.arguments.get(0) as JsonPrimitive).asString
        var string = originalUri
        
        this.snapshotMap.put(originalUri, new LinkedList)
        this.objectMap.put(originalUri, new LinkedList)
        
        var compilationSystemId = (params.arguments.get(1) as JsonPrimitive).asString
        if (string.startsWith("file://")) {
            string = string.substring(7) 
        }
        var uri = URI.createFileURI(string)
        
        var resourceSet = uri.xtextResourceSet 
        val resource = resourceSet.getResource(uri, true)
        
        var eobject = resource.getContents().head
        var context = compile(eobject, compilationSystemId)
        for (iResult : context.processorInstancesSequence) {
            convertImpl(iResult.environment.model, iResult.environment.getProperty(Environment.SNAPSHOTS), originalUri, iResult.name)
        }
        return requestManager.runRead[ cancelIndicator |
            new CompilationResults(this.snapshotMap.get(originalUri))
        ]
    }
    
    def convertImpl(Object impl, List<Object> snapshots, String uri, String processorName) {
        if (impl instanceof CodeContainer) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new Snapshot("code", "generated", 0))
        } else if (impl instanceof SCChartsImpl) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new Snapshot("sctx", processorName, 0))
            var count = 1
            for (snapshot : snapshots) {
                this.objectMap.get(uri).add(snapshot as EObject)
                this.snapshotMap.get(uri).add(new Snapshot("sctx", processorName, count))
                count++
            }
        } else if (impl instanceof SCGraphsImpl) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new Snapshot("scg", processorName, 0))
            var count = 1
            for (snapshot : snapshots) {
                this.objectMap.get(uri).add(snapshot as EObject)
                this.snapshotMap.get(uri).add(new Snapshot("scg", processorName, count))
                count++
            }
        } else {
            println("Got something different than an EObject")
        }
        
    }
    
    /**
     * @return the correct XtextResourceSet for the given uri based in its file extension.
     */
    def XtextResourceSet getXtextResourceSet(@NonNull URI uri) {
        // removed case injector null
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
}