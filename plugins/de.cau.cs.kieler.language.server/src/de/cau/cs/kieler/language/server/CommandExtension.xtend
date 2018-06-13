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

import java.util.concurrent.CompletableFuture
import org.eclipse.lsp4j.DidChangeWatchedFilesParams
import org.eclipse.lsp4j.ExecuteCommandParams
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment
import org.eclipse.lsp4j.jsonrpc.validation.NonNull
import org.eclipse.lsp4j.generator.JsonRpcData
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/**
 * @author sdo
 *
 */
@JsonSegment('compile')
interface CommandExtension {
    @JsonRequest('testen')
    def CompletableFuture<MyCodeContainer> testen(ExecuteCommandParams params);  
    
    @JsonNotification
    def void didTesten(MyParams params); 
}


@JsonRpcData
class MyParams {
    /**
     * The identifier of the actual command handler.
     */
    @NonNull
    String command
    
    
    new() {
    }
    
    new(@NonNull String command) {
        this.command = command
    }
}