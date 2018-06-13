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
import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Compile
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
import org.eclipse.xtext.ide.server.UriExtensions
import org.eclipse.xtext.ide.server.concurrent.RequestManager
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.IResourceValidator
import org.eclipse.xtext.ide.server.WorkspaceManager
import org.eclipse.xtext.ide.server.findReferences.WorkspaceResourceAccess
import org.eclipse.xtext.ide.server.LanguageServerImpl
import org.eclipse.xtext.ide.server.IWorkspaceConfigFactory
import org.eclipse.xtext.ide.server.IProjectDescriptionFactory
import java.util.LinkedList

/**
 * @author sdo
 * 
 */
class MyLanguageServerExtension implements ILanguageServerExtension, CommandExtension {


    protected static val LOG = Logger.getLogger(MyLanguageServerExtension)
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager

//    @Inject
//    LanguageServerImpl langserver
    
    @Inject extension IResourceValidator

    @Inject extension UriExtensions
    
    @Inject
    Injector injector
    
    
//    @Inject Provider<IDiagramServer> diagramServerProvider
//    
//    @Inject Provider<IDiagramGenerator> diagramGeneratorProvider
    
//    DeferredDiagramUpdater updater

//    @Accessors(PROTECTED_GETTER)
//    val Map<String, IDiagramServer> diagramServers = newLinkedHashMap
//

    CommandExtension _client // TODO see DiagramEndpoint

    protected extension ILanguageServerAccess languageServerAccess
    
    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
//        updater = new DeferredDiagramUpdater([it | doUpdateDiagrams(it)])
//        access.addBuildListener [ deltas |
//            updateDiagrams(deltas.map[uri].toSet)
//        ]
//        this.languageServerAccess.addBuildListener(this) // TODO??
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
    
    override testen(ExecuteCommandParams params) {
        
        var string = (params.arguments.get(0) as JsonPrimitive).asString
        var compilationApproach = (params.arguments.get(1) as JsonPrimitive).asString
        if (string.startsWith("file://")) {
            string = string.substring(7) 
        }
        var path = string.substring(0, string.length - 5) // throw away .sctx
        var uri = URI.createFileURI(string)
        
        println(uri)
        println(compilationApproach)
        // Get resource set
        var resourceSet = uri.xtextResourceSet 
        val resource = resourceSet.getResource(uri, true)
        
        var test = resource.getContents().head
        var context = compile(test, (params.arguments.get(1) as JsonPrimitive).asString)
        
        val model = (context as CompilationContext).result.model
        var head = (model as CodeContainer).head
        println(head)
        
        
        val uriC = URI.createFileURI(path + ".c")
        head = head.replaceAll("\n", "<br>")
        val htmlhead = head.replaceAll("  ", "&emsp;")
        val mymodel = convert(model as CodeContainer)
        return requestManager.runRead[ cancelIndicator |
            mymodel as MyCodeContainer
        ]
//        requestManager.runWrite([
//            new JsonPrimitive(head)
//        ], [/*cancelIndicator , buildable | 
//            buildable.build(cancelIndicator)*/
//        ])
    }
    
    def convert(CodeContainer cc) {
        val mcc = new MyCodeContainer();
        mcc.files = new LinkedList();
        cc.files.forEach[key, value | mcc.files.add(new MyTextDocument(key, value))]
        return mcc
    }
    
    override didTesten(MyParams params) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    
    
    
    /**
     * @return the correct XtextResourceSet for the given uri based in its file extension.
     */
    def XtextResourceSet getXtextResourceSet(@NonNull URI uri) {
        if (injector !== null) {
            return injector.getInstance(XtextResourceSet);
        } else {
            val registry = Guice.createInjector().getInstance(IResourceServiceProvider.Registry)
            return registry.getResourceServiceProvider(uri).get(XtextResourceSet)
        }
    }
    
    private def compile(EObject eobject, String systemId) {
        val context = Compile.createCompilationContext('de.cau.cs.kieler.sccharts.netlist', eobject)

        context.compile
        
        return context
    }
}
