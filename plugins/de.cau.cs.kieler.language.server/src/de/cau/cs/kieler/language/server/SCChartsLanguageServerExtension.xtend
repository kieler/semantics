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
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.registration.ResourceExtension
import java.io.ByteArrayOutputStream
import java.util.LinkedList
import java.util.List
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
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet
import java.util.Map
import java.util.HashMap

/**
 * @author sdo
 * 
 */
class SCChartsLanguageServerExtension implements ILanguageServerExtension, CommandExtension {

    @Inject
    IResourceServiceProvider.Registry xtextRegistry;

    protected static val LOG = Logger.getLogger(SCChartsLanguageServerExtension)
    
    protected List<EObject> eObjects = new LinkedList
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager
    
    @Inject
    Injector injector
    
    Integer index = 100
    
    Integer currentModelIndex = 0
    
    protected Map<String, List<TextDocument>> resultMap = new HashMap<String, List<TextDocument>>
    
    
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
        var originalUri = (params.arguments.get(0) as JsonPrimitive).asString
        var string = originalUri
        
        this.resultMap.put(originalUri, new LinkedList)
        
        var compilationSystemId = (params.arguments.get(1) as JsonPrimitive).asString
        if (string.startsWith("file://")) {
            string = string.substring(7) 
        }
        var uri = URI.createFileURI(string)
        
//        println(uri)
//        println(compilationSystemId)
        // Get resource set
        var resourceSet = uri.xtextResourceSet 
        val resource = resourceSet.getResource(uri, true)
        
        var eobject = resource.getContents().head
        var context = compile(eobject, compilationSystemId)
        
        val mymodel = new CompilationResults
        for (iResult : context.processorInstancesSequence) {
            var convertedImpl = convertImpl(iResult.environment.model, originalUri)
            if (convertedImpl !== null) {
                var tempDocuments = convertedImpl.files
                if (tempDocuments !== null) {
                    for (document : tempDocuments) {
                        if (document !== null) {
                            mymodel.files.add(document)
                        }
                    }
                }
            }
        }
//        println("Send TextDocuments")
        return requestManager.runRead[ cancelIndicator |
//            values
//            test as MyCodeContainer
            mymodel as CompilationResults
        ]
//        requestManager.runWrite([
//            new JsonPrimitive(head)
//        ], [/*cancelIndicator , buildable | 
//            buildable.build(cancelIndicator)*/
//        ])
    }
    
    def convertImpl(Object impl, String uri) {
        if (impl instanceof CodeContainer) {
//            println("Have CodeContainer")
            var cc = convert(impl as CodeContainer)
            
            this.resultMap.get(uri).addAll(cc.files)
            
            return cc
        }
//        val mcc = new MyCodeContainer();
//        mcc.files = new LinkedList<MyTextDocument>
//        this.eObjects.add(impl as PragmatableImpl)
//        mcc.files.add(transform(impl as EObject))
        var textDocument = transform(impl as EObject)
        if (textDocument !== null) {
            
            this.resultMap.get(uri).add(textDocument as TextDocument)
        }
        return null
    }
    
    def convert(CodeContainer cc) {
        val mcc = new CompilationResults();
        mcc.files = new LinkedList();
        cc.files.forEach[key, value | mcc.files.add(new TextDocument(key, value))]
        return mcc
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
        var testInjector = injector
        context.compile
        
        return context
    }
    
    def TextDocument transform(EObject model) {
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
//                println("Did not come here")
            }
            return new TextDocument("model" + index +  "." + ext, serialized)   
        }  
    }
    
    def TextDocument transformToHtmlText(TextDocument document) {
        document.value = document.value.replace("\n", "<br>")
        document.value = document.value.replace("  ", "&emsp;")
        return document
    }
    
    override showNext(ExecuteCommandParams params) {
        val list = this.resultMap.get((params.arguments.get(0) as JsonPrimitive).toString.replace("\"", ""))
        currentModelIndex = Math.min(currentModelIndex + 1, list.size - 1)
        return requestManager.runRead[ cancelIndicator |
            list.get(currentModelIndex)
        ]
    }
    
    override showPrevious(ExecuteCommandParams params) {
        val list = this.resultMap.get((params.arguments.get(0) as JsonPrimitive).toString.replace("\"", ""))
        currentModelIndex = Math.max(currentModelIndex -1, 0)
        return requestManager.runRead[ cancelIndicator |
            list.get(currentModelIndex)
        ]
    }
    
    override showOriginal(ExecuteCommandParams params) {
        val list = this.resultMap.get((params.arguments.get(0) as JsonPrimitive).toString.replace("\"", ""))
        currentModelIndex = 0
        return requestManager.runRead[ cancelIndicator |
            list.get(currentModelIndex)
        ]
        
    }
    
    override showLast(ExecuteCommandParams params) {
        val list = this.resultMap.get((params.arguments.get(0) as JsonPrimitive).toString.replace("\"", ""))
        currentModelIndex = list.size - 1
        return requestManager.runRead[ cancelIndicator |
            list.get(currentModelIndex)
        ]
    }
    
}
