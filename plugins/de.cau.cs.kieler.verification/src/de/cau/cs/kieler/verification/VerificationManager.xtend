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
package de.cau.cs.kieler.verification

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.CompilationSystem
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.verification.extensions.VerificationContextExtensions
import java.io.File
import java.util.ArrayList
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Observable
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished

/**
 * The logic for verifying models. Can be used for the Eclipse environment as well as for VS Code.
 * 
 * @author aas, jep
 * 
 */
class VerificationManager {

    @Inject
    Injector injector

    @Accessors(PUBLIC_GETTER) var CompilationContext verificationCompileContext

    static val MODEL_CLASS_TO_PROPERTY_ANALYZER = #{typeof(SCCharts) ->
        "de.cau.cs.kieler.sccharts.processors.verification.SCChartsVerificationPropertyAnalyzer"}
    
    var CompilationContext propertyAnalyzerContext
    
    var String selectedSystemId = "de.cau.cs.kieler.sccharts.verification.nuxmv"

    def setSystemId(String id) {
        selectedSystemId = id
    }

    /**
     * Collects the verification properties of the {@code currentModel}.
     * 
     * @param currentModel The model for which the properties should be collected.
     * @return List containing the verification properties of the model. If an exception occurs or the model
     * is invalid, the list is empty.
     */
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
                // TODO improve error reporting
                return new ArrayList()
            }
        }
    }

    /**
     * Creates context for analyzing the properties and compiles.
     */
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

    def VerificationContext prepareVerification(List<VerificationProperty> verificationProps) {
        if (propertyAnalyzerContext === null) {
            return null
        }
        return prepareVerification(propertyAnalyzerContext.originalModel, verificationProps)
    }

    def VerificationContext prepareVerification(Object model, List<VerificationProperty> verificationProps) {
        if (verificationProps === null) {
            return null
        }
        if (model === null) {
            return null
        }
        val verificationAssumptions = VerificationContextExtensions.getVerificationContext(propertyAnalyzerContext).
            getVerificationAssumptions
        val modelWithVerificationProperties = propertyAnalyzerContext.getModel
        val modelFile = getFile(modelWithVerificationProperties)

        // Start new verification
        return prepareVerification(model, modelFile, verificationProps, verificationAssumptions)
    }

    private def VerificationContext prepareVerification(Object model, File modelFile,
        List<VerificationProperty> verificationProperties, List<VerificationAssumption> verificationAssumptions) {
        // Stop last verification if not done yet
        stopVerification()

        // Create new context for verification and compile
        verificationCompileContext = Compile.createCompilationContext(selectedSystemId, model)
        val verificationContext = VerificationContextExtensions.createVerificationContext(verificationCompileContext,
            true)
        verificationContext.verificationProperties = verificationProperties
        verificationContext.verificationAssumptions = verificationAssumptions
        verificationContext.verificationModelFile = modelFile
        
        verificationCompileContext.addObserver [ Observable o, Object arg |
            if (arg instanceof CompilationFinished) {
                 verificationCompileContext = null
            }
        ]
        return verificationContext
    }

    def startVerification() {
        verificationCompileContext.compileAsynchronously
    }

    def void stopVerification() {
        if (verificationCompileContext !== null) {
            verificationCompileContext.startEnvironment.setProperty(Environment.CANCEL_COMPILATION, true)
            verificationCompileContext = null
        }
    }

    /**
     * Gets the file for the given model.
     */
    private def File getFile(EObject model) {
        val eUri = model.eResource.getURI();
        if (eUri.isPlatformResource()) {
            val platformString = eUri.toPlatformString(true);
            val res = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString)
            if (res.exists && res instanceof IFile) {
                return (res as IFile).fullPath.toFile
            }
        } else {
            return new File(eUri.path)
        }
    }

    private def EObject getModel(CompilationContext context) {
        return context?.originalModel as EObject
    }


}
