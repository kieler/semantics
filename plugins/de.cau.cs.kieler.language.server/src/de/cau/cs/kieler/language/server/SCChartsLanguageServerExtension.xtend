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
import de.cau.cs.kieler.kicool.registration.ResourceExtension
import de.cau.cs.kieler.sccharts.impl.SCChartsImpl
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.impl.SCGraphsImpl
import java.io.ByteArrayOutputStream
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
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet

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
    
    protected Map<String, List<TextDocument>> resultMap = new HashMap<String, List<TextDocument>>
    
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
        
        this.resultMap.put(originalUri, new LinkedList)
        
        var compilationSystemId = (params.arguments.get(1) as JsonPrimitive).asString
        if (string.startsWith("file://")) {
            string = string.substring(7) 
        }
        var uri = URI.createFileURI(string)
        
        var resourceSet = uri.xtextResourceSet 
        val resource = resourceSet.getResource(uri, true)
        
        var eobject = resource.getContents().head
        var context = compile(eobject, compilationSystemId)
        
        val mymodel = new CompilationResults
        for (iResult : context.processorInstancesSequence) {
            var convertedImpl = convertImpl(iResult.environment.model, iResult.environment.getProperty(Environment.SNAPSHOTS), originalUri, iResult.name)
            if (convertedImpl !== null) {
                var tempDocuments = convertedImpl.files
                if (tempDocuments !== null) {
                    for (document : tempDocuments) {
                        if (document !== null) {
                            mymodel.files.add(transformToHtmlText(document))
                        }
                    }
                }
            }
        }
        return requestManager.runRead[ cancelIndicator |
            new CompilationResults(this.resultMap.get(originalUri))
        ]
    }
    
    def convertImpl(Object impl, List<Object> snapshots, String uri, String processorName) {
        if (impl instanceof CodeContainer) {
            var cc = convert(impl as CodeContainer)
            
            this.resultMap.get(uri).addAll(cc.files)
            
            return cc
        } else if (impl instanceof SCChartsImpl) {
            var textDocument = transformToTextDocument(impl as EObject, processorName, 0)
            if (textDocument !== null) {
                this.resultMap.get(uri).add(transformToHtmlText(textDocument as TextDocument))
            }
            var count = 1
            for (snapshot : snapshots) {
                textDocument = transformToTextDocument(snapshot as EObject, processorName, count)
                this.resultMap.get(uri).add(transformToHtmlText(textDocument as TextDocument))
                count++
            }
            return null
        } else if (impl instanceof SCGraphsImpl) {
            try {                
//                (impl as SCGraphsImpl).
                var textDocument = transformToTextDocument((impl as SCGraphs).scgs.get(0), processorName, 0)
                println(textDocument.name + ": " + textDocument.value)
                return null
            } catch (Exception e) {
//                e.printStackTrace TODO
                return null
            }
                
        } else {
            println("Got something different than an EObject")
            return null
        }
        
    }
    
    def convert(CodeContainer cc) {
        val mcc = new CompilationResults();
        mcc.files = new LinkedList();
        cc.files.forEach[name, value, index | mcc.files.add(new TextDocument("Generated Code", name, index, value))]
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
        context.compile
        
        return context
    }
    
    def TextDocument transformToTextDocument(EObject model, String processorName, int snapshotIndex) {
        var String serialized = null
        if (ResourceExtension.getResourceExtension(model) !== null) { // TODO scg is not transformed, since the model has no resource extension
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
            }
            return new TextDocument(ext, processorName, snapshotIndex, serialized)
        } else {
            var test = ResourceExtension.getResourceExtension(model)
            println(test)
            return null
        }
    }
    
    def TextDocument transformToHtmlText(TextDocument document) {
        document.value = document.value.replace("\n", "<br>")
        document.value = document.value.replace("  ", "&emsp;")
        document.value = document.value.replace("\t", "&emsp;")
        return document
    }    
}
