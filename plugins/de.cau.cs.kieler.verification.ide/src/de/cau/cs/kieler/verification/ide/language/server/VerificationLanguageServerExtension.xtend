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
package de.cau.cs.kieler.verification.ide.language.server

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.language.server.ILanguageClientProvider
import de.cau.cs.kieler.language.server.KeithLanguageClient
import de.cau.cs.kieler.verification.SmallVerificationProperty
import de.cau.cs.kieler.verification.VerificationLogic
import java.util.ArrayList
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension

/**
 * @author jep
 * 
 */
class VerificationLanguageServerExtension implements ILanguageServerExtension, VerificationCommandExtension, ILanguageClientProvider {

    @Inject
    Injector injector
    
    @Inject
    VerificationLogic verLogic

    /**
     * The language client allows to send notifications or requests from the server to the client.
     * Notifications are preferred, since they allow more asynchronity.
     */
    private KeithLanguageClient client
    protected extension ILanguageServerAccess languageServerAccess

    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }

    override void setLanguageClient(LanguageClient client) {
        this.client = client as KeithLanguageClient
    }

    override getLanguageClient() {
        return this.client
    }

    override loadProperties(String uri) {
        println("Rdy notification was perceived")
        if (uri !== null) {
            val currentModel = verLogic.getModelFromUri(uri)
            val props = verLogic.reloadPropertiesFromModel(currentModel)
            val smallProps = new ArrayList()
            for (prop : props) {
                val smallProp = new SmallVerificationProperty(prop.name, prop.formula, prop.id)
                smallProps.add(smallProp)
            }
            client.sendVerificationProperties(smallProps, "")
        }
    }

    
    override runChecker(String uri) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }

}
