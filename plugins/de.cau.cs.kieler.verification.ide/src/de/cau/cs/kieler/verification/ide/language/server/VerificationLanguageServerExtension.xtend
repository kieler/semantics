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
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.util.List
import de.cau.cs.kieler.verification.VerificationProperty
import java.util.Map
import java.util.Observable
import de.cau.cs.kieler.verification.VerificationPropertyChanged
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import java.util.HashMap

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
    protected KeithLanguageClient client
    protected extension ILanguageServerAccess languageServerAccess
    protected Map<String, List<VerificationProperty>> verificationProperties = new HashMap

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
        if (uri !== null) {
            val currentModel = verLogic.getModelFromUri(uri)
            val props = verLogic.reloadPropertiesFromModel(currentModel)
            verificationProperties.put(uri, props)
            val smallProps = new ArrayList()
            for (prop : props) {
                val smallProp = new SmallVerificationProperty(prop.name, prop.formula, prop.id)
                smallProps.add(smallProp)
            }
            client.sendVerificationProperties(smallProps, "")
        }
    }

    override runChecker(String uri) {
        if (uri !== null) {
            val props = verificationProperties.get(uri)
            verLogic.prepareVerification(props)
            verLogic.verificationCompileContext.startEnvironment.setProperty(
                ProjectInfrastructure.USE_TEMPORARY_PROJECT, false)
            addUpdater(props)
            verLogic.startVerification
        }
    }

    private def addUpdater(List<VerificationProperty> verificationProperties) {
        // Add observer for changed properties
        verLogic.verificationCompileContext.addObserver [ Observable o, Object arg |
            if (arg instanceof VerificationPropertyChanged) {
                val property = arg.changedProperty
                client.sendPropertyStatus(property.id, property.status)
            } else if (arg instanceof CompilationFinished) {
                verLogic.verificationCompileContext = null
            }
        ]
        // Update task description of the properties 
        for (property : verificationProperties) {
            property.runningTaskDescription = "Compiling..."
            property.status = VerificationPropertyStatus.RUNNING
        }
    }

    override runCounterExample(String uri, String propertyId) {
        if (uri !== null) {
            val currentModel = verLogic.getModelFromUri(uri)
            val property = verificationProperties.get(uri).findFirst[prop | prop.id == propertyId]
            verLogic.runCounterexample(property, currentModel)
        }
    }

}
