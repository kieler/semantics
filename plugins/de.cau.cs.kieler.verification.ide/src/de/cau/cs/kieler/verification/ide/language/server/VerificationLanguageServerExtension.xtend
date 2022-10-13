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
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.language.server.ILanguageClientProvider
import de.cau.cs.kieler.language.server.KeithLanguageClient
import de.cau.cs.kieler.verification.SmallVerificationProperty
import de.cau.cs.kieler.verification.VerificationLogic
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyChanged
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Observable
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension

/**
 * LS extension to verify models. Supports loading of verification properties and running the model checker.
 * Simulating a counterexample is not supported, since its realized on the client via starting a simulation 
 * and loading the trace of the counterexample.
 * 
 * @author jep 
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

    /** stores the verification properties for a file */
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

    /**
     * Called on client notification.
     * Collects the verification properties in the file and sends reduced versions of them to the client.
     * 
     * @param uri Uri of the file.
     */
    override loadProperties(String uri) {
        if (uri !== null) {
            // collect properties
            val currentModel = verLogic.getModelFromUri(uri)
            val props = verLogic.reloadPropertiesFromModel(currentModel)
            verificationProperties.put(uri, props)
            // create small versions of them since we do not want Files on the client
            val smallProps = new ArrayList()
            for (prop : props) {
                val smallProp = new SmallVerificationProperty(prop.name, prop.formula, prop.id)
                smallProps.add(smallProp)
            }
            // send props to client
            client.sendVerificationProperties(smallProps, "")
        }
    }

    /**
     * Called on client notification.
     * Runs the model checker on all verification properties of the file.
     * 
     * @param uri Uri of the file.
     */
    override runChecker(String uri) {
        if (uri !== null && verificationProperties.containsKey(uri)) {
            val props = verificationProperties.get(uri)
            // prepare compilation context and environment
            verLogic.prepareVerification(props)
            verLogic.verificationCompileContext.startEnvironment.setProperty(
                ProjectInfrastructure.USE_TEMPORARY_PROJECT, false)
            // register update listener
            addUpdater(props)
            // start model checker
            verLogic.startVerification
        }
    }

    /**
     * Registers a listener for changes of {@code verificationProperties}.
     * If a property changes, the status and path of the counterexample file are send to the client.
     * 
     * @param verificationProperties The properties whose changes should be registered.
     */
    def addUpdater(List<VerificationProperty> verificationProperties) {
        // Add observer for changed properties
        verLogic.verificationCompileContext.addObserver [ Observable o, Object arg |
            if (arg instanceof VerificationPropertyChanged) {
                // send status and counterexample file to client
                val property = arg.changedProperty
                if (property.counterexampleFile !== null) {
                    client.sendPropertyStatus(property.id, property.status, property.counterexampleFile.path)
                }
                client.sendPropertyStatus(property.id, property.status, "")
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

}
