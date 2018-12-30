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

import com.google.common.io.CharStreams
import de.cau.cs.kieler.sccharts.verification.VerificationContext
import de.cau.cs.kieler.sccharts.verification.VerificationResultStatus
import de.cau.cs.kieler.sccharts.verification.backend.VerificationBackendTask
import java.io.File
import java.io.InputStreamReader
import java.util.concurrent.TimeUnit
import java.util.regex.Pattern

/**
 * @author aas
 */
class RunNuxmvTask implements VerificationBackendTask {
    
    private val VerificationContext verificationContext
    private val CompileToSmvTask compileTask
    
    private var boolean canceled = false
    
    new(VerificationContext verificationContext, CompileToSmvTask compileTask) {
        this.verificationContext = verificationContext
        this.compileTask = compileTask
    }
    
    override getName() {
        return "Run Nuxmv"
    }
    
    override run() {
        val smvFile = compileTask.smvFile
        try {
            val procBuilder = new ProcessBuilder()
            procBuilder.directory(new File(smvFile.parent.location.toOSString))
            procBuilder.command("nuXmv", smvFile.name)
            procBuilder.redirectErrorStream(true)
            val proc = procBuilder.start()
            var boolean finished = false
            while(!canceled && !finished && proc.isAlive) {
                finished = proc.waitFor(1, TimeUnit.SECONDS)    
            }
            val inStream = new InputStreamReader(proc.getInputStream())
            val procOutput = CharStreams.toString(inStream)
            inStream.close()
            println(procOutput)
            val pattern = Pattern.compile("-- specification .* is true")
            val matcher = pattern.matcher(procOutput)
            val propertyHolds = matcher.find()
            if(propertyHolds) {
                verificationContext.verificationProperties.head.result.status = VerificationResultStatus.PASSED
            } else {
                verificationContext.verificationProperties.head.result.status = VerificationResultStatus.FAILED
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
