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
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.verification.VerificationAssumption
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.emf.ecore.EObject
import org.junit.runner.RunWith

/**
 * @author aas
 *
 */
@RunWith(ModelsRepositoryTestRunner)
abstract class AbstractVerificationTest<T extends EObject> extends AbstractXTextModelRepositoryTest<T> {

    abstract def void configureContext(CompilationContext verificationContext)
    
    protected var String verificationSystemId
    protected CompilationContext verificationContext
    
    protected var List<VerificationProperty> verificationProperties
    protected var List<VerificationAssumption> verificationAssumptions
    protected var EObject verificationModel 
    protected var IFile verificationModelFile 
    
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
}
