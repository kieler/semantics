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
 package de.cau.cs.kieler.sccharts.verification.backend.task

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.verification.VerificationContext
import de.cau.cs.kieler.sccharts.verification.backend.VerificationBackendTask
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.xtext.util.StringInputStream

/**
 * @author aas
 */
class CompileToSmvTask implements VerificationBackendTask {
    
    public static val SMV_SYSTEM_ID = "de.cau.cs.kieler.sccharts.netlist.smv"
    
    private val VerificationContext verificationContext
    @Accessors(PUBLIC_GETTER) private var IFile smvFile
    
    new(VerificationContext verificationContext) {
        this.verificationContext = verificationContext
    }
    
    override getName() {
        return "Compile to SMV"
    }
    
    override run() {
        val compilationContext = Compile.createCompilationContext(SMV_SYSTEM_ID, verificationContext.model)
        compilationContext.startEnvironment.setProperty(Environment.VERIFICATION_PROPERTIES, verificationContext.verificationProperties)
        compilationContext.compile
        val result = compilationContext.result
        val codeContainer = result.model as CodeContainer
        val code = codeContainer.head.code
        val tmpProject = ProjectInfrastructure.getTemporaryProject()
        val modelName = (verificationContext.model as SCCharts).name
        smvFile = tmpProject.getFile(modelName+".smv")
        if(smvFile.exists) {
            smvFile.delete(true, null)
        }
        smvFile.create(new StringInputStream(code), true, null)
    }
}
