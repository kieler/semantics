/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import org.eclipse.lsp4j.services.LanguageClient

/**
 * This interface should be implemented by any ILanguageServerExtension that is sending to the client without being asked.
 * 
 * @author sdo
 *
 */
interface ILanguageClientProvider {
    
    def void setLanguageClient(LanguageClient client);
    def LanguageClient getLanguageClient();
}