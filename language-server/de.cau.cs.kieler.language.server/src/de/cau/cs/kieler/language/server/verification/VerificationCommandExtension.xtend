/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.verification

import org.eclipse.lsp4j.jsonrpc.services.JsonNotification
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment

/**
 * Interface to the LSP extension commands
 * 
 * @author jep
 * 
 */
@JsonSegment('keith/verification')
interface VerificationCommandExtension {

    /**
     * Requests the verification properties that are stated in the file given by uri.
     * It is assumed that the model was compiled via a model checker before.
     */
    @JsonNotification('load-properties')
    def void loadProperties(String uri)

    /**
     * Runs the model checker for the file given by uri.
     * It is assumed that the model was compiled via a model checker & verification properties were loaded before.
     */
    @JsonNotification('run-checker')
    def void runChecker(String uri)

}
