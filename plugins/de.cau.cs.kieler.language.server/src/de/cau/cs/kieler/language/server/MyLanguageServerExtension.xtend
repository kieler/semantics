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
import de.cau.cs.kieler.kicool.environments.Environment
import java.util.Map
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.sccharts.impl.SCChartsImpl
import de.cau.cs.kieler.annotations.impl.PragmatableImpl
import java.util.List
import java.io.ByteArrayOutputStream
import de.cau.cs.kieler.kicool.registration.ResourceExtension

/**
 * @author sdo
 * 
 */
class MyLanguageServerExtension implements ILanguageServerExtension, CommandExtension {

    @Inject
    IResourceServiceProvider.Registry xtextRegistry;

    protected static val LOG = Logger.getLogger(MyLanguageServerExtension)
    
    protected List<EObject> eObjects = new LinkedList
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager

//    @Inject
//    LanguageServerImpl langserver
    
    @Inject extension IResourceValidator

    @Inject extension UriExtensions
    
    @Inject
    Injector injector
    
    Integer index = 100
    
    Integer currentModelIndex = 0
    
    protected List<MyTextDocument> documents = new LinkedList
    
    
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
    
    override compile(ExecuteCommandParams params) {
        index = 100
        var string = (params.arguments.get(0) as JsonPrimitive).asString
        var compilationSystemId = (params.arguments.get(1) as JsonPrimitive).asString
        if (string.startsWith("file://")) {
            string = string.substring(7) 
        }
        var path = string.substring(0, string.length - 5) // throw away .sctx
        var uri = URI.createFileURI(string)
        
        println(uri)
        println(compilationSystemId)
        // Get resource set
        var resourceSet = uri.xtextResourceSet 
        val resource = resourceSet.getResource(uri, true)
        
        var eobject = resource.getContents().head
        var context = compile(eobject, compilationSystemId)
        
        val model = (context as CompilationContext).result.model
        val mymodel = new MyCodeContainer
        for (iResult : context.processorInstancesSequence) {
            if (convertImpl(iResult.environment.model) !== null) {
                var tempDocuments = convertImpl(iResult.environment.model).files
                if (tempDocuments !== null) {
                    for (document : tempDocuments) {
                        if (document !== null) {
                            mymodel.files.add(document)
                        }
                    }
                }
            }
        }
        return requestManager.runRead[ cancelIndicator |
//            values
//            test as MyCodeContainer
            mymodel as MyCodeContainer
        ]
//        requestManager.runWrite([
//            new JsonPrimitive(head)
//        ], [/*cancelIndicator , buildable | 
//            buildable.build(cancelIndicator)*/
//        ])
    }
    
    def convertImpl(Object impl) {
        if (impl instanceof CodeContainer) {
            println("Have CodeContainer")
            var cc = convert(impl as CodeContainer)
            documents.addAll(cc.files)
            return cc
        }
//        val mcc = new MyCodeContainer();
//        mcc.files = new LinkedList<MyTextDocument>
//        this.eObjects.add(impl as PragmatableImpl)
//        mcc.files.add(transform(impl as EObject))
        var textDocument = transform(impl as EObject)
        if (textDocument !== null) {
            this.documents.add(textDocument as MyTextDocument)
        }
        return null
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
        val context = Compile.createCompilationContext(systemId, eobject)

        context.compile
        
        return context
    }
    
    def MyTextDocument transform(EObject model) {
        // TODO adapt to kicool
        // btw, kicoUtil.serialize is too unstructured. Redo for this purpose.
        var String serialized = null
        index++
        if (ResourceExtension.getResourceExtension(model) !== null){
            val outputStream = new ByteArrayOutputStream
            val ext = ResourceExtension.getResourceExtension(model).fileExtension
            val uri = URI.createURI(#["inmemory:/", model.hashCode, ".", ext].join)
            val provider = xtextRegistry.getResourceServiceProvider(uri)
            val rset = provider.get(XtextResourceSet)
            var res = rset.createResource(uri)
            if (res !== null) {
                res.contents += model
                res.save(outputStream, emptyMap)
                serialized = outputStream.toString
            } else {
                println("Did not come here")
            }
            return new MyTextDocument("model" + index +  "." + ext, serialized)   
        }  
    }
    
    override showNext(ExecuteCommandParams params) {
        currentModelIndex = Math.min(currentModelIndex + 1, documents.length - 1)
        return requestManager.runRead[ cancelIndicator |
            documents.get(currentModelIndex) as MyTextDocument
        ]
    }
    
    override showPrevious(ExecuteCommandParams params) {
        currentModelIndex = Math.max(currentModelIndex -1, 0)
        return requestManager.runRead[ cancelIndicator |
            documents.get(currentModelIndex) as MyTextDocument
        ]
    }
    
    override showOriginal(ExecuteCommandParams params) {
        currentModelIndex = 0
        return requestManager.runRead[ cancelIndicator |
            documents.get(currentModelIndex) as MyTextDocument
        ]
        
    }
    
    override showLast(ExecuteCommandParams params) {
        currentModelIndex = documents.length - 1
        return requestManager.runRead[ cancelIndicator |
            documents.get(currentModelIndex) as MyTextDocument
        ]
    }
    
}
