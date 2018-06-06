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

import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment
import com.google.inject.ImplementedBy
import java.util.concurrent.CompletableFuture
import org.eclipse.xtend.lib.annotations.ToString
import de.cau.cs.kieler.sccharts.ide.text.MyLanguageServerExtension

/**
 * @author sdo
 *
 */
@ImplementedBy(MyLanguageServerExtension)
interface IMyLanguageServerExtension extends ILanguageServerExtension {
    
    @JsonRequest
    def CompletableFuture<TextOfLineResult> getTextOfLine(TextOfLineParam param)

    static class TextOfLineResult {
        public String text
    }
    static class TextOfLineParam {
        public String uri
        public int line
    }
    
    @ToString
    static class BuildNotification {
        public String message
    }
    
    static interface CustomClient {
        @JsonNotification
        def void buildHappened(BuildNotification notification)
    }
    
    
}
