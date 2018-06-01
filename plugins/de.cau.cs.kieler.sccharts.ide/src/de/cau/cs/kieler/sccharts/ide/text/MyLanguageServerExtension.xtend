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
package de.cau.cs.kieler.sccharts.ide.text

import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.ide.server.ILanguageServerAccess.IBuildListener
import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethodProvider
import java.util.List
import org.eclipse.xtext.resource.IResourceDescription.Delta
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints
import org.eclipse.lsp4j.Position
import org.eclipse.lsp4j.jsonrpc.Endpoint
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification

/**
 * @author sdo
 * 
 */
class MyLanguageServerExtension implements IMyLanguageServerExtension, IBuildListener, JsonRpcMethodProvider {

    ILanguageServerAccess access
    CustomClient client

    
    override initialize(ILanguageServerAccess access) {
        this.access = access
        this.access.addBuildListener(this)
        this.client = ServiceEndpoints.toServiceObject(access.languageClient as Endpoint, CustomClient)
    }

    override getTextOfLine(TextOfLineParam param) {
        return access.doRead(param.uri) [ ctx |
            val start = ctx.document.getOffSet(new Position(param.line, 0))
            val end = ctx.document.getOffSet(new Position(param.line + 1, 0)) - System.lineSeparator.length
            return new TextOfLineResult => [
                text = ctx.document.contents.substring(start, end)
            ]
        ]
    }

    override supportedMethods() {
        val result = newHashMap
        result.putAll(ServiceEndpoints.getSupportedMethods(this.getClass))
        // register client side
        result.putAll(ServiceEndpoints.getSupportedMethods(CustomClient))
        return result
    }


    override afterBuild(List<Delta> deltas) {
        client.buildHappened(new BuildNotification => [
            message = "Built " + deltas.map[uri.toString].join(', ')
        ])
    }
}
