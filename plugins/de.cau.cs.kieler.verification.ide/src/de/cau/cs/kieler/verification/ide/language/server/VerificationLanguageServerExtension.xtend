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
import de.cau.cs.kieler.verification.VerificationProperty
import java.util.ArrayList
import org.eclipse.emf.common.util.URI
import org.eclipse.lsp4j.jsonrpc.validation.NonNull
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.resource.XtextResourceSet
import java.util.List
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.CompilationSystem
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.verification.extensions.VerificationContextExtensions
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.verification.SmallVerificationProperty

/**
 * @author jep
 * 
 */
class VerificationLanguageServerExtension implements ILanguageServerExtension, VerificationCommandExtension, ILanguageClientProvider {

    @Inject
    Injector injector

    /**
     * The language client allows to send notifications or requests from the server to the client.
     * Notifications are preferred, since they allow more asynchronity.
     */
    private KeithLanguageClient client
    protected extension ILanguageServerAccess languageServerAccess

    private static val MODEL_CLASS_TO_PROPERTY_ANALYZER = "de.cau.cs.kieler.sccharts.processors.verification.SCChartsVerificationPropertyAnalyzer"
    private var CompilationContext propertyAnalyzerContext

    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }

    override void setLanguageClient(LanguageClient client) {
        this.client = client as KeithLanguageClient
    }

    override getLanguageClient() {
        return this.client
    }

    override ready(String uri) {
        println("Rdy notification was perceived")
        val props = reloadPropertiesFromModel(uri)
        val smallProps = new ArrayList()
        for (prop : props) {
            val smallProp = new SmallVerificationProperty(prop.name, prop.formula, prop.id)
            smallProps.add(smallProp)
        }
        client.sendVerificationProperties(smallProps, "")
    }

    private def List<VerificationProperty> reloadPropertiesFromModel(String uri) {
        val currentModel = getModelFromUri(uri)
        if (currentModel === null) {
            return new ArrayList()
        }
        if (currentModel instanceof SCCharts) {
            try {
                val processorId = MODEL_CLASS_TO_PROPERTY_ANALYZER /*.get(typeof(SCCharts))*/
                propertyAnalyzerContext = runPropertyAnalyzer(processorId, currentModel)
                val properties = VerificationContextExtensions.getVerificationContext(propertyAnalyzerContext).
                    getVerificationProperties
                return properties
            } catch (Exception e) {
                // e.showInDialog
                return new ArrayList()
            }
        }
    }

    private def CompilationContext runPropertyAnalyzer(String processorId, EObject model) {
        val compilationSystem = CompilationSystem.createCompilationSystem(processorId, #[processorId])
        val context = Compile.createCompilationContext(compilationSystem, model)
        VerificationContextExtensions.createVerificationContext(context, false)
        context.compile()
        if (context.hasErrors) {
            val exception = context.allErrors.get(0).exception
            throw exception
        }
        return context
    }

    /**
     * Gets the model for resource specified by given an uri String
     * 
     * @param uri uri String of model resource
     * @return model of specified resource
     */
    def Object getModelFromUri(String uri) {
        val uriObject = URI.createURI(uri)
        val resource = uriObject.xtextResourceSet.getResource(uriObject, true)

        return resource.getContents().head
    }

    /**
     * @param uri URI of file without file://
     * @return the correct XtextResourceSet for the given uri based in its file extension.
     */
    def XtextResourceSet getXtextResourceSet(@NonNull URI uri) {
        return injector.getInstance(XtextResourceSet);
    }

}
