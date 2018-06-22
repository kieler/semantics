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
import org.eclipse.lsp4j.ExecuteCommandParams
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment

/**
 * @author sdo
 *
 */
@JsonSegment('compile')
interface CommandExtension {
    @JsonRequest('testen')
    def CompletableFuture<Object> compile(ExecuteCommandParams params);
    
    @JsonRequest('show_next')
    def CompletableFuture<Object> showNext(ExecuteCommandParams params)
    
    @JsonRequest('show_previous')
    def CompletableFuture<Object> showPrevious(ExecuteCommandParams params)
    
    @JsonRequest('show_original')
    def CompletableFuture<Object> showOriginal(ExecuteCommandParams params)
    
    @JsonRequest('show_last')
    def CompletableFuture<Object> showLast(ExecuteCommandParams params)
}