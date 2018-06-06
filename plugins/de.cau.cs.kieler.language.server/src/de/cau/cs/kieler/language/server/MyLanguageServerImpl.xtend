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
import de.cau.cs.kieler.kicool.compilation.Compile
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.lsp4j.ExecuteCommandParams
import org.eclipse.lsp4j.jsonrpc.validation.NonNull
import org.eclipse.xtext.ide.server.LanguageServerImpl
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/**
 * @author sdo
 *
 */
class MyLanguageServerImpl extends LanguageServerImpl implements CommandExtension {
        
    @Inject
    var Injector injector
        
    override testen(ExecuteCommandParams params) {
        var string = (params.arguments.get(1) as JsonPrimitive).asString
        var uri = URI.createFileURI(if (string.startsWith("file://")) string.substring(7) else string)
        print(uri)
        // Get resource set
        var resourceSet = uri.xtextResourceSet 
        val resource = resourceSet.getResource(uri, true)
        
        var test = resource.getContents().head
        var context = test.compile
        var model = (context as CompilationContext).result.model
        var head = (model as CodeContainer).head
        print(head)
        requestManager.runWrite([
            return null
        ], [/*cancelIndicator , buildable | 
            buildable.build(cancelIndicator)*/
        ])
    }
    
    override didTesten(MyParams params) {
        print("Did testen")
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
    
    private def compile(EObject eobject) {
        val context = Compile.createCompilationContext('de.cau.cs.kieler.sccharts.netlist', eobject)

        context.compile
        
        return context
    }
    
}
