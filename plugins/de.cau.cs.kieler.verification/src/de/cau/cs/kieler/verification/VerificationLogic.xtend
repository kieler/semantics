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
import java.io.File
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IFile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure

/**
 * @author jep
 * 
 */
class VerificationLogic {

    @Inject
    Injector injector

    private static val MODEL_CLASS_TO_PROPERTY_ANALYZER = #{typeof(SCCharts) ->
        "de.cau.cs.kieler.sccharts.processors.verification.SCChartsVerificationPropertyAnalyzer"}
    public var CompilationContext verificationCompileContext
    private static var CompilationContext propertyAnalyzerContext
    private var String selectedSystemId = "de.cau.cs.kieler.sccharts.verification.nuxmv"
    
    def setSystemId(String id) {
        selectedSystemId = id
    }

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

    def void prepareVerification(List<VerificationProperty> verificationProps) {
        if (propertyAnalyzerContext === null) {
            return
        }
        prepareVerification(propertyAnalyzerContext.originalModel, verificationProps)
    }

    def void prepareVerification(Object model, List<VerificationProperty> verificationProps) {
        if (verificationProps === null) {
            return
        }
        if (model === null) {
            return
        }
        val verificationAssumptions = VerificationContextExtensions.getVerificationContext(propertyAnalyzerContext).
            getVerificationAssumptions
        val modelWithVerificationProperties = propertyAnalyzerContext.getModel
        val modelFile = getFile(modelWithVerificationProperties)

        // Start new verification
        prepareVerification(model, modelFile, verificationProps, verificationAssumptions)
    }

    private def void prepareVerification(Object model, File modelFile,
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
        
        //TODO: save/get the options without IPreferenceStore
        // Add general options
//        verificationContext.createCounterexamples = getBooleanOption(CREATE_COUNTEREXAMPLES_PREF_STORE_ID, true)
//        verificationContext.createCounterexamplesWithOutputs = getBooleanOption(CREATE_COUNTEREXAMPLES_WITH_OUTPUTS_PREF_STORE_ID, true)
//        
//        // Add SMV options
//        verificationContext.smvUseIVAR = getBooleanOption(SMV_USE_IVAR_PREF_STORE_ID, false)
//        verificationContext.smvIgnoreRangeAssumptions = getBooleanOption(SMV_IGNORE_RANGE_ASSUMPTIONS, false)
//        
//        val customSmvInvarCommandsList = getCustomCommands(CUSTOM_SMV_COMMANDS_INVAR_PREF_STORE_ID).split("\n").toList
//        val customSmvLtlCommandsList = getCustomCommands(CUSTOM_SMV_COMMANDS_LTL_PREF_STORE_ID).split("\n").toList
//        val customSmvCtlCommandsList = getCustomCommands(CUSTOM_SMV_COMMANDS_CTL_PREF_STORE_ID).split("\n").toList
//        verificationContext.customInteractiveSmvInvarCommands = customSmvInvarCommandsList
//        verificationContext.customInteractiveSmvLtlCommands = customSmvLtlCommandsList
//        verificationContext.customInteractiveSmvCtlCommands = customSmvCtlCommandsList
//        
//        // Add SPIN options
//        val customSpinCommands = getCustomCommands(CUSTOM_SPIN_COMMANDS_PREF_STORE_ID).split("\n").toList
//        verificationContext.customSpinCommands = customSpinCommands
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
