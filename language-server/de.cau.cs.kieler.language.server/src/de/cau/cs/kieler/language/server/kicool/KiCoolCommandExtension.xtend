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
package de.cau.cs.kieler.language.server.kicool

import de.cau.cs.kieler.language.server.kicool.data.CodeOfModel
import java.util.concurrent.CompletableFuture
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment

/**
 * Interface to the LSP extension commands
 * 
 * @author sdo
 * 
 */
@JsonSegment('keith/kicool')
interface KiCoolCommandExtension {

    /**
     * Compiles file given by uri with compilationsystem given by command.
     */
    @JsonNotification('compile')
    def void compile(String uri, String clientId, String command, boolean inplace, boolean showResultingModel,
        boolean snapshot);

    /**
     * Cancels the current compilation by stopping the current compilation thread.
     */
    @JsonNotification('cancel-compilation')
    def void cancelCompilation();

    /**
     * Build diagram for snapshot with id index for file given by uri. Only works, if the file was already compiled.
     */
    @JsonRequest('show')
    def CompletableFuture<String> show(String uri, String clientId, int index)

    /**
     * Returns all compilation systems which are applicable for the file at given uri.
     * 
     * @param uri URI as string to get compilation systems for
     * @param filter boolean indicating whether compilation systems should be filtered
     */
    @JsonNotification('get-systems')
    def void getSystems(String uri);

    /**
     * Request the contents of a CodeContainer as string together with its file name
     */
    @JsonRequest("get-code-of-model")
    def CompletableFuture<CodeOfModel> getCodeOfModel(String kgraphElemntId, String clientId);
}
