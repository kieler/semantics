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
package de.cau.cs.kieler.test.verification

import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.CompilationSystem
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.verification.VerificationAssumption
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyChanged
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import java.io.File
import java.util.List
import java.util.Observable
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EObject
import org.junit.After
import org.junit.runner.RunWith

import static org.junit.Assert.*

import static extension de.cau.cs.kieler.verification.extensions.VerificationContextExtensions.*
import static extension de.cau.cs.kieler.verification.processors.ProcessExtensions.*

/**
 * @author aas
 *
 */
@RunWith(ModelsRepositoryTestRunner)
abstract class AbstractVerificationTest<T extends EObject> extends AbstractXTextModelRepositoryTest<T> {

    public static val MUST_FAIL_PATTERN_KEY = "verification-must-fail-pattern"
    
    protected var CompilationContext currentContext
    
    protected var T verificationModel
    protected var TestModelData verificationModelData
    
    protected var List<VerificationProperty> verificationProperties
    protected var List<VerificationAssumption> verificationAssumptions
    
    protected var String verificationMustFailPattern
    
    // Abstract methods
    abstract protected def String getPropertyAnalyzerProcessorId()
    abstract protected def String getVerificationSystemId()
    
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
    
    protected def void initializeVerification(T model, TestModelData modelData) {
        verificationModel = model
        verificationModelData = modelData
        verificationMustFailPattern = modelData.additionalProperties.get(MUST_FAIL_PATTERN_KEY)
        // Get verification properties
        val processorId = getPropertyAnalyzerProcessorId()
        val propertyAnalyzerContext = runPropertyAnalyzer(processorId)
        verificationProperties = propertyAnalyzerContext.verificationContext.verificationProperties
        verificationAssumptions = propertyAnalyzerContext.verificationContext.verificationAssumptions
    }
    
    @After
    public def void stopCurrentVerification() {
        if(currentContext === null) {
            return
        }
        // Cancel verification
        currentContext.startEnvironment.setProperty(Environment.CANCEL_COMPILATION, true)
        
        // Kill process        
        val process = currentContext.verificationContext.verificationProcess
        if(process !== null && process.isAlive) {
            System.err.println("Killing verification process after test run")
            process.kill
        }
        
        currentContext = null
    }
    
    protected def void startVerification(List<VerificationProperty> properties, List<VerificationAssumption> assumptions) {
        stopCurrentVerification()
        currentContext = createVerificationContext(properties, assumptions)
        
        // Update task description of the properties 
        for(property : verificationProperties) {
            property.runningTaskDescription = "Compiling..."
            property.status = VerificationPropertyStatus.RUNNING
        }
        
        currentContext.compile
    }
    
    protected def CompilationContext createVerificationContext(List<VerificationProperty> properties, List<VerificationAssumption> assumptions) {
        // Create new context for verification and compile
        val systemId = getVerificationSystemId()
        val context = Compile.createCompilationContext(systemId, verificationModel)
        val verificationContext = context.createVerificationContext(true)
        context.startEnvironment.setProperty(Environment.INPLACE, true)
        context.startEnvironment.setProperty(ProjectInfrastructure.TEMPORARY_PROJECT_NAME, this.class.simpleName)
        
        verificationContext.verificationProperties = properties
        verificationContext.verificationAssumptions = assumptions
        
        val modelFile = getVerificationModelFileHandle()
        verificationContext.verificationModelFile = modelFile
        
        context.configureContext()
        
        return context
    }
    
    protected def CompilationContext runPropertyAnalyzer(String processorId) {
        val compilationSystem = CompilationSystem.createCompilationSystem(processorId, #[processorId])
        val context = Compile.createCompilationContext(compilationSystem, verificationModel)
        context.createVerificationContext(false)
        context.compile()
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
    
    protected def File getVerificationModelFileHandle() {
        val projectInfrastructure = ProjectInfrastructure.getProjectInfrastructure(new Environment())
        val path = new Path(projectInfrastructure.generatedCodeFolder.path+verificationModelData.modelPath.toString)
        val file = path.toFile
        return file
    }
    
    protected def void onVerificationPropertyChanged(VerificationPropertyChanged event) {
        val property = event.changedProperty
        switch(property.status) {
            case VerificationPropertyStatus.PASSED : {
                if (property.shouldFail) {
                    fail('''VerificationProperty "«property.name»" PASSED but should not''')
                } else {
                    println('''VerificationProperty '«property.name»' PASSED as intended''')
                }
            }
            
            case VerificationPropertyStatus.FAILED : {
                if (property.shouldFail) {
                    println('''VerificationProperty "«property.name»" FAILED as intended''')
                } else {
                    fail('''VerificationProperty "«property.name»" FAILED but should not''')
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
    }
}
