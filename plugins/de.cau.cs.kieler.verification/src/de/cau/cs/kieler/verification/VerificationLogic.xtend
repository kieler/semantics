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
package de.cau.cs.kieler.verification

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.CompilationSystem
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.extensions.VerificationContextExtensions
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.lsp4j.jsonrpc.validation.NonNull
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * @author jep
 *
 */
class VerificationLogic {
    
    @Inject
    Injector injector
    
    private static val MODEL_CLASS_TO_PROPERTY_ANALYZER = #{typeof(SCCharts) -> "de.cau.cs.kieler.sccharts.processors.verification.SCChartsVerificationPropertyAnalyzer"}
    private static var CompilationContext propertyAnalyzerContext
    
    def List<VerificationProperty> reloadPropertiesFromModel(Object currentModel) {
        if (currentModel === null) {
            return new ArrayList()
        }
        if (currentModel instanceof SCCharts) {
            try {
                val processorId = MODEL_CLASS_TO_PROPERTY_ANALYZER.get(typeof(SCCharts))
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

    def CompilationContext runPropertyAnalyzer(String processorId, EObject model) {
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