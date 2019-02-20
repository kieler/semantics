/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.test.common.simulation

import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.CompilationSystem
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.verification.VerificationAssumption
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyChanged
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import java.util.List
import java.util.Observable
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EObject
import org.junit.runner.RunWith

import static org.junit.Assert.*

/**
 * @author aas
 *
 */
@RunWith(ModelsRepositoryTestRunner)
abstract class AbstractVerificationTest<T extends EObject> extends AbstractXTextModelRepositoryTest<T> {

    public static val MUST_FAIL_PATTERN_KEY = "verification-must-fail-pattern"

    abstract protected def String getPropertyAnalyzerProcessorId()

    protected var String verificationSystemId
    protected CompilationContext verificationContext
    
    protected var List<VerificationProperty> verificationProperties
    protected var List<VerificationAssumption> verificationAssumptions
    
    protected var String verificationMustFailPattern
    
    /**
     * Constructor
     */
    new(Injector resourceSetInjector) {
        super(resourceSetInjector)
    }
    
    /**
     * Checks if the model data has properties that should be verified.
     */
    protected def boolean hasVerificationProperties(TestModelData modelData) {
        return modelData.modelProperties.contains("verification")
    }
    
    protected def boolean shouldFail(VerificationProperty property) {
        var result = false
        if(verificationMustFailPattern !== null) {
            result = property.name.matches(verificationMustFailPattern)
        }
        return result
    }
    
    protected def void initializeVerification(EObject model, TestModelData modelData) {
        verificationMustFailPattern = modelData.additionalProperties.get(MUST_FAIL_PATTERN_KEY)
        // Get verification properties
        val processorId = getPropertyAnalyzerProcessorId()
        val propertyAnalyzerContext = runPropertyAnalyzer(processorId, model)
        verificationProperties = propertyAnalyzerContext.startEnvironment.getProperty(Environment.VERIFICATION_PROPERTIES) as List<VerificationProperty>
        verificationAssumptions = propertyAnalyzerContext.startEnvironment.getProperty(Environment.VERIFICATION_ASSUMPTIONS) as List<VerificationAssumption>
    }
    
    protected def void stopVerification() {
        if(verificationContext !== null) {
            verificationContext.startEnvironment.setProperty(Environment.CANCEL_COMPILATION, true)
            verificationContext = null
        }
    }
    
    protected def void startVerification(String systemId, EObject model, IFile modelFile,
        List<VerificationProperty> properties,
        List<VerificationAssumption> assumptions) {
        // Stop last verification if not done yet
        stopVerification()
       
        // Create new context for verification and compile
        verificationContext = Compile.createCompilationContext(systemId, model)
        verificationContext.startEnvironment.setProperty(Environment.INPLACE, true)
        verificationContext.startEnvironment.setProperty(ProjectInfrastructure.TEMPORARY_PROJECT_NAME, this.class.simpleName)
        
        verificationContext.startEnvironment.setProperty(Environment.VERIFICATION_PROPERTIES, properties)
        verificationContext.startEnvironment.setProperty(Environment.VERIFICATION_ASSUMPTIONS, assumptions)
        verificationContext.startEnvironment.setProperty(Environment.VERIFICATION_MODEL_FILE, modelFile)
        
        configureContext(verificationContext)
        
        // Update task description of the properties 
        for(property : verificationProperties) {
            property.runningTaskDescription = "Compiling..."
            property.status = VerificationPropertyStatus.RUNNING
        }
        
        // Compile and verify
        verificationContext.compile
    }
    
    protected def CompilationContext runPropertyAnalyzer(String processorId, EObject model) {
        val compilationSystem = CompilationSystem.createCompilationSystem(processorId, #[processorId])
        val context = Compile.createCompilationContext(compilationSystem, model)
        context.compile
        if(context.hasErrors) {
            val exception = context.allErrors.get(0).exception
            throw exception
        }
        return context
    }
    
    protected def void configureContext(CompilationContext verificationContext) {
        // Add observer for changed properties
        verificationContext.addObserver[ Observable o, Object arg |
            if(arg instanceof VerificationPropertyChanged) {
                onVerificationPropertyChanged(arg)
            } else if(arg instanceof CompilationFinished) {
                onVerificationFinished(arg)
            }
        ]
    }
    
    protected def IFile getFileHandle(EObject model, TestModelData modelData) {
        val path = new Path(modelData.modelPath.toString)
        val tmpProject = ProjectInfrastructure.getTemporaryProject()
        val file = tmpProject.getFile(path)
        return file
    }
    
    protected def onVerificationPropertyChanged(VerificationPropertyChanged event) {
        val property = event.changedProperty
        switch(property.status) {
            case VerificationPropertyStatus.PASSED : {
                if (property.shouldFail) {
                    fail('''Verification Property "«property.name»" PASSED but should not''')
                } else {
                    println('''Property '«property.name»' PASSED''')
                }
            }
            
            case VerificationPropertyStatus.FAILED : {
                if (property.shouldFail) {
                    println('''Verification Property "«property.name»" failed as intended''')
                } else {
                    fail('''Verification Property "«property.name»" FAILED''')
                }
            }
            
            case VerificationPropertyStatus.RUNNING : {
                println('''VerificationProperty "«property.name»": «property.runningTaskDescription»''')
            }
            
            case VerificationPropertyStatus.EXCEPTION : {
                println('''VerificationProperty "«property.name»" had issues''')
                property.cause.printStackTrace
                fail(property.cause.toString)
            }
            default : {
                // Don't care
            }
        }
    }
    
    protected def void onVerificationFinished(CompilationFinished event) {
        verificationContext = null
    }
}
